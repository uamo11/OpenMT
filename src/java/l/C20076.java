package l;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: 88AQ */
/* renamed from: l.᩶ۡ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20076 implements InterfaceC22560, InterfaceC14243 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4553 f65013;

    public C20076(C4553 c4553) {
        this.f65013 = c4553;
    }

    @Override // l.InterfaceC22560
    /* renamed from: ֫ */
    public final void mo5679(long j, long j2, long j3, long j4) {
        C15249 c15249;
        InterfaceC22192 interfaceC22192;
        C15249 c152492;
        InterfaceC22192 interfaceC221922;
        InterfaceC22192 interfaceC221923;
        C15249 c152493;
        C4553 c4553 = this.f65013;
        c15249 = c4553.f14530;
        c15249.m47708(j);
        interfaceC22192 = c4553.f14524;
        c152492 = c4553.f14530;
        interfaceC22192.mo3550(c152492);
        interfaceC221922 = c4553.f14524;
        interfaceC221922.mo3552(j4);
        interfaceC221923 = c4553.f14524;
        c152493 = c4553.f14530;
        interfaceC221923.setProgress(c152493.m47712());
    }

    @Override // l.InterfaceC17066
    /* renamed from: ᩻ */
    public final boolean mo1526() {
        InterfaceC22192 interfaceC22192;
        AtomicReference atomicReference;
        C4553 c4553 = this.f65013;
        interfaceC22192 = c4553.f14524;
        if (interfaceC22192.mo1526()) {
            return true;
        }
        atomicReference = c4553.f14533;
        return atomicReference.get() != null;
    }

    @Override // l.InterfaceC22560
    /* renamed from: ܺ֫ */
    public final C4300 mo5680() {
        C4300 c4300;
        c4300 = this.f65013.f14526;
        return c4300;
    }

    @Override // l.InterfaceC5627
    /* renamed from: ᩷֫ */
    public final void mo1648() {
        ThreadLocal threadLocal;
        InterfaceC22192 interfaceC22192;
        C4553 c4553 = this.f65013;
        threadLocal = c4553.f14539;
        String str = (String) threadLocal.get();
        if (str != null) {
            interfaceC22192 = c4553.f14524;
            interfaceC22192.setName(str);
        }
    }

    @Override // l.InterfaceC14243
    public final void cancel() {
        InterfaceC22192 interfaceC22192;
        interfaceC22192 = this.f65013.f14524;
        interfaceC22192.mo3549();
    }
}
