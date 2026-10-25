package l;

/* compiled from: A70P */
/* renamed from: l.ۗ֫ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2928 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9309;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12100 f9310;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9311;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8933(int i, boolean z) {
        C12100 m32561;
        if (this.f9309) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("Dirty run length must be positive");
        }
        int i2 = this.f9311;
        if (i2 + i > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f9311 = i2 + i;
        m32561 = C13510.m32561(this.f9310, C13510.m32552(i, z));
        this.f9310 = m32561;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8934(int i, long[] jArr) {
        int m32559;
        C12100 m32560;
        C12100 m32561;
        if (this.f9309) {
            throw new IllegalStateException("Dirty builder already built");
        }
        if (i > 0 && i <= 65536) {
            int length = jArr.length;
            m32559 = C13510.m32559(i);
            if (length == m32559) {
                int i2 = i & 63;
                if (i2 != 0 && (jArr[jArr.length - 1] >>> i2) != 0) {
                    throw new IllegalArgumentException("Dirty bitmap has trailing bits");
                }
                if (this.f9311 + i > 2147483647L) {
                    throw new ArithmeticException("Dirty length overflow");
                }
                m32560 = C13510.m32560(i, jArr);
                if (!m32560.m29514()) {
                    throw new IllegalArgumentException("Uniform dirty bitmap is not canonical");
                }
                this.f9311 += i;
                m32561 = C13510.m32561(this.f9310, m32560);
                this.f9310 = m32561;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid dirty bitmap");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12100 m8932() {
        if (this.f9309) {
            throw new IllegalStateException("Dirty builder already built");
        }
        this.f9309 = true;
        return this.f9310;
    }
}
