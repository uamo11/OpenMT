package l;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

/* compiled from: J9R5 */
/* renamed from: l.ۖ۟ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2390 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f7628;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f7629;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f7631;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f7632;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f7633;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f7634;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f7636;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f7637;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f7638;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f7639;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f7640;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f7641;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static float f7627 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final float[] f7625 = new float[101];

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final float[] f7626 = new float[101];

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f7642 = ViewConfiguration.getScrollFriction();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f7630 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f7635 = true;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i = 0;
        while (true) {
            float f13 = 1.0f;
            if (i < 100) {
                float f14 = i / 100.0f;
                float f15 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f15 - f11) / 2.0f) + f11;
                    f3 = 3.0f;
                    f4 = f13 - f2;
                    f5 = f2 * 3.0f * f4;
                    f6 = f2 * f2 * f2;
                    float f16 = (((f2 * 0.35000002f) + (f4 * 0.175f)) * f5) + f6;
                    if (Math.abs(f16 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f16 > f14) {
                        f15 = f2;
                    } else {
                        f11 = f2;
                    }
                    f13 = 1.0f;
                }
                f7625[i] = (((f4 * 0.5f) + f2) * f5) + f6;
                float f17 = 1.0f;
                while (true) {
                    f7 = ((f17 - f12) / f) + f12;
                    f8 = 1.0f - f7;
                    f9 = f7 * f3 * f8;
                    f10 = f7 * f7 * f7;
                    float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                    if (Math.abs(f18 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f18 > f14) {
                        f17 = f7;
                    } else {
                        f12 = f7;
                    }
                    f = 2.0f;
                    f3 = 3.0f;
                }
                f7626[i] = (((f7 * 0.35000002f) + (f8 * 0.175f)) * f9) + f10;
                i++;
            } else {
                float[] fArr = f7625;
                f7626[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
        }
    }

    public C2390(Context context) {
        this.f7641 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7748(float f) {
        this.f7634 = this.f7636 + Math.round(f * (this.f7638 - r0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7741(long j, long j2, long j3) {
        float abs = Math.abs((j3 - j) / (j2 - j));
        int i = (int) (abs * 100.0f);
        if (i < 100) {
            float f = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = f7626;
            float f2 = fArr[i];
            this.f7639 = (int) (this.f7639 * C20382.m46695(fArr[i2], f2, (abs - f) / ((i2 / 100.0f) - f), f2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7749(long j, long j2) {
        this.f7635 = false;
        this.f7636 = j;
        this.f7634 = j;
        this.f7638 = j + j2;
        this.f7629 = AnimationUtils.currentAnimationTimeMillis();
        this.f7639 = 250;
        this.f7637 = 0.0f;
        this.f7640 = 0L;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7752() {
        this.f7634 = this.f7638;
        this.f7635 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m7743(long j, long j2) {
        this.f7635 = false;
        this.f7630 = 1;
        this.f7636 = j;
        this.f7634 = j;
        this.f7638 = j2;
        long j3 = j - j2;
        this.f7637 = j3 > 0 ? -2000.0f : 2000.0f;
        this.f7640 = -j3;
        this.f7631 = Math.abs(j3);
        this.f7639 = (int) (Math.sqrt((j3 * (-2.0d)) / this.f7637) * 1000.0d);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7750(long j, long j2, long j3, long j4, long j5) {
        double d;
        long j6 = j4;
        this.f7631 = j5;
        this.f7635 = false;
        this.f7640 = j2;
        this.f7628 = j2;
        this.f7632 = 0;
        this.f7639 = 0;
        this.f7629 = AnimationUtils.currentAnimationTimeMillis();
        this.f7636 = j;
        this.f7634 = j;
        float f = f7627;
        float f2 = this.f7641;
        float f3 = this.f7642;
        if (j <= j6 && j >= j3) {
            this.f7630 = 0;
            if (j2 != 0) {
                int exp = (int) (Math.exp(Math.log((Math.abs(j2) * 0.35f) / (f3 * f2)) / (f - 1.0d)) * 1000.0d);
                this.f7632 = exp;
                this.f7639 = exp;
                double d2 = f;
                d = Math.exp((d2 / (d2 - 1.0d)) * Math.log((Math.abs(j2) * 0.35f) / r13)) * f3 * f2;
            } else {
                d = 0.0d;
            }
            long signum = (int) (d * Math.signum(r5));
            this.f7633 = signum;
            long j7 = signum + j;
            this.f7638 = j7;
            if (j7 < j3) {
                m7741(this.f7636, j7, j3);
                this.f7638 = j3;
            }
            long j8 = this.f7638;
            if (j8 > j4) {
                m7741(this.f7636, j8, j4);
                this.f7638 = j4;
                return;
            }
            return;
        }
        if (j > j3 && j < j6) {
            this.f7635 = true;
            return;
        }
        boolean z = j > j6;
        long j9 = z ? j6 : j3;
        long j10 = j - j9;
        if (j10 * j2 < 0) {
            double d3 = f;
            if (Math.exp((d3 / (d3 - 1.0d)) * Math.log((Math.abs(j2) * 0.35f) / r13)) * f3 * f2 > Math.abs(j10)) {
                long j11 = z ? j3 : j;
                if (z) {
                    j6 = j;
                }
                m7750(j, j2, j11, j6, this.f7631);
                return;
            }
            m7743(j, j9);
            return;
        }
        if (j2 != 0) {
            j10 = j2;
        }
        float f4 = j10 > 0 ? -2000.0f : 2000.0f;
        this.f7637 = f4;
        float f5 = (-j2) / f4;
        float sqrt = (float) Math.sqrt((((((r5 * r5) / 2.0f) / Math.abs(f4)) + Math.abs(j9 - j)) * 2.0d) / Math.abs(this.f7637));
        this.f7629 -= (int) ((sqrt - f5) * 1000.0f);
        this.f7636 = j9;
        this.f7634 = j9;
        this.f7640 = (int) ((-this.f7637) * sqrt);
        m7746();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m7746() {
        long j = this.f7640;
        float f = j * j;
        float abs = f / (Math.abs(this.f7637) * 2.0f);
        float signum = Math.signum(this.f7640);
        long j2 = this.f7631;
        if (abs > j2) {
            this.f7637 = ((-signum) * f) / (j2 * 2.0f);
            abs = j2;
        }
        this.f7631 = (int) abs;
        this.f7630 = 2;
        long j3 = this.f7636;
        long j4 = this.f7640;
        if (j4 <= 0) {
            abs = -abs;
        }
        this.f7638 = j3 + ((int) abs);
        this.f7639 = -((int) ((j4 * 1000.0f) / this.f7637));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7751() {
        int i = this.f7630;
        if (i == 0) {
            int i2 = this.f7639;
            if (i2 >= this.f7632) {
                return false;
            }
            long j = this.f7638;
            this.f7636 = j;
            this.f7634 = j;
            long j2 = (int) this.f7628;
            this.f7640 = j2;
            this.f7637 = j2 > 0 ? -2000.0f : 2000.0f;
            this.f7629 += i2;
            m7746();
        } else {
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                this.f7629 += this.f7639;
                m7743(this.f7638, this.f7636);
            }
        }
        m7753();
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m7753() {
        float f;
        float f2;
        double d;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f7629;
        if (currentAnimationTimeMillis == 0) {
            return this.f7639 > 0;
        }
        int i = this.f7639;
        if (currentAnimationTimeMillis > i) {
            return false;
        }
        int i2 = this.f7630;
        if (i2 == 0) {
            float f3 = this.f7632;
            float f4 = currentAnimationTimeMillis / f3;
            int i3 = (int) (f4 * 100.0f);
            if (i3 < 100) {
                float f5 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = f7625;
                float f6 = fArr[i3];
                f2 = (fArr[i4] - f6) / ((i4 / 100.0f) - f5);
                f = C20382.m46695(f4, f5, f2, f6);
            } else {
                f = 1.0f;
                f2 = 0.0f;
            }
            float f7 = this.f7633;
            this.f7628 = ((f2 * f7) / f3) * 1000.0f;
            d = f * f7;
        } else if (i2 == 1) {
            float f8 = currentAnimationTimeMillis / i;
            float f9 = f8 * f8;
            float signum = Math.signum(this.f7640) * this.f7631;
            this.f7628 = ((-f8) + f9) * signum * 6.0f;
            d = ((3.0f * f9) - ((2.0f * f8) * f9)) * signum;
        } else if (i2 != 2) {
            d = 0.0d;
        } else {
            float f10 = currentAnimationTimeMillis / 1000.0f;
            float f11 = this.f7640;
            float f12 = this.f7637 * f10;
            this.f7628 = f12 + f11;
            d = ((f12 * f10) / 2.0f) + (f11 * f10);
        }
        this.f7634 = this.f7636 + ((int) Math.round(d));
        return true;
    }
}
