package l;

/* compiled from: O700 */
/* renamed from: l.ᩳۡܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC17954 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f55976;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15068 f55977;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20777 f55978;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20445 f55979;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7185 f55980;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9302 f55981;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22707 f55982;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f55983;

    public RunnableC17954(C20777 c20777, InterfaceC20445 interfaceC20445, C15068 c15068, int i, C7185 c7185, C9302 c9302, int i2, C22707 c22707) {
        this.f55978 = c20777;
        this.f55979 = interfaceC20445;
        this.f55977 = c15068;
        this.f55976 = i;
        this.f55980 = c7185;
        this.f55981 = c9302;
        this.f55983 = i2;
        this.f55982 = c22707;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12392 c12392;
        boolean m30359;
        C17248 c17248;
        boolean z;
        boolean z2;
        C12392 c123922;
        C17248 c172482;
        C17248 c172483;
        C17248 c172484;
        C17248 c172485;
        C12392 c123923;
        C12392 c123924;
        if (m41951() != 2) {
            return;
        }
        C7185 c7185 = this.f55980;
        if (c7185 != null && c7185.m19250()) {
            c123924 = this.f55978.f67289;
            m30359 = c123924.m30348(this.f55980.m19245(), this.f55980.m19241(), this.f55982.m50727());
        } else {
            c12392 = this.f55978.f67289;
            m30359 = c12392.m30359(this.f55982.m50727());
        }
        if (!m30359) {
            c123923 = this.f55978.f67289;
            c123923.postDelayed(this, 100L);
            return;
        }
        synchronized (this.f55978) {
            c17248 = this.f55978.f67285;
            if (c17248.f52871 == this) {
                c172482 = this.f55978.f67285;
                boolean z3 = c172482.f52866;
                c172483 = this.f55978.f67285;
                z = c172483.f52868;
                c172484 = this.f55978.f67285;
                c172484.f52871 = null;
                this.f55978.m47520();
                C7185 c71852 = this.f55980;
                if (c71852 != null && !z3) {
                    if (!c71852.m19250()) {
                        C20777 c20777 = this.f55978;
                        InterfaceC20445 interfaceC20445 = this.f55979;
                        c172485 = c20777.f67285;
                        C20777.m47498(c20777, interfaceC20445, c172485.f52869.m50726(this.f55982));
                    } else {
                        this.f55978.m47489(this.f55979, this.f55980);
                    }
                    z2 = true;
                }
                this.f55978.m47532();
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
        }
        if (z2) {
            c123922 = this.f55978.f67289;
            c123922.m30405();
            c123922.invalidate();
            if (z) {
                this.f55978.m47506(this.f55979);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[Catch: all -> 0x00ba, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000e, B:9:0x0010, B:11:0x001f, B:13:0x0029, B:15:0x0033, B:17:0x003f, B:19:0x004b, B:22:0x005a, B:24:0x0066, B:26:0x0072, B:32:0x0088, B:34:0x0094, B:36:0x00a0, B:39:0x00ad, B:41:0x00af, B:42:0x00b8), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[Catch: all -> 0x00ba, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000e, B:9:0x0010, B:11:0x001f, B:13:0x0029, B:15:0x0033, B:17:0x003f, B:19:0x004b, B:22:0x005a, B:24:0x0066, B:26:0x0072, B:32:0x0088, B:34:0x0094, B:36:0x00a0, B:39:0x00ad, B:41:0x00af, B:42:0x00b8), top: B:3:0x0003 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m41951() {
        /*
            r6 = this;
            l.᩷ۡܿ r0 = r6.f55978
            monitor-enter(r0)
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.ܿۡܿ r1 = l.C20777.m47476(r1)     // Catch: java.lang.Throwable -> Lba
            l.ᩳۡܿ r1 = r1.f52871     // Catch: java.lang.Throwable -> Lba
            r2 = 0
            if (r1 == r6) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            return r2
        L10:
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.۫ۨᩳ r1 = l.C20777.m47522(r1)     // Catch: java.lang.Throwable -> Lba
            l.۟᩺ᩳ r1 = r1.m30436()     // Catch: java.lang.Throwable -> Lba
            l.᩶᩸ᩳ r3 = r6.f55979     // Catch: java.lang.Throwable -> Lba
            r4 = 1
            if (r1 != r3) goto L59
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.ܶۜܿ r1 = l.C20777.m47517(r1)     // Catch: java.lang.Throwable -> Lba
            l.ܶۜܿ r3 = r6.f55977     // Catch: java.lang.Throwable -> Lba
            if (r1 != r3) goto L59
            l.᩶᩸ᩳ r1 = r6.f55979     // Catch: java.lang.Throwable -> Lba
            int r1 = r1.mo26548()     // Catch: java.lang.Throwable -> Lba
            int r3 = r6.f55976     // Catch: java.lang.Throwable -> Lba
            if (r1 != r3) goto L59
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.ܳۡܿ r1 = l.C20777.m47512(r1)     // Catch: java.lang.Throwable -> Lba
            int r1 = r1.f44223     // Catch: java.lang.Throwable -> Lba
            int r3 = r6.f55983     // Catch: java.lang.Throwable -> Lba
            if (r1 != r3) goto L59
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.ܿۡܿ r1 = l.C20777.m47476(r1)     // Catch: java.lang.Throwable -> Lba
            l.᩺ۖܿ r1 = r1.f52874     // Catch: java.lang.Throwable -> Lba
            l.᩺ۖܿ r3 = r6.f55982     // Catch: java.lang.Throwable -> Lba
            if (r1 != r3) goto L59
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.᩶᩸ᩳ r3 = r6.f55979     // Catch: java.lang.Throwable -> Lba
            int r5 = r6.f55976     // Catch: java.lang.Throwable -> Lba
            boolean r1 = l.C20777.m47503(r1, r3, r5)     // Catch: java.lang.Throwable -> Lba
            if (r1 == 0) goto L59
            r1 = 1
            goto L5a
        L59:
            r1 = 0
        L5a:
            l.᩷ۡܿ r3 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.ܳۡܿ r3 = l.C20777.m47512(r3)     // Catch: java.lang.Throwable -> Lba
            l.ۢۖܿ r3 = r3.f44224     // Catch: java.lang.Throwable -> Lba
            l.ۢۖܿ r5 = r6.f55981     // Catch: java.lang.Throwable -> Lba
            if (r3 != r5) goto L82
            l.᩷ۡܿ r3 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.ܳۡܿ r3 = l.C20777.m47512(r3)     // Catch: java.lang.Throwable -> Lba
            l.۟ۖܿ r3 = r3.f44217     // Catch: java.lang.Throwable -> Lba
            l.۟ۖܿ r5 = r6.f55980     // Catch: java.lang.Throwable -> Lba
            if (r3 != r5) goto L82
            l.᩶᩸ᩳ r3 = r6.f55979     // Catch: java.lang.Throwable -> Lba
            int r3 = r3.length()     // Catch: java.lang.Throwable -> Lba
            l.ۢۖܿ r5 = r6.f55981     // Catch: java.lang.Throwable -> Lba
            int r5 = r5.m23880()     // Catch: java.lang.Throwable -> Lba
            if (r3 != r5) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            if (r1 == 0) goto Laf
            if (r3 != 0) goto L88
            goto Laf
        L88:
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.۫ۨᩳ r1 = l.C20777.m47522(r1)     // Catch: java.lang.Throwable -> Lba
            boolean r1 = r1.isAttachedToWindow()     // Catch: java.lang.Throwable -> Lba
            if (r1 == 0) goto Lad
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.۫ۨᩳ r1 = l.C20777.m47522(r1)     // Catch: java.lang.Throwable -> Lba
            boolean r1 = r1.m30483()     // Catch: java.lang.Throwable -> Lba
            if (r1 == 0) goto Lad
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.۫ۨᩳ r1 = l.C20777.m47522(r1)     // Catch: java.lang.Throwable -> Lba
            boolean r1 = r1.m30532()     // Catch: java.lang.Throwable -> Lba
            if (r1 != 0) goto Lad
            r4 = 2
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            return r4
        Laf:
            l.᩷ۡܿ r1 = r6.f55978     // Catch: java.lang.Throwable -> Lba
            l.ܿۡܿ r1 = l.C20777.m47476(r1)     // Catch: java.lang.Throwable -> Lba
            r3 = 0
            r1.f52871 = r3     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            return r2
        Lba:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lba
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC17954.m41951():int");
    }
}
