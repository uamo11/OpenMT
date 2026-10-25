package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: C420 */
/* renamed from: l.ܳ᩸۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C14791 extends AbstractC12669 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2798 f45161;

    @Override // l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        c5138.f16077.mo2962(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        C2609 m8239;
        C8541 c85412 = (C8541) c8541.m12916();
        EnumC16202 enumC16202 = EnumC16202.TYPEVAR;
        C2798 c2798 = this.f45161;
        int m8638 = C2798.m8638(c2798, c85412, enumC16202);
        EnumMap enumMap = c2798.f8735;
        C5931 c5931 = c2798.f8732;
        if (m8638 == -1) {
            AbstractC4308 mo12939 = c85412.mo12939();
            while (mo12939 instanceof C12193) {
                mo12939 = ((C12193) mo12939).mo12947();
            }
            if (mo12939 == null || (!mo12939.m12913(EnumC9454.CLASS) && !mo12939.m12913(EnumC9454.TYPEVAR))) {
                m8239 = C2609.m8239();
            } else {
                m8239 = mo12939.mo5146() ? c2798.f8730.m17565(mo12939) : C2609.of((Object) mo12939);
            }
            c2798.f8734.m18998(c85412.f13890);
            Object obj2 = m8239.f8240;
            boolean z = obj2 == null || ((AbstractC4308) obj2).m12913(EnumC9454.NONE) || ((AbstractC4308) m8239.f8240).m12913(EnumC9454.ERROR);
            if ((c85412.f13890.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                ((Map) enumMap.get(EnumC16202.TYPEVAR)).put(c85412, c5931.m16622("where.typevar".concat(z ? ".1" : ""), c85412, m8239, C21758.m49076(c85412.f13890.m16072()), c85412.f13890.m16072()));
                AbstractC1191 abstractC1191 = c2798.f8733;
                AbstractC5698 m16072 = c85412.f13890.m16072();
                abstractC1191.getClass();
                m16072.mo2899(abstractC1191, (Locale) null);
                m35173(m8239);
                return null;
            }
            C12171.m29642(!z);
            C11576 c11576 = C11886.f35440;
            ((Map) enumMap.get(EnumC16202.TYPEVAR)).put(c85412, c5931.m16617(new C11576("compiler", "where.fresh.typevar", c85412, m8239)));
            m35173(m8239);
        }
        return null;
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2744(C10077 c10077, Object obj) {
        m35173(c10077.f30362);
        c10077.f14167.mo2962(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo7394(C10658 c10658, Object obj) {
        m35173(c10658.f32059);
        c10658.f32060.mo2962(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo9465(C12193 c12193, Object obj) {
        AbstractC4308 mo12947 = c12193.mo12947();
        if (mo12947 != null) {
            mo12947.mo2962(this, (Object) null);
        }
        return null;
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2143(C15014 c15014, Object obj) {
        EnumC16202 enumC16202 = EnumC16202.CAPTURED;
        C2798 c2798 = this.f45161;
        if (C2798.m8638(c2798, c15014, enumC16202) == -1) {
            AbstractC4308 abstractC4308 = c15014.f26106;
            C19831 c19831 = c15014.f45790;
            ((Map) c2798.f8735.get(enumC16202)).put(c15014, c2798.f8732.m16622("where.captured".concat(abstractC4308 == c2798.f8731.f66522 ? ".1" : ""), c15014, c15014.mo12939(), c15014.f26106, c19831));
            c19831.mo2962(this, (Object) null);
            c15014.f26106.mo2962(this, (Object) null);
            c15014.mo12939().mo2962(this, (Object) null);
        }
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        c19831.f64066.mo2962(this, (Object) null);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        C19955 c199552;
        AbstractC4308 abstractC4308;
        boolean mo5146 = c19955.mo5146();
        C2798 c2798 = this.f45161;
        if (mo5146) {
            EnumC16202 enumC16202 = EnumC16202.INTERSECTION;
            int m8638 = C2798.m8638(c2798, c19955, enumC16202);
            C6319 c6319 = c2798.f8730;
            if (m8638 == -1) {
                AbstractC4308 m17562 = c6319.m17562(c19955);
                C2609 m17510 = c6319.m17510(c19955);
                C5931 c5931 = c2798.f8732;
                m17510.getClass();
                C2609 c2609 = new C2609(m17562, m17510);
                C11576 c11576 = C11886.f35440;
                ((Map) c2798.f8735.get(enumC16202)).put(c19955, c5931.m16617(new C11576("compiler", "where.intersection", c19955, c2609)));
                m17562.mo2962(this, (Object) null);
                m35173(m17510);
            }
        } else if (c19955.f13890.f17562.isEmpty() && (c199552 = (C19955) c19955.f13890.f17560) != null) {
            C2609 c26092 = c199552.f64620;
            if (c26092 != null && c26092.m8249()) {
                abstractC4308 = (AbstractC4308) c199552.f64620.f8240;
            } else {
                abstractC4308 = c199552.f64618;
            }
            abstractC4308.mo2962(this, (Object) null);
        }
        c2798.f8734.m18998(c19955.f13890);
        m35173(c19955.mo12938());
        try {
            if (c19955.mo4958() != AbstractC4308.f13885) {
                c19955.mo4958().mo2962(this, (Object) null);
            }
        } catch (C20515 unused) {
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35173(C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            ((AbstractC4308) it.next()).mo2962(this, (Object) null);
        }
    }

    public C14791(C2798 c2798) {
        this.f45161 = c2798;
    }
}
