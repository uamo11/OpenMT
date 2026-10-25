package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: E5OI */
/* renamed from: l.۬᩶ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13341 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7697 f39913;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewPropertyAnimator f39914;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3255 f39915;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f39916;

    public C13341(View view, ViewPropertyAnimator viewPropertyAnimator, C7697 c7697, AbstractC3255 abstractC3255) {
        this.f39913 = c7697;
        this.f39915 = abstractC3255;
        this.f39914 = viewPropertyAnimator;
        this.f39916 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f39913.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f39914.setListener(null);
        this.f39916.setAlpha(1.0f);
        C7697 c7697 = this.f39913;
        AbstractC3255 abstractC3255 = this.f39915;
        c7697.m50783(abstractC3255);
        c7697.f23771.remove(abstractC3255);
        c7697.m20594();
    }
}
