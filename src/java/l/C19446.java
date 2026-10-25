package l;

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: O5F3 */
/* renamed from: l.᩵ۨܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19446 extends AbstractC1349 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f62891;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5334 f62892;

    public C19446(C5334 c5334, Iterator it) {
        this.f62891 = it;
        this.f62892 = c5334;
    }

    @Override // l.AbstractC1349
    /* renamed from: ֫ */
    public final Object mo1890() {
        C13758 c13758;
        Iterator it = this.f62891;
        if (!it.hasNext()) {
            m4715();
            return null;
        }
        C13758 c137582 = (C13758) it.next();
        c13758 = this.f62892.f16637;
        if (c13758.f41053.mo7489((Comparable) c137582.f41053)) {
            m4715();
            return null;
        }
        return new AbstractMap.SimpleImmutableEntry(c137582.f41053, c137582);
    }
}
