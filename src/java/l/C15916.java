package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: I5J5 */
/* renamed from: l.ܺۨܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15916 extends AbstractC9527 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterable f49166;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3923 f49167;

    public C15916(C3923 c3923, Collection collection) {
        this.f49167 = c3923;
        this.f49166 = collection;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        TreeMap treeMap;
        if (!(obj instanceof C13758)) {
            return null;
        }
        C13758 c13758 = (C13758) obj;
        treeMap = this.f49167.f12508;
        C2512 c2512 = (C2512) treeMap.get(c13758.f41052);
        if (c2512 == null || !((C13758) c2512.getKey()).equals(c13758)) {
            return null;
        }
        return c2512.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        TreeMap treeMap;
        treeMap = this.f49167.f12508;
        return treeMap.size();
    }

    @Override // l.AbstractC9527
    /* renamed from: ֫ */
    public final Iterator mo15281() {
        return this.f49166.iterator();
    }
}
