package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 31PG */
/* renamed from: l.ۨۡۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11599 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13714 f34581;

    public C11599(ViewOnClickListenerC13714 viewOnClickListenerC13714) {
        this.f34581 = viewOnClickListenerC13714;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f34581.f40922, R.string.MT_Protector_res_0x7f120b33);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C16742 c16742 = this.f34581.f40919;
        C1926.m6339();
        C18237 m42480 = C18237.m42480(4168);
        m42480.m42490(c16742.f51388);
        C23881 m42496 = m42480.m42496();
        if (!m42496.m52607()) {
            throw new C1637(C1575.m5392(m42496, R.string.MT_Protector_res_0x7f120520));
        }
        c16742.f51392 = 0;
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f34581;
        ActivityC7365 activityC7365 = viewOnClickListenerC13714.f40922;
        new RunnableC19361(activityC7365);
        ActivityC7365.m19799(activityC7365, viewOnClickListenerC13714.f40919, viewOnClickListenerC13714.f40920);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f34581.f40922.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
