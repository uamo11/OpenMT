package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: C5GL */
/* renamed from: l.ۘܰܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3985 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5396 f12635;

    public C3985(ViewOnClickListenerC5396 viewOnClickListenerC5396) {
        this.f12635 = viewOnClickListenerC5396;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f12635;
        view = viewOnClickListenerC5396.f16765;
        view.setVisibility(8);
        viewOnClickListenerC5396.f16782 = null;
    }
}
