package l;

/* compiled from: PAPA */
/* renamed from: l.֡֡ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0066 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f976;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC0772 f977;

    public C0066(AbstractActivityC0772 abstractActivityC0772) {
        this.f977 = abstractActivityC0772;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo1008() {
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.m30314(abstractActivityC0772.f2869, true, false);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo1009() {
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.m30305(abstractActivityC0772.mo2952(), new C9406());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1006() {
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        InterfaceMenuItemC13827 interfaceMenuItemC138273;
        InterfaceMenuItemC13827 interfaceMenuItemC138274;
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.m30360();
        abstractActivityC0772.f2867.m30456(false);
        abstractActivityC0772.f2867.m30303();
        interfaceMenuItemC13827 = abstractActivityC0772.f2864;
        if (interfaceMenuItemC13827 != null) {
            interfaceMenuItemC138274 = abstractActivityC0772.f2864;
            interfaceMenuItemC138274.setEnabled(false);
        }
        interfaceMenuItemC138272 = abstractActivityC0772.f2861;
        if (interfaceMenuItemC138272 != null) {
            interfaceMenuItemC138273 = abstractActivityC0772.f2861;
            interfaceMenuItemC138273.setEnabled(false);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1007(Exception exc) {
        this.f976 = true;
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.setEnabled(false);
        abstractActivityC0772.f2867.m30456(false);
        abstractActivityC0772.f2867.setFocusable(false);
        abstractActivityC0772.f2867.setFocusableInTouchMode(false);
        abstractActivityC0772.f2866.m12890(false);
        abstractActivityC0772.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo1010() {
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.m30314(abstractActivityC0772.f2869, false, !this.f976);
    }
}
