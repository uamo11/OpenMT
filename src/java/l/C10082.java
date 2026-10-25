package l;

/* compiled from: 574A */
/* renamed from: l.ۤۚۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10082 implements AutoCloseable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11493 f30367;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12198 f30368;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC5848 f30369 = EnumC5848.WAITING;

    public C10082(C11493 c11493, C12198 c12198) {
        this.f30367 = c11493;
        this.f30368 = c12198;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000f */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m25335() {
        /*
            r4 = this;
            l.ۨۚۜ r0 = r4.f30367
            monitor-enter(r0)
            l.ۛۚۜ r1 = l.EnumC5848.WAITING     // Catch: java.lang.Throwable -> L4a
            l.ۛۚۜ r2 = r4.f30369     // Catch: java.lang.Throwable -> L4a
            if (r2 != r1) goto L34
        L9:
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L4a
            l.ۤۚۜ r1 = l.C12198.m29678(r1)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L15
            r4.m25333()     // Catch: java.lang.Throwable -> L4a
            goto L9
        L15:
            r4.m25332()     // Catch: java.lang.Throwable -> L4a
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L4a
            int r2 = l.C12198.m29681(r1)     // Catch: java.lang.Throwable -> L4a
            int r2 = r2 + (-1)
            l.C12198.m29679(r1, r2)     // Catch: java.lang.Throwable -> L4a
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L4a
            int r2 = l.C12198.m29680(r1)     // Catch: java.lang.Throwable -> L4a
            int r2 = r2 + 1
            l.C12198.m29676(r1, r2)     // Catch: java.lang.Throwable -> L4a
            l.ۛۚۜ r1 = l.EnumC5848.READING     // Catch: java.lang.Throwable -> L4a
            r4.f30369 = r1     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "Unexpected HLS playlist cache lease state: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4a
            l.ۛۚۜ r3 = r4.f30369     // Catch: java.lang.Throwable -> L4a
            r2.append(r3)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4a
            throw r1     // Catch: java.lang.Throwable -> L4a
        L4a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10082.m25335():void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25337() {
        int i;
        synchronized (this.f30367) {
            if (this.f30369 != EnumC5848.READING) {
                return;
            }
            C12198 c12198 = this.f30368;
            i = c12198.f36409;
            c12198.f36409 = i - 1;
            this.f30369 = EnumC5848.RELEASED;
            C11493.m28319(this.f30367, this.f30368);
            this.f30367.notifyAll();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0030 */
    /* JADX WARN: Incorrect condition in loop: B:19:0x0054 */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m25336() {
        /*
            r4 = this;
            l.ۨۚۜ r0 = r4.f30367
            monitor-enter(r0)
            l.ۛۚۜ r1 = l.EnumC5848.READING     // Catch: java.lang.Throwable -> L8e
            l.ۛۚۜ r2 = r4.f30369     // Catch: java.lang.Throwable -> L8e
            if (r2 != r1) goto L78
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L8e
            int r2 = l.C12198.m29680(r1)     // Catch: java.lang.Throwable -> L8e
            r3 = 1
            int r2 = r2 - r3
            l.C12198.m29676(r1, r2)     // Catch: java.lang.Throwable -> L8e
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L8e
            l.ۤۚۜ r1 = l.C12198.m29678(r1)     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L3b
            l.ۛۚۜ r1 = l.EnumC5848.REFRESHING     // Catch: java.lang.Throwable -> L8e
            r4.f30369 = r1     // Catch: java.lang.Throwable -> L8e
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L8e
            l.C12198.m29677(r1, r4)     // Catch: java.lang.Throwable -> L8e
            l.ۨۚۜ r1 = r4.f30367     // Catch: java.lang.Throwable -> L8e
            r1.notifyAll()     // Catch: java.lang.Throwable -> L8e
        L2a:
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L8e
            int r1 = l.C12198.m29680(r1)     // Catch: java.lang.Throwable -> L8e
            if (r1 <= 0) goto L36
            r4.m25333()     // Catch: java.lang.Throwable -> L8e
            goto L2a
        L36:
            r4.m25332()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r3
        L3b:
            l.ۛۚۜ r1 = l.EnumC5848.WAITING     // Catch: java.lang.Throwable -> L8e
            r4.f30369 = r1     // Catch: java.lang.Throwable -> L8e
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L8e
            int r2 = l.C12198.m29681(r1)     // Catch: java.lang.Throwable -> L8e
            int r2 = r2 + r3
            l.C12198.m29679(r1, r2)     // Catch: java.lang.Throwable -> L8e
            l.ۨۚۜ r1 = r4.f30367     // Catch: java.lang.Throwable -> L8e
            r1.notifyAll()     // Catch: java.lang.Throwable -> L8e
        L4e:
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L8e
            l.ۤۚۜ r1 = l.C12198.m29678(r1)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L5a
            r4.m25333()     // Catch: java.lang.Throwable -> L8e
            goto L4e
        L5a:
            r4.m25332()     // Catch: java.lang.Throwable -> L8e
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L8e
            int r2 = l.C12198.m29681(r1)     // Catch: java.lang.Throwable -> L8e
            int r2 = r2 - r3
            l.C12198.m29679(r1, r2)     // Catch: java.lang.Throwable -> L8e
            l.۫ۚۜ r1 = r4.f30368     // Catch: java.lang.Throwable -> L8e
            int r2 = l.C12198.m29680(r1)     // Catch: java.lang.Throwable -> L8e
            int r2 = r2 + r3
            l.C12198.m29676(r1, r2)     // Catch: java.lang.Throwable -> L8e
            l.ۛۚۜ r1 = l.EnumC5848.READING     // Catch: java.lang.Throwable -> L8e
            r4.f30369 = r1     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r1
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = "Unexpected HLS playlist cache lease state: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8e
            l.ۛۚۜ r3 = r4.f30369     // Catch: java.lang.Throwable -> L8e
            r2.append(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L8e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            throw r1     // Catch: java.lang.Throwable -> L8e
        L8e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10082.m25336():boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m25338() {
        C10082 c10082;
        synchronized (this.f30367) {
            if (this.f30369 != EnumC5848.REFRESHING) {
                return;
            }
            c10082 = this.f30368.f36408;
            if (c10082 == this) {
                this.f30368.f36408 = null;
            }
            this.f30369 = EnumC5848.RELEASED;
            C11493.m28319(this.f30367, this.f30368);
            this.f30367.notifyAll();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m25339() {
        synchronized (this.f30367) {
            m25332();
        }
        if (Thread.currentThread().isInterrupted()) {
            throw C11493.m28318("Interrupted while loading HLS playlist", (InterruptedException) null);
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m25333() {
        try {
            this.f30367.wait();
            m25332();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            m25334();
            throw C11493.m28318("Interrupted while waiting for HLS playlist cache", e);
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m25332() {
        boolean z;
        z = this.f30367.f34343;
        if (z || this.f30369 == EnumC5848.RELEASED) {
            throw C11493.m28318("HLS playlist cache lease was released", (InterruptedException) null);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m25334() {
        C10082 c10082;
        int i;
        int i2;
        EnumC5848 enumC5848 = this.f30369;
        EnumC5848 enumC58482 = EnumC5848.WAITING;
        C12198 c12198 = this.f30368;
        if (enumC5848 == enumC58482) {
            i2 = c12198.f36410;
            c12198.f36410 = i2 - 1;
        } else if (enumC5848 == EnumC5848.READING) {
            i = c12198.f36409;
            c12198.f36409 = i - 1;
        } else if (enumC5848 == EnumC5848.REFRESHING) {
            c10082 = c12198.f36408;
            if (c10082 == this) {
                c12198.f36408 = null;
            }
        }
        this.f30369 = EnumC5848.RELEASED;
        C11493 c11493 = this.f30367;
        C11493.m28319(c11493, c12198);
        c11493.notifyAll();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f30367) {
            if (this.f30369 != EnumC5848.RELEASED) {
                m25334();
            }
        }
    }
}
