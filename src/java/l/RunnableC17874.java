package l;

/* compiled from: VANM */
/* renamed from: l.ᩳۛ᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class RunnableC17874 extends AbstractC2975 implements Runnable, InterfaceC17373 {
    public volatile int runningWorkers;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f54586;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2975 f54587;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Object f54588;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9408 f54589;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17373 f54590;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC17874(AbstractC2975 abstractC2975, int i) {
        this.f54587 = abstractC2975;
        this.f54586 = i;
        InterfaceC17373 interfaceC17373 = abstractC2975 instanceof InterfaceC17373 ? (InterfaceC17373) abstractC2975 : null;
        this.f54590 = interfaceC17373 == null ? C18079.m42140() : interfaceC17373;
        this.f54589 = new C9408();
        this.f54588 = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r0 = r3.f54588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002c, code lost:
    
        r3.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r3.f54589.m24248() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r3.runningWorkers++;
        r1 = l.C8058.f24861;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003b, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            l.ۢۛ᩵ r1 = r3.f54589
            java.lang.Object r1 = r1.m24249()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L29
            r1.run()     // Catch: java.lang.Throwable -> Lf
            goto L15
        Lf:
            r1 = move-exception
            l.᩻᩸᩵ r2 = l.C23974.f77731
            l.C5797.m16273(r1, r2)
        L15:
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            l.ۗۗ᩵ r1 = r3.f54587
            boolean r1 = r1.mo9084()
            if (r1 == 0) goto L1
            l.ۗۗ᩵ r0 = r3.f54587
            r0.mo6030(r3, r3)
            return
        L29:
            java.lang.Object r0 = r3.f54588
            monitor-enter(r0)
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + (-1)
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L46
            l.ۢۛ᩵ r1 = r3.f54589     // Catch: java.lang.Throwable -> L46
            int r1 = r1.m24248()     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L3c
            monitor-exit(r0)
            return
        L3c:
            int r1 = r3.runningWorkers     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + 1
            r3.runningWorkers = r1     // Catch: java.lang.Throwable -> L46
            l.۠۠᩵ r1 = l.C8058.f24861     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            goto L0
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC17874.run():void");
    }

    @Override // l.AbstractC2975
    /* renamed from: ֫ */
    public final void mo6030(InterfaceC14801 interfaceC14801, Runnable runnable) {
        this.f54589.m24247(runnable);
        if (this.runningWorkers >= this.f54586) {
            return;
        }
        synchronized (this.f54588) {
            if (this.runningWorkers >= this.f54586) {
                return;
            }
            this.runningWorkers++;
            this.f54587.mo6030(this, this);
        }
    }
}
