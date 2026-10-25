package l;

/* compiled from: 06UY */
/* renamed from: l.ܶ۬ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15253 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f46828;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21605 f46829;

    public C15253(C21605 c21605) {
        this.f46829 = c21605;
    }

    public final void flush() {
        synchronized (this.f46829.f69370.f4153) {
            if (this.f46828) {
                throw new IllegalStateException("Recovery append batch is closed");
            }
            ((C15959) this.f46829.f69371).flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.AutoCloseable
    public final void close() {
        int i;
        C5377 c5377;
        C5377 c53772;
        C5377 c53773;
        C5377 c53774;
        synchronized (this.f46829.f69370.f4153) {
            if (this.f46828) {
                return;
            }
            this.f46828 = true;
            C21605 c21605 = this.f46829;
            i = c21605.f69381;
            int i2 = i - 1;
            c21605.f69381 = i2;
            if (i2 == 0) {
                try {
                    ((C15959) this.f46829.f69371).m37735();
                    c53773 = this.f46829.f69380;
                    if (c53773 != null) {
                        c53774 = this.f46829.f69380;
                        c53774.close();
                    }
                    this.f46829.f69380 = null;
                } catch (Throwable th) {
                    c5377 = this.f46829.f69380;
                    if (c5377 != null) {
                        c53772 = this.f46829.f69380;
                        c53772.close();
                    }
                    this.f46829.f69380 = null;
                    throw th;
                }
            } else {
                ((C15959) this.f46829.f69371).flush();
            }
        }
    }
}
