package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: 31K1 */
/* renamed from: l.۬ۤ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13059 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f39081;

    public C13059(ActivityC17169 activityC17169) {
        this.f39081 = activityC17169;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FloatingActionButton floatingActionButton;
        floatingActionButton = this.f39081.f52611;
        floatingActionButton.setVisibility(8);
    }
}
