package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* compiled from: C9PC */
/* renamed from: l.ܺ۠᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15820 extends AbstractC19916 implements InterfaceC18644 {
    public C14311 apexInfoBuilder_;
    public List apexInfo_;
    public int bitField0_;
    public int blockSize_;
    public C15722 dynamicPartitionMetadataBuilder_;
    public C22171 dynamicPartitionMetadata_;
    public long maxTimestamp_;
    public int minorVersion_;
    public boolean partialUpdate_;
    public C14311 partitionsBuilder_;
    public List partitions_;
    public Object securityPatchLevel_;
    public long signaturesOffset_;
    public long signaturesSize_;

    public /* synthetic */ C15820(int i) {
        this();
    }

    public /* synthetic */ C15820(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    public static final C17757 getDescriptor() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
        return c17757;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable;
        c9766.m24773(C2416.class, C15820.class);
        return c9766;
    }

    public C15820() {
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
        maybeForceBuilderInitialization();
    }

    public C15820(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        boolean z;
        z = AbstractC4121.alwaysUseFieldBuilders;
        if (z) {
            getPartitionsFieldBuilder();
            getDynamicPartitionMetadataFieldBuilder();
            getApexInfoFieldBuilder();
        }
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C15820 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            this.partitions_ = Collections.EMPTY_LIST;
        } else {
            this.partitions_ = null;
            c14311.m34169();
        }
        this.bitField0_ &= -17;
        this.maxTimestamp_ = 0L;
        this.dynamicPartitionMetadata_ = null;
        C15722 c15722 = this.dynamicPartitionMetadataBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.dynamicPartitionMetadataBuilder_ = null;
        }
        this.partialUpdate_ = false;
        C14311 c143112 = this.apexInfoBuilder_;
        if (c143112 == null) {
            this.apexInfo_ = Collections.EMPTY_LIST;
        } else {
            this.apexInfo_ = null;
            c143112.m34169();
        }
        this.bitField0_ &= -257;
        this.securityPatchLevel_ = "";
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C2416 getDefaultInstanceForType() {
        return C2416.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C2416 build() {
        C2416 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C2416 buildPartial() {
        C2416 c2416 = new C2416(this);
        buildPartialRepeatedFields(c2416);
        if (this.bitField0_ != 0) {
            buildPartial0(c2416);
        }
        onBuilt();
        return c2416;
    }

    private void buildPartialRepeatedFields(C2416 c2416) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            if ((this.bitField0_ & 16) != 0) {
                this.partitions_ = C20195.unmodifiableList(this.partitions_);
                this.bitField0_ &= -17;
            }
            c2416.partitions_ = this.partitions_;
        } else {
            c2416.partitions_ = c14311.m34163();
        }
        C14311 c143112 = this.apexInfoBuilder_;
        if (c143112 == null) {
            if ((this.bitField0_ & 256) != 0) {
                this.apexInfo_ = C20195.unmodifiableList(this.apexInfo_);
                this.bitField0_ &= -257;
            }
            c2416.apexInfo_ = this.apexInfo_;
            return;
        }
        c2416.apexInfo_ = c143112.m34163();
    }

    private void buildPartial0(C2416 c2416) {
        int i;
        int i2;
        C22171 c22171;
        int i3 = this.bitField0_;
        if ((i3 & 1) != 0) {
            c2416.blockSize_ = this.blockSize_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            c2416.signaturesOffset_ = this.signaturesOffset_;
            i |= 2;
        }
        if ((i3 & 4) != 0) {
            c2416.signaturesSize_ = this.signaturesSize_;
            i |= 4;
        }
        if ((i3 & 8) != 0) {
            c2416.minorVersion_ = this.minorVersion_;
            i |= 8;
        }
        if ((i3 & 32) != 0) {
            c2416.maxTimestamp_ = this.maxTimestamp_;
            i |= 16;
        }
        if ((i3 & 64) != 0) {
            C15722 c15722 = this.dynamicPartitionMetadataBuilder_;
            if (c15722 == null) {
                c22171 = this.dynamicPartitionMetadata_;
            } else {
                c22171 = (C22171) c15722.m37099();
            }
            c2416.dynamicPartitionMetadata_ = c22171;
            i |= 32;
        }
        if ((i3 & 128) != 0) {
            c2416.partialUpdate_ = this.partialUpdate_;
            i |= 64;
        }
        if ((i3 & 512) != 0) {
            c2416.securityPatchLevel_ = this.securityPatchLevel_;
            i |= 128;
        }
        i2 = c2416.bitField0_;
        c2416.bitField0_ = i2 | i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C15820 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C2416) {
            return mergeFrom((C2416) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C15820 mergeFrom(C2416 c2416) {
        List list;
        List list2;
        List list3;
        boolean z;
        List list4;
        List list5;
        List list6;
        boolean z2;
        Object obj;
        List list7;
        List list8;
        List list9;
        List list10;
        List list11;
        List list12;
        if (c2416 == C2416.getDefaultInstance()) {
            return this;
        }
        if (c2416.hasBlockSize()) {
            setBlockSize(c2416.getBlockSize());
        }
        if (c2416.hasSignaturesOffset()) {
            setSignaturesOffset(c2416.getSignaturesOffset());
        }
        if (c2416.hasSignaturesSize()) {
            setSignaturesSize(c2416.getSignaturesSize());
        }
        if (c2416.hasMinorVersion()) {
            setMinorVersion(c2416.getMinorVersion());
        }
        if (this.partitionsBuilder_ == null) {
            list10 = c2416.partitions_;
            if (!list10.isEmpty()) {
                if (this.partitions_.isEmpty()) {
                    list12 = c2416.partitions_;
                    this.partitions_ = list12;
                    this.bitField0_ &= -17;
                } else {
                    ensurePartitionsIsMutable();
                    List list13 = this.partitions_;
                    list11 = c2416.partitions_;
                    list13.addAll(list11);
                }
                onChanged();
            }
        } else {
            list = c2416.partitions_;
            if (!list.isEmpty()) {
                if (this.partitionsBuilder_.m34174()) {
                    this.partitionsBuilder_.m34172();
                    this.partitionsBuilder_ = null;
                    list3 = c2416.partitions_;
                    this.partitions_ = list3;
                    this.bitField0_ &= -17;
                    z = AbstractC4121.alwaysUseFieldBuilders;
                    this.partitionsBuilder_ = z ? getPartitionsFieldBuilder() : null;
                } else {
                    C14311 c14311 = this.partitionsBuilder_;
                    list2 = c2416.partitions_;
                    c14311.m34161(list2);
                }
            }
        }
        if (c2416.hasMaxTimestamp()) {
            setMaxTimestamp(c2416.getMaxTimestamp());
        }
        if (c2416.hasDynamicPartitionMetadata()) {
            mergeDynamicPartitionMetadata(c2416.getDynamicPartitionMetadata());
        }
        if (c2416.hasPartialUpdate()) {
            setPartialUpdate(c2416.getPartialUpdate());
        }
        if (this.apexInfoBuilder_ == null) {
            list7 = c2416.apexInfo_;
            if (!list7.isEmpty()) {
                if (this.apexInfo_.isEmpty()) {
                    list9 = c2416.apexInfo_;
                    this.apexInfo_ = list9;
                    this.bitField0_ &= -257;
                } else {
                    ensureApexInfoIsMutable();
                    List list14 = this.apexInfo_;
                    list8 = c2416.apexInfo_;
                    list14.addAll(list8);
                }
                onChanged();
            }
        } else {
            list4 = c2416.apexInfo_;
            if (!list4.isEmpty()) {
                if (this.apexInfoBuilder_.m34174()) {
                    this.apexInfoBuilder_.m34172();
                    this.apexInfoBuilder_ = null;
                    list6 = c2416.apexInfo_;
                    this.apexInfo_ = list6;
                    this.bitField0_ &= -257;
                    z2 = AbstractC4121.alwaysUseFieldBuilders;
                    this.apexInfoBuilder_ = z2 ? getApexInfoFieldBuilder() : null;
                } else {
                    C14311 c143112 = this.apexInfoBuilder_;
                    list5 = c2416.apexInfo_;
                    c143112.m34161(list5);
                }
            }
        }
        if (c2416.hasSecurityPatchLevel()) {
            obj = c2416.securityPatchLevel_;
            this.securityPatchLevel_ = obj;
            this.bitField0_ |= 512;
            onChanged();
        }
        mergeUnknownFields(c2416.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        for (int i = 0; i < getPartitionsCount(); i++) {
            if (!getPartitions(i).isInitialized()) {
                return false;
            }
        }
        return !hasDynamicPartitionMetadata() || getDynamicPartitionMetadata().isInitialized();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C15820 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    switch (mo19567) {
                        case 0:
                            z = true;
                        case 24:
                            this.blockSize_ = abstractC7297.mo19577();
                            this.bitField0_ |= 1;
                        case 32:
                            this.signaturesOffset_ = abstractC7297.mo19578();
                            this.bitField0_ |= 2;
                        case 40:
                            this.signaturesSize_ = abstractC7297.mo19578();
                            this.bitField0_ |= 4;
                        case 96:
                            this.minorVersion_ = abstractC7297.mo19577();
                            this.bitField0_ |= 8;
                        case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            C8971 c8971 = (C8971) abstractC7297.mo19552(C8971.parser(), c17798);
                            C14311 c14311 = this.partitionsBuilder_;
                            if (c14311 == null) {
                                ensurePartitionsIsMutable();
                                this.partitions_.add(c8971);
                            } else {
                                c14311.m34166(c8971);
                            }
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            this.maxTimestamp_ = abstractC7297.mo19557();
                            this.bitField0_ |= 32;
                        case 122:
                            abstractC7297.mo19556(getDynamicPartitionMetadataFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 64;
                        case 128:
                            this.partialUpdate_ = abstractC7297.mo19571();
                            this.bitField0_ |= 128;
                        case 138:
                            C1710 c1710 = (C1710) abstractC7297.mo19552(C1710.parser(), c17798);
                            C14311 c143112 = this.apexInfoBuilder_;
                            if (c143112 == null) {
                                ensureApexInfoIsMutable();
                                this.apexInfo_.add(c1710);
                            } else {
                                c143112.m34166(c1710);
                            }
                        case 146:
                            this.securityPatchLevel_ = abstractC7297.mo19566();
                            this.bitField0_ |= 512;
                        default:
                            if (!super.parseUnknownField(abstractC7297, c17798, mo19567)) {
                                z = true;
                            }
                    }
                } catch (C2025 e) {
                    throw e.m6586();
                }
            } finally {
                onChanged();
            }
        }
        return this;
    }

    @Override // l.InterfaceC18644
    public boolean hasBlockSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC18644
    public int getBlockSize() {
        return this.blockSize_;
    }

    public C15820 setBlockSize(int i) {
        this.blockSize_ = i;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C15820 clearBlockSize() {
        this.bitField0_ &= -2;
        this.blockSize_ = 4096;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC18644
    public boolean hasSignaturesOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC18644
    public long getSignaturesOffset() {
        return this.signaturesOffset_;
    }

    public C15820 setSignaturesOffset(long j) {
        this.signaturesOffset_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C15820 clearSignaturesOffset() {
        this.bitField0_ &= -3;
        this.signaturesOffset_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC18644
    public boolean hasSignaturesSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC18644
    public long getSignaturesSize() {
        return this.signaturesSize_;
    }

    public C15820 setSignaturesSize(long j) {
        this.signaturesSize_ = j;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C15820 clearSignaturesSize() {
        this.bitField0_ &= -5;
        this.signaturesSize_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC18644
    public boolean hasMinorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC18644
    public int getMinorVersion() {
        return this.minorVersion_;
    }

    public C15820 setMinorVersion(int i) {
        this.minorVersion_ = i;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C15820 clearMinorVersion() {
        this.bitField0_ &= -9;
        this.minorVersion_ = 0;
        onChanged();
        return this;
    }

    private void ensurePartitionsIsMutable() {
        if ((this.bitField0_ & 16) == 0) {
            this.partitions_ = new ArrayList(this.partitions_);
            this.bitField0_ |= 16;
        }
    }

    @Override // l.InterfaceC18644
    public List getPartitionsList() {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            return C20195.unmodifiableList(this.partitions_);
        }
        return c14311.m34175();
    }

    @Override // l.InterfaceC18644
    public int getPartitionsCount() {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            return this.partitions_.size();
        }
        return c14311.m34167();
    }

    @Override // l.InterfaceC18644
    public C8971 getPartitions(int i) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            return (C8971) this.partitions_.get(i);
        }
        return (C8971) c14311.m34164(i);
    }

    public C15820 setPartitions(int i, C8971 c8971) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            c8971.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.set(i, c8971);
            onChanged();
            return this;
        }
        c14311.m34170(i, c8971);
        return this;
    }

    public C15820 setPartitions(int i, C9677 c9677) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.set(i, c9677.build());
            onChanged();
            return this;
        }
        c14311.m34170(i, c9677.build());
        return this;
    }

    public C15820 addPartitions(C8971 c8971) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            c8971.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.add(c8971);
            onChanged();
            return this;
        }
        c14311.m34166(c8971);
        return this;
    }

    public C15820 addPartitions(int i, C8971 c8971) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            c8971.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.add(i, c8971);
            onChanged();
            return this;
        }
        c14311.m34165(i, c8971);
        return this;
    }

    public C15820 addPartitions(C9677 c9677) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.add(c9677.build());
            onChanged();
            return this;
        }
        c14311.m34166(c9677.build());
        return this;
    }

    public C15820 addPartitions(int i, C9677 c9677) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.add(i, c9677.build());
            onChanged();
            return this;
        }
        c14311.m34165(i, c9677.build());
        return this;
    }

    public C15820 addAllPartitions(Iterable iterable) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            ensurePartitionsIsMutable();
            AbstractC2359.m7667(iterable, this.partitions_);
            onChanged();
            return this;
        }
        c14311.m34161(iterable);
        return this;
    }

    public C15820 clearPartitions() {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            this.partitions_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }
        c14311.m34169();
        return this;
    }

    public C15820 removePartitions(int i) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.remove(i);
            onChanged();
            return this;
        }
        c14311.m34173(i);
        return this;
    }

    public C9677 getPartitionsBuilder(int i) {
        return (C9677) getPartitionsFieldBuilder().m34158(i);
    }

    @Override // l.InterfaceC18644
    public InterfaceC2621 getPartitionsOrBuilder(int i) {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 == null) {
            return (InterfaceC2621) this.partitions_.get(i);
        }
        return (InterfaceC2621) c14311.m34168(i);
    }

    @Override // l.InterfaceC18644
    public List getPartitionsOrBuilderList() {
        C14311 c14311 = this.partitionsBuilder_;
        if (c14311 != null) {
            return c14311.m34162();
        }
        return C20195.unmodifiableList(this.partitions_);
    }

    public C9677 addPartitionsBuilder() {
        return (C9677) getPartitionsFieldBuilder().m34160(C8971.getDefaultInstance());
    }

    public C9677 addPartitionsBuilder(int i) {
        return (C9677) getPartitionsFieldBuilder().m34159(i, C8971.getDefaultInstance());
    }

    public List getPartitionsBuilderList() {
        return getPartitionsFieldBuilder().m34171();
    }

    private C14311 getPartitionsFieldBuilder() {
        if (this.partitionsBuilder_ == null) {
            this.partitionsBuilder_ = new C14311(this.partitions_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
            this.partitions_ = null;
        }
        return this.partitionsBuilder_;
    }

    @Override // l.InterfaceC18644
    public boolean hasMaxTimestamp() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC18644
    public long getMaxTimestamp() {
        return this.maxTimestamp_;
    }

    public C15820 setMaxTimestamp(long j) {
        this.maxTimestamp_ = j;
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C15820 clearMaxTimestamp() {
        this.bitField0_ &= -33;
        this.maxTimestamp_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC18644
    public boolean hasDynamicPartitionMetadata() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC18644
    public C22171 getDynamicPartitionMetadata() {
        C15722 c15722 = this.dynamicPartitionMetadataBuilder_;
        if (c15722 == null) {
            C22171 c22171 = this.dynamicPartitionMetadata_;
            return c22171 == null ? C22171.getDefaultInstance() : c22171;
        }
        return (C22171) c15722.m37103();
    }

    public C15820 setDynamicPartitionMetadata(C22171 c22171) {
        C15722 c15722 = this.dynamicPartitionMetadataBuilder_;
        if (c15722 == null) {
            c22171.getClass();
            this.dynamicPartitionMetadata_ = c22171;
        } else {
            c15722.m37100(c22171);
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C15820 setDynamicPartitionMetadata(C21466 c21466) {
        C15722 c15722 = this.dynamicPartitionMetadataBuilder_;
        if (c15722 == null) {
            this.dynamicPartitionMetadata_ = c21466.build();
        } else {
            c15722.m37100(c21466.build());
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C15820 mergeDynamicPartitionMetadata(C22171 c22171) {
        C22171 c221712;
        C15722 c15722 = this.dynamicPartitionMetadataBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 64) != 0 && (c221712 = this.dynamicPartitionMetadata_) != null && c221712 != C22171.getDefaultInstance()) {
                getDynamicPartitionMetadataBuilder().mergeFrom(c22171);
            } else {
                this.dynamicPartitionMetadata_ = c22171;
            }
        } else {
            c15722.m37098(c22171);
        }
        if (this.dynamicPartitionMetadata_ != null) {
            this.bitField0_ |= 64;
            onChanged();
        }
        return this;
    }

    public C15820 clearDynamicPartitionMetadata() {
        this.bitField0_ &= -65;
        this.dynamicPartitionMetadata_ = null;
        C15722 c15722 = this.dynamicPartitionMetadataBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.dynamicPartitionMetadataBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C21466 getDynamicPartitionMetadataBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (C21466) getDynamicPartitionMetadataFieldBuilder().m37104();
    }

    @Override // l.InterfaceC18644
    public InterfaceC4532 getDynamicPartitionMetadataOrBuilder() {
        C15722 c15722 = this.dynamicPartitionMetadataBuilder_;
        if (c15722 != null) {
            return (InterfaceC4532) c15722.m37101();
        }
        C22171 c22171 = this.dynamicPartitionMetadata_;
        return c22171 == null ? C22171.getDefaultInstance() : c22171;
    }

    private C15722 getDynamicPartitionMetadataFieldBuilder() {
        if (this.dynamicPartitionMetadataBuilder_ == null) {
            this.dynamicPartitionMetadataBuilder_ = new C15722(getDynamicPartitionMetadata(), getParentForChildren(), isClean());
            this.dynamicPartitionMetadata_ = null;
        }
        return this.dynamicPartitionMetadataBuilder_;
    }

    @Override // l.InterfaceC18644
    public boolean hasPartialUpdate() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC18644
    public boolean getPartialUpdate() {
        return this.partialUpdate_;
    }

    public C15820 setPartialUpdate(boolean z) {
        this.partialUpdate_ = z;
        this.bitField0_ |= 128;
        onChanged();
        return this;
    }

    public C15820 clearPartialUpdate() {
        this.bitField0_ &= -129;
        this.partialUpdate_ = false;
        onChanged();
        return this;
    }

    private void ensureApexInfoIsMutable() {
        if ((this.bitField0_ & 256) == 0) {
            this.apexInfo_ = new ArrayList(this.apexInfo_);
            this.bitField0_ |= 256;
        }
    }

    @Override // l.InterfaceC18644
    public List getApexInfoList() {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            return C20195.unmodifiableList(this.apexInfo_);
        }
        return c14311.m34175();
    }

    @Override // l.InterfaceC18644
    public int getApexInfoCount() {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            return this.apexInfo_.size();
        }
        return c14311.m34167();
    }

    @Override // l.InterfaceC18644
    public C1710 getApexInfo(int i) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            return (C1710) this.apexInfo_.get(i);
        }
        return (C1710) c14311.m34164(i);
    }

    public C15820 setApexInfo(int i, C1710 c1710) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            c1710.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.set(i, c1710);
            onChanged();
            return this;
        }
        c14311.m34170(i, c1710);
        return this;
    }

    public C15820 setApexInfo(int i, C7148 c7148) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.set(i, c7148.build());
            onChanged();
            return this;
        }
        c14311.m34170(i, c7148.build());
        return this;
    }

    public C15820 addApexInfo(C1710 c1710) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            c1710.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.add(c1710);
            onChanged();
            return this;
        }
        c14311.m34166(c1710);
        return this;
    }

    public C15820 addApexInfo(int i, C1710 c1710) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            c1710.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.add(i, c1710);
            onChanged();
            return this;
        }
        c14311.m34165(i, c1710);
        return this;
    }

    public C15820 addApexInfo(C7148 c7148) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.add(c7148.build());
            onChanged();
            return this;
        }
        c14311.m34166(c7148.build());
        return this;
    }

    public C15820 addApexInfo(int i, C7148 c7148) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.add(i, c7148.build());
            onChanged();
            return this;
        }
        c14311.m34165(i, c7148.build());
        return this;
    }

    public C15820 addAllApexInfo(Iterable iterable) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            ensureApexInfoIsMutable();
            AbstractC2359.m7667(iterable, this.apexInfo_);
            onChanged();
            return this;
        }
        c14311.m34161(iterable);
        return this;
    }

    public C15820 clearApexInfo() {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            this.apexInfo_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }
        c14311.m34169();
        return this;
    }

    public C15820 removeApexInfo(int i) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.remove(i);
            onChanged();
            return this;
        }
        c14311.m34173(i);
        return this;
    }

    public C7148 getApexInfoBuilder(int i) {
        return (C7148) getApexInfoFieldBuilder().m34158(i);
    }

    @Override // l.InterfaceC18644
    public InterfaceC16526 getApexInfoOrBuilder(int i) {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 == null) {
            return (InterfaceC16526) this.apexInfo_.get(i);
        }
        return (InterfaceC16526) c14311.m34168(i);
    }

    @Override // l.InterfaceC18644
    public List getApexInfoOrBuilderList() {
        C14311 c14311 = this.apexInfoBuilder_;
        if (c14311 != null) {
            return c14311.m34162();
        }
        return C20195.unmodifiableList(this.apexInfo_);
    }

    public C7148 addApexInfoBuilder() {
        return (C7148) getApexInfoFieldBuilder().m34160(C1710.getDefaultInstance());
    }

    public C7148 addApexInfoBuilder(int i) {
        return (C7148) getApexInfoFieldBuilder().m34159(i, C1710.getDefaultInstance());
    }

    public List getApexInfoBuilderList() {
        return getApexInfoFieldBuilder().m34171();
    }

    private C14311 getApexInfoFieldBuilder() {
        if (this.apexInfoBuilder_ == null) {
            this.apexInfoBuilder_ = new C14311(this.apexInfo_, (this.bitField0_ & 256) != 0, getParentForChildren(), isClean());
            this.apexInfo_ = null;
        }
        return this.apexInfoBuilder_;
    }

    @Override // l.InterfaceC18644
    public boolean hasSecurityPatchLevel() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC18644
    public String getSecurityPatchLevel() {
        Object obj = this.securityPatchLevel_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String m16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.securityPatchLevel_ = m16501;
            }
            return m16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC18644
    public AbstractC5886 getSecurityPatchLevelBytes() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            AbstractC5886 m16491 = AbstractC5886.m16491((String) obj);
            this.securityPatchLevel_ = m16491;
            return m16491;
        }
        return (AbstractC5886) obj;
    }

    public C15820 setSecurityPatchLevel(String str) {
        str.getClass();
        this.securityPatchLevel_ = str;
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C15820 clearSecurityPatchLevel() {
        this.securityPatchLevel_ = C2416.getDefaultInstance().getSecurityPatchLevel();
        this.bitField0_ &= -513;
        onChanged();
        return this;
    }

    public C15820 setSecurityPatchLevelBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.securityPatchLevel_ = abstractC5886;
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }
}
