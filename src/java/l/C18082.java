package l;

import android.view.animation.Interpolator;

/* compiled from: R9NW */
/* renamed from: l.ᩳܰ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C18082 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f56314;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f56315;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Interpolator f56316;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f56317;

    public C18082(int i, Interpolator interpolator, long j) {
        this.f56317 = i;
        this.f56316 = interpolator;
        this.f56314 = j;
    }

    /* renamed from: ܽ */
    public int mo39192() {
        return this.f56317;
    }

    /* renamed from: ۧ */
    public float mo39191() {
        Interpolator interpolator = this.f56316;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f56315);
        }
        return this.f56315;
    }

    /* renamed from: ֫ */
    public long mo39189() {
        return this.f56314;
    }

    /* renamed from: ֫ */
    public void mo39190(float f) {
        this.f56315 = f;
    }
}
