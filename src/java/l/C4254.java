package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: L1Y0 */
/* renamed from: l.ۘ᩺ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4254 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13778;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19071 f13779;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4254(Main main, String str, InterfaceC19071 interfaceC19071) {
        super(main, -1);
        this.f13778 = str;
        this.f13779 = interfaceC19071;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String m31260 = m31260();
        if (m31260.contains("\\") || m31260.contains("/")) {
            m31263(R.string.MT_Protector_res_0x7f1203ae);
        } else if (C16999.m39866(C9523.m24393(this.f13778, m31260), new String[0]).mo23120()) {
            m31263(R.string.MT_Protector_res_0x7f1203a1);
        } else {
            m31262();
            this.f13779.mo2836(m31260);
        }
    }
}
