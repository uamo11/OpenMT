package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: T9Q9 */
/* renamed from: l.۟᩷ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7711 extends AbstractC2982 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f23817;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23818;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f23819;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C14311 f23820;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5969 f23821;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15722 f23822;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f23823;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f23824;

    public C7711(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f23819 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m20627();
            m20626();
        }
    }

    public /* synthetic */ C7711(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m20629();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        mergeFrom(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32223;
        c9766.m24773(C1736.class, C7711.class);
        return c9766;
    }

    public C7711() {
        this.f23819 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m20627();
            m20626();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20629() {
        super.clear();
        this.f23823 = 0;
        this.f23824 = false;
        this.f23817 = false;
        this.f23818 = false;
        this.f23821 = null;
        C15722 c15722 = this.f23822;
        if (c15722 != null) {
            c15722.m37102();
            this.f23822 = null;
        }
        C14311 c14311 = this.f23820;
        if (c14311 == null) {
            this.f23819 = Collections.EMPTY_LIST;
        } else {
            this.f23819 = null;
            c14311.m34169();
        }
        this.f23823 &= -17;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C10702.f32219;
        return c17757;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C1736.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C1736.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C1736 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C1736 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C1736 buildPartial() {
        int i;
        C5969 c5969;
        C1736 c1736 = new C1736(this);
        C14311 c14311 = this.f23820;
        if (c14311 != null) {
            c1736.f6006 = c14311.m34163();
        } else {
            if ((this.f23823 & 16) != 0) {
                this.f23819 = C20195.unmodifiableList(this.f23819);
                this.f23823 &= -17;
            }
            c1736.f6006 = this.f23819;
        }
        int i2 = this.f23823;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c1736.f6010 = this.f23824;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c1736.f6004 = this.f23817;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c1736.f6005 = this.f23818;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C15722 c15722 = this.f23822;
                if (c15722 == null) {
                    c5969 = this.f23821;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c1736.f6008 = c5969;
                i |= 8;
            }
            c1736.f6009 = i | c1736.f6009;
        }
        onBuilt();
        return c1736;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1736) {
            m20628((C1736) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C1736) {
            m20628((C1736) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20628(C1736 c1736) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        C5969 c5969;
        if (c1736 == C1736.getDefaultInstance()) {
            return;
        }
        if (c1736.m5808()) {
            this.f23824 = c1736.m5806();
            this.f23823 |= 1;
            onChanged();
        }
        if (c1736.m5809()) {
            this.f23817 = c1736.m5807();
            this.f23823 |= 2;
            onChanged();
        }
        if (c1736.m5802()) {
            this.f23818 = c1736.m5803();
            this.f23823 |= 4;
            onChanged();
        }
        if (c1736.m5805()) {
            C5969 m5804 = c1736.m5804();
            C15722 c15722 = this.f23822;
            if (c15722 == null) {
                if ((this.f23823 & 8) == 0 || (c5969 = this.f23821) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f23821 = m5804;
                } else {
                    this.f23823 |= 8;
                    onChanged();
                    ((C0324) m20627().m37104()).m1732(m5804);
                }
            } else {
                c15722.m37098(m5804);
            }
            if (this.f23821 != null) {
                this.f23823 |= 8;
                onChanged();
            }
        }
        if (this.f23820 == null) {
            list4 = c1736.f6006;
            if (!list4.isEmpty()) {
                if (this.f23819.isEmpty()) {
                    list6 = c1736.f6006;
                    this.f23819 = list6;
                    this.f23823 &= -17;
                } else {
                    if ((this.f23823 & 16) == 0) {
                        this.f23819 = new ArrayList(this.f23819);
                        this.f23823 |= 16;
                    }
                    List list7 = this.f23819;
                    list5 = c1736.f6006;
                    list7.addAll(list5);
                }
                onChanged();
            }
        } else {
            list = c1736.f6006;
            if (!list.isEmpty()) {
                if (this.f23820.m34174()) {
                    this.f23820.m34172();
                    this.f23820 = null;
                    list3 = c1736.f6006;
                    this.f23819 = list3;
                    this.f23823 &= -17;
                    this.f23820 = AbstractC4121.alwaysUseFieldBuilders ? m20626() : null;
                } else {
                    C14311 c14311 = this.f23820;
                    list2 = c1736.f6006;
                    c14311.m34161(list2);
                }
            }
        }
        m9115((AbstractC12154) c1736);
        mergeUnknownFields(c1736.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final C7711 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 16) {
                            this.f23824 = abstractC7297.mo19571();
                            this.f23823 |= 1;
                        } else if (mo19567 == 24) {
                            this.f23817 = abstractC7297.mo19571();
                            this.f23823 |= 2;
                        } else if (mo19567 == 48) {
                            this.f23818 = abstractC7297.mo19571();
                            this.f23823 |= 4;
                        } else if (mo19567 == 58) {
                            abstractC7297.mo19556(m20627().m37104(), c17798);
                            this.f23823 |= 8;
                        } else if (mo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f23820;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f23823 & 16) == 0) {
                                    this.f23819 = new ArrayList(this.f23819);
                                    this.f23823 = 16 | this.f23823;
                                }
                                this.f23819.add(c1529);
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
        return this;
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
            r3 = this;
            int r0 = r3.f23823
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L21
            l.ܺۚۖ r0 = r3.f23822
            if (r0 != 0) goto L14
            l.ۛۢۖ r0 = r3.f23821
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
            l.ܳۚۖ r2 = r3.f23820
            if (r2 != 0) goto L2d
            java.util.List r2 = r3.f23819
            int r2 = r2.size()
            goto L31
        L2d:
            int r2 = r2.m34167()
        L31:
            if (r0 >= r2) goto L50
            l.ܳۚۖ r2 = r3.f23820
            if (r2 != 0) goto L40
            java.util.List r2 = r3.f23819
            java.lang.Object r2 = r2.get(r0)
            l.֫ۖۖ r2 = (l.C1529) r2
            goto L46
        L40:
            l.ۘᩴۖ r2 = r2.m34164(r0)
            l.֫ۖۖ r2 = (l.C1529) r2
        L46:
            boolean r2 = r2.isInitialized()
            if (r2 != 0) goto L4d
            goto L56
        L4d:
            int r0 = r0 + 1
            goto L22
        L50:
            boolean r0 = r3.m9116()
            if (r0 != 0) goto L57
        L56:
            return r1
        L57:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7711.isInitialized():boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C15722 m20627() {
        C5969 c5969;
        C15722 c15722 = this.f23822;
        if (c15722 == null) {
            if (c15722 == null) {
                c5969 = this.f23821;
                if (c5969 == null) {
                    c5969 = C5969.getDefaultInstance();
                }
            } else {
                c5969 = (C5969) c15722.m37103();
            }
            this.f23822 = new C15722(c5969, getParentForChildren(), isClean());
            this.f23821 = null;
        }
        return this.f23822;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m20626() {
        if (this.f23820 == null) {
            this.f23820 = new C14311(this.f23819, (this.f23823 & 16) != 0, getParentForChildren(), isClean());
            this.f23819 = null;
        }
        return this.f23820;
    }
}
