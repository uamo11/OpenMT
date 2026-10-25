package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: T9Q9 */
/* renamed from: l.᩸ܺۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21676 extends AbstractC2982 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5969 f69528;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15722 f69529;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f69530;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14311 f69531;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69532;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f69533;

    public C21676(InterfaceC9415 interfaceC9415, int i) {
        super(interfaceC9415);
        this.f69530 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m48942();
            m48941();
        }
    }

    public /* synthetic */ C21676(int i) {
        this();
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC2982 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC9228 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC19916 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC2982, l.AbstractC19916, l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 clear() {
        m48945();
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC2359 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m48943(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m48943(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m48943(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        m48943(abstractC7297, c17798);
        return this;
    }

    @Override // l.AbstractC19916
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32234;
        c9766.m24773(C22381.class, C21676.class);
        return c9766;
    }

    public C21676() {
        this.f69530 = Collections.EMPTY_LIST;
        if (AbstractC4121.alwaysUseFieldBuilders) {
            m48942();
            m48941();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48945() {
        super.clear();
        this.f69533 = 0;
        this.f69528 = null;
        C15722 c15722 = this.f69529;
        if (c15722 != null) {
            c15722.m37102();
            this.f69529 = null;
        }
        this.f69532 = false;
        C14311 c14311 = this.f69531;
        if (c14311 == null) {
            this.f69530 = Collections.EMPTY_LIST;
        } else {
            this.f69530 = null;
            c14311.m34169();
        }
        this.f69533 &= -5;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = C10702.f32216;
        return c17757;
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C22381.getDefaultInstance();
    }

    @Override // l.AbstractC2982, l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C22381.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC8522 build() {
        C22381 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final InterfaceC23338 build() {
        C22381 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C22381 buildPartial() {
        int i;
        C5969 c5969;
        C22381 c22381 = new C22381(this);
        C14311 c14311 = this.f69531;
        if (c14311 != null) {
            c22381.f72532 = c14311.m34163();
        } else {
            if ((this.f69533 & 4) != 0) {
                this.f69530 = C20195.unmodifiableList(this.f69530);
                this.f69533 &= -5;
            }
            c22381.f72532 = this.f69530;
        }
        int i2 = this.f69533;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                C15722 c15722 = this.f69529;
                if (c15722 == null) {
                    c5969 = this.f69528;
                } else {
                    c5969 = (C5969) c15722.m37099();
                }
                c22381.f72531 = c5969;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c22381.f72533 = this.f69532;
                i |= 2;
            }
            c22381.f72534 = i | c22381.f72534;
        }
        onBuilt();
        return c22381;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C22381) {
            m48944((C22381) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C22381) {
            m48944((C22381) interfaceC23338);
            return this;
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48944(C22381 c22381) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        C5969 c5969;
        if (c22381 == C22381.getDefaultInstance()) {
            return;
        }
        if (c22381.m50251()) {
            C5969 m50253 = c22381.m50253();
            C15722 c15722 = this.f69529;
            if (c15722 == null) {
                if ((this.f69533 & 1) == 0 || (c5969 = this.f69528) == null || c5969 == C5969.getDefaultInstance()) {
                    this.f69528 = m50253;
                } else {
                    this.f69533 |= 1;
                    onChanged();
                    ((C0324) m48942().m37104()).m1732(m50253);
                }
            } else {
                c15722.m37098(m50253);
            }
            if (this.f69528 != null) {
                this.f69533 |= 1;
                onChanged();
            }
        }
        if (c22381.m50250()) {
            this.f69532 = c22381.m50252();
            this.f69533 |= 2;
            onChanged();
        }
        if (this.f69531 == null) {
            list4 = c22381.f72532;
            if (!list4.isEmpty()) {
                if (this.f69530.isEmpty()) {
                    list6 = c22381.f72532;
                    this.f69530 = list6;
                    this.f69533 &= -5;
                } else {
                    if ((this.f69533 & 4) == 0) {
                        this.f69530 = new ArrayList(this.f69530);
                        this.f69533 |= 4;
                    }
                    List list7 = this.f69530;
                    list5 = c22381.f72532;
                    list7.addAll(list5);
                }
                onChanged();
            }
        } else {
            list = c22381.f72532;
            if (!list.isEmpty()) {
                if (this.f69531.m34174()) {
                    this.f69531.m34172();
                    this.f69531 = null;
                    list3 = c22381.f72532;
                    this.f69530 = list3;
                    this.f69533 &= -5;
                    this.f69531 = AbstractC4121.alwaysUseFieldBuilders ? m48941() : null;
                } else {
                    C14311 c14311 = this.f69531;
                    list2 = c22381.f72532;
                    c14311.m34161(list2);
                }
            }
        }
        m9115((AbstractC12154) c22381);
        mergeUnknownFields(c22381.getUnknownFields());
        onChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48943(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int mo19567 = abstractC7297.mo19567();
                    if (mo19567 != 0) {
                        if (mo19567 == 264) {
                            this.f69532 = abstractC7297.mo19571();
                            this.f69533 |= 2;
                        } else if (mo19567 == 274) {
                            abstractC7297.mo19556(m48942().m37104(), c17798);
                            this.f69533 |= 1;
                        } else if (mo19567 == 7994) {
                            C1529 c1529 = (C1529) abstractC7297.mo19552(C1529.parser(), c17798);
                            C14311 c14311 = this.f69531;
                            if (c14311 != null) {
                                c14311.m34166(c1529);
                            } else {
                                if ((this.f69533 & 4) == 0) {
                                    this.f69530 = new ArrayList(this.f69530);
                                    this.f69533 |= 4;
                                }
                                this.f69530.add(c1529);
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
            int r0 = r4.f69533
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L21
            l.ܺۚۖ r0 = r4.f69529
            if (r0 != 0) goto L14
            l.ۛۢۖ r0 = r4.f69528
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
            l.ܳۚۖ r3 = r4.f69531
            if (r3 != 0) goto L2d
            java.util.List r3 = r4.f69530
            int r3 = r3.size()
            goto L31
        L2d:
            int r3 = r3.m34167()
        L31:
            if (r0 >= r3) goto L50
            l.ܳۚۖ r3 = r4.f69531
            if (r3 != 0) goto L40
            java.util.List r3 = r4.f69530
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
        throw new UnsupportedOperationException("Method not decompiled: l.C21676.isInitialized():boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C15722 m48942() {
        C5969 c5969;
        C15722 c15722 = this.f69529;
        if (c15722 == null) {
            if (c15722 == null) {
                c5969 = this.f69528;
                if (c5969 == null) {
                    c5969 = C5969.getDefaultInstance();
                }
            } else {
                c5969 = (C5969) c15722.m37103();
            }
            this.f69529 = new C15722(c5969, getParentForChildren(), isClean());
            this.f69528 = null;
        }
        return this.f69529;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C14311 m48941() {
        if (this.f69531 == null) {
            this.f69531 = new C14311(this.f69530, (this.f69533 & 4) != 0, getParentForChildren(), isClean());
            this.f69530 = null;
        }
        return this.f69531;
    }
}
