package l;

import com.alipay.sdk.m.p.a;

/* compiled from: H6BE */
/* renamed from: l.ۜۙۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6532 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f20174;

    public C6532(String str) {
        this.f20174 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18039(AbstractC20644 abstractC20644) {
        char charAt;
        String str = this.f20174;
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int indexOf = str.indexOf(58, i);
                abstractC20644.mo24158(str.substring(i - 1, indexOf));
                int i2 = indexOf + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'L' || charAt2 == '[' || charAt2 == 'T') {
                    i2 = m18038(str, i2, abstractC20644.mo24156());
                }
                while (true) {
                    i = i2 + 1;
                    charAt = str.charAt(i2);
                    if (charAt != ':') {
                        break;
                    } else {
                        i2 = m18038(str, i, abstractC20644.mo24159());
                    }
                }
            } while (charAt != '>');
        }
        if (str.charAt(i) == '(') {
            int i3 = i + 1;
            while (str.charAt(i3) != ')') {
                i3 = m18038(str, i3, abstractC20644.mo24166());
            }
            int m18038 = m18038(str, i3 + 1, abstractC20644.mo24154());
            while (m18038 < length) {
                m18038 = m18038(str, m18038 + 1, abstractC20644.mo24163());
            }
            return;
        }
        int m180382 = m18038(str, i, abstractC20644.mo24165());
        while (m180382 < length) {
            m180382 = m18038(str, m180382, abstractC20644.mo24162());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18040(AbstractC20644 abstractC20644) {
        m18038(this.f20174, 0, abstractC20644);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18038(String str, int i, AbstractC20644 abstractC20644) {
        int i2 = i + 1;
        char charAt = str.charAt(i);
        if (charAt != 'F') {
            if (charAt == 'L') {
                boolean z = false;
                int i3 = i2;
                boolean z2 = false;
                while (true) {
                    int i4 = i2 + 1;
                    char charAt2 = str.charAt(i2);
                    if (charAt2 == '.' || charAt2 == ';') {
                        if (!z) {
                            String substring = str.substring(i3, i2);
                            if (z2) {
                                abstractC20644.mo24161(substring);
                            } else {
                                abstractC20644.mo24153(substring);
                            }
                        }
                        if (charAt2 == ';') {
                            abstractC20644.mo24160();
                            return i4;
                        }
                        z = false;
                        z2 = true;
                        i2 = i4;
                        i3 = i2;
                    } else if (charAt2 == '<') {
                        String substring2 = str.substring(i3, i2);
                        if (z2) {
                            abstractC20644.mo24161(substring2);
                        } else {
                            abstractC20644.mo24153(substring2);
                        }
                        i2 = i4;
                        while (true) {
                            char charAt3 = str.charAt(i2);
                            if (charAt3 == '>') {
                                break;
                            }
                            if (charAt3 == '*') {
                                i2++;
                                abstractC20644.mo24155();
                            } else if (charAt3 == '+' || charAt3 == '-') {
                                i2 = m18038(str, i2 + 1, abstractC20644.mo24157(charAt3));
                            } else {
                                i2 = m18038(str, i2, abstractC20644.mo24157(a.h));
                            }
                        }
                        z = true;
                    } else {
                        i2 = i4;
                    }
                }
            } else if (charAt != 'V' && charAt != 'I' && charAt != 'J' && charAt != 'S') {
                if (charAt == 'T') {
                    int indexOf = str.indexOf(59, i2);
                    abstractC20644.mo24164(str.substring(i2, indexOf));
                    return indexOf + 1;
                }
                if (charAt != 'Z') {
                    if (charAt == '[') {
                        return m18038(str, i2, abstractC20644.mo24151());
                    }
                    switch (charAt) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        abstractC20644.mo24152(charAt);
        return i2;
    }
}
