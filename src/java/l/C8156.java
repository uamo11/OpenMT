package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: O5F3 */
/* renamed from: l.۠ۨܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8156 extends AbstractC1349 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3675 f25144;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f25145;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21562 f25146;

    public C8156(C21562 c21562, Iterator it, AbstractC3675 abstractC3675) {
        this.f25145 = it;
        this.f25144 = abstractC3675;
        this.f25146 = c21562;
    }

    @Override // l.AbstractC1349
    /* renamed from: ֫ */
    public final Object mo1890() {
        C13758 c13758;
        Iterator it = this.f25145;
        if (!it.hasNext()) {
            m4715();
            return null;
        }
        C13758 c137582 = (C13758) it.next();
        if (!this.f25144.mo7489((Comparable) c137582.f41052)) {
            c13758 = this.f25146.f69281;
            C13758 m33076 = c137582.m33076(c13758);
            return new AbstractMap.SimpleImmutableEntry(m33076.f41052, m33076);
        }
        m4715();
        return null;
    }
}
