package l;

/* compiled from: W79N */
/* renamed from: l.ۤ᩷᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10550 implements InterfaceC5900 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6691 f31678;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7727 f31679;

    @Override // l.InterfaceC5900
    /* renamed from: ۧ */
    public final void mo16541(AbstractC12955 abstractC12955) {
    }

    public C10550(C6691 c6691, C7727 c7727) {
        this.f31678 = c6691;
        this.f31679 = c7727;
    }

    @Override // l.InterfaceC5900
    /* renamed from: ֫ */
    public final void mo16540(AbstractC12955 abstractC12955) {
        String str;
        String str2;
        C6691 c6691 = this.f31678;
        str = c6691.f20796;
        String mo31524 = abstractC12955.mo31524();
        AbstractC10134 mo31523 = abstractC12955.mo31523();
        String m1762 = C0340.m1762(str, mo31524, mo31523 == null ? null : mo31523.mo25455(), abstractC12955.getName());
        str2 = c6691.f20796;
        String m17622 = C0340.m1762(str2, abstractC12955.mo31524(), (String) null, abstractC12955.getName());
        if (C0340.m1779(c6691, abstractC12955.mo31524(), m1762, m17622)) {
            this.f31679.m20702(m1762, m17622);
        }
    }

    @Override // l.InterfaceC5900
    /* renamed from: ܽ */
    public final void mo16542(AbstractC12955 abstractC12955) {
        C11961 m1766;
        String str;
        String str2;
        String str3;
        C10925 c10925;
        C10925 m1764 = C0340.m1764(abstractC12955.mo31523());
        if (m1764 == null || (m1766 = C0340.m1766(this.f31678, abstractC12955, m1764)) == null) {
            return;
        }
        str = m1766.f35826;
        str2 = m1766.f35824;
        str3 = m1766.f35827;
        c10925 = m1766.f35825;
        this.f31679.m20703(str, str2, str3, c10925);
    }
}
