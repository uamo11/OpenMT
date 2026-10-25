package l;

import bin.mt.plus.R;

/* compiled from: 9B3J */
/* renamed from: l.ۜ᩶ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6993 extends AbstractC10128 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19944 f21586;

    public C6993(InterfaceC19944 interfaceC19944) {
        super(R.string.MT_Protector_res_0x7f120900, R.drawable.MT_Protector_res_0x7f080252);
        this.f21586 = interfaceC19944;
    }

    @Override // l.AbstractC10128
    /* renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        InterfaceC19944 interfaceC19944 = this.f21586;
        C14298.m34099(c16560, interfaceC19944, interfaceC19944.mo13539());
    }

    @Override // l.AbstractC10128
    /* renamed from: ܳ */
    public boolean mo9841() {
        C16415 mo13539 = this.f21586.mo13539();
        return !(mo13539.f50494 == null || mo13539.f50492.isEmpty());
    }
}
