package l;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: 64F5 */
/* renamed from: l.֨֫֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0799 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f2925 = 0;

    static {
        C11816.m28900("\"\\");
        C11816.m28900("\t ,=");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m3017(C18621 c18621) {
        String m26137 = c18621.m43180().m26137("Content-Length");
        if (m26137 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(m26137);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m3018(C10338 c10338) {
        Set set = Collections.EMPTY_SET;
        int m26139 = c10338.m26139();
        for (int i = 0; i < m26139; i++) {
            if ("Vary".equalsIgnoreCase(c10338.m26136(i))) {
                String m26140 = c10338.m26140(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : m26140.split(",")) {
                    set.add(str.trim());
                }
            }
        }
        return set;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3019(C18621 c18621) {
        if (c18621.m43168().m22620().equals("HEAD")) {
            return false;
        }
        int m43177 = c18621.m43177();
        return (((m43177 >= 100 && m43177 < 200) || m43177 == 204 || m43177 == 304) && m3017(c18621) == -1 && !"chunked".equalsIgnoreCase(c18621.m43169("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3016(int i, String str, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3015(int i, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
