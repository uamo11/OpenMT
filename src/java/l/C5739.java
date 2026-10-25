package l;

/* compiled from: A4E9 */
/* renamed from: l.ۛ֫֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5739 extends AbstractC4328 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f17668;

    @Override // l.AbstractC4328, l.InterfaceC1274
    /* renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        if (this.f13928) {
            throw new IllegalStateException("closed");
        }
        if (this.f17668) {
            return -1L;
        }
        long mo4334 = super.mo4334(c12521, 8192L);
        if (mo4334 != -1) {
            return mo4334;
        }
        this.f17668 = true;
        m12985(true, null);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13928) {
            return;
        }
        if (!this.f17668) {
            m12985(false, null);
        }
        this.f13928 = true;
    }
}
