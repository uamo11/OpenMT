package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: 08W3 */
/* renamed from: l.۬ۜۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12946 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38840;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10220 f38841;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12241 f38842;

    public C12946(C12241 c12241, int i) {
        this.f38842 = c12241;
        this.f38840 = i;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f38842.f36493);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C21374.m48459((CharSequence) this.f38841.f30698);
        if (((Boolean) this.f38841.f30697).booleanValue()) {
            C12241 c12241 = this.f38842;
            ActivityC11536 activityC11536 = c12241.f36493;
            C4583 c4583 = ActivityC11536.f34441;
            new C10125(activityC11536, true).m20274();
            c12241.m31262();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f38842.f36493.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C18237 m42480 = C18237.m42480(4210);
        m42480.m42494(this.f38840);
        C23881 m42496 = C23196.m51460() ? m42480.m42496() : m42480.m42497();
        if (m42496.m52607()) {
            this.f38841 = new C10220(Boolean.valueOf(m42496.m52615()), m42496.m52602());
            return;
        }
        throw new C19401(C1575.m5392(m42496, R.string.MT_Protector_res_0x7f120520));
    }
}
