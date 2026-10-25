package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: Z3WS */
/* renamed from: l.ܶۗ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14969 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f45626;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19910 f45627;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7674 f45628;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f45629;

    public C14969(C19910 c19910, AbstractActivityC3346 abstractActivityC3346, C7674 c7674, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f45627 = c19910;
        this.f45629 = abstractActivityC3346;
        this.f45628 = c7674;
        this.f45626 = dialogInterfaceC0206;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f45629, R.string.MT_Protector_res_0x7f12087c);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        long m20531 = this.f45628.m20531();
        C18237 m42480 = C18237.m42480(4181);
        m42480.m42484(m20531);
        C23881 m42495 = m42480.m42495();
        if (!m42495.m52607()) {
            throw new C1637(C1575.m5392(m42495, R.string.MT_Protector_res_0x7f120520));
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        this.f45626.dismiss();
        this.f45627.mo6161(this.f45629);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f45629.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
