package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: E61U */
/* renamed from: l.֡۟֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0259 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Iterator f1541;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator f1542;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterator f1543;

    public C0259(List list, List list2, Iterator it) {
        this.f1541 = list.iterator();
        this.f1542 = list2.iterator();
        this.f1543 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1541.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Set of;
        String charSequence = ((CharSequence) this.f1541.next()).toString();
        Iterator it = this.f1542;
        if (it.hasNext()) {
            of = (Set) it.next();
        } else {
            of = AbstractC6079.of();
        }
        Iterator it2 = this.f1543;
        return new C19311(it2.hasNext() ? (String) it2.next() : null, charSequence, of);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
