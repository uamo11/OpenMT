package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: 3B3L */
/* renamed from: l.ۗ۠ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3117 implements InterfaceC18581 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f9739 = new AtomicBoolean();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FutureC3575 f9740;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20256 f9741;

    @Override // l.InterfaceC18581
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo9498() {
    }

    public C3117(FutureC3575 futureC3575, C20256 c20256) {
        this.f9740 = futureC3575;
        this.f9741 = c20256;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x001d  */
    @Override // l.InterfaceC18581
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo9497() {
        /*
            r6 = this;
            l.᩶ܶᩳ r0 = r6.f9741
            java.util.concurrent.atomic.AtomicBoolean r1 = r6.f9739
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 == r3) goto L41
            r2 = 1
            r3 = 0
            l.ۗ᩻᩵ r4 = r6.f9740     // Catch: java.util.concurrent.CancellationException -> L16 java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L2f
            r4.get()     // Catch: java.util.concurrent.CancellationException -> L16 java.util.concurrent.ExecutionException -> L18 java.lang.InterruptedException -> L2f
            return
        L16:
            r4 = move-exception
            goto L19
        L18:
            r4 = move-exception
        L19:
            boolean r5 = r4 instanceof java.util.concurrent.ExecutionException
            if (r5 == 0) goto L21
            java.lang.Throwable r4 = r4.getCause()
        L21:
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L40
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L40
            r0.m46502(r4)
            goto L40
        L2f:
            r4 = move-exception
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L40
            r0.m46502(r4)
        L40:
            return
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment state persistence must wait in the background"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3117.mo9497():void");
    }
}
