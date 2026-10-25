package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Y7SB */
/* renamed from: l.ۜ᩺֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7067 extends C23363 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2609 f21741;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2609 f21744;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f21745;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9184 f21747;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f21746 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14827 f21743 = new C14827();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Map f21742 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5557 m19050(C7067 c7067, C5557 c5557) {
        c7067.getClass();
        c7067.f21744 = C2609.m8239();
        c7067.f21741 = C2609.m8239();
        c7067.f21745 = new HashMap();
        return (C5557) c7067.mo23617(c5557);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        C9184 c9184 = this.f21747;
        C2609 c2609 = this.f21741;
        try {
            AbstractC10370 m19462 = C7260.m19462(c15580.f48011);
            if (m19462 == c9184.f27819.f18886 || m19462 == c9184.f27819.f18898) {
                this.f21741 = this.f21741.m8246(m19064());
            }
            super.mo1407(c15580);
        } finally {
            this.f21741 = c2609;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C14163 m19064() {
        Iterator it = this.f21744.iterator();
        while (it.hasNext()) {
            C11674 c11674 = (C11674) it.next();
            if (c11674.f34784.m14709(EnumC18550.f57582)) {
                return ((C5557) c11674.f34784).f17186;
            }
        }
        return null;
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        C2609 c2609 = this.f21744;
        try {
            if (c2609.m8249() && ((C11674) this.f21744.f8240).f34784.m14709(EnumC18550.f57582)) {
                this.f21744 = this.f21744.m8246(new C11674(c2735));
            }
            super.mo1372(c2735);
        } finally {
            this.f21744 = c2609;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C2609 c2609 = this.f21744;
        int i = this.f21746;
        C14827 c14827 = this.f21743;
        Map map = this.f21742;
        C9184 c9184 = this.f21747;
        C14397 m7266 = c9184.f27804.m7266();
        try {
            c9184.f27804.m7284(c5557.f17186.f42770);
            this.f21746 = 0;
            this.f21743 = new C14827();
            HashMap hashMap = new HashMap();
            try {
                C14163 c14163 = c5557.f17186;
                if (c14163.f17561.f17559 == EnumC1296.f4571) {
                    this.f21745.put(c14163, c5557);
                }
                if (m19061() != null) {
                    c5557.f17186.f17561 = m19052(false);
                    if (c5557.f17186.m16087()) {
                        AbstractC19810 abstractC19810 = c5557.f17186.f17560.mo4958().f13890;
                        for (AbstractC24000 m19067 = m19067(); m19067 != null && !m19067.f77787.mo15572(); m19067 = m19067.f77789) {
                            if (m19067.f77786.m14709(EnumC18550.f57523)) {
                                if (m19048(m19067.f77785, abstractC19810) == null) {
                                    break;
                                } else {
                                    ((C18356) m19067).m42781(abstractC19810, EnumC21179.CAPTURED_THIS);
                                }
                            }
                        }
                    }
                }
                this.f21744 = this.f21744.m8246(new C11674(c5557));
                super.mo1215(c5557);
                c9184.f27804.m7284(m7266.m34390());
                this.f21744 = c2609;
                this.f21746 = i;
                this.f21743 = c14827;
                this.f21742 = hashMap;
            } catch (Throwable th) {
                th = th;
                map = hashMap;
                c9184.f27804.m7284(m7266.m34390());
                this.f21744 = c2609;
                this.f21746 = i;
                this.f21743 = c14827;
                this.f21742 = map;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        if (m19067() != null && m19055(c7673.f23697)) {
            AbstractC5698 abstractC5698 = c7673.f23697;
            if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4571 && c7673.f16086.mo12915() == null) {
                for (AbstractC24000 m19067 = m19067(); m19067 != null; m19067 = m19067.f77789) {
                    if (m19067.f77786.mo989() == EnumC18550.f57523) {
                        if (m19048(m19067.f77785, c7673.f23697) == null) {
                            break;
                        } else {
                            ((C18356) m19067).m42781(c7673.f23697, EnumC21179.CAPTURED_VAR);
                        }
                    }
                }
            } else if (c7673.f23697.f17561.f17559 == EnumC1296.f4582) {
                for (AbstractC24000 m190672 = m19067(); m190672 != null && !m190672.f77787.mo15572(); m190672 = m190672.f77789) {
                    if (m190672.f77786.m14709(EnumC18550.f57523)) {
                        AbstractC5144 m19048 = m19048(m190672.f77785, c7673.f23697);
                        if (m19048 == null) {
                            break;
                        }
                        if (C4618.f14693[m19048.mo989().ordinal()] == 4) {
                            ((C18356) m190672).m42781(((C5557) m19048).f17186, EnumC21179.CAPTURED_THIS);
                        } else {
                            C12171.m29640("bad block kind");
                            throw null;
                        }
                    }
                }
            }
        }
        super.mo1385(c7673);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        m19053(c14169, "lambda.stat");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C18356 m19053(C14169 c14169, String str) {
        C9184 c9184 = this.f21747;
        C2609 c2609 = this.f21744;
        try {
            C18356 c18356 = new C18356(this, c14169);
            this.f21744 = this.f21744.m8246(new C11674(c14169));
            Iterator it = c14169.f42775.iterator();
            while (it.hasNext()) {
                C9378 c9378 = (C9378) it.next();
                c18356.m42781(c9378.f28489, EnumC21179.PARAM);
                C11674 c11674 = (C11674) this.f21744.f8240;
                C12048 c12048 = c9378.f28489;
                if (c11674.f34783 == null) {
                    c11674.f34783 = C2609.m8239();
                }
                c11674.f34783 = c11674.f34783.m8246(c12048);
            }
            c9184.f27812.put(c14169, c18356);
            super.mo1217(c14169);
            c18356.m42783();
            if (c9184.f27810) {
                c9184.f27804.m7274(c14169, c9184.f27820.m16623(str, Boolean.valueOf(c18356.m52837()), c18356.f57038));
            }
            return c18356;
        } finally {
            this.f21744 = c2609;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C2609 c2609 = this.f21744;
        try {
            this.f21744 = c2609.m8246(new C11674(c8526));
            super.mo1388(c8526);
        } finally {
            this.f21744 = c2609;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        boolean z;
        AbstractC19810 abstractC19810 = c19110.f16086.f13890;
        Iterator it = this.f21744.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C11674 c11674 = (C11674) it.next();
            if (c11674.f34784.m14709(EnumC18550.f57582) && ((C5557) c11674.f34784).f17186 == abstractC19810) {
                z = true;
                break;
            }
        }
        boolean m16077 = abstractC19810.m16077();
        if ((z && m16077) || m19058(m19067(), c19110)) {
            AbstractC19810 abstractC198102 = c19110.f16086.mo4958().f13890;
            for (AbstractC24000 m19067 = m19067(); m19067 != null && !m19067.f77787.mo15572(); m19067 = m19067.f77789) {
                if (m19067.f77786.m14709(EnumC18550.f57523)) {
                    if (abstractC198102 != null && m19048(m19067.f77785, abstractC198102) == null) {
                        break;
                    } else {
                        ((C18356) m19067).m42781(abstractC198102, EnumC21179.CAPTURED_THIS);
                    }
                }
            }
        }
        super.mo1419(c19110);
        if (m19067() == null || z || !m16077) {
            return;
        }
        m19069(abstractC19810, (C18356) m19067());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19069(AbstractC5698 abstractC5698, C18356 c18356) {
        C5557 c5557 = (C5557) this.f21745.get(abstractC5698);
        if (c5557 == null || !c18356.f57040.add(abstractC5698)) {
            return;
        }
        C23294 c23294 = this.f21747.f27805;
        C11003.requireNonNull(c23294);
        new C6029(this, c23294, c18356).mo1215(c5557);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if ((((r11.f27943.mo16084() & 2) == 0 || r1.f27821.m17550(r1.f27821.m17519(r11.f27943.m16071().f17560), r1.f27821.m17519(r5.m16071().f17560))) ? false : true) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1391(l.C9232 r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7067.mo1391(l.ۢ֡۠):void");
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        if (m19067() != null) {
            AbstractC5698 abstractC5698 = c6262.f19396;
            if (abstractC5698.f17559 == EnumC1296.f4567) {
                AbstractC10370 abstractC10370 = abstractC5698.f17562;
                C9184 c9184 = this.f21747;
                if (abstractC10370 == c9184.f27819.f18886 || c6262.f19396.f17562 == c9184.f27819.f18898) {
                    for (AbstractC24000 m19067 = m19067(); m19067 != null && !m19067.f77787.mo15572(); m19067 = m19067.f77789) {
                        if (m19067.f77786.m14709(EnumC18550.f57523)) {
                            C5557 c5557 = (C5557) m19048(m19067.f77785, c6262.f19396);
                            if (c5557 == null) {
                                break;
                            } else {
                                ((C18356) m19067).m42781(c5557.f17186, EnumC21179.CAPTURED_THIS);
                            }
                        }
                    }
                }
            }
        }
        super.mo1381(c6262);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        AbstractC24000 m19067 = m19067();
        if (m19067 != null && (m19067 instanceof C18356)) {
            C18356 c18356 = (C18356) m19067;
            Iterator it = this.f21744.iterator();
            while (it.hasNext()) {
                C11674 c11674 = (C11674) it.next();
                if (!c11674.f34784.m14709(EnumC18550.f57578)) {
                    if (!c11674.f34784.m14709(EnumC18550.f57523)) {
                        break;
                    } else {
                        c18356.m42781(c9378.f28489, EnumC21179.LOCAL_VAR);
                    }
                }
            }
            c9378.f28489.getClass();
        }
        C2609 c2609 = this.f21744;
        try {
            C12048 c12048 = c9378.f28489;
            if (c12048.f17561.f17559 == EnumC1296.f4571) {
                C11674 c116742 = (C11674) c2609.f8240;
                if (c116742.f34783 == null) {
                    c116742.f34783 = C2609.m8239();
                }
                c116742.f34783 = c116742.f34783.m8246(c12048);
            }
            this.f21744 = this.f21744.m8246(new C11674(c9378));
            super.mo1392(c9378);
        } finally {
            this.f21744 = c2609;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 m19052(boolean z) {
        C2609 c2609 = this.f21744;
        while (c2609.m8249()) {
            switch (C4618.f14693[((C11674) c2609.f8240).f34784.mo989().ordinal()]) {
                case 4:
                    return ((C5557) ((C11674) c2609.f8240).f34784).f17186;
                case 5:
                    if (((C9378) ((C11674) c2609.f8240).f34784).f28489.m16077()) {
                        c2609 = c2609.f8241;
                        continue;
                    } else {
                        return m19051(((C5557) ((C11674) c2609.f8241.f8240).f34784).f17186, ((C9378) ((C11674) c2609.f8240).f34784).f28489.f17563 & 8);
                    }
                case 6:
                    return m19051(((C5557) ((C11674) c2609.f8241.f8240).f34784).f17186, ((C2735) ((C11674) c2609.f8240).f34784).f8522 & 8);
                case 7:
                    return ((C8526) ((C11674) c2609.f8240).f34784).f26045;
                case 8:
                    if (!z) {
                        return ((C18356) this.f21747.f27812.get(((C11674) c2609.f8240).f34784)).f57038;
                    }
                    break;
            }
            c2609 = c2609.f8241;
        }
        C12171.m29636();
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m19051(C14163 c14163, long j) {
        long j2 = j & 8;
        C9184 c9184 = this.f21747;
        if (j2 != 0) {
            C3581 m23953 = c9184.f27815.m23953(c14163);
            if (m23953 != null) {
                this.f21742.put(c14163, m23953);
                return m23953;
            }
            C3581 c3581 = (C3581) this.f21742.get(c14163);
            if (c3581 != null) {
                return c3581;
            }
            C3581 c35812 = new C3581(4106L, c9184.f27819.f18842, new C10658(C2609.m8239(), c9184.f27808.f66501, C2609.m8239(), c9184.f27808.f66481), c14163);
            this.f21742.put(c14163, c35812);
            return c35812;
        }
        Iterator it = c14163.f42762.m20476(c9184.f27819.f18879).iterator();
        if (it.hasNext()) {
            return (AbstractC5698) it.next();
        }
        C12171.m29640("init not found");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 m19061() {
        if (!this.f21744.isEmpty()) {
            for (C2609 c2609 = this.f21744; c2609.m8249(); c2609 = c2609.f8241) {
                int i = C4618.f14693[((C11674) c2609.f8240).f34784.mo989().ordinal()];
                if (i != 4 && i != 7) {
                    if (i == 8) {
                        return ((C11674) c2609.f8240).f34784;
                    }
                }
            }
            C12171.m29636();
            throw null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5144 m19048(int i, AbstractC5698 abstractC5698) {
        C2609 c2609;
        int m8245 = this.f21744.m8245() - 1;
        Iterator it = this.f21744.iterator();
        while (it.hasNext()) {
            C11674 c11674 = (C11674) it.next();
            int[] iArr = C4618.f14693;
            AbstractC5144 abstractC5144 = c11674.f34784;
            AbstractC5144 abstractC51442 = c11674.f34784;
            switch (iArr[abstractC5144.mo989().ordinal()]) {
                case 4:
                    C14163 c14163 = ((C5557) abstractC51442).f17186;
                    C9184 c9184 = this.f21747;
                    if (!c14163.mo16080(abstractC5698, c9184.f27821) && !abstractC5698.m16067((AbstractC19810) c14163, c9184.f27821)) {
                        break;
                    } else {
                        if (m8245 > i) {
                            return null;
                        }
                        return abstractC51442;
                    }
                case 5:
                    if ((((C9378) abstractC51442).f28489 == abstractC5698 && abstractC5698.f17561.f17559 == EnumC1296.f4571) || ((c2609 = c11674.f34783) != null && c2609.contains(abstractC5698))) {
                        if (m8245 > i) {
                            return null;
                        }
                        return abstractC51442;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    C2609 c26092 = c11674.f34783;
                    if (c26092 != null && c26092.contains(abstractC5698)) {
                        if (m8245 > i) {
                            return null;
                        }
                        return abstractC51442;
                    }
                    break;
                default:
                    C12171.m29640("bad decl kind " + abstractC51442.mo989());
                    throw null;
            }
            m8245--;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC24000 m19067() {
        Iterator it = this.f21744.iterator();
        while (it.hasNext()) {
            AbstractC24000 abstractC24000 = (AbstractC24000) this.f21747.f27812.get(((C11674) it.next()).f34784);
            if (abstractC24000 != null) {
                return abstractC24000;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m19055(AbstractC5698 abstractC5698) {
        EnumC1296 enumC1296 = abstractC5698.f17559;
        return ((enumC1296 != EnumC1296.f4567 && enumC1296 != EnumC1296.f4571) || abstractC5698.mo15572() || abstractC5698.f17562 == this.f21747.f27819.f18879) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m19058(AbstractC24000 abstractC24000, C19110 c19110) {
        if (abstractC24000 == null || c19110.f60199 != null || c19110.f60195 != null || c19110.f16086.mo4958().m12913(EnumC9454.NONE)) {
            return false;
        }
        AbstractC4308 mo4958 = c19110.f16086.mo4958();
        for (AbstractC4308 abstractC4308 = abstractC24000.f77787.m16071().f17560; !abstractC4308.m12913(EnumC9454.NONE); abstractC4308 = abstractC4308.mo4958()) {
            if (abstractC4308.f13890.mo16080((AbstractC5698) mo4958.f13890, this.f21747.f27821)) {
                return true;
            }
        }
        return false;
    }

    public C7067(C9184 c9184) {
        this.f21747 = c9184;
    }
}
