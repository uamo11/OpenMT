package l;

/* compiled from: X4UE */
/* renamed from: l.ۗۤ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3165 extends AbstractC7479 implements InterfaceC20994, InterfaceC0804 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC3664 f9960 = EnumC3664.Format4rcc;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f9961;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f9962;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f9963;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC8293 f9964;

    @Override // l.InterfaceC22677
    /* renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315 + " " + C7746.m20773(this) + ", " + getReference() + ", " + mo9710();
    }

    public C3165(EnumC0841 enumC0841, int i, int i2, InterfaceC8293 interfaceC8293, InterfaceC8293 interfaceC82932) {
        super(enumC0841);
        C11166.m27703(i);
        this.f9963 = i;
        C11166.m27709(i2);
        this.f9961 = i2;
        this.f9964 = interfaceC8293;
        this.f9962 = interfaceC82932;
    }

    @Override // l.InterfaceC16595
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int mo9712() {
        return this.f9963;
    }

    @Override // l.InterfaceC6718
    /* renamed from: ᩻ */
    public final int mo3615() {
        return this.f9961;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        return this.f9964;
    }

    @Override // l.InterfaceC0804
    /* renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f9964 = c19357.m44609(this.f9964);
        this.f9962 = c19357.m44609(this.f9962);
    }

    @Override // l.InterfaceC10952
    /* renamed from: ֡ */
    public final int mo3609() {
        return this.f23060.f3318;
    }

    @Override // l.InterfaceC12799
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8293 mo9710() {
        return this.f9962;
    }

    @Override // l.InterfaceC12799
    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int mo9711() {
        return this.f23060.f3317;
    }

    @Override // l.AbstractC7479
    /* renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f9960;
    }
}
