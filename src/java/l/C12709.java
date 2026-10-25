package l;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collections;

/* compiled from: R9NW */
/* renamed from: l.۫᩺, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12709 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17376 f38246;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38247;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21610 f38248;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f38249;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21610 f38250;

    public C12709(C17376 c17376, C21610 c21610, C21610 c216102, int i, View view) {
        this.f38246 = c17376;
        this.f38250 = c21610;
        this.f38248 = c216102;
        this.f38247 = i;
        this.f38249 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C17376 c17376 = this.f38246;
        c17376.m40723(animatedFraction);
        float m40724 = c17376.m40724();
        int i = C23292.f74787;
        C21610 c21610 = this.f38250;
        C23726 c23726 = new C23726(c21610);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.f38247 & i2) == 0) {
                c23726.m52374(i2, c21610.m48815(i2));
            } else {
                C11007 m48815 = c21610.m48815(i2);
                C11007 m488152 = this.f38248.m48815(i2);
                float f = 1.0f - m40724;
                c23726.m52374(i2, C21610.m48813(m48815, (int) (((m48815.f33109 - m488152.f33109) * f) + 0.5d), (int) (((m48815.f33111 - m488152.f33111) * f) + 0.5d), (int) (((m48815.f33110 - m488152.f33110) * f) + 0.5d), (int) (((m48815.f33108 - m488152.f33108) * f) + 0.5d)));
            }
        }
        C23292.m51614(this.f38249, c23726.m52373(), Collections.singletonList(c17376));
    }
}
