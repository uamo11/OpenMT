package l;

/* compiled from: EB34 */
/* renamed from: l.᩹ܽ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22401 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f72556;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f72557;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f72558;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f72559;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f72560;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double f72561;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f72562;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f72563;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f72564;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18874 f72565;

    public C22401() {
        this.f72557 = Math.sqrt(1500.0d);
        this.f72559 = 0.5d;
        this.f72560 = false;
        this.f72561 = Double.MAX_VALUE;
        this.f72565 = new C18874();
    }

    public C22401(float f) {
        this.f72557 = Math.sqrt(1500.0d);
        this.f72559 = 0.5d;
        this.f72560 = false;
        this.f72565 = new C18874();
        this.f72561 = f;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50267(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f72557 = Math.sqrt(f);
        this.f72560 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50264(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f72559 = f;
        this.f72560 = false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50266(float f) {
        this.f72561 = f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m50261() {
        return (float) this.f72561;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50265(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f72558 && ((double) Math.abs(f - ((float) this.f72561))) < this.f72564;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18874 m50262(double d, double d2, long j) {
        double cos;
        double d3;
        if (!this.f72560) {
            if (this.f72561 == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d4 = this.f72559;
            if (d4 > 1.0d) {
                double d5 = this.f72557;
                this.f72562 = (Math.sqrt((d4 * d4) - 1.0d) * d5) + ((-d4) * d5);
                double d6 = this.f72559;
                double d7 = this.f72557;
                this.f72563 = ((-d6) * d7) - (Math.sqrt((d6 * d6) - 1.0d) * d7);
            } else if (d4 >= 0.0d && d4 < 1.0d) {
                this.f72556 = Math.sqrt(1.0d - (d4 * d4)) * this.f72557;
            }
            this.f72560 = true;
        }
        double d8 = j / 1000.0d;
        double d9 = d - this.f72561;
        double d10 = this.f72559;
        if (d10 > 1.0d) {
            double d11 = this.f72563;
            double d12 = ((d11 * d9) - d2) / (d11 - this.f72562);
            double d13 = d9 - d12;
            d3 = (Math.pow(2.718281828459045d, this.f72562 * d8) * d12) + (Math.pow(2.718281828459045d, d11 * d8) * d13);
            double d14 = this.f72563;
            double pow = Math.pow(2.718281828459045d, d14 * d8) * d13 * d14;
            double d15 = this.f72562;
            cos = (Math.pow(2.718281828459045d, d15 * d8) * d12 * d15) + pow;
        } else if (d10 == 1.0d) {
            double d16 = this.f72557;
            double d17 = (d16 * d9) + d2;
            double d18 = (d17 * d8) + d9;
            double pow2 = Math.pow(2.718281828459045d, (-d16) * d8) * d18;
            double pow3 = Math.pow(2.718281828459045d, (-this.f72557) * d8) * d18;
            double d19 = -this.f72557;
            cos = (Math.pow(2.718281828459045d, d19 * d8) * d17) + (pow3 * d19);
            d3 = pow2;
        } else {
            double d20 = 1.0d / this.f72556;
            double d21 = this.f72557;
            double d22 = ((d10 * d21 * d9) + d2) * d20;
            double sin = ((Math.sin(this.f72556 * d8) * d22) + (Math.cos(this.f72556 * d8) * d9)) * Math.pow(2.718281828459045d, (-d10) * d21 * d8);
            double d23 = this.f72557;
            double d24 = this.f72559;
            double d25 = (-d23) * sin * d24;
            double pow4 = Math.pow(2.718281828459045d, (-d24) * d23 * d8);
            double d26 = this.f72556;
            double sin2 = Math.sin(d26 * d8) * (-d26) * d9;
            double d27 = this.f72556;
            cos = (((Math.cos(d27 * d8) * d22 * d27) + sin2) * pow4) + d25;
            d3 = sin;
        }
        float f = (float) (d3 + this.f72561);
        C18874 c18874 = this.f72565;
        c18874.f59507 = f;
        c18874.f59508 = (float) cos;
        return c18874;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50263(double d) {
        double abs = Math.abs(d);
        this.f72564 = abs;
        this.f72558 = abs * 62.5d;
    }
}
