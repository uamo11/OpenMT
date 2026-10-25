package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: R4JY */
/* renamed from: l.ۜۙ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class GestureDetectorOnDoubleTapListenerC6534 implements GestureDetector.OnDoubleTapListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18529 f20179;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC6534(ViewOnTouchListenerC18529 viewOnTouchListenerC18529) {
        this.f20179 = viewOnTouchListenerC18529;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f20179;
        if (viewOnTouchListenerC18529 == null) {
            return false;
        }
        viewOnTouchListenerC18529.m43073();
        this.f20179.getClass();
        this.f20179.getClass();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float m43075;
        float x;
        float y;
        try {
            m43075 = this.f20179.m43075();
            x = motionEvent.getX();
            y = motionEvent.getY();
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (m43075 < this.f20179.m43072()) {
            ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f20179;
            viewOnTouchListenerC18529.m43063(viewOnTouchListenerC18529.m43072(), x, y, true);
            return true;
        }
        ViewOnTouchListenerC18529 viewOnTouchListenerC185292 = this.f20179;
        viewOnTouchListenerC185292.m43063(viewOnTouchListenerC185292.m43069(), x, y, true);
        return true;
    }
}
