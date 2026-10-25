package l;

/* compiled from: S53J */
/* renamed from: l.ܺۤ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15864 extends AbstractC7479 implements InterfaceC10246 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f49035 = EnumC3664.Format22x;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f49036;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f49037;

    @Override // l.InterfaceC22677
    /* renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " v" + mo1790() + ", v" + mo7930();
    }

    public C15864(EnumC0841 enumC0841, int i, int i2) {
        super(enumC0841);
        C11166.m27701(i);
        this.f49037 = i;
        C11166.m27703(i2);
        this.f49036 = i2;
    }

    @Override // l.InterfaceC1779
    /* renamed from: ֫ */
    public final int mo1790() {
        return this.f49037;
    }

    @Override // l.InterfaceC23651
    /* renamed from: ܶ */
    public final int mo7930() {
        return this.f49036;
    }

    @Override // l.AbstractC7479
    /* renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f49035;
    }
}
