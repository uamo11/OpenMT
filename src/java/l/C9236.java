package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: P98B */
/* renamed from: l.ۢ֡ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9236 extends AbstractC1661 {
    public C9236() {
        super(R.string.MT_Protector_res_0x7f1205b8, R.drawable.MT_Protector_res_0x7f0801e2);
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        if (!C23196.m51454()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120415);
            return;
        }
        if (c2450.m7918() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c2450.m7909().iterator();
            while (it.hasNext()) {
                arrayList.add(new C10211((InterfaceC17889) it.next()));
            }
            c2450.m7922().mo6005(c2450.m7921(), arrayList, new RunnableC18352(1, arrayList, c2450));
            return;
        }
        c2450.m7922().m39738(c2450.m7921(), c2450.m7913(), new C6413(c2450.m7919(), c2450));
    }
}
