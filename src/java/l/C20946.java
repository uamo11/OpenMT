package l;

/* compiled from: 31AV */
/* renamed from: l.᩷ܶ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20946 extends AbstractC8245 {
    @Override // l.AbstractC8245
    /* renamed from: ܳ */
    public final boolean mo6243() {
        return false;
    }

    @Override // l.AbstractC8245
    /* renamed from: ܽ */
    public final void mo6244() {
        this.f25382.m40762();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47761(C17417 c17417) {
        C17417 c174172 = this.f25382;
        c174172.f53269.add(c17417);
        c17417.f53275.add(c174172);
    }

    @Override // l.AbstractC8245, l.InterfaceC11068
    /* renamed from: ֫ */
    public final void mo6241(InterfaceC11068 interfaceC11068) {
        C17417 c17417 = this.f25382;
        if (c17417.f53270 && !c17417.f53276) {
            C17417 c174172 = (C17417) c17417.f53275.get(0);
            c17417.mo34849((int) ((((C3101) this.f25376).m9456() * c174172.f53271) + 0.5f));
        }
    }

    @Override // l.AbstractC8245
    /* renamed from: ֫ */
    public final void mo6240() {
        C3101 c3101 = (C3101) this.f25376;
        int m9454 = c3101.m9454();
        int m9461 = c3101.m9461();
        int m9463 = c3101.m9463();
        C17417 c17417 = this.f25382;
        if (m9463 == 1) {
            if (m9454 != -1) {
                c17417.f53275.add(this.f25376.f46132.f46156.f25382);
                this.f25376.f46132.f46156.f25382.f53269.add(c17417);
                c17417.f53272 = m9454;
            } else if (m9461 != -1) {
                c17417.f53275.add(this.f25376.f46132.f46156.f25379);
                this.f25376.f46132.f46156.f25379.f53269.add(c17417);
                c17417.f53272 = -m9461;
            } else {
                c17417.f53265 = true;
                c17417.f53275.add(this.f25376.f46132.f46156.f25379);
                this.f25376.f46132.f46156.f25379.f53269.add(c17417);
            }
            m47761(this.f25376.f46156.f25382);
            m47761(this.f25376.f46156.f25379);
            return;
        }
        if (m9454 != -1) {
            c17417.f53275.add(this.f25376.f46132.f46140.f25382);
            this.f25376.f46132.f46140.f25382.f53269.add(c17417);
            c17417.f53272 = m9454;
        } else if (m9461 != -1) {
            c17417.f53275.add(this.f25376.f46132.f46140.f25379);
            this.f25376.f46132.f46140.f25379.f53269.add(c17417);
            c17417.f53272 = -m9461;
        } else {
            c17417.f53265 = true;
            c17417.f53275.add(this.f25376.f46132.f46140.f25379);
            this.f25376.f46132.f46140.f25379.f53269.add(c17417);
        }
        m47761(this.f25376.f46140.f25382);
        m47761(this.f25376.f46140.f25379);
    }

    @Override // l.AbstractC8245
    /* renamed from: ۧ */
    public final void mo6242() {
        int m9463 = ((C3101) this.f25376).m9463();
        C17417 c17417 = this.f25382;
        if (m9463 == 1) {
            this.f25376.m35706(c17417.f53271);
        } else {
            this.f25376.m35731(c17417.f53271);
        }
    }
}
