package l;

/* compiled from: N9CQ */
/* renamed from: l.ᩴ֫ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18443 implements InterfaceC5202 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15619 f57215;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f57214 = new byte[64];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f57216 = new byte[64];

    public C18443(C15619 c15619) {
        this.f57215 = c15619;
    }

    @Override // l.InterfaceC5202
    public final void init(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            throw new C8024("Missing key data");
        }
        int min = Math.min(bArr.length, 64);
        int i = 0;
        while (true) {
            bArr2 = this.f57216;
            bArr3 = this.f57214;
            if (i >= min) {
                break;
            }
            bArr3[i] = (byte) (54 ^ bArr[i]);
            bArr2[i] = (byte) (92 ^ bArr[i]);
            i++;
        }
        while (min < 64) {
            bArr3[min] = 54;
            bArr2[min] = 92;
            min++;
        }
        m42922();
    }

    @Override // l.InterfaceC5202
    /* renamed from: ֫ */
    public final byte[] mo14975() {
        C15619 c15619 = this.f57215;
        try {
            byte[] m36818 = c15619.m36818();
            c15619.m36816(this.f57216);
            c15619.m36816(m36818);
            return c15619.m36818();
        } finally {
            m42922();
        }
    }

    @Override // l.InterfaceC5202
    public final void update(byte[] bArr) {
        this.f57215.m36816(bArr);
    }

    @Override // l.InterfaceC5202
    public final void update(byte[] bArr, int i, int i2) {
        this.f57215.m36817(bArr, i, i2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m42922() {
        C15619 c15619 = this.f57215;
        c15619.m36820();
        byte[] bArr = this.f57214;
        c15619.m36817(bArr, 0, bArr.length);
    }
}
