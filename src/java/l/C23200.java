package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.simpleframework.xml.strategy.Name;

/* compiled from: UB7S */
/* renamed from: l.᩺᩵ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23200 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC0622 f74578;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f74579 = false;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC11912 f74580;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51490(C10501 c10501, int i, ArrayList arrayList, int i2) {
        C6267 c6267 = (C6267) c10501.f31498.get(i);
        AbstractC19261 abstractC19261 = (AbstractC19261) arrayList.get(i2);
        if (!m51489(c6267, abstractC19261)) {
            return false;
        }
        EnumC19674 enumC19674 = c6267.f19407;
        if (enumC19674 == EnumC19674.DESCENDANT) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (m51490(c10501, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC19674 == EnumC19674.CHILD) {
            return m51490(c10501, i - 1, arrayList, i2 - 1);
        }
        int m51485 = m51485(arrayList, i2, abstractC19261);
        if (m51485 <= 0) {
            return false;
        }
        return m51491(c10501, i - 1, arrayList, i2, (AbstractC19261) abstractC19261.f16091.getChildren().get(m51485 - 1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51491(C10501 c10501, int i, ArrayList arrayList, int i2, AbstractC19261 abstractC19261) {
        C6267 c6267 = (C6267) c10501.f31498.get(i);
        if (!m51489(c6267, abstractC19261)) {
            return false;
        }
        EnumC19674 enumC19674 = c6267.f19407;
        if (enumC19674 == EnumC19674.DESCENDANT) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!m51490(c10501, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (enumC19674 == EnumC19674.CHILD) {
            return m51490(c10501, i - 1, arrayList, i2);
        }
        int m51485 = m51485(arrayList, i2, abstractC19261);
        if (m51485 <= 0) {
            return false;
        }
        return m51491(c10501, i - 1, arrayList, i2, (AbstractC19261) abstractC19261.f16091.getChildren().get(m51485 - 1));
    }

    public C23200(EnumC0622 enumC0622, EnumC11912 enumC11912) {
        this.f74578 = enumC0622;
        this.f74580 = enumC11912;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12617 m51495(String str) {
        C18968 c18968 = new C18968(str);
        c18968.m45643();
        return m51493(c18968);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51488(String str, EnumC0622 enumC0622) {
        C18968 c18968 = new C18968(str);
        c18968.m45643();
        Iterator it = m51486(c18968).iterator();
        while (it.hasNext()) {
            EnumC0622 enumC06222 = (EnumC0622) it.next();
            if (enumC06222 == EnumC0622.all || enumC06222 == enumC0622) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m51486(C18968 c18968) {
        ArrayList arrayList = new ArrayList();
        while (!c18968.m45644()) {
            String str = c18968.f64100;
            String str2 = null;
            if (!c18968.m45644()) {
                int i = c18968.f64103;
                char charAt = str.charAt(i);
                if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                    int m45637 = c18968.m45637();
                    while (true) {
                        if ((m45637 < 65 || m45637 > 90) && (m45637 < 97 || m45637 > 122)) {
                            break;
                        }
                        m45637 = c18968.m45637();
                    }
                    str2 = str.substring(i, c18968.f64103);
                } else {
                    c18968.f64103 = i;
                }
            }
            if (str2 == null) {
                break;
            }
            try {
                arrayList.add(EnumC0622.valueOf(str2));
            } catch (IllegalArgumentException unused) {
            }
            if (!c18968.m45649()) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51487(C12617 c12617, C18968 c18968) {
        int intValue;
        String m43802 = c18968.m43802();
        c18968.m45643();
        if (m43802 == null) {
            throw new C9090("Invalid '@' rule");
        }
        int i = 0;
        if (!this.f74579 && m43802.equals("media")) {
            ArrayList m51486 = m51486(c18968);
            if (!c18968.m45640('{')) {
                throw new C9090("Invalid @media rule: missing rule set");
            }
            c18968.m45643();
            Iterator it = m51486.iterator();
            while (it.hasNext()) {
                EnumC0622 enumC0622 = (EnumC0622) it.next();
                if (enumC0622 == EnumC0622.all || enumC0622 == this.f74578) {
                    this.f74579 = true;
                    c12617.m30878(m51493(c18968));
                    this.f74579 = false;
                    break;
                }
            }
            m51493(c18968);
            if (!c18968.m45644() && !c18968.m45640('}')) {
                throw new C9090("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f74579 || !m43802.equals("import")) {
            while (!c18968.m45644() && ((intValue = c18968.m45646().intValue()) != 59 || i != 0)) {
                if (intValue != 123) {
                    if (intValue == 125 && i > 0 && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String m43800 = c18968.m43800();
            if (m43800 == null) {
                m43800 = c18968.m43801();
            }
            if (m43800 == null) {
                throw new C9090("Invalid @import rule: expected string or url()");
            }
            c18968.m45643();
            m51486(c18968);
            if (!c18968.m45644() && !c18968.m45640(';')) {
                throw new C9090("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        c18968.m45643();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C12617 m51493(C18968 c18968) {
        C12617 c12617 = new C12617();
        while (!c18968.m45644()) {
            try {
                if (!c18968.m45641("<!--") && !c18968.m45641("-->")) {
                    if (c18968.m45640('@')) {
                        m51487(c12617, c18968);
                    } else if (!m51494(c12617, c18968)) {
                        break;
                    }
                }
            } catch (C9090 e) {
                e.getMessage();
                return c12617;
            }
        }
        return c12617;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m51494(C12617 c12617, C18968 c18968) {
        ArrayList m43798;
        m43798 = c18968.m43798();
        if (m43798 == null || m43798.isEmpty()) {
            return false;
        }
        if (!c18968.m45640('{')) {
            throw new C9090("Malformed rule block: expected '{'");
        }
        c18968.m45643();
        C20672 c20672 = new C20672();
        do {
            String m43802 = c18968.m43802();
            c18968.m45643();
            if (!c18968.m45640(':')) {
                throw new C9090("Expected ':'");
            }
            c18968.m45643();
            String str = c18968.f64100;
            String str2 = null;
            if (!c18968.m45644()) {
                int i = c18968.f64103;
                int charAt = str.charAt(i);
                int i2 = i;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!C19842.m45635(charAt)) {
                        i2 = c18968.f64103 + 1;
                    }
                    charAt = c18968.m45637();
                }
                if (c18968.f64103 > i) {
                    str2 = str.substring(i, i2);
                } else {
                    c18968.f64103 = i;
                }
            }
            if (str2 == null) {
                throw new C9090("Expected property value");
            }
            c18968.m45643();
            if (c18968.m45640('!')) {
                c18968.m45643();
                if (!c18968.m45641("important")) {
                    throw new C9090("Malformed rule set: found unexpected '!'");
                }
                c18968.m45643();
            }
            c18968.m45640(';');
            C2908.m8868(c20672, m43802, str2);
            c18968.m45643();
            if (c18968.m45644()) {
                break;
            }
        } while (!c18968.m45640('}'));
        c18968.m45643();
        Iterator it = m43798.iterator();
        while (it.hasNext()) {
            C10501 c10501 = (C10501) it.next();
            C13322 c13322 = new C13322();
            c13322.f39872 = c10501;
            c13322.f39874 = c20672;
            c13322.f39873 = this.f74580;
            c12617.m30879(c13322);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51492(C10501 c10501, AbstractC19261 abstractC19261) {
        ArrayList arrayList = new ArrayList();
        Object obj = abstractC19261.f16091;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((C5149) obj).f16091;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = c10501.f31498;
        if ((arrayList2 == null ? 0 : arrayList2.size()) != 1) {
            ArrayList arrayList3 = c10501.f31498;
            return m51491(c10501, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, abstractC19261);
        }
        return m51489((C6267) c10501.f31498.get(0), abstractC19261);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51485(ArrayList arrayList, int i, AbstractC19261 abstractC19261) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        InterfaceC3738 interfaceC3738 = abstractC19261.f16091;
        if (obj != interfaceC3738) {
            return -1;
        }
        Iterator it = interfaceC3738.getChildren().iterator();
        while (it.hasNext()) {
            if (((C5149) it.next()) == abstractC19261) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51489(C6267 c6267, AbstractC19261 abstractC19261) {
        ArrayList arrayList;
        String str = c6267.f19409;
        if (str != null && !str.equals(abstractC19261.mo1457().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = c6267.f19406;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C16144 c16144 = (C16144) it.next();
                String str2 = c16144.f49738;
                String str3 = c16144.f49740;
                if (str2.equals("id")) {
                    if (!str3.equals(abstractC19261.f60633)) {
                        return false;
                    }
                } else if (!str2.equals(Name.LABEL) || (arrayList = abstractC19261.f60634) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = c6267.f19408;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((InterfaceC5562) it2.next()).mo4662(abstractC19261)) {
                return false;
            }
        }
        return true;
    }
}
