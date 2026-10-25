package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: O2OZ */
/* renamed from: l.۟ۙܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7244 extends AbstractSet {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16374 f22199;

    public C7244(C16374 c16374) {
        this.f22199 = c16374;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22199.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f22199.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object m38549;
        Object obj2;
        C16374 c16374 = this.f22199;
        Map m38562 = c16374.m38562();
        if (m38562 == null) {
            m38549 = c16374.m38549(obj);
            obj2 = C16374.f50370;
            return m38549 != obj2;
        }
        return m38562.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f22199.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C16374 c16374 = this.f22199;
        Map m38562 = c16374.m38562();
        if (m38562 != null) {
            return m38562.keySet().iterator();
        }
        return new C10067(c16374);
    }
}
