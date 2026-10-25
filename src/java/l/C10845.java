package l;

/* compiled from: 57L9 */
/* renamed from: l.ۧ۟֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10845 extends AbstractC14371 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10139 f32594;

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return m27109((AbstractC4308) obj, (AbstractC4308) obj2) != EnumC20723.INVALID;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10845(C10139 c10139, EnumC18550 enumC18550) {
        super(c10139, enumC18550);
        this.f32594 = c10139;
    }

    @Override // l.AbstractC14371
    /* renamed from: ֫ */
    public final C0758 mo5675(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C20661 c20661;
        AbstractC4308 abstractC43083;
        EnumC20723 m27109 = m27109(abstractC4308, abstractC43082);
        EnumC20723 enumC20723 = EnumC20723.NUMERIC_OR_BOOLEAN;
        C10139 c10139 = this.f32594;
        if (m27109 == enumC20723) {
            abstractC43083 = c10139.m25481(abstractC4308, abstractC43082);
        } else {
            c20661 = c10139.f30514;
            abstractC43083 = c20661.f66526;
        }
        return m37193(new C17194(this, abstractC43083, abstractC43083));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private EnumC20723 m27109(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        boolean mo12941 = abstractC4308.mo12941();
        boolean mo129412 = abstractC43082.mo12941();
        if (mo12941 && mo129412) {
            return EnumC20723.NUMERIC_OR_BOOLEAN;
        }
        C10139 c10139 = this.f32594;
        return mo12941 ? c10139.m25480(abstractC43082).mo12941() ? EnumC20723.NUMERIC_OR_BOOLEAN : EnumC20723.INVALID : mo129412 ? c10139.m25480(abstractC4308).mo12941() ? EnumC20723.NUMERIC_OR_BOOLEAN : EnumC20723.INVALID : (abstractC4308.mo12936() && abstractC43082.mo12936()) ? EnumC20723.REFERENCE : EnumC20723.INVALID;
    }
}
