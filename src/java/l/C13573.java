package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: W3YK */
/* renamed from: l.ܰۘܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13573 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32615(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m32621(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Hex input must contain an even number of digits");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int m32615 = m32615(str.charAt(i2));
            int m326152 = m32615(str.charAt(i2 + 1));
            if (m32615 < 0 || m326152 < 0) {
                throw new IllegalArgumentException("Hex input contains a non-hexadecimal digit");
            }
            bArr[i] = (byte) (m326152 | (m32615 << 4));
        }
        return bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32618(byte[] bArr) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr[i2] = charArray[(b & 255) >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m32625(String str) {
        if (str == null) {
            return "null";
        }
        int length = str.length();
        if (length == 0) {
            return "\"\"";
        }
        int i = 0;
        char c = '/';
        while (i < length) {
            char charAt = str.charAt(i);
            if (c == '/') {
                if (!Character.isJavaIdentifierStart(charAt) && charAt != '-') {
                    return C4860.m14172("\"", str, "\"");
                }
                i++;
                c = charAt;
            } else {
                if (charAt != '/' && !Character.isJavaIdentifierPart(charAt) && charAt != '-') {
                    return C4860.m14172("\"", str, "\"");
                }
                i++;
                c = charAt;
            }
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m32622(int i) {
        return new int[(i + 31) >> 5];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d8, code lost:
    
        if (l.C11250.m27830(r10, r9) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e5, code lost:
    
        r10 = r10 - 2;
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
    
        if (l.C11250.m27834(r10, r9) != false) goto L81;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m32619(byte[] r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13573.m32619(byte[], boolean):java.lang.String");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m32626(int i, int[] iArr) {
        return ((1 << (i & 31)) & iArr[i >> 5]) != 0;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m32627(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32620(int i, int[] iArr) {
        int i2 = i >> 5;
        iArr[i2] = (~(1 << (i & 31))) & iArr[i2];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32617(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int m32616 = i - m32616(i, bArr);
        if (m32616 > 0) {
            i -= m32616 % 2;
        }
        if (i - m32616(i, bArr) >= 2) {
            int i4 = i - 2;
            if (z) {
                i2 = bArr[i4] & 255;
                i3 = (bArr[i - 1] & 255) << 8;
            } else {
                i2 = (bArr[i4] & 255) << 8;
                i3 = bArr[i - 1] & 255;
            }
            int i5 = i3 | i2;
            if (i5 >= 55296 && i5 <= 56319) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32616(int i, byte[] bArr) {
        int i2;
        if ((i >= 4 && bArr[0] == 0 && bArr[1] == 0 && (bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) || (i >= 4 && (bArr[0] & 255) == 255 && (bArr[1] & 255) == 254 && bArr[2] == 0 && bArr[3] == 0)) {
            return 4;
        }
        if (i >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) {
            return 3;
        }
        return (i < 2 || !(((i2 = bArr[0] & 255) == 254 && (bArr[1] & 255) == 255) || (i2 == 255 && (bArr[1] & 255) == 254))) ? 0 : 2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m32623(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = i & 31;
        int i3 = i >> 5;
        while (true) {
            if (i3 >= length) {
                return -1;
            }
            int i4 = iArr[i3];
            if (i4 != 0) {
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros((~((1 << i2) - 1)) & i4);
                int i5 = numberOfTrailingZeros != 32 ? numberOfTrailingZeros : -1;
                if (i5 >= 0) {
                    return (i3 << 5) + i5;
                }
            }
            i3++;
            i2 = 0;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m32624(String str) {
        C10147 c10147 = C9280.f28115;
        Set<InterfaceC7324> m16571 = AbstractC5913.m16571();
        HashSet hashSet = new HashSet();
        for (InterfaceC7324 interfaceC7324 : m16571) {
            if (interfaceC7324.mo16572().equals(str)) {
                hashSet.add(interfaceC7324);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7324) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
