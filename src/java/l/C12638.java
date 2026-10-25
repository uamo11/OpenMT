package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: O3K3 */
/* renamed from: l.۫᩶ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12638 extends C11933 implements NavigableMap {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f38074;

    @Override // l.C11933
    /* renamed from: ۧ */
    public final NavigableMap mo29117() {
        return (NavigableMap) ((SortedMap) this.f65835);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12638(AbstractC16416 abstractC16416, NavigableMap navigableMap) {
        super(abstractC16416, navigableMap);
        this.f38074 = abstractC16416;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = mo29117().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return m46720(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return mo29117().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = mo29117().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return m46720(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return mo29117().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = mo29117().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return m46720(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return mo29117().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = mo29117().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return m46720(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return mo29117().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = mo29117().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return m46720(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = mo29117().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return m46720(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return m30899(((C21811) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return m30899(((C21811) ((AbstractC18699) descendingMap()).entrySet()).iterator());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractMap.SimpleImmutableEntry m30899(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection mo13497 = this.f38074.mo13497();
        mo13497.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), C20195.unmodifiableList((List) mo13497));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C12638(this.f38074, mo29117().descendingMap());
    }

    @Override // l.C11933, l.C20400, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C11933, l.C20400, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C11933
    /* renamed from: ֫ */
    public final SortedSet mo29116() {
        return new C10522(this.f38074, mo29117());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // l.C11933, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new C12638(this.f38074, mo29117().subMap(obj, z, obj2, z2));
    }

    @Override // l.C11933, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new C12638(this.f38074, mo29117().headMap(obj, z));
    }

    @Override // l.C11933, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new C12638(this.f38074, mo29117().tailMap(obj, z));
    }
}
