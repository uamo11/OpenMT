package l;

import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: L9CC */
/* renamed from: l.ۙۙܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4424 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f14150;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ContextThemeWrapper f14151;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f14152;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f14153;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f14154;

    public C4424(C3013 c3013, ContextThemeWrapper contextThemeWrapper, int i) {
        this.f14153 = c3013;
        this.f14151 = contextThemeWrapper;
        this.f14152 = i;
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.MT_Protector_res_0x7f0700c5);
        this.f14154 = dimensionPixelSize;
        View m9189 = C3013.m9189(c3013, contextThemeWrapper, (MenuItem) null, i);
        m9189.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f14150 = m9189;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m13146(MenuItem menuItem, int i, View view) {
        C11003.requireNonNull(menuItem);
        int i2 = this.f14152;
        C3013 c3013 = this.f14153;
        if (view != null) {
            c3013.m9194(view, menuItem, i2, false);
        } else {
            view = C3013.m9189(c3013, this.f14151, menuItem, i2);
            int i3 = this.f14154;
            view.setPadding(i3, 0, i3, 0);
            view.setOnTouchListener(new ViewOnTouchListenerC10775(c3013));
        }
        view.setMinimumWidth(i);
        return view;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13145(MenuItem menuItem) {
        C3013 c3013 = this.f14153;
        View view = this.f14150;
        c3013.m9194(view, menuItem, this.f14152, false);
        view.measure(0, 0);
        return view.getMeasuredWidth();
    }
}
