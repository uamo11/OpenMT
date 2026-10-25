package l;

/* compiled from: A7UY */
/* renamed from: l.᩷᩷ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC21119 extends AbstractC16553 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f68113;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC0304 f68114;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16261 f68115;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f68116;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f68117;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f68118;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f68119;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f68120;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f68121;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f68122;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C8087 f68123;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f68124;

    @Override // l.AbstractC16553
    /* renamed from: ֫ */
    public final void mo18943(C7381 c7381, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f68121 = bArr;
        this.f68119 = bArr2;
        this.f68124 = bArr3;
        this.f68118 = bArr4;
        try {
            InterfaceC2774 interfaceC2774 = (InterfaceC2774) Class.forName(c7381.m19856(this.f68113)).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
            this.f50857 = interfaceC2774;
            interfaceC2774.init();
            C16261 c16261 = new C16261();
            this.f68115 = c16261;
            C8087 c8087 = new C8087(c16261);
            this.f68123 = c8087;
            c8087.m21457();
            this.f68115.m38234((byte) 30);
            try {
                InterfaceC0304 interfaceC0304 = (InterfaceC0304) Class.forName(c7381.m19856("xdh")).asSubclass(InterfaceC0304.class).getDeclaredConstructor(null).newInstance(null);
                this.f68114 = interfaceC0304;
                interfaceC0304.mo1674(this.f68122, this.f68116);
                byte[] q = this.f68114.getQ();
                this.f68120 = q;
                this.f68115.m38256(q);
                if (bArr == null) {
                    return;
                }
                c7381.m19872(this.f68123);
                c7381.f22696.m46777().getClass();
                this.f68117 = 31;
            } catch (Exception | LinkageError e) {
                throw new C12651(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C12651(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC16553
    /* renamed from: ֫ */
    public final boolean mo18944(C16261 c16261) {
        if (this.f68117 == 31) {
            c16261.m38250();
            c16261.m38233();
            if (c16261.m38233() != 31) {
                this.f50859.f22696.m46777().getClass();
                return false;
            }
            this.f50858 = c16261.m38257();
            byte[] m38257 = c16261.m38257();
            if (this.f68114.mo1676(m38257)) {
                this.f50856 = AbstractC16553.m38939(AbstractC16553.m38938(this.f68114.mo1675(m38257)), true);
                byte[] m382572 = c16261.m38257();
                byte[] m38940 = AbstractC16553.m38940(this.f68119, false);
                this.f50857.mo1151(m38940.length, m38940);
                byte[] m389402 = AbstractC16553.m38940(this.f68121, false);
                this.f50857.mo1151(m389402.length, m389402);
                byte[] m389403 = AbstractC16553.m38940(this.f68118, false);
                this.f50857.mo1151(m389403.length, m389403);
                byte[] m389404 = AbstractC16553.m38940(this.f68124, false);
                this.f50857.mo1151(m389404.length, m389404);
                byte[] m389405 = AbstractC16553.m38940(this.f50858, false);
                this.f50857.mo1151(m389405.length, m389405);
                byte[] m389406 = AbstractC16553.m38940(this.f68120, false);
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
                this.f68117 = 0;
                return m38942;
            }
        }
        return false;
    }

    @Override // l.AbstractC16553
    /* renamed from: ܽ */
    public final int mo18945() {
        return this.f68117;
    }
}
