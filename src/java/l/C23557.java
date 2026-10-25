package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Z6PS */
/* renamed from: l.᩻۟ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23557 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17391 f75619;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f75620;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C10421 f75621;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f75623;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C18097 f75624;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RunnableC14568 f75625;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f75626;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int[] f75627;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f75629;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20736 f75630;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14384 f75631;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9584 f75632;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f75622 = new AtomicInteger(1);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicReference f75628 = new AtomicReference();

    public C23557(C18097 c18097, C20736 c20736, C10421 c10421, C9584 c9584, int i, C14384 c14384, boolean z, C17391 c17391, RunnableC14568 runnableC14568) {
        this.f75624 = c18097;
        this.f75630 = c20736;
        this.f75621 = c10421;
        this.f75632 = c9584;
        this.f75620 = i;
        this.f75629 = i;
        this.f75631 = c14384;
        this.f75623 = z;
        this.f75626 = c10421.getFloat(i);
        this.f75619 = c17391;
        this.f75625 = runnableC14568;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52018(int[] iArr) {
        this.f75627 = iArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52017(Executor executor, int i) {
        int[] iArr = this.f75627;
        int size = iArr == null ? this.f75630.size() : iArr.length;
        int max = Math.max(1, (size / Math.max(1, i)) + 1);
        final int i2 = 0;
        while (i2 < size) {
            try {
                final int min = Math.min(max, size - i2) + i2;
                this.f75622.incrementAndGet();
                try {
                    executor.execute(new Runnable() { // from class: l.ᩳ۟ᩳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23557.m52014(C23557.this, i2, min);
                        }
                    });
                } catch (Error | RuntimeException e) {
                    AtomicReference atomicReference = this.f75628;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                    m52015();
                }
                i2 = min;
            } finally {
                m52015();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52014(final C23557 c23557, int i, int i2) {
        AtomicReference atomicReference;
        C14384 c14384;
        try {
            try {
                if (!c23557.f75619.getAsBoolean() && c23557.f75628.get() == null) {
                    C7744 m9797 = ((C2575) c23557.f75624.f56351).m9797();
                    try {
                        m9797.m20766(new Runnable() { // from class: l.ܿ۟ᩳ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C23557.m52013(C23557.this);
                            }
                        });
                        C20873 c20873 = new C20873(m9797);
                        C13862 m47359 = c23557.f75630.m47359();
                        while (i < i2) {
                            int[] iArr = c23557.f75627;
                            int i3 = iArr == null ? i : iArr[i];
                            if (!c23557.f75619.getAsBoolean() && c23557.f75628.get() == null) {
                                if (((i3 != c23557.f75620 && ((c14384 = c23557.f75631) == null || !c14384.m34355(i3))) || c23557.f75621.getFloat(i3) < 0.0f) && (!c23557.f75623 || c23557.f75621.getFloat(i3) < 0.0f)) {
                                    float m28749 = m47359.m33216(i3).m28749(c20873, c23557.f75632);
                                    if (c23557.f75619.getAsBoolean()) {
                                        m9797.close();
                                        return;
                                    }
                                    c23557.f75621.mo4099(m28749, i3);
                                    synchronized (c23557) {
                                        if (m28749 > c23557.f75626) {
                                            c23557.f75626 = m28749;
                                            c23557.f75629 = i3;
                                        }
                                    }
                                }
                                i++;
                            }
                            m9797.close();
                            return;
                        }
                        m9797.close();
                    } catch (Throwable th) {
                        try {
                            m9797.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } finally {
                c23557.m52015();
            }
        } catch (Error e) {
            e = e;
            atomicReference = c23557.f75628;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        } catch (CancellationException unused) {
        } catch (RuntimeException e2) {
            e = e2;
            atomicReference = c23557.f75628;
            while (!atomicReference.compareAndSet(null, e)) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52013(C23557 c23557) {
        if (c23557.f75619.getAsBoolean()) {
            throw new CancellationException();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m52015() {
        if (this.f75622.decrementAndGet() == 0) {
            this.f75625.run();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52019() {
        return this.f75629;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m52016() {
        return (Throwable) this.f75628.get();
    }
}
