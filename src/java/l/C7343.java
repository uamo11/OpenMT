package l;

/* compiled from: U6WD */
/* renamed from: l.۟۠ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7343 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f22560;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f22561;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f22562;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f22563;

    public C7343(float[] fArr) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        float f = fArr[0];
        float f2 = fArr[5];
        float f3 = fArr[10];
        double d8 = f + f2 + f3;
        if (d8 > 0.0d) {
            double sqrt = Math.sqrt(d8 + 1.0d) * 2.0d;
            d = sqrt / 4.0d;
            d6 = (fArr[6] - fArr[9]) / sqrt;
            d7 = (fArr[8] - fArr[2]) / sqrt;
            d5 = (fArr[1] - fArr[4]) / sqrt;
        } else if (f <= f2 || f <= f3) {
            if (f2 > f3) {
                double sqrt2 = Math.sqrt(((f2 + 1.0f) - f) - f3) * 2.0d;
                d = (fArr[8] - fArr[2]) / sqrt2;
                d2 = (fArr[4] + fArr[1]) / sqrt2;
                d3 = sqrt2 / 4.0d;
                d4 = (fArr[9] + fArr[6]) / sqrt2;
            } else {
                double sqrt3 = Math.sqrt(((f3 + 1.0f) - f) - f2) * 2.0d;
                d = (fArr[1] - fArr[4]) / sqrt3;
                d2 = (fArr[8] + fArr[2]) / sqrt3;
                d3 = (fArr[9] + fArr[6]) / sqrt3;
                d4 = sqrt3 / 4.0d;
            }
            double d9 = d2;
            d5 = d4;
            d6 = d9;
            d7 = d3;
        } else {
            double sqrt4 = Math.sqrt(((f + 1.0f) - f2) - f3) * 2.0d;
            d = (fArr[6] - fArr[9]) / sqrt4;
            d6 = sqrt4 / 4.0d;
            d5 = (fArr[8] + fArr[2]) / sqrt4;
            d7 = (fArr[4] + fArr[1]) / sqrt4;
        }
        if (d < 0.0d) {
            d = -d;
            d6 = -d6;
            d7 = -d7;
            d5 = -d5;
        }
        double sqrt5 = Math.sqrt((d5 * d5) + (d7 * d7) + (d6 * d6));
        if (sqrt5 < 1.0E-8d) {
            this.f22561 = 0.0f;
            this.f22562 = 1.0f;
            this.f22563 = 0.0f;
            this.f22560 = 0.0f;
            return;
        }
        this.f22561 = (float) (d6 / sqrt5);
        this.f22562 = (float) (d7 / sqrt5);
        this.f22563 = (float) (d5 / sqrt5);
        this.f22560 = (float) Math.toDegrees(Math.atan2(sqrt5, d) * 2.0d);
    }
}
