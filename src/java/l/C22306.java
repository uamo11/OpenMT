package l;

/* compiled from: 87AH */
/* renamed from: l.᩹۬ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22306 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C22306 f72317 = new C22306(-1, 0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f72318;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f72319;

    public C22306(long j, long j2) {
        this.f72318 = j < 0 ? -1L : j;
        this.f72319 = j2 <= 0 ? 0L : j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22306 m50047(long j, long j2) {
        C22306 c22306 = new C22306(j, j2);
        return c22306.m50052() ? c22306 : f72317;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22306 m50049(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889 == null) {
            return f72317;
        }
        return m50047(interfaceC17889.mo36969() ? interfaceC17889.getSize() : -1L, interfaceC17889.getTime());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22306 m50048(AbstractC15440 abstractC15440) {
        long j;
        if (abstractC15440 == null) {
            return f72317;
        }
        long j2 = -1;
        try {
            if (abstractC15440.mo23119()) {
                j2 = abstractC15440.mo23127();
            }
        } catch (RuntimeException unused) {
        }
        try {
            j = abstractC15440.mo23117();
        } catch (RuntimeException unused2) {
            j = 0;
        }
        return m50047(j2, j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m50050() {
        return this.f72318;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m50051() {
        return this.f72319;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50054() {
        return this.f72318 >= 0;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m50053() {
        return this.f72319 > 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50052() {
        return m50054() || m50053();
    }
}
