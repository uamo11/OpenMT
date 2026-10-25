package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes2.dex */
public abstract class Scalar25519 {
    public static final int L0 = -50998291;
    public static final int L1 = 19280294;
    public static final int L2 = 127719000;
    public static final int L3 = -6428113;
    public static final int L4 = 5343;
    public static final long M08L = 255;
    public static final long M28L = 268435455;
    public static final long M32L = 4294967295L;
    public static final int SCALAR_BYTES = 32;
    public static final int SIZE = 8;
    public static final int TARGET_LENGTH = 254;
    public static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    public static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    public static void getOrderWnafVar(int i, byte[] bArr) {
        Wnaf.getSignedVar(L, i, bArr);
    }

    public static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[48];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce384(bArr), iArr3);
    }

    public static byte[] reduce384(byte[] bArr) {
        long decode24 = Codec.decode24(bArr, 32) << 4;
        long j = decode24 & 4294967295L;
        long decode32 = Codec.decode32(bArr, 35);
        long j2 = decode32 & 4294967295L;
        long decode242 = Codec.decode24(bArr, 39) << 4;
        long j3 = decode242 & 4294967295L;
        long decode322 = Codec.decode32(bArr, 42);
        long decode16 = (4294967295L & (Codec.decode16(bArr, 46) << 4)) + ((decode322 & 4294967295L) >> 28);
        long j4 = (decode322 & 268435455) + (j3 >> 28);
        long decode323 = ((Codec.decode32(bArr, 21) & 4294967295L) - (decode16 * 127719000)) - (j4 * (-6428113));
        long decode243 = (((Codec.decode24(bArr, 25) << 4) & 4294967295L) - (decode16 * (-6428113))) - (j4 * 5343);
        long j5 = (decode242 & 268435455) + (j2 >> 28);
        long decode244 = (((Codec.decode24(bArr, 11) << 4) & 4294967295L) - (j4 * (-50998291))) - (j5 * 19280294);
        long decode324 = (((Codec.decode32(bArr, 14) & 4294967295L) - (decode16 * (-50998291))) - (j4 * 19280294)) - (j5 * 127719000);
        long decode245 = ((((Codec.decode24(bArr, 18) << 4) & 4294967295L) - (decode16 * 19280294)) - (j4 * 127719000)) - (j5 * (-6428113));
        long j6 = (decode32 & 268435455) + (j >> 28);
        long decode246 = ((Codec.decode24(bArr, 4) << 4) & 4294967295L) - (j6 * (-50998291));
        long decode325 = ((Codec.decode32(bArr, 7) & 4294967295L) - (j5 * (-50998291))) - (j6 * 19280294);
        long j7 = decode244 - (j6 * 127719000);
        long j8 = decode324 - (j6 * (-6428113));
        long j9 = decode245 - (j6 * 5343);
        long decode326 = ((Codec.decode32(bArr, 28) & 4294967295L) - (decode16 * 5343)) + (decode243 >> 28);
        long j10 = (decode24 & 268435455) + (decode326 >> 28);
        long j11 = decode326 & 268435455;
        long j12 = j11 >>> 27;
        long j13 = j10 + j12;
        long decode327 = (Codec.decode32(bArr, 0) & 4294967295L) - (j13 * (-50998291));
        long j14 = (decode246 - (j13 * 19280294)) + (decode327 >> 28);
        long j15 = (decode325 - (j13 * 127719000)) + (j14 >> 28);
        long j16 = (j7 - (j13 * (-6428113))) + (j15 >> 28);
        long j17 = (j8 - (j13 * 5343)) + (j16 >> 28);
        long j18 = j9 + (j17 >> 28);
        long j19 = (decode323 - (j5 * 5343)) + (j18 >> 28);
        long j20 = (decode243 & 268435455) + (j19 >> 28);
        long j21 = j11 + (j20 >> 28);
        long j22 = (j21 >> 28) - j12;
        long j23 = (decode327 & 268435455) + (j22 & (-50998291));
        long j24 = (j14 & 268435455) + (j22 & 19280294) + (j23 >> 28);
        long j25 = (j15 & 268435455) + (j22 & 127719000) + (j24 >> 28);
        long j26 = (j16 & 268435455) + (j22 & (-6428113)) + (j25 >> 28);
        long j27 = (j17 & 268435455) + (j22 & 5343) + (j26 >> 28);
        long j28 = (j18 & 268435455) + (j27 >> 28);
        long j29 = (j19 & 268435455) + (j28 >> 28);
        long j30 = (j20 & 268435455) + (j29 >> 28);
        byte[] bArr2 = new byte[64];
        Codec.encode56(((j24 & 268435455) << 28) | (j23 & 268435455), bArr2, 0);
        Codec.encode56((j25 & 268435455) | ((j26 & 268435455) << 28), bArr2, 7);
        Codec.encode56(((j28 & 268435455) << 28) | (j27 & 268435455), bArr2, 14);
        Codec.encode56((j29 & 268435455) | ((j30 & 268435455) << 28), bArr2, 21);
        Codec.encode32((int) ((j21 & 268435455) + (j30 >> 28)), bArr2, 28);
        return bArr2;
    }

    public static byte[] reduce512(byte[] bArr) {
        long decode32 = Codec.decode32(bArr, 49);
        long j = decode32 & 4294967295L;
        long decode322 = Codec.decode32(bArr, 56);
        long j2 = decode322 & 4294967295L;
        long j3 = bArr[63] & 255;
        long decode24 = (4294967295L & (Codec.decode24(bArr, 60) << 4)) + (j2 >> 28);
        long j4 = decode322 & 268435455;
        long decode323 = (Codec.decode32(bArr, 28) & 4294967295L) - (decode24 * (-50998291));
        long decode242 = (((Codec.decode24(bArr, 32) << 4) & 4294967295L) - (j3 * (-50998291))) - (decode24 * 19280294);
        long decode324 = ((Codec.decode32(bArr, 42) & 4294967295L) - (j3 * (-6428113))) - (decode24 * 5343);
        long decode243 = ((((Codec.decode24(bArr, 39) << 4) & 4294967295L) - (j3 * 127719000)) - (decode24 * (-6428113))) - (j4 * 5343);
        long decode244 = ((Codec.decode24(bArr, 53) << 4) & 4294967295L) + (j >> 28);
        long j5 = decode32 & 268435455;
        long decode325 = ((((Codec.decode32(bArr, 35) & 4294967295L) - (j3 * 19280294)) - (decode24 * 127719000)) - (j4 * (-6428113))) - (decode244 * 5343);
        long decode245 = ((((Codec.decode24(bArr, 25) << 4) & 4294967295L) - (j4 * (-50998291))) - (decode244 * 19280294)) - (j5 * 127719000);
        long j6 = ((decode242 - (j4 * 127719000)) - (decode244 * (-6428113))) - (j5 * 5343);
        long decode246 = (((Codec.decode24(bArr, 46) << 4) & 4294967295L) - (j3 * 5343)) + (decode324 >> 28);
        long decode326 = (Codec.decode32(bArr, 14) & 4294967295L) - (decode246 * (-50998291));
        long decode247 = (((Codec.decode24(bArr, 18) << 4) & 4294967295L) - (j5 * (-50998291))) - (decode246 * 19280294);
        long decode327 = (((Codec.decode32(bArr, 21) & 4294967295L) - (decode244 * (-50998291))) - (j5 * 19280294)) - (decode246 * 127719000);
        long j7 = decode245 - (decode246 * (-6428113));
        long j8 = (((decode323 - (j4 * 19280294)) - (decode244 * 127719000)) - (j5 * (-6428113))) - (decode246 * 5343);
        long j9 = (decode324 & 268435455) + (decode243 >> 28);
        long j10 = decode243 & 268435455;
        long decode248 = ((Codec.decode24(bArr, 11) << 4) & 4294967295L) - (j9 * (-50998291));
        long j11 = decode326 - (j9 * 19280294);
        long j12 = decode247 - (j9 * 127719000);
        long j13 = decode327 - (j9 * (-6428113));
        long j14 = j7 - (j9 * 5343);
        long j15 = j10 + (decode325 >> 28);
        long j16 = decode325 & 268435455;
        long decode328 = (Codec.decode32(bArr, 7) & 4294967295L) - (j15 * (-50998291));
        long j17 = decode248 - (j15 * 19280294);
        long j18 = j11 - (j15 * 127719000);
        long j19 = j12 - (j15 * (-6428113));
        long j20 = j13 - (j15 * 5343);
        long j21 = j16 + (j6 >> 28);
        long j22 = j8 + (j14 >> 28);
        long j23 = j22 & 268435455;
        long j24 = j23 >>> 27;
        long j25 = (j6 & 268435455) + (j22 >> 28) + j24;
        long decode329 = (Codec.decode32(bArr, 0) & 4294967295L) - (j25 * (-50998291));
        long decode249 = ((((Codec.decode24(bArr, 4) << 4) & 4294967295L) - (j21 * (-50998291))) - (j25 * 19280294)) + (decode329 >> 28);
        long j26 = decode329 & 268435455;
        long j27 = ((decode328 - (j21 * 19280294)) - (j25 * 127719000)) + (decode249 >> 28);
        long j28 = ((j17 - (j21 * 127719000)) - (j25 * (-6428113))) + (j27 >> 28);
        long j29 = ((j18 - (j21 * (-6428113))) - (j25 * 5343)) + (j28 >> 28);
        long j30 = (j19 - (j21 * 5343)) + (j29 >> 28);
        long j31 = j29 & 268435455;
        long j32 = j20 + (j30 >> 28);
        long j33 = (j14 & 268435455) + (j32 >> 28);
        long j34 = j23 + (j33 >> 28);
        long j35 = (j34 >> 28) - j24;
        long j36 = j26 + (j35 & (-50998291));
        long j37 = (decode249 & 268435455) + (j35 & 19280294) + (j36 >> 28);
        long j38 = (j27 & 268435455) + (j35 & 127719000) + (j37 >> 28);
        long j39 = (j28 & 268435455) + (j35 & (-6428113)) + (j38 >> 28);
        long j40 = j31 + (j35 & 5343) + (j39 >> 28);
        long j41 = (j30 & 268435455) + (j40 >> 28);
        long j42 = (j32 & 268435455) + (j41 >> 28);
        long j43 = (j33 & 268435455) + (j42 >> 28);
        byte[] bArr2 = new byte[32];
        Codec.encode56((j36 & 268435455) | ((j37 & 268435455) << 28), bArr2, 0);
        Codec.encode56(((j39 & 268435455) << 28) | (j38 & 268435455), bArr2, 7);
        Codec.encode56(((j41 & 268435455) << 28) | (j40 & 268435455), bArr2, 14);
        Codec.encode56((j42 & 268435455) | ((j43 & 268435455) << 28), bArr2, 21);
        Codec.encode32((int) ((j34 & 268435455) + (j43 >> 28)), bArr2, 28);
        return bArr2;
    }

    public static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[16];
        int[] iArr9 = new int[4];
        System.arraycopy(iArr7, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        System.arraycopy(iArr, 0, iArr10, 0, 4);
        int[] iArr11 = new int[4];
        iArr11[0] = 1;
        int i3 = 1016;
        int[] iArr12 = new int[4];
        int[] iArr13 = iArr9;
        int[] iArr14 = iArr10;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int i4 = 15;
        while (bitLengthPositive > 254) {
            int i5 = i3 - 1;
            if (i5 < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i4, iArr6) - bitLengthPositive;
            int i6 = bitLength & (~(bitLength >> 31));
            if (iArr6[i4] < 0) {
                i = i4;
                i2 = bitLengthPositive;
                ScalarUtil.addShifted_NP(i4, i6, iArr4, iArr5, iArr6, iArr8);
                ScalarUtil.addShifted_UV(3, i6, iArr13, iArr12, iArr14, iArr11);
            } else {
                i = i4;
                i2 = bitLengthPositive;
                ScalarUtil.subShifted_NP(i, i6, iArr4, iArr5, iArr6, iArr8);
                ScalarUtil.subShifted_UV(3, i6, iArr13, iArr12, iArr14, iArr11);
            }
            int i7 = i;
            if (ScalarUtil.lessThan(i7, iArr4, iArr5)) {
                i4 = i2 >>> 5;
                bitLengthPositive = ScalarUtil.getBitLengthPositive(i4, iArr4);
                i3 = i5;
                int[] iArr15 = iArr12;
                iArr12 = iArr11;
                iArr11 = iArr15;
                int[] iArr16 = iArr5;
                iArr5 = iArr4;
                iArr4 = iArr16;
                int[] iArr17 = iArr13;
                iArr13 = iArr14;
                iArr14 = iArr17;
            } else {
                i4 = i7;
                i3 = i5;
                bitLengthPositive = i2;
            }
        }
        System.arraycopy(iArr14, 0, iArr2, 0, 4);
        System.arraycopy(iArr11, 0, iArr3, 0, 4);
        return true;
    }

    public static void toSignedDigits(int i, int[] iArr) {
        Nat.caddTo(8, (~iArr[0]) & 1, L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
    }
}
