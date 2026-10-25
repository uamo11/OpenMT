package l;

import java.util.HashMap;

/* compiled from: 1B34 */
/* renamed from: l.ܽۗܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16373 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f50368 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17079 f50369;

    /* JADX WARN: Incorrect condition in loop: B:11:0x001b */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized l.C10730 m38538(java.lang.String r6) {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            java.util.HashMap r1 = r5.f50368     // Catch: java.lang.Throwable -> L38
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L38
            l.ۧۗܳ r1 = (l.C10730) r1     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L2a
            java.lang.Boolean r6 = r1.f32327     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L12
            r6 = 1
            goto L13
        L12:
            r6 = 0
        L13:
            if (r6 != 0) goto L36
        L15:
            l.ܿۗܳ r6 = r1.f32328     // Catch: java.lang.Throwable -> L38
            boolean r6 = l.C17079.m40088(r6)     // Catch: java.lang.Throwable -> L38
            if (r6 != 0) goto L36
            java.util.concurrent.CountDownLatch r6 = r1.f32326     // Catch: java.lang.InterruptedException -> L36 java.lang.Throwable -> L38
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L36 java.lang.Throwable -> L38
            r3 = 1
            boolean r6 = r6.await(r3, r2)     // Catch: java.lang.InterruptedException -> L36 java.lang.Throwable -> L38
            if (r6 == 0) goto L15
            goto L36
        L2a:
            l.ۧۗܳ r1 = new l.ۧۗܳ     // Catch: java.lang.Throwable -> L38
            l.ܿۗܳ r2 = r5.f50369     // Catch: java.lang.Throwable -> L38
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            java.util.HashMap r2 = r5.f50368     // Catch: java.lang.Throwable -> L38
            r2.put(r6, r1)     // Catch: java.lang.Throwable -> L38
        L36:
            monitor-exit(r0)
            return r1
        L38:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16373.m38538(java.lang.String):l.ۧۗܳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38539() {
        this.f50368.clear();
    }

    public C16373(C17079 c17079) {
        this.f50369 = c17079;
    }
}
