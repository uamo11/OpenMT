package l;

/* compiled from: 28JD */
/* renamed from: l.ۡ᩷ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9130 implements InterfaceC9505 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f27651;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f27652;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f27653;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f27654;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f27655;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f27656;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f27657;

    public C9130(int i, int i2, long j, long j2, boolean z) {
        this.f27657 = j;
        this.f27655 = j2;
        this.f27653 = i2 == -1 ? 1 : i2;
        this.f27652 = i;
        this.f27651 = z;
        if (j == -1) {
            this.f27654 = -1L;
            this.f27656 = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f27654 = j3;
            this.f27656 = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long m23501(long j) {
        return m23502(j);
    }

    @Override // l.InterfaceC9505
    /* renamed from: ܿ */
    public final boolean mo6829() {
        return this.f27654 != -1 || this.f27651;
    }

    @Override // l.InterfaceC9505
    /* renamed from: ֫ */
    public final C6682 mo1721(long j) {
        long j2 = this.f27655;
        long j3 = this.f27654;
        if (j3 == -1 && !this.f27651) {
            C8799 c8799 = new C8799(0L, j2);
            return new C6682(c8799, c8799);
        }
        int i = this.f27653;
        long j4 = i;
        long j5 = (((this.f27652 * j) / 8000000) / j4) * j4;
        if (j3 != -1) {
            j5 = Math.min(j5, j3 - j4);
        }
        long max = j2 + Math.max(j5, 0L);
        long m23502 = m23502(max);
        C8799 c87992 = new C8799(m23502, max);
        if (j3 == -1 || m23502 >= j || i + max >= this.f27657) {
            return new C6682(c87992, c87992);
        }
        long j6 = max + i;
        return new C6682(c87992, new C8799(m23502(j6), j6));
    }

    @Override // l.InterfaceC9505
    /* renamed from: ۜ */
    public final long mo6827() {
        return this.f27656;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m23502(long j) {
        return (Math.max(0L, j - this.f27655) * 8000000) / this.f27652;
    }
}
