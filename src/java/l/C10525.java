package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: X6S5 */
/* renamed from: l.ۤ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10525 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileChannel f31552;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f31553;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f31554;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f31555 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C10525(C12641 c12641, FileChannel fileChannel) {
        this.f31552 = fileChannel;
        this.f31553 = c12641.f38086;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f31555;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C11003.checkFromIndexSize(i, i2, bArr.length);
        if (this.f31554) {
            throw new IOException("Migration state stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f31553;
        if (j == 0) {
            return -1;
        }
        int read = this.f31552.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j)));
        if (read <= 0) {
            throw new EOFException("Migration state changed during reading");
        }
        this.f31553 -= read;
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f31554) {
            return;
        }
        this.f31554 = true;
        this.f31552.close();
    }
}
