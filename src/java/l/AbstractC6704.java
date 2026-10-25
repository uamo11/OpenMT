package l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: 067E */
/* renamed from: l.ۜۤܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC6704 extends AbstractC0935 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract Map mo18265();

    @Override // l.AbstractC0935, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= remove(it.next());
            }
            return z;
        }
    }

    @Override // l.AbstractC0935, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet m35585 = C15045.m35585(collection.size());
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    m35585.add(((Map.Entry) obj).getKey());
                }
            }
            return mo18265().keySet().retainAll(m35585);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo18265().size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        mo18265().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map mo18265 = mo18265();
        mo18265.getClass();
        try {
            obj2 = mo18265.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (C11003.equals(obj2, entry.getValue())) {
            return obj2 != null || mo18265().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return mo18265().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return mo18265().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }
}
