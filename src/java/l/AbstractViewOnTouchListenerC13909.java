package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: 44YF */
/* renamed from: l.ܰܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractViewOnTouchListenerC13909 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float f41450;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41451;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Runnable f41452;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f41453 = new int[2];

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f41454;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View f41455;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f41456;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f41457;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Runnable f41458;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: ֫ */
    public abstract InterfaceC9825 mo11585();

    /* renamed from: ۧ */
    public abstract boolean mo11586();

    public AbstractViewOnTouchListenerC13909(View view) {
        this.f41455 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f41450 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f41454 = tapTimeout;
        this.f41451 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC13909.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f41456 = false;
        this.f41457 = -1;
        Runnable runnable = this.f41458;
        if (runnable != null) {
            this.f41455.removeCallbacks(runnable);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo33314() {
        InterfaceC9825 mo11585 = mo11585();
        if (mo11585 == null || !mo11585.isShowing()) {
            return true;
        }
        mo11585.dismiss();
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m33313() {
        Runnable runnable = this.f41452;
        View view = this.f41455;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f41458;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33315() {
        m33313();
        View view = this.f41455;
        if (view.isEnabled() && !view.isLongClickable() && mo11586()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f41456 = true;
        }
    }
}
