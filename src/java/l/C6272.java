package l;

/* compiled from: 89UN */
/* renamed from: l.ۛ᩵᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6272 extends AbstractC12601 {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public byte[] f19415;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public int f19416;

    @Override // l.AbstractC3429
    /* renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC12601, l.InterfaceC1543
    /* renamed from: ֫ */
    public final void mo5288(InterfaceC7578 interfaceC7578) {
        if (mo28213()) {
            interfaceC7578.mo10448(m10465());
        }
        super.mo5288(interfaceC7578);
    }

    @Override // l.AbstractC3429
    /* renamed from: ܺ֫ */
    public final boolean mo10455() {
        return m10446() != -1073741802 && super.mo10455();
    }

    @Override // l.AbstractC3429
    /* renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        if (C1480.m5121(i, bArr) != 9) {
            throw new C17771("Structure size != 9");
        }
        this.f19416 = C1480.m5121(i + 2, bArr);
        int m5121 = C1480.m5121(i + 4, bArr);
        int m51212 = C1480.m5121(i + 6, bArr);
        int i2 = i + 8;
        int m10453 = i2 - (m10453() + m5121);
        this.f19415 = new byte[m51212];
        System.arraycopy(bArr, m10453() + m5121, this.f19415, 0, m51212);
        return ((i2 + m10453) + m51212) - i;
    }

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17280() {
        return (this.f19416 & 3) != 0;
    }

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int m17279() {
        return this.f19416;
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final byte[] m17281() {
        return this.f19415;
    }
}
