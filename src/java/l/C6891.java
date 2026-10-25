package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* compiled from: N6R3 */
/* renamed from: l.ۜܽܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6891 {

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f21286 = Math.min(4, Math.max(1, C17615.f53826 - 1));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BooleanSupplier f21287;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f21288;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f21289;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20736[] f21290;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Supplier f21292;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f21294;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f21293 = new AtomicInteger();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f21291 = new AtomicBoolean();

    public C6891(Supplier supplier, List list, BooleanSupplier booleanSupplier) {
        this.f21292 = supplier;
        this.f21294 = list;
        this.f21287 = booleanSupplier;
        this.f21290 = new C20736[list.size()];
        int min = Math.min(f21286, list.size());
        this.f21288 = min;
        this.f21289 = new CountDownLatch(min);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20736 m18662(Supplier supplier, List list, BooleanSupplier booleanSupplier) {
        C6891 c6891 = new C6891(supplier, list, booleanSupplier);
        CountDownLatch countDownLatch = c6891.f21289;
        AtomicBoolean atomicBoolean = c6891.f21291;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < c6891.f21288; i2++) {
            arrayList.add(new CallableC23824(c6891));
        }
        try {
            try {
                Iterator it = C1802.m5987(C1802.f6207, arrayList).iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).get();
                }
                boolean z = false;
                while (true) {
                    try {
                        countDownLatch.await();
                        break;
                    } catch (InterruptedException unused) {
                        atomicBoolean.set(true);
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
                if (atomicBoolean.get() || c6891.f21287.getAsBoolean()) {
                    return null;
                }
                C20736 c20736 = new C20736();
                C20736[] c20736Arr = c6891.f21290;
                int length = c20736Arr.length;
                while (i < length) {
                    C20736 c207362 = c20736Arr[i];
                    if (c207362 == null) {
                        throw new IllegalStateException("Missing wrap batch result");
                    }
                    c20736.m47354(c207362);
                    i++;
                }
                return c20736;
            } finally {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((CallableC23824) it2.next()).m52513();
                }
                while (true) {
                    try {
                        countDownLatch.await();
                        break;
                    } catch (InterruptedException unused2) {
                        atomicBoolean.set(true);
                        i = 1;
                    }
                }
                if (i != 0) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        } catch (Error | Exception e) {
            atomicBoolean.set(true);
            boolean z2 = e instanceof InterruptedException;
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20736 m18663(C3199 c3199, ArrayList arrayList, C20133 c20133) {
        C20736 c20736 = new C20736();
        C7744 m9797 = c3199.f10081.m9797();
        try {
            C14093 m20770 = m9797.m20770();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC14651 interfaceC14651 = (InterfaceC14651) it.next();
                if (!c20133.getAsBoolean()) {
                    c20736.m47354(interfaceC14651.mo13523(m20770));
                } else {
                    m9797.close();
                    return null;
                }
            }
            m9797.close();
            if (c20133.getAsBoolean()) {
                return null;
            }
            return c20736;
        } catch (Throwable th) {
            try {
                m9797.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m18669(C6891 c6891) {
        return c6891.f21291.get() || c6891.f21287.getAsBoolean();
    }
}
