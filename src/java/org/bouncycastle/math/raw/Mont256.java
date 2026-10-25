package org.bouncycastle.math.raw;

import l.C21639;

/* loaded from: classes2.dex */
public abstract class Mont256 {
    public static final long M = 4294967295L;

    public static int inverse32(int i) {
        int m48904 = C21639.m48904(i, i, 2, i);
        int m489042 = C21639.m48904(i, m48904, 2, m48904);
        int m489043 = C21639.m48904(i, m489042, 2, m489042);
        return C21639.m48904(i, m489043, 2, m489043);
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        char c = 0;
        long j = 4294967295L;
        long j2 = iArr2[0] & 4294967295L;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 8) {
            long j3 = iArr[i2] & j;
            long j4 = j3 * j2;
            long j5 = j2;
            long j6 = (((int) r9) * i) & j;
            int i4 = i2;
            int i5 = i3;
            long j7 = (iArr4[0] & j) * j6;
            long j8 = ((((iArr3[c] & j) + (j4 & j)) + (j7 & j)) >>> 32) + (j4 >>> 32) + (j7 >>> 32);
            int i6 = 1;
            while (i6 < 8) {
                long j9 = (iArr2[i6] & j) * j3;
                long j10 = (iArr4[i6] & j) * j6;
                long j11 = j6;
                long j12 = (j9 & j) + (j10 & j) + (iArr3[i6] & j) + j8;
                iArr3[i6 - 1] = (int) j12;
                j8 = (j12 >>> 32) + (j9 >>> 32) + (j10 >>> 32);
                i6++;
                j6 = j11;
                j = 4294967295L;
            }
            j = 4294967295L;
            long j13 = j8 + (i5 & 4294967295L);
            iArr3[7] = (int) j13;
            i3 = (int) (j13 >>> 32);
            i2 = i4 + 1;
            c = 0;
            j2 = j5;
        }
        if (i3 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c = 0;
        long j = iArr2[0] & 4294967295L;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 8;
            if (i >= 8) {
                break;
            }
            long j2 = iArr[i] & 4294967295L;
            long j3 = (j2 * j) + (iArr3[c] & 4294967295L);
            long j4 = j3 & 4294967295L;
            long j5 = (j3 >>> 32) + j4;
            int i4 = 1;
            while (i4 < i3) {
                long j6 = j;
                long j7 = (iArr2[i4] & 4294967295L) * j2;
                long j8 = (iArr4[i4] & 4294967295L) * j4;
                long j9 = (j7 & 4294967295L) + (j8 & 4294967295L) + (iArr3[i4] & 4294967295L) + j5;
                iArr3[i4 - 1] = (int) j9;
                j5 = (j9 >>> 32) + (j7 >>> 32) + (j8 >>> 32);
                i4++;
                i3 = 8;
                j = j6;
                j2 = j2;
                j4 = j4;
            }
            long j10 = j5 + (i2 & 4294967295L);
            iArr3[7] = (int) j10;
            i2 = (int) (j10 >>> 32);
            i++;
            c = 0;
            j = j;
        }
        if (i2 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i) {
        char c = 0;
        int i2 = 0;
        while (i2 < 8) {
            long j = (r5 * i) & 4294967295L;
            long j2 = (((iArr2[c] & 4294967295L) * j) + (iArr[c] & 4294967295L)) >>> 32;
            for (int i3 = 1; i3 < 8; i3++) {
                long j3 = ((iArr2[i3] & 4294967295L) * j) + (iArr[i3] & 4294967295L) + j2;
                iArr[i3 - 1] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr[7] = (int) j2;
            i2++;
            c = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 8; i++) {
            long j = iArr[0] & 4294967295L;
            long j2 = j;
            for (int i2 = 1; i2 < 8; i2++) {
                long j3 = ((iArr2[i2] & 4294967295L) * j) + (iArr[i2] & 4294967295L) + j2;
                iArr[i2 - 1] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr[7] = (int) j2;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
