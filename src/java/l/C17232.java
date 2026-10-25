package l;

/* compiled from: C9PC */
/* renamed from: l.ܿ۠᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17232 extends AbstractC19916 implements InterfaceC9472 {
    public int bitField0_;
    public C15722 dstExtentBuilder_;
    public C12293 dstExtent_;
    public C15722 srcExtentBuilder_;
    public C12293 srcExtent_;
    public int srcOffset_;
    public int type_;

    public /* synthetic */ C17232(int i) {
        this();
    }

    public /* synthetic */ C17232(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public static final C17757 getDescriptor() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
        return c17757;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable;
        c9766.m24773(C6649.class, C17232.class);
        return c9766;
    }

    public C17232() {
        this.type_ = 0;
        maybeForceBuilderInitialization();
    }

    public C17232(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.type_ = 0;
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        boolean z;
        z = AbstractC4121.alwaysUseFieldBuilders;
        if (z) {
            getSrcExtentFieldBuilder();
            getDstExtentFieldBuilder();
        }
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C17232 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.type_ = 0;
        this.srcExtent_ = null;
        C15722 c15722 = this.srcExtentBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.srcExtentBuilder_ = null;
        }
        this.dstExtent_ = null;
        C15722 c157222 = this.dstExtentBuilder_;
        if (c157222 != null) {
            c157222.m37102();
            this.dstExtentBuilder_ = null;
        }
        this.srcOffset_ = 0;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C6649 getDefaultInstanceForType() {
        return C6649.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C6649 build() {
        C6649 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C6649 buildPartial() {
        C6649 c6649 = new C6649(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c6649);
        }
        onBuilt();
        return c6649;
    }

    private void buildPartial0(C6649 c6649) {
        int i;
        int i2;
        C12293 c12293;
        C12293 c122932;
        int i3 = this.bitField0_;
        if ((i3 & 1) != 0) {
            c6649.type_ = this.type_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            C15722 c15722 = this.srcExtentBuilder_;
            if (c15722 == null) {
                c122932 = this.srcExtent_;
            } else {
                c122932 = (C12293) c15722.m37099();
            }
            c6649.srcExtent_ = c122932;
            i |= 2;
        }
        if ((i3 & 4) != 0) {
            C15722 c157222 = this.dstExtentBuilder_;
            if (c157222 == null) {
                c12293 = this.dstExtent_;
            } else {
                c12293 = (C12293) c157222.m37099();
            }
            c6649.dstExtent_ = c12293;
            i |= 4;
        }
        if ((i3 & 8) != 0) {
            c6649.srcOffset_ = this.srcOffset_;
            i |= 8;
        }
        i2 = c6649.bitField0_;
        c6649.bitField0_ = i2 | i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C17232 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C6649) {
            return mergeFrom((C6649) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C17232 mergeFrom(C6649 c6649) {
        if (c6649 == C6649.getDefaultInstance()) {
            return this;
        }
        if (c6649.hasType()) {
            setType(c6649.getType());
        }
        if (c6649.hasSrcExtent()) {
            mergeSrcExtent(c6649.getSrcExtent());
        }
        if (c6649.hasDstExtent()) {
            mergeDstExtent(c6649.getDstExtent());
        }
        if (c6649.hasSrcOffset()) {
            setSrcOffset(c6649.getSrcOffset());
        }
        mergeUnknownFields(c6649.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C17232 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 8) {
                            int mo19560 = abstractC7297.mo19560();
                            if (EnumC23582.forNumber(mo19560) == null) {
                                mergeUnknownVarintField(1, mo19560);
                            } else {
                                this.type_ = mo19560;
                                this.bitField0_ |= 1;
                            }
                        } else if (mo19567 == 18) {
                            abstractC7297.mo19556(getSrcExtentFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 2;
                        } else if (mo19567 == 26) {
                            abstractC7297.mo19556(getDstExtentFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 4;
                        } else if (mo19567 == 32) {
                            this.srcOffset_ = abstractC7297.mo19577();
                            this.bitField0_ |= 8;
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

    @Override // l.InterfaceC9472
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC9472
    public EnumC23582 getType() {
        EnumC23582 forNumber = EnumC23582.forNumber(this.type_);
        return forNumber == null ? EnumC23582.COW_COPY : forNumber;
    }

    public C17232 setType(EnumC23582 enumC23582) {
        enumC23582.getClass();
        this.bitField0_ |= 1;
        this.type_ = enumC23582.getNumber();
        onChanged();
        return this;
    }

    public C17232 clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC9472
    public boolean hasSrcExtent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC9472
    public C12293 getSrcExtent() {
        C15722 c15722 = this.srcExtentBuilder_;
        if (c15722 == null) {
            C12293 c12293 = this.srcExtent_;
            return c12293 == null ? C12293.getDefaultInstance() : c12293;
        }
        return (C12293) c15722.m37103();
    }

    public C17232 setSrcExtent(C12293 c12293) {
        C15722 c15722 = this.srcExtentBuilder_;
        if (c15722 == null) {
            c12293.getClass();
            this.srcExtent_ = c12293;
        } else {
            c15722.m37100(c12293);
        }
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C17232 setSrcExtent(C12998 c12998) {
        C15722 c15722 = this.srcExtentBuilder_;
        if (c15722 == null) {
            this.srcExtent_ = c12998.build();
        } else {
            c15722.m37100(c12998.build());
        }
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C17232 mergeSrcExtent(C12293 c12293) {
        C12293 c122932;
        C15722 c15722 = this.srcExtentBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 2) != 0 && (c122932 = this.srcExtent_) != null && c122932 != C12293.getDefaultInstance()) {
                getSrcExtentBuilder().mergeFrom(c12293);
            } else {
                this.srcExtent_ = c12293;
            }
        } else {
            c15722.m37098(c12293);
        }
        if (this.srcExtent_ != null) {
            this.bitField0_ |= 2;
            onChanged();
        }
        return this;
    }

    public C17232 clearSrcExtent() {
        this.bitField0_ &= -3;
        this.srcExtent_ = null;
        C15722 c15722 = this.srcExtentBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.srcExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C12998 getSrcExtentBuilder() {
        this.bitField0_ |= 2;
        onChanged();
        return (C12998) getSrcExtentFieldBuilder().m37104();
    }

    @Override // l.InterfaceC9472
    public InterfaceC5943 getSrcExtentOrBuilder() {
        C15722 c15722 = this.srcExtentBuilder_;
        if (c15722 != null) {
            return (InterfaceC5943) c15722.m37101();
        }
        C12293 c12293 = this.srcExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    private C15722 getSrcExtentFieldBuilder() {
        if (this.srcExtentBuilder_ == null) {
            this.srcExtentBuilder_ = new C15722(getSrcExtent(), getParentForChildren(), isClean());
            this.srcExtent_ = null;
        }
        return this.srcExtentBuilder_;
    }

    @Override // l.InterfaceC9472
    public boolean hasDstExtent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC9472
    public C12293 getDstExtent() {
        C15722 c15722 = this.dstExtentBuilder_;
        if (c15722 == null) {
            C12293 c12293 = this.dstExtent_;
            return c12293 == null ? C12293.getDefaultInstance() : c12293;
        }
        return (C12293) c15722.m37103();
    }

    public C17232 setDstExtent(C12293 c12293) {
        C15722 c15722 = this.dstExtentBuilder_;
        if (c15722 == null) {
            c12293.getClass();
            this.dstExtent_ = c12293;
        } else {
            c15722.m37100(c12293);
        }
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C17232 setDstExtent(C12998 c12998) {
        C15722 c15722 = this.dstExtentBuilder_;
        if (c15722 == null) {
            this.dstExtent_ = c12998.build();
        } else {
            c15722.m37100(c12998.build());
        }
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C17232 mergeDstExtent(C12293 c12293) {
        C12293 c122932;
        C15722 c15722 = this.dstExtentBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 4) != 0 && (c122932 = this.dstExtent_) != null && c122932 != C12293.getDefaultInstance()) {
                getDstExtentBuilder().mergeFrom(c12293);
            } else {
                this.dstExtent_ = c12293;
            }
        } else {
            c15722.m37098(c12293);
        }
        if (this.dstExtent_ != null) {
            this.bitField0_ |= 4;
            onChanged();
        }
        return this;
    }

    public C17232 clearDstExtent() {
        this.bitField0_ &= -5;
        this.dstExtent_ = null;
        C15722 c15722 = this.dstExtentBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.dstExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C12998 getDstExtentBuilder() {
        this.bitField0_ |= 4;
        onChanged();
        return (C12998) getDstExtentFieldBuilder().m37104();
    }

    @Override // l.InterfaceC9472
    public InterfaceC5943 getDstExtentOrBuilder() {
        C15722 c15722 = this.dstExtentBuilder_;
        if (c15722 != null) {
            return (InterfaceC5943) c15722.m37101();
        }
        C12293 c12293 = this.dstExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    private C15722 getDstExtentFieldBuilder() {
        if (this.dstExtentBuilder_ == null) {
            this.dstExtentBuilder_ = new C15722(getDstExtent(), getParentForChildren(), isClean());
            this.dstExtent_ = null;
        }
        return this.dstExtentBuilder_;
    }

    @Override // l.InterfaceC9472
    public boolean hasSrcOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC9472
    public int getSrcOffset() {
        return this.srcOffset_;
    }

    public C17232 setSrcOffset(int i) {
        this.srcOffset_ = i;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C17232 clearSrcOffset() {
        this.bitField0_ &= -9;
        this.srcOffset_ = 0;
        onChanged();
        return this;
    }
}
