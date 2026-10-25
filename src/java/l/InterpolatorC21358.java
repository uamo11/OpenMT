package l;

import android.view.animation.Interpolator;

/* compiled from: L9CC */
/* renamed from: l.᩸ۙܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class InterpolatorC21358 implements Interpolator {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final float f68804 = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f)))) * f68804);
    }
}
