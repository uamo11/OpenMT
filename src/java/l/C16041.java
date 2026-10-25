package l;

/* compiled from: U6VC */
/* renamed from: l.ܺܺܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16041 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f49464;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f49465;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f49466;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49467;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f49468;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f49469;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f49470;

    public C16041(int[] iArr, long j) {
        this.f49469 = iArr;
        this.f49465 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37920(C12164 c12164) {
        int m29611 = c12164.m29611();
        if ((m29611 & 1) != 0) {
            if (!this.f49464) {
                this.f49466 = true;
            } else if (!this.f49470) {
                this.f49468 = true;
            }
        }
        if ((m29611 & 2) != 0 && !this.f49470) {
            this.f49468 = true;
        }
        if ((m29611 & 4) != 0) {
            this.f49470 = true;
        }
        this.f49467 = (int) c12164.m29609();
        this.f49464 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37921(long j) {
        boolean z = this.f49466;
        long j2 = this.f49465;
        if (!z || ((int) (j2 >> 32)) == ((int) (j >> 32))) {
            return !this.f49468 || ((int) j2) == ((int) j);
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m37922(long j) {
        long j2 = this.f49470 ? this.f49467 : (int) j;
        return (j2 & 4294967295L) | (j2 << 32);
    }
}
