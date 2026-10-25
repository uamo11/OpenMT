package l;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 6428 */
/* renamed from: l.ۚۤ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C5283 extends AbstractC18689 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 f16515;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2609 f16516;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5557 f16517;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10222 f16518;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f16519;

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
    }

    @Override // l.AbstractC18689
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo15215() {
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15214() {
        C22364 c22364;
        C22364 c223642;
        C22364 c223643;
        C22364 c223644;
        C3872 c3872 = (C3872) this.f59097.m43516();
        while (c3872 != null) {
            AbstractC5144 abstractC5144 = c3872.f12387;
            boolean z = c3872 instanceof C0343;
            C10222 c10222 = this.f16518;
            if (z) {
                AbstractC4308 abstractC4308 = ((C0343) c3872).f1755;
                C5557 c5557 = this.f16517;
                if (c5557 != null && c5557.f16085 == abstractC5144.f16085) {
                    c223644 = c10222.f30706;
                    C12281 c12281 = C6241.f19132;
                    c223644.m7273(abstractC5144, new C12281("compiler", "unreported.exception.default.constructor", abstractC4308));
                } else {
                    if (abstractC5144.m14709(EnumC18550.f57578)) {
                        C9378 c9378 = (C9378) abstractC5144;
                        if (c9378.f28489.m29422()) {
                            c223643 = c10222.f30706;
                            AbstractC10370 abstractC10370 = c9378.f28489.f17562;
                            C12281 c122812 = C6241.f19132;
                            c223643.m7273(abstractC5144, new C12281("compiler", "unreported.exception.implicit.close", abstractC4308, abstractC10370));
                        }
                    }
                    c223642 = c10222.f30706;
                    C12281 c122813 = C6241.f19132;
                    c223642.m7273(abstractC5144, new C12281("compiler", "unreported.exception.need.to.catch.or.throw", abstractC4308));
                }
            } else {
                c22364 = c10222.f30706;
                abstractC5144.getClass();
                C12171.m29642(c22364.m50116(abstractC5144));
            }
            c3872 = (C3872) this.f59097.m43516();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15213(AbstractC4308 abstractC4308, AbstractC5144 abstractC5144) {
        C15240 c15240;
        boolean z;
        C15240 c152402;
        C15240 c152403;
        C10222 c10222 = this.f16518;
        c15240 = c10222.f30707;
        c15240.getClass();
        boolean z2 = true;
        try {
            z = c15240.m36184(abstractC4308);
        } catch (C20515 e) {
            c15240.m36110(abstractC5144, e);
            z = true;
        }
        if (z) {
            return;
        }
        c152402 = c10222.f30707;
        C2609 c2609 = this.f16515;
        if (!c152402.m36184(abstractC4308) && !c152402.m36200(abstractC4308, c2609)) {
            z2 = false;
        }
        if (!z2) {
            C18837 c18837 = this.f59097;
            C0343 c0343 = new C0343(abstractC5144);
            c0343.f1755 = abstractC4308;
            c18837.m43511(c0343);
        }
        c152403 = c10222.f30707;
        this.f16516 = c152403.m36172(abstractC4308, this.f16516);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public void mo1215(C5557 c5557) {
        C4824 c4824;
        C6136 c6136;
        C4824 c48242;
        C15240 c15240;
        C17013 c17013;
        C6319 c6319;
        C15240 c152402;
        if (c5557.f17186 == null) {
            return;
        }
        C5557 c55572 = this.f16517;
        C2609 c2609 = this.f16516;
        C2609 c26092 = this.f16515;
        C18837 c18837 = this.f59097;
        C10222 c10222 = this.f16518;
        c4824 = c10222.f30708;
        AbstractC10370 abstractC10370 = c5557.f17180;
        c6136 = c10222.f30702;
        boolean z = abstractC10370 == c6136.f18867;
        this.f59097 = new C18837();
        if (!z) {
            this.f16515 = C2609.m8239();
        }
        this.f16517 = c5557;
        this.f16516 = C2609.m8239();
        c48242 = c10222.f30708;
        c10222.f30708 = c48242.m14053(c5557.f17186);
        try {
            for (C2609 c26093 = c5557.f17179; c26093.m8249(); c26093 = c26093.f8241) {
                if (!((AbstractC5144) c26093.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26093.f8240) & 8) != 0) {
                    mo10758((AbstractC5144) c26093.f8240);
                    m15214();
                }
            }
            if (!z) {
                boolean z2 = true;
                for (C2609 c26094 = c5557.f17179; c26094.m8249(); c26094 = c26094.f8241) {
                    if (C7260.m19469((AbstractC5144) c26094.f8240)) {
                        C2609 mo12930 = ((C8526) c26094.f8240).f26045.f17560.mo12930();
                        if (z2) {
                            this.f16515 = mo12930;
                            z2 = false;
                        } else {
                            c152402 = c10222.f30707;
                            this.f16515 = c152402.m36187(mo12930, this.f16515);
                        }
                    }
                }
            }
            for (C2609 c26095 = c5557.f17179; c26095.m8249(); c26095 = c26095.f8241) {
                if (!((AbstractC5144) c26095.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26095.f8240) & 8) == 0) {
                    mo10758((AbstractC5144) c26095.f8240);
                    m15214();
                }
            }
            if (z) {
                for (C2609 c26096 = c5557.f17179; c26096.m8249(); c26096 = c26096.f8241) {
                    if (C7260.m19463((AbstractC5144) c26096.f8240)) {
                        C8526 c8526 = (C8526) c26096.f8240;
                        mo10758(c8526);
                        c17013 = c10222.f30711;
                        c8526.f26042 = c17013.m39967(this.f16516);
                        C3581 c3581 = c8526.f26045;
                        c6319 = c10222.f30703;
                        c3581.f17560 = c6319.m17524(c8526.f26045.f17560, this.f16516);
                    }
                }
                c15240 = c10222.f30707;
                c2609 = c15240.m36194(this.f16516, c2609);
            }
            for (C2609 c26097 = c5557.f17179; c26097.m8249(); c26097 = c26097.f8241) {
                if ((!z || !C7260.m19463((AbstractC5144) c26097.f8240)) && ((AbstractC5144) c26097.f8240).m14709(EnumC18550.f57511)) {
                    mo10758((AbstractC5144) c26097.f8240);
                    m15214();
                }
            }
            this.f16516 = c2609;
        } finally {
            this.f59097 = c18837;
            this.f16515 = c26092;
            this.f16517 = c55572;
            c10222.f30708 = c4824;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C4824 c4824;
        C4824 c48242;
        boolean z;
        C22364 c22364;
        C15240 c15240;
        if (c8526.f26043 == null) {
            return;
        }
        C2609 c2609 = this.f16515;
        C2609 mo12930 = c8526.f26045.f17560.mo12930();
        C10222 c10222 = this.f16518;
        c4824 = c10222.f30708;
        c48242 = c10222.f30708;
        c10222.f30708 = c48242.m14053(c8526.f26045);
        C12171.m29642(this.f59097.isEmpty());
        try {
            for (C2609 c26092 = c8526.f26048; c26092.m8249(); c26092 = c26092.f8241) {
                mo10758((C9378) c26092.f8240);
            }
            if (C7260.m19469(c8526)) {
                c15240 = c10222.f30707;
                this.f16515 = c15240.m36194(this.f16515, mo12930);
            } else if ((c8526.f26045.f17563 & 1048584) != 1048576) {
                this.f16515 = mo12930;
            }
            mo10758(c8526.f26043);
            C2609 m43517 = this.f59097.m43517();
            this.f59097 = new C18837();
            while (m43517.m8249()) {
                C3872 c3872 = (C3872) m43517.f8240;
                m43517 = m43517.f8241;
                if (!(c3872 instanceof C0343)) {
                    if (!c3872.f12387.m14709(EnumC18550.f57530)) {
                        c22364 = c10222.f30706;
                        AbstractC5144 abstractC5144 = c3872.f12387;
                        abstractC5144.getClass();
                        if (!c22364.m50116(abstractC5144)) {
                            z = false;
                            C12171.m29642(z);
                        }
                    }
                    z = true;
                    C12171.m29642(z);
                } else {
                    this.f59097.m43511(c3872);
                }
            }
        } finally {
            this.f16515 = c2609;
            c10222.f30708 = c4824;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C4824 c4824;
        C4824 c48242;
        if (c9378.f28487 != null) {
            C10222 c10222 = this.f16518;
            c4824 = c10222.f30708;
            c48242 = c10222.f30708;
            c10222.f30708 = c48242.m14053(c9378.f28489);
            try {
                mo10758(c9378.f28487);
            } finally {
                c10222.f30708 = c4824;
            }
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        m33860(c2735.f8521);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c20374.f65770);
        m43307(c20374);
        mo10758(c20374.f65771);
        m43303(c20374, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c8672.f26445);
        mo10758(c8672.f26444);
        m43307(c8672);
        m43303(c8672, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        C18837 c18837 = this.f59097;
        m33860(c11907.f35587);
        this.f59097 = new C18837();
        AbstractC12612 abstractC12612 = c11907.f35588;
        if (abstractC12612 != null) {
            mo10758(abstractC12612);
        }
        mo10758(c11907.f35585);
        m43307(c11907);
        m33860(c11907.f35586);
        m43303(c11907, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        mo1392(c4851.f15325);
        C18837 c18837 = this.f59097;
        mo10758(c4851.f15326);
        this.f59097 = new C18837();
        mo10758(c4851.f15324);
        m43307(c4851);
        m43303(c4851, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(c17698.f54159);
        m43303(c17698, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        m15210(c22637, c22637.f73103, c22637.f73102);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        m15210(c13464, c13464.f40197, c13464.f40199);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15210(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612, C2609 c2609) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        mo10758(abstractC12612);
        while (c2609.m8249()) {
            C18963 c18963 = (C18963) c2609.f8240;
            m33860(c18963.f59815);
            m33860(c18963.f59814);
            c2609 = c2609.f8241;
        }
        if (abstractC5144.m14709(EnumC18550.f57555)) {
            m43306(abstractC5144, c18837);
        } else {
            m43303(abstractC5144, c18837);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        C10222 c10222;
        C15240 c15240;
        C20661 c20661;
        C20661 c206612;
        C15240 c152402;
        C15240 c152403;
        C15240 c152404;
        C15240 c152405;
        C15240 c152406;
        C15240 c152407;
        C2609 of;
        C15240 c152408;
        C15240 c152409;
        C20661 c206613;
        C2609 c2609;
        Iterator it;
        C2609 c26092;
        C6319 c6319;
        C20661 c206614;
        C15240 c1524010;
        C2609 c26093;
        C15240 c1524011;
        boolean z;
        C15240 c1524012;
        C15240 c1524013;
        C11076 c11076;
        C22364 c22364;
        C15240 c1524014;
        C22364 c223642;
        C15240 c1524015;
        C22364 c223643;
        C2609 of2;
        C6319 c63192;
        C20661 c206615;
        C22406 c22406;
        C1755 c1755;
        C6319 c63193;
        C6136 c6136;
        C6319 c63194;
        C6319 c63195;
        C6319 c63196;
        C2609 of3;
        C15240 c1524016;
        C2609 c26094 = this.f16515;
        C2609 c26095 = this.f16516;
        this.f16516 = C2609.m8239();
        C2609 c26096 = c10789.f32449;
        while (true) {
            boolean m8249 = c26096.m8249();
            c10222 = this.f16518;
            if (!m8249) {
                break;
            }
            if (((C0617) c26096.f8240).f2373.f28488.m14709(EnumC18550.f57503)) {
                of3 = ((C23488) ((C0617) c26096.f8240).f2373.f28488).f75416;
            } else {
                of3 = C2609.of((Object) ((C0617) c26096.f8240).f2373.f28488);
            }
            Iterator it2 = of3.iterator();
            while (it2.hasNext()) {
                AbstractC12612 abstractC12612 = (AbstractC12612) it2.next();
                c1524016 = c10222.f30707;
                this.f16515 = c1524016.m36172(abstractC12612.f16086, this.f16515);
            }
            c26096 = c26096.f8241;
        }
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        Iterator it3 = c10789.f32446.iterator();
        while (it3.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it3.next();
            if (abstractC5144 instanceof C9378) {
                mo1392((C9378) abstractC5144);
            } else if (abstractC5144 instanceof AbstractC12612) {
                mo10758((AbstractC12612) abstractC5144);
            } else {
                throw new AssertionError(c10789);
            }
        }
        Iterator it4 = c10789.f32446.iterator();
        while (true) {
            boolean z2 = false;
            if (!it4.hasNext()) {
                break;
            }
            AbstractC5144 abstractC51442 = (AbstractC5144) it4.next();
            if (abstractC51442.f16086.mo5146()) {
                c63195 = c10222.f30703;
                C2609 m17510 = c63195.m17510(abstractC51442.f16086);
                c63196 = c10222.f30703;
                of2 = m17510.m8246(c63196.m17562(abstractC51442.f16086));
            } else {
                of2 = C2609.of((Object) abstractC51442.f16086);
            }
            Iterator it5 = of2.iterator();
            while (it5.hasNext()) {
                AbstractC4308 abstractC4308 = (AbstractC4308) it5.next();
                c63192 = c10222.f30703;
                c206615 = c10222.f30704;
                if (c63192.m17527(c206615.f66531.f13890, abstractC4308) != null) {
                    c22406 = c10222.f30710;
                    c1755 = c10222.f30705;
                    c63193 = c10222.f30703;
                    AbstractC4308 m17526 = c63193.m17526(abstractC4308, z2);
                    c6136 = c10222.f30702;
                    AbstractC10370 abstractC10370 = c6136.f18851;
                    C2609 m8239 = C2609.m8239();
                    C2609 m82392 = C2609.m8239();
                    c22406.getClass();
                    AbstractC5144 abstractC51443 = abstractC51442;
                    AbstractC5698 m50313 = c22406.m50313(c10789, c1755, m17526.f13890, m17526, abstractC10370, m8239, m82392);
                    c63194 = c10222.f30703;
                    AbstractC4308 m17543 = c63194.m17543(m50313, abstractC51443.f16086);
                    if (m50313.f17559 == EnumC1296.f4571) {
                        Iterator it6 = m17543.mo12930().iterator();
                        while (it6.hasNext()) {
                            m15213((AbstractC4308) it6.next(), abstractC51443);
                        }
                    }
                    abstractC51442 = abstractC51443;
                    z2 = false;
                }
            }
        }
        mo10758(c10789.f32445);
        c15240 = c10222.f30707;
        C2609 c26097 = this.f16516;
        c20661 = c10222.f30704;
        AbstractC4308 abstractC43082 = c20661.f66453;
        c206612 = c10222.f30704;
        C2609 m36194 = c15240.m36194(c26097, C2609.of((Object) abstractC43082, (Object) c206612.f66492));
        this.f16516 = c26095;
        this.f16515 = c26094;
        C2609 m82393 = C2609.m8239();
        C2609 c26098 = c10789.f32449;
        while (c26098.m8249()) {
            C9378 c9378 = ((C0617) c26098.f8240).f2373;
            if (c9378.f28488.m14709(EnumC18550.f57503)) {
                of = ((C23488) ((C0617) c26098.f8240).f2373.f28488).f75416;
            } else {
                of = C2609.of((Object) ((C0617) c26098.f8240).f2373.f28488);
            }
            C2609 m82394 = C2609.m8239();
            c152408 = c10222.f30707;
            C2609 m36171 = c152408.m36171(m36194, m82393);
            Iterator it7 = of.iterator();
            C2609 c26099 = m82393;
            C2609 c260910 = m82394;
            while (it7.hasNext()) {
                AbstractC5144 abstractC51444 = (AbstractC12612) it7.next();
                AbstractC4308 abstractC43083 = abstractC51444.f16086;
                c206613 = c10222.f30704;
                if (abstractC43083 != c206613.f66519) {
                    C2609 m8242 = c260910.m8242(abstractC43083);
                    c6319 = c10222.f30703;
                    it = it7;
                    c206614 = c10222.f30704;
                    if (c6319.m17550(abstractC43083, c206614.f66526)) {
                        c2609 = of;
                        c26092 = c26095;
                        c260910 = m8242;
                    } else {
                        if (of.m8245() <= 1) {
                            abstractC51444 = (C0617) c26098.f8240;
                            abstractC51444.getClass();
                        }
                        c1524010 = c10222.f30707;
                        if (c1524010.m36200(abstractC43083, c26099)) {
                            c223643 = c10222.f30706;
                            C12281 c12281 = C6241.f19132;
                            c2609 = of;
                            c26093 = m8242;
                            c26092 = c26095;
                            c223643.m7273(abstractC51444, new C12281("compiler", "except.already.caught", abstractC43083));
                        } else {
                            c2609 = of;
                            c26092 = c26095;
                            c26093 = m8242;
                            c1524011 = c10222.f30707;
                            c1524011.getClass();
                            try {
                                z = c1524011.m36184(abstractC43083);
                            } catch (C20515 e) {
                                c1524011.m36110(abstractC51444, e);
                                z = true;
                            }
                            if (!z && !m15211(abstractC43083)) {
                                c1524014 = c10222.f30707;
                                if (!c1524014.m36193(abstractC43083, m36194)) {
                                    c223642 = c10222.f30706;
                                    C12281 c122812 = C6241.f19132;
                                    c223642.m7273(abstractC51444, new C12281("compiler", "except.never.thrown.in.try", abstractC43083));
                                }
                            }
                            c1524012 = c10222.f30707;
                            C2609 m36187 = c1524012.m36187(C2609.of((Object) abstractC43083), m36194);
                            c1524013 = c10222.f30707;
                            if (c1524013.m36171(m36187, c26099).isEmpty() && !m15211(abstractC43083)) {
                                if (m36187.m8245() == 1) {
                                    C11076 c110762 = C14001.f42334;
                                    c11076 = new C11076("compiler", "unreachable.catch", m36187);
                                } else {
                                    C11076 c110763 = C14001.f42334;
                                    c11076 = new C11076("compiler", "unreachable.catch.1", m36187);
                                }
                                c22364 = c10222.f30706;
                                c22364.m7285(abstractC51444, c11076);
                            }
                        }
                        c1524015 = c10222.f30707;
                        c26099 = c1524015.m36172(abstractC43083, c26099);
                        c260910 = c26093;
                    }
                } else {
                    c2609 = of;
                    it = it7;
                    c26092 = c26095;
                }
                it7 = it;
                of = c2609;
                c26095 = c26092;
            }
            mo10758(c9378);
            HashMap hashMap = this.f16519;
            C12048 c12048 = c9378.f28489;
            c152409 = c10222.f30707;
            hashMap.put(c12048, c152409.m36187(c260910, m36171));
            mo10758(((C0617) c26098.f8240).f2372);
            this.f16519.remove(c9378.f28489);
            c26098 = c26098.f8241;
            m82393 = c26099;
        }
        C2609 c260911 = c26095;
        if (c10789.f32448 != null) {
            C2609 c260912 = this.f16516;
            this.f16516 = C2609.m8239();
            C18837 c188372 = this.f59097;
            this.f59097 = c18837;
            mo10758(c10789.f32448);
            if (!c10789.f32447) {
                c152407 = c10222.f30707;
                this.f16516 = c152407.m36194(this.f16516, c260911);
                return;
            }
            c152404 = c10222.f30707;
            C2609 c260913 = this.f16516;
            c152405 = c10222.f30707;
            this.f16516 = c152404.m36194(c260913, c152405.m36171(m36194, m82393));
            c152406 = c10222.f30707;
            this.f16516 = c152406.m36194(this.f16516, c260912);
            while (c188372.m43518()) {
                this.f59097.m43511((C3872) c188372.m43516());
            }
            return;
        }
        c152402 = c10222.f30707;
        C2609 c260914 = this.f16516;
        c152403 = c10222.f30707;
        this.f16516 = c152402.m36194(c260914, c152403.m36171(m36194, m82393));
        C18837 c188373 = this.f59097;
        this.f59097 = c18837;
        while (c188373.m43518()) {
            this.f59097.m43511((C3872) c188373.m43516());
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        mo10758(c1470.f5225);
        mo10758(c1470.f5226);
        AbstractC11349 abstractC11349 = c1470.f5227;
        if (abstractC11349 != null) {
            mo10758(abstractC11349);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15211(AbstractC4308 abstractC4308) {
        C20661 c20661;
        C20661 c206612;
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        C10222 c10222 = this.f16518;
        c20661 = c10222.f30704;
        if (abstractC19810 == c20661.f66479.f13890) {
            return true;
        }
        AbstractC19810 abstractC198102 = abstractC4308.f13890;
        c206612 = c10222.f30704;
        return abstractC198102 == c206612.f66490.f13890;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        m43304(new C3872(c4146));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        mo10758(c2322.f7456);
        m43304(new C3872(c2322));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        m43304(new C3872(c15433));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        mo10758(c9938.f30017);
        m43304(new C3872(c9938));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        mo10758(c1616.f5680);
        AbstractC5698 m19472 = C7260.m19472(c1616.f5680);
        if (m19472 != null && m19472.f17559 == EnumC1296.f4567 && (m19472.mo16084() & 2199023255568L) != 0 && this.f16519.get(m19472) != null) {
            Iterator it = ((C2609) this.f16519.get(m19472)).iterator();
            while (it.hasNext()) {
                m15213((AbstractC4308) it.next(), c1616);
            }
            return;
        }
        m15213(c1616.f5680.f16086, c1616);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        mo10758(c15580.f48011);
        m33860(c15580.f48012);
        for (C2609 mo12930 = c15580.f48011.f16086.mo12930(); mo12930.m8249(); mo12930 = mo12930.f8241) {
            m15213((AbstractC4308) mo12930.f8240, c15580);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        C15240 c15240;
        mo10758(c19110.f60199);
        m33860(c19110.f60197);
        for (C2609 mo12930 = c19110.f60192.mo12930(); mo12930.m8249(); mo12930 = mo12930.f8241) {
            m15213((AbstractC4308) mo12930.f8240, c19110);
        }
        C2609 c2609 = this.f16515;
        try {
            if (c19110.f60195 != null) {
                for (C2609 mo129302 = c19110.f60194.f17560.mo12930(); mo129302.m8249(); mo129302 = mo129302.f8241) {
                    c15240 = this.f16518.f30707;
                    this.f16515 = c15240.m36172((AbstractC4308) mo129302.f8240, this.f16515);
                }
            }
            mo10758(c19110.f60195);
        } finally {
            this.f16515 = c2609;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public void mo1217(C14169 c14169) {
        C6319 c6319;
        boolean z;
        C22364 c22364;
        C10222 c10222 = this.f16518;
        AbstractC4308 abstractC4308 = c14169.f16086;
        if (abstractC4308 == null || !abstractC4308.mo12948()) {
            C2609 c2609 = this.f16515;
            C2609 c26092 = this.f16516;
            C18837 c18837 = this.f59097;
            try {
                this.f59097 = new C18837();
                c6319 = c10222.f30703;
                this.f16515 = c14169.m51449(c6319).mo12930();
                this.f16516 = C2609.m8239();
                mo10758(c14169.f42776);
                C2609 m43517 = this.f59097.m43517();
                this.f59097 = new C18837();
                while (m43517.m8249()) {
                    C3872 c3872 = (C3872) m43517.f8240;
                    m43517 = m43517.f8241;
                    if (!(c3872 instanceof C0343)) {
                        if (!c3872.f12387.m14709(EnumC18550.f57530)) {
                            c22364 = c10222.f30706;
                            AbstractC5144 abstractC5144 = c3872.f12387;
                            abstractC5144.getClass();
                            if (!c22364.m50116(abstractC5144)) {
                                z = false;
                                C12171.m29642(z);
                            }
                        }
                        z = true;
                        C12171.m29642(z);
                    } else {
                        this.f59097.m43511(c3872);
                    }
                }
                m15214();
            } finally {
                this.f59097 = c18837;
                this.f16515 = c2609;
                this.f16516 = c26092;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15212(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        C10222 c10222 = this.f16518;
        try {
            c10222.f30705 = c1755;
            c10222.f30711 = c17013;
            this.f59097 = new C18837();
            this.f16519 = new HashMap();
            this.f16515 = null;
            this.f16516 = null;
            this.f16517 = null;
            mo10758(abstractC5144);
        } finally {
            this.f59097 = null;
            c10222.f30711 = null;
            this.f16515 = null;
            this.f16516 = null;
            this.f16517 = null;
        }
    }

    public C5283(C10222 c10222) {
        this.f16518 = c10222;
    }
}
