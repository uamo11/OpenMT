package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: C5GL */
/* renamed from: l.᩵ܰܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC19508 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18177 f63047;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f63048 = new AtomicBoolean();

    public RunnableC19508(C18177 c18177) {
        this.f63047 = c18177;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f63048.compareAndSet(false, true)) {
            try {
                this.f63047.close();
            } catch (Throwable unused) {
            }
        }
    }
}
