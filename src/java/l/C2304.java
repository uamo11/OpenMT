package l;

import android.animation.ValueAnimator;

/* compiled from: 34UR */
/* renamed from: l.ۖۙۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2304 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3715 f7435;

    public C2304(C3715 c3715) {
        this.f7435 = c3715;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C3715 c3715 = this.f7435;
        c3715.f11742.setAlpha(floatValue);
        c3715.f11733.setAlpha(floatValue);
        c3715.m11300();
    }
}
