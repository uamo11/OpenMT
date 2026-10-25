package l;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: L1RG */
/* renamed from: l.ۢ᩹ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC9877 implements View.OnTouchListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f29892;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f29893;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f29894;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f29895;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f29896;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29897;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f29898;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24971(View view) {
        ViewOnTouchListenerC9877 viewOnTouchListenerC9877 = new ViewOnTouchListenerC9877();
        viewOnTouchListenerC9877.f29897 = 0;
        viewOnTouchListenerC9877.f29894 = view;
        view.setOnTouchListener(viewOnTouchListenerC9877);
        viewOnTouchListenerC9877.f29895 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r1 != 3) goto L23;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r6 = r5.f29895
            android.view.View r0 = r5.f29894
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L51
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L17
            r6 = 3
            if (r1 == r6) goto L3d
            goto L50
        L17:
            boolean r0 = r5.f29892
            if (r0 != 0) goto L50
            float r0 = r7.getX()
            float r1 = r5.f29896
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r6 = (float) r6
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L3a
            float r7 = r7.getY()
            float r0 = r5.f29893
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 < 0) goto L50
        L3a:
            r5.f29892 = r3
            return r3
        L3d:
            r0.setPressed(r2)
            int r6 = r5.f29897
            int r6 = r6 + r3
            r5.f29897 = r6
            boolean r6 = r5.f29892
            if (r6 != 0) goto L50
            boolean r6 = r5.f29898
            if (r6 != 0) goto L50
            r0.performClick()
        L50:
            return r3
        L51:
            r0.setPressed(r3)
            r5.f29892 = r2
            r5.f29898 = r2
            float r6 = r7.getX()
            r5.f29896 = r6
            float r6 = r7.getY()
            r5.f29893 = r6
            int r6 = r5.f29897
            int r6 = r6 + r3
            r5.f29897 = r6
            l.᩻᩹ۢ r7 = new l.᩻᩹ۢ
            r7.<init>()
            r1 = 150(0x96, double:7.4E-322)
            r0.postDelayed(r7, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnTouchListenerC9877.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24974(final ViewOnTouchListenerC9877 viewOnTouchListenerC9877, final int i) {
        View view = viewOnTouchListenerC9877.f29894;
        if (i != viewOnTouchListenerC9877.f29897 || viewOnTouchListenerC9877.f29892) {
            return;
        }
        viewOnTouchListenerC9877.f29898 = true;
        view.performClick();
        view.postDelayed(new Runnable() { // from class: l.ۜ᩹ۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnTouchListenerC9877.m24972(ViewOnTouchListenerC9877.this, i);
            }
        }, 350L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24972(ViewOnTouchListenerC9877 viewOnTouchListenerC9877, int i) {
        if (i != viewOnTouchListenerC9877.f29897 || viewOnTouchListenerC9877.f29892) {
            return;
        }
        viewOnTouchListenerC9877.f29894.performHapticFeedback(0);
        new RunnableC21166(viewOnTouchListenerC9877, i).run();
    }
}
