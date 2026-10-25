package l;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: T5OR */
/* renamed from: l.֨ۛܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC0935 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC3176) {
            collection = ((InterfaceC3176) collection).m9734();
        }
        boolean z = false;
        if ((collection instanceof Set) && collection.size() > size()) {
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z |= remove(it2.next());
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
