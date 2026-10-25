package l;

import android.view.animation.AnimationUtils;

/* compiled from: V5Y3 */
/* renamed from: l.᩺۟, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22836 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f73711;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f73712;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f73715;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f73716;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f73717;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f73718;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f73714 = Long.MIN_VALUE;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f73719 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f73710 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f73713 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m50951() {
        this.f73716 = 500;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m50958() {
        this.f73717 = 500;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50957() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f73714 = currentAnimationTimeMillis;
        this.f73719 = -1L;
        this.f73710 = currentAnimationTimeMillis;
        this.f73711 = 0.5f;
        this.f73713 = 0;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m50953() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (currentAnimationTimeMillis - this.f73714);
        int i2 = this.f73717;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f73715 = i;
        this.f73711 = m50948(currentAnimationTimeMillis);
        this.f73719 = currentAnimationTimeMillis;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m50955() {
        return this.f73719 > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f73719 + ((long) this.f73715);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m50948(long j) {
        if (j < this.f73714) {
            return 0.0f;
        }
        long j2 = this.f73719;
        if (j2 < 0 || j < j2) {
            return AbstractViewOnTouchListenerC7314.m19601((j - r0) / this.f73716, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f73711;
        return (f * AbstractViewOnTouchListenerC7314.m19601((j - j2) / this.f73715, 0.0f, 1.0f)) + (1.0f - f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50949() {
        if (this.f73710 == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float m50948 = m50948(currentAnimationTimeMillis);
        long j = currentAnimationTimeMillis - this.f73710;
        this.f73710 = currentAnimationTimeMillis;
        this.f73713 = (int) (j * ((m50948 * 4.0f) + ((-4.0f) * m50948 * m50948)) * this.f73712);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50950(float f, float f2) {
        this.f73718 = f;
        this.f73712 = f2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50954() {
        Math.abs(this.f73718);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m50956() {
        float f = this.f73712;
        return (int) (f / Math.abs(f));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50952() {
        return this.f73713;
    }
}
