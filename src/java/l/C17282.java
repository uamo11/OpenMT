package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: D8GL */
/* renamed from: l.ܿۤۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17282 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10227 f52959;

    public C17282(ActivityC10227 activityC10227) {
        this.f52959 = activityC10227;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.f52959.f30758;
        view.setVisibility(4);
    }
}
