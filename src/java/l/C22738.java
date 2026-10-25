package l;

/* compiled from: O8D0 */
/* renamed from: l.᩺ۘۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22738 extends Thread {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f73445 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7216 f73446;

    public C22738(C7216 c7216) {
        InterfaceC12860 interfaceC12860;
        this.f73446 = c7216;
        interfaceC12860 = c7216.f22089;
        interfaceC12860.m31296();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50818() {
        this.f73445 = false;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C10039 c10039;
        C10039 c100392;
        C7216.f22080.fine("JSyn synthesis thread starting.");
        try {
            this.f73446.f22087 = new C10039();
            while (this.f73445) {
                c10039 = this.f73446.f22087;
                c10039.getClass();
                System.nanoTime();
                C7216.m19303(this.f73446);
                this.f73446.m19309();
                c100392 = this.f73446.f22087;
                c100392.m25210();
                if (this.f73446.m19312()) {
                    Thread.sleep(2L);
                }
            }
        } finally {
            try {
                C7216.f22080.info("JSyn synthesis thread in finally code.");
                C7216.f22080.fine("JSyn synthesis thread exiting.");
            } catch (Throwable th) {
            }
        }
        C7216.f22080.info("JSyn synthesis thread in finally code.");
        C7216.f22080.fine("JSyn synthesis thread exiting.");
    }
}
