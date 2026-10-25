package l;

/* compiled from: PAPA */
/* renamed from: l.᩵֡ᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19118 implements InterfaceC19449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f60228 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC0772 f60229;

    public C19118(AbstractActivityC0772 abstractActivityC0772) {
        this.f60229 = abstractActivityC0772;
    }

    @Override // l.InterfaceC19449
    /* renamed from: ֫ */
    public final void mo2703(boolean z) {
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        InterfaceMenuItemC13827 interfaceMenuItemC138273;
        InterfaceMenuItemC13827 interfaceMenuItemC138274;
        AbstractActivityC0772 abstractActivityC0772 = this.f60229;
        interfaceMenuItemC13827 = abstractActivityC0772.f2863;
        if (interfaceMenuItemC13827 != null) {
            interfaceMenuItemC138274 = abstractActivityC0772.f2863;
            this.f60228 = interfaceMenuItemC138274.isEnabled();
        }
        if (z == this.f60228) {
            return;
        }
        interfaceMenuItemC138272 = abstractActivityC0772.f2863;
        if (interfaceMenuItemC138272 != null) {
            interfaceMenuItemC138273 = abstractActivityC0772.f2863;
            interfaceMenuItemC138273.setEnabled(z);
        }
        this.f60228 = z;
        String mo2951 = abstractActivityC0772.mo2951();
        if (z) {
            mo2951 = C16014.m37867(mo2951, "*");
        }
        abstractActivityC0772.setTitle(mo2951);
    }

    @Override // l.InterfaceC19449
    /* renamed from: ֫ */
    public final void mo2704(boolean z, boolean z2) {
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        InterfaceMenuItemC13827 interfaceMenuItemC138273;
        InterfaceMenuItemC13827 interfaceMenuItemC138274;
        AbstractActivityC0772 abstractActivityC0772 = this.f60229;
        interfaceMenuItemC13827 = abstractActivityC0772.f2861;
        if (interfaceMenuItemC13827 != null) {
            interfaceMenuItemC138274 = abstractActivityC0772.f2861;
            interfaceMenuItemC138274.setEnabled(z);
        }
        interfaceMenuItemC138272 = abstractActivityC0772.f2864;
        if (interfaceMenuItemC138272 != null) {
            interfaceMenuItemC138273 = abstractActivityC0772.f2864;
            interfaceMenuItemC138273.setEnabled(z2);
        }
    }
}
