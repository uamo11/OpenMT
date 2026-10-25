package l;

/* compiled from: 56UC */
/* renamed from: l.ۚ۬ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5377 implements AutoCloseable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1143 f16729;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f16730 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f16731;

    public C5377(C1143 c1143, long j) {
        this.f16729 = c1143;
        this.f16731 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5377 m15350(long j) {
        synchronized (this.f16729) {
            if (!this.f16730) {
                throw new IllegalStateException("Workspace reservation is closed");
            }
        }
        return this.f16729.m3921(j);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.f16729) {
            if (this.f16730) {
                this.f16730 = false;
                C1143 c1143 = this.f16729;
                j = c1143.f4151;
                c1143.f4151 = j - this.f16731;
                this.f16729.notifyAll();
            }
        }
    }
}
