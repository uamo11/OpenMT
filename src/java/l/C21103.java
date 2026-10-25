package l;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EdgeEffect;
import android.widget.OverScroller;

/* compiled from: W1V4 */
/* renamed from: l.᩷᩶ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21103 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4169 f68082;

    public C21103(C4169 c4169) {
        this.f68082 = c4169;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        OverScroller overScroller;
        OverScroller overScroller2;
        motionEvent.getX();
        motionEvent.getY();
        C0640 c0640 = this.f68082.f13598;
        overScroller = c0640.f2455;
        if (overScroller.isFinished()) {
            return false;
        }
        overScroller2 = c0640.f2455;
        overScroller2.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C17637 c17637;
        boolean z;
        InterfaceC1346 interfaceC1346;
        PointF pointF;
        C16162 c16162;
        int i;
        int i2;
        int i3;
        C17637 c176372;
        int i4;
        int i5;
        int i6;
        int i7;
        C17574 c17574;
        C0640 c0640 = this.f68082.f13598;
        c0640.f2452 = 0.0f;
        c17637 = c0640.f2465;
        if (c17637 == null) {
            return true;
        }
        z = c0640.f2451;
        if (z) {
            pointF = c0640.f2468;
            float f = pointF.y;
            c16162 = c0640.f2464;
            int i8 = (int) (f / c16162.f49787);
            i = c0640.f2473;
            int i9 = i8 + i;
            i2 = c0640.f2449;
            if (i2 - 1 <= i9) {
                i3 = c0640.f2458;
                if (i9 <= i3 + 1) {
                    c176372 = c0640.f2465;
                    i4 = c0640.f2478;
                    i5 = c0640.f2449;
                    i6 = c0640.f2479;
                    i7 = c0640.f2458;
                    String trim = c176372.m41247(i4, i5, i6, i7).trim();
                    c17574 = c0640.f2450;
                    c17574.mo8713(trim);
                }
            }
            c0640.m2648((MotionEvent) null);
            return true;
        }
        c0640.requestFocus();
        interfaceC1346 = c0640.f2456;
        interfaceC1346.mo4692();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C17637 c17637;
        float f3;
        C16162 c16162;
        C16162 c161622;
        int i;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        int i2;
        C17637 c176372;
        EdgeEffect edgeEffect4;
        EdgeEffect edgeEffect5;
        EdgeEffect edgeEffect6;
        C0640 c0640 = this.f68082.f13598;
        c17637 = c0640.f2465;
        if (c17637 == null) {
            return true;
        }
        f3 = c0640.f2452;
        float f4 = f2 + f3;
        c16162 = c0640.f2464;
        int i3 = (int) (f4 / c16162.f49787);
        c161622 = c0640.f2464;
        c0640.f2452 = f4 - (c161622.f49787 * i3);
        c0640.m2622(i3);
        if (i3 < 0) {
            if (motionEvent2 == null) {
                return true;
            }
            i2 = c0640.f2473;
            c176372 = c0640.f2465;
            if (i2 > (-c176372.m41261().m7009())) {
                return true;
            }
            edgeEffect4 = c0640.f2462;
            C23379.m51831(edgeEffect4, (-f4) / c0640.getHeight(), motionEvent2.getX() / c0640.getWidth());
            c0640.postInvalidateOnAnimation();
            edgeEffect5 = c0640.f2480;
            if (edgeEffect5.isFinished()) {
                return true;
            }
            edgeEffect6 = c0640.f2480;
            edgeEffect6.onRelease();
            return true;
        }
        if (i3 <= 0 || motionEvent2 == null) {
            return true;
        }
        i = c0640.f2473;
        if (i < 0) {
            return true;
        }
        edgeEffect = c0640.f2480;
        C23379.m51831(edgeEffect, f4 / c0640.getHeight(), 1.0f - (motionEvent2.getX() / c0640.getWidth()));
        c0640.postInvalidateOnAnimation();
        edgeEffect2 = c0640.f2462;
        if (edgeEffect2.isFinished()) {
            return true;
        }
        edgeEffect3 = c0640.f2462;
        edgeEffect3.onRelease();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C0640 c0640 = this.f68082.f13598;
        c0640.performHapticFeedback(0);
        c0640.f2451 = false;
        c0640.m2648(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C17637 c17637;
        C16162 c16162;
        OverScroller overScroller;
        int i;
        C17637 c176372;
        C4169 c4169 = this.f68082;
        C0640 c0640 = c4169.f13598;
        c17637 = c0640.f2465;
        if (c17637 == null) {
            return true;
        }
        c16162 = c0640.f2464;
        float f3 = 1.0f / c16162.f49787;
        overScroller = c0640.f2455;
        i = c0640.f2473;
        c176372 = c0640.f2465;
        overScroller.fling(0, (int) Math.ceil(i / f3), 0, (int) ((-f2) * 1.2f), 0, 0, (int) (-Math.ceil(c176372.m41261().m7009() / f3)), 0);
        c0640.post(new RunnableC2758(c4169, f3));
        return true;
    }
}
