package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.PopupWindow;

/* compiled from: L9CC */
/* renamed from: l.ۘۙܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3719 extends AnimatorListenerAdapter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f11754;

    public C3719(C3013 c3013) {
        this.f11754 = c3013;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PopupWindow popupWindow;
        try {
            popupWindow = this.f11754.f9502;
            popupWindow.dismiss();
        } catch (Exception unused) {
        }
    }
}
