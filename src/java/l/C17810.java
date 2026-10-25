package l;

import android.view.MenuItem;

/* compiled from: QB32 */
/* renamed from: l.ᩳۘᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C17810 implements InterfaceC1008 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54447;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54448;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f54449;

    public /* synthetic */ C17810(int i, Object obj, Object obj2) {
        this.f54448 = i;
        this.f54449 = obj;
        this.f54447 = obj2;
    }

    @Override // l.InterfaceC1008
    /* renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f54448) {
            case 0:
                MenuItem menuItem = (MenuItem) this.f54449;
                MenuItem menuItem2 = (MenuItem) this.f54447;
                menuItem.setChecked(((Boolean) obj).booleanValue());
                menuItem2.setEnabled(!r4.booleanValue());
                break;
            default:
                AbstractC20250.m46497((AbstractC20250) this.f54449, (C1848) this.f54447);
                break;
        }
    }
}
