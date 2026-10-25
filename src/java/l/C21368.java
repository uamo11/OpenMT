package l;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: V9PU */
/* renamed from: l.᩸ۚۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C21368 extends AbstractMap {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68833 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f68834;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile C15016 f68835;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Map f68836;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Map f68837;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C18546 f68838;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f68839 = Collections.EMPTY_LIST;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f68840;

    public C21368(int i) {
        this.f68834 = i;
        Map map = Collections.EMPTY_MAP;
        this.f68837 = map;
        this.f68836 = map;
    }

    /* renamed from: ᩻ */
    public void mo7575() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f68840) {
            return;
        }
        if (this.f68837.isEmpty()) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = C20195.unmodifiableMap(this.f68837);
        }
        this.f68837 = unmodifiableMap;
        if (this.f68836.isEmpty()) {
            unmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap2 = C20195.unmodifiableMap(this.f68836);
        }
        this.f68836 = unmodifiableMap2;
        this.f68840 = true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m48430() {
        return this.f68840;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f68839.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C0906) this.f68839.get(i2)).hashCode();
        }
        return this.f68837.size() > 0 ? this.f68837.hashCode() + i : i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m48427() {
        return this.f68839.size();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m48428(int i) {
        return (Map.Entry) this.f68839.get(i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterable m48429() {
        if (this.f68837.isEmpty()) {
            return C5140.m14700();
        }
        return this.f68837.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f68837.size() + this.f68839.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m48416(comparable) >= 0 || this.f68837.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m48416 = m48416(comparable);
        if (m48416 >= 0) {
            return ((C0906) this.f68839.get(m48416)).getValue();
        }
        return this.f68837.get(comparable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m48425(Comparable comparable, Object obj) {
        m48424();
        int m48416 = m48416(comparable);
        if (m48416 >= 0) {
            return ((C0906) this.f68839.get(m48416)).setValue(obj);
        }
        m48424();
        boolean isEmpty = this.f68839.isEmpty();
        int i = this.f68834;
        if (isEmpty && !(this.f68839 instanceof ArrayList)) {
            this.f68839 = new ArrayList(i);
        }
        int i2 = -(m48416 + 1);
        if (i2 >= i) {
            return m48419().put(comparable, obj);
        }
        if (this.f68839.size() == i) {
            C0906 c0906 = (C0906) this.f68839.remove(i - 1);
            m48419().put(c0906.getKey(), c0906.getValue());
        }
        this.f68839.add(i2, new C0906(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m48424();
        if (!this.f68839.isEmpty()) {
            this.f68839.clear();
        }
        if (this.f68837.isEmpty()) {
            return;
        }
        this.f68837.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m48424();
        Comparable comparable = (Comparable) obj;
        int m48416 = m48416(comparable);
        if (m48416 >= 0) {
            return m48421(m48416);
        }
        if (this.f68837.isEmpty()) {
            return null;
        }
        return this.f68837.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object m48421(int i) {
        m48424();
        Object value = ((C0906) this.f68839.remove(i)).getValue();
        if (!this.f68837.isEmpty()) {
            Iterator it = m48419().entrySet().iterator();
            List list = this.f68839;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C0906(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m48416(Comparable comparable) {
        int size = this.f68839.size();
        int i = size - 1;
        if (i >= 0) {
            int compareTo = comparable.compareTo(((C0906) this.f68839.get(i)).getKey());
            if (compareTo <= 0) {
                if (compareTo == 0) {
                    return i;
                }
            }
            return -(size + 1);
        }
        size = 0;
        while (size <= i) {
            int i2 = (size + i) / 2;
            int compareTo2 = comparable.compareTo(((C0906) this.f68839.get(i2)).getKey());
            if (compareTo2 < 0) {
                i = i2 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i2;
                }
                size = i2 + 1;
            }
        }
        return -(size + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f68835 == null) {
            this.f68835 = new C15016(this);
        }
        return this.f68835;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set m48426() {
        if (this.f68838 == null) {
            this.f68838 = new C18546(this);
        }
        return this.f68838;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m48424() {
        if (this.f68840) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private SortedMap m48419() {
        m48424();
        if (this.f68837.isEmpty() && !(this.f68837 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f68837 = treeMap;
            this.f68836 = treeMap.descendingMap();
        }
        return (SortedMap) this.f68837;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21368)) {
            return super.equals(obj);
        }
        C21368 c21368 = (C21368) obj;
        int size = size();
        if (size == c21368.size()) {
            int size2 = this.f68839.size();
            if (size2 != c21368.f68839.size()) {
                return ((AbstractSet) entrySet()).equals(c21368.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (m48428(i).equals(c21368.m48428(i))) {
                }
            }
            if (size2 != size) {
                return this.f68837.equals(c21368.f68837);
            }
            return true;
        }
        return false;
    }
}
