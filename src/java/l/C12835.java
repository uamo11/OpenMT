package l;

/* compiled from: YAYY */
/* renamed from: l.۬ۗ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12835 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C12835 f38546;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f38547;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float f38548;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f38549;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f38550;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float f38551;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f38552;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f38553;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f38554;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] f38555;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f38556;

    static {
        float m40053 = (float) ((C17068.m40053() * 63.66197723675813d) / 100.0d);
        float[] fArr = C17068.f52320;
        float f = fArr[0];
        float[][] fArr2 = C17068.f52321;
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-m40053) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f10 = 1.0f / ((5.0f * m40053) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(m40053 * 5.0d))) + (f11 * m40053);
        float m400532 = C17068.m40053() / fArr[1];
        double d2 = m400532;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f38546 = new C12835(m400532, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f9, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m31213() {
        return this.f38547;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m31219() {
        return this.f38553;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m31217() {
        return this.f38551;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m31214() {
        return this.f38548;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m31216() {
        return this.f38550;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m31222() {
        return this.f38556;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] m31221() {
        return this.f38555;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m31218() {
        return this.f38552;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m31220() {
        return this.f38554;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float m31215() {
        return this.f38549;
    }

    public C12835(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f38553 = f;
        this.f38547 = f2;
        this.f38551 = f3;
        this.f38548 = f4;
        this.f38550 = f5;
        this.f38556 = f6;
        this.f38555 = fArr;
        this.f38552 = f7;
        this.f38554 = f8;
        this.f38549 = f9;
    }
}
