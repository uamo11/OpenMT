package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: A6SP */
/* renamed from: l.᩷᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21109 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9820 f68097;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f68098;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f68099;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f68100 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C21109(C9820 c9820) {
        this.f68097 = c9820;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f68100;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j;
        FileChannel fileChannel;
        long j2;
        long j3;
        C11003.checkFromIndexSize(i, i2, bArr.length);
        C9820 c9820 = this.f68097;
        C9114 c9114 = c9820.f29678;
        C9114.m23481(c9114);
        if (this.f68099) {
            throw new IOException("Legacy state slice is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j4 = this.f68098;
        j = c9820.f29676;
        if (j4 == j) {
            return -1;
        }
        fileChannel = c9114.f27613;
        j2 = c9820.f29676;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j2 - this.f68098));
        j3 = c9820.f29677;
        int read = fileChannel.read(wrap, j3 + this.f68098);
        if (read <= 0) {
            throw new EOFException("Legacy state slice is truncated");
        }
        this.f68098 += read;
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f68099 = true;
    }
}
