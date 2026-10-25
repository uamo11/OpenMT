package l;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: T61X */
/* renamed from: l.۬᩺ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13426 extends AbstractC12721 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32444(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m32450(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32446(long j) {
        int i = (int) j;
        C4025.m12105(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32445(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m32449(Collection collection) {
        if (collection instanceof C3549) {
            C3549 c3549 = (C3549) collection;
            return Arrays.copyOfRange(c3549.f11282, c3549.f11281, c3549.f11283);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m32448(int... iArr) {
        if (iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new C3549(0, iArr.length, iArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m32447(String str) {
        Long l2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                int m26624 = C10605.m26624(str.charAt(i));
                if (m26624 >= 0 && m26624 < 10) {
                    long j = -m26624;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            int m266242 = C10605.m26624(str.charAt(i2));
                            if (m266242 < 0 || m266242 >= 10 || j < j3) {
                                break;
                            }
                            long j4 = j * j2;
                            long j5 = m266242;
                            if (j4 < j5 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j4 - j5;
                            i2 = i3;
                        } else if (i != 0) {
                            l2 = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            l2 = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        l2 = null;
        if (l2 == null || l2.longValue() != l2.intValue()) {
            return null;
        }
        return Integer.valueOf(l2.intValue());
    }
}
