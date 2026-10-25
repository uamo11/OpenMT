package l;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* compiled from: N673 */
/* renamed from: l.ۜۤᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C6708 {
    public static long updateAndGet(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long j;
        long applyAsLong;
        do {
            j = atomicLong.get();
            applyAsLong = longUnaryOperator.applyAsLong(j);
        } while (!atomicLong.compareAndSet(j, applyAsLong));
        return applyAsLong;
    }
}
