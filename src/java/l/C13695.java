package l;

import bin.mt.plus.R;

/* compiled from: 37CJ */
/* renamed from: l.ܰ۠ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13695 extends AbstractDialogInterfaceOnClickListenerC12849 {
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String trim = m31260().trim();
        if (!trim.isEmpty()) {
            if (C2096.m6957(-1, trim)) {
                m31263(R.string.MT_Protector_res_0x7f12042c);
                return;
            } else {
                C2096.m6951(trim);
                m31262();
                return;
            }
        }
        m31262();
    }
}
