package l;

/* compiled from: 17QY */
/* renamed from: l.ܰۧۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C13770 extends EnumC7421 {
    public /* synthetic */ C13770() {
        this("AMBIGUOUS", 4, false);
    }

    public C13770(String str, int i, boolean z) {
        super(str, i, 0, z);
    }

    @Override // l.EnumC7421
    /* renamed from: ֫ */
    public EnumC7421 mo16823(EnumC12360 enumC12360) {
        int i = C13065.f39136[enumC12360.ordinal()];
        if (i == 1) {
            return EnumC7421.f22807;
        }
        if (i == 2 || i == 3) {
            return EnumC7421.f22803;
        }
        if (i == 4) {
            return EnumC7421.f22805;
        }
        throw new AssertionError();
    }
}
