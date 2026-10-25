package l;

/* compiled from: C5UX */
/* renamed from: l.ۨۗܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11437 {
    /* renamed from: ֫ */
    public abstract AbstractC11437 mo6130(Object obj);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28253(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
