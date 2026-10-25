package l;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: P70P */
/* renamed from: l.ܿܽܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17471 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f53391;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        if (this.f53391) {
            return;
        }
        this.f53391 = true;
        atomicInteger = C14648.f44780;
        if (atomicInteger.decrementAndGet() >= 0) {
            return;
        }
        atomicInteger2 = C14648.f44780;
        atomicInteger2.incrementAndGet();
        throw new IllegalStateException("Hex file channel count underflow");
    }
}
