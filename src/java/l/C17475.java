package l;

import java.io.OutputStream;

/* compiled from: 51WE */
/* renamed from: l.ܿܽᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17475 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14652 f53408;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f53409;

    public C17475(C14652 c14652, OutputStream outputStream) {
        this.f53408 = c14652;
        this.f53409 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C23825 c23825;
        this.f53409.write(bArr, i, i2);
        c23825 = this.f53408.f44784;
        c23825.m52515(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C23825 c23825;
        this.f53409.write(i);
        c23825 = this.f53408.f44784;
        c23825.m52515(1);
    }
}
