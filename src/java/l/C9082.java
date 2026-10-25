package l;

/* compiled from: U8D0 */
/* renamed from: l.ۡ᩵ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9082 extends AbstractC23898 implements InterfaceC6965 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5554 f27520 = new C5554();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f27521;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C15409 f27522;

    public C9082() {
        C8355 c8355 = new C8355(1, "Amplitude", 1.0d);
        this.f27521 = c8355;
        m52649(c8355);
        C15409 c15409 = new C15409(0);
        this.f27522 = c15409;
        m52649(c15409);
    }

    @Override // l.AbstractC23898
    /* renamed from: ۧ */
    public final void mo6591() {
        double[] m38021 = this.f27521.m38021();
        double[] m380212 = this.f27522.m38021();
        for (int i = 0; i < 8; i++) {
            m380212[i] = this.f27520.m15709() * m38021[i];
        }
    }
}
