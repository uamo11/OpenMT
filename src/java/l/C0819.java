package l;

import android.widget.PopupWindow;

/* compiled from: 95GJ */
/* renamed from: l.֨ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0819 implements PopupWindow.OnDismissListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21282 f2990;

    public C0819(C21282 c21282) {
        this.f2990 = c21282;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C21282 c21282 = this.f2990;
        InterfaceC7875 interfaceC7875 = c21282.f68636;
        if (interfaceC7875 != null) {
            interfaceC7875.mo6265(c21282);
        }
    }
}
