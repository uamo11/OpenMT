package l;

/* compiled from: T7LF */
/* renamed from: l.ܶܰ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15260 implements InterfaceC6403 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3267 f46833;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1323 f46834;

    @Override // l.InterfaceC6403
    /* renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    public C15260(C3267 c3267, C1323 c1323) {
        this.f46833 = c3267;
        this.f46834 = c1323;
    }

    @Override // l.InterfaceC6403
    /* renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        C22364 c22364;
        C18230 c18230;
        C22364 c223642;
        C18230 c182302;
        C0052 c0052 = (C0052) abstractC5698;
        c0052.f17563 |= 268435456;
        C3267 c3267 = this.f46833;
        C20201 c20201 = new C20201(c3267);
        c22364 = c3267.f10283;
        C1323 c1323 = this.f46834;
        InterfaceC18278 m7284 = c22364.m7284(c1323.f4745);
        C3587 m4616 = c1323.m4616();
        c18230 = c3267.f10275;
        m4616.getClass();
        InterfaceC3109 m42471 = c18230.m42471((InterfaceC3109) m4616);
        try {
            c20201.mo1375(m4616);
            c3267.m10048(c0052);
            C3267.m10031(c3267, m4616);
        } finally {
            c223642 = c3267.f10283;
            c223642.m7284(m7284);
            c182302 = c3267.f10275;
            c182302.m42471(m42471);
            c0052.f17563 &= -268435457;
        }
    }

    public final String toString() {
        return "SourceCompleter: " + this.f46834.f4745.getName();
    }
}
