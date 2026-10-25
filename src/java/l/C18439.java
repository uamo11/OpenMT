package l;

import java.net.ProtocolException;

/* compiled from: L4FG */
/* renamed from: l.ᩴ֫֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18439 implements InterfaceC23037 {
    @Override // l.InterfaceC23037
    /* renamed from: ֫ */
    public final C18621 mo7384(C7855 c7855) {
        InterfaceC19145 m21042 = c7855.m21042();
        C15615 m21038 = c7855.m21038();
        C23377 m21041 = c7855.m21041();
        C8743 m21045 = c7855.m21045();
        long currentTimeMillis = System.currentTimeMillis();
        c7855.m21043().getClass();
        m21042.mo28144(m21045);
        c7855.m21043().getClass();
        C3804 c3804 = null;
        if (C3395.m10358(m21045.m22620()) && m21045.m22616() != null) {
            if ("100-continue".equalsIgnoreCase(m21045.m22615("Expect"))) {
                m21042.mo28146();
                c7855.m21043().getClass();
                c3804 = m21042.mo28140(true);
            }
            if (c3804 == null) {
                c7855.m21043().getClass();
                InterfaceC10405 m52568 = C23852.m52568(new C3622(m21042.mo28141(m21045, m21045.m22616().mo1976())));
                m21045.m22616().mo1977(m52568);
                m52568.close();
                c7855.m21043().getClass();
            } else if (!m21041.m51827()) {
                m21038.m36812();
            }
        }
        m21042.mo28143();
        if (c3804 == null) {
            c7855.m21043().getClass();
            c3804 = m21042.mo28140(false);
        }
        c3804.m11479(m21045);
        c3804.m11481(m21038.m36811().m51826());
        c3804.m11485(currentTimeMillis);
        c3804.m11476(System.currentTimeMillis());
        C18621 m11474 = c3804.m11474();
        int m43177 = m11474.m43177();
        if (m43177 == 100) {
            C3804 mo28140 = m21042.mo28140(false);
            mo28140.m11479(m21045);
            mo28140.m11481(m21038.m36811().m51826());
            mo28140.m11485(currentTimeMillis);
            mo28140.m11476(System.currentTimeMillis());
            m11474 = mo28140.m11474();
            m43177 = m11474.m43177();
        }
        c7855.m21043().getClass();
        C3804 m43172 = m11474.m43172();
        m43172.m11478(m21042.mo28142(m11474));
        C18621 m114742 = m43172.m11474();
        if ("close".equalsIgnoreCase(m114742.m43168().m22615("Connection")) || "close".equalsIgnoreCase(m114742.m43169("Connection"))) {
            m21038.m36812();
        }
        if ((m43177 != 204 && m43177 != 205) || m114742.m43170().mo1615() <= 0) {
            return m114742;
        }
        StringBuilder m32308 = C13325.m32308(m43177, "HTTP ", " had non-zero Content-Length: ");
        m32308.append(m114742.m43170().mo1615());
        throw new ProtocolException(m32308.toString());
    }
}
