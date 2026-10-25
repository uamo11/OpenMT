package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 22BV */
/* renamed from: l.۫ۧ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12376 extends AbstractC10128 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16773 f37107;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12376(C16773 c16773) {
        super(R.string.MT_Protector_res_0x7f120184, R.drawable.MT_Protector_res_0x7f0801dd);
        this.f37107 = c16773;
    }

    @Override // l.AbstractC10128
    /* renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        C16773.f51514 = new C16415("local", null);
        c16560.m39031();
        if (c16560.m39026().m39038()) {
            c16560.m39026().m39031();
        } else {
            C15528.m36596();
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f37107);
        AbstractC16891 m39044 = c16560.m39026().m39044();
        if (m39044 instanceof C16773) {
            arrayList.add((C16773) m39044);
        }
        C11971 m24094 = c16560.m39016().m24094();
        m24094.m29245();
        try {
            Iterator<E> it = m24094.iterator();
            while (it.hasNext()) {
                AbstractC16891 abstractC16891 = (AbstractC16891) it.next();
                if (abstractC16891 instanceof C16773) {
                    arrayList.add((C16773) abstractC16891);
                }
            }
            m24094.m29244();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C16773) it2.next()).f51868.m27824();
            }
            c16560.m39016().m24092();
        } catch (Throwable th) {
            m24094.m29244();
            throw th;
        }
    }

    @Override // l.AbstractC10128
    /* renamed from: ܳ */
    public final boolean mo9841() {
        C16415 c16415;
        if (!this.f37107.mo39505()) {
            return false;
        }
        c16415 = C16773.f51514;
        return !c16415.f50492.isEmpty();
    }
}
