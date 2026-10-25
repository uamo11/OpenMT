package l;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: O5F3 */
/* renamed from: l.᩹ۨܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22267 extends AbstractC20651 implements Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient Set f72241;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractMap f72242;

    /* JADX WARN: Multi-variable type inference failed */
    public C22267(NavigableMap navigableMap) {
        this.f72242 = (AbstractMap) navigableMap;
    }

    /* renamed from: ۧ */
    public boolean mo3775(Integer num) {
        return mo3772(num) != null;
    }

    public /* synthetic */ C22267(NavigableMap navigableMap, int i) {
        this(navigableMap);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22267 m49988() {
        return new C22267(new TreeMap());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.SortedMap] */
    @Override // l.InterfaceC1641
    /* renamed from: ֫ */
    public final Set mo5516() {
        Set set = this.f72241;
        if (set != null) {
            return set;
        }
        C18740 c18740 = new C18740(this.f72242.values());
        this.f72241 = c18740;
        return c18740;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.NavigableMap] */
    @Override // l.InterfaceC1641
    /* renamed from: ֫ */
    public C13758 mo3772(Integer num) {
        Map.Entry floorEntry = this.f72242.floorEntry(new C2264(num));
        if (floorEntry == null || !((C13758) floorEntry.getValue()).m33073(num)) {
            return null;
        }
        return (C13758) floorEntry.getValue();
    }

    /* renamed from: ۧ */
    public InterfaceC1641 mo3774(C13758 c13758) {
        return c13758.equals(C13758.m33070()) ? this : new C1100(this, c13758);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractMap, java.util.Map, java.util.NavigableMap] */
    /* renamed from: ֫ */
    public void mo3773(C13758 c13758) {
        c13758.getClass();
        if (c13758.m33072()) {
            return;
        }
        AbstractC3675 abstractC3675 = c13758.f41052;
        AbstractC3675 abstractC36752 = c13758.f41053;
        ?? r1 = this.f72242;
        Map.Entry lowerEntry = r1.lowerEntry(abstractC3675);
        if (lowerEntry != null) {
            C13758 c137582 = (C13758) lowerEntry.getValue();
            AbstractC3675 abstractC36753 = c137582.f41053;
            if (abstractC36753.compareTo(abstractC3675) >= 0) {
                if (abstractC36753.compareTo(abstractC36752) >= 0) {
                    abstractC36752 = abstractC36753;
                }
                abstractC3675 = c137582.f41052;
            }
        }
        Map.Entry floorEntry = r1.floorEntry(abstractC36752);
        if (floorEntry != null) {
            C13758 c137583 = (C13758) floorEntry.getValue();
            if (c137583.f41053.compareTo(abstractC36752) >= 0) {
                abstractC36752 = c137583.f41053;
            }
        }
        r1.subMap(abstractC3675, abstractC36752).clear();
        C13758 m33064 = C13758.m33064(abstractC3675, abstractC36752);
        boolean m33072 = m33064.m33072();
        AbstractC3675 abstractC36754 = m33064.f41052;
        if (m33072) {
            r1.remove(abstractC36754);
        } else {
            r1.put(abstractC36754, m33064);
        }
    }
}
