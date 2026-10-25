package l;

/* compiled from: T9Q9 */
/* renamed from: l.۬ܺۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13208 extends AbstractC19916 implements InterfaceC3583 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC6237 f39551;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC6237 f39552;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Object f39553;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2731 f39554;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f39555;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f39556;

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C13208(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m32043();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m32043();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m32043();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m32043();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m32044(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m32044(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m32044(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m32044(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32269;
        c9766.m24773(C12503.class, C13208.class);
        return c9766;
    }

    public C13208() {
        this.f39552 = AbstractC4121.m12398();
        this.f39551 = AbstractC4121.m12398();
        this.f39556 = "";
        this.f39553 = "";
        this.f39554 = C2731.m8466();
    }

    public C13208(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f39552 = AbstractC4121.m12398();
        this.f39551 = AbstractC4121.m12398();
        this.f39556 = "";
        this.f39553 = "";
        this.f39554 = C2731.m8466();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32043() {
        super.clear();
        this.f39555 = 0;
        this.f39552 = AbstractC4121.m12398();
        this.f39551 = AbstractC4121.m12398();
        this.f39556 = "";
        this.f39553 = "";
        this.f39554 = C2731.m8466();
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C10702.f32251;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C12503.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C12503.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C12503 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C12503 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C12503 buildPartial() {
        int i = 0;
        C12503 c12503 = new C12503(this, 0);
        int i2 = this.f39555;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                this.f39552.mo44493();
                c12503.f37555 = this.f39552;
            }
            if ((i2 & 2) != 0) {
                this.f39551.mo44493();
                c12503.f37553 = this.f39551;
            }
            if ((i2 & 4) != 0) {
                c12503.f37558 = this.f39556;
                i = 1;
            }
            if ((i2 & 8) != 0) {
                c12503.f37552 = this.f39553;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.f39554.mo44493();
                c12503.f37556 = this.f39554;
            }
            c12503.f37557 = i | c12503.f37557;
        }
        onBuilt();
        return c12503;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C12503) {
            m32045((C12503) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C12503) {
            m32045((C12503) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32045(C12503 c12503) {
        InterfaceC6237 interfaceC6237;
        InterfaceC6237 interfaceC62372;
        C2731 c2731;
        C2731 c27312;
        C2731 c27313;
        Object obj;
        Object obj2;
        InterfaceC6237 interfaceC62373;
        InterfaceC6237 interfaceC62374;
        InterfaceC6237 interfaceC62375;
        InterfaceC6237 interfaceC62376;
        if (c12503 == C12503.getDefaultInstance()) {
            return;
        }
        interfaceC6237 = c12503.f37555;
        if (!interfaceC6237.isEmpty()) {
            if (this.f39552.isEmpty()) {
                interfaceC62376 = c12503.f37555;
                this.f39552 = interfaceC62376;
                interfaceC62376.mo44493();
                this.f39555 |= 1;
            } else {
                m32041();
                InterfaceC6237 interfaceC62377 = this.f39552;
                interfaceC62375 = c12503.f37555;
                interfaceC62377.addAll(interfaceC62375);
            }
            onChanged();
        }
        interfaceC62372 = c12503.f37553;
        if (!interfaceC62372.isEmpty()) {
            if (this.f39551.isEmpty()) {
                interfaceC62374 = c12503.f37553;
                this.f39551 = interfaceC62374;
                interfaceC62374.mo44493();
                this.f39555 |= 2;
            } else {
                m32042();
                InterfaceC6237 interfaceC62378 = this.f39551;
                interfaceC62373 = c12503.f37553;
                interfaceC62378.addAll(interfaceC62373);
            }
            onChanged();
        }
        if (c12503.m30685()) {
            obj2 = c12503.f37558;
            this.f39556 = obj2;
            this.f39555 |= 4;
            onChanged();
        }
        if (c12503.m30684()) {
            obj = c12503.f37552;
            this.f39553 = obj;
            this.f39555 |= 8;
            onChanged();
        }
        c2731 = c12503.f37556;
        if (!c2731.isEmpty()) {
            if (this.f39554.isEmpty()) {
                c27313 = c12503.f37556;
                this.f39554 = c27313;
                this.f39555 |= 16;
            } else {
                if (!this.f39554.mo44491()) {
                    this.f39554 = new C2731(this.f39554);
                }
                this.f39555 |= 16;
                C2731 c27314 = this.f39554;
                c27312 = c12503.f37556;
                c27314.addAll(c27312);
            }
            onChanged();
        }
        mergeUnknownFields(c12503.getUnknownFields());
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32044(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 8) {
                            int mo19568 = abstractC7297.mo19568();
                            m32041();
                            this.f39552.mo17174(mo19568);
                        } else if (mo19567 == 10) {
                            int mo19570 = abstractC7297.mo19570(abstractC7297.mo19558());
                            m32041();
                            while (abstractC7297.mo19564() > 0) {
                                this.f39552.mo17174(abstractC7297.mo19568());
                            }
                            abstractC7297.mo19565(mo19570);
                        } else if (mo19567 == 16) {
                            int mo195682 = abstractC7297.mo19568();
                            m32042();
                            this.f39551.mo17174(mo195682);
                        } else if (mo19567 == 18) {
                            int mo195702 = abstractC7297.mo19570(abstractC7297.mo19558());
                            m32042();
                            while (abstractC7297.mo19564() > 0) {
                                this.f39551.mo17174(abstractC7297.mo19568());
                            }
                            abstractC7297.mo19565(mo195702);
                        } else if (mo19567 == 26) {
                            this.f39556 = abstractC7297.mo19566();
                            this.f39555 |= 4;
                        } else if (mo19567 == 34) {
                            this.f39553 = abstractC7297.mo19566();
                            this.f39555 |= 8;
                        } else if (mo19567 == 50) {
                            AbstractC5886 mo19566 = abstractC7297.mo19566();
                            if (!this.f39554.mo44491()) {
                                this.f39554 = new C2731(this.f39554);
                            }
                            this.f39555 |= 16;
                            this.f39554.mo8469(mo19566);
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

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m32041() {
        if (!this.f39552.mo44491()) {
            this.f39552 = (InterfaceC6237) AbstractC4121.m12374((InterfaceC23170) this.f39552);
        }
        this.f39555 |= 1;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m32042() {
        if (!this.f39551.mo44491()) {
            this.f39551 = (InterfaceC6237) AbstractC4121.m12374((InterfaceC23170) this.f39551);
        }
        this.f39555 |= 2;
    }
}
