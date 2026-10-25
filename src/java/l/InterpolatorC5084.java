package l;

import android.view.animation.Interpolator;

/* compiled from: Y6A7 */
/* renamed from: l.ۚۗۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class InterpolatorC5084 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
