package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Y6XM */
/* renamed from: l.ۤܺۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10390 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f31241;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C10390(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read >= 0) {
            this.f31241++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f31241 += read;
        }
        return read;
    }
}
