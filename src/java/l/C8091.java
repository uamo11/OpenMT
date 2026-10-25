package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: 21RX */
/* renamed from: l.۠ۢۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8091 extends FrameLayout {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f24904;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f24905;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f24906;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f24907;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC5269 f24908;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f24909;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1035 f24910;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24911;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f24912;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f24913;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final PointF f24914;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public WindowManager f24915;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public WindowManager.LayoutParams f24916;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f24917;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Point f24918;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC0329 f24919;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f24920;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public RunnableC19381 f24921;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f24922;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21461(float f, int i) {
        if (f < 0.0f) {
            f = 0.0f;
        } else {
            float f2 = i;
            if (f > f2) {
                f = f2;
            }
        }
        return (int) f;
    }

    public C8091(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24918 = new Point();
        VelocityTracker.obtain();
        this.f24914 = new PointF();
        m21462(context);
    }

    public C8091(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24918 = new Point();
        VelocityTracker.obtain();
        this.f24914 = new PointF();
        m21462(context);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21462(Context context) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            setForceDarkAllowed(false);
        }
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f24917 = scaledTouchSlop * scaledTouchSlop;
        this.f24920 = false;
        WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
        this.f24915 = windowManager;
        windowManager.getDefaultDisplay().getSize(this.f24918);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f24916 = layoutParams;
        if (i >= 26) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2003;
        }
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.flags = 40;
        layoutParams.width = -2;
        layoutParams.height = -2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r0 != 3) goto L58;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8091.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m21474() {
        this.f24911 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m21472() {
        return this.f24909;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m21473() {
        return this.f24907;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21471(int[] iArr) {
        WindowManager.LayoutParams layoutParams = this.f24916;
        iArr[0] = layoutParams.x;
        iArr[1] = layoutParams.y;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21468(InterfaceC0329 interfaceC0329) {
        this.f24919 = interfaceC0329;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21470(InterfaceC5269 interfaceC5269) {
        this.f24908 = interfaceC5269;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        WindowManager.LayoutParams layoutParams;
        Display defaultDisplay = this.f24915.getDefaultDisplay();
        Point point = this.f24918;
        defaultDisplay.getSize(point);
        if (!this.f24920 || (layoutParams = this.f24916) == null) {
            return;
        }
        if (layoutParams.x > 0) {
            layoutParams.x = point.x - getWidth();
        }
        if (this.f24916.y > point.y - getHeight()) {
            this.f24916.y = point.y - getHeight();
        }
        this.f24915.updateViewLayout(this, this.f24916);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21466() {
        if (this.f24920 || !C9255.m23764(getContext()) || this.f24920) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f24916;
        float f = layoutParams.x;
        Point point = this.f24918;
        layoutParams.x = m21461(f, point.x - getWidth());
        this.f24916.y = m21461(r0.y, point.y - getHeight());
        this.f24915.addView(this, this.f24916);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m21475() {
        boolean z = this.f24920;
        if (z && z) {
            this.f24915.removeView(this);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21467(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.f24916;
        if (layoutParams.x == i && layoutParams.y == i2) {
            return;
        }
        layoutParams.x = i;
        layoutParams.y = i2;
        if (this.f24920) {
            this.f24915.updateViewLayout(this, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24920 = true;
        InterfaceC1035 interfaceC1035 = this.f24910;
        if (interfaceC1035 != null) {
            ((C0396) interfaceC1035).m1891();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24920 = false;
        RunnableC19381 runnableC19381 = this.f24921;
        if (runnableC19381 != null) {
            removeCallbacks(runnableC19381);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21469(C0396 c0396) {
        this.f24910 = c0396;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f24920;
    }
}
