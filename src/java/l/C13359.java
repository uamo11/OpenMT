package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.am;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: N44J */
/* renamed from: l.۬᩷۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13359 extends AbstractC0204 {

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f39939 = new C4314();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C23294 f39940;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10658 f39941;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f39942;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C6319 f39943;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f39944;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C22406 f39945;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C14439 f39946;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7715 f39947;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17013 f39948;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C9833 f39949;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f39950;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C1323 f39951;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C6136 f39952;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C1755 f39953;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC12117 f39954;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9833 f39955;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13395 f39956;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final boolean f39957;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1740 f39958;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC19711 f39959;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2609 f39960;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC10892 f39961;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1365 f39962;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f39964;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1755 f39965;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15240 f39967;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f39968;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22364 f39969;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashMap f39970;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f39971;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12323 f39972;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f39973;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C20661 f39974;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC1719 f39975;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f39963 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20416 f39966 = new C20416(this);

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1380(C5704 c5704) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13359 m32330(C2903 c2903) {
        C13359 c13359 = (C13359) c2903.m8838(f39939);
        return c13359 == null ? new C13359(c2903) : c13359;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m32327(int i) {
        int i2 = 3;
        if (i != 0) {
            if (i == 1) {
                i2 = 9;
            } else if (i == 2) {
                i2 = 11;
            } else if (i == 3) {
                i2 = 14;
            } else if (i != 5 && i != 6 && i != 7) {
                throw new AssertionError("zero");
            }
        }
        return i2 + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m32347(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308) {
        boolean m12913 = abstractC4308.m12913(EnumC9454.ARRAY);
        C20661 c20661 = this.f39974;
        if (!m12913) {
            return (abstractC5698.f17561 == abstractC4308.f13890 || (abstractC5698.mo16084() & 4104) == 4104 || abstractC5698.f17561 == c20661.f66526.f13890) ? abstractC5698 : abstractC5698.mo7177(abstractC4308.f13890);
        }
        if (abstractC5698 == c20661.f66532 || abstractC5698.f17561 != c20661.f66505) {
            return abstractC5698;
        }
        HashMap hashMap = this.f39970;
        AbstractC5698 abstractC56982 = (AbstractC5698) hashMap.get(abstractC4308);
        if (abstractC56982 == null) {
            abstractC56982 = new C14163(1L, abstractC4308.f13890.f17562, abstractC4308, c20661.f66475);
            hashMap.put(abstractC4308, abstractC56982);
        }
        return abstractC5698.mo7177(abstractC56982);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32344(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        m32337(interfaceC3109, abstractC4308);
        return this.f39972.m29889(abstractC4308);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m32337(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        int i = C22532.f72909[abstractC4308.mo3258().ordinal()];
        if (i == 1) {
            m32337(interfaceC3109, abstractC4308.mo12923());
            for (C2609 mo12933 = abstractC4308.mo12933(); mo12933.m8249(); mo12933 = mo12933.f8241) {
                m32337(interfaceC3109, (AbstractC4308) mo12933.f8240);
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C6319 c6319 = this.f39943;
        c6319.getClass();
        int i2 = 0;
        while (abstractC4308.m12913(EnumC9454.ARRAY)) {
            i2++;
            abstractC4308 = c6319.m17515(abstractC4308);
        }
        if (i2 > 255) {
            this.f39969.m7273(interfaceC3109, C6241.f19157);
            this.f39963++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1740 m32345(AbstractC4308 abstractC4308) {
        C12048 c12048 = new C12048(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, this.f39952.f18867, abstractC4308, this.f39953.f6077.f26045);
        this.f39962.m4799(c12048);
        return this.f39946.m34466(c12048);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32361(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, boolean z) {
        AbstractC7715[] abstractC7715Arr;
        AbstractC7715[] abstractC7715Arr2;
        C3581 m50300 = this.f39945.m50300(abstractC5144, this.f39965, abstractC4308, abstractC10370, c2609, (C2609) null);
        if (z) {
            C14439 c14439 = this.f39946;
            c14439.getClass();
            C6319 c6319 = c14439.f44256;
            C1365.m4782(m50300.mo16091(c6319));
            C10658 c10658 = (C10658) m50300.mo16091(c6319);
            int m4782 = C1365.m4782(c10658.f32060);
            c14439.f44254.m4826(m50300, c10658);
            abstractC7715Arr2 = c14439.f44255;
            AbstractC7715 abstractC7715 = abstractC7715Arr2[m4782];
            return;
        }
        C14439 c144392 = this.f39946;
        boolean z2 = abstractC10370 == this.f39952.f18879;
        c144392.getClass();
        C6319 c63192 = c144392.f44256;
        C1365 c1365 = c144392.f44254;
        C1365.m4782(m50300.mo16091(c63192));
        C10658 c106582 = (C10658) m50300.m16096(c63192);
        int m47822 = C1365.m4782(c106582.f32060);
        if ((m50300.f17561.mo16084() & 512) != 0 && !z2) {
            c1365.m4807(m50300, c106582);
        } else if (z2) {
            c1365.m4820(m50300, c106582);
        } else {
            c1365.m4830(m50300, c106582);
        }
        abstractC7715Arr = c144392.f44255;
        AbstractC7715 abstractC77152 = abstractC7715Arr[m47822];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m32341(C8526 c8526) {
        if ((c8526.f26046.f7169 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
            return false;
        }
        AbstractC10370 abstractC10370 = c8526.f26044;
        return abstractC10370.m26176(this.f39942) && (abstractC10370.mo2758(abstractC10370.mo2759() - 1) & 1) == 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32364(C1755 c1755) {
        AbstractC3482 abstractC3482;
        if (!this.f39962.m4831() || (abstractC3482 = ((C4893) c1755.f6073).f15450) == null) {
            return;
        }
        abstractC3482.mo10662();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32353(C1755 c1755) {
        C18837 c18837 = ((C4893) c1755.f6073).f15452;
        if (c18837 == null || c18837.m43514() % 2 != 1) {
            return;
        }
        ((C4893) c1755.f6073).f15452.m43511(Integer.valueOf(this.f39962.m4816()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32354(C1755 c1755, C1755 c17552) {
        C1755 c17553 = null;
        while (c17553 != c17552) {
            m32353(c1755);
            c17553 = c1755;
            c1755 = c1755.f6072;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m32346(C14163 c14163, C2609 c2609) {
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        C18837 c188373 = new C18837();
        C18837 c188374 = new C18837();
        C18837 c188375 = new C18837();
        C2609 c26092 = c2609;
        while (true) {
            boolean m8249 = c26092.m8249();
            C17013 c17013 = this.f39948;
            if (!m8249) {
                int m43514 = c18837.m43514();
                C6136 c6136 = this.f39952;
                if (m43514 != 0) {
                    C2609 m43517 = c18837.m43517();
                    c188372.addAll(c14163.m16105());
                    C2609 m435172 = c188372.m43517();
                    Iterator it = c188375.iterator();
                    while (it.hasNext()) {
                        C8526 c8526 = (C8526) ((AbstractC5144) it.next());
                        if (c8526.f26044 == c6136.f18879 && C7260.m19469(c8526)) {
                            C2609 c26093 = c8526.f26043.f8521;
                            C18837 c188376 = new C18837();
                            if (c26093.m8249()) {
                                while (C7260.m19430((AbstractC5144) c26093.f8240)) {
                                    c188376.m43511((AbstractC11349) c26093.f8240);
                                    c26093 = c26093.f8241;
                                }
                                c188376.m43511((AbstractC11349) c26093.f8240);
                                C2609 c26094 = c26093.f8241;
                                while (c26094.m8249() && C7260.m19430((AbstractC5144) c26094.f8240)) {
                                    c188376.m43511((AbstractC11349) c26094.f8240);
                                    c26094 = c26094.f8241;
                                }
                                c188376.m43512(m43517);
                                while (c26094.m8249()) {
                                    c188376.m43511((AbstractC11349) c26094.f8240);
                                    c26094 = c26094.f8241;
                                }
                            }
                            c8526.f26043.f8521 = c188376.m43517();
                            C2735 c2735 = c8526.f26043;
                            if (c2735.f8520 == -1) {
                                c2735.f8520 = C7260.m19467((AbstractC5144) c2735.f8521.last());
                            }
                            c8526.f26045.m16097(m435172);
                        }
                    }
                }
                if (c188373.m43514() != 0) {
                    c14163.mo16101();
                    long j = (c14163.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) | 8;
                    AbstractC10370 abstractC10370 = c6136.f18842;
                    C2609 m8239 = C2609.m8239();
                    C20661 c20661 = this.f39974;
                    C3581 c3581 = new C3581(j, abstractC10370, new C10658(m8239, c20661.f66501, C2609.m8239(), c20661.f66481), c14163);
                    c14163.mo16101();
                    c14163.f42762.mo26382(c3581);
                    C2609 m435173 = c188373.m43517();
                    AbstractC11349 abstractC11349 = (AbstractC11349) m435173.f8240;
                    abstractC11349.getClass();
                    c17013.m39946((InterfaceC3109) abstractC11349);
                    C2735 m39902 = c17013.m39902(0L, m435173);
                    m39902.f8520 = C7260.m19467((AbstractC5144) m435173.last());
                    c188375.m43511(c17013.m39918(c3581, c3581.f17560, m39902));
                    if (!c188374.isEmpty()) {
                        c3581.m16097(c188374.m43517());
                    }
                    if (!c14163.m16073().isEmpty()) {
                        c3581.m16097(c14163.m16073());
                    }
                }
                return c188375.m43517();
            }
            AbstractC5144 abstractC5144 = (AbstractC5144) c26092.f8240;
            int i = C22532.f72910[abstractC5144.mo989().ordinal()];
            if (i == 1) {
                C2735 c27352 = (C2735) abstractC5144;
                long j2 = c27352.f8522;
                if ((8 & j2) != 0) {
                    c188373.m43511(c27352);
                } else if ((ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF & j2) == 0) {
                    c18837.m43511(c27352);
                }
            } else if (i == 2) {
                c188375.m43511(abstractC5144);
            } else {
                if (i != 3) {
                    C12171.m29636();
                    throw null;
                }
                C9378 c9378 = (C9378) abstractC5144;
                C12048 c12048 = c9378.f28489;
                m32337(c9378, c12048.f17560);
                if (c9378.f28487 != null) {
                    C18837 c188377 = c188374;
                    C18837 c188378 = c188375;
                    if ((c12048.f17563 & 8) == 0) {
                        c17013.m39946((InterfaceC3109) c9378);
                        C21080 m39941 = c17013.m39941((AbstractC12612) c17013.m39914((AbstractC5698) c12048), c9378.f28487);
                        m39941.f16086 = c12048.f17560;
                        C10496 m39953 = c17013.m39953(m39941);
                        c18837.m43511(m39953);
                        this.f39954.mo6594(c9378, m39953);
                        c188372.addAll(m32329(c12048));
                        c188374 = c188377;
                    } else if (c12048.m29425() == null) {
                        c17013.f52172 = c9378.f16085;
                        C21080 m399412 = c17013.m39941((AbstractC12612) c17013.m39914((AbstractC5698) c12048), c9378.f28487);
                        m399412.f16086 = c12048.f17560;
                        C10496 m399532 = c17013.m39953(m399412);
                        c188373.m43511(m399532);
                        this.f39954.mo6594(c9378, m399532);
                        c188374 = c188377;
                        c188374.addAll(m32329(c12048));
                    } else {
                        c188374 = c188377;
                        InterfaceC3109 interfaceC3109 = c9378.f28487;
                        interfaceC3109.getClass();
                        m32332(interfaceC3109, c12048.m29425());
                        c9378.f28487.mo988(this.f39966);
                    }
                    c188375 = c188378;
                }
            }
            c26092 = c26092.f8241;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m32329(C12048 c12048) {
        C2609 mo16081 = c12048.mo16081();
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        Iterator it = mo16081.iterator();
        while (it.hasNext()) {
            C6507 c6507 = (C6507) it.next();
            C12171.m29642(c6507.mo5383().f30045 != EnumC9372.UNKNOWN);
            if (c6507.mo5383().f30045 == EnumC9372.FIELD) {
                c18837.m43511(c6507);
            } else {
                c188372.m43511(c6507);
            }
        }
        c12048.m16074(c18837.m43517());
        return c188372.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32332(InterfaceC3109 interfaceC3109, Object obj) {
        if (this.f39963 != 0 || obj == null || !(obj instanceof String) || ((String) obj).length() < 65535) {
            return;
        }
        this.f39969.m7273(interfaceC3109, C6241.f19167);
        this.f39963++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32359(AbstractC5144 abstractC5144, C1755 c1755) {
        C1755 c17552 = this.f39953;
        try {
            this.f39953 = c1755;
            abstractC5144.mo988(this);
        } catch (C20515 e) {
            C15240 c15240 = this.f39967;
            abstractC5144.getClass();
            c15240.m36110(abstractC5144, e);
        } finally {
            this.f39953 = c17552;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32360(AbstractC5144 abstractC5144, C1755 c1755, int i) {
        if (!this.f39964) {
            m32365(abstractC5144, c1755);
            return;
        }
        int m4816 = this.f39962.m4816();
        m32365(abstractC5144, c1755);
        if (abstractC5144.m14709(EnumC18550.f57550)) {
            i |= 2;
        }
        C1365 c1365 = this.f39962;
        c1365.f4986.m27979(abstractC5144, i, m4816, c1365.m4816());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32365(AbstractC5144 abstractC5144, C1755 c1755) {
        if (this.f39962.m4831()) {
            this.f39962.m4833(abstractC5144.f16085);
            m32359(abstractC5144, c1755);
        } else if (((C4893) c1755.f6073).f15451 && abstractC5144.m14709(EnumC18550.f57578)) {
            this.f39962.m4799(((C9378) abstractC5144).f28489);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32356(C2609 c2609, C1755 c1755) {
        while (c2609.m8249()) {
            m32360((AbstractC5144) c2609.f8240, c1755, 1);
            c2609 = c2609.f8241;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6304 m32348(AbstractC5144 abstractC5144, int i) {
        if (!this.f39964) {
            return m32349(abstractC5144, false);
        }
        int m4816 = this.f39962.m4816();
        C6304 m32349 = m32349(abstractC5144, (i & 8) != 0);
        C1365 c1365 = this.f39962;
        c1365.f4986.m27979(abstractC5144, i, m4816, c1365.m4816());
        return m32349;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6304 m32349(AbstractC5144 abstractC5144, boolean z) {
        AbstractC5144 m19471 = C7260.m19471(abstractC5144);
        if (m19471.m14709(EnumC18550.f57569)) {
            C8379 c8379 = (C8379) m19471;
            C6304 m32348 = m32348(c8379.f25701, 8);
            boolean z2 = m32348.f19490 == null && m32348.f19492 == 167;
            C9833 c9833 = m32348.f19493;
            if (z2) {
                this.f39962.m4811(c9833);
                C6304 m323482 = m32348(c8379.f25699, 16);
                if (z) {
                    m323482.f19489 = c8379.f25699;
                }
                return m323482;
            }
            if (m32348.m17359()) {
                this.f39962.m4811(m32348.f19490);
                C6304 m323483 = m32348(c8379.f25700, 16);
                if (z) {
                    m323483.f19489 = c8379.f25700;
                }
                return m323483;
            }
            C9833 m17364 = m32348.m17364();
            this.f39962.m4811(c9833);
            C6304 m323484 = m32348(c8379.f25699, 16);
            if (z) {
                m323484.f19489 = c8379.f25699;
            }
            C9833 m173642 = m323484.m17364();
            this.f39962.m4811(m323484.f19493);
            C9833 m4800 = this.f39962.m4800(167);
            this.f39962.m4811(m17364);
            C6304 m323485 = m32348(c8379.f25700, 16);
            C14439 c14439 = this.f39946;
            int i = m323485.f19492;
            C9833 m4783 = C1365.m4783(m4800, m323485.f19493);
            C9833 m47832 = C1365.m4783(m173642, m323485.f19490);
            c14439.getClass();
            C6304 c6304 = new C6304(c14439, i, m4783, m47832);
            if (z) {
                c6304.f19489 = c8379.f25700;
            }
            return c6304;
        }
        if (m19471.m14709(EnumC18550.f57555)) {
            this.f39962.m4832();
            boolean z3 = this.f39944;
            C9833 c98332 = this.f39949;
            C9833 c98333 = this.f39955;
            try {
                this.f39944 = true;
                this.f39949 = null;
                this.f39955 = null;
                try {
                    m32339((C13464) m19471);
                } catch (C20515 e) {
                    this.f39967.m36110(abstractC5144, e);
                    this.f39962.f4970.f17313 = 1;
                }
                C14439 c144392 = this.f39946;
                C9833 c98334 = this.f39949;
                C9833 c98335 = this.f39955;
                c144392.getClass();
                C6304 c63042 = new C6304(c144392, 167, c98334, c98335);
                if (z) {
                    c63042.f19489 = abstractC5144;
                }
                return c63042;
            } finally {
                this.f39944 = z3;
                this.f39949 = c98332;
                this.f39955 = c98333;
            }
        }
        if (m19471.m14709(EnumC18550.f57529)) {
            C3733 c3733 = (C3733) m19471;
            if (c3733.f11798) {
                this.f39962.m4832();
                C1365 c1365 = this.f39962;
                int i2 = c1365.f4983;
                int m4814 = c1365.m4814(c1365.f4970.f17313);
                try {
                    m32356(c3733.f11797, this.f39953);
                    this.f39962.m4814(m4814);
                    C6304 m32349 = m32349(c3733.f11799, z);
                    this.f39962.m4827(i2);
                    return m32349;
                } catch (Throwable th) {
                    this.f39962.m4814(m4814);
                    throw th;
                }
            }
        }
        C6304 mo17363 = m32350(this.f39974.f66469, abstractC5144).mo17363();
        if (z) {
            mo17363.f19489 = abstractC5144;
        }
        return mo17363;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1365 m32367() {
        return this.f39962;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14439 m32366() {
        return this.f39946;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1755 m32368() {
        return this.f39965;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7715 m32350(AbstractC4308 abstractC4308, AbstractC5144 abstractC5144) {
        AbstractC4308 abstractC43082 = this.f39973;
        try {
            if (abstractC5144.f16086.mo12915() != null) {
                abstractC5144.mo988(this.f39966);
                m32332(abstractC5144, abstractC5144.f16086.mo12915());
                AbstractC5698 m19472 = C7260.m19472(abstractC5144);
                if (m19472 != null && m32335(m19472)) {
                    C14439 c14439 = this.f39946;
                    c14439.getClass();
                    this.f39947 = new C11949(c14439, m19472);
                } else {
                    C14439 c144392 = this.f39946;
                    AbstractC4308 abstractC43083 = abstractC5144.f16086;
                    Object mo12915 = abstractC43083.mo12915();
                    c144392.getClass();
                    this.f39947 = new C23237(c144392, abstractC43083, mo12915);
                }
            } else {
                this.f39973 = abstractC4308;
                abstractC5144.mo988(this);
            }
            AbstractC7715 abstractC7715 = this.f39947;
            abstractC7715.getClass();
            return abstractC7715.mo20665(C1365.m4782(abstractC4308));
        } catch (C20515 e) {
            C15240 c15240 = this.f39967;
            abstractC5144.getClass();
            c15240.m36110(abstractC5144, e);
            this.f39962.f4970.f17313 = 1;
            return this.f39946.m34468(abstractC4308);
        } finally {
            this.f39973 = abstractC43082;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32335(AbstractC5698 abstractC5698) {
        if (abstractC5698.f17559 != EnumC1296.f4567 || !(abstractC5698 instanceof C8520)) {
            return false;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32357(C2609 c2609, C2609 c26092) {
        while (c2609.m8249()) {
            m32350((AbstractC4308) c26092.f8240, (AbstractC5144) c2609.f8240).mo5817();
            c26092 = c26092.f8241;
            c2609 = c2609.f8241;
        }
        C12171.m29642(c26092.isEmpty());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C1755 c1755 = this.f39953;
        C1755 m5877 = c1755.m5877(c8526, c1755.f6073);
        m5877.f6077 = c8526;
        C3581 c3581 = c8526.f26045;
        C6319 c6319 = this.f39943;
        this.f39973 = c3581.mo16091(c6319).mo12923();
        m32337(c8526, c8526.f26045.mo16091(c6319));
        m32362(c8526, m5877, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32362(C8526 c8526, C1755 c1755, boolean z) {
        int i;
        C12048 c12048;
        C3581 c3581 = c8526.f26045;
        if (c3581.m16075()) {
            if (c3581.m16071().m16069() && !c3581.m16071().mo15572()) {
                i = 2;
            }
            i = 1;
        } else {
            if ((c8526.f26046.f7169 & 8) != 0) {
                i = 0;
            }
            i = 1;
        }
        AbstractC4308 abstractC4308 = c1755.f6077.f26045.f17560;
        C6319 c6319 = this.f39943;
        int m4781 = C1365.m4781(c6319.m17519(abstractC4308).mo12933()) + i;
        C22364 c22364 = this.f39969;
        if (m4781 > 255) {
            c22364.m7273(c8526, C6241.f19221);
            this.f39963++;
            return;
        }
        if (c8526.f26043 != null) {
            C3581 c35812 = c8526.f26045;
            InterfaceC13896 interfaceC13896 = this.f39968 ? this.f39951.f4741 : null;
            boolean z2 = this.f39964;
            C1365 c1365 = new C1365(c35812, z, interfaceC13896, this.f39957, this.f39959, this.f39950, z2 ? new C11327(c8526, c1755.f6075.f4743) : null, this.f39974, this.f39943, this.f39972);
            this.f39962 = c1365;
            c35812.f11368 = c1365;
            C20661 c20661 = this.f39974;
            this.f39946 = new C14439(c1365, c20661, c6319);
            if (this.f39962.f4982) {
                System.err.println(c35812 + " for body " + c8526);
            }
            if ((c8526.f26046.f7169 & 8) == 0) {
                AbstractC4308 abstractC43082 = c35812.f17561.f17560;
                if (c35812.m16075() && abstractC43082 != c20661.f66526) {
                    abstractC43082 = C16535.m38910(abstractC43082);
                }
                AbstractC4308 abstractC43083 = abstractC43082;
                C1365 c13652 = this.f39962;
                c13652.m4835(c13652.m4799(new C12048(16L, this.f39952.f18886, abstractC43083, c35812.f17561)));
            }
            for (C2609 c2609 = c8526.f26048; c2609.m8249(); c2609 = c2609.f8241) {
                C9378 c9378 = (C9378) c2609.f8240;
                c9378.getClass();
                m32337(c9378, ((C9378) c2609.f8240).f28489.f17560);
                C1365 c13653 = this.f39962;
                c13653.m4835(c13653.m4799(((C9378) c2609.f8240).f28489));
            }
            int m4816 = z2 ? this.f39962.m4816() : 0;
            this.f39962.m4823();
            this.f39962.f4993 = false;
            m32365(c8526.f26043, c1755);
            C1365 c13654 = this.f39962;
            if (c13654.f4970.f17313 != 0) {
                C2735 c2735 = c8526.f26043;
                c2735.getClass();
                C3581 c35813 = c8526.f26045;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c2735, new C12281("compiler", "stack.sim.error", c35813));
                throw new AssertionError();
            }
            if (c13654.m4831()) {
                this.f39962.m4833(C7260.m19467(c8526.f26043));
                C8526 c85262 = c1755.f6077;
                if (c85262 == null || c85262.f26045.f17560.mo12923().m12913(EnumC9454.VOID)) {
                    this.f39962.m4824(177);
                } else {
                    this.f39962.m4812(this.f39946.m34467(167).m17360(), this.f39962.m4823());
                }
            }
            if (z2) {
                C1365 c13655 = this.f39962;
                c13655.f4986.m27979(c8526.f26043, 2, m4816, c13655.m4816());
            }
            this.f39962.m4827(0);
            C1365 c13656 = this.f39962;
            if (c13656.f4987 > 65535) {
                c22364.m7273(c8526, C6241.f19294);
            } else if (c13656.f4961 > 65535) {
                c22364.m7273(c8526, C6241.f19146);
            } else if (c13656.f4969 > 65535) {
                c22364.m7273(c8526, C6241.f19200);
            } else {
                if (!z && c13656.f4995) {
                    m32362(c8526, c1755, true);
                }
                if (this.f39959 == EnumC19711.f63674) {
                    C1365 c13657 = this.f39962;
                    c13657.f4975 = null;
                    c13657.f4991 = null;
                }
                C1365 c13658 = this.f39962;
                c13658.getClass();
                C18837 c18837 = new C18837();
                C2609 m8239 = C2609.m8239();
                Iterator it = c13658.f4977.iterator();
                while (it.hasNext()) {
                    m8239 = m8239.m8246(Integer.valueOf(((char[]) it.next())[2]));
                }
                Iterator it2 = c13658.f4977.iterator();
                while (it2.hasNext()) {
                    char[] cArr = (char[]) it2.next();
                    char c = cArr[0];
                    char c2 = cArr[1];
                    if (c != c2 && (c != c2 - 1 || !m8239.contains(Integer.valueOf(c)))) {
                        c18837.m43511(cArr);
                    }
                }
                c13658.f4977 = c18837;
                C1365 c13659 = this.f39962;
                for (int i2 = 0; i2 < c13659.f4972; i2++) {
                    C16181 c16181 = c13659.f4981[i2];
                    if (c16181 != null && (c12048 = c16181.f49840) != null && c12048.m16107() && c12048.m29423()) {
                        Iterator it3 = c12048.mo16081().iterator();
                        while (it3.hasNext()) {
                            C6507 c6507 = (C6507) it3.next();
                            C9953 c9953 = c6507.f50415;
                            if (c9953.m25106()) {
                                int m25101 = c9953.m25101();
                                int m25105 = c9953.m25105();
                                int m43514 = c13659.f4977.m43514();
                                C2609 m43517 = c13659.f4977.m43517();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= m43514) {
                                        i3 = -1;
                                        break;
                                    }
                                    char[] cArr2 = (char[]) m43517.f8240;
                                    m43517 = m43517.f8241;
                                    char c3 = cArr2[3];
                                    char c4 = cArr2[0];
                                    if (m25101 == c3 && c4 == m25105) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (i3 == -1) {
                                    C12171.m29640("Could not find exception index for type annotation " + c6507 + " on exception parameter");
                                    throw null;
                                }
                                c9953.m25102(i3);
                            }
                        }
                    }
                }
                return;
            }
            this.f39963++;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C12048 c12048 = c9378.f28489;
        AbstractC12612 abstractC12612 = c9378.f28487;
        if (abstractC12612 != null) {
            m32332(abstractC12612, c12048.m29425());
            if (c12048.m29425() == null || this.f39957) {
                C12171.m29642(this.f39962.m4828());
                this.f39962.m4799(c12048);
                m32350(c12048.mo16091(this.f39943), c9378.f28487).mo5817();
                this.f39946.m34466(c12048).mo5815();
                C12171.m29642(this.f39962.m4828());
            }
        } else {
            this.f39962.m4799(c12048);
        }
        m32337(c9378, c12048.f17560);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        int i = this.f39962.f4983;
        m32356(c2735.f8521, this.f39953.m5877(c2735, new C4893()));
        if (this.f39953.f6074.m14709(EnumC18550.f57511)) {
            return;
        }
        this.f39962.m4833(c2735.f8520);
        this.f39962.m4827(i);
        this.f39962.f4990 = -1;
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        m32334((AbstractC11349) c20374, c20374.f65770, c20374.f65771, C2609.m8239(), false);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        m32334((AbstractC11349) c8672, c8672.f26444, c8672.f26445, C2609.m8239(), true);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        int i = this.f39962.f4983;
        m32356(c11907.f35587, this.f39953);
        m32334((AbstractC11349) c11907, c11907.f35585, c11907.f35588, c11907.f35586, true);
        this.f39962.m4827(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32334(AbstractC11349 abstractC11349, AbstractC11349 abstractC113492, AbstractC12612 abstractC12612, C2609 c2609, boolean z) {
        C6304 m34467;
        C6304 m344672;
        C1755 m5877 = this.f39953.m5877(abstractC11349, new C4893());
        Object obj = m5877.f6073;
        int m4823 = this.f39962.m4823();
        if (z) {
            if (abstractC12612 != null) {
                this.f39962.m4833(abstractC12612.f16085);
                C12171.m29642(this.f39962.m4828());
                m344672 = m32348(C7260.m19458(abstractC12612), 8);
            } else {
                m344672 = this.f39946.m34467(167);
            }
            C9833 m17364 = m344672.m17364();
            this.f39962.m4811(m344672.f19493);
            C12171.m29642(this.f39962.m4828());
            m32360(abstractC113492, m5877, 17);
            this.f39962.m4811(((C4893) obj).f15448);
            m32356(c2609, m5877);
            C1365 c1365 = this.f39962;
            c1365.m4812(c1365.m4800(167), m4823);
            this.f39962.m4811(m17364);
        } else {
            m32360(abstractC113492, m5877, 17);
            this.f39962.m4811(((C4893) obj).f15448);
            m32356(c2609, m5877);
            if (this.f39962.m4831()) {
                if (abstractC12612 != null) {
                    this.f39962.m4833(abstractC12612.f16085);
                    C12171.m29642(this.f39962.m4828());
                    m34467 = m32348(C7260.m19458(abstractC12612), 8);
                } else {
                    m34467 = this.f39946.m34467(167);
                }
                this.f39962.m4812(m34467.m17360(), m4823);
                C12171.m29642(this.f39962.m4828());
                this.f39962.m4811(m34467.f19490);
            }
        }
        C9833 c9833 = ((C4893) obj).f15449;
        if (c9833 != null) {
            this.f39962.m4811(c9833);
            c9833.f29717.f17317.m20939(this.f39962.f4983);
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        throw new AssertionError();
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        C1755 m5877 = this.f39953.m5877(c17698, new C4893());
        m32360(c17698.f54159, m5877, 1);
        C9833 c9833 = ((C4893) m5877.f6073).f15449;
        if (c9833 != null) {
            this.f39962.m4811(c9833);
            c9833.f29717.f17317.m20939(this.f39962.f4983);
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        m32333(c22637, c22637.f73103, c22637.f73102, c22637.f73104);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        this.f39962.m4832();
        boolean z = this.f39944;
        try {
            this.f39944 = false;
            m32339(c13464);
            this.f39944 = z;
            this.f39947 = this.f39946.m34468(this.f39973);
        } catch (Throwable th) {
            this.f39944 = z;
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m32339(C13464 c13464) {
        EnumC10892 enumC10892 = this.f39961;
        C2609 c2609 = this.f39960;
        C1740 c1740 = this.f39958;
        int i = this.f39962.f4983;
        try {
            this.f39960 = C2609.m8239();
            this.f39958 = null;
            boolean[] zArr = new boolean[1];
            c13464.mo988(new C8421(zArr));
            if (zArr[0]) {
                while (true) {
                    C5599 c5599 = this.f39962.f4970;
                    int i2 = c5599.f17313;
                    if (i2 <= 0) {
                        break;
                    }
                    AbstractC4308 abstractC4308 = c5599.f17314[i2 - 1];
                    C12048 c12048 = new C12048(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, this.f39952.f18880.m30652(enumC10892.m27204() + "stack" + enumC10892.m27204() + c13464.f16085 + enumC10892.m27204() + this.f39962.f4970.f17313), abstractC4308, this.f39953.f6077.f26045);
                    C14439 c14439 = this.f39946;
                    C11003.requireNonNull(c14439);
                    C1740 c17402 = new C1740(c14439, abstractC4308, this.f39962.m4799(c12048));
                    this.f39960 = this.f39960.m8246(c17402);
                    c17402.mo5815();
                }
                this.f39958 = m32345(c13464.f16086);
            }
            C1365 c1365 = this.f39962;
            int m4814 = c1365.m4814(c1365.f4970.f17313);
            try {
                m32333(c13464, c13464.f40197, c13464.f40199, c13464.f40195);
            } finally {
                this.f39962.m4814(m4814);
            }
        } finally {
            this.f39960 = c2609;
            this.f39958 = c1740;
            this.f39962.m4827(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32333(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612, C2609 c2609, boolean z) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        C1755 c1755;
        int i4 = this.f39962.f4983;
        C12171.m29642(!abstractC12612.f16086.m12913(EnumC9454.CLASS));
        int m4823 = z ? this.f39962.m4823() : -1;
        boolean z2 = this.f39964;
        int m4816 = z2 ? this.f39962.m4816() : 0;
        C12171.m29642(this.f39962.m4828());
        AbstractC7715 m32350 = m32350(this.f39974.f66452, abstractC12612);
        if (c2609.isEmpty()) {
            m32350.mo5817().mo17358();
            if (z2) {
                this.f39962.f4986.m27979(C7260.m19458(abstractC12612), 8, m4816, this.f39962.m4816());
            }
            i = i4;
        } else {
            m32350.mo5817();
            if (z2) {
                this.f39962.f4986.m27979(C7260.m19458(abstractC12612), 8, m4816, this.f39962.m4816());
            }
            C1755 m5877 = this.f39953.m5877(abstractC5144, new C4893());
            C4893 c4893 = (C4893) m5877.f6073;
            c4893.f15451 = true;
            int m8245 = c2609.m8245();
            int[] iArr2 = new int[m8245];
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = -1;
            int i8 = 0;
            C2609 c26092 = c2609;
            for (int i9 = 0; i9 < m8245; i9++) {
                if (((AbstractC19669) ((C18963) c26092.f8240).f59815.f8240).mo30871()) {
                    C12171.m29642(((C18963) c26092.f8240).f59815.m8245() == 1);
                    int intValue = ((Number) ((AbstractC12612) ((C18963) c26092.f8240).f59815.f8240).f16086.mo12915()).intValue();
                    iArr2[i9] = intValue;
                    if (intValue < i5) {
                        i5 = intValue;
                    }
                    if (i6 < intValue) {
                        i6 = intValue;
                    }
                    i8++;
                } else {
                    C12171.m29642(i7 == -1);
                    i7 = i9;
                }
                c26092 = c26092.f8241;
            }
            long j = i6;
            int i10 = m4823;
            long j2 = i5;
            long j3 = j - j2;
            long j4 = i8;
            int i11 = (i8 <= 0 || j3 + 14 > (j4 * 3) + ((2 * j4) + 3)) ? 171 : 170;
            int m48162 = this.f39962.m4816();
            this.f39962.m4824(i11);
            this.f39962.m4801();
            int m48163 = this.f39962.m4816();
            int i12 = -1;
            this.f39962.m4817(-1);
            if (i11 == 170) {
                this.f39962.m4817(i5);
                this.f39962.m4817(i6);
                for (long j5 = j2; j5 <= j; j5++) {
                    this.f39962.m4817(-1);
                }
                iArr = null;
            } else {
                this.f39962.m4817(i8);
                int i13 = 0;
                while (i13 < i8) {
                    this.f39962.m4817(i12);
                    this.f39962.m4817(i12);
                    i13++;
                    i12 = -1;
                }
                iArr = new int[m8245];
            }
            C5599 m15882 = this.f39962.f4970.m15882();
            this.f39962.m4822();
            C2609 c26093 = c2609;
            int i14 = i8;
            int i15 = 0;
            while (i15 < m8245) {
                int i16 = m8245;
                C18963 c18963 = (C18963) c26093.f8240;
                C2609 c26094 = c26093.f8241;
                int m4797 = this.f39962.m4797(m15882);
                if (i15 != i7) {
                    i3 = i7;
                    if (i11 == 170) {
                        i2 = i5;
                        this.f39962.m4825((((iArr2[i15] - i5) + 3) * 4) + m48163, m4797 - m48162);
                    } else {
                        i2 = i5;
                        iArr[i15] = m4797 - m48162;
                    }
                } else {
                    i2 = i5;
                    i3 = i7;
                    this.f39962.m4825(m48163, m4797 - m48162);
                }
                C2609 c26095 = c18963.f59814;
                if (!z2) {
                    m32356(c26095, m5877);
                } else if (c26095.m8245() == 1) {
                    m32360((AbstractC5144) c26095.f8240, m5877, 17);
                } else {
                    int m48164 = this.f39962.m4816();
                    m32356(c26095, m5877);
                    C1365 c1365 = this.f39962;
                    c1755 = m5877;
                    c1365.f4986.m27979(c26095, 16, m48164, c1365.m4816());
                    i15++;
                    m8245 = i16;
                    c26093 = c26094;
                    i7 = i3;
                    m5877 = c1755;
                    i5 = i2;
                }
                c1755 = m5877;
                i15++;
                m8245 = i16;
                c26093 = c26094;
                i7 = i3;
                m5877 = c1755;
                i5 = i2;
            }
            int i17 = m8245;
            int i18 = i7;
            if (c4893.f15448 != null) {
                C12171.m29642(z);
                this.f39962.m4812(c4893.f15448, i10);
            }
            C9833 c9833 = c4893.f15449;
            if (c9833 != null) {
                this.f39962.m4811(c9833);
                i = i4;
                c9833.f29717.f17317.m20939(i);
            } else {
                i = i4;
            }
            if (this.f39962.m4821(m48163) == -1) {
                C1365 c13652 = this.f39962;
                c13652.m4825(m48163, c13652.m4797(m15882) - m48162);
            }
            if (i11 == 170) {
                int m4821 = this.f39962.m4821(m48163);
                for (long j6 = j2; j6 <= j; j6++) {
                    int i19 = (int) ((((j6 - j2) + 3) * 4) + m48163);
                    if (this.f39962.m4821(i19) == -1) {
                        this.f39962.m4825(i19, m4821);
                    }
                }
            } else {
                if (i18 >= 0) {
                    int i20 = i18;
                    while (i20 < i17 - 1) {
                        int i21 = i20 + 1;
                        iArr2[i20] = iArr2[i21];
                        iArr[i20] = iArr[i21];
                        i20 = i21;
                    }
                }
                if (i14 > 0) {
                    m32331(0, i14 - 1, iArr2, iArr);
                }
                int i22 = 0;
                while (i22 < i14) {
                    int i23 = i22 + 1;
                    int i24 = (i23 * 8) + m48163;
                    this.f39962.m4825(i24, iArr2[i22]);
                    this.f39962.m4825(i24 + 4, iArr[i22]);
                    i22 = i23;
                }
            }
        }
        this.f39962.m4827(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32331(int i, int i2, int[] iArr, int[] iArr2) {
        int i3;
        int i4 = iArr[(i + i2) / 2];
        int i5 = i;
        int i6 = i2;
        while (true) {
            if (iArr[i5] < i4) {
                i5++;
            } else {
                while (true) {
                    i3 = iArr[i6];
                    if (i4 >= i3) {
                        break;
                    } else {
                        i6--;
                    }
                }
                if (i5 <= i6) {
                    int i7 = iArr[i5];
                    iArr[i5] = i3;
                    iArr[i6] = i7;
                    int i8 = iArr2[i5];
                    iArr2[i5] = iArr2[i6];
                    iArr2[i6] = i8;
                    i5++;
                    i6--;
                }
                if (i5 > i6) {
                    break;
                }
            }
        }
        if (i < i6) {
            m32331(i, i6, iArr, iArr2);
        }
        if (i5 < i2) {
            m32331(i5, i2, iArr, iArr2);
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1384(C7115 c7115) {
        int i = this.f39962.f4983;
        C1740 m32345 = m32345(this.f39974.f66526);
        C12171.m29642(this.f39962.m4828());
        AbstractC12612 abstractC12612 = c7115.f21831;
        m32350(abstractC12612.f16086, abstractC12612).mo5817().mo17361();
        m32345.mo5815();
        this.f39962.m4824(194);
        C5599 c5599 = this.f39962.f4970;
        int i2 = m32345.f6015;
        int[] iArr = c5599.f17318;
        if (iArr == null) {
            c5599.f17318 = new int[20];
        } else {
            int i3 = c5599.f17316;
            if (i3 >= iArr.length) {
                int length = iArr.length;
                while (length < i3 + 1) {
                    length *= 2;
                }
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                iArr = iArr2;
            }
            c5599.f17318 = iArr;
        }
        int[] iArr3 = c5599.f17318;
        int i4 = c5599.f17316;
        iArr3[i4] = i2;
        c5599.f17316 = i4 + 1;
        C1755 m5877 = this.f39953.m5877(c7115, new C4893());
        C4893 c4893 = (C4893) m5877.f6073;
        c4893.f15450 = new C15475(this, m5877, m32345);
        c4893.f15452 = new C18837();
        m32355(m5877, c7115.f21830, C2609.m8239());
        this.f39962.m4827(i);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        C1755 m5877 = this.f39953.m5877(c10789, new C4893());
        C1755 c1755 = this.f39953;
        C4893 c4893 = (C4893) m5877.f6073;
        c4893.f15450 = new C21827(this, m5877, c10789, c1755);
        c4893.f15452 = new C18837();
        m32355(m5877, c10789.f32445, c10789.f32449);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32355(C1755 c1755, AbstractC5144 abstractC5144, C2609 c2609) {
        C9833 m4800;
        int i;
        int i2;
        C5599 c5599;
        boolean z;
        C4893 c4893;
        C9833 c9833;
        int i3;
        int i4;
        int i5;
        C5599 c55992;
        C2609 c26092;
        boolean z2;
        C4893 c48932;
        C9833 c98332;
        C2609 c26093;
        C9833 c98333;
        C2609 c26094;
        C2609 of;
        C2609 c26095;
        C1365 c1365 = this.f39962;
        int i6 = c1365.f4983;
        int m4816 = c1365.m4816();
        C5599 m15882 = this.f39962.f4970.m15882();
        m32360(abstractC5144, c1755, 2);
        int m48162 = this.f39962.m4816();
        Object obj = c1755.f6073;
        C2609 m43517 = ((C4893) obj).f15452.m43517();
        this.f39962.m4833(C7260.m19467(abstractC5144));
        m32364(c1755);
        this.f39962.m4833(C7260.m19467(c1755.f6074));
        boolean m14709 = c1755.f6074.m14709(EnumC18550.f57571);
        if (m4816 == m48162 && m14709) {
            m4800 = this.f39962.m4800(168);
        } else {
            m4800 = this.f39962.m4800(167);
        }
        m32353(c1755);
        C4893 c48933 = (C4893) obj;
        c48933.f15450.mo10661();
        AbstractC3482 abstractC3482 = c48933.f15450;
        boolean z3 = abstractC3482 != null && abstractC3482.mo10664();
        if (m4816 != m48162) {
            C2609 c26096 = c2609;
            C9833 c98334 = m4800;
            while (c26096.m8249()) {
                this.f39962.m4798(m15882, ((C0617) c26096.f8240).f2373.f28489.f17560);
                C0617 c0617 = (C0617) c26096.f8240;
                if (m4816 != m48162) {
                    if (c0617.f2373.f28488.m14709(EnumC18550.f57503)) {
                        C9378 c9378 = c0617.f2373;
                        C23488 c23488 = (C23488) c9378.f28488;
                        C2609 mo16081 = c9378.f28489.mo16081();
                        C2609 c26097 = c23488.f75416;
                        c98333 = c98334;
                        C2609 of2 = C2609.of((Object) new C23069(mo16081, (AbstractC12612) c26097.f8240));
                        C2609 c26098 = c26097.f8241;
                        while (c26098 != null) {
                            Object obj2 = c26098.f8240;
                            if (obj2 == null) {
                                break;
                            }
                            AbstractC12612 abstractC12612 = (AbstractC12612) obj2;
                            if (abstractC12612 instanceof C18257) {
                                c26095 = c26096;
                                C2609 c26099 = ((C18257) abstractC12612).f56778;
                                this.f39956.getClass();
                                of2 = of2.m8246(new C23069(C13395.m32389(c26099), abstractC12612));
                            } else {
                                c26095 = c26096;
                                of2 = of2.m8246(new C23069(C2609.m8239(), abstractC12612));
                            }
                            c26098 = c26098.f8241;
                            c26096 = c26095;
                        }
                        c26094 = c26096;
                        of = of2.m8250();
                    } else {
                        c98333 = c98334;
                        c26094 = c26096;
                        of = C2609.of((Object) new C23069(c0617.f2373.f28489.mo16081(), c0617.f2373.f28488));
                    }
                    C2609 c260910 = of;
                    int i7 = m4816;
                    C2609 c260911 = m43517;
                    while (c260911.m8249()) {
                        Iterator it = c260910.iterator();
                        while (it.hasNext()) {
                            C23069 c23069 = (C23069) it.next();
                            int m32344 = m32344((InterfaceC3109) c0617, ((AbstractC12612) c23069.f74208).f16086);
                            C2609 c260912 = m43517;
                            int i8 = i6;
                            C0617 c06172 = c0617;
                            C5599 c55993 = m15882;
                            C4893 c48934 = c48933;
                            C9833 c98335 = c98333;
                            int i9 = i7;
                            boolean z4 = m14709;
                            C2609 c260913 = c26094;
                            int i10 = m4816;
                            C2609 c260914 = c260911;
                            m32358(c0617, i7, ((Integer) c260911.f8240).intValue(), this.f39962.m4816(), m32344);
                            Iterator it2 = ((C2609) c23069.f74207).iterator();
                            while (it2.hasNext()) {
                                ((C6507) it2.next()).f50415.m25103(m32344, i9);
                            }
                            c0617 = c06172;
                            c260911 = c260914;
                            i7 = i9;
                            c98333 = c98335;
                            m4816 = i10;
                            c48933 = c48934;
                            m43517 = c260912;
                            i6 = i8;
                            m15882 = c55993;
                            c26094 = c260913;
                            m14709 = z4;
                        }
                        C2609 c260915 = c260911.f8241;
                        i7 = ((Integer) c260915.f8240).intValue();
                        c260911 = c260915.f8241;
                        m4816 = m4816;
                        c48933 = c48933;
                        i6 = i6;
                        c26094 = c26094;
                        m14709 = m14709;
                    }
                    i4 = i6;
                    c55992 = m15882;
                    c26092 = m43517;
                    z2 = m14709;
                    c48932 = c48933;
                    c26093 = c26094;
                    c98332 = c98333;
                    C0617 c06173 = c0617;
                    int i11 = i7;
                    i5 = m4816;
                    if (i11 < m48162) {
                        Iterator it3 = c260910.iterator();
                        while (it3.hasNext()) {
                            C23069 c230692 = (C23069) it3.next();
                            int m323442 = m32344((InterfaceC3109) c06173, ((AbstractC12612) c230692.f74208).f16086);
                            m32358(c06173, i11, m48162, this.f39962.m4816(), m323442);
                            Iterator it4 = ((C2609) c230692.f74207).iterator();
                            while (it4.hasNext()) {
                                ((C6507) it4.next()).f50415.m25103(m323442, i11);
                            }
                        }
                    }
                    C12048 c12048 = c06173.f2373.f28489;
                    this.f39962.m4833(c06173.f16085);
                    this.f39962.m4834();
                    C1365 c13652 = this.f39962;
                    int i12 = c13652.f4983;
                    c13652.m4799(c12048);
                    this.f39946.m34466(c12048).mo5815();
                    this.f39962.m4833(C7260.m19461(c06173.f2372));
                    m32360(c06173.f2372, c1755, 2);
                    this.f39962.m4827(i12);
                    this.f39962.m4833(C7260.m19467(c06173.f2372));
                } else {
                    i4 = i6;
                    i5 = m4816;
                    c55992 = m15882;
                    c26092 = m43517;
                    z2 = m14709;
                    c48932 = c48933;
                    c98332 = c98334;
                    c26093 = c26096;
                }
                m32364(c1755);
                if (z3 || c26093.f8241.m8249()) {
                    this.f39962.m4833(C7260.m19467(c1755.f6074));
                    c98334 = C1365.m4783(c98332, this.f39962.m4800(167));
                } else {
                    c98334 = c98332;
                }
                m32353(c1755);
                c26096 = c26093.f8241;
                m4816 = i5;
                c48933 = c48932;
                m14709 = z2;
                m43517 = c26092;
                i6 = i4;
                m15882 = c55992;
            }
            i = i6;
            i2 = m4816;
            c5599 = m15882;
            z = m14709;
            c4893 = c48933;
            c9833 = c98334;
        } else {
            i = i6;
            i2 = m4816;
            c5599 = m15882;
            z = m14709;
            c4893 = c48933;
            c9833 = m4800;
        }
        if (z3 && ((i3 = i2) != m48162 || !z)) {
            C1365 c13653 = this.f39962;
            c13653.f4983 = c13653.f4961;
            C20661 c20661 = this.f39974;
            AbstractC4308 abstractC4308 = c20661.f66479;
            AbstractC4308 abstractC43082 = c20661.f66479;
            int m4798 = c13653.m4798(c5599, abstractC4308);
            int i13 = i3;
            C4893 c48935 = c4893;
            while (c48935.f15452.m43518()) {
                m32358(abstractC5144, i13, ((Integer) c48935.f15452.m43516()).intValue(), m4798, 0);
                i13 = ((Integer) c48935.f15452.m43516()).intValue();
            }
            C1365 c13654 = this.f39962;
            AbstractC5144 abstractC51442 = c1755.f6074;
            EnumC22782 enumC22782 = EnumC22782.FIRST_STAT_POS;
            c13654.m4833(C7260.m19432(abstractC51442, enumC22782));
            this.f39962.m4834();
            C1740 m32345 = m32345(abstractC43082);
            m32345.mo5815();
            m32364(c1755);
            this.f39962.m4832();
            this.f39962.m4833(C7260.m19432(c1755.f6074, EnumC22782.END_POS));
            this.f39962.m4834();
            m32345.mo5817();
            m32358(abstractC5144, i13, ((Integer) c48935.f15452.m43516()).intValue(), m4798, 0);
            this.f39962.m4824(191);
            this.f39962.m4822();
            C9833 c98336 = c48935.f15448;
            if (c98336 != null) {
                this.f39962.m4811(c98336);
                this.f39962.m4833(C7260.m19432(c1755.f6074, enumC22782));
                this.f39962.m4834();
                C1740 m323452 = m32345(abstractC43082);
                m323452.mo5815();
                c48935.f15450.mo10663();
                this.f39962.m4802(169, m323452.f6015);
                this.f39962.m4822();
            }
        }
        this.f39962.m4811(c9833);
        this.f39962.m4827(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32358(AbstractC5144 abstractC5144, int i, int i2, int i3, int i4) {
        char c = (char) i;
        char c2 = (char) i2;
        char c3 = (char) i3;
        if (c == i && c2 == i2 && c3 == i3) {
            this.f39962.f4977.m43511(new char[]{c, c2, c3, (char) i4});
        } else {
            this.f39969.m7273(abstractC5144, C6241.f19278);
            this.f39963++;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        C9833 c9833;
        C1365 c1365 = this.f39962;
        int i = c1365.f4983;
        C12171.m29642(c1365.m4828());
        C6304 m32348 = m32348(C7260.m19458(c1470.f5225), 8);
        C9833 m17364 = m32348.m17364();
        C12171.m29642(this.f39962.m4828());
        if (m32348.m17359()) {
            c9833 = null;
        } else {
            this.f39962.m4811(m32348.f19493);
            m32360(c1470.f5226, this.f39953, 17);
            c9833 = this.f39962.m4800(167);
        }
        if (m17364 != null) {
            this.f39962.m4811(m17364);
            AbstractC11349 abstractC11349 = c1470.f5227;
            if (abstractC11349 != null) {
                m32360(abstractC11349, this.f39953, 17);
            }
        }
        this.f39962.m4811(c9833);
        this.f39962.m4827(i);
        C12171.m29642(this.f39962.m4828());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1394(C10496 c10496) {
        AbstractC12612 abstractC12612 = c10496.f31483;
        int i = C22532.f72910[abstractC12612.mo989().ordinal()];
        if (i == 4) {
            ((C6555) abstractC12612).m18066(EnumC18550.f57536);
        } else if (i == 5) {
            ((C6555) abstractC12612).m18066(EnumC18550.f57492);
        }
        C12171.m29642(this.f39962.m4828());
        AbstractC12612 abstractC126122 = c10496.f31483;
        m32350(abstractC126122.f16086, abstractC126122).mo17358();
        C12171.m29642(this.f39962.m4828());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        C12171.m29642(this.f39962.m4828());
        C1755 m32342 = m32342(c4146.f13546);
        C4893 c4893 = (C4893) m32342.f6073;
        c4893.f15449 = C1365.m4783(this.f39962.m4800(167), c4893.f15449);
        m32354(this.f39953, m32342);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        C1755 c1755;
        C12171.m29642(this.f39962.m4828());
        if (this.f39944) {
            C6304 m32348 = m32348(c2322.f7456, 16);
            C9833 m17364 = m32348.m17364();
            this.f39962.m4811(m32348.f19493);
            C1755 m32342 = m32342(c2322.f7455);
            m32343();
            C9833 m4800 = this.f39962.m4800(167);
            m32354(this.f39953, m32342);
            this.f39962.m4811(m17364);
            c1755 = m32342(c2322.f7455);
            m32343();
            C9833 m48002 = this.f39962.m4800(167);
            C9833 c9833 = this.f39949;
            if (c9833 == null) {
                this.f39949 = m4800;
            } else {
                this.f39949 = C1365.m4783(c9833, m4800);
            }
            C9833 c98332 = this.f39955;
            if (c98332 == null) {
                this.f39955 = m48002;
            } else {
                this.f39955 = C1365.m4783(c98332, m48002);
            }
        } else {
            m32350(this.f39973, c2322.f7456).mo5817();
            C1740 c1740 = this.f39958;
            if (c1740 != null) {
                c1740.mo5815();
            }
            C1755 m323422 = m32342(c2322.f7455);
            if (this.f39962.m4831()) {
                m32343();
                C1740 c17402 = this.f39958;
                if (c17402 != null) {
                    c17402.mo5817();
                }
                this.f39962.f4970.m15884(c2322.f7455.f16086);
                C4893 c4893 = (C4893) m323422.f6073;
                c4893.f15449 = C1365.m4783(this.f39962.m4800(167), c4893.f15449);
                this.f39962.m4822();
            }
            c1755 = m323422;
        }
        m32354(this.f39953, c1755);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C1755 m32342(AbstractC5144 abstractC5144) {
        int i = this.f39962.f4990;
        C1755 c1755 = this.f39953;
        while (true) {
            m32364(c1755);
            if (c1755.f6074 != abstractC5144) {
                c1755 = c1755.f6072;
            } else {
                this.f39962.f4990 = i;
                return c1755;
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m32343() {
        Iterator it = this.f39960.iterator();
        while (it.hasNext()) {
            ((C1740) it.next()).mo5817();
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        int i = this.f39962.f4990;
        AbstractC5144 abstractC5144 = c15433.f47248;
        C1755 c1755 = this.f39953;
        while (true) {
            m32364(c1755);
            if (c1755.f6074 != abstractC5144) {
                c1755 = c1755.f6072;
            } else {
                C1365 c1365 = this.f39962;
                c1365.f4990 = i;
                C12171.m29642(c1365.m4828());
                C4893 c4893 = (C4893) c1755.f6073;
                c4893.f15448 = C1365.m4783(this.f39962.m4800(167), c4893.f15448);
                m32354(this.f39953, c1755);
                return;
            }
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        C1755 c1755;
        C1365 c1365 = this.f39962;
        int i = c1365.f4983;
        int i2 = c1365.f4990;
        if (c9938.f30017 != null) {
            C12171.m29642(c1365.m4828());
            AbstractC7715 mo5817 = m32350(this.f39973, c9938.f30017).mo5817();
            C1755 c17552 = this.f39953;
            C8526 c8526 = c17552.f6077;
            while (true) {
                AbstractC5144 abstractC5144 = c17552.f6074;
                if (abstractC5144 != c8526) {
                    if (!abstractC5144.m14709(EnumC18550.f57571) || !((C4893) c17552.f6073).f15450.mo10664()) {
                        c17552 = c17552.f6072;
                    } else {
                        mo5817 = m32345(this.f39973);
                        mo5817.mo5815();
                        break;
                    }
                } else {
                    break;
                }
            }
            c1755 = this.f39953;
            C8526 c85262 = c1755.f6077;
            while (true) {
                m32364(c1755);
                if (c1755.f6074 == c85262) {
                    break;
                } else {
                    c1755 = c1755.f6072;
                }
            }
            this.f39962.f4990 = i2;
            mo5817.mo5817();
            this.f39962.m4824(C1365.m4795(C1365.m4782(this.f39973)) + 172);
        } else {
            C1755 c17553 = this.f39953;
            C8526 c85263 = c17553.f6077;
            while (true) {
                m32364(c17553);
                if (c17553.f6074 == c85263) {
                    break;
                } else {
                    c17553 = c17553.f6072;
                }
            }
            C1365 c13652 = this.f39962;
            c13652.f4990 = i2;
            c13652.m4824(177);
            c1755 = c17553;
        }
        m32354(this.f39953, c1755);
        this.f39962.m4827(i);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        C12171.m29642(this.f39962.m4828());
        AbstractC12612 abstractC12612 = c1616.f5680;
        m32350(abstractC12612.f16086, abstractC12612).mo5817();
        this.f39962.m4824(191);
        C12171.m29642(this.f39962.m4828());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        m32336(c15580.f16085);
        AbstractC7715 m32350 = m32350(this.f39941, c15580.f48011);
        C3581 c3581 = (C3581) C7260.m19472(c15580.f48011);
        m32357(c15580.f48012, c3581.m16096(this.f39943).mo12933());
        if (!(c3581 instanceof C9226)) {
            this.f39962.m4833(c15580.f16085);
        }
        this.f39947 = m32350.mo20666();
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        C9833 c9833;
        this.f39962.m4833(c8379.f25701.f16085);
        C6304 m32348 = m32348(c8379.f25701, 8);
        C9833 m17364 = m32348.m17364();
        boolean m17359 = m32348.m17359();
        boolean z = this.f39964;
        if (m17359) {
            c9833 = null;
        } else {
            this.f39962.m4811(m32348.f19493);
            int m4816 = z ? this.f39962.m4816() : 0;
            this.f39962.m4833(c8379.f25699.f16085);
            m32350(this.f39973, c8379.f25699).mo5817();
            this.f39962.f4970.m15884(c8379.f16086);
            if (z) {
                C1365 c1365 = this.f39962;
                c1365.f4986.m27979(c8379.f25699, 16, m4816, c1365.m4816());
            }
            c9833 = this.f39962.m4800(167);
        }
        if (m17364 != null) {
            this.f39962.m4811(m17364);
            int m48162 = z ? this.f39962.m4816() : 0;
            this.f39962.m4833(c8379.f25700.f16085);
            m32350(this.f39973, c8379.f25700).mo5817();
            this.f39962.f4970.m15884(c8379.f16086);
            if (z) {
                C1365 c13652 = this.f39962;
                c13652.f4986.m27979(c8379.f25700, 16, m48162, c13652.m4816());
            }
        }
        this.f39962.m4811(c9833);
        this.f39947 = this.f39946.m34468(this.f39973);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m32336(int i) {
        C3581 c3581 = this.f39962.f4962;
        boolean z = c3581.mo952() == EnumC23258.CONSTRUCTOR || this.f39962.f4962.mo952() == EnumC23258.STATIC_INIT;
        Iterator it = c3581.mo16081().iterator();
        while (it.hasNext()) {
            C6507 c6507 = (C6507) it.next();
            if (c6507.m38582()) {
                c6507.m38584();
            }
            C9953 c9953 = c6507.f50415;
            if (c9953.f30052 == i) {
                c9953.f30056 = this.f39962.f4987;
                c9953.f30055 = true;
            }
        }
        if (z) {
            Iterator it2 = c3581.f17561.mo16081().iterator();
            while (it2.hasNext()) {
                C6507 c65072 = (C6507) it2.next();
                if (c65072.m38582()) {
                    c65072.m38584();
                }
                C9953 c99532 = c65072.f50415;
                if (c99532.f30052 == i) {
                    c99532.f30056 = this.f39962.f4987;
                    c99532.f30055 = true;
                }
            }
            C14163 m16071 = c3581.m16071();
            m16071.mo16101();
            Iterator it3 = new C7883(m16071.f42762).iterator();
            while (it3.hasNext()) {
                AbstractC5698 abstractC5698 = (AbstractC5698) it3.next();
                if (abstractC5698.mo952().m51579()) {
                    Iterator it4 = abstractC5698.mo16081().iterator();
                    while (it4.hasNext()) {
                        C6507 c65073 = (C6507) it4.next();
                        if (c65073.m38582()) {
                            c65073.m38584();
                        }
                        C9953 c99533 = c65073.f50415;
                        if (c99533.f30052 == i) {
                            c99533.f30056 = this.f39962.f4987;
                            c99533.f30055 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        AbstractC7715[] abstractC7715Arr;
        C12171.m29642(c19110.f60199 == null && c19110.f60195 == null);
        m32336(c19110.f16085);
        C1365 c1365 = this.f39962;
        AbstractC4308 abstractC4308 = c19110.f16086;
        m32337(c19110, abstractC4308);
        c1365.m4805(187, c1365.f4968.m29889(abstractC4308), (InterfaceC21496) abstractC4308);
        this.f39962.m4824(89);
        m32357(c19110.f60197, c19110.f60194.m16096(this.f39943).mo12933());
        C14439 c14439 = this.f39946;
        AbstractC5698 abstractC5698 = c19110.f60194;
        c14439.getClass();
        C6319 c6319 = c14439.f44256;
        C1365.m4782(abstractC5698.mo16091(c6319));
        C10658 c10658 = (C10658) abstractC5698.m16096(c6319);
        int m4782 = C1365.m4782(c10658.f32060);
        abstractC5698.f17561.mo16084();
        c14439.f44254.m4820(abstractC5698, c10658);
        abstractC7715Arr = c14439.f44255;
        AbstractC7715 abstractC7715 = abstractC7715Arr[m4782];
        this.f39947 = this.f39946.m34468(c19110.f16086);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        m32336(c18404.f16085);
        C2609 c2609 = c18404.f57139;
        C20661 c20661 = this.f39974;
        if (c2609 == null) {
            for (C2609 c26092 = c18404.f57140; c26092.m8249(); c26092 = c26092.f8241) {
                m32350(c20661.f66452, (AbstractC5144) c26092.f8240).mo5817();
            }
            this.f39947 = m32352(c18404, c18404.f16086, c18404.f57140.m8245());
            return;
        }
        AbstractC4308 m17515 = this.f39943.m17515(c18404.f16086);
        int m8245 = c18404.f57139.m8245();
        C14439 c14439 = this.f39946;
        C7254 c7254 = c20661.f66452;
        Integer valueOf = Integer.valueOf(m8245);
        c14439.getClass();
        new C23237(c14439, c7254, valueOf).mo5817();
        AbstractC7715 m32352 = m32352(c18404, c18404.f16086, 1);
        int i = 0;
        for (C2609 c26093 = c18404.f57139; c26093.m8249(); c26093 = c26093.f8241) {
            m32352.mo17361();
            C14439 c144392 = this.f39946;
            C7254 c72542 = c20661.f66452;
            Integer valueOf2 = Integer.valueOf(i);
            c144392.getClass();
            new C23237(c144392, c72542, valueOf2).mo5817();
            i++;
            m32350(m17515, (AbstractC5144) c26093.f8240).mo5817();
            C14439 c144393 = this.f39946;
            c144393.getClass();
            c144393.f44254.m4824(C1365.m4782(m17515) + 79);
        }
        this.f39947 = m32352;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7715 m32352(C18404 c18404, AbstractC4308 abstractC4308, int i) {
        C6319 c6319 = this.f39943;
        AbstractC4308 m17515 = c6319.m17515(abstractC4308);
        int i2 = 0;
        int i3 = 0;
        for (AbstractC4308 abstractC43082 = abstractC4308; abstractC43082.m12913(EnumC9454.ARRAY); abstractC43082 = c6319.m17515(abstractC43082)) {
            i3++;
        }
        if (i3 > 255) {
            this.f39969.m7273(c18404, C6241.f19157);
            this.f39963++;
        }
        int i4 = C1365.f4960;
        switch (C21122.f68129[m17515.mo3258().ordinal()]) {
            case 1:
                i2 = 8;
                break;
            case 2:
                i2 = 9;
                break;
            case 3:
                i2 = 5;
                break;
            case 4:
                i2 = 10;
                break;
            case 5:
                i2 = 11;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 4;
                break;
            case 9:
            default:
                throw new AssertionError("arraycode " + m17515);
            case 10:
                break;
            case 11:
                i2 = 1;
                break;
        }
        if (i2 == 0 || (i2 == 1 && i == 1)) {
            this.f39962.m4806(m32344((InterfaceC3109) c18404, m17515), abstractC4308);
        } else if (i2 == 1) {
            this.f39962.m4803(i, m32344((InterfaceC3109) c18404, abstractC4308), abstractC4308);
        } else {
            this.f39962.m4819(i2, abstractC4308);
        }
        return this.f39946.m34468(abstractC4308);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1405(C14875 c14875) {
        AbstractC12612 abstractC12612 = c14875.f45392;
        this.f39947 = m32350(abstractC12612.f16086, abstractC12612);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        AbstractC12612 abstractC12612 = c21080.f67987;
        AbstractC7715 m32350 = m32350(abstractC12612.f16086, abstractC12612);
        m32350(c21080.f67987.f16086, c21080.f67988).mo5817();
        if (c21080.f67988.f16086.m12913(EnumC9454.BOT)) {
            this.f39962.f4970.m15884(c21080.f67987.f16086);
        }
        C14439 c14439 = this.f39946;
        c14439.getClass();
        this.f39947 = new C10538(c14439, m32350);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        AbstractC7715 abstractC7715;
        C0758 c0758 = c9791.f2830;
        if (c0758.f2814 == 256) {
            abstractC7715 = this.f39975.mo5771(c9791);
        } else {
            AbstractC12612 abstractC12612 = c9791.f29619;
            AbstractC7715 m32350 = m32350(abstractC12612.f16086, abstractC12612);
            if ((c9791.m14709(EnumC18550.f57573) || c9791.m14709(EnumC18550.f57526)) && (m32350 instanceof C1740)) {
                C1740 c1740 = (C1740) m32350;
                EnumC9454 mo3258 = c9791.f29619.f16086.mo3258();
                EnumC9454 enumC9454 = EnumC9454.INT;
                if (mo3258.m24299(enumC9454) && c9791.f29618.f16086.mo3258().m24299(enumC9454) && c9791.f29618.f16086.mo12915() != null) {
                    int intValue = ((Number) c9791.f29618.f16086.mo12915()).intValue();
                    if (c9791.m14709(EnumC18550.f57526)) {
                        intValue = -intValue;
                    }
                    c1740.m5816(intValue);
                    this.f39947 = m32350;
                    return;
                }
            }
            m32350.mo17361();
            m32350.mo20665(C1365.m4782((AbstractC4308) c0758.f17560.mo12933().f8240)).mo5817();
            AbstractC7715 m32351 = m32351((AbstractC5144) c9791.f29618, c0758);
            AbstractC4308 abstractC4308 = c9791.f29619.f16086;
            m32351.getClass();
            m32351.mo20665(C1365.m4782(abstractC4308));
            abstractC7715 = m32350;
        }
        C14439 c14439 = this.f39946;
        c14439.getClass();
        this.f39947 = new C10538(c14439, abstractC7715);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        C0758 c0758 = c6555.f2830;
        if (c6555.m14709(EnumC18550.f57488)) {
            C6304 m32349 = m32349((AbstractC5144) c6555.f20226, false);
            C6304 c6304 = new C6304(m32349.f19491, C1365.m4787(m32349.f19492), m32349.f19490, m32349.f19493);
            c6304.f19489 = m32349.f19489;
            this.f39947 = c6304;
            return;
        }
        AbstractC12612 abstractC12612 = c6555.f20226;
        AbstractC4308 abstractC4308 = c0758.f17560;
        int i = c0758.f2814;
        AbstractC7715 m32350 = m32350((AbstractC4308) abstractC4308.mo12933().f8240, abstractC12612);
        switch (C22532.f72910[c6555.mo989().ordinal()]) {
            case 4:
            case 5:
                m32350.mo17361();
                int i2 = m32350.f23845;
                if (m32350 instanceof C1740) {
                    C1740 c1740 = (C1740) m32350;
                    if (i == 96 || i == 100) {
                        AbstractC7715 mo5817 = m32350.mo5817();
                        c1740.m5816(c6555.m14709(EnumC18550.f57499) ? 1 : -1);
                        this.f39947 = mo5817;
                        return;
                    }
                }
                AbstractC7715 mo58172 = m32350.mo5817();
                m32350.mo17362(i2);
                this.f39962.m4824(m32327(i2));
                this.f39962.m4824(i);
                if (i2 != 0 && C1365.m4795(i2) == 0) {
                    this.f39962.m4824(i2 + 140);
                }
                m32350.mo5815();
                this.f39947 = mo58172;
                return;
            case 6:
                this.f39947 = m32350.mo5817();
                return;
            case 7:
                this.f39947 = m32350.mo5817();
                this.f39962.m4824(i);
                return;
            case 8:
                this.f39947 = m32350.mo5817();
                if (m32350.f23845 == 1) {
                    C14439 c14439 = this.f39946;
                    C7254 c7254 = this.f39974.f66470;
                    c14439.getClass();
                    new C23237(c14439, c7254, -1L).mo5817();
                } else {
                    this.f39962.m4824(2);
                }
                this.f39962.m4824(i);
                return;
            case 9:
            case 10:
                m32350.mo17361();
                int i3 = m32350.f23845;
                if (m32350 instanceof C1740) {
                    C1740 c17402 = (C1740) m32350;
                    if (i == 96 || i == 100) {
                        c17402.m5816(c6555.m14709(EnumC18550.f57536) ? 1 : -1);
                        this.f39947 = m32350;
                        return;
                    }
                }
                m32350.mo5817();
                this.f39962.m4824(m32327(i3));
                this.f39962.m4824(i);
                if (i3 != 0 && C1365.m4795(i3) == 0) {
                    this.f39962.m4824(i3 + 140);
                }
                C14439 c144392 = this.f39946;
                c144392.getClass();
                this.f39947 = new C10538(c144392, m32350);
                return;
            case 11:
                this.f39947 = m32350.mo5817();
                this.f39962.m4824(89);
                m32338(c6555);
                return;
            default:
                C12171.m29636();
                throw null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m32338(AbstractC5144 abstractC5144) {
        this.f39962.m4833(abstractC5144.f16085);
        C20661 c20661 = this.f39974;
        m32361(abstractC5144, c20661.f66528, this.f39952.f18833, C2609.of((Object) c20661.f66526), true);
        this.f39962.m4824(87);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        C0758 c0758 = c9085.f2830;
        if (c0758.f2814 == 256) {
            this.f39947 = this.f39975.mo5770(c9085);
            return;
        }
        if (c9085.m14709(EnumC18550.f57565)) {
            C6304 m32348 = m32348(c9085.f27533, 8);
            if (!m32348.m17359()) {
                C9833 m17364 = m32348.m17364();
                this.f39962.m4811(m32348.f19493);
                C6304 m323482 = m32348(c9085.f27532, 16);
                C14439 c14439 = this.f39946;
                int i = m323482.f19492;
                C9833 c9833 = m323482.f19493;
                C9833 m4783 = C1365.m4783(m17364, m323482.f19490);
                c14439.getClass();
                this.f39947 = new C6304(c14439, i, c9833, m4783);
                return;
            }
            this.f39947 = m32348;
            return;
        }
        if (c9085.m14709(EnumC18550.f57479)) {
            C6304 m323483 = m32348(c9085.f27533, 8);
            if (m323483.f19490 != null || m323483.f19492 != 167) {
                C9833 m17360 = m323483.m17360();
                this.f39962.m4811(m323483.f19490);
                C6304 m323484 = m32348(c9085.f27532, 16);
                C14439 c144392 = this.f39946;
                int i2 = m323484.f19492;
                C9833 m47832 = C1365.m4783(m17360, m323484.f19493);
                C9833 c98332 = m323484.f19490;
                c144392.getClass();
                this.f39947 = new C6304(c144392, i2, m47832, c98332);
                return;
            }
            this.f39947 = m323483;
            return;
        }
        m32350((AbstractC4308) c0758.f17560.mo12933().f8240, c9085.f27533).mo5817();
        this.f39947 = m32351((AbstractC5144) c9085.f27532, c0758);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7715 m32351(AbstractC5144 abstractC5144, C0758 c0758) {
        C10658 c10658 = (C10658) c0758.f17560;
        int i = c0758.f2814;
        if (i >= 159 && i <= 164) {
            Object mo12915 = abstractC5144.f16086.mo12915();
            if ((mo12915 instanceof Number) && ((Number) mo12915).intValue() == 0) {
                i -= 6;
                if ((i < 153 && i <= 166) || i == 198 || i == 199) {
                    return this.f39946.m34467(i);
                }
                this.f39962.m4824(i);
                return this.f39946.m34468(c10658.f32060);
            }
        }
        if (i < 165 || i > 166 || !C7260.m19429(abstractC5144)) {
            AbstractC4308 abstractC4308 = (AbstractC4308) c0758.mo16091(this.f39943).mo12933().f8241.f8240;
            if (i >= 270 && i <= 275) {
                i -= 150;
                abstractC4308 = this.f39974.f66452;
            }
            m32350(abstractC4308, abstractC5144).mo5817();
            if (i >= 512) {
                this.f39962.m4824(i >> 9);
                i &= 255;
            }
        } else {
            i += 33;
        }
        if (i < 153) {
        }
        this.f39962.m4824(i);
        return this.f39946.m34468(c10658.f32060);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1415(C17844 c17844) {
        this.f39947 = m32350(c17844.f54511.f16086, c17844.f54512).mo5817();
        m32336(c17844.f16085);
        if (c17844.f54511.f16086.mo12941()) {
            return;
        }
        AbstractC4308 abstractC4308 = c17844.f54512.f16086;
        AbstractC4308 abstractC43082 = c17844.f54511.f16086;
        C6319 c6319 = this.f39943;
        if (c6319.m17550(abstractC4308, abstractC43082)) {
            return;
        }
        if (c6319.m17527(c17844.f54511.f16086.f13890, c17844.f54512.f16086) == null) {
            C1365 c1365 = this.f39962;
            AbstractC4308 abstractC43083 = c17844.f54511.f16086;
            m32337(c17844, abstractC43083);
            c1365.m4805(192, c1365.f4968.m29889(abstractC43083), (InterfaceC21496) abstractC43083);
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1408(C15726 c15726) {
        throw new AssertionError(C13359.class.getName());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        AbstractC12612 abstractC12612 = c16286.f50075;
        m32350(abstractC12612.f16086, abstractC12612).mo5817();
        m32336(c16286.f16085);
        this.f39962.m4805(193, m32344((InterfaceC3109) c16286, c16286.f50076.f16086), (InterfaceC21496) null);
        this.f39947 = this.f39946.m34468(this.f39974.f66469);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1404(C14728 c14728) {
        AbstractC12612 abstractC12612 = c14728.f44980;
        m32350(abstractC12612.f16086, abstractC12612).mo5817();
        m32350(this.f39974.f66452, c14728.f44979).mo5817();
        C14439 c14439 = this.f39946;
        AbstractC4308 abstractC4308 = c14728.f16086;
        c14439.getClass();
        this.f39947 = new C14064(c14439, abstractC4308);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        EnumC1296 enumC1296;
        AbstractC5698 abstractC5698 = c7673.f23697;
        AbstractC10370 abstractC10370 = c7673.f23696;
        C6136 c6136 = this.f39952;
        AbstractC10370 abstractC103702 = c6136.f18886;
        if (abstractC10370 == abstractC103702 || abstractC10370 == c6136.f18898) {
            AbstractC7715 m34470 = abstractC10370 == abstractC103702 ? this.f39946.m34470() : this.f39946.m34469();
            if (abstractC5698.f17559 == EnumC1296.f4571) {
                m34470.mo5817();
                C14439 c14439 = this.f39946;
                c14439.getClass();
                m34470 = new C10913(c14439, abstractC5698, true);
            }
            this.f39947 = m34470;
            return;
        }
        EnumC1296 enumC12962 = abstractC5698.f17559;
        EnumC1296 enumC12963 = EnumC1296.f4571;
        if ((enumC12962 == enumC12963 && (((C3581) abstractC5698) instanceof C9226)) || m32335(abstractC5698)) {
            if (m32335(abstractC5698)) {
                m32336(c7673.f16085);
            }
            C14439 c144392 = this.f39946;
            c144392.getClass();
            this.f39947 = new C11949(c144392, abstractC5698);
            return;
        }
        EnumC1296 enumC12964 = abstractC5698.f17559;
        EnumC1296 enumC12965 = EnumC1296.f4567;
        if (enumC12964 == enumC12965 && ((enumC1296 = abstractC5698.f17561.f17559) == enumC12963 || enumC1296 == enumC12965)) {
            this.f39947 = this.f39946.m34466((C12048) abstractC5698);
            return;
        }
        if ((abstractC5698.mo16084() & 8) != 0) {
            if (!m32341(this.f39953.f6077)) {
                abstractC5698 = m32347(abstractC5698, this.f39953.f6079.f16086);
            }
            C14439 c144393 = this.f39946;
            c144393.getClass();
            this.f39947 = new C17262(c144393, abstractC5698);
            return;
        }
        this.f39946.m34470().mo5817();
        AbstractC5698 m32347 = m32347(abstractC5698, this.f39953.f6079.f16086);
        C14439 c144394 = this.f39946;
        boolean m32340 = m32340(m32347);
        c144394.getClass();
        this.f39947 = new C10913(c144394, m32347, m32340);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m32340(AbstractC5698 abstractC5698) {
        return (!this.f39961.m27206() || this.f39971) && (abstractC5698.mo16084() & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        AbstractC7715 m32350;
        AbstractC5698 abstractC5698 = c6262.f19396;
        AbstractC10370 abstractC10370 = c6262.f19395;
        C6136 c6136 = this.f39952;
        if (abstractC10370 == c6136.f18894) {
            C1365 c1365 = this.f39962;
            AbstractC4308 abstractC4308 = c6262.f19397.f16086;
            m32337(c6262, abstractC4308);
            c1365.m4809((InterfaceC8090) abstractC4308);
            this.f39947 = this.f39946.m34468(this.f39973);
            return;
        }
        AbstractC5698 m19472 = C7260.m19472(c6262.f19397);
        boolean z = m19472 != null && (m19472.f17559 == EnumC1296.f4582 || m19472.f17562 == c6136.f18898);
        boolean m32341 = m32341(this.f39953.f6077);
        if (z) {
            m32350 = this.f39946.m34469();
        } else {
            AbstractC5144 abstractC5144 = c6262.f19397;
            m32350 = m32350(abstractC5144.f16086, abstractC5144);
        }
        if (abstractC5698.f17559 == EnumC1296.f4567) {
            C12048 c12048 = (C12048) abstractC5698;
            if (c12048.m29425() != null) {
                if ((abstractC5698.mo16084() & 8) != 0) {
                    if (!z && (m19472 == null || m19472.f17559 != EnumC1296.f4582)) {
                        m32350 = m32350.mo5817();
                    }
                    m32350.mo17358();
                } else {
                    m32350.mo5817();
                    m32338(c6262.f19397);
                }
                C14439 c14439 = this.f39946;
                AbstractC4308 abstractC43082 = abstractC5698.f17560;
                Object m29425 = c12048.m29425();
                c14439.getClass();
                this.f39947 = new C23237(c14439, abstractC43082, m29425);
                return;
            }
        }
        if (abstractC5698.f17559 == EnumC1296.f4571 && (((C3581) abstractC5698) instanceof C9226)) {
            C14439 c144392 = this.f39946;
            c144392.getClass();
            this.f39947 = new C11949(c144392, abstractC5698);
            return;
        }
        AbstractC5698 m32347 = m32347(abstractC5698, c6262.f19397.f16086);
        if ((m32347.mo16084() & 8) != 0) {
            if (!z && (m19472 == null || m19472.f17559 != EnumC1296.f4582)) {
                m32350 = m32350.mo5817();
            }
            m32350.mo17358();
            C14439 c144393 = this.f39946;
            c144393.getClass();
            this.f39947 = new C17262(c144393, m32347);
            return;
        }
        m32350.mo5817();
        C20661 c20661 = this.f39974;
        if (m32347 == c20661.f66532) {
            this.f39962.m4824(190);
            this.f39947 = this.f39946.m34468(c20661.f66452);
        } else {
            C14439 c144394 = this.f39946;
            boolean z2 = m32340(m32347) || z || m32341;
            c144394.getClass();
            this.f39947 = new C10913(c144394, m32347, z2);
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1427(C23342 c23342) {
        if (c23342.f16086.m12913(EnumC9454.BOT)) {
            this.f39962.m4824(1);
            this.f39947 = this.f39946.m34468(c23342.f16086);
            return;
        }
        C14439 c14439 = this.f39946;
        AbstractC4308 abstractC4308 = c23342.f16086;
        Object obj = c23342.f74997;
        c14439.getClass();
        this.f39947 = new C23237(c14439, abstractC4308, obj);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1376(C3733 c3733) {
        this.f39962.m4832();
        C1365 c1365 = this.f39962;
        int i = c1365.f4983;
        int m4814 = c1365.m4814(c1365.f4970.f17313);
        try {
            m32356(c3733.f11797, this.f39953);
            this.f39962.m4814(m4814);
            AbstractC12612 abstractC12612 = c3733.f11799;
            this.f39947 = m32350(abstractC12612.f16086, abstractC12612).mo5817();
            this.f39962.m4827(i);
        } catch (Throwable th) {
            this.f39962.m4814(m4814);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32363(C1755 c1755, C5557 c5557) {
        HashMap hashMap = this.f39970;
        try {
            this.f39965 = c1755;
            C14163 c14163 = c5557.f17186;
            C1323 c1323 = c1755.f6075;
            this.f39951 = c1323;
            this.f39954 = c1323.f4743;
            c5557.f17179 = m32346(c14163, c5557.f17179);
            C2609 c2609 = (C2609) this.f39940.f74819.get(c14163);
            if (c2609 != null) {
                Iterator it = c2609.iterator();
                while (it.hasNext()) {
                    ((AbstractC5144) it.next()).mo988(this.f39966);
                }
            }
            C1755 c17552 = new C1755(c5557, new C4893());
            c17552.f6075 = c1755.f6075;
            c17552.f6079 = c5557;
            for (C2609 c26092 = c5557.f17179; c26092.m8249(); c26092 = c26092.f8241) {
                m32359((AbstractC5144) c26092.f8240, c17552);
            }
            if (this.f39972.f36883.f38998 > 65535) {
                this.f39969.m7273(c5557, C6241.f19216);
                this.f39963++;
            }
            if (this.f39963 != 0) {
                for (C2609 c26093 = c5557.f17179; c26093.m8249(); c26093 = c26093.f8241) {
                    if (((AbstractC5144) c26093.f8240).m14709(EnumC18550.f57511)) {
                        ((C8526) c26093.f8240).f26045.f11368 = null;
                    }
                }
            }
            c5557.f17179 = C2609.m8239();
            return this.f39963 == 0;
        } finally {
            this.f39965 = null;
            this.f39953 = null;
            this.f39951 = null;
            this.f39954 = null;
            this.f39963 = 0;
            hashMap.clear();
        }
    }

    public C13359(C2903 c2903) {
        boolean m28829;
        String m28824;
        c2903.m8841(f39939, this);
        C6136 m17057 = C6136.m17057(c2903);
        this.f39952 = m17057;
        this.f39969 = C22364.m50099(c2903);
        C20661 m47250 = C20661.m47250(c2903);
        this.f39974 = m47250;
        this.f39967 = C15240.m36054(c2903);
        this.f39945 = C22406.m50289(c2903);
        this.f39948 = C17013.m39896(c2903);
        EnumC10892 m27201 = EnumC10892.m27201(c2903);
        this.f39961 = m27201;
        C6319 m17456 = C6319.m17456(c2903);
        this.f39943 = m17456;
        AbstractC1719 abstractC1719 = (AbstractC1719) c2903.m8838(AbstractC1719.f5948);
        if (abstractC1719 == null) {
            EnumC10892 m272012 = EnumC10892.m27201(c2903);
            m28824 = C11781.m28823(c2903).m28824("stringConcat");
            if (m272012.m27211()) {
                if (m28824 == null) {
                    m28824 = "indyWithConstants";
                }
            } else {
                if (m28824 != null && !"inline".equals(m28824)) {
                    C12171.m29640("StringConcatFactory-based string concat is requested on a platform that does not support it.");
                    throw null;
                }
                m28824 = "inline";
            }
            switch (m28824) {
                case "inline":
                    abstractC1719 = new C7384(c2903);
                    break;
                case "indy":
                    abstractC1719 = new C13733(c2903);
                    break;
                case "indyWithConstants":
                    abstractC1719 = new C22906(c2903);
                    break;
                default:
                    C12171.m29640("Unknown stringConcat: ".concat(m28824));
                    throw null;
            }
        }
        this.f39975 = abstractC1719;
        this.f39941 = new C10658(null, null, null, m47250.f66481);
        this.f39942 = m17057.f18880.m30652(am.Q + m27201.m27204());
        this.f39940 = C23294.m51630(c2903);
        C11781 m28823 = C11781.m28823(c2903);
        EnumC0121 enumC0121 = EnumC0121.f1202;
        this.f39968 = m28823.m28836(enumC0121) || m28823.m28829(enumC0121, "lines");
        if (m28823.m28836(enumC0121)) {
            m28829 = m28823.m28832(EnumC0121.f1178);
        } else {
            m28829 = m28823.m28829(enumC0121, "vars");
        }
        this.f39957 = m28829;
        this.f39964 = m28823.m28832(EnumC0121.f1191);
        this.f39950 = m28823.m28831("debug.code");
        this.f39971 = m28823.m28831("disableVirtualizedPrivateInvoke");
        this.f39972 = new C12323(m17456, m17057);
        this.f39959 = EnumC19711.f63674;
        this.f39956 = C13395.m32391(c2903);
        this.f39970 = new HashMap();
    }
}
