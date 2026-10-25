package l;

import java.util.BitSet;

/* compiled from: W6QR */
/* renamed from: l.ᩳᩴܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18242 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f56692;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f56693;

    public C18242(String str, int i) {
        this.f56693 = str;
        this.f56692 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42521(int i) {
        boolean m47948;
        if ((this.f56692 & 4) == 0) {
            return i;
        }
        String str = this.f56693;
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (!C22165.m49801(charAt, 2048)) {
                if (charAt != '#') {
                    break;
                }
                do {
                    i++;
                    if (i < length && str.charAt(i) != 0) {
                        m47948 = C21065.m47948(str.charAt(i), this.f56692);
                    }
                } while (!m47948);
            } else {
                i++;
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42522(int i, BitSet bitSet, int[] iArr) {
        int m42521;
        String str = this.f56693;
        int length = str.length();
        int i2 = i + 1;
        if (i2 == length) {
            return i2;
        }
        int codePointAt = str.codePointAt(i2);
        int charCount = Character.charCount(codePointAt) + i2;
        if (codePointAt == 99) {
            int m425212 = m42521(charCount);
            if (m425212 >= length) {
                return m425212;
            }
            bitSet.set(iArr[m425212]);
            return Character.charCount(str.codePointAt(m425212)) + m425212;
        }
        if (codePointAt == 117) {
            for (int i3 = 0; i3 < 4 && charCount < length; i3++) {
                int m425213 = m42521(charCount);
                if (m425213 < length) {
                    m425213++;
                }
                charCount = m425213;
            }
            return charCount;
        }
        int i4 = 2;
        if (codePointAt != 120 && codePointAt != 112 && codePointAt != 80 && codePointAt != 78) {
            if (codePointAt == 48) {
                int m425214 = m42521(charCount);
                if (m425214 < length && str.charAt(m425214) <= '3') {
                    i4 = 3;
                }
                while (true) {
                    int i5 = i4 - 1;
                    if (i4 <= 0 || (m42521 = m42521(charCount)) == length || str.charAt(m42521) < '0' || str.charAt(m42521) > '7') {
                        break;
                    }
                    charCount = m42521 + 1;
                    i4 = i5;
                }
            }
            return charCount;
        }
        int m425215 = m42521(charCount);
        if (m425215 < length && str.charAt(m425215) == '{') {
            do {
                m425215 = m42521(m425215 + 1);
                if (m425215 >= length) {
                    break;
                }
            } while (str.charAt(m425215) != '}');
            return m425215 < length ? m425215 + 1 : m425215;
        }
        int i6 = codePointAt == 120 ? 2 : 1;
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0 || m425215 >= length) {
                break;
            }
            m425215 = m42521(m425215);
            if (m425215 < length) {
                m425215 += Character.charCount(str.codePointAt(m425215));
            }
            i6 = i7;
        }
        return m425215;
    }
}
