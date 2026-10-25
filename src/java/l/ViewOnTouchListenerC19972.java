package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;

/* compiled from: 96WS */
/* renamed from: l.᩶ۚ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC19972 implements View.OnTouchListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f64663;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f64664;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f64665;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f64666;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f64667;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final int f64668;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f64670;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final int f64671;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f64672;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f64673;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f64674;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f64675;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public float f64676;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f64677;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f64678;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f64679;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f64680;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f64681;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f64682;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f64683;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f64684;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f64685;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f64686;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C11007 f64669 = C11007.f33107;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final RunnableC7977 f64662 = new Runnable() { // from class: l.۠ۚ᩷
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnTouchListenerC19972.this.m46048(true);
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [l.۠ۚ᩷] */
    public ViewOnTouchListenerC19972(View view, InterfaceC12344 interfaceC12344) {
        this.f64683 = view;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        this.f64663 = viewGroup;
        this.f64686 = interfaceC12344;
        this.f64675 = Math.round(view.getResources().getDisplayMetrics().density * 8.0f);
        this.f64679 = m46042(interfaceC12344.getFloat("hfpx", 0.0f));
        this.f64676 = m46042(interfaceC12344.getFloat("hfpy", 0.0f));
        this.f64668 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        int i = Build.VERSION.SDK_INT;
        int i2 = EnumC2194.f7202;
        if (i >= 29 && accessibilityManager != null) {
            i2 = accessibilityManager.getRecommendedTimeoutMillis(EnumC2194.f7202, 5);
        }
        this.f64671 = i2;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.ܶۚ᩷
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ViewOnTouchListenerC19972.m46044(ViewOnTouchListenerC19972.this, motionEvent);
            }
        });
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩸ۚ᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                ViewOnTouchListenerC19972.this.m46046();
            }
        });
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩹ۚ᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                ViewOnTouchListenerC19972.this.m46046();
            }
        });
        m46046();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46058(C11007 c11007) {
        this.f64669 = c11007;
        m46046();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46044(ViewOnTouchListenerC19972 viewOnTouchListenerC19972, MotionEvent motionEvent) {
        int i = viewOnTouchListenerC19972.f64668;
        View view = viewOnTouchListenerC19972.f64683;
        if (!viewOnTouchListenerC19972.f64667) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            viewOnTouchListenerC19972.f64664 = true;
            viewOnTouchListenerC19972.f64685 = false;
            viewOnTouchListenerC19972.f64684 = motionEvent.getRawX();
            viewOnTouchListenerC19972.f64681 = motionEvent.getRawY();
            viewOnTouchListenerC19972.f64665 = view.getX();
            viewOnTouchListenerC19972.f64672 = view.getY();
            viewOnTouchListenerC19972.m46055();
            return false;
        }
        if (!viewOnTouchListenerC19972.f64664) {
            return true;
        }
        if (actionMasked == 5) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            view.onTouchEvent(obtain);
            obtain.recycle();
            viewOnTouchListenerC19972.m46050();
            viewOnTouchListenerC19972.m46045();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z = viewOnTouchListenerC19972.f64685;
                viewOnTouchListenerC19972.m46050();
                viewOnTouchListenerC19972.m46045();
                return z;
            }
            return viewOnTouchListenerC19972.f64685;
        }
        float rawX = motionEvent.getRawX() - viewOnTouchListenerC19972.f64684;
        float rawY = motionEvent.getRawY() - viewOnTouchListenerC19972.f64681;
        if (!viewOnTouchListenerC19972.f64685) {
            float f = i;
            if (Math.abs(rawX) > f || Math.abs(rawY) > f) {
                viewOnTouchListenerC19972.f64685 = true;
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.setAction(3);
                view.onTouchEvent(obtain2);
                obtain2.recycle();
                viewOnTouchListenerC19972.f64663.requestDisallowInterceptTouchEvent(true);
            }
        }
        if (viewOnTouchListenerC19972.f64685) {
            float m46049 = viewOnTouchListenerC19972.m46049();
            float m46056 = viewOnTouchListenerC19972.m46056();
            float max = Math.max(0.0f, viewOnTouchListenerC19972.m46053() - m46049);
            float max2 = Math.max(0.0f, viewOnTouchListenerC19972.m46052() - m46056);
            if (max > 0.0f) {
                viewOnTouchListenerC19972.f64679 = m46042(((viewOnTouchListenerC19972.f64665 + rawX) - m46049) / max);
            }
            if (max2 > 0.0f) {
                viewOnTouchListenerC19972.f64676 = m46042(((viewOnTouchListenerC19972.f64672 + rawY) - m46056) / max2);
            }
            viewOnTouchListenerC19972.f64680 = true;
            viewOnTouchListenerC19972.m46046();
        }
        return viewOnTouchListenerC19972.f64685;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m46050() {
        this.f64664 = false;
        this.f64685 = false;
        this.f64663.requestDisallowInterceptTouchEvent(false);
        if (this.f64680) {
            this.f64686.edit().putFloat("hfpx", this.f64679).putFloat("hfpy", this.f64676).apply();
            this.f64680 = false;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private float m46049() {
        return Math.max(this.f64663.getPaddingLeft(), this.f64669.f33109) + this.f64675;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private float m46056() {
        return Math.max(this.f64663.getPaddingTop(), this.f64669.f33111) + this.f64675;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private float m46053() {
        ViewGroup viewGroup = this.f64663;
        return ((viewGroup.getWidth() - Math.max(viewGroup.getPaddingRight(), this.f64669.f33110)) - this.f64683.getLayoutParams().width) - this.f64675;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private float m46052() {
        ViewGroup viewGroup = this.f64663;
        return ((viewGroup.getHeight() - Math.max(viewGroup.getPaddingBottom(), this.f64669.f33108)) - this.f64683.getLayoutParams().height) - this.f64675;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m46046() {
        ViewGroup viewGroup = this.f64663;
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            return;
        }
        float max = (Math.max(0.0f, m46053() - m46049()) * this.f64679) + m46049();
        View view = this.f64683;
        view.setX(max);
        view.setY((Math.max(0.0f, m46052() - m46056()) * this.f64676) + m46056());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m46042(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46059(boolean z) {
        m46050();
        this.f64667 = z;
        this.f64677 = false;
        this.f64666 = false;
        if (z) {
            m46055();
        } else {
            m46048(false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f64667) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f64677 = true;
                this.f64678 = false;
                this.f64666 = false;
                this.f64673 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f64674 = y;
                this.f64670 = y;
                return false;
            }
            if (actionMasked == 1) {
                if (this.f64677 && !this.f64678 && motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
                    m46055();
                } else if (this.f64682) {
                    m46045();
                }
                this.f64677 = false;
                return false;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3 || actionMasked == 5) {
                    this.f64677 = false;
                    this.f64666 = false;
                    return false;
                }
            } else if (this.f64677) {
                float x = motionEvent.getX() - this.f64673;
                float y2 = motionEvent.getY() - this.f64670;
                float abs = Math.abs(x);
                float f = this.f64668;
                if (abs > f || Math.abs(y2) > f) {
                    this.f64678 = true;
                }
                if (this.f64678 && (this.f64666 || Math.abs(y2) > Math.abs(x))) {
                    this.f64666 = true;
                    float y3 = motionEvent.getY() - this.f64674;
                    if (Math.abs(y3) > f) {
                        this.f64674 = motionEvent.getY();
                        if (y3 > 0.0f) {
                            m46055();
                            return false;
                        }
                        m46048(true);
                        return false;
                    }
                    if (this.f64682) {
                        m46045();
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46057() {
        if (this.f64667 && this.f64666 && this.f64682) {
            m46045();
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m46055() {
        if (this.f64667) {
            if (!this.f64682) {
                View view = this.f64683;
                view.animate().withEndAction(null).cancel();
                view.setVisibility(0);
                m46046();
                view.animate().alpha(1.0f).setDuration(180L).start();
                this.f64682 = true;
            }
            m46045();
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m46045() {
        View view = this.f64683;
        RunnableC7977 runnableC7977 = this.f64662;
        view.removeCallbacks(runnableC7977);
        if (this.f64667 && this.f64682 && !this.f64664) {
            view.postDelayed(runnableC7977, this.f64671);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m46048(boolean z) {
        RunnableC7977 runnableC7977 = this.f64662;
        View view = this.f64683;
        view.removeCallbacks(runnableC7977);
        if (!z || this.f64682) {
            this.f64682 = false;
            view.animate().withEndAction(null).cancel();
            if (z) {
                view.animate().alpha(0.0f).setDuration(180L).withEndAction(new RunnableC21154(1, this)).start();
            } else {
                view.setAlpha(0.0f);
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46043(ViewOnTouchListenerC19972 viewOnTouchListenerC19972) {
        if (viewOnTouchListenerC19972.f64682) {
            return;
        }
        viewOnTouchListenerC19972.f64683.setVisibility(8);
    }
}
