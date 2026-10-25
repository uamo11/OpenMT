package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: X5Z7 */
/* renamed from: l.ܳۙۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC14292 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34069(String str) {
        return m34070(C11926.m29091(str)).m29099();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11926 m34070(C11926 c11926) {
        switch (c11926.m29102()) {
            case 9:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < c11926.m29100(); i++) {
                    sb.append('[');
                }
                sb.append(m34070(c11926.m29101()).m29099());
                return C11926.m29091(sb.toString());
            case 10:
                String m29103 = c11926.m29103();
                return m29103 != null ? C11926.m29095(m29103) : c11926;
            case 11:
                return C11926.m29096(m34072(c11926.m29099()));
            default:
                return c11926;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m34073(String str) {
        if (str == null) {
            return null;
        }
        return m34070(C11926.m29095(str)).m29103();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m34071(String[] strArr) {
        String[] strArr2 = null;
        for (int i = 0; i < strArr.length; i++) {
            String m34073 = m34073(strArr[i]);
            if (m34073 != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i] = m34073;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m34072(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        for (C11926 c11926 : C11926.m29092(str)) {
            sb.append(m34070(c11926).m29099());
        }
        C11926 m29093 = C11926.m29093(str);
        if (m29093 == C11926.f35644) {
            sb.append(")V");
        } else {
            sb.append(')');
            sb.append(m34070(m29093).m29099());
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m34068(Object obj) {
        String m2586;
        if (obj instanceof C11926) {
            return m34070((C11926) obj);
        }
        if (obj instanceof C0636) {
            C0636 c0636 = (C0636) obj;
            r1 = c0636.m2589() <= 4 ? 1 : 0;
            int m2589 = c0636.m2589();
            String m34073 = m34073(c0636.m2587());
            if (r1 != 0) {
                m2586 = c0636.m2586();
            } else {
                m2586 = c0636.m2586();
            }
            String str = m2586;
            String m2585 = c0636.m2585();
            return new C0636(m2589, m34073, str, r1 != 0 ? m34069(m2585) : m34072(m2585), c0636.m2588());
        }
        if (!(obj instanceof C21099)) {
            return obj;
        }
        C21099 c21099 = (C21099) obj;
        String m48009 = c21099.m48009();
        String m48010 = c21099.m48010();
        C0636 m48006 = c21099.m48006();
        int m48007 = c21099.m48007();
        Object[] objArr = new Object[m48007];
        Object[] objArr2 = new Object[m48007];
        while (r1 < m48007) {
            Object m48005 = c21099.m48005(r1);
            objArr[r1] = m48005;
            objArr2[r1] = m34068(m48005);
            r1++;
        }
        return new C21099(m48009, m34069(m48010), (C0636) m34068(m48006), objArr2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m34074(String str, boolean z) {
        if (str == null) {
            return null;
        }
        C6532 c6532 = new C6532(str);
        C9355 c9355 = new C9355();
        C23465 c23465 = new C23465(c9355, this);
        if (z) {
            c6532.m18040(c23465);
        } else {
            c6532.m18039(c23465);
        }
        return c9355.toString();
    }
}
