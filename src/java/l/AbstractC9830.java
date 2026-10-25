package l;

/* compiled from: S7Y0 */
/* renamed from: l.ۢ᩷ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC9830 extends AbstractC16553 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f29689;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C8087 f29690;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16261 f29691;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f29692;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29693;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f29694;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f29695;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f29696;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f29697;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f29698;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f29699;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC10910 f29700;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f29701;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f29702;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC0304 f29703;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f29704;

    @Override // l.AbstractC16553
    /* renamed from: ֫ */
    public final void mo18943(C7381 c7381, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f29699 = bArr;
        this.f29696 = bArr2;
        this.f29702 = bArr3;
        this.f29694 = bArr4;
        try {
            InterfaceC2774 interfaceC2774 = (InterfaceC2774) Class.forName(c7381.m19856(this.f29695)).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
            this.f50857 = interfaceC2774;
            interfaceC2774.init();
            C16261 c16261 = new C16261();
            this.f29691 = c16261;
            C8087 c8087 = new C8087(c16261);
            this.f29690 = c8087;
            c8087.m21457();
            this.f29691.m38235(this.f29693 + 5 + this.f29704);
            this.f29691.m38234((byte) 30);
            try {
                InterfaceC10910 interfaceC10910 = (InterfaceC10910) Class.forName(c7381.m19856(this.f29689)).asSubclass(InterfaceC10910.class).getDeclaredConstructor(null).newInstance(null);
                this.f29700 = interfaceC10910;
                interfaceC10910.init();
                InterfaceC0304 interfaceC0304 = (InterfaceC0304) Class.forName(c7381.m19856("xdh")).asSubclass(InterfaceC0304.class).getDeclaredConstructor(null).newInstance(null);
                this.f29703 = interfaceC0304;
                interfaceC0304.mo1674(this.f29704, this.f29692);
                byte[] publicKey = this.f29700.getPublicKey();
                byte[] q = this.f29703.getQ();
                int i = this.f29693;
                byte[] bArr5 = new byte[this.f29704 + i];
                this.f29697 = bArr5;
                System.arraycopy(publicKey, 0, bArr5, 0, i);
                System.arraycopy(q, 0, this.f29697, this.f29693, this.f29704);
                this.f29691.m38256(this.f29697);
                if (bArr == null) {
                    return;
                }
                c7381.m19872(this.f29690);
                c7381.f22696.m46777().getClass();
                this.f29698 = 31;
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
        if (this.f29698 == 31) {
            c16261.m38250();
            c16261.m38233();
            if (c16261.m38233() != 31) {
                this.f50859.f22696.m46777().getClass();
                return false;
            }
            this.f50858 = c16261.m38257();
            byte[] m38257 = c16261.m38257();
            int length = m38257.length;
            int i = this.f29701;
            int i2 = this.f29704;
            if (length == i + i2) {
                byte[] bArr = new byte[i];
                byte[] bArr2 = new byte[i2];
                System.arraycopy(m38257, 0, bArr, 0, i);
                System.arraycopy(m38257, this.f29701, bArr2, 0, this.f29704);
                if (this.f29703.mo1676(bArr2)) {
                    byte[] bArr3 = null;
                    try {
                        bArr3 = this.f29700.mo25585(bArr);
                        this.f50857.mo1151(bArr3.length, bArr3);
                        try {
                            bArr3 = this.f29703.mo1675(bArr2);
                            this.f50857.mo1151(bArr3.length, bArr3);
                            C19356.m44596(bArr3);
                            this.f50856 = AbstractC16553.m38940(this.f50857.mo1152(), true);
                            byte[] m382572 = c16261.m38257();
                            byte[] m38940 = AbstractC16553.m38940(this.f29696, false);
                            this.f50857.mo1151(m38940.length, m38940);
                            byte[] m389402 = AbstractC16553.m38940(this.f29699, false);
                            this.f50857.mo1151(m389402.length, m389402);
                            byte[] m389403 = AbstractC16553.m38940(this.f29694, false);
                            this.f50857.mo1151(m389403.length, m389403);
                            byte[] m389404 = AbstractC16553.m38940(this.f29702, false);
                            this.f50857.mo1151(m389404.length, m389404);
                            byte[] m389405 = AbstractC16553.m38940(this.f50858, false);
                            this.f50857.mo1151(m389405.length, m389405);
                            byte[] m389406 = AbstractC16553.m38940(this.f29697, false);
                            this.f50857.mo1151(m389406.length, m389406);
                            byte[] m389407 = AbstractC16553.m38940(m38257, false);
                            this.f50857.mo1151(m389407.length, m389407);
                            InterfaceC2774 interfaceC2774 = this.f50857;
                            byte[] bArr4 = this.f50856;
                            interfaceC2774.mo1151(bArr4.length, bArr4);
                            this.f50855 = this.f50857.mo1152();
                            byte[] bArr5 = this.f50858;
                            int i3 = ((bArr5[0] << 24) & (-16777216)) | ((bArr5[1] << 16) & 16711680) | ((bArr5[2] << 8) & 65280) | (bArr5[3] & 255);
                            boolean m38942 = m38942(C19356.m44585(4, i3, bArr5), this.f50858, m382572, i3 + 4);
                            this.f29698 = 0;
                            return m38942;
                        } finally {
                        }
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC16553
    /* renamed from: ܽ */
    public final int mo18945() {
        return this.f29698;
    }
}
