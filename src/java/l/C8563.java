package l;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* compiled from: E6AF */
/* renamed from: l.ۡ֫֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8563 extends C16445 {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r6 != 16908346) goto L30;
     */
    @Override // l.C16445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performAccessibilityAction(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            boolean r7 = super.performAccessibilityAction(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L8
            return r0
        L8:
            l.֡֫֫ r5 = (l.C0095) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L12
            goto L80
        L12:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L2f
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L2f
            int r7 = r2.height()
        L2f:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L5f
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L42
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L42
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L5f
            goto L80
        L42:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L80
            r5.m1076(r6)
            return r0
        L5f:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.m1064()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L80
            r5.m1076(r6)
            return r0
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8563.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        int m1064;
        super.onInitializeAccessibilityNodeInfo(view, c14369);
        C0095 c0095 = (C0095) view;
        c14369.m34281((CharSequence) ScrollView.class.getName());
        if (!c0095.isEnabled() || (m1064 = c0095.m1064()) <= 0) {
            return;
        }
        c14369.m34313(true);
        if (c0095.getScrollY() > 0) {
            c14369.m34283(C13847.f41299);
            c14369.m34283(C13847.f41297);
        }
        if (c0095.getScrollY() < m1064) {
            c14369.m34283(C13847.f41296);
            c14369.m34283(C13847.f41302);
        }
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        C0095 c0095 = (C0095) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(c0095.m1064() > 0);
        accessibilityEvent.setScrollX(c0095.getScrollX());
        accessibilityEvent.setScrollY(c0095.getScrollY());
        accessibilityEvent.setMaxScrollX(c0095.getScrollX());
        accessibilityEvent.setMaxScrollY(c0095.m1064());
    }
}
