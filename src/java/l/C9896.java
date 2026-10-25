package l;

import com.alipay.sdk.m.y.q;
import java.math.BigDecimal;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* compiled from: D66F */
/* renamed from: l.ۢ᩺ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9896 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24989(char c) {
        switch (c) {
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return 6;
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case q.f /* 99 */:
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                return 15;
                            default:
                                return 0;
                        }
                }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24991(String str, C7073 c7073) {
        int m24989;
        int m249892;
        if (!str.startsWith("#") || !m24990(str.substring(1))) {
            return false;
        }
        char[] charArray = str.toCharArray();
        int length = str.length();
        if (length == 4) {
            c7073.f21767 = 31;
            m24989 = (m24989(charArray[1]) << 20) | (-16777216) | (m24989(charArray[1]) << 16) | (m24989(charArray[2]) << 12) | (m24989(charArray[2]) << 8) | (m24989(charArray[3]) << 4);
            m249892 = m24989(charArray[3]);
        } else if (length == 5) {
            c7073.f21767 = 30;
            m24989 = (m24989(charArray[1]) << 28) | (m24989(charArray[1]) << 24) | (m24989(charArray[2]) << 20) | (m24989(charArray[2]) << 16) | (m24989(charArray[3]) << 12) | (m24989(charArray[3]) << 8) | (m24989(charArray[4]) << 4);
            m249892 = m24989(charArray[4]);
        } else if (length == 7) {
            c7073.f21767 = 29;
            m24989 = (m24989(charArray[1]) << 20) | (-16777216) | (m24989(charArray[2]) << 16) | (m24989(charArray[3]) << 12) | (m24989(charArray[4]) << 8) | (m24989(charArray[5]) << 4);
            m249892 = m24989(charArray[6]);
        } else {
            if (length != 9) {
                return false;
            }
            c7073.f21767 = 28;
            m24989 = (m24989(charArray[1]) << 28) | (m24989(charArray[2]) << 24) | (m24989(charArray[3]) << 20) | (m24989(charArray[4]) << 16) | (m24989(charArray[5]) << 12) | (m24989(charArray[6]) << 8) | (m24989(charArray[7]) << 4);
            m249892 = m24989(charArray[8]);
        }
        c7073.f21766 = m24989 | m249892;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r6.length() == 0) goto L28;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m24998(java.lang.String r6, l.C7073 r7) {
        /*
            java.lang.String r0 = "-"
            int r1 = r6.length()
            r2 = 0
            if (r1 != 0) goto La
            goto L59
        La:
            char r1 = r6.charAt(r2)
            r3 = 45
            r4 = 1
            if (r1 != r3) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L23
            java.lang.String r6 = r6.substring(r4)
            int r3 = r6.length()
            if (r3 != 0) goto L23
            goto L59
        L23:
            char r3 = r6.charAt(r2)
            r5 = 48
            if (r3 < r5) goto L59
            r5 = 57
            if (r3 <= r5) goto L30
            goto L59
        L30:
            boolean r3 = m24994(r6)     // Catch: java.lang.NumberFormatException -> L59
            if (r3 == 0) goto L44
            r0 = 2
            java.lang.String r6 = r6.substring(r0)     // Catch: java.lang.NumberFormatException -> L59
            int r6 = m24993(r6)     // Catch: java.lang.NumberFormatException -> L59
            r0 = 17
            r7.f21767 = r0     // Catch: java.lang.NumberFormatException -> L59
            goto L53
        L44:
            if (r1 == 0) goto L4b
            java.lang.String r6 = r0.concat(r6)     // Catch: java.lang.NumberFormatException -> L59
            r1 = 0
        L4b:
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L59
            r0 = 16
            r7.f21767 = r0     // Catch: java.lang.NumberFormatException -> L59
        L53:
            if (r1 == 0) goto L56
            int r6 = -r6
        L56:
            r7.f21766 = r6
            return r4
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9896.m24998(java.lang.String, l.ۜ᩺ۡ):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m24995(java.lang.String r10, l.C7073 r11) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9896.m24995(java.lang.String, l.ۜ᩺ۡ):boolean");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m24993(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            i = (i << 4) | m24989(c);
        }
        return i;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m25000(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && !(i == 0 && charAt == '-')) {
                return false;
            }
        }
        if (str.length() < 10) {
            return true;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m24994(String str) {
        if (str.length() < 3 || str.length() > 10) {
            return false;
        }
        if (!str.startsWith("0x") && !str.startsWith("0X")) {
            return false;
        }
        for (int i = 2; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (((charAt < '0' || charAt > '9') && ((charAt < 'A' || charAt > 'F') && charAt < 'a')) || charAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24990(String str) {
        if (str.length() < 1 || str.length() > 8) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (((charAt < '0' || charAt > '9') && ((charAt < 'A' || charAt > 'F') && charAt < 'a')) || charAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m24999(String str) {
        if (str.length() < 1 || str.length() > 16) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (((charAt < '0' || charAt > '9') && ((charAt < 'A' || charAt > 'F') && charAt < 'a')) || charAt > 'f') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m24996(String str) {
        int i;
        String replace = str.replace(" ", "").replace("_", "");
        if (replace.startsWith("-")) {
            replace = replace.substring(1);
        }
        if (replace.length() != 0) {
            while (i < replace.length()) {
                char charAt = replace.charAt(i);
                i = (charAt >= '0' && charAt <= '9') ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m25002(String str) {
        String replace = str.replace(" ", "").replace("_", "");
        if (replace.length() == 0) {
            return false;
        }
        for (int i = 0; i < replace.length(); i++) {
            char charAt = replace.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'A' || charAt > 'F') && (charAt < 'a' || charAt > 'f'))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m24997(String str) {
        return (str.length() == 3 || str.length() == 4 || str.length() == 6 || str.length() == 8) && m24990(str);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m25001(String str) {
        int m24989;
        int m249892;
        char[] charArray = str.toCharArray();
        int length = str.length();
        if (length == 3) {
            m24989 = (m24989(charArray[0]) << 20) | (-16777216) | (m24989(charArray[0]) << 16) | (m24989(charArray[1]) << 12) | (m24989(charArray[1]) << 8) | (m24989(charArray[2]) << 4);
            m249892 = m24989(charArray[2]);
        } else if (length == 4) {
            m24989 = (m24989(charArray[0]) << 28) | (m24989(charArray[0]) << 24) | (m24989(charArray[1]) << 20) | (m24989(charArray[1]) << 16) | (m24989(charArray[2]) << 12) | (m24989(charArray[2]) << 8) | (m24989(charArray[3]) << 4);
            m249892 = m24989(charArray[3]);
        } else if (length == 6) {
            m24989 = (m24989(charArray[0]) << 20) | (-16777216) | (m24989(charArray[1]) << 16) | (m24989(charArray[2]) << 12) | (m24989(charArray[3]) << 8) | (m24989(charArray[4]) << 4);
            m249892 = m24989(charArray[5]);
        } else if (length == 8) {
            m24989 = (m24989(charArray[0]) << 28) | (m24989(charArray[1]) << 24) | (m24989(charArray[2]) << 20) | (m24989(charArray[3]) << 16) | (m24989(charArray[4]) << 12) | (m24989(charArray[5]) << 8) | (m24989(charArray[6]) << 4);
            m249892 = m24989(charArray[7]);
        } else {
            throw new RuntimeException("Hex color format error: " + ((Object) charArray));
        }
        return m24989 | m249892;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24992(C7073 c7073) {
        String str = c7073.f21765;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            return new BigDecimal(str).precision() <= 7;
        } catch (Exception unused) {
            return false;
        }
    }
}
