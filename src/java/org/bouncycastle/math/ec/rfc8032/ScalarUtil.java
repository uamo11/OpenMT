package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.util.Integers;

/* loaded from: classes2.dex */
public abstract class ScalarUtil {
    public static final long M = 4294967295L;

    public static void addShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int i4 = 0;
        long j = 0;
        if (i2 == 0) {
            long j2 = 0;
            while (i4 <= i3) {
                long j3 = iArr3[i4] & 4294967295L;
                long j4 = j2 + j3 + (iArr2[i4] & 4294967295L);
                int i5 = (int) j4;
                j2 = j4 >>> 32;
                iArr3[i4] = i5;
                long j5 = j + (iArr[i4] & 4294967295L) + j3 + (i5 & 4294967295L);
                iArr[i4] = (int) j5;
                j = j5 >>> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            int i7 = 0;
            long j6 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr3[i4];
                long j7 = j + (iArr[i4] & 4294967295L) + (((i6 >>> r15) | (i9 << i2)) & 4294967295L);
                int i10 = iArr2[i4];
                long j8 = j6 + (i9 & 4294967295L) + (((i7 >>> r15) | (i10 << i2)) & 4294967295L);
                int i11 = (int) j8;
                j6 = j8 >>> 32;
                iArr3[i4] = i11;
                int i12 = i8 >>> (-i2);
                int i13 = i4;
                long j9 = j7 + ((i12 | (i11 << i2)) & 4294967295L);
                iArr[i13] = (int) j9;
                j = j9 >>> 32;
                i4 = i13 + 1;
                i8 = i11;
                i6 = i9;
                i7 = i10;
            }
            return;
        }
        System.arraycopy(iArr3, 0, iArr4, 0, i3);
        int i14 = i2 >>> 5;
        int i15 = i2 & 31;
        if (i15 == 0) {
            long j10 = 0;
            for (int i16 = i14; i16 <= i3; i16++) {
                int i17 = i16 - i14;
                long j11 = j10 + (iArr3[i16] & 4294967295L) + (iArr2[i17] & 4294967295L);
                iArr3[i16] = (int) j11;
                j10 = j11 >>> 32;
                long j12 = j + (iArr[i16] & 4294967295L) + (iArr4[i17] & 4294967295L) + (iArr3[i17] & 4294967295L);
                iArr[i16] = (int) j12;
                j = j12 >>> 32;
            }
            return;
        }
        long j13 = 0;
        int i18 = i14;
        int i19 = 0;
        int i20 = 0;
        while (i18 <= i3) {
            int i21 = i18 - i14;
            int i22 = iArr4[i21];
            int i23 = -i15;
            long j14 = j13;
            long j15 = j + (iArr[i18] & 4294967295L) + (((i4 >>> i23) | (i22 << i15)) & 4294967295L);
            int i24 = iArr2[i21];
            long j16 = j14 + (iArr3[i18] & 4294967295L) + (((i24 << i15) | (i19 >>> i23)) & 4294967295L);
            iArr3[i18] = (int) j16;
            j13 = j16 >>> 32;
            int i25 = iArr3[i21];
            long j17 = j15 + (((i20 >>> i23) | (i25 << i15)) & 4294967295L);
            iArr[i18] = (int) j17;
            j = j17 >>> 32;
            i18++;
            i3 = i;
            i19 = i24;
            i20 = i25;
            i4 = i22;
            i14 = i14;
        }
    }

    public static void addShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        long j = 0;
        if (i4 == 0) {
            long j2 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                int i6 = i5 - i3;
                long j3 = j + (iArr[i5] & 4294967295L) + (iArr3[i6] & 4294967295L);
                long j4 = j2 + (iArr2[i5] & 4294967295L) + (iArr4[i6] & 4294967295L);
                iArr[i5] = (int) j3;
                j = j3 >>> 32;
                iArr2[i5] = (int) j4;
                j2 = j4 >>> 32;
            }
            return;
        }
        int i7 = 0;
        int i8 = i3;
        long j5 = 0;
        int i9 = 0;
        while (i8 <= i) {
            int i10 = i8 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            int i13 = -i4;
            long j6 = j + (iArr[i8] & 4294967295L) + (((i7 >>> i13) | (i11 << i4)) & 4294967295L);
            long j7 = j5 + (iArr2[i8] & 4294967295L) + (((i9 >>> i13) | (i12 << i4)) & 4294967295L);
            iArr[i8] = (int) j6;
            j = j6 >>> 32;
            iArr2[i8] = (int) j7;
            j5 = j7 >>> 32;
            i8++;
            i9 = i12;
            i7 = i11;
        }
    }

    public static int getBitLength(int i, int[] iArr) {
        int i2 = iArr[i] >> 31;
        while (i > 0 && iArr[i] == i2) {
            i--;
        }
        return ((i * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i] ^ i2);
    }

    public static int getBitLengthPositive(int i, int[] iArr) {
        while (i > 0 && iArr[i] == 0) {
            i--;
        }
        return ((i * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i]);
    }

    public static boolean lessThan(int i, int[] iArr, int[] iArr2) {
        do {
            int i2 = iArr[i] - 2147483648;
            int i3 = iArr2[i] - 2147483648;
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
            i--;
        } while (i >= 0);
        return false;
    }

    public static void subShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int i4 = 0;
        long j = 0;
        if (i2 == 0) {
            long j2 = 0;
            while (i4 <= i3) {
                long j3 = iArr3[i4] & 4294967295L;
                long j4 = (j2 + j3) - (iArr2[i4] & 4294967295L);
                int i5 = (int) j4;
                j2 = j4 >> 32;
                iArr3[i4] = i5;
                long j5 = ((j + (iArr[i4] & 4294967295L)) - j3) - (i5 & 4294967295L);
                iArr[i4] = (int) j5;
                j = j5 >> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            int i7 = 0;
            long j6 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr3[i4];
                long j7 = (j + (iArr[i4] & 4294967295L)) - (((i6 >>> r15) | (i9 << i2)) & 4294967295L);
                int i10 = iArr2[i4];
                long j8 = (j6 + (i9 & 4294967295L)) - (((i7 >>> r15) | (i10 << i2)) & 4294967295L);
                int i11 = (int) j8;
                j6 = j8 >> 32;
                iArr3[i4] = i11;
                int i12 = i8 >>> (-i2);
                int i13 = i4;
                long j9 = j7 - ((i12 | (i11 << i2)) & 4294967295L);
                iArr[i13] = (int) j9;
                j = j9 >> 32;
                i4 = i13 + 1;
                i8 = i11;
                i6 = i9;
                i7 = i10;
            }
            return;
        }
        System.arraycopy(iArr3, 0, iArr4, 0, i3);
        int i14 = i2 >>> 5;
        int i15 = i2 & 31;
        if (i15 == 0) {
            long j10 = 0;
            for (int i16 = i14; i16 <= i3; i16++) {
                int i17 = i16 - i14;
                long j11 = (j10 + (iArr3[i16] & 4294967295L)) - (iArr2[i17] & 4294967295L);
                iArr3[i16] = (int) j11;
                j10 = j11 >> 32;
                long j12 = ((j + (iArr[i16] & 4294967295L)) - (iArr4[i17] & 4294967295L)) - (iArr3[i17] & 4294967295L);
                iArr[i16] = (int) j12;
                j = j12 >> 32;
            }
            return;
        }
        long j13 = 0;
        int i18 = i14;
        int i19 = 0;
        int i20 = 0;
        while (i18 <= i3) {
            int i21 = i18 - i14;
            int i22 = iArr4[i21];
            int i23 = -i15;
            long j14 = j13;
            long j15 = (j + (iArr[i18] & 4294967295L)) - (((i4 >>> i23) | (i22 << i15)) & 4294967295L);
            int i24 = iArr2[i21];
            long j16 = (j14 + (iArr3[i18] & 4294967295L)) - (((i24 << i15) | (i19 >>> i23)) & 4294967295L);
            iArr3[i18] = (int) j16;
            j13 = j16 >> 32;
            int i25 = iArr3[i21];
            long j17 = j15 - (((i20 >>> i23) | (i25 << i15)) & 4294967295L);
            iArr[i18] = (int) j17;
            j = j17 >> 32;
            i18++;
            i3 = i;
            i19 = i24;
            i20 = i25;
            i4 = i22;
            i14 = i14;
        }
    }

    public static void subShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        long j = 0;
        if (i4 == 0) {
            long j2 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                int i6 = i5 - i3;
                long j3 = (j + (iArr[i5] & 4294967295L)) - (iArr3[i6] & 4294967295L);
                long j4 = (j2 + (iArr2[i5] & 4294967295L)) - (iArr4[i6] & 4294967295L);
                iArr[i5] = (int) j3;
                j = j3 >> 32;
                iArr2[i5] = (int) j4;
                j2 = j4 >> 32;
            }
            return;
        }
        int i7 = 0;
        int i8 = i3;
        long j5 = 0;
        int i9 = 0;
        while (i8 <= i) {
            int i10 = i8 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            int i13 = -i4;
            long j6 = (j + (iArr[i8] & 4294967295L)) - (((i7 >>> i13) | (i11 << i4)) & 4294967295L);
            long j7 = (j5 + (iArr2[i8] & 4294967295L)) - (((i9 >>> i13) | (i12 << i4)) & 4294967295L);
            iArr[i8] = (int) j6;
            j = j6 >> 32;
            iArr2[i8] = (int) j7;
            j5 = j7 >> 32;
            i8++;
            i9 = i12;
            i7 = i11;
        }
    }
}
