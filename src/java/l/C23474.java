package l;

import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: L9CC */
/* renamed from: l.᩻ۙܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23474 extends LinearLayout {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f75322;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23474(C3013 c3013, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f75322 = c3013;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Size size;
        Size size2;
        C3013 c3013 = this.f75322;
        if (C3013.m9221(c3013)) {
            size = c3013.f9490;
            if (size != null) {
                size2 = c3013.f9490;
                i = View.MeasureSpec.makeMeasureSpec(size2.getWidth(), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return C3013.m9221(this.f75322);
    }
}
