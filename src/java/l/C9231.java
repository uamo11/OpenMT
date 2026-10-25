package l;

/* compiled from: H8BL */
/* renamed from: l.ۢ֡ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9231 extends C0637 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15579 f27938;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9231(C15579 c15579, InterfaceC19689 interfaceC19689) {
        super(interfaceC19689);
        this.f27938 = c15579;
    }

    @Override // l.C0637, l.InterfaceC19689
    /* renamed from: ۧ */
    public final void mo2597(C11197 c11197, Exception exc) {
        boolean z;
        C21658 c21658;
        C0637 c0637;
        C0637 c06372;
        boolean m7191 = C2175.m7191(exc);
        C15579 c15579 = this.f27938;
        if (!m7191) {
            z = c15579.f48008;
            if (z && !c15579.mo15853()) {
                c21658 = c15579.f48002;
                c0637 = c15579.f47999;
                c06372 = c15579.f48003;
                C15579.m36741(c15579, c11197, c21658, c0637, c06372);
                return;
            }
        }
        c15579.f48007 = false;
        c15579.f47998 = false;
        super.mo2597(c11197, exc);
    }

    @Override // l.C0637, l.InterfaceC19689
    /* renamed from: ֫ */
    public final void mo2593(C11197 c11197, Exception exc) {
        boolean z;
        C21658 c21658;
        C0637 c0637;
        C0637 c06372;
        C15579 c15579 = this.f27938;
        z = c15579.f48008;
        if (z && !c15579.mo15853()) {
            c21658 = c15579.f48002;
            c0637 = c15579.f47999;
            c06372 = c15579.f48003;
            C15579.m36741(c15579, c11197, c21658, c0637, c06372);
            return;
        }
        c15579.f48007 = false;
        c15579.f47998 = false;
        super.mo2593(c11197, exc);
    }

    @Override // l.C0637, l.InterfaceC19689
    /* renamed from: ֫ */
    public final void mo2594(C11197 c11197, C15495 c15495, long j) {
        C15579 c15579 = this.f27938;
        c15579.f48007 = false;
        c15579.f47998 = true;
        super.mo2594(c11197, c15495, j);
    }
}
