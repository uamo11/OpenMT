package l;

import com.alipay.sdk.m.p.a;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

/* compiled from: FBIL */
/* renamed from: l.۬֡ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12757 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f38339 = {',', ';'};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f38340 = new HashMap();

    static {
        new C0056();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31063(String str) {
        return EnumC2880.extended.m8815(str) != -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31062(String str) {
        return EnumC2880.base.m8815(str) != -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31058(String str, int[] iArr) {
        String str2 = (String) f38340.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int m8815 = EnumC2880.extended.m8815(str);
        if (m8815 == -1) {
            return 0;
        }
        iArr[0] = m8815;
        return 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31059(Appendable appendable, String str, C0056 c0056, boolean z, boolean z2, boolean z3, boolean z4) {
        EnumC2880 m981 = c0056.m981();
        CharsetEncoder m975 = c0056.m975();
        EnumC4291 enumC4291 = c0056.f939;
        int length = str.length();
        int i = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            boolean z8 = true;
            if (z2) {
                if (C20519.m47003(codePointAt)) {
                    if ((!z3 || z6) && !z7) {
                        if (z4) {
                            z5 = true;
                        } else {
                            appendable.append(' ');
                            z7 = true;
                        }
                    }
                    i += Character.charCount(codePointAt);
                } else {
                    if (z5) {
                        appendable.append(' ');
                        z5 = false;
                    }
                    z6 = true;
                    z7 = false;
                }
            }
            if (codePointAt < 65536) {
                char c = (char) codePointAt;
                if (c == '\t' || c == '\n' || c == '\r') {
                    appendable.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c == 160) {
                                if (m981 != EnumC2880.xhtml) {
                                    appendable.append("&nbsp;");
                                } else {
                                    appendable.append("&#xa0;");
                                }
                            } else {
                                if (c >= ' ') {
                                    int ordinal = enumC4291.ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal != 1) {
                                            z8 = m975.canEncode(c);
                                        }
                                    } else if (c >= 128) {
                                        z8 = false;
                                    }
                                    if (z8) {
                                        appendable.append(c);
                                    }
                                }
                                m31060(appendable, m981, codePointAt);
                            }
                        } else if (!z) {
                            appendable.append("&gt;");
                        } else {
                            appendable.append(c);
                        }
                    } else if (!z || m981 == EnumC2880.xhtml || c0056.m984() == EnumC19108.xml) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c);
                }
            } else {
                String str2 = new String(Character.toChars(codePointAt));
                if (m975.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m31060(appendable, m981, codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31060(Appendable appendable, EnumC2880 enumC2880, int i) {
        String m8816 = enumC2880.m8816(i);
        if (!"".equals(m8816)) {
            appendable.append('&').append(m8816).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31061(EnumC2880 enumC2880, String str, int i) {
        int i2;
        String[] strArr;
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        enumC2880.f9182 = new String[i];
        enumC2880.f9184 = new int[i];
        enumC2880.f9183 = new int[i];
        enumC2880.f9181 = new String[i];
        C17842 c17842 = new C17842(new StringReader(str), str.length());
        int i3 = 0;
        while (!c17842.m41785()) {
            try {
                String m41779 = c17842.m41779(a.h);
                c17842.m41782();
                int parseInt = Integer.parseInt(c17842.m41781(f38339), 36);
                char m41799 = c17842.m41799();
                c17842.m41782();
                if (m41799 == ',') {
                    i2 = Integer.parseInt(c17842.m41779(';'), 36);
                    c17842.m41782();
                } else {
                    i2 = -1;
                }
                int parseInt2 = Integer.parseInt(c17842.m41779('&'), 36);
                c17842.m41782();
                strArr = enumC2880.f9182;
                strArr[i3] = m41779;
                iArr = enumC2880.f9184;
                iArr[i3] = parseInt;
                iArr2 = enumC2880.f9183;
                iArr2[parseInt2] = parseInt;
                strArr2 = enumC2880.f9181;
                strArr2[parseInt2] = m41779;
                if (i2 != -1) {
                    f38340.put(m41779, new String(new int[]{parseInt, i2}, 0, 2));
                }
                i3++;
            } finally {
                c17842.m41793();
            }
        }
        if (i3 == i) {
        } else {
            throw new C14167("Unexpected count of entities loaded");
        }
    }
}
