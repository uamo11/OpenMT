package l;

/* compiled from: D8DA */
/* renamed from: l.᩻᩹֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23980 extends C4827 implements InterfaceC21077 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9164 f77747;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f77748;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12588 f77749;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C8355 f77750;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C2983 f77751;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12588 f77752;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C9788 f77753;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C8355 f77754;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23171 f77755;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f77756;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6238 f77757;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C8355 f77758;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f77759;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8355 f77760;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9082 f77761;

    public C23980(short[] sArr) {
        this.f77751 = new C2983(sArr);
        C23171 c23171 = new C23171();
        this.f77755 = c23171;
        C9788 c9788 = new C9788();
        this.f77753 = c9788;
        C9082 c9082 = new C9082();
        this.f77761 = c9082;
        C12588 c12588 = new C12588();
        this.f77752 = c12588;
        C12588 c125882 = new C12588();
        this.f77749 = c125882;
        C8355 c8355 = c125882.f37963;
        this.f77750 = c8355;
        C6238 c6238 = new C6238();
        C8355 c83552 = new C8355("Frequency");
        c6238.f19117 = c83552;
        c6238.m52649(c83552);
        c83552.m21953(40.0d, 400.0d, 6000.0d);
        C8355 c83553 = new C8355(1, "Amplitude", 1.0d);
        c6238.f19115 = c83553;
        c6238.m52649(c83553);
        C8355 c83554 = new C8355("Q");
        c6238.f19110 = c83554;
        c6238.m52649(c83554);
        c83554.m21953(0.1d, 1.0d, 10.0d);
        this.f77757 = c6238;
        C8355 c83555 = c23171.f56768;
        this.f77760 = c83555;
        C23171 c231712 = new C23171();
        C8355 c83556 = c231712.f56767;
        this.f77758 = c83556;
        C20350 c20350 = new C20350();
        C8355 c83557 = c20350.f56768;
        this.f77754 = c83557;
        C8355 c83558 = c231712.f56768;
        C23171 c231713 = new C23171();
        m14060(c231712);
        m14060(c23171);
        m14060(c231713);
        m14060(c9788);
        m14060(c9082);
        m14060(c12588);
        m14060(c125882);
        m14060(c6238);
        m14060(c20350);
        c125882.f44973.m36460(0, c20350.f56767, 0);
        c20350.f56766.m36460(0, c6238.f19117, 0);
        c231712.f56766.m36460(0, c9788.f29602, 0);
        c23171.f56766.m36460(0, c231713.f56767, 0);
        c231713.f56766.m36460(0, c12588.f37963, 0);
        m52648(c83555, "Amplitude");
        m52648(c83556, "Frequency");
        m52648(c83557, "Cutoff");
        m14062(c83557, "Timbre");
        m52648(c83558, "FreqScaler");
        m52648(c8355, "FilterEnvDepth");
        c125882.m30856(this, "Filter");
        c12588.m30856(this, "Amp");
        c83556.m21956(c9788.f29602);
        c83558.m21953(0.2d, 1.0d, 4.0d);
        c83557.m21956(c6238.f19117);
        c8355.m21953(-4000.0d, 2000.0d, 4000.0d);
        c9788.f29607.m21952(0.5d);
        c12588.f44972.m2452(this);
        c231713.f56768.m21953(1.0d, 1.0d, 4.0d);
        m14062(c231713.f56768, "Pressure");
        mo6589(0);
    }

    @Override // l.InterfaceC21077
    /* renamed from: ֫ */
    public final void mo6590(C21245 c21245) {
        if (this.f77747 == null) {
            return;
        }
        this.f77752.f44972.m2448(c21245);
        this.f77749.f44972.m2448(c21245);
        C9164 c9164 = this.f77747;
        c9164.getClass();
        int i = c9164.f27739;
        if ((i & 2) == 0 || (i & 1) == 0) {
            return;
        }
        int i2 = c9164.f27741;
        int i3 = i2 + 1;
        int i4 = this.f77756;
        if (i3 < i4) {
            int i5 = this.f77748 + i2;
            C18939 c18939 = this.f77753.f29611;
            c18939.m49086(c21245, c18939.m43705(this.f77751, i5, i4 - i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    @Override // l.InterfaceC21077
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6588(double r19, double r21, l.C21245 r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23980.mo6588(double, double, l.᩸֨ۘ):void");
    }

    @Override // l.InterfaceC6965
    /* renamed from: ᩳ */
    public final C15409 mo6592() {
        return this.f77752.f44973;
    }

    @Override // l.InterfaceC21077
    /* renamed from: ֫ */
    public final void mo6589(int i) {
        if (this.f77759 == i) {
            return;
        }
        C12588 c12588 = this.f77752;
        c12588.f37969.m21952(0.1d);
        c12588.f37964.m21952(0.9d);
        c12588.f37959.m21952(0.1d);
        c12588.f37968.m21952(0.1d);
        C12588 c125882 = this.f77749;
        c125882.f37969.m21952(0.01d);
        c125882.f37964.m21952(0.6d);
        c125882.f37959.m21952(0.4d);
        c125882.f37968.m21952(1.0d);
        C6238 c6238 = this.f77757;
        c6238.f19110.m21952(1.0d);
        C8355 c8355 = this.f77754;
        c8355.m21952(5000.0d);
        C8355 c83552 = this.f77750;
        c83552.m21952(500.0d);
        this.f77747 = null;
        this.f77759 = i;
        if (i == 0) {
            c12588.f37969.m21952(0.1d);
            c12588.f37964.m21952(0.9d);
            c12588.f37959.m21952(0.1d);
            c12588.f37968.m21952(0.1d);
            c8355.m21952(300.0d);
            c83552.m21952(500.0d);
            c6238.f19110.m21952(3.0d);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52799(C9870 c9870, C12588 c12588, C21245 c21245) {
        c12588.f37969.m21954(Math.max(0.005d, 4194304.0d / (c9870.f29851 * 22050)), c21245);
        c12588.f37964.m21954((Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(c9870.f29852 / 32768.0d) * 22050.0d), c21245);
        c12588.f37959.m21954(c9870.f29854 * 3.0517578125E-5d, c21245);
        c12588.f37968.m21954(Math.max(0.02d, (Math.log(3.0517578125E-5d) * 128.0d) / (Math.log(c9870.f29853 / 32768.0d) * 22050.0d)), c21245);
    }
}
