package l;

import android.view.MenuItem;
import android.view.View;
import java.util.LinkedHashMap;

/* compiled from: L9CC */
/* renamed from: l.ܺۙܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC15712 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f48464;

    public ViewOnClickListenerC15712(C3013 c3013) {
        this.f48464 = c3013;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        LinkedHashMap linkedHashMap;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener2;
        C3013 c3013 = this.f48464;
        onMenuItemClickListener = c3013.f9528;
        if (onMenuItemClickListener == null) {
            return;
        }
        Object tag = view.getTag();
        if (tag instanceof C22063) {
            linkedHashMap = c3013.f9532;
            MenuItem menuItem = (MenuItem) linkedHashMap.get((C22063) tag);
            if (menuItem == null) {
                return;
            }
            onMenuItemClickListener2 = c3013.f9528;
            ((MenuItemOnMenuItemClickListenerC10524) onMenuItemClickListener2).onMenuItemClick(menuItem);
        }
    }
}
