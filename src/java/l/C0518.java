package l;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* compiled from: W144 */
/* renamed from: l.֡ܺܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0518 extends Thread {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5458 f2170;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C18864 f2171;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC15334 f2172;

    public C0518(C5458 c5458, InterfaceC15334 interfaceC15334) {
        this.f2170 = c5458;
        this.f2172 = interfaceC15334;
        setPriority(10);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        boolean z;
        AtomicInteger atomicInteger;
        countDownLatch = this.f2170.f16985;
        countDownLatch.countDown();
        while (true) {
            LockSupport.park();
            z = this.f2170.f16988;
            if (z) {
                return;
            }
            this.f2172.mo4061(this.f2171);
            atomicInteger = this.f2170.f16987;
            atomicInteger.decrementAndGet();
        }
    }
}
