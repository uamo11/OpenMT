package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: 86WH */
/* renamed from: l.ۤ۠ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10166 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5932 f30570;

    public C10166(C5932 c5932) {
        this.f30570 = c5932;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ValueAnimator valueAnimator;
        C5932 c5932 = this.f30570;
        valueAnimator = c5932.f18201;
        if (valueAnimator != animator) {
            return;
        }
        c5932.f18201 = null;
        c5932.m16645();
    }
}
