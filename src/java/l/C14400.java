package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: S8GQ */
/* renamed from: l.ܳ۠ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14400 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f43380;

    public C14400(C20752 c20752) {
        this.f43380 = c20752;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f43380.m47389(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f43380.m47389(0);
    }
}
