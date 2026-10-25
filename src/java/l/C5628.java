package l;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* compiled from: 9B2H */
/* renamed from: l.ۚ᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5628 extends FilterOutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0521 f17399;

    public C5628(OutputStream outputStream) {
        super(outputStream);
        this.f17399 = new C0521(32768);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        C0521 c0521 = this.f17399;
        if (c0521.f2177 < 32768) {
            c0521.write(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        C0521 c0521 = this.f17399;
        int min = Math.min(32768 - c0521.f2177, i2);
        if (min > 0) {
            c0521.write(bArr, i, min);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.close();
    }
}
