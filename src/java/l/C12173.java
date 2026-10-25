package l;

import java.util.Iterator;

/* compiled from: F416 */
/* renamed from: l.۫ۙ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12173 extends C2086 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9310 f36306;

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        if (c19955 instanceof C5843) {
            c19955 = (C5843) c19955;
            C6319 c6319 = this.f36306.f28251;
            C18837 c18837 = new C18837();
            C18837 c188372 = new C18837();
            Iterator it = c19955.f64620.iterator();
            while (it.hasNext()) {
                AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
                if (abstractC4308.mo12917()) {
                    c18837.m43512(abstractC4308.f13890.f17560.mo12934());
                }
                c188372.m43511(abstractC4308.f13890.f17560);
            }
            C5843 m17534 = c6319.m17534(c188372.m43517());
            m17534.f64617 = c18837.m43517();
            AbstractC19810 abstractC19810 = m17534.f13890;
            abstractC19810.f17563 |= 512;
            c6319.m17493(abstractC19810);
        }
        return c19955;
    }

    public C12173(C9310 c9310) {
        this.f36306 = c9310;
    }
}
