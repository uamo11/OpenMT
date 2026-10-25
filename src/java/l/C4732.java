package l;

import java.io.IOException;

/* compiled from: 49SV */
/* renamed from: l.ۙܶܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4732 extends AbstractC21087 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13198 f15018;

    @Override // l.AbstractC21087
    /* renamed from: ֫ */
    public final long mo7023() {
        return -1L;
    }

    @Override // l.AbstractC21087
    /* renamed from: ֫ */
    public final void mo7025(long j) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4732(C13198 c13198, C13198 c131982, InterfaceC6975 interfaceC6975) {
        super(c131982, interfaceC6975);
        this.f15018 = c13198;
    }

    @Override // l.AbstractC21087
    /* renamed from: ۧ */
    public final int mo7026() {
        C3321 c3321;
        int i;
        C13198 c13198 = this.f15018;
        if (!c13198.m32033()) {
            throw new IOException("load mt extras failed");
        }
        c3321 = c13198.f39466;
        i = c3321.f10405;
        return i;
    }

    @Override // l.AbstractC21087
    /* renamed from: ֫ */
    public final void mo7024(int i) {
        this.f15018.m32030(i);
    }
}
