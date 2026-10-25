package l;

import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: L9CC */
/* renamed from: l.ۜۙܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6541 extends ArrayAdapter {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f20189;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6541(C3013 c3013, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.f20189 = c3013;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C4424 c4424;
        Size size;
        C3013 c3013 = this.f20189;
        c4424 = c3013.f9533;
        MenuItem menuItem = (MenuItem) getItem(i);
        size = c3013.f9511;
        return c4424.m13146(menuItem, size.getWidth(), view);
    }
}
