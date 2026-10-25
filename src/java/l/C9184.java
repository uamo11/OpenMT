package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: Y7SB */
/* renamed from: l.ۡ᩺֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9184 extends C23363 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C4314 f27801 = new C4314();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f27802;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C22406 f27803;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C22364 f27804;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23294 f27805;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C10139 f27806;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f27807;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C20661 f27808;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f27809;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f27810;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7067 f27811;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f27812;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C11160 f27813;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C12379 f27814;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9310 f27815;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC24000 f27816;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C1755 f27817;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17013 f27818;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C6136 f27819;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5931 f27820;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6319 f27821;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f27822;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f27823;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9184 m23590(C2903 c2903) {
        C9184 c9184 = (C9184) c2903.m8838(f27801);
        return c9184 == null ? new C9184(c2903) : c9184;
    }

    @Override // l.C23363
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 mo23617(AbstractC5144 abstractC5144) {
        AbstractC24000 abstractC24000 = (AbstractC24000) this.f27812.get(abstractC5144);
        if (abstractC24000 == null) {
            abstractC24000 = this.f27816;
        }
        AbstractC24000 abstractC240002 = this.f27816;
        try {
            this.f27816 = abstractC24000;
            return super.mo23617(abstractC5144);
        } finally {
            this.f27816 = abstractC240002;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m23615(C2609 c2609, AbstractC24000 abstractC24000) {
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
            AbstractC24000 abstractC240002 = this.f27816;
            try {
                this.f27816 = abstractC24000;
                AbstractC5144 mo23617 = super.mo23617(abstractC5144);
                this.f27816 = abstractC240002;
                c18837.m43511(mo23617);
            } catch (Throwable th) {
                this.f27816 = abstractC240002;
                throw th;
            }
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 m23616(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        this.f27818 = c17013;
        this.f27817 = c1755;
        this.f27816 = null;
        this.f27812 = new HashMap();
        return mo23617(abstractC5144);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        HashMap hashMap;
        C18837 c18837;
        if (c5557.f17186.f17561.f17559 == EnumC1296.f4579) {
            c5557 = C7067.m19050(this.f27811, c5557);
        }
        C12379 c12379 = this.f27814;
        try {
            this.f27814 = new C12379(this, c5557);
            super.mo1215(c5557);
            hashMap = this.f27814.f37111;
            if (!hashMap.isEmpty()) {
                C17013 c17013 = this.f27818;
                int i = c17013.f52172;
                try {
                    c17013.m39946((InterfaceC3109) c5557);
                    C12379.m30090(this.f27814, m23612());
                    this.f27818.f52172 = i;
                } catch (Throwable th) {
                    this.f27818.f52172 = i;
                    throw th;
                }
            }
            c18837 = this.f27814.f37109;
            C2609 m43517 = c18837.m43517();
            C2609 c2609 = c5557.f17179;
            c2609.getClass();
            c5557.f17179 = m43517.m8248(c2609);
            Iterator it = m43517.iterator();
            while (it.hasNext()) {
                AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
                C14163 c14163 = c5557.f17186;
                c14163.mo16101();
                c14163.f42762.mo26382(((C8526) abstractC5144).f26045);
            }
            this.f75051 = c5557;
        } finally {
            this.f27814 = c12379;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0271 A[LOOP:1: B:49:0x026b->B:51:0x0271, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0207  */
    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1217(l.C14169 r22) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9184.mo1217(l.ܳ֡۠):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23597(C14169 c14169, Supplier supplier, Consumer consumer, Consumer consumer2) {
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        Iterator it = ((C2609) supplier.get()).iterator();
        while (it.hasNext()) {
            C6507 c6507 = (C6507) it.next();
            if (c6507.f50415.f30049 == c14169) {
                c188372.m43511(c6507);
            } else {
                c18837.m43511(c6507);
            }
        }
        if (c188372.m43518()) {
            consumer.n(c18837.m43517());
            consumer2.n(c188372.m43517());
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        AbstractC12612 m39914;
        C17650 c17650 = (C17650) this.f27816;
        C3581 c3581 = (C3581) c9232.f27943;
        switch (C4618.f14692[c9232.f27942.ordinal()]) {
            case 1:
            case 2:
                m39914 = this.f27818.m39914((AbstractC5698) new C12048(8589938704L, this.f27819.f18886, c17650.f77787.m16071().f17560, c17650.f77787.m16071()));
                break;
            case 3:
                m39914 = this.f27815.m23939(this.f27813.m27677(this.f27821.m17519(c9232.f27943.f17561.f17560), this.f27817, c9232.f27945));
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                m39914 = null;
                break;
            default:
                throw new InternalError("Should not have an invalid kind");
        }
        this.f75051 = m23594(c17650, c3581.mo10967(), m39914 == null ? C2609.m8239() : m23615(C2609.of((Object) m39914), c17650.f77789));
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        boolean m19055;
        if (this.f27816 != null) {
            m19055 = this.f27811.m19055(c7673.f23697);
            if (m19055) {
                C17013 c17013 = this.f27818;
                int i = c17013.f52172;
                try {
                    c17013.m39946((InterfaceC3109) c7673);
                    AbstractC12612 m42780 = ((C18356) this.f27816).m42780(c7673);
                    if (m42780 != null) {
                        this.f75051 = m42780;
                    } else {
                        super.mo1385(c7673);
                    }
                    return;
                } finally {
                    this.f27818.f52172 = i;
                }
            }
        }
        super.mo1385(c7673);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        if (this.f27816 != null) {
            C9184 c9184 = this.f27811.f21747;
            AbstractC24000 abstractC24000 = c9184.f27816;
            if (abstractC24000 instanceof C18356) {
                C18356 c18356 = (C18356) abstractC24000;
                if (!c6262.f19396.mo15572() && c6262.f19395 == c9184.f27819.f18886 && c6262.f19396.f17561.f17559 == EnumC1296.f4582 && !((Map) c18356.f57039.get(EnumC21179.CAPTURED_OUTER_THIS)).isEmpty()) {
                    C17013 c17013 = this.f27818;
                    int i = c17013.f52172;
                    try {
                        c17013.m39946((InterfaceC3109) c6262);
                        C7673 m42779 = ((C18356) this.f27816).m42779(c6262);
                        if (m42779 != null) {
                            this.f75051 = m42779;
                        } else {
                            super.mo1381(c6262);
                        }
                        return;
                    } finally {
                        this.f27818.f52172 = i;
                    }
                }
            }
        }
        super.mo1381(c6262);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        boolean m19058;
        AbstractC24000 abstractC24000 = this.f27816;
        if (abstractC24000 != null) {
            m19058 = this.f27811.m19058(abstractC24000, c19110);
            if (m19058) {
                C17013 c17013 = this.f27818;
                int i = c17013.f52172;
                try {
                    c17013.m39946((InterfaceC3109) c19110);
                    ((C18356) this.f27816).m42782(c19110);
                    super.mo1419(c19110);
                    return;
                } finally {
                    this.f27818.f52172 = i;
                }
            }
        }
        super.mo1419(c19110);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        AbstractC24000 abstractC24000 = this.f27816;
        C18356 c18356 = (C18356) abstractC24000;
        if (abstractC24000 != null) {
            EnumC21179 enumC21179 = EnumC21179.LOCAL_VAR;
            if (c18356.m42778(enumC21179).containsKey(c9378.f28489)) {
                c9378.f28487 = (AbstractC12612) mo23617(c9378.f28487);
                c9378.f28489 = (C12048) c18356.m42778(enumC21179).get(c9378.f28489);
                this.f75051 = c9378;
                return;
            }
        }
        super.mo1392(c9378);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C8526 m23612() {
        HashMap hashMap;
        C3581 c3581;
        C3581 c35812;
        C12048 c12048;
        C3581 c35813;
        C3581 c35814;
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        hashMap = this.f27814.f37111;
        for (Map.Entry entry : hashMap.entrySet()) {
            C4146 m39906 = this.f27818.m39906((AbstractC10370) null);
            c188372.m43511(m39906);
            C18837 c188373 = (C18837) entry.getValue();
            c188373.m43511(m39906);
            C2609 m43517 = c188373.m43517();
            C17013 c17013 = this.f27818;
            c18837.m43511(c17013.m39938(C18963.f59812, C2609.of((Object) c17013.m39943(entry.getKey())), m43517, (AbstractC5144) null));
        }
        C17013 c170132 = this.f27818;
        C20661 c20661 = this.f27808;
        C22637 m39972 = c170132.m39972(m23592("getImplMethodName", c20661.f66533, C2609.m8239(), C2609.m8239()), c18837.m43517());
        Iterator it = c188372.iterator();
        while (it.hasNext()) {
            ((C4146) it.next()).f13546 = m39972;
        }
        C17013 c170133 = this.f27818;
        AbstractC4308 abstractC4308 = c20661.f66488;
        C2609 of = C2609.of((Object) c170133.m39943("Invalid lambda deserialization"));
        AbstractC5698 m50312 = this.f27803.m50312((InterfaceC3109) null, this.f27817, abstractC4308, C7260.m19434(of), C2609.m8239());
        C17013 c170134 = this.f27818;
        C19110 m39939 = c170134.m39939((AbstractC12612) null, (C2609) null, c170134.m39954(abstractC4308.f13890), of, (C5557) null, false);
        m39939.f60194 = m50312;
        m39939.f16086 = abstractC4308;
        C2735 m39902 = c170133.m39902(0L, C2609.of((Object) m39972, (Object) c170133.m39971(m39939)));
        C17013 c170135 = this.f27818;
        c3581 = this.f27814.f37114;
        C2176 m39899 = c170135.m39899(c3581.f17563);
        AbstractC10370 abstractC10370 = this.f27819.f18820;
        C17013 c170136 = this.f27818;
        c35812 = this.f27814.f37114;
        AbstractC12612 m39954 = c170136.m39954(c35812.f17560.mo12923().f13890);
        C2609 m8239 = C2609.m8239();
        C17013 c170137 = this.f27818;
        c12048 = this.f27814.f37113;
        C8526 m39917 = c170135.m39917(m39899, abstractC10370, m39954, m8239, null, C2609.of((Object) c170137.m39923(c12048, (AbstractC12612) null)), C2609.m8239(), m39902, null);
        c35813 = this.f27814.f37114;
        m39917.f26045 = c35813;
        c35814 = this.f27814.f37114;
        m39917.f16086 = c35814.f17560;
        return m39917;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23598(C15574 c15574, AbstractC4308 abstractC4308, C3581 c3581, InterfaceC3109 interfaceC3109, C2609 c2609, C10658 c10658) {
        HashMap hashMap;
        HashMap hashMap2;
        String m23586 = m23586(abstractC4308);
        String abstractC10370 = c3581.f17562.toString();
        AbstractC4308 abstractC43082 = c3581.f17560;
        C6319 c6319 = this.f27821;
        int i = 0;
        String m23587 = m23587(c6319.m17519(abstractC43082), false);
        String m235862 = m23586(c6319.m17519(c15574.f17561.f17560));
        String abstractC103702 = c15574.f17562.toString();
        String m235872 = m23587(c6319.m17519(c15574.f17560), false);
        C20661 c20661 = this.f27808;
        C7254 c7254 = c20661.f66452;
        C15580 m23592 = m23592("getImplMethodKind", c7254, C2609.m8239(), C2609.m8239());
        C23342 m39943 = this.f27818.m39943(Integer.valueOf(c15574.m36708()));
        C17013 c17013 = this.f27818;
        EnumC18550 enumC18550 = EnumC18550.f57559;
        C9085 m39919 = c17013.m39919(enumC18550, (AbstractC12612) m23592, (AbstractC12612) m39943);
        m39919.f2830 = this.f27806.m25477(m39919, enumC18550, c7254, c7254);
        m39919.f16086 = c20661.f66469;
        C18837 c18837 = new C18837();
        Iterator it = c10658.f32059.iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC43083 = (AbstractC4308) it.next();
            C18837 c188372 = new C18837();
            String str = abstractC103702;
            c188372.m43511(this.f27818.m39943(Integer.valueOf(i)));
            C2609 m43517 = c188372.m43517();
            C18837 c188373 = new C18837();
            c188373.m43511(c20661.f66452);
            c18837.m43511(this.f27818.m39935(c6319.m17519(abstractC43083), m23592("getCapturedArg", c20661.f66526, c188373.m43517(), m43517)));
            i++;
            it = it;
            abstractC103702 = str;
            c6319 = c6319;
        }
        String str2 = abstractC103702;
        C1470 m39898 = this.f27818.m39898(m23589(m23589(m23589(m23589(m23589(m39919, "getFunctionalInterfaceClass", m23586), "getFunctionalInterfaceMethodName", abstractC10370), "getFunctionalInterfaceMethodSignature", m23587), "getImplClass", m235862), "getImplMethodSignature", m235872), this.f27818.m39964(m23593(interfaceC3109, c20661.f66497, this.f27819.f18797, c2609, c10658, c18837.m43517(), c3581.f17562)), (AbstractC11349) null);
        hashMap = this.f27814.f37111;
        C18837 c188374 = (C18837) hashMap.get(str2);
        if (c188374 == null) {
            c188374 = new C18837();
            hashMap2 = this.f27814.f37111;
            hashMap2.put(str2, c188374);
        }
        c188374.m43511(m39898);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9085 m23589(C9085 c9085, String str, String str2) {
        C20661 c20661 = this.f27808;
        C2609 of = C2609.of((Object) c20661.f66526);
        C7254 c7254 = c20661.f66469;
        C10658 c10658 = new C10658(of, c7254, C2609.m8239(), c20661.f66481);
        C1755 c1755 = this.f27817;
        AbstractC4308 abstractC4308 = c20661.f66526;
        AbstractC10370 abstractC10370 = this.f27819.f18871;
        C2609 of2 = C2609.of((Object) abstractC4308);
        C2609 m8239 = C2609.m8239();
        C22406 c22406 = this.f27803;
        c22406.getClass();
        AbstractC5698 m50313 = c22406.m50313((InterfaceC3109) null, c1755, abstractC4308.f13890, abstractC4308, abstractC10370, of2, m8239);
        C17013 c17013 = this.f27818;
        C2609 m82392 = C2609.m8239();
        C6262 m39911 = this.f27818.m39911(m23592(str, c20661.f66533, C2609.m8239(), C2609.m8239()), m50313);
        m39911.f16086 = c10658;
        C15580 m39929 = c17013.m39929(m39911, m82392, C2609.of((Object) this.f27818.m39943(str2)));
        m39929.f16086 = c7254;
        C17013 c170132 = this.f27818;
        EnumC18550 enumC18550 = EnumC18550.f57565;
        C9085 m39919 = c170132.m39919(enumC18550, (AbstractC12612) c9085, (AbstractC12612) m39929);
        m39919.f2830 = this.f27806.m25477(m39919, enumC18550, c7254, c7254);
        m39919.f16086 = c7254;
        return m39919;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15580 m23592(String str, AbstractC4308 abstractC4308, C2609 c2609, C2609 c26092) {
        C12048 c12048;
        C2609 m8239 = C2609.m8239();
        C20661 c20661 = this.f27808;
        C10658 c10658 = new C10658(c2609, abstractC4308, m8239, c20661.f66481);
        C1755 c1755 = this.f27817;
        AbstractC4308 abstractC43082 = c20661.f66507;
        AbstractC12486 abstractC12486 = this.f27819.f18880;
        abstractC12486.getClass();
        char[] charArray = str.toCharArray();
        AbstractC10370 mo15927 = abstractC12486.mo15927(charArray, charArray.length);
        C2609 m82392 = C2609.m8239();
        C22406 c22406 = this.f27803;
        c22406.getClass();
        AbstractC5698 m50313 = c22406.m50313((InterfaceC3109) null, c1755, abstractC43082.f13890, abstractC43082, mo15927, c2609, m82392);
        C17013 c17013 = this.f27818;
        C2609 m82393 = C2609.m8239();
        C17013 c170132 = this.f27818;
        c12048 = this.f27814.f37113;
        C7673 m39914 = c170132.m39914((AbstractC5698) c12048);
        m39914.f16086 = abstractC43082;
        C6262 m39911 = c170132.m39911(m39914, m50313);
        m39911.f16086 = c10658;
        C15580 m39929 = c17013.m39929(m39911, m82393, c26092);
        m39929.f16086 = abstractC4308;
        return m39929;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23606(AbstractC4308 abstractC4308, AbstractC12612 abstractC12612) {
        if (abstractC4308 != null) {
            int i = C4618.f14693[abstractC12612.mo989().ordinal()];
            if (i == 1) {
                ((C15580) abstractC12612).f48009 = abstractC4308;
            } else if (i == 2) {
                ((C19110) abstractC12612).f60193 = abstractC4308;
            } else {
                if (i == 3) {
                    m23606(abstractC4308, ((C17844) abstractC12612).f54512);
                    return;
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23596(C9184 c9184, AbstractC5698 abstractC5698, C2609 c2609, AbstractC4308 abstractC4308) {
        C12171.m29642(abstractC5698.f17559 == EnumC1296.f4571);
        C2609 mo12933 = c9184.f27821.m17519(abstractC5698.f17560).mo12933();
        if (abstractC4308 != null) {
            C12171.m29642((abstractC5698.mo16084() & 17179869184L) != 0);
        }
        c9184.f27813.m27680(c2609, mo12933, abstractC4308, c9184.f27817);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15580 m23594(AbstractC24000 abstractC24000, C15574 c15574, C2609 c2609) {
        C2609 c26092;
        C5557 c5557;
        AbstractC23195 abstractC23195 = abstractC24000.f77786;
        C2609 c26093 = abstractC24000.f77784;
        AbstractC19810 abstractC19810 = abstractC23195.f74560.f13890;
        C6319 c6319 = this.f27821;
        C3581 c3581 = (C3581) c6319.m17493(abstractC19810);
        AbstractC4308 m17519 = c6319.m17519(c3581.f17560);
        C2609 mo12933 = m17519.mo12933();
        AbstractC4308 mo12923 = m17519.mo12923();
        C2609 mo12930 = m17519.mo12930();
        C20661 c20661 = this.f27808;
        C10658 c10658 = new C10658(mo12933, mo12923, mo12930, c20661.f66481);
        c15574.getClass();
        AbstractC4308 m175192 = c6319.m17519(abstractC23195.m51449(c6319));
        C2609 of = C2609.of((Object) c10658, (Object) c15574, (Object) new C10658(m175192.mo12933(), m175192.mo12923(), m175192.mo12930(), c20661.f66481));
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            c18837.m43511(((AbstractC12612) it.next()).f16086);
        }
        C10658 c106582 = new C10658(c18837.m43517(), abstractC23195.f16086, C2609.m8239(), c20661.f66481);
        boolean m52837 = abstractC24000.m52837();
        C6136 c6136 = this.f27819;
        AbstractC10370 abstractC10370 = m52837 ? c6136.f18797 : c6136.f18836;
        if (abstractC24000.m52837()) {
            C18837 c188372 = new C18837();
            AbstractC4308 abstractC4308 = abstractC23195.f74560;
            abstractC4308.getClass();
            Iterator it2 = (abstractC4308 instanceof C5843 ? c6319.m17565(abstractC23195.f74560) : C2609.m8239()).iterator();
            while (it2.hasNext()) {
                AbstractC4308 m175193 = c6319.m17519((AbstractC4308) it2.next());
                AbstractC19810 abstractC198102 = m175193.f13890;
                if (abstractC198102 != c20661.f66487.f13890 && abstractC198102 != abstractC23195.f16086.f13890 && abstractC198102 != c20661.f66526.f13890) {
                    c188372.m43511(m175193);
                }
            }
            boolean m52836 = abstractC24000.m52836();
            boolean m43518 = c188372.m43518();
            boolean m8249 = c26093.m8249();
            int i = m52836;
            if (m43518) {
                i = (m52836 ? 1 : 0) | 2;
            }
            if (m8249) {
                i = (i == true ? 1 : 0) | 4;
            }
            C2609 m8242 = of.m8242(C5268.m15193(i));
            if (m43518) {
                C2609 m82422 = m8242.m8242(C5268.m15193(c188372.m43514()));
                C2609 m43517 = c188372.m43517();
                if (m43517 == null) {
                    m43517 = null;
                } else {
                    Iterator it3 = m43517.iterator();
                    while (it3.hasNext()) {
                        InterfaceC8090.class.cast(it3.next());
                    }
                }
                m82422.getClass();
                m8242 = m43517.m8248(m82422);
            }
            if (m8249) {
                m8242 = m8242.m8242(C5268.m15193(c26093.m8245() - 1));
                Iterator it4 = c26093.iterator();
                while (it4.hasNext()) {
                    AbstractC5698 abstractC5698 = (AbstractC5698) it4.next();
                    if (!c6319.m17550(abstractC5698.mo16091(c6319), c3581.mo16091(c6319))) {
                        m8242 = m8242.m8242((C10658) abstractC5698.mo16091(c6319));
                    }
                }
            }
            C2609 c26094 = m8242;
            if (abstractC24000.m52836()) {
                C17013 c17013 = this.f27818;
                int i2 = c17013.f52172;
                try {
                    c5557 = this.f27814.f37110;
                    c17013.m39946((InterfaceC3109) c5557);
                    m23598(c15574, abstractC23195.f16086, c3581, abstractC23195, c26094, c106582);
                } finally {
                    this.f27818.f52172 = i2;
                }
            }
            c26092 = c26094;
        } else {
            c26092 = of;
        }
        return m23593(abstractC23195, c20661.f66497, abstractC10370, c26092, c106582, c2609, c3581.f17562);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15580 m23593(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C10658 c10658, C2609 c26092, AbstractC10370 abstractC103702) {
        HashMap hashMap;
        C6319 c6319 = this.f27821;
        C20661 c20661 = this.f27808;
        C17013 c17013 = this.f27818;
        int i = c17013.f52172;
        try {
            c17013.m39946(interfaceC3109);
            C2609 of = C2609.of((Object) c20661.f66478, (Object) c20661.f66533, (Object) c20661.f66455);
            C11003.requireNonNull(c6319);
            C9226 c9226 = new C9226(abstractC103702, c20661.f66475, this.f27803.m50300(interfaceC3109, this.f27817, abstractC4308, abstractC10370, c2609.m8243((Function) new C10511(1, c6319)).m8248(of), C2609.m8239()).mo10967(), c10658, (InterfaceC8090[]) c2609.toArray(new InterfaceC8090[c2609.m8245()]));
            C17013 c170132 = this.f27818;
            C6262 m39912 = c170132.m39912(c170132.m39954(abstractC4308.f13890), abstractC10370);
            hashMap = this.f27814.f37115;
            C9226 c92262 = (C9226) C13843.putIfAbsent(hashMap, C3857.m11618(c9226, c6319), c9226);
            if (c92262 != null) {
                c9226 = c92262;
            }
            m39912.f19396 = c9226;
            m39912.f16086 = c10658.f32060;
            C15580 m39929 = this.f27818.m39929(m39912, C2609.m8239(), c26092);
            m39929.f16086 = c10658.f32060;
            return m39929;
        } finally {
            this.f27818.f52172 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m23587(AbstractC4308 abstractC4308, boolean z) {
        try {
            C10263 c10263 = new C10263(this, z);
            c10263.mo8627(abstractC4308);
            return c10263.f30906.toString();
        } catch (C16196 e) {
            C14163 c14163 = this.f27817.f6079.f17186;
            AbstractC4308 m38127 = e.m38127();
            C11576 c11576 = C11886.f35440;
            this.f27804.m7276(C6241.m17184(c14163, new C11576("compiler", "illegal.signature", c14163, m38127)));
            return "<ERRONEOUS>";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m23586(AbstractC4308 abstractC4308) {
        try {
            C10263 c10263 = new C10263(this, false);
            c10263.m8623(abstractC4308);
            return c10263.f30906.toString();
        } catch (C16196 e) {
            C14163 c14163 = this.f27817.f6079.f17186;
            AbstractC4308 m38127 = e.m38127();
            C11576 c11576 = C11886.f35440;
            this.f27804.m7276(C6241.m17184(c14163, new C11576("compiler", "illegal.signature", c14163, m38127)));
            return "<ERRONEOUS>";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23599(C9184 c9184, AbstractC5698 abstractC5698, AbstractC5698 abstractC56982) {
        return ((abstractC5698.mo16084() & 4) == 0 || abstractC5698.m16089() == abstractC56982.m16089()) ? false : true;
    }

    public C9184(C2903 c2903) {
        boolean m28829;
        c2903.m8841(f27801, this);
        this.f27820 = C5931.m16615(c2903);
        this.f27804 = C22364.m50099(c2903);
        this.f27805 = C23294.m51630(c2903);
        this.f27819 = C6136.m17057(c2903);
        this.f27808 = C20661.m47250(c2903);
        this.f27803 = C22406.m50289(c2903);
        this.f27806 = C10139.m25473(c2903);
        this.f27818 = C17013.m39896(c2903);
        this.f27821 = C6319.m17456(c2903);
        this.f27813 = C11160.m27673(c2903);
        this.f27811 = new C7067(this);
        C11781 m28823 = C11781.m28823(c2903);
        this.f27810 = m28823.m28831("debug.dumpLambdaToMethodStats");
        this.f27815 = C9310.m23901(c2903);
        this.f27809 = m28823.m28831("forceSerializable");
        EnumC0121 enumC0121 = EnumC0121.f1202;
        boolean z = m28823.m28836(enumC0121) || m28823.m28829(enumC0121, "lines");
        if (m28823.m28836(enumC0121)) {
            m28829 = m28823.m28832(EnumC0121.f1178);
        } else {
            m28829 = m28823.m28829(enumC0121, "vars");
        }
        this.f27823 = z || m28829;
        this.f27822 = m28823.m28831("debug.dumpLambdaToMethodDeduplication");
        String m28824 = m28823.m28824("deduplicateLambdas");
        this.f27807 = m28824 != null ? Boolean.parseBoolean(m28824) : true;
        this.f27802 = EnumC10892.m27201(c2903).m27202();
    }
}
