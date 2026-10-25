package l;

/* compiled from: 56UC */
/* renamed from: l.᩵۬ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19489 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1143 f62986;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18783 f62987;

    public C19489(C1143 c1143, C18783 c18783) {
        this.f62986 = c1143;
        this.f62987 = c18783;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11002 m44896() {
        C18783 c18783 = this.f62987;
        if (c18783 == null) {
            throw new IllegalStateException("Page lease is closed");
        }
        return c18783.f59296;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C21605 c21605;
        synchronized (this.f62986) {
            C18783 c18783 = this.f62987;
            c21605 = null;
            if (c18783 != null) {
                c18783.f59297--;
                C21605 c216052 = c18783.f59298.f25202;
                this.f62987 = null;
                this.f62986.notifyAll();
                c21605 = c216052;
            }
        }
        if (c21605 != null) {
            c21605.m48812();
        }
    }
}
