package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: O5F3 */
/* renamed from: l.ܶۨܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15210 extends AbstractC1349 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f46677;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21562 f46678;

    public C15210(C21562 c21562, Iterator it) {
        this.f46677 = it;
        this.f46678 = c21562;
    }

    @Override // l.AbstractC1349
    /* renamed from: ֫ */
    public final Object mo1890() {
        C13758 c13758;
        C13758 c137582;
        C13758 c137583;
        Iterator it = this.f46677;
        if (!it.hasNext()) {
            m4715();
            return null;
        }
        C13758 c137584 = (C13758) it.next();
        C21562 c21562 = this.f46678;
        c13758 = c21562.f69281;
        if (c13758.f41052.compareTo(c137584.f41053) < 0) {
            c137582 = c21562.f69281;
            C13758 m33076 = c137584.m33076(c137582);
            AbstractC3675 abstractC3675 = m33076.f41052;
            c137583 = c21562.f69283;
            if (!c137583.m33073(abstractC3675)) {
                m4715();
                return null;
            }
            return new AbstractMap.SimpleImmutableEntry(abstractC3675, m33076);
        }
        m4715();
        return null;
    }
}
