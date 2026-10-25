package l;

/* compiled from: N6PY */
/* renamed from: l.ۖܰۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2569 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f8123 = System.nanoTime();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8120() {
        if (Thread.currentThread().isInterrupted() || System.nanoTime() - this.f8123 > 5000000000L) {
            throw C5391.m15357(EnumC0451.LIMIT, "Formatting interrupted or time limit exceeded");
        }
    }
}
