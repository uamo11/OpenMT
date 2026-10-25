package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* compiled from: 76BA */
/* renamed from: l.᩹ۘۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22033 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public short[] f70631;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f70632;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21328 f70633;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f70624 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int[] f70625 = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f70629 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 7};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f70623 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, cb.k, 2, cb.f77931l, 1, 15};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f70628 = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.k, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 16, 17, 18, 18, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29};

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f70627 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, cb.k, cb.k, cb.k, cb.k, cb.f77931l, cb.f77931l, cb.f77931l, cb.f77931l, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB};

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f70630 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 0};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int[] f70626 = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, MLKEMEngine.KyberPolyBytes, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v21, types: [short] */
    /* JADX WARN: Type inference failed for: r5v22, types: [int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49575(C15681 c15681) {
        int i;
        short[] sArr;
        short s;
        int i2;
        int i3;
        int i4;
        int i5;
        short[] sArr2 = this.f70631;
        C21328 c21328 = this.f70633;
        short[] sArr3 = c21328.f68731;
        int i6 = c21328.f68728;
        c15681.f48325 = 0;
        int i7 = 573;
        c15681.f48284 = 573;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = i9 * 2;
            if (sArr2[i10] != 0) {
                int[] iArr = c15681.f48303;
                int i11 = c15681.f48325 + 1;
                c15681.f48325 = i11;
                iArr[i11] = i9;
                c15681.f48295[i9] = 0;
                i8 = i9;
            } else {
                sArr2[i10 + 1] = 0;
            }
        }
        while (true) {
            i = c15681.f48325;
            if (i >= 2) {
                break;
            }
            int[] iArr2 = c15681.f48303;
            int i12 = i + 1;
            c15681.f48325 = i12;
            if (i8 < 2) {
                i5 = i8 + 1;
                i4 = i5;
            } else {
                i4 = i8;
                i5 = 0;
            }
            iArr2[i12] = i5;
            int i13 = i5 * 2;
            sArr2[i13] = 1;
            c15681.f48295[i5] = 0;
            c15681.f48277--;
            if (sArr3 != null) {
                c15681.f48287 -= sArr3[i13 + 1];
            }
            i8 = i4;
        }
        this.f70632 = i8;
        for (int i14 = i / 2; i14 >= 1; i14--) {
            c15681.m36942(sArr2, i14);
        }
        while (true) {
            int[] iArr3 = c15681.f48303;
            int i15 = iArr3[1];
            int i16 = c15681.f48325;
            c15681.f48325 = i16 - 1;
            iArr3[1] = iArr3[i16];
            c15681.m36942(sArr2, 1);
            int[] iArr4 = c15681.f48303;
            int i17 = iArr4[1];
            int i18 = c15681.f48284;
            int i19 = i18 - 1;
            c15681.f48284 = i19;
            iArr4[i19] = i15;
            int i20 = i18 - 2;
            c15681.f48284 = i20;
            iArr4[i20] = i17;
            int i21 = i15 * 2;
            int i22 = i17 * 2;
            sArr2[i6 * 2] = (short) (sArr2[i21] + sArr2[i22]);
            byte[] bArr = c15681.f48295;
            bArr[i6] = (byte) (Math.max((int) bArr[i15], (int) bArr[i17]) + 1);
            short s2 = (short) i6;
            sArr2[i22 + 1] = s2;
            sArr2[i21 + 1] = s2;
            int i23 = i6 + 1;
            c15681.f48303[1] = i6;
            c15681.m36942(sArr2, 1);
            if (c15681.f48325 < 2) {
                break;
            } else {
                i6 = i23;
            }
        }
        int[] iArr5 = c15681.f48303;
        int i24 = c15681.f48284 - 1;
        c15681.f48284 = i24;
        iArr5[i24] = iArr5[1];
        short[] sArr4 = this.f70631;
        C21328 c213282 = this.f70633;
        short[] sArr5 = c213282.f68731;
        int[] iArr6 = c213282.f68730;
        int i25 = c213282.f68729;
        int i26 = c213282.f68732;
        for (int i27 = 0; i27 <= 15; i27++) {
            c15681.f48315[i27] = 0;
        }
        int[] iArr7 = c15681.f48303;
        int i28 = c15681.f48284;
        sArr4[(iArr7[i28] * 2) + 1] = 0;
        int i29 = i28 + 1;
        int i30 = 0;
        while (i29 < i7) {
            int i31 = c15681.f48303[i29];
            int i32 = i31 * 2;
            int i33 = i32 + 1;
            int i34 = sArr4[(sArr4[i33] * 2) + 1] + 1;
            if (i34 > i26) {
                i30++;
                i34 = i26;
            }
            sArr4[i33] = (short) i34;
            if (i31 > this.f70632) {
                i3 = i30;
            } else {
                short[] sArr6 = c15681.f48315;
                i3 = i30;
                sArr6[i34] = (short) (sArr6[i34] + 1);
                int i35 = i31 >= i25 ? iArr6[i31 - i25] : 0;
                short s3 = sArr4[i32];
                c15681.f48277 = C20094.m46314(i34, i35, s3, c15681.f48277);
                if (sArr5 != null) {
                    c15681.f48287 = C20094.m46314(sArr5[i33], i35, s3, c15681.f48287);
                }
            }
            i29++;
            i7 = 573;
            i30 = i3;
        }
        if (i30 != 0) {
            do {
                int i36 = i26 - 1;
                while (true) {
                    sArr = c15681.f48315;
                    s = sArr[i36];
                    if (s != 0) {
                        break;
                    } else {
                        i36--;
                    }
                }
                sArr[i36] = (short) (s - 1);
                int i37 = i36 + 1;
                sArr[i37] = (short) (sArr[i37] + 2);
                sArr[i26] = (short) (sArr[i26] - 1);
                i30 -= 2;
            } while (i30 > 0);
            while (i26 != 0) {
                short s4 = c15681.f48315[i26];
                while (s4 != 0) {
                    i29--;
                    int i38 = c15681.f48303[i29];
                    if (i38 <= this.f70632) {
                        int i39 = (i38 * 2) + 1;
                        short s5 = sArr4[i39];
                        if (s5 != i26) {
                            i2 = i29;
                            c15681.f48277 += (int) ((i26 - s5) * sArr4[r6]);
                            sArr4[i39] = (short) i26;
                        } else {
                            i2 = i29;
                        }
                        s4--;
                        i29 = i2;
                    }
                }
                i26--;
            }
        }
        short[] sArr7 = c15681.f48315;
        short[] sArr8 = c15681.f48316;
        sArr8[0] = 0;
        short s6 = 0;
        for (int i40 = 1; i40 <= 15; i40++) {
            s6 = (short) ((s6 + sArr7[i40 - 1]) << 1);
            sArr8[i40] = s6;
        }
        for (int i41 = 0; i41 <= i8; i41++) {
            int i42 = i41 * 2;
            short s7 = sArr2[i42 + 1];
            if (s7 != 0) {
                short s8 = sArr8[s7];
                sArr8[s7] = (short) (s8 + 1);
                int i43 = 0;
                do {
                    int i44 = i43 | (s8 & 1);
                    s8 >>>= 1;
                    i43 = i44 << 1;
                    s7--;
                } while (s7 > 0);
                sArr2[i42] = (short) (i43 >>> 1);
            }
        }
    }
}
