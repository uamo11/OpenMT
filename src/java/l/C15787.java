package l;

/* compiled from: R790 */
/* renamed from: l.ܺ۟ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15787 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f48703;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f48704;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2383 f48705;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f48706;

    public /* synthetic */ C15787(C2383 c2383, long j, int i) {
        this(c2383, j);
    }

    public C15787(C2383 c2383, long j) {
        this.f48703 = -9223372036854775807L;
        this.f48706 = Long.MIN_VALUE;
        this.f48705 = c2383;
        this.f48704 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15787 m37244(C2383 c2383, long j) {
        C15787 c15787 = new C15787(c2383, C13132.FOREVER_NS);
        c15787.f48703 = j;
        return c15787;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m37248(C15787 c15787) {
        return c15787.f48703 == -9223372036854775807L;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m37249(C15787 c15787) {
        long j;
        long j2 = c15787.f48703;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = c15787.f48706;
        j = c15787.f48705.f7591;
        return C0265.m1555(j3, j);
    }
}
