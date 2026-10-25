package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: A451 */
/* renamed from: l.᩹ܽ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22406 {

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f72572 = new C4314();

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C19914 f72574;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f72577;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6235 f72580;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f72581;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7898 f72583;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet f72584;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C6735 f72586;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f72587;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f72590;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C6136 f72594;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19585 f72595;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C6319 f72597;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C22364 f72598;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C15240 f72599;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f72600;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f72602;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C8295 f72603;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f72604;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C20661 f72605;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C12399 f72606;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C5931 f72607;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8295 f72611;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f72612;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9310 f72613;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C8295 f72614;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4203 f72575 = new C2218(this);

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C3629 f72593 = new C3629();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18446 f72596 = new C18446(this);

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C5040 f72585 = new C5040(this);

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1386 f72592 = new C1386();

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5905 f72582 = new C5905();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20996 f72573 = new C19858(this);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C11550 f72578 = new InterfaceC20996() { // from class: l.ۨ۟֨
        @Override // l.InterfaceC20996
        /* renamed from: ֫ */
        public final AbstractC5698 mo16565(C1755 c1755, final AbstractC10370 abstractC10370) {
            AbstractC5698 mo20478 = c1755.f6075.f4742.mo20478(C12780.m31093(abstractC10370), new Predicate() { // from class: l.ۧ֫۠
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    AbstractC5698 abstractC5698 = (AbstractC5698) obj;
                    return abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.mo16083() == AbstractC10370.this;
                }
            });
            if (mo20478 != null) {
                return new C19421(C22406.this, c1755, true, mo20478);
            }
            return null;
        }
    };

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C22838 f72591 = new InterfaceC20996() { // from class: l.᩺۟֨
        @Override // l.InterfaceC20996
        /* renamed from: ֫ */
        public final AbstractC5698 mo16565(C1755 c1755, AbstractC10370 abstractC10370) {
            C22406 c22406 = C22406.this;
            AbstractC5698 mo20478 = c1755.f6075.f4740.mo20478(C12780.m31093(abstractC10370), new C7291(1, abstractC10370));
            if (mo20478 == null) {
                return null;
            }
            try {
                return new C19421(c22406, c1755, true, c22406.f72574.m45829(mo20478.m16089().f24147, abstractC10370));
            } catch (C20515 unused) {
                return null;
            }
        }
    };

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC0369 f72609 = new C4335();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C2924 f72576 = new C2924();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12801 f72610 = new C12801(this);

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9274 f72588 = new C9274(this);

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C8568 f72601 = new C8568(this);

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12111 f72589 = new C12111();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2609 f72608 = C2609.of((Object) EnumC16761.f51454, (Object) EnumC16761.f51453, (Object) EnumC16761.f51455);

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12364 f72579 = null;

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ۨ۟֨] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.᩺۟֨] */
    public C22406(C2903 c2903) {
        c2903.m8841(f72572, this);
        C20661 m47250 = C20661.m47250(c2903);
        this.f72605 = m47250;
        this.f72614 = new C8295(this, EnumC1296.f4570);
        C8295 c8295 = new C8295(this, EnumC1296.f4574);
        this.f72611 = c8295;
        this.f72603 = new C8295(this, EnumC1296.f4573);
        this.f72595 = C19585.m45021(c8295);
        this.f72594 = C6136.m17057(c2903);
        this.f72598 = C22364.m50099(c2903);
        this.f72613 = C9310.m23901(c2903);
        C7898 c7898 = (C7898) c2903.m8838(C7898.f24468);
        this.f72583 = c7898 == null ? new C7898(c2903) : c7898;
        this.f72606 = C12399.m30567(c2903);
        this.f72599 = C15240.m36054(c2903);
        this.f72586 = C6735.m18336(c2903);
        this.f72574 = C19914.m45820(c2903);
        this.f72580 = C6235.m17162(c2903);
        this.f72597 = C6319.m17456(c2903);
        this.f72607 = C5931.m16615(c2903);
        C23168.m51341(c2903);
        EnumC16280 m38301 = EnumC16280.m38301(c2903);
        C11781 m28823 = C11781.m28823(c2903);
        EnumC0121 enumC0121 = EnumC0121.f1151;
        this.f72577 = m28823.m28829(enumC0121, "compact") || (m28823.m28836(enumC0121) && m28823.m28835("rawDiagnostics"));
        this.f72584 = EnumC21701.m48990(m28823);
        EnumC10892.m27201(c2903);
        this.f72590 = EnumC10637.f31977.m26686(m38301);
        this.f72600 = EnumC10637.f32000.m26686(m38301);
        this.f72602 = EnumC10637.f32008.m26686(m38301);
        this.f72587 = EnumC10637.f31978.m26686(m38301);
        this.f72612 = AbstractC14016.m33607(m47250.f66475);
        this.f72604 = EnumC10637.f32009.m26686(m38301);
        EnumC10637.f32007.m26686(m38301);
        this.f72581 = m28823.m28831("debug.dumpMethodReferenceSearchResults");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22406 m50289(C2903 c2903) {
        C22406 c22406 = (C22406) c2903.m8838(f72572);
        return c22406 == null ? new C22406(c2903) : c22406;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC5698 m50293(AbstractC5698 abstractC5698, AbstractC5698 abstractC56982) {
        return abstractC5698.f17559.m4390(abstractC56982.f17559) ? abstractC5698 : abstractC56982;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50291(C1755 c1755) {
        C1755 c17552 = c1755.f6076;
        return c17552 != null && ((C8604) c1755.f6073).f26297 > ((C8604) c17552.f6073).f26297;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        if (r0 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        if (r7.f6079.f17186.mo955() == r8.f17561.mo955()) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a9, code lost:
    
        if (r0.f922.contains(r3) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b8, code lost:
    
        if (r0 != r8.m16089()) goto L52;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m50330(l.C1755 r7, l.AbstractC19810 r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22406.m50330(l.֫ۤ֨, l.᩶֡֨, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50329(final C1755 c1755, AbstractC4308 abstractC4308, final boolean z) {
        return abstractC4308.m12913(EnumC9454.ARRAY) ? m50329(c1755, C6319.m17473(this.f72597.m17515(abstractC4308)), false) : abstractC4308 instanceof C7835 ? C14841.stream(C19846.spliterator(((C7835) abstractC4308).m20930()), false).allMatch(new Predicate() { // from class: l.֫֫۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C22406.this.m50330(c1755, ((AbstractC4308) obj).f13890, z);
            }
        }) : m50330(c1755, abstractC4308.f13890, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        if (r20.f17559 != l.EnumC1296.f4582) goto L57;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m50328(l.C1755 r18, l.AbstractC4308 r19, l.AbstractC5698 r20) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22406.m50328(l.֫ۤ֨, l.ۙ֨֨, l.ۛ֡֨):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m50295(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308) {
        if (abstractC5698.f17559 == EnumC1296.f4571 && !abstractC5698.m16075() && !abstractC5698.mo15572()) {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            C6319 c6319 = this.f72597;
            C3581 m10959 = ((C3581) abstractC5698).m10959(abstractC19810, c6319, true);
            if (m10959 != null && m10959 != abstractC5698 && abstractC5698.f17561 != m10959.f17561 && c6319.m17532(c6319.m17543(m10959, abstractC4308), c6319.m17543(abstractC5698, abstractC4308), true)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m50331(C1755 c1755, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C23420 c23420, C2609 c2609, C2609 c26092, C1386 c1386) {
        C6319 c6319 = this.f72597;
        AbstractC4308 m17543 = c6319.m17543(abstractC5698, abstractC4308);
        C2609 m8239 = C2609.m8239();
        C2609 m82392 = c26092 == null ? C2609.m8239() : c26092;
        EnumC9454 enumC9454 = EnumC9454.FORALL;
        if (m17543.m12913(enumC9454) || !m82392.m8249()) {
            if (m17543.m12913(enumC9454) && m82392.m8249()) {
                C10077 c10077 = (C10077) m17543;
                C2609 c26093 = c10077.f30362;
                int m8245 = m82392.m8245();
                int m82452 = c26093.m8245();
                C5931 c5931 = this.f72607;
                if (m8245 != m82452) {
                    String num = Integer.toString(c26093.m8245());
                    C11576 c11576 = C11886.f35440;
                    throw new C23653(c5931.m16617(new C11576("compiler", "wrong.number.type.args", num)));
                }
                C2609 c26094 = c26093;
                for (C2609 c26095 = m82392; c26094.m8249() && c26095.m8249(); c26095 = c26095.f8241) {
                    for (C2609 m17481 = c6319.m17481(c6319.m17484((C8541) c26094.f8240), c26093, m82392); m17481.m8249(); m17481 = m17481.f8241) {
                        if (!c6319.m17551((AbstractC4308) c26095.f8240, (AbstractC4308) m17481.f8240, c1386)) {
                            AbstractC4308 abstractC43082 = (AbstractC4308) c26095.f8240;
                            C11576 c115762 = C11886.f35440;
                            throw new C23653(c5931.m16617(new C11576("compiler", "explicit.param.do.not.conform.to.bounds", abstractC43082, m17481)));
                        }
                    }
                    c26094 = c26094.f8241;
                }
                m17543 = c6319.m17488(c10077.f14167, c26093, m82392);
            } else if (m17543.m12913(enumC9454)) {
                C10077 c100772 = (C10077) m17543;
                C2609 c26096 = c100772.f30362;
                C2609 m17564 = c6319.m17564(c26096);
                m8239.getClass();
                m8239 = m17564.m8248(m8239);
                m17543 = c6319.m17488(c100772.f14167, c26096, m17564);
            }
        }
        AbstractC4308 abstractC43083 = m17543;
        C2609 c26097 = m8239;
        boolean z = c26097.f8241 != null;
        for (C2609 c26098 = c2609; c26098.f8241 != null && !z; c26098 = c26098.f8241) {
            if (((AbstractC4308) c26098.f8240).m12913(EnumC9454.FORALL)) {
                z = true;
            }
        }
        if (z) {
            return this.f72586.m18348(c1755, c26097, (C10658) abstractC43083, c23420, (C3581) abstractC5698, c2609, this.f72579, c1386);
        }
        C6755 m29997 = this.f72579.m29997(abstractC5698, this.f72586.f20931, c23420, c1386);
        this.f72579.f37062.mo11113(c1755, m29997, c2609, abstractC43083.mo12933(), c1386);
        m29997.mo18375();
        return abstractC43083;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m50301(C1755 c1755, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C23420 c23420, C2609 c2609, C2609 c26092, C1386 c1386) {
        C12364 c12364 = this.f72579;
        try {
            C12364 c123642 = new C12364(this);
            this.f72579 = c123642;
            c123642.f37057 = c23420.f75219 == C6735.f20919 ? EnumC13829.SPECULATIVE : EnumC13829.CHECK;
            if (c1755.f6074.m14709(EnumC18550.f57524)) {
                this.f72579.f37062 = new C20126(this, c23420.f75215.mo3857());
            }
            C12364 c123643 = this.f72579;
            EnumC16761 enumC16761 = ((C8604) c1755.f6073).f26288;
            c123643.f37061 = enumC16761;
            enumC16761.m39435();
            enumC16761.m39436();
            AbstractC4308 m50331 = m50331(c1755, abstractC4308, abstractC5698, c23420, c2609, c26092, c1386);
            this.f72579 = c12364;
            return m50331;
        } catch (Throwable th) {
            this.f72579 = c12364;
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50307(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        while (abstractC19810.f17560.m12913(EnumC9454.TYPEVAR)) {
            abstractC19810 = abstractC19810.f17560.mo12939().f13890;
        }
        for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().m20476(abstractC10370)) {
            if (abstractC5698.f17559 == EnumC1296.f4567 && (abstractC5698.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                return m50328(c1755, abstractC4308, abstractC5698) ? abstractC5698 : new C5746(this, c1755, abstractC4308, abstractC5698);
            }
        }
        AbstractC4308 abstractC43082 = abstractC19810.f17560;
        C6319 c6319 = this.f72597;
        AbstractC4308 m17562 = c6319.m17562(abstractC43082);
        AbstractC5698 abstractC56982 = this.f72614;
        if (m17562 != null && (m17562.m12913(EnumC9454.CLASS) || m17562.m12913(EnumC9454.TYPEVAR))) {
            abstractC56982 = m50293(abstractC56982, m50307(c1755, abstractC4308, abstractC10370, m17562.f13890));
        }
        for (C2609 m17510 = c6319.m17510(abstractC19810.f17560); abstractC56982.f17559 != EnumC1296.f4566 && m17510.m8249(); m17510 = m17510.f8241) {
            AbstractC5698 m50307 = m50307(c1755, abstractC4308, abstractC10370, ((AbstractC4308) m17510.f8240).f13890);
            if (abstractC56982.mo15574() && m50307.mo15574() && m50307.f17561 != abstractC56982.f17561) {
                abstractC56982 = new C11391(this, abstractC56982, m50307);
            } else {
                abstractC56982 = m50293(abstractC56982, m50307);
            }
        }
        return abstractC56982;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50304(C1755 c1755, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26092, AbstractC5698 abstractC5698, AbstractC5698 abstractC56982, boolean z) {
        if (abstractC5698.f17559 != EnumC1296.f4581) {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            AbstractC5698 abstractC56983 = abstractC5698.f17561;
            C6319 c6319 = this.f72597;
            if ((abstractC19810 == abstractC56983 || abstractC5698.mo10961((AbstractC5698) abstractC19810, c6319)) && m50295(abstractC5698, abstractC4308)) {
                if (z && (abstractC5698.mo16084() & 17179869184L) == 0) {
                    if (!abstractC56982.f17559.m4393()) {
                        return abstractC56982;
                    }
                    AbstractC5473 abstractC5473 = (AbstractC5473) abstractC56982.mo7048();
                    C16597 c16597 = new C16597(this, abstractC5473.f17559, "badVarargs");
                    c16597.f50996 = abstractC5473;
                    return c16597;
                }
                C12171.m29642(!abstractC5698.f17559.m4393());
                try {
                    c6319.f19598.m4869();
                    this.f72579.m29999(abstractC5698, m50331(c1755, abstractC4308, abstractC5698, null, c2609, c26092, c6319.f19598));
                    if (m50328(c1755, abstractC4308, abstractC5698)) {
                        return (!abstractC56982.f17559.m4393() || abstractC56982.f17559 == EnumC1296.f4566) ? m50320(abstractC5698, abstractC56982, abstractC4308, c1755, c2609, z) : abstractC5698;
                    }
                    C5746 c5746 = new C5746(this, c1755, abstractC4308, abstractC5698);
                    EnumC12986 enumC12986 = EnumC12986.FRAGMENT;
                    C16719 mo4076 = c5746.mo4076(enumC12986, null, null, abstractC4308, null, c2609, c26092);
                    EnumC1296 enumC1296 = abstractC56982.f17559;
                    if (enumC1296 == EnumC1296.f4574) {
                        return c5746;
                    }
                    if (enumC1296 == EnumC1296.f4580) {
                        this.f72579.m30000(abstractC5698, mo4076);
                        return new C8837(this, this.f72579);
                    }
                    if (enumC1296 == EnumC1296.f4569) {
                        this.f72579.m30000(abstractC5698, mo4076);
                        return abstractC56982;
                    }
                    if (enumC1296 != EnumC1296.f4575 || !(abstractC56982 instanceof C5746)) {
                        return abstractC56982;
                    }
                    C5746 c57462 = (C5746) abstractC56982;
                    this.f72579.m30000(c57462.f59170, c57462.mo4076(enumC12986, null, null, abstractC4308, null, c2609, c26092));
                    this.f72579.m30000(abstractC5698, mo4076);
                    return new C8837(this, this.f72579);
                } catch (C23653 e) {
                    this.f72579.m30000(abstractC5698, e.mo31425());
                    int i = C15622.f48100[abstractC56982.f17559.ordinal()];
                    if (i == 1) {
                        return new C6720(this, this.f72579);
                    }
                    if (i != 2) {
                        if (i != 3) {
                            return abstractC56982;
                        }
                    } else {
                        if (!(abstractC56982 instanceof C5746)) {
                            return abstractC56982;
                        }
                        C5746 c57463 = (C5746) abstractC56982;
                        this.f72579.m30000(c57463.f59170, c57463.mo4076(EnumC12986.FRAGMENT, null, null, abstractC4308, null, c2609, c26092));
                    }
                    return new C8837(this, this.f72579);
                }
            }
        }
        return abstractC56982;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
    
        if ((512 & r16.f17561.f17563) != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0110, code lost:
    
        if (r17.mo10962(r16, r3, r0, false) != false) goto L81;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC5698 m50320(l.AbstractC5698 r16, l.AbstractC5698 r17, l.AbstractC4308 r18, l.C1755 r19, l.C2609 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22406.m50320(l.ۛ֡֨, l.ۛ֡֨, l.ۙ֨֨, l.֫ۤ֨, l.ۖܶ۠, boolean):l.ۛ֡֨");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m50296(AbstractC5698 abstractC5698, AbstractC5698 abstractC56982, AbstractC4308 abstractC4308, C1755 c1755, C2609 c2609, boolean z) {
        AbstractC4308 abstractC43082;
        boolean z2;
        C1386 c1386 = this.f72592;
        c1386.m4869();
        int max = Math.max(Math.max(abstractC5698.f17560.mo12933().m8245(), c2609.m8245()), abstractC56982.f17560.mo12933().m8245());
        C12364 c12364 = this.f72579;
        try {
            C12364 c123642 = new C12364(this);
            this.f72579 = c123642;
            c123642.f37061 = c12364.f37061;
            c123642.f37062 = c12364.f37062.mo11112(c2609);
            C6319 c6319 = this.f72597;
            try {
                abstractC43082 = m50331(c1755, abstractC4308, abstractC56982, null, m50299(c6319.m17479(c6319.m17543(abstractC5698, abstractC4308).mo12933()), abstractC5698, max, z), null, c1386);
            } catch (C23653 unused) {
                abstractC43082 = null;
            }
            if (abstractC43082 != null) {
                if (!c1386.m4870(EnumC20347.UNCHECKED)) {
                    z2 = true;
                    return z2;
                }
            }
            z2 = false;
            return z2;
        } finally {
            this.f72579 = c12364;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m50299(C2609 c2609, AbstractC5698 abstractC5698, int i, boolean z) {
        if ((abstractC5698.mo16084() & 17179869184L) == 0 || !z) {
            return c2609;
        }
        AbstractC4308 m17515 = this.f72597.m17515((AbstractC4308) c2609.last());
        if (m17515 == null) {
            C12171.m29640("Bad varargs = " + c2609.last() + " " + abstractC5698);
            throw null;
        }
        C2609 m8250 = c2609.m8250().f8241.m8246(m17515).m8250();
        while (m8250.m8245() < i) {
            m8250 = m8250.m8242((AbstractC4308) m8250.last());
        }
        return m8250;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50319(AbstractC5698 abstractC5698, AbstractC5698 abstractC56982) {
        if (((abstractC5698.mo16084() | abstractC56982.mo16084()) & 4398046511104L) != 0) {
            return (abstractC5698.mo16084() & 4398046511104L) == 0 ? abstractC5698 : abstractC56982;
        }
        return new C11391(this, abstractC5698, abstractC56982);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50305(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092, AbstractC14016 abstractC14016, AbstractC5698 abstractC5698, boolean z, boolean z2) {
        C5309 c5309 = new C5309();
        c5309.f16557 = z2;
        abstractC14016.getClass();
        Iterator it = abstractC14016.mo20477(abstractC10370, c5309, EnumC1317.RECURSIVE).iterator();
        AbstractC5698 abstractC56982 = abstractC5698;
        while (it.hasNext()) {
            abstractC56982 = m50304(c1755, abstractC4308, c2609, c26092, (AbstractC5698) it.next(), abstractC56982, z);
        }
        return abstractC56982;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50306(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092, boolean z) {
        AbstractC4308 abstractC43082 = abstractC4308.f13890.f17560;
        C2609[] c2609Arr = new C2609[2];
        c2609Arr[0] = C2609.m8239();
        c2609Arr[1] = C2609.m8239();
        EnumC3898 enumC3898 = EnumC3898.f12471;
        C0806 c0806 = new C0806(this, abstractC43082);
        AbstractC5698 abstractC5698 = this.f72611;
        EnumC3898 enumC38982 = enumC3898;
        AbstractC5698 abstractC56982 = abstractC5698;
        while (true) {
            boolean hasNext = c0806.hasNext();
            C6319 c6319 = this.f72597;
            if (hasNext) {
                AbstractC19810 abstractC19810 = (AbstractC19810) c0806.next();
                C0806 c08062 = c0806;
                abstractC56982 = m50305(c1755, abstractC4308, abstractC10370, c2609, c26092, abstractC19810.mo16064(), abstractC56982, z, true);
                if (abstractC10370 == this.f72594.f18879) {
                    return abstractC56982;
                }
                enumC38982 = enumC38982 == null ? null : enumC38982.mo7977(abstractC19810, this);
                if (enumC38982 != null) {
                    Iterator it = c6319.m17510(abstractC19810.f17560).iterator();
                    while (it.hasNext()) {
                        c2609Arr[enumC38982.ordinal()] = c6319.m17533(c6319.m17547((AbstractC4308) it.next()), c2609Arr[enumC38982.ordinal()]);
                    }
                }
                c0806 = c08062;
            } else {
                if (abstractC56982.f17559.m4396() && (abstractC56982.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                    abstractC5698 = abstractC56982;
                }
                EnumC3898[] values = EnumC3898.values();
                int length = values.length;
                AbstractC5698 abstractC56983 = abstractC56982;
                int i = 0;
                while (i < length) {
                    EnumC3898 enumC38983 = values[i];
                    Iterator it2 = c2609Arr[enumC38983.ordinal()].iterator();
                    AbstractC5698 abstractC56984 = abstractC56983;
                    while (it2.hasNext()) {
                        AbstractC4308 abstractC43083 = (AbstractC4308) it2.next();
                        if (abstractC43083.mo12925() && (enumC38983 != EnumC3898.f12469 || (abstractC43083.f13890.mo16084() & 8796093022208L) != 0)) {
                            EnumC3898 enumC38984 = enumC38983;
                            int i2 = i;
                            int i3 = length;
                            AbstractC5698 m50305 = m50305(c1755, abstractC4308, abstractC10370, c2609, c26092, abstractC43083.f13890.mo16064(), abstractC56984, z, true);
                            abstractC56984 = (abstractC5698 != m50305 && abstractC5698.f17559.m4396() && m50305.f17559.m4396() && c6319.m17532(abstractC5698.f17560, m50305.f17560, true)) ? abstractC5698 : m50305;
                            i = i2;
                            enumC38983 = enumC38984;
                            length = i3;
                        }
                    }
                    i++;
                    abstractC56983 = abstractC56984;
                }
                return abstractC56983;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r12 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r1.f17559 != l.EnumC1296.f4571) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r1.f17561.f17559 != l.EnumC1296.f4582) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if ((8 & r1.mo16084()) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        return new l.C1239(r1, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC5698 m50310(l.C1755 r16, l.AbstractC10370 r17, l.C2609 r18, l.C2609 r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22406.m50310(l.֫ۤ֨, l.ۤܶ۠, l.ۖܶ۠, l.ۖܶ۠, boolean):l.ۛ֡֨");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50311(C1755 c1755, AbstractC10370 abstractC10370, InterfaceC20996 interfaceC20996) {
        try {
            C14163 m45829 = this.f72574.m45829(c1755.f6075.f4739, abstractC10370);
            return m50330(c1755, (AbstractC19810) m45829, false) ? m45829 : new C5746(this, c1755, null, m45829);
        } catch (C21325 e) {
            return new C13506(this, e);
        } catch (C20515 unused) {
            AbstractC5698 mo16565 = interfaceC20996.mo16565(c1755, abstractC10370);
            return mo16565 != null ? mo16565 : this.f72603;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50309(C1755 c1755, AbstractC10370 abstractC10370) {
        C0052 c0052 = c1755.f6075.f4739;
        final C20661 c20661 = this.f72605;
        C7814 m47272 = c20661.m47272(c0052, abstractC10370);
        if (this.f72604 && c1755.f6074.m14709(EnumC18550.f57491)) {
            AbstractC5144 abstractC5144 = ((C10643) c1755.f6074).f32021;
            if (abstractC5144.m14709(EnumC18550.f57581) && C7260.m19462(abstractC5144) == this.f72594.f18835 && C7260.m19452(((C6262) abstractC5144).f19397) == abstractC10370) {
                m47272.mo16101();
                if (m47272.f24145.m20480()) {
                    return m50284(c1755, abstractC10370, new Function() { // from class: l.ܰ۟֨
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public /* synthetic */ Function mo22274andThen(Function function) {
                            return C20696.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return C20661.this.m47273((AbstractC10370) obj);
                        }

                        @Override // java.util.function.Function
                        public /* synthetic */ Function compose(Function function) {
                            return C20696.$default$compose(this, function);
                        }
                    }, new BiFunction() { // from class: l.۟۟֨
                        public /* synthetic */ BiFunction andThen(Function function) {
                            return C17167.$default$andThen(this, function);
                        }

                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return C20661.this.m47266((C0052) obj, (AbstractC10370) obj2);
                        }
                    }, new C23134(4), m47272);
                }
            }
        }
        return m47272;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 m50284(C1755 c1755, AbstractC10370 abstractC10370, Function function, BiFunction biFunction, Predicate predicate, AbstractC5698 abstractC5698) {
        AbstractC5698 abstractC56982;
        for (AbstractC5698 abstractC56983 : (Iterable) function.apply(abstractC10370)) {
            if (predicate.test(abstractC56983)) {
                C0052 c0052 = c1755.f6075.f4739;
                C7814 m16089 = abstractC56983.m16089();
                if (c0052 == m16089.f24147 || c0052.f913.containsKey(m16089.f24143)) {
                    return new C5746(this, c1755, null, abstractC56983);
                }
                return new C19421(this, c1755, false, abstractC56983);
            }
        }
        C20661 c20661 = this.f72605;
        HashSet hashSet = new HashSet(c20661.m47257());
        hashSet.add(c20661.f66447);
        hashSet.remove(c1755.f6075.f4739);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C0052 c00522 = (C0052) it.next();
            if (c00522.f927 == null) {
                if (c00522.f914 == null) {
                    this.f72580.m17171(c00522);
                }
                if (c00522.f17559 != EnumC1296.f4581 && (abstractC56982 = (AbstractC5698) biFunction.apply(c00522, abstractC10370)) != null && predicate.test(abstractC56982)) {
                    C0052 c00523 = c1755.f6075.f4739;
                    C7814 m160892 = abstractC56982.m16089();
                    if (c00523 == m160892.f24147 || c00523.f913.containsKey(m160892.f24143)) {
                        return new C5746(this, c1755, null, abstractC56982);
                    }
                    return new C19421(this, c1755, false, abstractC56982);
                }
            }
        }
        return abstractC5698;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50332(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().m20476(abstractC10370)) {
            if (abstractC5698.f17559 == EnumC1296.f4582) {
                return m50328(c1755, abstractC4308, abstractC5698) ? abstractC5698 : new C5746(this, c1755, abstractC4308, abstractC5698);
            }
        }
        return this.f72603;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50333(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        AbstractC4308 abstractC43082 = abstractC19810.f17560;
        C6319 c6319 = this.f72597;
        AbstractC4308 m17562 = c6319.m17562(abstractC43082);
        AbstractC5698 abstractC5698 = this.f72603;
        if (m17562 != null && m17562.m12913(EnumC9454.CLASS)) {
            abstractC5698 = m50293(abstractC5698, m50334(c1755, abstractC4308, abstractC10370, m17562.f13890));
        }
        for (C2609 m17510 = c6319.m17510(abstractC19810.f17560); abstractC5698.f17559 != EnumC1296.f4566 && m17510.m8249(); m17510 = m17510.f8241) {
            AbstractC5698 m50334 = m50334(c1755, abstractC4308, abstractC10370, ((AbstractC4308) m17510.f8240).f13890);
            if (!abstractC5698.f17559.m4393() && !m50334.f17559.m4393() && m50334.f17561 != abstractC5698.f17561) {
                abstractC5698 = new C11391(this, abstractC5698, m50334);
            } else {
                abstractC5698 = m50293(abstractC5698, m50334);
            }
        }
        return abstractC5698;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50334(C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        AbstractC5698 m50332 = m50332(c1755, abstractC4308, abstractC10370, abstractC19810);
        return m50332 != this.f72603 ? m50332 : m50333(c1755, abstractC4308, abstractC10370, abstractC19810);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50308(C1755 c1755, AbstractC7667 abstractC7667, AbstractC10370 abstractC10370, InterfaceC20996 interfaceC20996) {
        Iterator it = abstractC7667.m20476(abstractC10370).iterator();
        AbstractC5698 abstractC5698 = this.f72603;
        while (it.hasNext()) {
            AbstractC5698 m50311 = m50311(c1755, ((AbstractC5698) it.next()).mo16083(), interfaceC20996);
            EnumC1296 enumC1296 = abstractC5698.f17559;
            EnumC1296 enumC12962 = EnumC1296.f4582;
            if (enumC1296 == enumC12962 && m50311.f17559 == enumC12962 && abstractC5698 != m50311) {
                return new C11391(this, abstractC5698, m50311);
            }
            abstractC5698 = m50293(abstractC5698, m50311);
        }
        return abstractC5698;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r12 = r4;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC5698 m50322(l.C7673 r20, l.C1755 r21, l.AbstractC10370 r22, l.C15406 r23) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22406.m50322(l.۟᩵۠, l.֫ۤ֨, l.ۤܶ۠, l.ܶᩴ֨):l.ۛ֡֨");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == r6.f17562) goto L24;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC5698 m50321(l.C6262 r4, l.C1755 r5, l.AbstractC19810 r6, l.AbstractC10370 r7, l.C15406 r8) {
        /*
            r3 = this;
            l.ۤܶ۠ r0 = l.AbstractC19810.m45553(r7, r6)
            l.ܶᩴ֨ r1 = l.C15406.f47189
            boolean r1 = r8.m36457(r1)
            l.۠ܽ۠ r2 = r3.f72603
            if (r1 == 0) goto L42
            boolean r1 = r3.f72604
            if (r1 == 0) goto L2d
            l.ܶᩴ֨ r1 = l.C15406.f47190
            boolean r1 = r8.m36457(r1)
            if (r1 != 0) goto L2d
            boolean r6 = r6.mo15574()
            if (r6 != 0) goto L2d
            java.lang.Object r6 = r5.f6073
            l.ۡۗ֨ r6 = (l.C8604) r6
            l.۟۬֨ r6 = r6.f26283
            boolean r6 = r6.f23066
            if (r6 != 0) goto L2d
            l.᩷ܽ۠ r6 = r3.f72573
            goto L2f
        L2d:
            l.ۛ۟֨ r6 = r3.f72582
        L2f:
            l.ۛ֡֨ r6 = r3.m50311(r5, r0, r6)
            boolean r1 = r6.mo15574()
            if (r1 == 0) goto L3e
            l.ۤܶ۠ r1 = r6.f17562
            if (r7 != r1) goto L42
            goto L50
        L3e:
            l.ۛ֡֨ r2 = m50293(r2, r6)
        L42:
            l.ܶᩴ֨ r6 = l.C15406.f47190
            boolean r6 = r8.m36457(r6)
            if (r6 == 0) goto L4f
            l.ۛ֡֨ r6 = r3.m50309(r5, r0)
            goto L50
        L4f:
            r6 = r2
        L50:
            l.ۛ֡֨ r4 = r3.m50285(r4, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22406.m50321(l.ۛ᩵۠, l.֫ۤ֨, l.᩶֡֨, l.ۤܶ۠, l.ܶᩴ֨):l.ۛ֡֨");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50315(AbstractC5144 abstractC5144, C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C15406 c15406) {
        AbstractC5698 abstractC5698;
        boolean m36457 = c15406.m36457(C15406.f47181);
        AbstractC5698 abstractC56982 = this.f72603;
        if (m36457) {
            abstractC5698 = m50307(c1755, abstractC4308, abstractC10370, abstractC4308.f13890);
            if (!abstractC5698.mo15574()) {
                abstractC56982 = m50293(abstractC56982, abstractC5698);
            }
            return m50285(abstractC5144, abstractC5698, abstractC10370);
        }
        if (c15406.m36457(C15406.f47189)) {
            abstractC5698 = m50334(c1755, abstractC4308, abstractC10370, abstractC4308.f13890);
            if (!abstractC5698.mo15574()) {
                abstractC5698 = m50293(abstractC56982, abstractC5698);
            }
        } else {
            abstractC5698 = abstractC56982;
        }
        return m50285(abstractC5144, abstractC5698, abstractC10370);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m50285(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC10370 abstractC10370) {
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 == EnumC1296.f4582 || enumC1296 == EnumC1296.f4573) {
            boolean z = this.f72600;
            C6136 c6136 = this.f72594;
            if (z && abstractC10370.equals(c6136.f18888)) {
                return new C10954(this, c6136.f18888);
            }
            AbstractC10370 abstractC103702 = c6136.f18799;
            AbstractC10370 abstractC103703 = c6136.f18799;
            if (abstractC10370.equals(abstractC103702)) {
                if (this.f72602) {
                    return new C10954(this, abstractC103703);
                }
                if (interfaceC3109 != null) {
                    C11076 c11076 = C14001.f42334;
                    this.f72598.m7285(interfaceC3109, new C11076("compiler", "illegal.ref.to.restricted.type", abstractC103703));
                }
            }
        }
        return abstractC5698;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50317(AbstractC5698 abstractC5698, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC56982, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, boolean z, C2609 c2609, C2609 c26092, InterfaceC0369 interfaceC0369) {
        C16719 mo4076;
        if (!abstractC5698.f17559.m4393()) {
            return abstractC5698;
        }
        AbstractC5473 abstractC5473 = (AbstractC5473) abstractC5698.mo7048();
        AbstractC5698 mo15573 = abstractC5473.mo15573(abstractC10370, z ? abstractC4308.f13890 : this.f72605.f66475);
        C2609 mo1822 = interfaceC0369.mo1822(mo15573, c2609);
        if (interfaceC0369.mo1823(abstractC4308, mo1822, c26092) && (mo4076 = abstractC5473.mo4076(EnumC12986.ERROR, interfaceC3109, abstractC56982, abstractC4308, abstractC10370, mo1822, c26092)) != null) {
            mo4076.m39351(EnumC20043.RESOLVE_ERROR);
            this.f72598.mo7277(mo4076);
        }
        return mo15573;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50316(AbstractC5698 abstractC5698, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC56982, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, boolean z) {
        return m50317(abstractC5698, interfaceC3109, abstractC56982, abstractC4308, abstractC10370, z, C2609.m8239(), (C2609) null, this.f72609);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50326(AbstractC12612 abstractC12612, AbstractC5698 abstractC5698) {
        if ((abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 || (abstractC5698.mo16084() & 8796093022208L) != 0) {
            return;
        }
        EnumC8352 m49076 = C21758.m49076(abstractC5698);
        AbstractC5698 m16072 = abstractC5698.m16072();
        C12281 c12281 = C6241.f19132;
        this.f72598.m7273(abstractC12612, new C12281("compiler", "abstract.cant.be.accessed.directly", m49076, abstractC5698, m16072));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50313(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092) {
        return m50303(c1755, interfaceC3109, abstractC5698, new C12364(this), new C17034(this, abstractC10370, abstractC4308, c2609, c26092));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50318(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308) {
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        AbstractC14016 abstractC14016 = this.f72612;
        Iterator it = abstractC14016.m20476(abstractC10370).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C6319 c6319 = this.f72597;
            if (hasNext) {
                AbstractC5698 abstractC56982 = (AbstractC5698) it.next();
                if (c6319.m17550(abstractC4308, abstractC56982.f17560) && abstractC5698.f17561 == abstractC56982.f17561) {
                    return abstractC56982;
                }
            } else {
                AbstractC4308 mo12923 = abstractC5698.f17560.mo12923();
                C20661 c20661 = this.f72605;
                if (!c6319.m17550(mo12923, c20661.f66526) && !c6319.m17550(mo12923, abstractC4308.mo12923())) {
                    abstractC4308 = new C10658(abstractC4308.mo12933(), mo12923, abstractC4308.mo12930(), c20661.f66481);
                }
                C14211 c14211 = new C14211((abstractC5698.mo16084() & 15) | 137438954496L, abstractC5698.f17562, abstractC4308, abstractC5698.f17561, abstractC5698);
                if (!abstractC4308.mo12948()) {
                    abstractC14016.mo26382(c14211);
                }
                return c14211;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m50300(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092) {
        C12364 c12364 = new C12364(this);
        c12364.f37060 = true;
        AbstractC5698 m50303 = m50303(c1755, interfaceC3109, abstractC4308.f13890, c12364, new C17034(this, abstractC10370, abstractC4308, c2609, c26092));
        if (m50303.f17559 == EnumC1296.f4571) {
            return (C3581) m50303;
        }
        C11576 c11576 = C11886.f35440;
        throw new C23570(this.f72607.m16617(new C11576("compiler", "fatal.err.cant.locate.meth", abstractC10370)).toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50312(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26092) {
        return m50303(c1755, interfaceC3109, abstractC4308.f13890, new C12364(this), new C23384(this, this.f72594.f18879, abstractC4308, c2609, c26092, interfaceC3109));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5698 m50288(C22406 c22406, C19110 c19110, C1755 c1755, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26092, boolean z) {
        AbstractC5698 m50282 = c22406.m50282(c1755, abstractC4308, c2609, c26092, z);
        C15240 c15240 = c22406.f72599;
        AbstractC5698 abstractC5698 = ((C8604) c1755.f6073).f26285.f23673;
        c15240.getClass();
        c15240.m36116(new C18064(c19110), abstractC5698, m50282);
        c15240.m36127(c19110, ((C8604) c1755.f6073).f26285.f23673, m50282);
        return m50282;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 m50282(C1755 c1755, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26092, boolean z) {
        C2609 m8239;
        AbstractC14016 mo16064 = (abstractC4308.f13890.m16070() ? this.f72605.f66526.f13890 : abstractC4308.f13890).mo16064();
        C6136 c6136 = this.f72594;
        AbstractC5698 abstractC5698 = this.f72611;
        for (AbstractC5698 abstractC56982 : mo16064.m20476(c6136.f18879)) {
            if (abstractC56982.f17559 == EnumC1296.f4571 && (abstractC56982.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                if (abstractC56982.f17560.m12913(EnumC9454.FORALL)) {
                    m8239 = ((C10077) abstractC56982.f17560).f30362;
                } else {
                    m8239 = C2609.m8239();
                }
                C2609 mo12938 = abstractC4308.f13890.f17560.mo12938();
                mo12938.getClass();
                abstractC5698 = m50304(c1755, abstractC4308, c2609, c26092, new C20563(abstractC56982.mo16084(), c6136.f18879, new C10077(this.f72597.m17542(abstractC56982.f17560.mo12945(), abstractC4308), m8239.m8248(mo12938)), abstractC4308.f13890, abstractC56982), abstractC5698, z);
            }
        }
        return abstractC5698;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC9001 m50323(AbstractC4308 abstractC4308, EnumC16761 enumC16761, C9232 c9232, C2609 c2609, C2609 c26092, AbstractC10370 abstractC10370) {
        if (!abstractC10370.equals(this.f72594.f18879)) {
            return new C3192(this, c9232, abstractC10370, abstractC4308, c2609, c26092, enumC16761);
        }
        if (abstractC4308.m12913(EnumC9454.ARRAY)) {
            return new C22679(this, c9232, abstractC4308, c2609, c26092, enumC16761);
        }
        return new C17303(this, c9232, abstractC4308, c2609, c26092, enumC16761);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23069 m50325(C1755 c1755, C9232 c9232, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092, AbstractC4308 abstractC43082, AbstractC9980 abstractC9980, C0384 c0384, AbstractC9707 abstractC9707) {
        C19585 c19585;
        C19585 c195852;
        C19585 mo22279;
        EnumC16761 enumC16761;
        AbstractC9001 m50323 = m50323(abstractC4308, EnumC16761.f51455, c9232, c2609, c26092, abstractC10370);
        AbstractC5144 abstractC5144 = c1755.f6074;
        C8604 c8604 = (C8604) c1755.f6073;
        C1755 m5877 = c1755.m5877(abstractC5144, c8604.m22358(c8604.f26285));
        C12364 c12364 = new C12364(this);
        c12364.f37062 = abstractC9980;
        AbstractC5144 abstractC51442 = c1755.f6074;
        abstractC51442.getClass();
        AbstractC5698 m50303 = m50303(m5877, abstractC51442, abstractC4308.f13890, c12364, m50323);
        C19585 c195853 = new C19585(m50303, c12364);
        boolean z = this.f72581;
        if (z) {
            m50290(c9232, c12364, m50303, true);
        }
        C1755 m58772 = c1755.m5877(c1755.f6074, c8604.m22358(c8604.f26285));
        AbstractC9001 mo9814 = m50323.mo9814(c0384);
        if (mo9814 == null) {
            c19585 = c195853;
            c195852 = this.f72595;
        } else {
            C12364 c123642 = new C12364(this);
            c123642.f37062 = abstractC9980;
            AbstractC5144 abstractC51443 = c1755.f6074;
            abstractC51443.getClass();
            c19585 = c195853;
            AbstractC5698 m503032 = m50303(m58772, abstractC51443, abstractC4308.f13890, c123642, mo9814);
            c195852 = new C19585(m503032, c123642);
            if (z) {
                m50290(c9232, c123642, m503032, false);
            }
        }
        if (c195852 != abstractC9707.f29391.f72595) {
            mo22279 = abstractC9707.mo22280(c19585, c195852);
        } else {
            mo22279 = abstractC9707.mo22279(c19585);
        }
        AbstractC5698 abstractC5698 = mo22279.f63278;
        if (mo22279 == c195852) {
            m50323 = mo9814;
        }
        C23069 c23069 = new C23069(abstractC5698, m50323);
        if (mo22279 == c195852) {
            enumC16761 = ((C8604) m58772.f6073).f26288;
        } else {
            enumC16761 = ((C8604) m5877.f6073).f26288;
        }
        c8604.f26288 = enumC16761;
        if (!abstractC5698.f17559.m4393()) {
            C3581 c3581 = (C3581) abstractC5698;
            if ((c3581.f17563 & 70368744177664L) != 0) {
                c8604.f26288 = EnumC16761.f51454;
                return new C23069(m50318(c3581, abstractC43082), m50323);
            }
        }
        return c23069;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50290(C9232 c9232, C12364 c12364, AbstractC5698 abstractC5698, boolean z) {
        C2609 c2609;
        C5931 c5931;
        C16719 c16719;
        C18837 c18837 = new C18837();
        c2609 = c12364.f37058;
        Iterator it = c2609.iterator();
        char c = 0;
        int i = -1;
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            c5931 = this.f72607;
            if (!hasNext) {
                break;
            }
            C13069 c13069 = (C13069) it.next();
            EnumC16761 enumC16761 = c12364.f37061;
            EnumC16761 enumC167612 = c13069.f39141;
            AbstractC5698 abstractC56982 = c13069.f39142;
            if (enumC16761 == enumC167612 && c13069.m31667()) {
                if (abstractC56982.f17560.m12913(EnumC9454.FORALL)) {
                    AbstractC4308 abstractC4308 = c13069.f39140;
                    C11576 c11576 = C11886.f35440;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC4308;
                    c16719 = c5931.m16617(new C11576("compiler", "partial.inst.sig", objArr));
                } else {
                    c16719 = null;
                }
                c18837.m43511(c5931.m16622(c16719 == null ? "applicable.method.found.2" : "applicable.method.found.3", Integer.valueOf(i2), abstractC56982.mo15572() ? C11886.f35511 : C11886.f35454, abstractC56982, c16719));
                if (abstractC56982 == abstractC5698) {
                    i = i2;
                }
                i2++;
            }
            c = 0;
        }
        C22364 c22364 = this.f72598;
        c22364.mo7277(new C22864(c5931.m16621((EnumC20347) null, EnumSet.noneOf(EnumC20043.class), c22364.m7266(), c9232, c5931.m16623("method.ref.search.results.multi", z ? C11886.f35491 : C11886.f35514, c9232.toString(), Integer.valueOf(i))), c18837.m43517()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50303(C1755 c1755, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, C12364 c12364, AbstractC1075 abstractC1075) {
        EnumC1296 enumC1296;
        C12364 c123642 = this.f72579;
        try {
            AbstractC5698 abstractC56982 = this.f72611;
            this.f72579 = c12364;
            Iterator it = this.f72608.iterator();
            while (it.hasNext()) {
                EnumC16761 enumC16761 = (EnumC16761) it.next();
                if (enumC16761.ordinal() > abstractC1075.f3937.ordinal() || !abstractC56982.f17559.m4393() || (enumC1296 = abstractC56982.f17559) == EnumC1296.f4566 || enumC1296 == EnumC1296.f4576) {
                    break;
                }
                C12364 c123643 = this.f72579;
                EnumC16761 enumC167612 = c123643.f37061;
                c123643.f37061 = enumC16761;
                AbstractC5698 mo3659 = abstractC1075.mo3659(c1755, enumC16761);
                abstractC1075.mo3660(interfaceC3109, mo3659);
                AbstractC5698 mo27547 = enumC16761.mo27547(abstractC56982, mo3659);
                C8604 c8604 = (C8604) c1755.f6073;
                if (abstractC56982 == mo27547) {
                    enumC16761 = enumC167612;
                }
                c8604.f26288 = enumC16761;
                abstractC56982 = mo27547;
            }
            return abstractC1075.mo3658(c1755, interfaceC3109, abstractC5698, abstractC56982);
        } finally {
            this.f72579 = c123642;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m50314(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC19810 abstractC19810, AbstractC10370 abstractC10370) {
        AbstractC5698 mo20478;
        boolean z = false;
        for (C1755 c17552 = c1755; c17552.f6076 != null; c17552 = c17552.f6076) {
            if (m50291(c17552)) {
                z = true;
            }
            if (c17552.f6079.f17186 == abstractC19810 && (mo20478 = ((C8604) c17552.f6073).f26285.mo20478(abstractC10370, (Predicate) null)) != null) {
                AbstractC5698 c1239 = z ? new C1239(mo20478, this) : mo20478;
                AbstractC4308 abstractC4308 = c1755.f6079.f17186.f17560;
                return m50316(c1239, interfaceC3109, (AbstractC5698) abstractC4308.f13890, abstractC4308, abstractC10370, true);
            }
            C14163 c14163 = c17552.f6079.f17186;
            c14163.mo16101();
            if ((c14163.f17563 & 8) != 0) {
                z = true;
            }
        }
        boolean m16070 = abstractC19810.m16070();
        C20661 c20661 = this.f72605;
        C22364 c22364 = this.f72598;
        if (m16070) {
            C6136 c6136 = this.f72594;
            if (abstractC10370 == c6136.f18898 && !m50291(c1755)) {
                C14163 c141632 = c1755.f6079.f17186;
                C6319 c6319 = this.f72597;
                if (c6319.m17509(abstractC19810, (AbstractC19810) c141632)) {
                    AbstractC4308 abstractC43082 = c1755.f6079.f16086;
                    C18837 c18837 = new C18837();
                    Iterator it = c6319.m17510(abstractC43082).iterator();
                    while (it.hasNext()) {
                        AbstractC4308 abstractC43083 = (AbstractC4308) it.next();
                        Iterator it2 = c6319.m17565(abstractC43082).iterator();
                        boolean z2 = true;
                        while (it2.hasNext()) {
                            AbstractC4308 abstractC43084 = (AbstractC4308) it2.next();
                            if (abstractC43083 != abstractC43084 && !abstractC43084.m12913(EnumC9454.ERROR) && c6319.m17546(abstractC43084, abstractC43083, false)) {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            c18837.m43511(abstractC43083);
                        }
                    }
                    Iterator it3 = c18837.m43517().iterator();
                    while (it3.hasNext()) {
                        AbstractC4308 abstractC43085 = (AbstractC4308) it3.next();
                        if (abstractC43085.f13890 == abstractC19810) {
                            ((C8604) c1755.f6073).f26290 = abstractC43085;
                            return new C12048(0L, c6136.f18898, c6319.m17527(abstractC19810, c1755.f6079.f16086), c1755.f6079.f17186);
                        }
                    }
                    Iterator it4 = c6319.m17565(c1755.f6079.f16086).iterator();
                    while (it4.hasNext()) {
                        AbstractC4308 abstractC43086 = (AbstractC4308) it4.next();
                        if (abstractC43086.f13890.mo16080((AbstractC5698) abstractC19810, c6319) && abstractC43086.f13890 != abstractC19810) {
                            C11576 c11576 = C11886.f35440;
                            C11576 c115762 = new C11576("compiler", "redundant.supertype", abstractC19810, abstractC43086);
                            C12281 c12281 = C6241.f19132;
                            c22364.m7273(interfaceC3109, new C12281("compiler", "illegal.default.super.call", abstractC19810, c115762));
                            return c20661.f66462;
                        }
                    }
                    C12171.m29636();
                    throw null;
                }
            }
        }
        C12281 c122812 = C6241.f19132;
        c22364.m7273(interfaceC3109, new C12281("compiler", "not.encl.class", abstractC19810));
        return c20661.f66462;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50327(C1755 c1755, AbstractC4308 abstractC4308) {
        AbstractC5698 m50283;
        EnumC9454 enumC9454 = EnumC9454.CLASS;
        return abstractC4308.m12913(enumC9454) && abstractC4308.mo4958().m12913(enumC9454) && ((m50283 = m50283(c1755, (AbstractC5698) abstractC4308.f13890, false)) == null || m50283.f17559.m4393());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m50283(C1755 c1755, AbstractC5698 abstractC5698, boolean z) {
        AbstractC5698 mo20478;
        AbstractC10370 abstractC10370 = this.f72594.f18886;
        if (z) {
            c1755 = c1755.f6076;
        }
        if (c1755 != null) {
            boolean z2 = false;
            while (c1755 != null && c1755.f6076 != null) {
                if (m50291(c1755)) {
                    z2 = true;
                }
                if (c1755.f6079.f17186.mo16080((AbstractC5698) abstractC5698.f17561.m16071(), this.f72597) && (mo20478 = ((C8604) c1755.f6073).f26285.mo20478(abstractC10370, (Predicate) null)) != null) {
                    return z2 ? new C1239(mo20478, this) : mo20478;
                }
                C14163 c14163 = c1755.f6079.f17186;
                c14163.mo16101();
                if ((c14163.f17563 & 8) != 0) {
                    z2 = true;
                }
                c1755 = c1755.f6076;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m50302(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC4308 abstractC4308, boolean z) {
        AbstractC5698 m50316;
        boolean m4391 = abstractC4308.f13890.f17561.f17559.m4391(C15406.f47185);
        C22364 c22364 = this.f72598;
        if (m4391) {
            m50316 = m50314(interfaceC3109, c1755, abstractC4308.mo4958().f13890, this.f72594.f18886);
        } else {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            AbstractC5698 m50283 = m50283(c1755, (AbstractC5698) abstractC19810, z);
            if (m50283 == null) {
                C12281 c12281 = C6241.f19132;
                c22364.m7273(interfaceC3109, new C12281("compiler", "encl.class.required", abstractC19810));
                m50316 = this.f72605.f66462;
            } else {
                AbstractC4308 abstractC43082 = c1755.f6079.f17186.f17560;
                m50316 = m50316(m50283, interfaceC3109, (AbstractC5698) abstractC43082.f13890, abstractC43082, m50283.f17562, true);
            }
        }
        AbstractC4308 abstractC43083 = m50316.f17560;
        if (((C8604) c1755.f6073).f26299 && abstractC43083.f13890 == c1755.f6079.f17186) {
            C12281 c122812 = C6241.f19132;
            c22364.m7273(interfaceC3109, new C12281("compiler", "cant.ref.before.ctor.called", "this"));
        }
        return abstractC43083;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m50298(C2609 c2609) {
        if (c2609 == null || c2609.isEmpty()) {
            return this.f72589;
        }
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
            if (abstractC4308.m12913(EnumC9454.DEFERRED)) {
                c18837.m43511(((C1110) abstractC4308).f4048);
            } else {
                c18837.m43511(abstractC4308);
            }
        }
        return c18837;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16719 m50324(C1755 c1755, final C7814 c7814) {
        boolean contains = c1755.f6075.f4739.f922.contains(c7814.f24147);
        C20661 c20661 = this.f72605;
        C5931 c5931 = this.f72607;
        if (!contains) {
            C0052 c0052 = c7814.f24147;
            C0052 c00522 = c20661.f66447;
            if (c0052 != c00522) {
                C0052 c00523 = c1755.f6075.f4739;
                if (c00523 != c00522) {
                    C11576 c11576 = C11886.f35440;
                    return c5931.m16617(new C11576("compiler", "not.def.access.does.not.read", c00523, c7814, c0052));
                }
                C11576 c115762 = C11886.f35440;
                return c5931.m16617(new C11576("compiler", "not.def.access.does.not.read.from.unnamed", c7814, c0052));
            }
            C0052 c00524 = c1755.f6075.f4739;
            C11576 c115763 = C11886.f35440;
            return c5931.m16617(new C11576("compiler", "not.def.access.does.not.read.unnamed", c7814, c00524));
        }
        if (C5378.stream(c7814.m16089().f24147.f921).anyMatch(new Predicate() { // from class: l.ܽ֫۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C17524) obj).f53523 == C7814.this;
            }
        })) {
            C0052 c00525 = c1755.f6075.f4739;
            if (c00525 != c20661.f66447) {
                C0052 c00526 = c7814.f24147;
                C11576 c115764 = C11886.f35440;
                return c5931.m16617(new C11576("compiler", "not.def.access.not.exported.to.module", c7814, c00526, c00525));
            }
            C0052 c00527 = c7814.f24147;
            C11576 c115765 = C11886.f35440;
            return c5931.m16617(new C11576("compiler", "not.def.access.not.exported.to.module.from.unnamed", c7814, c00527));
        }
        if (c1755.f6075.f4739 != c20661.f66447) {
            C0052 c00528 = c7814.f24147;
            C11576 c115766 = C11886.f35440;
            return c5931.m16617(new C11576("compiler", "not.def.access.not.exported", c7814, c00528));
        }
        C0052 c00529 = c7814.f24147;
        C11576 c115767 = C11886.f35440;
        return c5931.m16617(new C11576("compiler", "not.def.access.not.exported.from.unnamed", c7814, c00529));
    }
}
