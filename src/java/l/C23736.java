package l;

import android.graphics.Rect;
import android.view.View;

/* compiled from: Q69A */
/* renamed from: l.᩻ܰۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23736 implements InterfaceC16610 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Rect f76855 = new Rect();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0452 f76856;

    public C23736(C0452 c0452) {
        this.f76856 = c0452;
    }

    @Override // l.InterfaceC16610
    public final C21610 onApplyWindowInsets(View view, C21610 c21610) {
        C21610 m41324 = C17648.m41324(view, c21610);
        if (m41324.m48830()) {
            return m41324;
        }
        int m48824 = m41324.m48824();
        Rect rect = this.f76855;
        rect.left = m48824;
        rect.top = m41324.m48826();
        rect.right = m41324.m48834();
        rect.bottom = m41324.m48835();
        C0452 c0452 = this.f76856;
        int childCount = c0452.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C21610 m41299 = C17648.m41299(c0452.getChildAt(i), m41324);
            rect.left = Math.min(m41299.m48824(), rect.left);
            rect.top = Math.min(m41299.m48826(), rect.top);
            rect.right = Math.min(m41299.m48834(), rect.right);
            rect.bottom = Math.min(m41299.m48835(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        C23726 c23726 = new C23726(m41324);
        c23726.m52376(C11007.m27341(i2, i3, i4, i5));
        return c23726.m52373();
    }
}
