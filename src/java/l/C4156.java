package l;

/* compiled from: 59X2 */
/* renamed from: l.ۘ᩵᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4156 extends AbstractC12601 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public InterfaceC8079 f13562;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f13563;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f13564;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final byte[] f13565;

    @Override // l.AbstractC3429
    /* renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        return 0;
    }

    public C4156(int i, InterfaceC1023 interfaceC1023, byte[] bArr) {
        super(interfaceC1023);
        this.f13565 = bArr;
        this.f13564 = i;
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int m12559() {
        return this.f13564;
    }

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8079 m12556() {
        return this.f13562;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8079 m12557(Class cls) {
        InterfaceC8079 interfaceC8079 = this.f13562;
        if (interfaceC8079 == null) {
            throw new C3037("Failed to decode output data");
        }
        if (cls.isAssignableFrom(interfaceC8079.getClass())) {
            return interfaceC8079;
        }
        throw new C3037("Incompatible response data " + interfaceC8079.getClass());
    }

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final int m12558() {
        return this.f13563;
    }

    @Override // l.AbstractC3429
    /* renamed from: ܺ֫ */
    public final boolean mo10455() {
        int i;
        int i2;
        int m10446 = m10446();
        if (m10446 == -1073741811) {
            return false;
        }
        if (m10446 == -1073741811 && ((i2 = this.f13564) == 1327346 || i2 == 1343730)) {
            return false;
        }
        return !(m10446 == -2147483643 && ((i = this.f13564) == 1163287 || i == 1130508 || i == 393620)) && super.mo10455();
    }

    @Override // l.AbstractC3429
    /* renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        int m5121 = C1480.m5121(i, bArr);
        if (m5121 == 9) {
            return m10456(i, bArr);
        }
        if (m5121 != 49) {
            throw new C17771("Expected structureSize = 49");
        }
        this.f13564 = C1480.m5123(i + 4, bArr);
        System.arraycopy(bArr, i + 8, new byte[16], 0, 16);
        int m10453 = m10453() + C1480.m5123(i + 24, bArr);
        int m5123 = C1480.m5123(i + 28, bArr);
        int m104532 = m10453() + C1480.m5123(i + 32, bArr);
        int m51232 = C1480.m5123(i + 36, bArr);
        C1480.m5123(i + 40, bArr);
        int i2 = i + 48;
        byte[] bArr2 = this.f13565;
        InterfaceC8079 interfaceC8079 = null;
        if (bArr2 == null) {
            switch (this.f13564) {
                case 393620:
                    interfaceC8079 = new C2249();
                    break;
                case 1130508:
                    interfaceC8079 = new C19679();
                    break;
                case 1310840:
                    interfaceC8079 = new C0627();
                    break;
                case 1311236:
                    interfaceC8079 = new C1333();
                    break;
                case 1327346:
                case 1343730:
                    interfaceC8079 = new C18973();
                    break;
            }
        }
        this.f13562 = interfaceC8079;
        int max = Math.max(m10453 + m5123, i2);
        if (bArr2 != null) {
            if (m51232 > bArr2.length) {
                throw new C17771("Output length exceeds buffer size");
            }
            System.arraycopy(bArr, m104532, bArr2, 0, m51232);
        } else {
            InterfaceC8079 interfaceC80792 = this.f13562;
            if (interfaceC80792 != null) {
                interfaceC80792.mo2557(m104532, m51232, bArr);
            }
        }
        this.f13563 = m51232;
        return Math.max(m104532 + m51232, max) - i;
    }
}
