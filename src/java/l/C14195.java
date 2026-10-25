package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: TB7B */
/* renamed from: l.ܳ֨ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14195 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f42847;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f42848;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42849 = false;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f42850;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f42851;

    public C14195(float f, float f2, float f3, float f4) {
        this.f42847 = 0.0f;
        this.f42848 = 0.0f;
        this.f42851 = f;
        this.f42850 = f2;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            this.f42847 = (float) (f3 / sqrt);
            this.f42848 = (float) (f4 / sqrt);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33863(float f, float f2) {
        float f3 = f - this.f42851;
        float f4 = f2 - this.f42850;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            f3 = (float) (f3 / sqrt);
            f4 = (float) (f4 / sqrt);
        }
        float f5 = this.f42847;
        if (f3 == (-f5) && f4 == (-this.f42848)) {
            this.f42849 = true;
            this.f42847 = -f4;
            this.f42848 = f3;
        } else {
            this.f42847 = f5 + f3;
            this.f42848 += f4;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33864(C14195 c14195) {
        float f = c14195.f42847;
        float f2 = this.f42847;
        if (f == (-f2)) {
            float f3 = c14195.f42848;
            if (f3 == (-this.f42848)) {
                this.f42849 = true;
                this.f42847 = -f3;
                this.f42848 = c14195.f42847;
                return;
            }
        }
        this.f42847 = f2 + f;
        this.f42848 += c14195.f42848;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f42851 + "," + this.f42850 + " " + this.f42847 + "," + this.f42848 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
