package l;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: N673 */
/* renamed from: l.ᩴۗᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class EnumC18496 implements InterfaceC10030 {
    public static final EnumC18496 ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final EnumC18496 ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final EnumC18496 ALIGNED_WEEK_OF_MONTH;
    public static final EnumC18496 ALIGNED_WEEK_OF_YEAR;
    public static final EnumC18496 AMPM_OF_DAY;
    public static final EnumC18496 CLOCK_HOUR_OF_AMPM;
    public static final EnumC18496 CLOCK_HOUR_OF_DAY;
    public static final EnumC18496 DAY_OF_MONTH;
    public static final EnumC18496 DAY_OF_WEEK;
    public static final EnumC18496 DAY_OF_YEAR;
    public static final EnumC18496 EPOCH_DAY;
    public static final EnumC18496 ERA;
    public static final EnumC18496 HOUR_OF_AMPM;
    public static final EnumC18496 HOUR_OF_DAY;
    public static final EnumC18496 INSTANT_SECONDS;
    public static final EnumC18496 MICRO_OF_DAY;
    public static final EnumC18496 MICRO_OF_SECOND;
    public static final EnumC18496 MILLI_OF_DAY;
    public static final EnumC18496 MILLI_OF_SECOND;
    public static final EnumC18496 MINUTE_OF_DAY;
    public static final EnumC18496 MINUTE_OF_HOUR;
    public static final EnumC18496 MONTH_OF_YEAR;
    public static final EnumC18496 NANO_OF_DAY;
    public static final EnumC18496 NANO_OF_SECOND;
    public static final EnumC18496 OFFSET_SECONDS;
    public static final EnumC18496 PROLEPTIC_MONTH;
    public static final EnumC18496 SECOND_OF_DAY;
    public static final EnumC18496 SECOND_OF_MINUTE;
    public static final EnumC18496 YEAR;
    public static final EnumC18496 YEAR_OF_ERA;
    public static final /* synthetic */ EnumC18496[] c;
    public final String a;
    public final C22729 b;

    @Override // l.InterfaceC10030
    public final /* synthetic */ InterfaceC2268 n(Map map, C16420 c16420, EnumC17126 enumC17126) {
        return null;
    }

    public static EnumC18496 valueOf(String str) {
        return (EnumC18496) Enum.valueOf(EnumC18496.class, str);
    }

    public static EnumC18496[] values() {
        return (EnumC18496[]) c.clone();
    }

    static {
        EnumC8618 enumC8618 = EnumC8618.NANOS;
        EnumC8618 enumC86182 = EnumC8618.SECONDS;
        EnumC18496 enumC18496 = new EnumC18496("NANO_OF_SECOND", 0, "NanoOfSecond", enumC8618, enumC86182, C22729.f(0L, 999999999L));
        NANO_OF_SECOND = enumC18496;
        EnumC8618 enumC86183 = EnumC8618.DAYS;
        EnumC18496 enumC184962 = new EnumC18496("NANO_OF_DAY", 1, "NanoOfDay", enumC8618, enumC86183, C22729.f(0L, 86399999999999L));
        NANO_OF_DAY = enumC184962;
        EnumC8618 enumC86184 = EnumC8618.MICROS;
        EnumC18496 enumC184963 = new EnumC18496("MICRO_OF_SECOND", 2, "MicroOfSecond", enumC86184, enumC86182, C22729.f(0L, 999999L));
        MICRO_OF_SECOND = enumC184963;
        EnumC18496 enumC184964 = new EnumC18496("MICRO_OF_DAY", 3, "MicroOfDay", enumC86184, enumC86183, C22729.f(0L, 86399999999L));
        MICRO_OF_DAY = enumC184964;
        EnumC8618 enumC86185 = EnumC8618.MILLIS;
        EnumC18496 enumC184965 = new EnumC18496("MILLI_OF_SECOND", 4, "MilliOfSecond", enumC86185, enumC86182, C22729.f(0L, 999L));
        MILLI_OF_SECOND = enumC184965;
        EnumC18496 enumC184966 = new EnumC18496("MILLI_OF_DAY", 5, "MilliOfDay", enumC86185, enumC86183, C22729.f(0L, 86399999L));
        MILLI_OF_DAY = enumC184966;
        EnumC8618 enumC86186 = EnumC8618.MINUTES;
        EnumC18496 enumC184967 = new EnumC18496("SECOND_OF_MINUTE", 6, "SecondOfMinute", enumC86182, enumC86186, C22729.f(0L, 59L), 0);
        SECOND_OF_MINUTE = enumC184967;
        EnumC18496 enumC184968 = new EnumC18496("SECOND_OF_DAY", 7, "SecondOfDay", enumC86182, enumC86183, C22729.f(0L, 86399L));
        SECOND_OF_DAY = enumC184968;
        EnumC8618 enumC86187 = EnumC8618.HOURS;
        EnumC18496 enumC184969 = new EnumC18496("MINUTE_OF_HOUR", 8, "MinuteOfHour", enumC86186, enumC86187, C22729.f(0L, 59L), 0);
        MINUTE_OF_HOUR = enumC184969;
        EnumC18496 enumC1849610 = new EnumC18496("MINUTE_OF_DAY", 9, "MinuteOfDay", enumC86186, enumC86183, C22729.f(0L, 1439L));
        MINUTE_OF_DAY = enumC1849610;
        EnumC8618 enumC86188 = EnumC8618.HALF_DAYS;
        EnumC18496 enumC1849611 = new EnumC18496("HOUR_OF_AMPM", 10, "HourOfAmPm", enumC86187, enumC86188, C22729.f(0L, 11L));
        HOUR_OF_AMPM = enumC1849611;
        EnumC18496 enumC1849612 = new EnumC18496("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", enumC86187, enumC86188, C22729.f(1L, 12L));
        CLOCK_HOUR_OF_AMPM = enumC1849612;
        EnumC18496 enumC1849613 = new EnumC18496("HOUR_OF_DAY", 12, "HourOfDay", enumC86187, enumC86183, C22729.f(0L, 23L), 0);
        HOUR_OF_DAY = enumC1849613;
        EnumC18496 enumC1849614 = new EnumC18496("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", enumC86187, enumC86183, C22729.f(1L, 24L));
        CLOCK_HOUR_OF_DAY = enumC1849614;
        EnumC18496 enumC1849615 = new EnumC18496("AMPM_OF_DAY", 14, "AmPmOfDay", enumC86188, enumC86183, C22729.f(0L, 1L), 0);
        AMPM_OF_DAY = enumC1849615;
        EnumC8618 enumC86189 = EnumC8618.WEEKS;
        EnumC18496 enumC1849616 = new EnumC18496("DAY_OF_WEEK", 15, "DayOfWeek", enumC86183, enumC86189, C22729.f(1L, 7L), 0);
        DAY_OF_WEEK = enumC1849616;
        EnumC18496 enumC1849617 = new EnumC18496("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", enumC86183, enumC86189, C22729.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = enumC1849617;
        EnumC18496 enumC1849618 = new EnumC18496("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", enumC86183, enumC86189, C22729.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = enumC1849618;
        EnumC8618 enumC861810 = EnumC8618.MONTHS;
        EnumC18496 enumC1849619 = new EnumC18496("DAY_OF_MONTH", 18, "DayOfMonth", enumC86183, enumC861810, C22729.g(1L, 28L, 31L), 0);
        DAY_OF_MONTH = enumC1849619;
        EnumC8618 enumC861811 = EnumC8618.YEARS;
        EnumC18496 enumC1849620 = new EnumC18496("DAY_OF_YEAR", 19, "DayOfYear", enumC86183, enumC861811, C22729.g(1L, 365L, 366L));
        DAY_OF_YEAR = enumC1849620;
        EnumC8618 enumC861812 = EnumC8618.FOREVER;
        EnumC18496 enumC1849621 = new EnumC18496("EPOCH_DAY", 20, "EpochDay", enumC86183, enumC861812, C22729.f(-365243219162L, 365241780471L));
        EPOCH_DAY = enumC1849621;
        EnumC18496 enumC1849622 = new EnumC18496("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", enumC86189, enumC861810, C22729.g(1L, 4L, 5L));
        ALIGNED_WEEK_OF_MONTH = enumC1849622;
        EnumC18496 enumC1849623 = new EnumC18496("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", enumC86189, enumC861811, C22729.f(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = enumC1849623;
        EnumC18496 enumC1849624 = new EnumC18496("MONTH_OF_YEAR", 23, "MonthOfYear", enumC861810, enumC861811, C22729.f(1L, 12L), 0);
        MONTH_OF_YEAR = enumC1849624;
        EnumC18496 enumC1849625 = new EnumC18496("PROLEPTIC_MONTH", 24, "ProlepticMonth", enumC861810, enumC861812, C22729.f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = enumC1849625;
        EnumC18496 enumC1849626 = new EnumC18496("YEAR_OF_ERA", 25, "YearOfEra", enumC861811, enumC861812, C22729.g(1L, 999999999L, 1000000000L));
        YEAR_OF_ERA = enumC1849626;
        EnumC18496 enumC1849627 = new EnumC18496("YEAR", 26, "Year", enumC861811, enumC861812, C22729.f(-999999999L, 999999999L), 0);
        YEAR = enumC1849627;
        EnumC18496 enumC1849628 = new EnumC18496("ERA", 27, "Era", EnumC8618.ERAS, enumC861812, C22729.f(0L, 1L), 0);
        ERA = enumC1849628;
        EnumC18496 enumC1849629 = new EnumC18496("INSTANT_SECONDS", 28, "InstantSeconds", enumC86182, enumC861812, C22729.f(Long.MIN_VALUE, C13132.FOREVER_NS));
        INSTANT_SECONDS = enumC1849629;
        EnumC18496 enumC1849630 = new EnumC18496("OFFSET_SECONDS", 29, "OffsetSeconds", enumC86182, enumC861812, C22729.f(-64800L, 64800L));
        OFFSET_SECONDS = enumC1849630;
        c = new EnumC18496[]{enumC18496, enumC184962, enumC184963, enumC184964, enumC184965, enumC184966, enumC184967, enumC184968, enumC184969, enumC1849610, enumC1849611, enumC1849612, enumC1849613, enumC1849614, enumC1849615, enumC1849616, enumC1849617, enumC1849618, enumC1849619, enumC1849620, enumC1849621, enumC1849622, enumC1849623, enumC1849624, enumC1849625, enumC1849626, enumC1849627, enumC1849628, enumC1849629, enumC1849630};
    }

    public EnumC18496(String str, int i, String str2, EnumC8618 enumC8618, EnumC8618 enumC86182, C22729 c22729) {
        this.a = str2;
        this.b = c22729;
    }

    public EnumC18496(String str, int i, String str2, EnumC8618 enumC8618, EnumC8618 enumC86182, C22729 c22729, int i2) {
        this.a = str2;
        this.b = c22729;
    }

    public final void T(long j) {
        this.b.b(j, this);
    }

    @Override // l.InterfaceC10030
    public final C22729 s() {
        return this.b;
    }

    @Override // l.InterfaceC10030
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean V() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // l.InterfaceC10030
    public final boolean l(InterfaceC2268 interfaceC2268) {
        return interfaceC2268.e(this);
    }

    @Override // l.InterfaceC10030
    public final C22729 m(InterfaceC2268 interfaceC2268) {
        return interfaceC2268.n(this);
    }

    @Override // l.InterfaceC10030
    public final long C(InterfaceC2268 interfaceC2268) {
        return interfaceC2268.G(this);
    }

    @Override // l.InterfaceC10030
    public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
        return interfaceC15672.c(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
