package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import l.C19373;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.GF16;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class MayoSigner implements MessageSigner {
    public static final long EVEN_2BYTES = 281470681808895L;
    public static final long EVEN_BYTES = 71777214294589695L;
    public static final int F_TAIL_LEN = 4;
    public MayoParameters params;
    public MayoPrivateKeyParameters privKey;
    public MayoPublicKeyParameters pubKey;
    public SecureRandom random;

    public static long ctCompare64(int i, int i2) {
        return (-(i ^ i2)) >> 63;
    }

    public static void mVecMultiplyBins(int i, int i2, long[] jArr, long[] jArr2) {
        int i3 = i + i;
        int i4 = i3 + i;
        int i5 = i4 + i;
        int i6 = i5 + i;
        int i7 = i6 + i;
        int i8 = i7 + i;
        int i9 = i8 + i;
        int i10 = i9 + i;
        int i11 = i10 + i;
        int i12 = i11 + i;
        int i13 = i12 + i;
        int i14 = i13 + i;
        int i15 = i14 + i;
        int i16 = i15 + i;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i2) {
            int i19 = i18;
            int i20 = 0;
            while (i20 < i) {
                long j = jArr[i19 + i6];
                long j2 = j & GF16Utils.MASK_LSB;
                long j3 = (jArr[i19 + i11] ^ ((j & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j2 << 3) + j2);
                long j4 = jArr[i19 + i12];
                long j5 = (j4 & GF16Utils.MASK_MSB) >>> 3;
                long j6 = (jArr[i19 + i13] ^ ((j4 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j5 << 1) + j5);
                long j7 = j3 & GF16Utils.MASK_LSB;
                long j8 = (jArr[i19 + i8] ^ ((j3 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j7 << 3) + j7);
                long j9 = (j6 & GF16Utils.MASK_MSB) >>> 3;
                long j10 = (jArr[i19 + i7] ^ ((j6 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j9 << 1) + j9);
                long j11 = j8 & GF16Utils.MASK_LSB;
                long j12 = (jArr[i19 + i15] ^ ((j8 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j11 << 3) + j11);
                long j13 = (j10 & GF16Utils.MASK_MSB) >>> 3;
                long j14 = (jArr[i19 + i4] ^ ((j10 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j13 << 1) + j13);
                long j15 = j12 & GF16Utils.MASK_LSB;
                long j16 = (jArr[i19 + i16] ^ ((j12 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j15 << 3) + j15);
                long j17 = (j14 & GF16Utils.MASK_MSB) >>> 3;
                long j18 = (jArr[i19 + i9] ^ ((j14 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j17 << 1) + j17);
                long j19 = j16 & GF16Utils.MASK_LSB;
                long j20 = (jArr[i19 + i14] ^ ((j16 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j19 << 3) + j19);
                long j21 = (j18 & GF16Utils.MASK_MSB) >>> 3;
                long j22 = (jArr[i19 + i5] ^ ((j18 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j21 << 1) + j21);
                long j23 = j20 & GF16Utils.MASK_LSB;
                long j24 = (jArr[i19 + i10] ^ ((j20 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j23 << 3) + j23);
                long j25 = (j22 & GF16Utils.MASK_MSB) >>> 3;
                long j26 = (jArr[i19 + i3] ^ ((j22 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j25 << 1) + j25);
                long j27 = j24 & GF16Utils.MASK_LSB;
                long j28 = (jArr[i19 + i] ^ ((j24 & GF16Utils.NIBBLE_MASK_LSB) >>> 1)) ^ ((j27 << 3) + j27);
                long j29 = (j26 & GF16Utils.MASK_MSB) >>> 3;
                jArr2[(i18 >> 4) + i20] = (j28 ^ ((j26 & GF16Utils.NIBBLE_MASK_MSB) << 1)) ^ ((j29 << 1) + j29);
                i20++;
                i19++;
            }
            i17++;
            i18 += i << 4;
        }
    }

    public static void mayoGenericMCalculatePS(MayoParameters mayoParameters, long[] jArr, int i, int i2, byte[] bArr, int i3, int i4, int i5, long[] jArr2) {
        int i6 = i3;
        int i7 = i4;
        int i8 = i7 + i6;
        int mVecLimbs = mayoParameters.getMVecLimbs();
        long[] jArr3 = new long[((mayoParameters.getN() * (mayoParameters.getK() * mVecLimbs)) * mVecLimbs) << 4];
        int i9 = i7 * mVecLimbs;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < i6) {
            for (int i14 = i10; i14 < i6; i14++) {
                int i15 = 0;
                int i16 = 0;
                while (i15 < i5) {
                    Longs.xorTo(mVecLimbs, jArr, i12, jArr3, (((i13 + i15) << 4) + (bArr[i16 + i14] & 255)) * mVecLimbs);
                    i15++;
                    i16 += i8;
                    i9 = i9;
                }
                i12 += mVecLimbs;
            }
            int i17 = i9;
            int i18 = 0;
            int i19 = i11;
            while (i18 < i7) {
                int i20 = 0;
                int i21 = 0;
                while (i20 < i5) {
                    Longs.xorTo(mVecLimbs, jArr, i + i19, jArr3, (((i13 + i20) << 4) + (bArr[i21 + i18 + i6] & 255)) * mVecLimbs);
                    i20++;
                    i21 += i8;
                }
                i18++;
                i19 += mVecLimbs;
                i7 = i4;
            }
            i10++;
            i13 += i5;
            i11 += i17;
            i9 = i17;
            i7 = i4;
        }
        int i22 = i6 * i5;
        int i23 = 0;
        while (i6 < i8) {
            for (int i24 = i6; i24 < i8; i24++) {
                int i25 = 0;
                int i26 = 0;
                while (i25 < i5) {
                    Longs.xorTo(mVecLimbs, jArr, i2 + i23, jArr3, (((i22 + i25) << 4) + (bArr[i26 + i24] & 255)) * mVecLimbs);
                    i25++;
                    i26 += i8;
                }
                i23 += mVecLimbs;
            }
            i6++;
            i22 += i5;
        }
        mVecMultiplyBins(mVecLimbs, i8 * i5, jArr3, jArr2);
    }

    public static void mayoGenericMCalculateSPS(long[] jArr, byte[] bArr, int i, int i2, int i3, long[] jArr2) {
        int i4 = i2;
        int i5 = i4 * i4;
        long[] jArr3 = new long[(i * i5) << 4];
        int i6 = i4 * i;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i4) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i3) {
                int i12 = ((bArr[i8 + i10] & 255) * i) + i9;
                int i13 = 0;
                int i14 = 0;
                while (i13 < i4) {
                    Longs.xorTo(i, jArr, i11 + i14, jArr3, (i14 << 4) + i12);
                    i13++;
                    i14 += i;
                    i4 = i2;
                }
                i10++;
                i11 += i6;
                i4 = i2;
            }
            i7++;
            i8 += i3;
            i9 += i6 << 4;
            i4 = i2;
        }
        mVecMultiplyBins(i, i5, jArr3, jArr2);
    }

    public static int mulTable(int i) {
        int i2 = i * 134480385;
        int i3 = (-252645136) & i2;
        return (i2 ^ (i3 >>> 4)) ^ (i3 >>> 3);
    }

    public static void transpose16x16Nibbles(long[] jArr, int i) {
        for (int i2 = 0; i2 < 16; i2 += 2) {
            int i3 = i + i2;
            int i4 = i3 + 1;
            long j = jArr[i3];
            long j2 = ((j >>> 4) ^ jArr[i4]) & 1085102592571150095L;
            jArr[i3] = j ^ (j2 << 4);
            jArr[i4] = jArr[i4] ^ j2;
        }
        int i5 = i;
        for (int i6 = 0; i6 < 16; i6 += 4) {
            long j3 = jArr[i5];
            long j4 = ((j3 >>> 8) ^ jArr[i5 + 2]) & EVEN_BYTES;
            int i7 = i5 + 1;
            long j5 = EVEN_BYTES & ((jArr[i7] >>> 8) ^ jArr[i5 + 3]);
            jArr[i5] = j3 ^ (j4 << 8);
            int i8 = i5 + 2;
            jArr[i7] = jArr[i7] ^ (j5 << 8);
            int i9 = i5 + 3;
            jArr[i8] = j4 ^ jArr[i8];
            i5 += 4;
            jArr[i9] = jArr[i9] ^ j5;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i + i10;
            long j6 = jArr[i11];
            int i12 = i11 + 4;
            long j7 = ((j6 >>> 16) ^ jArr[i12]) & EVEN_2BYTES;
            int i13 = i11 + 8;
            int i14 = i11 + 12;
            long j8 = EVEN_2BYTES & ((jArr[i13] >>> 16) ^ jArr[i14]);
            jArr[i11] = j6 ^ (j7 << 16);
            jArr[i13] = jArr[i13] ^ (j8 << 16);
            jArr[i12] = jArr[i12] ^ j7;
            jArr[i14] = jArr[i14] ^ j8;
        }
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = i + i15;
            long j9 = jArr[i16];
            int i17 = i16 + 8;
            long j10 = ((j9 >>> 32) ^ jArr[i17]) & 4294967295L;
            jArr[i16] = j9 ^ (j10 << 32);
            jArr[i17] = jArr[i17] ^ j10;
        }
    }

    public static void vecMulAddU64(int i, long[] jArr, byte b, long[] jArr2) {
        int mulTable = mulTable(b & 255);
        for (int i2 = 0; i2 < i; i2++) {
            long j = jArr[i2];
            jArr2[i2] = ((((j >>> 3) & GF16Utils.MASK_LSB) * ((mulTable >>> 24) & 15)) ^ ((((j & GF16Utils.MASK_LSB) * (mulTable & 255)) ^ (((j >>> 1) & GF16Utils.MASK_LSB) * ((mulTable >>> 8) & 15))) ^ (((j >>> 2) & GF16Utils.MASK_LSB) * ((mulTable >>> 16) & 15)))) ^ jArr2[i2];
        }
    }

    public static void vecMulAddU64(int i, long[] jArr, byte b, long[] jArr2, int i2) {
        int mulTable = mulTable(b & 255);
        for (int i3 = 0; i3 < i; i3++) {
            long j = jArr[i3];
            int i4 = i2 + i3;
            jArr2[i4] = ((((j >>> 3) & GF16Utils.MASK_LSB) * ((mulTable >>> 24) & 15)) ^ ((((j & GF16Utils.MASK_LSB) * (mulTable & 255)) ^ (((j >>> 1) & GF16Utils.MASK_LSB) * ((mulTable >>> 8) & 15))) ^ (((j >>> 2) & GF16Utils.MASK_LSB) * ((mulTable >>> 16) & 15)))) ^ jArr2[i4];
        }
    }

    public void computeA(long[] jArr, byte[] bArr) {
        char c;
        int i;
        char c2;
        int k = this.params.getK();
        int o = this.params.getO();
        int m = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int aCols = this.params.getACols();
        int[] fTail = this.params.getFTail();
        int i2 = o * k;
        int i3 = o * mVecLimbs;
        int i4 = ((i2 + 15) >> 4) << 4;
        long[] jArr2 = new long[(((m + 7) >>> 3) * i4) << 4];
        int i5 = m & 15;
        if (i5 != 0) {
            long j = (1 << (i5 << 2)) - 1;
            int i6 = mVecLimbs - 1;
            int i7 = 0;
            c = 3;
            while (i7 < i2) {
                jArr[i6] = jArr[i6] & j;
                i7++;
                i6 += mVecLimbs;
            }
        } else {
            c = 3;
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i8 < k) {
            int i13 = k - 1;
            int i14 = i13 * i3;
            int i15 = i13 * o;
            int i16 = i13;
            int i17 = aCols;
            int i18 = i15;
            while (i16 >= i8) {
                int i19 = 0;
                char c3 = c;
                int i20 = 0;
                while (i20 < o) {
                    int i21 = m;
                    int[] iArr = fTail;
                    int i22 = 0;
                    int i23 = 0;
                    while (i23 < mVecLimbs) {
                        long j2 = jArr[i14 + i23 + i19];
                        int m44633 = C19373.m44633(i9, i20, i12, i22);
                        jArr2[m44633] = jArr2[m44633] ^ (j2 << i11);
                        if (i11 > 0) {
                            int i24 = m44633 + i4;
                            jArr2[i24] = jArr2[i24] ^ (j2 >>> (64 - i11));
                        }
                        i23++;
                        i22 += i4;
                    }
                    i20++;
                    i19 += mVecLimbs;
                    m = i21;
                    fTail = iArr;
                }
                int i25 = m;
                int[] iArr2 = fTail;
                if (i8 != i16) {
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < o) {
                        int i28 = 0;
                        int i29 = k;
                        int i30 = 0;
                        while (i30 < mVecLimbs) {
                            long j3 = jArr[i10 + i30 + i27];
                            int m446332 = C19373.m44633(i18, i26, i12, i28);
                            jArr2[m446332] = jArr2[m446332] ^ (j3 << i11);
                            if (i11 > 0) {
                                int i31 = m446332 + i4;
                                jArr2[i31] = jArr2[i31] ^ (j3 >>> (64 - i11));
                            }
                            i30++;
                            i28 += i4;
                        }
                        i26++;
                        i27 += mVecLimbs;
                        k = i29;
                    }
                }
                int i32 = k;
                i11 += 4;
                if (i11 == 64) {
                    i12 += i4;
                    i11 = 0;
                }
                i16--;
                i14 -= i3;
                i18 -= o;
                m = i25;
                k = i32;
                c = c3;
                fTail = iArr2;
            }
            i8++;
            i9 += o;
            i10 += i3;
            aCols = i17;
        }
        int i33 = k;
        int i34 = m;
        int i35 = aCols;
        int[] iArr3 = fTail;
        char c4 = c;
        int i36 = 0;
        while (true) {
            i = (i33 + 1) * i33;
            if (i36 >= ((((i >> 1) + i34) + 15) >>> 4) * i4) {
                break;
            }
            transpose16x16Nibbles(jArr2, i36);
            i36 += 16;
        }
        byte[] bArr2 = new byte[16];
        int i37 = 0;
        int i38 = 0;
        while (true) {
            c2 = 1;
            if (i37 >= 4) {
                break;
            }
            int i39 = iArr3[i37];
            bArr2[i38] = (byte) GF16.mul(i39, 1);
            bArr2[i38 + 1] = (byte) GF16.mul(i39, 2);
            int i40 = i38 + 3;
            bArr2[i38 + 2] = (byte) GF16.mul(i39, 4);
            i38 += 4;
            bArr2[i40] = (byte) GF16.mul(i39, 8);
            i37++;
        }
        int i41 = 0;
        while (i41 < i4) {
            int i42 = i34;
            while (i42 < (i >>> 1) + i34) {
                long j4 = jArr2[((i42 >>> 4) * i4) + i41 + (i42 & 15)];
                long j5 = j4 & GF16Utils.MASK_LSB;
                long j6 = (j4 >>> c2) & GF16Utils.MASK_LSB;
                long j7 = (j4 >>> 2) & GF16Utils.MASK_LSB;
                long j8 = (j4 >>> c4) & GF16Utils.MASK_LSB;
                int i43 = 0;
                int i44 = 0;
                while (i43 < 4) {
                    int i45 = (i42 + i43) - i34;
                    int i46 = ((i45 >> 4) * i4) + i41 + (i45 & 15);
                    jArr2[i46] = jArr2[i46] ^ ((((bArr2[i44] * j5) ^ (bArr2[i44 + 1] * j6)) ^ (bArr2[i44 + 2] * j7)) ^ (bArr2[i44 + 3] * j8));
                    i43++;
                    i44 += 4;
                    i = i;
                    i4 = i4;
                    j5 = j5;
                }
                i42++;
                c2 = 1;
            }
            i41 += 16;
            c2 = 1;
        }
        int i47 = i4;
        byte[] longToLittleEndian = Pack.longToLittleEndian(jArr2);
        for (int i48 = 0; i48 < i34; i48 += 16) {
            int i49 = 0;
            while (true) {
                int i50 = i35 - 1;
                if (i49 < i50) {
                    int i51 = 0;
                    while (true) {
                        int i52 = i51 + i48;
                        if (i52 < i34) {
                            GF16.decode(longToLittleEndian, ((((i48 * i47) >> 4) + i49) + i51) << 3, bArr, (i52 * i35) + i49, Math.min(16, i50 - i49));
                            i51++;
                        }
                    }
                    i49 += 16;
                }
            }
        }
    }

    public void computeRHS(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i;
        int[] iArr;
        int m = this.params.getM();
        int mVecLimbs = this.params.getMVecLimbs();
        int k = this.params.getK();
        int[] fTail = this.params.getFTail();
        int i2 = ((m - 1) & 15) << 2;
        int i3 = m & 15;
        int i4 = 0;
        if (i3 != 0) {
            long j = (1 << (i3 << 2)) - 1;
            int i5 = k * k;
            int i6 = mVecLimbs - 1;
            int i7 = 0;
            while (i7 < i5) {
                jArr[i6] = jArr[i6] & j;
                i7++;
                i6 += mVecLimbs;
            }
        }
        long[] jArr2 = new long[mVecLimbs];
        byte[] bArr3 = new byte[mVecLimbs << 3];
        int i8 = k * mVecLimbs;
        int i9 = k - 1;
        int i10 = i9 * mVecLimbs;
        int i11 = i10 * k;
        while (i9 >= 0) {
            int i12 = i9;
            int i13 = i10;
            int i14 = i11;
            while (i12 < k) {
                int i15 = mVecLimbs - 1;
                long j2 = jArr2[i15];
                int i16 = m;
                int i17 = (int) ((j2 >>> i2) & 15);
                jArr2[i15] = j2 << 4;
                for (int i18 = mVecLimbs - 2; i18 >= 0; i18--) {
                    int i19 = i18 + 1;
                    jArr2[i19] = jArr2[i19] ^ (jArr2[i18] >>> 60);
                    jArr2[i18] = jArr2[i18] << 4;
                }
                Pack.longToLittleEndian(jArr2, bArr3, i4);
                int i20 = 0;
                while (i20 < 4) {
                    int i21 = fTail[i20];
                    if (i21 == 0) {
                        i = k;
                        iArr = fTail;
                    } else {
                        i = k;
                        iArr = fTail;
                        long mul = GF16.mul(i17, i21);
                        if ((i20 & 1) == 0) {
                            int i22 = i20 >> 1;
                            bArr3[i22] = (byte) (bArr3[i22] ^ ((byte) (mul & 15)));
                        } else {
                            int i23 = i20 >> 1;
                            bArr3[i23] = (byte) (bArr3[i23] ^ ((byte) ((mul & 15) << 4)));
                        }
                    }
                    i20++;
                    k = i;
                    fTail = iArr;
                }
                int i24 = k;
                int[] iArr2 = fTail;
                Pack.littleEndianToLong(bArr3, 0, jArr2);
                int i25 = i11 + i13;
                int i26 = i14 + i10;
                boolean z = i9 == i12;
                for (int i27 = 0; i27 < mVecLimbs; i27++) {
                    long j3 = jArr[i25 + i27];
                    if (!z) {
                        j3 ^= jArr[i26 + i27];
                    }
                    jArr2[i27] = jArr2[i27] ^ j3;
                }
                i12++;
                i13 += mVecLimbs;
                i14 += i8;
                i4 = 0;
                k = i24;
                fTail = iArr2;
                m = i16;
            }
            i9--;
            i10 -= mVecLimbs;
            i11 -= i8;
            i4 = 0;
        }
        Pack.longToLittleEndian(jArr2, bArr3, 0);
        for (int i28 = 0; i28 < m; i28 += 2) {
            int i29 = i28 >> 1;
            bArr2[i28] = (byte) (bArr[i28] ^ (bArr3[i29] & 15));
            int i30 = i28 + 1;
            bArr2[i30] = (byte) (((bArr3[i29] >>> 4) & 15) ^ bArr[i30]);
        }
    }

    public void ef(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        int i5 = (i4 + 15) >> 4;
        long[] jArr = new long[i5];
        long[] jArr2 = new long[i5];
        long[] jArr3 = new long[i3 * i5];
        int i6 = 16;
        int k = (this.params.getK() * this.params.getO()) + 16;
        byte[] bArr3 = new byte[k >> 1];
        int i7 = k >> 4;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < i3) {
            int i11 = 0;
            while (i11 < i5) {
                long j = 0;
                int i12 = 0;
                while (i12 < i6) {
                    if ((i11 << 4) + i12 < i4) {
                        j |= (bArr2[r8 + i9] & 15) << (i12 << 2);
                    }
                    i12++;
                    i6 = 16;
                    bArr2 = bArr;
                }
                jArr3[i11 + i10] = j;
                i11++;
                i6 = 16;
                bArr2 = bArr;
            }
            i8++;
            i9 += i4;
            i10 += i5;
            i6 = 16;
            bArr2 = bArr;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i4) {
            int max = Math.max(0, (i13 + i3) - i4);
            int i15 = i3 - 1;
            int min = Math.min(i15, i13);
            Arrays.clear(jArr);
            Arrays.clear(jArr2);
            int min2 = Math.min(i15, min + 32);
            int i16 = max * i5;
            long j2 = -1;
            int i17 = max;
            int i18 = 0;
            while (i17 <= min2) {
                int i19 = min2;
                long j3 = ~ctCompare64(i17, i14);
                int i20 = i7;
                byte[] bArr4 = bArr3;
                long j4 = (i14 - i17) >> 63;
                for (int i21 = 0; i21 < i5; i21++) {
                    jArr[i21] = jArr[i21] ^ ((j3 | (j4 & j2)) & jArr3[i16 + i21]);
                }
                i18 = (int) ((jArr[i13 >>> 4] >>> ((i13 & 15) << 2)) & 15);
                j2 = ~((-i18) >> 63);
                i17++;
                i16 += i5;
                min2 = i19;
                bArr3 = bArr4;
                i7 = i20;
            }
            int i22 = i7;
            byte[] bArr5 = bArr3;
            vecMulAddU64(i5, jArr, GF16.inv((byte) i18), jArr2);
            int i23 = i17;
            int i24 = i16;
            while (i23 <= min) {
                int i25 = min;
                long j5 = (~ctCompare64(i23, i14)) & (~j2);
                long j6 = ~j5;
                long j7 = j2;
                int i26 = i24;
                int i27 = 0;
                while (i27 < i5) {
                    jArr3[i26] = (j6 & jArr3[i26]) | (j5 & jArr2[i27]);
                    i27++;
                    i26++;
                }
                i23++;
                i24 += i5;
                min = i25;
                j2 = j7;
            }
            int i28 = i17;
            int i29 = i16;
            while (i28 < i) {
                vecMulAddU64(i5, jArr2, (byte) ((i28 > i14 ? -1 : 0) & ((int) ((jArr3[(i13 >>> 4) + i29] >>> ((i13 & 15) << 2)) & 15))), jArr3, i29);
                i28++;
                i29 += i5;
            }
            if (i18 != 0) {
                i14++;
            }
            i13++;
            i4 = i2;
            i3 = i;
            bArr3 = bArr5;
            i7 = i22;
        }
        int i30 = i3;
        int i31 = i7;
        byte[] bArr6 = bArr3;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (i34 < i30) {
            Pack.longToLittleEndian(jArr3, i32, i31, bArr6, 0);
            GF16.decode(bArr6, 0, bArr, i33, i2);
            i33 += i2;
            i34++;
            i32 += i5;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        byte[] bArr10;
        byte[] bArr11;
        byte[] bArr12;
        int i;
        byte[] bArr13;
        int i2;
        byte[] bArr14;
        byte[] bArr15;
        byte[] bArr16;
        byte[] bArr17;
        byte[] bArr18;
        byte[] bArr19;
        int i3;
        int i4;
        int i5;
        byte[] bArr20;
        byte[] bArr21;
        int i6;
        int i7;
        int i8;
        byte[] bArr22;
        int i9;
        int i10;
        int i11;
        MayoSigner mayoSigner = this;
        int k = mayoSigner.params.getK();
        int v = mayoSigner.params.getV();
        int o = mayoSigner.params.getO();
        int n = mayoSigner.params.getN();
        int m = mayoSigner.params.getM();
        int vBytes = mayoSigner.params.getVBytes();
        int oBytes = mayoSigner.params.getOBytes();
        int saltBytes = mayoSigner.params.getSaltBytes();
        int mVecLimbs = mayoSigner.params.getMVecLimbs();
        int p1Limbs = mayoSigner.params.getP1Limbs();
        int pkSeedBytes = mayoSigner.params.getPkSeedBytes();
        int digestBytes = mayoSigner.params.getDigestBytes();
        int skSeedBytes = mayoSigner.params.getSkSeedBytes();
        byte[] bArr23 = new byte[mayoSigner.params.getMBytes()];
        byte[] bArr24 = new byte[m];
        byte[] bArr25 = new byte[m];
        byte[] bArr26 = new byte[saltBytes];
        int i12 = k * vBytes;
        int rBytes = mayoSigner.params.getRBytes() + i12;
        int i13 = i12;
        byte[] bArr27 = new byte[rBytes];
        int i14 = v * k;
        int i15 = rBytes;
        byte[] bArr28 = new byte[i14];
        int i16 = k * o;
        int i17 = k * n;
        int i18 = i16 + 1;
        byte[] bArr29 = new byte[((m + 7) / 8) * 8 * i18];
        byte[] bArr30 = new byte[i18];
        byte[] bArr31 = new byte[i17];
        int i19 = digestBytes + saltBytes;
        byte[] bArr32 = new byte[i17];
        int i20 = i19 + skSeedBytes;
        int i21 = i17;
        int i22 = i20 + 1;
        byte[] bArr33 = bArr23;
        byte[] bArr34 = new byte[i22];
        int i23 = i22;
        int sigBytes = mayoSigner.params.getSigBytes();
        byte[] bArr35 = new byte[sigBytes];
        int i24 = sigBytes;
        long[] jArr = new long[mayoSigner.params.getP2Limbs() + p1Limbs];
        int i25 = v * o;
        byte[] bArr36 = new byte[i25];
        long[] jArr2 = new long[i16 * mVecLimbs];
        int i26 = i16;
        long[] jArr3 = new long[k * k * mVecLimbs];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        try {
            byte[] seedSk = mayoSigner.privKey.getSeedSk();
            int i27 = oBytes + pkSeedBytes;
            int i28 = k;
            byte[] bArr37 = new byte[i27];
            try {
                sHAKEDigest.update(seedSk, 0, seedSk.length);
                sHAKEDigest.doFinal(bArr37, 0, i27);
                GF16.decode(bArr37, pkSeedBytes, bArr36, 0, i25);
                Utils.expandP1P2(mayoSigner.params, jArr, bArr37);
                int i29 = o * mVecLimbs;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i30 < v) {
                    byte[] bArr38 = seedSk;
                    int i34 = i31;
                    int i35 = i32;
                    int i36 = i30;
                    while (i36 < v) {
                        if (i36 == i30) {
                            i33 += mVecLimbs;
                            i11 = v;
                        } else {
                            i11 = v;
                            int i37 = p1Limbs;
                            int i38 = 0;
                            while (i38 < o) {
                                GF16Utils.mVecMulAdd(mVecLimbs, jArr, i33, bArr36[i34 + i38], jArr, i32 + i37);
                                GF16Utils.mVecMulAdd(mVecLimbs, jArr, i33, bArr36[i31 + i38], jArr, i35 + i37);
                                i38++;
                                i37 += mVecLimbs;
                            }
                            i33 += mVecLimbs;
                        }
                        i36++;
                        i34 += o;
                        i35 += i29;
                        v = i11;
                    }
                    i30++;
                    i31 += o;
                    i32 += i29;
                    seedSk = bArr38;
                }
                byte[] bArr39 = seedSk;
                int i39 = v;
                Arrays.fill(bArr37, (byte) 0);
                sHAKEDigest.update(bArr, 0, bArr.length);
                sHAKEDigest.doFinal(bArr34, 0, digestBytes);
                bArr26 = bArr26;
                mayoSigner.random.nextBytes(bArr26);
                int i40 = saltBytes;
                System.arraycopy(bArr26, 0, bArr34, digestBytes, i40);
                System.arraycopy(bArr39, 0, bArr34, i19, skSeedBytes);
                int i41 = i20;
                sHAKEDigest.update(bArr34, 0, i41);
                sHAKEDigest.doFinal(bArr26, 0, i40);
                System.arraycopy(bArr26, 0, bArr34, digestBytes, i40);
                sHAKEDigest.update(bArr34, 0, i19);
                byte[] bArr40 = bArr33;
                try {
                    sHAKEDigest.doFinal(bArr40, 0, mayoSigner.params.getMBytes());
                    byte[] bArr41 = bArr24;
                    try {
                        GF16.decode(bArr40, bArr41, m);
                        long[] jArr4 = new long[i14 * mVecLimbs];
                        int i42 = i39;
                        byte[] bArr42 = new byte[i42];
                        int i43 = 0;
                        while (true) {
                            if (i43 > 255) {
                                i = i40;
                                bArr13 = bArr42;
                                i2 = i42;
                                bArr14 = bArr26;
                                bArr15 = bArr34;
                                bArr16 = bArr40;
                                bArr5 = bArr41;
                                bArr4 = bArr25;
                                bArr6 = bArr27;
                                bArr7 = bArr28;
                                bArr17 = bArr29;
                                bArr18 = bArr30;
                                bArr19 = bArr31;
                                i3 = i21;
                                i4 = i24;
                                i5 = i28;
                                break;
                            }
                            try {
                                bArr34[i41] = (byte) i43;
                                i6 = 0;
                                i7 = i41;
                                i8 = i23;
                                sHAKEDigest.update(bArr34, 0, i8);
                                bArr22 = bArr34;
                                bArr6 = bArr27;
                                i9 = i15;
                            } catch (Throwable th) {
                                th = th;
                                bArr14 = bArr26;
                                bArr15 = bArr34;
                                bArr16 = bArr40;
                                bArr5 = bArr41;
                                bArr4 = bArr25;
                                bArr6 = bArr27;
                            }
                            try {
                                sHAKEDigest.doFinal(bArr6, 0, i9);
                                i15 = i9;
                                i5 = i28;
                                while (true) {
                                    i10 = i43;
                                    if (i6 >= i5) {
                                        break;
                                    }
                                    byte[] bArr43 = bArr42;
                                    bArr33 = bArr40;
                                    bArr7 = bArr28;
                                    try {
                                        GF16.decode(bArr6, i6 * vBytes, bArr7, i6 * i42, i42);
                                        i6++;
                                        bArr28 = bArr7;
                                        i43 = i10;
                                        bArr42 = bArr43;
                                        bArr40 = bArr33;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bArr2 = bArr26;
                                        bArr5 = bArr41;
                                        bArr3 = bArr22;
                                        bArr4 = bArr25;
                                        bArr10 = bArr29;
                                        bArr9 = bArr30;
                                        bArr8 = bArr31;
                                        bArr11 = bArr32;
                                        bArr12 = bArr33;
                                        Arrays.fill(bArr12, (byte) 0);
                                        Arrays.fill(bArr5, (byte) 0);
                                        Arrays.fill(bArr4, (byte) 0);
                                        Arrays.fill(bArr2, (byte) 0);
                                        Arrays.fill(bArr6, (byte) 0);
                                        Arrays.fill(bArr7, (byte) 0);
                                        Arrays.fill(bArr10, (byte) 0);
                                        Arrays.fill(bArr8, (byte) 0);
                                        Arrays.fill(bArr9, (byte) 0);
                                        Arrays.fill(bArr11, (byte) 0);
                                        Arrays.fill(bArr3, (byte) 0);
                                        throw th;
                                    }
                                }
                                bArr13 = bArr42;
                                byte[] bArr44 = bArr40;
                                bArr7 = bArr28;
                                SHAKEDigest sHAKEDigest2 = sHAKEDigest;
                                byte[] bArr45 = bArr41;
                                bArr17 = bArr29;
                                i2 = i42;
                                long[] jArr5 = jArr4;
                                long[] jArr6 = jArr2;
                                i = i40;
                                bArr14 = bArr26;
                                bArr4 = bArr25;
                                bArr31 = bArr31;
                                int i44 = i13;
                                i3 = i21;
                                long[] jArr7 = jArr;
                                i4 = i24;
                                bArr15 = bArr22;
                                bArr16 = bArr44;
                                bArr5 = bArr45;
                                try {
                                    GF16Utils.mulAddMatXMMat(mVecLimbs, bArr7, jArr, p1Limbs, jArr6, i5, i2, o);
                                    GF16Utils.mulAddMUpperTriangularMatXMatTrans(mVecLimbs, jArr7, bArr7, jArr5, i2, i5);
                                    GF16Utils.mulAddMatXMMat(mVecLimbs, bArr7, jArr5, jArr3, i5, i2);
                                    long[] jArr8 = jArr3;
                                    mayoSigner.computeRHS(jArr8, bArr5, bArr4);
                                    mayoSigner.computeA(jArr6, bArr17);
                                    bArr6 = bArr6;
                                    bArr18 = bArr30;
                                    int i45 = i26;
                                    try {
                                        GF16.decode(bArr6, i44, bArr18, 0, i45);
                                        bArr19 = bArr31;
                                        try {
                                            if (mayoSigner.sampleSolution(bArr17, bArr4, bArr18, bArr19)) {
                                                break;
                                            }
                                            Arrays.fill(jArr6, 0L);
                                            Arrays.fill(jArr8, 0L);
                                            mayoSigner = this;
                                            jArr3 = jArr8;
                                            jArr2 = jArr6;
                                            i26 = i45;
                                            bArr31 = bArr19;
                                            bArr30 = bArr18;
                                            bArr27 = bArr6;
                                            i28 = i5;
                                            bArr29 = bArr17;
                                            i42 = i2;
                                            i23 = i8;
                                            i24 = i4;
                                            jArr = jArr7;
                                            jArr4 = jArr5;
                                            i41 = i7;
                                            bArr26 = bArr14;
                                            i21 = i3;
                                            bArr34 = bArr15;
                                            i43 = i10 + 1;
                                            bArr25 = bArr4;
                                            i13 = i44;
                                            bArr28 = bArr7;
                                            bArr41 = bArr5;
                                            bArr42 = bArr13;
                                            sHAKEDigest = sHAKEDigest2;
                                            i40 = i;
                                            bArr40 = bArr16;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bArr9 = bArr18;
                                            bArr10 = bArr17;
                                            bArr11 = bArr32;
                                            bArr2 = bArr14;
                                            bArr12 = bArr16;
                                            bArr8 = bArr19;
                                            bArr3 = bArr15;
                                            Arrays.fill(bArr12, (byte) 0);
                                            Arrays.fill(bArr5, (byte) 0);
                                            Arrays.fill(bArr4, (byte) 0);
                                            Arrays.fill(bArr2, (byte) 0);
                                            Arrays.fill(bArr6, (byte) 0);
                                            Arrays.fill(bArr7, (byte) 0);
                                            Arrays.fill(bArr10, (byte) 0);
                                            Arrays.fill(bArr8, (byte) 0);
                                            Arrays.fill(bArr9, (byte) 0);
                                            Arrays.fill(bArr11, (byte) 0);
                                            Arrays.fill(bArr3, (byte) 0);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bArr19 = bArr31;
                                        bArr9 = bArr18;
                                        bArr10 = bArr17;
                                        bArr11 = bArr32;
                                        bArr2 = bArr14;
                                        bArr12 = bArr16;
                                        bArr8 = bArr19;
                                        bArr3 = bArr15;
                                        Arrays.fill(bArr12, (byte) 0);
                                        Arrays.fill(bArr5, (byte) 0);
                                        Arrays.fill(bArr4, (byte) 0);
                                        Arrays.fill(bArr2, (byte) 0);
                                        Arrays.fill(bArr6, (byte) 0);
                                        Arrays.fill(bArr7, (byte) 0);
                                        Arrays.fill(bArr10, (byte) 0);
                                        Arrays.fill(bArr8, (byte) 0);
                                        Arrays.fill(bArr9, (byte) 0);
                                        Arrays.fill(bArr11, (byte) 0);
                                        Arrays.fill(bArr3, (byte) 0);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bArr6 = bArr6;
                                    bArr18 = bArr30;
                                    bArr19 = bArr31;
                                    bArr9 = bArr18;
                                    bArr10 = bArr17;
                                    bArr11 = bArr32;
                                    bArr2 = bArr14;
                                    bArr12 = bArr16;
                                    bArr8 = bArr19;
                                    bArr3 = bArr15;
                                    Arrays.fill(bArr12, (byte) 0);
                                    Arrays.fill(bArr5, (byte) 0);
                                    Arrays.fill(bArr4, (byte) 0);
                                    Arrays.fill(bArr2, (byte) 0);
                                    Arrays.fill(bArr6, (byte) 0);
                                    Arrays.fill(bArr7, (byte) 0);
                                    Arrays.fill(bArr10, (byte) 0);
                                    Arrays.fill(bArr8, (byte) 0);
                                    Arrays.fill(bArr9, (byte) 0);
                                    Arrays.fill(bArr11, (byte) 0);
                                    Arrays.fill(bArr3, (byte) 0);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                bArr14 = bArr26;
                                bArr16 = bArr40;
                                bArr5 = bArr41;
                                bArr15 = bArr22;
                                bArr4 = bArr25;
                                bArr7 = bArr28;
                                bArr17 = bArr29;
                                bArr18 = bArr30;
                                bArr19 = bArr31;
                                bArr9 = bArr18;
                                bArr10 = bArr17;
                                bArr11 = bArr32;
                                bArr2 = bArr14;
                                bArr12 = bArr16;
                                bArr8 = bArr19;
                                bArr3 = bArr15;
                                Arrays.fill(bArr12, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr7, (byte) 0);
                                Arrays.fill(bArr10, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr11, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                throw th;
                            }
                        }
                        int i46 = 0;
                        int i47 = 0;
                        int i48 = 0;
                        int i49 = 0;
                        while (i48 < i5) {
                            int i50 = i5;
                            int i51 = i49;
                            bArr21 = bArr17;
                            bArr8 = bArr19;
                            bArr20 = bArr18;
                            try {
                                GF16Utils.matMul(bArr36, bArr19, i49, bArr13, o, i2);
                                Bytes.xor(i2, bArr7, i46, bArr13, bArr32, i47);
                                bArr11 = bArr32;
                            } catch (Throwable th7) {
                                th = th7;
                                bArr11 = bArr32;
                                bArr10 = bArr21;
                                bArr2 = bArr14;
                                bArr12 = bArr16;
                                bArr3 = bArr15;
                                bArr9 = bArr20;
                                Arrays.fill(bArr12, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr7, (byte) 0);
                                Arrays.fill(bArr10, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr11, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                throw th;
                            }
                            try {
                                System.arraycopy(bArr8, i51, bArr11, i47 + i2, o);
                                i48++;
                                i49 = i51 + o;
                                i47 += n;
                                i46 += i2;
                                bArr32 = bArr11;
                                bArr19 = bArr8;
                                bArr17 = bArr21;
                                i5 = i50;
                                bArr18 = bArr20;
                            } catch (Throwable th8) {
                                th = th8;
                                bArr10 = bArr21;
                                bArr2 = bArr14;
                                bArr12 = bArr16;
                                bArr3 = bArr15;
                                bArr9 = bArr20;
                                Arrays.fill(bArr12, (byte) 0);
                                Arrays.fill(bArr5, (byte) 0);
                                Arrays.fill(bArr4, (byte) 0);
                                Arrays.fill(bArr2, (byte) 0);
                                Arrays.fill(bArr6, (byte) 0);
                                Arrays.fill(bArr7, (byte) 0);
                                Arrays.fill(bArr10, (byte) 0);
                                Arrays.fill(bArr8, (byte) 0);
                                Arrays.fill(bArr9, (byte) 0);
                                Arrays.fill(bArr11, (byte) 0);
                                Arrays.fill(bArr3, (byte) 0);
                                throw th;
                            }
                        }
                        bArr20 = bArr18;
                        bArr21 = bArr17;
                        bArr11 = bArr32;
                        bArr8 = bArr19;
                        GF16.encode(bArr11, bArr35, i3);
                        bArr2 = bArr14;
                    } catch (Throwable th9) {
                        th = th9;
                        bArr2 = bArr26;
                        bArr3 = bArr34;
                        bArr12 = bArr40;
                        bArr5 = bArr41;
                        bArr4 = bArr25;
                        bArr6 = bArr27;
                        bArr7 = bArr28;
                        bArr10 = bArr29;
                        bArr9 = bArr30;
                        bArr8 = bArr31;
                        bArr11 = bArr32;
                        Arrays.fill(bArr12, (byte) 0);
                        Arrays.fill(bArr5, (byte) 0);
                        Arrays.fill(bArr4, (byte) 0);
                        Arrays.fill(bArr2, (byte) 0);
                        Arrays.fill(bArr6, (byte) 0);
                        Arrays.fill(bArr7, (byte) 0);
                        Arrays.fill(bArr10, (byte) 0);
                        Arrays.fill(bArr8, (byte) 0);
                        Arrays.fill(bArr9, (byte) 0);
                        Arrays.fill(bArr11, (byte) 0);
                        Arrays.fill(bArr3, (byte) 0);
                        throw th;
                    }
                    try {
                        System.arraycopy(bArr2, 0, bArr35, i4 - i, i);
                        byte[] concatenate = Arrays.concatenate(bArr35, bArr);
                        Arrays.fill(bArr16, (byte) 0);
                        Arrays.fill(bArr5, (byte) 0);
                        Arrays.fill(bArr4, (byte) 0);
                        Arrays.fill(bArr2, (byte) 0);
                        Arrays.fill(bArr6, (byte) 0);
                        Arrays.fill(bArr7, (byte) 0);
                        Arrays.fill(bArr21, (byte) 0);
                        Arrays.fill(bArr8, (byte) 0);
                        Arrays.fill(bArr20, (byte) 0);
                        Arrays.fill(bArr11, (byte) 0);
                        Arrays.fill(bArr15, (byte) 0);
                        return concatenate;
                    } catch (Throwable th10) {
                        th = th10;
                        bArr10 = bArr21;
                        bArr12 = bArr16;
                        bArr3 = bArr15;
                        bArr9 = bArr20;
                        Arrays.fill(bArr12, (byte) 0);
                        Arrays.fill(bArr5, (byte) 0);
                        Arrays.fill(bArr4, (byte) 0);
                        Arrays.fill(bArr2, (byte) 0);
                        Arrays.fill(bArr6, (byte) 0);
                        Arrays.fill(bArr7, (byte) 0);
                        Arrays.fill(bArr10, (byte) 0);
                        Arrays.fill(bArr8, (byte) 0);
                        Arrays.fill(bArr9, (byte) 0);
                        Arrays.fill(bArr11, (byte) 0);
                        Arrays.fill(bArr3, (byte) 0);
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    bArr2 = bArr26;
                    bArr3 = bArr34;
                    bArr12 = bArr40;
                    bArr4 = bArr25;
                    bArr5 = bArr24;
                }
            } catch (Throwable th12) {
                th = th12;
                bArr3 = bArr34;
                bArr4 = bArr25;
                bArr5 = bArr24;
                bArr6 = bArr27;
                bArr7 = bArr28;
                bArr10 = bArr29;
                bArr9 = bArr30;
                bArr8 = bArr31;
                bArr11 = bArr32;
                bArr12 = bArr33;
                bArr2 = bArr26;
            }
        } catch (Throwable th13) {
            th = th13;
            bArr2 = bArr26;
            bArr3 = bArr34;
            bArr4 = bArr25;
            bArr5 = bArr24;
            bArr6 = bArr27;
            bArr7 = bArr28;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (!z) {
            MayoPublicKeyParameters mayoPublicKeyParameters = (MayoPublicKeyParameters) cipherParameters;
            this.pubKey = mayoPublicKeyParameters;
            this.params = mayoPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
            return;
        }
        this.pubKey = null;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (MayoPrivateKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.privKey = (MayoPrivateKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        this.params = this.privKey.getParameters();
    }

    public boolean sampleSolution(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i;
        int i2;
        byte[] bArr5 = bArr4;
        int k = this.params.getK();
        int o = this.params.getO();
        int m = this.params.getM();
        int aCols = this.params.getACols();
        int i3 = k * o;
        System.arraycopy(bArr3, 0, bArr5, 0, i3);
        byte[] bArr6 = new byte[m];
        int i4 = i3 + 1;
        GF16Utils.matMul(bArr, bArr3, 0, bArr6, i4, m);
        int i5 = 0;
        int i6 = i3;
        while (i5 < m) {
            bArr[i6] = (byte) (bArr2[i5] ^ bArr6[i5]);
            i5++;
            i6 += i4;
        }
        ef(bArr, m, aCols);
        int i7 = m - 1;
        int i8 = i7 * aCols;
        int i9 = 0;
        boolean z = false;
        int i10 = i8;
        while (true) {
            i = aCols - 1;
            boolean z2 = true;
            if (i9 >= i) {
                break;
            }
            if (bArr[i10] == 0) {
                z2 = false;
            }
            z |= z2;
            i9++;
            i10++;
        }
        if (!z) {
            return false;
        }
        while (i7 >= 0) {
            int min = Math.min((32 / (m - i7)) + i7, i3);
            byte b = 0;
            int i11 = i7;
            while (i11 <= min) {
                byte b2 = (byte) ((-(bArr[i8 + i11] & 255)) >> 31);
                byte b3 = (byte) ((~b) & b2 & bArr[(i8 + aCols) - 1]);
                bArr5[i11] = (byte) (bArr5[i11] ^ b3);
                int i12 = 0;
                int i13 = i11;
                int i14 = i;
                while (i12 < i7) {
                    int i15 = 0;
                    int i16 = min;
                    int i17 = m;
                    long j = 0;
                    int i18 = 0;
                    while (true) {
                        i2 = 8;
                        if (i18 >= 8) {
                            break;
                        }
                        j ^= (bArr[i13 + i15] & 255) << (i18 << 3);
                        i18++;
                        i15 += aCols;
                        i8 = i8;
                    }
                    int i19 = i8;
                    long mulFx8 = GF16Utils.mulFx8(b3, j);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i2) {
                        int i22 = i14 + i21;
                        bArr[i22] = (byte) (bArr[i22] ^ ((byte) ((mulFx8 >> (i20 << 3)) & 15)));
                        i20++;
                        i21 += aCols;
                        i2 = 8;
                        mulFx8 = mulFx8;
                    }
                    i12 += 8;
                    int i23 = aCols << 3;
                    i13 += i23;
                    i14 += i23;
                    min = i16;
                    i8 = i19;
                    m = i17;
                }
                b = (byte) (b | b2);
                i11++;
                bArr5 = bArr4;
            }
            i7--;
            i8 -= aCols;
            bArr5 = bArr4;
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        int m = this.params.getM();
        int n = this.params.getN();
        int k = this.params.getK();
        int i = k * n;
        int p1Limbs = this.params.getP1Limbs();
        int p2Limbs = this.params.getP2Limbs();
        int p3Limbs = this.params.getP3Limbs();
        int mBytes = this.params.getMBytes();
        int sigBytes = this.params.getSigBytes();
        int digestBytes = this.params.getDigestBytes();
        int saltBytes = this.params.getSaltBytes();
        int mVecLimbs = this.params.getMVecLimbs();
        byte[] bArr3 = new byte[mBytes];
        byte[] bArr4 = new byte[m];
        byte[] bArr5 = new byte[m << 1];
        byte[] bArr6 = new byte[i];
        int i2 = p1Limbs + p2Limbs;
        long[] jArr = new long[i2 + p3Limbs];
        byte[] bArr7 = new byte[digestBytes + saltBytes];
        byte[] encoded = this.pubKey.getEncoded();
        Utils.expandP1P2(this.params, jArr, encoded);
        Utils.unpackMVecs(encoded, this.params.getPkSeedBytes(), jArr, i2, p3Limbs / mVecLimbs, m);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        sHAKEDigest.doFinal(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr7, 0, digestBytes);
        sHAKEDigest.update(bArr2, sigBytes - saltBytes, saltBytes);
        sHAKEDigest.doFinal(bArr3, 0, mBytes);
        GF16.decode(bArr3, bArr4, m);
        GF16.decode(bArr2, bArr6, i);
        long[] jArr2 = new long[k * k * mVecLimbs];
        long[] jArr3 = new long[i * mVecLimbs];
        MayoParameters mayoParameters = this.params;
        mayoGenericMCalculatePS(mayoParameters, jArr, p1Limbs, i2, bArr6, mayoParameters.getV(), this.params.getO(), k, jArr3);
        mayoGenericMCalculateSPS(jArr3, bArr6, mVecLimbs, k, n, jArr2);
        computeRHS(jArr2, new byte[m], bArr5);
        return Arrays.constantTimeAreEqual(m, bArr5, 0, bArr4, 0);
    }
}
