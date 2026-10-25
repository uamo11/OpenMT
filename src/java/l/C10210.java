package l;

/* compiled from: E8NW */
/* renamed from: l.ۤۢۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10210 implements InterfaceC20088 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30668;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30669;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f30670;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f30671;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f30672;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f30673;

    @Override // l.InterfaceC20088
    public final int getType() {
        return 1752331379;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10210 m25617(C17714 c17714) {
        int m41490 = c17714.m41490();
        c17714.m41478(12);
        c17714.m41490();
        int m414902 = c17714.m41490();
        int m414903 = c17714.m41490();
        c17714.m41478(4);
        int m414904 = c17714.m41490();
        int m414905 = c17714.m41490();
        c17714.m41478(4);
        return new C10210(m41490, m414902, m414903, m414904, m414905, c17714.m41490());
    }

    public C10210(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f30672 = i;
        this.f30673 = i2;
        this.f30669 = i3;
        this.f30668 = i4;
        this.f30670 = i5;
        this.f30671 = i6;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25618() {
        int i = this.f30672;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        C19956.m46037("Found unsupported streamType fourCC: " + Integer.toHexString(i));
        return -1;
    }
}
