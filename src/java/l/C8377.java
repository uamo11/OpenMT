package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: 44KD */
/* renamed from: l.۠᩵ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8377 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21971(Comparator comparator, List list, List list2) {
        Iterator it = list2.iterator();
        for (Object obj : list) {
            if (!it.hasNext()) {
                return 1;
            }
            int compare = comparator.compare(obj, it.next());
            if (compare != 0) {
                return compare;
            }
        }
        return it.hasNext() ? -1 : 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m21972(Set set, Set set2) {
        Comparator comparator;
        Comparator comparator2;
        int compare = Integer.compare(set.size(), set2.size());
        if (compare != 0) {
            return compare;
        }
        if (!(set instanceof SortedSet) || ((comparator2 = ((SortedSet) set).comparator()) != null && !comparator2.equals(AbstractC10232.m25861()))) {
            AbstractC23698.copyOf((Collection) set);
        }
        if (!(set2 instanceof SortedSet) || ((comparator = ((SortedSet) set2).comparator()) != null && !comparator.equals(AbstractC10232.m25861()))) {
            AbstractC23698.copyOf((Collection) set2);
        }
        Iterator it = set2.iterator();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            int compareTo = ((Comparable) it2.next()).compareTo((Comparable) it.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }
}
