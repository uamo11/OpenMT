package l;

import java.util.Arrays;

/* compiled from: A70P */
/* renamed from: l.ܰ֫ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13510 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m32551(long j, long j2) {
        long j3 = j2 + j;
        return (j3 < 0 || j3 < j) ? C13132.FOREVER_NS : j3;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m32559(int i) {
        return (i + 63) >>> 6;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12100 m32552(int i, boolean z) {
        if (i == 0) {
            return null;
        }
        return m32538(i, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32541(C12100 c12100, int i, int i2) {
        C12100 c121002;
        C12100 c121003;
        C9005.m23246(c12100 == null ? 0 : c12100.f36167, i, i2);
        if (i2 == 0) {
            return null;
        }
        c121002 = m32537(c12100, i).f34089;
        c121003 = m32537(c121002, i2).f34088;
        return c121003;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32542(C12100 c12100, int i, int i2, int i3) {
        C12100 c121002;
        C12100 c121003;
        C12100 c121004;
        int i4 = c12100 == null ? 0 : c12100.f36167;
        if (i < 0 || i2 < i || i2 > i4 || i3 < 0) {
            StringBuilder m46682 = C20361.m46682("start=", i, ", end=", ", replacementLength=", i2);
            m46682.append(i3);
            throw new IndexOutOfBoundsException(m46682.toString());
        }
        if (i2 - i == i3 && i3 != 0) {
            return m32545(c12100, new int[]{i}, 1, i3);
        }
        C11395 m32537 = m32537(c12100, i);
        c121002 = m32537.f34089;
        C11395 m325372 = m32537(c121002, i2 - i);
        c121003 = m32537.f34088;
        C12100 m32561 = m32561(c121003, m32552(i3, true));
        c121004 = m325372.f34089;
        return m32561(m32561, c121004);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32545(C12100 c12100, int[] iArr, int i, int i2) {
        int i3 = c12100 == null ? 0 : c12100.f36167;
        if (i2 <= 0 || i < 0 || i > iArr.length) {
            throw new IllegalArgumentException("Invalid dirty batch");
        }
        int i4 = -1;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr[i5];
            long j = i6 + i2;
            if (i6 < 0 || i6 < i4 || j > i3) {
                throw new IndexOutOfBoundsException(C19370.m44628(i6, "Invalid dirty match offset "));
            }
            i4 = (int) j;
        }
        return i == 0 ? c12100 : m32543(c12100, 0, iArr, 0, i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32547(C12100 c12100, int i, boolean[] zArr, int i2) {
        C9005.m23246(c12100 == null ? 0 : c12100.f36167, i, i2);
        C9005.m23245(zArr.length, 0, i2);
        if (i2 == 0) {
            return;
        }
        m32548(c12100, i, zArr, 0, i2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m32558(C12100 c12100) {
        if (c12100 == null) {
            return 0L;
        }
        return c12100.f36172;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m32535(long j) {
        if (j < 0 || j > 2147483647L) {
            return C13132.FOREVER_NS;
        }
        long j2 = (j + 65535) / 65536;
        if (j2 == 0) {
            return 0L;
        }
        return ((j2 * 2) - 1) * 48;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32548(C12100 c12100, int i, boolean[] zArr, int i2, int i3) {
        boolean m29515 = c12100.m29515();
        C12100 c121002 = c12100.f36169;
        int i4 = 0;
        if (m29515) {
            if (c12100.m29514()) {
                long[] jArr = c12100.f36166;
                int i5 = i3 + i;
                while (i < i5) {
                    int i6 = i & 63;
                    int min = Math.min(i5 - i, 64 - i6);
                    long j = jArr[i >>> 6] >>> i6;
                    int i7 = 0;
                    while (i7 < min) {
                        int i8 = i2 + 1;
                        zArr[i2] = ((1 << i7) & j) != 0;
                        i7++;
                        i2 = i8;
                    }
                    i += min;
                }
                return;
            }
            Arrays.fill(zArr, i2, i3 + i2, c12100.f36171);
            return;
        }
        int i9 = c121002.f36167;
        if (i < i9) {
            int min2 = Math.min(i3, i9 - i);
            m32548(c121002, i, zArr, i2, min2);
            i2 += min2;
            i3 -= min2;
        } else {
            i4 = i - i9;
        }
        if (i3 > 0) {
            m32548(c12100.f36165, i4, zArr, i2, i3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32543(C12100 c12100, int i, int[] iArr, int i2, int i3, int i4) {
        long j = i;
        int i5 = c12100.f36167;
        C12100 c121002 = c12100.f36169;
        long j2 = i5 + j;
        long j3 = i4;
        long j4 = 1;
        int m32534 = m32534(i2, (j - j3) + 1, iArr, i3);
        int m325342 = m32534(m32534, j2, iArr, i3);
        if (m32534 < m325342 && (!c12100.m29516() || !c12100.f36171)) {
            if (!c12100.m29515()) {
                C12100 m32543 = m32543(c12100.f36169, i, iArr, m32534, m325342, i4);
                C12100 m325432 = m32543(c12100.f36165, c121002.f36167 + i, iArr, m32534, m325342, i4);
                if (m32543 != c121002 || m325432 != c12100.f36165) {
                    return m32561(m32543, m325432);
                }
            } else {
                int i6 = m32534;
                int i7 = m325342;
                if (c12100.m29514()) {
                    long[] jArr = (long[]) c12100.f36166.clone();
                    m32549(jArr, i, c12100.f36167, iArr, i6, i7, i4);
                    return m32560(c12100.f36167, jArr);
                }
                int max = Math.max(i, iArr[i6]);
                long min = Math.min(j2, iArr[i7 - 1] + j3);
                long max2 = Math.max(j, (max / 65536) * 65536);
                long min2 = Math.min(j2, ((min + 65535) / 65536) * 65536);
                C12100 m32552 = j < max2 ? m32552((int) (max2 - j), false) : null;
                while (max2 < min2) {
                    int min3 = (int) (Math.min(min2, ((max2 / 65536) + j4) * 65536) - max2);
                    long[] jArr2 = new long[m32559(min3)];
                    C12100 c121003 = m32552;
                    int m325343 = m32534(i6, (max2 - j3) + j4, iArr, i7);
                    long j5 = min2;
                    long j6 = min3 + max2;
                    m32549(jArr2, (int) max2, min3, iArr, m325343, m32534(m325343, j6, iArr, i7), i4);
                    m32552 = m32561(c121003, m32560(min3, jArr2));
                    i7 = i7;
                    i6 = i6;
                    min2 = j5;
                    max2 = j6;
                    j4 = 1;
                }
                C12100 c121004 = m32552;
                long j7 = min2;
                return j7 < j2 ? m32561(c121004, m32552((int) (j2 - j7), false)) : c121004;
            }
        }
        return c12100;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32549(long[] jArr, int i, int i2, int[] iArr, int i3, int i4, int i5) {
        long j = i + i2;
        while (i3 < i4) {
            int max = Math.max(i, iArr[i3]);
            int min = (int) Math.min(j, iArr[i3] + i5);
            if (max < min) {
                m32555(max - i, min - i, jArr);
            }
            i3++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32555(int i, int i2, long[] jArr) {
        int i3 = i >>> 6;
        int i4 = i2 - 1;
        int i5 = i4 >>> 6;
        long j = (-1) << (i & 63);
        long j2 = (-1) >>> (63 - (i4 & 63));
        if (i3 == i5) {
            jArr[i3] = (j2 & j) | jArr[i3];
        } else {
            jArr[i3] = j | jArr[i3];
            Arrays.fill(jArr, i3 + 1, i5, -1L);
            jArr[i5] = j2 | jArr[i5];
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32534(int i, long j, int[] iArr, int i2) {
        while (i < i2) {
            int i3 = (i + i2) >>> 1;
            if (iArr[i3] < j) {
                i = i3 + 1;
            } else {
                i2 = i3;
            }
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m32550(int i) {
        if (i <= 0 || i > 65536) {
            throw new IllegalArgumentException("Invalid dirty bitmap length");
        }
        return m32559(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32556(C12100 c12100) {
        m32562(c12100);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C12805 m32562(l.C12100 r26) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13510.m32562(l.۫֫ܳ):l.۬֫ܳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11395 m32537(C12100 c12100, int i) {
        C12100 c121002;
        C12100 c121003;
        C12100 c121004;
        C12100 c121005;
        if (c12100 == null) {
            if (i == 0) {
                return C11395.f34087;
            }
            throw new IndexOutOfBoundsException(C19370.m44628(i, "offset="));
        }
        C12100 c121006 = c12100.f36169;
        boolean z = c12100.f36171;
        C12100 c121007 = c12100.f36165;
        int i2 = c12100.f36167;
        int i3 = 0;
        C12100 c121008 = null;
        if (i == 0) {
            return new C11395(c121008, c12100, i3);
        }
        if (i == i2) {
            return new C11395(c12100, c121008, i3);
        }
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "offset="));
        }
        if (c12100.m29515()) {
            return !c12100.m29514() ? new C11395(m32538(i, z), m32538(i2 - i, z), i3) : new C11395(m32553(c12100, 0, i), m32553(c12100, i, i2 - i), i3);
        }
        int i4 = c121006.f36167;
        if (i < i4) {
            C11395 m32537 = m32537(c121006, i);
            c121004 = m32537.f34088;
            c121005 = m32537.f34089;
            return new C11395(c121004, m32561(c121005, c121007), i3);
        }
        if (i == i4) {
            return new C11395(c121006, c121007, i3);
        }
        C11395 m325372 = m32537(c121007, i - i4);
        c121002 = m325372.f34088;
        C12100 m32561 = m32561(c121006, c121002);
        c121003 = m325372.f34089;
        return new C11395(m32561, c121003, i3);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C12100 m32565(C12100 c12100, C12100 c121002) {
        if (c12100 == null) {
            return c121002;
        }
        if (c121002 == null) {
            return c12100;
        }
        int i = c12100.f36170;
        int i2 = c121002.f36170;
        if (i > i2 + 1) {
            return m32540(m32554(c12100.f36169, m32565(c12100.f36165, c121002)));
        }
        if (i2 > i + 1) {
            return m32540(m32554(m32565(c12100, c121002.f36169), c121002.f36165));
        }
        return m32554(c12100, c121002);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32540(C12100 c12100) {
        C12100 c121002 = c12100.f36169;
        C12100 c121003 = c12100.f36165;
        int i = (c121002 == null ? 0 : c121002.f36170) - (c121003 == null ? 0 : c121003.f36170);
        if (i > 1) {
            C12100 c121004 = c121002.f36169;
            int i2 = c121004 == null ? 0 : c121004.f36170;
            C12100 c121005 = c121002.f36165;
            return i2 >= (c121005 != null ? c121005.f36170 : 0) ? m32554(c121004, m32554(c121005, c121003)) : m32554(m32554(c121004, c121005.f36169), m32554(c121005.f36165, c121003));
        }
        if (i >= -1) {
            return c12100;
        }
        C12100 c121006 = c121003.f36165;
        int i3 = c121006 == null ? 0 : c121006.f36170;
        C12100 c121007 = c121003.f36169;
        return i3 >= (c121007 != null ? c121007.f36170 : 0) ? m32554(m32554(c121002, c121007), c121006) : m32554(m32554(c121002, c121007.f36169), m32554(c121007.f36165, c121006));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C9984 m32563(C12100 c12100) {
        C12100 c121002;
        C12100 c121003;
        if (c12100.m29515()) {
            return new C9984(null, c12100);
        }
        C9984 m32563 = m32563(c12100.f36165);
        C12100 c121004 = c12100.f36169;
        c121002 = m32563.f30102;
        C12100 m32565 = m32565(c121004, c121002);
        c121003 = m32563.f30101;
        return new C9984(m32565, c121003);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C9984 m32564(C12100 c12100) {
        C12100 c121002;
        C12100 c121003;
        if (c12100.m29515()) {
            return new C9984(null, c12100);
        }
        C9984 m32564 = m32564(c12100.f36169);
        c121002 = m32564.f30102;
        C12100 m32565 = m32565(c121002, c12100.f36165);
        c121003 = m32564.f30101;
        return new C9984(m32565, c121003);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12100 m32561(C12100 c12100, C12100 c121002) {
        C12100 c121003;
        C12100 c121004;
        C12100 c121005;
        C12100 c121006;
        C12100 c121007;
        if (c12100 == null) {
            return c121002;
        }
        if (c121002 == null) {
            return c12100;
        }
        C12100 c121008 = c12100;
        while (!c121008.m29515()) {
            c121008 = c121008.f36165;
        }
        C12100 c121009 = c121002;
        while (!c121009.m29515()) {
            c121009 = c121009.f36169;
        }
        if (!c121008.m29516() || !c121009.m29516() || c121008.f36171 != c121009.f36171) {
            return m32565(c12100, c121002);
        }
        C9984 m32563 = m32563(c12100);
        C9984 m32564 = m32564(c121002);
        c121003 = m32563.f30101;
        long j = c121003.f36167;
        c121004 = m32564.f30101;
        long j2 = j + c121004.f36167;
        if (j2 > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        int i = (int) j2;
        c121005 = m32563.f30101;
        C12100 m32538 = m32538(i, c121005.f36171);
        c121006 = m32563.f30102;
        C12100 m32561 = m32561(c121006, m32538);
        c121007 = m32564.f30102;
        return m32561(m32561, c121007);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12100 m32553(C12100 c12100, int i, int i2) {
        long[] jArr = new long[m32559(i2)];
        for (int i3 = 0; i3 < i2; i3++) {
            if (m32557(i + i3, c12100.f36166)) {
                int i4 = i3 >>> 6;
                jArr[i4] = jArr[i4] | (1 << (i3 & 63));
            }
        }
        return m32560(i2, jArr);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12100 m32560(int i, long[] jArr) {
        if (i <= 0 || i > 65536 || jArr.length != m32559(i)) {
            throw new IllegalArgumentException("Invalid dirty bitmap");
        }
        int i2 = i & 63;
        if (i2 != 0) {
            int length = jArr.length - 1;
            jArr[length] = jArr[length] & ((1 << i2) - 1);
        }
        int i3 = 0;
        boolean z = false;
        boolean z2 = true;
        while (i3 < jArr.length) {
            long j = (i3 != jArr.length - 1 || i2 == 0) ? -1L : (1 << i2) - 1;
            long j2 = jArr[i3];
            z |= j2 != 0;
            z2 &= j2 == j;
            i3++;
        }
        if (!z) {
            return m32538(i, false);
        }
        if (z2) {
            return m32538(i, true);
        }
        return new C12100(null, null, jArr, i, 1, false, true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m32557(int i, long[] jArr) {
        return ((1 << (i & 63)) & jArr[i >>> 6]) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12100 m32538(int i, boolean z) {
        return new C12100(null, null, null, i, 1, z, z);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12100 m32554(C12100 c12100, C12100 c121002) {
        long j = c12100.f36167 + c121002.f36167;
        int i = (int) j;
        if (j == i) {
            return new C12100(c12100, c121002, null, i, Math.max(c12100.f36170, c121002.f36170) + 1, false, c12100.f36164 || c121002.f36164);
        }
        throw new ArithmeticException();
    }
}
