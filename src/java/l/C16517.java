package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: S8GQ */
/* renamed from: l.ܽ۠ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16517 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20752 f50755;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f50756;

    public C16517(C20752 c20752, C7844 c7844) {
        this.f50755 = c20752;
        this.f50756 = c7844;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f50755.m47389(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        RunnableC14899 runnableC14899;
        C20752 c20752 = this.f50755;
        c20752.m47389(2);
        z = c20752.f66806;
        if (z) {
            C7844 c7844 = this.f50756;
            runnableC14899 = c20752.f66830;
            c7844.post(runnableC14899);
            c20752.f66806 = false;
        }
    }
}
