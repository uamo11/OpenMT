package l;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: 15PL */
/* renamed from: l.ۧۨܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10979 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27290(List list, InterfaceC16724 interfaceC16724, Comparable comparable, Comparator comparator, EnumC1806 enumC1806, EnumC10108 enumC10108) {
        AbstractList m20014 = C7470.m20014(list, interfaceC16724);
        comparator.getClass();
        enumC1806.getClass();
        enumC10108.getClass();
        if (!(m20014 instanceof RandomAccess)) {
            m20014 = new ArrayList(m20014);
        }
        int size = m20014.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(comparable, m20014.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else {
                if (compare <= 0) {
                    return i + enumC1806.mo6023(comparator, comparable, m20014.subList(i, size + 1), i2 - i);
                }
                i = i2 + 1;
            }
        }
        return enumC10108.mo9353(i);
    }
}
