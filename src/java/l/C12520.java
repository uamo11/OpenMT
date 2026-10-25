package l;

/* compiled from: K234 */
/* renamed from: l.۫ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12520 implements InterfaceC4595 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0525 f37621;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11815 f37622;

    public C12520(C11815 c11815, AbstractC0525 abstractC0525) {
        C11233.m27805(abstractC0525, "onBackPressedCallback");
        this.f37622 = c11815;
        this.f37621 = abstractC0525;
    }

    @Override // l.InterfaceC4595
    public final void cancel() {
        C11586 c11586;
        AbstractC0525 abstractC0525;
        C11815 c11815 = this.f37622;
        c11586 = c11815.f35246;
        AbstractC0525 abstractC05252 = this.f37621;
        c11586.remove(abstractC05252);
        abstractC0525 = c11815.f35245;
        if (C11233.m27802(abstractC0525, abstractC05252)) {
            abstractC05252.getClass();
            c11815.f35245 = null;
        }
        abstractC05252.m2241(this);
        InterfaceC2123 m2237 = abstractC05252.m2237();
        if (m2237 != null) {
            m2237.mo4049();
        }
        abstractC05252.m2238((InterfaceC2123) null);
    }
}
