package l;

/* compiled from: K5JX */
/* renamed from: l.ܳۚ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14310 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f43144;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f43145;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m34147() {
        while (!this.f43145) {
            this.f43144.getClass();
            wait();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34150() {
        this.f43145 = false;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34151() {
        if (this.f43145) {
            return false;
        }
        this.f43145 = true;
        notifyAll();
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34152() {
        return this.f43145;
    }

    public C14310() {
        this(InterfaceC16427.f50519);
    }

    public C14310(InterfaceC16427 interfaceC16427) {
        this.f43144 = interfaceC16427;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m34149() {
        boolean z = false;
        while (!this.f43145) {
            try {
                this.f43144.getClass();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m34148(long j) {
        if (j <= 0) {
            return this.f43145;
        }
        long mo33834 = this.f43144.mo33834();
        long j2 = j + mo33834;
        if (j2 < mo33834) {
            m34149();
        } else {
            boolean z = false;
            while (!this.f43145 && mo33834 < j2) {
                try {
                    this.f43144.getClass();
                    wait(j2 - mo33834);
                } catch (InterruptedException unused) {
                    z = true;
                }
                mo33834 = this.f43144.mo33834();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f43145;
    }
}
