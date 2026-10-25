package l;

import android.widget.Button;
import bin.mt.plus.R;

/* compiled from: 9981 */
/* renamed from: l.ۘ᩸᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4221 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("trash");
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("trash");
        int m7918 = c2450.m7918();
        Button m1447 = m5602(c2450, R.string.MT_Protector_res_0x7f1205ca, m7918 == 1 ? C4925.m14306(R.string.MT_Protector_res_0x7f1207e2, c2450.m7913().mo36985()) : C4925.m14306(R.string.MT_Protector_res_0x7f1207e1, Integer.valueOf(m7918))).m1447();
        m1447.setClickable(false);
        C4925.m14309(300L, new RunnableC22375(2, m1447));
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C2810.class);
        c0994.m3485(c2450.m7909());
        c0994.m3486(c2450);
        c0994.m3474("deleteFrom", c2450.m7910());
        c0994.m3475("recycle", false);
        c0994.m3475("speedMode", false);
        c0994.m3470(0, "minTotal");
        c0994.m3469();
    }
}
