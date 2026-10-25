package org.bouncycastle.math.raw;

import java.math.BigInteger;
import l.C8083;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public abstract class Nat256 {
    public static final long M = 4294967295L;

    public static int add(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[i2 + 1] & 4294967295L) + (j >>> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[i2 + 2] & 4294967295L) + (j2 >>> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[i2 + 3] & 4294967295L) + (j3 >>> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[i2 + 4] & 4294967295L) + (j4 >>> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[i2 + 5] & 4294967295L) + (j5 >>> 32);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (iArr[i + 6] & 4294967295L) + (iArr2[i2 + 6] & 4294967295L) + (j6 >>> 32);
        iArr3[i3 + 6] = (int) j7;
        long j8 = (iArr[i + 7] & 4294967295L) + (iArr2[i2 + 7] & 4294967295L) + (j7 >>> 32);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L) + (iArr3[i3] & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[i2 + 1] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j >>> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[i2 + 2] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j2 >>> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[i2 + 3] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j3 >>> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[i2 + 4] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j4 >>> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[i2 + 5] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j5 >>> 32);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (iArr[i + 6] & 4294967295L) + (iArr2[i2 + 6] & 4294967295L) + (iArr3[r7] & 4294967295L) + (j6 >>> 32);
        iArr3[i3 + 6] = (int) j7;
        long j8 = (iArr[i + 7] & 4294967295L) + (iArr2[i2 + 7] & 4294967295L) + (iArr3[r15] & 4294967295L) + (j7 >>> 32);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        long j8 = (iArr[7] & 4294967295L) + (iArr2[7] & 4294967295L) + (iArr3[7] & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L) + (i3 & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = (iArr[i + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j >>> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j2 >>> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j3 >>> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j4 >>> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j5 >>> 32);
        iArr2[i2 + 5] = (int) j6;
        long j7 = (iArr[i + 6] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j6 >>> 32);
        iArr2[i2 + 6] = (int) j7;
        long j8 = (iArr[i + 7] & 4294967295L) + (4294967295L & iArr2[r12]) + (j7 >>> 32);
        iArr2[i2 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        long j8 = (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]) + (j7 >>> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (i & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        long j7 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        long j8 = (iArr[7] & 4294967295L) + (4294967295L & iArr2[7]) + (j7 >>> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        long j2 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j >>> 32);
        int i4 = (int) j2;
        iArr[i + 1] = i4;
        iArr2[i2 + 1] = i4;
        long j3 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j2 >>> 32);
        int i5 = (int) j3;
        iArr[i + 2] = i5;
        iArr2[i2 + 2] = i5;
        long j4 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j3 >>> 32);
        int i6 = (int) j4;
        iArr[i + 3] = i6;
        iArr2[i2 + 3] = i6;
        long j5 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j4 >>> 32);
        int i7 = (int) j5;
        iArr[i + 4] = i7;
        iArr2[i2 + 4] = i7;
        long j6 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j5 >>> 32);
        int i8 = (int) j6;
        iArr[i + 5] = i8;
        iArr2[i2 + 5] = i8;
        long j7 = (iArr[r5] & 4294967295L) + (iArr2[r8] & 4294967295L) + (j6 >>> 32);
        int i9 = (int) j7;
        iArr[i + 6] = i9;
        iArr2[i2 + 6] = i9;
        long j8 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j7 >>> 32);
        int i10 = (int) j8;
        iArr[i + 7] = i10;
        iArr2[i2 + 7] = i10;
        return (int) (j8 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
        iArr2[i2 + 6] = iArr[i + 6];
        iArr2[i2 + 7] = iArr[i + 7];
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
        jArr2[i2 + 3] = jArr[i + 3];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean gte = gte(iArr, i, iArr2, i2);
        if (gte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
            return gte;
        }
        sub(iArr2, i2, iArr, i, iArr3, i3);
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 8; i++) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i = 0; i < 4; i++) {
            create64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            if ((i & 255) != i) {
                return 0;
            }
            i2 = iArr[i >>> 5] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & 4294967295L;
        long j2 = iArr2[i2 + 1] & 4294967295L;
        long j3 = iArr2[i2 + 2] & 4294967295L;
        long j4 = iArr2[i2 + 3] & 4294967295L;
        long j5 = iArr2[i2 + 4] & 4294967295L;
        long j6 = iArr2[i2 + 5] & 4294967295L;
        long j7 = iArr2[i2 + 6] & 4294967295L;
        long j8 = iArr2[i2 + 7] & 4294967295L;
        long j9 = iArr[i] & 4294967295L;
        long j10 = j9 * j;
        iArr3[i3] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[i3 + 1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[i3 + 5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[i3 + 6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[i3 + 7] = (int) j17;
        iArr3[i3 + 8] = (int) (j17 >>> 32);
        int i4 = i3;
        int i5 = 1;
        while (i5 < 8) {
            int i6 = i4 + 1;
            long j18 = iArr[i + i5] & 4294967295L;
            int i7 = i5;
            long j19 = (j18 * j) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j19;
            long j20 = j6;
            long j21 = (j19 >>> 32) + (j18 * j2) + (iArr3[r25] & 4294967295L);
            iArr3[i4 + 2] = (int) j21;
            long j22 = (j18 * j3) + (iArr3[r15] & 4294967295L) + (j21 >>> 32);
            iArr3[i4 + 3] = (int) j22;
            long j23 = (j18 * j4) + (iArr3[r2] & 4294967295L) + (j22 >>> 32);
            iArr3[i4 + 4] = (int) j23;
            long j24 = (j18 * j5) + (iArr3[r2] & 4294967295L) + (j23 >>> 32);
            iArr3[i4 + 5] = (int) j24;
            long j25 = (j18 * j20) + (iArr3[r2] & 4294967295L) + (j24 >>> 32);
            iArr3[i4 + 6] = (int) j25;
            long j26 = (j18 * j7) + (iArr3[r2] & 4294967295L) + (j25 >>> 32);
            iArr3[i4 + 7] = (int) j26;
            long j27 = (j18 * j8) + (iArr3[r2] & 4294967295L) + (j26 >>> 32);
            iArr3[i4 + 8] = (int) j27;
            iArr3[i4 + 9] = (int) (j27 >>> 32);
            i5 = i7 + 1;
            i4 = i6;
            j3 = j3;
            j6 = j20;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = iArr[0] & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        char c = ' ';
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        int i = 8;
        iArr3[8] = (int) (j17 >>> 32);
        int i2 = 1;
        while (i2 < i) {
            long j18 = iArr[i2] & 4294967295L;
            long j19 = j;
            long j20 = (j18 * j) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j20;
            int i3 = i2 + 1;
            long j21 = j2;
            long j22 = (j18 * j2) + (iArr3[i3] & 4294967295L) + (j20 >>> c);
            iArr3[i3] = (int) j22;
            long j23 = j3;
            long j24 = (j18 * j3) + (iArr3[r10] & 4294967295L) + (j22 >>> c);
            iArr3[i2 + 2] = (int) j24;
            long j25 = (j18 * j4) + (iArr3[r1] & 4294967295L) + (j24 >>> 32);
            iArr3[i2 + 3] = (int) j25;
            long j26 = (j18 * j5) + (iArr3[r1] & 4294967295L) + (j25 >>> 32);
            iArr3[i2 + 4] = (int) j26;
            long j27 = (j18 * j6) + (iArr3[r1] & 4294967295L) + (j26 >>> 32);
            iArr3[i2 + 5] = (int) j27;
            long j28 = (j18 * j7) + (iArr3[r1] & 4294967295L) + (j27 >>> 32);
            iArr3[i2 + 6] = (int) j28;
            long j29 = (j18 * j8) + (iArr3[r1] & 4294967295L) + (j28 >>> 32);
            iArr3[i2 + 7] = (int) j29;
            iArr3[i2 + 8] = (int) (j29 >>> 32);
            i2 = i3;
            j3 = j23;
            j = j19;
            j2 = j21;
            i = 8;
            c = ' ';
        }
    }

    public static void mul128(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr[0] & 4294967295L;
        long j2 = iArr[1] & 4294967295L;
        long j3 = iArr[2] & 4294967295L;
        long j4 = iArr[3] & 4294967295L;
        long j5 = iArr[4] & 4294967295L;
        long j6 = iArr[5] & 4294967295L;
        long j7 = iArr[6] & 4294967295L;
        long j8 = iArr[7] & 4294967295L;
        long j9 = iArr2[0] & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        char c = ' ';
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        int i2 = 4;
        while (i < i2) {
            long j18 = iArr2[i] & 4294967295L;
            long j19 = j;
            long j20 = (j18 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j20;
            int i3 = i + 1;
            long j21 = j2;
            long j22 = (j18 * j2) + (iArr3[i3] & 4294967295L) + (j20 >>> c);
            iArr3[i3] = (int) j22;
            long j23 = j3;
            long j24 = (j18 * j3) + (iArr3[r10] & 4294967295L) + (j22 >>> c);
            iArr3[i + 2] = (int) j24;
            long j25 = (j18 * j4) + (iArr3[r1] & 4294967295L) + (j24 >>> 32);
            iArr3[i + 3] = (int) j25;
            long j26 = (j18 * j5) + (iArr3[r1] & 4294967295L) + (j25 >>> 32);
            iArr3[i + 4] = (int) j26;
            long j27 = (j18 * j6) + (iArr3[r1] & 4294967295L) + (j26 >>> 32);
            iArr3[i + 5] = (int) j27;
            long j28 = (j18 * j7) + (iArr3[r1] & 4294967295L) + (j27 >>> 32);
            iArr3[i + 6] = (int) j28;
            long j29 = (j18 * j8) + (iArr3[r1] & 4294967295L) + (j28 >>> 32);
            iArr3[i + 7] = (int) j29;
            iArr3[i + 8] = (int) (j29 >>> 32);
            i = i3;
            j3 = j23;
            j = j19;
            j2 = j21;
            i2 = 4;
            c = ' ';
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & 4294967295L;
        long j2 = iArr[i2] & 4294967295L;
        long j3 = (j * j2) + (iArr2[i3] & 4294967295L);
        iArr3[i4] = (int) j3;
        long j4 = iArr[i2 + 1] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr2[i3 + 1] & 4294967295L) + (j3 >>> 32);
        iArr3[i4 + 1] = (int) j5;
        long j6 = iArr[i2 + 2] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr2[i3 + 2] & 4294967295L) + (j5 >>> 32);
        iArr3[i4 + 2] = (int) j7;
        long j8 = iArr[i2 + 3] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr2[i3 + 3] & 4294967295L) + (j7 >>> 32);
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr2[i3 + 4] & 4294967295L) + (j9 >>> 32);
        iArr3[i4 + 4] = (int) j11;
        long j12 = iArr[i2 + 5] & 4294967295L;
        long j13 = (j * j12) + j10 + (iArr2[i3 + 5] & 4294967295L) + (j11 >>> 32);
        iArr3[i4 + 5] = (int) j13;
        long j14 = iArr[i2 + 6] & 4294967295L;
        long j15 = (j * j14) + j12 + (iArr2[i3 + 6] & 4294967295L) + (j13 >>> 32);
        iArr3[i4 + 6] = (int) j15;
        long j16 = iArr[i2 + 7] & 4294967295L;
        long j17 = (j * j16) + j14 + (4294967295L & iArr2[i3 + 7]) + (j15 >>> 32);
        iArr3[i4 + 7] = (int) j17;
        return (j17 >>> 32) + j16;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & 4294967295L;
        long j3 = j & 4294967295L;
        long j4 = (j2 * j3) + (iArr[i2] & 4294967295L);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        long j7 = j6 + (iArr[r4] & 4294967295L) + (j4 >>> 32);
        iArr[i2 + 1] = (int) j7;
        long j8 = j5 + (iArr[r4] & 4294967295L) + (j7 >>> 32);
        iArr[i2 + 2] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i2 + 3] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = i & 4294967295L;
        long j2 = i2 & 4294967295L;
        long j3 = (j * j2) + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j3;
        long j4 = j2 + (iArr[r5] & 4294967295L) + (j3 >>> 32);
        iArr[i3 + 1] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[r0] & 4294967295L);
        iArr[i3 + 2] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & 4294967295L;
        long j2 = iArr2[i2 + 1] & 4294967295L;
        long j3 = iArr2[i2 + 2] & 4294967295L;
        long j4 = iArr2[i2 + 3] & 4294967295L;
        long j5 = iArr2[i2 + 4] & 4294967295L;
        long j6 = iArr2[i2 + 5] & 4294967295L;
        long j7 = iArr2[i2 + 6] & 4294967295L;
        long j8 = iArr2[i2 + 7] & 4294967295L;
        int i4 = i3;
        long j9 = 0;
        int i5 = 0;
        while (i5 < 8) {
            int i6 = i5;
            long j10 = iArr[i + i5] & 4294967295L;
            long j11 = j;
            long j12 = (j10 * j) + (iArr3[i4] & 4294967295L);
            long j13 = j8;
            iArr3[i4] = (int) j12;
            int i7 = i4 + 1;
            long j14 = j2;
            long j15 = (j10 * j2) + (iArr3[i7] & 4294967295L) + (j12 >>> 32);
            iArr3[i7] = (int) j15;
            long j16 = j15 >>> 32;
            long j17 = j3;
            long j18 = (j10 * j3) + (iArr3[r14] & 4294967295L) + j16;
            iArr3[i4 + 2] = (int) j18;
            long j19 = (j10 * j4) + (iArr3[r6] & 4294967295L) + (j18 >>> 32);
            iArr3[i4 + 3] = (int) j19;
            long j20 = (j10 * j5) + (iArr3[r6] & 4294967295L) + (j19 >>> 32);
            iArr3[i4 + 4] = (int) j20;
            long j21 = (j10 * j6) + (iArr3[r6] & 4294967295L) + (j20 >>> 32);
            iArr3[i4 + 5] = (int) j21;
            long j22 = j21 >>> 32;
            long j23 = (j10 * j7) + (iArr3[r4] & 4294967295L) + j22;
            iArr3[i4 + 6] = (int) j23;
            long j24 = (j10 * j13) + (iArr3[r4] & 4294967295L) + (j23 >>> 32);
            iArr3[i4 + 7] = (int) j24;
            long j25 = (j24 >>> 32) + (iArr3[r16] & 4294967295L) + j9;
            iArr3[i4 + 8] = (int) j25;
            j9 = j25 >>> 32;
            i5 = i6 + 1;
            j8 = j13;
            j = j11;
            i4 = i7;
            j2 = j14;
            j3 = j17;
        }
        return (int) j9;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr2[6] & 4294967295L;
        long j8 = iArr2[7] & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = j8;
            long j11 = iArr[i] & 4294967295L;
            long j12 = j;
            long j13 = (j11 * j) + (iArr3[i] & 4294967295L);
            iArr3[i] = (int) j13;
            int i2 = i + 1;
            long j14 = j2;
            long j15 = (j11 * j2) + (iArr3[i2] & 4294967295L) + (j13 >>> 32);
            iArr3[i2] = (int) j15;
            long j16 = (j11 * j3) + (iArr3[r25] & 4294967295L) + (j15 >>> 32);
            iArr3[i + 2] = (int) j16;
            long j17 = (j11 * j4) + (iArr3[r1] & 4294967295L) + (j16 >>> 32);
            iArr3[i + 3] = (int) j17;
            long j18 = (j11 * j5) + (iArr3[r1] & 4294967295L) + (j17 >>> 32);
            iArr3[i + 4] = (int) j18;
            long j19 = (j11 * j6) + (iArr3[r1] & 4294967295L) + (j18 >>> 32);
            iArr3[i + 5] = (int) j19;
            long j20 = (j11 * j7) + (iArr3[r1] & 4294967295L) + (j19 >>> 32);
            iArr3[i + 6] = (int) j20;
            long j21 = (j11 * j10) + (iArr3[r1] & 4294967295L) + (j20 >>> 32);
            iArr3[i + 7] = (int) j21;
            long j22 = (j21 >>> 32) + (iArr3[r2] & 4294967295L) + j9;
            iArr3[i + 8] = (int) j22;
            j9 = j22 >>> 32;
            i = i2;
            j8 = j10;
            j = j12;
            j2 = j14;
            j3 = j3;
        }
        return (int) j9;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j = i & 4294967295L;
        long j2 = (iArr[0] & 4294967295L) * j;
        iArr[0] = (int) j2;
        long j3 = ((iArr[1] & 4294967295L) * j) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = ((iArr[2] & 4294967295L) * j) + (j3 >>> 32);
        iArr[2] = (int) j4;
        long j5 = ((iArr[3] & 4294967295L) * j) + (j4 >>> 32);
        iArr[3] = (int) j5;
        long j6 = ((iArr[4] & 4294967295L) * j) + (j5 >>> 32);
        iArr[4] = (int) j6;
        long j7 = ((iArr[5] & 4294967295L) * j) + (j6 >>> 32);
        iArr[5] = (int) j7;
        long j8 = ((iArr[6] & 4294967295L) * j) + (j7 >>> 32);
        iArr[6] = (int) j8;
        long j9 = (j * (4294967295L & iArr[7])) + (j8 >>> 32);
        iArr[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j = i & 4294967295L;
        long j2 = ((iArr2[0] & 4294967295L) * j) + (iArr[0] & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((iArr2[1] & 4294967295L) * j) + (iArr[1] & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((iArr2[2] & 4294967295L) * j) + (iArr[2] & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((iArr2[3] & 4294967295L) * j) + (iArr[3] & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((iArr2[4] & 4294967295L) * j) + (iArr[4] & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((iArr2[5] & 4294967295L) * j) + (iArr[5] & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = ((iArr2[6] & 4294967295L) * j) + (iArr[6] & 4294967295L) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        long j9 = (j * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]) + (j8 >>> 32);
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = i & 4294967295L;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = ((iArr[i3] & 4294967295L) * j) + j2;
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 8);
        return (int) j2;
    }

    public static int mulWordAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = i & 4294967295L;
        long j2 = ((iArr[i2] & 4294967295L) * j) + (iArr2[i3] & 4294967295L);
        iArr2[i3] = (int) j2;
        long j3 = ((iArr[i2 + 1] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j2 >>> 32);
        iArr2[i3 + 1] = (int) j3;
        long j4 = ((iArr[i2 + 2] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j3 >>> 32);
        iArr2[i3 + 2] = (int) j4;
        long j5 = ((iArr[i2 + 3] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j4 >>> 32);
        iArr2[i3 + 3] = (int) j5;
        long j6 = ((iArr[i2 + 4] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j5 >>> 32);
        iArr2[i3 + 4] = (int) j6;
        long j7 = ((iArr[i2 + 5] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j6 >>> 32);
        iArr2[i3 + 5] = (int) j7;
        long j8 = ((iArr[i2 + 6] & 4294967295L) * j) + (iArr2[r8] & 4294967295L) + (j7 >>> 32);
        iArr2[i3 + 6] = (int) j8;
        long j9 = (j * (iArr[i2 + 7] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j8 >>> 32);
        iArr2[i3 + 7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & 4294967295L;
        long j3 = ((j & 4294967295L) * j2) + (iArr[i2] & 4294967295L);
        iArr[i2] = (int) j3;
        long j4 = j2 * (j >>> 32);
        long j5 = j4 + (iArr[r9] & 4294967295L) + (j3 >>> 32);
        iArr[i2 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = j6 + (iArr[r0] & 4294967295L);
        iArr[i2 + 2] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = iArr[i] & 4294967295L;
        int i3 = 0;
        int i4 = 16;
        int i5 = 7;
        while (true) {
            int i6 = i5 - 1;
            long j2 = iArr[i + i5] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[(i4 - 1) + i2] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 -= 2;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = ((i3 << 31) & 4294967295L) | (j4 >>> 33);
                iArr2[i2] = (int) j4;
                int i7 = 1 & ((int) (j4 >>> 32));
                long j6 = iArr[i + 1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i8 = (int) j7;
                iArr2[i2 + 1] = i7 | (i8 << 1);
                long j8 = iArr[i + 2] & 4294967295L;
                long j9 = (j8 * j) + (iArr2[r10] & 4294967295L) + (j7 >>> 32);
                int i9 = (int) j9;
                iArr2[i2 + 2] = (i8 >>> 31) | (i9 << 1);
                long m21450 = C8083.m21450(j8, j6, j9 >>> 32, iArr2[r9] & 4294967295L);
                long j10 = (iArr2[r21] & 4294967295L) + (m21450 >>> 32);
                long j11 = iArr[i + 3] & 4294967295L;
                long j12 = (iArr2[r33] & 4294967295L) + (j10 >>> 32);
                long j13 = (iArr2[r34] & 4294967295L) + (j12 >>> 32);
                long j14 = j12 & 4294967295L;
                long j15 = (j11 * j) + (m21450 & 4294967295L);
                int i10 = (int) j15;
                iArr2[i2 + 3] = (i9 >>> 31) | (i10 << 1);
                long m214502 = C8083.m21450(j11, j6, j15 >>> 32, j10 & 4294967295L);
                long m214503 = C8083.m21450(j11, j8, m214502 >>> 32, j14);
                long j16 = j13 + (m214503 >>> 32);
                long j17 = m214503 & 4294967295L;
                long j18 = iArr[i + 4] & 4294967295L;
                long j19 = (iArr2[r45] & 4294967295L) + (j16 >>> 32);
                long j20 = (iArr2[r46] & 4294967295L) + (j19 >>> 32);
                long j21 = j19 & 4294967295L;
                long j22 = (j18 * j) + (m214502 & 4294967295L);
                int i11 = (int) j22;
                iArr2[i2 + 4] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long m214504 = C8083.m21450(j18, j6, j22 >>> 32, j17);
                long m214505 = C8083.m21450(j18, j8, m214504 >>> 32, j16 & 4294967295L);
                long m214506 = C8083.m21450(j18, j11, m214505 >>> 32, j21);
                long j23 = m214505 & 4294967295L;
                long j24 = j20 + (m214506 >>> 32);
                long j25 = iArr[i + 5] & 4294967295L;
                long j26 = (iArr2[r21] & 4294967295L) + (j24 >>> 32);
                long j27 = (iArr2[r49] & 4294967295L) + (j26 >>> 32);
                long j28 = j26 & 4294967295L;
                long j29 = (j25 * j) + (m214504 & 4294967295L);
                int i13 = (int) j29;
                iArr2[i2 + 5] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long m214507 = C8083.m21450(j25, j6, j29 >>> 32, j23);
                long m214508 = C8083.m21450(j25, j8, m214507 >>> 32, m214506 & 4294967295L);
                long m214509 = C8083.m21450(j25, j11, m214508 >>> 32, j24 & 4294967295L);
                long j30 = m214508 & 4294967295L;
                long m2145010 = C8083.m21450(j25, j18, m214509 >>> 32, j28);
                long j31 = j27 + (m2145010 >>> 32);
                long j32 = m2145010 & 4294967295L;
                long j33 = iArr[i + 6] & 4294967295L;
                long j34 = (iArr2[r33] & 4294967295L) + (j31 >>> 32);
                long j35 = j31 & 4294967295L;
                long j36 = (iArr2[r50] & 4294967295L) + (j34 >>> 32);
                long j37 = j34 & 4294967295L;
                long j38 = (j33 * j) + (m214507 & 4294967295L);
                int i15 = (int) j38;
                iArr2[i2 + 6] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                long m2145011 = C8083.m21450(j33, j6, j38 >>> 32, j30);
                long m2145012 = C8083.m21450(j33, j8, m2145011 >>> 32, m214509 & 4294967295L);
                long m2145013 = C8083.m21450(j33, j11, m2145012 >>> 32, j32);
                long j39 = m2145012 & 4294967295L;
                long m2145014 = C8083.m21450(j33, j18, m2145013 >>> 32, j35);
                long j40 = m2145013 & 4294967295L;
                long m2145015 = C8083.m21450(j33, j25, m2145014 >>> 32, j37);
                long j41 = m2145014 & 4294967295L;
                long j42 = j36 + (m2145015 >>> 32);
                long j43 = iArr[i + 7] & 4294967295L;
                long j44 = (iArr2[r34] & 4294967295L) + (j42 >>> 32);
                long j45 = (iArr2[r51] & 4294967295L) + (j44 >>> 32);
                long j46 = 4294967295L & j44;
                long j47 = (j * j43) + (m2145011 & 4294967295L);
                int i17 = (int) j47;
                iArr2[i2 + 7] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                long m2145016 = C8083.m21450(j43, j6, j47 >>> 32, j39);
                long m2145017 = C8083.m21450(j43, j8, m2145016 >>> 32, j40);
                long m2145018 = C8083.m21450(j43, j11, m2145017 >>> 32, j41);
                long m2145019 = C8083.m21450(j43, j18, m2145018 >>> 32, m2145015 & 4294967295L);
                long m2145020 = C8083.m21450(j43, j25, m2145019 >>> 32, j42 & 4294967295L);
                long m2145021 = C8083.m21450(j43, j33, m2145020 >>> 32, j46);
                long j48 = j45 + (m2145021 >>> 32);
                int i19 = (int) m2145016;
                iArr2[i2 + 8] = (i19 << 1) | i18;
                int i20 = i19 >>> 31;
                int i21 = (int) m2145017;
                iArr2[i2 + 9] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) m2145018;
                iArr2[i2 + 10] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) m2145019;
                iArr2[i2 + 11] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) m2145020;
                iArr2[i2 + 12] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) m2145021;
                iArr2[i2 + 13] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j48;
                iArr2[i2 + 14] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = i2 + 15;
                iArr2[i33] = i32 | ((iArr2[i33] + ((int) (j48 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 16;
        int i2 = 7;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i3 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i3 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                long j6 = iArr[1] & 4294967295L;
                long j7 = j5 + (j6 * j);
                int i5 = (int) j7;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i5 << 1);
                long j8 = (iArr2[2] & 4294967295L) + (j7 >>> 32);
                long j9 = iArr[2] & 4294967295L;
                long j10 = (j9 * j) + j8;
                int i6 = (int) j10;
                iArr2[2] = (i6 << 1) | (i5 >>> 31);
                long m21450 = C8083.m21450(j9, j6, j10 >>> 32, iArr2[3] & 4294967295L);
                long j11 = (iArr2[4] & 4294967295L) + (m21450 >>> 32);
                long j12 = iArr[3] & 4294967295L;
                long j13 = (iArr2[5] & 4294967295L) + (j11 >>> 32);
                long j14 = j11 & 4294967295L;
                long j15 = (m21450 & 4294967295L) + (j12 * j);
                int i7 = (int) j15;
                iArr2[3] = (i6 >>> 31) | (i7 << 1);
                int i8 = i7 >>> 31;
                long m214502 = C8083.m21450(j12, j6, j15 >>> 32, j14);
                long m214503 = C8083.m21450(j12, j9, m214502 >>> 32, j13 & 4294967295L);
                long j16 = (iArr2[6] & 4294967295L) + (j13 >>> 32) + (m214503 >>> 32);
                long j17 = m214503 & 4294967295L;
                long j18 = iArr[4] & 4294967295L;
                long j19 = (j16 >>> 32) + (iArr2[7] & 4294967295L);
                long j20 = (iArr2[8] & 4294967295L) + (j19 >>> 32);
                long j21 = j19 & 4294967295L;
                long j22 = (j18 * j) + (m214502 & 4294967295L);
                int i9 = (int) j22;
                iArr2[4] = i8 | (i9 << 1);
                int i10 = i9 >>> 31;
                long m214504 = C8083.m21450(j18, j6, j22 >>> 32, j17);
                long m214505 = C8083.m21450(j18, j9, m214504 >>> 32, j16 & 4294967295L);
                long j23 = m214504 & 4294967295L;
                long m214506 = C8083.m21450(j18, j12, m214505 >>> 32, j21);
                long j24 = m214505 & 4294967295L;
                long j25 = j20 + (m214506 >>> 32);
                long j26 = iArr[5] & 4294967295L;
                long j27 = (j25 >>> 32) + (iArr2[9] & 4294967295L);
                long j28 = (iArr2[10] & 4294967295L) + (j27 >>> 32);
                long j29 = j27 & 4294967295L;
                long j30 = (j26 * j) + j23;
                int i11 = (int) j30;
                iArr2[5] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long m214507 = C8083.m21450(j26, j6, j30 >>> 32, j24);
                long m214508 = C8083.m21450(j26, j9, m214507 >>> 32, m214506 & 4294967295L);
                long m214509 = C8083.m21450(j26, j12, m214508 >>> 32, j25 & 4294967295L);
                long j31 = m214508 & 4294967295L;
                long m2145010 = C8083.m21450(j26, j18, m214509 >>> 32, j29);
                long j32 = j28 + (m2145010 >>> 32);
                long j33 = m2145010 & 4294967295L;
                long j34 = iArr[6] & 4294967295L;
                long j35 = (iArr2[11] & 4294967295L) + (j32 >>> 32);
                long j36 = (j34 * j) + (m214507 & 4294967295L);
                int i13 = (int) j36;
                iArr2[6] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long m2145011 = C8083.m21450(j34, j6, j36 >>> 32, j31);
                long m2145012 = C8083.m21450(j34, j9, m2145011 >>> 32, m214509 & 4294967295L);
                long m2145013 = C8083.m21450(j34, j12, m2145012 >>> 32, j33);
                long j37 = m2145012 & 4294967295L;
                long m2145014 = C8083.m21450(j34, j18, m2145013 >>> 32, j32 & 4294967295L);
                long j38 = m2145013 & 4294967295L;
                long m2145015 = C8083.m21450(j34, j26, m2145014 >>> 32, j35 & 4294967295L);
                long j39 = (iArr2[12] & 4294967295L) + (j35 >>> 32) + (m2145015 >>> 32);
                long j40 = iArr[7] & 4294967295L;
                long j41 = (iArr2[13] & 4294967295L) + (j39 >>> 32);
                long j42 = (iArr2[14] & 4294967295L) + (j41 >>> 32);
                long j43 = 4294967295L & j41;
                long j44 = (j * j40) + (m2145011 & 4294967295L);
                int i15 = (int) j44;
                iArr2[7] = i14 | (i15 << 1);
                long m2145016 = C8083.m21450(j40, j6, j44 >>> 32, j37);
                long m2145017 = C8083.m21450(j40, j9, m2145016 >>> 32, j38);
                long m2145018 = C8083.m21450(j40, j12, m2145017 >>> 32, m2145014 & 4294967295L);
                long m2145019 = C8083.m21450(j40, j18, m2145018 >>> 32, m2145015 & 4294967295L);
                long m2145020 = C8083.m21450(j40, j26, m2145019 >>> 32, j39 & 4294967295L);
                long m2145021 = C8083.m21450(j40, j34, m2145020 >>> 32, j43);
                long j45 = j42 + (m2145021 >>> 32);
                int i16 = (int) m2145016;
                iArr2[8] = (i15 >>> 31) | (i16 << 1);
                int i17 = (int) m2145017;
                iArr2[9] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) m2145018;
                iArr2[10] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) m2145019;
                iArr2[11] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) m2145020;
                iArr2[12] = i22 | (i23 << 1);
                int i24 = (int) m2145021;
                iArr2[13] = (i23 >>> 31) | (i24 << 1);
                int i25 = (int) j45;
                iArr2[14] = (i24 >>> 31) | (i25 << 1);
                iArr2[15] = (i25 >>> 31) | ((iArr2[15] + ((int) (j45 >>> 32))) << 1);
                return;
            }
            i2 = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & 4294967295L) - (iArr2[i2] & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L)) + (j >> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L)) + (j2 >> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L)) + (j3 >> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L)) + (j4 >> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = ((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L)) + (j5 >> 32);
        iArr3[i3 + 5] = (int) j6;
        long j7 = ((iArr[i + 6] & 4294967295L) - (iArr2[i2 + 6] & 4294967295L)) + (j6 >> 32);
        iArr3[i3 + 6] = (int) j7;
        long j8 = ((iArr[i + 7] & 4294967295L) - (iArr2[i2 + 7] & 4294967295L)) + (j7 >> 32);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        long j8 = ((iArr[7] & 4294967295L) - (iArr2[7] & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr3[0] & 4294967295L) - (iArr[0] & 4294967295L)) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((iArr3[1] & 4294967295L) - (iArr[1] & 4294967295L)) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = (((iArr3[2] & 4294967295L) - (iArr[2] & 4294967295L)) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = (((iArr3[3] & 4294967295L) - (iArr[3] & 4294967295L)) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = (((iArr3[4] & 4294967295L) - (iArr[4] & 4294967295L)) - (iArr2[4] & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = (((iArr3[5] & 4294967295L) - (iArr[5] & 4294967295L)) - (iArr2[5] & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = (((iArr3[6] & 4294967295L) - (iArr[6] & 4294967295L)) - (iArr2[6] & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        long j8 = (((iArr3[7] & 4294967295L) - (iArr[7] & 4294967295L)) - (iArr2[7] & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr2[i2] & 4294967295L) - (iArr[i] & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = ((iArr2[r5] & 4294967295L) - (iArr[i + 1] & 4294967295L)) + (j >> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = ((iArr2[r5] & 4294967295L) - (iArr[i + 2] & 4294967295L)) + (j2 >> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = ((iArr2[r5] & 4294967295L) - (iArr[i + 3] & 4294967295L)) + (j3 >> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = ((iArr2[r5] & 4294967295L) - (iArr[i + 4] & 4294967295L)) + (j4 >> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = ((iArr2[r5] & 4294967295L) - (iArr[i + 5] & 4294967295L)) + (j5 >> 32);
        iArr2[i2 + 5] = (int) j6;
        long j7 = ((iArr2[r5] & 4294967295L) - (iArr[i + 6] & 4294967295L)) + (j6 >> 32);
        iArr2[i2 + 6] = (int) j7;
        long j8 = ((iArr2[r13] & 4294967295L) - (iArr[i + 7] & 4294967295L)) + (j7 >> 32);
        iArr2[i2 + 7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = ((iArr2[i2] & 4294967295L) - (iArr[i] & 4294967295L)) + (i3 & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = j >> 32;
        long j3 = ((iArr2[r4] & 4294967295L) - (iArr[i + 1] & 4294967295L)) + j2;
        iArr2[i2 + 1] = (int) j3;
        long j4 = ((iArr2[r4] & 4294967295L) - (iArr[i + 2] & 4294967295L)) + (j3 >> 32);
        iArr2[i2 + 2] = (int) j4;
        long j5 = ((iArr2[r4] & 4294967295L) - (iArr[i + 3] & 4294967295L)) + (j4 >> 32);
        iArr2[i2 + 3] = (int) j5;
        long j6 = ((iArr2[r4] & 4294967295L) - (iArr[i + 4] & 4294967295L)) + (j5 >> 32);
        iArr2[i2 + 4] = (int) j6;
        long j7 = ((iArr2[r4] & 4294967295L) - (iArr[i + 5] & 4294967295L)) + (j6 >> 32);
        iArr2[i2 + 5] = (int) j7;
        long j8 = ((iArr2[r4] & 4294967295L) - (iArr[i + 6] & 4294967295L)) + (j7 >> 32);
        iArr2[i2 + 6] = (int) j8;
        long j9 = ((iArr2[r12] & 4294967295L) - (iArr[i + 7] & 4294967295L)) + (j8 >> 32);
        iArr2[i2 + 7] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        long j8 = ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j7 >> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2, int i) {
        long j = ((iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L)) + (i & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((iArr2[5] & 4294967295L) - (iArr[5] & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((iArr2[6] & 4294967295L) - (iArr[6] & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        long j8 = ((iArr2[7] & 4294967295L) - (4294967295L & iArr[7])) + (j7 >> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }
}
