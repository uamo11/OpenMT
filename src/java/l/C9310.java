package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: F416 */
/* renamed from: l.ۢۗ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9310 extends AbstractC0204 {

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f28208 = new C4314();

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC9454[] f28209 = {EnumC9454.BYTE, EnumC9454.CHAR, EnumC9454.SHORT, EnumC9454.INT, EnumC9454.LONG, EnumC9454.FLOAT, EnumC9454.DOUBLE, EnumC9454.BOOLEAN};

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C5931 f28210;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C1755 f28211;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f28212;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C23420 f28213;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C15240 f28214;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C23420 f28215;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C1856 f28216;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C13809 f28219;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C10139 f28220;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4224 f28221;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C16782 f28222;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f28223;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C10222 f28224;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7898 f28225;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C23420 f28226;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5572 f28227;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C23420 f28228;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C6136 f28229;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f28230;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C22406 f28231;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23168 f28232;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16364 f28233;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C16672 f28234;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f28236;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4658 f28239;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f28240;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f28241;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f28242;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f28243;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C20661 f28244;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f28245;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C23420 f28246;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12399 f28247;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C18230 f28248;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17013 f28249;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13395 f28250;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C6319 f28251;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6735 f28252;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C22364 f28253;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C14247 f28254;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f28255;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C17214 f28256;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public InterfaceC12501 f28238 = new C1548(this);

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7772 f28218 = C1856.f6336;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23363 f28235 = new C22051();

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C2086 f28237 = new C12173(this);

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public HashMap f28217 = new HashMap();

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1395(C10643 c10643) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9310 m23901(C2903 c2903) {
        C9310 c9310 = (C9310) c2903.m8838(f28208);
        return c9310 == null ? new C9310(c2903) : c9310;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23934(final AbstractC5144 abstractC5144, final AbstractC4308 abstractC4308, final C15406 c15406, final C23420 c23420) {
        AbstractC4308 mo13581;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        EnumC22756 enumC22756 = c23420.f75216;
        C15406 c154062 = c23420.f75217;
        AbstractC4308 abstractC43082 = c23420.f75219;
        final C0384 mo3857 = interfaceC3953.mo3857();
        boolean z = (abstractC4308.m12913(EnumC9454.ERROR) || abstractC43082.m12913(EnumC9454.METHOD) || abstractC43082.m12913(EnumC9454.FORALL)) ? false : true;
        if (z && !c15406.m36458(c154062)) {
            abstractC5144.getClass();
            EnumSet m36456 = c154062.m36456();
            EnumSet m364562 = c15406.m36456();
            C12281 c12281 = C6241.f19132;
            this.f28253.m7273(abstractC5144, new C12281("compiler", "unexpected.type", m36456, m364562));
            mo13581 = this.f28251.m17535(abstractC4308);
        } else if (this.f28241 && abstractC4308.m12928(mo3857.f1817)) {
            AbstractC4308 abstractC43083 = z ? abstractC43082 : abstractC4308;
            if (enumC22756.mo28274()) {
                mo3857.m1864(C2609.of((Object) abstractC4308), new InterfaceC3748() { // from class: l.۠᩶֨
                    @Override // l.InterfaceC3748
                    /* renamed from: ֫ */
                    public final void mo4673(C0384 c0384) {
                        C9310 c9310 = C9310.this;
                        c9310.getClass();
                        C23420 c234202 = c23420;
                        AbstractC4308 abstractC43084 = c234202.f75219;
                        C0384 c03842 = mo3857;
                        C23420 mo38523 = c234202.mo38523(c03842.m1859(abstractC43084));
                        c9310.m23934(abstractC5144, c03842.m1859(abstractC4308), c15406, mo38523);
                    }
                });
            }
            mo13581 = abstractC43083;
        } else {
            mo13581 = z ? c23420.mo13581(abstractC5144, abstractC4308) : abstractC4308;
        }
        if (enumC22756.mo16323()) {
            abstractC5144.f16086 = mo13581;
        }
        return mo13581;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (((r12.f17563 & 8) != 0) == l.C22406.m50291(r14)) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m23947(l.AbstractC12612 r11, l.C12048 r12, l.AbstractC5144 r13, l.C1755 r14) {
        /*
            r10 = this;
            l.ۤܶ۠ r0 = r12.f17562
            l.ۛܶ۠ r1 = r10.f28229
            l.ۤܶ۠ r2 = r1.f18886
            l.᩹ܶ۠ r3 = r10.f28253
            if (r0 != r2) goto L10
            l.۫۠۠ r12 = l.C6241.f19235
            r3.m7273(r11, r12)
            return
        L10:
            long r4 = r12.f17563
            r6 = 16
            long r6 = r6 & r4
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto La7
            r6 = 262144(0x40000, double:1.295163E-318)
            long r4 = r4 & r6
            r0 = 1
            r2 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L7e
            if (r13 == 0) goto L2d
            boolean r13 = l.C7260.m19453(r13)
            if (r13 == 0) goto L7e
        L2d:
            java.lang.Object r13 = r14.f6073
            l.ۡۗ֨ r13 = (l.C8604) r13
            l.ܰ᩵֨ r13 = r13.f26285
            l.ۛ֡֨ r13 = r13.f23673
            l.ۛ֡֨ r4 = r12.f17561
            if (r4 == r13) goto L6c
            l.ۤܶ۠ r4 = r13.f17562
            l.ۤܶ۠ r1 = r1.f18879
            if (r4 == r1) goto L51
            l.֨ᩴ֨ r1 = r13.f17559
            l.֨ᩴ֨ r4 = l.EnumC1296.f4567
            if (r1 == r4) goto L51
            long r4 = r13.mo16084()
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r4 & r6
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L6a
        L51:
            l.ۛ֡֨ r1 = r12.f17561
            l.ۛ֡֨ r13 = r13.f17561
            if (r1 != r13) goto L6a
            long r4 = r12.f17563
            r6 = 8
            long r4 = r4 & r6
            int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r13 == 0) goto L62
            r13 = 1
            goto L63
        L62:
            r13 = 0
        L63:
            boolean r1 = l.C22406.m50291(r14)
            if (r13 != r1) goto L6a
            goto L6c
        L6a:
            r13 = 0
            goto L6d
        L6c:
            r13 = 1
        L6d:
            l.ۡ֡۠ r14 = r14.f6077
            if (r14 == 0) goto L79
            boolean r14 = l.C7260.m19454(r14)
            if (r14 == 0) goto L79
            r14 = 1
            goto L7a
        L79:
            r14 = 0
        L7a:
            r14 = r14 ^ r0
            r13 = r13 & r14
            if (r13 != 0) goto La7
        L7e:
            boolean r13 = r12.m29422()
            java.lang.String r14 = "compiler"
            if (r13 == 0) goto L97
            l.۫۠۠ r13 = l.C6241.f19132
            l.۫۠۠ r13 = new l.۫۠۠
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r12
            java.lang.String r12 = "try.resource.may.not.be.assigned"
            r13.<init>(r14, r12, r0)
            r3.m7273(r11, r13)
            return
        L97:
            l.۫۠۠ r13 = l.C6241.f19132
            l.۫۠۠ r13 = new l.۫۠۠
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r12
            java.lang.String r12 = "cant.assign.val.to.final.var"
            r13.<init>(r14, r12, r0)
            r3.m7273(r11, r13)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.m23947(l.۫᩵۠, l.۫֡֨, l.ۚۚ۠, l.֫ۤ֨):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m23937(AbstractC12612 abstractC12612, C1323 c1323) {
        C1755 m33127 = this.f28219.m33127(c1323);
        C17013 c17013 = this.f28249;
        C2176 m39899 = c17013.m39899(0L);
        C20661 c20661 = this.f28244;
        C5557 m39908 = c17013.m39908(m39899, c20661.f66462.f17562, (C2609) null, (AbstractC12612) null, (C2609) null, (C2609) null);
        m33127.f6079 = m39908;
        m39908.f17186 = c20661.f66462;
        return (AbstractC5698) abstractC12612.mo986(this.f28238, m33127);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23928(AbstractC5144 abstractC5144, C1755 c1755) {
        C4224 c4224 = this.f28221;
        C1755 c17552 = null;
        C23420 c23420 = null;
        c17552 = null;
        c17552 = null;
        c17552 = null;
        c17552 = null;
        c17552 = null;
        c17552 = null;
        if (!c4224.f13704.isEmpty() && !((C8604) c1755.f6073).f26283.f23066 && (abstractC5144 instanceof AbstractC11349) && !abstractC5144.m14709(EnumC18550.f57582) && !abstractC5144.m14709(EnumC18550.f57550) && !abstractC5144.m14709(EnumC18550.f57511) && !abstractC5144.m14709(EnumC18550.f57532)) {
            AbstractC5144 abstractC51442 = c1755.f6074;
            C8604 c8604 = (C8604) c1755.f6073;
            AbstractC14016 abstractC14016 = c8604.f26285;
            C1755 m5877 = c1755.m5877(abstractC51442, c8604.m22358(abstractC14016.mo26383(abstractC14016.f23673)));
            C8604 c86042 = (C8604) m5877.f6073;
            if (c86042.f26284 != null) {
                C9310 c9310 = c4224.f13708;
                C11003.requireNonNull(c9310);
                C23420 c234202 = c86042.f26284;
                c23420 = new C23420(c9310, c234202.f75217, c234202.f75219);
            }
            c86042.f26284 = c23420;
            c17552 = m5877;
        }
        AbstractC4308 m23930 = m23930(abstractC5144, c1755, this.f28246);
        if (c17552 != null) {
            C16217 c16217 = new C16217(c4224, (AbstractC11349) abstractC5144, c17552);
            c16217.mo10758(c16217.f49918);
            if (!c16217.f49919.isEmpty()) {
                Iterator it = c16217.f49919.iterator();
                while (it.hasNext()) {
                    c4224.f13711.mo33691((C9869) it.next());
                }
            }
        }
        this.f28225.m21193();
        return m23930;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r2 != l.EnumC1296.f4567) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [l.ۛ֡֨] */
    /* JADX WARN: Type inference failed for: r0v36, types: [l.ۛ֡֨] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۛ֡֨] */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1385(l.C7673 r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.mo1385(l.۟᩵۠):void");
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1401(final C13464 c13464) {
        C23420 mo38522;
        AbstractC4308 abstractC4308;
        EnumC19816 enumC19816 = (!this.f28213.f75219.m12913(EnumC9454.NONE) || (abstractC4308 = this.f28213.f75219) == AbstractC4308.f13884 || abstractC4308 == C6735.f20919) ? EnumC19816.POLY : EnumC19816.STANDALONE;
        c13464.f13845 = enumC19816;
        if (enumC19816 == EnumC19816.POLY && this.f28213.f75219.m12913(EnumC9454.VOID)) {
            this.f28213.f75215.mo1084(c13464, this.f28210.m16617(C11886.f35459));
            C12193 m17535 = this.f28251.m17535(this.f28213.f75219);
            c13464.f16086 = m17535;
            this.f28223 = m17535;
            return;
        }
        EnumC19816 enumC198162 = c13464.f13845;
        EnumC19816 enumC198163 = EnumC19816.STANDALONE;
        if (enumC198162 == enumC198163) {
            mo38522 = this.f28228;
        } else {
            C23420 c23420 = this.f28213;
            mo38522 = c23420.mo38522(new C14994(this, c23420.f75215));
        }
        final C23420 c234202 = mo38522;
        final C18837 c18837 = new C18837();
        final C18837 c188372 = new C18837();
        m23903(c13464, c13464.f40197, c13464.f40199, new BiConsumer() { // from class: l.ᩳۙ֨
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C18963 c18963 = (C18963) obj;
                C1755 c1755 = (C1755) obj2;
                ((C8604) c1755.f6073).f26286 = c234202;
                C2609 c2609 = c18963.f59814;
                C9310 c9310 = C9310.this;
                c9310.m23956(c2609, c1755);
                new C7939(c9310, c13464, c18837, c188372).m33860(c18963.f59814);
            }
        });
        boolean isEmpty = c13464.f40199.isEmpty();
        C22364 c22364 = this.f28253;
        if (isEmpty) {
            c22364.m7273(c13464, C6241.f19291);
        } else if (c188372.isEmpty()) {
            c22364.m7273(c13464, C6241.f19296);
        }
        AbstractC4308 m23934 = m23934(c13464, c13464.f13845 == enumC198163 ? m23924(c18837.m43517(), c188372.m43517()) : this.f28213.f75219, C15406.f47181, this.f28213);
        c13464.f16086 = m23934;
        this.f28223 = m23934;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23930(AbstractC5144 abstractC5144, C1755 c1755, C23420 c23420) {
        AbstractC4308 m36110;
        C1755 c17552 = this.f28211;
        C23420 c234202 = this.f28213;
        try {
            try {
                this.f28211 = c1755;
                this.f28213 = c23420;
                if (c23420.mo6717(abstractC5144)) {
                    this.f28223 = this.f28227.m15831(abstractC5144, c1755);
                } else {
                    abstractC5144.mo988(this);
                }
                C1856 c1856 = this.f28216;
                C7772 c7772 = this.f28218;
                c1856.getClass();
                switch (C14121.f42604[abstractC5144.mo989().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                    default:
                        c7772 = C1856.f6336;
                        break;
                }
                this.f28218 = c7772;
                m36110 = this.f28223;
            } catch (C20515 e) {
                abstractC5144.f16086 = this.f28244.f66457;
                m36110 = this.f28214.m36110(abstractC5144, e);
            }
            return m36110;
        } finally {
            this.f28211 = c17552;
            this.f28213 = c234202;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1755 m23919(C1755 c1755) {
        AbstractC5144 abstractC5144 = c1755.f6074;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        AbstractC14016 m33607 = AbstractC14016.m33607(abstractC14016.f23673);
        C2609 m8239 = C2609.m8239();
        Iterator it = abstractC14016.mo20475((Predicate) null, EnumC1317.RECURSIVE).iterator();
        while (it.hasNext()) {
            m8239 = m8239.m8246((AbstractC5698) it.next());
        }
        Iterator it2 = m8239.iterator();
        while (it2.hasNext()) {
            m33607.mo26382((AbstractC5698) it2.next());
        }
        C1755 m5877 = c1755.m5877(abstractC5144, c8604.m22358(m33607));
        C1755 c17552 = m5877.f6076;
        if (c17552 != null) {
            m5877.f6076 = m23919(c17552);
        }
        return m5877;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23929(AbstractC5144 abstractC5144, C1755 c1755, AbstractC4308 abstractC4308) {
        C15406 c15406 = C15406.f47181;
        if (abstractC4308.m12913(EnumC9454.ERROR)) {
            abstractC4308 = AbstractC4308.f13885;
        }
        return m23930(abstractC5144, c1755, new C23420(this, c15406, abstractC4308));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23954(AbstractC5144 abstractC5144, C1755 c1755, AbstractC4308 abstractC4308) {
        return m23930(abstractC5144, c1755, new C23420(this, C15406.f47189, abstractC4308));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23956(C2609 c2609, C1755 c1755) {
        while (c2609.m8249()) {
            m23928((AbstractC5144) c2609.f8240, c1755);
            c2609 = c2609.f8241;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15406 m23940(C15406 c15406, C2609 c2609, C1755 c1755, C18837 c18837) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            AbstractC12612 abstractC12612 = (AbstractC12612) it.next();
            AbstractC4308 m36202 = this.f28214.m36202(abstractC12612, m23930(abstractC12612, c1755, this.f28241 ? this.f28233 : this.f28228));
            if (m36202.m12913(EnumC9454.DEFERRED)) {
                c15406 = C15406.m36455(C15406.f47180, c15406);
            }
            c18837.m43511(m36202);
        }
        return c15406;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m23923(C2609 c2609, C1755 c1755) {
        C18837 c18837 = new C18837();
        while (c2609.m8249()) {
            c18837.m43511(m23954((AbstractC5144) c2609.f8240, c1755, AbstractC4308.f13885));
            c2609 = c2609.f8241;
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23943(C2609 c2609, C1755 c1755, boolean z) {
        C2609 of;
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C14315 c14315 = (C14315) it.next();
            C8541 c8541 = (C8541) c14315.f16086;
            c8541.f13890.f17563 |= 268435456;
            C11488 c11488 = AbstractC4308.f13885;
            c8541.mo21267(c11488);
            boolean isEmpty = c14315.f43170.isEmpty();
            C6319 c6319 = this.f28251;
            if (!isEmpty) {
                C2609 of2 = C2609.of((Object) m23954((AbstractC5144) c14315.f43170.f8240, c1755, c11488));
                Iterator it2 = c14315.f43170.f8241.iterator();
                while (it2.hasNext()) {
                    of2 = of2.m8246(m23954((AbstractC12612) it2.next(), c1755, AbstractC4308.f13885));
                }
                of = of2.m8250();
                c6319.getClass();
            } else {
                of = C2609.of((Object) this.f28244.f66526);
                c6319.getClass();
            }
            c6319.m17501(c8541, of, ((AbstractC4308) of.f8240).f13890.m16070());
            c8541.f13890.f17563 &= -268435457;
        }
        if (z) {
            Iterator it3 = c2609.iterator();
            while (it3.hasNext()) {
                C14315 c143152 = (C14315) it3.next();
                c143152.getClass();
                this.f28214.m36159(c143152, (C8541) c143152.f16086);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m23921(C15658 c15658, C1755 c1755, C9378 c9378, AbstractC4308 abstractC4308) {
        C18230 c18230 = this.f28248;
        InterfaceC3109 m42471 = c18230.m42471((InterfaceC3109) c9378);
        InterfaceC18278 interfaceC18278 = c15658.f6075.f4745;
        C22364 c22364 = this.f28253;
        InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
        try {
            m23908(c9378, c1755);
            AbstractC4308 m23929 = m23929((AbstractC5144) c9378.f28487, (C1755) c15658, abstractC4308);
            if (c9378.m24209()) {
                C12048 c12048 = c9378.f28489;
                abstractC4308 = this.f28214.m36107(c9378, m23929, c9378.f28484);
                c12048.f17560 = abstractC4308;
                c9378.f16086 = abstractC4308;
            }
            if (m23929.mo12915() != null) {
                return this.f28239.m13641(m23929, abstractC4308).mo12915();
            }
            c22364.m7284(m7284);
            c18230.m42471(m42471);
            return null;
        } finally {
            c22364.m7284(m7284);
            c18230.m42471(m42471);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23936(AbstractC12612 abstractC12612, C1755 c1755, boolean z, boolean z2, boolean z3) {
        AbstractC4308 abstractC4308 = abstractC12612.f16086;
        if (abstractC4308 == null) {
            abstractC4308 = m23954(abstractC12612, c1755, AbstractC4308.f13885);
        }
        return m23926(abstractC4308, abstractC12612, z, z2, z3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23926(AbstractC4308 abstractC4308, AbstractC5144 abstractC5144, boolean z, boolean z2, boolean z3) {
        if (abstractC5144.m14709(EnumC18550.f57521)) {
            abstractC5144 = ((C16432) abstractC5144).f50542;
            abstractC5144.getClass();
        }
        boolean isEmpty = abstractC4308.f13890.f17562.isEmpty();
        C6319 c6319 = this.f28251;
        C22364 c22364 = this.f28253;
        if (isEmpty) {
            c22364.m7273(abstractC5144, C6241.f19292);
            return c6319.m17535(abstractC4308);
        }
        if (abstractC4308.mo12948()) {
            return abstractC4308;
        }
        boolean m12913 = abstractC4308.m12913(EnumC9454.TYPEVAR);
        C15240 c15240 = this.f28214;
        if (m12913 && !z && !z2) {
            if (abstractC4308.mo12939() == null) {
                c22364.m7273(abstractC5144, C6241.f19199);
                return c6319.m17535(abstractC4308);
            }
        } else {
            abstractC4308 = c15240.m36108(abstractC5144, abstractC4308, z3);
        }
        if (z2 && (abstractC4308.f13890.mo16084() & 512) == 0) {
            c22364.m7273(abstractC5144, C6241.f19140);
            return c6319.m17535(abstractC4308);
        }
        if (z3 && z && (abstractC4308.f13890.mo16084() & 512) != 0) {
            c22364.m7273(abstractC5144, C6241.f19195);
            return c6319.m17535(abstractC4308);
        }
        if (z3 && (abstractC4308.f13890.mo16084() & 16) != 0) {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC5144, new C12281("compiler", "cant.inherit.from.final", abstractC19810));
        }
        c15240.m36186(abstractC5144, abstractC4308);
        return abstractC4308;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC4308 m23897(C1755 c1755, C7673 c7673) {
        C5557 c5557 = c1755.f6079;
        Object obj = c1755.f6073;
        C14163 c14163 = c5557.f17186;
        c14163.mo16101();
        C12171.m29642((c14163.f17563 & 16384) != 0);
        C8604 c8604 = (C8604) obj;
        c7673.f16086 = c8604.f26285.f23673.m16071().f17560;
        c7673.f23697 = c8604.f26285.f23673.m16071();
        return c7673.f16086;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C21095 c21095;
        C3644 m11135;
        if (((C8604) this.f28211.f6073).f26283.f23066) {
            C5572 c5572 = this.f28227;
            c5572.getClass();
            c21095 = new C21095(c5572);
        } else {
            c21095 = null;
        }
        C16646 ofNullable = C16646.ofNullable(c21095);
        try {
            boolean m4391 = ((C8604) this.f28211.f6073).f26285.f23673.f17559.m4391(C15406.f47185);
            C13809 c13809 = this.f28219;
            if (m4391) {
                c13809.m33125(c5557, this.f28211);
            } else if (this.f28211.f6074.m14709(EnumC18550.f57548) && (m11135 = C3644.m11135(this.f28211.f6075, c5557)) != null) {
                Iterator it = m11135.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC13206) it.next()).mo987() == EnumC3329.ANNOTATION) {
                        c13809.m33125(c5557, this.f28211);
                        break;
                    }
                }
            }
            C14163 c14163 = c5557.f17186;
            if (c14163 == null) {
                this.f28223 = null;
            } else {
                c14163.mo16101();
                C1755 c1755 = this.f28211;
                if (((C8604) c1755.f6073).f26299 && c1755.f6074.m14709(EnumC18550.f57548)) {
                    c14163.f17563 |= 4194304;
                }
                try {
                    this.f28250.m32413();
                    m23948(c14163);
                } catch (C20515 e) {
                    this.f28214.m36110(c5557, e);
                }
                AbstractC4308 abstractC4308 = c14163.f17560;
                c5557.f16086 = abstractC4308;
                this.f28223 = abstractC4308;
            }
        } finally {
            ofNullable.ifPresent(new C3455());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0429 A[EDGE_INSN: B:100:0x0429->B:101:0x0429 BREAK  A[LOOP:2: B:96:0x040a->B:99:0x0412], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x042d A[Catch: all -> 0x05f4, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x045a A[Catch: all -> 0x05f4, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0567 A[Catch: all -> 0x05f4, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x059c A[Catch: all -> 0x05f4, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05af A[Catch: all -> 0x05f4, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05b2 A[Catch: all -> 0x05f4, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x059f A[Catch: all -> 0x05f4, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03d4 A[Catch: all -> 0x05f4, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0412 A[Catch: all -> 0x05f4, LOOP:2: B:96:0x040a->B:99:0x0412, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x05f4, blocks: (B:19:0x0095, B:20:0x00c3, B:21:0x00c5, B:23:0x00cb, B:25:0x00de, B:27:0x00f3, B:29:0x00fb, B:31:0x00ff, B:33:0x0107, B:34:0x0116, B:35:0x0111, B:36:0x011b, B:37:0x011d, B:39:0x0123, B:41:0x012d, B:43:0x0139, B:45:0x0143, B:46:0x0149, B:48:0x014d, B:49:0x0160, B:52:0x0173, B:54:0x017d, B:56:0x019e, B:58:0x01a6, B:59:0x01b5, B:61:0x01cb, B:62:0x01e4, B:64:0x01f0, B:66:0x0200, B:67:0x020f, B:69:0x0217, B:70:0x0226, B:72:0x022e, B:73:0x023d, B:76:0x0243, B:78:0x0253, B:80:0x0259, B:82:0x0261, B:86:0x03c8, B:88:0x03d4, B:90:0x03dc, B:91:0x03ea, B:93:0x03f2, B:94:0x0400, B:95:0x0408, B:96:0x040a, B:99:0x0412, B:101:0x0429, B:103:0x042d, B:105:0x0431, B:107:0x043d, B:109:0x0444, B:111:0x05da, B:116:0x0453, B:117:0x045a, B:119:0x046c, B:121:0x0479, B:122:0x049c, B:124:0x04a2, B:126:0x04a8, B:128:0x04b2, B:131:0x04bd, B:133:0x04d0, B:135:0x04da, B:137:0x04e6, B:138:0x0528, B:140:0x0534, B:142:0x0541, B:144:0x0567, B:145:0x057a, B:147:0x0586, B:149:0x0596, B:151:0x059c, B:152:0x05a1, B:154:0x05af, B:155:0x05b4, B:156:0x05b2, B:157:0x059f, B:158:0x04ff, B:159:0x05c8, B:160:0x0484, B:161:0x048a, B:163:0x0497, B:164:0x0268, B:165:0x027b, B:167:0x0283, B:169:0x0299, B:171:0x02ad, B:172:0x02f2, B:173:0x02fc, B:175:0x0302, B:177:0x030a, B:179:0x0314, B:181:0x031b, B:182:0x0335, B:184:0x033d, B:185:0x0350, B:186:0x0372, B:188:0x0378, B:191:0x0392, B:193:0x039e, B:196:0x03bb, B:197:0x03a8, B:201:0x02c6), top: B:18:0x0095 }] */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1388(final l.C8526 r35) {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.mo1388(l.ۡ֡۠):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f5, code lost:
    
        if (r7.f33159 == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de A[Catch: all -> 0x016f, TryCatch #1 {all -> 0x016f, blocks: (B:20:0x00cf, B:22:0x00de, B:24:0x00e8, B:26:0x0122, B:28:0x0128, B:29:0x00f7, B:31:0x0118, B:32:0x012d, B:34:0x013f, B:36:0x0149, B:38:0x014f, B:40:0x0157), top: B:19:0x00cf }] */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1392(l.C9378 r19) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.mo1392(l.ۢۚ۠):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23908(C9378 c9378, C1755 c1755) {
        EnumC1296 enumC1296;
        AbstractC12612 abstractC12612 = c9378.f28487;
        if (abstractC12612 != null) {
            C2176 c2176 = c9378.f28486;
            long j = c2176.f7169;
            if ((j & 9007199254740992L) != 0 || (enumC1296 = ((C8604) c1755.f6073).f26285.f23673.f17559) == EnumC1296.f4571 || enumC1296 == EnumC1296.f4567) {
                return;
            }
            c2176.f7169 = j | 9007199254740992L;
            C12048 c12048 = c9378.f28489;
            C13395 c13395 = this.f28250;
            c13395.m32408(abstractC12612, c1755, c12048, c9378);
            c13395.m32413();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23917(AbstractC10370 abstractC10370) {
        AbstractC14016 mo16064 = this.f28244.f66526.f13890.mo16064();
        C20574 c20574 = new C20574(1);
        mo16064.getClass();
        Iterator it = mo16064.mo20477(abstractC10370, c20574, EnumC1317.RECURSIVE).iterator();
        while (it.hasNext()) {
            if (((AbstractC5698) it.next()).f17560.mo12933().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1380(C5704 c5704) {
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        C1755 c1755 = this.f28211;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        AbstractC5698 abstractC5698 = abstractC14016.f23673;
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 == EnumC1296.f4582 || enumC1296 == EnumC1296.f4581) {
            long j = c2735.f8522;
            C3581 c3581 = new C3581(1048576 | j | (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX), this.f28229.f18867, null, ((C8604) this.f28211.f6073).f26285.f23673);
            C1755 c17552 = this.f28211;
            C8604 c86042 = (C8604) c17552.f6073;
            C1755 m5877 = c17552.m5877(c2735, c86042.m22358(c86042.f26285.mo26383(c3581)));
            Object obj = m5877.f6073;
            long j2 = j & 8;
            if (j2 != 0) {
                ((C8604) obj).f26297++;
            }
            C8604 c86043 = (C8604) obj;
            AbstractC5698 abstractC56982 = c86043.f26285.f23673;
            C13395 c13395 = this.f28250;
            c13395.m32408(c2735, m5877, abstractC56982, (InterfaceC3109) null);
            c13395.m32413();
            m23956(c2735.f8521, m5877);
            C14163 c14163 = (C14163) ((C8604) this.f28211.f6073).f26285.f23673;
            C2609 mo16081 = c86043.f26285.f23673.mo16081();
            if (j2 != 0) {
                c14163.m16079(mo16081);
            } else {
                c14163.m16092(mo16081);
            }
        } else {
            C1755 m58772 = c1755.m5877(c2735, c8604.m22358(abstractC14016.mo26380(abstractC5698)));
            Object obj2 = m58772.f6073;
            try {
                m23956(c2735.f8521, m58772);
            } finally {
                ((C8604) obj2).f26285.mo26377();
            }
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        AbstractC11349 abstractC11349 = c20374.f65770;
        C1755 c1755 = this.f28211;
        m23928(abstractC11349, c1755.m5877(c20374, c1755.f6073));
        m23929((AbstractC5144) c20374.f65771, this.f28211, (AbstractC4308) this.f28244.f66469);
        AbstractC11349 abstractC113492 = c20374.f65770;
        m23959(abstractC113492);
        if (!this.f28224.m25667(this.f28211, abstractC113492, this.f28249)) {
            C7772 c7772 = this.f28218;
            C2609 c2609 = c7772.f24022;
            AbstractC14016 abstractC14016 = ((C8604) this.f28211.f6073).f26285;
            C11003.requireNonNull(abstractC14016);
            C19846.forEach(c2609, new C3706(abstractC14016));
            C19846.forEach(c7772.f24022, new C18523());
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        m23929((AbstractC5144) c8672.f26445, this.f28211, (AbstractC4308) this.f28244.f66469);
        C7772 c7772 = this.f28218;
        C1755 c1755 = this.f28211;
        C2609 c2609 = c7772.f24023;
        C2609 c26092 = c7772.f24022;
        C1755 m23896 = m23896(c1755, c1755.f6074, c2609);
        Object obj = m23896.f6073;
        try {
            m23928(c8672.f26444, m23896.m5877(c8672, obj));
            ((C8604) obj).f26285.mo26377();
            AbstractC11349 abstractC11349 = c8672.f26444;
            m23959(abstractC11349);
            if (!this.f28224.m25667(this.f28211, abstractC11349, this.f28249)) {
                AbstractC14016 abstractC14016 = ((C8604) this.f28211.f6073).f26285;
                C11003.requireNonNull(abstractC14016);
                C19846.forEach(c26092, new C3706(abstractC14016));
                C19846.forEach(c26092, new C18523());
            }
            this.f28223 = null;
        } catch (Throwable th) {
            ((C8604) obj).f26285.mo26377();
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        C1755 c1755 = this.f28211;
        AbstractC5144 abstractC5144 = c1755.f6074;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 m5877 = c1755.m5877(abstractC5144, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        Object obj = m5877.f6073;
        C7772 c7772 = C1856.f6336;
        try {
            m23956(c11907.f35587, m5877);
            AbstractC12612 abstractC12612 = c11907.f35588;
            if (abstractC12612 != null) {
                m23929((AbstractC5144) abstractC12612, m5877, (AbstractC4308) this.f28244.f66469);
                c7772 = this.f28218;
            }
            C2609 c2609 = c7772.f24023;
            C2609 c26092 = c7772.f24022;
            C1755 m23896 = m23896(m5877, m5877.f6074, c2609);
            try {
                m23896.f6074 = c11907;
                m23956(c11907.f35586, m23896);
                m23928(c11907.f35585, m23896);
                ((C8604) m23896.f6073).f26285.mo26377();
                this.f28223 = null;
                ((C8604) obj).f26285.mo26377();
                AbstractC11349 abstractC11349 = c11907.f35585;
                m23959(abstractC11349);
                if (this.f28224.m25667(this.f28211, abstractC11349, this.f28249)) {
                    return;
                }
                AbstractC14016 abstractC140162 = ((C8604) this.f28211.f6073).f26285;
                C11003.requireNonNull(abstractC140162);
                C19846.forEach(c26092, new C3706(abstractC140162));
                C19846.forEach(c26092, new C18523());
            } catch (Throwable th) {
                ((C8604) m23896.f6073).f26285.mo26377();
                throw th;
            }
        } catch (Throwable th2) {
            ((C8604) obj).f26285.mo26377();
            throw th2;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        AbstractC4308 m17511;
        C20661 c20661 = this.f28244;
        C15240 c15240 = this.f28214;
        C6319 c6319 = this.f28251;
        C1755 c1755 = this.f28211;
        AbstractC5144 abstractC5144 = c1755.f6074;
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 m5877 = c1755.m5877(abstractC5144, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        Object obj = m5877.f6073;
        try {
            AbstractC4308 m23930 = m23930(c4851.f15326, m5877, this.f28228);
            c6319.getClass();
            AbstractC4308 m17473 = C6319.m17473(m23930);
            c15240.m36202(c4851, m17473);
            AbstractC4308 m17515 = c6319.m17515(m17473);
            if (m17515 == null) {
                AbstractC4308 m17527 = c6319.m17527(c20661.f66506.f13890, m17473);
                C22364 c22364 = this.f28253;
                if (m17527 == null) {
                    AbstractC12612 abstractC12612 = c4851.f15326;
                    abstractC12612.getClass();
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(abstractC12612, new C12281("compiler", "foreach.not.applicable.to.type", m17473, C11886.f35472));
                    m17515 = c6319.m17535(m17473);
                } else {
                    C2609 mo12934 = m17527.mo12934();
                    if (mo12934.isEmpty()) {
                        m17511 = c20661.f66526;
                    } else {
                        m17511 = c6319.m17511((AbstractC4308) mo12934.f8240);
                    }
                    AbstractC4308 abstractC4308 = m17511;
                    if (c6319.m17527(c20661.f66512.f13890, this.f28231.m50300(c4851, m5877, c6319.m17526(m17473, false), this.f28229.f18883, C2609.m8239(), C2609.m8239()).f17560.mo12923()) == null) {
                        C12281 c122812 = C6241.f19132;
                        c22364.m7273(c4851, new C12281("compiler", "foreach.not.applicable.to.type", m17473, C11886.f35472));
                    }
                    m17515 = abstractC4308;
                }
            }
            if (c4851.f15325.m24209()) {
                C9378 c9378 = c4851.f15325;
                m23909(c4851.f15325, c15240.m36107(c9378, m17515, c9378.f28484));
            }
            m23928((AbstractC5144) c4851.f15325, m5877);
            AbstractC12612 abstractC126122 = c4851.f15326;
            abstractC126122.getClass();
            c15240.m36106(abstractC126122, m17515, c4851.f15325.f28489.f17560, c15240.f46781);
            m5877.f6074 = c4851;
            m23928(c4851.f15324, m5877);
            this.f28223 = null;
        } finally {
            ((C8604) obj).f26285.mo26377();
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        C1755 c1755 = this.f28211;
        while (true) {
            if (c1755 == null || c1755.f6074.m14709(EnumC18550.f57582)) {
                break;
            }
            if (c1755.f6074.m14709(EnumC18550.f57532)) {
                AbstractC10370 abstractC10370 = ((C17698) c1755.f6074).f54160;
                AbstractC10370 abstractC103702 = c17698.f54160;
                if (abstractC10370 == abstractC103702) {
                    C12281 c12281 = C6241.f19132;
                    this.f28253.m7273(c17698, new C12281("compiler", "label.already.in.use", abstractC103702));
                    break;
                }
            }
            c1755 = c1755.f6072;
        }
        AbstractC11349 abstractC11349 = c17698.f54159;
        C1755 c17552 = this.f28211;
        m23928(abstractC11349, c17552.m5877(c17698, c17552.f6073));
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        m23903(c22637, c22637.f73103, c22637.f73102, new BiConsumer() { // from class: l.ܿۙ֨
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }

            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C9310 c9310 = C9310.this;
                c9310.getClass();
                c9310.m23956(((C18963) obj).f59814, (C1755) obj2);
            }
        });
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        c4146.f13546 = m23898(c4146, EnumC18550.f57556, c4146.f13545, this.f28211);
        this.f28223 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23903(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612, C2609 c2609, BiConsumer biConsumer) {
        Object obj;
        boolean anyMatch;
        boolean z;
        C15240 c15240;
        boolean z2;
        boolean z3;
        C23420 c23420;
        C22406 c22406;
        C7254 c7254;
        boolean z4;
        C23168 c23168;
        C18963 c18963;
        C6319 c6319;
        C15240 c152402;
        HashSet hashSet;
        AbstractC4308 abstractC4308;
        C22406 c224062 = this.f28231;
        C20661 c20661 = this.f28244;
        C6319 c63192 = this.f28251;
        C1755 c1755 = this.f28211;
        C23420 c234202 = this.f28228;
        AbstractC4308 m23930 = m23930(abstractC12612, c1755, c234202);
        C1755 c17552 = this.f28211;
        C8604 c8604 = (C8604) c17552.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 m5877 = c17552.m5877(abstractC5144, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        Object obj2 = m5877.f6073;
        try {
            boolean z5 = (m23930.f13890.mo16084() & 16384) != 0;
            AbstractC4308 abstractC43082 = c20661.f66533;
            C7254 c72542 = c20661.f66452;
            boolean m17550 = c63192.m17550(m23930, abstractC43082);
            C1386 c1386 = c63192.f19598;
            boolean m19448 = C7260.m19448(abstractC12612, c2609);
            C23168 c231682 = this.f28232;
            if (!z5 && !m17550 && !m19448 && !c63192.m17531(m23930, c72542, c1386)) {
                c231682.m51346(abstractC12612, EnumC10637.f31989);
                anyMatch = true;
            } else {
                anyMatch = C5378.stream(c2609).flatMap(new C6416(8)).anyMatch(new C23461(0));
            }
            HashSet hashSet2 = new HashSet();
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            C2609 c26092 = c2609;
            C2609 m8239 = C2609.m8239();
            EnumC6652 enumC6652 = null;
            C7772 c7772 = null;
            while (true) {
                boolean m8249 = c26092.m8249();
                z = anyMatch;
                c15240 = this.f28214;
                if (!m8249) {
                    break;
                }
                obj = obj2;
                C2609 c26093 = c26092;
                C15240 c152403 = c15240;
                try {
                    C18963 c189632 = (C18963) c26093.f8240;
                    C22364 c22364 = this.f28253;
                    if (enumC6652 == null) {
                        enumC6652 = c189632.f59817;
                        c23420 = c234202;
                    } else {
                        c23420 = c234202;
                        if (enumC6652 != c189632.f59817 && !z9) {
                            c22364.m7273(c189632, C6241.f19280);
                            z9 = true;
                        }
                    }
                    Iterator it = c189632.f59815.iterator();
                    C7772 c77722 = c7772;
                    EnumC6652 enumC66522 = enumC6652;
                    C2609 c26094 = m8239;
                    boolean z10 = z8;
                    boolean z11 = z7;
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        AbstractC19669 abstractC19669 = (AbstractC19669) it.next();
                        if (abstractC19669.mo30871()) {
                            C18963 c189633 = c189632;
                            AbstractC12612 abstractC126122 = (AbstractC12612) abstractC19669;
                            if (C7260.m19429(abstractC126122)) {
                                c7254 = c72542;
                                c231682.m51346(abstractC126122, EnumC10637.f31995);
                                if (z10) {
                                    c22364.m7273(abstractC19669, C6241.f19297);
                                } else if (z7) {
                                    c22364.m7273(abstractC19669, C6241.f19158);
                                }
                                m23929((AbstractC5144) abstractC126122, m5877, m23930);
                                C7772 c77723 = this.f28218;
                                c23168 = c231682;
                                this.f28218 = new C7772(c77723.f24023, c77723.f24022, true);
                                c22406 = c224062;
                                c18963 = c189633;
                                c6319 = c63192;
                                z10 = true;
                            } else {
                                c7254 = c72542;
                                C6319 c63193 = c63192;
                                c23168 = c231682;
                                if (z5) {
                                    AbstractC5698 m23899 = m23899(m23930, abstractC126122);
                                    if (m23899 == null) {
                                        c22364.m7273(abstractC126122, C6241.f19282);
                                    } else if (!hashSet2.add(m23899)) {
                                        c22364.m7273(abstractC19669, C6241.f19297);
                                    } else {
                                        m23913(abstractC19669, c26094, m23899.f17560);
                                    }
                                } else if (m19448) {
                                    InterfaceC0369 interfaceC0369 = c224062.f72609;
                                    try {
                                        c224062.f72609 = c224062.f72576;
                                        m23929((AbstractC5144) abstractC19669, m5877, m23930);
                                    } finally {
                                        c224062.f72609 = interfaceC0369;
                                    }
                                } else {
                                    C15406 c15406 = C15406.f47178;
                                    EnumC9454 enumC9454 = EnumC9454.ERROR;
                                    if (m23930.m12913(enumC9454)) {
                                        c22406 = c224062;
                                        abstractC4308 = AbstractC4308.f13885;
                                    } else {
                                        c22406 = c224062;
                                        abstractC4308 = m23930;
                                    }
                                    AbstractC4308 m239302 = m23930(abstractC126122, m5877, new C23420(this, c15406, abstractC4308));
                                    if (!m239302.m12913(enumC9454)) {
                                        if (m239302.mo12915() == null) {
                                            AbstractC5698 m19472 = C7260.m19472(abstractC126122);
                                            if (m19472 != null && m19472.f17559 == EnumC1296.f4582 && this.f28230) {
                                                c22364.m7273(abstractC126122, C6241.f19147);
                                            } else {
                                                c22364.m7273(abstractC126122, m17550 ? C6241.f19131 : C6241.f19219);
                                            }
                                        } else {
                                            if (m17550) {
                                                c6319 = c63193;
                                            } else {
                                                c6319 = c63193;
                                                if (c6319.m17531(m23930, c7254, c1386)) {
                                                    c7254 = c7254;
                                                } else {
                                                    C12281 c12281 = C6241.f19132;
                                                    c7254 = c7254;
                                                    z4 = z5;
                                                    c22364.m7273(abstractC19669, new C12281("compiler", "constant.label.not.compatible", m239302, m23930));
                                                    c18963 = c189633;
                                                }
                                            }
                                            z4 = z5;
                                            if (!hashSet2.add(m239302.mo12915())) {
                                                c18963 = c189633;
                                                c22364.m7273(c18963, C6241.f19297);
                                            } else {
                                                c18963 = c189633;
                                                if (m239302.mo12941()) {
                                                    m239302 = c6319.m17496(m239302).f17560;
                                                }
                                                m23913(abstractC19669, c26094, m239302);
                                            }
                                        }
                                    }
                                    c18963 = c189633;
                                    c6319 = c63193;
                                }
                                c22406 = c224062;
                                c18963 = c189633;
                                c6319 = c63193;
                            }
                            z4 = z5;
                        } else {
                            c22406 = c224062;
                            c7254 = c72542;
                            z4 = z5;
                            c23168 = c231682;
                            c18963 = c189632;
                            c6319 = c63192;
                            if (!abstractC19669.m14709(EnumC18550.f57516)) {
                                C23420 c234203 = c23420;
                                m23930(abstractC19669, m5877, c234203);
                                C10083 m19457 = C7260.m19457((AbstractC21932) abstractC19669);
                                AbstractC4308 m25340 = m19457.m25340();
                                if (m25340.m12913(EnumC9454.TYPEVAR)) {
                                    c152402 = c152403;
                                } else {
                                    c152402 = c152403;
                                    m25340 = c152402.m36104(abstractC19669, m25340);
                                }
                                m23916(abstractC19669, m23930, m25340);
                                AbstractC4308 m17519 = c6319.m17519(m25340);
                                if (!m19457.m25341() || m17519.mo12948()) {
                                    hashSet = hashSet2;
                                    c23420 = c234203;
                                } else {
                                    hashSet = hashSet2;
                                    c23420 = c234203;
                                    if (c6319.m17546(c6319.m17519(m23930), m17519, true)) {
                                        if (z11) {
                                            c22364.m7273(abstractC19669, C6241.f19176);
                                        } else if (z6) {
                                            c22364.m7273(abstractC19669, C6241.f19218);
                                        }
                                        z11 = true;
                                    }
                                }
                                m23913(abstractC19669, c26094, m17519);
                                if (m19457.m25341() && !m17519.mo12948()) {
                                    c26094 = c26094.m8246(m17519);
                                }
                                c77722 = this.f28216.m6169(abstractC19669, c77722, this.f28218);
                                hashSet2 = hashSet;
                                c63192 = c6319;
                                c189632 = c18963;
                                c152403 = c152402;
                                it = it2;
                                c72542 = c7254;
                                c231682 = c23168;
                                z5 = z4;
                                c224062 = c22406;
                            } else {
                                if (z6) {
                                    c22364.m7273(abstractC19669, C6241.f19224);
                                } else if (z11) {
                                    c22364.m7273(abstractC19669, C6241.f19218);
                                }
                                this.f28218 = C1856.f6336;
                                z6 = true;
                            }
                        }
                        c152402 = c152403;
                        hashSet = hashSet2;
                        c77722 = this.f28216.m6169(abstractC19669, c77722, this.f28218);
                        hashSet2 = hashSet;
                        c63192 = c6319;
                        c189632 = c18963;
                        c152403 = c152402;
                        it = it2;
                        c72542 = c7254;
                        c231682 = c23168;
                        z5 = z4;
                        c224062 = c22406;
                    }
                    HashSet hashSet3 = hashSet2;
                    C22406 c224063 = c224062;
                    C7254 c72543 = c72542;
                    boolean z12 = z5;
                    C23168 c231683 = c231682;
                    C18963 c189634 = c189632;
                    C6319 c63194 = c63192;
                    C7772 c77724 = c77722;
                    C1755 m23896 = m23896(m5877, c189634, c77724.f24023);
                    try {
                        biConsumer.accept(c189634, m23896);
                        ((C8604) m23896.f6073).f26285.mo26377();
                        AbstractC14016 abstractC140162 = ((C8604) obj).f26285;
                        for (C2609 c26095 = c189634.f59814; c26095.m8249(); c26095 = c26095.f8241) {
                            AbstractC5144 abstractC51442 = (AbstractC5144) c26095.f8240;
                            if (abstractC51442.m14709(EnumC18550.f57578)) {
                                abstractC140162.mo26382(((C9378) abstractC51442).f28489);
                            }
                        }
                        m23959(c189634);
                        boolean m25666 = this.f28224.m25666(m23896, c189634, this.f28249);
                        c189634.f59816 = m25666;
                        if (c189634.f59817 != EnumC6652.STATEMENT || !m25666) {
                            c77724 = null;
                        }
                        hashSet2 = hashSet3;
                        c26092 = c26093.f8241;
                        z7 = z11;
                        z8 = z10;
                        obj2 = obj;
                        c234202 = c23420;
                        c72542 = c72543;
                        c231682 = c231683;
                        z5 = z12;
                        c224062 = c224063;
                        m8239 = c26094;
                        enumC6652 = enumC66522;
                        c7772 = c77724;
                        c63192 = c63194;
                        anyMatch = z;
                    } catch (Throwable th) {
                        ((C8604) m23896.f6073).f26285.mo26377();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ((C8604) obj).f26285.mo26377();
                    throw th;
                }
            }
            Object obj3 = obj2;
            if (z) {
                c15240.m36121(c2609);
            }
            if (abstractC5144.m14709(EnumC18550.f57558)) {
                C22637 c22637 = (C22637) abstractC5144;
                if (!z6 && !z7) {
                    z3 = false;
                    c22637.f73105 = z3;
                    ((C22637) abstractC5144).f73104 = z;
                }
                z3 = true;
                c22637.f73105 = z3;
                ((C22637) abstractC5144).f73104 = z;
            } else if (abstractC5144.m14709(EnumC18550.f57555)) {
                C13464 c13464 = (C13464) abstractC5144;
                if (!z6 && !z7) {
                    z2 = false;
                    c13464.f40196 = z2;
                    ((C13464) abstractC5144).f40195 = z;
                }
                z2 = true;
                c13464.f40196 = z2;
                ((C13464) abstractC5144).f40195 = z;
            } else {
                C12171.m29640(abstractC5144.mo989().name());
                throw null;
            }
            ((C8604) obj3).f26285.mo26377();
        } catch (Throwable th3) {
            th = th3;
            obj = obj2;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        c15433.f47248 = m23898(c15433, EnumC18550.f57519, c15433.f47247, this.f28211);
        this.f28223 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23913(AbstractC19669 abstractC19669, C2609 c2609, AbstractC4308 abstractC4308) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            if (this.f28251.m17546(abstractC4308, (AbstractC4308) it.next(), true)) {
                this.f28253.m7273(abstractC19669, C6241.f19158);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5698 m23899(AbstractC4308 abstractC4308, AbstractC12612 abstractC12612) {
        if (!abstractC12612.m14709(EnumC18550.f57566)) {
            return null;
        }
        C7673 c7673 = (C7673) abstractC12612;
        for (AbstractC5698 abstractC5698 : abstractC4308.f13890.mo16064().m20476(c7673.f23696)) {
            if (abstractC5698.f17559 == EnumC1296.f4567) {
                c7673.f23697 = abstractC5698;
                ((C12048) abstractC5698).m29425();
                c7673.f16086 = abstractC5698.f17560;
                if ((abstractC5698.f17563 & 16384) == 0) {
                    return null;
                }
                return abstractC5698;
            }
        }
        return null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1384(C7115 c7115) {
        AbstractC4308 abstractC4308;
        AbstractC19810 abstractC19810;
        this.f28214.m36201(c7115, m23930(c7115.f21831, this.f28211, this.f28228));
        C4824 c4824 = ((C8604) this.f28211.f6073).f26289;
        EnumC20347 enumC20347 = EnumC20347.SYNCHRONIZATION;
        if (c4824.m14055(enumC20347) && (abstractC4308 = c7115.f21831.f16086) != null && (abstractC19810 = abstractC4308.f13890) != null && (abstractC19810.mo16084() & 9007199254740992L) != 0) {
            this.f28253.m7286(enumC20347, c7115, C14001.f42342);
        }
        m23928(c7115.f21830, this.f28211);
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        boolean m8249;
        C1755 c1755;
        C8604 c8604;
        AbstractC14016 abstractC14016;
        C20661 c20661;
        C1755 m5877;
        C15240 c15240 = this.f28214;
        C1755 c17552 = this.f28211;
        C8604 c86042 = (C8604) c17552.f6073;
        AbstractC14016 abstractC140162 = c86042.f26285;
        C1755 m58772 = c17552.m5877(c10789, c86042.m22358(abstractC140162.mo26380(abstractC140162.f23673)));
        Object obj = m58772.f6073;
        try {
            m8249 = c10789.f32446.m8249();
            if (m8249) {
                C1755 c17553 = this.f28211;
                AbstractC14016 abstractC140163 = ((C8604) obj).f26285;
                c1755 = c17553.m5877(c10789, ((C8604) obj).m22358(abstractC140163.mo26380(abstractC140163.f23673)));
            } else {
                c1755 = m58772;
            }
            Iterator it = c10789.f32446.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c20661 = this.f28244;
                if (!hasNext) {
                    break;
                }
                AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
                C23420 c23420 = new C23420(this, C15406.f47179, c20661.f66531, new C21346(this, this.f28213.f75215));
                if (abstractC5144.m14709(EnumC18550.f57578)) {
                    m23928(abstractC5144, c1755);
                    c23420.mo13581(abstractC5144, abstractC5144.f16086);
                    m23944((InterfaceC3109) abstractC5144, m58772, abstractC5144.f16086);
                    ((C9378) abstractC5144).f28489.m29421(EnumC23258.RESOURCE_VARIABLE);
                } else {
                    m23930(abstractC5144, c1755, c23420);
                }
            }
            m23928(c10789.f32445, c1755);
            if (m8249) {
                ((C8604) c1755.f6073).f26285.mo26377();
            }
            for (C2609 c2609 = c10789.f32449; c2609.m8249(); c2609 = c2609.f8241) {
                C0617 c0617 = (C0617) c2609.f8240;
                AbstractC14016 abstractC140164 = ((C8604) obj).f26285;
                m5877 = m58772.m5877(c0617, ((C8604) obj).m22358(abstractC140164.mo26380(abstractC140164.f23673)));
                AbstractC4308 m23928 = m23928(c0617.f2373, m5877);
                if (c0617.f2373.f28488.m14709(EnumC18550.f57503)) {
                    c0617.f2373.f28489.f17563 |= 549755813904L;
                }
                C12048 c12048 = c0617.f2373.f28489;
                if (c12048.f17559 == EnumC1296.f4567) {
                    c12048.m29421(EnumC23258.EXCEPTION_PARAMETER);
                }
                AbstractC12612 abstractC12612 = c0617.f2373.f28488;
                abstractC12612.getClass();
                AbstractC12612 abstractC126122 = c0617.f2373.f28488;
                abstractC126122.getClass();
                c15240.m36106(abstractC12612, c15240.m36173(abstractC126122, m23928), c20661.f66479, c15240.f46781);
                m23928(c0617.f2372, m5877);
                ((C8604) m5877.f6073).f26285.mo26377();
            }
            AbstractC5144 abstractC51442 = c10789.f32448;
            if (abstractC51442 != null) {
                m23928(abstractC51442, m58772);
            }
            this.f28223 = null;
        } catch (Throwable th) {
            if (m8249) {
                obj = c1755.f6073;
            }
            throw th;
        } finally {
            ((C8604) obj).f26285.mo26377();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23944(InterfaceC3109 interfaceC3109, C1755 c1755, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo12948()) {
            return;
        }
        C20661 c20661 = this.f28244;
        AbstractC19810 abstractC19810 = c20661.f66531.f13890;
        C6319 c6319 = this.f28251;
        if (c6319.m17527(abstractC19810, abstractC4308) == null || c6319.m17550(abstractC4308, c20661.f66531)) {
            return;
        }
        C22364 c22364 = this.f28253;
        C8253 c8253 = new C8253(c22364);
        try {
            C22406 c22406 = this.f28231;
            AbstractC4308 m17526 = c6319.m17526(abstractC4308, false);
            AbstractC10370 abstractC10370 = this.f28229.f18851;
            C2609 m8239 = C2609.m8239();
            C2609 m82392 = C2609.m8239();
            c22406.getClass();
            AbstractC5698 m50313 = c22406.m50313(interfaceC3109, c1755, m17526.f13890, m17526, abstractC10370, m8239, m82392);
            c22364.m50112(c8253);
            if (m50313.f17559 == EnumC1296.f4571 && m50313.mo10962(c20661.f66496, abstractC4308.f13890, c6319, true)) {
                AbstractC4308 abstractC43082 = c20661.f66486;
                C2609 mo12930 = c6319.m17543(m50313, abstractC4308).mo12930();
                C15240 c15240 = this.f28214;
                if (c15240.m36184(abstractC43082) || c15240.m36200(abstractC43082, mo12930)) {
                    C4824 c4824 = ((C8604) c1755.f6073).f26289;
                    EnumC20347 enumC20347 = EnumC20347.TRY;
                    if (c4824.m14055(enumC20347)) {
                        C11076 c11076 = C14001.f42334;
                        c22364.m7286(enumC20347, interfaceC3109, new C11076("compiler", "try.resource.throws.interrupted.exc", abstractC4308));
                    }
                }
            }
        } catch (Throwable th) {
            c22364.m50112(c8253);
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        C23420 mo38522;
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC43082;
        AbstractC4308 m23929 = m23929((AbstractC5144) c8379.f25701, this.f28211, (AbstractC4308) this.f28244.f66469);
        C7772 c7772 = this.f28218;
        EnumC19816 enumC19816 = (!this.f28241 || !(!this.f28213.f75219.m12913(EnumC9454.NONE) || (abstractC43082 = this.f28213.f75219) == AbstractC4308.f13884 || abstractC43082 == C6735.f20919) || m23915(this.f28211, c8379)) ? EnumC19816.STANDALONE : EnumC19816.POLY;
        c8379.f13845 = enumC19816;
        if (enumC19816 == EnumC19816.POLY && this.f28213.f75219.m12913(EnumC9454.VOID)) {
            this.f28213.f75215.mo1084(c8379, this.f28210.m16617(C11886.f35443));
            C12193 m17535 = this.f28251.m17535(this.f28213.f75219);
            c8379.f16086 = m17535;
            this.f28223 = m17535;
            return;
        }
        EnumC19816 enumC198162 = c8379.f13845;
        EnumC19816 enumC198163 = EnumC19816.STANDALONE;
        if (enumC198162 == enumC198163) {
            mo38522 = this.f28228;
        } else {
            C23420 c23420 = this.f28213;
            mo38522 = c23420.mo38522(new C19935(this, c23420.f75215));
        }
        C1755 c1755 = this.f28211;
        C1755 m23896 = m23896(c1755, c1755.f6074, c7772.f24023);
        Object obj = m23896.f6073;
        try {
            AbstractC4308 m23930 = m23930(c8379.f25699, m23896, mo38522);
            ((C8604) obj).f26285.mo26377();
            C7772 c77722 = this.f28218;
            C1755 c17552 = this.f28211;
            C1755 m238962 = m23896(c17552, c17552.f6074, c7772.f24022);
            obj = m238962.f6073;
            try {
                AbstractC4308 m239302 = m23930(c8379.f25700, m238962, mo38522);
                ((C8604) obj).f26285.mo26377();
                C7772 c77723 = this.f28218;
                if (c8379.f13845 != enumC198163) {
                    abstractC4308 = this.f28213.f75219;
                } else {
                    AbstractC12612 abstractC12612 = c8379.f25699;
                    abstractC12612.getClass();
                    AbstractC12612 abstractC126122 = c8379.f25700;
                    abstractC126122.getClass();
                    abstractC4308 = m23924(C2609.of((Object) abstractC12612, (Object) abstractC126122), C2609.of((Object) m23930, (Object) m239302));
                }
                if (m23929.mo12915() != null && m23930.mo12915() != null && m239302.mo12915() != null && !abstractC4308.m12913(EnumC9454.NONE)) {
                    if (!m23929.mo12935()) {
                        m23930 = m239302;
                    }
                    abstractC4308 = this.f28239.m13641(m23930, abstractC4308);
                }
                this.f28223 = m23934(c8379, abstractC4308, C15406.f47181, this.f28213);
                this.f28218 = this.f28216.m6166(c8379, c7772, c77722, c77723);
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23915(C1755 c1755, AbstractC12612 abstractC12612) {
        AbstractC4308 abstractC4308;
        int i = C0883.f3449[abstractC12612.mo989().ordinal()];
        C23420 c23420 = this.f28228;
        C5572 c5572 = this.f28227;
        C12399 c12399 = this.f28247;
        switch (i) {
            case 1:
                EnumC9454 enumC9454 = ((C23342) abstractC12612).f74996;
                return enumC9454.m24299(EnumC9454.DOUBLE) || enumC9454 == EnumC9454.BOOLEAN || enumC9454 == EnumC9454.BOT;
            case 2:
            case 3:
                return false;
            case 4:
                return m23915(c1755, ((C14875) abstractC12612).f45392);
            case 5:
                C8379 c8379 = (C8379) abstractC12612;
                return m23915(c1755, c8379.f25699) && m23915(c1755, c8379.f25700);
            case 6:
                c5572.getClass();
                C15580 c15580 = (C15580) c12399.m30568(abstractC12612, c1755, c23420, c12399.f37339, null, EnumC7480.SPECULATIVE, new C21095(c5572));
                AbstractC5698 m19472 = C7260.m19472(c15580.f48011);
                if (c15580.f48011.m14709(EnumC18550.f57566)) {
                    abstractC4308 = c1755.f6079.f16086;
                } else {
                    abstractC4308 = ((C6262) c15580.f48011).f19397.f16086;
                }
                return m23958(this.f28251.m17543(m19472, abstractC4308).mo12923());
            case 7:
                AbstractC12612 abstractC126122 = (AbstractC12612) this.f28235.mo23617(((C19110) abstractC12612).f60196);
                c5572.getClass();
                return m23958(((AbstractC12612) c12399.m30568(abstractC126122, c1755, this.f28226, c12399.f37339, null, EnumC7480.SPECULATIVE, new C21095(c5572))).f16086);
            default:
                c5572.getClass();
                return m23958(c12399.m30568(abstractC12612, c1755, c23420, c12399.f37339, null, EnumC7480.SPECULATIVE, new C21095(c5572)).f16086);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m23958(AbstractC4308 abstractC4308) {
        return (abstractC4308.m12913(EnumC9454.TYPEVAR) || abstractC4308.mo12948() || !this.f28251.m17559(abstractC4308).mo12941()) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23924(C2609 c2609, C2609 c26092) {
        boolean isEmpty = c26092.isEmpty();
        C20661 c20661 = this.f28244;
        if (isEmpty) {
            return c20661.f66526;
        }
        final AbstractC4308 abstractC4308 = (AbstractC4308) c26092.f8240;
        if (C5378.stream(c26092.f8241).allMatch(new Predicate() { // from class: l.۬᩶֨
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
                return C9310.this.f28251.m17550(abstractC4308, (AbstractC4308) obj);
            }
        })) {
            return abstractC4308.mo2973();
        }
        C2609 c26093 = (C2609) C5378.stream(c26092).map(new C10511(0, this)).collect(C2609.m8240());
        if (C5378.stream(c26093).allMatch(new C4464(2))) {
            Iterator it = c26093.iterator();
            while (it.hasNext()) {
                final AbstractC4308 abstractC43082 = (AbstractC4308) it.next();
                if (abstractC43082.mo3258().m24297(EnumC9454.INT) && C5378.stream(c26093).filter(new Predicate() { // from class: l.ۛ᩶֨
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
                        return ((AbstractC4308) obj) != AbstractC4308.this;
                    }
                }).allMatch(new C11922(0, this, abstractC43082))) {
                    return abstractC43082.mo2973();
                }
            }
            for (EnumC9454 enumC9454 : f28209) {
                final AbstractC4308 abstractC43083 = c20661.f66461[enumC9454.ordinal()];
                if (C5378.stream(c26093).allMatch(new Predicate() { // from class: l.᩺᩶֨
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
                        return C9310.this.f28251.m17546((AbstractC4308) obj, abstractC43083, true);
                    }
                })) {
                    return abstractC43083;
                }
            }
        }
        C2609 c26094 = (C2609) C5378.stream(c26092).map(new C7688(0, this)).collect(C2609.m8240());
        Iterator it2 = c26094.iterator();
        while (it2.hasNext()) {
            final AbstractC4308 abstractC43084 = (AbstractC4308) it2.next();
            if (C5378.stream(c26094).filter(new Predicate() { // from class: l.֫ۙ֨
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
                    return ((AbstractC4308) obj) != AbstractC4308.this;
                }
            }).allMatch(new C10762(this, abstractC43084))) {
                return abstractC43084.mo2973();
            }
        }
        return this.f28251.m17548((C2609) C5378.stream((C2609) C5378.stream(c26094).map(new C16405(0, this, c2609.iterator())).collect(C2609.m8240())).map(new C7033(5)).filter(new C12627(0)).collect(C2609.m8240()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1755 m23896(C1755 c1755, AbstractC5144 abstractC5144, C2609 c2609) {
        C8604 c8604 = (C8604) c1755.f6073;
        AbstractC14016 abstractC14016 = c8604.f26285;
        C1755 m5877 = c1755.m5877(abstractC5144, c8604.m22358(abstractC14016.mo26380(abstractC14016.f23673)));
        AbstractC14016 abstractC140162 = ((C8604) m5877.f6073).f26285;
        C11003.requireNonNull(abstractC140162);
        C19846.forEach(c2609, new C3706(abstractC140162));
        return m5877;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        boolean z;
        m23929((AbstractC5144) c1470.f5225, this.f28211, (AbstractC4308) this.f28244.f66469);
        C7772 c7772 = this.f28218;
        C1755 c1755 = this.f28211;
        C2609 c2609 = c7772.f24023;
        C2609 c26092 = c7772.f24022;
        C1755 m23896 = m23896(c1755, c1755.f6074, c2609);
        Object obj = m23896.f6073;
        try {
            m23928(c1470.f5226, m23896);
            ((C8604) obj).f26285.mo26377();
            m23959(c1470.f5226);
            C1755 c17552 = this.f28211;
            AbstractC11349 abstractC11349 = c1470.f5226;
            C10222 c10222 = this.f28224;
            C17013 c17013 = this.f28249;
            boolean m25666 = c10222.m25666(c17552, abstractC11349, c17013);
            if (c1470.f5227 != null) {
                C1755 c17553 = this.f28211;
                C1755 m238962 = m23896(c17553, c17553.f6074, c26092);
                obj = m238962.f6073;
                try {
                    m23928(c1470.f5227, m238962);
                    ((C8604) obj).f26285.mo26377();
                    m23959(c1470.f5227);
                    z = c10222.m25666(this.f28211, c1470.f5227, c17013);
                } finally {
                }
            } else {
                z = true;
            }
            this.f28214.m36118(c1470);
            C2609 m8239 = C2609.m8239();
            if (m25666 && !z) {
                c26092 = c7772.f24023;
            } else if (!z || m25666) {
                c26092 = m8239;
            }
            AbstractC14016 abstractC14016 = ((C8604) this.f28211.f6073).f26285;
            C11003.requireNonNull(abstractC14016);
            C19846.forEach(c26092, new C3706(abstractC14016));
            C19846.forEach(c26092, new C18523());
            this.f28223 = null;
        } finally {
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23959(AbstractC5144 abstractC5144) {
        this.f28225.m21193();
        new C4412(this).mo10758(abstractC5144);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1394(C10496 c10496) {
        C1755 c1755 = this.f28211;
        m23930(c10496.f31483, c1755.m5877(c10496, c1755.f6073), this.f28228);
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        C12281 c12281;
        C1755 c1755 = this.f28211;
        C23420 c23420 = ((C8604) c1755.f6073).f26286;
        if (c23420 != null) {
            m23930(c2322.f7456, c1755, c23420);
            c2322.f7455 = m23898(c2322, EnumC18550.f57493, this.f28229.f18867, this.f28211);
        } else {
            if (c2322.f7456.m14709(EnumC18550.f57482)) {
                c12281 = C6241.f19125;
            } else {
                c12281 = C6241.f19273;
            }
            this.f28253.m7273(c2322, c12281);
            m23930(c2322.f7456, this.f28211, this.f28228);
        }
        this.f28223 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.AbstractC5144 m23898(l.AbstractC11349 r8, l.EnumC18550 r9, l.AbstractC10370 r10, l.C1755 r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.m23898(l.ۨ֡۠, l.ᩴۚ۠, l.ۤܶ۠, l.֫ۤ֨):l.ۚۚ۠");
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        C8526 c8526;
        C1755 c1755 = this.f28211;
        C8604 c8604 = (C8604) c1755.f6073;
        C23420 c23420 = c8604.f26284;
        C22364 c22364 = this.f28253;
        if (c23420 == null) {
            c22364.m7273(c9938, C6241.f19175);
        } else if (c8604.f26286 != null) {
            c22364.m7273(c9938, C6241.f19286);
        } else if (!c8604.f26294 && !c8604.f26291 && (c8526 = c1755.f6077) != null && C7260.m19454(c8526)) {
            C8526 c85262 = this.f28211.f6077;
            c22364.m7273(c85262, C6241.m17187(C11886.f35486, c85262.f26045.f17562, C11886.f35512));
        } else {
            AbstractC12612 abstractC12612 = c9938.f30017;
            C5931 c5931 = this.f28210;
            if (abstractC12612 != null) {
                if (((C8604) this.f28211.f6073).f26284.f75219.m12913(EnumC9454.VOID)) {
                    InterfaceC3953 interfaceC3953 = ((C8604) this.f28211.f6073).f26284.f75215;
                    AbstractC12612 abstractC126122 = c9938.f30017;
                    abstractC126122.getClass();
                    interfaceC3953.mo1084(abstractC126122, c5931.m16617(C11886.f35457));
                }
                AbstractC12612 abstractC126123 = c9938.f30017;
                C1755 c17552 = this.f28211;
                m23930(abstractC126123, c17552, ((C8604) c17552.f6073).f26284);
            } else if (!((C8604) this.f28211.f6073).f26284.f75219.m12913(EnumC9454.VOID) && !((C8604) this.f28211.f6073).f26284.f75219.m12913(EnumC9454.NONE)) {
                C23420 c234202 = ((C8604) this.f28211.f6073).f26284;
                c234202.f75215.mo1084(c9938, c5931.m16617(C11886.m29010(c234202.f75219)));
            }
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        AbstractC12612 abstractC12612 = c1616.f5680;
        C1755 c1755 = this.f28211;
        C20661 c20661 = this.f28244;
        boolean z = this.f28241;
        AbstractC4308 m23929 = m23929((AbstractC5144) abstractC12612, c1755, z ? AbstractC4308.f13885 : c20661.f66479);
        if (z) {
            AbstractC4308 abstractC4308 = c20661.f66479;
            C15240 c15240 = this.f28214;
            c15240.m36106(c1616, m23929, abstractC4308, c15240.f46781);
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1383(C6968 c6968) {
        m23929((AbstractC5144) c6968.f21475, this.f28211, (AbstractC4308) this.f28244.f66469);
        AbstractC12612 abstractC12612 = c6968.f21476;
        if (abstractC12612 != null) {
            this.f28214.m36202(abstractC12612, m23930(abstractC12612, this.f28211, this.f28228));
        }
        this.f28223 = null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        AbstractC4308 abstractC4308;
        C15406 c15406;
        C2609 c2609;
        char c;
        AbstractC4308 abstractC43082;
        C20661 c20661;
        C1755 c1755 = this.f28211;
        C8604 c8604 = (C8604) c1755.f6073;
        C1755 m5877 = c1755.m5877(c15580, c8604.m22358(c8604.f26285));
        Object obj = m5877.f6073;
        AbstractC10370 m19462 = C7260.m19462(c15580.f48011);
        C6136 c6136 = this.f28229;
        AbstractC10370 abstractC10370 = c6136.f18886;
        AbstractC10370 abstractC103702 = c6136.f18898;
        boolean z = m19462 == abstractC10370 || m19462 == abstractC103702;
        C18837 c18837 = new C18837();
        C15240 c15240 = this.f28214;
        if (z) {
            m23952(c15580, this.f28211.f6077, true);
            C8604 c86042 = (C8604) obj;
            c86042.f26299 = true;
            C15406 m23940 = m23940(C15406.f47187, c15580.f48012, m5877, c18837);
            C2609 m43517 = c18837.m43517();
            C2609 c26092 = c15580.f48010;
            C2609 m23923 = m23923(c26092, m5877);
            c15240.m36123(c26092, m23923);
            AbstractC4308 abstractC43083 = this.f28211.f6079.f17186.f17560;
            C22364 c22364 = this.f28253;
            C20661 c206612 = this.f28244;
            if (m19462 == abstractC103702) {
                AbstractC4308 abstractC43084 = c206612.f66526;
                C6319 c6319 = this.f28251;
                if (abstractC43083 == abstractC43084) {
                    AbstractC12612 abstractC12612 = c15580.f48011;
                    abstractC12612.getClass();
                    C12281 c12281 = C6241.f19132;
                    c2609 = m23923;
                    c15406 = m23940;
                    c22364.m7273(abstractC12612, new C12281("compiler", "no.superclass", abstractC43083));
                    abstractC43082 = c6319.m17535(c206612.f66526);
                } else {
                    c15406 = m23940;
                    c2609 = m23923;
                    abstractC43082 = c6319.m17562(abstractC43083);
                }
                c = 0;
            } else {
                c15406 = m23940;
                c2609 = m23923;
                c = 0;
                abstractC43082 = abstractC43083;
            }
            if (abstractC43082.m12913(EnumC9454.CLASS)) {
                AbstractC4308 mo4958 = abstractC43082.mo4958();
                while (mo4958 != null && mo4958.m12913(EnumC9454.TYPEVAR)) {
                    mo4958 = mo4958.mo12939();
                }
                if (mo4958.m12913(EnumC9454.CLASS)) {
                    if (c15580.f48011.m14709(EnumC18550.f57581)) {
                        AbstractC12612 abstractC126122 = ((C6262) c15580.f48011).f19397;
                        abstractC126122.getClass();
                        c15240.m36201(abstractC126122, m23929((AbstractC5144) abstractC126122, m5877, mo4958));
                    } else if (m19462 == abstractC103702) {
                        AbstractC12612 abstractC126123 = c15580.f48011;
                        abstractC126123.getClass();
                        this.f28231.m50302((InterfaceC3109) abstractC126123, m5877, abstractC43082, true);
                    }
                } else if (c15580.f48011.m14709(EnumC18550.f57581)) {
                    AbstractC12612 abstractC126124 = c15580.f48011;
                    abstractC126124.getClass();
                    AbstractC19810 abstractC19810 = abstractC43082.f13890;
                    C12281 c122812 = C6241.f19132;
                    Object[] objArr = new Object[1];
                    objArr[c] = abstractC19810;
                    c22364.m7273(abstractC126124, new C12281("compiler", "illegal.qual.not.icls", objArr));
                    m23929((AbstractC5144) ((C6262) c15580.f48011).f19397, m5877, abstractC43082);
                }
                if (abstractC43082.f13890 == c206612.f66527) {
                    m43517 = m43517.m8246(c206612.f66452).m8246(c206612.f66533);
                }
                boolean z2 = c86042.f26296;
                c86042.f26296 = true;
                c86042.f26288 = null;
                AbstractC12612 abstractC126125 = c15580.f48011;
                abstractC126125.getClass();
                C2609 c26093 = c2609;
                AbstractC5698 m50312 = this.f28231.m50312(abstractC126125, m5877, abstractC43082, m43517, c26093);
                c86042.f26296 = z2;
                C7260.m19459(m50312, c15580.f48011);
                c20661 = c206612;
                m23932(c15580.f48011, abstractC43082, m50312, m5877, new C23420(this, c15406, m23925(this.f28213.f75219, m43517, c26093)));
            } else {
                c20661 = c206612;
                if (abstractC43082.m12913(EnumC9454.ERROR) && c15580.f48011.m14709(EnumC18550.f57581)) {
                    m23929((AbstractC5144) ((C6262) c15580.f48011).f19397, m5877, abstractC43082);
                }
            }
            C1485 c1485 = c20661.f66501;
            c15580.f16086 = c1485;
            this.f28223 = c1485;
        } else {
            C15406 c154062 = C15406.f47181;
            C15406 m239402 = m23940(c154062, c15580.f48012, m5877, c18837);
            C2609 m435172 = c18837.m43517();
            C2609 m239232 = m23923(c15580.f48010, m5877);
            AbstractC4308 m23925 = m23925(this.f28213.f75219, m435172, m239232);
            ((C8604) obj).f26288 = null;
            AbstractC4308 m23930 = m23930(c15580.f48011, m5877, new C23420(this, m239402, m23925, this.f28213.f75215));
            AbstractC4308 mo12923 = m23930.mo12923();
            if (mo12923.m12913(EnumC9454.WILDCARD)) {
                throw new AssertionError(m23930);
            }
            if (c15580.f48011.m14709(EnumC18550.f57581)) {
                abstractC4308 = ((C6262) c15580.f48011).f19397.f16086;
            } else {
                abstractC4308 = this.f28211.f6079.f17186.f17560;
            }
            AbstractC4308 m23935 = m23935(C7260.m19472(c15580.f48011), abstractC4308, m19462, m435172, mo12923);
            c15240.m36123(c15580.f48010, m239232);
            this.f28223 = m23934(c15580, this.f28213.f75215.mo3857().m1860((AbstractC5144) c15580, m23935, true), c154062, this.f28213);
        }
        c15240.m36122(c15580.f48010, m5877);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23935(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, AbstractC4308 abstractC43082) {
        C6319 c6319 = this.f28251;
        C6136 c6136 = this.f28229;
        C20661 c20661 = this.f28244;
        if (abstractC5698 != null && abstractC5698.f17561 == c20661.f66526.f13890 && abstractC10370 == c6136.f18828 && c2609.isEmpty()) {
            return new C19955(abstractC43082.mo4958(), C2609.of((Object) new C19831(c6319.m17519(abstractC4308.mo2973()), EnumC15678.EXTENDS, c20661.f66480)), abstractC43082.f13890, abstractC43082.m12921());
        }
        return (abstractC5698 != null && abstractC5698.f17561 == c20661.f66505 && abstractC10370 == c6136.f18902 && c6319.m17512(abstractC4308)) ? abstractC4308 : abstractC43082;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23952(C15580 c15580, C8526 c8526, boolean z) {
        if (c8526 != null && c8526.f26044 == this.f28229.f18879) {
            C2735 c2735 = c8526.f26043;
            if (((AbstractC11349) c2735.f8521.f8240).m14709(EnumC18550.f57478) && ((C10496) c2735.f8521.f8240).f31483 == c15580) {
                return true;
            }
        }
        if (z) {
            AbstractC10370 m19462 = C7260.m19462(c15580.f48011);
            C12281 c12281 = C6241.f19132;
            this.f28253.m7273(c15580, new C12281("compiler", "call.must.be.first.stmt.in.ctor", m19462));
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23925(AbstractC4308 abstractC4308, C2609 c2609, C2609 c26092) {
        C10658 c10658 = new C10658(c2609, abstractC4308, C2609.m8239(), this.f28244.f66481);
        return c26092 == null ? c10658 : new C10077(c10658, c26092);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01df, code lost:
    
        if (r5.f28487 == r30) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0355  */
    /* JADX WARN: Type inference failed for: r1v39, types: [l.ۙ֨֨] */
    /* JADX WARN: Type inference failed for: r29v0, types: [l.ۢۗ֨] */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1419(final l.C19110 r30) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.mo1419(l.᩵֡۠):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23912(final C19110 c19110, final AbstractC12612 abstractC12612, AbstractC4308 abstractC4308, final C5557 c5557, final C1755 c1755, final C2609 c2609, final C2609 c26092, final C15406 c15406) {
        C1755 c17552;
        C6319 c6319;
        AbstractC4308 abstractC43082;
        AbstractC4308 abstractC43083;
        C15240 c15240;
        char c;
        C11576 c11576;
        AbstractC4308 abstractC43084;
        AbstractC4308 abstractC43085;
        C0384 mo3857 = this.f28213.f75215.mo3857();
        boolean m19449 = C7260.m19449(c19110);
        C6319 c63192 = this.f28251;
        C15240 c152402 = this.f28214;
        if (m19449 && (((abstractC43084 = c19110.f60192) != null && abstractC43084.m12928(mo3857.f1817)) || ((abstractC43085 = c19110.f60196.f16086) != null && abstractC43085.m12928(mo3857.f1817)))) {
            final C23420 c23420 = this.f28213;
            mo3857.m1864(C2609.of((Object) c19110.f60192, (Object) c19110.f60196.f16086), new InterfaceC3748() { // from class: l.ܳۙ֨
                @Override // l.InterfaceC3748
                /* renamed from: ֫ */
                public final void mo4673(C0384 c0384) {
                    C9310.m23906(C9310.this, c19110, abstractC12612, c23420, c5557, c1755, c2609, c26092, c15406, c0384);
                }
            });
            c17552 = c1755;
            abstractC43083 = abstractC4308;
            c6319 = c63192;
            c15240 = c152402;
        } else {
            if (m19449 && abstractC4308.m12913(EnumC9454.CLASS)) {
                c152402.getClass();
                C18837 c18837 = new C18837();
                Iterator it = ((C19955) abstractC4308).mo12934().iterator();
                while (it.hasNext()) {
                    AbstractC4308 abstractC43086 = (AbstractC4308) it.next();
                    if (!C15240.m36092(abstractC43086)) {
                        c18837.m43511(abstractC43086);
                    }
                }
                C2609 m43517 = c18837.m43517();
                if (!abstractC4308.mo12948() && m43517.m8249()) {
                    AbstractC19810 abstractC19810 = abstractC4308.f13890;
                    C11576 c115762 = C11886.f35440;
                    C11576 c115763 = new C11576("compiler", "diamond", abstractC19810);
                    AbstractC12612 abstractC126122 = c19110.f60196;
                    abstractC126122.getClass();
                    if (m43517.m8245() <= 1) {
                        c = 0;
                        c11576 = new C11576("compiler", "diamond.invalid.arg", m43517, c115763);
                    } else {
                        c = 0;
                        c11576 = new C11576("compiler", "diamond.invalid.args", m43517, c115763);
                    }
                    C12281 c12281 = C6241.f19132;
                    Object[] objArr = new Object[2];
                    objArr[c] = c115763;
                    objArr[1] = c11576;
                    this.f28253.m7273(abstractC126122, new C12281("compiler", "cant.apply.diamond.1", objArr));
                }
                Iterator it2 = abstractC4308.mo12938().iterator();
                while (it2.hasNext()) {
                    this.f28231.f72575.m21837(this.f28211, (AbstractC4308) it2.next());
                }
            }
            if (abstractC4308.f13890.m16070() || (abstractC4308.mo12948() && !abstractC4308.mo12947().m12913(EnumC9454.NONE) && abstractC4308.mo12947().f13890.m16070())) {
                c5557.f17183 = C2609.of((Object) abstractC12612);
            } else {
                c5557.f17184 = abstractC12612;
            }
            if (this.f28213.f75215.mo3860().f20970 == EnumC13829.CHECK && m23951(abstractC4308)) {
                c17552 = c1755;
                ((C8604) c17552.f6073).f26287 = true;
            } else {
                c17552 = c1755;
            }
            m23928(c5557, c17552);
            C2609 m8246 = (c19110.f60199 == null || abstractC4308.f13890.m16070()) ? c2609 : c2609.m8246(c19110.f60199.f16086);
            if (m19449 && c15406.m36457(C15406.f47180)) {
                m8246 = m8246.m8243((Function) this.f28247.f37348);
            }
            C2609 c26093 = m8246;
            if (abstractC4308.m12913(EnumC9454.ERROR)) {
                c6319 = c63192;
                abstractC43082 = c6319.m17535(c5557.f17186.f17560);
            } else {
                c6319 = c63192;
                abstractC43082 = c5557.f17186.f17560;
            }
            abstractC43083 = abstractC43082;
            AbstractC5698 m50312 = this.f28231.m50312(c19110, c1755, abstractC43083, c26093, c26092);
            c19110.f60194 = m50312;
            C12171.m29642(!m50312.f17559.m4393());
            c19110.f60194 = m50312;
            c15240 = c152402;
            c19110.f60192 = m23932(c19110, abstractC43083, m50312, c1755, new C23420(this, c15406, m23925(this.f28244.f66501, c26093, c26092), c15240.f46781, EnumC22756.f73480));
        }
        AbstractC5698 abstractC5698 = c19110.f60194;
        if (abstractC5698 == null || abstractC5698.f17559 != EnumC1296.f4571) {
            abstractC43083 = c6319.m17535(c19110.f16086);
        }
        this.f28223 = m23934(c19110, abstractC43083, C15406.f47181, this.f28213.mo38525(EnumC22756.f73481));
        c15240.m36122(c19110.f60198, c17552);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23906(C9310 c9310, C19110 c19110, AbstractC12612 abstractC12612, C23420 c23420, C5557 c5557, C1755 c1755, C2609 c2609, C2609 c26092, C15406 c15406, C0384 c0384) {
        c19110.f60192 = c0384.m1859(c19110.f60192);
        AbstractC12612 abstractC126122 = c19110.f60196;
        AbstractC4308 m1859 = c0384.m1859(abstractC12612.f16086);
        abstractC12612.f16086 = m1859;
        abstractC126122.f16086 = m1859;
        C23420 c234202 = c9310.f28213;
        try {
            c9310.f28213 = c23420;
            c9310.m23912(c19110, abstractC12612, abstractC12612.f16086, c5557, c1755, c2609, c26092, c15406);
        } finally {
            c9310.f28213 = c234202;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m23939(AbstractC12612 abstractC12612) {
        if (abstractC12612.mo989() != EnumC18550.f57548) {
            AbstractC10370 m19462 = C7260.m19462(abstractC12612);
            C6136 c6136 = this.f28229;
            if (m19462 != c6136.f18886 && m19462 != c6136.f18898) {
                EnumC18550 enumC18550 = EnumC18550.f57560;
                int i = abstractC12612.f16085;
                C17013 c17013 = this.f28249;
                c17013.f52172 = i;
                C6555 m39913 = c17013.m39913(enumC18550, abstractC12612);
                m39913.f2830 = this.f28220.m25478(abstractC12612, enumC18550, abstractC12612.f16086);
                m39913.f16086 = abstractC12612.f16086;
                return m39913;
            }
        }
        return abstractC12612;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        AbstractC4308 m17535;
        AbstractC5698 abstractC5698;
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC43082;
        AbstractC4308 abstractC43083 = c18404.f16086;
        C6319 c6319 = this.f28251;
        C12193 m175352 = c6319.m17535(abstractC43083);
        C1755 c1755 = this.f28211;
        C1755 m5877 = c1755.m5877(c18404, c1755.f6073);
        AbstractC12612 abstractC12612 = c18404.f57138;
        C22364 c22364 = this.f28253;
        C20661 c20661 = this.f28244;
        if (abstractC12612 != null) {
            abstractC43082 = m23954(abstractC12612, m5877, AbstractC4308.f13885);
            this.f28214.m36137((AbstractC5144) c18404.f57138, m5877, true);
            C2609 c2609 = c18404.f57140;
            abstractC4308 = abstractC43082;
            while (c2609.m8249()) {
                m23929((AbstractC5144) c2609.f8240, m5877, (AbstractC4308) c20661.f66452);
                C5138 c5138 = new C5138(abstractC4308, c20661.f66505);
                c2609 = c2609.f8241;
                abstractC4308 = c5138;
            }
        } else {
            if (this.f28213.f75219.m12913(EnumC9454.ARRAY)) {
                m17535 = c6319.m17515(this.f28213.f75219);
            } else {
                if (!this.f28213.f75219.m12913(EnumC9454.ERROR) && ((abstractC5698 = ((C8604) this.f28211.f6073).f26293) == null || !abstractC5698.f17560.mo12948())) {
                    AbstractC4308 abstractC43084 = this.f28213.f75219;
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(c18404, new C12281("compiler", "illegal.initializer.for.type", abstractC43084));
                }
                m17535 = c6319.m17535(this.f28213.f75219);
            }
            AbstractC4308 abstractC43085 = m17535;
            abstractC4308 = m175352;
            abstractC43082 = abstractC43085;
        }
        C2609 c26092 = c18404.f57139;
        if (c26092 != null) {
            C18837 c18837 = new C18837();
            while (c26092.m8249()) {
                c18837.m43511(m23929((AbstractC5144) c26092.f8240, m5877, abstractC43082));
                c26092 = c26092.f8241;
            }
            c18837.m43517();
            abstractC4308 = new C5138(abstractC43082, c20661.f66505);
        }
        if (!c6319.m17477(abstractC43082)) {
            c22364.m7273(c18404, C6241.f19293);
        }
        this.f28223 = m23934(c18404, abstractC4308, C15406.f47181, this.f28213);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x034a, code lost:
    
        if (r23.f28223 == l.AbstractC4308.f13884) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x034c, code lost:
    
        r23.f28223 = r1;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x030e, code lost:
    
        if (r23.f28223 == l.AbstractC4308.f13884) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0303  */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1217(l.C14169 r24) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.mo1217(l.ܳ֡۠):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6487 m23938(AbstractC4293 abstractC4293, C23420 c23420, C2609 c2609) {
        AbstractC4308 c10658;
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC43082 = c23420.f75219;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        AbstractC4308 abstractC43083 = AbstractC4308.f13884;
        C6319 c6319 = this.f28251;
        if (abstractC43082 != abstractC43083) {
            C2086 c2086 = this.f28237;
            c2086.getClass();
            AbstractC4308 abstractC43084 = (AbstractC4308) abstractC43082.mo2962(c2086, abstractC4293);
            abstractC43084.getClass();
            boolean z = abstractC43084 instanceof C5843;
            C6735 c6735 = this.f28252;
            if (z) {
                C18837 c18837 = new C18837();
                Iterator it = ((C5843) abstractC43084).m16366().iterator();
                while (it.hasNext()) {
                    AbstractC4308 abstractC43085 = (AbstractC4308) it.next();
                    if (c2609 != null) {
                        try {
                            abstractC43085 = c6735.m18346(abstractC4293, abstractC43085, c2609, interfaceC3953);
                        } catch (C6130 unused) {
                        }
                    }
                    c18837.m43511(c6319.m17537(abstractC43085));
                }
                abstractC43083 = c6319.m17534(c18837.m43517());
                abstractC43083.f13890.f17563 |= 512;
                c10658 = c6319.m17538(abstractC43083);
            } else {
                if (c2609 != null) {
                    abstractC43084 = c6735.m18346(abstractC4293, abstractC43084, c2609, interfaceC3953);
                }
                abstractC43083 = c6319.m17537(abstractC43084);
                c10658 = c6319.m17538(abstractC43083);
            }
        } else {
            int i = C0883.f3449[abstractC4293.mo989().ordinal()];
            C20661 c20661 = this.f28244;
            if (i == 2) {
                C2609 m8239 = C2609.m8239();
                Iterator it2 = ((C14169) abstractC4293).f42775.iterator();
                while (it2.hasNext()) {
                    AbstractC12612 abstractC12612 = ((C9378) it2.next()).f28488;
                    m8239 = (abstractC12612 == null || (abstractC4308 = abstractC12612.f16086) == null) ? m8239.m8242(c20661.f66457) : m8239.m8242(abstractC4308);
                }
                c10658 = new C10658(m8239, AbstractC4308.f13884, C2609.of((Object) c20661.f66479), c20661.f66481);
            } else {
                if (i != 3) {
                    C12171.m29640("Cannot get here!");
                    throw null;
                }
                c10658 = new C10658(C2609.m8239(), abstractC43083, C2609.of((Object) c20661.f66479), c20661.f66481);
            }
        }
        if (abstractC4293.m14709(EnumC18550.f57523) && c10658.m12913(EnumC9454.FORALL)) {
            EnumC8352 m49076 = C21758.m49076(abstractC43083.f13890);
            AbstractC19810 abstractC19810 = abstractC43083.f13890;
            C11576 c11576 = C11886.f35440;
            interfaceC3953.mo1084(abstractC4293, this.f28210.m16617(new C11576("compiler", "invalid.generic.lambda.target", c10658, m49076, abstractC19810)));
            abstractC43083 = c6319.m17535(this.f28213.f75219);
        }
        C6487 c6487 = new C6487();
        c6487.f20021 = abstractC43083;
        c6487.f20020 = c10658;
        return c6487;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23914(final AbstractC23195 abstractC23195, final C1755 c1755, C0384 c0384, final C2609 c2609) {
        if (c0384.m1873(c2609)) {
            c0384.m1864(c2609, new InterfaceC3748() { // from class: l.ܰ᩶֨
                @Override // l.InterfaceC3748
                /* renamed from: ֫ */
                public final void mo4673(C0384 c03842) {
                    C9310.this.m23914(abstractC23195, c1755, c03842, c03842.m1857(c2609));
                }
            });
            return;
        }
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            this.f28231.f72575.m21837(c1755, (AbstractC4308) it.next());
        }
    }

    public C9310(C2903 c2903) {
        c2903.m8841(f28208, this);
        this.f28229 = C6136.m17057(c2903);
        this.f28253 = C22364.m50099(c2903);
        this.f28244 = C20661.m47250(c2903);
        this.f28231 = C22406.m50289(c2903);
        this.f28220 = C10139.m25473(c2903);
        C15240 m36054 = C15240.m36054(c2903);
        this.f28214 = m36054;
        this.f28224 = C10222.m25648(c2903);
        this.f28234 = C16672.m39193(c2903);
        if (((C11139) c2903.m8838(C11139.f33424)) == null) {
            new C11139(c2903);
        }
        this.f28249 = C17013.m39896(c2903);
        this.f28219 = C13809.m33121(c2903);
        this.f28252 = C6735.m18336(c2903);
        this.f28221 = C4224.m12719(c2903);
        C12399 m30567 = C12399.m30567(c2903);
        this.f28247 = m30567;
        this.f28239 = C4658.m13638(c2903);
        EnumC10892.m27201(c2903);
        this.f28251 = C6319.m17456(c2903);
        C23168 m51341 = C23168.m51341(c2903);
        this.f28232 = m51341;
        this.f28210 = C5931.m16615(c2903);
        this.f28250 = C13395.m32391(c2903);
        this.f28256 = C17214.m40507(c2903);
        this.f28248 = C18230.m42469(c2903);
        this.f28222 = C16782.m39518(c2903);
        AbstractC17926.m41937(c2903);
        this.f28227 = C5572.m15819(c2903);
        C1856 c1856 = (C1856) c2903.m8838(C1856.f6337);
        this.f28216 = c1856 == null ? new C1856(c2903) : c1856;
        C7898 c7898 = (C7898) c2903.m8838(C7898.f24468);
        this.f28225 = c7898 == null ? new C7898(c2903) : c7898;
        C11781 m28823 = C11781.m28823(c2903);
        EnumC16280 m38301 = EnumC16280.m38301(c2903);
        this.f28241 = EnumC10637.f32002.m26686(m38301);
        this.f28255 = EnumC10637.f31996.m26686(m38301);
        EnumC10637.f32004.m26686(m38301);
        this.f28212 = EnumC10637.f31991.m26686(m38301);
        this.f28236 = EnumC10637.f32001.m26686(m38301);
        this.f28243 = EnumC10637.f31983.m26686(m38301);
        this.f28245 = EnumC10637.f32007.m26686(m38301);
        this.f28230 = (m51341.m51347() || !m51341.m51351(EnumC10637.f31989)) && EnumC10637.f31989.m26686(m38301);
        this.f28242 = m38301.f50071;
        this.f28240 = m28823.m28831("useBeforeDeclarationWarning");
        C15406 c15406 = C15406.f47184;
        C11488 c11488 = AbstractC4308.f13885;
        this.f28246 = new C23420(this, c15406, c11488);
        this.f28215 = new C23420(this, C15406.f47183, c11488);
        this.f28228 = new C23420(this, C15406.f47181, c11488);
        this.f28233 = new C16364(this, m36054.f46781);
        this.f28226 = new C23420(this, C15406.f47189, c11488);
        EnumC22756 enumC22756 = EnumC22756.f73483;
        this.f28254 = new C14247(this, m30567.f37355, AbstractC4308.f13884);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23420 m23941(C14169 c14169, AbstractC4308 abstractC4308, C23420 c23420) {
        InterfaceC3953 c7234;
        if (c14169.m33819() == EnumC13706.EXPRESSION) {
            c7234 = new C13583(this, (AbstractC12612) c14169.f42776, c23420.f75215);
        } else {
            c7234 = new C7234(this, c23420.f75215);
        }
        if (abstractC4308.mo12923() == AbstractC4308.f13884) {
            return this.f28254;
        }
        return new C23420(this, C15406.f47181, abstractC4308.mo12923(), c7234);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23949(C14169 c14169, AbstractC4308 abstractC4308, InterfaceC3953 interfaceC3953) {
        AbstractC4308 m1868 = interfaceC3953.mo3857().m1868(abstractC4308.mo12923());
        EnumC13706 m33819 = c14169.m33819();
        EnumC13706 enumC13706 = EnumC13706.STATEMENT;
        C5931 c5931 = this.f28210;
        if (m33819 == enumC13706 && c14169.f42774 && !m1868.m12913(EnumC9454.VOID) && m1868 != AbstractC4308.f13884) {
            interfaceC3953.mo1084(c14169, c5931.m16617(new C11576("compiler", "incompatible.ret.type.in.lambda", C11886.m29010(m1868))));
        }
        if (this.f28251.m17549(interfaceC3953.mo3857().m1867(abstractC4308.mo12933()), C7260.m19434(c14169.f42775))) {
            return;
        }
        interfaceC3953.mo1084(c14169, c5931.m16617(C11886.f35463));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3581 m23953(C14163 c14163) {
        return (C3581) this.f28217.remove(c14163);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1755 m23922(C14169 c14169, C1755 c1755) {
        C1755 m5877;
        Object obj = c1755.f6073;
        C8604 c8604 = (C8604) obj;
        AbstractC14016 abstractC14016 = c8604.f26285;
        AbstractC5698 abstractC5698 = abstractC14016.f23673;
        if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4582) {
            C14163 m16071 = abstractC5698.m16071();
            C8604 c86042 = (C8604) obj;
            AbstractC5698 abstractC56982 = c86042.f26285.f23673;
            long mo16084 = abstractC5698.mo16084() & 8;
            C6136 c6136 = this.f28229;
            if (mo16084 == 0) {
                Iterator it = m16071.f42762.m20476(c6136.f18879).iterator();
                if (it.hasNext()) {
                    abstractC56982 = (AbstractC5698) it.next();
                }
            } else {
                HashMap hashMap = this.f28217;
                C3581 c3581 = (C3581) hashMap.get(m16071);
                if (c3581 == null) {
                    C2609 m8239 = C2609.m8239();
                    C20661 c20661 = this.f28244;
                    c3581 = new C3581(4106L, c6136.f18842, new C10658(m8239, c20661.f66501, C2609.m8239(), c20661.f66481), m16071);
                    c3581.f11367 = C2609.m8239();
                    hashMap.put(m16071, c3581);
                }
                abstractC56982 = c3581;
            }
            m5877 = c1755.m5877(c14169, c86042.m22358(c86042.f26285.mo26383(abstractC56982)));
        } else {
            m5877 = c1755.m5877(c14169, c8604.m22358(abstractC14016.mo26380(abstractC5698)));
        }
        C8604 c86043 = (C8604) m5877.f6073;
        c86043.f26286 = null;
        c86043.f26294 = true;
        return m5877;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036a A[Catch: ۛܶ֨ -> 0x045c, TryCatch #3 {ۛܶ֨ -> 0x045c, blocks: (B:50:0x01c6, B:51:0x0263, B:52:0x0272, B:69:0x0252, B:80:0x0273, B:82:0x0284, B:83:0x028a, B:85:0x02a9, B:87:0x02ae, B:91:0x02c0, B:93:0x02c6, B:95:0x02ce, B:96:0x02d7, B:98:0x02e5, B:100:0x02e9, B:102:0x02f3, B:104:0x02fb, B:106:0x0303, B:107:0x0317, B:109:0x031f, B:111:0x0327, B:113:0x0331, B:115:0x0357, B:117:0x035d, B:119:0x0363, B:121:0x036a, B:122:0x0371, B:124:0x037f, B:125:0x0386, B:127:0x038e, B:128:0x0392, B:130:0x03bf, B:132:0x03d3, B:135:0x03eb, B:136:0x03f0, B:137:0x03f1, B:139:0x03f7, B:140:0x0416, B:143:0x0427, B:145:0x0439, B:146:0x0451, B:151:0x0382, B:163:0x0466, B:164:0x0471), top: B:37:0x0157 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5 A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:9:0x0036, B:12:0x0050, B:14:0x005c, B:17:0x0064, B:18:0x009f, B:20:0x00a5, B:23:0x00aa, B:25:0x00b2, B:26:0x00d2, B:28:0x00d8, B:29:0x00df, B:31:0x00ee, B:34:0x00ff, B:36:0x014a, B:38:0x0157, B:171:0x00bb, B:173:0x00c7, B:176:0x00d0), top: B:8:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa A[Catch: ۛܶ֨ -> 0x0472, TryCatch #1 {ۛܶ֨ -> 0x0472, blocks: (B:9:0x0036, B:12:0x0050, B:14:0x005c, B:17:0x0064, B:18:0x009f, B:20:0x00a5, B:23:0x00aa, B:25:0x00b2, B:26:0x00d2, B:28:0x00d8, B:29:0x00df, B:31:0x00ee, B:34:0x00ff, B:36:0x014a, B:38:0x0157, B:171:0x00bb, B:173:0x00c7, B:176:0x00d0), top: B:8:0x0036 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [l.ۖ֨۠, l.᩹ܶ۠] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [l.ۛ᩸֨] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1391(l.C9232 r38) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.mo1391(l.ۢ֡۠):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23420 m23955(C9232 c9232) {
        return new C23420(this, c9232.f27940 == EnumC11091.INVOKE ? C15406.f47178 : C15406.f47189, AbstractC4308.f13885);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (((l.C23708) r10.f28214.f46781).mo3859(r14.mo3857().m1868(r2), r14.mo3857().m1868(r1), r14.mo3858(r11, r2, r1)) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m23946(final l.C9232 r11, l.AbstractC4308 r12, final l.AbstractC4308 r13, l.InterfaceC3953 r14, boolean r15) {
        /*
            r10 = this;
            l.֡ۨ֨ r0 = r14.mo3857()
            l.ۙ֨֨ r1 = r12.mo12923()
            l.ۙ֨֨ r1 = r0.m1868(r1)
            int[] r2 = l.C0883.f3446
            l.ۧܺ֨ r3 = r11.f27940
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L1a
            goto L29
        L1a:
            l.۫᩵۠ r2 = r11.f27945
            l.ۙ֨֨ r2 = r2.f16086
            boolean r2 = r2.mo12920()
            if (r2 != 0) goto L29
            l.۫᩵۠ r2 = r11.f27945
            l.ۙ֨֨ r2 = r2.f16086
            goto L2d
        L29:
            l.ۙ֨֨ r2 = r13.mo12923()
        L2d:
            l.ۢ۠֨ r4 = l.EnumC9454.VOID
            boolean r5 = r1.m12913(r4)
            r6 = 0
            if (r5 == 0) goto L38
            r5 = r6
            goto L39
        L38:
            r5 = r2
        L39:
            boolean r7 = r1.m12913(r4)
            if (r7 != 0) goto L6c
            boolean r4 = r2.m12913(r4)
            if (r4 != 0) goto L6c
            boolean r4 = r2.mo12948()
            if (r4 != 0) goto L6d
            l.֨᩸۠ r4 = r14.mo3858(r11, r2, r1)
            l.ܶ۬֨ r7 = r10.f28214
            l.ۘ۬֨ r7 = r7.f46781
            l.֡ۨ֨ r8 = r14.mo3857()
            l.ۙ֨֨ r8 = r8.m1868(r2)
            l.֡ۨ֨ r9 = r14.mo3857()
            l.ۙ֨֨ r1 = r9.m1868(r1)
            l.᩻۬֨ r7 = (l.C23708) r7
            boolean r1 = r7.mo3859(r8, r1, r4)
            if (r1 == 0) goto L6c
            goto L6d
        L6c:
            r6 = r5
        L6d:
            r1 = 0
            java.lang.String r4 = "compiler"
            if (r6 == 0) goto L8f
            l.ۙ֨֨ r5 = r12.mo12923()
            l.ۨ۠۠ r2 = l.C11886.m29011(r2, r5)
            l.ۨ۠۠ r5 = new l.ۨ۠۠
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r1] = r2
            java.lang.String r2 = "incompatible.ret.type.in.mref"
            r5.<init>(r4, r2, r6)
            l.ۛ۠۠ r2 = r10.f28210
            l.ܽܶ۠ r2 = r2.m16617(r5)
            r14.mo1084(r11, r2)
            goto La6
        L8f:
            l.ۖܶ۠ r14 = r0.f1817
            boolean r14 = r13.m12928(r14)
            if (r14 == 0) goto La4
            l.ۖܶ۠ r14 = l.C2609.of(r13)
            l.֨᩶֨ r2 = new l.֨᩶֨
            r2.<init>()
            r0.m1864(r14, r2)
            goto La6
        La4:
            r11.f27939 = r13
        La6:
            if (r15 != 0) goto Lcc
            l.ۖܶ۠ r14 = r13.mo12930()
            l.ۖܶ۠ r12 = r12.mo12930()
            boolean r12 = r10.m23950(r14, r12, r0)
            if (r12 != 0) goto Lcc
            l.ۖܶ۠ r12 = r13.mo12930()
            l.۫۠۠ r13 = l.C6241.f19132
            l.۫۠۠ r13 = new l.۫۠۠
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r1] = r12
            java.lang.String r12 = "incompatible.thrown.types.in.mref"
            r13.<init>(r4, r12, r14)
            l.᩹ܶ۠ r12 = r10.f28253
            r12.m7273(r11, r13)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.m23946(l.ۢ֡۠, l.ۙ֨֨, l.ۙ֨֨, l.ۘ۬֨, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23950(C2609 c2609, C2609 c26092, C0384 c0384) {
        C2609 c26093 = (C2609) C5378.stream(c26092).filter(new C6528(0, c0384)).collect(C2609.m8240());
        C2609 m8244 = c26092.m8244(c26093);
        C2609 c26094 = (C2609) C5378.stream(c2609).filter(new Predicate() { // from class: l.ۢۙ֨
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
                return !C9310.this.f28214.m36184((AbstractC4308) obj);
            }
        }).collect(C2609.m8240());
        C18837 c18837 = new C18837();
        Iterator it = c26094.iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
            Iterator it2 = m8244.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c18837.m43511(abstractC4308);
                    break;
                }
                if (this.f28251.m17546(abstractC4308, (AbstractC4308) it2.next(), true)) {
                    break;
                }
            }
        }
        if (c26093.isEmpty() && !c18837.isEmpty()) {
            return false;
        }
        C2609 m1867 = c0384.m1867(c26093);
        C19846.forEach(c18837, new C8645(0, this, m1867));
        C5378.stream(m1867).filter(new C15699()).forEach(new C2295());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m23902(final C1755 c1755, final AbstractC23195 abstractC23195, final AbstractC4308 abstractC4308, final AbstractC4308 abstractC43082, final AbstractC4308 abstractC43083, final InterfaceC3953 interfaceC3953) {
        if (abstractC43082.m12928(interfaceC3953.mo3857().f1817)) {
            interfaceC3953.mo3857().m1864(C2609.of((Object) abstractC4308, (Object) abstractC43082), new InterfaceC3748() { // from class: l.ۙ᩶֨
                @Override // l.InterfaceC3748
                /* renamed from: ֫ */
                public final void mo4673(C0384 c0384) {
                    AbstractC4308 abstractC43084 = abstractC43083;
                    C9310.this.m23902(c1755, abstractC23195, abstractC4308, c0384.m1859(abstractC43082), c0384.m1859(abstractC43084), interfaceC3953);
                }
            });
            return;
        }
        if (abstractC4308.m12913(EnumC9454.CLASS)) {
            abstractC23195.f74560 = abstractC43083;
        }
        if (interfaceC3953.mo3860().f20970 != EnumC13829.CHECK || abstractC4308 == AbstractC4308.f13884) {
            return;
        }
        try {
            C14163 m17495 = this.f28251.m17495(c1755, this.f28229.f18867, abstractC23195.f74560, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
            if (m17495 != null) {
                this.f28214.m36140(c1755.f6074, m17495, m17495);
                try {
                    m17495.f17563 |= 512;
                    this.f28251.m17538(m17495.f17560);
                } catch (C6130 unused) {
                    this.f28213.f75215.mo1084(abstractC23195, this.f28210.m16617(C11886.m29013(abstractC23195.f74560)));
                }
            }
        } catch (C6130 e) {
            this.f28213.f75215.mo1084(c1755.f6074, e.m17050());
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1405(C14875 c14875) {
        AbstractC4308 m23930 = m23930(c14875.f45392, this.f28211, this.f28213);
        C23420 c23420 = this.f28213;
        this.f28223 = m23934(c14875, m23930, c23420.f75217, c23420);
        AbstractC5698 m19472 = C7260.m19472(c14875);
        if (m19472 == null || !m19472.f17559.m4391(C15406.f47182) || m19472.f17559 == EnumC1296.f4581) {
            return;
        }
        this.f28253.m7273(c14875, C6241.f19298);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        AbstractC12612 abstractC12612 = c21080.f67987;
        C1755 c1755 = this.f28211;
        AbstractC4308 m23930 = m23930(abstractC12612, c1755.m5877(c21080, c1755.f6073), this.f28215);
        AbstractC4308 m17523 = this.f28251.m17523(m23930);
        m23929((AbstractC5144) c21080.f67988, this.f28211, m23930);
        this.f28223 = m23934(c21080, m17523, C15406.f47181, this.f28213);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        AbstractC4308 m23930 = m23930(c9791.f29619, this.f28211, this.f28215);
        AbstractC4308 m239302 = m23930(c9791.f29618, this.f28211, this.f28228);
        EnumC18550 m43096 = c9791.mo989().m43096();
        C10139 c10139 = this.f28220;
        C0758 m25477 = c10139.m25477(c9791, m43096, m23930, m239302);
        c9791.f2830 = m25477;
        if (m25477 != c10139.f30517 && !m23930.mo12948() && !m239302.mo12948()) {
            AbstractC12612 abstractC12612 = c9791.f29618;
            abstractC12612.getClass();
            C15240 c15240 = this.f28214;
            c15240.m36125(abstractC12612, m25477, m239302);
            AbstractC12612 abstractC126122 = c9791.f29618;
            abstractC126122.getClass();
            c15240.m36105(abstractC126122, m25477.f17560.mo12923(), m23930);
        }
        this.f28223 = m23934(c9791, m23930, C15406.f47181, this.f28213);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        AbstractC4308 m36202;
        AbstractC4308 mo12923;
        C4658 c4658;
        AbstractC4308 m13639;
        if (c6555.mo989().m43093()) {
            m36202 = m23930(c6555.f20226, this.f28211, this.f28215);
        } else {
            AbstractC12612 abstractC12612 = c6555.f20226;
            abstractC12612.getClass();
            m36202 = this.f28214.m36202(abstractC12612, m23930(c6555.f20226, this.f28211, this.f28228));
        }
        EnumC18550 mo989 = c6555.mo989();
        C10139 c10139 = this.f28220;
        C0758 m25478 = c10139.m25478(c6555, mo989, m36202);
        c6555.f2830 = m25478;
        AbstractC4308 m17535 = this.f28251.m17535(c6555.f16086);
        if (m25478 != c10139.f30517 && !m36202.mo12948()) {
            if (c6555.mo989().m43093()) {
                mo12923 = c6555.f20226.f16086;
            } else {
                mo12923 = m25478.f17560.mo12923();
            }
            m17535 = mo12923;
            int i = m25478.f2814;
            if (m36202.mo12915() != null && (m13639 = (c4658 = this.f28239).m13639(i, m36202)) != null) {
                m17535 = c4658.m13641(m13639, m17535);
            }
        }
        this.f28223 = m23934(c6555, m17535, C15406.f47181, this.f28213);
        C7772 c7772 = this.f28218;
        this.f28216.getClass();
        if (c7772 != C1856.f6336 && c6555.m14709(EnumC18550.f57488)) {
            c7772 = new C7772(c7772.f24022, c7772.f24023, false);
        }
        this.f28218 = c7772;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        C2609 c2609;
        C4658 c4658;
        AbstractC4308 m13640;
        AbstractC12612 abstractC12612 = c9085.f27533;
        abstractC12612.getClass();
        AbstractC12612 abstractC126122 = c9085.f27533;
        C1755 c1755 = this.f28211;
        C23420 c23420 = this.f28228;
        AbstractC4308 m23930 = m23930(abstractC126122, c1755, c23420);
        C15240 c15240 = this.f28214;
        AbstractC4308 m36202 = c15240.m36202(abstractC12612, m23930);
        C7772 c7772 = this.f28218;
        int i = C0883.f3449[c9085.mo989().ordinal()];
        if (i == 17) {
            c2609 = c7772.f24023;
        } else if (i == 18) {
            c2609 = c7772.f24022;
        } else {
            c2609 = C2609.m8239();
        }
        C1755 c17552 = this.f28211;
        C1755 m23896 = m23896(c17552, c17552.f6074, c2609);
        Object obj = m23896.f6073;
        try {
            AbstractC12612 abstractC126123 = c9085.f27532;
            abstractC126123.getClass();
            AbstractC4308 m362022 = c15240.m36202(abstractC126123, m23930(c9085.f27532, m23896, c23420));
            ((C8604) obj).f26285.mo26377();
            this.f28218 = this.f28216.m6167(c9085, c7772, this.f28218);
            EnumC18550 mo989 = c9085.mo989();
            C10139 c10139 = this.f28220;
            C0758 m25477 = c10139.m25477(c9085, mo989, m36202, m362022);
            c9085.f2830 = m25477;
            AbstractC4308 abstractC4308 = c9085.f16086;
            C6319 c6319 = this.f28251;
            AbstractC4308 m17535 = c6319.m17535(abstractC4308);
            if (m25477 != c10139.f30517 && !m36202.mo12948() && !m362022.mo12948()) {
                AbstractC4308 mo12923 = m25477.f17560.mo12923();
                int i2 = m25477.f2814;
                if (m36202.mo12915() != null && m362022.mo12915() != null && (m13640 = (c4658 = this.f28239).m13640(i2, m36202, m362022)) != null) {
                    mo12923 = c4658.m13641(m13640, mo12923);
                }
                if ((i2 == 165 || i2 == 166) && !c6319.m17545(m36202, m362022, new C1386(c9085))) {
                    C12281 c12281 = C6241.f19132;
                    this.f28253.m7273(c9085, new C12281("compiler", "incomparable.types", m36202, m362022));
                }
                AbstractC12612 abstractC126124 = c9085.f27532;
                abstractC126124.getClass();
                c15240.m36125(abstractC126124, m25477, m362022);
                m17535 = mo12923;
            }
            this.f28223 = m23934(c9085, m17535, C15406.f47181, this.f28213);
        } catch (Throwable th) {
            ((C8604) obj).f26285.mo26377();
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1415(C17844 c17844) {
        C23420 c23420;
        AbstractC4308 m23954 = m23954(c17844.f54511, this.f28211, AbstractC4308.f13885);
        AbstractC5144 abstractC5144 = c17844.f54511;
        C1755 c1755 = this.f28211;
        C15240 c15240 = this.f28214;
        boolean z = false;
        c15240.m36137(abstractC5144, c1755, false);
        C1755 c17552 = this.f28211;
        C1755 m5877 = c17552.m5877(c17844, c17552.f6073);
        AbstractC12612 m19458 = C7260.m19458(c17844.f54512);
        if (this.f28241 && (m19458.m14709(EnumC18550.f57523) || m19458.m14709(EnumC18550.f57524))) {
            z = true;
        }
        if (z) {
            c23420 = new C23420(this, C15406.f47181, m23954, new C19229(this, this.f28213.f75215));
        } else {
            c23420 = this.f28228;
        }
        AbstractC4308 m23930 = m23930(c17844.f54512, m5877, c23420);
        if (!z) {
            AbstractC12612 abstractC12612 = c17844.f54512;
            abstractC12612.getClass();
            m23954 = c15240.m36105(abstractC12612, m23930, m23954);
        }
        if (m23930.mo12915() != null) {
            m23954 = this.f28239.m13641(m23930, m23954);
        }
        this.f28223 = m23934(c17844, this.f28251.m17523(m23954), C15406.f47181, this.f28213);
        if (z) {
            return;
        }
        c15240.m36160(c17844);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        AbstractC4308 abstractC4308;
        AbstractC5144 abstractC5144;
        InterfaceC3109 interfaceC3109 = c16286.f50075;
        interfaceC3109.getClass();
        AbstractC12612 abstractC12612 = c16286.f50075;
        C1755 c1755 = this.f28211;
        C23420 c23420 = this.f28228;
        AbstractC4308 m23930 = m23930(abstractC12612, c1755, c23420);
        C15240 c15240 = this.f28214;
        AbstractC4308 m36169 = c15240.m36169(interfaceC3109, m23930);
        EnumC18550 mo989 = c16286.f50076.mo989();
        EnumC18550 enumC18550 = EnumC18550.f57504;
        C22364 c22364 = this.f28253;
        boolean z = false;
        C6319 c6319 = this.f28251;
        if (mo989 != enumC18550 && c16286.f50076.mo989() != EnumC18550.f57514) {
            abstractC4308 = m23954(c16286.f50076, this.f28211, AbstractC4308.f13885);
            abstractC5144 = c16286.f50076;
            c15240.m36137(abstractC5144, this.f28211, false);
        } else {
            m23930(c16286.f50076, this.f28211, c23420);
            abstractC4308 = c16286.f50076.f16086;
            if (c6319.m17546(m36169, abstractC4308, true) && !m36169.mo12948() && !abstractC4308.mo12948()) {
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c16286, new C12281("compiler", "instanceof.pattern.no.subtype", m36169, abstractC4308));
            }
            abstractC5144 = C7260.m19442((AbstractC21932) c16286.f50076).f49721.f28488;
        }
        if (!abstractC4308.m12913(EnumC9454.TYPEVAR)) {
            abstractC5144.getClass();
            abstractC4308 = c15240.m36104(abstractC5144, abstractC4308);
        }
        if (!abstractC4308.mo12948() && !c6319.m17477(abstractC4308)) {
            if (this.f28243) {
                AbstractC12612 abstractC126122 = c16286.f50075;
                abstractC126122.getClass();
                z = m23916(abstractC126122, m36169, abstractC4308);
            } else {
                c22364.m7280(EnumC20043.SOURCE_LEVEL, c16286, EnumC10637.f31983.m26684(this.f28242));
                this.f28243 = true;
            }
            if (!z) {
                abstractC4308 = c6319.m17535(abstractC4308);
            }
        }
        InterfaceC3109 interfaceC31092 = c16286.f50075;
        interfaceC31092.getClass();
        c15240.m36105(interfaceC31092, m36169, abstractC4308);
        this.f28223 = m23934(c16286, this.f28244.f66469, C15406.f47181, this.f28213);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23916(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C1386 c1386 = new C1386();
        if (!this.f28251.m17545(abstractC4308, abstractC43082, c1386)) {
            ((C23708) this.f28214.f46781).mo1084(interfaceC3109, this.f28210.m16617(C11886.m29011(abstractC4308, abstractC43082)));
            return false;
        }
        if (!c1386.m4870(EnumC20347.UNCHECKED)) {
            return true;
        }
        C12281 c12281 = C6241.f19132;
        this.f28253.m7273(interfaceC3109, new C12281("compiler", "instanceof.reifiable.not.safe", abstractC4308, abstractC43082));
        return false;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        C15406 c15406 = C15406.f47189;
        C23420 c23420 = this.f28213;
        C23420 c234202 = new C23420(this, c15406, c23420.f75219, c23420.f75215);
        C9378 c9378 = c16139.f49721;
        AbstractC4308 m23930 = m23930(c9378.f28488, this.f28211, c234202);
        c9378.f16086 = m23930;
        c16139.f16086 = m23930;
        C9378 c93782 = c16139.f49721;
        C16986 c16986 = new C16986(c93782.f28486.f7169, c93782.f28484, c93782.f28488.f16086, ((C8604) this.f28211.f6073).f26285.f23673);
        c16986.f36040 = c16139.f16085;
        C9378 c93783 = c16139.f49721;
        c93783.f28489 = c16986;
        AbstractC14016 abstractC14016 = ((C8604) this.f28211.f6073).f26285;
        C15240 c15240 = this.f28214;
        if (c15240.m36162((InterfaceC3109) c93783, (AbstractC5698) c16986, abstractC14016)) {
            C9378 c93784 = c16139.f49721;
            c93784.getClass();
            c15240.m36131((InterfaceC3109) c93784, (C12048) c16986, ((C8604) this.f28211.f6073).f26285);
        }
        C2609 c2609 = c16139.f49721.f28486.f7168;
        C1755 c1755 = this.f28211;
        C13395 c13395 = this.f28250;
        c13395.m32406(c2609, c1755, c16986, c16139);
        C9378 c93785 = c16139.f49721;
        c13395.m32408(c93785.f28488, this.f28211, c16986, c93785);
        c13395.m32413();
        c15240.m36137((AbstractC5144) c16139.f49721.f28488, this.f28211, true);
        this.f28223 = c16139.f16086;
        this.f28218 = new C7772(C2609.of((Object) c16986), C2609.m8239(), false);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1424(C21227 c21227) {
        m23930(c21227.f68420, this.f28211, this.f28228);
        AbstractC4308 abstractC4308 = c21227.f68420.f16086;
        c21227.f16086 = abstractC4308;
        this.f28223 = abstractC4308;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1402(C14022 c14022) {
        m23930(c14022.f42404, this.f28211, this.f28228);
        C7772 c7772 = this.f28218;
        C1755 c1755 = this.f28211;
        C1755 m23896 = m23896(c1755, c1755.f6074, c7772.f24023);
        Object obj = m23896.f6073;
        try {
            m23929((AbstractC5144) c14022.f42403, m23896, (AbstractC4308) this.f28244.f66469);
            ((C8604) obj).f26285.mo26377();
            AbstractC4308 abstractC4308 = c14022.f42404.f16086;
            c14022.f16086 = abstractC4308;
            this.f28223 = abstractC4308;
            C7772 c77722 = this.f28218;
            C1856 c1856 = this.f28216;
            c1856.getClass();
            this.f28218 = c1856.m6168(c14022, c7772, c77722);
        } catch (Throwable th) {
            ((C8604) obj).f26285.mo26377();
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1404(C14728 c14728) {
        AbstractC4308 abstractC4308 = c14728.f16086;
        C6319 c6319 = this.f28251;
        AbstractC4308 m17535 = c6319.m17535(abstractC4308);
        AbstractC4308 m23930 = m23930(c14728.f44980, this.f28211, this.f28228);
        m23929((AbstractC5144) c14728.f44979, this.f28211, (AbstractC4308) this.f28244.f66452);
        if (c6319.m17512(m23930)) {
            m17535 = c6319.m17515(m23930);
        } else if (!m23930.m12913(EnumC9454.ERROR)) {
            C12281 c12281 = C6241.f19132;
            this.f28253.m7273(c14728, new C12281("compiler", "array.req.but.found", m23930));
        }
        if (!this.f28213.f75217.m36457(C15406.f47181)) {
            m17535 = c6319.m17523(m17535);
        }
        this.f28223 = m23934(c14728, m17535, C15406.f47179, this.f28213);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x031a  */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1381(l.C6262 r24) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.mo1381(l.ۛ᩵۠):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m23900(C6262 c6262, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, C1755 c1755, C23420 c23420) {
        AbstractC5698 abstractC56982;
        AbstractC10370 abstractC10370 = c6262.f19395;
        int i = C0883.f3448[abstractC4308.mo3258().ordinal()];
        C22406 c22406 = this.f28231;
        C22364 c22364 = this.f28253;
        C6136 c6136 = this.f28229;
        C6319 c6319 = this.f28251;
        C20661 c20661 = this.f28244;
        switch (i) {
            case 1:
                AbstractC19810 abstractC19810 = abstractC4308.f13890;
                C15406 c15406 = c23420.f75217;
                C22406 c224062 = this.f28231;
                return c224062.m50316(c224062.m50321(c6262, c1755, abstractC19810, abstractC10370, c15406), (InterfaceC3109) c6262, abstractC5698, abstractC4308, abstractC10370, true);
            case 2:
            case 3:
                AbstractC4308 abstractC43082 = c23420.f75219;
                if (abstractC43082.m12913(EnumC9454.METHOD) || abstractC43082.m12913(EnumC9454.FORALL)) {
                    return this.f28231.m50313(c6262, c1755, abstractC5698, abstractC4308, abstractC10370, abstractC43082.mo12933(), abstractC43082.mo12938());
                }
                if (abstractC10370 == c6136.f18886 || abstractC10370 == c6136.f18898) {
                    return c22406.m50314(c6262, c1755, abstractC4308.f13890, abstractC10370);
                }
                if (abstractC10370 == c6136.f18894) {
                    return c20661.m47259(abstractC4308, c6319);
                }
                return this.f28231.m50316(this.f28231.m50315(c6262, c1755, abstractC4308, abstractC10370, c23420.f75217), (InterfaceC3109) c6262, abstractC5698, abstractC4308, abstractC10370, true);
            case 4:
                throw new AssertionError(c6262);
            case 5:
                AbstractC5698 m23900 = abstractC4308.mo12939() != null ? m23900(c6262, abstractC5698, c6319.m17523(abstractC4308.mo12939()), c1755, c23420) : null;
                if (m23900 == null) {
                    c22364.m7273(c6262, C6241.f19301);
                    return c20661.f66462;
                }
                if ((m23900.mo16084() & 2) != 0) {
                    C11003.requireNonNull(c22406);
                    abstractC56982 = new C5746(c22406, c1755, abstractC4308, m23900);
                } else {
                    abstractC56982 = m23900;
                }
                this.f28231.m50316(abstractC56982, (InterfaceC3109) c6262, abstractC5698, abstractC4308, abstractC10370, true);
                return m23900;
            case 6:
                AbstractC19810 abstractC198102 = abstractC4308.f13890;
                c6319.getClass();
                return C6319.m17457(abstractC10370, abstractC198102, abstractC4308).f13890;
            default:
                if (abstractC10370 == c6136.f18894) {
                    return c20661.m47259(abstractC4308, c6319);
                }
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c6262, new C12281("compiler", "cant.deref", abstractC4308));
                return c20661.f66462;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23932(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C1755 c1755, C23420 c23420) {
        if (!c23420.f75219.m12913(EnumC9454.FORALL) && !c23420.f75219.m12913(EnumC9454.METHOD)) {
            return m23933(abstractC5144, abstractC4308, abstractC5698, c23420.f75219, c1755, c23420);
        }
        if (c23420.f75217.m36457(C15406.f47180)) {
            return this.f28225.m21192(abstractC5144, abstractC4308, abstractC5698, c1755, c23420);
        }
        return m23933(abstractC5144, abstractC4308, abstractC5698, c23420.f75219, c1755, c23420);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [l.ۚۚ۠] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23933(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, AbstractC4308 abstractC43082, C1755 c1755, C23420 c23420) {
        AbstractC4308 abstractC43083;
        AbstractC4308 abstractC43084;
        AbstractC5698 m19472;
        AbstractC10370 abstractC10370;
        AbstractC4308 m17490;
        boolean mo12948 = abstractC43082.mo12948();
        C6319 c6319 = this.f28251;
        if (mo12948) {
            return c6319.m17535(abstractC4308);
        }
        int i = C0883.f3447[abstractC5698.f17559.ordinal()];
        C6136 c6136 = this.f28229;
        C15240 c15240 = this.f28214;
        switch (i) {
            case 8:
                abstractC43083 = abstractC5698.f17560;
                EnumC9454 enumC9454 = EnumC9454.CLASS;
                if (abstractC43083.m12913(enumC9454)) {
                    abstractC5144.getClass();
                    c15240.m36136(abstractC5144, c1755, (C14163) abstractC5698);
                    AbstractC4308 mo4958 = abstractC43083.mo4958();
                    if (abstractC43083.f13890.f17560.mo12938().m8249()) {
                        abstractC43083 = c6319.m17519(abstractC43083);
                        break;
                    } else if (mo4958.m12913(enumC9454) && abstractC4308 != mo4958) {
                        AbstractC4308 m17489 = abstractC4308.m12913(enumC9454) ? c6319.m17489(abstractC4308, mo4958.f13890) : abstractC4308;
                        if (m17489 == null) {
                            m17489 = c6319.m17519(mo4958);
                        }
                        if (m17489 != mo4958) {
                            abstractC43083 = new C19955(m17489, C2609.m8239(), abstractC43083.f13890, abstractC43083.m12921());
                            break;
                        }
                    }
                }
                break;
            case 9:
                C12048 c12048 = (C12048) abstractC5698;
                if (((C8604) c1755.f6073).f26293 != null && c12048.f17560.m12913(EnumC9454.NONE)) {
                    C5557 c5557 = c1755.f6079;
                    ?? m19438 = C7260.m19438(c12048, c5557);
                    if (m19438 != 0) {
                        c5557 = m19438;
                    }
                    this.f28253.m7269(c5557.f16085, C6241.m17185(c12048.f17562, C11886.f35507));
                    C12193 m17535 = c6319.m17535(c12048.f17560);
                    c12048.f17560 = m17535;
                    return m17535;
                }
                if (C15406.f47183.m36458(this.f28213.f75217) && c12048.f17561.f17559 == EnumC1296.f4582 && (c12048.f17563 & 8) == 0 && ((abstractC4308.m12913(EnumC9454.CLASS) || abstractC4308.m12913(EnumC9454.TYPEVAR)) && (m17490 = c6319.m17490(c12048.f17561, abstractC4308)) != null && m17490.mo12920() && !c6319.m17550(c12048.f17560, c12048.mo16091(c6319)))) {
                    abstractC5144.getClass();
                    C11076 c11076 = C14001.f42334;
                    c15240.m36178(abstractC5144, new C11076("compiler", "unchecked.assign.to.var", c12048, m17490));
                }
                EnumC1296 enumC1296 = abstractC5698.f17561.f17559;
                EnumC1296 enumC12962 = EnumC1296.f4582;
                if (enumC1296 == enumC12962 && (abstractC10370 = abstractC5698.f17562) != c6136.f18886 && abstractC10370 != c6136.f18898) {
                    abstractC43084 = c6319.m17543(abstractC5698, abstractC4308);
                } else {
                    abstractC43084 = abstractC5698.f17560;
                }
                abstractC43083 = (c12048.m29425() == null || (abstractC5144.m14709(EnumC18550.f57581) && ((m19472 = C7260.m19472(((C6262) abstractC5144).f19397)) == null || m19472.f17559 != enumC12962))) ? abstractC43084 : abstractC43084.mo3257(c12048.m29425());
                if (c23420.f75217 == C15406.f47181) {
                    abstractC43083 = c6319.m17523(abstractC43083);
                    break;
                }
                break;
            case 10:
                C15406 c15406 = c23420.f75217;
                AbstractC4308 abstractC43085 = c23420.f75219;
                abstractC43083 = m23927(abstractC4308, abstractC5698, new C23420(this, c15406, abstractC43085.mo12923(), c23420.f75215, c23420.f75216), c1755, C7260.m19435(c1755.f6074), abstractC43085.mo12933(), abstractC43085.mo12938());
                break;
            case 11:
            case 12:
                abstractC43083 = abstractC5698.f17560;
                break;
            default:
                throw new AssertionError("unexpected kind: " + abstractC5698.f17559 + " in tree " + abstractC5144);
        }
        if (abstractC5698.f17562 != c6136.f18879 || abstractC5144.m14709(EnumC18550.f57524)) {
            abstractC5144.getClass();
            AbstractC5698 abstractC56982 = ((C8604) c1755.f6073).f26285.f23673;
            c15240.getClass();
            c15240.m36116(new C18064(abstractC5144), abstractC56982, abstractC5698);
            c15240.m36192(abstractC5698, abstractC5144);
            c15240.m36180(abstractC5698, abstractC5144);
            c15240.m36127(abstractC5144, ((C8604) c1755.f6073).f26285.f23673, abstractC5698);
        }
        return m23934(abstractC5144, abstractC43083, abstractC5698.f17559.m4392(), c23420);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23910(AbstractC12612 abstractC12612, C1755 c1755, C12048 c12048, boolean z) {
        C14163 m16071;
        C11076 c11076;
        C1755 c17552 = c1755;
        while (true) {
            switch (C0883.f3449[c17552.f6074.mo989().ordinal()]) {
                case 15:
                case 16:
                case 21:
                    c17552 = null;
                    break;
                case 17:
                case 18:
                default:
                    C12171.m29637(c17552.f6072);
                    c17552 = c17552.f6072;
                case 19:
                    if (((C9378) c17552.f6074).f28489.f17561.f17559 == EnumC1296.f4582) {
                        break;
                    } else {
                        C12171.m29637(c17552.f6072);
                        c17552 = c17552.f6072;
                    }
                case 20:
                    if (c17552.f6072.f6074.m14709(EnumC18550.f57582)) {
                        break;
                    } else {
                        C12171.m29637(c17552.f6072);
                        c17552 = c17552.f6072;
                    }
            }
        }
        C22364 c22364 = this.f28253;
        if (c17552 != null) {
            C8604 c8604 = (C8604) c17552.f6073;
            if (c8604.f26293 == c12048 || c12048.f36040 > abstractC12612.f16085) {
                AbstractC5698 abstractC5698 = c12048.f17561;
                if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698 == ((C8604) c1755.f6073).f26285.f23673.m16071()) {
                    if (((c12048.f17563 & 8) != 0) == C22406.m50291(c1755) && (!c1755.f6074.m14709(EnumC18550.f57522) || C7260.m19458(((C21080) c1755.f6074).f67987) != abstractC12612)) {
                        if (!z || m23918(c12048)) {
                            c22364.m7273(abstractC12612, c8604.f26293 == c12048 ? C6241.f19225 : C6241.f19199);
                        } else if (this.f28240) {
                            if (c8604.f26293 == c12048) {
                                C11076 c110762 = C14001.f42334;
                                c11076 = new C11076("compiler", "self.ref", c12048);
                            } else {
                                C11076 c110763 = C14001.f42334;
                                c11076 = new C11076("compiler", "forward.ref", c12048);
                            }
                            c22364.m7285(abstractC12612, c11076);
                        }
                    }
                }
            }
        }
        c12048.m29425();
        if (!m23918(c12048) || (m16071 = ((C8604) c1755.f6073).f26285.f23673.m16071()) == null || m16071.f17561 == null) {
            return;
        }
        AbstractC5698 abstractC56982 = c12048.f17561;
        if (abstractC56982 == m16071 || this.f28251.m17546(m16071.f17560, abstractC56982.f17560, true)) {
            C4314 c4314 = C22406.f72572;
            AbstractC5698 abstractC56983 = ((C8604) c1755.f6073).f26285.f23673;
            if (!abstractC56983.m16075()) {
                if (abstractC56983.f17561.f17559 != EnumC1296.f4582) {
                    return;
                }
                EnumC1296 enumC1296 = abstractC56983.f17559;
                if ((enumC1296 != EnumC1296.f4567 && (enumC1296 != EnumC1296.f4571 || (abstractC56983.mo16084() & 1048576) == 0)) || (abstractC56983.mo16084() & 8) != 0) {
                    return;
                }
            }
            c22364.m7273(abstractC12612, C6241.f19220);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23918(C12048 c12048) {
        AbstractC5698 abstractC5698 = c12048.f17561;
        int i = C19642.f63384;
        return ((abstractC5698.mo16084() & 16384) == 0 || (c12048.f17563 & 8) == 0 || c12048.m29425() != null || c12048.f17562 == this.f28229.f18894) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x020f, code lost:
    
        if (r2.mo12940() == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0297 A[Catch: ᩻ۧ۠ -> 0x02c1, ۬ۛ֨ -> 0x02c5, TryCatch #1 {۬ۛ֨ -> 0x02c5, blocks: (B:72:0x028d, B:76:0x0297, B:78:0x02a1, B:81:0x02ac, B:84:0x02bb), top: B:71:0x028d }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC4308 m23927(l.AbstractC4308 r23, l.AbstractC5698 r24, l.C23420 r25, l.C1755 r26, l.C2609 r27, l.C2609 r28, l.C2609 r29) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9310.m23927(l.ۙ֨֨, l.ۛ֡֨, l.᩻ۗ֨, l.֫ۤ֨, l.ۖܶ۠, l.ۖܶ۠, l.ۖܶ۠):l.ۙ֨֨");
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1427(C23342 c23342) {
        EnumC9454 enumC9454 = c23342.f74996;
        EnumC9454 enumC94542 = EnumC9454.CLASS;
        C20661 c20661 = this.f28244;
        this.f28223 = m23934(c23342, (enumC9454 == enumC94542 ? c20661.f66533 : c20661.f66461[enumC9454.ordinal()]).mo3257(c23342.f74997), C15406.f47181, this.f28213);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1373(C2882 c2882) {
        this.f28223 = m23934(c2882, this.f28244.f66461[c2882.f9190.ordinal()], C15406.f47189, this.f28213);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1429(C23901 c23901) {
        this.f28223 = m23934(c23901, new C5138(m23954(c23901.f77274, this.f28211, AbstractC4308.f13885), this.f28244.f66505), C15406.f47189, this.f28213);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC43082 = c16432.f16086;
        C6319 c6319 = this.f28251;
        C19955 m17535 = c6319.m17535(abstractC43082);
        AbstractC12612 abstractC12612 = c16432.f50542;
        abstractC12612.getClass();
        AbstractC4308 m23954 = m23954(c16432.f50542, this.f28211, AbstractC4308.f13885);
        C15240 c15240 = this.f28214;
        AbstractC4308 m36173 = c15240.m36173(abstractC12612, m23954);
        C2609 c2609 = c16432.f50541;
        C2609 m23923 = m23923(c2609, this.f28211);
        c15240.m36123(c2609, m23923);
        if (m36173.m12913(EnumC9454.CLASS)) {
            C2609 mo12938 = m36173.f13890.f17560.mo12938();
            if (m23923.isEmpty()) {
                m23923 = mo12938;
            }
            if (m23923.m8245() == mo12938.m8245()) {
                C2609 c26092 = m23923;
                while (c26092.m8249()) {
                    c26092.f8240 = ((AbstractC4308) c26092.f8240).mo12937((AbstractC4308) mo12938.f8240);
                    c26092 = c26092.f8241;
                    mo12938 = mo12938.f8241;
                }
                AbstractC4308 mo4958 = m36173.mo4958();
                EnumC9454 enumC9454 = EnumC9454.CLASS;
                if (mo4958.m12913(enumC9454)) {
                    AbstractC12612 m19465 = C7260.m19465(c16432.f50542);
                    if (m19465.m14709(EnumC18550.f57566)) {
                        abstractC4308 = this.f28211.f6079.f17186.f17560;
                    } else if (m19465.m14709(EnumC18550.f57581)) {
                        abstractC4308 = ((C6262) m19465).f19397.f16086;
                    } else {
                        throw new AssertionError("" + c16432);
                    }
                    if (mo4958.m12913(enumC9454) && abstractC4308 != mo4958) {
                        if (abstractC4308.m12913(enumC9454)) {
                            abstractC4308 = c6319.m17490(mo4958.f13890, abstractC4308);
                        }
                        mo4958 = abstractC4308 == null ? c6319.m17519(mo4958) : abstractC4308;
                    }
                }
                m17535 = new C19955(mo4958, m23923, m36173.f13890, m36173.m12921());
            } else {
                int m8245 = mo12938.m8245();
                C22364 c22364 = this.f28253;
                if (m8245 != 0) {
                    String num = Integer.toString(mo12938.m8245());
                    C12281 c12281 = C6241.f19132;
                    c22364.m7273(c16432, new C12281("compiler", "wrong.number.type.args", num));
                } else {
                    AbstractC19810 abstractC19810 = m36173.f13890;
                    C12281 c122812 = C6241.f19132;
                    c22364.m7273(c16432, new C12281("compiler", "type.doesnt.take.params", abstractC19810));
                }
                m17535 = c6319.m17535(c16432.f16086);
            }
        }
        this.f28223 = m23934(c16432, m17535, C15406.f47189, this.f28213);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1428(C23488 c23488) {
        C6319 c6319;
        C18837 c18837 = new C18837();
        Iterator it = c23488.f75416.iterator();
        C18837 c188372 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            c6319 = this.f28251;
            if (!hasNext) {
                break;
            }
            AbstractC12612 abstractC12612 = (AbstractC12612) it.next();
            AbstractC4308 m23954 = m23954(abstractC12612, this.f28211, AbstractC4308.f13885);
            abstractC12612.getClass();
            C15240 c15240 = this.f28214;
            AbstractC4308 m36106 = c15240.m36106(abstractC12612, c15240.m36173(abstractC12612, m23954), this.f28244.f66479, c15240.f46781);
            if (!m36106.mo12948()) {
                if (c15240.m36193(m36106, c18837.m43517())) {
                    Iterator it2 = c18837.iterator();
                    while (it2.hasNext()) {
                        AbstractC4308 abstractC4308 = (AbstractC4308) it2.next();
                        boolean m17546 = c6319.m17546(m36106, abstractC4308, true);
                        boolean m175462 = c6319.m17546(abstractC4308, m36106, true);
                        if (m17546 || m175462) {
                            AbstractC4308 abstractC43082 = m17546 ? m36106 : abstractC4308;
                            if (!m17546) {
                                abstractC4308 = m36106;
                            }
                            C12281 c12281 = C6241.f19132;
                            this.f28253.m7273(abstractC12612, new C12281("compiler", "multicatch.types.must.be.disjoint", abstractC43082, abstractC4308));
                        }
                    }
                }
                c18837.m43511(m36106);
                if (c188372 != null) {
                    c188372.m43511(m36106);
                }
            } else {
                if (c188372 == null) {
                    c188372 = new C18837();
                    c188372.m43513(c18837);
                }
                c188372.m43511(m36106);
            }
        }
        AbstractC4308 m23934 = m23934(c23488, c6319.m17548(c18837.m43517()), C15406.f47189, this.f28213.mo38525(EnumC22756.f73480));
        if (m23934.m12913(EnumC9454.CLASS)) {
            if (c188372 != null) {
                c18837 = c188372;
            }
            m23934 = new C7835((C19955) m23934, c18837.m43517());
        }
        this.f28223 = m23934;
        c23488.f16086 = m23934;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1412(C17138 c17138) {
        C2609 c2609 = c17138.f52525;
        this.f28214.m36123(c2609, m23923(c2609, this.f28211));
        AbstractC4308 m23931 = m23931(c17138, c17138.f52525);
        this.f28223 = m23931;
        c17138.f16086 = m23931;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1403(C14315 c14315) {
        C8541 c8541 = (C8541) c14315.f16086;
        C2609 c2609 = c14315.f43168;
        if (c2609 != null && c2609.m8249()) {
            C2609 c26092 = c14315.f43168;
            C13395 c13395 = this.f28250;
            c13395.getClass();
            c13395.f40035.m43511(new RunnableC6061(2, c13395, c26092));
        }
        if (c8541.mo12939().mo12948()) {
            return;
        }
        c8541.mo21267(m23931(c14315, c14315.f43170));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m23931(AbstractC5144 abstractC5144, C2609 c2609) {
        AbstractC12612 abstractC12612;
        HashSet hashSet = new HashSet();
        boolean m8249 = c2609.m8249();
        C6319 c6319 = this.f28251;
        if (m8249) {
            Object obj = c2609.f8240;
            AbstractC12612 abstractC126122 = (AbstractC12612) obj;
            abstractC126122.f16086 = m23926(abstractC126122.f16086, (AbstractC5144) obj, false, false, false);
            hashSet.add(c6319.m17519(((AbstractC12612) c2609.f8240).f16086));
            if (((AbstractC12612) c2609.f8240).f16086.mo12948()) {
                return ((AbstractC12612) c2609.f8240).f16086;
            }
            if (((AbstractC12612) c2609.f8240).f16086.m12913(EnumC9454.TYPEVAR)) {
                if (c2609.f8241.m8249()) {
                    AbstractC12612 abstractC126123 = (AbstractC12612) c2609.f8241.f8240;
                    abstractC126123.getClass();
                    this.f28253.m7273(abstractC126123, C6241.f19228);
                    return ((AbstractC12612) c2609.f8240).f16086;
                }
            } else {
                Iterator it = c2609.f8241.iterator();
                while (it.hasNext()) {
                    AbstractC12612 abstractC126124 = (AbstractC12612) it.next();
                    AbstractC4308 m23926 = m23926(abstractC126124.f16086, (AbstractC5144) abstractC126124, false, true, false);
                    abstractC126124.f16086 = m23926;
                    if (m23926.mo12948()) {
                        c2609 = C2609.of((Object) abstractC126124);
                    } else if (abstractC126124.f16086.m12913(EnumC9454.CLASS)) {
                        this.f28214.m36154(abstractC126124, c6319.m17519(abstractC126124.f16086), hashSet);
                    }
                }
            }
        }
        if (c2609.m8245() == 0) {
            return this.f28244.f66526;
        }
        if (c2609.m8245() == 1) {
            return ((AbstractC12612) c2609.f8240).f16086;
        }
        C5843 m17534 = c6319.m17534(C7260.m19434(c2609));
        if (((AbstractC12612) c2609.f8240).f16086.mo12925()) {
            abstractC12612 = null;
        } else {
            abstractC12612 = (AbstractC12612) c2609.f8240;
            c2609 = c2609.f8241;
        }
        C17013 c17013 = this.f28249;
        c17013.m39946((InterfaceC3109) abstractC5144);
        C5557 m39908 = c17013.m39908(c17013.m39899(1025L), this.f28229.f18867, C2609.m8239(), abstractC12612, c2609, C2609.m8239());
        C14163 c14163 = (C14163) m17534.f13890;
        c14163.mo16101();
        C12171.m29642((c14163.f17563 & 16777216) != 0);
        m39908.f17186 = c14163;
        C1755 c1755 = this.f28211;
        c14163.f42770 = c1755.f6075.f4745;
        c14163.f17563 |= 268435456;
        this.f28219.getClass();
        this.f28222.m39521(c14163, C13809.m33120(c1755, m39908));
        m23948(c14163);
        return m17534;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1408(C15726 c15726) {
        AbstractC4308 m23954;
        EnumC15678 enumC15678 = c15726.f48502.f60620;
        EnumC15678 enumC156782 = EnumC15678.UNBOUND;
        C20661 c20661 = this.f28244;
        if (enumC15678 != enumC156782) {
            m23954 = m23954(c15726.f48501, this.f28211, AbstractC4308.f13885);
        } else {
            m23954 = c20661.f66526;
        }
        this.f28223 = m23934(c15726, new C19831(this.f28214.m36201(c15726, m23954), c15726.f48502.f60620, c20661.f66480), C15406.f47189, this.f28213);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
        C12171.m29640("should be handled in annotate");
        throw null;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        C1755 c1755 = this.f28211;
        for (C2609 c2609 = c18257.f56778; c2609.m8249(); c2609 = c2609.f8241) {
            m23954(((C17551) c2609.f8240).f53650, c1755, AbstractC4308.f13885);
        }
        final AbstractC4308 mo12909 = m23954(c18257.f56779, this.f28211, AbstractC4308.f13885).mo12909(C14391.f43357);
        if (!((C8604) this.f28211.f6073).f26291) {
            final C2609 c26092 = c18257.f56778;
            final C13395 c13395 = this.f28250;
            c13395.getClass();
            c13395.f40035.m43511(new Runnable() { // from class: l.ᩴ᩹֨
                @Override // java.lang.Runnable
                public final void run() {
                    C13395.this.getClass();
                    C2609 c26093 = c26092;
                    C2609 m32389 = C13395.m32389(c26093);
                    C12171.m29642(c26093.m8245() == m32389.m8245());
                    mo12909.m12910(EnumC23564.ANNOTATIONS).mo18159(new C14391(m32389));
                }
            });
        }
        c18257.f16086 = mo12909;
        this.f28223 = mo12909;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1374(C3440 c3440) {
        C2609 c2609 = c3440.f10874;
        if (c2609 != null) {
            C1755 c1755 = this.f28211;
            C1755 m5877 = c1755.m5877(c1755.f6074, c1755.f6073);
            ((C8604) m5877.f6073).f26284 = this.f28228;
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                m23930((AbstractC5144) it.next(), m5877, new C23420(this, C15406.f47186, this.f28213.f75219));
            }
        }
        C12193 c12193 = this.f28244.f66457;
        c3440.f16086 = c12193;
        this.f28223 = c12193;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
        throw new AssertionError();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23942(C1755 c1755) {
        int i = C0883.f3449[c1755.f6074.mo989().ordinal()];
        C13395 c13395 = this.f28250;
        C15240 c15240 = this.f28214;
        if (i == 22) {
            AbstractC5144 abstractC5144 = c1755.f6074;
            abstractC5144.getClass();
            C0052 c0052 = ((C3587) c1755.f6074).f11377;
            try {
                c13395.m32413();
                C1755 m39519 = this.f28219.f41160.m39519(c0052);
                m23928(m39519.f6074, m39519);
                return;
            } catch (C20515 e) {
                c15240.m36110(abstractC5144, e);
                return;
            }
        }
        if (i == 23) {
            AbstractC5144 abstractC51442 = c1755.f6074;
            abstractC51442.getClass();
            C7814 c7814 = ((C7820) c1755.f6074).f24200;
            try {
                c13395.m32413();
                AbstractC12612 abstractC12612 = ((C7820) this.f28222.m39519(c7814).f6074).f24199;
                abstractC12612.getClass();
                c15240.m36144(c7814, abstractC12612);
                return;
            } catch (C20515 e2) {
                c15240.m36110(abstractC51442, e2);
                return;
            }
        }
        AbstractC5144 abstractC51443 = c1755.f6074;
        abstractC51443.getClass();
        C14163 c14163 = c1755.f6079.f17186;
        try {
            c13395.m32413();
            m23948(c14163);
        } catch (C20515 e3) {
            c15240.m36110(abstractC51443, e3);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23948(C14163 c14163) {
        C4824 c4824;
        InterfaceC18278 interfaceC18278;
        C23420 c23420;
        C20661 c20661;
        Iterator it;
        boolean z;
        AbstractC4308 abstractC4308;
        C11576 c11576;
        if (!c14163.f17560.m12913(EnumC9454.ERROR)) {
            AbstractC4308 abstractC43082 = c14163.f17560;
            C15240 c15240 = this.f28214;
            c15240.m36186(null, abstractC43082);
            AbstractC4308 abstractC43083 = c14163.f17560;
            C6319 c6319 = this.f28251;
            AbstractC4308 m17562 = c6319.m17562(abstractC43083);
            long j = c14163.f17563;
            if ((16777216 & j) == 0 && (j & 536870912) == 0) {
                EnumC9454 enumC9454 = EnumC9454.CLASS;
                if (m17562.m12913(enumC9454)) {
                    m23948((C14163) m17562.f13890);
                }
                AbstractC5698 abstractC5698 = c14163.f17561;
                if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.f17560.m12913(enumC9454)) {
                    m23948((C14163) c14163.f17561);
                }
                c14163.f17563 |= 536870912;
            }
            long j2 = c14163.f17563;
            if ((268435456 & j2) != 0) {
                c14163.f17563 = j2 & (-268435457);
                C1755 m39519 = this.f28222.m39519(c14163);
                boolean m16100 = c14163.m16100();
                C22364 c22364 = this.f28253;
                if (m16100 && !c14163.m16090() && !c14163.f42764 && c14163.f42765.isEmpty()) {
                    c22364.m7273(C7260.m19439(c14163, m39519.f6074, false), C6241.f19191);
                }
                boolean m161002 = c14163.m16100();
                C20661 c206612 = this.f28244;
                if (m161002) {
                    HashSet hashSet = new HashSet();
                    boolean z2 = c14163.m16089().f24147 == c206612.f66447 || c14163.m16089().f24147 == c206612.f66465;
                    for (Iterator it2 = c14163.f42765.iterator(); it2.hasNext(); it2 = it) {
                        AbstractC5698 abstractC56982 = (AbstractC5698) it2.next();
                        if (abstractC56982.f17560.mo3258() == EnumC9454.TYPEVAR) {
                            AbstractC5144 m19439 = C7260.m19439(abstractC56982, m39519.f6074, false);
                            AbstractC4308 abstractC43084 = abstractC56982.f17560;
                            C11576 c115762 = C11886.f35440;
                            it = it2;
                            c20661 = c206612;
                            c22364.m7273(m19439, C6241.m17186(new C11576("compiler", "is.a.type.variable", abstractC43084)));
                            z = true;
                        } else {
                            c20661 = c206612;
                            it = it2;
                            z = false;
                        }
                        if (abstractC56982.f17562.isEmpty() && !c14163.m16090()) {
                            AbstractC5144 m194392 = C7260.m19439(abstractC56982, m39519.f6074, false);
                            C12281 c12281 = C6241.f19132;
                            c22364.m7273(m194392, new C12281("compiler", "local.classes.cant.extend.sealed", C11886.f35494));
                        }
                        if (hashSet.contains(abstractC56982)) {
                            abstractC4308 = m17562;
                            InterfaceC3109 interfaceC3109 = (InterfaceC3109) ((C2609) C5378.stream(m39519.f6079.f17182).filter(new C3379(1, abstractC56982)).limit(2L).collect(C2609.m8240())).get(1);
                            AbstractC4308 abstractC43085 = abstractC56982.f17560;
                            C11576 c115763 = C11886.f35440;
                            c22364.m7273(interfaceC3109, C6241.m17186(new C11576("compiler", "is.duplicated", abstractC43085)));
                        } else {
                            abstractC4308 = m17562;
                            hashSet.add(abstractC56982);
                        }
                        if (z2) {
                            if (abstractC56982.m16089() != c14163.m16089()) {
                                AbstractC5144 m194393 = C7260.m19439(abstractC56982, m39519.f6074, false);
                                C12281 c122812 = C6241.f19132;
                                c22364.m7273(m194393, new C12281("compiler", "class.in.unnamed.module.cant.extend.sealed.in.diff.package", c14163));
                            }
                        } else if (abstractC56982.m16089().f24147 != c14163.m16089().f24147) {
                            AbstractC5144 m194394 = C7260.m19439(abstractC56982, m39519.f6074, false);
                            C0052 c0052 = c14163.m16089().f24147;
                            C12281 c122813 = C6241.f19132;
                            c22364.m7273(m194394, new C12281("compiler", "class.in.module.cant.extend.sealed.in.diff.module", c14163, c0052));
                        }
                        AbstractC4308 abstractC43086 = c14163.f17560;
                        if (abstractC56982 == abstractC43086.f13890 || c6319.m17536(abstractC56982.f17560, abstractC43086)) {
                            InterfaceC3109 interfaceC31092 = (InterfaceC3109) C5378.stream(((C5557) m39519.f6074).f17182).map(new C5693(3, abstractC56982)).filter(new C4464(5)).findFirst().get();
                            if (abstractC56982 == c14163.f17560.f13890) {
                                c11576 = C11886.f35469;
                            } else {
                                AbstractC4308 abstractC43087 = abstractC56982.f17560;
                                C11576 c115764 = C11886.f35440;
                                c11576 = new C11576("compiler", "must.not.be.supertype", abstractC43087);
                            }
                            c22364.m7273(interfaceC31092, C6241.m17186(c11576));
                        } else if (!z && !C5378.stream(c6319.m17565(abstractC56982.f17560)).anyMatch(new C15448(0, c14163))) {
                            AbstractC5144 m194395 = C7260.m19439(abstractC56982, m39519.f6074, false);
                            AbstractC4308 abstractC43088 = abstractC56982.f17560;
                            C11576 c115765 = C11886.f35440;
                            c22364.m7273(m194395, C6241.m17186(new C11576("compiler", "doesnt.extend.sealed", abstractC43088)));
                        }
                        m17562 = abstractC4308;
                        c206612 = c20661;
                    }
                }
                C20661 c206613 = c206612;
                AbstractC4308 abstractC43089 = m17562;
                C2609 c2609 = (C2609) C5378.stream(c6319.m17565(c14163.f17560)).filter(new C21800(0)).map(new C21670(5)).collect(C2609.m8240());
                if (!c2609.isEmpty()) {
                    if (c14163.m16077() && !c14163.m16090()) {
                        AbstractC5144 m194396 = C7260.m19439(c14163, m39519.f6074, false);
                        C11576 c115766 = c14163.f17562.isEmpty() ? C11886.f35494 : C11886.f35498;
                        C12281 c122814 = C6241.f19132;
                        c22364.m7273(m194396, new C12281("compiler", "local.classes.cant.extend.sealed", c115766));
                    }
                    if (!c14163.f17560.mo5146()) {
                        Iterator it3 = c2609.iterator();
                        while (it3.hasNext()) {
                            C14163 c141632 = (C14163) it3.next();
                            if (!c141632.f42765.contains(c14163.f17560.f13890)) {
                                AbstractC5144 m194397 = C7260.m19439(c14163.f17560.f13890, m39519.f6074, false);
                                C12281 c122815 = C6241.f19132;
                                c22364.m7273(m194397, new C12281("compiler", "cant.inherit.from.sealed", c141632));
                            }
                        }
                        long j3 = c14163.f17563;
                        if ((j3 & Long.MIN_VALUE) == 0 && (j3 & 16) == 0 && !c14163.m16100()) {
                            c22364.m7273(C7260.m19439(c14163, m39519.f6074, false), c14163.m16070() ? C6241.f19163 : C6241.f19130);
                        }
                    }
                } else if ((c14163.f17563 & Long.MIN_VALUE) != 0 && !C5378.stream(c6319.m17565(c14163.f17560)).anyMatch(new C18282(2))) {
                    AbstractC5144 m194398 = C7260.m19439(c14163, m39519.f6074, false);
                    C12281 c122816 = C6241.f19132;
                    c22364.m7273(m194398, new C12281("compiler", "non.sealed.with.no.sealed.supertype", c14163));
                }
                C1755 c1755 = m39519;
                while (true) {
                    c4824 = ((C8604) c1755.f6073).f26289;
                    if (c4824 != null) {
                        break;
                    } else {
                        c1755 = c1755.f6072;
                    }
                }
                Object obj = m39519.f6073;
                ((C8604) obj).f26289 = c4824.m14053(c14163);
                C8604 c8604 = (C8604) obj;
                C4824 m36112 = c15240.m36112(c8604.f26289);
                InterfaceC18278 m7284 = c22364.m7284(c14163.f42770);
                C23420 c234202 = c8604.f26284;
                try {
                    this.f28248.m42472(m39519.f6074);
                    ((C8604) obj).f26284 = null;
                    if (abstractC43089.f13890 == c206613.f66527) {
                        interfaceC18278 = m7284;
                        c23420 = c234202;
                        try {
                            if ((c14163.f17563 & 16793600) == 0) {
                                AbstractC5144 abstractC5144 = m39519.f6074;
                                abstractC5144.getClass();
                                c22364.m7273(abstractC5144, C6241.f19187);
                            }
                        } catch (Throwable th) {
                            th = th;
                            c8604.f26284 = c23420;
                            c22364.m7284(interfaceC18278);
                            c15240.m36112(m36112);
                            throw th;
                        }
                    } else {
                        interfaceC18278 = m7284;
                        c23420 = c234202;
                    }
                    AbstractC19810 abstractC19810 = abstractC43089.f13890;
                    if (abstractC19810 != null && (abstractC19810.f17563 & 16384) != 0 && (c14163.f17563 & 16793600) == 0) {
                        AbstractC5144 abstractC51442 = m39519.f6074;
                        abstractC51442.getClass();
                        c22364.m7273(abstractC51442, C6241.f19241);
                    }
                    if (m23951(c14163.f17560)) {
                        ((C8604) obj).f26287 = true;
                    }
                    m23911(c14163, m39519);
                    AbstractC5144 abstractC51443 = m39519.f6074;
                    abstractC51443.getClass();
                    c15240.m36144((AbstractC5698) c14163, abstractC51443);
                    AbstractC5144 abstractC51444 = m39519.f6074;
                    abstractC51444.getClass();
                    c15240.m36139(abstractC51444, c14163);
                    c15240.m36142((C5557) m39519.f6074, c14163);
                    c15240.m36119(m39519, (C5557) m39519.f6074);
                    c8604.f26284 = c23420;
                    c22364.m7284(interfaceC18278);
                    c15240.m36112(m36112);
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC18278 = m7284;
                    c23420 = c234202;
                }
            }
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        C0052 c0052 = c3587.f11377;
        InterfaceC6403 interfaceC6403 = c0052.f923;
        InterfaceC6403 interfaceC64032 = InterfaceC6403.f19811;
        if (interfaceC6403 != interfaceC64032) {
            c0052.f923 = interfaceC64032;
            interfaceC6403.mo7076(c0052);
        }
        C0052 c00522 = c3587.f11377;
        C8604 c8604 = (C8604) this.f28211.f6076.f6073;
        C4824 m14053 = c8604.f26289.m14053(c00522);
        c8604.f26289 = m14053;
        C15240 c15240 = this.f28214;
        C4824 m36112 = c15240.m36112(m14053);
        c15240.m36132(c3587);
        c15240.m36144(c00522, c3587);
        try {
            this.f28248.m42472((AbstractC5144) c3587);
        } finally {
            c15240.m36112(m36112);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23911(C14163 c14163, C1755 c1755) {
        C6136 c6136;
        long j;
        C22364 c22364;
        C12048 c12048;
        C17551 c17551;
        AbstractC5144 abstractC5144 = c1755.f6074;
        Object obj = c1755.f6073;
        C5557 c5557 = (C5557) abstractC5144;
        C12171.m29642(c14163 == c5557.f17186);
        m23956(c5557.f17185, c1755);
        boolean isEmpty = c14163.f17562.isEmpty();
        C15240 c15240 = this.f28214;
        if (!isEmpty) {
            c15240.m36122(c5557.f17185, c1755);
            c15240.m36137((AbstractC5144) c5557.f17184, c1755, true);
            c15240.m36122(c5557.f17183, c1755);
        }
        C6319 c6319 = this.f28251;
        c14163.m33813(c6319);
        c14163.mo16101();
        if ((c14163.f17563 & 1536) == 0) {
            c15240.m36157(c14163, (InterfaceC3109) c5557);
        }
        c14163.mo16101();
        long j2 = c14163.f17563 & 8192;
        C22364 c223642 = this.f28253;
        if (j2 != 0) {
            if (c5557.f17183.m8249()) {
                AbstractC12612 abstractC12612 = (AbstractC12612) c5557.f17183.f8240;
                abstractC12612.getClass();
                c223642.m7273(abstractC12612, C6241.f19287);
            }
            if (c5557.f17185.m8249()) {
                C14315 c14315 = (C14315) c5557.f17185.f8240;
                c14315.getClass();
                C12281 c12281 = C6241.f19132;
                c223642.m7273(c14315, new C12281("compiler", "intf.annotation.cant.have.type.params", c14163));
            }
            C16384 mo36582 = c14163.mo33816().mo36582();
            if (mo36582 != null) {
                AbstractC4308 abstractC4308 = mo36582.f26338;
                C2609 c2609 = c5557.f17181.f7168;
                while (true) {
                    if (c2609.isEmpty()) {
                        c17551 = null;
                        break;
                    } else {
                        if (c6319.m17550(((C17551) c2609.f8240).f53650.f16086, abstractC4308)) {
                            c17551 = (C17551) c2609.f8240;
                            c17551.getClass();
                            break;
                        }
                        c2609 = c2609.f8241;
                    }
                }
                C12171.m29637(c17551);
                c15240.m36158(c14163, mo36582, c17551);
            }
        } else {
            c15240.m36190(c5557, c14163.f17560);
            if (this.f28212) {
                c15240.m36195(c5557, c14163.f17560);
            }
        }
        AbstractC4308 abstractC43082 = c14163.f17560;
        c15240.getClass();
        c15240.m36124(c5557, new HashMap(), abstractC43082);
        c5557.f16086 = c14163.f17560;
        for (C2609 c26092 = c5557.f17185; c26092.m8249(); c26092 = c26092.f8241) {
            C12171.m29637(((C8604) obj).f26285.mo20478(((C14315) c26092.f8240).f43169, (Predicate) null));
        }
        if (!c14163.f17560.mo12934().isEmpty() && c6319.m17546(c14163.f17560, this.f28244.f66479, true)) {
            AbstractC12612 abstractC126122 = c5557.f17184;
            abstractC126122.getClass();
            c223642.m7273(abstractC126122, C6241.f19277);
        }
        C14163 c141632 = c5557.f17186;
        c15240.m36140((AbstractC5144) c5557, c141632, c141632);
        m23944((InterfaceC3109) c5557, c1755, c14163.f17560);
        C2609 c26093 = c5557.f17179;
        while (true) {
            boolean m8249 = c26093.m8249();
            c6136 = this.f28229;
            if (!m8249) {
                break;
            }
            m23928((AbstractC5144) c26093.f8240, c1755);
            if (!this.f28245 && c14163.f17561.f17559 != EnumC1296.f4579) {
                c14163.mo16101();
                if (((c14163.f17563 & 8) == 0 || c14163.f17562 == c6136.f18867) && (C7260.m19473((AbstractC5144) c26093.f8240) & 520) != 0) {
                    C12048 c120482 = ((AbstractC5144) c26093.f8240).m14709(EnumC18550.f57578) ? ((C9378) c26093.f8240).f28489 : null;
                    if (c120482 == null || c120482.f17559 != EnumC1296.f4567 || c120482.m29425() == null) {
                        AbstractC5144 abstractC51442 = (AbstractC5144) c26093.f8240;
                        abstractC51442.getClass();
                        C12281 c122812 = C6241.f19132;
                        c223642.m7273(abstractC51442, new C12281("compiler", "icls.cant.have.static.decl", c14163));
                    }
                }
            }
            c26093 = c26093.f8241;
        }
        c15240.m36141(c5557);
        long j3 = c5557.f17186.f17563;
        if ((j3 & 8192) == 0) {
            c22364 = c223642;
        } else {
            C12171.m29642((j3 & 134217728) == 0);
            try {
                j = 34359738368L;
                c22364 = c223642;
                try {
                    c5557.f17186.f17563 |= 134217728;
                    Iterator it = c5557.f17179.iterator();
                    while (it.hasNext()) {
                        AbstractC5144 abstractC51443 = (AbstractC5144) it.next();
                        if (abstractC51443.m14709(EnumC18550.f57511)) {
                            C8526 c8526 = (C8526) abstractC51443;
                            c15240.m36149(c8526, c8526.f26051.f16086);
                        }
                    }
                    C14163 c141633 = c5557.f17186;
                    c141633.f17563 = ((-134217729) & c141633.f17563) | 34359738368L;
                } catch (Throwable th) {
                    th = th;
                    C14163 c141634 = c5557.f17186;
                    c141634.f17563 = (c141634.f17563 & (-134217729)) | j;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j = 34359738368L;
            }
        }
        C8604 c8604 = (C8604) obj;
        if (c8604.f26289.m14055(EnumC20347.SERIAL) && m23951(c14163.f17560)) {
            c14163.mo16101();
            if ((c14163.f17563 & 16896) == 0 && !c14163.f17562.isEmpty()) {
                c14163.mo16101();
                Iterator it2 = c14163.f42762.m20476(c6136.f18795).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c12048 = null;
                        break;
                    }
                    AbstractC5698 abstractC5698 = (AbstractC5698) it2.next();
                    if (abstractC5698.f17559 == EnumC1296.f4567) {
                        c12048 = (C12048) abstractC5698;
                        break;
                    }
                }
                if (c12048 != null) {
                    C4824 m14053 = c8604.f26289.m14053(c12048);
                    EnumC20347 enumC20347 = EnumC20347.SERIAL;
                    if (!m14053.m14056(enumC20347)) {
                        if ((c12048.f17563 & 24) != 24) {
                            AbstractC5144 m19439 = C7260.m19439(c12048, c5557, false);
                            C11076 c11076 = C14001.f42334;
                            c22364.m7286(enumC20347, m19439, new C11076("compiler", "improper.SVUID", c14163));
                        } else if (!c12048.f17560.m12913(EnumC9454.LONG)) {
                            AbstractC5144 m194392 = C7260.m19439(c12048, c5557, false);
                            C11076 c110762 = C14001.f42334;
                            c22364.m7286(enumC20347, m194392, new C11076("compiler", "long.SVUID", c14163));
                        } else if (c12048.m29425() == null) {
                            AbstractC5144 m194393 = C7260.m19439(c12048, c5557, false);
                            C11076 c110763 = C14001.f42334;
                            c22364.m7286(enumC20347, m194393, new C11076("compiler", "constant.SVUID", c14163));
                        }
                    }
                } else if (!c14163.m33810()) {
                    EnumC20347 enumC203472 = EnumC20347.SERIAL;
                    C11076 c110764 = C14001.f42334;
                    c22364.m7286(enumC203472, c5557, new C11076("compiler", "missing.SVUID", c14163));
                }
            }
        }
        if (this.f28255) {
            this.f28256.m40511(c5557);
            m23945((AbstractC5144) c5557, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23951(AbstractC4308 abstractC4308) {
        C20661 c20661 = this.f28244;
        try {
            c20661.f66487.mo12918();
            return this.f28251.m17546(abstractC4308, c20661.f66487, true);
        } catch (C20515 unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23909(C9378 c9378, AbstractC4308 abstractC4308) {
        boolean mo12948 = abstractC4308.mo12948();
        C17013 c17013 = this.f28249;
        if (mo12948) {
            c17013.f52172 = -1;
            c9378.f28488 = c17013.m39948();
        } else {
            c17013.f52172 = -1;
            c9378.f28488 = c17013.m39965(abstractC4308);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23945(AbstractC5144 abstractC5144, boolean z) {
        abstractC5144.mo988(new C20599(this, z));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23957(AbstractC5144 abstractC5144) {
        new C17776(this).mo10758(abstractC5144);
    }
}
