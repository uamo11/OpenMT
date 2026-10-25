package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: B1PU */
/* renamed from: l.ᩳܺۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18154 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19277 f56452;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18154(InputStream inputStream, C19277 c19277) {
        super(inputStream);
        this.f56452 = c19277;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        this.f56452.m44460(1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        this.f56452.m44460(read);
        return read;
    }
}
