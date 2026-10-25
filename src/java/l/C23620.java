package l;

import android.view.MenuItem;

/* compiled from: U8VQ */
/* renamed from: l.᩻ۢᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C23620 implements InterfaceC1008 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76540;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76541;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76542;

    public /* synthetic */ C23620(int i, Object obj, Object obj2) {
        this.f76541 = i;
        this.f76542 = obj;
        this.f76540 = obj2;
    }

    @Override // l.InterfaceC1008
    /* renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f76541) {
            case 0:
                ((MenuItem) this.f76540).setEnabled(((Boolean) r1.f49016.m1662()).booleanValue() || ((Boolean) r1.f49014.m1662()).booleanValue());
                break;
            default:
                C19547.m44961((C19547) this.f76542, (C3318) this.f76540);
                break;
        }
    }
}
