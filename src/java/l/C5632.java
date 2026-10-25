package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: S97M */
/* renamed from: l.ۚ᩸᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5632 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("trash") && c2450.m7926().length() <= 1;
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("trash");
        int m7918 = c2450.m7918();
        m5602(c2450, R.string.MT_Protector_res_0x7f1207e3, m7918 == 1 ? C4925.m14306(R.string.MT_Protector_res_0x7f1207e5, c2450.m7913().mo36985()) : C4925.m14306(R.string.MT_Protector_res_0x7f1207e4, Integer.valueOf(m7918)));
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        List m7909 = c2450.m7909();
        ArrayList arrayList = new ArrayList(m7909.size());
        Iterator it = m7909.iterator();
        while (it.hasNext()) {
            arrayList.add(((C12687) ((InterfaceC17889) it.next())).m30958());
        }
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C0692.class);
        c0994.m3484(c2450);
        c0994.m3473("infos", arrayList);
        c0994.m3469();
    }
}
