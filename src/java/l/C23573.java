package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: S8GQ */
/* renamed from: l.᩻۠ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23573 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f75659;

    public C23573(C20752 c20752) {
        this.f75659 = c20752;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        ViewGroup viewGroup6;
        C20752 c20752 = this.f75659;
        viewGroup = c20752.f66834;
        if (viewGroup != null) {
            viewGroup2 = c20752.f66834;
            viewGroup2.setVisibility(0);
            viewGroup3 = c20752.f66834;
            viewGroup4 = c20752.f66834;
            viewGroup3.setTranslationX(viewGroup4.getWidth());
            viewGroup5 = c20752.f66834;
            viewGroup6 = c20752.f66834;
            viewGroup5.scrollTo(viewGroup6.getWidth(), 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C20752 c20752 = this.f75659;
        viewGroup = c20752.f66819;
        if (viewGroup != null) {
            viewGroup2 = c20752.f66819;
            viewGroup2.setVisibility(4);
        }
    }
}
