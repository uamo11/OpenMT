package org.bouncycastle.crypto.engines;

import l.C20177;
import l.C3200;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.util.Pack;

/* loaded from: classes.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    public static final long C_240 = 2004413935125273122L;
    public static final int MAX_ROUNDS = 80;
    public static int[] MOD17 = null;
    public static int[] MOD3 = null;
    public static int[] MOD5 = null;
    public static int[] MOD9 = null;
    public static final int ROUNDS_1024 = 80;
    public static final int ROUNDS_256 = 72;
    public static final int ROUNDS_512 = 72;
    public static final int TWEAK_SIZE_BYTES = 16;
    public static final int TWEAK_SIZE_WORDS = 2;
    public int blocksizeBytes;
    public int blocksizeWords;
    public ThreefishCipher cipher;
    public long[] currentBlock;
    public boolean forEncryption;
    public long[] kw;
    public long[] t;

    public final class Threefish1024Cipher extends ThreefishCipher {
        public static final int ROTATION_0_0 = 24;
        public static final int ROTATION_0_1 = 13;
        public static final int ROTATION_0_2 = 8;
        public static final int ROTATION_0_3 = 47;
        public static final int ROTATION_0_4 = 8;
        public static final int ROTATION_0_5 = 17;
        public static final int ROTATION_0_6 = 22;
        public static final int ROTATION_0_7 = 37;
        public static final int ROTATION_1_0 = 38;
        public static final int ROTATION_1_1 = 19;
        public static final int ROTATION_1_2 = 10;
        public static final int ROTATION_1_3 = 55;
        public static final int ROTATION_1_4 = 49;
        public static final int ROTATION_1_5 = 18;
        public static final int ROTATION_1_6 = 23;
        public static final int ROTATION_1_7 = 52;
        public static final int ROTATION_2_0 = 33;
        public static final int ROTATION_2_1 = 4;
        public static final int ROTATION_2_2 = 51;
        public static final int ROTATION_2_3 = 13;
        public static final int ROTATION_2_4 = 34;
        public static final int ROTATION_2_5 = 41;
        public static final int ROTATION_2_6 = 59;
        public static final int ROTATION_2_7 = 17;
        public static final int ROTATION_3_0 = 5;
        public static final int ROTATION_3_1 = 20;
        public static final int ROTATION_3_2 = 48;
        public static final int ROTATION_3_3 = 41;
        public static final int ROTATION_3_4 = 47;
        public static final int ROTATION_3_5 = 28;
        public static final int ROTATION_3_6 = 16;
        public static final int ROTATION_3_7 = 25;
        public static final int ROTATION_4_0 = 41;
        public static final int ROTATION_4_1 = 9;
        public static final int ROTATION_4_2 = 37;
        public static final int ROTATION_4_3 = 31;
        public static final int ROTATION_4_4 = 12;
        public static final int ROTATION_4_5 = 47;
        public static final int ROTATION_4_6 = 44;
        public static final int ROTATION_4_7 = 30;
        public static final int ROTATION_5_0 = 16;
        public static final int ROTATION_5_1 = 34;
        public static final int ROTATION_5_2 = 56;
        public static final int ROTATION_5_3 = 51;
        public static final int ROTATION_5_4 = 4;
        public static final int ROTATION_5_5 = 53;
        public static final int ROTATION_5_6 = 42;
        public static final int ROTATION_5_7 = 41;
        public static final int ROTATION_6_0 = 31;
        public static final int ROTATION_6_1 = 44;
        public static final int ROTATION_6_2 = 47;
        public static final int ROTATION_6_3 = 46;
        public static final int ROTATION_6_4 = 19;
        public static final int ROTATION_6_5 = 42;
        public static final int ROTATION_6_6 = 44;
        public static final int ROTATION_6_7 = 25;
        public static final int ROTATION_7_0 = 9;
        public static final int ROTATION_7_1 = 48;
        public static final int ROTATION_7_2 = 35;
        public static final int ROTATION_7_3 = 52;
        public static final int ROTATION_7_4 = 23;
        public static final int ROTATION_7_5 = 31;
        public static final int ROTATION_7_6 = 37;
        public static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            int i2 = 9;
            int i3 = 19;
            while (i3 >= i) {
                int i4 = iArr[i3];
                int i5 = iArr2[i3];
                int i6 = i4 + 1;
                long j17 = j - jArr3[i6];
                int i7 = i4 + 2;
                long j18 = j2 - jArr3[i7];
                int i8 = i4 + 3;
                long j19 = j3 - jArr3[i8];
                int i9 = i4 + 4;
                long j20 = j4 - jArr3[i9];
                int i10 = i4 + 5;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j21 = j5 - jArr3[i10];
                int i11 = i4 + 6;
                long j22 = j6 - jArr3[i11];
                int i12 = i4 + 7;
                long j23 = j7 - jArr3[i12];
                int i13 = i4 + 8;
                long j24 = j8 - jArr3[i13];
                int i14 = i4 + 9;
                long j25 = j9 - jArr3[i14];
                int i15 = i4 + 10;
                long j26 = j10 - jArr3[i15];
                int i16 = i4 + 11;
                long j27 = j11 - jArr3[i16];
                int i17 = i4 + 12;
                long j28 = j12 - jArr3[i17];
                int i18 = i4 + 13;
                long j29 = j13 - jArr3[i18];
                int i19 = i4 + 14;
                int i20 = i5 + 1;
                long j30 = j14 - (jArr3[i19] + jArr4[i20]);
                int i21 = i4 + 15;
                long j31 = j15 - (jArr3[i21] + jArr4[i5 + 2]);
                long[] jArr5 = jArr3;
                long j32 = i3;
                long xorRotr = ThreefishEngine.xorRotr(j16 - ((jArr3[i4 + 16] + j32) + 1), i2, j17);
                long j33 = j17 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j28, 48, j19);
                long j34 = j19 - xorRotr2;
                long[] jArr6 = jArr4;
                long xorRotr3 = ThreefishEngine.xorRotr(j30, 35, j23);
                long j35 = j23 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(j26, 52, j21);
                long j36 = j21 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(j18, 23, j31);
                long j37 = j31 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(j22, 31, j25);
                long j38 = j25 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(j20, 37, j27);
                long j39 = j27 - xorRotr7;
                long xorRotr8 = ThreefishEngine.xorRotr(j24, 20, j29);
                long j40 = j29 - xorRotr8;
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8, 31, j33);
                long j41 = j33 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(xorRotr6, 44, j34);
                long j42 = j34 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 47, j36);
                long j43 = j36 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr5, 46, j35);
                long j44 = j35 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr, 19, j40);
                long j45 = j40 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr3, 42, j37);
                long j46 = j37 - xorRotr14;
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr2, 44, j38);
                long j47 = j38 - xorRotr15;
                long xorRotr16 = ThreefishEngine.xorRotr(xorRotr4, 25, j39);
                long j48 = j39 - xorRotr16;
                long xorRotr17 = ThreefishEngine.xorRotr(xorRotr16, 16, j41);
                long j49 = j41 - xorRotr17;
                long xorRotr18 = ThreefishEngine.xorRotr(xorRotr14, 34, j42);
                long j50 = j42 - xorRotr18;
                long xorRotr19 = ThreefishEngine.xorRotr(xorRotr15, 56, j44);
                long j51 = j44 - xorRotr19;
                long xorRotr20 = ThreefishEngine.xorRotr(xorRotr13, 51, j43);
                long j52 = j43 - xorRotr20;
                long xorRotr21 = ThreefishEngine.xorRotr(xorRotr9, 4, j48);
                long j53 = j48 - xorRotr21;
                long xorRotr22 = ThreefishEngine.xorRotr(xorRotr11, 53, j45);
                long j54 = j45 - xorRotr22;
                long xorRotr23 = ThreefishEngine.xorRotr(xorRotr10, 42, j46);
                long j55 = j46 - xorRotr23;
                long xorRotr24 = ThreefishEngine.xorRotr(xorRotr12, 41, j47);
                long j56 = j47 - xorRotr24;
                long xorRotr25 = ThreefishEngine.xorRotr(xorRotr24, 41, j49);
                long xorRotr26 = ThreefishEngine.xorRotr(xorRotr22, 9, j50);
                long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 37, j52);
                long j57 = j52 - xorRotr27;
                long xorRotr28 = ThreefishEngine.xorRotr(xorRotr21, 31, j51);
                long j58 = j51 - xorRotr28;
                long xorRotr29 = ThreefishEngine.xorRotr(xorRotr17, 12, j56);
                long j59 = j56 - xorRotr29;
                long xorRotr30 = ThreefishEngine.xorRotr(xorRotr19, 47, j53);
                long j60 = j53 - xorRotr30;
                long xorRotr31 = ThreefishEngine.xorRotr(xorRotr18, 44, j54);
                long j61 = j54 - xorRotr31;
                long xorRotr32 = ThreefishEngine.xorRotr(xorRotr20, 30, j55);
                long j62 = j55 - xorRotr32;
                long j63 = (j49 - xorRotr25) - jArr5[i4];
                long j64 = xorRotr25 - jArr5[i6];
                long j65 = (j50 - xorRotr26) - jArr5[i7];
                long j66 = xorRotr26 - jArr5[i8];
                long j67 = j57 - jArr5[i9];
                long j68 = xorRotr27 - jArr5[i10];
                long j69 = j58 - jArr5[i11];
                long j70 = xorRotr28 - jArr5[i12];
                long j71 = j59 - jArr5[i13];
                long j72 = xorRotr29 - jArr5[i14];
                long j73 = j60 - jArr5[i15];
                long j74 = xorRotr30 - jArr5[i16];
                long j75 = j61 - jArr5[i17];
                long j76 = xorRotr31 - (jArr5[i18] + jArr6[i5]);
                long j77 = j62 - (jArr5[i19] + jArr6[i20]);
                long xorRotr33 = ThreefishEngine.xorRotr(xorRotr32 - (jArr5[i21] + j32), 5, j63);
                long j78 = j63 - xorRotr33;
                long xorRotr34 = ThreefishEngine.xorRotr(j74, 20, j65);
                long j79 = j65 - xorRotr34;
                long xorRotr35 = ThreefishEngine.xorRotr(j76, 48, j69);
                long j80 = j69 - xorRotr35;
                long xorRotr36 = ThreefishEngine.xorRotr(j72, 41, j67);
                long j81 = j67 - xorRotr36;
                long xorRotr37 = ThreefishEngine.xorRotr(j64, 47, j77);
                long j82 = j77 - xorRotr37;
                long xorRotr38 = ThreefishEngine.xorRotr(j68, 28, j71);
                long j83 = j71 - xorRotr38;
                long xorRotr39 = ThreefishEngine.xorRotr(j66, 16, j73);
                long j84 = j73 - xorRotr39;
                long xorRotr40 = ThreefishEngine.xorRotr(j70, 25, j75);
                long j85 = j75 - xorRotr40;
                long xorRotr41 = ThreefishEngine.xorRotr(xorRotr40, 33, j78);
                long j86 = j78 - xorRotr41;
                long xorRotr42 = ThreefishEngine.xorRotr(xorRotr38, 4, j79);
                long j87 = j79 - xorRotr42;
                long xorRotr43 = ThreefishEngine.xorRotr(xorRotr39, 51, j81);
                long j88 = j81 - xorRotr43;
                long xorRotr44 = ThreefishEngine.xorRotr(xorRotr37, 13, j80);
                long j89 = j80 - xorRotr44;
                long xorRotr45 = ThreefishEngine.xorRotr(xorRotr33, 34, j85);
                long j90 = j85 - xorRotr45;
                long xorRotr46 = ThreefishEngine.xorRotr(xorRotr35, 41, j82);
                long j91 = j82 - xorRotr46;
                long xorRotr47 = ThreefishEngine.xorRotr(xorRotr34, 59, j83);
                long j92 = j83 - xorRotr47;
                long xorRotr48 = ThreefishEngine.xorRotr(xorRotr36, 17, j84);
                long j93 = j84 - xorRotr48;
                long xorRotr49 = ThreefishEngine.xorRotr(xorRotr48, 38, j86);
                long j94 = j86 - xorRotr49;
                long xorRotr50 = ThreefishEngine.xorRotr(xorRotr46, 19, j87);
                long j95 = j87 - xorRotr50;
                long xorRotr51 = ThreefishEngine.xorRotr(xorRotr47, 10, j89);
                long j96 = j89 - xorRotr51;
                long xorRotr52 = ThreefishEngine.xorRotr(xorRotr45, 55, j88);
                long j97 = j88 - xorRotr52;
                long xorRotr53 = ThreefishEngine.xorRotr(xorRotr41, 49, j93);
                long j98 = j93 - xorRotr53;
                long xorRotr54 = ThreefishEngine.xorRotr(xorRotr43, 18, j90);
                long j99 = j90 - xorRotr54;
                long xorRotr55 = ThreefishEngine.xorRotr(xorRotr42, 23, j91);
                long j100 = j91 - xorRotr55;
                long xorRotr56 = ThreefishEngine.xorRotr(xorRotr44, 52, j92);
                long j101 = j92 - xorRotr56;
                long xorRotr57 = ThreefishEngine.xorRotr(xorRotr56, 24, j94);
                j = j94 - xorRotr57;
                j4 = ThreefishEngine.xorRotr(xorRotr54, 13, j95);
                j3 = j95 - j4;
                long xorRotr58 = ThreefishEngine.xorRotr(xorRotr55, 8, j97);
                long j102 = j97 - xorRotr58;
                long xorRotr59 = ThreefishEngine.xorRotr(xorRotr53, 47, j96);
                long j103 = j96 - xorRotr59;
                long xorRotr60 = ThreefishEngine.xorRotr(xorRotr49, 8, j101);
                long j104 = j101 - xorRotr60;
                long xorRotr61 = ThreefishEngine.xorRotr(xorRotr51, 17, j98);
                j14 = ThreefishEngine.xorRotr(xorRotr50, 22, j99);
                j16 = ThreefishEngine.xorRotr(xorRotr52, 37, j100);
                i3 -= 2;
                i2 = 9;
                i = 1;
                j13 = j99 - j14;
                iArr = iArr3;
                iArr2 = iArr4;
                jArr4 = jArr6;
                j15 = j100 - j16;
                jArr3 = jArr5;
                j7 = j103;
                j12 = xorRotr61;
                j8 = xorRotr59;
                j5 = j102;
                j10 = xorRotr60;
                j6 = xorRotr58;
                j9 = j104;
                j2 = xorRotr57;
                j11 = j98 - xorRotr61;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j105 = j - jArr7[0];
            long j106 = j2 - jArr7[1];
            long j107 = j3 - jArr7[2];
            long j108 = j4 - jArr7[3];
            long j109 = j5 - jArr7[4];
            long j110 = j6 - jArr7[5];
            long j111 = j7 - jArr7[6];
            long j112 = j8 - jArr7[7];
            long j113 = j9 - jArr7[8];
            long j114 = j10 - jArr7[9];
            long j115 = j11 - jArr7[10];
            long j116 = j12 - jArr7[11];
            long j117 = j13 - jArr7[12];
            long j118 = j14 - (jArr7[13] + jArr8[0]);
            long j119 = j15 - (jArr7[14] + jArr8[1]);
            long j120 = j16 - jArr7[15];
            jArr2[0] = j105;
            jArr2[1] = j106;
            jArr2[2] = j107;
            jArr2[3] = j108;
            jArr2[4] = j109;
            jArr2[5] = j110;
            jArr2[6] = j111;
            jArr2[7] = j112;
            jArr2[8] = j113;
            jArr2[9] = j114;
            jArr2[10] = j115;
            jArr2[11] = j116;
            jArr2[12] = j117;
            jArr2[13] = j118;
            jArr2[14] = j119;
            jArr2[15] = j120;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            long j17 = j + jArr3[0];
            long j18 = j2 + jArr3[1];
            long j19 = j3 + jArr3[2];
            long j20 = j4 + jArr3[3];
            long j21 = j5 + jArr3[4];
            long j22 = j6 + jArr3[5];
            long j23 = j7 + jArr3[6];
            long j24 = j8 + jArr3[7];
            long j25 = j9 + jArr3[8];
            long j26 = j10 + jArr3[9];
            long j27 = j11 + jArr3[10];
            long j28 = j12 + jArr3[11];
            long j29 = j13 + jArr3[12];
            long j30 = jArr3[13] + jArr4[0] + j14;
            long j31 = jArr3[14] + jArr4[1] + j15;
            int i = 1;
            long j32 = j22;
            long j33 = j24;
            long j34 = j26;
            long j35 = j28;
            long j36 = j16 + jArr3[15];
            long j37 = j30;
            int i2 = 13;
            while (i < 20) {
                int i3 = iArr[i];
                int i4 = iArr2[i];
                long j38 = j17 + j18;
                int[] iArr3 = iArr;
                long rotlXor = ThreefishEngine.rotlXor(j18, 24, j38);
                long j39 = j19 + j20;
                long rotlXor2 = ThreefishEngine.rotlXor(j20, i2, j39);
                int[] iArr4 = iArr2;
                long j40 = j21 + j32;
                long rotlXor3 = ThreefishEngine.rotlXor(j32, 8, j40);
                int i5 = i;
                long j41 = j33;
                long j42 = j23 + j41;
                long rotlXor4 = ThreefishEngine.rotlXor(j41, 47, j42);
                long j43 = j34;
                long j44 = j25 + j43;
                long rotlXor5 = ThreefishEngine.rotlXor(j43, 8, j44);
                long j45 = j35;
                long j46 = j27 + j45;
                long rotlXor6 = ThreefishEngine.rotlXor(j45, 17, j46);
                long j47 = j37;
                long j48 = j29 + j47;
                long rotlXor7 = ThreefishEngine.rotlXor(j47, 22, j48);
                long j49 = j36;
                long j50 = j31 + j49;
                long rotlXor8 = ThreefishEngine.rotlXor(j49, 37, j50);
                long j51 = j38 + rotlXor5;
                long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 38, j51);
                long j52 = j39 + rotlXor7;
                long rotlXor10 = ThreefishEngine.rotlXor(rotlXor7, 19, j52);
                long j53 = j42 + rotlXor6;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor6, 10, j53);
                long j54 = j40 + rotlXor8;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor8, 55, j54);
                long j55 = j46 + rotlXor4;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor4, 49, j55);
                long j56 = j48 + rotlXor2;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor2, 18, j56);
                long j57 = j50 + rotlXor3;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor3, 23, j57);
                long j58 = j44 + rotlXor;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor, 52, j58);
                long j59 = j51 + rotlXor13;
                long rotlXor17 = ThreefishEngine.rotlXor(rotlXor13, 33, j59);
                long j60 = j52 + rotlXor15;
                long rotlXor18 = ThreefishEngine.rotlXor(rotlXor15, 4, j60);
                long j61 = j54 + rotlXor14;
                long rotlXor19 = ThreefishEngine.rotlXor(rotlXor14, 51, j61);
                long j62 = j53 + rotlXor16;
                long rotlXor20 = ThreefishEngine.rotlXor(rotlXor16, 13, j62);
                long j63 = j56 + rotlXor12;
                long rotlXor21 = ThreefishEngine.rotlXor(rotlXor12, 34, j63);
                long j64 = j57 + rotlXor10;
                long rotlXor22 = ThreefishEngine.rotlXor(rotlXor10, 41, j64);
                long j65 = j58 + rotlXor11;
                long rotlXor23 = ThreefishEngine.rotlXor(rotlXor11, 59, j65);
                long j66 = j55 + rotlXor9;
                long rotlXor24 = ThreefishEngine.rotlXor(rotlXor9, 17, j66);
                long j67 = j59 + rotlXor21;
                long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 5, j67);
                long j68 = j60 + rotlXor23;
                long rotlXor26 = ThreefishEngine.rotlXor(rotlXor23, 20, j68);
                long j69 = j62 + rotlXor22;
                long rotlXor27 = ThreefishEngine.rotlXor(rotlXor22, 48, j69);
                long j70 = j61 + rotlXor24;
                long rotlXor28 = ThreefishEngine.rotlXor(rotlXor24, 41, j70);
                long j71 = j64 + rotlXor20;
                long rotlXor29 = ThreefishEngine.rotlXor(rotlXor20, 47, j71);
                long j72 = j65 + rotlXor18;
                long rotlXor30 = ThreefishEngine.rotlXor(rotlXor18, 28, j72);
                long j73 = j66 + rotlXor19;
                long rotlXor31 = ThreefishEngine.rotlXor(rotlXor19, 16, j73);
                long j74 = j63 + rotlXor17;
                long rotlXor32 = ThreefishEngine.rotlXor(rotlXor17, 25, j74);
                long j75 = j67 + jArr3[i3];
                int i6 = i3 + 1;
                long j76 = rotlXor29 + jArr3[i6];
                int i7 = i3 + 2;
                long j77 = j68 + jArr3[i7];
                int i8 = i3 + 3;
                long j78 = rotlXor31 + jArr3[i8];
                int i9 = i3 + 4;
                long j79 = j70 + jArr3[i9];
                int i10 = i3 + 5;
                long j80 = rotlXor30 + jArr3[i10];
                int i11 = i3 + 6;
                long j81 = j69 + jArr3[i11];
                int i12 = i3 + 7;
                long j82 = rotlXor32 + jArr3[i12];
                int i13 = i3 + 8;
                long j83 = j72 + jArr3[i13];
                int i14 = i3 + 9;
                long j84 = rotlXor28 + jArr3[i14];
                int i15 = i3 + 10;
                long j85 = j73 + jArr3[i15];
                int i16 = i3 + 11;
                long j86 = rotlXor26 + jArr3[i16];
                int i17 = i3 + 12;
                long j87 = j74 + jArr3[i17];
                int i18 = i3 + 13;
                long j88 = jArr3[i18] + jArr4[i4] + rotlXor27;
                int i19 = i3 + 14;
                int i20 = i4 + 1;
                long j89 = jArr3[i19] + jArr4[i20] + j71;
                int i21 = i3 + 15;
                long j90 = i5;
                long j91 = jArr3[i21] + j90 + rotlXor25;
                long j92 = j75 + j76;
                long rotlXor33 = ThreefishEngine.rotlXor(j76, 41, j92);
                long j93 = j77 + j78;
                long rotlXor34 = ThreefishEngine.rotlXor(j78, 9, j93);
                long j94 = j79 + j80;
                long rotlXor35 = ThreefishEngine.rotlXor(j80, 37, j94);
                long j95 = j81 + j82;
                long rotlXor36 = ThreefishEngine.rotlXor(j82, 31, j95);
                long j96 = j83 + j84;
                long rotlXor37 = ThreefishEngine.rotlXor(j84, 12, j96);
                long j97 = j85 + j86;
                long rotlXor38 = ThreefishEngine.rotlXor(j86, 47, j97);
                long j98 = j87 + j88;
                long rotlXor39 = ThreefishEngine.rotlXor(j88, 44, j98);
                long j99 = j89 + j91;
                long rotlXor40 = ThreefishEngine.rotlXor(j91, 30, j99);
                long j100 = j92 + rotlXor37;
                long rotlXor41 = ThreefishEngine.rotlXor(rotlXor37, 16, j100);
                long j101 = j93 + rotlXor39;
                long rotlXor42 = ThreefishEngine.rotlXor(rotlXor39, 34, j101);
                long j102 = j95 + rotlXor38;
                long rotlXor43 = ThreefishEngine.rotlXor(rotlXor38, 56, j102);
                long j103 = j94 + rotlXor40;
                long rotlXor44 = ThreefishEngine.rotlXor(rotlXor40, 51, j103);
                long j104 = j97 + rotlXor36;
                long rotlXor45 = ThreefishEngine.rotlXor(rotlXor36, 4, j104);
                long j105 = j98 + rotlXor34;
                long rotlXor46 = ThreefishEngine.rotlXor(rotlXor34, 53, j105);
                long j106 = j99 + rotlXor35;
                long rotlXor47 = ThreefishEngine.rotlXor(rotlXor35, 42, j106);
                long j107 = j96 + rotlXor33;
                long rotlXor48 = ThreefishEngine.rotlXor(rotlXor33, 41, j107);
                long j108 = j100 + rotlXor45;
                long rotlXor49 = ThreefishEngine.rotlXor(rotlXor45, 31, j108);
                long j109 = j101 + rotlXor47;
                long rotlXor50 = ThreefishEngine.rotlXor(rotlXor47, 44, j109);
                long j110 = j103 + rotlXor46;
                long rotlXor51 = ThreefishEngine.rotlXor(rotlXor46, 47, j110);
                long j111 = j102 + rotlXor48;
                long rotlXor52 = ThreefishEngine.rotlXor(rotlXor48, 46, j111);
                long j112 = j105 + rotlXor44;
                long rotlXor53 = ThreefishEngine.rotlXor(rotlXor44, 19, j112);
                long j113 = j106 + rotlXor42;
                long rotlXor54 = ThreefishEngine.rotlXor(rotlXor42, 42, j113);
                long j114 = j107 + rotlXor43;
                long rotlXor55 = ThreefishEngine.rotlXor(rotlXor43, 44, j114);
                long j115 = j104 + rotlXor41;
                long rotlXor56 = ThreefishEngine.rotlXor(rotlXor41, 25, j115);
                long j116 = j108 + rotlXor53;
                long rotlXor57 = ThreefishEngine.rotlXor(rotlXor53, 9, j116);
                long j117 = j109 + rotlXor55;
                long rotlXor58 = ThreefishEngine.rotlXor(rotlXor55, 48, j117);
                long j118 = j111 + rotlXor54;
                long rotlXor59 = ThreefishEngine.rotlXor(rotlXor54, 35, j118);
                long j119 = j110 + rotlXor56;
                long rotlXor60 = ThreefishEngine.rotlXor(rotlXor56, 52, j119);
                long j120 = j113 + rotlXor52;
                long rotlXor61 = ThreefishEngine.rotlXor(rotlXor52, 23, j120);
                long j121 = j114 + rotlXor50;
                long rotlXor62 = ThreefishEngine.rotlXor(rotlXor50, 31, j121);
                long j122 = j115 + rotlXor51;
                long rotlXor63 = ThreefishEngine.rotlXor(rotlXor51, 37, j122);
                long j123 = j112 + rotlXor49;
                long rotlXor64 = ThreefishEngine.rotlXor(rotlXor49, 20, j123);
                j17 = jArr3[i6] + j116;
                j18 = rotlXor61 + jArr3[i7];
                j19 = j117 + jArr3[i8];
                long j124 = rotlXor63 + jArr3[i9];
                long j125 = j119 + jArr3[i10];
                long j126 = rotlXor62 + jArr3[i11];
                long j127 = j118 + jArr3[i12];
                long j128 = rotlXor64 + jArr3[i13];
                long j129 = j121 + jArr3[i14];
                long j130 = rotlXor60 + jArr3[i15];
                long j131 = j122 + jArr3[i16];
                j35 = rotlXor58 + jArr3[i17];
                long j132 = j123 + jArr3[i18];
                j37 = jArr3[i19] + jArr4[i20] + rotlXor59;
                j31 = jArr3[i21] + jArr4[i4 + 2] + j120;
                j36 = jArr3[i3 + 16] + j90 + 1 + rotlXor57;
                i = i5 + 2;
                j21 = j125;
                j29 = j132;
                j33 = j128;
                iArr = iArr3;
                j34 = j130;
                j27 = j131;
                i2 = 13;
                iArr2 = iArr4;
                j20 = j124;
                j32 = j126;
                j23 = j127;
                j25 = j129;
            }
            jArr2[0] = j17;
            jArr2[1] = j18;
            jArr2[2] = j19;
            jArr2[3] = j20;
            jArr2[4] = j21;
            jArr2[5] = j32;
            jArr2[6] = j23;
            jArr2[7] = j33;
            jArr2[8] = j25;
            jArr2[9] = j34;
            jArr2[10] = j27;
            jArr2[11] = j35;
            jArr2[12] = j29;
            jArr2[13] = j37;
            jArr2[14] = j31;
            jArr2[15] = j36;
        }
    }

    public final class Threefish256Cipher extends ThreefishCipher {
        public static final int ROTATION_0_0 = 14;
        public static final int ROTATION_0_1 = 16;
        public static final int ROTATION_1_0 = 52;
        public static final int ROTATION_1_1 = 57;
        public static final int ROTATION_2_0 = 23;
        public static final int ROTATION_2_1 = 40;
        public static final int ROTATION_3_0 = 5;
        public static final int ROTATION_3_1 = 37;
        public static final int ROTATION_4_0 = 25;
        public static final int ROTATION_4_1 = 33;
        public static final int ROTATION_5_0 = 46;
        public static final int ROTATION_5_1 = 12;
        public static final int ROTATION_6_0 = 58;
        public static final int ROTATION_6_1 = 22;
        public static final int ROTATION_7_0 = 32;
        public static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            int i2 = 17;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                int i5 = i3 + 1;
                long j5 = j - jArr3[i5];
                int i6 = i3 + 2;
                int i7 = i4 + 1;
                long j6 = j2 - (jArr3[i6] + jArr4[i7]);
                int i8 = i3 + 3;
                long j7 = j3 - (jArr3[i8] + jArr4[i4 + 2]);
                long j8 = i2;
                int[] iArr3 = iArr;
                long xorRotr = ThreefishEngine.xorRotr(j4 - ((jArr3[i3 + 4] + j8) + 1), 32, j5);
                long j9 = j5 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j6, 32, j7);
                long j10 = j7 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(xorRotr2, 58, j9);
                long j11 = j9 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(xorRotr, 22, j10);
                long j12 = j10 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(xorRotr4, 46, j11);
                long j13 = j11 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(xorRotr3, 12, j12);
                long j14 = j12 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(xorRotr6, 25, j13);
                long xorRotr8 = ThreefishEngine.xorRotr(xorRotr5, 33, j14);
                long j15 = (j13 - xorRotr7) - jArr3[i3];
                long j16 = xorRotr7 - (jArr3[i5] + jArr4[i4]);
                long j17 = (j14 - xorRotr8) - (jArr3[i6] + jArr4[i7]);
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8 - (jArr3[i8] + j8), 5, j15);
                long j18 = j15 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(j16, 37, j17);
                long j19 = j17 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr10, 23, j18);
                long j20 = j18 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr9, 40, j19);
                long j21 = j19 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr12, 52, j20);
                long j22 = j20 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr11, 57, j21);
                long j23 = j21 - xorRotr14;
                j2 = ThreefishEngine.xorRotr(xorRotr14, 14, j22);
                j = j22 - j2;
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr13, 16, j23);
                j3 = j23 - xorRotr15;
                i2 -= 2;
                i = 1;
                iArr = iArr3;
                j4 = xorRotr15;
                iArr2 = iArr2;
            }
            long j24 = j - jArr3[0];
            long j25 = j2 - (jArr3[1] + jArr4[0]);
            long j26 = j3 - (jArr3[2] + jArr4[1]);
            long j27 = j4 - jArr3[3];
            jArr2[0] = j24;
            jArr2[1] = j25;
            jArr2[2] = j26;
            jArr2[3] = j27;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = j + jArr3[0];
            long j6 = jArr3[1] + jArr4[0] + j2;
            long j7 = jArr3[2] + jArr4[1] + j3;
            long j8 = j4 + jArr3[3];
            long j9 = j6;
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j10 = j5 + j9;
                long rotlXor = ThreefishEngine.rotlXor(j9, 14, j10);
                long j11 = j7 + j8;
                long rotlXor2 = ThreefishEngine.rotlXor(j8, 16, j11);
                long j12 = j10 + rotlXor2;
                long rotlXor3 = ThreefishEngine.rotlXor(rotlXor2, 52, j12);
                long j13 = j11 + rotlXor;
                long rotlXor4 = ThreefishEngine.rotlXor(rotlXor, 57, j13);
                long j14 = j12 + rotlXor4;
                long rotlXor5 = ThreefishEngine.rotlXor(rotlXor4, 23, j14);
                long j15 = j13 + rotlXor3;
                long rotlXor6 = ThreefishEngine.rotlXor(rotlXor3, 40, j15);
                long j16 = j14 + rotlXor6;
                long rotlXor7 = ThreefishEngine.rotlXor(rotlXor6, 5, j16);
                long j17 = j15 + rotlXor5;
                long rotlXor8 = ThreefishEngine.rotlXor(rotlXor5, 37, j17);
                long j18 = j16 + jArr3[i2];
                int i4 = i2 + 1;
                long j19 = jArr3[i4] + jArr4[i3] + rotlXor8;
                int i5 = i2 + 2;
                int i6 = i3 + 1;
                long j20 = jArr3[i5] + jArr4[i6] + j17;
                int i7 = i2 + 3;
                int[] iArr3 = iArr;
                long j21 = i;
                long j22 = jArr3[i7] + j21 + rotlXor7;
                long j23 = j18 + j19;
                long rotlXor9 = ThreefishEngine.rotlXor(j19, 25, j23);
                long j24 = j20 + j22;
                long rotlXor10 = ThreefishEngine.rotlXor(j22, 33, j24);
                long j25 = j23 + rotlXor10;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor10, 46, j25);
                long j26 = j24 + rotlXor9;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor9, 12, j26);
                long j27 = j25 + rotlXor12;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor12, 58, j27);
                long j28 = j26 + rotlXor11;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor11, 22, j28);
                long j29 = j27 + rotlXor14;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor14, 32, j29);
                long j30 = j28 + rotlXor13;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor13, 32, j30);
                j5 = j29 + jArr3[i4];
                j9 = jArr3[i5] + jArr4[i6] + rotlXor16;
                long j31 = j30 + jArr3[i7] + jArr4[i3 + 2];
                j8 = jArr3[i2 + 4] + j21 + 1 + rotlXor15;
                i += 2;
                j7 = j31;
                iArr = iArr3;
                iArr2 = iArr2;
            }
            jArr2[0] = j5;
            jArr2[1] = j9;
            jArr2[2] = j7;
            jArr2[3] = j8;
        }
    }

    public final class Threefish512Cipher extends ThreefishCipher {
        public static final int ROTATION_0_0 = 46;
        public static final int ROTATION_0_1 = 36;
        public static final int ROTATION_0_2 = 19;
        public static final int ROTATION_0_3 = 37;
        public static final int ROTATION_1_0 = 33;
        public static final int ROTATION_1_1 = 27;
        public static final int ROTATION_1_2 = 14;
        public static final int ROTATION_1_3 = 42;
        public static final int ROTATION_2_0 = 17;
        public static final int ROTATION_2_1 = 49;
        public static final int ROTATION_2_2 = 36;
        public static final int ROTATION_2_3 = 39;
        public static final int ROTATION_3_0 = 44;
        public static final int ROTATION_3_1 = 9;
        public static final int ROTATION_3_2 = 54;
        public static final int ROTATION_3_3 = 56;
        public static final int ROTATION_4_0 = 39;
        public static final int ROTATION_4_1 = 30;
        public static final int ROTATION_4_2 = 34;
        public static final int ROTATION_4_3 = 24;
        public static final int ROTATION_5_0 = 13;
        public static final int ROTATION_5_1 = 50;
        public static final int ROTATION_5_2 = 10;
        public static final int ROTATION_5_3 = 17;
        public static final int ROTATION_6_0 = 25;
        public static final int ROTATION_6_1 = 29;
        public static final int ROTATION_6_2 = 39;
        public static final int ROTATION_6_3 = 43;
        public static final int ROTATION_7_0 = 8;
        public static final int ROTATION_7_1 = 35;
        public static final int ROTATION_7_2 = 56;
        public static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            int i2 = 17;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                int i5 = i3 + 1;
                long j9 = j - jArr3[i5];
                int i6 = i3 + 2;
                long j10 = j2 - jArr3[i6];
                int i7 = i3 + 3;
                long j11 = j3 - jArr3[i7];
                int i8 = i3 + 4;
                long j12 = j4 - jArr3[i8];
                int i9 = i3 + 5;
                long j13 = j5 - jArr3[i9];
                int i10 = i3 + 6;
                int i11 = i4 + 1;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j14 = j6 - (jArr3[i10] + jArr4[i11]);
                int i12 = i3 + 7;
                long j15 = j7 - (jArr3[i12] + jArr4[i4 + 2]);
                long[] jArr5 = jArr3;
                long j16 = i2;
                long j17 = j8 - ((jArr3[i3 + 8] + j16) + 1);
                int i13 = i2;
                long xorRotr = ThreefishEngine.xorRotr(j10, 8, j15);
                long j18 = j15 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j17, 35, j9);
                long j19 = j9 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(j14, 56, j11);
                long j20 = j11 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(j12, 22, j13);
                long j21 = j13 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(xorRotr, 25, j21);
                long j22 = j21 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(xorRotr4, 29, j18);
                long j23 = j18 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(xorRotr3, 39, j19);
                long j24 = j19 - xorRotr7;
                long xorRotr8 = ThreefishEngine.xorRotr(xorRotr2, 43, j20);
                long j25 = j20 - xorRotr8;
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr5, 13, j25);
                long j26 = j25 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(xorRotr8, 50, j22);
                long j27 = j22 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 10, j23);
                long j28 = j23 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr6, 17, j24);
                long j29 = j24 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr9, 39, j29);
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr12, 30, j26);
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr11, 34, j27);
                long j30 = j27 - xorRotr15;
                long xorRotr16 = ThreefishEngine.xorRotr(xorRotr10, 24, j28);
                long j31 = j28 - xorRotr16;
                long j32 = (j29 - xorRotr13) - jArr5[i3];
                long j33 = xorRotr13 - jArr5[i5];
                long j34 = (j26 - xorRotr14) - jArr5[i6];
                long j35 = xorRotr14 - jArr5[i7];
                long j36 = j30 - jArr5[i8];
                long j37 = xorRotr15 - (jArr5[i9] + jArr4[i4]);
                long j38 = j31 - (jArr5[i10] + jArr4[i11]);
                long j39 = xorRotr16 - (jArr5[i12] + j16);
                long xorRotr17 = ThreefishEngine.xorRotr(j33, 44, j38);
                long j40 = j38 - xorRotr17;
                long xorRotr18 = ThreefishEngine.xorRotr(j39, 9, j32);
                long j41 = j32 - xorRotr18;
                long xorRotr19 = ThreefishEngine.xorRotr(j37, 54, j34);
                long j42 = j34 - xorRotr19;
                long[] jArr6 = jArr4;
                long xorRotr20 = ThreefishEngine.xorRotr(j35, 56, j36);
                long j43 = j36 - xorRotr20;
                long xorRotr21 = ThreefishEngine.xorRotr(xorRotr17, 17, j43);
                long j44 = j43 - xorRotr21;
                long xorRotr22 = ThreefishEngine.xorRotr(xorRotr20, 49, j40);
                long j45 = j40 - xorRotr22;
                long xorRotr23 = ThreefishEngine.xorRotr(xorRotr19, 36, j41);
                long j46 = j41 - xorRotr23;
                long xorRotr24 = ThreefishEngine.xorRotr(xorRotr18, 39, j42);
                long j47 = j42 - xorRotr24;
                long xorRotr25 = ThreefishEngine.xorRotr(xorRotr21, 33, j47);
                long j48 = j47 - xorRotr25;
                long xorRotr26 = ThreefishEngine.xorRotr(xorRotr24, 27, j44);
                long j49 = j44 - xorRotr26;
                long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 14, j45);
                long j50 = j45 - xorRotr27;
                long xorRotr28 = ThreefishEngine.xorRotr(xorRotr22, 42, j46);
                long j51 = j46 - xorRotr28;
                long xorRotr29 = ThreefishEngine.xorRotr(xorRotr25, 46, j51);
                j4 = ThreefishEngine.xorRotr(xorRotr28, 36, j48);
                j6 = ThreefishEngine.xorRotr(xorRotr27, 19, j49);
                j8 = ThreefishEngine.xorRotr(xorRotr26, 37, j50);
                j7 = j50 - j8;
                i = 1;
                j5 = j49 - j6;
                j3 = j48 - j4;
                jArr3 = jArr5;
                j2 = xorRotr29;
                j = j51 - xorRotr29;
                i2 = i13 - 2;
                jArr4 = jArr6;
                iArr = iArr3;
                iArr2 = iArr4;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j52 = j - jArr7[0];
            long j53 = j2 - jArr7[1];
            long j54 = j3 - jArr7[2];
            long j55 = j4 - jArr7[3];
            long j56 = j5 - jArr7[4];
            long j57 = j6 - (jArr7[5] + jArr8[0]);
            long j58 = j7 - (jArr7[6] + jArr8[1]);
            long j59 = j8 - jArr7[7];
            jArr2[0] = j52;
            jArr2[1] = j53;
            jArr2[2] = j54;
            jArr2[3] = j55;
            jArr2[4] = j56;
            jArr2[5] = j57;
            jArr2[6] = j58;
            jArr2[7] = j59;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = j + jArr3[0];
            long j10 = j2 + jArr3[1];
            long j11 = j3 + jArr3[2];
            long j12 = j4 + jArr3[3];
            long j13 = j5 + jArr3[4];
            long j14 = jArr3[5] + jArr4[0] + j6;
            long j15 = jArr3[6] + jArr4[1] + j7;
            int i = 1;
            long j16 = j12;
            long j17 = j8 + jArr3[7];
            long j18 = j14;
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j19 = j9 + j10;
                long rotlXor = ThreefishEngine.rotlXor(j10, 46, j19);
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j20 = j16;
                long j21 = j11 + j20;
                long rotlXor2 = ThreefishEngine.rotlXor(j20, 36, j21);
                long[] jArr5 = jArr3;
                int i4 = i;
                long j22 = j18;
                long j23 = j13 + j22;
                long[] jArr6 = jArr4;
                long rotlXor3 = ThreefishEngine.rotlXor(j22, 19, j23);
                long j24 = j17;
                long j25 = j15 + j24;
                long rotlXor4 = ThreefishEngine.rotlXor(j24, 37, j25);
                long j26 = j21 + rotlXor;
                long rotlXor5 = ThreefishEngine.rotlXor(rotlXor, 33, j26);
                long j27 = j23 + rotlXor4;
                long rotlXor6 = ThreefishEngine.rotlXor(rotlXor4, 27, j27);
                long j28 = j25 + rotlXor3;
                long rotlXor7 = ThreefishEngine.rotlXor(rotlXor3, 14, j28);
                long j29 = j19 + rotlXor2;
                long rotlXor8 = ThreefishEngine.rotlXor(rotlXor2, 42, j29);
                long j30 = j27 + rotlXor5;
                long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 17, j30);
                long j31 = j28 + rotlXor8;
                long rotlXor10 = ThreefishEngine.rotlXor(rotlXor8, 49, j31);
                long j32 = j29 + rotlXor7;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor7, 36, j32);
                long j33 = j26 + rotlXor6;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor6, 39, j33);
                long j34 = j31 + rotlXor9;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor9, 44, j34);
                long j35 = j32 + rotlXor12;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor12, 9, j35);
                long j36 = j33 + rotlXor11;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor11, 54, j36);
                long j37 = j30 + rotlXor10;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor10, 56, j37);
                long j38 = j35 + jArr5[i2];
                int i5 = i2 + 1;
                long j39 = rotlXor13 + jArr5[i5];
                int i6 = i2 + 2;
                long j40 = j36 + jArr5[i6];
                int i7 = i2 + 3;
                long j41 = rotlXor16 + jArr5[i7];
                int i8 = i2 + 4;
                long j42 = j37 + jArr5[i8];
                int i9 = i2 + 5;
                long j43 = jArr5[i9] + jArr6[i3] + rotlXor15;
                int i10 = i2 + 6;
                int i11 = i3 + 1;
                long j44 = jArr5[i10] + jArr6[i11] + j34;
                int i12 = i2 + 7;
                long j45 = i4;
                long j46 = jArr5[i12] + j45 + rotlXor14;
                long j47 = j38 + j39;
                long rotlXor17 = ThreefishEngine.rotlXor(j39, 39, j47);
                long j48 = j40 + j41;
                long rotlXor18 = ThreefishEngine.rotlXor(j41, 30, j48);
                long j49 = j42 + j43;
                long rotlXor19 = ThreefishEngine.rotlXor(j43, 34, j49);
                long j50 = j44 + j46;
                long rotlXor20 = ThreefishEngine.rotlXor(j46, 24, j50);
                long j51 = j48 + rotlXor17;
                long rotlXor21 = ThreefishEngine.rotlXor(rotlXor17, 13, j51);
                long j52 = j49 + rotlXor20;
                long rotlXor22 = ThreefishEngine.rotlXor(rotlXor20, 50, j52);
                long j53 = j50 + rotlXor19;
                long rotlXor23 = ThreefishEngine.rotlXor(rotlXor19, 10, j53);
                long j54 = j47 + rotlXor18;
                long rotlXor24 = ThreefishEngine.rotlXor(rotlXor18, 17, j54);
                long j55 = j52 + rotlXor21;
                long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 25, j55);
                long j56 = j53 + rotlXor24;
                long rotlXor26 = ThreefishEngine.rotlXor(rotlXor24, 29, j56);
                long j57 = j54 + rotlXor23;
                long rotlXor27 = ThreefishEngine.rotlXor(rotlXor23, 39, j57);
                long j58 = j51 + rotlXor22;
                long rotlXor28 = ThreefishEngine.rotlXor(rotlXor22, 43, j58);
                long j59 = j56 + rotlXor25;
                long rotlXor29 = ThreefishEngine.rotlXor(rotlXor25, 8, j59);
                long j60 = j57 + rotlXor28;
                long rotlXor30 = ThreefishEngine.rotlXor(rotlXor28, 35, j60);
                long j61 = j58 + rotlXor27;
                long rotlXor31 = ThreefishEngine.rotlXor(rotlXor27, 56, j61);
                long j62 = j55 + rotlXor26;
                long rotlXor32 = ThreefishEngine.rotlXor(rotlXor26, 22, j62);
                j9 = j60 + jArr5[i5];
                long j63 = rotlXor29 + jArr5[i6];
                j11 = j61 + jArr5[i7];
                j16 = rotlXor32 + jArr5[i8];
                long j64 = j62 + jArr5[i9];
                long j65 = jArr5[i10] + jArr6[i11] + rotlXor31;
                long j66 = j59 + jArr5[i12] + jArr6[i3 + 2];
                j17 = jArr5[i2 + 8] + j45 + 1 + rotlXor30;
                i = i4 + 2;
                j13 = j64;
                j18 = j65;
                j10 = j63;
                iArr2 = iArr4;
                jArr3 = jArr5;
                j15 = j66;
                iArr = iArr3;
                jArr4 = jArr6;
            }
            jArr2[0] = j9;
            jArr2[1] = j10;
            jArr2[2] = j11;
            jArr2[3] = j16;
            jArr2[4] = j13;
            jArr2[5] = j18;
            jArr2[6] = j15;
            jArr2[7] = j17;
        }
    }

    public abstract class ThreefishCipher {
        public final long[] kw;
        public final long[] t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i >= iArr2.length) {
                return;
            }
            MOD17[i] = i % 17;
            iArr2[i] = i % 9;
            MOD5[i] = i % 5;
            MOD3[i] = i % 3;
            i++;
        }
    }

    public ThreefishEngine(int i) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.t = jArr;
        int i2 = i / 8;
        this.blocksizeBytes = i2;
        int i3 = i2 / 8;
        this.blocksizeWords = i3;
        this.currentBlock = new long[i3];
        long[] jArr2 = new long[(i3 * 2) + 1];
        this.kw = jArr2;
        if (i == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i) {
        return Pack.littleEndianToLong(bArr, i);
    }

    public static long rotlXor(long j, int i, long j2) {
        return ((j >>> (-i)) | (j << i)) ^ j2;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException(C3200.m9831(this.blocksizeWords, " words)", new StringBuilder("Threefish key must be same size as block (")));
        }
        long j = C_240;
        int i = 0;
        while (true) {
            int i2 = this.blocksizeWords;
            if (i >= i2) {
                long[] jArr2 = this.kw;
                jArr2[i2] = j;
                System.arraycopy(jArr2, 0, jArr2, i2 + 1, i2);
                return;
            } else {
                long[] jArr3 = this.kw;
                long j2 = jArr[i];
                jArr3[i] = j2;
                j ^= j2;
                i++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.t;
        long j = jArr[0];
        jArr2[0] = j;
        long j2 = jArr[1];
        jArr2[1] = j2;
        jArr2[2] = j ^ j2;
        jArr2[3] = j;
        jArr2[4] = j2;
    }

    public static void wordToBytes(long j, byte[] bArr, int i) {
        Pack.longToLittleEndian(j, bArr, i);
    }

    public static long xorRotr(long j, int i, long j2) {
        long j3 = j ^ j2;
        return (j3 << (-i)) | (j3 >>> i);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        byte[] key;
        byte[] bArr;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            bArr = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(C20177.m46409("Invalid parameter passed to Threefish init - ", cipherParameters));
            }
            key = ((KeyParameter) cipherParameters).getKey();
            bArr = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException(C3200.m9831(this.blocksizeBytes, " bytes)", new StringBuilder("Threefish key must be same size as block (")));
            }
            jArr = new long[this.blocksizeWords];
            Pack.littleEndianToLong(key, 0, jArr);
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[2];
            Pack.littleEndianToLong(bArr, 0, jArr2);
        }
        init(z, jArr, jArr2);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z)));
    }

    public void init(boolean z, long[] jArr, long[] jArr2) {
        this.forEncryption = z;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.blocksizeBytes;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        Pack.littleEndianToLong(bArr, i, this.currentBlock);
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        Pack.longToLittleEndian(this.currentBlock, bArr2, i2);
        return this.blocksizeBytes;
    }

    public int processBlock(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.kw;
        int i = this.blocksizeWords;
        if (jArr3[i] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
