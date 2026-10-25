package l;

/* compiled from: A451 */
/* renamed from: l.ۜܽ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6884 implements InterfaceC8131 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2609 f21272;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f21273;

    public C6884(C22406 c22406, C2609 c2609) {
        this.f21273 = c22406;
        this.f21272 = c2609;
    }

    @Override // l.InterfaceC8131
    /* renamed from: ֫ */
    public final void mo11113(C1755 c1755, C6755 c6755, C2609 c2609, C2609 c26092, C1386 c1386) {
        AbstractC5698 abstractC5698 = c6755.f20972;
        int m8245 = c2609.m8245();
        boolean m39436 = c6755.f20969.m39436();
        C22406 c22406 = this.f21273;
        C2609 m50299 = c22406.m50299(c26092, abstractC5698, m8245, m39436);
        while (m50299.m8249()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) m50299.f8240;
            AbstractC4308 abstractC43082 = (AbstractC4308) this.f21272.f8240;
            C9310 c9310 = c22406.f72613;
            C11003.requireNonNull(c9310);
            C15406 c15406 = C15406.f47184;
            C23817 c23817 = new C23817(this, c6755, c1386, abstractC43082);
            EnumC22756 enumC22756 = EnumC22756.f73483;
            c9310.f28214.m36106((InterfaceC3109) null, (AbstractC4308) c2609.f8240, abstractC4308, c23817);
            c2609 = c2609.f8241;
            m50299 = m50299.f8241;
            this.f21272 = this.f21272.isEmpty() ? this.f21272 : this.f21272.f8241;
        }
    }

    @Override // l.InterfaceC8131
    /* renamed from: ֫ */
    public final InterfaceC8131 mo11112(C2609 c2609) {
        C12171.m29640("Cannot get here!");
        throw null;
    }
}
