package l;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: O3K3 */
/* renamed from: l.۟᩶ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C7699 extends AbstractCollection {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f23785;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f23786;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Collection f23787;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7699 f23788;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Collection f23789;

    public C7699(AbstractC16416 abstractC16416, Object obj, List list, C7699 c7699) {
        this.f23785 = abstractC16416;
        this.f23786 = obj;
        this.f23787 = list;
        this.f23788 = c7699;
        this.f23789 = c7699 == null ? null : c7699.f23787;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20601() {
        Map map;
        C7699 c7699 = this.f23788;
        if (c7699 != null) {
            c7699.m20601();
            if (c7699.f23787 != this.f23789) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f23787.isEmpty()) {
            map = this.f23785.f50496;
            Collection collection = (Collection) map.get(this.f23786);
            if (collection != null) {
                this.f23787 = collection;
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20602() {
        Map map;
        C7699 c7699 = this.f23788;
        if (c7699 != null) {
            c7699.m20602();
        } else if (this.f23787.isEmpty()) {
            map = this.f23785.f50496;
            map.remove(this.f23786);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20600() {
        Map map;
        C7699 c7699 = this.f23788;
        if (c7699 == null) {
            map = this.f23785.f50496;
            map.put(this.f23786, this.f23787);
        } else {
            c7699.m20600();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        m20601();
        return this.f23787.size();
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m20601();
        return this.f23787.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        m20601();
        return this.f23787.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m20601();
        return this.f23787.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        m20601();
        return new C14048(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        m20601();
        boolean isEmpty = this.f23787.isEmpty();
        boolean add = this.f23787.add(obj);
        if (add) {
            AbstractC16416.m38682(this.f23785);
            if (isEmpty) {
                m20600();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f23787.addAll(collection);
        if (addAll) {
            AbstractC16416.m38680(this.f23785, this.f23787.size() - size);
            if (size == 0) {
                m20600();
            }
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        m20601();
        return this.f23787.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        m20601();
        return this.f23787.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f23787.clear();
        AbstractC16416.m38683(this.f23785, size);
        m20602();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        m20601();
        boolean remove = this.f23787.remove(obj);
        if (remove) {
            AbstractC16416.m38684(this.f23785);
            m20602();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f23787.removeAll(collection);
        if (removeAll) {
            AbstractC16416.m38680(this.f23785, this.f23787.size() - size);
            m20602();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f23787.retainAll(collection);
        if (retainAll) {
            AbstractC16416.m38680(this.f23785, this.f23787.size() - size);
            m20602();
        }
        return retainAll;
    }
}
