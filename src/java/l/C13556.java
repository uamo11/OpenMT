package l;

import java.util.Map;

/* compiled from: N673 */
/* renamed from: l.ܰۗᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13556 implements InterfaceC10030 {
    public static final C22729 f = C22729.f(1, 7);
    public static final C22729 g = C22729.g(0, 4, 6);
    public static final C22729 h = C22729.g(0, 52, 54);
    public static final C22729 i = C22729.g(1, 52, 53);
    public final String a;
    public final C7207 b;
    public final InterfaceC3679 c;
    public final InterfaceC3679 d;
    public final C22729 e;

    @Override // l.InterfaceC10030
    public final boolean isDateBased() {
        return true;
    }

    public final InterfaceC13410 e(InterfaceC2765 interfaceC2765, int i2, int i3, int i4) {
        InterfaceC13410 M = interfaceC2765.M(i2, 1, 1);
        int h2 = h(1, b(M));
        int i5 = i4 - 1;
        return M.d(((Math.min(i3, a(h2, M.Q() + this.b.b) - 1) - 1) * 7) + i5 + (-h2), (InterfaceC3679) EnumC8618.DAYS);
    }

    public C13556(String str, C7207 c7207, InterfaceC3679 interfaceC3679, InterfaceC3679 interfaceC36792, C22729 c22729) {
        this.a = str;
        this.b = c7207;
        this.c = interfaceC3679;
        this.d = interfaceC36792;
        this.e = c22729;
    }

    @Override // l.InterfaceC10030
    public final long C(InterfaceC2268 interfaceC2268) {
        int c;
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        InterfaceC3679 interfaceC3679 = this.d;
        if (interfaceC3679 == enumC8618) {
            c = b(interfaceC2268);
        } else if (interfaceC3679 != EnumC8618.MONTHS) {
            if (interfaceC3679 != EnumC8618.YEARS) {
                if (interfaceC3679 == C7207.h) {
                    c = d(interfaceC2268);
                } else if (interfaceC3679 == EnumC8618.FOREVER) {
                    c = c(interfaceC2268);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC3679 + ", this: " + this);
                }
            } else {
                int b = b(interfaceC2268);
                int l2 = interfaceC2268.l(EnumC18496.DAY_OF_YEAR);
                c = a(h(l2, b), l2);
            }
        } else {
            int b2 = b(interfaceC2268);
            int l3 = interfaceC2268.l(EnumC18496.DAY_OF_MONTH);
            c = a(h(l3, b2), l3);
        }
        return c;
    }

    public final int b(InterfaceC2268 interfaceC2268) {
        return AbstractC5796.e(interfaceC2268.l(EnumC18496.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(InterfaceC2268 interfaceC2268) {
        int b = b(interfaceC2268);
        int l2 = interfaceC2268.l(EnumC18496.YEAR);
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_YEAR;
        int l3 = interfaceC2268.l(enumC18496);
        int h2 = h(l3, b);
        int a = a(h2, l3);
        return a == 0 ? l2 - 1 : a >= a(h2, ((int) interfaceC2268.n(enumC18496).d) + this.b.b) ? l2 + 1 : l2;
    }

    public final int d(InterfaceC2268 interfaceC2268) {
        int a;
        int b = b(interfaceC2268);
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_YEAR;
        int l2 = interfaceC2268.l(enumC18496);
        int h2 = h(l2, b);
        int a2 = a(h2, l2);
        if (a2 == 0) {
            return d(AbstractC16169.r(interfaceC2268).E(interfaceC2268).w(l2, EnumC8618.DAYS));
        }
        return (a2 <= 50 || a2 < (a = a(h2, ((int) interfaceC2268.n(enumC18496).d) + this.b.b))) ? a2 : (a2 - a) + 1;
    }

    public final int h(int i2, int i3) {
        int e = AbstractC5796.e(i2 - i3);
        return e + 1 > this.b.b ? 7 - e : -e;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // l.InterfaceC10030
    public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
        if (this.e.a(j, this) == interfaceC15672.l(this)) {
            return interfaceC15672;
        }
        if (this.d != EnumC8618.FOREVER) {
            return interfaceC15672.d(r0 - r1, this.c);
        }
        C7207 c7207 = this.b;
        return e(AbstractC16169.r(interfaceC15672), (int) j, interfaceC15672.l(c7207.e), interfaceC15672.l(c7207.c));
    }

    @Override // l.InterfaceC10030
    public final InterfaceC2268 n(Map map, C16420 c16420, EnumC17126 enumC17126) {
        InterfaceC13410 interfaceC13410;
        InterfaceC13410 interfaceC134102;
        InterfaceC13410 interfaceC134103;
        long longValue = ((Long) map.get(this)).longValue();
        int y = AbstractC22791.y(longValue);
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        C22729 c22729 = this.e;
        C7207 c7207 = this.b;
        InterfaceC3679 interfaceC3679 = this.d;
        if (interfaceC3679 == enumC8618) {
            long e = AbstractC5796.e((c22729.a(longValue, this) - 1) + (c7207.a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(EnumC18496.DAY_OF_WEEK, Long.valueOf(e));
            return null;
        }
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_WEEK;
        if (map.containsKey(enumC18496)) {
            int e2 = AbstractC5796.e(enumC18496.b.a(((Long) map.get(enumC18496)).longValue(), enumC18496) - c7207.a.getValue()) + 1;
            InterfaceC2765 r = AbstractC16169.r(c16420);
            EnumC18496 enumC184962 = EnumC18496.YEAR;
            if (map.containsKey(enumC184962)) {
                int a = enumC184962.b.a(((Long) map.get(enumC184962)).longValue(), enumC184962);
                EnumC8618 enumC86182 = EnumC8618.MONTHS;
                if (interfaceC3679 == enumC86182) {
                    EnumC18496 enumC184963 = EnumC18496.MONTH_OF_YEAR;
                    if (map.containsKey(enumC184963)) {
                        long longValue2 = ((Long) map.get(enumC184963)).longValue();
                        long j = y;
                        if (enumC17126 == EnumC17126.LENIENT) {
                            InterfaceC13410 d = r.M(a, 1, 1).d(AbstractC22791.R(longValue2, 1L), (InterfaceC3679) enumC86182);
                            int b = b(d);
                            int l2 = d.l(EnumC18496.DAY_OF_MONTH);
                            interfaceC134103 = d.d(AbstractC22791.P(AbstractC22791.Q(AbstractC22791.R(j, a(h(l2, b), l2)), 7), e2 - b(d)), (InterfaceC3679) EnumC8618.DAYS);
                        } else {
                            InterfaceC13410 M = r.M(a, enumC184963.b.a(longValue2, enumC184963), 1);
                            long a2 = c22729.a(j, this);
                            int b2 = b(M);
                            int l3 = M.l(EnumC18496.DAY_OF_MONTH);
                            InterfaceC13410 d2 = M.d((((int) (a2 - a(h(l3, b2), l3))) * 7) + (e2 - b(M)), (InterfaceC3679) EnumC8618.DAYS);
                            if (enumC17126 == EnumC17126.STRICT && d2.G(enumC184963) != longValue2) {
                                throw new C16232("Strict mode rejected resolved date as it is in a different month");
                            }
                            interfaceC134103 = d2;
                        }
                        map.remove(this);
                        map.remove(enumC184962);
                        map.remove(enumC184963);
                        map.remove(enumC18496);
                        return interfaceC134103;
                    }
                }
                if (interfaceC3679 == EnumC8618.YEARS) {
                    long j2 = y;
                    InterfaceC13410 M2 = r.M(a, 1, 1);
                    if (enumC17126 == EnumC17126.LENIENT) {
                        int b3 = b(M2);
                        int l4 = M2.l(EnumC18496.DAY_OF_YEAR);
                        interfaceC134102 = M2.d(AbstractC22791.P(AbstractC22791.Q(AbstractC22791.R(j2, a(h(l4, b3), l4)), 7), e2 - b(M2)), (InterfaceC3679) EnumC8618.DAYS);
                    } else {
                        long a3 = c22729.a(j2, this);
                        int b4 = b(M2);
                        int l5 = M2.l(EnumC18496.DAY_OF_YEAR);
                        InterfaceC13410 d3 = M2.d((((int) (a3 - a(h(l5, b4), l5))) * 7) + (e2 - b(M2)), (InterfaceC3679) EnumC8618.DAYS);
                        if (enumC17126 == EnumC17126.STRICT && d3.G(enumC184962) != a) {
                            throw new C16232("Strict mode rejected resolved date as it is in a different year");
                        }
                        interfaceC134102 = d3;
                    }
                    map.remove(this);
                    map.remove(enumC184962);
                    map.remove(enumC18496);
                    return interfaceC134102;
                }
            } else if ((interfaceC3679 == C7207.h || interfaceC3679 == EnumC8618.FOREVER) && map.containsKey(c7207.f) && map.containsKey(c7207.e)) {
                C13556 c13556 = c7207.f;
                int a4 = c13556.e.a(((Long) map.get(c13556)).longValue(), c7207.f);
                if (enumC17126 == EnumC17126.LENIENT) {
                    interfaceC13410 = e(r, a4, 1, e2).d(AbstractC22791.R(((Long) map.get(c7207.e)).longValue(), 1L), (InterfaceC3679) enumC8618);
                } else {
                    C13556 c135562 = c7207.e;
                    InterfaceC13410 e3 = e(r, a4, c135562.e.a(((Long) map.get(c135562)).longValue(), c7207.e), e2);
                    if (enumC17126 == EnumC17126.STRICT && c(e3) != a4) {
                        throw new C16232("Strict mode rejected resolved date as it is in a different week-based-year");
                    }
                    interfaceC13410 = e3;
                }
                map.remove(this);
                map.remove(c7207.f);
                map.remove(c7207.e);
                map.remove(enumC18496);
                return interfaceC13410;
            }
        }
        return null;
    }

    @Override // l.InterfaceC10030
    public final C22729 s() {
        return this.e;
    }

    @Override // l.InterfaceC10030
    public final boolean l(InterfaceC2268 interfaceC2268) {
        if (!interfaceC2268.e(EnumC18496.DAY_OF_WEEK)) {
            return false;
        }
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        InterfaceC3679 interfaceC3679 = this.d;
        if (interfaceC3679 == enumC8618) {
            return true;
        }
        if (interfaceC3679 == EnumC8618.MONTHS) {
            return interfaceC2268.e(EnumC18496.DAY_OF_MONTH);
        }
        if (interfaceC3679 == EnumC8618.YEARS) {
            return interfaceC2268.e(EnumC18496.DAY_OF_YEAR);
        }
        if (interfaceC3679 == C7207.h) {
            return interfaceC2268.e(EnumC18496.DAY_OF_YEAR);
        }
        if (interfaceC3679 == EnumC8618.FOREVER) {
            return interfaceC2268.e(EnumC18496.YEAR);
        }
        return false;
    }

    @Override // l.InterfaceC10030
    public final C22729 m(InterfaceC2268 interfaceC2268) {
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        InterfaceC3679 interfaceC3679 = this.d;
        if (interfaceC3679 == enumC8618) {
            return this.e;
        }
        if (interfaceC3679 == EnumC8618.MONTHS) {
            return f(interfaceC2268, EnumC18496.DAY_OF_MONTH);
        }
        if (interfaceC3679 == EnumC8618.YEARS) {
            return f(interfaceC2268, EnumC18496.DAY_OF_YEAR);
        }
        if (interfaceC3679 == C7207.h) {
            return g(interfaceC2268);
        }
        if (interfaceC3679 == EnumC8618.FOREVER) {
            return EnumC18496.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC3679 + ", this: " + this);
    }

    public final C22729 f(InterfaceC2268 interfaceC2268, EnumC18496 enumC18496) {
        int h2 = h(interfaceC2268.l(enumC18496), b(interfaceC2268));
        C22729 n = interfaceC2268.n(enumC18496);
        return C22729.f(a(h2, (int) n.a), a(h2, (int) n.d));
    }

    public final C22729 g(InterfaceC2268 interfaceC2268) {
        EnumC18496 enumC18496 = EnumC18496.DAY_OF_YEAR;
        if (!interfaceC2268.e(enumC18496)) {
            return h;
        }
        int b = b(interfaceC2268);
        int l2 = interfaceC2268.l(enumC18496);
        int h2 = h(l2, b);
        int a = a(h2, l2);
        if (a != 0) {
            if (a >= a(h2, this.b.b + ((int) interfaceC2268.n(enumC18496).d))) {
                return g(AbstractC16169.r(interfaceC2268).E(interfaceC2268).d((r0 - l2) + 8, (InterfaceC3679) EnumC8618.DAYS));
            }
            return C22729.f(1L, r1 - 1);
        }
        return g(AbstractC16169.r(interfaceC2268).E(interfaceC2268).w(l2 + 7, EnumC8618.DAYS));
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
