package l;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

/* compiled from: B66A */
/* renamed from: l.᩶ۙۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19943 implements InterfaceC20895 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1556 f64599;

    public C19943(C1556 c1556) {
        this.f64599 = c1556;
    }

    @Override // l.InterfaceC20895
    /* renamed from: ۧ */
    public final boolean mo11308(MotionEvent motionEvent) {
        int findPointerIndex;
        C1556 c1556 = this.f64599;
        c1556.f5483.m3331(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C22764 c22764 = null;
        if (actionMasked == 0) {
            c1556.f5487 = motionEvent.getPointerId(0);
            c1556.f5499 = motionEvent.getX();
            c1556.f5486 = motionEvent.getY();
            VelocityTracker velocityTracker = c1556.f5488;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            c1556.f5488 = VelocityTracker.obtain();
            if (c1556.f5476 == null) {
                ArrayList arrayList = c1556.f5497;
                if (!arrayList.isEmpty()) {
                    View m5327 = c1556.m5327(motionEvent);
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C22764 c227642 = (C22764) arrayList.get(size);
                        if (c227642.f73498.itemView == m5327) {
                            c22764 = c227642;
                            break;
                        }
                        size--;
                    }
                }
                if (c22764 != null) {
                    AbstractC3255 abstractC3255 = c22764.f73498;
                    c1556.f5499 -= c22764.f73502;
                    c1556.f5486 -= c22764.f73496;
                    c1556.m5321(abstractC3255, true);
                    if (c1556.f5496.remove(abstractC3255.itemView)) {
                        c1556.f5493.mo25263(c1556.f5475, abstractC3255);
                    }
                    c1556.m5320(abstractC3255, c22764.f73495);
                    c1556.m5324(c1556.f5484, 0, motionEvent);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            c1556.f5487 = -1;
            c1556.m5320((AbstractC3255) null, 0);
        } else {
            int i = c1556.f5487;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                c1556.m5317(actionMasked, findPointerIndex, motionEvent);
            }
        }
        VelocityTracker velocityTracker2 = c1556.f5488;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return c1556.f5476 != null;
    }

    @Override // l.InterfaceC20895
    /* renamed from: ֫ */
    public final void mo11303(MotionEvent motionEvent) {
        C1556 c1556 = this.f64599;
        Runnable runnable = c1556.f5482;
        c1556.f5483.m3331(motionEvent);
        VelocityTracker velocityTracker = c1556.f5488;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (c1556.f5487 == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(c1556.f5487);
        if (findPointerIndex >= 0) {
            c1556.m5317(actionMasked, findPointerIndex, motionEvent);
        }
        AbstractC3255 abstractC3255 = c1556.f5476;
        if (abstractC3255 == null) {
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (findPointerIndex >= 0) {
                    c1556.m5324(c1556.f5484, findPointerIndex, motionEvent);
                    c1556.m5319(abstractC3255);
                    c1556.f5475.removeCallbacks(runnable);
                    ((RunnableC22059) runnable).run();
                    c1556.f5475.invalidate();
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == c1556.f5487) {
                    c1556.f5487 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    c1556.m5324(c1556.f5484, actionIndex, motionEvent);
                    return;
                }
                return;
            }
            VelocityTracker velocityTracker2 = c1556.f5488;
            if (velocityTracker2 != null) {
                velocityTracker2.clear();
            }
        }
        c1556.m5320((AbstractC3255) null, 0);
        c1556.f5487 = -1;
    }

    @Override // l.InterfaceC20895
    /* renamed from: ֫ */
    public final void mo11304(boolean z) {
        if (z) {
            this.f64599.m5320((AbstractC3255) null, 0);
        }
    }
}
