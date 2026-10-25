package l;

import java.util.Iterator;

/* compiled from: 440F */
/* renamed from: l.۬᩹֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13395 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C4314 f40022 = new C4314();

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C16782 f40024;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22406 f40027;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14267 f40028;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C6319 f40030;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17013 f40031;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C22364 f40032;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f40033;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15240 f40034;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6136 f40036;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9310 f40037;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4658 f40038;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40039;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f40040;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C20661 f40041;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4824 f40042;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18230 f40044;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C18837 f40026 = new C18837();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18837 f40043 = new C18837();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40029 = 0;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C18837 f40035 = new C18837();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18837 f40025 = new C18837();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC8457 f40023 = new C1401(this);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13395 m32391(C2903 c2903) {
        C13395 c13395 = (C13395) c2903.m8838(f40022);
        return c13395 == null ? new C13395(c2903) : c13395;
    }

    public C13395(C2903 c2903) {
        this.f40039 = 0;
        c2903.m8841(f40022, this);
        this.f40037 = C9310.m23901(c2903);
        this.f40034 = C15240.m36054(c2903);
        this.f40038 = C4658.m13638(c2903);
        this.f40044 = C18230.m42469(c2903);
        C13809.m33121(c2903);
        this.f40032 = C22364.m50099(c2903);
        this.f40042 = C4824.m14050(c2903);
        this.f40031 = C17013.m39896(c2903);
        this.f40036 = C6136.m17057(c2903);
        this.f40027 = C22406.m50289(c2903);
        C20661 m47250 = C20661.m47250(c2903);
        this.f40041 = m47250;
        this.f40024 = C16782.m39518(c2903);
        this.f40030 = C6319.m17456(c2903);
        this.f40028 = new C14267(m47250.f66457);
        EnumC16280 m38301 = EnumC16280.m38301(c2903);
        this.f40033 = EnumC10637.f31976.m26686(m38301);
        this.f40040 = m38301.f50071;
        this.f40039 = 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32410() {
        this.f40039++;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m32414() {
        int i = this.f40039 - 1;
        this.f40039 = i;
        if (i == 0) {
            m32413();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32412() {
        this.f40039--;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32413() {
        int i;
        if (this.f40039 <= 0 && (i = this.f40029) <= 0) {
            this.f40029 = i + 1;
            while (this.f40026.m43518()) {
                try {
                    ((Runnable) this.f40026.m43516()).run();
                } finally {
                    this.f40029--;
                }
            }
            while (this.f40035.m43518()) {
                ((Runnable) this.f40035.m43516()).run();
            }
            while (this.f40025.m43518()) {
                ((Runnable) this.f40025.m43516()).run();
            }
            while (this.f40043.m43518()) {
                ((Runnable) this.f40043.m43516()).run();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m32389(C2609 c2609) {
        if (c2609.isEmpty()) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C17551 c17551 = (C17551) it.next();
            C12171.m29637(c17551.f53652);
            c18837.m43511((C6507) c17551.f53652);
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32405(Runnable runnable) {
        this.f40026.m43511(runnable);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32411(Runnable runnable) {
        this.f40043.m43511(runnable);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32409(RunnableC13479 runnableC13479) {
        this.f40025.m43511(runnableC13479);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32406(final C2609 c2609, final C1755 c1755, final AbstractC5698 abstractC5698, final InterfaceC3109 interfaceC3109) {
        if (c2609.isEmpty()) {
            return;
        }
        abstractC5698.m16104();
        m32405(new Runnable() { // from class: l.᩵᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                C13395.m32399(C13395.this, abstractC5698, c1755, interfaceC3109, c2609);
            }
        });
        m32411(new RunnableC16017(this, c1755, c2609, abstractC5698, 1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32399(C13395 c13395, AbstractC5698 abstractC5698, C1755 c1755, InterfaceC3109 interfaceC3109, C2609 c2609) {
        InterfaceC3109 m42470;
        C15240 c15240 = c13395.f40034;
        C18230 c18230 = c13395.f40044;
        C22364 c22364 = c13395.f40032;
        C12171.m29642(abstractC5698.f17559 == EnumC1296.f4579 || abstractC5698.m16088());
        InterfaceC18278 m7284 = c22364.m7284(c1755.f6075.f4745);
        if (interfaceC3109 != null) {
            m42470 = c18230.m42471(interfaceC3109);
        } else {
            m42470 = c18230.m42470();
        }
        InterfaceC3109 interfaceC31092 = m42470;
        C4824 m36112 = interfaceC3109 != null ? null : c15240.m36112(c13395.f40042);
        try {
            if (abstractC5698.m16095() && c2609.m8249()) {
                int i = ((C17551) c2609.f8240).f16085;
                EnumC8352 m49076 = C21758.m49076(abstractC5698);
                C12281 c12281 = C6241.f19132;
                c22364.m7269(i, new C12281("compiler", "already.annotated", m49076, abstractC5698));
            }
            c13395.m32394(abstractC5698, c2609, c1755, false, false);
        } finally {
            if (m36112 != null) {
                c15240.m36112(m36112);
            }
            c18230.m42471(interfaceC31092);
            c22364.m7284(m7284);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32396(C13395 c13395, C1755 c1755, C2609 c2609, AbstractC5698 abstractC5698) {
        C22364 c22364 = c13395.f40032;
        InterfaceC18278 m7284 = c22364.m7284(c1755.f6075.f4745);
        try {
            c13395.f40034.m36145(abstractC5698, C7260.m19438(abstractC5698, c1755.f6074), c2609);
        } finally {
            c22364.m7284(m7284);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32397(C13395 c13395, C1755 c1755, C8526 c8526, AbstractC12612 abstractC12612, C3581 c3581) {
        C22364 c22364 = c13395.f40032;
        InterfaceC18278 m7284 = c22364.m7284(c1755.f6075.f4745);
        C18230 c18230 = c13395.f40044;
        InterfaceC3109 m42471 = c18230.m42471((InterfaceC3109) c8526);
        try {
            c3581.f11370 = c13395.m32390(c3581.f17560.mo12923(), c1755, abstractC12612);
        } finally {
            c18230.m42471(m42471);
            c22364.m7284(m7284);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32398(C13395 c13395, C1755 c1755, AbstractC12612 abstractC12612) {
        C22364 c22364 = c13395.f40032;
        InterfaceC18278 m7284 = c22364.m7284(c1755.f6075.f4745);
        try {
            C15240 c15240 = c13395.f40034;
            c15240.getClass();
            abstractC12612.mo988(new C6775(c15240));
        } finally {
            c22364.m7284(m7284);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0262, code lost:
    
        if (r10.m17550(r0, r6) != false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026e  */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41, types: [l.ۛ֡֨] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v47, types: [l.ۘ֡֨] */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r20v1, types: [l.ۤ֨֨] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m32394(l.AbstractC5698 r27, l.C2609 r28, l.C1755 r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13395.m32394(l.ۛ֡֨, l.ۖܶ۠, l.֫ۤ֨, boolean, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m32400(AbstractC8624 abstractC8624) {
        if (!(abstractC8624 instanceof C17796)) {
            return false;
        }
        C17796 c17796 = (C17796) abstractC8624;
        return c17796.f26338 == this.f40041.f66469 && ((Integer) c17796.f54417).intValue() != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16384 m32404(C17551 c17551, AbstractC4308 abstractC4308, C1755 c1755) {
        C16384 c16384 = c17551.f53652;
        if (c16384 != null && c17551.f16086 != null) {
            return c16384;
        }
        C16384 c163842 = new C16384(c17551.f16086, m32401(c17551, abstractC4308, c1755), null);
        c17551.f53652 = c163842;
        return c163842;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0171 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C2609 m32401(l.C17551 r26, l.AbstractC4308 r27, l.C1755 r28) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13395.m32401(l.ܿ᩵۠, l.ۙ֨֨, l.֫ۤ֨):l.ۖܶ۠");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC8624 m32390(AbstractC4308 abstractC4308, C1755 c1755, AbstractC12612 abstractC12612) {
        AbstractC19810 abstractC19810;
        AbstractC5698 m19472;
        EnumC1296 enumC1296;
        C20661 c20661 = this.f40041;
        C22364 c22364 = this.f40032;
        try {
            abstractC4308.f13890.mo16101();
        } catch (C20515 e) {
            abstractC12612.getClass();
            EnumC8352 m49076 = C21758.m49076(e.f66102);
            AbstractC10370 mo16076 = e.f66102.mo16076();
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "cant.resolve", m49076, mo16076, null, null));
            abstractC4308 = c20661.f66457;
        }
        boolean m12913 = abstractC4308.m12913(EnumC9454.ARRAY);
        C6319 c6319 = this.f40030;
        if (m12913) {
            if (!abstractC12612.m14709(EnumC18550.f57517)) {
                int i = abstractC12612.f16085;
                C17013 c17013 = this.f40031;
                c17013.f52172 = i;
                abstractC12612 = c17013.m39958(null, C2609.m8239(), C2609.of((Object) abstractC12612));
            }
            C18404 c18404 = (C18404) abstractC12612;
            AbstractC12612 abstractC126122 = c18404.f57138;
            if (abstractC126122 != null) {
                c22364.m7273(abstractC126122, C6241.f19173);
            }
            C18837 c18837 = new C18837();
            for (C2609 c2609 = c18404.f57139; c2609.m8249(); c2609 = c2609.f8241) {
                c18837.m43511(m32390(c6319.m17515(abstractC4308), c1755, (AbstractC12612) c2609.f8240));
            }
            c18404.f16086 = abstractC4308;
            return new C1568(abstractC4308, (AbstractC8624[]) c18837.toArray(new AbstractC8624[c18837.m43514()]));
        }
        if (abstractC12612.m14709(EnumC18550.f57517)) {
            if (!abstractC4308.mo12948()) {
                c22364.m7273(abstractC12612, C6241.f19170);
            }
            C18404 c184042 = (C18404) abstractC12612;
            AbstractC12612 abstractC126123 = c184042.f57138;
            if (abstractC126123 != null) {
                c22364.m7273(abstractC126123, C6241.f19173);
            }
            for (C2609 c26092 = c184042.f57139; c26092.m8249(); c26092 = c26092.f8241) {
                m32390(c20661.f66457, c1755, (AbstractC12612) c26092.f8240);
            }
            return new C14267(c20661.f66457);
        }
        if (abstractC4308.f13890.mo33814()) {
            if (abstractC12612.m14709(EnumC18550.f57490)) {
                return m32404((C17551) abstractC12612, abstractC4308, c1755);
            }
            c22364.m7273(abstractC12612, C6241.f19252);
            abstractC4308 = c20661.f66457;
        }
        if (abstractC12612.m14709(EnumC18550.f57490)) {
            if (!abstractC4308.mo12948()) {
                C12281 c122812 = C6241.f19132;
                c22364.m7273(abstractC12612, new C12281("compiler", "annotation.not.valid.for.type", abstractC4308));
            }
            C17551 c17551 = (C17551) abstractC12612;
            m32404(c17551, c20661.f66457, c1755);
            return new C14267(c17551.f53650.f16086);
        }
        C5635 c5635 = new C5635();
        abstractC12612.mo988(c5635);
        if (!c5635.f33159) {
            c22364.m7273(abstractC12612, C6241.f19271);
            return new C14267(c20661.f66457);
        }
        boolean mo12941 = abstractC4308.mo12941();
        C9310 c9310 = this.f40037;
        if (!mo12941) {
            AbstractC4308 abstractC43082 = c20661.f66533;
            AbstractC4308 abstractC43083 = c20661.f66514;
            if (!c6319.m17550(abstractC4308, abstractC43082) || abstractC4308.m12913(EnumC9454.ERROR)) {
                if (abstractC4308.f13890 == abstractC43083.f13890) {
                    AbstractC4308 m23930 = c9310.m23930(abstractC12612, c1755, m32393(abstractC4308));
                    boolean mo12948 = m23930.mo12948();
                    C6136 c6136 = this.f40036;
                    if (!mo12948) {
                        if (C7260.m19462(abstractC12612) == c6136.f18894) {
                            return new C10741(((C6262) abstractC12612).f19397.f16086, c6319);
                        }
                        c22364.m7273(abstractC12612, C6241.f19229);
                        return new C14267(c20661.f66457);
                    }
                    if (C7260.m19462(abstractC12612) == c6136.f18894) {
                        C6262 c6262 = (C6262) abstractC12612;
                        if (c6262.f19397.f16086.mo12948()) {
                            C12193 m17457 = C6319.m17457(c6262.f19397.f16086.f13890.mo16083(), c20661.f66516, abstractC43083);
                            C20619 c20619 = new C20619(abstractC4308);
                            c20619.f66338 = m17457;
                            return c20619;
                        }
                    }
                    return new C14267(m23930.mo12947());
                }
                if (!abstractC4308.m12913(EnumC9454.CLASS) || (abstractC4308.f13890.mo16084() & 16384) == 0) {
                    if (!abstractC4308.mo12948()) {
                        c22364.m7273(abstractC12612, C6241.f19170);
                    }
                    return new C14267(c9310.m23929((AbstractC5144) abstractC12612, c1755, abstractC4308));
                }
                AbstractC4308 m239302 = c9310.m23930(abstractC12612, c1755, m32393(abstractC4308));
                AbstractC5698 m194722 = C7260.m19472(abstractC12612);
                if (m194722 != null) {
                    AbstractC5144 m19471 = C7260.m19471(abstractC12612);
                    if ((!m19471.m14709(EnumC18550.f57581) || ((m19472 = C7260.m19472(((C6262) m19471).f19397)) != null && ((enumC1296 = m19472.f17559) == EnumC1296.f4579 || enumC1296 == EnumC1296.f4582))) && m194722.f17559 == EnumC1296.f4567 && (16384 & m194722.mo16084()) != 0) {
                        return new C17090(abstractC4308, (C12048) m194722);
                    }
                }
                c22364.m7273(abstractC12612, C6241.f19259);
                return new C14267(m239302.mo12947());
            }
        }
        AbstractC4308 m239303 = c9310.m23930(abstractC12612, c1755, m32393(abstractC4308));
        if (m239303.mo12948()) {
            return new C14267(m239303.mo12947());
        }
        if (m239303.mo12915() == null) {
            c22364.m7273(abstractC12612, C6241.f19264);
            return new C14267(abstractC4308);
        }
        AbstractC4308 abstractC43084 = abstractC12612.f16086;
        if (abstractC43084 != null && (abstractC19810 = abstractC43084.f13890) != null) {
            m32408(abstractC12612, c1755, abstractC19810, abstractC12612);
        }
        return new C17796(this.f40038.m13641(m239303, abstractC4308).mo12915(), abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23420 m32393(AbstractC4308 abstractC4308) {
        C23420 c23420 = this.f40037.f28228;
        return new C23420(c23420.f75218, c23420.f75217, abstractC4308, new C20452(c23420.f75215), c23420.f75216);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32407(C2609 c2609, C1755 c1755, AbstractC5698 abstractC5698, InterfaceC3109 interfaceC3109, boolean z) {
        if (abstractC5698 == null) {
            C12171.m29640("Symbol argument to actualEnterTypeAnnotations is nul/");
            throw null;
        }
        InterfaceC18278 interfaceC18278 = c1755.f6075.f4745;
        C22364 c22364 = this.f40032;
        InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
        C18230 c18230 = this.f40044;
        InterfaceC3109 m42471 = interfaceC3109 != null ? c18230.m42471(interfaceC3109) : null;
        try {
            m32394(abstractC5698, c2609, c1755, true, z);
        } finally {
            if (m42471 != null) {
                c18230.m42471(m42471);
            }
            c22364.m7284(m7284);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32408(final AbstractC5144 abstractC5144, final C1755 c1755, final AbstractC5698 abstractC5698, final InterfaceC3109 interfaceC3109) {
        C12171.m29637(abstractC5698);
        m32405(new Runnable() { // from class: l.֡᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                abstractC5144.mo988(new C3518(C13395.this, c1755, abstractC5698, interfaceC3109));
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8457 m32403() {
        return this.f40023;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32395(C13395 c13395, C1755 c1755) {
        C16384 c16384;
        C16384 c163842;
        C12171.m29641("Trying to annotation type complete a non-annotation type", ((C5557) c1755.f6074).f17186.mo33814());
        C22364 c22364 = c13395.f40032;
        InterfaceC18278 m7284 = c22364.m7284(c1755.f6075.f4745);
        try {
            C5557 c5557 = (C5557) c1755.f6074;
            C22568 c22568 = new C22568(c13395, c13395.f40037, c13395.f40034, c13395.f40041, c13395.f40024);
            c22568.mo1215(c5557);
            C21863 mo33816 = c5557.f17186.mo33816();
            c16384 = c22568.f72974;
            mo33816.m49252(c16384);
            C21863 mo338162 = c5557.f17186.mo33816();
            c163842 = c22568.f72971;
            mo338162.m49253(c163842);
        } finally {
            c22364.m7284(m7284);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14267 m32416() {
        return this.f40028;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32415() {
        this.f40039 = 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4929 m32402(C4929 c4929) {
        C18837 c18837;
        C18837 c188372;
        C18837 c188373;
        C18837 c188374;
        C4929 c49292 = new C4929(this.f40026, this.f40043, this.f40035, this.f40025);
        c18837 = c4929.f15538;
        this.f40026 = c18837;
        c188372 = c4929.f15539;
        this.f40035 = c188372;
        c188373 = c4929.f15537;
        this.f40025 = c188373;
        c188374 = c4929.f15540;
        this.f40043 = c188374;
        return c49292;
    }
}
