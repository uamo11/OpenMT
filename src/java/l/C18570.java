package l;

import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.OverScroller;

/* compiled from: B6LA */
/* renamed from: l.ᩴۛۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18570 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5164 f57622;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C18570(C5164 c5164) {
        this.f57622 = c5164;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ScaleGestureDetector scaleGestureDetector;
        C5164 c5164 = this.f57622;
        scaleGestureDetector = c5164.f16149;
        if (!scaleGestureDetector.isInProgress() && motionEvent2.getPointerCount() == 1) {
            c5164.m14748(-f, -f2);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        OverScroller overScroller;
        float f3;
        float f4;
        float f5;
        double d;
        double m14762;
        float f6;
        double m14774;
        double d2;
        float f7;
        C5164 c5164 = this.f57622;
        z = c5164.f16148;
        if (z) {
            return true;
        }
        c5164.f16143 = 0;
        c5164.f16146 = 0;
        overScroller = c5164.f16139;
        int i = (int) f;
        int i2 = (int) (-f2);
        float width = c5164.getWidth();
        f3 = c5164.f16155;
        float f8 = (1.0f - f3) * width;
        f4 = c5164.f16150;
        int max = (int) Math.max(-536870911, f8 - f4);
        f5 = c5164.f16150;
        int i3 = (int) (-f5);
        double d3 = 536870911;
        d = c5164.f16161;
        m14762 = c5164.m14762();
        f6 = c5164.f16155;
        int i4 = (int) (-Math.min(d3, (d - m14762) * f6));
        m14774 = c5164.m14774();
        d2 = c5164.f16161;
        f7 = c5164.f16155;
        overScroller.fling(0, 0, i, i2, max, i3, i4, (int) Math.min(d3, (m14774 - d2) * f7));
        c5164.postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C8692 c8692;
        InterfaceC3047 interfaceC3047;
        InterfaceC3047 interfaceC30472;
        InterfaceC4458 interfaceC4458;
        SparseArray sparseArray;
        C8692 c86922;
        double d;
        float f;
        InterfaceC4458 interfaceC44582;
        InterfaceC4458 interfaceC44583;
        C8692 c86923;
        double d2;
        float f2;
        C8692 c86924;
        float f3;
        C13794 c13794;
        InterfaceC3047 interfaceC30473;
        InterfaceC3047 interfaceC30474;
        C5164 c5164 = this.f57622;
        c8692 = c5164.f16138;
        if (c8692 != null) {
            interfaceC4458 = c5164.f16158;
            if (interfaceC4458 != null) {
                sparseArray = c5164.f16133;
                c86922 = c5164.f16138;
                d = c5164.f16161;
                float y = motionEvent.getY();
                f = c5164.f16155;
                C0224 c0224 = (C0224) sparseArray.get(c86922.m22466(d + (y / f)));
                if (c0224 != null) {
                    int i = c0224.f1482;
                    interfaceC44583 = c5164.f16158;
                    if (((C20478) interfaceC44583).m46932(i)) {
                        c86923 = c5164.f16138;
                        double m22472 = c86923.m22472(i);
                        d2 = c5164.f16161;
                        double d3 = m22472 - d2;
                        f2 = c5164.f16155;
                        float f4 = (float) (d3 * f2);
                        c86924 = c5164.f16138;
                        double m22473 = c86924.m22473(i);
                        f3 = c5164.f16155;
                        float min = (Math.min(c5164.getHeight(), ((float) (m22473 * f3)) + f4) + Math.max(0.0f, f4)) / 2.0f;
                        c13794 = c5164.f16153;
                        if (c13794.m33110(motionEvent.getX(), motionEvent.getY(), c5164.getWidth() / 2.0f, min)) {
                            interfaceC30473 = c5164.f16145;
                            if (interfaceC30473 != null) {
                                interfaceC30474 = c5164.f16145;
                                interfaceC30474.mo9338(i);
                                return true;
                            }
                            return true;
                        }
                    }
                }
                if (c0224 != null) {
                    int i2 = c0224.f1482;
                    interfaceC44582 = c5164.f16158;
                    if (!((C20478) interfaceC44582).m46932(i2) && c0224.f1477) {
                        c5164.mo14786(i2);
                        return true;
                    }
                }
            }
        }
        interfaceC3047 = c5164.f16145;
        if (interfaceC3047 != null) {
            interfaceC30472 = c5164.f16145;
            interfaceC30472.mo9335();
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        float f2;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        C5164 c5164 = this.f57622;
        f = c5164.f16155;
        f2 = c5164.f16155;
        float f3 = f2 > 1.01f ? 1.0f : 2.0f;
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        c5164.f16132 = ValueAnimator.ofFloat(f, f3);
        valueAnimator = c5164.f16132;
        valueAnimator.setDuration(180L);
        valueAnimator2 = c5164.f16132;
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۘۛۜ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                C5164.m14752(C18570.this.f57622, ((Float) valueAnimator4.getAnimatedValue()).floatValue(), x, y);
            }
        });
        valueAnimator3 = c5164.f16132;
        valueAnimator3.start();
        return true;
    }
}
