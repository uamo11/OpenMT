package l;

import android.view.View;

/* compiled from: L1RG */
/* renamed from: l.᩷᩹ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC21166 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC9877 f68221;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68222;

    public RunnableC21166(ViewOnTouchListenerC9877 viewOnTouchListenerC9877, int i) {
        this.f68221 = viewOnTouchListenerC9877;
        this.f68222 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        View view;
        View view2;
        ViewOnTouchListenerC9877 viewOnTouchListenerC9877 = this.f68221;
        i = viewOnTouchListenerC9877.f29897;
        if (this.f68222 == i) {
            view = viewOnTouchListenerC9877.f29894;
            view.performClick();
            view2 = viewOnTouchListenerC9877.f29894;
            view2.postDelayed(this, 50L);
        }
    }
}
