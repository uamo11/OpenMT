package l;

import java.util.HashSet;

/* compiled from: X43L */
/* renamed from: l.۠۠֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8042 extends AbstractC4203 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f24798 = new HashSet();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f24799;

    @Override // l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        if (this.f24799.m17546((AbstractC4308) c5138, abstractC5698.f17560, true)) {
            return abstractC5698.f17560;
        }
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        return c8541.f13890 == abstractC5698 ? c8541 : this.f24799.m17527(abstractC5698, c8541.mo12939());
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo9465(C12193 c12193, Object obj) {
        return c12193;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        AbstractC4308 m17527;
        AbstractC4308 m175272;
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        C6319 c6319 = this.f24799;
        AbstractC19810 abstractC19810 = c19955.f13890;
        if (abstractC19810 == abstractC5698) {
            return c19955;
        }
        HashSet hashSet = this.f24798;
        if (!hashSet.add(abstractC19810)) {
            return null;
        }
        try {
            AbstractC4308 m17562 = c6319.m17562(c19955);
            if ((m17562.m12913(EnumC9454.CLASS) || m17562.m12913(EnumC9454.TYPEVAR)) && (m17527 = c6319.m17527(abstractC5698, m17562)) != null) {
                return m17527;
            }
            if ((abstractC5698.mo16084() & 512) != 0) {
                for (C2609 m17510 = c6319.m17510(c19955); m17510.m8249(); m17510 = m17510.f8241) {
                    if (!((AbstractC4308) m17510.f8240).m12913(EnumC9454.ERROR) && (m175272 = c6319.m17527(abstractC5698, (AbstractC4308) m17510.f8240)) != null) {
                        return m175272;
                    }
                }
            }
            return null;
        } finally {
            hashSet.remove(abstractC19810);
        }
    }

    public C8042(C6319 c6319) {
        this.f24799 = c6319;
    }
}
