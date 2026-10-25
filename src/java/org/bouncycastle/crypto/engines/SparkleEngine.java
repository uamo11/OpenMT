package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes.dex */
public class SparkleEngine extends AEADBaseEngine {
    public static final int[] RCON = {-1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891};
    public final int CAP_MASK;
    public final int KEY_WORDS;
    public final int RATE_WORDS;
    public final int SPARKLE_STEPS_BIG;
    public final int SPARKLE_STEPS_SLIM;
    public final int STATE_WORDS;
    public final int TAG_WORDS;
    public final int _A0;
    public final int _A1;
    public final int _M2;
    public final int _M3;
    public boolean encrypted;
    public final int[] k;
    public final int[] npub;
    public final int[] state;

    public enum SparkleParameters {
        SCHWAEMM128_128,
        SCHWAEMM256_128,
        SCHWAEMM192_192,
        SCHWAEMM256_256
    }

    public SparkleEngine(SparkleParameters sparkleParameters) {
        int i;
        int i2;
        int i3;
        int ordinal = sparkleParameters.ordinal();
        int i4 = 256;
        int i5 = 128;
        if (ordinal != 0) {
            i3 = MLKEMEngine.KyberPolyBytes;
            if (ordinal == 1) {
                this.SPARKLE_STEPS_SLIM = 7;
                this.SPARKLE_STEPS_BIG = 11;
                this.algorithmName = "SCHWAEMM256-128";
                i = 256;
                i2 = 128;
                i4 = 128;
            } else if (ordinal == 2) {
                this.SPARKLE_STEPS_SLIM = 7;
                this.SPARKLE_STEPS_BIG = 11;
                this.algorithmName = "SCHWAEMM192-192";
                i4 = 192;
                i = 192;
                i2 = 192;
                i5 = 192;
            } else {
                if (ordinal != 3) {
                    throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
                }
                this.SPARKLE_STEPS_SLIM = 8;
                this.SPARKLE_STEPS_BIG = 12;
                this.algorithmName = "SCHWAEMM256-256";
                i = 256;
                i2 = 256;
                i5 = 256;
                i3 = 512;
            }
        } else {
            this.SPARKLE_STEPS_SLIM = 7;
            this.SPARKLE_STEPS_BIG = 10;
            this.algorithmName = "SCHWAEMM128-128";
            i = 128;
            i2 = 128;
            i4 = 128;
            i3 = 256;
        }
        int i6 = i4 >>> 5;
        this.KEY_WORDS = i6;
        this.KEY_SIZE = i4 >>> 3;
        this.TAG_WORDS = i5 >>> 5;
        this.MAC_SIZE = i5 >>> 3;
        int i7 = i3 >>> 5;
        this.STATE_WORDS = i7;
        int i8 = i >>> 5;
        this.RATE_WORDS = i8;
        int i9 = i >>> 3;
        this.IV_SIZE = i9;
        int i10 = i2 >>> 6;
        int i11 = i2 >>> 5;
        this.CAP_MASK = i8 > i11 ? i11 - 1 : -1;
        int i12 = 1 << i10;
        this._A0 = i12 << 24;
        this._A1 = (i12 ^ 1) << 24;
        this._M2 = (i12 ^ 2) << 24;
        this._M3 = (i12 ^ 3) << 24;
        this.state = new int[i7];
        this.k = new int[i6];
        this.npub = new int[i8];
        this.BlockSize = i9;
        this.AADBufferSize = i9;
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Default);
    }

    public static int ELL(int i) {
        return (i & 65535) ^ Integers.rotateRight(i, 16);
    }

    public static void sparkle_opt(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            sparkle_opt8(iArr, i);
        } else if (length == 12) {
            sparkle_opt12(iArr, i);
        } else {
            if (length != 16) {
                throw new IllegalStateException();
            }
            sparkle_opt16(iArr, i);
        }
    }

    public static void sparkle_opt12(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt12(iArr, i);
    }

    public static void sparkle_opt12(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = 0;
        while (i14 < i) {
            int[] iArr2 = RCON;
            int i15 = i3 ^ iArr2[i14 & 7];
            int i16 = i5 ^ i14;
            int i17 = iArr2[0];
            int rotateRight = Integers.rotateRight(i15, 31) + i2;
            int rotateRight2 = i15 ^ Integers.rotateRight(rotateRight, 24);
            int rotateRight3 = Integers.rotateRight(rotateRight2, 17) + (rotateRight ^ i17);
            int rotateRight4 = rotateRight2 ^ Integers.rotateRight(rotateRight3, 17);
            int i18 = (rotateRight3 ^ i17) + rotateRight4;
            int rotateRight5 = rotateRight4 ^ Integers.rotateRight(i18, 31);
            int rotateRight6 = Integers.rotateRight(rotateRight5, 24) + (i18 ^ i17);
            int rotateRight7 = rotateRight5 ^ Integers.rotateRight(rotateRight6, 16);
            int i19 = rotateRight6 ^ i17;
            int i20 = iArr2[1];
            int rotateRight8 = Integers.rotateRight(i16, 31) + i4;
            int rotateRight9 = i16 ^ Integers.rotateRight(rotateRight8, 24);
            int rotateRight10 = Integers.rotateRight(rotateRight9, 17) + (rotateRight8 ^ i20);
            int rotateRight11 = rotateRight9 ^ Integers.rotateRight(rotateRight10, 17);
            int i21 = (rotateRight10 ^ i20) + rotateRight11;
            int rotateRight12 = rotateRight11 ^ Integers.rotateRight(i21, 31);
            int rotateRight13 = Integers.rotateRight(rotateRight12, 24) + (i21 ^ i20);
            int rotateRight14 = rotateRight12 ^ Integers.rotateRight(rotateRight13, 16);
            int i22 = rotateRight13 ^ i20;
            int i23 = iArr2[2];
            int rotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int rotateRight16 = i7 ^ Integers.rotateRight(rotateRight15, 24);
            int rotateRight17 = Integers.rotateRight(rotateRight16, 17) + (rotateRight15 ^ i23);
            int rotateRight18 = rotateRight16 ^ Integers.rotateRight(rotateRight17, 17);
            int i24 = (rotateRight17 ^ i23) + rotateRight18;
            int rotateRight19 = rotateRight18 ^ Integers.rotateRight(i24, 31);
            int rotateRight20 = Integers.rotateRight(rotateRight19, 24) + (i24 ^ i23);
            int rotateRight21 = rotateRight19 ^ Integers.rotateRight(rotateRight20, 16);
            int i25 = rotateRight20 ^ i23;
            int i26 = iArr2[3];
            int rotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int rotateRight23 = i9 ^ Integers.rotateRight(rotateRight22, 24);
            int rotateRight24 = Integers.rotateRight(rotateRight23, 17) + (rotateRight22 ^ i26);
            int rotateRight25 = rotateRight23 ^ Integers.rotateRight(rotateRight24, 17);
            int i27 = (rotateRight24 ^ i26) + rotateRight25;
            int rotateRight26 = rotateRight25 ^ Integers.rotateRight(i27, 31);
            int rotateRight27 = Integers.rotateRight(rotateRight26, 24) + (i27 ^ i26);
            int rotateRight28 = rotateRight26 ^ Integers.rotateRight(rotateRight27, 16);
            int i28 = rotateRight27 ^ i26;
            int i29 = iArr2[4];
            int rotateRight29 = Integers.rotateRight(i11, 31) + i10;
            int rotateRight30 = i11 ^ Integers.rotateRight(rotateRight29, 24);
            int rotateRight31 = Integers.rotateRight(rotateRight30, 17) + (rotateRight29 ^ i29);
            int rotateRight32 = rotateRight30 ^ Integers.rotateRight(rotateRight31, 17);
            int i30 = (rotateRight31 ^ i29) + rotateRight32;
            int rotateRight33 = rotateRight32 ^ Integers.rotateRight(i30, 31);
            int rotateRight34 = Integers.rotateRight(rotateRight33, 24) + (i30 ^ i29);
            int rotateRight35 = rotateRight33 ^ Integers.rotateRight(rotateRight34, 16);
            int i31 = i29 ^ rotateRight34;
            int i32 = iArr2[5];
            int rotateRight36 = Integers.rotateRight(i13, 31) + i12;
            int rotateRight37 = Integers.rotateRight(rotateRight36, 24) ^ i13;
            int rotateRight38 = Integers.rotateRight(rotateRight37, 17) + (rotateRight36 ^ i32);
            int rotateRight39 = rotateRight37 ^ Integers.rotateRight(rotateRight38, 17);
            int i33 = (rotateRight38 ^ i32) + rotateRight39;
            int rotateRight40 = rotateRight39 ^ Integers.rotateRight(i33, 31);
            int rotateRight41 = Integers.rotateRight(rotateRight40, 24) + (i33 ^ i32);
            int rotateRight42 = Integers.rotateRight(rotateRight41, 16) ^ rotateRight40;
            int i34 = i32 ^ rotateRight41;
            int ELL = ELL((i19 ^ i22) ^ i25);
            int ELL2 = ELL((rotateRight7 ^ rotateRight14) ^ rotateRight21);
            int i35 = (i31 ^ i22) ^ ELL2;
            int i36 = (rotateRight35 ^ rotateRight14) ^ ELL;
            int i37 = (i34 ^ i25) ^ ELL2;
            int i38 = (rotateRight42 ^ rotateRight21) ^ ELL;
            int i39 = (i28 ^ i19) ^ ELL2;
            int i40 = (rotateRight28 ^ rotateRight7) ^ ELL;
            i14++;
            i12 = i25;
            i13 = rotateRight21;
            i6 = i39;
            i7 = i40;
            i8 = i19;
            i9 = rotateRight7;
            i2 = i35;
            i3 = i36;
            i10 = i22;
            i4 = i37;
            i11 = rotateRight14;
            i5 = i38;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = i6;
        iArr[5] = i7;
        iArr[6] = i8;
        iArr[7] = i9;
        iArr[8] = i10;
        iArr[9] = i11;
        iArr[10] = i12;
        iArr[11] = i13;
    }

    public static void sparkle_opt16(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt16(iArr, i);
    }

    public static void sparkle_opt16(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = i;
        int i18 = i15;
        int i19 = iArr[15];
        int i20 = 0;
        while (i20 < i17) {
            int[] iArr2 = RCON;
            int i21 = i3 ^ iArr2[i20 & 7];
            int i22 = i5 ^ i20;
            int i23 = iArr2[0];
            int rotateRight = Integers.rotateRight(i21, 31) + i2;
            int rotateRight2 = i21 ^ Integers.rotateRight(rotateRight, 24);
            int rotateRight3 = Integers.rotateRight(rotateRight2, 17) + (rotateRight ^ i23);
            int rotateRight4 = rotateRight2 ^ Integers.rotateRight(rotateRight3, 17);
            int i24 = (rotateRight3 ^ i23) + rotateRight4;
            int rotateRight5 = rotateRight4 ^ Integers.rotateRight(i24, 31);
            int rotateRight6 = Integers.rotateRight(rotateRight5, 24) + (i24 ^ i23);
            int rotateRight7 = Integers.rotateRight(rotateRight6, 16) ^ rotateRight5;
            int i25 = rotateRight6 ^ i23;
            int i26 = iArr2[1];
            int i27 = i20;
            int rotateRight8 = Integers.rotateRight(i22, 31) + i4;
            int rotateRight9 = i22 ^ Integers.rotateRight(rotateRight8, 24);
            int rotateRight10 = Integers.rotateRight(rotateRight9, 17) + (rotateRight8 ^ i26);
            int rotateRight11 = rotateRight9 ^ Integers.rotateRight(rotateRight10, 17);
            int i28 = (rotateRight10 ^ i26) + rotateRight11;
            int rotateRight12 = rotateRight11 ^ Integers.rotateRight(i28, 31);
            int rotateRight13 = Integers.rotateRight(rotateRight12, 24) + (i28 ^ i26);
            int rotateRight14 = Integers.rotateRight(rotateRight13, 16) ^ rotateRight12;
            int i29 = rotateRight13 ^ i26;
            int i30 = iArr2[2];
            int rotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int rotateRight16 = Integers.rotateRight(rotateRight15, 24) ^ i7;
            int rotateRight17 = Integers.rotateRight(rotateRight16, 17) + (rotateRight15 ^ i30);
            int rotateRight18 = rotateRight16 ^ Integers.rotateRight(rotateRight17, 17);
            int i31 = (rotateRight17 ^ i30) + rotateRight18;
            int rotateRight19 = rotateRight18 ^ Integers.rotateRight(i31, 31);
            int rotateRight20 = Integers.rotateRight(rotateRight19, 24) + (i31 ^ i30);
            int rotateRight21 = rotateRight19 ^ Integers.rotateRight(rotateRight20, 16);
            int i32 = rotateRight20 ^ i30;
            int i33 = iArr2[3];
            int rotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int rotateRight23 = Integers.rotateRight(rotateRight22, 24) ^ i9;
            int rotateRight24 = Integers.rotateRight(rotateRight23, 17) + (rotateRight22 ^ i33);
            int rotateRight25 = rotateRight23 ^ Integers.rotateRight(rotateRight24, 17);
            int i34 = (rotateRight24 ^ i33) + rotateRight25;
            int rotateRight26 = rotateRight25 ^ Integers.rotateRight(i34, 31);
            int rotateRight27 = Integers.rotateRight(rotateRight26, 24) + (i34 ^ i33);
            int rotateRight28 = rotateRight26 ^ Integers.rotateRight(rotateRight27, 16);
            int i35 = i33 ^ rotateRight27;
            int i36 = iArr2[4];
            int rotateRight29 = Integers.rotateRight(i11, 31) + i10;
            int rotateRight30 = Integers.rotateRight(rotateRight29, 24) ^ i11;
            int rotateRight31 = Integers.rotateRight(rotateRight30, 17) + (rotateRight29 ^ i36);
            int rotateRight32 = rotateRight30 ^ Integers.rotateRight(rotateRight31, 17);
            int i37 = (rotateRight31 ^ i36) + rotateRight32;
            int rotateRight33 = rotateRight32 ^ Integers.rotateRight(i37, 31);
            int rotateRight34 = Integers.rotateRight(rotateRight33, 24) + (i37 ^ i36);
            int rotateRight35 = rotateRight33 ^ Integers.rotateRight(rotateRight34, 16);
            int i38 = i36 ^ rotateRight34;
            int i39 = iArr2[5];
            int rotateRight36 = Integers.rotateRight(i13, 31) + i12;
            int rotateRight37 = Integers.rotateRight(rotateRight36, 24) ^ i13;
            int rotateRight38 = Integers.rotateRight(rotateRight37, 17) + (rotateRight36 ^ i39);
            int rotateRight39 = rotateRight37 ^ Integers.rotateRight(rotateRight38, 17);
            int i40 = (rotateRight38 ^ i39) + rotateRight39;
            int rotateRight40 = rotateRight39 ^ Integers.rotateRight(i40, 31);
            int rotateRight41 = Integers.rotateRight(rotateRight40, 24) + (i40 ^ i39);
            int rotateRight42 = Integers.rotateRight(rotateRight41, 16) ^ rotateRight40;
            int i41 = i39 ^ rotateRight41;
            int i42 = iArr2[6];
            int rotateRight43 = Integers.rotateRight(i18, 31) + i14;
            int rotateRight44 = Integers.rotateRight(rotateRight43, 24) ^ i18;
            int rotateRight45 = Integers.rotateRight(rotateRight44, 17) + (rotateRight43 ^ i42);
            int rotateRight46 = rotateRight44 ^ Integers.rotateRight(rotateRight45, 17);
            int i43 = (rotateRight45 ^ i42) + rotateRight46;
            int rotateRight47 = rotateRight46 ^ Integers.rotateRight(i43, 31);
            int rotateRight48 = Integers.rotateRight(rotateRight47, 24) + (i43 ^ i42);
            int rotateRight49 = rotateRight47 ^ Integers.rotateRight(rotateRight48, 16);
            int i44 = i42 ^ rotateRight48;
            int i45 = iArr2[7];
            int rotateRight50 = Integers.rotateRight(i19, 31) + i16;
            int rotateRight51 = Integers.rotateRight(rotateRight50, 24) ^ i19;
            int rotateRight52 = Integers.rotateRight(rotateRight51, 17) + (rotateRight50 ^ i45);
            int rotateRight53 = rotateRight51 ^ Integers.rotateRight(rotateRight52, 17);
            int i46 = (rotateRight52 ^ i45) + rotateRight53;
            int rotateRight54 = rotateRight53 ^ Integers.rotateRight(i46, 31);
            int rotateRight55 = Integers.rotateRight(rotateRight54, 24) + (i46 ^ i45);
            int rotateRight56 = rotateRight54 ^ Integers.rotateRight(rotateRight55, 16);
            int i47 = rotateRight55 ^ i45;
            int ELL = ELL(((i25 ^ i29) ^ i32) ^ i35);
            int ELL2 = ELL(((rotateRight7 ^ rotateRight14) ^ rotateRight21) ^ rotateRight28);
            int i48 = (i41 ^ i29) ^ ELL2;
            int i49 = (rotateRight14 ^ rotateRight42) ^ ELL;
            int i50 = (i44 ^ i32) ^ ELL2;
            int i51 = (rotateRight21 ^ rotateRight49) ^ ELL;
            int i52 = (i47 ^ i35) ^ ELL2;
            int i53 = (i38 ^ i25) ^ ELL2;
            int i54 = (rotateRight35 ^ rotateRight7) ^ ELL;
            i13 = rotateRight14;
            i4 = i50;
            i12 = i29;
            i5 = i51;
            i14 = i32;
            i7 = (rotateRight56 ^ rotateRight28) ^ ELL;
            i11 = rotateRight7;
            i2 = i48;
            i20 = i27 + 1;
            i18 = rotateRight21;
            i6 = i52;
            i19 = rotateRight28;
            i8 = i53;
            i17 = i;
            i10 = i25;
            i3 = i49;
            i16 = i35;
            i9 = i54;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = i6;
        iArr[5] = i7;
        iArr[6] = i8;
        iArr[7] = i9;
        iArr[8] = i10;
        iArr[9] = i11;
        iArr[10] = i12;
        iArr[11] = i13;
        iArr[12] = i14;
        iArr[13] = i18;
        iArr[14] = i16;
        iArr[15] = i19;
    }

    public static void sparkle_opt8(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = 0;
        char c = 0;
        char c2 = 1;
        while (i10 < i) {
            int[] iArr2 = RCON;
            int i11 = i3 ^ iArr2[i10 & 7];
            int i12 = i5 ^ i10;
            int i13 = iArr2[c];
            int rotateRight = Integers.rotateRight(i11, 31) + i2;
            int rotateRight2 = i11 ^ Integers.rotateRight(rotateRight, 24);
            int rotateRight3 = Integers.rotateRight(rotateRight2, 17) + (rotateRight ^ i13);
            int rotateRight4 = rotateRight2 ^ Integers.rotateRight(rotateRight3, 17);
            int i14 = (rotateRight3 ^ i13) + rotateRight4;
            int rotateRight5 = rotateRight4 ^ Integers.rotateRight(i14, 31);
            int rotateRight6 = Integers.rotateRight(rotateRight5, 24) + (i14 ^ i13);
            int rotateRight7 = rotateRight5 ^ Integers.rotateRight(rotateRight6, 16);
            int i15 = rotateRight6 ^ i13;
            int i16 = iArr2[c2];
            int rotateRight8 = Integers.rotateRight(i12, 31) + i4;
            int rotateRight9 = i12 ^ Integers.rotateRight(rotateRight8, 24);
            int rotateRight10 = Integers.rotateRight(rotateRight9, 17) + (rotateRight8 ^ i16);
            int rotateRight11 = rotateRight9 ^ Integers.rotateRight(rotateRight10, 17);
            int i17 = (rotateRight10 ^ i16) + rotateRight11;
            int rotateRight12 = rotateRight11 ^ Integers.rotateRight(i17, 31);
            int rotateRight13 = Integers.rotateRight(rotateRight12, 24) + (i17 ^ i16);
            int rotateRight14 = Integers.rotateRight(rotateRight13, 16) ^ rotateRight12;
            int i18 = rotateRight13 ^ i16;
            int i19 = iArr2[2];
            int rotateRight15 = Integers.rotateRight(i7, 31) + i6;
            int rotateRight16 = Integers.rotateRight(rotateRight15, 24) ^ i7;
            int rotateRight17 = Integers.rotateRight(rotateRight16, 17) + (rotateRight15 ^ i19);
            int rotateRight18 = rotateRight16 ^ Integers.rotateRight(rotateRight17, 17);
            int i20 = (rotateRight17 ^ i19) + rotateRight18;
            int rotateRight19 = rotateRight18 ^ Integers.rotateRight(i20, 31);
            int rotateRight20 = Integers.rotateRight(rotateRight19, 24) + (i20 ^ i19);
            int rotateRight21 = rotateRight19 ^ Integers.rotateRight(rotateRight20, 16);
            int i21 = rotateRight20 ^ i19;
            int i22 = iArr2[3];
            int rotateRight22 = Integers.rotateRight(i9, 31) + i8;
            int rotateRight23 = Integers.rotateRight(rotateRight22, 24) ^ i9;
            int rotateRight24 = Integers.rotateRight(rotateRight23, 17) + (rotateRight22 ^ i22);
            int rotateRight25 = rotateRight23 ^ Integers.rotateRight(rotateRight24, 17);
            int i23 = (rotateRight24 ^ i22) + rotateRight25;
            int rotateRight26 = rotateRight25 ^ Integers.rotateRight(i23, 31);
            int rotateRight27 = Integers.rotateRight(rotateRight26, 24) + (i23 ^ i22);
            int rotateRight28 = rotateRight26 ^ Integers.rotateRight(rotateRight27, 16);
            int ELL = ELL(i15 ^ i18);
            int ELL2 = ELL(rotateRight7 ^ rotateRight14);
            int i24 = ((rotateRight27 ^ i22) ^ i18) ^ ELL2;
            int i25 = (rotateRight28 ^ rotateRight14) ^ ELL;
            int i26 = (i21 ^ i15) ^ ELL2;
            int i27 = (rotateRight21 ^ rotateRight7) ^ ELL;
            i10++;
            i9 = rotateRight14;
            i4 = i26;
            c = 0;
            c2 = 1;
            i7 = rotateRight7;
            i3 = i25;
            i8 = i18;
            i5 = i27;
            i6 = i15;
            i2 = i24;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = i6;
        iArr[5] = i7;
        iArr[6] = i8;
        iArr[7] = i9;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD2(state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i) {
        return super.getOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i) {
        return super.getUpdateOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) {
        Pack.littleEndianToInt(bArr, 0, this.k);
        Pack.littleEndianToInt(bArr2, 0, this.npub);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b) {
        super.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.RATE_WORDS;
            if (i2 >= i3 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                return;
            }
            int i4 = (i3 / 2) + i2;
            int[] iArr = this.state;
            int i5 = iArr[i2];
            int i6 = iArr[i4];
            int littleEndianToInt = Pack.littleEndianToInt(bArr, (i2 * 4) + i);
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, (i4 * 4) + i);
            int[] iArr2 = this.state;
            int i7 = this.RATE_WORDS;
            iArr2[i2] = (littleEndianToInt ^ i6) ^ iArr2[i7 + i2];
            iArr2[i4] = ((i6 ^ i5) ^ littleEndianToInt2) ^ iArr2[i7 + (this.CAP_MASK & i4)];
            i2++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = this.RATE_WORDS;
            if (i3 >= i4 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i5 = (i4 / 2) + i3;
            int[] iArr = this.state;
            int i6 = iArr[i3];
            int i7 = iArr[i5];
            int i8 = i3 * 4;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, i + i8);
            int i9 = i5 * 4;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i9);
            int[] iArr2 = this.state;
            int i10 = this.RATE_WORDS;
            iArr2[i3] = ((i6 ^ i7) ^ littleEndianToInt) ^ iArr2[i10 + i3];
            iArr2[i5] = (i6 ^ littleEndianToInt2) ^ iArr2[i10 + (this.CAP_MASK & i5)];
            Pack.intToLittleEndian(littleEndianToInt ^ i6, bArr2, i2 + i8);
            Pack.intToLittleEndian(littleEndianToInt2 ^ i7, bArr2, i2 + i9);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = this.RATE_WORDS;
            if (i3 >= i4 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i5 = (i4 / 2) + i3;
            int[] iArr = this.state;
            int i6 = iArr[i3];
            int i7 = iArr[i5];
            int i8 = i3 * 4;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, i + i8);
            int i9 = i5 * 4;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i9);
            int[] iArr2 = this.state;
            int i10 = this.RATE_WORDS;
            iArr2[i3] = (i7 ^ littleEndianToInt) ^ iArr2[i10 + i3];
            iArr2[i5] = ((i6 ^ i7) ^ littleEndianToInt2) ^ iArr2[i10 + (this.CAP_MASK & i5)];
            Pack.intToLittleEndian(littleEndianToInt ^ i6, bArr2, i2 + i8);
            Pack.intToLittleEndian(littleEndianToInt2 ^ i7, bArr2, i2 + i9);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b, byte[] bArr, int i) {
        return super.processByte(b, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return super.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        int i = this.m_aadPos;
        int i2 = this.BlockSize;
        int i3 = 0;
        if (i < i2) {
            int[] iArr = this.state;
            int i4 = this.STATE_WORDS - 1;
            iArr[i4] = iArr[i4] ^ this._A0;
            byte[] bArr = this.m_aad;
            int i5 = i + 1;
            this.m_aadPos = i5;
            bArr[i] = GCMSIVBlockCipher.MASK;
            Arrays.fill(bArr, i5, i2, (byte) 0);
        } else {
            int[] iArr2 = this.state;
            int i6 = this.STATE_WORDS - 1;
            iArr2[i6] = iArr2[i6] ^ this._A1;
        }
        while (true) {
            int i7 = this.RATE_WORDS;
            if (i3 >= i7 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
                return;
            }
            int i8 = (i7 / 2) + i3;
            int[] iArr3 = this.state;
            int i9 = iArr3[i3];
            int i10 = iArr3[i8];
            int littleEndianToInt = Pack.littleEndianToInt(this.m_aad, i3 * 4);
            int littleEndianToInt2 = Pack.littleEndianToInt(this.m_aad, i8 * 4);
            int[] iArr4 = this.state;
            int i11 = this.RATE_WORDS;
            iArr4[i3] = (littleEndianToInt ^ i10) ^ iArr4[i11 + i3];
            iArr4[i8] = ((i10 ^ i9) ^ littleEndianToInt2) ^ iArr4[i11 + (this.CAP_MASK & i8)];
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        int i2;
        if (this.encrypted || this.m_bufPos > 0) {
            int[] iArr = this.state;
            int i3 = this.STATE_WORDS - 1;
            iArr[i3] = iArr[i3] ^ (this.m_bufPos < this.IV_SIZE ? this._M2 : this._M3);
            int[] iArr2 = new int[this.RATE_WORDS];
            int i4 = 0;
            while (true) {
                i2 = this.m_bufPos;
                if (i4 >= i2) {
                    break;
                }
                int i5 = i4 >>> 2;
                iArr2[i5] = iArr2[i5] | ((this.m_buf[i4] & 255) << ((i4 & 3) << 3));
                i4++;
            }
            if (i2 < this.IV_SIZE) {
                if (!this.forEncryption) {
                    int i6 = (i2 & 3) << 3;
                    int i7 = i2 >>> 2;
                    int i8 = iArr2[i7];
                    int[] iArr3 = this.state;
                    iArr2[i7] = ((iArr3[i2 >>> 2] >>> i6) << i6) | i8;
                    int i9 = (i2 >>> 2) + 1;
                    System.arraycopy(iArr3, i9, iArr2, i9, this.RATE_WORDS - i9);
                }
                int i10 = this.m_bufPos;
                int i11 = i10 >>> 2;
                iArr2[i11] = (128 << ((i10 & 3) << 3)) ^ iArr2[i11];
            }
            int i12 = 0;
            while (true) {
                int i13 = this.RATE_WORDS;
                if (i12 >= i13 / 2) {
                    break;
                }
                int i14 = (i13 / 2) + i12;
                int[] iArr4 = this.state;
                int i15 = iArr4[i12];
                int i16 = iArr4[i14];
                if (this.forEncryption) {
                    iArr4[i12] = (iArr2[i12] ^ i16) ^ iArr4[i13 + i12];
                    iArr4[i14] = iArr4[i13 + (this.CAP_MASK & i14)] ^ ((i15 ^ i16) ^ iArr2[i14]);
                } else {
                    iArr4[i12] = ((i15 ^ i16) ^ iArr2[i12]) ^ iArr4[i13 + i12];
                    iArr4[i14] = iArr4[i13 + (this.CAP_MASK & i14)] ^ (iArr2[i14] ^ i15);
                }
                iArr2[i12] = iArr2[i12] ^ i15;
                iArr2[i14] = iArr2[i14] ^ i16;
                i12++;
            }
            int i17 = 0;
            while (i17 < this.m_bufPos) {
                bArr[i] = (byte) (iArr2[i17 >>> 2] >>> ((i17 & 3) << 3));
                i17++;
                i++;
            }
            sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        }
        for (int i18 = 0; i18 < this.KEY_WORDS; i18++) {
            int[] iArr5 = this.state;
            int i19 = this.RATE_WORDS + i18;
            iArr5[i19] = iArr5[i19] ^ this.k[i18];
        }
        Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, this.mac, 0);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        this.encrypted = false;
        System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
        System.arraycopy(this.k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
        sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        super.reset(z);
    }
}
