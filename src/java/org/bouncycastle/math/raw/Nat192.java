package org.bouncycastle.math.raw;

import java.math.BigInteger;
import l.C8083;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public abstract class Nat192 {
    public static final long M = 4294967295L;

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
        return (int) (j6 >>> 32);
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
        return (int) (j6 >>> 32);
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
        long j6 = (iArr[i + 5] & 4294967295L) + (4294967295L & iArr2[r12]) + (j5 >>> 32);
        iArr2[i2 + 5] = (int) j6;
        return (int) (j6 >>> 32);
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
        long j6 = (iArr[5] & 4294967295L) + (4294967295L & iArr2[5]) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        return (int) (j6 >>> 32);
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
        long j6 = (iArr[r12] & 4294967295L) + (4294967295L & iArr2[r14]) + (j5 >>> 32);
        int i8 = (int) j6;
        iArr[i + 5] = i8;
        iArr2[i2 + 5] = i8;
        return (int) (j6 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
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
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        for (int i = 0; i < 6; i++) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        for (int i = 0; i < 3; i++) {
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
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
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
        for (int i = 5; i >= 0; i--) {
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
        for (int i = 1; i < 6; i++) {
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
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 3; i++) {
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
        long j7 = iArr[i] & 4294967295L;
        long j8 = j7 * j;
        iArr3[i3] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[i3 + 1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[i3 + 2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[i3 + 3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[i3 + 4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[i3 + 5] = (int) j13;
        iArr3[i3 + 6] = (int) (j13 >>> 32);
        int i4 = i3;
        int i5 = 1;
        while (i5 < 6) {
            int i6 = i4 + 1;
            long j14 = iArr[i + i5] & 4294967295L;
            int i7 = i5;
            long j15 = (j14 * j) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j15;
            long j16 = j6;
            long j17 = (j14 * j2) + (iArr3[r15] & 4294967295L) + (j15 >>> 32);
            iArr3[i4 + 2] = (int) j17;
            long j18 = (j14 * j3) + (iArr3[r15] & 4294967295L) + (j17 >>> 32);
            iArr3[i4 + 3] = (int) j18;
            long j19 = (j14 * j4) + (iArr3[r2] & 4294967295L) + (j18 >>> 32);
            iArr3[i4 + 4] = (int) j19;
            long j20 = (j14 * j5) + (iArr3[r2] & 4294967295L) + (j19 >>> 32);
            iArr3[i4 + 5] = (int) j20;
            long j21 = (j14 * j16) + (iArr3[r2] & 4294967295L) + (j20 >>> 32);
            iArr3[i4 + 6] = (int) j21;
            iArr3[i4 + 7] = (int) (j21 >>> 32);
            i5 = i7 + 1;
            i4 = i6;
            j3 = j3;
            j6 = j16;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr[0] & 4294967295L;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        char c = ' ';
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        int i = 6;
        iArr3[6] = (int) (j13 >>> 32);
        int i2 = 1;
        while (i2 < i) {
            long j14 = iArr[i2] & 4294967295L;
            long j15 = j;
            long j16 = (j14 * j) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j16;
            int i3 = i2 + 1;
            long j17 = j2;
            long j18 = (j14 * j2) + (iArr3[i3] & 4294967295L) + (j16 >>> c);
            iArr3[i3] = (int) j18;
            long j19 = j3;
            long j20 = (j14 * j3) + (iArr3[r8] & 4294967295L) + (j18 >>> c);
            iArr3[i2 + 2] = (int) j20;
            long j21 = (j14 * j4) + (iArr3[r1] & 4294967295L) + (j20 >>> 32);
            iArr3[i2 + 3] = (int) j21;
            long j22 = (j14 * j5) + (iArr3[r1] & 4294967295L) + (j21 >>> 32);
            iArr3[i2 + 4] = (int) j22;
            long j23 = (j14 * j6) + (iArr3[r1] & 4294967295L) + (j22 >>> 32);
            iArr3[i2 + 5] = (int) j23;
            iArr3[i2 + 6] = (int) (j23 >>> 32);
            i2 = i3;
            j3 = j19;
            j = j15;
            j2 = j17;
            i = 6;
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
        long j13 = (j * j12) + j10 + (4294967295L & iArr2[i3 + 5]) + (j11 >>> 32);
        iArr3[i4 + 5] = (int) j13;
        return (j13 >>> 32) + j12;
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
        return Nat.incAt(6, iArr, i2, 4);
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
        return Nat.incAt(6, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & 4294967295L;
        long j2 = iArr2[i2 + 1] & 4294967295L;
        long j3 = iArr2[i2 + 2] & 4294967295L;
        long j4 = iArr2[i2 + 3] & 4294967295L;
        long j5 = iArr2[i2 + 4] & 4294967295L;
        long j6 = iArr2[i2 + 5] & 4294967295L;
        long j7 = 0;
        int i4 = 0;
        int i5 = i3;
        while (i4 < 6) {
            long j8 = iArr[i + i4] & 4294967295L;
            long j9 = j;
            long j10 = (j8 * j) + (iArr3[i5] & 4294967295L);
            int i6 = i4;
            iArr3[i5] = (int) j10;
            int i7 = i5 + 1;
            long j11 = j2;
            long j12 = (j8 * j2) + (iArr3[i7] & 4294967295L) + (j10 >>> 32);
            iArr3[i7] = (int) j12;
            long j13 = j3;
            long j14 = (j8 * j3) + (iArr3[r21] & 4294967295L) + (j12 >>> 32);
            iArr3[i5 + 2] = (int) j14;
            long j15 = (j8 * j4) + (iArr3[r6] & 4294967295L) + (j14 >>> 32);
            iArr3[i5 + 3] = (int) j15;
            long j16 = (j8 * j5) + (iArr3[r6] & 4294967295L) + (j15 >>> 32);
            iArr3[i5 + 4] = (int) j16;
            long j17 = j16 >>> 32;
            long j18 = (j8 * j6) + (iArr3[r4] & 4294967295L) + j17;
            iArr3[i5 + 5] = (int) j18;
            long j19 = (j18 >>> 32) + (iArr3[r14] & 4294967295L) + j7;
            iArr3[i5 + 6] = (int) j19;
            j7 = j19 >>> 32;
            i5 = i7;
            j4 = j4;
            j2 = j11;
            j3 = j13;
            i4 = i6 + 1;
            j = j9;
        }
        return (int) j7;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = 0;
        while (i < 6) {
            long j8 = j6;
            long j9 = iArr[i] & 4294967295L;
            long j10 = j;
            long j11 = (iArr3[i] & 4294967295L) + (j9 * j);
            iArr3[i] = (int) j11;
            int i2 = i + 1;
            long j12 = j2;
            long j13 = (j11 >>> 32) + (j9 * j2) + (iArr3[i2] & 4294967295L);
            iArr3[i2] = (int) j13;
            long j14 = j3;
            long j15 = (j9 * j3) + (iArr3[r15] & 4294967295L) + (j13 >>> 32);
            iArr3[i + 2] = (int) j15;
            long j16 = (j9 * j4) + (iArr3[r7] & 4294967295L) + (j15 >>> 32);
            iArr3[i + 3] = (int) j16;
            long j17 = (j9 * j5) + (iArr3[r7] & 4294967295L) + (j16 >>> 32);
            iArr3[i + 4] = (int) j17;
            long j18 = j17 >>> 32;
            long j19 = (j9 * j8) + (iArr3[r5] & 4294967295L) + j18;
            iArr3[i + 5] = (int) j19;
            long j20 = (j19 >>> 32) + (iArr3[r0] & 4294967295L) + j7;
            iArr3[i + 6] = (int) j20;
            j7 = j20 >>> 32;
            j4 = j4;
            j6 = j8;
            j = j10;
            i = i2;
            j2 = j12;
            j3 = j14;
        }
        return (int) j7;
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
        } while (i3 < 6);
        return (int) j2;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
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
        long j7 = (j * (iArr[i2 + 5] & 4294967295L)) + (iArr2[r15] & 4294967295L) + (j6 >>> 32);
        iArr2[i3 + 5] = (int) j7;
        return (int) (j7 >>> 32);
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
        return Nat.incAt(6, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = iArr[i] & 4294967295L;
        int i3 = 0;
        int i4 = 12;
        int i5 = 5;
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
                long j19 = (iArr2[r43] & 4294967295L) + (j16 >>> 32);
                long j20 = (iArr2[r44] & 4294967295L) + (j19 >>> 32);
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
                long j27 = (j * j25) + (m214504 & 4294967295L);
                int i13 = (int) j27;
                iArr2[i2 + 5] = (i13 << 1) | i12;
                long m214507 = C8083.m21450(j25, j6, j27 >>> 32, j23);
                long m214508 = C8083.m21450(j25, j8, m214507 >>> 32, m214506 & 4294967295L);
                long m214509 = C8083.m21450(j25, j11, m214508 >>> 32, j24 & 4294967295L);
                long m2145010 = C8083.m21450(j25, j18, m214509 >>> 32, j26 & 4294967295L);
                long j28 = (iArr2[r45] & 4294967295L) + (j26 >>> 32) + (m2145010 >>> 32);
                int i14 = (int) m214507;
                iArr2[i2 + 6] = (i14 << 1) | (i13 >>> 31);
                int i15 = i14 >>> 31;
                int i16 = (int) m214508;
                iArr2[i2 + 7] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) m214509;
                iArr2[i2 + 8] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) m2145010;
                iArr2[i2 + 9] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j28;
                iArr2[i2 + 10] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = i2 + 11;
                iArr2[i24] = i23 | ((iArr2[i24] + ((int) (j28 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 12;
        int i2 = 5;
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
                long m214502 = C8083.m21450(j12, j6, j15 >>> 32, j14);
                long m214503 = C8083.m21450(j12, j9, m214502 >>> 32, j13 & 4294967295L);
                long j16 = (iArr2[6] & 4294967295L) + (j13 >>> 32) + (m214503 >>> 32);
                long j17 = iArr[4] & 4294967295L;
                long j18 = (iArr2[7] & 4294967295L) + (j16 >>> 32);
                long j19 = j16 & 4294967295L;
                long j20 = (m214502 & 4294967295L) + (j17 * j);
                int i8 = (int) j20;
                iArr2[4] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long m214504 = C8083.m21450(j17, j6, j20 >>> 32, m214503 & 4294967295L);
                long m214505 = C8083.m21450(j17, j9, m214504 >>> 32, j19);
                long j21 = m214504 & 4294967295L;
                long m214506 = C8083.m21450(j17, j12, m214505 >>> 32, j18 & 4294967295L);
                long j22 = m214505 & 4294967295L;
                long j23 = (iArr2[8] & 4294967295L) + (j18 >>> 32) + (m214506 >>> 32);
                long j24 = iArr[5] & 4294967295L;
                long j25 = (iArr2[9] & 4294967295L) + (j23 >>> 32);
                long j26 = (iArr2[10] & 4294967295L) + (j25 >>> 32);
                long j27 = 4294967295L & j25;
                long j28 = (j * j24) + j21;
                int i10 = (int) j28;
                iArr2[5] = i9 | (i10 << 1);
                long m214507 = C8083.m21450(j24, j6, j28 >>> 32, j22);
                long m214508 = C8083.m21450(j24, j9, m214507 >>> 32, m214506 & 4294967295L);
                long m214509 = C8083.m21450(j24, j12, m214508 >>> 32, j23 & 4294967295L);
                long m2145010 = C8083.m21450(j24, j17, m214509 >>> 32, j27);
                long j29 = j26 + (m2145010 >>> 32);
                int i11 = (int) m214507;
                iArr2[6] = (i10 >>> 31) | (i11 << 1);
                int i12 = (int) m214508;
                iArr2[7] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) m214509;
                iArr2[8] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) m2145010;
                iArr2[9] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j29;
                iArr2[10] = i17 | (i18 << 1);
                iArr2[11] = (i18 >>> 31) | ((iArr2[11] + ((int) (j29 >>> 32))) << 1);
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
        return (int) (j6 >> 32);
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
        return (int) (j6 >> 32);
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
        return (int) (j6 >> 32);
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
        long j6 = ((iArr2[r13] & 4294967295L) - (iArr[i + 5] & 4294967295L)) + (j5 >> 32);
        iArr2[i2 + 5] = (int) j6;
        return (int) (j6 >> 32);
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
        long j6 = ((iArr2[5] & 4294967295L) - (4294967295L & iArr[5])) + (j5 >> 32);
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (2 - i) << 3);
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
    }
}
