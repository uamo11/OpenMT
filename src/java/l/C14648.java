package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: P70P */
/* renamed from: l.ܳܽܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14648 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f44780 = new AtomicInteger();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17471 m34938() {
        AtomicInteger atomicInteger;
        int i;
        C17471 c17471 = new C17471();
        do {
            atomicInteger = f44780;
            i = atomicInteger.get();
            if (i >= 128) {
                throw new IOException("Too many open hex file channels");
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        return c17471;
    }
}
