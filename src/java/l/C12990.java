package l;

import android.view.View;
import bin.mt.plus.Main;

/* compiled from: M5NX */
/* renamed from: l.۬۠ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12990 extends AbstractViewOnClickListenerC1201 implements InterfaceC10169 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5935 f38900;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f38901;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f38902;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f38903;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11813 f38904;

    @Override // l.AbstractC11580
    /* renamed from: ۧ */
    public final int mo6259() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12990(C5935 c5935, Main main, AbstractC16891 abstractC16891) {
        super(main);
        this.f38900 = c5935;
        C12244 mo6017 = abstractC16891.mo6017();
        this.f38903 = mo6017.m29744();
        this.f38901 = mo6017.m29743();
        this.f38904 = mo6017.m29742().f64248;
        this.f38902 = abstractC16891.m39746();
    }

    @Override // l.InterfaceC10169
    /* renamed from: ֫ */
    public final int mo25527() {
        return this.f38902;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5935 c5935 = this.f38900;
        if (c5935.f37526.m10155() || AbstractViewOnClickListenerC1201.f4338.m22793()) {
            return;
        }
        Main main = this.f34527;
        main.m127();
        C9340 m132 = main.m132();
        if (m132 == null || m132.m24085(this.f38902)) {
            return;
        }
        c5935.m16667();
    }
}
