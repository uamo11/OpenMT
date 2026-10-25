package l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: 75NJ */
/* renamed from: l.۫ۚᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12207 implements Animator.AnimatorListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f36426;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C12207(ActivityC16315 activityC16315) {
        this.f36426 = activityC16315;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FloatingActionButton floatingActionButton;
        floatingActionButton = this.f36426.f50249;
        floatingActionButton.setVisibility(8);
    }
}
