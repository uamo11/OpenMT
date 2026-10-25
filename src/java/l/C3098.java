package l;

import java.io.IOException;

/* compiled from: A4CU */
/* renamed from: l.ۗ۟᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3098 implements InterfaceC23037 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17733 f9692;

    public C3098(InterfaceC17733 interfaceC17733) {
        this.f9692 = interfaceC17733;
    }

    @Override // l.InterfaceC23037
    /* renamed from: ֫ */
    public final C18621 mo7384(C7855 c7855) {
        InterfaceC5508 mo17691;
        InterfaceC17733 interfaceC17733 = this.f9692;
        C18621 mo31019 = interfaceC17733 != null ? interfaceC17733.mo31019(c7855.m21045()) : null;
        C10154 m29804 = new C12270(System.currentTimeMillis(), c7855.m21045(), mo31019).m29804();
        C8743 c8743 = m29804.f30536;
        C18621 c18621 = m29804.f30535;
        if (interfaceC17733 != null) {
            interfaceC17733.mo31017(m29804);
        }
        if (mo31019 != null && c18621 == null) {
            C20032.m46179(mo31019.m43170());
        }
        if (c8743 == null && c18621 == null) {
            C3804 c3804 = new C3804();
            c3804.m11479(c7855.m21045());
            c3804.m11482(EnumC14386.HTTP_1_1);
            c3804.m11475(504);
            c3804.m11486("Unsatisfiable Request (only-if-cached)");
            c3804.m11478(C20032.f64894);
            c3804.m11485(-1L);
            c3804.m11476(System.currentTimeMillis());
            return c3804.m11474();
        }
        if (c8743 == null) {
            C3804 m43172 = c18621.m43172();
            m43172.m11483(m9448(c18621));
            return m43172.m11474();
        }
        try {
            C18621 m21036 = c7855.m21036(c8743);
            if (m21036 == null && mo31019 != null) {
            }
            if (c18621 != null) {
                if (m21036.m43177() == 304) {
                    C3804 m431722 = c18621.m43172();
                    C10338 m43180 = c18621.m43180();
                    C10338 m431802 = m21036.m43180();
                    C12454 c12454 = new C12454();
                    int m26139 = m43180.m26139();
                    for (int i = 0; i < m26139; i++) {
                        String m26136 = m43180.m26136(i);
                        String m26140 = m43180.m26140(i);
                        if ((!"Warning".equalsIgnoreCase(m26136) || !m26140.startsWith("1")) && ("Content-Length".equalsIgnoreCase(m26136) || "Content-Encoding".equalsIgnoreCase(m26136) || "Content-Type".equalsIgnoreCase(m26136) || !m9449(m26136) || m431802.m26137(m26136) == null)) {
                            AbstractC8037.f24775.mo21353(c12454, m26136, m26140);
                        }
                    }
                    int m261392 = m431802.m26139();
                    for (int i2 = 0; i2 < m261392; i2++) {
                        String m261362 = m431802.m26136(i2);
                        if (!"Content-Length".equalsIgnoreCase(m261362) && !"Content-Encoding".equalsIgnoreCase(m261362) && !"Content-Type".equalsIgnoreCase(m261362) && m9449(m261362)) {
                            AbstractC8037.f24775.mo21353(c12454, m261362, m431802.m26140(i2));
                        }
                    }
                    m431722.m11480(c12454.m30612());
                    m431722.m11485(m21036.m43175());
                    m431722.m11476(m21036.m43179());
                    m431722.m11483(m9448(c18621));
                    m431722.m11487(m9448(m21036));
                    C18621 m11474 = m431722.m11474();
                    m21036.m43170().close();
                    interfaceC17733.mo31015();
                    interfaceC17733.mo31018(c18621, m11474);
                    return m11474;
                }
                C20032.m46179(c18621.m43170());
            }
            C3804 m431723 = m21036.m43172();
            m431723.m11483(m9448(c18621));
            m431723.m11487(m9448(m21036));
            C18621 m114742 = m431723.m11474();
            if (interfaceC17733 != null) {
                if (C0799.m3019(m114742) && C10154.m25491(c8743, m114742)) {
                    InterfaceC12975 mo31014 = interfaceC17733.mo31014(m114742);
                    if (mo31014 != null && (mo17691 = mo31014.mo17691()) != null) {
                        C4509 c4509 = new C4509(m114742.m43170().mo1616(), mo31014, C23852.m52568(mo17691));
                        String m43169 = m114742.m43169("Content-Type");
                        long mo1615 = m114742.m43170().mo1615();
                        C3804 m431724 = m114742.m43172();
                        m431724.m11478(new C14910(m43169, mo1615, C23852.m52567(c4509)));
                        return m431724.m11474();
                    }
                } else if (C3395.m10359(c8743.m22620())) {
                    try {
                        interfaceC17733.mo31016(c8743);
                    } catch (IOException unused) {
                    }
                }
            }
            return m114742;
        } finally {
            if (mo31019 != null) {
                C20032.m46179(mo31019.m43170());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18621 m9448(C18621 c18621) {
        if (c18621 == null || c18621.m43170() == null) {
            return c18621;
        }
        C3804 m43172 = c18621.m43172();
        m43172.m11478((AbstractC0275) null);
        return m43172.m11474();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9449(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
