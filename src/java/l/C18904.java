package l;

import bin.mt.plus.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: D6KJ */
/* renamed from: l.ᩴܿܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18904 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f59572;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f59573;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f59574;

    public C18904(String str, String str2, String str3, String str4) {
        this.f59574 = str;
        String m43633 = m43633(str2);
        this.f59573 = m43633;
        String m43634 = m43634(str3);
        if (!m43633.startsWith(m43634)) {
            throw new IllegalArgumentException("HTML document is outside the root boundary");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4087(m43634, str4));
        int length = m43634.length();
        while (true) {
            int indexOf = this.f59573.indexOf(47, length);
            if (indexOf >= 0) {
                int i = indexOf + 1;
                arrayList.add(new C4087(this.f59573.substring(0, i), this.f59573.substring(length, indexOf)));
                length = i;
            } else {
                this.f59572 = C20195.unmodifiableList(arrayList);
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18904 m43631(C16560 c16560, InterfaceC17889 interfaceC17889) {
        int indexOf;
        AbstractC16891 m39044 = c16560.m39044();
        AbstractC13921 mo6020 = m39044.mo6020();
        if (mo6020 instanceof C2499) {
            return m43632(interfaceC17889.getPath());
        }
        String str = "/";
        if (!(mo6020 instanceof AbstractC3163)) {
            String m43627 = m43627(mo6020);
            if (m43627 != null) {
                return new C18904(m43628(m39044, m43629(c16560.m39016()), new ArrayList()), interfaceC17889.getPath(), "/", C16999.m39866(m43627, new String[0]).getName());
            }
            throw new IllegalArgumentException("Unsupported HTML preview source");
        }
        AbstractC3163 abstractC3163 = (AbstractC3163) mo6020;
        String path = interfaceC17889.getPath();
        String name = abstractC3163.m9690().getName();
        if ((abstractC3163 instanceof C12771) && (indexOf = path.indexOf(47, 1)) > 1) {
            str = path.substring(0, indexOf + 1);
            StringBuilder m19190 = C7166.m19190(name, " / ");
            m19190.append(path.substring(1, indexOf));
            name = m19190.toString();
        }
        return new C18904(m43626(abstractC3163.m9690()), path, str, name);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18904 m43632(String str) {
        String str2;
        String str3;
        String m39885 = C16999.m39885(m43633(str));
        String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1208bf);
        if (C16999.m39887(m39885)) {
            str3 = C16293.f50120.mo23554();
            str2 = C4925.m14327(R.string.MT_Protector_res_0x7f1209e3);
        } else {
            AbstractC15440 m39866 = C16999.m39866(m39885, new String[0]);
            if (m39866.mo23126()) {
                C4027 m23116 = m39866.mo23124().m23116();
                str2 = m23116.m12120();
                m14327 = m23116.f12781;
                if (m14327 == null) {
                    str3 = str2;
                }
                String str4 = str2;
                str2 = m14327;
                str3 = str4;
            } else {
                C4216 m45449 = C19739.m45449(m39885);
                if (m45449 != null) {
                    File file = m45449.f13687;
                    String path = file.getPath();
                    str2 = m45449.f13686;
                    if (str2 == null) {
                        str2 = file.getName();
                    }
                    str3 = path;
                } else {
                    str2 = "/";
                    String str42 = str2;
                    str2 = m14327;
                    str3 = str42;
                }
            }
        }
        return new C18904("local", m39885, str3, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43626(AbstractC3577 abstractC3577) {
        return "network:" + abstractC3577.f11356 + ":" + C14460.m34530(abstractC3577.getClass().getName() + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR + abstractC3577.mo6365());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43628(AbstractC16891 abstractC16891, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.contains(Integer.valueOf(abstractC16891.m39746()))) {
            return null;
        }
        arrayList2.add(Integer.valueOf(abstractC16891.m39746()));
        AbstractC13921 mo6020 = abstractC16891.mo6020();
        if (mo6020 instanceof C2499) {
            return "local";
        }
        if (mo6020 instanceof AbstractC3163) {
            return m43626(((AbstractC3163) mo6020).m9690());
        }
        String m43627 = m43627(mo6020);
        if (m43627 == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC16891 abstractC168912 = (AbstractC16891) it.next();
            if (abstractC168912.m39746() == abstractC16891.m39732()) {
                for (C5977 c5977 : abstractC168912.m39739()) {
                    if (C16999.m39878(m43627, c5977.m16768().mo23554())) {
                        String m43628 = m43628(abstractC168912, arrayList, arrayList2);
                        if (m43628 == null) {
                            return null;
                        }
                        return m43625(mo6020.mo7654(), m43628, c5977.m16770());
                    }
                }
            }
        }
        if (C16999.m39872(m43627, C16293.f50111.mo23554()) || C16999.m39872(m43627, C16293.f50116.mo23554()) || C16999.m39872(m43627, C16293.f50110.mo23554())) {
            return null;
        }
        return m43625(mo6020.mo7654(), "local", C16999.m39885(m43627));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43625(String str, String str2, String str3) {
        if (!str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        StringBuilder m19190 = C7166.m19190(str, ":");
        StringBuilder m191902 = C7166.m19190(str2, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        m191902.append(m43633(str3));
        m19190.append(C14460.m34530(m191902.toString()));
        return m19190.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43627(AbstractC13921 abstractC13921) {
        if (abstractC13921 instanceof C19247) {
            return ((C19247) abstractC13921).m44391();
        }
        if (abstractC13921 instanceof C17626) {
            return ((C17626) abstractC13921).m41202();
        }
        if (abstractC13921 instanceof C2346) {
            return ((C2346) abstractC13921).m7650();
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m43629(C9340 c9340) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c9340.m24091().m39044());
        arrayList.add(c9340.m24072().m39044());
        c9340.m24074();
        try {
            arrayList.addAll(c9340.m24094());
            return arrayList;
        } finally {
            c9340.m24083();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m43630(C16560 c16560) {
        AbstractC13921 m39063 = c16560.m39063();
        String m43627 = m43627(m39063);
        if (m43627 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m43627);
        if (m39063 instanceof C17626) {
            arrayList.add(((C17626) m39063).m41206());
        }
        if (m39063 instanceof C2346) {
            Iterator it = ((C2346) m39063).m7649().iterator();
            while (it.hasNext()) {
                arrayList.add(((C8696) it.next()).m22478().mo23554());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = m43629(c16560.m39016()).iterator();
        while (it2.hasNext()) {
            AbstractC16891 abstractC16891 = (AbstractC16891) it2.next();
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    long m39733 = abstractC16891.m39733((String) it3.next());
                    if (m39733 != 0) {
                        arrayList2.add(Long.valueOf(m39733));
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m43634(String str) {
        String m43633 = m43633(str);
        return m43633.endsWith("/") ? m43633 : m43633.concat("/");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m43633(String str) {
        if (!str.startsWith("/")) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        String m18702 = C6909.m18702(str);
        if (m18702 == null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        return "/".concat(m18702);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m43635(String str) {
        String str2;
        int i = 0;
        while (true) {
            List list = this.f59572;
            if (i >= list.size()) {
                return -1;
            }
            str2 = ((C4087) list.get(i)).f13016;
            if (str2.equals(str)) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m43637(String str) {
        if (m43635(str) < 0) {
            throw new IllegalArgumentException("Invalid HTML preview root");
        }
        return this.f59573.substring(str.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m43636() {
        String str;
        str = ((C4087) C7166.m19188(1, this.f59572)).f13016;
        return str;
    }
}
