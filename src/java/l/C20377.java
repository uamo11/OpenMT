package l;

import java.util.regex.Pattern;

/* compiled from: 08T1 */
/* renamed from: l.᩶᩵ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20377 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f65774 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f65773 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f65776 = new C17714();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final StringBuilder f65775 = new StringBuilder();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02fb, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00a6, code lost:
    
        if (com.google.android.material.motion.MotionUtils.EASING_TYPE_FORMAT_END.equals(m46692(r4, r0)) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cc A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m46694(l.C17714 r15) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20377.m46694(l.ᩳ֨֫):java.util.ArrayList");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46693(C17714 c17714) {
        while (true) {
            for (boolean z = true; c17714.m41457() > 0 && z; z = false) {
                char c = (char) c17714.m41482()[c17714.m41485()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    c17714.m41478(1);
                } else {
                    int m41485 = c17714.m41485();
                    int m41483 = c17714.m41483();
                    byte[] m41482 = c17714.m41482();
                    int i = m41485 + 2;
                    if (i <= m41483) {
                        int i2 = m41485 + 1;
                        if (m41482[m41485] == 47 && m41482[i2] == 42) {
                            while (true) {
                                int i3 = i + 1;
                                if (i3 >= m41483) {
                                    break;
                                }
                                if (((char) m41482[i]) == '*' && ((char) m41482[i3]) == '/') {
                                    i += 2;
                                    m41483 = i;
                                } else {
                                    i = i3;
                                }
                            }
                            c17714.m41478(m41483 - c17714.m41485());
                        }
                    }
                }
            }
            return;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m46692(C17714 c17714, StringBuilder sb) {
        m46693(c17714);
        if (c17714.m41457() == 0) {
            return null;
        }
        String m46691 = m46691(c17714, sb);
        if (!m46691.isEmpty()) {
            return m46691;
        }
        return "" + ((char) c17714.m41456());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46691(C17714 c17714, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int m41485 = c17714.m41485();
        int m41483 = c17714.m41483();
        while (m41485 < m41483 && !z) {
            char c = (char) c17714.m41482()[m41485];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                m41485++;
                sb.append(c);
            }
        }
        c17714.m41478(m41485 - c17714.m41485());
        return sb.toString();
    }
}
