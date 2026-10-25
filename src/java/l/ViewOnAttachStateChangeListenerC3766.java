package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: E50U */
/* renamed from: l.ۘۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3766 implements View.OnAttachStateChangeListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnKeyListenerC5177 f11879;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC3766(ViewOnKeyListenerC5177 viewOnKeyListenerC5177) {
        this.f11879 = viewOnKeyListenerC5177;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewOnKeyListenerC5177 viewOnKeyListenerC5177 = this.f11879;
        ViewTreeObserver viewTreeObserver = viewOnKeyListenerC5177.f16190;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewOnKeyListenerC5177.f16190 = view.getViewTreeObserver();
            }
            viewOnKeyListenerC5177.f16190.removeGlobalOnLayoutListener(viewOnKeyListenerC5177.f16195);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
