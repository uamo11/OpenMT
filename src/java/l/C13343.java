package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: O3K3 */
/* renamed from: l.۬᩶ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13343 extends C8821 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f39918;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13343(AbstractC16416 abstractC16416, Map map) {
        super(map);
        this.f39918 = abstractC16416;
    }

    @Override // l.C8821, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C3466 c3466 = (C3466) it;
            if (!c3466.hasNext()) {
                return;
            }
            c3466.next();
            c3466.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f26890.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f26890.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f26890.keySet().hashCode();
    }

    @Override // l.C8821, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3466(this, this.f26890.entrySet().iterator());
    }

    @Override // l.C8821, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f26890.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            AbstractC16416.m38683(this.f39918, i);
        } else {
            i = 0;
        }
        return i > 0;
    }
}
