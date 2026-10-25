package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* compiled from: C9PC */
/* renamed from: l.ۢܶ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9677 extends AbstractC19916 implements InterfaceC2621 {
    public int bitField0_;
    public long estimateCowSize_;
    public long estimateOpCountMax_;
    public C15722 fecDataExtentBuilder_;
    public C12293 fecDataExtent_;
    public C15722 fecExtentBuilder_;
    public C12293 fecExtent_;
    public int fecRoots_;
    public Object filesystemType_;
    public Object hashTreeAlgorithm_;
    public C15722 hashTreeDataExtentBuilder_;
    public C12293 hashTreeDataExtent_;
    public C15722 hashTreeExtentBuilder_;
    public C12293 hashTreeExtent_;
    public AbstractC5886 hashTreeSalt_;
    public C14311 mergeOperationsBuilder_;
    public List mergeOperations_;
    public C15722 newPartitionInfoBuilder_;
    public C14614 newPartitionInfo_;
    public C14311 newPartitionSignatureBuilder_;
    public List newPartitionSignature_;
    public C15722 oldPartitionInfoBuilder_;
    public C14614 oldPartitionInfo_;
    public C14311 operationsBuilder_;
    public List operations_;
    public Object partitionName_;
    public boolean postinstallOptional_;
    public Object postinstallPath_;
    public boolean runPostinstall_;
    public Object version_;

    public /* synthetic */ C9677(int i) {
        this();
    }

    public /* synthetic */ C9677(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    public static final C17757 getDescriptor() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
        return c17757;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable;
        c9766.m24773(C8971.class, C9677.class);
        return c9766;
    }

    public C9677() {
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC5886.f18080;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
        maybeForceBuilderInitialization();
    }

    public C9677(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC5886.f18080;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        boolean z;
        z = AbstractC4121.alwaysUseFieldBuilders;
        if (z) {
            getNewPartitionSignatureFieldBuilder();
            getOldPartitionInfoFieldBuilder();
            getNewPartitionInfoFieldBuilder();
            getOperationsFieldBuilder();
            getHashTreeDataExtentFieldBuilder();
            getHashTreeExtentFieldBuilder();
            getFecDataExtentFieldBuilder();
            getFecExtentFieldBuilder();
            getMergeOperationsFieldBuilder();
        }
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C9677 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            this.newPartitionSignature_ = Collections.EMPTY_LIST;
        } else {
            this.newPartitionSignature_ = null;
            c14311.m34169();
        }
        this.bitField0_ &= -17;
        this.oldPartitionInfo_ = null;
        C15722 c15722 = this.oldPartitionInfoBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.oldPartitionInfoBuilder_ = null;
        }
        this.newPartitionInfo_ = null;
        C15722 c157222 = this.newPartitionInfoBuilder_;
        if (c157222 != null) {
            c157222.m37102();
            this.newPartitionInfoBuilder_ = null;
        }
        C14311 c143112 = this.operationsBuilder_;
        if (c143112 == null) {
            this.operations_ = Collections.EMPTY_LIST;
        } else {
            this.operations_ = null;
            c143112.m34169();
        }
        this.bitField0_ &= -129;
        this.postinstallOptional_ = false;
        this.hashTreeDataExtent_ = null;
        C15722 c157223 = this.hashTreeDataExtentBuilder_;
        if (c157223 != null) {
            c157223.m37102();
            this.hashTreeDataExtentBuilder_ = null;
        }
        this.hashTreeExtent_ = null;
        C15722 c157224 = this.hashTreeExtentBuilder_;
        if (c157224 != null) {
            c157224.m37102();
            this.hashTreeExtentBuilder_ = null;
        }
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC5886.f18080;
        this.fecDataExtent_ = null;
        C15722 c157225 = this.fecDataExtentBuilder_;
        if (c157225 != null) {
            c157225.m37102();
            this.fecDataExtentBuilder_ = null;
        }
        this.fecExtent_ = null;
        C15722 c157226 = this.fecExtentBuilder_;
        if (c157226 != null) {
            c157226.m37102();
            this.fecExtentBuilder_ = null;
        }
        this.fecRoots_ = 2;
        this.version_ = "";
        C14311 c143113 = this.mergeOperationsBuilder_;
        if (c143113 == null) {
            this.mergeOperations_ = Collections.EMPTY_LIST;
        } else {
            this.mergeOperations_ = null;
            c143113.m34169();
        }
        this.bitField0_ &= -131073;
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C20260.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C8971 getDefaultInstanceForType() {
        return C8971.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C8971 build() {
        C8971 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C8971 buildPartial() {
        C8971 c8971 = new C8971(this);
        buildPartialRepeatedFields(c8971);
        if (this.bitField0_ != 0) {
            buildPartial0(c8971);
        }
        onBuilt();
        return c8971;
    }

    private void buildPartialRepeatedFields(C8971 c8971) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            if ((this.bitField0_ & 16) != 0) {
                this.newPartitionSignature_ = C20195.unmodifiableList(this.newPartitionSignature_);
                this.bitField0_ &= -17;
            }
            c8971.newPartitionSignature_ = this.newPartitionSignature_;
        } else {
            c8971.newPartitionSignature_ = c14311.m34163();
        }
        C14311 c143112 = this.operationsBuilder_;
        if (c143112 == null) {
            if ((this.bitField0_ & 128) != 0) {
                this.operations_ = C20195.unmodifiableList(this.operations_);
                this.bitField0_ &= -129;
            }
            c8971.operations_ = this.operations_;
        } else {
            c8971.operations_ = c143112.m34163();
        }
        C14311 c143113 = this.mergeOperationsBuilder_;
        if (c143113 == null) {
            if ((this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                this.mergeOperations_ = C20195.unmodifiableList(this.mergeOperations_);
                this.bitField0_ &= -131073;
            }
            c8971.mergeOperations_ = this.mergeOperations_;
            return;
        }
        c8971.mergeOperations_ = c143113.m34163();
    }

    private void buildPartial0(C8971 c8971) {
        int i;
        int i2;
        C12293 c12293;
        C12293 c122932;
        C12293 c122933;
        C12293 c122934;
        C14614 c14614;
        C14614 c146142;
        int i3 = this.bitField0_;
        if ((i3 & 1) != 0) {
            c8971.partitionName_ = this.partitionName_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            c8971.runPostinstall_ = this.runPostinstall_;
            i |= 2;
        }
        if ((i3 & 4) != 0) {
            c8971.postinstallPath_ = this.postinstallPath_;
            i |= 4;
        }
        if ((i3 & 8) != 0) {
            c8971.filesystemType_ = this.filesystemType_;
            i |= 8;
        }
        if ((i3 & 32) != 0) {
            C15722 c15722 = this.oldPartitionInfoBuilder_;
            if (c15722 == null) {
                c146142 = this.oldPartitionInfo_;
            } else {
                c146142 = (C14614) c15722.m37099();
            }
            c8971.oldPartitionInfo_ = c146142;
            i |= 16;
        }
        if ((i3 & 64) != 0) {
            C15722 c157222 = this.newPartitionInfoBuilder_;
            if (c157222 == null) {
                c14614 = this.newPartitionInfo_;
            } else {
                c14614 = (C14614) c157222.m37099();
            }
            c8971.newPartitionInfo_ = c14614;
            i |= 32;
        }
        if ((i3 & 256) != 0) {
            c8971.postinstallOptional_ = this.postinstallOptional_;
            i |= 64;
        }
        if ((i3 & 512) != 0) {
            C15722 c157223 = this.hashTreeDataExtentBuilder_;
            if (c157223 == null) {
                c122934 = this.hashTreeDataExtent_;
            } else {
                c122934 = (C12293) c157223.m37099();
            }
            c8971.hashTreeDataExtent_ = c122934;
            i |= 128;
        }
        if ((i3 & 1024) != 0) {
            C15722 c157224 = this.hashTreeExtentBuilder_;
            if (c157224 == null) {
                c122933 = this.hashTreeExtent_;
            } else {
                c122933 = (C12293) c157224.m37099();
            }
            c8971.hashTreeExtent_ = c122933;
            i |= 256;
        }
        if ((i3 & 2048) != 0) {
            c8971.hashTreeAlgorithm_ = this.hashTreeAlgorithm_;
            i |= 512;
        }
        if ((i3 & 4096) != 0) {
            c8971.hashTreeSalt_ = this.hashTreeSalt_;
            i |= 1024;
        }
        if ((i3 & 8192) != 0) {
            C15722 c157225 = this.fecDataExtentBuilder_;
            if (c157225 == null) {
                c122932 = this.fecDataExtent_;
            } else {
                c122932 = (C12293) c157225.m37099();
            }
            c8971.fecDataExtent_ = c122932;
            i |= 2048;
        }
        if ((i3 & 16384) != 0) {
            C15722 c157226 = this.fecExtentBuilder_;
            if (c157226 == null) {
                c12293 = this.fecExtent_;
            } else {
                c12293 = (C12293) c157226.m37099();
            }
            c8971.fecExtent_ = c12293;
            i |= 4096;
        }
        if ((i3 & 32768) != 0) {
            c8971.fecRoots_ = this.fecRoots_;
            i |= 8192;
        }
        if ((i3 & 65536) != 0) {
            c8971.version_ = this.version_;
            i |= 16384;
        }
        if ((262144 & i3) != 0) {
            c8971.estimateCowSize_ = this.estimateCowSize_;
            i |= 32768;
        }
        if ((i3 & 524288) != 0) {
            c8971.estimateOpCountMax_ = this.estimateOpCountMax_;
            i |= 65536;
        }
        i2 = c8971.bitField0_;
        c8971.bitField0_ = i2 | i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C9677 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8971) {
            return mergeFrom((C8971) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C9677 mergeFrom(C8971 c8971) {
        List list;
        List list2;
        List list3;
        boolean z;
        List list4;
        List list5;
        List list6;
        boolean z2;
        List list7;
        List list8;
        List list9;
        boolean z3;
        List list10;
        List list11;
        List list12;
        Object obj;
        Object obj2;
        List list13;
        List list14;
        List list15;
        List list16;
        List list17;
        List list18;
        Object obj3;
        Object obj4;
        Object obj5;
        if (c8971 == C8971.getDefaultInstance()) {
            return this;
        }
        if (c8971.hasPartitionName()) {
            obj5 = c8971.partitionName_;
            this.partitionName_ = obj5;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c8971.hasRunPostinstall()) {
            setRunPostinstall(c8971.getRunPostinstall());
        }
        if (c8971.hasPostinstallPath()) {
            obj4 = c8971.postinstallPath_;
            this.postinstallPath_ = obj4;
            this.bitField0_ |= 4;
            onChanged();
        }
        if (c8971.hasFilesystemType()) {
            obj3 = c8971.filesystemType_;
            this.filesystemType_ = obj3;
            this.bitField0_ |= 8;
            onChanged();
        }
        if (this.newPartitionSignatureBuilder_ == null) {
            list16 = c8971.newPartitionSignature_;
            if (!list16.isEmpty()) {
                if (this.newPartitionSignature_.isEmpty()) {
                    list18 = c8971.newPartitionSignature_;
                    this.newPartitionSignature_ = list18;
                    this.bitField0_ &= -17;
                } else {
                    ensureNewPartitionSignatureIsMutable();
                    List list19 = this.newPartitionSignature_;
                    list17 = c8971.newPartitionSignature_;
                    list19.addAll(list17);
                }
                onChanged();
            }
        } else {
            list = c8971.newPartitionSignature_;
            if (!list.isEmpty()) {
                if (this.newPartitionSignatureBuilder_.m34174()) {
                    this.newPartitionSignatureBuilder_.m34172();
                    this.newPartitionSignatureBuilder_ = null;
                    list3 = c8971.newPartitionSignature_;
                    this.newPartitionSignature_ = list3;
                    this.bitField0_ &= -17;
                    z = AbstractC4121.alwaysUseFieldBuilders;
                    this.newPartitionSignatureBuilder_ = z ? getNewPartitionSignatureFieldBuilder() : null;
                } else {
                    C14311 c14311 = this.newPartitionSignatureBuilder_;
                    list2 = c8971.newPartitionSignature_;
                    c14311.m34161(list2);
                }
            }
        }
        if (c8971.hasOldPartitionInfo()) {
            mergeOldPartitionInfo(c8971.getOldPartitionInfo());
        }
        if (c8971.hasNewPartitionInfo()) {
            mergeNewPartitionInfo(c8971.getNewPartitionInfo());
        }
        if (this.operationsBuilder_ == null) {
            list13 = c8971.operations_;
            if (!list13.isEmpty()) {
                if (this.operations_.isEmpty()) {
                    list15 = c8971.operations_;
                    this.operations_ = list15;
                    this.bitField0_ &= -129;
                } else {
                    ensureOperationsIsMutable();
                    List list20 = this.operations_;
                    list14 = c8971.operations_;
                    list20.addAll(list14);
                }
                onChanged();
            }
        } else {
            list4 = c8971.operations_;
            if (!list4.isEmpty()) {
                if (this.operationsBuilder_.m34174()) {
                    this.operationsBuilder_.m34172();
                    this.operationsBuilder_ = null;
                    list6 = c8971.operations_;
                    this.operations_ = list6;
                    this.bitField0_ &= -129;
                    z2 = AbstractC4121.alwaysUseFieldBuilders;
                    this.operationsBuilder_ = z2 ? getOperationsFieldBuilder() : null;
                } else {
                    C14311 c143112 = this.operationsBuilder_;
                    list5 = c8971.operations_;
                    c143112.m34161(list5);
                }
            }
        }
        if (c8971.hasPostinstallOptional()) {
            setPostinstallOptional(c8971.getPostinstallOptional());
        }
        if (c8971.hasHashTreeDataExtent()) {
            mergeHashTreeDataExtent(c8971.getHashTreeDataExtent());
        }
        if (c8971.hasHashTreeExtent()) {
            mergeHashTreeExtent(c8971.getHashTreeExtent());
        }
        if (c8971.hasHashTreeAlgorithm()) {
            obj2 = c8971.hashTreeAlgorithm_;
            this.hashTreeAlgorithm_ = obj2;
            this.bitField0_ |= 2048;
            onChanged();
        }
        if (c8971.hasHashTreeSalt()) {
            setHashTreeSalt(c8971.getHashTreeSalt());
        }
        if (c8971.hasFecDataExtent()) {
            mergeFecDataExtent(c8971.getFecDataExtent());
        }
        if (c8971.hasFecExtent()) {
            mergeFecExtent(c8971.getFecExtent());
        }
        if (c8971.hasFecRoots()) {
            setFecRoots(c8971.getFecRoots());
        }
        if (c8971.hasVersion()) {
            obj = c8971.version_;
            this.version_ = obj;
            this.bitField0_ |= 65536;
            onChanged();
        }
        if (this.mergeOperationsBuilder_ == null) {
            list10 = c8971.mergeOperations_;
            if (!list10.isEmpty()) {
                if (this.mergeOperations_.isEmpty()) {
                    list12 = c8971.mergeOperations_;
                    this.mergeOperations_ = list12;
                    this.bitField0_ &= -131073;
                } else {
                    ensureMergeOperationsIsMutable();
                    List list21 = this.mergeOperations_;
                    list11 = c8971.mergeOperations_;
                    list21.addAll(list11);
                }
                onChanged();
            }
        } else {
            list7 = c8971.mergeOperations_;
            if (!list7.isEmpty()) {
                if (this.mergeOperationsBuilder_.m34174()) {
                    this.mergeOperationsBuilder_.m34172();
                    this.mergeOperationsBuilder_ = null;
                    list9 = c8971.mergeOperations_;
                    this.mergeOperations_ = list9;
                    this.bitField0_ &= -131073;
                    z3 = AbstractC4121.alwaysUseFieldBuilders;
                    this.mergeOperationsBuilder_ = z3 ? getMergeOperationsFieldBuilder() : null;
                } else {
                    C14311 c143113 = this.mergeOperationsBuilder_;
                    list8 = c8971.mergeOperations_;
                    c143113.m34161(list8);
                }
            }
        }
        if (c8971.hasEstimateCowSize()) {
            setEstimateCowSize(c8971.getEstimateCowSize());
        }
        if (c8971.hasEstimateOpCountMax()) {
            setEstimateOpCountMax(c8971.getEstimateOpCountMax());
        }
        mergeUnknownFields(c8971.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        if (!hasPartitionName()) {
            return false;
        }
        for (int i = 0; i < getOperationsCount(); i++) {
            if (!getOperations(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C9677 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    switch (mo19567) {
                        case 0:
                            z = true;
                        case 10:
                            this.partitionName_ = abstractC7297.mo19566();
                            this.bitField0_ |= 1;
                        case 16:
                            this.runPostinstall_ = abstractC7297.mo19571();
                            this.bitField0_ |= 2;
                        case 26:
                            this.postinstallPath_ = abstractC7297.mo19566();
                            this.bitField0_ |= 4;
                        case 34:
                            this.filesystemType_ = abstractC7297.mo19566();
                            this.bitField0_ |= 8;
                        case 42:
                            C19555 c19555 = (C19555) abstractC7297.mo19552(C19555.parser(), c17798);
                            C14311 c14311 = this.newPartitionSignatureBuilder_;
                            if (c14311 == null) {
                                ensureNewPartitionSignatureIsMutable();
                                this.newPartitionSignature_.add(c19555);
                            } else {
                                c14311.m34166(c19555);
                            }
                        case 50:
                            abstractC7297.mo19556(getOldPartitionInfoFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 32;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            abstractC7297.mo19556(getNewPartitionInfoFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 64;
                        case 66:
                            C1915 c1915 = (C1915) abstractC7297.mo19552(C1915.parser(), c17798);
                            C14311 c143112 = this.operationsBuilder_;
                            if (c143112 == null) {
                                ensureOperationsIsMutable();
                                this.operations_.add(c1915);
                            } else {
                                c143112.m34166(c1915);
                            }
                        case 72:
                            this.postinstallOptional_ = abstractC7297.mo19571();
                            this.bitField0_ |= 256;
                        case 82:
                            abstractC7297.mo19556(getHashTreeDataExtentFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 512;
                        case 90:
                            abstractC7297.mo19556(getHashTreeExtentFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 1024;
                        case 98:
                            this.hashTreeAlgorithm_ = abstractC7297.mo19566();
                            this.bitField0_ |= 2048;
                        case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            this.hashTreeSalt_ = abstractC7297.mo19566();
                            this.bitField0_ |= 4096;
                        case 114:
                            abstractC7297.mo19556(getFecDataExtentFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 8192;
                        case 122:
                            abstractC7297.mo19556(getFecExtentFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 16384;
                        case 128:
                            this.fecRoots_ = abstractC7297.mo19577();
                            this.bitField0_ |= 32768;
                        case 138:
                            this.version_ = abstractC7297.mo19566();
                            this.bitField0_ |= 65536;
                        case 146:
                            C6649 c6649 = (C6649) abstractC7297.mo19552(C6649.parser(), c17798);
                            C14311 c143113 = this.mergeOperationsBuilder_;
                            if (c143113 == null) {
                                ensureMergeOperationsIsMutable();
                                this.mergeOperations_.add(c6649);
                            } else {
                                c143113.m34166(c6649);
                            }
                        case 152:
                            this.estimateCowSize_ = abstractC7297.mo19578();
                            this.bitField0_ |= 262144;
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                            this.estimateOpCountMax_ = abstractC7297.mo19578();
                            this.bitField0_ |= 524288;
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

    @Override // l.InterfaceC2621
    public boolean hasPartitionName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC2621
    public String getPartitionName() {
        Object obj = this.partitionName_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String m16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.partitionName_ = m16501;
            }
            return m16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getPartitionNameBytes() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            AbstractC5886 m16491 = AbstractC5886.m16491((String) obj);
            this.partitionName_ = m16491;
            return m16491;
        }
        return (AbstractC5886) obj;
    }

    public C9677 setPartitionName(String str) {
        str.getClass();
        this.partitionName_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C9677 clearPartitionName() {
        this.partitionName_ = C8971.getDefaultInstance().getPartitionName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C9677 setPartitionNameBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.partitionName_ = abstractC5886;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC2621
    public boolean hasRunPostinstall() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC2621
    public boolean getRunPostinstall() {
        return this.runPostinstall_;
    }

    public C9677 setRunPostinstall(boolean z) {
        this.runPostinstall_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C9677 clearRunPostinstall() {
        this.bitField0_ &= -3;
        this.runPostinstall_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC2621
    public boolean hasPostinstallPath() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC2621
    public String getPostinstallPath() {
        Object obj = this.postinstallPath_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String m16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.postinstallPath_ = m16501;
            }
            return m16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getPostinstallPathBytes() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            AbstractC5886 m16491 = AbstractC5886.m16491((String) obj);
            this.postinstallPath_ = m16491;
            return m16491;
        }
        return (AbstractC5886) obj;
    }

    public C9677 setPostinstallPath(String str) {
        str.getClass();
        this.postinstallPath_ = str;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C9677 clearPostinstallPath() {
        this.postinstallPath_ = C8971.getDefaultInstance().getPostinstallPath();
        this.bitField0_ &= -5;
        onChanged();
        return this;
    }

    public C9677 setPostinstallPathBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.postinstallPath_ = abstractC5886;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC2621
    public boolean hasFilesystemType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC2621
    public String getFilesystemType() {
        Object obj = this.filesystemType_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String m16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.filesystemType_ = m16501;
            }
            return m16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getFilesystemTypeBytes() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            AbstractC5886 m16491 = AbstractC5886.m16491((String) obj);
            this.filesystemType_ = m16491;
            return m16491;
        }
        return (AbstractC5886) obj;
    }

    public C9677 setFilesystemType(String str) {
        str.getClass();
        this.filesystemType_ = str;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C9677 clearFilesystemType() {
        this.filesystemType_ = C8971.getDefaultInstance().getFilesystemType();
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public C9677 setFilesystemTypeBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.filesystemType_ = abstractC5886;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    private void ensureNewPartitionSignatureIsMutable() {
        if ((this.bitField0_ & 16) == 0) {
            this.newPartitionSignature_ = new ArrayList(this.newPartitionSignature_);
            this.bitField0_ |= 16;
        }
    }

    @Override // l.InterfaceC2621
    public List getNewPartitionSignatureList() {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            return C20195.unmodifiableList(this.newPartitionSignature_);
        }
        return c14311.m34175();
    }

    @Override // l.InterfaceC2621
    public int getNewPartitionSignatureCount() {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            return this.newPartitionSignature_.size();
        }
        return c14311.m34167();
    }

    @Override // l.InterfaceC2621
    public C19555 getNewPartitionSignature(int i) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            return (C19555) this.newPartitionSignature_.get(i);
        }
        return (C19555) c14311.m34164(i);
    }

    public C9677 setNewPartitionSignature(int i, C19555 c19555) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            c19555.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.set(i, c19555);
            onChanged();
            return this;
        }
        c14311.m34170(i, c19555);
        return this;
    }

    public C9677 setNewPartitionSignature(int i, C18849 c18849) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.set(i, c18849.build());
            onChanged();
            return this;
        }
        c14311.m34170(i, c18849.build());
        return this;
    }

    public C9677 addNewPartitionSignature(C19555 c19555) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            c19555.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(c19555);
            onChanged();
            return this;
        }
        c14311.m34166(c19555);
        return this;
    }

    public C9677 addNewPartitionSignature(int i, C19555 c19555) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            c19555.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(i, c19555);
            onChanged();
            return this;
        }
        c14311.m34165(i, c19555);
        return this;
    }

    public C9677 addNewPartitionSignature(C18849 c18849) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(c18849.build());
            onChanged();
            return this;
        }
        c14311.m34166(c18849.build());
        return this;
    }

    public C9677 addNewPartitionSignature(int i, C18849 c18849) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(i, c18849.build());
            onChanged();
            return this;
        }
        c14311.m34165(i, c18849.build());
        return this;
    }

    public C9677 addAllNewPartitionSignature(Iterable iterable) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            ensureNewPartitionSignatureIsMutable();
            AbstractC2359.m7667(iterable, this.newPartitionSignature_);
            onChanged();
            return this;
        }
        c14311.m34161(iterable);
        return this;
    }

    public C9677 clearNewPartitionSignature() {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            this.newPartitionSignature_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }
        c14311.m34169();
        return this;
    }

    public C9677 removeNewPartitionSignature(int i) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.remove(i);
            onChanged();
            return this;
        }
        c14311.m34173(i);
        return this;
    }

    public C18849 getNewPartitionSignatureBuilder(int i) {
        return (C18849) getNewPartitionSignatureFieldBuilder().m34158(i);
    }

    @Override // l.InterfaceC2621
    public InterfaceC5443 getNewPartitionSignatureOrBuilder(int i) {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 == null) {
            return (InterfaceC5443) this.newPartitionSignature_.get(i);
        }
        return (InterfaceC5443) c14311.m34168(i);
    }

    @Override // l.InterfaceC2621
    public List getNewPartitionSignatureOrBuilderList() {
        C14311 c14311 = this.newPartitionSignatureBuilder_;
        if (c14311 != null) {
            return c14311.m34162();
        }
        return C20195.unmodifiableList(this.newPartitionSignature_);
    }

    public C18849 addNewPartitionSignatureBuilder() {
        return (C18849) getNewPartitionSignatureFieldBuilder().m34160(C19555.getDefaultInstance());
    }

    public C18849 addNewPartitionSignatureBuilder(int i) {
        return (C18849) getNewPartitionSignatureFieldBuilder().m34159(i, C19555.getDefaultInstance());
    }

    public List getNewPartitionSignatureBuilderList() {
        return getNewPartitionSignatureFieldBuilder().m34171();
    }

    private C14311 getNewPartitionSignatureFieldBuilder() {
        if (this.newPartitionSignatureBuilder_ == null) {
            this.newPartitionSignatureBuilder_ = new C14311(this.newPartitionSignature_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
            this.newPartitionSignature_ = null;
        }
        return this.newPartitionSignatureBuilder_;
    }

    @Override // l.InterfaceC2621
    public boolean hasOldPartitionInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC2621
    public C14614 getOldPartitionInfo() {
        C15722 c15722 = this.oldPartitionInfoBuilder_;
        if (c15722 == null) {
            C14614 c14614 = this.oldPartitionInfo_;
            return c14614 == null ? C14614.getDefaultInstance() : c14614;
        }
        return (C14614) c15722.m37103();
    }

    public C9677 setOldPartitionInfo(C14614 c14614) {
        C15722 c15722 = this.oldPartitionInfoBuilder_;
        if (c15722 == null) {
            c14614.getClass();
            this.oldPartitionInfo_ = c14614;
        } else {
            c15722.m37100(c14614);
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C9677 setOldPartitionInfo(C17437 c17437) {
        C15722 c15722 = this.oldPartitionInfoBuilder_;
        if (c15722 == null) {
            this.oldPartitionInfo_ = c17437.build();
        } else {
            c15722.m37100(c17437.build());
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C9677 mergeOldPartitionInfo(C14614 c14614) {
        C14614 c146142;
        C15722 c15722 = this.oldPartitionInfoBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 32) != 0 && (c146142 = this.oldPartitionInfo_) != null && c146142 != C14614.getDefaultInstance()) {
                getOldPartitionInfoBuilder().mergeFrom(c14614);
            } else {
                this.oldPartitionInfo_ = c14614;
            }
        } else {
            c15722.m37098(c14614);
        }
        if (this.oldPartitionInfo_ != null) {
            this.bitField0_ |= 32;
            onChanged();
        }
        return this;
    }

    public C9677 clearOldPartitionInfo() {
        this.bitField0_ &= -33;
        this.oldPartitionInfo_ = null;
        C15722 c15722 = this.oldPartitionInfoBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.oldPartitionInfoBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C17437 getOldPartitionInfoBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (C17437) getOldPartitionInfoFieldBuilder().m37104();
    }

    @Override // l.InterfaceC2621
    public InterfaceC6854 getOldPartitionInfoOrBuilder() {
        C15722 c15722 = this.oldPartitionInfoBuilder_;
        if (c15722 != null) {
            return (InterfaceC6854) c15722.m37101();
        }
        C14614 c14614 = this.oldPartitionInfo_;
        return c14614 == null ? C14614.getDefaultInstance() : c14614;
    }

    private C15722 getOldPartitionInfoFieldBuilder() {
        if (this.oldPartitionInfoBuilder_ == null) {
            this.oldPartitionInfoBuilder_ = new C15722(getOldPartitionInfo(), getParentForChildren(), isClean());
            this.oldPartitionInfo_ = null;
        }
        return this.oldPartitionInfoBuilder_;
    }

    @Override // l.InterfaceC2621
    public boolean hasNewPartitionInfo() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC2621
    public C14614 getNewPartitionInfo() {
        C15722 c15722 = this.newPartitionInfoBuilder_;
        if (c15722 == null) {
            C14614 c14614 = this.newPartitionInfo_;
            return c14614 == null ? C14614.getDefaultInstance() : c14614;
        }
        return (C14614) c15722.m37103();
    }

    public C9677 setNewPartitionInfo(C14614 c14614) {
        C15722 c15722 = this.newPartitionInfoBuilder_;
        if (c15722 == null) {
            c14614.getClass();
            this.newPartitionInfo_ = c14614;
        } else {
            c15722.m37100(c14614);
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C9677 setNewPartitionInfo(C17437 c17437) {
        C15722 c15722 = this.newPartitionInfoBuilder_;
        if (c15722 == null) {
            this.newPartitionInfo_ = c17437.build();
        } else {
            c15722.m37100(c17437.build());
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C9677 mergeNewPartitionInfo(C14614 c14614) {
        C14614 c146142;
        C15722 c15722 = this.newPartitionInfoBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 64) != 0 && (c146142 = this.newPartitionInfo_) != null && c146142 != C14614.getDefaultInstance()) {
                getNewPartitionInfoBuilder().mergeFrom(c14614);
            } else {
                this.newPartitionInfo_ = c14614;
            }
        } else {
            c15722.m37098(c14614);
        }
        if (this.newPartitionInfo_ != null) {
            this.bitField0_ |= 64;
            onChanged();
        }
        return this;
    }

    public C9677 clearNewPartitionInfo() {
        this.bitField0_ &= -65;
        this.newPartitionInfo_ = null;
        C15722 c15722 = this.newPartitionInfoBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.newPartitionInfoBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C17437 getNewPartitionInfoBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (C17437) getNewPartitionInfoFieldBuilder().m37104();
    }

    @Override // l.InterfaceC2621
    public InterfaceC6854 getNewPartitionInfoOrBuilder() {
        C15722 c15722 = this.newPartitionInfoBuilder_;
        if (c15722 != null) {
            return (InterfaceC6854) c15722.m37101();
        }
        C14614 c14614 = this.newPartitionInfo_;
        return c14614 == null ? C14614.getDefaultInstance() : c14614;
    }

    private C15722 getNewPartitionInfoFieldBuilder() {
        if (this.newPartitionInfoBuilder_ == null) {
            this.newPartitionInfoBuilder_ = new C15722(getNewPartitionInfo(), getParentForChildren(), isClean());
            this.newPartitionInfo_ = null;
        }
        return this.newPartitionInfoBuilder_;
    }

    private void ensureOperationsIsMutable() {
        if ((this.bitField0_ & 128) == 0) {
            this.operations_ = new ArrayList(this.operations_);
            this.bitField0_ |= 128;
        }
    }

    @Override // l.InterfaceC2621
    public List getOperationsList() {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            return C20195.unmodifiableList(this.operations_);
        }
        return c14311.m34175();
    }

    @Override // l.InterfaceC2621
    public int getOperationsCount() {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            return this.operations_.size();
        }
        return c14311.m34167();
    }

    @Override // l.InterfaceC2621
    public C1915 getOperations(int i) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            return (C1915) this.operations_.get(i);
        }
        return (C1915) c14311.m34164(i);
    }

    public C9677 setOperations(int i, C1915 c1915) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            c1915.getClass();
            ensureOperationsIsMutable();
            this.operations_.set(i, c1915);
            onChanged();
            return this;
        }
        c14311.m34170(i, c1915);
        return this;
    }

    public C9677 setOperations(int i, C22876 c22876) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            ensureOperationsIsMutable();
            this.operations_.set(i, c22876.build());
            onChanged();
            return this;
        }
        c14311.m34170(i, c22876.build());
        return this;
    }

    public C9677 addOperations(C1915 c1915) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            c1915.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(c1915);
            onChanged();
            return this;
        }
        c14311.m34166(c1915);
        return this;
    }

    public C9677 addOperations(int i, C1915 c1915) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            c1915.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(i, c1915);
            onChanged();
            return this;
        }
        c14311.m34165(i, c1915);
        return this;
    }

    public C9677 addOperations(C22876 c22876) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            ensureOperationsIsMutable();
            this.operations_.add(c22876.build());
            onChanged();
            return this;
        }
        c14311.m34166(c22876.build());
        return this;
    }

    public C9677 addOperations(int i, C22876 c22876) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            ensureOperationsIsMutable();
            this.operations_.add(i, c22876.build());
            onChanged();
            return this;
        }
        c14311.m34165(i, c22876.build());
        return this;
    }

    public C9677 addAllOperations(Iterable iterable) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            ensureOperationsIsMutable();
            AbstractC2359.m7667(iterable, this.operations_);
            onChanged();
            return this;
        }
        c14311.m34161(iterable);
        return this;
    }

    public C9677 clearOperations() {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            this.operations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }
        c14311.m34169();
        return this;
    }

    public C9677 removeOperations(int i) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            ensureOperationsIsMutable();
            this.operations_.remove(i);
            onChanged();
            return this;
        }
        c14311.m34173(i);
        return this;
    }

    public C22876 getOperationsBuilder(int i) {
        return (C22876) getOperationsFieldBuilder().m34158(i);
    }

    @Override // l.InterfaceC2621
    public InterfaceC16731 getOperationsOrBuilder(int i) {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 == null) {
            return (InterfaceC16731) this.operations_.get(i);
        }
        return (InterfaceC16731) c14311.m34168(i);
    }

    @Override // l.InterfaceC2621
    public List getOperationsOrBuilderList() {
        C14311 c14311 = this.operationsBuilder_;
        if (c14311 != null) {
            return c14311.m34162();
        }
        return C20195.unmodifiableList(this.operations_);
    }

    public C22876 addOperationsBuilder() {
        return (C22876) getOperationsFieldBuilder().m34160(C1915.getDefaultInstance());
    }

    public C22876 addOperationsBuilder(int i) {
        return (C22876) getOperationsFieldBuilder().m34159(i, C1915.getDefaultInstance());
    }

    public List getOperationsBuilderList() {
        return getOperationsFieldBuilder().m34171();
    }

    private C14311 getOperationsFieldBuilder() {
        if (this.operationsBuilder_ == null) {
            this.operationsBuilder_ = new C14311(this.operations_, (this.bitField0_ & 128) != 0, getParentForChildren(), isClean());
            this.operations_ = null;
        }
        return this.operationsBuilder_;
    }

    @Override // l.InterfaceC2621
    public boolean hasPostinstallOptional() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC2621
    public boolean getPostinstallOptional() {
        return this.postinstallOptional_;
    }

    public C9677 setPostinstallOptional(boolean z) {
        this.postinstallOptional_ = z;
        this.bitField0_ |= 256;
        onChanged();
        return this;
    }

    public C9677 clearPostinstallOptional() {
        this.bitField0_ &= -257;
        this.postinstallOptional_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC2621
    public boolean hasHashTreeDataExtent() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC2621
    public C12293 getHashTreeDataExtent() {
        C15722 c15722 = this.hashTreeDataExtentBuilder_;
        if (c15722 == null) {
            C12293 c12293 = this.hashTreeDataExtent_;
            return c12293 == null ? C12293.getDefaultInstance() : c12293;
        }
        return (C12293) c15722.m37103();
    }

    public C9677 setHashTreeDataExtent(C12293 c12293) {
        C15722 c15722 = this.hashTreeDataExtentBuilder_;
        if (c15722 == null) {
            c12293.getClass();
            this.hashTreeDataExtent_ = c12293;
        } else {
            c15722.m37100(c12293);
        }
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C9677 setHashTreeDataExtent(C12998 c12998) {
        C15722 c15722 = this.hashTreeDataExtentBuilder_;
        if (c15722 == null) {
            this.hashTreeDataExtent_ = c12998.build();
        } else {
            c15722.m37100(c12998.build());
        }
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C9677 mergeHashTreeDataExtent(C12293 c12293) {
        C12293 c122932;
        C15722 c15722 = this.hashTreeDataExtentBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 512) != 0 && (c122932 = this.hashTreeDataExtent_) != null && c122932 != C12293.getDefaultInstance()) {
                getHashTreeDataExtentBuilder().mergeFrom(c12293);
            } else {
                this.hashTreeDataExtent_ = c12293;
            }
        } else {
            c15722.m37098(c12293);
        }
        if (this.hashTreeDataExtent_ != null) {
            this.bitField0_ |= 512;
            onChanged();
        }
        return this;
    }

    public C9677 clearHashTreeDataExtent() {
        this.bitField0_ &= -513;
        this.hashTreeDataExtent_ = null;
        C15722 c15722 = this.hashTreeDataExtentBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.hashTreeDataExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C12998 getHashTreeDataExtentBuilder() {
        this.bitField0_ |= 512;
        onChanged();
        return (C12998) getHashTreeDataExtentFieldBuilder().m37104();
    }

    @Override // l.InterfaceC2621
    public InterfaceC5943 getHashTreeDataExtentOrBuilder() {
        C15722 c15722 = this.hashTreeDataExtentBuilder_;
        if (c15722 != null) {
            return (InterfaceC5943) c15722.m37101();
        }
        C12293 c12293 = this.hashTreeDataExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    private C15722 getHashTreeDataExtentFieldBuilder() {
        if (this.hashTreeDataExtentBuilder_ == null) {
            this.hashTreeDataExtentBuilder_ = new C15722(getHashTreeDataExtent(), getParentForChildren(), isClean());
            this.hashTreeDataExtent_ = null;
        }
        return this.hashTreeDataExtentBuilder_;
    }

    @Override // l.InterfaceC2621
    public boolean hasHashTreeExtent() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // l.InterfaceC2621
    public C12293 getHashTreeExtent() {
        C15722 c15722 = this.hashTreeExtentBuilder_;
        if (c15722 == null) {
            C12293 c12293 = this.hashTreeExtent_;
            return c12293 == null ? C12293.getDefaultInstance() : c12293;
        }
        return (C12293) c15722.m37103();
    }

    public C9677 setHashTreeExtent(C12293 c12293) {
        C15722 c15722 = this.hashTreeExtentBuilder_;
        if (c15722 == null) {
            c12293.getClass();
            this.hashTreeExtent_ = c12293;
        } else {
            c15722.m37100(c12293);
        }
        this.bitField0_ |= 1024;
        onChanged();
        return this;
    }

    public C9677 setHashTreeExtent(C12998 c12998) {
        C15722 c15722 = this.hashTreeExtentBuilder_;
        if (c15722 == null) {
            this.hashTreeExtent_ = c12998.build();
        } else {
            c15722.m37100(c12998.build());
        }
        this.bitField0_ |= 1024;
        onChanged();
        return this;
    }

    public C9677 mergeHashTreeExtent(C12293 c12293) {
        C12293 c122932;
        C15722 c15722 = this.hashTreeExtentBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 1024) != 0 && (c122932 = this.hashTreeExtent_) != null && c122932 != C12293.getDefaultInstance()) {
                getHashTreeExtentBuilder().mergeFrom(c12293);
            } else {
                this.hashTreeExtent_ = c12293;
            }
        } else {
            c15722.m37098(c12293);
        }
        if (this.hashTreeExtent_ != null) {
            this.bitField0_ |= 1024;
            onChanged();
        }
        return this;
    }

    public C9677 clearHashTreeExtent() {
        this.bitField0_ &= -1025;
        this.hashTreeExtent_ = null;
        C15722 c15722 = this.hashTreeExtentBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.hashTreeExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C12998 getHashTreeExtentBuilder() {
        this.bitField0_ |= 1024;
        onChanged();
        return (C12998) getHashTreeExtentFieldBuilder().m37104();
    }

    @Override // l.InterfaceC2621
    public InterfaceC5943 getHashTreeExtentOrBuilder() {
        C15722 c15722 = this.hashTreeExtentBuilder_;
        if (c15722 != null) {
            return (InterfaceC5943) c15722.m37101();
        }
        C12293 c12293 = this.hashTreeExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    private C15722 getHashTreeExtentFieldBuilder() {
        if (this.hashTreeExtentBuilder_ == null) {
            this.hashTreeExtentBuilder_ = new C15722(getHashTreeExtent(), getParentForChildren(), isClean());
            this.hashTreeExtent_ = null;
        }
        return this.hashTreeExtentBuilder_;
    }

    @Override // l.InterfaceC2621
    public boolean hasHashTreeAlgorithm() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // l.InterfaceC2621
    public String getHashTreeAlgorithm() {
        Object obj = this.hashTreeAlgorithm_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String m16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.hashTreeAlgorithm_ = m16501;
            }
            return m16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getHashTreeAlgorithmBytes() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            AbstractC5886 m16491 = AbstractC5886.m16491((String) obj);
            this.hashTreeAlgorithm_ = m16491;
            return m16491;
        }
        return (AbstractC5886) obj;
    }

    public C9677 setHashTreeAlgorithm(String str) {
        str.getClass();
        this.hashTreeAlgorithm_ = str;
        this.bitField0_ |= 2048;
        onChanged();
        return this;
    }

    public C9677 clearHashTreeAlgorithm() {
        this.hashTreeAlgorithm_ = C8971.getDefaultInstance().getHashTreeAlgorithm();
        this.bitField0_ &= -2049;
        onChanged();
        return this;
    }

    public C9677 setHashTreeAlgorithmBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.hashTreeAlgorithm_ = abstractC5886;
        this.bitField0_ |= 2048;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC2621
    public boolean hasHashTreeSalt() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getHashTreeSalt() {
        return this.hashTreeSalt_;
    }

    public C9677 setHashTreeSalt(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.hashTreeSalt_ = abstractC5886;
        this.bitField0_ |= 4096;
        onChanged();
        return this;
    }

    public C9677 clearHashTreeSalt() {
        this.bitField0_ &= -4097;
        this.hashTreeSalt_ = C8971.getDefaultInstance().getHashTreeSalt();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC2621
    public boolean hasFecDataExtent() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // l.InterfaceC2621
    public C12293 getFecDataExtent() {
        C15722 c15722 = this.fecDataExtentBuilder_;
        if (c15722 == null) {
            C12293 c12293 = this.fecDataExtent_;
            return c12293 == null ? C12293.getDefaultInstance() : c12293;
        }
        return (C12293) c15722.m37103();
    }

    public C9677 setFecDataExtent(C12293 c12293) {
        C15722 c15722 = this.fecDataExtentBuilder_;
        if (c15722 == null) {
            c12293.getClass();
            this.fecDataExtent_ = c12293;
        } else {
            c15722.m37100(c12293);
        }
        this.bitField0_ |= 8192;
        onChanged();
        return this;
    }

    public C9677 setFecDataExtent(C12998 c12998) {
        C15722 c15722 = this.fecDataExtentBuilder_;
        if (c15722 == null) {
            this.fecDataExtent_ = c12998.build();
        } else {
            c15722.m37100(c12998.build());
        }
        this.bitField0_ |= 8192;
        onChanged();
        return this;
    }

    public C9677 mergeFecDataExtent(C12293 c12293) {
        C12293 c122932;
        C15722 c15722 = this.fecDataExtentBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 8192) != 0 && (c122932 = this.fecDataExtent_) != null && c122932 != C12293.getDefaultInstance()) {
                getFecDataExtentBuilder().mergeFrom(c12293);
            } else {
                this.fecDataExtent_ = c12293;
            }
        } else {
            c15722.m37098(c12293);
        }
        if (this.fecDataExtent_ != null) {
            this.bitField0_ |= 8192;
            onChanged();
        }
        return this;
    }

    public C9677 clearFecDataExtent() {
        this.bitField0_ &= -8193;
        this.fecDataExtent_ = null;
        C15722 c15722 = this.fecDataExtentBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.fecDataExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C12998 getFecDataExtentBuilder() {
        this.bitField0_ |= 8192;
        onChanged();
        return (C12998) getFecDataExtentFieldBuilder().m37104();
    }

    @Override // l.InterfaceC2621
    public InterfaceC5943 getFecDataExtentOrBuilder() {
        C15722 c15722 = this.fecDataExtentBuilder_;
        if (c15722 != null) {
            return (InterfaceC5943) c15722.m37101();
        }
        C12293 c12293 = this.fecDataExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    private C15722 getFecDataExtentFieldBuilder() {
        if (this.fecDataExtentBuilder_ == null) {
            this.fecDataExtentBuilder_ = new C15722(getFecDataExtent(), getParentForChildren(), isClean());
            this.fecDataExtent_ = null;
        }
        return this.fecDataExtentBuilder_;
    }

    @Override // l.InterfaceC2621
    public boolean hasFecExtent() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // l.InterfaceC2621
    public C12293 getFecExtent() {
        C15722 c15722 = this.fecExtentBuilder_;
        if (c15722 == null) {
            C12293 c12293 = this.fecExtent_;
            return c12293 == null ? C12293.getDefaultInstance() : c12293;
        }
        return (C12293) c15722.m37103();
    }

    public C9677 setFecExtent(C12293 c12293) {
        C15722 c15722 = this.fecExtentBuilder_;
        if (c15722 == null) {
            c12293.getClass();
            this.fecExtent_ = c12293;
        } else {
            c15722.m37100(c12293);
        }
        this.bitField0_ |= 16384;
        onChanged();
        return this;
    }

    public C9677 setFecExtent(C12998 c12998) {
        C15722 c15722 = this.fecExtentBuilder_;
        if (c15722 == null) {
            this.fecExtent_ = c12998.build();
        } else {
            c15722.m37100(c12998.build());
        }
        this.bitField0_ |= 16384;
        onChanged();
        return this;
    }

    public C9677 mergeFecExtent(C12293 c12293) {
        C12293 c122932;
        C15722 c15722 = this.fecExtentBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 16384) != 0 && (c122932 = this.fecExtent_) != null && c122932 != C12293.getDefaultInstance()) {
                getFecExtentBuilder().mergeFrom(c12293);
            } else {
                this.fecExtent_ = c12293;
            }
        } else {
            c15722.m37098(c12293);
        }
        if (this.fecExtent_ != null) {
            this.bitField0_ |= 16384;
            onChanged();
        }
        return this;
    }

    public C9677 clearFecExtent() {
        this.bitField0_ &= -16385;
        this.fecExtent_ = null;
        C15722 c15722 = this.fecExtentBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.fecExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C12998 getFecExtentBuilder() {
        this.bitField0_ |= 16384;
        onChanged();
        return (C12998) getFecExtentFieldBuilder().m37104();
    }

    @Override // l.InterfaceC2621
    public InterfaceC5943 getFecExtentOrBuilder() {
        C15722 c15722 = this.fecExtentBuilder_;
        if (c15722 != null) {
            return (InterfaceC5943) c15722.m37101();
        }
        C12293 c12293 = this.fecExtent_;
        return c12293 == null ? C12293.getDefaultInstance() : c12293;
    }

    private C15722 getFecExtentFieldBuilder() {
        if (this.fecExtentBuilder_ == null) {
            this.fecExtentBuilder_ = new C15722(getFecExtent(), getParentForChildren(), isClean());
            this.fecExtent_ = null;
        }
        return this.fecExtentBuilder_;
    }

    @Override // l.InterfaceC2621
    public boolean hasFecRoots() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // l.InterfaceC2621
    public int getFecRoots() {
        return this.fecRoots_;
    }

    public C9677 setFecRoots(int i) {
        this.fecRoots_ = i;
        this.bitField0_ |= 32768;
        onChanged();
        return this;
    }

    public C9677 clearFecRoots() {
        this.bitField0_ &= -32769;
        this.fecRoots_ = 2;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC2621
    public boolean hasVersion() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // l.InterfaceC2621
    public String getVersion() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String m16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.version_ = m16501;
            }
            return m16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC2621
    public AbstractC5886 getVersionBytes() {
        Object obj = this.version_;
        if (obj instanceof String) {
            AbstractC5886 m16491 = AbstractC5886.m16491((String) obj);
            this.version_ = m16491;
            return m16491;
        }
        return (AbstractC5886) obj;
    }

    public C9677 setVersion(String str) {
        str.getClass();
        this.version_ = str;
        this.bitField0_ |= 65536;
        onChanged();
        return this;
    }

    public C9677 clearVersion() {
        this.version_ = C8971.getDefaultInstance().getVersion();
        this.bitField0_ &= -65537;
        onChanged();
        return this;
    }

    public C9677 setVersionBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.version_ = abstractC5886;
        this.bitField0_ |= 65536;
        onChanged();
        return this;
    }

    private void ensureMergeOperationsIsMutable() {
        if ((this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 0) {
            this.mergeOperations_ = new ArrayList(this.mergeOperations_);
            this.bitField0_ |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
    }

    @Override // l.InterfaceC2621
    public List getMergeOperationsList() {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            return C20195.unmodifiableList(this.mergeOperations_);
        }
        return c14311.m34175();
    }

    @Override // l.InterfaceC2621
    public int getMergeOperationsCount() {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            return this.mergeOperations_.size();
        }
        return c14311.m34167();
    }

    @Override // l.InterfaceC2621
    public C6649 getMergeOperations(int i) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            return (C6649) this.mergeOperations_.get(i);
        }
        return (C6649) c14311.m34164(i);
    }

    public C9677 setMergeOperations(int i, C6649 c6649) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            c6649.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.set(i, c6649);
            onChanged();
            return this;
        }
        c14311.m34170(i, c6649);
        return this;
    }

    public C9677 setMergeOperations(int i, C17232 c17232) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.set(i, c17232.build());
            onChanged();
            return this;
        }
        c14311.m34170(i, c17232.build());
        return this;
    }

    public C9677 addMergeOperations(C6649 c6649) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            c6649.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(c6649);
            onChanged();
            return this;
        }
        c14311.m34166(c6649);
        return this;
    }

    public C9677 addMergeOperations(int i, C6649 c6649) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            c6649.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(i, c6649);
            onChanged();
            return this;
        }
        c14311.m34165(i, c6649);
        return this;
    }

    public C9677 addMergeOperations(C17232 c17232) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(c17232.build());
            onChanged();
            return this;
        }
        c14311.m34166(c17232.build());
        return this;
    }

    public C9677 addMergeOperations(int i, C17232 c17232) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(i, c17232.build());
            onChanged();
            return this;
        }
        c14311.m34165(i, c17232.build());
        return this;
    }

    public C9677 addAllMergeOperations(Iterable iterable) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            ensureMergeOperationsIsMutable();
            AbstractC2359.m7667(iterable, this.mergeOperations_);
            onChanged();
            return this;
        }
        c14311.m34161(iterable);
        return this;
    }

    public C9677 clearMergeOperations() {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            this.mergeOperations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -131073;
            onChanged();
            return this;
        }
        c14311.m34169();
        return this;
    }

    public C9677 removeMergeOperations(int i) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.remove(i);
            onChanged();
            return this;
        }
        c14311.m34173(i);
        return this;
    }

    public C17232 getMergeOperationsBuilder(int i) {
        return (C17232) getMergeOperationsFieldBuilder().m34158(i);
    }

    @Override // l.InterfaceC2621
    public InterfaceC9472 getMergeOperationsOrBuilder(int i) {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 == null) {
            return (InterfaceC9472) this.mergeOperations_.get(i);
        }
        return (InterfaceC9472) c14311.m34168(i);
    }

    @Override // l.InterfaceC2621
    public List getMergeOperationsOrBuilderList() {
        C14311 c14311 = this.mergeOperationsBuilder_;
        if (c14311 != null) {
            return c14311.m34162();
        }
        return C20195.unmodifiableList(this.mergeOperations_);
    }

    public C17232 addMergeOperationsBuilder() {
        return (C17232) getMergeOperationsFieldBuilder().m34160(C6649.getDefaultInstance());
    }

    public C17232 addMergeOperationsBuilder(int i) {
        return (C17232) getMergeOperationsFieldBuilder().m34159(i, C6649.getDefaultInstance());
    }

    public List getMergeOperationsBuilderList() {
        return getMergeOperationsFieldBuilder().m34171();
    }

    private C14311 getMergeOperationsFieldBuilder() {
        if (this.mergeOperationsBuilder_ == null) {
            this.mergeOperationsBuilder_ = new C14311(this.mergeOperations_, (this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0, getParentForChildren(), isClean());
            this.mergeOperations_ = null;
        }
        return this.mergeOperationsBuilder_;
    }

    @Override // l.InterfaceC2621
    public boolean hasEstimateCowSize() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // l.InterfaceC2621
    public long getEstimateCowSize() {
        return this.estimateCowSize_;
    }

    public C9677 setEstimateCowSize(long j) {
        this.estimateCowSize_ = j;
        this.bitField0_ |= 262144;
        onChanged();
        return this;
    }

    public C9677 clearEstimateCowSize() {
        this.bitField0_ &= -262145;
        this.estimateCowSize_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC2621
    public boolean hasEstimateOpCountMax() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // l.InterfaceC2621
    public long getEstimateOpCountMax() {
        return this.estimateOpCountMax_;
    }

    public C9677 setEstimateOpCountMax(long j) {
        this.estimateOpCountMax_ = j;
        this.bitField0_ |= 524288;
        onChanged();
        return this;
    }

    public C9677 clearEstimateOpCountMax() {
        this.bitField0_ &= -524289;
        this.estimateOpCountMax_ = 0L;
        onChanged();
        return this;
    }
}
