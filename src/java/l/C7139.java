package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: S8GQ */
/* renamed from: l.۟֨ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7139 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f21922;

    public C7139(C20752 c20752) {
        this.f21922 = c20752;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        boolean z;
        View view2;
        C20752 c20752 = this.f21922;
        view = c20752.f66821;
        if (view instanceof C7263) {
            z = c20752.f66828;
            if (z) {
                return;
            }
            view2 = c20752.f66821;
            ((C7263) view2).m19498();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        View view2;
        C20752 c20752 = this.f21922;
        view = c20752.f66826;
        if (view != null) {
            view2 = c20752.f66826;
            view2.setVisibility(4);
        }
        viewGroup = c20752.f66827;
        if (viewGroup != null) {
            viewGroup4 = c20752.f66827;
            viewGroup4.setVisibility(4);
        }
        viewGroup2 = c20752.f66829;
        if (viewGroup2 != null) {
            viewGroup3 = c20752.f66829;
            viewGroup3.setVisibility(4);
        }
    }
}
