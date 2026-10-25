package l;

/* compiled from: K78T */
/* renamed from: l.۠᩺᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8495 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f25958;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f25959;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f25960;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14852 f25961;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f25962;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f25963;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f25965;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f25966;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f25967;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9209 f25968;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25969;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f25970;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14852 f25971;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Thread[] f25972;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f25973;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f25974;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f25975;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f25964 = new Object();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f25976 = -1;

    public C8495(C11691 c11691, C8751 c8751, C9209 c9209) {
        this.f25968 = c9209;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22186(C14852 c14852) {
        Thread[] m22180;
        synchronized (this.f25964) {
            if (!this.f25974 && !c14852.f45299 && !c14852.f45313.m43967()) {
                if (this.f25965 > 0) {
                    this.f25961 = c14852;
                    C14852 c148522 = this.f25971;
                    if ((c148522 != null) && c148522 != c14852) {
                        this.f25967 = true;
                        this.f25960 = true;
                        this.f25964.notifyAll();
                    }
                    return;
                }
                C14852 c148523 = this.f25971;
                if (c148523 != null) {
                    m22180 = null;
                    if (c148523 != c14852) {
                        this.f25961 = c14852;
                        this.f25967 = true;
                        this.f25960 = true;
                        this.f25964.notifyAll();
                    }
                } else {
                    m22180 = m22180(c14852);
                }
                m22175(m22180);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19785 m22185() {
        synchronized (this.f25964) {
            if (this.f25974) {
                return new C0733();
            }
            this.f25965++;
            boolean z = false;
            while (true) {
                int i = this.f25973;
                if (i <= 0 || this.f25969 >= i) {
                    break;
                }
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return new InterfaceC19785() { // from class: l.ۚ᩺᩻
                @Override // java.lang.AutoCloseable
                public final void close() {
                    C8495.m22167(C8495.this);
                }
            };
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22189(C14852 c14852) {
        synchronized (this.f25964) {
            m22181(c14852);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22190(C14852 c14852) {
        boolean z;
        synchronized (this.f25964) {
            m22181(c14852);
            z = false;
            while (this.f25971 == c14852) {
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22181(C14852 c14852) {
        C14852 c148522 = this.f25971;
        if (c148522 == c14852 && c148522 != null) {
            this.f25967 = true;
            this.f25960 = true;
        }
        if (this.f25961 == c14852) {
            this.f25961 = null;
        }
        this.f25964.notifyAll();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22187(String str) {
        C14852 c14852;
        boolean z;
        synchronized (this.f25964) {
            C14852 c148522 = this.f25971;
            z = (c148522 != null && c148522.f45300.equals(str)) || ((c14852 = this.f25961) != null && c14852.f45300.equals(str));
        }
        return z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22188() {
        boolean z;
        synchronized (this.f25964) {
            this.f25974 = true;
            this.f25967 = true;
            this.f25960 = true;
            this.f25961 = null;
            this.f25965 = 0;
            this.f25964.notifyAll();
            z = false;
            while (true) {
                if (!(this.f25971 != null)) {
                    break;
                }
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private Thread[] m22180(final C14852 c14852) {
        if (this.f25974 || c14852.f45299 || c14852.f45313.m43967()) {
            return null;
        }
        final long j = this.f25966 + 1;
        this.f25966 = j;
        Thread[] threadArr = new Thread[2];
        this.f25971 = c14852;
        this.f25972 = threadArr;
        this.f25970 = j;
        this.f25967 = false;
        this.f25960 = false;
        this.f25963 = false;
        this.f25958 = false;
        this.f25959 = false;
        this.f25969 = 0;
        this.f25973 = 2;
        this.f25975 = 0;
        this.f25962 = 0;
        this.f25976 = -1;
        c14852.f45308.size();
        int i = 0;
        while (i < 2) {
            final int i2 = i;
            Runnable runnable = new Runnable() { // from class: l.֨᩺᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C8495.m22168(C8495.this, c14852, j, i2);
                }
            };
            StringBuilder sb = new StringBuilder("MT MCP Smali Cache #");
            int i3 = i + 1;
            sb.append(i3);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            threadArr[i] = thread;
            i = i3;
        }
        return threadArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m22175(java.lang.Thread[] r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r1 = 0
            int r0 = r6.length     // Catch: java.lang.Error -> L1b java.lang.RuntimeException -> L1d
            r2 = 0
            r3 = 0
        L7:
            if (r2 >= r0) goto L13
            r4 = r6[r2]     // Catch: java.lang.Error -> L17 java.lang.RuntimeException -> L19
            r4.start()     // Catch: java.lang.Error -> L17 java.lang.RuntimeException -> L19
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L7
        L13:
            r5.m22171(r6)     // Catch: java.lang.Error -> L17 java.lang.RuntimeException -> L19
            return
        L17:
            r0 = move-exception
            goto L1f
        L19:
            r0 = move-exception
            goto L1f
        L1b:
            r0 = move-exception
            goto L1e
        L1d:
            r0 = move-exception
        L1e:
            r3 = 0
        L1f:
            r2 = r0
            java.lang.Object r0 = r5.f25964
            monitor-enter(r0)
            java.lang.Thread[] r4 = r5.f25972     // Catch: java.lang.Throwable -> L63
            if (r4 != r6) goto L61
            r6 = 1
            r5.f25960 = r6     // Catch: java.lang.Throwable -> L63
            r5.f25967 = r6     // Catch: java.lang.Throwable -> L63
            r5.f25973 = r3     // Catch: java.lang.Throwable -> L63
            r5.f25959 = r6     // Catch: java.lang.Throwable -> L63
            r6 = 0
            if (r3 != 0) goto L4f
            l.ܳ᩻ۜ r3 = r5.f25971     // Catch: java.lang.Throwable -> L63
            r5.f25971 = r6     // Catch: java.lang.Throwable -> L63
            r5.f25972 = r6     // Catch: java.lang.Throwable -> L63
            r5.f25967 = r1     // Catch: java.lang.Throwable -> L63
            r5.f25960 = r1     // Catch: java.lang.Throwable -> L63
            r5.f25963 = r1     // Catch: java.lang.Throwable -> L63
            r5.f25958 = r1     // Catch: java.lang.Throwable -> L63
            r5.f25959 = r1     // Catch: java.lang.Throwable -> L63
            r5.f25973 = r1     // Catch: java.lang.Throwable -> L63
            r5.f25969 = r1     // Catch: java.lang.Throwable -> L63
            r5.f25975 = r1     // Catch: java.lang.Throwable -> L63
            r5.f25962 = r1     // Catch: java.lang.Throwable -> L63
            r6 = -1
            r5.f25976 = r6     // Catch: java.lang.Throwable -> L63
            r6 = r3
        L4f:
            java.lang.Object r1 = r5.f25964     // Catch: java.lang.Throwable -> L63
            r1.notifyAll()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            if (r6 == 0) goto L62
            l.ۡ᩻ۜ r0 = r5.f25968
            java.lang.Object r0 = r0.f27895
            l.᩵᩻ۜ r0 = (l.C19793) r0
            l.C19793.m45508(r0, r6)
            goto L62
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
        L62:
            throw r2
        L63:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8495.m22175(java.lang.Thread[]):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22171(Thread[] threadArr) {
        synchronized (this.f25964) {
            if (this.f25972 == threadArr) {
                this.f25959 = true;
                this.f25964.notifyAll();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22167(C8495 c8495) {
        Thread[] threadArr;
        synchronized (c8495.f25964) {
            int i = c8495.f25965;
            if (i > 0) {
                c8495.f25965 = i - 1;
            }
            threadArr = null;
            if (c8495.f25965 == 0) {
                C14852 c14852 = c8495.f25961;
                if (c14852 != null) {
                    C14852 c148522 = c8495.f25971;
                    if (!(c148522 != null)) {
                        c8495.f25961 = null;
                        threadArr = c8495.m22180(c14852);
                    } else if (c14852 == c148522) {
                        c8495.f25961 = null;
                    } else {
                        c8495.f25967 = true;
                        c8495.f25960 = true;
                    }
                }
                c8495.f25964.notifyAll();
            }
        }
        c8495.m22175(threadArr);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m22174(C14852 c14852, long j) {
        boolean z;
        do {
            synchronized (this.f25964) {
                z = false;
                if (m22184(c14852, j)) {
                    boolean z2 = false;
                    while (this.f25965 > 0 && m22184(c14852, j)) {
                        if (!z2) {
                            int i = this.f25969 + 1;
                            this.f25969 = i;
                            if (i == this.f25973 && !this.f25958) {
                                String str = c14852.f45300;
                                this.f25958 = true;
                            }
                            this.f25964.notifyAll();
                            z2 = true;
                        }
                        try {
                            this.f25964.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            this.f25967 = true;
                            this.f25960 = true;
                        }
                    }
                    if (z2) {
                        int i2 = this.f25969 - 1;
                        this.f25969 = i2;
                        if (i2 < 0) {
                            this.f25969 = 0;
                        }
                        if (this.f25958 && this.f25969 == 0 && this.f25965 == 0 && m22184(c14852, j)) {
                            String str2 = c14852.f45300;
                            this.f25958 = false;
                        }
                        this.f25964.notifyAll();
                    }
                    z = m22184(c14852, j);
                }
            }
            if (!z) {
                return;
            }
        } while (m22183(c14852, j));
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m22184(C14852 c14852, long j) {
        return (this.f25971 != c14852 || this.f25970 != j || this.f25967 || this.f25974 || this.f25960) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22170(C14852 c14852, long j, boolean z) {
        synchronized (this.f25964) {
            if (this.f25971 == c14852 && this.f25970 == j) {
                this.f25963 = true;
                if (!z) {
                    this.f25960 = true;
                    this.f25975 = c14852.f45308.size();
                }
                this.f25964.notifyAll();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m22176(C14852 c14852, long j) {
        boolean z;
        synchronized (this.f25964) {
            while (true) {
                z = true;
                if (this.f25971 != c14852 || this.f25970 != j || this.f25963 || this.f25967 || this.f25974) {
                    break;
                }
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f25967 = true;
                    this.f25960 = true;
                }
            }
            if (!this.f25963 || this.f25971 != c14852 || this.f25970 != j || this.f25967 || this.f25974) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m22178(C14852 c14852, long j) {
        boolean z;
        synchronized (this.f25964) {
            while (true) {
                z = true;
                if (this.f25971 != c14852 || this.f25970 != j || this.f25959 || this.f25967 || this.f25974) {
                    break;
                }
                try {
                    this.f25964.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    this.f25967 = true;
                    this.f25960 = true;
                }
            }
            if (!this.f25959 || this.f25971 != c14852 || this.f25970 != j || this.f25967 || this.f25974) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22168(C8495 c8495, C14852 c14852, long j, int i) {
        boolean m22176;
        try {
            if (c8495.m22178(c14852, j)) {
                if (i == 0) {
                    m22176 = false;
                    try {
                        C19079 c19079 = c14852.f45313;
                        c19079.m43969();
                        if (!c19079.m43968() && !c19079.m43962(c14852.f45308)) {
                            if (!c19079.m43968()) {
                                m22176 = true;
                            }
                        }
                        c8495.m22170(c14852, j, m22176);
                    } catch (Throwable th) {
                        c8495.m22170(c14852, j, false);
                        throw th;
                    }
                } else {
                    m22176 = c8495.m22176(c14852, j);
                }
                if (m22176) {
                    c8495.m22174(c14852, j);
                }
            }
        } finally {
            c8495.m22179(c14852, j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b3, code lost:
    
        m22169(r10, r11);
     */
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m22183(l.C14852 r10, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8495.m22183(l.ܳ᩻ۜ, long):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m22172(C14852 c14852, long j, C17667 c17667) {
        if (m22177(c14852, j)) {
            EnumC7084 m43963 = c14852.f45313.m43963(c17667.f54033);
            if (m43963 == EnumC7084.UNAVAILABLE) {
                m22169(c14852, j);
                return false;
            }
            if (m43963 == EnumC7084.OFFSET || m43963 == EnumC7084.FAILURE) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m22177(C14852 c14852, long j) {
        boolean m22184;
        synchronized (this.f25964) {
            m22184 = m22184(c14852, j);
        }
        return m22184;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22169(C14852 c14852, long j) {
        synchronized (this.f25964) {
            if (this.f25971 == c14852 && this.f25970 == j) {
                this.f25960 = true;
                this.f25967 = true;
                this.f25964.notifyAll();
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m22173(C14852 c14852, long j) {
        int i;
        synchronized (this.f25964) {
            if (this.f25971 == c14852 && this.f25970 == j) {
                int i2 = this.f25962 + 1;
                this.f25962 = i2;
                int size = c14852.f45308.size();
                int i3 = this.f25976;
                if (size > 0 && (i = (int) ((i2 * 100) / size)) != i3) {
                    i3 = i;
                }
                this.f25976 = i3;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m22179(C14852 c14852, long j) {
        int i;
        synchronized (this.f25964) {
            if (this.f25971 == c14852 && this.f25970 == j && (i = this.f25973) > 0) {
                boolean z = true;
                if (i > 1) {
                    this.f25973 = i - 1;
                    this.f25964.notifyAll();
                    return;
                }
                if (this.f25967 || this.f25960 || this.f25974 || this.f25975 < c14852.f45308.size()) {
                    z = false;
                }
                if (z && !c14852.f45313.m43968() && !c14852.f45313.m43965()) {
                    c14852.f45313.m43964(c14852.f45308);
                }
                String str = c14852.f45300;
                c14852.f45313.m43960();
                m22182(c14852, j);
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22182(C14852 c14852, long j) {
        Thread[] threadArr;
        boolean z;
        C14852 c148522;
        synchronized (this.f25964) {
            threadArr = null;
            z = false;
            if (this.f25970 == j && this.f25971 == c14852) {
                this.f25971 = null;
                this.f25972 = null;
                this.f25967 = false;
                this.f25960 = false;
                this.f25963 = false;
                this.f25958 = false;
                this.f25959 = false;
                this.f25973 = 0;
                this.f25969 = 0;
                this.f25975 = 0;
                this.f25962 = 0;
                this.f25976 = -1;
                if (!this.f25974 && this.f25965 == 0 && (c148522 = this.f25961) != null) {
                    this.f25961 = null;
                    threadArr = m22180(c148522);
                }
                this.f25964.notifyAll();
                z = true;
            }
        }
        m22175(threadArr);
        if (z) {
            C19793.m45508((C19793) this.f25968.f27895, c14852);
        }
    }
}
