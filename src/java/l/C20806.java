package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* compiled from: 6428 */
/* renamed from: l.᩷ۤ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20806 extends AbstractC18689 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f67350;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9378[] f67353;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f67355;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f67356;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5557 f67357;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10222 f67359;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67360;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67365;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC1049 f67362 = EnumC1049.NORMAL;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f67354 = false;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7841 f67361 = new C7841(false);

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7841 f67351 = new C7841(false);

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C7841 f67352 = new C7841(false);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7841 f67366 = new C7841(true);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7841 f67358 = new C7841(true);

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C7841 f67364 = new C7841(true);

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7841 f67363 = new C7841(true);

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
    }

    @Override // l.AbstractC18689, l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo1386(C7820 c7820) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        mo10758((AbstractC5144) c16139.f49721);
        m47609(c16139.f49721);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        mo10758(c6262.f19397);
        if (C7260.m19453(c6262.f19397)) {
            AbstractC5698 abstractC5698 = c6262.f19396;
            if (abstractC5698.f17559 == EnumC1296.f4567) {
                m47603((InterfaceC3109) c6262, (C12048) abstractC5698);
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m47610(AbstractC5144 abstractC5144) {
        if (abstractC5144 != null) {
            super.mo10758(abstractC5144);
            if (this.f67361.m20941()) {
                m47613();
            }
        }
    }

    @Override // l.AbstractC18689
    /* renamed from: ᩳ */
    public final void mo15215() {
        boolean z = this.f67354;
        C7841 c7841 = this.f67361;
        if (!z) {
            c7841.m20937(this.f67356, this.f67365);
        } else {
            for (int i = this.f67356; i < this.f67365; i++) {
                C12048 c12048 = this.f67353[i].f28489;
                if (!m47607(c12048) || !c12048.mo15572()) {
                    c7841.m20945(i);
                }
            }
        }
        this.f67351.m20937(this.f67356, this.f67365);
    }

    /* renamed from: ۧ */
    public boolean mo35862(C12048 c12048) {
        if (c12048.f36040 < this.f67355) {
            return false;
        }
        EnumC1296 enumC1296 = c12048.f17561.f17559;
        return enumC1296 == EnumC1296.f4571 || enumC1296 == EnumC1296.f4567 || m47607(c12048);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47607(C12048 c12048) {
        AbstractC5698 abstractC5698 = c12048.f17561;
        if (abstractC5698.f17559 != EnumC1296.f4582 || (c12048.f17563 & 8590196752L) != 16) {
            return false;
        }
        AbstractC5698 abstractC56982 = this.f67357.f17186;
        C14163 c14163 = (C14163) abstractC5698;
        abstractC56982.getClass();
        while (abstractC56982.f17559 != EnumC1296.f4579) {
            if (abstractC56982 == c14163) {
                return true;
            }
            abstractC56982 = abstractC56982.f17561;
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47611(C9378 c9378) {
        C12048 c12048 = c9378.f28489;
        C9378[] c9378Arr = (C9378[]) C6322.m17575(this.f67365, this.f67353);
        this.f67353 = c9378Arr;
        long j = c12048.f17563;
        if ((16 & j) == 0) {
            c12048.f17563 = j | 2199023255552L;
        }
        int i = this.f67365;
        c12048.f36038 = i;
        c9378Arr[i] = c9378;
        this.f67361.m20936(i);
        this.f67351.m20945(this.f67365);
        this.f67365++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47605(AbstractC5144 abstractC5144, C12048 c12048) {
        C22364 c22364;
        C22364 c223642;
        C5931 c5931;
        C22364 c223643;
        C22364 c223644;
        int i = c12048.f36038;
        int i2 = this.f67360;
        C10222 c10222 = this.f67359;
        if (i < i2 || !mo35862(c12048)) {
            if ((c12048.f17563 & 16) != 0) {
                c22364 = c10222.f30706;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(abstractC5144, new C12281("compiler", "var.might.already.be.assigned", c12048));
                return;
            }
            return;
        }
        long j = c12048.f17563;
        long j2 = 2199023255552L & j;
        C7841 c7841 = this.f67351;
        if (j2 != 0) {
            if (!c7841.m20950(c12048.f36038)) {
                c12048.f17563 &= -2199023255553L;
            } else {
                m47612(c12048);
            }
        } else if ((16 & j) != 0) {
            if ((8589934592L & j) != 0) {
                if ((j & 549755813888L) != 0) {
                    c223644 = c10222.f30706;
                    C12281 c122812 = C6241.f19132;
                    c223644.m7273(abstractC5144, new C12281("compiler", "multicatch.parameter.may.not.be.assigned", c12048));
                } else {
                    c223643 = c10222.f30706;
                    C12281 c122813 = C6241.f19132;
                    c223643.m7273(abstractC5144, new C12281("compiler", "final.parameter.may.not.be.assigned", c12048));
                }
            } else if (!c7841.m20950(c12048.f36038)) {
                c223642 = c10222.f30706;
                c5931 = c10222.f30709;
                c223642.m7273(abstractC5144, c5931.m16616(this.f67362.f3879, c12048));
            } else {
                m47612(c12048);
            }
        }
        this.f67361.m20945(c12048.f36038);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47612(C12048 c12048) {
        boolean m20950 = this.f67361.m20950(c12048.f36038);
        C7841 c7841 = this.f67351;
        if (!m20950) {
            c7841.m20936(c12048.f36038);
            this.f67352.m20936(c12048.f36038);
        } else {
            c7841.m20936(c12048.f36038);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47615(AbstractC5144 abstractC5144) {
        AbstractC5144 m19471 = C7260.m19471(abstractC5144);
        if (m19471.m14709(EnumC18550.f57566) || m19471.m14709(EnumC18550.f57581)) {
            AbstractC5698 m19472 = C7260.m19472(m19471);
            if (m19472.f17559 == EnumC1296.f4567) {
                m47605(m19471, (C12048) m19472);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47603(InterfaceC3109 interfaceC3109, C12048 c12048) {
        C12281 c12281 = C6241.f19132;
        m47604(interfaceC3109, c12048, new C12281("compiler", "var.might.not.have.been.initialized", c12048));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47604(InterfaceC3109 interfaceC3109, C12048 c12048, C12281 c12281) {
        C22364 c22364;
        if ((c12048.f36038 >= this.f67360 || c12048.f17561.f17559 != EnumC1296.f4582) && mo35862(c12048)) {
            int i = c12048.f36038;
            C7841 c7841 = this.f67361;
            if (c7841.m20950(i) || (c12048.f17563 & 4398046511104L) != 0) {
                return;
            }
            c22364 = this.f67359.f30706;
            c22364.m7273(interfaceC3109, c12281);
            c7841.m20945(c12048.f36038);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47600(C7841... c7841Arr) {
        for (C7841 c7841 : c7841Arr) {
            c7841.m20944();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47606(boolean z) {
        C7841 c7841 = this.f67358;
        C7841 c78412 = this.f67361;
        c7841.m20940(c78412);
        C7841 c78413 = this.f67363;
        C7841 c78414 = this.f67351;
        c78413.m20940(c78414);
        this.f67366.m20940(c78412);
        this.f67364.m20940(c78414);
        if (z) {
            m47600(c78412, c78414);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47613() {
        C7841 c7841 = this.f67366;
        C7841 c78412 = this.f67358;
        c78412.m20938(c7841);
        this.f67361.m20940(c78412);
        C7841 c78413 = this.f67364;
        C7841 c78414 = this.f67363;
        c78414.m20938(c78413);
        this.f67351.m20940(c78414);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47608(C2609 c2609) {
        if (c2609 != null) {
            while (c2609.m8249()) {
                m47610((AbstractC5144) c2609.f8240);
                c2609 = c2609.f8241;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47614(AbstractC5144 abstractC5144) {
        C20661 c20661;
        C20661 c206612;
        boolean mo12942 = abstractC5144.f16086.mo12942();
        C10222 c10222 = this.f67359;
        C7841 c7841 = this.f67363;
        C7841 c78412 = this.f67358;
        C7841 c78413 = this.f67364;
        C7841 c78414 = this.f67366;
        C7841 c78415 = this.f67351;
        C7841 c78416 = this.f67361;
        if (mo12942) {
            if (c78416.m20941()) {
                m47613();
            }
            c78414.m20940(c78416);
            c78414.m20937(this.f67360, this.f67365);
            c78413.m20940(c78415);
            c78413.m20937(this.f67360, this.f67365);
            c78412.m20940(c78416);
            c7841.m20940(c78415);
        } else if (!abstractC5144.f16086.mo12935()) {
            super.mo10758(abstractC5144);
            if (!c78416.m20941()) {
                AbstractC4308 abstractC4308 = abstractC5144.f16086;
                c20661 = c10222.f30704;
                m47606(abstractC4308 != c20661.f66519);
            }
        } else {
            if (c78416.m20941()) {
                m47613();
            }
            c78412.m20940(c78416);
            c78412.m20937(this.f67360, this.f67365);
            c7841.m20940(c78415);
            c7841.m20937(this.f67360, this.f67365);
            c78414.m20940(c78416);
            c78413.m20940(c78415);
        }
        AbstractC4308 abstractC43082 = abstractC5144.f16086;
        c206612 = c10222.f30704;
        if (abstractC43082 != c206612.f66519) {
            m47600(c78416, c78415);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public void mo1215(C5557 c5557) {
        C4824 c4824;
        C4824 c48242;
        C6136 c6136;
        if (c5557.f17186 == null) {
            return;
        }
        C10222 c10222 = this.f67359;
        c4824 = c10222.f30708;
        c48242 = c10222.f30708;
        c10222.f30708 = c48242.m14053(c5557.f17186);
        try {
            if (c5557.f17186 == null) {
                return;
            }
            C5557 c55572 = this.f67357;
            int i = this.f67360;
            int i2 = this.f67365;
            C18837 c18837 = this.f59097;
            this.f59097 = new C18837();
            AbstractC10370 abstractC10370 = c5557.f17180;
            c6136 = c10222.f30702;
            if (abstractC10370 != c6136.f18867) {
                this.f67360 = this.f67365;
            }
            this.f67357 = c5557;
            try {
                for (C2609 c2609 = c5557.f17179; c2609.m8249(); c2609 = c2609.f8241) {
                    if (((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57578)) {
                        C9378 c9378 = (C9378) c2609.f8240;
                        if ((8 & c9378.f28486.f7169) != 0 && mo35862(c9378.f28489)) {
                            m47611(c9378);
                        }
                    }
                }
                for (C2609 c26092 = c5557.f17179; c26092.m8249(); c26092 = c26092.f8241) {
                    if (!((AbstractC5144) c26092.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26092.f8240) & 8) != 0) {
                        super.mo10758((AbstractC5144) c26092.f8240);
                        m47601(false);
                    }
                }
                for (C2609 c26093 = c5557.f17179; c26093.m8249(); c26093 = c26093.f8241) {
                    if (((AbstractC5144) c26093.f8240).m14709(EnumC18550.f57578)) {
                        C9378 c93782 = (C9378) c26093.f8240;
                        if ((c93782.f28486.f7169 & 8) == 0 && mo35862(c93782.f28489)) {
                            m47611(c93782);
                        }
                    }
                }
                for (C2609 c26094 = c5557.f17179; c26094.m8249(); c26094 = c26094.f8241) {
                    if (!((AbstractC5144) c26094.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26094.f8240) & 8) == 0) {
                        super.mo10758((AbstractC5144) c26094.f8240);
                        m47601(false);
                    }
                }
                for (C2609 c26095 = c5557.f17179; c26095.m8249(); c26095 = c26095.f8241) {
                    if (((AbstractC5144) c26095.f8240).m14709(EnumC18550.f57511)) {
                        super.mo10758((AbstractC5144) c26095.f8240);
                    }
                }
            } finally {
                this.f59097 = c18837;
                this.f67365 = i2;
                this.f67360 = i;
                this.f67357 = c55572;
            }
        } finally {
            c10222.f30708 = c4824;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C4824 c4824;
        C4824 c48242;
        C4824 c48243;
        C10222 c10222;
        boolean z;
        C10222 c102222;
        C4824 c48244;
        boolean z2;
        boolean z3;
        C7841 c7841 = this.f67351;
        C7841 c78412 = this.f67361;
        if (c8526.f26043 == null || (c8526.f26045.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return;
        }
        C10222 c102223 = this.f67359;
        c4824 = c102223.f30708;
        c48242 = c102223.f30708;
        c102223.f30708 = c48242.m14053(c8526.f26045);
        try {
            if (c8526.f26043 == null) {
                c102223.f30708 = c4824;
                return;
            }
            if ((c8526.f26045.f17563 & 562949953425408L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                c102223.f30708 = c4824;
                return;
            }
            C7841 c78413 = new C7841(c78412);
            C7841 c78414 = new C7841(c7841);
            int i = this.f67365;
            int i2 = this.f67360;
            int i3 = this.f67356;
            C12171.m29642(this.f59097.isEmpty());
            boolean z4 = this.f67354;
            try {
                boolean m19469 = C7260.m19469(c8526);
                this.f67354 = m19469;
                if (!m19469) {
                    this.f67360 = this.f67365;
                }
                for (C2609 c2609 = c8526.f26048; c2609.m8249(); c2609 = c2609.f8241) {
                    C9378 c9378 = (C9378) c2609.f8240;
                    super.mo10758((AbstractC5144) c9378);
                    C12171.m29641("Method parameter without PARAMETER flag", (c9378.f28489.f17563 & 8589934592L) != 0);
                    m47609(c9378);
                }
                super.mo10758(c8526.f26043);
                long j = c8526.f26045.f17563;
                boolean z5 = (j & 2251799813685248L) != 0;
                if (this.f67354) {
                    boolean z6 = (j & 68719476736L) != 0;
                    try {
                        int i4 = this.f67360;
                        while (i4 < this.f67365) {
                            C9378 c93782 = this.f67353[i4];
                            C12048 c12048 = c93782.f28489;
                            c102222 = c102223;
                            try {
                                c48244 = c4824;
                                try {
                                    if (c12048.f17561 != this.f67357.f17186) {
                                        z3 = z6;
                                        z2 = z4;
                                    } else if (!z6 || z5) {
                                        z3 = z6;
                                        z2 = z4;
                                        if (z5) {
                                            if (c12048.m16071().m33810() && (c12048.f17563 & 2305843009230471186L) != 0 && !c12048.mo15572() && c12048.f17561.f17559 == EnumC1296.f4582) {
                                                if (!c78412.m20950(c12048.f36038) && c7841.m20950(c12048.f36038) && c8526.f26050) {
                                                    c12048.f17563 |= 2251799813685248L;
                                                } else {
                                                    m47603(C7260.m19464(c8526.f26043), c12048);
                                                }
                                            }
                                            m47603(C7260.m19439(c12048, c93782, false), c12048);
                                        } else {
                                            m47603(C7260.m19464(c8526.f26043), c12048);
                                        }
                                        i4++;
                                        c102223 = c102222;
                                        c4824 = c48244;
                                        z6 = z3;
                                        z4 = z2;
                                    } else {
                                        InterfaceC3109 m19439 = C7260.m19439(c12048, c93782, false);
                                        try {
                                            C12281 c12281 = C6241.f19132;
                                            z3 = z6;
                                            z2 = z4;
                                            try {
                                                m47604(m19439, c12048, new C12281("compiler", "var.not.initialized.in.default.constructor", c12048));
                                            } catch (Throwable th) {
                                                th = th;
                                                c10222 = c102222;
                                                c48243 = c48244;
                                                z = z2;
                                                try {
                                                    c78412.m20940(c78413);
                                                    c7841.m20940(c78414);
                                                    this.f67365 = i;
                                                    this.f67360 = i2;
                                                    this.f67356 = i3;
                                                    this.f67354 = z;
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    c10222.f30708 = c48243;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z2 = z4;
                                            c10222 = c102222;
                                            c48243 = c48244;
                                            z = z2;
                                            c78412.m20940(c78413);
                                            c7841.m20940(c78414);
                                            this.f67365 = i;
                                            this.f67360 = i2;
                                            this.f67356 = i3;
                                            this.f67354 = z;
                                            throw th;
                                        }
                                    }
                                    i4++;
                                    c102223 = c102222;
                                    c4824 = c48244;
                                    z6 = z3;
                                    z4 = z2;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c48244 = c4824;
                                z2 = z4;
                                c10222 = c102222;
                                c48243 = c48244;
                                z = z2;
                                c78412.m20940(c78413);
                                c7841.m20940(c78414);
                                this.f67365 = i;
                                this.f67360 = i2;
                                this.f67356 = i3;
                                this.f67354 = z;
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        c102222 = c102223;
                    }
                }
                c102222 = c102223;
                c48244 = c4824;
                z2 = z4;
                m47601(true);
                try {
                    c78412.m20940(c78413);
                    c7841.m20940(c78414);
                    this.f67365 = i;
                    this.f67360 = i2;
                    this.f67356 = i3;
                    this.f67354 = z2;
                    c102222.f30708 = c48244;
                } catch (Throwable th7) {
                    th = th7;
                    c10222 = c102222;
                    c48243 = c48244;
                    c10222.f30708 = c48243;
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                c48243 = c4824;
                c10222 = c102223;
                z = z4;
            }
        } catch (Throwable th9) {
            th = th9;
            c48243 = c4824;
            c10222 = c102223;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[LOOP:1: B:16:0x0055->B:18:0x0059, LOOP_END] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m47601(boolean r6) {
        /*
            r5 = this;
            l.ᩴܶ۠ r0 = r5.f59097
            l.ۖܶ۠ r0 = r0.m43517()
            l.ᩴܶ۠ r1 = new l.ᩴܶ۠
            r1.<init>()
            r5.f59097 = r1
        Ld:
            boolean r1 = r0.m8249()
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r0.f8240
            l.ۘۤ֨ r1 = (l.C3872) r1
            l.ۖܶ۠ r0 = r0.f8241
            if (r6 == 0) goto L25
            l.ۚۚ۠ r2 = r1.f12387
            l.ᩴۚ۠ r3 = l.EnumC18550.f57530
            boolean r2 = r2.m14709(r3)
            if (r2 != 0) goto L36
        L25:
            l.ۤۤ֨ r2 = r5.f67359
            l.᩹ܶ۠ r2 = l.C10222.m25657(r2)
            l.ۚۚ۠ r3 = r1.f12387
            r3.getClass()
            boolean r2 = r2.m50116(r3)
            if (r2 == 0) goto L38
        L36:
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            l.ۚۚ۠ r3 = r1.f12387
            l.C12171.m29639(r3, r2)
            if (r6 == 0) goto Ld
            boolean r2 = r5.f67354
            if (r2 == 0) goto Ld
            boolean r2 = r1 instanceof l.C6694
            l.C12171.m29642(r2)
            r2 = r1
            l.ۜۤ֨ r2 = (l.C6694) r2
            l.۠֨۠ r2 = r2.f20802
            l.۠֨۠ r3 = r5.f67361
            r3.m20940(r2)
            int r2 = r5.f67360
        L55:
            int r3 = r5.f67365
            if (r2 >= r3) goto Ld
            l.ۚۚ۠ r3 = r1.f12387
            r3.getClass()
            l.ۢۚ۠[] r4 = r5.f67353
            r4 = r4[r2]
            l.۫֡֨ r4 = r4.f28489
            r5.m47603(r3, r4)
            int r2 = r2 + 1
            goto L55
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20806.m47601(boolean):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47609(C9378 c9378) {
        this.f67361.m20945(c9378.f28489.f36038);
        this.f67351.m20936(c9378.f28489.f36038);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public void mo1392(C9378 c9378) {
        C4824 c4824;
        C4824 c48242;
        EnumC1296 enumC1296;
        C10222 c10222 = this.f67359;
        c4824 = c10222.f30708;
        c48242 = c10222.f30708;
        c10222.f30708 = c48242.m14053(c9378.f28489);
        try {
            boolean mo35862 = mo35862(c9378.f28489);
            if (mo35862 && ((enumC1296 = c9378.f28489.f17561.f17559) == EnumC1296.f4571 || enumC1296 == EnumC1296.f4567)) {
                m47611(c9378);
            }
            AbstractC12612 abstractC12612 = c9378.f28487;
            if (abstractC12612 != null) {
                m47610(abstractC12612);
                if (mo35862) {
                    m47605((AbstractC5144) c9378, c9378.f28489);
                }
            }
        } finally {
            c10222.f30708 = c4824;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        int i = this.f67365;
        m33860(c2735.f8521);
        this.f67365 = i;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        C22364 c22364;
        C7841 c7841;
        C22364 c223642;
        C7841 c78412;
        C18837 c18837 = this.f59097;
        EnumC1049 enumC1049 = this.f67362;
        this.f67362 = EnumC1049.NORMAL;
        C7841 c78413 = new C7841(true);
        C7841 c78414 = new C7841(true);
        this.f59097 = new C18837();
        C10222 c10222 = this.f67359;
        c22364 = c10222.f30706;
        int i = c22364.f72454;
        while (true) {
            c7841 = this.f67351;
            C7841 c78415 = new C7841(c7841);
            c78415.m20939(this.f67365);
            super.mo10758(c20374.f65770);
            m43307(c20374);
            m47614(c20374.f65771);
            if (!this.f67362.m3617()) {
                c78413.m20940(this.f67358);
                c78414.m20940(this.f67363);
            }
            c223642 = c10222.f30706;
            int i2 = c223642.f72454;
            c78412 = this.f67361;
            if (i2 != i || this.f67362.m3617()) {
                break;
            }
            C7841 c78416 = new C7841(c78415);
            C7841 c78417 = this.f67364;
            c78416.m20946(c78417);
            if (c78416.m20947(this.f67360) == -1) {
                break;
            }
            c78412.m20940(this.f67366);
            c78415.m20938(c78417);
            c7841.m20940(c78415);
            this.f67362 = EnumC1049.SPECULATIVE_LOOP;
        }
        this.f67362 = enumC1049;
        c78412.m20940(c78413);
        c7841.m20940(c78414);
        m43303(c20374, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        C22364 c22364;
        C7841 c7841;
        C22364 c223642;
        C18837 c18837 = this.f59097;
        EnumC1049 enumC1049 = this.f67362;
        this.f67362 = EnumC1049.NORMAL;
        C7841 c78412 = new C7841(true);
        C7841 c78413 = new C7841(true);
        this.f59097 = new C18837();
        C10222 c10222 = this.f67359;
        c22364 = c10222.f30706;
        int i = c22364.f72454;
        C7841 c78414 = this.f67351;
        C7841 c78415 = new C7841(c78414);
        c78415.m20939(this.f67365);
        while (true) {
            m47614(c8672.f26445);
            if (!this.f67362.m3617()) {
                c78412.m20940(this.f67358);
                c78413.m20940(this.f67363);
            }
            C7841 c78416 = this.f67366;
            c7841 = this.f67361;
            c7841.m20940(c78416);
            c78414.m20940(this.f67364);
            super.mo10758(c8672.f26444);
            m43307(c8672);
            c223642 = c10222.f30706;
            if (c223642.f72454 != i || this.f67362.m3617()) {
                break;
            }
            C7841 c78417 = new C7841(c78415);
            c78417.m20946(c78414);
            if (c78417.m20947(this.f67360) == -1) {
                break;
            }
            c78415.m20938(c78414);
            c78414.m20940(c78415);
            this.f67362 = EnumC1049.SPECULATIVE_LOOP;
        }
        this.f67362 = enumC1049;
        c7841.m20940(c78412);
        c78414.m20940(c78413);
        m43303(c8672, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        C22364 c22364;
        C7841 c7841;
        C7841 c78412;
        C22364 c223642;
        C18837 c18837 = this.f59097;
        EnumC1049 enumC1049 = this.f67362;
        this.f67362 = EnumC1049.NORMAL;
        int i = this.f67365;
        m33860(c11907.f35587);
        C7841 c78413 = new C7841(true);
        C7841 c78414 = new C7841(true);
        this.f59097 = new C18837();
        C10222 c10222 = this.f67359;
        c22364 = c10222.f30706;
        int i2 = c22364.f72454;
        while (true) {
            c7841 = this.f67351;
            C7841 c78415 = new C7841(c7841);
            c78415.m20939(this.f67365);
            AbstractC12612 abstractC12612 = c11907.f35588;
            c78412 = this.f67361;
            if (abstractC12612 != null) {
                m47614(abstractC12612);
                if (!this.f67362.m3617()) {
                    c78413.m20940(this.f67358);
                    c78414.m20940(this.f67363);
                }
                c78412.m20940(this.f67366);
                c7841.m20940(this.f67364);
            } else if (!this.f67362.m3617()) {
                c78413.m20940(c78412);
                c78413.m20937(this.f67360, this.f67365);
                c78414.m20940(c7841);
                c78414.m20937(this.f67360, this.f67365);
            }
            super.mo10758(c11907.f35585);
            m43307(c11907);
            m33860(c11907.f35586);
            c223642 = c10222.f30706;
            if (c223642.f72454 != i2 || this.f67362.m3617()) {
                break;
            }
            C7841 c78416 = new C7841(c78415);
            c78416.m20946(c7841);
            if (c78416.m20947(this.f67360) == -1) {
                break;
            }
            c78415.m20938(c7841);
            c7841.m20940(c78415);
            this.f67362 = EnumC1049.SPECULATIVE_LOOP;
        }
        this.f67362 = enumC1049;
        c78412.m20940(c78413);
        c7841.m20940(c78414);
        m43303(c11907, c18837);
        this.f67365 = i;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        C22364 c22364;
        C22364 c223642;
        mo1392(c4851.f15325);
        C18837 c18837 = this.f59097;
        EnumC1049 enumC1049 = this.f67362;
        this.f67362 = EnumC1049.NORMAL;
        int i = this.f67365;
        super.mo10758(c4851.f15326);
        C7841 c7841 = this.f67361;
        C7841 c78412 = new C7841(c7841);
        C7841 c78413 = this.f67351;
        C7841 c78414 = new C7841(c78413);
        m47605((AbstractC5144) c4851, c4851.f15325.f28489);
        this.f59097 = new C18837();
        C10222 c10222 = this.f67359;
        c22364 = c10222.f30706;
        int i2 = c22364.f72454;
        while (true) {
            C7841 c78415 = new C7841(c78413);
            c78415.m20939(this.f67365);
            super.mo10758(c4851.f15324);
            m43307(c4851);
            c223642 = c10222.f30706;
            if (c223642.f72454 != i2 || this.f67362.m3617()) {
                break;
            }
            C7841 c78416 = new C7841(c78415);
            c78416.m20946(c78413);
            if (c78416.m20947(this.f67360) == -1) {
                break;
            }
            c78415.m20938(c78413);
            c78413.m20940(c78415);
            this.f67362 = EnumC1049.SPECULATIVE_LOOP;
        }
        this.f67362 = enumC1049;
        c7841.m20940(c78412);
        c78414.m20938(c78413);
        c78413.m20940(c78414);
        m43303(c4851, c18837);
        this.f67365 = i;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        super.mo10758(c17698.f54159);
        m43303(c17698, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        m47599(c22637, c22637.f73103, c22637.f73102, c22637.f73105);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        m47599(c13464, c13464.f40197, c13464.f40199, c13464.f40196);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47599(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612, C2609 c2609, boolean z) {
        C17013 c17013;
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        int i = this.f67365;
        m47610(abstractC12612);
        C7841 c7841 = this.f67361;
        C7841 c78412 = new C7841(c7841);
        C7841 c78413 = this.f67351;
        C7841 c78414 = new C7841(c78413);
        while (c2609.m8249()) {
            c7841.m20940(c78412);
            c78413.m20938(c78414);
            c78413.m20940(c78413);
            C18963 c18963 = (C18963) c2609.f8240;
            Iterator it = c18963.f59815.iterator();
            while (it.hasNext()) {
                super.mo10758((AbstractC19669) it.next());
                if (c7841.m20941()) {
                    c7841.m20940(this.f67366);
                    c78413.m20940(this.f67364);
                }
            }
            if (((C18963) c2609.f8240).f59814.isEmpty() && c2609.f8241.m8249() && ((C18963) c2609.f8241.f8240).f59815.m8245() == 1 && ((AbstractC19669) ((C18963) c2609.f8241.f8240).f59815.f8240).mo30871() && C7260.m19429((AbstractC5144) ((C18963) c2609.f8241.f8240).f59815.f8240)) {
                c2609 = c2609.f8241;
                c18963 = (C18963) c2609.f8240;
            }
            m33860(c18963.f59814);
            if (c18963.f59816 && c18963.f59817 == C18963.f59811) {
                c17013 = this.f67359.f30711;
                m43305(abstractC5144, c17013);
            }
            for (C2609 c26092 = c18963.f59814; c26092.m8249(); c26092 = c26092.f8241) {
                AbstractC5144 abstractC51442 = (AbstractC5144) c26092.f8240;
                if (abstractC51442.m14709(EnumC18550.f57578)) {
                    int i2 = ((C9378) abstractC51442).f28489.f36038;
                    c78412.m20936(i2);
                    c78414.m20945(i2);
                }
            }
            c2609 = c2609.f8241;
        }
        if (!z) {
            if (abstractC5144.m14709(EnumC18550.f57555)) {
                mo15215();
            } else {
                c7841.m20940(c78412);
                c78413.m20938(c78414);
                c78413.m20940(c78413);
            }
        }
        if (abstractC5144.m14709(EnumC18550.f57555)) {
            m43306(abstractC5144, c18837);
        } else {
            m43303(abstractC5144, c18837);
        }
        this.f67365 = i;
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        C4824 c4824;
        Iterator it;
        C7841 c7841;
        C18837 c18837;
        C10222 c10222;
        C22364 c22364;
        C18837 c188372 = new C18837();
        C7841 c78412 = this.f67352;
        C7841 c78413 = new C7841(c78412);
        C18837 c188373 = this.f59097;
        this.f59097 = new C18837();
        C7841 c78414 = this.f67361;
        C7841 c78415 = new C7841(c78414);
        C7841 c78416 = this.f67351;
        c78412.m20940(c78416);
        Iterator it2 = c10789.f32446.iterator();
        while (it2.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it2.next();
            if (abstractC5144 instanceof C9378) {
                C9378 c9378 = (C9378) abstractC5144;
                mo1392(c9378);
                this.f67350.mo26382(c9378.f28489);
                c188372.m43511(c9378);
            } else {
                if (!(abstractC5144 instanceof AbstractC12612)) {
                    throw new AssertionError(c10789);
                }
                m47610((AbstractC12612) abstractC5144);
            }
        }
        super.mo10758(c10789.f32445);
        c78412.m20938(c78416);
        C7841 c78417 = new C7841(c78414);
        C7841 c78418 = new C7841(c78416);
        int i = this.f67365;
        if (!c188372.isEmpty()) {
            C10222 c102222 = this.f67359;
            c4824 = c102222.f30708;
            if (c4824.m14055(EnumC20347.TRY)) {
                Iterator it3 = c188372.iterator();
                while (it3.hasNext()) {
                    C9378 c93782 = (C9378) it3.next();
                    if (this.f67350.mo20482(c93782.f28489)) {
                        c22364 = c102222.f30706;
                        EnumC20347 enumC20347 = EnumC20347.TRY;
                        it = it3;
                        C12048 c12048 = c93782.f28489;
                        C11076 c11076 = C14001.f42334;
                        c10222 = c102222;
                        c7841 = c78413;
                        c18837 = c188373;
                        c22364.m7286(enumC20347, c93782, new C11076("compiler", "try.resource.not.referenced", c12048));
                        this.f67350.mo26384(c93782.f28489);
                    } else {
                        it = it3;
                        c7841 = c78413;
                        c18837 = c188373;
                        c10222 = c102222;
                    }
                    it3 = it;
                    c78413 = c7841;
                    c102222 = c10222;
                    c188373 = c18837;
                }
            }
        }
        C7841 c78419 = c78413;
        C18837 c188374 = c188373;
        C7841 c784110 = new C7841(c78415);
        C7841 c784111 = new C7841(c78412);
        for (C2609 c2609 = c10789.f32449; c2609.m8249(); c2609 = c2609.f8241) {
            C9378 c93783 = ((C0617) c2609.f8240).f2373;
            c78414.m20940(c784110);
            c78416.m20940(c784111);
            super.mo10758((AbstractC5144) c93783);
            m47609(c93783);
            super.mo10758(((C0617) c2609.f8240).f2372);
            c78417.m20938(c78414);
            c78418.m20938(c78416);
            this.f67365 = i;
        }
        if (c10789.f32448 != null) {
            c78414.m20940(c78415);
            c78416.m20940(c78412);
            C18837 c188375 = this.f59097;
            this.f59097 = c188374;
            super.mo10758(c10789.f32448);
            if (c10789.f32447) {
                c78416.m20938(c78418);
                while (c188375.m43518()) {
                    C3872 c3872 = (C3872) c188375.m43516();
                    if (c3872 instanceof C6694) {
                        C6694 c6694 = (C6694) c3872;
                        c6694.f20802.m20948(c78414);
                        c6694.f20803.m20938(c78416);
                    }
                    this.f59097.m43511(c3872);
                }
                c78414.m20948(c78417);
            }
        } else {
            c78414.m20940(c78417);
            c78416.m20940(c78418);
            C18837 c188376 = this.f59097;
            this.f59097 = c188374;
            while (c188376.m43518()) {
                this.f59097.m43511((C3872) c188376.m43516());
            }
        }
        c78412.m20938(c78419);
        c78412.m20938(c78416);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        m47614(c8379.f25701);
        C7841 c7841 = this.f67358;
        C7841 c78412 = new C7841(c7841);
        C7841 c78413 = this.f67363;
        C7841 c78414 = new C7841(c78413);
        C7841 c78415 = this.f67361;
        C7841 c78416 = this.f67366;
        c78415.m20940(c78416);
        C7841 c78417 = this.f67351;
        C7841 c78418 = this.f67364;
        c78417.m20940(c78418);
        AbstractC4308 abstractC4308 = c8379.f25699.f16086;
        EnumC9454 enumC9454 = EnumC9454.BOOLEAN;
        if (abstractC4308.m12913(enumC9454) && c8379.f25700.f16086.m12913(enumC9454)) {
            m47614(c8379.f25699);
            C7841 c78419 = new C7841(c78416);
            C7841 c784110 = new C7841(c7841);
            C7841 c784111 = new C7841(c78418);
            C7841 c784112 = new C7841(c78413);
            c78415.m20940(c78412);
            c78417.m20940(c78414);
            m47614(c8379.f25700);
            c78416.m20938(c78419);
            c7841.m20938(c784110);
            c78418.m20938(c784111);
            c78413.m20938(c784112);
            return;
        }
        m47610(c8379.f25699);
        C7841 c784113 = new C7841(c78415);
        C7841 c784114 = new C7841(c78417);
        c78415.m20940(c78412);
        c78417.m20940(c78414);
        m47610(c8379.f25700);
        c78415.m20938(c784113);
        c78417.m20938(c784114);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        m47614(c1470.f5225);
        C7841 c7841 = new C7841(this.f67358);
        C7841 c78412 = new C7841(this.f67363);
        C7841 c78413 = this.f67366;
        C7841 c78414 = this.f67361;
        c78414.m20940(c78413);
        C7841 c78415 = this.f67364;
        C7841 c78416 = this.f67351;
        c78416.m20940(c78415);
        super.mo10758(c1470.f5226);
        if (c1470.f5227 != null) {
            C7841 c78417 = new C7841(c78414);
            C7841 c78418 = new C7841(c78416);
            c78414.m20940(c7841);
            c78416.m20940(c78412);
            super.mo10758(c1470.f5227);
            c78414.m20938(c78417);
            c78416.m20938(c78418);
            return;
        }
        c78414.m20938(c7841);
        c78416.m20938(c78412);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        m43304(new C6694(c4146, this.f67361, this.f67351));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        C13464 c13464 = (C13464) c2322.f7455;
        if (c13464 != null && c13464.f16086.m12913(EnumC9454.BOOLEAN)) {
            m47614(c2322.f7456);
            C23627 c23627 = new C23627(this, c2322, new C7841(this.f67366), new C7841(this.f67358), new C7841(this.f67364), new C7841(this.f67363));
            m47613();
            m43304(c23627);
            return;
        }
        m47610(c2322.f7456);
        m43304(new C6694(c2322, this.f67361, this.f67351));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        m43304(new C6694(c15433, this.f67361, this.f67351));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        m47610(c9938.f30017);
        m43304(new C6694(c9938, this.f67361, this.f67351));
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        m47610(c1616.f5680);
        mo15215();
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        m47610(c15580.f48011);
        m47608(c15580.f48012);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        m47610(c19110.f60199);
        m47608(c19110.f60197);
        super.mo10758(c19110.f60195);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public void mo1217(C14169 c14169) {
        C7841 c7841 = this.f67351;
        C7841 c78412 = new C7841(c7841);
        C7841 c78413 = this.f67361;
        C7841 c78414 = new C7841(c78413);
        int i = this.f67356;
        int i2 = this.f67365;
        C18837 c18837 = this.f59097;
        try {
            this.f67356 = i2;
            this.f59097 = new C18837();
            for (C2609 c2609 = c14169.f42775; c2609.m8249(); c2609 = c2609.f8241) {
                C9378 c9378 = (C9378) c2609.f8240;
                super.mo10758((AbstractC5144) c9378);
                c78413.m20945(c9378.f28489.f36038);
                c7841.m20936(c9378.f28489.f36038);
            }
            if (c14169.m33819() != EnumC13706.EXPRESSION) {
                super.mo10758(c14169.f42776);
            } else {
                m47610(c14169.f42776);
            }
        } finally {
            this.f67356 = i;
            c7841.m20940(c78412);
            c78413.m20940(c78414);
            this.f59097 = c18837;
            this.f67365 = i2;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        m47608(c18404.f57140);
        m47608(c18404.f57139);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1383(C6968 c6968) {
        C7841 c7841 = this.f67361;
        C7841 c78412 = new C7841(c7841);
        C7841 c78413 = this.f67351;
        C7841 c78414 = new C7841(c78413);
        m47614(c6968.f21475);
        c78414.m20938(this.f67364);
        if (c6968.f21476 != null) {
            c7841.m20940(this.f67358);
            c78413.m20940(this.f67363);
            m47610(c6968.f21476);
        }
        c7841.m20940(c78412);
        c78413.m20940(c78414);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        if (!C7260.m19468(c21080.f67987)) {
            m47610(c21080.f67987);
        }
        m47610(c21080.f67988);
        m47615(c21080.f67987);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        m47610(c9791.f29619);
        m47610(c9791.f29618);
        m47615(c9791.f29619);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        int i = C10928.f32841[c6555.mo989().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                m47610(c6555.f20226);
                m47615(c6555.f20226);
                return;
            } else {
                m47610(c6555.f20226);
                return;
            }
        }
        m47614(c6555.f20226);
        C7841 c7841 = this.f67358;
        C7841 c78412 = new C7841(c7841);
        C7841 c78413 = this.f67366;
        c7841.m20940(c78413);
        c78413.m20940(c78412);
        C7841 c78414 = this.f67363;
        c78412.m20940(c78414);
        C7841 c78415 = this.f67364;
        c78414.m20940(c78415);
        c78415.m20940(c78412);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        int i = C10928.f32841[c9085.mo989().ordinal()];
        C7841 c7841 = this.f67351;
        C7841 c78412 = this.f67361;
        C7841 c78413 = this.f67363;
        C7841 c78414 = this.f67358;
        C7841 c78415 = this.f67364;
        C7841 c78416 = this.f67366;
        if (i == 6) {
            m47614(c9085.f27533);
            C7841 c78417 = new C7841(c78414);
            C7841 c78418 = new C7841(c78413);
            c78412.m20940(c78416);
            c7841.m20940(c78415);
            m47614(c9085.f27532);
            c78414.m20938(c78417);
            c78413.m20938(c78418);
            return;
        }
        if (i == 7) {
            m47614(c9085.f27533);
            C7841 c78419 = new C7841(c78416);
            C7841 c784110 = new C7841(c78415);
            c78412.m20940(c78414);
            c7841.m20940(c78413);
            m47614(c9085.f27532);
            c78416.m20938(c78419);
            c78415.m20938(c784110);
            return;
        }
        m47610(c9085.f27533);
        m47610(c9085.f27532);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        AbstractC5698 abstractC5698 = c7673.f23697;
        if (abstractC5698.f17559 == EnumC1296.f4567) {
            m47603((InterfaceC3109) c7673, (C12048) abstractC5698);
            this.f67350.mo26384(c7673.f23697);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        c18257.f56779.mo988(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m47602(l.C1755 r20, l.AbstractC5144 r21, l.C17013 r22) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20806.m47602(l.֫ۤ֨, l.ۚۚ۠, l.ܿ֨۠):void");
    }

    public C20806(C10222 c10222) {
        this.f67359 = c10222;
    }
}
