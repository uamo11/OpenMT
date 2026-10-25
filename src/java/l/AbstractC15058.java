package l;

/* compiled from: 47V7 */
/* renamed from: l.ܶۜۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC15058 extends AbstractC16553 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC10910 f45954;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f45955;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16261 f45956;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC9124 f45957;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f45958;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f45959;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f45960;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f45961;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f45962;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C8087 f45963;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f45964;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f45965;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f45966;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f45967;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f45968;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f45969;

    @Override // l.AbstractC16553
    /* renamed from: ֫ */
    public final void mo18943(C7381 c7381, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f45964 = bArr;
        this.f45961 = bArr2;
        this.f45962 = bArr3;
        this.f45967 = bArr4;
        try {
            InterfaceC2774 interfaceC2774 = (InterfaceC2774) Class.forName(c7381.m19856(this.f45968)).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
            this.f50857 = interfaceC2774;
            interfaceC2774.init();
            C16261 c16261 = new C16261();
            this.f45956 = c16261;
            C8087 c8087 = new C8087(c16261);
            this.f45963 = c8087;
            c8087.m21457();
            this.f45956.m38235(this.f45960 + 5 + this.f45965);
            this.f45956.m38234((byte) 30);
            try {
                InterfaceC10910 interfaceC10910 = (InterfaceC10910) Class.forName(c7381.m19856(this.f45955)).asSubclass(InterfaceC10910.class).getDeclaredConstructor(null).newInstance(null);
                this.f45954 = interfaceC10910;
                interfaceC10910.init();
                InterfaceC9124 interfaceC9124 = (InterfaceC9124) Class.forName(c7381.m19856("ecdh-sha2-nistp")).asSubclass(InterfaceC9124.class).getDeclaredConstructor(null).newInstance(null);
                this.f45957 = interfaceC9124;
                interfaceC9124.mo23496(this.f45966);
                byte[] publicKey = this.f45954.getPublicKey();
                byte[] q = this.f45957.getQ();
                int i = this.f45960;
                byte[] bArr5 = new byte[this.f45965 + i];
                this.f45959 = bArr5;
                System.arraycopy(publicKey, 0, bArr5, 0, i);
                System.arraycopy(q, 0, this.f45959, this.f45960, this.f45965);
                this.f45956.m38256(this.f45959);
                if (bArr == null) {
                    return;
                }
                c7381.m19872(this.f45963);
                c7381.f22696.m46777().getClass();
                this.f45969 = 31;
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
        if (this.f45969 == 31) {
            c16261.m38250();
            c16261.m38233();
            if (c16261.m38233() != 31) {
                this.f50859.f22696.m46777().getClass();
                return false;
            }
            this.f50858 = c16261.m38257();
            byte[] m38257 = c16261.m38257();
            int length = m38257.length;
            int i = this.f45958;
            int i2 = this.f45965;
            if (length == i + i2) {
                byte[] bArr = new byte[i];
                byte[] bArr2 = new byte[i2];
                System.arraycopy(m38257, 0, bArr, 0, i);
                System.arraycopy(m38257, this.f45958, bArr2, 0, this.f45965);
                byte[][] m18210 = C6676.m18210(bArr2);
                if (this.f45957.mo23498(m18210[0], m18210[1])) {
                    byte[] bArr3 = null;
                    try {
                        bArr3 = this.f45954.mo25585(bArr);
                        this.f50857.mo1151(bArr3.length, bArr3);
                        try {
                            bArr3 = this.f45957.mo23497(m18210[0], m18210[1]);
                            this.f50857.mo1151(bArr3.length, bArr3);
                            C19356.m44596(bArr3);
                            this.f50856 = AbstractC16553.m38940(this.f50857.mo1152(), true);
                            byte[] m382572 = c16261.m38257();
                            byte[] m38940 = AbstractC16553.m38940(this.f45961, false);
                            this.f50857.mo1151(m38940.length, m38940);
                            byte[] m389402 = AbstractC16553.m38940(this.f45964, false);
                            this.f50857.mo1151(m389402.length, m389402);
                            byte[] m389403 = AbstractC16553.m38940(this.f45967, false);
                            this.f50857.mo1151(m389403.length, m389403);
                            byte[] m389404 = AbstractC16553.m38940(this.f45962, false);
                            this.f50857.mo1151(m389404.length, m389404);
                            byte[] m389405 = AbstractC16553.m38940(this.f50858, false);
                            this.f50857.mo1151(m389405.length, m389405);
                            byte[] m389406 = AbstractC16553.m38940(this.f45959, false);
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
                            this.f45969 = 0;
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
        return this.f45969;
    }
}
