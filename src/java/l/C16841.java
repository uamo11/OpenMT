package l;

/* compiled from: U940 */
/* renamed from: l.ܽ᩵ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16841 extends AbstractC19916 implements InterfaceC3583 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f51696;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f51697;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f51698;

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C16841(int i) {
        this();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m39616(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m39616(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m39616(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m39616(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C23897.f77256;
        c9766.m24773(C14724.class, C16841.class);
        return c9766;
    }

    public C16841() {
        this.f51696 = 0;
    }

    public C16841(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f51696 = 0;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final InterfaceC9228 clear() {
        super.clear();
        this.f51697 = 0;
        this.f51698 = false;
        this.f51696 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final InterfaceC14165 clear() {
        super.clear();
        this.f51697 = 0;
        this.f51698 = false;
        this.f51696 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final AbstractC19916 clear() {
        super.clear();
        this.f51697 = 0;
        this.f51698 = false;
        this.f51696 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final AbstractC20704 clear() {
        super.clear();
        this.f51697 = 0;
        this.f51698 = false;
        this.f51696 = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C23897.f77255;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C14724.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C14724.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C14724 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C14724 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C14724 buildPartial() {
        int i = 0;
        C14724 c14724 = new C14724(this, 0);
        int i2 = this.f51697;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c14724.f44971 = this.f51698;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c14724.f44968 = this.f51696;
                i |= 2;
            }
            c14724.f44970 = i | c14724.f44970;
        }
        onBuilt();
        return c14724;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C14724) {
            m39617((C14724) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C14724) {
            m39617((C14724) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39617(C14724 c14724) {
        if (c14724 == C14724.getDefaultInstance()) {
            return;
        }
        if (c14724.m35035()) {
            this.f51698 = c14724.m35033();
            this.f51697 |= 1;
            onChanged();
        }
        if (c14724.m35034()) {
            m39618(c14724.m35036());
        }
        mergeUnknownFields(c14724.getUnknownFields());
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39616(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 8) {
                            this.f51698 = abstractC7297.mo19571();
                            this.f51697 |= 1;
                        } else if (mo19567 == 16) {
                            int mo19560 = abstractC7297.mo19560();
                            if (EnumC17547.m41028(mo19560) == null) {
                                mergeUnknownVarintField(2, mo19560);
                            } else {
                                this.f51696 = mo19560;
                                this.f51697 |= 2;
                            }
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

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39618(EnumC17547 enumC17547) {
        enumC17547.getClass();
        this.f51697 |= 2;
        this.f51696 = enumC17547.getNumber();
        onChanged();
    }
}
