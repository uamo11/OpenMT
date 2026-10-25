package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: 151S */
/* renamed from: l.۠᩺, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8476 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21882 f25911;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f25912;

    public C8476(InterfaceC21882 interfaceC21882, View view) {
        this.f25911 = interfaceC21882;
        this.f25912 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f25911.onAnimationCancel();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f25911.onAnimationEnd();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f25911.mo3669();
    }
}
