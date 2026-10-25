package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: B7KX */
/* renamed from: l.ۚᩳ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5515 extends AbstractC13980 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f17073;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC12612 mo15647(AbstractC12612 abstractC12612) {
        return abstractC12612;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5515(C11139 c11139, EnumC12075 enumC12075, AbstractC13980 abstractC13980) {
        super(c11139, enumC12075, abstractC13980);
        this.f17073 = c11139;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1755 m15646(C1755 c1755, C5557 c5557) {
        AbstractC14016 m33607 = AbstractC14016.m33607(c5557.f17186);
        for (AbstractC5698 abstractC5698 : ((C8604) c1755.f6076.f6073).f26285.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            if (abstractC5698.m16077()) {
                m33607.mo26382(abstractC5698);
            }
        }
        C2609 c2609 = c5557.f17185;
        if (c2609 != null) {
            while (c2609.m8249()) {
                m33607.mo26382(((C14315) c2609.f8240).f16086.f13890);
                c2609 = c2609.f8241;
            }
        }
        C1755 c17552 = c1755.f6076;
        C1755 m5877 = c17552.m5877(c5557, ((C8604) c17552.f6073).m22358(m33607));
        m5877.f6078 = true;
        m5877.f6076 = c17552;
        ((C8604) m5877.f6073).f26299 = false;
        return m5877;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15648(C1755 c1755, C1755 c17552) {
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC43082;
        AbstractC12612 abstractC12612;
        C5557 c5557 = c1755.f6079;
        C14163 c14163 = c5557.f17186;
        C19955 c19955 = (C19955) c14163.f17560;
        AbstractC12612 abstractC126122 = c5557.f17184;
        C18837 c18837 = null;
        C11139 c11139 = this.f17073;
        if (abstractC126122 != null) {
            AbstractC12612 mo15647 = mo15647(abstractC126122);
            abstractC43082 = c11139.f33427.m23936(mo15647, c17552, true, false, true);
            if (abstractC43082 == c11139.f33440.f66489) {
                C22364 c22364 = c11139.f33430;
                AbstractC19810 abstractC19810 = abstractC43082.f13890;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c5557, new C12281("compiler", "invalid.supertype.record", abstractC19810));
            }
            abstractC12612 = mo15647;
        } else {
            if ((c5557.f17181.f7169 & 16384) != 0) {
                C9310 c9310 = c11139.f33427;
                int i = c5557.f16085;
                C17013 c17013 = c11139.f33425;
                c17013.f52172 = i;
                abstractC4308 = c9310.m23936((AbstractC12612) c17013.m39960(c11139.f33425.m39954(c11139.f33440.f66527), C2609.of((Object) c11139.f33425.m39965(c14163.f17560))), c17552, true, false, false);
            } else if (c14163.f42767 == c11139.f33438.f18887) {
                abstractC4308 = AbstractC4308.f13885;
            } else {
                abstractC4308 = c14163.m33810() ? c11139.f33440.f66489 : c11139.f33440.f66526;
            }
            abstractC43082 = abstractC4308;
            abstractC12612 = null;
        }
        if (abstractC43082.m12913(EnumC9454.ERROR)) {
            abstractC43082 = new C4104(this, abstractC43082.mo12947(), abstractC43082.f13890, c17552, false, abstractC12612);
        }
        c19955.f64618 = abstractC43082;
        C18837 c188372 = new C18837();
        Iterator it = c5557.f17183.iterator();
        while (it.hasNext()) {
            AbstractC12612 mo156472 = mo15647((AbstractC12612) it.next());
            AbstractC4308 m23936 = c11139.f33427.m23936(mo156472, c17552, false, true, true);
            if (!m23936.m12913(EnumC9454.CLASS)) {
                if (c18837 == null) {
                    c18837 = new C18837();
                    c18837.m43513(c188372);
                }
                if (m23936.m12913(EnumC9454.ERROR)) {
                    m23936 = new C4104(this, m23936.mo12947(), m23936.f13890, c17552, true, mo156472);
                }
                c18837.m43511(m23936);
            } else {
                c188372.m43511(m23936);
                if (c18837 != null) {
                    c18837.m43511(m23936);
                }
            }
        }
        C18837 c188373 = new C18837();
        Iterator it2 = c5557.f17182.iterator();
        while (it2.hasNext()) {
            c188373.m43511(c11139.f33427.m23936((AbstractC12612) it2.next(), c17552, false, false, false).f13890);
        }
        if ((c14163.f17563 & 8192) != 0) {
            C2609 of = C2609.of((Object) c11139.f33440.f66485);
            c19955.f64620 = of;
            c19955.f64619 = of;
        } else {
            C2609 m43517 = c188372.m43517();
            c19955.f64620 = m43517;
            if (c18837 != null) {
                m43517 = c18837.m43517();
            }
            c19955.f64619 = m43517;
        }
        if (!c188373.isEmpty()) {
            c14163.f42765 = c188373.m43517();
        }
        c14163.f42764 = true ^ c188373.isEmpty();
    }
}
