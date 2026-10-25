package l;

/* compiled from: C9PC */
/* renamed from: l.ܿܶ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17437 extends AbstractC19916 implements InterfaceC6854 {
    public int bitField0_;
    public AbstractC5886 hash_;
    public long size_;

    public /* synthetic */ C17437(int i) {
        this();
    }

    public /* synthetic */ C17437(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public static final C17757 getDescriptor() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
        return c17757;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable;
        c9766.m24773(C14614.class, C17437.class);
        return c9766;
    }

    public C17437() {
        this.hash_ = AbstractC5886.f18080;
    }

    public C17437(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.hash_ = AbstractC5886.f18080;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C17437 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.size_ = 0L;
        this.hash_ = AbstractC5886.f18080;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C14614 getDefaultInstanceForType() {
        return C14614.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C14614 build() {
        C14614 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C14614 buildPartial() {
        C14614 c14614 = new C14614(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c14614);
        }
        onBuilt();
        return c14614;
    }

    private void buildPartial0(C14614 c14614) {
        int i;
        int i2;
        int i3 = this.bitField0_;
        if ((i3 & 1) != 0) {
            c14614.size_ = this.size_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            c14614.hash_ = this.hash_;
            i |= 2;
        }
        i2 = c14614.bitField0_;
        c14614.bitField0_ = i2 | i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C17437 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C14614) {
            return mergeFrom((C14614) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C17437 mergeFrom(C14614 c14614) {
        if (c14614 == C14614.getDefaultInstance()) {
            return this;
        }
        if (c14614.hasSize()) {
            setSize(c14614.getSize());
        }
        if (c14614.hasHash()) {
            setHash(c14614.getHash());
        }
        mergeUnknownFields(c14614.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C17437 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 8) {
                            this.size_ = abstractC7297.mo19578();
                            this.bitField0_ |= 1;
                        } else if (mo19567 == 18) {
                            this.hash_ = abstractC7297.mo19566();
                            this.bitField0_ |= 2;
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
        return this;
    }

    @Override // l.InterfaceC6854
    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC6854
    public long getSize() {
        return this.size_;
    }

    public C17437 setSize(long j) {
        this.size_ = j;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C17437 clearSize() {
        this.bitField0_ &= -2;
        this.size_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC6854
    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC6854
    public AbstractC5886 getHash() {
        return this.hash_;
    }

    public C17437 setHash(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.hash_ = abstractC5886;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C17437 clearHash() {
        this.bitField0_ &= -3;
        this.hash_ = C14614.getDefaultInstance().getHash();
        onChanged();
        return this;
    }
}
