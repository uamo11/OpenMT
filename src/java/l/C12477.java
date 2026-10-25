package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* compiled from: MAIE */
/* renamed from: l.۫ܳ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12477 extends AbstractC1661 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f37494;

    public C12477(String str) {
        super(R.string.MT_Protector_res_0x7f120614, R.drawable.MT_Protector_res_0x7f080250);
        this.f37494 = str;
        m5604();
    }

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916(this.f37494) && c2450.m7919().m39035(b.k);
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907(this.f37494);
        m7919.m38998(b.k);
        m5602(c2450, R.string.MT_Protector_res_0x7f120614, AbstractC1661.m5600(c2450, R.string.MT_Protector_res_0x7f120614));
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907(this.f37494);
        m7919.m38998(b.k);
        AbstractC13921 mo6020 = c2450.m7922().mo6020();
        AbstractC3163 abstractC3163 = (AbstractC3163) c2450.m7919().m39044().mo6020();
        String trim = abstractC3163.f9955.mo6371().trim();
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C13182.class);
        c0994.m3483(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3476("ARG_STATELESS_VISITOR", mo6020.m33350());
        c0994.m3476("ARG_STATELESS_VISITOR2", abstractC3163.m33350());
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", m7919.m38990());
        c0994.m3474("targetPath", m7919.m39058());
        c0994.m3474("descPath", trim);
        c0994.m3469();
    }
}
