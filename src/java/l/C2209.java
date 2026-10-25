package l;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: M9Q4 */
/* renamed from: l.ۖ֨᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2209 extends InputStream implements InterfaceC14905 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f7256;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f7257;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f7258;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C2209(InterfaceC7889 interfaceC7889, long j, long j2) {
        this.f7256 = interfaceC7889;
        this.f7258 = j;
        this.f7257 = j2;
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        long j = this.f7257;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        synchronized (this.f7256) {
            this.f7256.seek(this.f7258);
            read = this.f7256.read(bArr, i, i2);
            if (read > 0) {
                long j2 = read;
                this.f7257 -= j2;
                this.f7258 += j2;
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f7257;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }
}
