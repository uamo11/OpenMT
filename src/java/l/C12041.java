package l;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;

/* compiled from: 0JF */
/* renamed from: l.ۨ᩻ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12041 extends AbstractC14716 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C16601 f36027 = new C16601(1);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2372 f36028;

    public C12041(C2372 c2372) {
        this.f36028 = c2372;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((C9428) this.f36028.mo5874(((InterfaceC11544) obj).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((C9428) this.f36028.mo5872(((InterfaceC11544) obj).mo15639(), ((InterfaceC11544) obj2).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((C9428) this.f36028.mo5871(((InterfaceC11544) obj).mo15639())).mo5869();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f36027;
    }

    @Override // l.AbstractC14716, l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC14884 iterator() {
        return new C7807(this.f36028);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        return entry.equals(this.f36028.m7687(((Integer) entry.getKey()).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int intValue = ((Integer) entry.getKey()).intValue();
            C2372 c2372 = this.f36028;
            C14156 m7687 = c2372.m7687(intValue);
            if (m7687 != null && C11003.equals(m7687.f17058, entry.getValue())) {
                c2372.remove(m7687.f17057);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f36028.f7577;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f36028.clear();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return this.f36028.f7571;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return this.f36028.f7575;
    }
}
