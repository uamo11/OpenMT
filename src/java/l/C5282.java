package l;

/* compiled from: 05TY */
/* renamed from: l.ۚۤ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5282 extends AbstractC7479 implements InterfaceC1943 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f16512 = EnumC3664.Format32x;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16513;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f16514;

    @Override // l.InterfaceC22677
    /* renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930();
    }

    public C5282(EnumC0841 enumC0841, int i, int i2) {
        super(enumC0841);
        C11166.m27703(i);
        this.f16514 = i;
        C11166.m27703(i2);
        this.f16513 = i2;
    }

    @Override // l.InterfaceC1779
    /* renamed from: ֫ */
    public final int mo1790() {
        return this.f16514;
    }

    @Override // l.InterfaceC23651
    /* renamed from: ܶ */
    public final int mo7930() {
        return this.f16513;
    }

    @Override // l.AbstractC7479
    /* renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f16512;
    }
}
