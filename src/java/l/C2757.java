package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: ABJA */
/* renamed from: l.ۖ᩶ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2757 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float[] f8569;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f8570;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m8520() {
        return this.f8570;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] m8519() {
        return this.f8569;
    }

    public C2757(char c, float[] fArr) {
        this.f8570 = c;
        this.f8569 = fArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8518(C2757[] c2757Arr) {
        char c = ' ';
        for (C2757 c2757 : c2757Arr) {
            if ((c == 'z' || c == 'Z') && c2757.f8570 == 'm') {
                return true;
            }
            c = c2757.f8570;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8514(C2757[] c2757Arr, C9813 c9813) {
        char c;
        boolean z;
        StringBuilder sb = new StringBuilder();
        for (C2757 c2757 : c2757Arr) {
            sb.append(c2757.f8570);
            int length = c2757.f8569.length;
            char c2 = c2757.f8570;
            if ((c2 == 'm' || c2 == 'M') && length > 2) {
                c = c2 == 'm' ? 'l' : 'L';
                z = true;
            } else {
                c = ' ';
                z = false;
            }
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(i % 2 != 0 ? "," : " ");
                }
                if (z && i == 2) {
                    sb.append(c);
                }
                float f = c2757.f8569[i];
                if (Math.abs(f) > Float.MAX_VALUE) {
                    throw new IllegalArgumentException("Invalid number: " + f);
                }
                sb.append(c9813.m24847(f));
            }
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8516(C0639 c0639, C2757[] c2757Arr) {
        AbstractC9608 abstractC9608;
        float f;
        float f2;
        C15455 c15455;
        int i;
        C2757 c2757;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i3;
        C15455 c154552;
        int i4;
        int i5;
        C2757 c27572;
        int i6;
        C2757[] c2757Arr2 = c2757Arr;
        C15455 c154553 = new C15455();
        C15455 c154554 = new C15455();
        int length = c2757Arr2.length;
        char c = ' ';
        int i7 = 0;
        while (i7 < length) {
            C2757 c27573 = c2757Arr2[i7];
            int length2 = c27573.f8569.length;
            int i8 = length2 * 2;
            float[] fArr = new float[i8];
            float f8 = c154553.f47314;
            float f9 = c154553.f47315;
            float f10 = c154554.f47314;
            float f11 = c154554.f47315;
            abstractC9608 = C4168.f13597;
            int i9 = i7;
            int intValue = ((Integer) abstractC9608.get(Character.valueOf(c27573.f8570))).intValue();
            switch (c27573.f8570) {
                case 'A':
                    f = f11;
                    f2 = f10;
                    c15455 = c154554;
                    i = length;
                    c2757 = c27573;
                    float f12 = f8;
                    f11 = f9;
                    int i10 = 0;
                    while (i10 < (length2 - intValue) + 1) {
                        if (!m8517(c0639)) {
                            float[] fArr2 = c2757.f8569;
                            int i11 = i10 + 1;
                            int i12 = i10 + 2;
                            int i13 = i10 + 4;
                            C16224 c16224 = new C16224(c0639, f12, f11, fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i10 + 3], fArr2[i13], fArr2[i10 + 5], fArr2[i10 + 6]);
                            c2757.f8569[i10] = c16224.m38181();
                            c2757.f8569[i11] = c16224.m38182();
                            c2757.f8569[i12] = c16224.m38183();
                            if (c16224.m38180()) {
                                float[] fArr3 = c2757.f8569;
                                fArr3[i13] = 1.0f - fArr3[i13];
                            }
                        }
                        float[] fArr4 = c2757.f8569;
                        int i14 = i10 + 5;
                        float f13 = fArr4[i14];
                        float f14 = fArr4[i10 + 6];
                        c0639.m2609(fArr4, i14, fArr4, i14, 1);
                        i10 += intValue;
                        f12 = f13;
                        f11 = f14;
                    }
                    f10 = f12;
                    f4 = f;
                    f5 = f2;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c154555 = c15455;
                    c154555.f47314 = f5;
                    c154555.f47315 = f4;
                    char c2 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c154555;
                    c = c2;
                    length = i;
                case 'C':
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                case 'Q':
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                case 'T':
                    f = f11;
                    f2 = f10;
                    c15455 = c154554;
                    i = length;
                    i2 = length2;
                    c2757 = c27573;
                    float[] fArr5 = c2757.f8569;
                    float f15 = fArr5[i2 - 2];
                    float f16 = fArr5[i2 - 1];
                    c0639.m2609(fArr5, 0, fArr5, 0, i2 / 2);
                    f10 = f15;
                    f11 = f16;
                    f4 = f;
                    f5 = f2;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c1545552 = c15455;
                    c1545552.f47314 = f5;
                    c1545552.f47315 = f4;
                    char c22 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c1545552;
                    c = c22;
                    length = i;
                case 'H':
                    f = f11;
                    f2 = f10;
                    c15455 = c154554;
                    i = length;
                    c2757 = c27573;
                    c2757.f8570 = 'L';
                    for (int i15 = 0; i15 < length2; i15++) {
                        int i16 = i15 * 2;
                        float[] fArr6 = c2757.f8569;
                        fArr[i16] = fArr6[i15];
                        fArr[i16 + 1] = f9;
                        f8 = fArr6[i15];
                    }
                    f3 = f9;
                    c0639.m2609(fArr, 0, fArr, 0, length2);
                    c2757.f8569 = fArr;
                    f11 = f3;
                    f10 = f8;
                    f4 = f;
                    f5 = f2;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c15455522 = c15455;
                    c15455522.f47314 = f5;
                    c15455522.f47315 = f4;
                    char c222 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c15455522;
                    c = c222;
                    length = i;
                case 'M':
                    c15455 = c154554;
                    i = length;
                    i2 = length2;
                    c2757 = c27573;
                    float[] fArr7 = c2757.f8569;
                    float f17 = fArr7[0];
                    f = fArr7[1];
                    f2 = f17;
                    float[] fArr52 = c2757.f8569;
                    float f152 = fArr52[i2 - 2];
                    float f162 = fArr52[i2 - 1];
                    c0639.m2609(fArr52, 0, fArr52, 0, i2 / 2);
                    f10 = f152;
                    f11 = f162;
                    f4 = f;
                    f5 = f2;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c154555222 = c15455;
                    c154555222.f47314 = f5;
                    c154555222.f47315 = f4;
                    char c2222 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c154555222;
                    c = c2222;
                    length = i;
                case HRSS1373Polynomial.K /* 86 */:
                    f = f11;
                    f2 = f10;
                    c15455 = c154554;
                    i = length;
                    c2757 = c27573;
                    c2757.f8570 = 'L';
                    f3 = f9;
                    for (int i17 = 0; i17 < length2; i17++) {
                        int i18 = i17 * 2;
                        fArr[i18] = f8;
                        float[] fArr8 = c2757.f8569;
                        fArr[i18 + 1] = fArr8[i17];
                        f3 = fArr8[i17];
                    }
                    c0639.m2609(fArr, 0, fArr, 0, length2);
                    c2757.f8569 = fArr;
                    f11 = f3;
                    f10 = f8;
                    f4 = f;
                    f5 = f2;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c1545552222 = c15455;
                    c1545552222.f47314 = f5;
                    c1545552222.f47315 = f4;
                    char c22222 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c1545552222;
                    c = c22222;
                    length = i;
                case 'Z':
                case 'z':
                    c15455 = c154554;
                    i = length;
                    c2757 = c27573;
                    f4 = f11;
                    f5 = f10;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c15455522222 = c15455;
                    c15455522222.f47314 = f5;
                    c15455522222.f47315 = f4;
                    char c222222 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c15455522222;
                    c = c222222;
                    length = i;
                case 'a':
                    float f18 = f8;
                    C0639 c06392 = c0639;
                    int i19 = 0;
                    while (i19 < (length2 - intValue) + 1) {
                        float[] fArr9 = c27573.f8569;
                        int i20 = i19 + 5;
                        float f19 = f18 + fArr9[i20];
                        int i21 = i19 + 6;
                        float f20 = f9 + fArr9[i21];
                        if (m8517(c06392)) {
                            f6 = f11;
                            f7 = f10;
                            i3 = i19;
                            c154552 = c154554;
                            i4 = length;
                            i5 = length2;
                            c27572 = c27573;
                        } else {
                            float[] fArr10 = c27573.f8569;
                            int i22 = i19 + 1;
                            int i23 = i19 + 2;
                            int i24 = i19 + 4;
                            f6 = f11;
                            f7 = f10;
                            i4 = length;
                            i5 = length2;
                            c154552 = c154554;
                            c27572 = c27573;
                            i3 = i19;
                            C16224 c162242 = new C16224(c0639, f18, f9, fArr10[i19], fArr10[i22], fArr10[i23], fArr10[i19 + 3], fArr10[i24], f18 + fArr10[i20], f9 + fArr10[i21]);
                            m8515(c0639, c27572.f8569, i20, 2);
                            c27572.f8569[i3] = c162242.m38181();
                            c27572.f8569[i22] = c162242.m38182();
                            c27572.f8569[i23] = c162242.m38183();
                            if (c162242.m38180()) {
                                float[] fArr11 = c27572.f8569;
                                fArr11[i24] = 1.0f - fArr11[i24];
                            }
                            c06392 = c0639;
                        }
                        i19 = i3 + intValue;
                        c27573 = c27572;
                        length2 = i5;
                        f18 = f19;
                        f9 = f20;
                        length = i4;
                        c154554 = c154552;
                        f11 = f6;
                        f10 = f7;
                    }
                    f = f11;
                    f2 = f10;
                    c15455 = c154554;
                    i = length;
                    c2757 = c27573;
                    f10 = f18;
                    f11 = f9;
                    f4 = f;
                    f5 = f2;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c154555222222 = c15455;
                    c154555222222.f47314 = f5;
                    c154555222222.f47315 = f4;
                    char c2222222 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c154555222222;
                    c = c2222222;
                    length = i;
                case q.f /* 99 */:
                case 'l':
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case 's':
                case 't':
                    int i25 = 0;
                    while (i25 < (length2 - intValue) + 1) {
                        float[] fArr12 = c27573.f8569;
                        i25 += intValue;
                        f8 += fArr12[i25 - 2];
                        f9 += fArr12[i25 - 1];
                    }
                    if (!m8517(c0639)) {
                        m8515(c0639, c27573.f8569, 0, length2);
                    }
                    f5 = f10;
                    f10 = f8;
                    c15455 = c154554;
                    i = length;
                    f4 = f11;
                    f11 = f9;
                    c2757 = c27573;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c1545552222222 = c15455;
                    c1545552222222.f47314 = f5;
                    c1545552222222.f47315 = f4;
                    char c22222222 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c1545552222222;
                    c = c22222222;
                    length = i;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    for (int i26 = 0; i26 < length2; i26++) {
                        float f21 = c27573.f8569[i26];
                        f8 += f21;
                        int i27 = i26 * 2;
                        fArr[i27] = f21;
                        fArr[i27 + 1] = 0.0f;
                    }
                    if (!m8517(c0639)) {
                        c27573.f8570 = 'l';
                        m8515(c0639, fArr, 0, i8);
                        c27573.f8569 = fArr;
                    }
                    f5 = f10;
                    f10 = f8;
                    c15455 = c154554;
                    i = length;
                    f4 = f11;
                    f11 = f9;
                    c2757 = c27573;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c15455522222222 = c15455;
                    c15455522222222.f47314 = f5;
                    c15455522222222.f47315 = f4;
                    char c222222222 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c15455522222222;
                    c = c222222222;
                    length = i;
                case 'm':
                    if (c == 'z' || c == 'Z') {
                        c27573.f8570 = 'M';
                        float[] fArr13 = c27573.f8569;
                        f5 = fArr13[0] + f10;
                        fArr13[0] = f5;
                        f4 = f11 + fArr13[1];
                        fArr13[1] = f4;
                        for (int i28 = intValue; i28 < length2; i28 += intValue) {
                            float[] fArr14 = c27573.f8569;
                            fArr14[i28] = fArr14[i28] + fArr14[i28 - intValue];
                            int i29 = i28 + 1;
                            fArr14[i29] = fArr14[i29] + fArr14[i29 - intValue];
                        }
                        float[] fArr15 = c27573.f8569;
                        float f22 = fArr15[length2 - 2];
                        float f23 = fArr15[length2 - 1];
                        c0639.m2609(fArr15, 0, fArr15, 0, length2 / 2);
                        f10 = f22;
                        c15455 = c154554;
                        i = length;
                        f11 = f23;
                        c2757 = c27573;
                        c154553.f47314 = f10;
                        c154553.f47315 = f11;
                        C15455 c154555222222222 = c15455;
                        c154555222222222.f47314 = f5;
                        c154555222222222.f47315 = f4;
                        char c2222222222 = c2757.f8570;
                        i7 = i9 + 1;
                        c2757Arr2 = c2757Arr;
                        c154554 = c154555222222222;
                        c = c2222222222;
                        length = i;
                    } else {
                        float[] fArr16 = c27573.f8569;
                        float f24 = f8 + fArr16[0];
                        float f25 = f9 + fArr16[1];
                        if (c == ' ') {
                            i6 = 2;
                            c0639.m2609(fArr16, 0, fArr16, 0, 1);
                        } else {
                            i6 = 2;
                            if (!m8517(c0639)) {
                                m8515(c0639, c27573.f8569, 0, 2);
                            }
                        }
                        float f26 = f24;
                        float f27 = f25;
                        for (int i30 = 2; i30 < length2; i30 += intValue) {
                            float[] fArr17 = c27573.f8569;
                            f26 += fArr17[i30];
                            f27 += fArr17[i30 + 1];
                        }
                        if (!m8517(c0639)) {
                            m8515(c0639, c27573.f8569, i6, length2 - 2);
                        }
                        f9 = f27;
                        f10 = f24;
                        f11 = f25;
                        f8 = f26;
                        f5 = f10;
                        f10 = f8;
                        c15455 = c154554;
                        i = length;
                        f4 = f11;
                        f11 = f9;
                        c2757 = c27573;
                        c154553.f47314 = f10;
                        c154553.f47315 = f11;
                        C15455 c1545552222222222 = c15455;
                        c1545552222222222.f47314 = f5;
                        c1545552222222222.f47315 = f4;
                        char c22222222222 = c2757.f8570;
                        i7 = i9 + 1;
                        c2757Arr2 = c2757Arr;
                        c154554 = c1545552222222222;
                        c = c22222222222;
                        length = i;
                    }
                    break;
                case 'v':
                    for (int i31 = 0; i31 < length2; i31++) {
                        int i32 = i31 * 2;
                        fArr[i32] = 0.0f;
                        float[] fArr18 = c27573.f8569;
                        fArr[i32 + 1] = fArr18[i31];
                        f9 += fArr18[i31];
                    }
                    if (!m8517(c0639)) {
                        c27573.f8570 = 'l';
                        m8515(c0639, fArr, 0, i8);
                        c27573.f8569 = fArr;
                    }
                    f5 = f10;
                    f10 = f8;
                    c15455 = c154554;
                    i = length;
                    f4 = f11;
                    f11 = f9;
                    c2757 = c27573;
                    c154553.f47314 = f10;
                    c154553.f47315 = f11;
                    C15455 c15455522222222222 = c15455;
                    c15455522222222222.f47314 = f5;
                    c15455522222222222.f47315 = f4;
                    char c222222222222 = c2757.f8570;
                    i7 = i9 + 1;
                    c2757Arr2 = c2757Arr;
                    c154554 = c15455522222222222;
                    c = c222222222222;
                    length = i;
                default:
                    throw new IllegalStateException("Unexpected type " + c27573.f8570);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8517(C0639 c0639) {
        int m2614 = c0639.m2614();
        return m2614 == 0 || m2614 == 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8515(C0639 c0639, float[] fArr, int i, int i2) {
        double[] dArr = new double[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            dArr[i3] = fArr[i3 + i];
        }
        c0639.m2608(dArr, dArr, i2 / 2);
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4 + i] = (float) dArr[i4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8570);
        float[] fArr = this.f8569;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            float f = fArr[i];
            int i3 = i2 + 1;
            sb.append(i2 % 2 == 0 ? ' ' : ',');
            sb.append(C23340.m51749(f));
            i++;
            i2 = i3;
        }
        return sb.toString();
    }
}
