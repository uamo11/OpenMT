package l;

import bin.mt.plus.R;

/* compiled from: X20E */
/* renamed from: l.ۖۚܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2326 extends AbstractC1661 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C2326 f7461 = new C2326(R.string.MT_Protector_res_0x7f1205f0, R.drawable.MT_Protector_res_0x7f080223);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C2326 m7584() {
        return f7461;
    }

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7918() == 1 && !c2450.m7913().isDirectory();
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        InterfaceC17889 m7913 = c2450.m7913();
        c2450.m7922().mo15162(m7913);
        C3822.m11575(c2450.m7921(), m7913, m7913.mo36973().m7316() == null);
    }
}
