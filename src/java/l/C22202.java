package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Service;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.alipay.sdk.m.y.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: I5VL */
/* renamed from: l.᩹ۢۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C22202 extends FloatingActionButton {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f72016;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f72017;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f72018;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public WindowManager.LayoutParams f72019;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public float f72020;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f72021;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public WindowManager f72022;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f72023;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f72024;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String f72025;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f72026;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public HandlerC0912 f72027;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f72028;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Point f72029;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f72030;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f72031;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f72032;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final String f72033;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f72034;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public float f72035;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f72036;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f72037;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f72038;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public AnimatorSet f72039;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49870(float f, int i) {
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

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49873(C22202 c22202) {
        if (c22202.isPressed()) {
            return;
        }
        float width = (c22202.getWidth() / 5.0f) * 4.0f;
        if (c22202.f72019.x == 0) {
            width = -width;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c22202, "alpha", 0.8f, 0.35f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c22202, "translationX", 0.0f, width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(300L);
        c22202.f72039 = animatorSet;
        animatorSet.start();
        c22202.f72030 = true;
    }

    public C22202(Service service, String str) {
        super(service);
        Point point = new Point();
        this.f72029 = point;
        this.f72027 = new HandlerC0912(this, new C23202(8));
        this.f72023 = VelocityTracker.obtain();
        this.f72025 = "fbpx:".concat(str);
        this.f72033 = "fbpy:".concat(str);
        WindowManager windowManager = (WindowManager) service.getApplicationContext().getSystemService("window");
        this.f72022 = windowManager;
        C11003.requireNonNull(windowManager);
        windowManager.getDefaultDisplay().getSize(point);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(service);
        float scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f72035 = scaledTouchSlop * scaledTouchSlop;
        this.f72024 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f72020 = viewConfiguration.getScaledMinimumFlingVelocity() * 8;
        setCompatElevation(0.0f);
        setAlpha(0.85f);
        setSize(1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49879() {
        return this.f72036 || getParent() != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22202 m49871(Service service, String str) {
        return new C22202(service, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49878() {
        if (this.f72019 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f72019 = layoutParams;
            if (Build.VERSION.SDK_INT >= 26) {
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
        Point point = this.f72029;
        measure(View.MeasureSpec.makeMeasureSpec(point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        this.f72016 = ApplicationC20075.f65008.getFloat(this.f72025, 1.0f);
        this.f72031 = ApplicationC20075.f65008.getFloat(this.f72033, Float.NaN);
        m49872(getMeasuredWidth(), getMeasuredHeight());
        this.f72022.addView(this, this.f72019);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49872(int i, int i2) {
        Point point = this.f72029;
        int max = Math.max(0, point.x - i);
        int max2 = Math.max(0, point.y - i2);
        this.f72019.x = m49870(Math.round(this.f72016 * max), max);
        this.f72019.y = m49870(Float.isNaN(this.f72031) ? point.y / 3 : Math.round(this.f72031 * max2), max2);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m49876() {
        if (!this.f72021 || this.f72019 == null) {
            return;
        }
        Point point = this.f72029;
        int max = Math.max(0, point.x - getWidth());
        int max2 = Math.max(0, point.y - getHeight());
        this.f72016 = max == 0 ? 0.0f : m49870(this.f72019.x, max) / max;
        this.f72031 = max2 != 0 ? m49870(this.f72019.y, max2) / max2 : 0.0f;
        ApplicationC20075.f65008.edit().putFloat(this.f72025, this.f72016).putFloat(this.f72033, this.f72031).apply();
        this.f72021 = false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49880() {
        if (getParent() != null) {
            this.f72022.removeView(this);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void hide() {
        setVisibility(8);
        this.f72027.removeMessages(0);
        m49877();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton
    public final void show() {
        setVisibility(0);
        m49875();
        float alpha = getAlpha();
        setAlpha(0.0f);
        ObjectAnimator.ofFloat(this, "alpha", 0.0f, alpha).setDuration(200L).start();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m49875() {
        AnimatorSet animatorSet = this.f72039;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f72039 = null;
        }
        if (this.f72030 || getTranslationX() != 0.0f) {
            this.f72030 = false;
            setAlpha(0.8f);
            setTranslationX(0.0f);
        }
        HandlerC0912 handlerC0912 = this.f72027;
        handlerC0912.removeMessages(0);
        if (ApplicationC20075.f65008.getBoolean("floating_button_stick_to_edge", true)) {
            handlerC0912.sendEmptyMessageDelayed(0, c.a);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m49877() {
        ValueAnimator valueAnimator = this.f72017;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f72017 = null;
        }
        m49876();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f72028) {
            this.f72028 = false;
            m49872(i3 - i, i4 - i2);
            this.f72022.updateViewLayout(this, this.f72019);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f72036 = true;
        this.f72028 = true;
        m49875();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f72036 = false;
        this.f72027.removeMessages(0);
        AnimatorSet animatorSet = this.f72039;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f72039 = null;
        }
        m49877();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        m49877();
        WindowManager windowManager = this.f72022;
        windowManager.getDefaultDisplay().getSize(this.f72029);
        if (this.f72036) {
            m49872(getWidth(), getHeight());
            windowManager.updateViewLayout(this, this.f72019);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22202.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49874(C22202 c22202, long[] jArr, C21497 c21497, int i, int i2, ValueAnimator valueAnimator) {
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        boolean z = false;
        float f = (currentPlayTime - jArr[0]) / 1000.0f;
        jArr[0] = currentPlayTime;
        if (f <= 0.0f) {
            return;
        }
        while (f > 0.0f && !z) {
            float min = Math.min(f, 0.032f);
            f -= min;
            z = c21497.m48665(i, min, i2);
        }
        if (currentPlayTime >= 1000 && !z) {
            c21497.m48664(i);
            z = true;
        }
        c22202.f72019.x = Math.round(c21497.f69151);
        c22202.f72019.y = Math.round(c21497.f69149);
        c22202.f72021 = true;
        if (c22202.f72036) {
            c22202.f72022.updateViewLayout(c22202, c22202.f72019);
        }
        if (z) {
            c22202.f72017 = null;
            valueAnimator.cancel();
            c22202.m49876();
            c22202.m49875();
        }
    }
}
