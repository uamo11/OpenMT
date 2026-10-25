package l;

/* compiled from: P55W */
/* renamed from: l.ۧۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10905 implements InterfaceC17585 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17254 f32778;

    public C10905(C17254 c17254) {
        this.f32778 = c17254;
    }

    @Override // l.InterfaceC17585
    /* renamed from: ֫ */
    public final boolean mo2048(C3060 c3060) {
        C3060 c30602;
        C17254 c17254 = this.f32778;
        c30602 = c17254.f26497;
        if (c3060 == c30602) {
            return false;
        }
        c17254.f52892 = ((SubMenuC19703) c3060).getItem().getItemId();
        InterfaceC17585 m22489 = c17254.m22489();
        if (m22489 != null) {
            return m22489.mo2048(c3060);
        }
        return false;
    }

    @Override // l.InterfaceC17585
    public final void onCloseMenu(C3060 c3060, boolean z) {
        if (c3060 instanceof SubMenuC19703) {
            c3060.getRootMenu().close(false);
        }
        InterfaceC17585 m22489 = this.f32778.m22489();
        if (m22489 != null) {
            m22489.onCloseMenu(c3060, z);
        }
    }
}
