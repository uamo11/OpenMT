package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: 715M */
/* renamed from: l.ۢ᩵ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9795 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19673 f29622;

    public C9795(ViewOnClickListenerC19673 viewOnClickListenerC19673) {
        this.f29622 = viewOnClickListenerC19673;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView;
        imageView = this.f29622.f63544;
        imageView.setVisibility(8);
    }
}
