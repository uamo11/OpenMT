package l;

import java.util.Locale;
import java.util.Map;

/* compiled from: N673 */
/* renamed from: l.ۙ᩹ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC4944 implements InterfaceC2765 {
    public static final ConcurrentMapC10942 a = new ConcurrentMapC10942();
    public static final ConcurrentMapC10942 b = new ConcurrentMapC10942();

    public abstract /* synthetic */ InterfaceC13410 m();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k().compareTo(((InterfaceC2765) obj).k());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static InterfaceC2765 n(InterfaceC2765 interfaceC2765, String str) {
        String o;
        InterfaceC2765 interfaceC27652 = (InterfaceC2765) a.putIfAbsent(str, interfaceC2765);
        if (interfaceC27652 == null && (o = interfaceC2765.o()) != null) {
            b.putIfAbsent(o, interfaceC2765);
        }
        return interfaceC27652;
    }

    @Override // l.InterfaceC2765
    public InterfaceC13410 O(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.EPOCH_DAY;
        if (map.containsKey(enumC18496)) {
            return j(((Long) map.remove(enumC18496)).longValue());
        }
        C(map, enumC17126);
        InterfaceC13410 T = T(map, enumC17126);
        if (T != null) {
            return T;
        }
        EnumC18496 enumC184962 = EnumC18496.YEAR;
        if (!map.containsKey(enumC184962)) {
            return null;
        }
        EnumC18496 enumC184963 = EnumC18496.MONTH_OF_YEAR;
        if (map.containsKey(enumC184963)) {
            if (map.containsKey(EnumC18496.DAY_OF_MONTH)) {
                return G(map, enumC17126);
            }
            EnumC18496 enumC184964 = EnumC18496.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(enumC184964)) {
                EnumC18496 enumC184965 = EnumC18496.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(enumC184965)) {
                    EnumC18496 enumC184966 = EnumC18496.DAY_OF_WEEK;
                    if (map.containsKey(enumC184966)) {
                        int a2 = v(enumC184962).a(((Long) map.remove(enumC184962)).longValue(), enumC184962);
                        if (enumC17126 == EnumC17126.LENIENT) {
                            return s(M(a2, 1, 1), AbstractC22791.R(((Long) map.remove(enumC184963)).longValue(), 1L), AbstractC22791.R(((Long) map.remove(enumC184964)).longValue(), 1L), AbstractC22791.R(((Long) map.remove(enumC184966)).longValue(), 1L));
                        }
                        int a3 = v(enumC184963).a(((Long) map.remove(enumC184963)).longValue(), enumC184963);
                        InterfaceC13410 m = M(a2, a3, 1).d((v(enumC184964).a(((Long) map.remove(enumC184964)).longValue(), enumC184964) - 1) * 7, (InterfaceC3679) EnumC8618.DAYS).m(new C12851(EnumC21878.V(v(enumC184966).a(((Long) map.remove(enumC184966)).longValue(), enumC184966)).getValue(), 0));
                        if (enumC17126 != EnumC17126.STRICT || m.l(enumC184963) == a3) {
                            return m;
                        }
                        throw new C16232("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int a4 = v(enumC184962).a(((Long) map.remove(enumC184962)).longValue(), enumC184962);
                    if (enumC17126 == EnumC17126.LENIENT) {
                        long R = AbstractC22791.R(((Long) map.remove(enumC184963)).longValue(), 1L);
                        return M(a4, 1, 1).d(R, (InterfaceC3679) EnumC8618.MONTHS).d(AbstractC22791.R(((Long) map.remove(enumC184964)).longValue(), 1L), (InterfaceC3679) EnumC8618.WEEKS).d(AbstractC22791.R(((Long) map.remove(enumC184965)).longValue(), 1L), (InterfaceC3679) EnumC8618.DAYS);
                    }
                    int a5 = v(enumC184963).a(((Long) map.remove(enumC184963)).longValue(), enumC184963);
                    int a6 = v(enumC184964).a(((Long) map.remove(enumC184964)).longValue(), enumC184964);
                    InterfaceC13410 d = M(a4, a5, 1).d((v(enumC184965).a(((Long) map.remove(enumC184965)).longValue(), enumC184965) - 1) + ((a6 - 1) * 7), (InterfaceC3679) EnumC8618.DAYS);
                    if (enumC17126 != EnumC17126.STRICT || d.l(enumC184963) == a5) {
                        return d;
                    }
                    throw new C16232("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        EnumC18496 enumC184967 = EnumC18496.DAY_OF_YEAR;
        if (!map.containsKey(enumC184967)) {
            EnumC18496 enumC184968 = EnumC18496.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(enumC184968)) {
                return null;
            }
            EnumC18496 enumC184969 = EnumC18496.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(enumC184969)) {
                EnumC18496 enumC1849610 = EnumC18496.DAY_OF_WEEK;
                if (!map.containsKey(enumC1849610)) {
                    return null;
                }
                int a7 = v(enumC184962).a(((Long) map.remove(enumC184962)).longValue(), enumC184962);
                if (enumC17126 == EnumC17126.LENIENT) {
                    return s(q(a7, 1), 0L, AbstractC22791.R(((Long) map.remove(enumC184968)).longValue(), 1L), AbstractC22791.R(((Long) map.remove(enumC1849610)).longValue(), 1L));
                }
                InterfaceC13410 m2 = q(a7, 1).d((v(enumC184968).a(((Long) map.remove(enumC184968)).longValue(), enumC184968) - 1) * 7, (InterfaceC3679) EnumC8618.DAYS).m(new C12851(EnumC21878.V(v(enumC1849610).a(((Long) map.remove(enumC1849610)).longValue(), enumC1849610)).getValue(), 0));
                if (enumC17126 != EnumC17126.STRICT || m2.l(enumC184962) == a7) {
                    return m2;
                }
                throw new C16232("Strict mode rejected resolved date as it is in a different year");
            }
            int a8 = v(enumC184962).a(((Long) map.remove(enumC184962)).longValue(), enumC184962);
            if (enumC17126 == EnumC17126.LENIENT) {
                return q(a8, 1).d(AbstractC22791.R(((Long) map.remove(enumC184968)).longValue(), 1L), (InterfaceC3679) EnumC8618.WEEKS).d(AbstractC22791.R(((Long) map.remove(enumC184969)).longValue(), 1L), (InterfaceC3679) EnumC8618.DAYS);
            }
            int a9 = v(enumC184968).a(((Long) map.remove(enumC184968)).longValue(), enumC184968);
            InterfaceC13410 d2 = q(a8, 1).d((v(enumC184969).a(((Long) map.remove(enumC184969)).longValue(), enumC184969) - 1) + ((a9 - 1) * 7), (InterfaceC3679) EnumC8618.DAYS);
            if (enumC17126 != EnumC17126.STRICT || d2.l(enumC184962) == a8) {
                return d2;
            }
            throw new C16232("Strict mode rejected resolved date as it is in a different year");
        }
        int a10 = v(enumC184962).a(((Long) map.remove(enumC184962)).longValue(), enumC184962);
        if (enumC17126 == EnumC17126.LENIENT) {
            return q(a10, 1).d(AbstractC22791.R(((Long) map.remove(enumC184967)).longValue(), 1L), (InterfaceC3679) EnumC8618.DAYS);
        }
        return q(a10, v(enumC184967).a(((Long) map.remove(enumC184967)).longValue(), enumC184967));
    }

    @Override // l.InterfaceC2765
    public InterfaceC14115 J(InterfaceC2268 interfaceC2268) {
        try {
            return E(interfaceC2268).I(C7248.X(interfaceC2268));
        } catch (C16232 e) {
            throw new C16232("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + interfaceC2268.getClass(), e);
        }
    }

    public void C(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC18496);
        if (l2 != null) {
            if (enumC17126 != EnumC17126.LENIENT) {
                enumC18496.T(l2.longValue());
            }
            InterfaceC13410 c = m().c(1L, (InterfaceC10030) EnumC18496.DAY_OF_MONTH).c(l2.longValue(), (InterfaceC10030) enumC18496);
            l(map, EnumC18496.MONTH_OF_YEAR, c.l(r0));
            l(map, EnumC18496.YEAR, c.l(r0));
        }
    }

    public InterfaceC13410 T(Map map, EnumC17126 enumC17126) {
        int y;
        EnumC18496 enumC18496 = EnumC18496.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC18496);
        if (l2 != null) {
            Long l3 = (Long) map.remove(EnumC18496.ERA);
            if (enumC17126 != EnumC17126.LENIENT) {
                y = v(enumC18496).a(l2.longValue(), enumC18496);
            } else {
                y = AbstractC22791.y(l2.longValue());
            }
            if (l3 != null) {
                l(map, EnumC18496.YEAR, z(y(v(r2).a(l3.longValue(), r2)), y));
                return null;
            }
            EnumC18496 enumC184962 = EnumC18496.YEAR;
            if (map.containsKey(enumC184962)) {
                l(map, enumC184962, z(q(v(enumC184962).a(((Long) map.get(enumC184962)).longValue(), enumC184962), 1).K(), y));
                return null;
            }
            if (enumC17126 == EnumC17126.STRICT) {
                map.put(enumC18496, l2);
                return null;
            }
            if (x().isEmpty()) {
                l(map, enumC184962, y);
                return null;
            }
            l(map, enumC184962, z((InterfaceC4176) r9.get(r9.size() - 1), y));
            return null;
        }
        EnumC18496 enumC184963 = EnumC18496.ERA;
        if (!map.containsKey(enumC184963)) {
            return null;
        }
        v(enumC184963).b(((Long) map.get(enumC184963)).longValue(), enumC184963);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.᩹᩹ᩴ] */
    @Override // l.InterfaceC2765
    public InterfaceC22583 p(InterfaceC2268 interfaceC2268) {
        try {
            AbstractC5650 V = AbstractC5650.V(interfaceC2268);
            try {
                interfaceC2268 = P(C4239.W(interfaceC2268), V);
                return interfaceC2268;
            } catch (C16232 unused) {
                return C9115.V(V, null, C16875.V(this, J(interfaceC2268)));
            }
        } catch (C16232 e) {
            throw new C16232("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + interfaceC2268.getClass(), e);
        }
    }

    public InterfaceC13410 G(Map map, EnumC17126 enumC17126) {
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        int a2 = v(enumC18496).a(((Long) map.remove(enumC18496)).longValue(), enumC18496);
        if (enumC17126 == EnumC17126.LENIENT) {
            long R = AbstractC22791.R(((Long) map.remove(EnumC18496.MONTH_OF_YEAR)).longValue(), 1L);
            return M(a2, 1, 1).d(R, (InterfaceC3679) EnumC8618.MONTHS).d(AbstractC22791.R(((Long) map.remove(EnumC18496.DAY_OF_MONTH)).longValue(), 1L), (InterfaceC3679) EnumC8618.DAYS);
        }
        EnumC18496 enumC184962 = EnumC18496.MONTH_OF_YEAR;
        int a3 = v(enumC184962).a(((Long) map.remove(enumC184962)).longValue(), enumC184962);
        EnumC18496 enumC184963 = EnumC18496.DAY_OF_MONTH;
        int a4 = v(enumC184963).a(((Long) map.remove(enumC184963)).longValue(), enumC184963);
        if (enumC17126 != EnumC17126.SMART) {
            return M(a2, a3, a4);
        }
        try {
            return M(a2, a3, a4);
        } catch (C16232 unused) {
            return M(a2, a3, 1).m(new C8556(3));
        }
    }

    public static InterfaceC13410 s(InterfaceC13410 interfaceC13410, long j, long j2, long j3) {
        long j4;
        InterfaceC13410 d = interfaceC13410.d(j, (InterfaceC3679) EnumC8618.MONTHS);
        EnumC8618 enumC8618 = EnumC8618.WEEKS;
        InterfaceC13410 d2 = d.d(j2, (InterfaceC3679) enumC8618);
        if (j3 > 7) {
            long j5 = j3 - 1;
            d2 = d2.d(j5 / 7, (InterfaceC3679) enumC8618);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                d2 = d2.d(AbstractC22791.R(j3, 7L) / 7, (InterfaceC3679) enumC8618);
                j4 = (j3 + 6) % 7;
            }
            return d2.m(new C12851(EnumC21878.V((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return d2.m(new C12851(EnumC21878.V((int) j3).getValue(), 0));
    }

    public static void l(Map map, EnumC18496 enumC18496, long j) {
        Long l2 = (Long) map.get(enumC18496);
        if (l2 != null && l2.longValue() != j) {
            throw new C16232("Conflict found: " + enumC18496 + " " + l2 + " differs from " + enumC18496 + " " + j);
        }
        map.put(enumC18496, Long.valueOf(j));
    }

    @Override // l.InterfaceC2765
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC4944) && k().compareTo(((AbstractC4944) obj).k()) == 0;
    }

    @Override // l.InterfaceC2765
    public final int hashCode() {
        return getClass().hashCode() ^ k().hashCode();
    }

    @Override // l.InterfaceC2765
    public final String toString() {
        return k();
    }
}
