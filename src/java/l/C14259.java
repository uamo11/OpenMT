package l;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EdgeEffect;
import android.widget.OverScroller;

/* compiled from: E14L */
/* renamed from: l.ܳۗܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14259 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6499 f42948;

    public C14259(C6499 c6499) {
        this.f42948 = c6499;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int m17967;
        int m17971;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        EdgeEffect edgeEffect5;
        EdgeEffect edgeEffect6;
        EdgeEffect edgeEffect7;
        EdgeEffect edgeEffect8;
        EdgeEffect edgeEffect9;
        EdgeEffect edgeEffect10;
        EdgeEffect edgeEffect11;
        EdgeEffect edgeEffect12;
        C6499 c6499 = this.f42948;
        int scrollX = (int) (c6499.getScrollX() + f + 0.5f);
        int scrollY = (int) (c6499.getScrollY() + f2 + 0.5f);
        m17967 = c6499.m17967();
        m17971 = c6499.m17971();
        if (scrollX < 0) {
            if (motionEvent2 != null) {
                edgeEffect10 = c6499.f20073;
                C23379.m51831(edgeEffect10, (-f) / c6499.getWidth(), 1.0f - (motionEvent2.getY() / c6499.getHeight()));
                int i = C17648.f53953;
                c6499.postInvalidateOnAnimation();
                edgeEffect11 = c6499.f20072;
                if (!edgeEffect11.isFinished()) {
                    edgeEffect12 = c6499.f20072;
                    edgeEffect12.onRelease();
                }
            }
            scrollX = 0;
        } else if (scrollX > m17967) {
            if (motionEvent2 != null) {
                edgeEffect = c6499.f20072;
                C23379.m51831(edgeEffect, f / c6499.getWidth(), motionEvent2.getY() / c6499.getHeight());
                int i2 = C17648.f53953;
                c6499.postInvalidateOnAnimation();
                edgeEffect2 = c6499.f20073;
                if (!edgeEffect2.isFinished()) {
                    edgeEffect3 = c6499.f20073;
                    edgeEffect3.onRelease();
                }
            }
            scrollX = m17967;
        }
        if (scrollY < 0) {
            if (motionEvent2 != null) {
                edgeEffect7 = c6499.f20064;
                C23379.m51831(edgeEffect7, (-f2) / c6499.getHeight(), motionEvent2.getX() / c6499.getWidth());
                int i3 = C17648.f53953;
                c6499.postInvalidateOnAnimation();
                edgeEffect8 = c6499.f20063;
                if (!edgeEffect8.isFinished()) {
                    edgeEffect9 = c6499.f20063;
                    edgeEffect9.onRelease();
                }
            }
            scrollY = 0;
        } else if (scrollY > m17971) {
            if (motionEvent2 != null) {
                edgeEffect4 = c6499.f20063;
                C23379.m51831(edgeEffect4, f2 / c6499.getHeight(), 1.0f - (motionEvent2.getX() / c6499.getWidth()));
                int i4 = C17648.f53953;
                c6499.postInvalidateOnAnimation();
                edgeEffect5 = c6499.f20064;
                if (!edgeEffect5.isFinished()) {
                    edgeEffect6 = c6499.f20064;
                    edgeEffect6.onRelease();
                }
            }
            scrollY = m17971;
        }
        c6499.scrollTo(scrollX, scrollY);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C16376 c16376;
        OverScroller overScroller;
        int m17967;
        int m17971;
        C6499 c6499 = this.f42948;
        c16376 = c6499.f20065;
        if (c16376 == null) {
            return true;
        }
        overScroller = c6499.f20069;
        m17967 = c6499.m17967();
        m17971 = c6499.m17971();
        overScroller.fling(c6499.getScrollX(), c6499.getScrollY(), (int) (-f), (int) (-f2), 0, m17967, 0, m17971);
        c6499.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C16376 c16376;
        C16376 c163762;
        C6499 c6499 = this.f42948;
        c16376 = c6499.f20065;
        if (c16376 == null) {
            return true;
        }
        PointF pointF = new PointF(motionEvent.getX() + c6499.getScrollX(), motionEvent.getY() + c6499.getScrollY());
        C6499.m17965(c6499, pointF);
        c163762 = c6499.f20065;
        C7246 m38569 = c163762.m38569(pointF);
        if (m38569 != null) {
            c163762.f50391 = m38569.f22229;
        } else {
            c163762.f50391 = -1;
        }
        c6499.invalidate();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r1 = r0.f20070;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLongPress(android.view.MotionEvent r7) {
        /*
            r6 = this;
            l.ۜۗܿ r0 = r6.f42948
            l.ܽۗܿ r1 = l.C6499.m17961(r0)
            if (r1 != 0) goto L9
            goto L58
        L9:
            l.᩻ۗܿ r1 = l.C6499.m17966(r0)
            if (r1 == 0) goto L58
            android.graphics.PointF r2 = new android.graphics.PointF
            float r3 = r7.getX()
            int r4 = r0.getScrollX()
            float r4 = (float) r4
            float r3 = r3 + r4
            float r4 = r7.getY()
            int r5 = r0.getScrollY()
            float r5 = (float) r5
            float r4 = r4 + r5
            r2.<init>(r3, r4)
            l.C6499.m17965(r0, r2)
            l.ܽۗܿ r3 = l.C6499.m17961(r0)
            l.۟ۙܿ r2 = r3.m38569(r2)
            if (r2 == 0) goto L41
            java.util.List r3 = r2.f22234
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L3e
            goto L41
        L3e:
            int r2 = r2.f22229
            goto L42
        L41:
            r2 = -1
        L42:
            float r3 = r7.getX()
            float r7 = r7.getY()
            l.ۧ᩻ۢ r1 = (l.C11329) r1
            l.ܺ᩻ۢ r1 = r1.f33902
            boolean r7 = l.C16266.m38267(r1, r2, r3, r7)
            if (r7 == 0) goto L58
            r7 = 0
            r0.performHapticFeedback(r7)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14259.onLongPress(android.view.MotionEvent):void");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(final MotionEvent motionEvent) {
        C16376 c16376;
        float f;
        float f2;
        float f3;
        C6499 c6499 = this.f42948;
        c16376 = c6499.f20065;
        if (c16376 == null) {
            return true;
        }
        f = c6499.f20075;
        float f4 = 0.5f;
        if (f >= 0.5f) {
            f3 = c6499.f20075;
            f4 = 1.0f;
            if (f3 >= 1.0f) {
                f4 = 0.2f;
            }
        }
        f2 = c6499.f20075;
        ValueAnimator duration = ValueAnimator.ofFloat(f2, f4).setDuration(200L);
        final PointF pointF = new PointF();
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܿۗܿ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MotionEvent motionEvent2 = motionEvent;
                float x = motionEvent2.getX();
                C6499 c64992 = C14259.this.f42948;
                float y = motionEvent2.getY() + c64992.getScrollY();
                PointF pointF2 = pointF;
                pointF2.set(x + c64992.getScrollX(), y);
                C6499.m17965(c64992, pointF2);
                c64992.f20075 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c64992.m17958(pointF2);
                c64992.scrollTo(C6499.m17955(c64992, (int) (pointF2.x - motionEvent2.getX())), C6499.m17963(c64992, (int) (pointF2.y - motionEvent2.getY())));
                c64992.invalidate();
            }
        });
        duration.start();
        return true;
    }
}
