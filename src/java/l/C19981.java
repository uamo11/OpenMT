package l;

/* compiled from: E6MO */
/* renamed from: l.᩶ۛۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19981 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f64694;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22097 f64695;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f64696;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f64697;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Runnable f64698;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x0008, B:8:0x0011, B:10:0x0016, B:16:0x002b, B:23:0x0042, B:24:0x0049), top: B:4:0x0006 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized l.C22097 m46068(long r8) {
        /*
            r7 = this;
            r0 = r7
            monitor-enter(r0)
            r1 = 0
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L42
            long r1 = r7.f64694     // Catch: java.lang.Throwable -> L4a
            long r3 = r7.f64697     // Catch: java.lang.Throwable -> L4a
            long r1 = r1 - r3
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 > 0) goto L3f
            long r3 = r3 + r8
            l.᩹ۛۜ r1 = r7.f64695     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L27
            long r5 = r1.m49682()     // Catch: java.lang.Throwable -> L4a
            long r2 = java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r1.m49683(r2)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L25
            goto L27
        L25:
            r1 = 0
            goto L28
        L27:
            r1 = 1
        L28:
            if (r1 != 0) goto L2b
            goto L3f
        L2b:
            long r1 = r7.f64697     // Catch: java.lang.Throwable -> L4a
            long r1 = r1 + r8
            r7.f64697 = r1     // Catch: java.lang.Throwable -> L4a
            long r3 = r7.f64696     // Catch: java.lang.Throwable -> L4a
            long r1 = java.lang.Math.max(r3, r1)     // Catch: java.lang.Throwable -> L4a
            r7.f64696 = r1     // Catch: java.lang.Throwable -> L4a
            l.᩹ۛۜ r1 = new l.᩹ۛۜ     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            return r1
        L3f:
            monitor-exit(r0)
            r8 = 0
            return r8
        L42:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r9 = "Reservation must not be negative"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L4a
            throw r8     // Catch: java.lang.Throwable -> L4a
        L4a:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19981.m46068(long):l.᩹ۛۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m46069(RunnableC19472 runnableC19472) {
        this.f64698 = runnableC19472;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long m46070() {
        return this.f64697;
    }

    public C19981(long j, C22097 c22097) {
        if (j <= 0) {
            throw new IllegalArgumentException("Bitmap budget must be positive");
        }
        this.f64694 = j;
        this.f64695 = c22097;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m46065(C19981 c19981, long j) {
        C22097 c22097 = c19981.f64695;
        return c22097 == null || c22097.m49683(Math.max(j, c22097.m49682()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m46067() {
        return this.f64694;
    }
}
