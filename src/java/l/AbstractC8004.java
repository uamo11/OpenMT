package l;

/* compiled from: 77Y0 */
/* renamed from: l.۠ۜۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC8004 extends AbstractC16553 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f24712;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16261 f24713;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC9124 f24714;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f24715;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f24716;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f24717;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f24718;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f24719;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f24720;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C8087 f24721;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f24722;

    @Override // l.AbstractC16553
    /* renamed from: ֫ */
    public final void mo18943(C7381 c7381, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f24719 = bArr;
        this.f24717 = bArr2;
        this.f24722 = bArr3;
        this.f24716 = bArr4;
        try {
            InterfaceC2774 interfaceC2774 = (InterfaceC2774) Class.forName(c7381.m19856(this.f24712)).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
            this.f50857 = interfaceC2774;
            interfaceC2774.init();
            C16261 c16261 = new C16261();
            this.f24713 = c16261;
            C8087 c8087 = new C8087(c16261);
            this.f24721 = c8087;
            c8087.m21457();
            this.f24713.m38234((byte) 30);
            try {
                InterfaceC9124 interfaceC9124 = (InterfaceC9124) Class.forName(c7381.m19856("ecdh-sha2-nistp")).asSubclass(InterfaceC9124.class).getDeclaredConstructor(null).newInstance(null);
                this.f24714 = interfaceC9124;
                interfaceC9124.mo23496(this.f24720);
                byte[] q = this.f24714.getQ();
                this.f24718 = q;
                this.f24713.m38256(q);
                if (bArr == null) {
                    return;
                }
                c7381.m19872(this.f24721);
                c7381.f22696.m46777().getClass();
                this.f24715 = 31;
            } catch (Exception e) {
                throw new C12651(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C12651(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC16553
    /* renamed from: ֫ */
    public final boolean mo18944(C16261 c16261) {
        if (this.f24715 == 31) {
            c16261.m38250();
            c16261.m38233();
            if (c16261.m38233() != 31) {
                this.f50859.f22696.m46777().getClass();
                return false;
            }
            this.f50858 = c16261.m38257();
            byte[] m38257 = c16261.m38257();
            byte[][] m18210 = C6676.m18210(m38257);
            if (this.f24714.mo23498(m18210[0], m18210[1])) {
                this.f50856 = AbstractC16553.m38939(AbstractC16553.m38938(this.f24714.mo23497(m18210[0], m18210[1])), true);
                byte[] m382572 = c16261.m38257();
                byte[] m38940 = AbstractC16553.m38940(this.f24717, false);
                this.f50857.mo1151(m38940.length, m38940);
                byte[] m389402 = AbstractC16553.m38940(this.f24719, false);
                this.f50857.mo1151(m389402.length, m389402);
                byte[] m389403 = AbstractC16553.m38940(this.f24716, false);
                this.f50857.mo1151(m389403.length, m389403);
                byte[] m389404 = AbstractC16553.m38940(this.f24722, false);
                this.f50857.mo1151(m389404.length, m389404);
                byte[] m389405 = AbstractC16553.m38940(this.f50858, false);
                this.f50857.mo1151(m389405.length, m389405);
                byte[] m389406 = AbstractC16553.m38940(this.f24718, false);
                this.f50857.mo1151(m389406.length, m389406);
                byte[] m389407 = AbstractC16553.m38940(m38257, false);
                this.f50857.mo1151(m389407.length, m389407);
                InterfaceC2774 interfaceC2774 = this.f50857;
                byte[] bArr = this.f50856;
                interfaceC2774.mo1151(bArr.length, bArr);
                this.f50855 = this.f50857.mo1152();
                byte[] bArr2 = this.f50858;
                int i = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
                boolean m38942 = m38942(C19356.m44585(4, i, bArr2), this.f50858, m382572, i + 4);
                this.f24715 = 0;
                return m38942;
            }
        }
        return false;
    }

    @Override // l.AbstractC16553
    /* renamed from: ܽ */
    public final int mo18945() {
        return this.f24715;
    }
}
