package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: 195F */
/* renamed from: l.ۗᩳ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3410 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19277 f10787;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C3410(InputStream inputStream, C19277 c19277) {
        super(inputStream);
        this.f10787 = c19277;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        C19277 c19277;
        int read = super.read();
        if (read != -1 && (c19277 = this.f10787) != null) {
            c19277.m44460(1);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C19277 c19277;
        int read = super.read(bArr, i, i2);
        if (read > 0 && (c19277 = this.f10787) != null) {
            c19277.m44460(read);
        }
        return read;
    }
}
