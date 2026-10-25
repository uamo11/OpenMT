package l;

/* compiled from: 7704 */
/* renamed from: l.᩻ۢܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23619 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f76533;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f76534;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76535;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f76536;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f76537;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76538;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C6686 f76539;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52105(C6686 c6686, int i, int i2) {
        C17975 c17975;
        int i3;
        c6686.m18225(i, i2);
        if (i == i2) {
            throw new IllegalArgumentException("Empty syntax context cursor range");
        }
        this.f76539 = c6686;
        this.f76538 = i2;
        c17975 = c6686.f20768;
        i3 = c6686.f20772;
        this.f76537 = c17975.m42008(i - i3);
        m52103(i);
        this.f76533 = true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m52109() {
        int i;
        C17975 c17975;
        if (!this.f76533 || this.f76534 >= this.f76538) {
            this.f76533 = false;
            return false;
        }
        this.f76537++;
        i = this.f76539.f20772;
        c17975 = this.f76539.f20768;
        m52103(i + c17975.m42009(this.f76537));
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m52108() {
        this.f76539 = null;
        this.f76533 = false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52107() {
        return this.f76535;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52104() {
        return this.f76534;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52106() {
        return this.f76536;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52103(int i) {
        int i2;
        C17975 c17975;
        C17975 c179752;
        this.f76535 = i;
        int i3 = this.f76538;
        i2 = this.f76539.f20772;
        c17975 = this.f76539.f20768;
        this.f76534 = Math.min(i3, i2 + c17975.m42017(this.f76537));
        c179752 = this.f76539.f20768;
        this.f76536 = c179752.m42016(this.f76537);
    }
}
