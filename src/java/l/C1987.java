package l;

/* compiled from: A7MK */
/* renamed from: l.֫ᩳ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1987 extends C23363 {

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C4314 f6647 = new C4314();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20661 f6648;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC10892 f6649;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C17013 f6650;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23168 f6651;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10139 f6652;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9310 f6653;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22406 f6655;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6319 f6659;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6136 f6660;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1755 f6661;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC13938 f6656 = new C12528();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14163 f6658 = null;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3581 f6657 = null;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C12048 f6654 = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC8090 m6502(C1987 c1987, AbstractC4308 abstractC4308, AbstractC19669 abstractC19669) {
        C6319 c6319 = c1987.f6659;
        if (abstractC19669.mo30872()) {
            AbstractC4308 m17519 = c6319.m17519(C7260.m19457((AbstractC21932) abstractC19669).m25340());
            boolean mo12941 = m17519.mo12941();
            AbstractC4308 abstractC43082 = m17519;
            if (mo12941) {
                abstractC43082 = c6319.m17496(m17519).f17560;
            }
            return c6319.m17546(abstractC4308, abstractC43082, true) ? (InterfaceC8090) abstractC4308 : (InterfaceC8090) abstractC43082;
        }
        if (!abstractC19669.mo30871() || C7260.m19429((AbstractC12612) abstractC19669)) {
            return null;
        }
        AbstractC4308 abstractC43083 = abstractC19669.f16086;
        if ((abstractC43083.f13890.f17563 & 16384) != 0) {
            return C5268.m15194(((C7673) abstractC19669).f23696.toString());
        }
        C12171.m29637(abstractC43083.mo12915());
        int i = C6178.f18975[abstractC19669.f16086.mo3258().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return C5268.m15193(((Integer) abstractC19669.f16086.mo12915()).intValue());
        }
        if (i == 5) {
            return C5268.m15194((String) abstractC19669.f16086.mo12915());
        }
        throw new AssertionError();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1987 m6500(C2903 c2903) {
        C1987 c1987 = (C1987) c2903.m8838(f6647);
        return c1987 == null ? new C1987(c2903) : c1987;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1410(C16286 c16286) {
        AbstractC4308 abstractC4308;
        if (c16286.f50076 instanceof AbstractC21932) {
            boolean m12913 = c16286.f50075.f16086.m12913(EnumC9454.BOT);
            C20661 c20661 = this.f6648;
            if (m12913) {
                abstractC4308 = c20661.f66526;
            } else {
                abstractC4308 = c16286.f50075.f16086;
            }
            AbstractC4308 abstractC43082 = abstractC4308;
            C12048 c12048 = this.f6654;
            this.f6656 = new C23111(this);
            try {
                AbstractC12612 abstractC12612 = (AbstractC12612) mo23617(c16286.f50075);
                AbstractC5698 m19472 = C7260.m19472(abstractC12612);
                if (m19472 != null && m19472.f17559 == EnumC1296.f4567 && m19472.f17561.f17559.m4391(C15406.f47185)) {
                    this.f6654 = (C12048) m19472;
                } else {
                    this.f6654 = new C12048(4112L, this.f6660.f18880.m30652("patt" + c16286.f16085 + this.f6649.m27204() + "temp"), abstractC43082, this.f6657);
                }
                AbstractC21932 abstractC21932 = (AbstractC21932) c16286.f50076;
                C6319 c6319 = this.f6659;
                AbstractC4308 m17519 = c6319.m17519(C7260.m19457(abstractC21932).m25340());
                if (m17519.mo12941()) {
                    m17519 = c6319.m17496(m17519).f17560;
                }
                EnumC18550 enumC18550 = EnumC18550.f57565;
                C7673 m39914 = this.f6650.m39914((AbstractC5698) this.f6654);
                AbstractC12612 m39965 = this.f6650.m39965(m17519);
                C17013 c17013 = this.f6650;
                c17013.getClass();
                C16286 c162862 = new C16286();
                c162862.f50075 = m39914;
                c162862.f50076 = m39965;
                c162862.f16085 = c17013.f52172;
                c162862.f16086 = c20661.f66469;
                AbstractC12612 abstractC126122 = (AbstractC12612) mo23617(c16286.f50076);
                C9085 m39919 = this.f6650.m39919(enumC18550, (AbstractC12612) c162862, abstractC126122);
                C0758 m25477 = this.f6652.m25477(m39919, enumC18550, c162862.f16086, abstractC126122.f16086);
                m39919.f2830 = m25477;
                m39919.f16086 = m25477.f17560.mo12923();
                C12048 c120482 = this.f6654;
                C9085 c9085 = m39919;
                if (c120482 != m19472) {
                    C17013 c170132 = this.f6650;
                    c170132.f52172 = c16286.f16085;
                    C3733 m39905 = c170132.m39905(c170132.m39923(c120482, abstractC12612), (AbstractC12612) m39919);
                    m39905.f16086 = c20661.f66469;
                    m39905.f11798 = true;
                    c9085 = m39905;
                }
                this.f75051 = this.f6656.mo30734(c9085);
                return;
            } finally {
                this.f6654 = c12048;
                this.f6656.mo30735();
            }
        }
        super.mo1410(c16286);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        C16986 c16986 = (C16986) c16139.f49721.f28489;
        AbstractC4308 m25340 = C7260.m19457((AbstractC21932) c16139).m25340();
        C6319 c6319 = this.f6659;
        AbstractC4308 m17519 = c6319.m17519(m25340);
        if (m17519.mo12941()) {
            m17519 = c6319.m17496(m17519).f17560;
        }
        C12048 mo20342 = this.f6656.mo20342(c16986);
        if (mo20342 != null) {
            C17013 c17013 = this.f6650;
            c17013.f52172 = C7260.m19455(c16139);
            C7673 m39914 = this.f6650.m39914((AbstractC5698) mo20342);
            C7673 m399142 = this.f6650.m39914((AbstractC5698) this.f6654);
            C17013 c170132 = this.f6650;
            c170132.m39946((InterfaceC3109) m399142);
            C17844 m39936 = c170132.m39936((AbstractC5144) this.f6650.m39965(m17519), (AbstractC12612) m399142);
            m39936.f16086 = m17519;
            C21080 m39941 = c17013.m39941((AbstractC12612) m39914, (AbstractC12612) m39936);
            m39941.f16086 = mo20342.mo16091(c6319);
            C17013 c170133 = this.f6650;
            C3733 m39962 = c170133.m39962((AbstractC12612) this.f6650.m39943(Boolean.TRUE), C2609.of((Object) c170133.m39953(m39941)));
            m39962.f11798 = true;
            m39962.f16086 = this.f6648.f66469;
            this.f75051 = m39962;
            return;
        }
        this.f75051 = this.f6650.m39943(Boolean.TRUE);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1424(C21227 c21227) {
        this.f75051 = mo23617(c21227.f68420);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1402(C14022 c14022) {
        AbstractC12612 abstractC12612 = (AbstractC12612) mo23617(c14022.f42404);
        AbstractC12612 abstractC126122 = (AbstractC12612) mo23617(c14022.f42403);
        EnumC18550 enumC18550 = EnumC18550.f57565;
        C9085 m39919 = this.f6650.m39919(enumC18550, abstractC12612, abstractC126122);
        C0758 m25477 = this.f6652.m25477(m39919, enumC18550, abstractC12612.f16086, abstractC126122.f16086);
        m39919.f2830 = m25477;
        m39919.f16086 = m25477.f17560.mo12923();
        this.f75051 = m39919;
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        m6503(c22637, c22637.f73103, c22637.f73102, c22637.f73105, c22637.f73104);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        m6503(c13464, c13464.f40197, c13464.f40199, c13464.f40196, c13464.f40195);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0405  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m6503(l.AbstractC5144 r26, l.AbstractC12612 r27, l.C2609 r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1987.m6503(l.ۚۚ۠, l.۫᩵۠, l.ۖܶ۠, boolean, boolean):void");
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        this.f6656 = new C23111(this);
        try {
            super.mo1390(c9085);
            this.f75051 = this.f6656.mo30734(c9085);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        this.f6656 = new C23111(this);
        try {
            super.mo1387(c8379);
            this.f75051 = this.f6656.mo30734(c8379);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        this.f6656 = new C23111(this);
        try {
            super.mo1368(c1470);
            this.f75051 = this.f6656.mo30733(c1470);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        this.f6656 = new C23111(this);
        try {
            super.mo1397(c11907);
            this.f75051 = this.f6656.mo30733(c11907);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        this.f6656 = new C23111(this);
        try {
            super.mo1389(c8672);
            this.f75051 = this.f6656.mo30733(c8672);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        this.f6656 = new C23111(this);
        try {
            super.mo1421(c20374);
            this.f75051 = this.f6656.mo30733(c20374);
        } finally {
            this.f6656.mo30735();
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C3581 c3581 = this.f6657;
        try {
            this.f6657 = c8526.f26045;
            super.mo1388(c8526);
        } finally {
            this.f6657 = c3581;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        C12048 mo30736 = (c7673.f23697.mo16084() & 576460752303423488L) != 0 ? this.f6656.mo30736((C16986) c7673.f23697) : null;
        if (mo30736 == null) {
            super.mo1385(c7673);
            return;
        }
        C17013 c17013 = this.f6650;
        c17013.f52172 = c7673.f16085;
        this.f75051 = c17013.m39914((AbstractC5698) mo30736);
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        C18837 c18837 = new C18837();
        this.f6656 = new C10412(this, c18837);
        C3581 c3581 = this.f6657;
        if (c3581 == null) {
            try {
                this.f6657 = new C3581(c2735.f8522 | 1048576, this.f6660.f18867, null, this.f6658);
            } finally {
                this.f6657 = c3581;
                this.f6656.mo30735();
            }
        }
        for (C2609 c2609 = c2735.f8521; c2609.m8249(); c2609 = c2609.f8241) {
            c18837.m43511((AbstractC11349) mo23617((AbstractC11349) c2609.f8240));
        }
        c2735.f8521 = c18837.m43517();
        this.f75051 = c2735;
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        AbstractC13938 abstractC13938 = this.f6656;
        try {
            this.f6656 = new C7589(this);
            super.mo1217(c14169);
        } finally {
            this.f6656 = abstractC13938;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C14163 c14163 = this.f6658;
        C3581 c3581 = this.f6657;
        try {
            this.f6658 = c5557.f17186;
            this.f6657 = null;
            super.mo1215(c5557);
        } finally {
            this.f6658 = c14163;
            this.f6657 = c3581;
        }
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C3581 c3581 = this.f6657;
        try {
            c9378.f28486 = (C2176) mo23617(c9378.f28486);
            c9378.f28488 = (AbstractC12612) mo23617(c9378.f28488);
            if (this.f6657 == null) {
                this.f6657 = new C3581((c9378.f28486.f7169 & 8) | 1048576, this.f6660.f18867, null, this.f6658);
            }
            AbstractC12612 abstractC12612 = c9378.f28487;
            if (abstractC12612 != null) {
                c9378.f28487 = (AbstractC12612) mo23617(abstractC12612);
            }
            this.f75051 = c9378;
        } finally {
            this.f6657 = c3581;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5144 m6508(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        try {
            this.f6650 = c17013;
            this.f6661 = c1755;
            mo23617(abstractC5144);
            return abstractC5144;
        } finally {
            this.f6650 = null;
            this.f6661 = null;
        }
    }

    public C1987(C2903 c2903) {
        c2903.m8841(f6647, this);
        this.f6648 = C20661.m47250(c2903);
        this.f6653 = C9310.m23901(c2903);
        this.f6655 = C22406.m50289(c2903);
        this.f6650 = C17013.m39896(c2903);
        this.f6659 = C6319.m17456(c2903);
        this.f6652 = C10139.m25473(c2903);
        this.f6660 = C6136.m17057(c2903);
        this.f6649 = EnumC10892.m27201(c2903);
        this.f6651 = C23168.m51341(c2903);
        C11781.m28823(c2903).m28831("debug.patterns");
    }
}
