package l;

/* compiled from: K6W6 */
/* renamed from: l.֫ܶۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1904 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final double f6418 = Math.sqrt(0.85d);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6419;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f6420;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f6421;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f6422;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f6423;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f6424;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f6425;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6256(float f, float f2) {
        this.f6420 += f;
        this.f6422 += f2;
        this.f6419 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6255(float f) {
        float max = Math.max(f * 60.0f, 0.001f);
        if (this.f6419) {
            this.f6424 = this.f6420 / max;
            this.f6423 = this.f6422 / max;
            this.f6422 = 0.0f;
            this.f6420 = 0.0f;
            this.f6419 = false;
            this.f6425 = 0.0f;
            this.f6421 = 0.0f;
            return;
        }
        double d = f6418;
        double pow = Math.pow(d, max);
        float f2 = (float) (((1.0d - pow) * d) / (1.0d - d));
        float f3 = this.f6424;
        this.f6421 = f3 * f2;
        float f4 = this.f6423;
        this.f6425 = f2 * f4;
        this.f6424 = (float) (f3 * pow);
        this.f6423 = (float) (f4 * pow);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6257() {
        return this.f6419 || Math.hypot((double) this.f6424, (double) this.f6423) >= 0.004999999888241291d;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6258() {
        this.f6419 = false;
        this.f6425 = 0.0f;
        this.f6421 = 0.0f;
        this.f6423 = 0.0f;
        this.f6424 = 0.0f;
        this.f6422 = 0.0f;
        this.f6420 = 0.0f;
    }
}
