package l;

/* compiled from: X43L */
/* renamed from: l.ܽܶ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16713 extends AbstractC4203 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f51331;

    @Override // l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo9465(C12193 c12193, Object obj) {
        return c12193;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        AbstractC19810 abstractC19810 = c19955.f13890;
        if (abstractC19810 == abstractC5698) {
            return c19955;
        }
        AbstractC4308 abstractC4308 = abstractC5698.f17560;
        C6319 c6319 = this.f51331;
        AbstractC4308 m17527 = c6319.m17527(abstractC19810, abstractC4308);
        if (m17527 != null) {
            C18837 c18837 = new C18837();
            C18837 c188372 = new C18837();
            try {
                c6319.m17500(m17527, c19955, c18837, c188372);
                AbstractC4308 m17488 = c6319.m17488(abstractC5698.f17560, c18837.m43517(), c188372.m43517());
                if (c6319.m17546(m17488, (AbstractC4308) c19955, true)) {
                    C18837 c188373 = new C18837();
                    for (C2609 mo12934 = abstractC5698.f17560.mo12934(); mo12934.m8249(); mo12934 = mo12934.f8241) {
                        if (m17488.mo12912((AbstractC4308) mo12934.f8240) && !c19955.mo12912((AbstractC4308) mo12934.f8240)) {
                            c188373.m43511((AbstractC4308) mo12934.f8240);
                        }
                    }
                    if (!c188373.m43518()) {
                        return m17488;
                    }
                    if (c19955.mo12920()) {
                        return c6319.m17519(m17488);
                    }
                    C2609 m43517 = c188373.m43517();
                    C18837 c188374 = new C18837();
                    for (C2609 c2609 = m43517; c2609.m8249(); c2609 = c2609.f8241) {
                        C20661 c20661 = c6319.f19609;
                        c188374.m43511(new C19831(c20661.f66526, EnumC15678.UNBOUND, c20661.f66480, (C8541) c2609.f8240));
                    }
                    return c6319.m17488(m17488, m43517, c188374.m43517());
                }
            } catch (C8953 unused) {
                return null;
            }
        }
        return null;
    }

    public C16713(C6319 c6319) {
        this.f51331 = c6319;
    }
}
