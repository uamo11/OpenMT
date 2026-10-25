package l;

import java.util.Comparator;

/* compiled from: H74F */
/* renamed from: l.ܰۤۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13753 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        C1636 c1636 = (C1636) obj;
        C1636 c16362 = (C1636) obj2;
        C8353 m5512 = c16362.m5512();
        int i5 = m5512.f25633;
        long j = -1;
        long j2 = (i5 <= 0 || (i4 = m5512.f25609) <= 0) ? -1L : i5 * i4;
        C8353 m55122 = c1636.m5512();
        int i6 = m55122.f25633;
        if (i6 > 0 && (i3 = m55122.f25609) > 0) {
            j = i6 * i3;
        }
        int compare = Long.compare(j2, j);
        if (compare != 0) {
            return compare;
        }
        C8353 m55123 = c16362.m5512();
        int i7 = m55123.f25633;
        int min = (i7 <= 0 || (i2 = m55123.f25609) <= 0) ? -1 : Math.min(i7, i2);
        C8353 m55124 = c1636.m5512();
        int i8 = m55124.f25633;
        int compare2 = Integer.compare(min, (i8 <= 0 || (i = m55124.f25609) <= 0) ? -1 : Math.min(i8, i));
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(Math.max(-1, c16362.m5512().f25627), Math.max(-1, c1636.m5512().f25627));
        return compare3 != 0 ? compare3 : Integer.compare(c1636.m5515(), c16362.m5515());
    }
}
