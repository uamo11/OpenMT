package l;

import java.util.Iterator;
import java.util.List;

/* compiled from: 05J4 */
/* renamed from: l.۠۬֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC8185 implements InterfaceC20288 {
    @Override // l.InterfaceC10410
    /* renamed from: ۖ */
    public final int mo2302() {
        return 28;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int compare = Integer.compare(28, interfaceC10410.mo2302());
        if (compare != 0) {
            return compare;
        }
        List value = getValue();
        List value2 = ((InterfaceC20288) interfaceC10410).getValue();
        int compare2 = Integer.compare(value.size(), value2.size());
        if (compare2 != 0) {
            return compare2;
        }
        Iterator it = value2.iterator();
        Iterator it2 = value.iterator();
        while (it2.hasNext()) {
            int compareTo = ((Comparable) it2.next()).compareTo(it.next());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC20288) {
            return getValue().equals(((InterfaceC20288) obj).getValue());
        }
        return false;
    }
}
