package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: J26J */
/* renamed from: l.ۜۘܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6517 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9340 f20128;

    public C6517(C9340 c9340) {
        this.f20128 = c9340;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        TextView textView2;
        C9340 c9340 = this.f20128;
        textView = c9340.f28345;
        textView.setVisibility(8);
        textView2 = c9340.f28345;
        textView2.setAlpha(1.0f);
    }
}
