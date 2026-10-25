package l;

import android.view.View;

/* compiled from: H5BW */
/* renamed from: l.ۧۨܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC10980 implements View.OnAttachStateChangeListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f33039;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC14413 f33040;

    public ViewOnAttachStateChangeListenerC10980(AbstractActivityC3346 abstractActivityC3346, InterfaceC14413 interfaceC14413) {
        this.f33039 = abstractActivityC3346;
        this.f33040 = interfaceC14413;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f33039.getLifecycle().mo19833(this.f33040);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f33039.getLifecycle().mo19834(this.f33040);
    }
}
