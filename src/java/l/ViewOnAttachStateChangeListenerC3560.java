package l;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: P1H0 */
/* renamed from: l.ۗ᩻֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3560 implements View.OnAttachStateChangeListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C13437 f11300;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5885 f11301;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC3560(LayoutInflaterFactory2C13437 layoutInflaterFactory2C13437, C5885 c5885) {
        this.f11300 = layoutInflaterFactory2C13437;
        this.f11301 = c5885;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C5885 c5885 = this.f11301;
        ComponentCallbacksC9205 m16488 = c5885.m16488();
        c5885.m16481();
        AbstractC3477.m10635((ViewGroup) m16488.mView.getParent(), this.f11300.f40151).m10644();
    }
}
