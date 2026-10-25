package l;

/* compiled from: L9BO */
/* renamed from: l.ۗ᩶ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3459 extends AbstractC4870 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7755 f10954;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C6281 f10955;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f10956;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7755 f10957;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f10958;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7755 f10959;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16864 f10960;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f10961;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7755 f10962;

    @Override // l.AbstractC4870
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10595() {
    }

    public C3459(C6281 c6281, String str, String str2, String str3) {
        super(589824, null);
        this.f10955 = c6281;
        this.f10961 = c6281.m17326(str);
        this.f10958 = c6281.m17326(str2);
        if (str3 != null) {
            this.f10956 = c6281.m17326(str3);
        }
    }

    @Override // l.AbstractC4870
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo10594(String str, boolean z) {
        C6281 c6281 = this.f10955;
        if (z) {
            C7755 m20785 = C7755.m20785(c6281, str, this.f10962);
            this.f10962 = m20785;
            return m20785;
        }
        C7755 m207852 = C7755.m20785(c6281, str, this.f10959);
        this.f10959 = m207852;
        return m207852;
    }

    @Override // l.AbstractC4870
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo10593(int i, C23214 c23214, String str, boolean z) {
        C6281 c6281 = this.f10955;
        if (z) {
            C7755 m20784 = C7755.m20784(c6281, i, c23214, str, this.f10954);
            this.f10954 = m20784;
            return m20784;
        }
        C7755 m207842 = C7755.m20784(c6281, i, c23214, str, this.f10957);
        this.f10957 = m207842;
        return m207842;
    }

    @Override // l.AbstractC4870
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10597(C16864 c16864) {
        c16864.f51744 = this.f10960;
        this.f10960 = c16864;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m10599() {
        int i = this.f10956;
        C6281 c6281 = this.f10955;
        int m39634 = C16864.m39634(c6281, 0, i) + 6 + C7755.m20783(this.f10962, this.f10959, this.f10954, this.f10957);
        C16864 c16864 = this.f10960;
        return c16864 != null ? m39634 + c16864.m39636(c6281) : m39634;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10598(C18276 c18276) {
        c18276.m42618(this.f10961);
        c18276.m42618(this.f10958);
        int i = this.f10956;
        int i2 = i != 0 ? 1 : 0;
        if (this.f10962 != null) {
            i2++;
        }
        if (this.f10959 != null) {
            i2++;
        }
        if (this.f10954 != null) {
            i2++;
        }
        if (this.f10957 != null) {
            i2++;
        }
        C16864 c16864 = this.f10960;
        if (c16864 != null) {
            int i3 = 0;
            while (c16864 != null) {
                i3++;
                c16864 = c16864.f51744;
            }
            i2 += i3;
        }
        c18276.m42618(i2);
        C6281 c6281 = this.f10955;
        C16864.m39635(c6281, 0, i, c18276);
        C7755.m20787(this.f10955, this.f10962, this.f10959, this.f10954, this.f10957, c18276);
        C16864 c168642 = this.f10960;
        if (c168642 != null) {
            c168642.m39639(c6281, c18276);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10596(C11221 c11221) {
        c11221.m27786(this.f10960);
    }
}
