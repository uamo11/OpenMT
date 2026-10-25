package l;

/* compiled from: T9Q9 */
/* renamed from: l.֡ۢۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0324 extends AbstractC2982 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f1707;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f1708;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1709;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f1710;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f1711;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1712;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f1713;

    public C0324(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f1708 = 0;
        this.f1712 = 0;
        this.f1710 = 0;
        this.f1709 = 0;
        this.f1711 = 0;
        this.f1707 = 0;
    }

    public /* synthetic */ C0324(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m1737();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m1737();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m1737();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m1737();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m1737();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m1734(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m1734(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m1734(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m1734(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32243;
        c9766.m24773(C5969.class, C0324.class);
        return c9766;
    }

    public C0324() {
        this.f1708 = 0;
        this.f1712 = 0;
        this.f1710 = 0;
        this.f1709 = 0;
        this.f1711 = 0;
        this.f1707 = 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1737() {
        super.clear();
        this.f1713 = 0;
        this.f1708 = 0;
        this.f1712 = 0;
        this.f1710 = 0;
        this.f1709 = 0;
        this.f1711 = 0;
        this.f1707 = 0;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C10702.f32245;
        return c17757;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C5969.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C5969.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C5969 build() {
        C5969 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C5969 buildPartial() {
        int i;
        C5969 c5969 = new C5969(this);
        int i2 = this.f1713;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c5969.f18305 = this.f1708;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c5969.f18310 = this.f1712;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c5969.f18307 = this.f1710;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c5969.f18306 = this.f1709;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c5969.f18308 = this.f1711;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c5969.f18304 = this.f1707;
                i |= 32;
            }
            c5969.f18311 = i | c5969.f18311;
        }
        onBuilt();
        return c5969;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C5969) {
            m1732((C5969) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C5969) {
            m1732((C5969) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0324 m1732(C5969 c5969) {
        if (c5969 == C5969.getDefaultInstance()) {
            return this;
        }
        if (c5969.m16723()) {
            m1736(c5969.m16727());
        }
        if (c5969.m16719()) {
            EnumC1030 m16725 = c5969.m16725();
            m16725.getClass();
            this.f1713 |= 2;
            this.f1712 = m16725.getNumber();
            onChanged();
        }
        if (c5969.m16726()) {
            m1735(c5969.m16728());
        }
        if (c5969.m16730()) {
            EnumC10203 m16729 = c5969.m16729();
            m16729.getClass();
            this.f1713 |= 8;
            this.f1709 = m16729.getNumber();
            onChanged();
        }
        if (c5969.m16724()) {
            m1733(c5969.m16722());
        }
        if (c5969.m16720()) {
            EnumC22197 m16721 = c5969.m16721();
            m16721.getClass();
            this.f1713 |= 32;
            this.f1707 = m16721.getNumber();
            onChanged();
        }
        m9115((AbstractC12154) c5969);
        mergeUnknownFields(c5969.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return m9116();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1734(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 8) {
                            int mo19560 = abstractC7297.mo19560();
                            if (EnumC15140.m35839(mo19560) == null) {
                                mergeUnknownVarintField(1, mo19560);
                            } else {
                                this.f1708 = mo19560;
                                this.f1713 |= 1;
                            }
                        } else if (mo19567 == 16) {
                            int mo195602 = abstractC7297.mo19560();
                            if (EnumC1030.m3553(mo195602) == null) {
                                mergeUnknownVarintField(2, mo195602);
                            } else {
                                this.f1712 = mo195602;
                                this.f1713 |= 2;
                            }
                        } else if (mo19567 == 24) {
                            int mo195603 = abstractC7297.mo19560();
                            if (EnumC13024.m31606(mo195603) == null) {
                                mergeUnknownVarintField(3, mo195603);
                            } else {
                                this.f1710 = mo195603;
                                this.f1713 |= 4;
                            }
                        } else if (mo19567 == 32) {
                            int mo195604 = abstractC7297.mo19560();
                            if (EnumC10203.m25606(mo195604) == null) {
                                mergeUnknownVarintField(4, mo195604);
                            } else {
                                this.f1709 = mo195604;
                                this.f1713 |= 8;
                            }
                        } else if (mo19567 == 40) {
                            int mo195605 = abstractC7297.mo19560();
                            if (EnumC4558.m13408(mo195605) == null) {
                                mergeUnknownVarintField(5, mo195605);
                            } else {
                                this.f1711 = mo195605;
                                this.f1713 |= 16;
                            }
                        } else if (mo19567 == 48) {
                            int mo195606 = abstractC7297.mo19560();
                            if (EnumC22197.m49859(mo195606) == null) {
                                mergeUnknownVarintField(6, mo195606);
                            } else {
                                this.f1707 = mo195606;
                                this.f1713 |= 32;
                            }
                        } else if (!parseUnknownField(abstractC7297, c17798, mo19567)) {
                        }
                    }
                    z = true;
                } catch (C2025 e) {
                    throw e.m6586();
                }
            } finally {
                onChanged();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1736(EnumC15140 enumC15140) {
        enumC15140.getClass();
        this.f1713 |= 1;
        this.f1708 = enumC15140.getNumber();
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1735(EnumC13024 enumC13024) {
        enumC13024.getClass();
        this.f1713 |= 4;
        this.f1710 = enumC13024.getNumber();
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1733(EnumC4558 enumC4558) {
        enumC4558.getClass();
        this.f1713 |= 16;
        this.f1711 = enumC4558.getNumber();
        onChanged();
    }
}
