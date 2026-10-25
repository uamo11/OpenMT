package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: S8GQ */
/* renamed from: l.ۜ۠ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6640 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f20422;

    public C6640(C20752 c20752) {
        this.f20422 = c20752;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C20752 c20752 = this.f20422;
        viewGroup = c20752.f66819;
        if (viewGroup != null) {
            viewGroup2 = c20752.f66819;
            viewGroup2.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C20752 c20752 = this.f20422;
        viewGroup = c20752.f66834;
        if (viewGroup != null) {
            viewGroup2 = c20752.f66834;
            viewGroup2.setVisibility(4);
        }
    }
}
