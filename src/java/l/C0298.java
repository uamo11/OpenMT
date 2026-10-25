package l;

import java.util.List;

/* compiled from: C9PC */
/* renamed from: l.֡۠᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0298 extends AbstractC19916 implements InterfaceC8060 {
    public int bitField0_;
    public Object name_;
    public C2731 partitionNames_;
    public long size_;

    public /* synthetic */ C0298(int i) {
        this();
    }

    public /* synthetic */ C0298(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    public static final C17757 getDescriptor() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
        return c17757;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable;
        c9766.m24773(C5238.class, C0298.class);
        return c9766;
    }

    public C0298() {
        this.name_ = "";
        this.partitionNames_ = C2731.m8466();
    }

    public C0298(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.name_ = "";
        this.partitionNames_ = C2731.m8466();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C0298 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C2731.m8466();
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C5238 getDefaultInstanceForType() {
        return C5238.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C5238 build() {
        C5238 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C5238 buildPartial() {
        C5238 c5238 = new C5238(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c5238);
        }
        onBuilt();
        return c5238;
    }

    private void buildPartial0(C5238 c5238) {
        int i;
        int i2;
        int i3 = this.bitField0_;
        if ((i3 & 1) != 0) {
            c5238.name_ = this.name_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            c5238.size_ = this.size_;
            i |= 2;
        }
        if ((i3 & 4) != 0) {
            this.partitionNames_.mo44493();
            c5238.partitionNames_ = this.partitionNames_;
        }
        i2 = c5238.bitField0_;
        c5238.bitField0_ = i2 | i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C0298 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C5238) {
            return mergeFrom((C5238) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C0298 mergeFrom(C5238 c5238) {
        C2731 c2731;
        C2731 c27312;
        C2731 c27313;
        Object obj;
        if (c5238 == C5238.getDefaultInstance()) {
            return this;
        }
        if (c5238.hasName()) {
            obj = c5238.name_;
            this.name_ = obj;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c5238.hasSize()) {
            setSize(c5238.getSize());
        }
        c2731 = c5238.partitionNames_;
        if (!c2731.isEmpty()) {
            if (this.partitionNames_.isEmpty()) {
                c27313 = c5238.partitionNames_;
                this.partitionNames_ = c27313;
                this.bitField0_ |= 4;
            } else {
                ensurePartitionNamesIsMutable();
                C2731 c27314 = this.partitionNames_;
                c27312 = c5238.partitionNames_;
                c27314.addAll(c27312);
            }
            onChanged();
        }
        mergeUnknownFields(c5238.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return hasName();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C0298 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 10) {
                            this.name_ = abstractC7297.mo19566();
                            this.bitField0_ |= 1;
                        } else if (mo19567 == 16) {
                            this.size_ = abstractC7297.mo19578();
                            this.bitField0_ |= 2;
                        } else if (mo19567 == 26) {
                            AbstractC5886 mo19566 = abstractC7297.mo19566();
                            ensurePartitionNamesIsMutable();
                            this.partitionNames_.mo8469(mo19566);
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

    @Override // l.InterfaceC8060
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC8060
    public String getName() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String m16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.name_ = m16501;
            }
            return m16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC8060
    public AbstractC5886 getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            AbstractC5886 m16491 = AbstractC5886.m16491((String) obj);
            this.name_ = m16491;
            return m16491;
        }
        return (AbstractC5886) obj;
    }

    public C0298 setName(String str) {
        str.getClass();
        this.name_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C0298 clearName() {
        this.name_ = C5238.getDefaultInstance().getName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C0298 setNameBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.name_ = abstractC5886;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC8060
    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC8060
    public long getSize() {
        return this.size_;
    }

    public C0298 setSize(long j) {
        this.size_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C0298 clearSize() {
        this.bitField0_ &= -3;
        this.size_ = 0L;
        onChanged();
        return this;
    }

    private void ensurePartitionNamesIsMutable() {
        if (!this.partitionNames_.mo44491()) {
            this.partitionNames_ = new C2731(this.partitionNames_);
        }
        this.bitField0_ |= 4;
    }

    @Override // l.InterfaceC8060
    public InterfaceC7111 getPartitionNamesList() {
        this.partitionNames_.mo44493();
        return this.partitionNames_;
    }

    @Override // l.InterfaceC8060
    public int getPartitionNamesCount() {
        return this.partitionNames_.size();
    }

    @Override // l.InterfaceC8060
    public String getPartitionNames(int i) {
        return this.partitionNames_.get(i);
    }

    @Override // l.InterfaceC8060
    public AbstractC5886 getPartitionNamesBytes(int i) {
        return this.partitionNames_.m8468(i);
    }

    public C0298 setPartitionNames(int i, String str) {
        str.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.set(i, str);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C0298 addPartitionNames(String str) {
        str.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.add(str);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C0298 addAllPartitionNames(Iterable iterable) {
        ensurePartitionNamesIsMutable();
        AbstractC2359.m7667(iterable, (List) this.partitionNames_);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C0298 clearPartitionNames() {
        this.partitionNames_ = C2731.m8466();
        this.bitField0_ &= -5;
        onChanged();
        return this;
    }

    public C0298 addPartitionNamesBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.mo8469(abstractC5886);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }
}
