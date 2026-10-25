package l;

import java.io.FilterOutputStream;

/* compiled from: F2NF */
/* renamed from: l.ۡ᩺ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9194 extends FilterOutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f27867;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m23627() {
        return this.f27867;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f27867 += i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        ((FilterOutputStream) this).out.write(i);
        this.f27867++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((FilterOutputStream) this).out.close();
    }
}
