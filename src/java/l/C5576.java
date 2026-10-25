package l;

/* compiled from: X598 */
/* renamed from: l.ۚ᩶ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5576 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17270;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f17271;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1342 f17272;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1342 f17273;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5576 f17274;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1342 f17275;

    public C5576(C1342 c1342, C1342 c13422, C1342 c13423, int i, String str) {
        this.f17272 = c1342;
        this.f17273 = c13422;
        this.f17275 = c13423;
        this.f17270 = i;
        this.f17271 = str;
    }

    public C5576(C5576 c5576, C1342 c1342, C1342 c13422) {
        this(c1342, c13422, c5576.f17275, c5576.f17270, c5576.f17271);
        this.f17274 = c5576.f17274;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5576 m15844(C5576 c5576, C1342 c1342, C1342 c13422) {
        if (c5576 == null) {
            return null;
        }
        C1342 c13423 = c5576.f17272;
        C5576 m15844 = m15844(c5576.f17274, c1342, c13422);
        c5576.f17274 = m15844;
        int i = c13423.f4874;
        C1342 c13424 = c5576.f17273;
        int i2 = c13424.f4874;
        int i3 = c1342.f4874;
        int i4 = c13422 == null ? Integer.MAX_VALUE : c13422.f4874;
        if (i3 >= i2 || i4 <= i) {
            return c5576;
        }
        if (i3 <= i) {
            return i4 >= i2 ? m15844 : new C5576(c5576, c13422, c13424);
        }
        if (i4 >= i2) {
            return new C5576(c5576, c13423, c1342);
        }
        c5576.f17274 = new C5576(c5576, c13422, c13424);
        return new C5576(c5576, c13423, c1342);
    }
}
