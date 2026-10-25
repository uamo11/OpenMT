package l;

/* compiled from: 48CR */
/* renamed from: l.ᩴ᩵ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18960 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23171 f59798;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C10472 f59799;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11883 f59800;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C11883 f59801;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0614 f59802;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59803;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7649 f59804;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19666 f59806;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13998 f59807;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2026 f59808;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f59809;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f59810;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f59797 = 0.16666666666666666d;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC20371 f59805 = new C4143(this);

    public C18960(C0614 c0614, int i) {
        this.f59802 = c0614;
        this.f59803 = i;
        if (i == 9) {
            this.f59809 = true;
            this.f59810 = 128;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43770(C19666 c19666) {
        InterfaceC4394 interfaceC4394;
        InterfaceC4394 interfaceC43942;
        InterfaceC4394 interfaceC43943;
        InterfaceC4394 interfaceC43944;
        InterfaceC4394 interfaceC43945;
        InterfaceC4394 interfaceC43946;
        InterfaceC4394 interfaceC43947;
        C16842 c16842;
        C16842 c168422;
        this.f59806 = c19666;
        C0614 c0614 = this.f59802;
        interfaceC4394 = c0614.f2370;
        C7649 c7649 = new C7649();
        this.f59804 = c7649;
        ((C7216) interfaceC4394).m19307(c7649);
        interfaceC43942 = c0614.f2370;
        C2026 c2026 = new C2026();
        C8355 c8355 = new C8355("Frequency");
        c2026.f6759 = c8355;
        c2026.m52649(c8355);
        c8355.m21953(40.0d, 440.0d, 8000.0d);
        C8355 c83552 = new C8355(1, "Amplitude", 1.0d);
        c2026.f6757 = c83552;
        c2026.m52649(c83552);
        C22466 c22466 = new C22466("Phase");
        c2026.f6758 = c22466;
        c2026.m52649(c22466);
        C15409 c15409 = new C15409(0);
        c2026.f6756 = c15409;
        c2026.m52649(c15409);
        this.f59808 = c2026;
        ((C7216) interfaceC43942).m19307(c2026);
        interfaceC43943 = c0614.f2370;
        C11883 c11883 = new C11883();
        this.f59801 = c11883;
        ((C7216) interfaceC43943).m19307(c11883);
        this.f59801.f35427.m21952(0.02d);
        interfaceC43944 = c0614.f2370;
        C11883 c118832 = new C11883();
        this.f59800 = c118832;
        ((C7216) interfaceC43944).m19307(c118832);
        this.f59800.f35427.m21952(0.02d);
        interfaceC43945 = c0614.f2370;
        C10472 c10472 = new C10472();
        this.f59799 = c10472;
        ((C7216) interfaceC43945).m19307(c10472);
        this.f59799.f53642.m21952(1.0d);
        this.f59799.f31431.m21952(0.02d);
        interfaceC43946 = c0614.f2370;
        C23171 c23171 = new C23171();
        this.f59798 = c23171;
        ((C7216) interfaceC43946).m19307(c23171);
        interfaceC43947 = c0614.f2370;
        C13998 c13998 = new C13998();
        C8355 c83553 = new C8355("Input");
        c13998.f41726 = c83553;
        c13998.m52649(c83553);
        C8355 c83554 = new C8355("Pan");
        c13998.f41725 = c83554;
        c13998.m52649(c83554);
        c83554.m21953(-1.0d, 0.0d, 1.0d);
        C15409 c154092 = new C15409("Output");
        c13998.f41727 = c154092;
        c13998.m52649(c154092);
        this.f59807 = c13998;
        ((C7216) interfaceC43947).m19307(c13998);
        this.f59804.f23621.m21960();
        this.f59808.f6756.m36460(0, this.f59804.f23621, 0);
        this.f59808.f6757.m21952(0.0d);
        this.f59808.f6759.m21952(5.0d);
        this.f59799.f53643.m36460(0, this.f59798.f56768, 0);
        this.f59798.f56766.m36460(0, this.f59807.f41726, 0);
        C15409 c154093 = this.f59807.f41727;
        c16842 = c0614.f2369;
        c154093.m36460(0, c16842.f51700, 0);
        C15409 c154094 = this.f59807.f41727;
        c168422 = c0614.f2369;
        c154094.m36460(1, c168422.f51701, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43766(C18960 c18960, InterfaceC21077 interfaceC21077) {
        AbstractC23898 abstractC23898 = (AbstractC23898) interfaceC21077;
        C8355 c8355 = (C8355) abstractC23898.mo14057("FreqScaler");
        if (c8355 != null) {
            c8355.m38022();
            c18960.f59804.f23622.m36460(0, c8355, 0);
        }
        C8355 c83552 = (C8355) abstractC23898.mo14057("Timbre");
        if (c83552 != null) {
            c83552.m38022();
            c18960.f59801.f53643.m36460(0, c83552, 0);
            c18960.f59801.f53642.m21956(c83552);
        }
        C8355 c83553 = (C8355) abstractC23898.mo14057("Pressure");
        if (c83553 != null) {
            c83553.m38022();
            c18960.f59800.f53643.m36460(0, c83553, 0);
            c18960.f59800.f53642.m21956(c83553);
        }
        interfaceC21077.mo6592().m38022();
        interfaceC21077.mo6592().m36460(0, c18960.f59798.f56767, 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43772(int i) {
        AbstractC22487 abstractC22487;
        AbstractC22487 abstractC224872;
        if (this.f59809) {
            return;
        }
        abstractC22487 = this.f59806.f63520;
        int m50440 = i % abstractC22487.m50440();
        abstractC224872 = this.f59806.f63520;
        String str = abstractC224872.m50441()[m50440];
        this.f59810 = m50440;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43768(int i) {
        InterfaceC4394 interfaceC4394;
        C21782 c21782;
        interfaceC4394 = this.f59802.f2370;
        C21245 m19305 = ((C7216) interfaceC4394).m19305();
        c21782 = this.f59806.f63519;
        int i2 = (this.f59803 << 8) + i;
        ((C7216) c21782.m49111()).m19306(m19305, new C8376(c21782, i2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43769(int i, double d) {
        InterfaceC4394 interfaceC4394;
        C21782 c21782;
        interfaceC4394 = this.f59802.f2370;
        C21245 m19305 = ((C7216) interfaceC4394).m19305();
        double m2989 = C0782.m2989(i);
        c21782 = this.f59806.f63519;
        ((C7216) c21782.m49111()).m19306(m19305, new C1320(c21782, (this.f59803 << 8) + i, this.f59805, m2989, d));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43774(double d) {
        this.f59804.f23621.m21952(this.f59797 * d);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43767(double d) {
        this.f59797 = d / 12.0d;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m43773(double d) {
        this.f59808.f6757.m21952(d);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m43777(double d) {
        this.f59799.f53642.m21952(Math.pow(63095.73444801944d, d) * 1.5848931924611107E-5d);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43771(double d) {
        this.f59807.f41725.m21952(d);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m43775(double d) {
        double m21961 = this.f59801.f53642.m21961();
        this.f59801.f53642.m21952(((this.f59801.f53642.m21959() - m21961) * d) + m21961);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43776(double d) {
        double m21961 = this.f59800.f53642.m21961();
        this.f59800.f53642.m21952(Math.pow(this.f59800.f53642.m21959() / m21961, d) * m21961);
    }
}
