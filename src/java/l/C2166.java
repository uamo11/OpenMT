package l;

/* compiled from: 28AQ */
/* renamed from: l.֫᩻᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2166 implements InterfaceC22560 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4300 f7155;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11339 f7156;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1025 f7157;

    public C2166(C11339 c11339, InterfaceC1025 interfaceC1025, C4300 c4300) {
        this.f7156 = c11339;
        this.f7157 = interfaceC1025;
        this.f7155 = c4300;
    }

    @Override // l.InterfaceC22560
    /* renamed from: ֫ */
    public final void mo5679(long j, long j2, long j3, long j4) {
        C15249 c15249;
        C15249 c152492;
        C15249 c152493;
        C11339 c11339 = this.f7156;
        c15249 = c11339.f33924;
        c15249.m47708(j);
        c152492 = c11339.f33924;
        InterfaceC1025 interfaceC1025 = this.f7157;
        interfaceC1025.mo3550(c152492);
        interfaceC1025.mo3552(j4);
        c152493 = c11339.f33924;
        interfaceC1025.setProgress(c152493.m47712());
    }

    @Override // l.InterfaceC17066
    /* renamed from: ᩻ */
    public final boolean mo1526() {
        C13887 c13887;
        c13887 = this.f7156.f33921;
        return c13887.mo1526();
    }

    @Override // l.InterfaceC22560
    /* renamed from: ܺ֫ */
    public final C4300 mo5680() {
        return this.f7155;
    }

    @Override // l.InterfaceC5627
    /* renamed from: ᩷֫ */
    public final void mo1648() {
        ThreadLocal threadLocal;
        threadLocal = this.f7156.f33918;
        String str = (String) threadLocal.get();
        if (str != null) {
            this.f7157.setName(str);
        }
    }
}
