package l;

/* compiled from: D8NW */
/* renamed from: l.᩷ۘۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20628 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f66351;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C14276 f66352;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f66353;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f66354;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f66355;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f66356;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long[] f66357;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long[] f66358;

    public C20628(C14276 c14276, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C22632.m50631(iArr.length == jArr2.length);
        C22632.m50631(jArr.length == jArr2.length);
        C22632.m50631(iArr2.length == jArr2.length);
        this.f66352 = c14276;
        this.f66357 = jArr;
        this.f66354 = iArr;
        this.f66355 = i;
        this.f66358 = jArr2;
        this.f66353 = iArr2;
        this.f66351 = j;
        this.f66356 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47166(long j) {
        long[] jArr = this.f66358;
        for (int m11012 = C3603.m11012(jArr, j, true); m11012 < jArr.length; m11012++) {
            if ((this.f66353[m11012] & 1) != 0) {
                return m11012;
            }
        }
        return -1;
    }
}
