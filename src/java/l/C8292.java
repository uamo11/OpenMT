package l;

/* compiled from: HAFC */
/* renamed from: l.۠ܽۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8292 implements InterfaceC2648 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15346 f25475;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16594 f25476;

    public C8292(C15346 c15346, C16594 c16594) {
        this.f25475 = c15346;
        this.f25476 = c16594;
    }

    @Override // l.InterfaceC2648
    /* renamed from: ֫ */
    public final Object mo8320(C16594 c16594) {
        InterfaceC2148 interfaceC2148;
        C16594 c165942 = this.f25476;
        boolean m39093 = c16594.m39093(c165942);
        C15346 c15346 = this.f25475;
        if (!m39093) {
            interfaceC2148 = C15346.f47017;
            interfaceC2148.mo7087(c16594.m39092(), "Re-routing the connection to host {}");
            c15346 = c15346.m36378(c16594);
        }
        if (c16594.m39095(c165942)) {
            return null;
        }
        return c15346.m36376(c16594.m39096());
    }
}
