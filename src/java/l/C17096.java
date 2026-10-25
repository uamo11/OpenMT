package l;

/* compiled from: K434 */
/* renamed from: l.ܿۘ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17096 extends AbstractC12117 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0992 f52404;

    public C17096(C14273 c14273) {
        super(c14273);
        this.f52404 = new C0992();
    }

    @Override // l.InterfaceC2029
    /* renamed from: ֫ */
    public final void mo6595(AbstractC5144 abstractC5144, int i) {
        int i2 = this.f36194;
        if (i2 > i) {
            i = i2;
        }
        this.f52404.m3467(i, abstractC5144);
    }

    @Override // l.AbstractC12117
    /* renamed from: ۧ */
    public final AbstractC5144 mo29523(AbstractC5144 abstractC5144) {
        mo6595(abstractC5144, this.f36195.f42993.f70639);
        return abstractC5144;
    }

    @Override // l.AbstractC12117
    /* renamed from: ܽ */
    public final AbstractC5144 mo29524(AbstractC5144 abstractC5144) {
        mo6595(abstractC5144, this.f36195.f42997.m7523().f70639);
        return abstractC5144;
    }

    @Override // l.InterfaceC2029
    /* renamed from: ֫ */
    public final int mo6593(AbstractC5144 abstractC5144) {
        int m3466 = this.f52404.m3466(abstractC5144);
        if (m3466 == -1) {
            return -1;
        }
        return m3466;
    }

    @Override // l.InterfaceC2029
    /* renamed from: ֫ */
    public final int mo6594(AbstractC5144 abstractC5144, AbstractC5144 abstractC51442) {
        int m3468 = this.f52404.m3468(abstractC5144);
        if (m3468 == -1) {
            return -1;
        }
        mo6595(abstractC51442, m3468);
        return m3468;
    }
}
