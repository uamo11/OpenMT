package l;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: 713E */
/* renamed from: l.֫ۤܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1764 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f6119 = new AtomicLong(0);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6121 = new AtomicInteger(0);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f6120 = new AtomicLong(0);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6118 = new AtomicInteger(0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f6117 = new ArrayList();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6122 = new AtomicInteger();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5892(String[] strArr, final boolean z, final InterfaceC13818 interfaceC13818) {
        AtomicInteger atomicInteger = this.f6122;
        if (atomicInteger.get() != 0) {
            throw new RuntimeException();
        }
        ExecutorService executorService = null;
        for (String str : strArr) {
            if (interfaceC13818.mo1526()) {
                break;
            }
            AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
            final C7469 c7469 = new C7469(m39866, m39866.getName());
            if (z) {
                c7469.m20013();
            }
            m5891(c7469);
            if (c7469.f23002 && !c7469.f23001) {
                atomicInteger.incrementAndGet();
                if (executorService == null) {
                    executorService = Executors.newSingleThreadExecutor();
                }
                final ExecutorService executorService2 = executorService;
                executorService2.submit(new Runnable() { // from class: l.ۨ۫ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService3 = executorService2;
                        InterfaceC13818 interfaceC138182 = interfaceC13818;
                        C1764.this.m5887(r3.f22994, C9045.m23341(new StringBuilder(), c7469.f22995, "/"), z, executorService3, interfaceC138182);
                    }
                });
                executorService = executorService2;
            }
        }
        while (atomicInteger.get() != 0) {
            SystemClock.sleep(1L);
        }
        if (executorService != null) {
            C1802.m5992(executorService);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m5887(AbstractC15440 abstractC15440, String str, final boolean z, final ExecutorService executorService, final InterfaceC13818 interfaceC13818) {
        boolean mo1526 = interfaceC13818.mo1526();
        AtomicInteger atomicInteger = this.f6122;
        if (mo1526) {
            atomicInteger.decrementAndGet();
            return;
        }
        for (AbstractC15440 abstractC154402 : abstractC15440.mo23549(true)) {
            if (interfaceC13818.mo1526()) {
                atomicInteger.decrementAndGet();
                return;
            }
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(abstractC154402.getName());
            final C7469 c7469 = new C7469(abstractC154402, m15339.toString());
            if (z) {
                c7469.m20013();
            }
            m5891(c7469);
            if (c7469.f23002 && !c7469.f23001) {
                atomicInteger.incrementAndGet();
                executorService.submit(new Runnable() { // from class: l.᩺۫ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExecutorService executorService2 = executorService;
                        InterfaceC13818 interfaceC138182 = interfaceC13818;
                        C1764.this.m5887(r3.f22994, C9045.m23341(new StringBuilder(), c7469.f22995, "/"), z, executorService2, interfaceC138182);
                    }
                });
            }
        }
        atomicInteger.decrementAndGet();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5891(C7469 c7469) {
        synchronized (this.f6117) {
            this.f6117.add(c7469);
        }
        if (!c7469.f23002) {
            this.f6119.addAndGet(c7469.f23003);
        }
        this.f6121.incrementAndGet();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m5896() {
        return this.f6119.get();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m5893() {
        return this.f6120.get();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m5894() {
        return this.f6121.get();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5889() {
        return this.f6118.get();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5890(long j) {
        this.f6120.addAndGet(j);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m5895() {
        this.f6118.incrementAndGet();
    }
}
