package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: I1KV */
/* renamed from: l.ܰܳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13877 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f41384;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f41385;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f41386;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f41387;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f41388;

    public C13877(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractActivityC3346 abstractActivityC3346, String str) {
        this.f41388 = viewOnClickListenerC7528;
        this.f41387 = abstractActivityC3346;
        this.f41385 = str;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f41387, R.string.MT_Protector_res_0x7f120528);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        String m36489 = C16999.m39866(this.f41385, new String[0]).m36489();
        this.f41386 = m36489;
        String m7978 = AbstractC2489.m7978(m36489);
        if (m7978 == null) {
            throw new C1637(this.f41388.getString(R.string.MT_Protector_res_0x7f1209ae));
        }
        this.f41384 = C15472.m36561(1, 1, m7978);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        String m34214 = C14336.m34214(this.f41384);
        String m34210 = C14336.m34210(this.f41384);
        if (m34214.length() > 130 || C11661.m28545(m34214)) {
            m34214 = "# TOO_LONG_NAME/";
        }
        if (m34210.length() > 100) {
            m34210 = m34210.substring(0, 50) + "_too_long_" + Long.toHexString(m34210.hashCode() & 4294967295L);
        }
        this.f41388.m20190(R.string.MT_Protector_res_0x7f1205e1, m34214, m34210, true, new InterfaceC19763() { // from class: l.᩺ܳۢ
            @Override // l.InterfaceC19763
            /* renamed from: ֫ */
            public final Object mo6973(Object obj, Object obj2) {
                return C13877.this.f41386;
            }
        });
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f41387.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
