package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class Permute {
    public static final int CHACHA_ROUNDS = 12;

    public static void permute(int i, int[] iArr) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
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
        int i14 = 12;
        int i15 = iArr[12];
        int i16 = iArr[13];
        int i17 = iArr[14];
        int i18 = i7;
        int i19 = i12;
        int i20 = iArr[15];
        int i21 = 7;
        int i22 = 8;
        int i23 = i5;
        int i24 = i10;
        int i25 = i17;
        int i26 = i3;
        int i27 = i9;
        int i28 = i16;
        int i29 = i2;
        int i30 = i8;
        int i31 = i15;
        int i32 = i;
        int i33 = i6;
        int i34 = i13;
        int i35 = i4;
        int i36 = i11;
        int i37 = 16;
        while (i32 > 0) {
            int i38 = i29 + i33;
            int rotl = rotl(i31 ^ i38, i37);
            int i39 = i24 + rotl;
            int rotl2 = rotl(i33 ^ i39, i14);
            int i40 = i38 + rotl2;
            int rotl3 = rotl(rotl ^ i40, i22);
            int i41 = i39 + rotl3;
            int rotl4 = rotl(rotl2 ^ i41, i21);
            int i42 = i26 + i18;
            int rotl5 = rotl(i28 ^ i42, i37);
            int i43 = i36 + rotl5;
            int rotl6 = rotl(i18 ^ i43, i14);
            int i44 = i42 + rotl6;
            int rotl7 = rotl(rotl5 ^ i44, i22);
            int i45 = i43 + rotl7;
            int rotl8 = rotl(rotl6 ^ i45, i21);
            int i46 = i35 + i30;
            int rotl9 = rotl(i25 ^ i46, i37);
            int i47 = i19 + rotl9;
            int rotl10 = rotl(i30 ^ i47, 12);
            int i48 = i46 + rotl10;
            int rotl11 = rotl(rotl9 ^ i48, i22);
            int i49 = i47 + rotl11;
            int rotl12 = rotl(rotl10 ^ i49, i21);
            int i50 = i23 + i27;
            int rotl13 = rotl(i20 ^ i50, i37);
            int i51 = i34 + rotl13;
            int rotl14 = rotl(i27 ^ i51, 12);
            int i52 = i50 + rotl14;
            int rotl15 = rotl(rotl13 ^ i52, i22);
            int i53 = i51 + rotl15;
            int rotl16 = rotl(rotl14 ^ i53, 7);
            int i54 = i40 + rotl8;
            int rotl17 = rotl(rotl15 ^ i54, 16);
            int i55 = i49 + rotl17;
            int rotl18 = rotl(rotl8 ^ i55, 12);
            i29 = i54 + rotl18;
            i20 = rotl(rotl17 ^ i29, 8);
            i19 = i55 + i20;
            i18 = rotl(rotl18 ^ i19, 7);
            int i56 = i44 + rotl12;
            int rotl19 = rotl(rotl3 ^ i56, 16);
            int i57 = i53 + rotl19;
            int rotl20 = rotl(rotl12 ^ i57, 12);
            i26 = i56 + rotl20;
            i31 = rotl(rotl19 ^ i26, 8);
            i34 = i57 + i31;
            int rotl21 = rotl(rotl20 ^ i34, 7);
            int i58 = i48 + rotl16;
            int rotl22 = rotl(rotl7 ^ i58, 16);
            int i59 = i41 + rotl22;
            int rotl23 = rotl(rotl16 ^ i59, 12);
            i35 = i58 + rotl23;
            i28 = rotl(rotl22 ^ i35, 8);
            i24 = i59 + i28;
            i27 = rotl(rotl23 ^ i24, 7);
            int i60 = i52 + rotl4;
            int rotl24 = rotl(rotl11 ^ i60, 16);
            int i61 = i45 + rotl24;
            int rotl25 = rotl(rotl4 ^ i61, 12);
            i23 = i60 + rotl25;
            i25 = rotl(rotl24 ^ i23, 8);
            i36 = i61 + i25;
            i33 = rotl(rotl25 ^ i36, 7);
            i32 -= 2;
            i21 = 7;
            i37 = 16;
            i22 = 8;
            i30 = rotl21;
            i14 = 12;
        }
        iArr[0] = i29;
        iArr[1] = i26;
        iArr[2] = i35;
        iArr[3] = i23;
        iArr[4] = i33;
        iArr[5] = i18;
        iArr[6] = i30;
        iArr[7] = i27;
        iArr[8] = i24;
        iArr[9] = i36;
        iArr[10] = i19;
        iArr[11] = i34;
        iArr[12] = i31;
        iArr[13] = i28;
        iArr[14] = i25;
        iArr[15] = i20;
    }

    public static int rotl(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public void chacha_permute(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = Pack.littleEndianToInt(bArr2, i * 4);
        }
        permute(12, iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            Pack.intToLittleEndian(iArr[i2], bArr, i2 * 4);
        }
    }
}
