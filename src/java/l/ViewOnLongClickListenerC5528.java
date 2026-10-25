package l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alipay.sdk.m.y.c;

/* compiled from: 95DO */
/* renamed from: l.ۚᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnLongClickListenerC5528 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ViewOnLongClickListenerC5528 f17107;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static ViewOnLongClickListenerC5528 f17108;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f17109;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1294 f17112;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CharSequence f17113;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f17114;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17116;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f17117;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f17118;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final RunnableC19640 f17111 = new Runnable() { // from class: l.᩵ᩴ
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC5528.this.m15672(false);
        }
    };

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RunnableC0588 f17115 = new RunnableC0588(this);

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17110 = true;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15669(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528 = f17107;
        if (viewOnLongClickListenerC5528 != null && viewOnLongClickListenerC5528.f17117 == view) {
            m15670((ViewOnLongClickListenerC5528) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC5528 viewOnLongClickListenerC55282 = f17108;
            if (viewOnLongClickListenerC55282 != null && viewOnLongClickListenerC55282.f17117 == view) {
                viewOnLongClickListenerC55282.m15671();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC5528(view, charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩵ᩴ] */
    public ViewOnLongClickListenerC5528(View view, CharSequence charSequence) {
        this.f17117 = view;
        this.f17113 = charSequence;
        this.f17114 = C21177.m48123(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f17118 = view.getWidth() / 2;
        this.f17116 = view.getHeight() / 2;
        m15672(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f17116) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            l.֨ᩴ r4 = r3.f17112
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f17109
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f17117
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f17110 = r4
            r3.m15671()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            l.֨ᩴ r4 = r3.f17112
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f17110
            if (r1 != 0) goto L66
            int r1 = r3.f17118
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f17114
            if (r1 > r2) goto L66
            int r1 = r3.f17116
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f17118 = r4
            r3.f17116 = r5
            r3.f17110 = r0
            m15670(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnLongClickListenerC5528.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m15671();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15672(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        View view = this.f17117;
        if (view.isAttachedToWindow()) {
            m15670((ViewOnLongClickListenerC5528) null);
            ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528 = f17108;
            if (viewOnLongClickListenerC5528 != null) {
                viewOnLongClickListenerC5528.m15671();
            }
            f17108 = this;
            this.f17109 = z;
            C1294 c1294 = new C1294(view.getContext());
            this.f17112 = c1294;
            c1294.mo4386(this.f17117, this.f17118, this.f17116, this.f17109, this.f17113);
            view.addOnAttachStateChangeListener(this);
            if (this.f17109) {
                j2 = 2500;
            } else {
                int i = C17648.f53953;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = c.a;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            RunnableC0588 runnableC0588 = this.f17115;
            view.removeCallbacks(runnableC0588);
            view.postDelayed(runnableC0588, j2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15671() {
        ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528 = f17108;
        View view = this.f17117;
        if (viewOnLongClickListenerC5528 == this) {
            f17108 = null;
            C1294 c1294 = this.f17112;
            if (c1294 != null) {
                c1294.mo4385();
                this.f17112 = null;
                this.f17110 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f17107 == this) {
            m15670((ViewOnLongClickListenerC5528) null);
        }
        view.removeCallbacks(this.f17115);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15670(ViewOnLongClickListenerC5528 viewOnLongClickListenerC5528) {
        ViewOnLongClickListenerC5528 viewOnLongClickListenerC55282 = f17107;
        if (viewOnLongClickListenerC55282 != null) {
            viewOnLongClickListenerC55282.f17117.removeCallbacks(viewOnLongClickListenerC55282.f17111);
        }
        f17107 = viewOnLongClickListenerC5528;
        if (viewOnLongClickListenerC5528 != null) {
            viewOnLongClickListenerC5528.f17117.postDelayed(viewOnLongClickListenerC5528.f17111, ViewConfiguration.getLongPressTimeout());
        }
    }
}
