package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;

/* compiled from: NA5M */
/* renamed from: l.᩵ۚ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19268 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f60643;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5156 f60644;

    public C19268(AbstractActivityC3346 abstractActivityC3346, C5156 c5156) {
        this.f60643 = abstractActivityC3346;
        this.f60644 = c5156;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f60643, R.string.MT_Protector_res_0x7f1201e9);
        C13136 c13136 = this.f23322;
        C11003.requireNonNull(c13136);
        c13136.m31860(new RunnableC22934(3, c13136));
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C5156 c5156 = this.f60644;
        C17209 m14739 = c5156.m14739();
        if (!c5156.f16121.isEmpty()) {
            C17915 m40470 = m14739.m40470();
            m40470.m41903(new C21384(c5156.f16121));
            m14739 = m40470.m41894();
        }
        C10577 c10577 = new C10577(m14739, c5156.f16123);
        if (!TextUtils.isEmpty(c5156.f16122)) {
            c10577.m26586(c5156.f16122, c5156.f16119, false);
        }
        c10577.m26591(c5156.f16123 + "/");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f1206d4);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f23322.m31868()) {
            return;
        }
        this.f60643.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        if (this.f23322.m31868()) {
            return;
        }
        m20273();
    }
}
