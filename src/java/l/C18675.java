package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: U713 */
/* renamed from: l.ᩴۢۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18675 extends C11619 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Paint f59016;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f59017;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f59018;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f59019;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f59020;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final RunnableC3858 f59021;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59022;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f59023;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f59024;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14792 f59025;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f59026;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f59027;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float f59028;

    public C18675(ActivityC0921 activityC0921) {
        super(activityC0921);
        this.f59016 = new Paint();
        this.f59025 = new C14792(3);
        this.f59021 = new RunnableC3858(0, this);
        this.f59018 = -1L;
        float f = activityC0921.getResources().getDisplayMetrics().density;
        this.f59024 = 8.0f * f;
        this.f59028 = f * 48.0f;
        this.f59019 = ViewConfiguration.get(activityC0921).getScaledTouchSlop();
        setVerticalScrollBarEnabled(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f59018 = SystemClock.uptimeMillis();
        RunnableC3858 runnableC3858 = this.f59021;
        if (runnableC3858 == null) {
            return;
        }
        removeCallbacks(runnableC3858);
        postDelayed(runnableC3858, 1500L);
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int computeVerticalScrollRange = computeVerticalScrollRange();
        int computeVerticalScrollExtent = computeVerticalScrollExtent();
        int i = computeVerticalScrollRange - computeVerticalScrollExtent;
        int width = getWidth();
        int height = getHeight();
        C14792 c14792 = this.f59025;
        if (width > 0 && height > 0 && i > 0 && computeVerticalScrollExtent > 0 && (this.f59022 || computeVerticalScrollRange / computeVerticalScrollExtent > 3.5f)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            float m43293 = m43293(uptimeMillis);
            if (m43293 > 0.0f) {
                this.f59020 = true;
                float f = height;
                float min = Math.min(this.f59028, f);
                float max = i != 0 ? ((f - min) * Math.max(0, Math.min(computeVerticalScrollOffset(), i))) / i : 0.0f;
                float f2 = width;
                float f3 = this.f59024;
                c14792.m35175(f2 - f3, max, f2, max + min);
                float scrollX = getScrollX() + width;
                float scrollY = getScrollY();
                Paint paint = this.f59016;
                paint.setColor((((int) (57 * m43293)) << 24) | 7829367);
                float f4 = scrollX - (f3 * m43293);
                canvas.drawRect(f4, scrollY, scrollX, f + scrollY, paint);
                paint.setColor(((this.f59022 ? C21943.f70257 : -579373193) & 16777215) | (((int) (((r5 >>> 24) & 255) * m43293)) << 24));
                float f5 = scrollY + max;
                canvas.drawRect(f4, f5, scrollX, f5 + min, paint);
                if (this.f59022 || uptimeMillis - this.f59018 < 1500) {
                    return;
                }
                postInvalidateOnAnimation();
                return;
            }
        }
        this.f59020 = false;
        c14792.m35174();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m43293(long j) {
        if (!this.f59022) {
            long j2 = this.f59018;
            if (j2 < 0) {
                return 0.0f;
            }
            long j3 = j - j2;
            if (j3 < 0 || j3 > 1800) {
                return 0.0f;
            }
            if (j3 > 1500) {
                return 1.0f - ((j3 - 1500) / 300.0f);
            }
        }
        return 1.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43294() {
        this.f59023 = false;
        this.f59022 = true;
        this.f59017 = this.f59025.f45166 - this.f59027;
        removeCallbacks(this.f59021);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43295(float f) {
        int computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
        float height = getHeight() - Math.min(this.f59028, getHeight());
        if (computeVerticalScrollRange <= 0 || height <= 0.0f) {
            return;
        }
        scrollTo(getScrollX(), Math.round(computeVerticalScrollRange * Math.max(0.0f, Math.min((f + this.f59017) / height, 1.0f))));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f59022) {
            if (actionMasked == 2) {
                m43295(motionEvent.getY());
                return true;
            }
            if (actionMasked == 1 || actionMasked == 3) {
                this.f59022 = false;
                this.f59018 = SystemClock.uptimeMillis();
                RunnableC3858 runnableC3858 = this.f59021;
                if (runnableC3858 != null) {
                    removeCallbacks(runnableC3858);
                    postDelayed(runnableC3858, 1500L);
                    invalidate();
                }
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        if (actionMasked == 0) {
            this.f59023 = false;
            int computeVerticalScrollExtent = computeVerticalScrollExtent();
            int computeVerticalScrollRange = computeVerticalScrollRange();
            if (this.f59020 && m43293(SystemClock.uptimeMillis()) > 0.0f) {
                C14792 c14792 = this.f59025;
                if (c14792.f45167 > c14792.f45163 && c14792.f45162 > c14792.f45166 && computeVerticalScrollExtent > 0 && computeVerticalScrollRange > computeVerticalScrollExtent && computeVerticalScrollRange / computeVerticalScrollExtent > 3.5f) {
                    this.f59026 = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f59027 = y;
                    if (c14792.m35178(this.f59026, y)) {
                        m43294();
                        return true;
                    }
                    this.f59023 = c14792.m35177(this.f59026, this.f59027);
                }
            }
        } else {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            this.f59023 = false;
                        }
                    }
                } else if (this.f59023) {
                    float x = motionEvent.getX() - this.f59026;
                    float y2 = motionEvent.getY() - this.f59027;
                    if (motionEvent.getEventTime() - motionEvent.getDownTime() >= ViewConfiguration.getLongPressTimeout()) {
                        this.f59023 = false;
                    } else {
                        float abs = Math.abs(y2);
                        float f = this.f59019;
                        if (abs > f && Math.abs(y2) > Math.abs(x)) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction(3);
                            super.onTouchEvent(obtain);
                            obtain.recycle();
                            m43294();
                            m43295(motionEvent.getY());
                            return true;
                        }
                        if (Math.abs(x) > f) {
                            this.f59023 = false;
                        }
                    }
                }
            }
            this.f59023 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f59021);
        super.onDetachedFromWindow();
    }
}
