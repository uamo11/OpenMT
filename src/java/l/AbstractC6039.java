package l;

/* compiled from: Y2PE */
/* renamed from: l.ۛۨܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC6039 extends AbstractC13094 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo16874(int i, int i2, String str);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract char[] mo16876(int i);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m16875(int i, String str) {
        int length = str.length();
        char[] m26025 = C10273.m26025();
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        while (i4 < length) {
            if (i4 < length) {
                int i5 = i4 + 1;
                char charAt = str.charAt(i4);
                int i6 = charAt;
                if (charAt >= 55296) {
                    i6 = charAt;
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + ((int) charAt) + " at index " + i4 + " in '" + ((Object) str) + "'");
                        }
                        if (i5 == length) {
                            i6 = -charAt;
                        } else {
                            char charAt2 = str.charAt(i5);
                            if (Character.isLowSurrogate(charAt2)) {
                                i6 = Character.toCodePoint(charAt, charAt2);
                            } else {
                                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i5 + " in '" + ((Object) str) + "'");
                            }
                        }
                    }
                }
                if (i6 < 0) {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
                char[] mo16876 = mo16876(i6);
                int i7 = (Character.isSupplementaryCodePoint(i6) ? 2 : 1) + i4;
                if (mo16876 != null) {
                    int i8 = i4 - i2;
                    int i9 = i3 + i8;
                    int length2 = mo16876.length + i9;
                    if (m26025.length < length2) {
                        int i10 = (length - i4) + length2 + 32;
                        if (i10 < 0) {
                            throw new AssertionError("Cannot increase internal buffer any further");
                        }
                        char[] cArr = new char[i10];
                        if (i3 > 0) {
                            System.arraycopy(m26025, 0, cArr, 0, i3);
                        }
                        m26025 = cArr;
                    }
                    if (i8 > 0) {
                        str.getChars(i2, i4, m26025, i3);
                        i3 = i9;
                    }
                    if (mo16876.length > 0) {
                        System.arraycopy(mo16876, 0, m26025, i3, mo16876.length);
                        i3 += mo16876.length;
                    }
                    i2 = i7;
                }
                i4 = mo16874(i7, length, str);
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i11 = length - i2;
        if (i11 > 0) {
            int i12 = i11 + i3;
            if (m26025.length < i12) {
                if (i12 < 0) {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
                char[] cArr2 = new char[i12];
                if (i3 > 0) {
                    System.arraycopy(m26025, 0, cArr2, 0, i3);
                }
                m26025 = cArr2;
            }
            str.getChars(i2, length, m26025, i3);
            i3 = i12;
        }
        return new String(m26025, 0, i3);
    }
}
