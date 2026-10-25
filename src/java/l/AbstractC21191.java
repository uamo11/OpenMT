package l;

import java.io.OutputStream;

/* compiled from: 964V */
/* renamed from: l.᩷᩺ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC21191 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f68294;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f68295 = new byte[1];

    /* renamed from: ֫ */
    public abstract void mo33114(byte[] bArr, int i, int i2);

    public AbstractC21191(InterfaceC17066 interfaceC17066) {
        this.f68294 = interfaceC17066;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f68295;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.f68294.mo1526()) {
            throw new C16956();
        }
        mo33114(bArr, i, i2);
    }
}
