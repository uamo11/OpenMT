package l;

import android.graphics.Color;

/* compiled from: HB1L */
/* renamed from: l.ᩳۗ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17774 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f54362;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f54363;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f54364;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f54365;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f54366;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f54367;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m41632() {
        return this.f54367;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m41630() {
        return this.f54365;
    }

    public C17774(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f54367 = f;
        this.f54365 = f2;
        this.f54366 = f3;
        this.f54364 = f4;
        this.f54362 = f5;
        this.f54363 = f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m41629(float r22, float r23, float r24) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17774.m41629(float, float, float):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17774 m41628(int i) {
        C12835 c12835 = C12835.f38546;
        float m40054 = C17068.m40054(Color.red(i));
        float m400542 = C17068.m40054(Color.green(i));
        float m400543 = C17068.m40054(Color.blue(i));
        float[][] fArr = C17068.f52319;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * m400543) + (fArr2[1] * m400542) + (fArr2[0] * m40054);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * m400543) + (fArr3[1] * m400542) + (fArr3[0] * m40054);
        float[] fArr4 = fArr[2];
        float f3 = (m400543 * fArr4[2]) + (m400542 * fArr4[1]) + (m40054 * fArr4[0]);
        float[][] fArr5 = C17068.f52321;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float f7 = c12835.m31221()[0] * f4;
        float f8 = c12835.m31221()[1] * f5;
        float f9 = c12835.m31221()[2] * f6;
        float pow = (float) Math.pow((Math.abs(f7) * c12835.m31218()) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f8) * c12835.m31218()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f9) * c12835.m31218()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f7) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f10 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f11 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f12 = signum2 * 20.0f;
        float f13 = ((21.0f * signum3) + ((signum * 20.0f) + f12)) / 20.0f;
        float f14 = (((signum * 40.0f) + f12) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f11, f10)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f15 = atan2;
        float f16 = (3.1415927f * f15) / 180.0f;
        float pow4 = ((float) Math.pow((f14 * c12835.m31217()) / c12835.m31213(), c12835.m31216() * c12835.m31215())) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c12835.m31219()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f15) < 20.14d ? 360.0f + f15 : f15) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c12835.m31222()) * c12835.m31214()) * ((float) Math.sqrt((f11 * f11) + (f10 * f10)))) / (f13 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float m31220 = c12835.m31220() * pow5;
        Math.sqrt((r3 * c12835.m31216()) / (c12835.m31213() + 4.0f));
        float f17 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((m31220 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f16;
        return new C17774(f15, pow5, pow4, f17, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17774 m41627(float f, float f2, float f3) {
        C12835 c12835 = C12835.f38546;
        c12835.m31216();
        Math.sqrt(f / 100.0d);
        float m31220 = c12835.m31220() * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * c12835.m31216()) / (c12835.m31213() + 4.0f));
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((m31220 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C17774(f3, f2, f, f4, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41631(C12835 c12835) {
        float f;
        float f2 = this.f54365;
        double d = f2;
        float f3 = this.f54366;
        if (d != 0.0d) {
            double d2 = f3;
            if (d2 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d2 / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c12835.m31219()), 0.73d), 1.1111111111111112d);
                double d3 = (this.f54367 * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float m31213 = c12835.m31213() * ((float) Math.pow(f3 / 100.0d, (1.0d / c12835.m31216()) / c12835.m31215()));
                float m31222 = cos * 3846.1538f * c12835.m31222() * c12835.m31214();
                float m31217 = m31213 / c12835.m31217();
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f4 = (((0.305f + m31217) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (m31222 * 23.0f)));
                float f5 = cos2 * f4;
                float f6 = f4 * sin;
                float f7 = m31217 * 460.0f;
                float f8 = ((288.0f * f6) + ((451.0f * f5) + f7)) / 1403.0f;
                float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
                float f10 = ((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f;
                float m31218 = (100.0f / c12835.m31218()) * Math.signum(f8) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
                float m312182 = (100.0f / c12835.m31218()) * Math.signum(f9) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
                float m312183 = (100.0f / c12835.m31218()) * Math.signum(f10) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
                float f11 = m31218 / c12835.m31221()[0];
                float f12 = m312182 / c12835.m31221()[1];
                float f13 = m312183 / c12835.m31221()[2];
                float[][] fArr = C17068.f52318;
                float[] fArr2 = fArr[0];
                float f14 = (fArr2[2] * f13) + (fArr2[1] * f12) + (fArr2[0] * f11);
                float[] fArr3 = fArr[1];
                float f15 = (fArr3[2] * f13) + (fArr3[1] * f12) + (fArr3[0] * f11);
                float[] fArr4 = fArr[2];
                return C7191.m19265(f14, f15, (f13 * fArr4[2]) + (f12 * fArr4[1]) + (f11 * fArr4[0]));
            }
        }
        f = 0.0f;
        float pow2 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c12835.m31219()), 0.73d), 1.1111111111111112d);
        double d32 = (this.f54367 * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float m312132 = c12835.m31213() * ((float) Math.pow(f3 / 100.0d, (1.0d / c12835.m31216()) / c12835.m31215()));
        float m312222 = cos3 * 3846.1538f * c12835.m31222() * c12835.m31214();
        float m312172 = m312132 / c12835.m31217();
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f42 = (((0.305f + m312172) * 23.0f) * pow2) / (((pow2 * 108.0f) * sin2) + (((11.0f * pow2) * cos22) + (m312222 * 23.0f)));
        float f52 = cos22 * f42;
        float f62 = f42 * sin2;
        float f72 = m312172 * 460.0f;
        float f82 = ((288.0f * f62) + ((451.0f * f52) + f72)) / 1403.0f;
        float f92 = ((f72 - (891.0f * f52)) - (261.0f * f62)) / 1403.0f;
        float f102 = ((f72 - (f52 * 220.0f)) - (f62 * 6300.0f)) / 1403.0f;
        float m312184 = (100.0f / c12835.m31218()) * Math.signum(f82) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f82) * 27.13d) / (400.0d - Math.abs(f82))), 2.380952380952381d));
        float m3121822 = (100.0f / c12835.m31218()) * Math.signum(f92) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f92) * 27.13d) / (400.0d - Math.abs(f92))), 2.380952380952381d));
        float m3121832 = (100.0f / c12835.m31218()) * Math.signum(f102) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102))), 2.380952380952381d));
        float f112 = m312184 / c12835.m31221()[0];
        float f122 = m3121822 / c12835.m31221()[1];
        float f132 = m3121832 / c12835.m31221()[2];
        float[][] fArr5 = C17068.f52318;
        float[] fArr22 = fArr5[0];
        float f142 = (fArr22[2] * f132) + (fArr22[1] * f122) + (fArr22[0] * f112);
        float[] fArr32 = fArr5[1];
        float f152 = (fArr32[2] * f132) + (fArr32[1] * f122) + (fArr32[0] * f112);
        float[] fArr42 = fArr5[2];
        return C7191.m19265(f142, f152, (f132 * fArr42[2]) + (f122 * fArr42[1]) + (f112 * fArr42[0]));
    }
}
