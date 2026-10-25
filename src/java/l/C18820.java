package l;

import java.io.BufferedInputStream;
import java.io.OutputStream;

/* compiled from: 27BS */
/* renamed from: l.ᩴܳܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18820 extends BufferedInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f59376;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f59377;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long skip;
        skip = super.skip(j);
        if (this.f59377 && skip > 0) {
            this.f59376 += skip;
        }
        return skip;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43484() {
        this.f59377 = true;
        this.f59376 = 0L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m43483() {
        return this.f59376;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        if (this.f59377 && read >= 0) {
            this.f59376++;
        }
        return read;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        if (this.f59377 && read > 0) {
            this.f59376 += read;
        }
        return read;
    }
}
