package l;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: O3K3 */
/* renamed from: l.ۨ᩶ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11933 extends C20400 implements SortedMap {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public SortedSet f35681;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16416 f35682;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11933(AbstractC16416 abstractC16416, SortedMap sortedMap) {
        super(abstractC16416, sortedMap);
        this.f35682 = abstractC16416;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SortedMap mo29117() {
        return (SortedMap) this.f65835;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return mo29117().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return mo29117().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return mo29117().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new C11933(this.f35682, mo29117().headMap(obj));
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new C11933(this.f35682, mo29117().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new C11933(this.f35682, mo29117().tailMap(obj));
    }

    @Override // l.C20400, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public SortedSet keySet() {
        SortedSet sortedSet = this.f35681;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet mo29116 = mo29116();
        this.f35681 = mo29116;
        return mo29116;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SortedSet mo29116() {
        return new C23221(this.f35682, mo29117());
    }
}
