package l;

/* compiled from: N44J */
/* renamed from: l.ܶ᩷۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15475 extends AbstractC3482 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13359 f47350;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1740 f47351;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1755 f47352;

    @Override // l.AbstractC3482
    /* renamed from: ۧ */
    public final void mo10662() {
        C1365 c1365;
        mo10663();
        Object obj = this.f47352.f6073;
        C12171.m29642(((C4893) obj).f15452.m43514() % 2 == 0);
        C18837 c18837 = ((C4893) obj).f15452;
        c1365 = this.f47350.f39962;
        c18837.m43511(Integer.valueOf(c1365.m4816()));
    }

    @Override // l.AbstractC3482
    /* renamed from: ܽ */
    public final void mo10663() {
        C1365 c1365;
        C1365 c13652;
        C1365 c13653;
        C13359 c13359 = this.f47350;
        c1365 = c13359.f39962;
        if (c1365.m4831()) {
            C1740 c1740 = this.f47351;
            c1740.mo5817();
            c13652 = c13359.f39962;
            c13652.m4824(195);
            c13653 = c13359.f39962;
            C5599 c5599 = c13653.f4970;
            int i = c1740.f6015;
            int i2 = c5599.f17316 - 1;
            c5599.f17316 = i2;
            C12171.m29642(c5599.f17318[i2] == i);
            c5599.f17318[c5599.f17316] = -1;
        }
    }

    public C15475(C13359 c13359, C1755 c1755, C1740 c1740) {
        this.f47350 = c13359;
        this.f47352 = c1755;
        this.f47351 = c1740;
    }
}
