package l;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageButton;

/* compiled from: L9CC */
/* renamed from: l.ۢۙܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class AnimationAnimationListenerC9364 implements Animation.AnimationListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f28437;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC9364(C3013 c3013) {
        this.f28437 = c3013;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        ImageButton imageButton;
        ViewGroup viewGroup;
        C19947 c19947;
        C3013 c3013 = this.f28437;
        imageButton = c3013.f9512;
        imageButton.setEnabled(false);
        viewGroup = c3013.f9498;
        viewGroup.setVisibility(0);
        c19947 = c3013.f9499;
        c19947.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ViewGroup viewGroup;
        viewGroup = this.f28437.f9524;
        viewGroup.post(new Runnable() { // from class: l.᩷ۙܿ
            @Override // java.lang.Runnable
            public final void run() {
                C3013 c3013 = AnimationAnimationListenerC9364.this.f28437;
                c3013.m9224();
                c3013.m9206();
            }
        });
    }
}
