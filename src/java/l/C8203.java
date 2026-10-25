package l;

import bin.mt.plus.R;

/* compiled from: J6WT */
/* renamed from: l.۠۬᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8203 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15257 f25210;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3856 f25211;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f25212;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f25213;

    public C8203(C3264 c3264, InterfaceC15257 interfaceC15257, Runnable runnable) {
        this.f25213 = c3264;
        this.f25210 = interfaceC15257;
        this.f25212 = runnable;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        AbstractActivityC3346 abstractActivityC3346;
        abstractActivityC3346 = this.f25213.f10236;
        m20272(abstractActivityC3346, 200);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f25211 = this.f25210.run();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        DialogInterfaceC0206 dialogInterfaceC0206;
        AbstractActivityC3346 abstractActivityC3346;
        C3264 c3264 = this.f25213;
        dialogInterfaceC0206 = c3264.f10242;
        if (dialogInterfaceC0206.m1442()) {
            abstractActivityC3346 = c3264.f10236;
            if (abstractActivityC3346.isFinishing()) {
                return;
            }
            c3264.m10007();
            Runnable runnable = this.f25212;
            if (runnable != null) {
                runnable.run();
            }
            C3856 c3856 = this.f25211;
            if (c3856 != null) {
                C3264.m10003(c3264, c3856.f12307);
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        DialogInterfaceC0206 dialogInterfaceC0206;
        AbstractActivityC3346 abstractActivityC3346;
        C3264 c3264 = this.f25213;
        dialogInterfaceC0206 = c3264.f10242;
        if (dialogInterfaceC0206.m1442()) {
            abstractActivityC3346 = c3264.f10236;
            if (abstractActivityC3346.isFinishing()) {
                return;
            }
            c3264.m10007();
            C21374.m48463(R.string.MT_Protector_res_0x7f120588);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f25211 = null;
        this.f25213.f10240 = false;
        m20273();
    }
}
