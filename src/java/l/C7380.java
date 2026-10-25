package l;

/* compiled from: T9Q9 */
/* renamed from: l.۟ۢۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7380 extends AbstractC19916 implements InterfaceC3583 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15722 f22647;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5969 f22648;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5969 f22649;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15722 f22650;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22651;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f22652;

    public /* synthetic */ C7380(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m19837();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m19837();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m19837();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m19837();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m19839(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m19839(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m19839(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m19839(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32264;
        c9766.m24773(C1715.class, C7380.class);
        return c9766;
    }

    public C7380() {
        this.f22652 = 0;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m19836();
            m19835();
        }
    }

    public C7380(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f22652 = 0;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m19836();
            m19835();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19837() {
        super.clear();
        this.f22651 = 0;
        this.f22652 = 0;
        this.f22649 = null;
        C15722 c15722 = this.f22647;
        if (c15722 != null) {
            c15722.m37102();
            this.f22647 = null;
        }
        this.f22648 = null;
        C15722 c157222 = this.f22650;
        if (c157222 != null) {
            c157222.m37102();
            this.f22650 = null;
        }
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C10702.f32270;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C1715.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C1715.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C1715 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C1715 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C1715 buildPartial() {
        C5969 c5969;
        C5969 c59692;
        int i = 0;
        C1715 c1715 = new C1715(this, 0);
        int i2 = this.f22651;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c1715.f5930 = this.f22652;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C15722 c15722 = this.f22647;
                if (c15722 == null) {
                    c59692 = this.f22649;
                } else {
                    c59692 = (C5969) c15722.m37099();
                }
                c1715.f5926 = c59692;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15722 c157222 = this.f22650;
                if (c157222 == null) {
                    c5969 = this.f22648;
                } else {
                    c5969 = (C5969) c157222.m37099();
                }
                c1715.f5928 = c5969;
                i |= 4;
            }
            c1715.f5929 = i | c1715.f5929;
        }
        onBuilt();
        return c1715;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1715) {
            m19838((C1715) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1715) {
            m19838((C1715) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19838(C1715 c1715) {
        C5969 c5969;
        C5969 c59692;
        if (c1715 == C1715.getDefaultInstance()) {
            return;
        }
        if (c1715.m5753()) {
            EnumC3478 m5752 = c1715.m5752();
            m5752.getClass();
            this.f22651 |= 1;
            this.f22652 = m5752.getNumber();
            onChanged();
        }
        if (c1715.m5751()) {
            C5969 m5754 = c1715.m5754();
            C15722 c15722 = this.f22647;
            if (c15722 == null) {
                if ((this.f22651 & 2) == 0 || (c59692 = this.f22649) == null || c59692 == C5969.getDefaultInstance()) {
                    this.f22649 = m5754;
                } else {
                    this.f22651 |= 2;
                    onChanged();
                    ((C0324) m19836().m37104()).m1732(m5754);
                }
            } else {
                c15722.m37098(m5754);
            }
            if (this.f22649 != null) {
                this.f22651 |= 2;
                onChanged();
            }
        }
        if (c1715.m5755()) {
            C5969 m5756 = c1715.m5756();
            C15722 c157222 = this.f22650;
            if (c157222 == null) {
                if ((this.f22651 & 4) == 0 || (c5969 = this.f22648) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f22648 = m5756;
                } else {
                    this.f22651 |= 4;
                    onChanged();
                    ((C0324) m19835().m37104()).m1732(m5756);
                }
            } else {
                c157222.m37098(m5756);
            }
            if (this.f22648 != null) {
                this.f22651 |= 4;
                onChanged();
            }
        }
        mergeUnknownFields(c1715.getUnknownFields());
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19839(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 24) {
                            int mo19560 = abstractC7297.mo19560();
                            if (EnumC3478.m10650(mo19560) == null) {
                                mergeUnknownVarintField(3, mo19560);
                            } else {
                                this.f22652 = mo19560;
                                this.f22651 |= 1;
                            }
                        } else if (mo19567 == 34) {
                            abstractC7297.mo19556(m19836().m37104(), c17798);
                            this.f22651 |= 2;
                        } else if (mo19567 == 42) {
                            abstractC7297.mo19556(m19835().m37104(), c17798);
                            this.f22651 |= 4;
                        } else if (!super.parseUnknownField(abstractC7297, c17798, mo19567)) {
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

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        C5969 c5969;
        C5969 c59692;
        if ((this.f22651 & 2) != 0) {
            C15722 c15722 = this.f22647;
            if (c15722 == null) {
                c59692 = this.f22649;
                if (c59692 == null) {
                    c59692 = C5969.getDefaultInstance();
                }
            } else {
                c59692 = (C5969) c15722.m37103();
            }
            if (!c59692.isInitialized()) {
                return false;
            }
        }
        if ((this.f22651 & 4) == 0) {
            return true;
        }
        C15722 c157222 = this.f22650;
        if (c157222 == null) {
            c5969 = this.f22648;
            if (c5969 == null) {
                c5969 = C5969.getDefaultInstance();
            }
        } else {
            c5969 = (C5969) c157222.m37103();
        }
        return c5969.isInitialized();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C15722 m19836() {
        C5969 c5969;
        C15722 c15722 = this.f22647;
        if (c15722 == null) {
            if (c15722 == null) {
                c5969 = this.f22649;
                if (c5969 == null) {
                    c5969 = C5969.getDefaultInstance();
                }
            } else {
                c5969 = (C5969) c15722.m37103();
            }
            this.f22647 = new C15722(c5969, getParentForChildren(), isClean());
            this.f22649 = null;
        }
        return this.f22647;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C15722 m19835() {
        C5969 c5969;
        C15722 c15722 = this.f22650;
        if (c15722 == null) {
            if (c15722 == null) {
                c5969 = this.f22648;
                if (c5969 == null) {
                    c5969 = C5969.getDefaultInstance();
                }
            } else {
                c5969 = (C5969) c15722.m37103();
            }
            this.f22650 = new C15722(c5969, getParentForChildren(), isClean());
            this.f22648 = null;
        }
        return this.f22650;
    }
}
