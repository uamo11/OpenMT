package l;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: 8BAS */
/* renamed from: l.ܿ᩷ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC17598 extends AbstractC5895 {
    /* renamed from: ۢ */
    public abstract void mo1508();

    @Override // l.AbstractC5895
    /* renamed from: ᩷ */
    public final int mo13226() {
        Collection mo6834 = mo6834();
        int size = mo6834.size();
        if (size == 0) {
            return 0;
        }
        return ((AbstractC2368) mo6834.iterator().next()).mo3385() * size;
    }

    @Override // l.AbstractC5895
    /* renamed from: ܳ */
    public final void mo13225() {
        C1662 m16521 = m16521();
        mo1508();
        Iterator it = mo6834().iterator();
        while (it.hasNext()) {
            ((AbstractC2368) it.next()).mo2863(m16521);
        }
    }

    @Override // l.AbstractC5895
    /* renamed from: ۧ */
    public final void mo13224(C18241 c18241) {
        C1662 m16521 = m16521();
        int m16516 = m16516();
        Iterator it = mo6834().iterator();
        while (it.hasNext()) {
            ((AbstractC2368) it.next()).mo3384(m16521, c18241);
            c18241.m42500(m16516);
        }
    }

    @Override // l.AbstractC5895
    /* renamed from: ֫ */
    public final int mo13219(AbstractC2368 abstractC2368) {
        AbstractC15772 abstractC15772 = (AbstractC15772) abstractC2368;
        return m16517(abstractC15772.mo3385() * abstractC15772.m37188());
    }
}
