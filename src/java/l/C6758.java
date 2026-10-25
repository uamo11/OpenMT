package l;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* compiled from: 5BIC */
/* renamed from: l.ۜ۫ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6758 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f20975;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String[] f20976;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20977;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final StringReader f20978;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f20979;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char[] f20980;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f20981;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f20982;

    public C6758(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.f20976 = new String[128];
        if (stringReader.markSupported()) {
            this.f20978 = stringReader;
            this.f20980 = new char[4096];
            m18380();
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m18380() {
        StringReader stringReader = this.f20978;
        int i = this.f20979;
        if (i < this.f20981) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(4096);
            int read = stringReader.read(this.f20980);
            stringReader.reset();
            if (read != -1) {
                this.f20975 = read;
                this.f20982 += this.f20979;
                this.f20979 = 0;
                this.f20977 = 0;
                if (read > 3072) {
                    read = 3072;
                }
                this.f20981 = read;
            }
        } catch (IOException e) {
            throw new C16635(e);
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m18403() {
        return this.f20982 + this.f20979;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m18389() {
        m18380();
        return this.f20979 >= this.f20975;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final char m18390() {
        m18380();
        int i = this.f20979;
        if (i >= this.f20975) {
            return (char) 65535;
        }
        return this.f20980[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m18391() {
        m18380();
        int i = this.f20979;
        char c = i >= this.f20975 ? (char) 65535 : this.f20980[i];
        this.f20979 = i + 1;
        return c;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m18381() {
        this.f20979--;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18384() {
        this.f20979++;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m18396() {
        this.f20977 = this.f20979;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m18404() {
        this.f20979 = this.f20977;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m18382(char c) {
        char[] cArr;
        int i;
        m18380();
        int i2 = this.f20979;
        while (true) {
            int i3 = this.f20975;
            cArr = this.f20980;
            if (i2 >= i3) {
                i = -1;
                break;
            }
            if (c == cArr[i2]) {
                i = i2 - this.f20979;
                break;
            }
            i2++;
        }
        String[] strArr = this.f20976;
        if (i != -1) {
            String m18379 = m18379(cArr, strArr, this.f20979, i);
            this.f20979 += i;
            return m18379;
        }
        m18380();
        int i4 = this.f20979;
        String m183792 = m18379(cArr, strArr, i4, this.f20975 - i4);
        this.f20979 = this.f20975;
        return m183792;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m18397(String str) {
        m18380();
        char charAt = str.charAt(0);
        int i = this.f20979;
        while (i < this.f20975) {
            char[] cArr = this.f20980;
            if (charAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.f20975) {
                        break;
                    }
                } while (charAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.f20975;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f20979;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m18405() {
        int m18397 = m18397("]]>");
        String[] strArr = this.f20976;
        char[] cArr = this.f20980;
        if (m18397 != -1) {
            String m18379 = m18379(cArr, strArr, this.f20979, m18397);
            this.f20979 += m18397;
            return m18379;
        }
        m18380();
        int i = this.f20979;
        String m183792 = m18379(cArr, strArr, i, this.f20975 - i);
        this.f20979 = this.f20975;
        return m183792;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m18383(char... cArr) {
        char[] cArr2;
        m18380();
        int i = this.f20979;
        int i2 = this.f20975;
        loop0: while (true) {
            int i3 = this.f20979;
            cArr2 = this.f20980;
            if (i3 >= i2) {
                break;
            }
            for (char c : cArr) {
                if (cArr2[this.f20979] == c) {
                    break loop0;
                }
            }
            this.f20979++;
        }
        int i4 = this.f20979;
        return i4 > i ? m18379(cArr2, this.f20976, i, i4 - i) : "";
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m18392(char... cArr) {
        char[] cArr2;
        m18380();
        int i = this.f20979;
        int i2 = this.f20975;
        while (true) {
            int i3 = this.f20979;
            cArr2 = this.f20980;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.f20979++;
        }
        int i4 = this.f20979;
        return i4 > i ? m18379(cArr2, this.f20976, i, i4 - i) : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        return m18379(r3, r6.f20976, r0, r2 - r0);
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m18398() {
        /*
            r6 = this;
            r6.m18380()
            int r0 = r6.f20979
            int r1 = r6.f20975
        L7:
            int r2 = r6.f20979
            char[] r3 = r6.f20980
            if (r2 >= r1) goto L1f
            char r4 = r3[r2]
            r5 = 38
            if (r4 == r5) goto L1f
            r5 = 60
            if (r4 == r5) goto L1f
            if (r4 != 0) goto L1a
            goto L1f
        L1a:
            int r2 = r2 + 1
            r6.f20979 = r2
            goto L7
        L1f:
            if (r2 <= r0) goto L29
            java.lang.String[] r1 = r6.f20976
            int r2 = r2 - r0
            java.lang.String r0 = m18379(r3, r1, r0, r2)
            return r0
        L29:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6758.m18398():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        return m18379(r3, r6.f20976, r0, r2 - r0);
     */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m18388() {
        /*
            r6 = this;
            r6.m18380()
            int r0 = r6.f20979
            int r1 = r6.f20975
        L7:
            int r2 = r6.f20979
            char[] r3 = r6.f20980
            if (r2 >= r1) goto L33
            char r4 = r3[r2]
            r5 = 9
            if (r4 == r5) goto L33
            r5 = 10
            if (r4 == r5) goto L33
            r5 = 13
            if (r4 == r5) goto L33
            r5 = 12
            if (r4 == r5) goto L33
            r5 = 32
            if (r4 == r5) goto L33
            r5 = 47
            if (r4 == r5) goto L33
            r5 = 62
            if (r4 == r5) goto L33
            if (r4 != 0) goto L2e
            goto L33
        L2e:
            int r2 = r2 + 1
            r6.f20979 = r2
            goto L7
        L33:
            if (r2 <= r0) goto L3d
            java.lang.String[] r1 = r6.f20976
            int r2 = r2 - r0
            java.lang.String r0 = m18379(r3, r1, r0, r2)
            return r0
        L3d:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6758.m18388():java.lang.String");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m18395() {
        char[] cArr;
        char c;
        m18380();
        int i = this.f20979;
        while (true) {
            int i2 = this.f20979;
            int i3 = this.f20975;
            cArr = this.f20980;
            if (i2 >= i3 || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f20979++;
        }
        return m18379(cArr, this.f20976, i, this.f20979 - i);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m18406() {
        char[] cArr;
        int i;
        char c;
        char c2;
        m18380();
        int i2 = this.f20979;
        while (true) {
            int i3 = this.f20979;
            int i4 = this.f20975;
            cArr = this.f20980;
            if (i3 >= i4 || (((c2 = cArr[i3]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f20979++;
        }
        while (true) {
            i = this.f20979;
            if (i < this.f20975 && (c = cArr[i]) >= '0' && c <= '9') {
                this.f20979 = i + 1;
            }
        }
        return m18379(cArr, this.f20976, i2, i - i2);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m18400() {
        int i;
        char[] cArr;
        char c;
        m18380();
        int i2 = this.f20979;
        while (true) {
            i = this.f20979;
            int i3 = this.f20975;
            cArr = this.f20980;
            if (i >= i3 || (((c = cArr[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f20979 = i + 1;
        }
        return m18379(cArr, this.f20976, i2, i - i2);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m18401() {
        int i;
        char[] cArr;
        char c;
        m18380();
        int i2 = this.f20979;
        while (true) {
            i = this.f20979;
            int i3 = this.f20975;
            cArr = this.f20980;
            if (i >= i3 || (c = cArr[i]) < '0' || c > '9') {
                break;
            }
            this.f20979 = i + 1;
        }
        return m18379(cArr, this.f20976, i2, i - i2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m18393(char c) {
        return !m18389() && this.f20980[this.f20979] == c;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m18394(String str) {
        m18380();
        int length = str.length();
        if (length <= this.f20975 - this.f20979) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f20980[this.f20979 + i])) {
                }
            }
            this.f20979 = str.length() + this.f20979;
            return true;
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m18399(char... cArr) {
        if (!m18389()) {
            m18380();
            char c = this.f20980[this.f20979];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m18402(char[] cArr) {
        m18380();
        return !m18389() && Arrays.binarySearch(cArr, this.f20980[this.f20979]) >= 0;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m18387() {
        if (m18389()) {
            return false;
        }
        char c = this.f20980[this.f20979];
        if (c < 'A' || c > 'Z') {
            return (c >= 'a' && c <= 'z') || Character.isLetter(c);
        }
        return true;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m18386() {
        char c;
        return !m18389() && (c = this.f20980[this.f20979]) >= '0' && c <= '9';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18385(String str) {
        m18380();
        m18380();
        int length = str.length();
        if (length <= this.f20975 - this.f20979) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f20980[this.f20979 + i]) {
                }
            }
            this.f20979 = str.length() + this.f20979;
            return true;
        }
        return false;
    }

    public final String toString() {
        int i = this.f20979;
        return new String(this.f20980, i, this.f20975 - i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18379(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = i;
        while (i4 < i2) {
            i5 = (i5 * 31) + cArr[i6];
            i4++;
            i6++;
        }
        int length = i5 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 == 0) {
                    return str;
                }
                int i10 = i7 + 1;
                int i11 = i3 + 1;
                if (cArr[i7] != str.charAt(i3)) {
                    break;
                }
                i7 = i10;
                i8 = i9;
                i3 = i11;
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }
}
