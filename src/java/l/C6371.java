package l;

/* compiled from: 365A */
/* renamed from: l.ۛ᩺ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6371 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m17662(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long[] m17663(long[]... jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i = (int) j;
        C4025.m12105(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i));
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }
}
