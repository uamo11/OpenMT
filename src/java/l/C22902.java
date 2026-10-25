package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: T9Q9 */
/* renamed from: l.᩺ۢۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C22902 extends AbstractC19916 implements InterfaceC3583 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f73835;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73836;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f73837;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f73838;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14311 f73839;

    public /* synthetic */ C22902(int i) {
        this();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m50990();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m50990();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m50990();
        return this;
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m50990();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m50991(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m50991(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m50991(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m50991(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32221;
        c9766.m24773(C10888.class, C22902.class);
        return c9766;
    }

    public C22902() {
        this.f73837 = Collections.EMPTY_LIST;
        this.f73835 = 0;
        this.f73836 = 0;
    }

    public C22902(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f73837 = Collections.EMPTY_LIST;
        this.f73835 = 0;
        this.f73836 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50990() {
        super.clear();
        this.f73838 = 0;
        C14311 c14311 = this.f73839;
        if (c14311 == null) {
            this.f73837 = Collections.EMPTY_LIST;
        } else {
            this.f73837 = null;
            c14311.m34169();
        }
        this.f73838 &= -2;
        this.f73835 = 0;
        this.f73836 = 0;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C10702.f32225;
        return c17757;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C10888.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C10888.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C10888 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C10888 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C10888 buildPartial() {
        int i = 0;
        C10888 c10888 = new C10888(this, 0);
        C14311 c14311 = this.f73839;
        if (c14311 != null) {
            c10888.f32729 = c14311.m34163();
        } else {
            if ((this.f73838 & 1) != 0) {
                this.f73837 = C20195.unmodifiableList(this.f73837);
                this.f73838 &= -2;
            }
            c10888.f32729 = this.f73837;
        }
        int i2 = this.f73838;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c10888.f32725 = this.f73835;
                i = 1;
            }
            if ((i2 & 4) != 0) {
                c10888.f32727 = this.f73836;
                i |= 2;
            }
            c10888.f32728 = i | c10888.f32728;
        }
        onBuilt();
        return c10888;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C10888) {
            m50992((C10888) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C10888) {
            m50992((C10888) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50992(C10888 c10888) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        if (c10888 == C10888.getDefaultInstance()) {
            return;
        }
        if (this.f73839 == null) {
            list4 = c10888.f32729;
            if (!list4.isEmpty()) {
                if (this.f73837.isEmpty()) {
                    list6 = c10888.f32729;
                    this.f73837 = list6;
                    this.f73838 &= -2;
                } else {
                    if ((this.f73838 & 1) == 0) {
                        this.f73837 = new ArrayList(this.f73837);
                        this.f73838 |= 1;
                    }
                    List list7 = this.f73837;
                    list5 = c10888.f32729;
                    list7.addAll(list5);
                }
                onChanged();
            }
        } else {
            list = c10888.f32729;
            if (!list.isEmpty()) {
                if (this.f73839.m34174()) {
                    this.f73839.m34172();
                    C14311 c14311 = null;
                    this.f73839 = null;
                    list3 = c10888.f32729;
                    this.f73837 = list3;
                    this.f73838 &= -2;
                    if (AbstractC4121.alwaysUseFieldBuilders) {
                        if (this.f73839 == null) {
                            this.f73839 = new C14311(list3, false, getParentForChildren(), isClean());
                            this.f73837 = null;
                        }
                        c14311 = this.f73839;
                    }
                    this.f73839 = c14311;
                } else {
                    C14311 c143112 = this.f73839;
                    list2 = c10888.f32729;
                    c143112.m34161(list2);
                }
            }
        }
        if (c10888.m27192()) {
            EnumC3478 m27191 = c10888.m27191();
            m27191.getClass();
            this.f73838 |= 2;
            this.f73835 = m27191.getNumber();
            onChanged();
        }
        if (c10888.m27190()) {
            EnumC3478 m27193 = c10888.m27193();
            m27193.getClass();
            this.f73838 |= 4;
            this.f73836 = m27193.getNumber();
            onChanged();
        }
        mergeUnknownFields(c10888.getUnknownFields());
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50991(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 10) {
                            C1715 c1715 = (C1715) abstractC7297.mo19552(C1715.parser(), c17798);
                            C14311 c14311 = this.f73839;
                            if (c14311 != null) {
                                c14311.m34166(c1715);
                            } else {
                                if ((this.f73838 & 1) == 0) {
                                    this.f73837 = new ArrayList(this.f73837);
                                    this.f73838 |= 1;
                                }
                                this.f73837.add(c1715);
                            }
                        } else if (mo19567 == 32) {
                            int mo19560 = abstractC7297.mo19560();
                            if (EnumC3478.m10650(mo19560) == null) {
                                mergeUnknownVarintField(4, mo19560);
                            } else {
                                this.f73835 = mo19560;
                                this.f73838 |= 2;
                            }
                        } else if (mo19567 == 40) {
                            int mo195602 = abstractC7297.mo19560();
                            if (EnumC3478.m10650(mo195602) == null) {
                                mergeUnknownVarintField(5, mo195602);
                            } else {
                                this.f73836 = mo195602;
                                this.f73838 |= 4;
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

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        int m34167;
        C1715 c1715;
        int i = 0;
        while (true) {
            C14311 c14311 = this.f73839;
            if (c14311 == null) {
                m34167 = this.f73837.size();
            } else {
                m34167 = c14311.m34167();
            }
            if (i >= m34167) {
                return true;
            }
            C14311 c143112 = this.f73839;
            if (c143112 == null) {
                c1715 = (C1715) this.f73837.get(i);
            } else {
                c1715 = (C1715) c143112.m34164(i);
            }
            if (!c1715.isInitialized()) {
                return false;
            }
            i++;
        }
    }
}
