package l;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.ܶۗᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class EnumC14967 implements InterfaceC10030 {
    public static final EnumC14967 DAY_OF_QUARTER;
    public static final EnumC14967 QUARTER_OF_YEAR;
    public static final EnumC14967 WEEK_BASED_YEAR;
    public static final EnumC14967 WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ EnumC14967[] b;

    @Override // l.InterfaceC10030
    public final boolean isDateBased() {
        return true;
    }

    public /* synthetic */ InterfaceC2268 n(Map map, C16420 c16420, EnumC17126 enumC17126) {
        return null;
    }

    public static EnumC14967 valueOf(String str) {
        return (EnumC14967) Enum.valueOf(EnumC14967.class, str);
    }

    public static EnumC14967[] values() {
        return (EnumC14967[]) b.clone();
    }

    static {
        EnumC14967 enumC14967 = new EnumC14967() { // from class: l.֡ۗᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // l.InterfaceC10030
            public final C22729 s() {
                return C22729.g(1L, 90L, 92L);
            }

            @Override // l.InterfaceC10030
            public final boolean l(InterfaceC2268 interfaceC2268) {
                if (!interfaceC2268.e(EnumC18496.DAY_OF_YEAR) || !interfaceC2268.e(EnumC18496.MONTH_OF_YEAR) || !interfaceC2268.e(EnumC18496.YEAR)) {
                    return false;
                }
                EnumC14967 enumC149672 = AbstractC22024.a;
                return AbstractC16169.r(interfaceC2268).equals(C8409.c);
            }

            @Override // l.InterfaceC10030
            public final C22729 m(InterfaceC2268 interfaceC2268) {
                if (!l(interfaceC2268)) {
                    throw new C11441("Unsupported field: DayOfQuarter");
                }
                long G = interfaceC2268.G(EnumC14967.QUARTER_OF_YEAR);
                if (G == 1) {
                    return C8409.c.S(interfaceC2268.G(EnumC18496.YEAR)) ? C22729.f(1L, 91L) : C22729.f(1L, 90L);
                }
                if (G == 2) {
                    return C22729.f(1L, 91L);
                }
                if (G == 3 || G == 4) {
                    return C22729.f(1L, 92L);
                }
                return s();
            }

            @Override // l.InterfaceC10030
            public final long C(InterfaceC2268 interfaceC2268) {
                if (!l(interfaceC2268)) {
                    throw new C11441("Unsupported field: DayOfQuarter");
                }
                return interfaceC2268.l(EnumC18496.DAY_OF_YEAR) - EnumC14967.a[((interfaceC2268.l(EnumC18496.MONTH_OF_YEAR) - 1) / 3) + (C8409.c.S(interfaceC2268.G(EnumC18496.YEAR)) ? 4 : 0)];
            }

            @Override // l.InterfaceC10030
            public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
                long C = C(interfaceC15672);
                s().b(j, this);
                EnumC18496 enumC18496 = EnumC18496.DAY_OF_YEAR;
                return interfaceC15672.c((j - C) + interfaceC15672.G(enumC18496), enumC18496);
            }

            @Override // l.EnumC14967, l.InterfaceC10030
            public final InterfaceC2268 n(Map map, C16420 c16420, EnumC17126 enumC17126) {
                long j;
                C19056 c19056;
                EnumC18496 enumC18496 = EnumC18496.YEAR;
                Long l2 = (Long) map.get(enumC18496);
                InterfaceC10030 interfaceC10030 = EnumC14967.QUARTER_OF_YEAR;
                Long l3 = (Long) map.get(interfaceC10030);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int a2 = enumC18496.b.a(l2.longValue(), enumC18496);
                long longValue = ((Long) map.get(EnumC14967.DAY_OF_QUARTER)).longValue();
                EnumC14967 enumC149672 = AbstractC22024.a;
                if (!AbstractC16169.r(c16420).equals(C8409.c)) {
                    throw new C16232("Resolve requires IsoChronology");
                }
                if (enumC17126 == EnumC17126.LENIENT) {
                    c19056 = C19056.h0(a2, 1, 1).m0(AbstractC22791.Q(AbstractC22791.R(l3.longValue(), 1L), 3));
                    j = AbstractC22791.R(longValue, 1L);
                } else {
                    C19056 h0 = C19056.h0(a2, ((interfaceC10030.s().a(l3.longValue(), interfaceC10030) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        if (enumC17126 == EnumC17126.STRICT) {
                            m(h0).b(longValue, this);
                        } else {
                            s().b(longValue, this);
                        }
                    }
                    j = longValue - 1;
                    c19056 = h0;
                }
                map.remove(this);
                map.remove(enumC18496);
                map.remove(interfaceC10030);
                return c19056.l0(j);
            }
        };
        DAY_OF_QUARTER = enumC14967;
        EnumC14967 enumC149672 = new EnumC14967() { // from class: l.ۚۗᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // l.InterfaceC10030
            public final C22729 s() {
                return C22729.f(1L, 4L);
            }

            @Override // l.InterfaceC10030
            public final boolean l(InterfaceC2268 interfaceC2268) {
                if (!interfaceC2268.e(EnumC18496.MONTH_OF_YEAR)) {
                    return false;
                }
                EnumC14967 enumC149673 = AbstractC22024.a;
                return AbstractC16169.r(interfaceC2268).equals(C8409.c);
            }

            @Override // l.InterfaceC10030
            public final long C(InterfaceC2268 interfaceC2268) {
                if (!l(interfaceC2268)) {
                    throw new C11441("Unsupported field: QuarterOfYear");
                }
                return (interfaceC2268.G(EnumC18496.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // l.InterfaceC10030
            public final C22729 m(InterfaceC2268 interfaceC2268) {
                if (!l(interfaceC2268)) {
                    throw new C11441("Unsupported field: QuarterOfYear");
                }
                return s();
            }

            @Override // l.InterfaceC10030
            public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
                long C = C(interfaceC15672);
                s().b(j, this);
                EnumC18496 enumC18496 = EnumC18496.MONTH_OF_YEAR;
                return interfaceC15672.c(((j - C) * 3) + interfaceC15672.G(enumC18496), enumC18496);
            }
        };
        QUARTER_OF_YEAR = enumC149672;
        EnumC14967 enumC149673 = new EnumC14967() { // from class: l.֨ۗᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // l.InterfaceC10030
            public final C22729 s() {
                return C22729.g(1L, 52L, 53L);
            }

            @Override // l.InterfaceC10030
            public final boolean l(InterfaceC2268 interfaceC2268) {
                if (!interfaceC2268.e(EnumC18496.EPOCH_DAY)) {
                    return false;
                }
                EnumC14967 enumC149674 = AbstractC22024.a;
                return AbstractC16169.r(interfaceC2268).equals(C8409.c);
            }

            @Override // l.InterfaceC10030
            public final C22729 m(InterfaceC2268 interfaceC2268) {
                if (l(interfaceC2268)) {
                    return EnumC14967.X(C19056.X(interfaceC2268));
                }
                throw new C11441("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // l.InterfaceC10030
            public final long C(InterfaceC2268 interfaceC2268) {
                if (!l(interfaceC2268)) {
                    throw new C11441("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC14967.T(C19056.X(interfaceC2268));
            }

            @Override // l.InterfaceC10030
            public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
                s().b(j, this);
                return interfaceC15672.d(AbstractC22791.R(j, C(interfaceC15672)), EnumC8618.WEEKS);
            }

            @Override // l.EnumC14967, l.InterfaceC10030
            public final InterfaceC2268 n(Map map, C16420 c16420, EnumC17126 enumC17126) {
                C19056 c;
                long j;
                C19056 n0;
                long j2;
                InterfaceC10030 interfaceC10030 = EnumC14967.WEEK_BASED_YEAR;
                Long l2 = (Long) map.get(interfaceC10030);
                EnumC18496 enumC18496 = EnumC18496.DAY_OF_WEEK;
                Long l3 = (Long) map.get(enumC18496);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int a2 = interfaceC10030.s().a(l2.longValue(), interfaceC10030);
                long longValue = ((Long) map.get(EnumC14967.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                EnumC14967 enumC149674 = AbstractC22024.a;
                if (!AbstractC16169.r(c16420).equals(C8409.c)) {
                    throw new C16232("Resolve requires IsoChronology");
                }
                C19056 h0 = C19056.h0(a2, 1, 4);
                if (enumC17126 == EnumC17126.LENIENT) {
                    long longValue2 = l3.longValue();
                    if (longValue2 > 7) {
                        long j3 = longValue2 - 1;
                        n0 = h0.n0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (longValue2 < 1) {
                            n0 = h0.n0(AbstractC22791.R(longValue2, 7L) / 7);
                            j2 = (longValue2 + 6) % 7;
                        }
                        c = h0.n0(AbstractC22791.R(longValue, j)).c(longValue2, enumC18496);
                    }
                    h0 = n0;
                    j = 1;
                    longValue2 = j2 + 1;
                    c = h0.n0(AbstractC22791.R(longValue, j)).c(longValue2, enumC18496);
                } else {
                    int a3 = enumC18496.b.a(l3.longValue(), enumC18496);
                    if (longValue < 1 || longValue > 52) {
                        if (enumC17126 == EnumC17126.STRICT) {
                            EnumC14967.X(h0).b(longValue, this);
                        } else {
                            s().b(longValue, this);
                        }
                    }
                    c = h0.n0(longValue - 1).c(a3, enumC18496);
                }
                map.remove(this);
                map.remove(interfaceC10030);
                map.remove(enumC18496);
                return c;
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC149673;
        EnumC14967 enumC149674 = new EnumC14967() { // from class: l.۠ۗᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // l.InterfaceC10030
            public final C22729 s() {
                return EnumC18496.YEAR.b;
            }

            @Override // l.InterfaceC10030
            public final boolean l(InterfaceC2268 interfaceC2268) {
                if (!interfaceC2268.e(EnumC18496.EPOCH_DAY)) {
                    return false;
                }
                EnumC14967 enumC149675 = AbstractC22024.a;
                return AbstractC16169.r(interfaceC2268).equals(C8409.c);
            }

            @Override // l.InterfaceC10030
            public final long C(InterfaceC2268 interfaceC2268) {
                if (l(interfaceC2268)) {
                    return EnumC14967.V(C19056.X(interfaceC2268));
                }
                throw new C11441("Unsupported field: WeekBasedYear");
            }

            @Override // l.InterfaceC10030
            public final C22729 m(InterfaceC2268 interfaceC2268) {
                if (!l(interfaceC2268)) {
                    throw new C11441("Unsupported field: WeekBasedYear");
                }
                return s();
            }

            @Override // l.InterfaceC10030
            public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
                if (!l(interfaceC15672)) {
                    throw new C11441("Unsupported field: WeekBasedYear");
                }
                int a2 = EnumC18496.YEAR.b.a(j, EnumC14967.WEEK_BASED_YEAR);
                C19056 X = C19056.X(interfaceC15672);
                int l2 = X.l(EnumC18496.DAY_OF_WEEK);
                int T = EnumC14967.T(X);
                if (T == 53 && EnumC14967.W(a2) == 52) {
                    T = 52;
                }
                return interfaceC15672.m(C19056.h0(a2, 1, 4).l0(((T - 1) * 7) + (l2 - r6.l(r0))));
            }
        };
        WEEK_BASED_YEAR = enumC149674;
        b = new EnumC14967[]{enumC14967, enumC149672, enumC149673, enumC149674};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static C22729 X(C19056 c19056) {
        return C22729.f(1L, W(V(c19056)));
    }

    public static int W(int i) {
        C19056 h0 = C19056.h0(i, 1, 1);
        if (h0.Z() != EnumC21878.THURSDAY) {
            return (h0.Z() == EnumC21878.WEDNESDAY && h0.u()) ? 53 : 52;
        }
        return 53;
    }

    public static int T(C19056 c19056) {
        int ordinal = c19056.Z().ordinal();
        int a0 = c19056.a0() - 1;
        int i = (3 - ordinal) + a0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (a0 >= i3) {
            int i4 = ((a0 - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && c19056.u())) {
                return i4;
            }
            return 1;
        }
        if (c19056.a0() != 180) {
            c19056 = C19056.j0(c19056.a, 180);
        }
        return (int) X(c19056.o0(-1L)).d;
    }

    public static int V(C19056 c19056) {
        int i = c19056.a;
        int a0 = c19056.a0();
        if (a0 <= 3) {
            return a0 - c19056.Z().ordinal() < -2 ? i - 1 : i;
        }
        if (a0 >= 363) {
            return ((a0 - 363) - (c19056.u() ? 1 : 0)) - c19056.Z().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
