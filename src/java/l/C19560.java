package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: T9Q9 */
/* renamed from: l.᩵ܺۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19560 extends AbstractC2982 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C14311 f63226;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5969 f63227;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f63228;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15722 f63229;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f63230;

    public C19560(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f63228 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m44982();
            m44981();
        }
    }

    public /* synthetic */ C19560(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m44985();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m44984(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m44984(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m44984(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m44984(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32263;
        c9766.m24773(C0508.class, C19560.class);
        return c9766;
    }

    public C19560() {
        this.f63228 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m44982();
            m44981();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44985() {
        super.clear();
        this.f63230 = 0;
        this.f63227 = null;
        C15722 c15722 = this.f63229;
        if (c15722 != null) {
            c15722.m37102();
            this.f63229 = null;
        }
        C14311 c14311 = this.f63226;
        if (c14311 == null) {
            this.f63228 = Collections.EMPTY_LIST;
        } else {
            this.f63228 = null;
            c14311.m34169();
        }
        this.f63230 &= -3;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C10702.f32261;
        return c17757;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C0508.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C0508.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C0508 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C0508 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C0508 buildPartial() {
        C5969 c5969;
        C0508 c0508 = new C0508(this);
        C14311 c14311 = this.f63226;
        if (c14311 != null) {
            c0508.f2136 = c14311.m34163();
        } else {
            if ((this.f63230 & 2) != 0) {
                this.f63228 = C20195.unmodifiableList(this.f63228);
                this.f63230 &= -3;
            }
            c0508.f2136 = this.f63228;
        }
        int i = this.f63230;
        if (i != 0) {
            int i2 = 1;
            if ((i & 1) != 0) {
                C15722 c15722 = this.f63229;
                if (c15722 == null) {
                    c5969 = this.f63227;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c0508.f2138 = c5969;
            } else {
                i2 = 0;
            }
            c0508.f2139 = i2 | c0508.f2139;
        }
        onBuilt();
        return c0508;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C0508) {
            m44983((C0508) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C0508) {
            m44983((C0508) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44983(C0508 c0508) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        C5969 c5969;
        if (c0508 == C0508.getDefaultInstance()) {
            return;
        }
        if (c0508.m2201()) {
            C5969 m2200 = c0508.m2200();
            C15722 c15722 = this.f63229;
            if (c15722 == null) {
                if ((this.f63230 & 1) == 0 || (c5969 = this.f63227) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f63227 = m2200;
                } else {
                    this.f63230 |= 1;
                    onChanged();
                    ((C0324) m44982().m37104()).m1732(m2200);
                }
            } else {
                c15722.m37098(m2200);
            }
            if (this.f63227 != null) {
                this.f63230 |= 1;
                onChanged();
            }
        }
        if (this.f63226 == null) {
            list4 = c0508.f2136;
            if (!list4.isEmpty()) {
                if (this.f63228.isEmpty()) {
                    list6 = c0508.f2136;
                    this.f63228 = list6;
                    this.f63230 &= -3;
                } else {
                    if ((this.f63230 & 2) == 0) {
                        this.f63228 = new ArrayList(this.f63228);
                        this.f63230 |= 2;
                    }
                    List list7 = this.f63228;
                    list5 = c0508.f2136;
                    list7.addAll(list5);
                }
                onChanged();
            }
        } else {
            list = c0508.f2136;
            if (!list.isEmpty()) {
                if (this.f63226.m34174()) {
                    this.f63226.m34172();
                    this.f63226 = null;
                    list3 = c0508.f2136;
                    this.f63228 = list3;
                    this.f63230 &= -3;
                    this.f63226 = AbstractC4121.alwaysUseFieldBuilders ? m44981() : null;
                } else {
                    C14311 c14311 = this.f63226;
                    list2 = c0508.f2136;
                    c14311.m34161(list2);
                }
            }
        }
        m9115((AbstractC12154) c0508);
        mergeUnknownFields(c0508.getUnknownFields());
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44984(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 10) {
                            abstractC7297.mo19556(m44982().m37104(), c17798);
                            this.f63230 |= 1;
                        } else if (mo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f63226;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f63230 & 2) == 0) {
                                    this.f63228 = new ArrayList(this.f63228);
                                    this.f63230 |= 2;
                                }
                                this.f63228.add(c1529);
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

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0.isInitialized() == false) goto L29;
     */
    @Override // l.AbstractC2982, l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized() {
        /*
            r4 = this;
            int r0 = r4.f63230
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L21
            l.ܺۚۖ r0 = r4.f63229
            if (r0 != 0) goto L14
            l.ۛۢۖ r0 = r4.f63227
            if (r0 != 0) goto L1a
            l.ۛۢۖ r0 = l.C5969.getDefaultInstance()
            goto L1a
        L14:
            l.ۘᩴۖ r0 = r0.m37103()
            l.ۛۢۖ r0 = (l.C5969) r0
        L1a:
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto L21
            goto L56
        L21:
            r0 = 0
        L22:
            l.ܳۚۖ r3 = r4.f63226
            if (r3 != 0) goto L2d
            java.util.List r3 = r4.f63228
            int r3 = r3.size()
            goto L31
        L2d:
            int r3 = r3.m34167()
        L31:
            if (r0 >= r3) goto L50
            l.ܳۚۖ r3 = r4.f63226
            if (r3 != 0) goto L40
            java.util.List r3 = r4.f63228
            java.lang.Object r3 = r3.get(r0)
            l.֫ۖۖ r3 = (l.C1529) r3
            goto L46
        L40:
            l.ۘᩴۖ r3 = r3.m34164(r0)
            l.֫ۖۖ r3 = (l.C1529) r3
        L46:
            boolean r3 = r3.isInitialized()
            if (r3 != 0) goto L4d
            goto L56
        L4d:
            int r0 = r0 + 1
            goto L22
        L50:
            boolean r0 = r4.m9116()
            if (r0 != 0) goto L57
        L56:
            return r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19560.isInitialized():boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C15722 m44982() {
        C5969 c5969;
        C15722 c15722 = this.f63229;
        if (c15722 == null) {
            if (c15722 == null) {
                c5969 = this.f63227;
                if (c5969 == null) {
                    c5969 = C5969.getDefaultInstance();
                }
            } else {
                c5969 = (C5969) c15722.m37103();
            }
            this.f63229 = new C15722(c5969, getParentForChildren(), isClean());
            this.f63227 = null;
        }
        return this.f63229;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m44981() {
        if (this.f63226 == null) {
            this.f63226 = new C14311(this.f63228, (this.f63230 & 2) != 0, getParentForChildren(), isClean());
            this.f63228 = null;
        }
        return this.f63226;
    }
}
