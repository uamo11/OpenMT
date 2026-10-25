package l;

/* compiled from: X9M9 */
/* renamed from: l.ۗ۟ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3088 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9662 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4499 f9663 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9664 = Integer.MAX_VALUE;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f9665;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f9666;

    public C3088(float f, int i) {
        this.f9666 = f;
        this.f9665 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m9441(C4499 c4499, float f) {
        float f2 = c4499.f14318;
        float f3 = this.f9666;
        float abs = Math.abs((f2 * f3) - f);
        float abs2 = Math.abs((c4499.f14317 * f3) - f);
        int i = this.f9665 * 2;
        return abs <= abs2 ? abs <= ((float) i) ? -1 : 0 : abs2 <= ((float) i) ? 1 : 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4499 m9439() {
        if (this.f9662) {
            return this.f9663;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9440(C4499 c4499, float f) {
        int i;
        float f2 = c4499.f14318;
        float f3 = this.f9666;
        int abs = (int) Math.abs((f2 * f3) - f);
        int abs2 = (int) Math.abs((c4499.f14317 * f3) - f);
        float f4 = c4499.f14318 * f3;
        int i2 = this.f9665;
        float f5 = i2;
        if (f4 - f5 < f && f < (c4499.f14317 * f3) + f5) {
            i = Math.min(abs, abs2);
        } else {
            i = -Math.min(abs, abs2);
        }
        if (i >= 0) {
            this.f9662 = true;
        } else {
            i = -i;
            if (i > i2 * 4) {
                return;
            }
        }
        if (i < this.f9664) {
            this.f9663 = c4499;
            this.f9664 = i;
        }
    }
}
