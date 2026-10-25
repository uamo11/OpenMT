package l;

/* compiled from: X43L */
/* renamed from: l.֡᩸֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0674 extends AbstractC20536 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2609 f2597;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2609 f2598;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f2599;

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        C2609 c2609 = this.f2598;
        C2609 c26092 = this.f2597;
        while (c2609.m8249()) {
            if (!c8541.m12929((AbstractC4308) c2609.f8240)) {
                c2609 = c2609.f8241;
                c26092 = c26092.f8241;
            } else {
                return ((AbstractC4308) c26092.f8240).mo12937(c8541);
            }
        }
        return c8541;
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo2744(C10077 c10077, Object obj) {
        return m2747(c10077);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC4308 mo2744(C10077 c10077, Object obj) {
        return m2747(c10077);
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo2145(C19955 c19955, Void r5) {
        if (!c19955.mo5146()) {
            return super.mo2145(c19955, (Object) r5);
        }
        C6319 c6319 = this.f2599;
        AbstractC4308 m6856 = m6856(c6319.m17562(c19955));
        C2609 m4861 = m4861(r5, c6319.m17510(c19955));
        return (m6856 == c6319.m17562(c19955) && m4861 == c6319.m17510(c19955)) ? c19955 : c6319.m17534(m4861.m8246(m6856));
    }

    @Override // l.AbstractC20536, l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo2144(C19831 c19831, Void r3) {
        C19831 c198312 = (C19831) super.mo2144(c19831, (Object) r3);
        if (c198312 != c19831 && c19831.mo12922() && c198312.f64066.mo12922()) {
            c198312.f64066 = this.f2599.m17511(c198312.f64066);
        }
        return c198312;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10077 m2747(C10077 c10077) {
        C2609 c2609 = c10077.f30362;
        C2609 c26092 = this.f2597;
        boolean m12903 = AbstractC4308.m12903(c26092, c2609);
        C6319 c6319 = this.f2599;
        if (m12903) {
            C2609 m17564 = c6319.m17564(c2609);
            c10077 = new C10077(c6319.m17488(c10077.f14167, c2609, m17564), m17564);
        }
        AbstractC4308 abstractC4308 = c10077.f14167;
        C2609 c26093 = c10077.f30362;
        C2609 m17521 = c6319.m17521(c26093, this.f2598, c26092);
        AbstractC4308 m6856 = m6856(abstractC4308);
        if (m17521 == c26093 && m6856 == abstractC4308) {
            return c10077;
        }
        if (m17521 == c26093) {
            return new C19020(m6856, m17521);
        }
        return new C19726(c6319.m17488(m6856, c26093, m17521), m17521);
    }

    public C0674(C6319 c6319, C2609 c2609, C2609 c26092) {
        this.f2599 = c6319;
        int m8245 = c2609.m8245();
        int m82452 = c26092.m8245();
        while (m8245 > m82452) {
            m8245--;
            c2609 = c2609.f8241;
        }
        while (m8245 < m82452) {
            m82452--;
            c26092 = c26092.f8241;
        }
        this.f2598 = c2609;
        this.f2597 = c26092;
    }
}
