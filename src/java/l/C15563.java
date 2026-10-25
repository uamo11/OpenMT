package l;

/* compiled from: 13OM */
/* renamed from: l.ܶ᩻ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15563 extends AbstractC15772 implements Comparable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23801 f47971;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22620 f47972 = null;

    @Override // l.AbstractC2368
    /* renamed from: ۧ */
    public final int mo3385() {
        return 4;
    }

    public C15563(C23801 c23801) {
        this.f47971 = c23801;
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_CALL_SITE_ID_ITEM;
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C14628 m52478 = this.f47971.m52478();
        C21915 m5624 = c1662.m5624();
        C22620 m49324 = m5624.m49324(m52478);
        if (m49324 == null) {
            C4484 m5614 = c1662.m5614();
            m49324 = new C22620(m52478);
            m5614.m13220((AbstractC3073) m49324);
            m5624.m49325(m52478, m49324);
        }
        this.f47972 = m49324;
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        int m9390 = this.f47972.m9390();
        if (c18241.m42506()) {
            c18241.m42501(0, m37189() + ' ' + this.f47971.toString());
            c18241.m42501(4, "call_site_off: ".concat(C14712.m35008(m9390)));
        }
        c18241.m42514(m9390);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f47971.compareTo(((C15563) obj).f47971);
    }
}
