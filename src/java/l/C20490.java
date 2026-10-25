package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;

/* compiled from: P78M */
/* renamed from: l.᩶᩺᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20490 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f66055;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f66056;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21901 f66057;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f66058;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f66059;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4967 f66060 = new C4967(0, 0, 0, 0, new ArrayList(), new ArrayList());

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f66061;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f66062;

    public C20490(int i, int i2, String str, String str2, String str3, String str4) {
        this.f66061 = str;
        this.f66058 = str2;
        this.f66062 = str3;
        this.f66055 = str4;
        this.f66056 = i;
        this.f66059 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20490 m46947(int i, String str) {
        String trim = C3556.m10821(str).trim().substring(6).trim();
        int indexOf = trim.indexOf(61);
        if (indexOf >= 0) {
            trim = trim.substring(0, indexOf).trim();
        }
        int m46945 = m46945(trim, ':');
        if (m46945 < 0) {
            return m46948(i, "field", trim);
        }
        C22606 m46949 = m46949(m46945, trim);
        return new C20490(i, i, "field", m46949.f73053, C23202.m51498(new StringBuilder(), m46949.f73053, ":", m46946(trim.substring(m46945 + 1).trim())), trim.substring(0, m46949.f73054).trim());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20490 m46950(int i, String str) {
        String trim = C3556.m10821(str).trim().substring(7).trim();
        int m46945 = m46945(trim, '(');
        if (m46945 < 0) {
            return m46948(i, e.s, trim);
        }
        C22606 m46949 = m46949(m46945, trim);
        return new C20490(i, i, e.s, m46949.f73053, C9045.m23341(new StringBuilder(), m46949.f73053, m46946(trim.substring(m46945).trim())), trim.substring(0, m46949.f73054).trim());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46945(String str, char c) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '`') {
                z = !z;
            } else if (!z && charAt == c) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46946(String str) {
        StringBuilder sb = null;
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (z || !Character.isWhitespace(charAt)) {
                if (sb != null) {
                    sb.append(charAt);
                }
                if (charAt == 'L') {
                    z = true;
                } else if (z && charAt == ';') {
                    z = false;
                }
            } else if (sb == null) {
                sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
            }
        }
        return sb == null ? str : sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20490 m46948(int i, String str, String str2) {
        int indexOf = str2.indexOf(str.equals("field") ? 58 : 40);
        return new C20490(i, i, str, indexOf < 0 ? str2 : str2.substring(0, indexOf), str2, "");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22606 m46949(int i, String str) {
        int lastIndexOf;
        while (i > 0 && Character.isWhitespace(str.charAt(i - 1))) {
            i--;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (str.charAt(i2) == '`' && (lastIndexOf = str.lastIndexOf(96, i - 2)) >= 0) {
                return new C22606(str.substring(lastIndexOf + 1, i2), lastIndexOf);
            }
        }
        int i3 = i;
        while (i3 > 0 && !Character.isWhitespace(str.charAt(i3 - 1))) {
            i3--;
        }
        return new C22606(str.substring(i3, i), i3);
    }
}
