package l;

import java.io.OutputStream;

/* compiled from: M8BF */
/* renamed from: l.ۘ۟ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3795 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C21567 f11977;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final OutputStream f11978;

    public C3795(OutputStream outputStream) {
        this.f11978 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (this.f11977 == null) {
            this.f11977 = new C21567(this.f11978);
        }
        this.f11977.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f11977 == null) {
            this.f11977 = new C21567(this.f11978);
        }
        this.f11977.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        C21567 c21567 = this.f11977;
        if (c21567 != null) {
            c21567.flush();
        } else {
            this.f11978.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C21567 c21567 = this.f11977;
        if (c21567 != null) {
            c21567.close();
        } else {
            this.f11978.close();
        }
    }
}
