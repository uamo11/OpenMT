package l;

/* compiled from: 54FG */
/* renamed from: l.ۢܰ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC9633 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8927 f29191;

    public RunnableC9633(C8927 c8927) {
        this.f29191 = c8927;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            long m23031 = this.f29191.m23031(System.nanoTime());
            if (m23031 == -1) {
                return;
            }
            if (m23031 > 0) {
                long j = m23031 / 1000000;
                long j2 = m23031 - (1000000 * j);
                synchronized (this.f29191) {
                    try {
                        this.f29191.wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }
}
