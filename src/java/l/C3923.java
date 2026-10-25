package l;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: I5J5 */
/* renamed from: l.ۘۨܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3923 implements InterfaceC7409 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TreeMap f12508 = new TreeMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3923 m11959() {
        return new C3923();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11962(C13758 c13758, String str) {
        boolean m33072 = c13758.m33072();
        AbstractC3675 abstractC3675 = c13758.f41052;
        if (m33072) {
            return;
        }
        str.getClass();
        boolean m330722 = c13758.m33072();
        AbstractC3675 abstractC36752 = c13758.f41053;
        TreeMap treeMap = this.f12508;
        if (!m330722) {
            Map.Entry lowerEntry = treeMap.lowerEntry(abstractC3675);
            if (lowerEntry != null) {
                C2512 c2512 = (C2512) lowerEntry.getValue();
                if (((C13758) c2512.getKey()).f41053.compareTo(abstractC3675) > 0) {
                    if (((C13758) c2512.getKey()).f41053.compareTo(abstractC36752) > 0) {
                        AbstractC3675 abstractC36753 = ((C13758) c2512.getKey()).f41053;
                        treeMap.put(abstractC36752, new C2512(C13758.m33064(abstractC36752, abstractC36753), ((C2512) lowerEntry.getValue()).getValue()));
                    }
                    AbstractC3675 abstractC36754 = ((C13758) c2512.getKey()).f41052;
                    treeMap.put(abstractC36754, new C2512(C13758.m33064(abstractC36754, abstractC3675), ((C2512) lowerEntry.getValue()).getValue()));
                }
            }
            Map.Entry lowerEntry2 = treeMap.lowerEntry(abstractC36752);
            if (lowerEntry2 != null) {
                C2512 c25122 = (C2512) lowerEntry2.getValue();
                if (((C13758) c25122.getKey()).f41053.compareTo(abstractC36752) > 0) {
                    AbstractC3675 abstractC36755 = ((C13758) c25122.getKey()).f41053;
                    treeMap.put(abstractC36752, new C2512(C13758.m33064(abstractC36752, abstractC36755), ((C2512) lowerEntry2.getValue()).getValue()));
                }
            }
            treeMap.subMap(abstractC3675, abstractC36752).clear();
        }
        treeMap.put(abstractC3675, new C2512(c13758, str));
    }

    @Override // l.InterfaceC7409
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map mo11961() {
        return new C15916(this, this.f12508.values());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m11963() {
        return new C15916(this, this.f12508.descendingMap().values());
    }

    @Override // l.InterfaceC7409
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11960(Integer num) {
        Map.Entry floorEntry = this.f12508.floorEntry(new C2264(num));
        Map.Entry entry = (floorEntry == null || !((C13758) ((C2512) floorEntry.getValue()).getKey()).m33073(num)) ? null : (Map.Entry) floorEntry.getValue();
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC7409)) {
            return false;
        }
        return ((AbstractMap) mo11961()).equals(((InterfaceC7409) obj).mo11961());
    }

    public final int hashCode() {
        return ((AbstractMap) mo11961()).hashCode();
    }

    public final String toString() {
        return this.f12508.values().toString();
    }
}
