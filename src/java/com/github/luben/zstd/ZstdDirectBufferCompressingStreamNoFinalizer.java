package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class ZstdDirectBufferCompressingStreamNoFinalizer implements Closeable, Flushable {
    public int level;
    public final long stream;
    public ByteBuffer target;
    public int consumed = 0;
    public int produced = 0;
    public boolean closed = false;
    public boolean initialized = false;
    public byte[] dict = null;
    public ZstdDictCompress fastDict = null;

    private native long compressDirectByteBuffer(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native long createCStream();

    private native long endStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long flushStream(long j, ByteBuffer byteBuffer, int i, int i2);

    public static native long freeCStream(long j);

    private native long initCStream(long j, int i);

    private native long initCStreamWithDict(long j, byte[] bArr, int i, int i2);

    private native long initCStreamWithFastDict(long j, ZstdDictCompress zstdDictCompress);

    public static native long recommendedCOutSize();

    public ByteBuffer flushBuffer(ByteBuffer byteBuffer) {
        return byteBuffer;
    }

    static {
        Native.load();
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer(ByteBuffer byteBuffer, int i) {
        this.level = Zstd.defaultCompressionLevel();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Target buffer should be a direct buffer");
        }
        this.target = byteBuffer;
        this.level = i;
        this.stream = createCStream();
    }

    public static int recommendedOutputBufferSize() {
        return (int) recommendedCOutSize();
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(byte[] bArr) {
        if (this.initialized) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.dict = bArr;
        this.fastDict = null;
        return this;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (this.initialized) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.dict = null;
        this.fastDict = zstdDictCompress;
        return this;
    }

    public void compress(ByteBuffer byteBuffer) {
        long initCStream;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        }
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        if (!this.initialized) {
            ZstdDictCompress zstdDictCompress = this.fastDict;
            if (zstdDictCompress != null) {
                zstdDictCompress.acquireSharedLock();
                try {
                    initCStream = initCStreamWithFastDict(this.stream, zstdDictCompress);
                } finally {
                    zstdDictCompress.releaseSharedLock();
                }
            } else {
                byte[] bArr = this.dict;
                if (bArr != null) {
                    initCStream = initCStreamWithDict(this.stream, bArr, bArr.length, this.level);
                } else {
                    initCStream = initCStream(this.stream, this.level);
                }
            }
            if (Zstd.isError(initCStream)) {
                throw new ZstdIOException(initCStream);
            }
            this.initialized = true;
        }
        while (byteBuffer.hasRemaining()) {
            if (!this.target.hasRemaining()) {
                ByteBuffer flushBuffer = flushBuffer(this.target);
                this.target = flushBuffer;
                if (!flushBuffer.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (!this.target.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            }
            long j = this.stream;
            ByteBuffer byteBuffer2 = this.target;
            long compressDirectByteBuffer = compressDirectByteBuffer(j, byteBuffer2, byteBuffer2.position(), this.target.remaining(), byteBuffer, byteBuffer.position(), byteBuffer.remaining());
            if (Zstd.isError(compressDirectByteBuffer)) {
                throw new ZstdIOException(compressDirectByteBuffer);
            }
            ByteBuffer byteBuffer3 = this.target;
            byteBuffer3.position(byteBuffer3.position() + this.produced);
            byteBuffer.position(byteBuffer.position() + this.consumed);
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        long flushStream;
        if (this.closed) {
            throw new IOException("Already closed");
        }
        if (this.initialized) {
            do {
                long j = this.stream;
                ByteBuffer byteBuffer = this.target;
                flushStream = flushStream(j, byteBuffer, byteBuffer.position(), this.target.remaining());
                if (Zstd.isError(flushStream)) {
                    throw new ZstdIOException(flushStream);
                }
                ByteBuffer byteBuffer2 = this.target;
                byteBuffer2.position(byteBuffer2.position() + this.produced);
                ByteBuffer flushBuffer = flushBuffer(this.target);
                this.target = flushBuffer;
                if (!flushBuffer.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (flushStream > 0 && !this.target.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            } while (flushStream > 0);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long endStream;
        if (this.closed) {
            return;
        }
        try {
            if (this.initialized) {
                do {
                    long j = this.stream;
                    ByteBuffer byteBuffer = this.target;
                    endStream = endStream(j, byteBuffer, byteBuffer.position(), this.target.remaining());
                    if (Zstd.isError(endStream)) {
                        throw new ZstdIOException(endStream);
                    }
                    ByteBuffer byteBuffer2 = this.target;
                    byteBuffer2.position(byteBuffer2.position() + this.produced);
                    ByteBuffer flushBuffer = flushBuffer(this.target);
                    this.target = flushBuffer;
                    if (!flushBuffer.isDirect()) {
                        throw new IllegalArgumentException("Target buffer should be a direct buffer");
                    }
                    if (endStream > 0 && !this.target.hasRemaining()) {
                        throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                    }
                } while (endStream > 0);
            }
        } finally {
            freeCStream(this.stream);
            this.closed = true;
            this.initialized = false;
            this.target = null;
        }
    }
}
