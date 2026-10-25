package l;

/* compiled from: 643O */
/* renamed from: l.ܺ֡֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15574 extends C3581 implements InterfaceC8090 {

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f47987;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f47988;

    @Override // l.C3581, l.AbstractC5698, l.InterfaceC21496
    /* renamed from: ۘ */
    public final int mo953() {
        return 15;
    }

    @Override // l.C3581
    /* renamed from: ᩹֫ */
    public final C15574 mo10967() {
        return this;
    }

    public C15574(AbstractC5698 abstractC5698, boolean z) {
        super(abstractC5698.f17563, abstractC5698.f17562, abstractC5698.f17560, abstractC5698.f17561);
        this.f47988 = abstractC5698;
        this.f47987 = z;
    }

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final int m36708() {
        AbstractC5698 abstractC5698 = this.f47988;
        if (abstractC5698.f17559 == EnumC1296.f4567) {
            return this.f47987 ? abstractC5698.mo15572() ? 2 : 1 : abstractC5698.mo15572() ? 4 : 3;
        }
        if (abstractC5698.m16075()) {
            return 8;
        }
        if (abstractC5698.mo15572()) {
            return 6;
        }
        if ((abstractC5698.mo16084() & 2) != 0) {
            AbstractC5698 abstractC56982 = this;
            while (abstractC56982 != null && !(abstractC56982 instanceof C21926)) {
                abstractC56982 = abstractC56982.f17561;
            }
            if (abstractC56982 == null || !((C21926) abstractC56982).f70206) {
                return 7;
            }
        }
        return abstractC5698.m16071().m16070() ? 9 : 5;
    }

    @Override // l.AbstractC5698, l.InterfaceC21496
    /* renamed from: ֫ */
    public final Object mo3574(C6319 c6319) {
        return new C23069(this.f47988, Integer.valueOf(m36708()));
    }

    @Override // l.AbstractC5698
    /* renamed from: ᩹ */
    public final AbstractC5698 mo7048() {
        return this.f47988;
    }
}
