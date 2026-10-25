package l;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* compiled from: N6R3 */
/* renamed from: l.᩻ܽܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class CallableC23824 implements Callable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f77093 = new AtomicInteger();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6891 f77094;

    public CallableC23824(C6891 c6891) {
        this.f77094 = c6891;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AtomicBoolean atomicBoolean;
        CountDownLatch countDownLatch;
        AtomicInteger atomicInteger;
        List list;
        Supplier supplier;
        AtomicInteger atomicInteger2;
        List list2;
        C20736[] c20736Arr;
        List list3;
        C6891 c6891 = this.f77094;
        AtomicInteger atomicInteger3 = this.f77093;
        if (!atomicInteger3.compareAndSet(0, 1)) {
            return null;
        }
        try {
            try {
                if (!C6891.m18669(c6891)) {
                    atomicInteger = c6891.f21293;
                    int i = atomicInteger.get();
                    list = c6891.f21294;
                    if (i < list.size()) {
                        supplier = c6891.f21292;
                        C7744 c7744 = (C7744) supplier.get();
                        try {
                            C14093 m20770 = c7744.m20770();
                            while (!C6891.m18669(c6891)) {
                                atomicInteger2 = c6891.f21293;
                                int andIncrement = atomicInteger2.getAndIncrement();
                                list2 = c6891.f21294;
                                if (andIncrement >= list2.size()) {
                                    break;
                                }
                                c20736Arr = c6891.f21290;
                                list3 = c6891.f21294;
                                c20736Arr[andIncrement] = ((InterfaceC14651) list3.get(andIncrement)).mo13523(m20770);
                            }
                            c7744.close();
                        } catch (Throwable th) {
                            if (c7744 != null) {
                                try {
                                    c7744.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                }
                return null;
            } finally {
                atomicInteger3.set(2);
                countDownLatch = c6891.f21289;
                countDownLatch.countDown();
            }
        } catch (Error | RuntimeException e) {
            atomicBoolean = c6891.f21291;
            atomicBoolean.set(true);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52513() {
        CountDownLatch countDownLatch;
        if (this.f77093.compareAndSet(0, 2)) {
            countDownLatch = this.f77094.f21289;
            countDownLatch.countDown();
        }
    }
}
