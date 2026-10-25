package l;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: H9D4 */
/* renamed from: l.ܰ֫ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C13503 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f40314 = new AtomicInteger(1);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13503 m32531() {
        if (this.f40314.getAndIncrement() > 0) {
            return this;
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32532() {
        return this.f40314.decrementAndGet() <= 0;
    }
}
