package l;

import java.util.Iterator;

/* compiled from: X43L */
/* renamed from: l.۬ܶ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C13185 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f39421;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12480 f39422;

    public C13185(C12480 c12480, AbstractC5698 abstractC5698) {
        this.f39422 = c12480;
        this.f39421 = abstractC5698;
    }

    /* renamed from: ֫ */
    public AbstractC4308 mo13818(AbstractC4308 abstractC4308) {
        C12480 c12480 = this.f39422;
        C6319 c6319 = c12480.f37507;
        C6319 c63192 = c12480.f37507;
        AbstractC4308 m17537 = c6319.m17537(abstractC4308);
        m17537.getClass();
        if (m17537 instanceof C5843) {
            Iterator it = ((C5843) m17537).m16366().iterator();
            while (it.hasNext()) {
                if (!c63192.f19604.m36163((AbstractC4308) it.next())) {
                    C16719 m16617 = c63192.f19601.m16617(C11886.m29013(m17537));
                    C6130 c6130 = new C6130();
                    c6130.f18768 = m16617;
                    throw c6130;
                }
            }
        } else if (!c63192.f19604.m36163(m17537)) {
            C16719 m166172 = c63192.f19601.m16617(C11886.m29013(m17537));
            C6130 c61302 = new C6130();
            c61302.f18768 = m166172;
            throw c61302;
        }
        return c63192.m17543(this.f39421, m17537);
    }
}
