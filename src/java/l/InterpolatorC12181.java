package l;

import android.view.animation.Interpolator;

/* compiled from: B66A */
/* renamed from: l.۫ۙۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class InterpolatorC12181 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
