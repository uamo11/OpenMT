package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: K6XC */
/* renamed from: l.ۗۢۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3150 extends OutputStream {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final FilterOutputStream f9840;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f9841;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f9842 = true;

    public C3150(FilterOutputStream filterOutputStream) {
        this.f9840 = filterOutputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        try {
            this.f9840.write(i);
            this.f9841++;
        } catch (IOException e) {
            this.f9842 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f9842 = false;
            throw e2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.f9840.write(bArr, i, i2);
            this.f9841 += i2;
        } catch (IOException e) {
            this.f9842 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f9842 = false;
            throw e2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.f9840.flush();
        } catch (IOException e) {
            this.f9842 = false;
            throw e;
        } catch (RuntimeException e2) {
            this.f9842 = false;
            throw e2;
        }
    }
}
