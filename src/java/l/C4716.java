package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;

/* compiled from: O8BF */
/* renamed from: l.ۙܳ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4716 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        if (c2450.m7916(b.k) && m7919.m39035(b.k) && !m7919.m39038()) {
            return (((AbstractC3163) c2450.m7922().mo6020()).f9955.f11356 == ((AbstractC3163) m7919.m39063()).f9955.f11356 && c2450.m7926().equals(c2450.m7919().m39058())) ? false : true;
        }
        return false;
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907(b.k);
        m7919.m38998(b.k);
        m5602(c2450, R.string.MT_Protector_res_0x7f120613, AbstractC1661.m5600(c2450, R.string.MT_Protector_res_0x7f120613));
        DialogInterfaceOnClickListenerC10816.m27036(R.string.MT_Protector_res_0x7f1206bb, c2450.m7917(), "network_transfer_warn");
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907(b.k);
        m7919.m38998(b.k);
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C20239.class);
        c0994.m3483(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3481(c2450.m7922());
        c0994.m3476("ARG_STATELESS_VISITOR2", c2450.m7919().m39063().m33350());
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", m7919.m38990());
        c0994.m3474("targetPath", m7919.m39058());
        c0994.m3475("streamMode", true);
        c0994.m3469();
    }
}
