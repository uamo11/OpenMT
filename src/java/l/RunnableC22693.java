package l;

import java.util.concurrent.ScheduledFuture;

/* compiled from: UAIG */
/* renamed from: l.᩺ۖ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC22693 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f73323;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1567 f73324;

    public RunnableC22693(AbstractC1567 abstractC1567) {
        this.f73324 = abstractC1567;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50704() {
        this.f73323.cancel(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:2|3|(2:5|(3:7|8|9)(1:11))|12|13|14|15|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        r2.printStackTrace(java.lang.System.err);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r4 = this;
            l.֫ۘ֡ r0 = r4.f73324
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r1.getContextClassLoader()
            java.lang.ref.WeakReference r2 = l.AbstractC1567.m5361(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L27
            java.lang.ref.WeakReference r2 = l.AbstractC1567.m5361(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L3c
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L20
            r4.m50704()     // Catch: java.lang.Throwable -> L3c
            goto L34
        L20:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L3c
            r3.setContextClassLoader(r2)     // Catch: java.lang.Throwable -> L3c
        L27:
            r0.mo5376()     // Catch: java.lang.OutOfMemoryError -> L2b java.lang.Exception -> L31 java.lang.Throwable -> L3c
            goto L31
        L2b:
            r2 = move-exception
            java.io.PrintStream r3 = java.lang.System.err     // Catch: java.lang.Throwable -> L3c
            r2.printStackTrace(r3)     // Catch: java.lang.Throwable -> L3c
        L31:
            r0.mo5364()     // Catch: java.lang.Exception -> L34 java.lang.Throwable -> L3c
        L34:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.setContextClassLoader(r1)
            return
        L3c:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.setContextClassLoader(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC22693.run():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50705(ScheduledFuture scheduledFuture) {
        this.f73323 = scheduledFuture;
    }
}
