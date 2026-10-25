package l;

import android.view.Window;

/* compiled from: 422Y */
/* renamed from: l.֡ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0462 implements InterfaceC17585 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f2027;

    public C0462(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402) {
        this.f2027 = layoutInflaterFactory2C5402;
    }

    @Override // l.InterfaceC17585
    public final void onCloseMenu(C3060 c3060, boolean z) {
        C3060 rootMenu = c3060.getRootMenu();
        boolean z2 = rootMenu != c3060;
        if (z2) {
            c3060 = rootMenu;
        }
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f2027;
        C19514 m15454 = layoutInflaterFactory2C5402.m15454(c3060);
        if (m15454 != null) {
            if (z2) {
                layoutInflaterFactory2C5402.m15435(m15454.f63069, m15454, rootMenu);
                layoutInflaterFactory2C5402.m15442(m15454, true);
            } else {
                layoutInflaterFactory2C5402.m15442(m15454, z);
            }
        }
    }

    @Override // l.InterfaceC17585
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo2048(C3060 c3060) {
        Window.Callback callback;
        if (c3060 != c3060.getRootMenu()) {
            return true;
        }
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f2027;
        if (!layoutInflaterFactory2C5402.f16860 || (callback = layoutInflaterFactory2C5402.f16823.getCallback()) == null || layoutInflaterFactory2C5402.f16859) {
            return true;
        }
        callback.onMenuOpened(108, c3060);
        return true;
    }
}
