package l;

/* compiled from: IBDV */
/* renamed from: l.֫ܺܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1929 extends C17535 implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1929 c1929) {
        int size = size();
        int size2 = c1929.size();
        int i = size < size2 ? size : size2;
        for (int i2 = 0; i2 < i; i2++) {
            int compareTo = ((AbstractC13717) m40978(i2)).compareTo((AbstractC13717) c1929.m40978(i2));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }
}
