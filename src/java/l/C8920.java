package l;

import android.os.Bundle;
import android.view.View;

/* compiled from: Q69A */
/* renamed from: l.ۡܰۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8920 extends C16445 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0452 f27124;

    public C8920(C0452 c0452) {
        this.f27124 = c0452;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.mo11916() > 1) goto L8;
     */
    @Override // l.C16445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            super.onInitializeAccessibilityEvent(r3, r4)
            java.lang.Class<l.֡ܰۧ> r3 = l.C0452.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            l.֡ܰۧ r3 = r2.f27124
            l.ۨ᩺ۧ r0 = r3.f2007
            if (r0 == 0) goto L1a
            int r0 = r0.mo11916()
            r1 = 1
            if (r0 <= r1) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r4.setScrollable(r1)
            int r0 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L3b
            l.ۨ᩺ۧ r0 = r3.f2007
            if (r0 == 0) goto L3b
            int r0 = r0.mo11916()
            r4.setItemCount(r0)
            int r0 = r3.f1989
            r4.setFromIndex(r0)
            int r3 = r3.f1989
            r4.setToIndex(r3)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8920.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        super.onInitializeAccessibilityNodeInfo(view, c14369);
        c14369.m34281((CharSequence) C0452.class.getName());
        C0452 c0452 = this.f27124;
        AbstractC12014 abstractC12014 = c0452.f2007;
        c14369.m34313(abstractC12014 != null && abstractC12014.mo11916() > 1);
        if (c0452.canScrollHorizontally(1)) {
            c14369.m34275(4096);
        }
        if (c0452.canScrollHorizontally(-1)) {
            c14369.m34275(8192);
        }
    }

    @Override // l.C16445
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C0452 c0452 = this.f27124;
        if (i == 4096) {
            if (!c0452.canScrollHorizontally(1)) {
                return false;
            }
            c0452.m2043(c0452.f1989 + 1);
            return true;
        }
        if (i != 8192 || !c0452.canScrollHorizontally(-1)) {
            return false;
        }
        c0452.m2043(c0452.f1989 - 1);
        return true;
    }
}
