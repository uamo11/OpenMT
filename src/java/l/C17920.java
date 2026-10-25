package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: K7QZ */
/* renamed from: l.ᩳ۠֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17920 extends C14190 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17214 f54733;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f54734;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 f54731 = C2609.m8239();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54732 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14169 f54730 = null;

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        this.f54731 = this.f54731.m8246(c18257);
        m41915(c18257, c18257, c18257.f56778);
        m41917();
        super.mo1416(c18257);
    }

    @Override // l.C14190
    /* renamed from: ۧ */
    public final void mo10758(AbstractC5144 abstractC5144) {
        this.f54731 = this.f54731.m8246(abstractC5144);
        try {
            super.mo10758(abstractC5144);
        } finally {
            m41917();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41917() {
        C2609 c2609 = this.f54731;
        this.f54731 = c2609.f8241;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        m41915(c14315, (AbstractC5144) this.f54731.f8241.f8240, c14315.f43168);
        super.mo1403(c14315);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41914(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C9953 c9953) {
        C17214 c17214;
        C2609 mo16068 = abstractC5698.mo16068();
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        C18837 c188373 = new C18837();
        Iterator it = mo16068.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c17214 = this.f54733;
            if (!hasNext) {
                break;
            }
            C16384 c16384 = (C16384) it.next();
            EnumC1692 m40508 = c17214.m40508(c16384, abstractC5698);
            C2609 c2609 = c16384.f50417;
            AbstractC4308 abstractC43082 = c16384.f26338;
            int ordinal = m40508.ordinal();
            if (ordinal == 0) {
                c18837.m43511(c16384);
            } else if (ordinal == 1) {
                C6507 c6507 = new C6507(abstractC43082, c2609, c9953);
                c188372.m43511(c6507);
                c188373.m43511(c6507);
            } else if (ordinal == 3) {
                c18837.m43511(c16384);
                c188372.m43511(new C6507(abstractC43082, c2609, c9953));
            }
        }
        if (c188372.isEmpty()) {
            return;
        }
        abstractC5698.m16104();
        abstractC5698.m16086(c18837.m43517());
        C2609 m43517 = c188372.m43517();
        if (abstractC4308 == null) {
            m41910(abstractC5144, abstractC5698.mo7176().f17560, m43517, m43517, c9953);
            abstractC5698.m16097(m43517);
            return;
        }
        AbstractC4308 m41910 = m41910(abstractC5144, abstractC4308, m43517, c188373.m43517(), c9953);
        if (abstractC5698.mo952() == EnumC23258.METHOD) {
            abstractC5698.f17560.mo12945().f32060 = m41910;
        } else if (abstractC5698.mo952() == EnumC23258.PARAMETER && this.f54730 == null) {
            abstractC5698.f17560 = m41910;
            if (abstractC5698.mo16076().equals(c17214.f52817.f18886)) {
                abstractC5698.f17561.f17560.mo12945().f32058 = m41910;
            } else {
                C10658 mo12945 = abstractC5698.f17561.f17560.mo12945();
                C2609 c26092 = mo12945.f32059;
                C18837 c188374 = new C18837();
                for (C2609 c26093 = ((C3581) abstractC5698.f17561).f11367; c26093.m8249(); c26093 = c26093.f8241) {
                    if (c26093.f8240 == abstractC5698) {
                        c188374.m43511(m41910);
                    } else {
                        c188374.m43511((AbstractC4308) c26092.f8240);
                    }
                    c26092 = c26092.f8241;
                }
                mo12945.f32059 = c188374.m43517();
            }
        } else {
            abstractC5698.f17560 = m41910;
        }
        abstractC5698.m16097(m43517);
        if (abstractC5698.mo952() == EnumC23258.PARAMETER || abstractC5698.mo952() == EnumC23258.LOCAL_VARIABLE || abstractC5698.mo952() == EnumC23258.RESOURCE_VARIABLE || abstractC5698.mo952() == EnumC23258.EXCEPTION_PARAMETER || abstractC5698.mo952() == EnumC23258.BINDING_VARIABLE) {
            m41916(abstractC5698, m43517);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41916(AbstractC5698 abstractC5698, C2609 c2609) {
        long mo16084 = abstractC5698.f17561.mo16084();
        if ((1048576 & mo16084) != 0) {
            C14163 c14163 = (C14163) abstractC5698.f17561.f17561;
            if ((mo16084 & 8) != 0) {
                c14163.m16079(c2609);
                return;
            } else {
                c14163.m16092(c2609);
                return;
            }
        }
        abstractC5698.f17561.m16097(c2609);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0137, code lost:
    
        if (r2.m12913(l.EnumC9454.NONE) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        r12 = r13.m8245();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013d, code lost:
    
        if (r12 == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        if (r12 == 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        r10.getClass();
        r12 = l.C6241.f19132;
        r0.m7273(r10, new l.C12281("compiler", "cant.type.annotate.scoping", r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0156, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0157, code lost:
    
        r10.getClass();
        r12 = (l.C16384) r13.f8240;
        r13 = l.C6241.f19132;
        r0.m7273(r10, new l.C12281("compiler", "cant.type.annotate.scoping.1", r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        return r11;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.AbstractC4308 m41910(l.AbstractC5144 r10, l.AbstractC4308 r11, l.C2609 r12, l.C2609 r13, l.C9953 r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17920.m41910(l.ۚۚ۠, l.ۙ֨֨, l.ۖܶ۠, l.ۖܶ۠, l.ۤ֨֨):l.ۙ֨֨");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9953 m41911(AbstractC5144 abstractC5144, AbstractC5144 abstractC51442, C2609 c2609, C14169 c14169, int i, C18837 c18837) {
        AbstractC4308 abstractC4308;
        int indexOf;
        int indexOf2;
        EnumC18550 enumC18550;
        int indexOf3;
        C2609 c26092 = c2609;
        switch (C7130.f21881[abstractC51442.mo987().ordinal()]) {
            case 1:
                return C9953.m25098(c18837.m43517(), c14169, i, abstractC51442.f16085);
            case 2:
                return C9953.m25095(c18837.m43517(), c14169, abstractC51442.f16085);
            case 3:
                C19110 c19110 = (C19110) abstractC51442;
                C2609 c26093 = c19110.f60198;
                C5557 c5557 = c19110.f60195;
                if (c5557 != null) {
                    if (c5557.f17183.contains(abstractC5144)) {
                        return C9953.m25080(c18837.m43517(), c14169, c5557.f17183.indexOf(abstractC5144), abstractC51442.f16085);
                    }
                    return C9953.m25080(c18837.m43517(), c14169, 65535, abstractC51442.f16085);
                }
                if (c26093.contains(abstractC5144)) {
                    return C9953.m25087(c18837.m43517(), c14169, c26093.indexOf(abstractC5144), abstractC51442.f16085);
                }
                return C9953.m25097(c18837.m43517(), c14169, abstractC51442.f16085);
            case 4:
                return C9953.m25097(c18837.m43517(), c14169, abstractC51442.f16085);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                C5557 c55572 = (C5557) abstractC51442;
                if (c55572.f17184 != abstractC5144) {
                    if (c55572.f17183.contains(abstractC5144)) {
                        return C9953.m25080(c18837.m43517(), c14169, c55572.f17183.indexOf(abstractC5144), abstractC51442.f16085);
                    }
                    if (c55572.f17185.contains(abstractC5144)) {
                        return C9953.m25085(c18837.m43517(), c14169, c55572.f17185.indexOf(abstractC5144), abstractC51442.f16085);
                    }
                    throw new AssertionError("Could not determine position of tree " + abstractC5144 + " within frame " + abstractC51442);
                }
                return C9953.m25080(c18837.m43517(), c14169, 65535, abstractC51442.f16085);
            case 10:
                C8526 c8526 = (C8526) abstractC51442;
                if (c8526.f26042.contains(abstractC5144)) {
                    return C9953.m25100(c18837.m43517(), c14169, c8526.f26042.indexOf(abstractC5144), abstractC51442.f16085);
                }
                if (c8526.f26051 == abstractC5144) {
                    return C9953.m25082(c18837.m43517(), c14169, abstractC51442.f16085);
                }
                if (c8526.f26047.contains(abstractC5144)) {
                    return C9953.m25083(c18837.m43517(), c14169, c8526.f26047.indexOf(abstractC5144), abstractC51442.f16085);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC5144 + " within frame " + abstractC51442);
            case 11:
                C2609 c26094 = c26092.f8241;
                C16432 c16432 = (C16432) abstractC51442;
                if (c16432.f50542 != abstractC5144) {
                    if (c16432.f50541.contains(abstractC5144)) {
                        c18837.m43515(new C12774(EnumC12069.TYPE_ARGUMENT, c16432.f50541.indexOf(abstractC5144)));
                        C2609 c26095 = c26094.f8241;
                        if (c26095 != null && ((AbstractC5144) c26095.f8240).m14709(EnumC18550.f57548)) {
                            abstractC4308 = ((AbstractC5144) c26094.f8241.f8240).f16086;
                        } else {
                            abstractC4308 = c16432.f16086;
                        }
                        m41912(abstractC4308, c18837);
                    } else {
                        throw new AssertionError("Could not determine type argument position of tree " + abstractC5144 + " within frame " + abstractC51442);
                    }
                }
                return m41911((AbstractC5144) c26094.f8240, (AbstractC5144) c26094.f8241.f8240, c26094, c14169, i, c18837);
            case 12:
                C9232 c9232 = (C9232) abstractC51442;
                C2609 c26096 = c9232.f27947;
                EnumC11091 enumC11091 = c9232.f27940;
                if (c9232.f27945 == abstractC5144) {
                    int i2 = C7130.f21880[enumC11091.ordinal()];
                    if (i2 == 1) {
                        return C9953.m25099(c18837.m43517(), c14169, abstractC51442.f16085);
                    }
                    if (i2 == 2) {
                        return C9953.m25079(c18837.m43517(), c14169, abstractC51442.f16085);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC11091 + " for tree " + abstractC5144 + " within frame " + abstractC51442);
                }
                if (c26096 != null && c26096.contains(abstractC5144)) {
                    int indexOf4 = c26096.indexOf(abstractC5144);
                    int i3 = C7130.f21880[enumC11091.ordinal()];
                    if (i3 == 1) {
                        return C9953.m25090(c18837.m43517(), c14169, indexOf4, abstractC51442.f16085);
                    }
                    if (i3 == 2) {
                        return C9953.m25092(c18837.m43517(), c14169, indexOf4, abstractC51442.f16085);
                    }
                    throw new AssertionError("Unknown method reference mode " + enumC11091 + " for tree " + abstractC5144 + " within frame " + abstractC51442);
                }
                throw new AssertionError("Could not determine type argument position of tree " + abstractC5144 + " within frame " + abstractC51442);
            case 13:
                c18837.m43515(C12774.f38378);
                C2609 c26097 = c26092.f8241;
                while (true) {
                    AbstractC5144 abstractC51443 = (AbstractC5144) c26097.f8241.f8240;
                    if (abstractC51443.m14709(EnumC18550.f57518)) {
                        c26097 = c26097.f8241;
                        c18837.m43515(C12774.f38378);
                    } else if (abstractC51443.m14709(EnumC18550.f57497)) {
                        c26097 = c26097.f8241;
                    } else {
                        return m41911((AbstractC5144) c26097.f8240, (AbstractC5144) c26097.f8241.f8240, c26097, c14169, i, c18837);
                    }
                }
            case 14:
                if (((AbstractC5144) c26092.f8241.f8241.f8240).m14709(EnumC18550.f57582)) {
                    C2609 c26098 = c26092.f8241;
                    int indexOf5 = ((C5557) c26098.f8241.f8240).f17185.indexOf(c26098.f8240);
                    C14315 c14315 = (C14315) abstractC51442;
                    if (((AbstractC12612) c14315.f43170.get(0)).f16086.mo12925()) {
                        indexOf2 = c14315.f43170.indexOf(abstractC5144) + 1;
                    } else {
                        indexOf2 = c14315.f43170.indexOf(abstractC5144);
                    }
                    return C9953.m25088(c18837.m43517(), c14169, indexOf5, indexOf2, abstractC51442.f16085);
                }
                if (((AbstractC5144) c26092.f8241.f8241.f8240).m14709(EnumC18550.f57511)) {
                    C2609 c26099 = c26092.f8241;
                    int indexOf6 = ((C8526) c26099.f8241.f8240).f26047.indexOf(c26099.f8240);
                    C14315 c143152 = (C14315) abstractC51442;
                    if (((AbstractC12612) c143152.f43170.get(0)).f16086.mo12925()) {
                        indexOf = c143152.f43170.indexOf(abstractC5144) + 1;
                    } else {
                        indexOf = c143152.f43170.indexOf(abstractC5144);
                    }
                    return C9953.m25081(c18837.m43517(), c14169, indexOf6, indexOf, abstractC51442.f16085);
                }
                throw new AssertionError("Could not determine position of tree " + abstractC5144 + " within frame " + abstractC51442);
            case 15:
                C12048 c12048 = ((C9378) abstractC51442).f28489;
                if (c12048.mo952() != EnumC23258.FIELD) {
                    m41916(c12048, c12048.mo16081());
                }
                switch (C7130.f21882[c12048.mo952().ordinal()]) {
                    case 1:
                    case 2:
                        return C9953.m25093(c18837.m43517(), c14169, abstractC51442.f16085);
                    case 3:
                        return C9953.m25091(c18837.m43517(), c14169, abstractC51442.f16085);
                    case 4:
                        if (c12048.f17562.equals(this.f54733.f52817.f18886)) {
                            return C9953.m25089(c18837.m43517(), c14169, abstractC51442.f16085);
                        }
                        while (true) {
                            EnumC18550 mo989 = ((AbstractC5144) c26092.f8240).mo989();
                            enumC18550 = EnumC18550.f57511;
                            if (mo989 != enumC18550 && ((AbstractC5144) c26092.f8240).mo989() != EnumC18550.f57523) {
                                c26092 = c26092.f8241;
                            }
                        }
                        if (((AbstractC5144) c26092.f8240).mo989() == enumC18550) {
                            indexOf3 = ((C8526) c26092.f8240).f26048.indexOf(abstractC51442);
                        } else if (((AbstractC5144) c26092.f8240).mo989() == EnumC18550.f57523) {
                            indexOf3 = ((C14169) c26092.f8240).f42775.indexOf(abstractC51442);
                        } else {
                            C12171.m29640("methodParamIndex expected to find method or lambda for param: " + abstractC51442);
                            throw null;
                        }
                        return C9953.m25094(c18837.m43517(), c14169, indexOf3, abstractC51442.f16085);
                    case 5:
                        return C9953.m25086(c18837.m43517(), c14169, abstractC51442.f16085);
                    case 6:
                        return C9953.m25084(c18837.m43517(), c14169, abstractC51442.f16085);
                    default:
                        throw new AssertionError("Found unexpected type annotation for variable: " + c12048 + " with kind: " + c12048.mo952());
                }
            case 16:
                if (abstractC51442 == abstractC5144) {
                    AbstractC4308 abstractC43082 = ((C18257) abstractC51442).f56779.f16086;
                    C12171.m29637(abstractC43082);
                    if (!abstractC43082.f13890.mo952().equals(EnumC23258.TYPE_PARAMETER) && !abstractC43082.mo3256().equals(EnumC0701.WILDCARD) && !abstractC43082.mo3256().equals(EnumC0701.ARRAY)) {
                        m41912(abstractC43082, c18837);
                    }
                }
                C2609 c260910 = c26092.f8241;
                return m41911((AbstractC5144) c260910.f8240, (AbstractC5144) c260910.f8241.f8240, c260910, c14169, i, c18837);
            case 17:
                C2609 c260911 = c26092.f8241;
                return m41911((AbstractC5144) c260911.f8240, (AbstractC5144) c260911.f8241.f8240, c260911, c14169, i, c18837);
            case 18:
                C2609 c260912 = c26092.f8241;
                return m41911((AbstractC5144) c260912.f8240, (AbstractC5144) c260912.f8241.f8240, c260912, c14169, ((C17138) abstractC51442).f52525.indexOf(abstractC5144), c18837);
            case 19:
                C15580 c15580 = (C15580) abstractC51442;
                if (!c15580.f48010.contains(abstractC5144)) {
                    return C9953.f30043;
                }
                C3581 c3581 = (C3581) C7260.m19472(c15580.f48011);
                int indexOf7 = c15580.f48010.indexOf(abstractC5144);
                if (c3581 == null) {
                    throw new AssertionError("could not determine symbol for {" + c15580 + l.d);
                }
                if (c3581.m16075()) {
                    return C9953.m25087(c18837.m43517(), c14169, indexOf7, c15580.f16085);
                }
                return C9953.m25096(c18837.m43517(), c14169, indexOf7, c15580.f16085);
            case 20:
            case 21:
                C2609 c260913 = c26092.f8241;
                AbstractC5144 abstractC51444 = (AbstractC5144) c260913.f8240;
                AbstractC5144 abstractC51445 = (AbstractC5144) c260913.f8241.f8240;
                c18837.m43515(C12774.f38379);
                return m41911(abstractC51444, abstractC51445, c260913, c14169, i, c18837);
            case 22:
                C2609 c260914 = c26092.f8241;
                return m41911((AbstractC5144) c260914.f8240, (AbstractC5144) c260914.f8241.f8240, c260914, c14169, i, c18837);
            default:
                throw new AssertionError("Unresolved frame: " + abstractC51442 + " of kind: " + abstractC51442.mo987() + "\n    Looking for tree: " + abstractC5144);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18837 m41912(AbstractC4308 abstractC4308, C18837 c18837) {
        for (AbstractC4308 mo4958 = abstractC4308.mo4958(); mo4958 != null && mo4958.mo3256() != EnumC0701.NONE && mo4958.mo3256() != EnumC0701.ERROR; mo4958 = mo4958.mo4958()) {
            c18837.m43515(C12774.f38380);
        }
        return c18837;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        if (this.f54732) {
            return;
        }
        this.f54732 = true;
        if (this.f54734) {
            mo10758(c5557.f17181);
            m33860(c5557.f17185);
            mo10758(c5557.f17184);
            m33860(c5557.f17183);
        }
        m33860(c5557.f17179);
        if (c5557.f17186.m33810()) {
            C5378.stream(c5557.f17186.m33811()).forEach(new Consumer() { // from class: l.ۧ۠֨
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void n(Object obj) {
                    C17920 c17920 = C17920.this;
                    c17920.getClass();
                    c17920.mo10758(((C21221) obj).f68389);
                }
            });
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        if (c8526.f26045 == null) {
            C12171.m29640("Visiting tree node before memberEnter");
            throw null;
        }
        boolean z = this.f54734;
        if (z) {
            if (!c8526.f26046.f7168.isEmpty()) {
                if (c8526.f26045.m16075()) {
                    m41914(c8526, null, c8526.f26045, C9953.m25082(C9953.f30042, null, c8526.f16085));
                } else {
                    m41914(c8526.f26051, c8526.f26045.f17560.mo12923(), c8526.f26045, C9953.m25082(C9953.f30042, null, c8526.f26051.f16085));
                }
            }
            C9378 c9378 = c8526.f26052;
            if (c9378 != null && c9378.f28489 != null && !c9378.f28486.f7168.isEmpty()) {
                C9953 m25089 = C9953.m25089(C9953.f30042, null, c8526.f26052.f28488.f16085);
                this.f54731 = this.f54731.m8246(c8526.f26052);
                try {
                    C9378 c93782 = c8526.f26052;
                    AbstractC12612 abstractC12612 = c93782.f28488;
                    C12048 c12048 = c93782.f28489;
                    m41914(abstractC12612, c12048.f17560, c12048, m25089);
                } finally {
                }
            }
            Iterator it = c8526.f26048.iterator();
            int i = 0;
            while (it.hasNext()) {
                C9378 c93783 = (C9378) it.next();
                if (!c93783.f28486.f7168.isEmpty()) {
                    C9953 m25094 = C9953.m25094(C9953.f30042, null, i, c93783.f28488.f16085);
                    this.f54731 = this.f54731.m8246(c93783);
                    try {
                        AbstractC12612 abstractC126122 = c93783.f28488;
                        C12048 c120482 = c93783.f28489;
                        m41914(abstractC126122, c120482.f17560, c120482, m25094);
                    } finally {
                    }
                }
                i++;
            }
        }
        if (z) {
            mo10758(c8526.f26046);
            mo10758(c8526.f26051);
            m33860(c8526.f26047);
            mo10758(c8526.f26052);
            m33860(c8526.f26048);
            m33860(c8526.f26042);
            return;
        }
        mo10758(c8526.f26049);
        mo10758(c8526.f26043);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        C14169 c141692 = this.f54730;
        try {
            this.f54730 = c14169;
            Iterator it = c14169.f42775.iterator();
            int i = 0;
            while (it.hasNext()) {
                C9378 c9378 = (C9378) it.next();
                if (!c9378.f28486.f7168.isEmpty()) {
                    C9953 m25094 = C9953.m25094(C9953.f30042, c14169, i, c9378.f28488.f16085);
                    this.f54731 = this.f54731.m8246(c9378);
                    try {
                        if (!c9378.m24210()) {
                            AbstractC12612 abstractC12612 = c9378.f28488;
                            C12048 c12048 = c9378.f28489;
                            m41914(abstractC12612, c12048.f17560, c12048, m25094);
                        }
                        m41917();
                    } catch (Throwable th) {
                        m41917();
                        throw th;
                    }
                }
                i++;
            }
            mo10758(c14169.f42776);
            m33860(c14169.f42775);
        } finally {
            this.f54730 = c141692;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C12048 c12048;
        boolean isEmpty = c9378.f28486.f7168.isEmpty();
        boolean z = this.f54734;
        if (!isEmpty) {
            C12048 c120482 = c9378.f28489;
            if (c120482 == null) {
                C12171.m29640("Visiting tree node before memberEnter");
                throw null;
            }
            if (c120482.mo952() != EnumC23258.PARAMETER) {
                if (c9378.f28489.mo952() == EnumC23258.FIELD) {
                    if (z) {
                        C9953 m25091 = C9953.m25091(C9953.f30042, null, c9378.f16085);
                        AbstractC12612 abstractC12612 = c9378.f28488;
                        C12048 c120483 = c9378.f28489;
                        m41914(abstractC12612, c120483.f17560, c120483, m25091);
                    }
                } else if (c9378.f28489.mo952() == EnumC23258.LOCAL_VARIABLE) {
                    C9953 m25093 = C9953.m25093(C9953.f30042, this.f54730, c9378.f16085);
                    if (!c9378.m24210()) {
                        AbstractC12612 abstractC126122 = c9378.f28488;
                        C12048 c120484 = c9378.f28489;
                        m41914(abstractC126122, c120484.f17560, c120484, m25093);
                    }
                } else if (c9378.f28489.mo952() == EnumC23258.BINDING_VARIABLE) {
                    C9953 m250932 = C9953.m25093(C9953.f30042, this.f54730, c9378.f16085);
                    AbstractC12612 abstractC126123 = c9378.f28488;
                    C12048 c120485 = c9378.f28489;
                    m41914(abstractC126123, c120485.f17560, c120485, m250932);
                } else if (c9378.f28489.mo952() == EnumC23258.EXCEPTION_PARAMETER) {
                    C9953 m25086 = C9953.m25086(C9953.f30042, this.f54730, c9378.f16085);
                    AbstractC12612 abstractC126124 = c9378.f28488;
                    C12048 c120486 = c9378.f28489;
                    m41914(abstractC126124, c120486.f17560, c120486, m25086);
                } else if (c9378.f28489.mo952() == EnumC23258.RESOURCE_VARIABLE) {
                    C9953 m25084 = C9953.m25084(C9953.f30042, this.f54730, c9378.f16085);
                    AbstractC12612 abstractC126125 = c9378.f28488;
                    C12048 c120487 = c9378.f28489;
                    m41914(abstractC126125, c120487.f17560, c120487, m25084);
                } else if (c9378.f28489.mo952() != EnumC23258.ENUM_CONSTANT) {
                    C12171.m29640("Unhandled variable kind: " + c9378.f28489.mo952());
                    throw null;
                }
            }
        }
        mo10758(c9378.f28486);
        mo10758(c9378.f28488);
        if (!z) {
            mo10758(c9378.f28487);
        }
        if (z && (c12048 = c9378.f28489) != null && c12048.mo952() == EnumC23258.FIELD) {
            C12048 c120488 = c9378.f28489;
            if ((c120488.f17563 & 2305843009213693952L) != 0) {
                C21221 m33803 = ((C14163) c120488.f17561).m33803(c120488);
                m33803.m16074(c9378.f28489.mo16081());
                m33803.f17560 = c9378.f28489.f17560;
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        if (this.f54734) {
            return;
        }
        m33860(c2735.f8521);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        C14163 c14163;
        C5557 c5557 = c19110.f60195;
        if (c5557 != null && (c14163 = c5557.f17186) != null) {
            AbstractC4308 abstractC4308 = c14163.f17561.m16071().f17560;
            C18837 c18837 = new C18837();
            m41912(abstractC4308, c18837);
            c18837.m43511(C12774.f38380);
            C9953 m25097 = C9953.m25097(c18837.m43517(), null, c19110.f16085);
            C18837 c188372 = new C18837();
            AbstractC4308 abstractC43082 = c19110.f60196.f16086;
            C18837 c188373 = new C18837();
            m41912(abstractC43082, c188373);
            C2609 m43517 = c188373.m43517();
            Iterator it = c14163.mo16081().iterator();
            while (it.hasNext()) {
                C6507 c6507 = (C6507) it.next();
                if (c6507.f50415.f30054.equals(m43517)) {
                    c188372.m43511(new C6507(c6507.f26338, c6507.f50417, m25097));
                }
            }
            c14163.f17561.m16097(c188372.m43517());
        }
        mo10758(c19110.f60199);
        m33860(c19110.f60198);
        if (c19110.f60195 == null) {
            mo10758(c19110.f60196);
        }
        m33860(c19110.f60197);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        m41915(c18404, c18404, c18404.f57137);
        int m8245 = c18404.f57141.m8245();
        C18837 c18837 = new C18837();
        for (int i = 0; i < m8245; i++) {
            C18837 c188372 = new C18837();
            if (i != 0) {
                c18837.m43511(C12774.f38378);
                c188372.m43512(c18837.m43517());
            }
            m41913((C2609) c18404.f57141.get(i), C9953.m25097(c188372.m43517(), this.f54730, c18404.f16085));
        }
        AbstractC12612 abstractC12612 = c18404.f57138;
        c18837.m43511(C12774.f38378);
        while (abstractC12612 != null) {
            if (abstractC12612.m14709(EnumC18550.f57497)) {
                C18257 c18257 = (C18257) abstractC12612;
                AbstractC4308 abstractC4308 = abstractC12612.f16086;
                C18837 c188373 = new C18837();
                m41912(abstractC4308, c188373);
                m41913(c18257.f56778, C9953.m25097(c188373.m43517().m8248(c18837.m43517()), this.f54730, c18404.f16085));
                abstractC12612 = c18257.f56779;
            } else if (abstractC12612.m14709(EnumC18550.f57518)) {
                c18837.m43511(C12774.f38378);
                abstractC12612 = ((C23901) abstractC12612).f77274;
            } else if (!abstractC12612.m14709(EnumC18550.f57581)) {
                break;
            } else {
                abstractC12612 = ((C6262) abstractC12612).f19397;
            }
        }
        m33860(c18404.f57139);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41915(AbstractC5144 abstractC5144, AbstractC5144 abstractC51442, C2609 c2609) {
        if (c2609.isEmpty()) {
            return;
        }
        m41913(c2609, m41911(abstractC5144, abstractC51442, this.f54731, this.f54730, 0, new C18837()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41913(C2609 c2609, C9953 c9953) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C16384 c16384 = ((C17551) it.next()).f53652;
            if (c16384 != null) {
                ((C6507) c16384).f50415 = c9953;
            }
        }
    }

    public final String toString() {
        return super.toString() + ": sigOnly: " + this.f54734;
    }

    public C17920(C17214 c17214, boolean z) {
        this.f54733 = c17214;
        this.f54734 = z;
    }
}
