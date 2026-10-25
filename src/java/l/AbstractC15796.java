package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* compiled from: N673 */
/* renamed from: l.ܺ۟ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC15796 {
    public static Set a(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC6043) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC6043 enumC6043 = (EnumC6043) it.next();
                    hashSet.add(enumC6043 == null ? null : enumC6043 == EnumC6043.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC6043 == EnumC6043.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e) {
                    C16461.a(e, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                C16461.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it2.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? EnumC6043.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? EnumC6043.UNORDERED : EnumC6043.IDENTITY_FINISH);
                } catch (ClassCastException e2) {
                    C16461.a(e2, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
