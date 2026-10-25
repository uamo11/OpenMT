package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: V5Y3 */
/* renamed from: l.ܰ۟, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC13663 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC7314 f40744;

    public RunnableC13663(AbstractViewOnTouchListenerC7314 abstractViewOnTouchListenerC7314) {
        this.f40744 = abstractViewOnTouchListenerC7314;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractViewOnTouchListenerC7314 abstractViewOnTouchListenerC7314 = this.f40744;
        View view = abstractViewOnTouchListenerC7314.f22465;
        C22836 c22836 = abstractViewOnTouchListenerC7314.f22460;
        if (abstractViewOnTouchListenerC7314.f22466) {
            if (abstractViewOnTouchListenerC7314.f22469) {
                abstractViewOnTouchListenerC7314.f22469 = false;
                c22836.m50957();
            }
            if (!c22836.m50955()) {
                int m50956 = c22836.m50956();
                c22836.m50954();
                if (m50956 != 0 && abstractViewOnTouchListenerC7314.mo19604(m50956)) {
                    if (abstractViewOnTouchListenerC7314.f22461) {
                        abstractViewOnTouchListenerC7314.f22461 = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    c22836.m50949();
                    abstractViewOnTouchListenerC7314.mo19605(c22836.m50952());
                    int i = C17648.f53953;
                    view.postOnAnimation(this);
                    return;
                }
            }
            abstractViewOnTouchListenerC7314.f22466 = false;
        }
    }
}
