package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: M43N */
/* renamed from: l.ۜۨ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6735 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f20921;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20661 f20922;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C6319 f20923;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashMap f20924;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2609 f20925;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C22364 f20926;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15240 f20927;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1380 f20928;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22406 f20929;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f20930;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0384 f20931;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5931 f20932;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13748 f20933;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C7399 f20934;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C4314 f20920 = new C4314();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C11488 f20919 = new C11488();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C2609 m18333(C6735 c6735, C17318 c17318) {
        c6735.getClass();
        return m18334(c17318, (C6755) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6735 m18336(C2903 c2903) {
        C6735 c6735 = (C6735) c2903.m8838(f20920);
        return c6735 == null ? new C6735(c2903) : c6735;
    }

    public C6735(C2903 c2903) {
        C22921 c22921 = new C22921(this);
        this.f20928 = c22921;
        this.f20933 = new C13748(this);
        this.f20934 = new C7399(this);
        this.f20924 = new HashMap();
        c2903.m8841(f20920, this);
        this.f20929 = C22406.m50289(c2903);
        this.f20927 = C15240.m36054(c2903);
        this.f20922 = C20661.m47250(c2903);
        this.f20923 = C6319.m17456(c2903);
        this.f20932 = C5931.m16615(c2903);
        this.f20926 = C22364.m50099(c2903);
        C11781 m28823 = C11781.m28823(c2903);
        this.f20921 = EnumC10637.f31993.m26686(EnumC16280.m38301(c2903)) && m28823.m28835("useLegacyInference");
        this.f20930 = m28823.m28824("debug.dumpInferenceGraphsTo");
        this.f20925 = C2609.m8239();
        C2609 m8239 = C2609.m8239();
        this.f20931 = new C0384(this, m8239, m8239.m8243((Function) c22921));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12919 m18338(C16719 c16719) {
        C12919 c12919 = new C12919(null);
        C2609 m8239 = C2609.m8239();
        c12919.f38791 = m8239;
        if (c16719 != null) {
            c12919.f38791 = m8239.m8242(c16719);
        }
        return c12919;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10658 m18348(C1755 c1755, C2609 c2609, C10658 c10658, C23420 c23420, C3581 c3581, C2609 c26092, C12364 c12364, C1386 c1386) {
        C10658 c106582;
        C10658 c106583 = c10658;
        boolean z = this.f20921;
        C0384 c0384 = new C0384(this, c2609, c2609.m8243((Function) this.f20928));
        try {
            C6755 m29997 = c12364.m29997(c3581, c0384, c23420, c1386);
            c12364.f37062.mo11113(c1755, m29997, c26092, c106583.f32059, c1386);
            if (z && c23420 != null && c23420.f75219 == f20919) {
                m18349(c0384, c1386);
                c106582 = new C17318(this, c10658, c0384, c1755, c1386);
                c0384.m1872();
            } else {
                if (z && c23420 != null) {
                    m18349(c0384, c1386);
                    if (!c1386.m4872(EnumC20347.UNCHECKED)) {
                        boolean m18342 = m18342(c106583.f32060, c23420, c0384);
                        C0384 m1855 = m18342 ? c0384.m1855(m18334(c106583, m29997), true, c1386) : c0384;
                        C10658 c106584 = (C10658) this.f20923.m17542(c106583, m18347(c1755.f6074, c23420, c106583, m1855));
                        if (m18342) {
                            m1855.m1861(c23420.f75215.mo3857(), false);
                            m29997.mo18375();
                            c0384.m1872();
                            m18339(c1755.f6074, c3581, c12364);
                            return c106584;
                        }
                        c106583 = c106584;
                    }
                }
                m29997.mo18375();
                if (z) {
                    c0384.m1862(c1386);
                } else {
                    c0384.m1865(true, c1386, EnumC18024.f56196.f56198);
                }
                c106582 = (C10658) c0384.m1859(c106583);
                if (!z && c0384.m1876().m8249() && c23420 != null && !c1386.m4872(EnumC20347.UNCHECKED)) {
                    m18347(c1755.f6074, c23420, c106582, c0384);
                    c0384.m1865(false, c1386, EnumC18024.f56195.f56198);
                    c106582 = (C10658) c0384.m1859(c106582);
                }
                if (c23420 != null && this.f20929.f72584.contains(EnumC21701.DEFERRED_INST)) {
                    C22364 c22364 = this.f20926;
                    int i = c1755.f6074.f16085;
                    AbstractC4308 abstractC4308 = c23420.f75219;
                    C13691 c13691 = C23174.f74467;
                    c22364.m7270(i, new C13691("compiler", "deferred.method.inst", c3581, c106582, abstractC4308));
                }
                if (c23420 == null && z) {
                    c0384.m1875(c0384.m1856());
                } else {
                    c0384.m1872();
                }
                if (c23420 == null) {
                    c0384.f1812.clear();
                }
            }
            m18339(c1755.f6074, c3581, c12364);
            return c106582;
        } catch (Throwable th) {
            if (c23420 == null && z) {
                c0384.m1875(c0384.m1856());
            } else {
                c0384.m1872();
            }
            if (c23420 == null) {
                c0384.f1812.clear();
            }
            m18339(c1755.f6074, c3581, c12364);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m18342(AbstractC4308 abstractC4308, C23420 c23420, C0384 c0384) {
        if (c23420.f75215.mo3857() == this.f20931 || !abstractC4308.m12928(c0384.f1817)) {
            return false;
        }
        return (c0384.f1817.contains(abstractC4308) && m18341((C0779) c0384.m1868(abstractC4308), c23420.f75219, c0384)) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m18334(C10658 c10658, C6755 c6755) {
        if (c6755 != null && c6755.f20970 == EnumC13829.CHECK) {
            C18837 c18837 = new C18837();
            c18837.m43511(c10658.f32060);
            Iterator it = c6755.f20966.iterator();
            while (it.hasNext()) {
                C18750 c18750 = (C18750) it.next();
                c18837.addAll(c18750.f59252.mo28594());
                c18837.addAll(c18750.f59252.mo28593());
            }
            C2609 c2609 = (C2609) C5378.stream(c6755.f20968.f1817).filter(new C11633()).collect(C2609.m8240());
            C2609 m43517 = c18837.m43517();
            C2609 m8244 = c2609.m8244(m43517);
            m43517.getClass();
            return m8244.m8248(m43517);
        }
        return C2609.of((Object) c10658.f32060);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18339(InterfaceC3109 interfaceC3109, C3581 c3581, C12364 c12364) {
        String str = this.f20930;
        try {
            try {
                Iterator it = this.f20925.m8250().iterator();
                int i = 0;
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    C12171.m29637((Object) str);
                    AbstractC10370 abstractC10370 = c3581.f17562;
                    if (abstractC10370 == abstractC10370.f31203.f37517.f18879) {
                        abstractC10370 = c3581.f17561.f17562;
                    }
                    BufferedWriter newBufferedWriter = C17229.newBufferedWriter(C8763.get(str, String.format("%s@%s[mode=%s,step=%s]_%d.dot", abstractC10370, Integer.valueOf(interfaceC3109.mo9483()), c12364.m29998(), c12364.f37061, Integer.valueOf(i))), new InterfaceC23579[0]);
                    try {
                        newBufferedWriter.append((CharSequence) str2);
                        newBufferedWriter.close();
                        i++;
                    } finally {
                    }
                }
            } catch (IOException e) {
                C12171.m29640("Error occurred when dumping inference graph: " + e.getMessage());
                throw null;
            }
        } finally {
            this.f20925 = C2609.m8239();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[ADDED_TO_REGION] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC4308 m18347(l.AbstractC5144 r17, l.C23420 r18, l.C10658 r19, l.C0384 r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6735.m18347(l.ۚۚ۠, l.᩻ۗ֨, l.ۧ֨֨, l.֡ۨ֨):l.ۙ֨֨");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m18341(C0779 c0779, AbstractC4308 abstractC4308, C0384 c0384) {
        boolean mo12941 = abstractC4308.mo12941();
        C6319 c6319 = this.f20923;
        if (mo12941) {
            Iterator it = c0779.m2963(EnumC19125.values()).iterator();
            while (it.hasNext()) {
                AbstractC4308 m17563 = c6319.m17563((AbstractC4308) it.next());
                if (m17563 != null && !m17563.m12913(EnumC9454.NONE)) {
                    return true;
                }
            }
            return false;
        }
        if (c6319.m17523(abstractC4308) == abstractC4308) {
            Iterator it2 = c0779.m2963(EnumC19125.f60275, EnumC19125.f60273).iterator();
            while (true) {
                if (it2.hasNext()) {
                    AbstractC4308 abstractC43082 = (AbstractC4308) it2.next();
                    if (c6319.m17523(abstractC43082) != abstractC43082) {
                        break;
                    }
                } else {
                    Iterator it3 = c0779.m2963(EnumC19125.f60273).iterator();
                    loop2: while (it3.hasNext()) {
                        AbstractC4308 abstractC43083 = (AbstractC4308) it3.next();
                        Iterator it4 = c0779.m2963(EnumC19125.f60273).iterator();
                        while (it4.hasNext()) {
                            AbstractC4308 abstractC43084 = (AbstractC4308) it4.next();
                            if (abstractC43083 != abstractC43084 && !abstractC43083.m12928(c0384.f1817) && !abstractC43084.m12928(c0384.f1817)) {
                                Iterator it5 = m18344(abstractC43083, abstractC43084).iterator();
                                while (it5.hasNext()) {
                                    C23069 c23069 = (C23069) it5.next();
                                    if (!c6319.m17550((AbstractC4308) c23069.f74207, (AbstractC4308) c23069.f74208)) {
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (abstractC4308.mo12917()) {
            Iterator it6 = c0779.m2963(EnumC19125.f60275, EnumC19125.f60273).iterator();
            while (it6.hasNext()) {
                AbstractC4308 m17527 = c6319.m17527(abstractC4308.f13890, (AbstractC4308) it6.next());
                if (m17527 != null && m17527.mo12920()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18352(C2609 c2609, C0384 c0384) {
        C6319 c6319;
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c6319 = this.f20923;
            if (!hasNext) {
                break;
            }
            C0779 c0779 = (C0779) c0384.m1868((AbstractC4308) it.next());
            EnumC19125 enumC19125 = EnumC19125.f60272;
            C2609 m2963 = c0779.m2963(enumC19125);
            boolean m12903 = AbstractC4308.m12903(m2963, c2609);
            C20661 c20661 = this.f20922;
            if (m12903) {
                AbstractC19810 abstractC19810 = c0779.f14167.f13890;
                C4287 c4287 = new C4287(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC19810.f17562, null, abstractC19810.f17561);
                c4287.f17560 = new C8541(c4287, c6319.m17534(c0779.m2963(enumC19125)), c20661.f66522, C20743.f66779);
                c18837.m43511(c0779);
                c0779.m2972(c4287.f17560);
            } else if (m2963.m8249()) {
                c0779.m2972(c6319.m17553(m2963));
            } else {
                c0779.m2972(c20661.f66526);
            }
        }
        C2609 c26092 = c2609;
        Iterator it2 = c18837.iterator();
        while (it2.hasNext()) {
            C0779 c07792 = (C0779) ((AbstractC4308) it2.next());
            C8541 c8541 = (C8541) c07792.m2971();
            c8541.mo21267(c6319.m17553(c0384.m1857(c6319.m17484(c8541))));
            if (c8541.mo12939().mo12948()) {
                m18350(c07792, EnumC19125.f60272);
            }
            c26092 = c26092.f8241;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m18346(AbstractC4293 abstractC4293, AbstractC4308 abstractC4308, C2609 c2609, InterfaceC3953 interfaceC3953) {
        C6319 c6319 = this.f20923;
        if (c6319.m17523(abstractC4308) == abstractC4308) {
            return abstractC4308;
        }
        final AbstractC4308 abstractC43082 = abstractC4308.f13890.f17560;
        C2609 mo12938 = abstractC43082.mo12938();
        C2609 m8243 = mo12938.m8243((Function) this.f20928);
        new LinkedHashMap();
        new HashMap();
        C12171.m29642(c2609 != null);
        C2609 mo12933 = c6319.m17538(abstractC43082).mo12933();
        int m8245 = mo12933.m8245();
        int m82452 = c2609.m8245();
        C5931 c5931 = this.f20932;
        if (m8245 != m82452) {
            interfaceC3953.mo1084(abstractC4293, c5931.m16617(C11886.f35463));
            return c6319.m17535(abstractC4308);
        }
        Iterator it = mo12933.iterator();
        while (it.hasNext()) {
            if (!c6319.m17550(c6319.m17488((AbstractC4308) it.next(), mo12938, m8243), (AbstractC4308) c2609.f8240)) {
                interfaceC3953.mo1084(abstractC4293, c5931.m16617(C11886.m29013(abstractC4308)));
                return c6319.m17535(abstractC4308);
            }
            c2609 = c2609.f8241;
        }
        C2609 mo129382 = abstractC4308.mo12938();
        Iterator it2 = m8243.iterator();
        while (it2.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it2.next());
            c0779.m2972((AbstractC4308) C5378.stream(c0779.m2963(EnumC19125.f60275)).filter(new Predicate() { // from class: l.ۛۤ֨
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
                    return !((AbstractC4308) obj).m12928(AbstractC4308.this.mo12938());
                }
            }).findFirst().orElse((AbstractC4308) mo129382.f8240));
            mo129382 = mo129382.f8241;
        }
        C18837 c18837 = new C18837();
        Iterator it3 = m8243.iterator();
        while (it3.hasNext()) {
            C0779 c07792 = (C0779) ((AbstractC4308) it3.next());
            c18837.m43511(c07792.m2971() != null ? c07792.m2971() : c07792.f14167);
        }
        AbstractC4308 m17488 = c6319.m17488(abstractC43082, mo12938, c18837.m43517());
        if (!this.f20927.m36163(m17488)) {
            interfaceC3953.mo1084(abstractC4293, c5931.m16617(C11886.m29013(abstractC4308)));
        }
        interfaceC3953.mo3859(m17488, abstractC4308, c6319.f19598);
        return m17488;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18349(C0384 c0384, C1386 c1386) {
        boolean z = true;
        int i = 0;
        while (true) {
            HashMap hashMap = this.f20924;
            if (!z || i >= 10000) {
                break;
            }
            try {
                Iterator it = c0384.f1814.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    C0779 c0779 = (C0779) ((AbstractC4308) it.next());
                    if (!c0779.f2881.isEmpty()) {
                        ((AbstractC21387) c0779.f2881.removeFirst()).mo34201(c0384, c1386);
                        z2 = true;
                    }
                }
                i++;
                z = z2;
            } finally {
                hashMap.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 m18344(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C2609 of;
        AbstractC4308 m17492 = this.f20923.m17492(abstractC4308, abstractC43082);
        C20661 c20661 = this.f20922;
        if (m17492 == c20661.f66457 || m17492 == c20661.f66522) {
            return C2609.m8239();
        }
        m17492.getClass();
        if (m17492 instanceof C5843) {
            C5843 c5843 = (C5843) m17492;
            of = c5843.f64620.m8246(c5843.f64618);
        } else {
            of = C2609.of((Object) m17492);
        }
        C18837 c18837 = new C18837();
        Iterator it = of.iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC43083 = (AbstractC4308) it.next();
            if (abstractC43083.mo12917()) {
                c18837.m43511(new C23069(m18335(abstractC4308, abstractC43083), m18335(abstractC43082, abstractC43083)));
            }
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m18335(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        boolean m12913 = abstractC43082.m12913(EnumC9454.ARRAY);
        C6319 c6319 = this.f20923;
        if (m12913) {
            return new C5138(m18335(c6319.m17515(abstractC4308), c6319.m17515(abstractC43082)), this.f20922.f66505);
        }
        return c6319.m17527(abstractC43082.f13890, abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18353(EnumC3042 enumC3042, AbstractC4308 abstractC4308, AbstractC4308 abstractC43082, C1386 c1386) {
        C22092 c22092 = new C22092(this, enumC3042, abstractC4308, abstractC43082);
        HashMap hashMap = this.f20924;
        Boolean bool = (Boolean) hashMap.get(c22092);
        if (bool == null) {
            bool = Boolean.valueOf(enumC3042.mo9295(abstractC4308, abstractC43082, c1386, this.f20923));
            hashMap.put(c22092, bool);
        }
        return bool.booleanValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18350(C0779 c0779, EnumC19125 enumC19125) {
        int i = C1631.f5723[enumC19125.ordinal()];
        C5931 c5931 = this.f20932;
        if (i == 1) {
            AbstractC4308 abstractC4308 = c0779.f14167;
            C2609 m2963 = c0779.m2963(enumC19125);
            C11576 c11576 = C11886.f35440;
            throw m18338(c5931.m16617(new C11576("compiler", "incompatible.eq.bounds", abstractC4308, m2963)));
        }
        if (i == 2) {
            throw new AssertionError("this case shouldn't happen");
        }
        if (i != 3) {
            return;
        }
        AbstractC4308 abstractC43082 = c0779.f14167;
        C2609 m29632 = c0779.m2963(enumC19125);
        C11576 c115762 = C11886.f35440;
        throw m18338(c5931.m16617(new C11576("compiler", "incompatible.upper.bounds", abstractC43082, m29632)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18351(C0779 c0779, EnumC19125 enumC19125, EnumC19125 enumC191252) {
        AbstractC4308 abstractC4308 = c0779.f14167;
        C11576 m18337 = m18337(enumC19125, c0779.m2963(enumC19125));
        C11576 m183372 = m18337(enumC191252, c0779.m2963(enumC191252));
        C11576 c11576 = C11886.f35440;
        throw m18338(this.f20932.m16617(new C11576("compiler", "incompatible.bounds", abstractC4308, m18337, m183372)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11576 m18337(EnumC19125 enumC19125, C2609 c2609) {
        int i = C1631.f5723[enumC19125.ordinal()];
        if (i == 1) {
            C11576 c11576 = C11886.f35440;
            return new C11576("compiler", "eq.bounds", c2609);
        }
        if (i == 2) {
            C11576 c115762 = C11886.f35440;
            return new C11576("compiler", "lower.bounds", c2609);
        }
        if (i == 3) {
            C11576 c115763 = C11886.f35440;
            return new C11576("compiler", "upper.bounds", c2609);
        }
        throw new AssertionError("can't get to this place");
    }
}
