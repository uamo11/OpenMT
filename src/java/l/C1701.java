package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: S8GQ */
/* renamed from: l.֫۠ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1701 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f5892;

    public C1701(C20752 c20752) {
        this.f5892 = c20752;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View view2;
        boolean z;
        View view3;
        ViewGroup viewGroup3;
        boolean z2;
        ViewGroup viewGroup4;
        View view4;
        C20752 c20752 = this.f5892;
        view = c20752.f66826;
        if (view != null) {
            view4 = c20752.f66826;
            view4.setVisibility(0);
        }
        viewGroup = c20752.f66827;
        if (viewGroup != null) {
            viewGroup4 = c20752.f66827;
            viewGroup4.setVisibility(0);
        }
        viewGroup2 = c20752.f66829;
        if (viewGroup2 != null) {
            viewGroup3 = c20752.f66829;
            z2 = c20752.f66828;
            viewGroup3.setVisibility(z2 ? 0 : 4);
        }
        view2 = c20752.f66821;
        if (view2 instanceof C7263) {
            z = c20752.f66828;
            if (z) {
                return;
            }
            view3 = c20752.f66821;
            ((C7263) view3).m19502();
        }
    }
}
