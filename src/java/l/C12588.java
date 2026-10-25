package l;

/* compiled from: K8D0 */
/* renamed from: l.۫ᩴۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12588 extends AbstractC14725 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public double f37958;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C8355 f37959;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C8355 f37960;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f37961;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public EnumC13293 f37962;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8355 f37963;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8355 f37964;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f37965;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8355 f37966;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public double f37967;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C8355 f37968;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C8355 f37969;

    public C12588() {
        C0593 c0593 = new C0593();
        this.f44972 = c0593;
        m52649(c0593);
        C15409 c15409 = new C15409(0);
        this.f44973 = c15409;
        m52649(c15409);
        this.f37962 = EnumC13293.IDLE;
        this.f37958 = 1.0d;
        C8355 c8355 = new C8355(1, "Delay", 0.0d);
        this.f37966 = c8355;
        m52649(c8355);
        c8355.m21953(0.0d, 0.0d, 2.0d);
        C8355 c83552 = new C8355(1, "Attack", 0.1d);
        this.f37969 = c83552;
        m52649(c83552);
        c83552.m21953(0.01d, 0.1d, 8.0d);
        C8355 c83553 = new C8355(1, "Hold", 0.0d);
        this.f37960 = c83553;
        m52649(c83553);
        c83553.m21953(0.0d, 0.0d, 2.0d);
        C8355 c83554 = new C8355(1, "Decay", 0.2d);
        this.f37964 = c83554;
        m52649(c83554);
        c83554.m21953(0.01d, 0.2d, 8.0d);
        C8355 c83555 = new C8355(1, "Sustain", 0.5d);
        this.f37959 = c83555;
        m52649(c83555);
        c83555.m21953(0.0d, 0.5d, 1.0d);
        C8355 c83556 = new C8355(1, "Release", 0.3d);
        this.f37968 = c83556;
        m52649(c83556);
        c83556.m21953(0.01d, 0.3d, 8.0d);
        C8355 c83557 = new C8355(1, "Amplitude", 1.0d);
        this.f37963 = c83557;
        m52649(c83557);
    }

    @Override // l.AbstractC23898
    /* renamed from: ۧ */
    public final void mo6591() {
        double[] m38021 = this.f37959.m38021();
        double[] m380212 = this.f37963.m38021();
        double[] m380213 = this.f44973.m38021();
        int i = 0;
        while (i < 8) {
            C0593 c0593 = this.f44972;
            boolean m2453 = c0593.m2453(i);
            switch (C3416.f10790[this.f37962.ordinal()]) {
                case 1:
                    while (true) {
                        if (i < 8) {
                            m380213[i] = this.f37967 * m380212[i];
                            if (m2453) {
                                m30855(i);
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            continue;
                        }
                    }
                case 2:
                    while (true) {
                        if (i < 8) {
                            m380213[i] = this.f37967 * m380212[i];
                            if (c0593.m2449()) {
                                m30852(i);
                                break;
                            } else {
                                double d = this.f37965 - 1.0d;
                                this.f37965 = d;
                                if (d <= 0.0d) {
                                    m30851(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                case 3:
                    while (true) {
                        if (i < 8) {
                            double d2 = this.f37967 + this.f37961;
                            this.f37967 = d2;
                            if (d2 >= 1.0d) {
                                this.f37967 = 1.0d;
                                m380213[i] = 1.0d * m380212[i];
                                m30854(i);
                                break;
                            } else {
                                m380213[i] = d2 * m380212[i];
                                if (c0593.m2449()) {
                                    m30852(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                case 4:
                    while (true) {
                        if (i < 8) {
                            m380213[i] = m380212[i];
                            double d3 = this.f37965 - 1.0d;
                            this.f37965 = d3;
                            if (d3 <= 0.0d) {
                                m30853(i);
                                break;
                            } else if (c0593.m2449()) {
                                m30852(i);
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            continue;
                        }
                    }
                case 5:
                    while (true) {
                        if (i < 8) {
                            double d4 = this.f37967;
                            m380213[i] = m380212[i] * d4;
                            double d5 = d4 * this.f37958;
                            this.f37967 = d5;
                            if (m2453) {
                                m30855(i);
                                break;
                            } else {
                                double d6 = m38021[i];
                                if (d5 < d6) {
                                    this.f37967 = d6;
                                    this.f37962 = EnumC13293.SUSTAINING;
                                    break;
                                } else if (d5 < 1.5848931924611107E-5d) {
                                    c0593.m2450();
                                    break;
                                } else if (c0593.m2449()) {
                                    m30852(i);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    while (true) {
                        if (i < 8) {
                            double d7 = m38021[i];
                            this.f37967 = d7;
                            m380213[i] = d7 * m380212[i];
                            if (m2453) {
                                m30855(i);
                                break;
                            } else if (c0593.m2449()) {
                                m30852(i);
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            continue;
                        }
                    }
                case 7:
                    while (true) {
                        if (i < 8) {
                            double d8 = this.f37967;
                            m380213[i] = m380212[i] * d8;
                            double d9 = d8 * this.f37958;
                            this.f37967 = d9;
                            if (m2453) {
                                m30855(i);
                                break;
                            } else if (d9 < 1.5848931924611107E-5d) {
                                c0593.m2450();
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    break;
            }
            this.f37962 = EnumC13293.IDLE;
            this.f37967 = 0.0d;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m30855(int i) {
        if (this.f37966.m38021()[i] <= 0.0d) {
            m30851(i);
        } else {
            this.f37965 = (int) (r1 * this.f77261.m19315());
            this.f37962 = EnumC13293.DELAYING;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30851(int i) {
        double d = this.f37969.m38021()[i];
        if (d < 1.0E-5d) {
            this.f37967 = 1.0d;
            m30854(i);
        } else {
            this.f37961 = this.f77261.m19313() / d;
            this.f37962 = EnumC13293.ATTACKING;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m30854(int i) {
        if (this.f37960.m38021()[i] <= 0.0d) {
            m30853(i);
        } else {
            this.f37965 = (int) (r1 * this.f77261.m19315());
            this.f37962 = EnumC13293.HOLDING;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m30853(int i) {
        double d = this.f37964.m38021()[i];
        if (d >= 1.0E-5d) {
            this.f37958 = this.f77261.m19304(d);
            this.f37962 = EnumC13293.DECAYING;
        } else {
            this.f37962 = EnumC13293.SUSTAINING;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m30852(int i) {
        double d = this.f37968.m38021()[i];
        if (d < 1.0E-5d) {
            d = 1.0E-5d;
        }
        this.f37958 = this.f77261.m19304(d);
        this.f37962 = EnumC13293.RELEASING;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30856(C4827 c4827, String str) {
        StringBuilder m15339 = C5368.m15339(str);
        C8355 c8355 = this.f37969;
        m15339.append(c8355.m49083());
        c4827.m52648(c8355, m15339.toString());
        StringBuilder m153392 = C5368.m15339(str);
        C8355 c83552 = this.f37964;
        m153392.append(c83552.m49083());
        c4827.m52648(c83552, m153392.toString());
        StringBuilder m153393 = C5368.m15339(str);
        C8355 c83553 = this.f37959;
        m153393.append(c83553.m49083());
        c4827.m52648(c83553, m153393.toString());
        StringBuilder m153394 = C5368.m15339(str);
        C8355 c83554 = this.f37968;
        m153394.append(c83554.m49083());
        c4827.m52648(c83554, m153394.toString());
    }
}
