package l;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* compiled from: O5F3 */
/* renamed from: l.᩸ۨܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21562 extends AbstractC6539 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13758 f69281;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final NavigableMap f69282;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13758 f69283;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final NavigableMap f69284;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return C13053.f39070;
    }

    public /* synthetic */ C21562(C13758 c13758, C13758 c137582, NavigableMap navigableMap, int i) {
        this(c13758, c137582, navigableMap);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return m48721(C13758.m33066((AbstractC3675) obj, EnumC3717.m11309(z)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m48721(C13758.m33062((AbstractC3675) obj, EnumC3717.m11309(z), (AbstractC3675) obj2, EnumC3717.m11309(z2)));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return m48721(C13758.m33061((AbstractC3675) obj, EnumC3717.m11309(z)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private NavigableMap m48721(C13758 c13758) {
        C13758 c137582 = this.f69283;
        if (!c13758.m33078(c137582)) {
            return C18054.of();
        }
        return new C21562(c137582.m33076(c13758), this.f69281, this.f69284);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final C13758 get(Object obj) {
        C13758 c13758 = this.f69281;
        if (obj instanceof AbstractC3675) {
            try {
                AbstractC3675 abstractC3675 = (AbstractC3675) obj;
                if (this.f69283.m33073(abstractC3675) && abstractC3675.compareTo(c13758.f41052) >= 0 && abstractC3675.compareTo(c13758.f41053) < 0) {
                    boolean equals = abstractC3675.equals(c13758.f41052);
                    NavigableMap navigableMap = this.f69284;
                    if (equals) {
                        Map.Entry floorEntry = navigableMap.floorEntry(abstractC3675);
                        C13758 c137582 = (C13758) (floorEntry == null ? null : floorEntry.getValue());
                        if (c137582 != null && c137582.f41053.compareTo(c13758.f41052) > 0) {
                            return c137582.m33076(c13758);
                        }
                    } else {
                        C13758 c137583 = (C13758) navigableMap.get(abstractC3675);
                        if (c137583 != null) {
                            return c137583.m33076(c13758);
                        }
                    }
                }
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // l.AbstractC9527
    /* renamed from: ֫ */
    public final Iterator mo15281() {
        Iterator it;
        C13758 c13758 = this.f69281;
        boolean m33072 = c13758.m33072();
        AbstractC3675 abstractC3675 = c13758.f41052;
        if (m33072) {
            return C0414.f1880;
        }
        C13758 c137582 = this.f69283;
        AbstractC3675 abstractC36752 = c137582.f41053;
        AbstractC3675 abstractC36753 = c137582.f41052;
        if (abstractC36752.mo7489((Comparable) abstractC3675)) {
            return C0414.f1880;
        }
        if (abstractC36753.mo7489((Comparable) abstractC3675)) {
            it = ((C5334) this.f69282).tailMap(abstractC3675, false).values().iterator();
        } else {
            it = this.f69284.tailMap((AbstractC3675) abstractC36753.mo11188(), abstractC36753.mo7490() == EnumC3717.CLOSED).values().iterator();
        }
        return new C8156(this, it, (AbstractC3675) C13053.f39070.mo22481(c137582.f41053, AbstractC3675.m11186(c13758.f41053)));
    }

    @Override // l.AbstractC6539
    /* renamed from: ۧ */
    public final Iterator mo15282() {
        C13758 c13758 = this.f69281;
        if (c13758.m33072()) {
            return C0414.f1880;
        }
        AbstractC3675 abstractC3675 = (AbstractC3675) C13053.f39070.mo22481(this.f69283.f41053, AbstractC3675.m11186(c13758.f41053));
        return new C15210(this, this.f69284.headMap((AbstractC3675) abstractC3675.mo11188(), abstractC3675.mo7492() == EnumC3717.CLOSED).descendingMap().values().iterator());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return C4648.m13616(mo15281());
    }

    public C21562(C13758 c13758, C13758 c137582, NavigableMap navigableMap) {
        c13758.getClass();
        this.f69283 = c13758;
        c137582.getClass();
        this.f69281 = c137582;
        navigableMap.getClass();
        this.f69284 = navigableMap;
        this.f69282 = new C5334(navigableMap);
    }
}
