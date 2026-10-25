package l;

import java.io.OutputStream;
import java.util.zip.CRC32;

/* compiled from: Q4GJ */
/* renamed from: l.ۨܰۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11740 extends OutputStream {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public OutputStream f35046;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CRC32 f35048 = new CRC32();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f35047 = 0;

    public C11740(OutputStream outputStream) {
        this.f35046 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f35046.write(bArr, i, i2);
        this.f35048.update(bArr, i, i2);
        this.f35047 += i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f35046.write(i);
        this.f35048.update(i);
        this.f35047++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m28738() {
        return this.f35047;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m28739() {
        return (int) this.f35048.getValue();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35046.close();
    }
}
