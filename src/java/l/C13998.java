package l;

/* compiled from: H8DC */
/* renamed from: l.ܰᩴۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13998 extends AbstractC23898 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8355 f41725;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f41726;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15409 f41727;

    @Override // l.AbstractC23898
    /* renamed from: ۧ */
    public final void mo6591() {
        double[] m38021 = this.f41726.m38021();
        double[] m380212 = this.f41725.m38021();
        C15409 c15409 = this.f41727;
        double[] m38020 = c15409.m38020(0);
        double[] m380202 = c15409.m38020(1);
        for (int i = 0; i < 8; i++) {
            double d = (m380212[i] * 0.5d) + 0.5d;
            double d2 = m38021[i];
            m38020[i] = (1.0d - d) * d2;
            m380202[i] = d2 * d;
        }
    }
}
