package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: B6RA */
/* renamed from: l.ۛۙᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5836 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileChannel f17897;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f17898;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f17899;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f17900 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C5836(C11481 c11481, FileChannel fileChannel) {
        long j;
        this.f17897 = fileChannel;
        j = c11481.f34290;
        this.f17898 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f17900;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C11003.checkFromIndexSize(i, i2, bArr.length);
        if (this.f17899) {
            throw new IOException("Recovery attachment stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f17898;
        if (j == 0) {
            return -1;
        }
        int read = this.f17897.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j)));
        if (read <= 0) {
            throw new EOFException("Recovery attachment changed during reading");
        }
        this.f17898 -= read;
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17899) {
            return;
        }
        this.f17899 = true;
        this.f17897.close();
    }
}
