package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.Iterator;

/* compiled from: OAIH */
/* renamed from: l.ۤܿ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10445 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        return c2450.m7916(b.k) && m7919.m39035("local") && !m7919.m39038();
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907(b.k);
        m7919.m38998("local");
        m5602(c2450, R.string.MT_Protector_res_0x7f1205d0, AbstractC1661.m5600(c2450, R.string.MT_Protector_res_0x7f1205d0));
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907(b.k);
        m7919.m38998("local");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C15382.class);
        c0994.m3483(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3481(c2450.m7922());
        c0994.m3474("ARG_MSG_FROM", c2450.m7912());
        c0994.m3474("ARG_MSG_TO", m7919.m38990());
        c0994.m3474("targetPath", m7919.m39058());
        c0994.m3475("moveMode", false);
        c0994.m3469();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26286(AbstractC3163 abstractC3163, C0433 c0433) {
        Iterator it = c0433.m1988().iterator();
        while (it.hasNext()) {
            AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
            if (abstractC1139.m3888() && !m26286(abstractC3163, abstractC1139.mo1983())) {
                return false;
            }
        }
        try {
            String m3910 = c0433.m3910();
            abstractC3163.mo9692(m3910);
            if (abstractC3163.mo7637(m3910, true).isEmpty()) {
                return abstractC3163.m9697(m3910, true);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
