package l;

/* compiled from: U8RL */
/* renamed from: l.ܺۖۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15646 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f48157;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f48158;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f48159;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48160;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48161;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f48162;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f48163;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17714 f48164;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f48165;

    public C15646(C17714 c17714, C17714 c177142, boolean z) {
        this.f48164 = c17714;
        this.f48157 = c177142;
        this.f48159 = z;
        c177142.m41484(12);
        this.f48163 = c177142.m41492();
        c17714.m41484(12);
        this.f48158 = c17714.m41492();
        C22535.m50531("first_chunk must be 1", c17714.m41493() == 1);
        this.f48161 = -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36838() {
        long m41479;
        int i = this.f48161 + 1;
        this.f48161 = i;
        if (i == this.f48163) {
            return false;
        }
        boolean z = this.f48159;
        C17714 c17714 = this.f48157;
        if (z) {
            m41479 = c17714.m41466();
        } else {
            m41479 = c17714.m41479();
        }
        this.f48165 = m41479;
        if (this.f48161 == this.f48162) {
            C17714 c177142 = this.f48164;
            this.f48160 = c177142.m41492();
            c177142.m41478(4);
            int i2 = this.f48158 - 1;
            this.f48158 = i2;
            this.f48162 = i2 > 0 ? c177142.m41492() - 1 : -1;
        }
        return true;
    }
}
