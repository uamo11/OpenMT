package l;

/* compiled from: E6MO */
/* renamed from: l.᩹ۛۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22097 implements AutoCloseable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19981 f71757;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f71758;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f71759;

    public C22097(C19981 c19981, long j) {
        this.f71757 = c19981;
        this.f71758 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49683(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (j < 0) {
            throw new IllegalArgumentException("Allocation must not be negative");
        }
        synchronized (this.f71757) {
            if (!this.f71759) {
                j2 = this.f71757.f64694;
                j3 = this.f71757.f64697;
                if (j <= j2 - (j3 - this.f71758)) {
                    C19981 c19981 = this.f71757;
                    j4 = c19981.f64697;
                    if (C19981.m46065(c19981, (j4 - this.f71758) + j)) {
                        Runnable runnable = j < this.f71758 ? this.f71757.f64698 : null;
                        C19981 c199812 = this.f71757;
                        j5 = c199812.f64697;
                        c199812.f64697 = (j - this.f71758) + j5;
                        this.f71758 = j;
                        C19981 c199813 = this.f71757;
                        j6 = c199813.f64696;
                        j7 = this.f71757.f64697;
                        c199813.f64696 = Math.max(j6, j7);
                        if (runnable == null) {
                            return true;
                        }
                        runnable.run();
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m49682() {
        long j;
        synchronized (this.f71757) {
            j = this.f71758;
        }
        return j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.f71757) {
            if (this.f71759) {
                return;
            }
            Runnable runnable = this.f71758 > 0 ? this.f71757.f64698 : null;
            C19981 c19981 = this.f71757;
            j = c19981.f64697;
            c19981.f64697 = j - this.f71758;
            this.f71758 = 0L;
            this.f71759 = true;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
