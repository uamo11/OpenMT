package l;

import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;

/* compiled from: L9CC */
/* renamed from: l.᩶ۙܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19947 extends ListView {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3013 f64606;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19947(l.C3013 r3) {
        /*
            r2 = this;
            android.content.Context r0 = l.C3013.m9210(r3)
            r2.<init>(r0)
            r2.f64606 = r3
            int r3 = android.view.ViewConfiguration.getScrollDefaultDelay()
            r0 = 3
            int r3 = r3 * 3
            r2.setScrollBarDefaultDelayBeforeFade(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r3 < r1) goto L1c
            r2.setScrollIndicators(r0)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19947.<init>(l.ۗۙܿ):void");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        Size size;
        Size size2;
        C3013 c3013 = this.f64606;
        size = c3013.f9511;
        int height = size.getHeight();
        size2 = c3013.f9508;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(height - size2.getHeight(), 1073741824));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C3013.m9221(this.f64606)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }
}
