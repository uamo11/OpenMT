package l;

/* compiled from: 3B3L */
/* renamed from: l.ܽܶᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16727 implements InterfaceC2494 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18139 f51360;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51361;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13576 f51362;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11915 f51363;

    public C16727(C18139 c18139, C13576 c13576, int i, C11915 c11915) {
        this.f51360 = c18139;
        this.f51362 = c13576;
        this.f51361 = i;
        this.f51363 = c11915;
    }

    @Override // l.InterfaceC2494
    /* renamed from: ֫ */
    public final int mo7990() {
        return this.f51362.m32656();
    }

    @Override // l.InterfaceC2494
    /* renamed from: ۧ */
    public final int mo7993() {
        return this.f51361;
    }

    @Override // l.InterfaceC2494
    /* renamed from: ֫ */
    public final C7744 mo7991(int i) {
        return this.f51362.m32646(i, this.f51363.f35622.f77236);
    }

    @Override // l.InterfaceC2494
    /* renamed from: ֫ */
    public final void mo7992(int i, RunnableC8844 runnableC8844) {
        C11915 c11915;
        C22372 c22372 = this.f51360.f56430;
        c11915 = c22372.f72506;
        if (c11915 == this.f51363) {
            c22372.m50138(i, runnableC8844);
        }
    }
}
