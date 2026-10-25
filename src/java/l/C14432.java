package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: VAGX */
/* renamed from: l.ܳۢ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14432 extends OutputStream implements WritableByteChannel {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WritableByteChannel f44237;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f44238 = new AtomicBoolean();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f44240 = ByteBuffer.allocate(512);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f44239 = 512;

    public C14432(C7356 c7356) {
        this.f44237 = new C17255(c7356);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        WritableByteChannel writableByteChannel = this.f44237;
        if (this.f44238.compareAndSet(false, true)) {
            try {
                m34459();
            } finally {
                writableByteChannel.close();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34459() {
        ByteBuffer byteBuffer = this.f44240;
        if (byteBuffer.position() != 0) {
            byteBuffer.order(ByteOrder.nativeOrder());
            int remaining = byteBuffer.remaining();
            if (remaining > 8) {
                int position = byteBuffer.position() & 7;
                if (position != 0) {
                    int i = 8 - position;
                    for (int i2 = 0; i2 < i; i2++) {
                        byteBuffer.put((byte) 0);
                    }
                    remaining -= i;
                }
                while (remaining >= 8) {
                    byteBuffer.putLong(0L);
                    remaining -= 8;
                }
            }
            while (byteBuffer.hasRemaining()) {
                byteBuffer.put((byte) 0);
            }
            m34458();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        boolean isOpen = this.f44237.isOpen();
        AtomicBoolean atomicBoolean = this.f44238;
        if (!isOpen) {
            atomicBoolean.set(true);
        }
        return !atomicBoolean.get();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        while (i2 > 0) {
            ByteBuffer byteBuffer = this.f44240;
            int min = Math.min(i2, byteBuffer.remaining());
            byteBuffer.put(bArr, i, min);
            if (!byteBuffer.hasRemaining()) {
                m34458();
            }
            i2 -= min;
            i += min;
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int i;
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f44240;
        if (remaining < byteBuffer2.remaining()) {
            byteBuffer2.put(byteBuffer);
            return remaining;
        }
        int limit = byteBuffer.limit();
        if (byteBuffer2.position() != 0) {
            int remaining2 = byteBuffer2.remaining();
            byteBuffer.limit(byteBuffer.position() + remaining2);
            byteBuffer2.put(byteBuffer);
            m34458();
            i = remaining - remaining2;
        } else {
            i = remaining;
        }
        while (true) {
            int i2 = this.f44239;
            if (i >= i2) {
                byteBuffer.limit(byteBuffer.position() + i2);
                this.f44237.write(byteBuffer);
                i -= i2;
            } else {
                byteBuffer.limit(limit);
                byteBuffer2.put(byteBuffer);
                return remaining;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (!isOpen()) {
            throw new ClosedChannelException();
        }
        ByteBuffer byteBuffer = this.f44240;
        byteBuffer.put((byte) i);
        if (byteBuffer.hasRemaining()) {
            return;
        }
        m34458();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34458() {
        ByteBuffer byteBuffer = this.f44240;
        byteBuffer.flip();
        int write = this.f44237.write(byteBuffer);
        boolean hasRemaining = byteBuffer.hasRemaining();
        int i = this.f44239;
        if (write != i || hasRemaining) {
            throw new IOException(String.format("Failed to write %,d bytes atomically. Only wrote  %,d", Integer.valueOf(i), Integer.valueOf(write)));
        }
        byteBuffer.clear();
    }
}
