package l;

import com.thegrizzlylabs.sardineandroid.model.Allprop;
import com.thegrizzlylabs.sardineandroid.model.Propfind;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.simpleframework.xml.stream.MyPullProvider;

/* compiled from: QABT */
/* renamed from: l.ۤ᩹ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10577 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17209 f31751;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f31752;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile String f31753;

    static {
        MyPullProvider.inject();
    }

    public C10577(C17209 c17209, String str) {
        this.f31751 = c17209;
        this.f31752 = m26579(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26586(String str, String str2, boolean z) {
        C17915 m40470 = this.f31751.m40470();
        m40470.m41901(new C15514(str, str2));
        if (z) {
            m40470.m41903(new C4932(str, str2));
        }
        this.f31751 = m40470.m41894();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m26587() {
        return this.f31753;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26590(String str) {
        this.f31753 = m26579(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26583() {
        this.f31753 = null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m26591(String str) {
        C13864 c13864;
        Propfind propfind = new Propfind();
        propfind.setAllprop(new Allprop());
        try {
            c13864 = C13864.m33217("text/xml");
        } catch (IllegalArgumentException unused) {
            c13864 = null;
        }
        AbstractC2393 m7754 = AbstractC2393.m7754(c13864, C14746.m35046(propfind));
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24283("Depth", Integer.toString(1));
        c9449.m24277("PROPFIND", m7754);
        return (List) m26572(c9449.m24274(), new C2047());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m26581(long j, String str) {
        if (j == 0) {
            Map map = Collections.EMPTY_MAP;
            C10338 m26134 = C10338.m26134();
            C9449 c9449 = new C9449();
            c9449.m24282(str);
            c9449.m24281();
            c9449.m24278(m26134);
            return (InputStream) m26572(c9449.m24274(), new C14103());
        }
        C9449 c94492 = new C9449();
        c94492.m24282(str);
        c94492.m24281();
        c94492.m24278(C10338.m26132("Range", "bytes=" + j + "-"));
        return (InputStream) m26572(c94492.m24274(), new C21866());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26588(String str) {
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("DELETE", C20032.f64891);
        C8743 m24274 = c9449.m24274();
        C13398 m26574 = m26574(m24274);
        if (m26574.f40053 && m26574.f40051.m43177() == 403) {
            try {
                m26574.f40051.close();
            } catch (Exception unused) {
            }
            this.f31753 = null;
            m26574 = m26574(m24274);
        }
        m26575(m26574);
        C18275.m42607(m26574.f40051);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26584(String str) {
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("MKCOL", (AbstractC2393) null);
        C8743 m24274 = c9449.m24274();
        C13398 m26574 = m26574(m24274);
        if (m26574.f40053 && m26574.f40051.m43177() == 403) {
            try {
                m26574.f40051.close();
            } catch (Exception unused) {
            }
            this.f31753 = null;
            m26574 = m26574(m24274);
        }
        m26575(m26574);
        C18275.m42607(m26574.f40051);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m26589(String str) {
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("HEAD", (AbstractC2393) null);
        return ((Boolean) m26572(c9449.m24274(), new C23276())).booleanValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m26572(C8743 c8743, InterfaceC11220 interfaceC11220) {
        C13398 m26574 = m26574(c8743);
        if (m26574.f40053 && m26574.f40051.m43177() == 403) {
            try {
                m26574.f40051.close();
            } catch (Exception unused) {
            }
            this.f31753 = null;
            m26574 = m26574(c8743);
        }
        m26575(m26574);
        return interfaceC11220.mo6721(m26574.f40051);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OutputStream m26582(String str, String str2, long j) {
        C12693 c12693;
        C13864 c13864 = null;
        if (this.f31752 == null) {
            c12693 = new C12693(str, false);
        } else {
            String str3 = this.f31753;
            if (str3 != null) {
                c12693 = new C12693(m26577(str, this.f31752, str3), !r0.equals(str));
            } else {
                C9449 c9449 = new C9449();
                StringBuilder sb = new StringBuilder();
                String str4 = this.f31752;
                sb.append(str4);
                sb.append("/");
                c9449.m24282(sb.toString());
                c9449.m24277("HEAD", (AbstractC2393) null);
                C13398 m26574 = m26574(c9449.m24274());
                C18621 c18621 = m26574.f40051;
                try {
                    if (c18621.m43173()) {
                        m26575(m26574);
                        String str5 = m26574.f40050;
                        if (str5 != null) {
                            str4 = str5;
                        }
                    } else {
                        int m43177 = c18621.m43177();
                        if (m43177 == 405 || m43177 == 501) {
                            try {
                                c18621.close();
                            } catch (Exception unused) {
                            }
                            C9449 c94492 = new C9449();
                            c94492.m24282(str4 + "/");
                            c94492.m24281();
                            C13398 m265742 = m26574(c94492.m24274());
                            c18621 = m265742.f40051;
                            try {
                                if (c18621.m43173()) {
                                    m26575(m265742);
                                    String str6 = m265742.f40050;
                                    if (str6 != null) {
                                        str4 = str6;
                                    }
                                }
                            } finally {
                                try {
                                    c18621.close();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                    String m26577 = m26577(str, this.f31752, str4);
                    c12693 = new C12693(m26577, (this.f31753 == null || !this.f31753.equals(str4) || m26577.equals(str)) ? false : true);
                } finally {
                    try {
                        c18621.close();
                    } catch (Exception unused3) {
                    }
                }
            }
        }
        try {
            c13864 = C13864.m33217(str2);
        } catch (IllegalArgumentException unused4) {
        }
        C0430 c0430 = new C0430(j, c13864);
        C15384 m1978 = c0430.m1978();
        long m40485 = this.f31751.m40485();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m1978.mo20329(m40485);
        C9449 c94493 = new C9449();
        c94493.m24282(c12693.f38212);
        c94493.m24277("PUT", c0430);
        c94493.m24278(new C12454().m30612());
        C8743 m24274 = c94493.m24274();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f31751.m40469(m24274).mo39222(new C22571(this, atomicReference, c0430, c12693, atomicBoolean));
        return new C20455(c0430.m1979(), c0430, atomicBoolean, atomicReference);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13398 m26574(C8743 c8743) {
        C3521 c3521;
        String str;
        String m43169;
        C11749 m28766;
        C8743 m24274;
        boolean z = false;
        if (this.f31752 == null || this.f31753 == null) {
            c3521 = new C3521(c8743, false);
        } else {
            String str2 = this.f31753;
            String c11749 = c8743.m22622().toString();
            String m26577 = m26577(c11749, this.f31752, str2);
            String m26580 = m26580(c8743.m22615("DESTINATION"), this.f31752, str2);
            String m265802 = m26580(c8743.m22615("If"), this.f31752, str2);
            if (c11749.equals(m26577)) {
                String m22615 = c8743.m22615("DESTINATION");
                if (m26580 == null ? m22615 == null : m26580.equals(m22615)) {
                    String m226152 = c8743.m22615("If");
                    if (m265802 == null ? m226152 == null : m265802.equals(m226152)) {
                        c3521 = new C3521(c8743, false);
                    }
                }
            }
            C9449 m22618 = c8743.m22618();
            if (!c11749.equals(m26577)) {
                m22618.m24282(m26577);
            }
            String m226153 = c8743.m22615("DESTINATION");
            if (!(m26580 == null ? m226153 == null : m26580.equals(m226153)) && m26580 != null) {
                m22618.m24283("DESTINATION", m26580);
            }
            String m226154 = c8743.m22615("If");
            if (!(m265802 == null ? m226154 == null : m265802.equals(m226154)) && m265802 != null) {
                m22618.m24283("If", m265802);
            }
            c3521 = new C3521(m22618.m24274(), true);
        }
        C8743 c87432 = c3521.f11200;
        String c117492 = c87432.m22622().toString();
        String str3 = null;
        if (this.f31753 == null || !m26578(c117492, this.f31753)) {
            String str4 = this.f31752;
            str = (str4 == null || !m26578(c117492, str4)) ? null : this.f31752;
        } else {
            str = this.f31753;
        }
        C18621 execute = this.f31751.m40469(c87432).execute();
        int i = 0;
        while (true) {
            if (execute.m43177() == 307) {
                z = true;
            }
            z = z | m26576(execute, 302) | m26576(execute, 303) | m26576(execute, 307);
            String c117493 = execute.m43168().m22622().toString();
            if (str == null || !m26578(c117493, str)) {
                if (this.f31753 == null || !m26578(c117493, this.f31753)) {
                    String str5 = this.f31752;
                    str = (str5 == null || !m26578(c117493, str5)) ? null : this.f31752;
                } else {
                    str = this.f31753;
                }
            }
            int m43177 = execute.m43177();
            if ((m43177 != 307 && m43177 != 308) || (m43169 = execute.m43169("Location")) == null || (m28766 = execute.m43168().m22622().m28766(m43169)) == null) {
                m24274 = null;
            } else {
                C8743 m43168 = execute.m43168();
                C9449 m226182 = m43168.m22618();
                m226182.m24280(m28766);
                if (str != null) {
                    String m26573 = m26573(str, m43168.m22622().toString(), m28766.toString());
                    String m265803 = m26580(m43168.m22615("DESTINATION"), str, m26573);
                    if (m265803 != null) {
                        m226182.m24283("DESTINATION", m265803);
                    }
                    String m265804 = m26580(m43168.m22615("If"), str, m26573);
                    if (m265804 != null) {
                        m226182.m24283("If", m265804);
                    }
                }
                m24274 = m226182.m24274();
            }
            if (m24274 == null) {
                boolean z2 = c3521.f11201;
                String c117494 = c8743.m22622().toString();
                String c117495 = execute.m43168().m22622().toString();
                String str6 = this.f31752;
                if (str6 != null && m26578(c117494, str6)) {
                    str3 = m26573(str6, c117494, c117495);
                }
                return new C13398(execute, z2, z, str3);
            }
            str = str == null ? null : m26573(str, c117493, m24274.m22622().toString());
            execute.close();
            i++;
            if (i > 20) {
                throw new ProtocolException(C19370.m44628(i, "Too many follow-up requests: "));
            }
            execute = this.f31751.m40469(m24274).execute();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26575(C13398 c13398) {
        String str;
        if (!c13398.f40051.m43173() || c13398.f40052 || (str = c13398.f40050) == null) {
            return;
        }
        this.f31753 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26573(String str, String str2, String str3) {
        if (!m26578(str2, str)) {
            return null;
        }
        String substring = str2.substring(str.length());
        if (str3.endsWith(substring)) {
            return m26579(str3.substring(0, str3.length() - substring.length()));
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m26577(String str, String str2, String str3) {
        if (str3 == null || str2.equals(str3) || !m26578(str, str2)) {
            return str;
        }
        StringBuilder m15339 = C5368.m15339(str3);
        m15339.append(str.substring(str2.length()));
        return m15339.toString();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m26580(String str, String str2, String str3) {
        return (str == null || str3 == null || str2.equals(str3)) ? str : str.replace(str2, str3);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m26579(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            str = C11749.m28763(str).toString();
        } catch (IllegalArgumentException unused) {
        }
        while (str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26585(String str, String str2) {
        try {
            str2 = C11749.m28763(str2).toString();
        } catch (IllegalArgumentException unused) {
        }
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        c9449.m24277("MOVE", (AbstractC2393) null);
        C12454 c12454 = new C12454();
        c12454.m30614("DESTINATION", str2);
        c12454.m30614("OVERWRITE", "T");
        c9449.m24278(c12454.m30612());
        C8743 m24274 = c9449.m24274();
        C13398 m26574 = m26574(m24274);
        if (m26574.f40053 && m26574.f40051.m43177() == 403) {
            try {
                m26574.f40051.close();
            } catch (Exception unused2) {
            }
            this.f31753 = null;
            m26574 = m26574(m24274);
        }
        m26575(m26574);
        C18275.m42607(m26574.f40051);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m26578(String str, String str2) {
        char charAt;
        if (str2 == null || !str.startsWith(str2)) {
            return false;
        }
        return str.length() == str2.length() || (charAt = str.charAt(str2.length())) == '/' || charAt == '?' || charAt == '#';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26576(C18621 c18621, int i) {
        do {
            c18621 = c18621.m43178();
            if (c18621 == null) {
                return false;
            }
        } while (c18621.m43177() != i);
        return true;
    }
}
