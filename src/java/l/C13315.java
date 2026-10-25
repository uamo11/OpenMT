package l;

import java.util.Comparator;
import java.util.List;

/* compiled from: R4VP */
/* renamed from: l.۬᩵ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13315 implements InterfaceC0345 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32301(List list, Object obj, int i) {
        int compare;
        if (i >= list.size()) {
            i = list.size() - 1;
        }
        Object obj2 = list.get(i);
        Comparator comparator = C18856.f59457;
        int compare2 = comparator.compare(obj2, obj);
        if (compare2 == 0) {
            return i;
        }
        if (compare2 < 0) {
            do {
                i++;
                if (i < list.size()) {
                    compare = comparator.compare(list.get(i), obj);
                    if (compare == 0) {
                        return i;
                    }
                } else {
                    return -(list.size() + 1);
                }
            } while (compare <= 0);
            return -(i + 1);
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int compare3 = comparator.compare(list.get(i2), obj);
            if (compare3 == 0) {
                return i2;
            }
            if (compare3 < 0) {
                return -(i2 + 2);
            }
        }
        return -1;
    }
}
