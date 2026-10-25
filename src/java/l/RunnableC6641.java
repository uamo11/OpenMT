package l;

import bin.mt.plus.R;

/* compiled from: 052E */
/* renamed from: l.ۜ۠ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6641 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f20423;

    @Override // java.lang.Runnable
    public final void run() {
        AbstractActivityC3346 abstractActivityC3346 = this.f20423;
        C19342 c19342 = new C19342(abstractActivityC3346, R.string.MT_Protector_res_0x7f120634);
        c19342.m31249(new C3819(c19342));
        c19342.m31258(R.string.MT_Protector_res_0x7f12022b);
        String string = ApplicationC20075.f65008.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
        c19342.m31250((CharSequence) (string.trim().isEmpty() ? "yyyy-MM-dd_HH-mm-ss" : string));
        c19342.m31256(R.string.MT_Protector_res_0x7f12022c);
        c19342.m31255().setPadding(0, C11266.m27878(6.0f), 0, 0);
        c19342.m31281();
        c19342.m31266(true);
        DialogInterfaceC0206 m31278 = c19342.m31278();
        C8960.m23097(m31278);
        C4925.m14309(1000L, new RunnableC18636(c19342, m31278));
        m31278.m1448().setOnClickListener(new ViewOnClickListenerC8613(abstractActivityC3346, 1));
    }
}
