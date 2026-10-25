package l;

/* compiled from: 57TP */
/* renamed from: l.ۘۤܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3881 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f12401;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f12402;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f12403;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile Object f12404;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f12405;

    public /* synthetic */ C3881(int i) {
        this();
    }

    public C3881() {
        this.f12402 = false;
        this.f12401 = false;
        this.f12405 = false;
        this.f12403 = new Object();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11711(Object obj) {
        synchronized (this.f12403) {
            if (this.f12401 || this.f12405) {
                return false;
            }
            this.f12404 = obj;
            this.f12402 = true;
            this.f12403.notifyAll();
            return true;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m11713() {
        Object obj;
        synchronized (this.f12403) {
            while (!this.f12402 && !this.f12401) {
                this.f12403.wait();
            }
            obj = this.f12402 ? this.f12404 : null;
        }
        return obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11710() {
        synchronized (this.f12403) {
            this.f12401 = true;
            this.f12403.notifyAll();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11712() {
        synchronized (this.f12403) {
            this.f12405 = true;
        }
    }
}
