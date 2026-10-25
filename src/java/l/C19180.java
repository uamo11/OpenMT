package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;

/* compiled from: U6NV */
/* renamed from: l.᩵ۖܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19180 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44258(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44257(String str) {
        int i;
        int m44261;
        int m442612;
        int m442613;
        int indexOf = str.indexOf("//");
        while (indexOf >= 0) {
            int i2 = indexOf - 1;
            while (i2 >= 0) {
                char charAt = str.charAt(i2);
                if (charAt != ' ' && charAt != '\t') {
                    break;
                } else {
                    i2--;
                }
            }
            if (i2 < 0 || m44258(str.charAt(i2))) {
                int m442614 = m44261(indexOf + 2, str);
                if (m44259(m442614, str, "require") && (m44261 = m44261((i = m442614 + 7), str)) != i && m44259(m44261, str, "mt") && (m442612 = m44261(m44261 + 2, str)) != str.length() && str.charAt(m442612) == '>') {
                    int i3 = m442612 + 1;
                    boolean z = i3 < str.length() && str.charAt(i3) == '=';
                    if (z) {
                        i3 = m442612 + 2;
                    }
                    int m442615 = m44261(i3, str);
                    int m44265 = m44265(m442615, str);
                    if (m44265 >= 0 && ((m442613 = m44261(m44265, str)) >= str.length() || m44258(str.charAt(m442613)))) {
                        String substring = str.substring(m442615, m44265);
                        boolean z2 = substring.indexOf(46) < 0;
                        int m44262 = z2 ? 26101061 : m44262("2.26.10");
                        int parseInt = z2 ? Integer.parseInt(substring) : m44262(substring);
                        if (z) {
                            if (m44262 >= parseInt) {
                                return;
                            }
                        } else if (m44262 > parseInt) {
                            return;
                        }
                        throw new C9134(C4925.m14327(R.string.MT_Protector_res_0x7f1204b6) + "\n(Require " + (z2 ? "VersionCode" : "VersionName") + " " + (z ? ">=" : ">") + " " + substring + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                }
            }
            indexOf = str.indexOf("//", indexOf + 2);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m44265(int i, String str) {
        int i2;
        int m44256;
        int m442562;
        int i3;
        int m442563;
        int m442564;
        int m442565 = m44256(i, str);
        int i4 = m442565 - i;
        if (i4 == 8) {
            return m442565;
        }
        if (i4 != 1 || m442565 == str.length() || str.charAt(m442565) != '.' || (m442562 = (m44256 = m44256((i2 = m442565 + 1), str)) - i2) < 1 || m442562 > 3 || m44256 == str.length() || str.charAt(m44256) != '.' || (m442564 = (m442563 = m44256((i3 = m44256 + 1), str)) - i3) < 1 || m442564 > 3) {
            return -1;
        }
        return m442563;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44256(int i, String str) {
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            i++;
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44261(int i, String str) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44259(int i, String str, String str2) {
        if (str2.length() + i <= str.length()) {
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char charAt = str.charAt(i + i2);
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                }
                if (charAt == str2.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m44264(int i, String str) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || (charAt >= '\t' && charAt <= '\r'))) {
            i++;
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m44263(String str, String str2) {
        int indexOf = str2.indexOf(35);
        loop0: while (indexOf >= 0) {
            int i = indexOf - 1;
            while (i >= 0) {
                char charAt = str2.charAt(i);
                if (!m44258(charAt)) {
                    if (charAt != ' ' && charAt != '\t' && charAt != 11 && charAt != '\f') {
                        break;
                    }
                    i--;
                } else {
                    break loop0;
                }
            }
            if (i >= 0) {
                indexOf = str2.indexOf(35, indexOf + 1);
            } else {
                return new C0666(str, new C20177()).m2713(str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean m44260(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 46
            int r0 = r6.indexOf(r0)
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L13
            r3 = 26101061(0x18e4545, float:5.226196E-38)
            goto L19
        L13:
            java.lang.String r3 = "2.26.10"
            int r3 = m44262(r3)
        L19:
            if (r0 == 0) goto L20
            int r6 = java.lang.Integer.parseInt(r6)
            goto L24
        L20:
            int r6 = m44262(r6)
        L24:
            r5.getClass()
            int r0 = r5.hashCode()
            r4 = -1
            switch(r0) {
                case 60: goto L67;
                case 62: goto L5c;
                case 1084: goto L51;
                case 1921: goto L46;
                case 1952: goto L3b;
                case 1983: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L71
        L30:
            java.lang.String r0 = ">="
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L39
            goto L71
        L39:
            r4 = 5
            goto L71
        L3b:
            java.lang.String r0 = "=="
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L44
            goto L71
        L44:
            r4 = 4
            goto L71
        L46:
            java.lang.String r0 = "<="
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L4f
            goto L71
        L4f:
            r4 = 3
            goto L71
        L51:
            java.lang.String r0 = "!="
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5a
            goto L71
        L5a:
            r4 = 2
            goto L71
        L5c:
            java.lang.String r0 = ">"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L65
            goto L71
        L65:
            r4 = 1
            goto L71
        L67:
            java.lang.String r0 = "<"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L70
            goto L71
        L70:
            r4 = 0
        L71:
            switch(r4) {
                case 0: goto L8f;
                case 1: goto L8c;
                case 2: goto L89;
                case 3: goto L86;
                case 4: goto L83;
                case 5: goto L80;
                default: goto L74;
            }
        L74:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Unknown operator: "
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
        L80:
            if (r3 < r6) goto L92
            goto L91
        L83:
            if (r3 != r6) goto L92
            goto L91
        L86:
            if (r3 > r6) goto L92
            goto L91
        L89:
            if (r3 == r6) goto L92
            goto L91
        L8c:
            if (r3 <= r6) goto L92
            goto L91
        L8f:
            if (r3 >= r6) goto L92
        L91:
            return r2
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19180.m44260(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44262(String str) {
        int indexOf = str.indexOf(46);
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(46, i);
        int indexOf3 = str.indexOf(45);
        if (indexOf3 < 0) {
            indexOf3 = str.length();
        }
        return Integer.parseInt(str.substring(indexOf2 + 1, indexOf3)) + (Integer.parseInt(str.substring(i, indexOf2)) * 1000) + (Integer.parseInt(str.substring(0, indexOf)) * BasicLabelFormatter.MILLION);
    }
}
