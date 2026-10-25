package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: T9Q9 */
/* renamed from: l.ۜܺۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6859 extends AbstractC2982 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5969 f21208;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15722 f21209;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f21210;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14311 f21211;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f21212;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21213;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21214;

    public C6859(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f21212 = 0;
        this.f21210 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m18544();
            m18543();
        }
    }

    public /* synthetic */ C6859(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m18547();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m18545(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m18545(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m18545(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m18545(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32253;
        c9766.m24773(C8976.class, C6859.class);
        return c9766;
    }

    public C6859() {
        this.f21212 = 0;
        this.f21210 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m18544();
            m18543();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18547() {
        super.clear();
        this.f21214 = 0;
        this.f21213 = false;
        this.f21212 = 0;
        this.f21208 = null;
        C15722 c15722 = this.f21209;
        if (c15722 != null) {
            c15722.m37102();
            this.f21209 = null;
        }
        C14311 c14311 = this.f21211;
        if (c14311 == null) {
            this.f21210 = Collections.EMPTY_LIST;
        } else {
            this.f21210 = null;
            c14311.m34169();
        }
        this.f21214 &= -9;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C10702.f32236;
        return c17757;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C8976.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C8976.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C8976 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C8976 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C8976 buildPartial() {
        int i;
        C5969 c5969;
        C8976 c8976 = new C8976(this);
        C14311 c14311 = this.f21211;
        if (c14311 != null) {
            c8976.f27269 = c14311.m34163();
        } else {
            if ((this.f21214 & 8) != 0) {
                this.f21210 = C20195.unmodifiableList(this.f21210);
                this.f21214 &= -9;
            }
            c8976.f27269 = this.f21210;
        }
        int i2 = this.f21214;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c8976.f27271 = this.f21213;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c8976.f27267 = this.f21212;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15722 c15722 = this.f21209;
                if (c15722 == null) {
                    c5969 = this.f21208;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c8976.f27268 = c5969;
                i |= 4;
            }
            c8976.f27272 = i | c8976.f27272;
        }
        onBuilt();
        return c8976;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8976) {
            m18546((C8976) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C8976) {
            m18546((C8976) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18546(C8976 c8976) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        C5969 c5969;
        if (c8976 == C8976.getDefaultInstance()) {
            return;
        }
        if (c8976.m23194()) {
            this.f21213 = c8976.m23195();
            this.f21214 |= 1;
            onChanged();
        }
        if (c8976.m23198()) {
            EnumC9682 m23193 = c8976.m23193();
            m23193.getClass();
            this.f21214 |= 2;
            this.f21212 = m23193.getNumber();
            onChanged();
        }
        if (c8976.m23197()) {
            C5969 m23196 = c8976.m23196();
            C15722 c15722 = this.f21209;
            if (c15722 == null) {
                if ((this.f21214 & 4) == 0 || (c5969 = this.f21208) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f21208 = m23196;
                } else {
                    this.f21214 |= 4;
                    onChanged();
                    ((C0324) m18544().m37104()).m1732(m23196);
                }
            } else {
                c15722.m37098(m23196);
            }
            if (this.f21208 != null) {
                this.f21214 |= 4;
                onChanged();
            }
        }
        if (this.f21211 == null) {
            list4 = c8976.f27269;
            if (!list4.isEmpty()) {
                if (this.f21210.isEmpty()) {
                    list6 = c8976.f27269;
                    this.f21210 = list6;
                    this.f21214 &= -9;
                } else {
                    if ((this.f21214 & 8) == 0) {
                        this.f21210 = new ArrayList(this.f21210);
                        this.f21214 |= 8;
                    }
                    List list7 = this.f21210;
                    list5 = c8976.f27269;
                    list7.addAll(list5);
                }
                onChanged();
            }
        } else {
            list = c8976.f27269;
            if (!list.isEmpty()) {
                if (this.f21211.m34174()) {
                    this.f21211.m34172();
                    this.f21211 = null;
                    list3 = c8976.f27269;
                    this.f21210 = list3;
                    this.f21214 &= -9;
                    this.f21211 = AbstractC4121.alwaysUseFieldBuilders ? m18543() : null;
                } else {
                    C14311 c14311 = this.f21211;
                    list2 = c8976.f27269;
                    c14311.m34161(list2);
                }
            }
        }
        m9115((AbstractC12154) c8976);
        mergeUnknownFields(c8976.getUnknownFields());
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18545(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 264) {
                            this.f21213 = abstractC7297.mo19571();
                            this.f21214 |= 1;
                        } else if (mo19567 == 272) {
                            int mo19560 = abstractC7297.mo19560();
                            if (EnumC9682.m24620(mo19560) == null) {
                                mergeUnknownVarintField(34, mo19560);
                            } else {
                                this.f21212 = mo19560;
                                this.f21214 |= 2;
                            }
                        } else if (mo19567 == 282) {
                            abstractC7297.mo19556(m18544().m37104(), c17798);
                            this.f21214 |= 4;
                        } else if (mo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f21211;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f21214 & 8) == 0) {
                                    this.f21210 = new ArrayList(this.f21210);
                                    this.f21214 |= 8;
                                }
                                this.f21210.add(c1529);
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
            r3 = this;
            int r0 = r3.f21214
            r0 = r0 & 4
            r1 = 0
            if (r0 == 0) goto L21
            l.ܺۚۖ r0 = r3.f21209
            if (r0 != 0) goto L14
            l.ۛۢۖ r0 = r3.f21208
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
            l.ܳۚۖ r2 = r3.f21211
            if (r2 != 0) goto L2d
            java.util.List r2 = r3.f21210
            int r2 = r2.size()
            goto L31
        L2d:
            int r2 = r2.m34167()
        L31:
            if (r0 >= r2) goto L50
            l.ܳۚۖ r2 = r3.f21211
            if (r2 != 0) goto L40
            java.util.List r2 = r3.f21210
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
        throw new UnsupportedOperationException("Method not decompiled: l.C6859.isInitialized():boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C15722 m18544() {
        C5969 c5969;
        C15722 c15722 = this.f21209;
        if (c15722 == null) {
            if (c15722 == null) {
                c5969 = this.f21208;
                if (c5969 == null) {
                    c5969 = C5969.getDefaultInstance();
                }
            } else {
                c5969 = (C5969) c15722.m37103();
            }
            this.f21209 = new C15722(c5969, getParentForChildren(), isClean());
            this.f21208 = null;
        }
        return this.f21209;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m18543() {
        if (this.f21211 == null) {
            this.f21211 = new C14311(this.f21210, (this.f21214 & 8) != 0, getParentForChildren(), isClean());
            this.f21210 = null;
        }
        return this.f21211;
    }
}
