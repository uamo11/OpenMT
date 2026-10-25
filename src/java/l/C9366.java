package l;

import java.util.Locale;

/* compiled from: N673 */
/* renamed from: l.ۢۙᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9366 implements InterfaceC14303 {
    public final String toString() {
        return "Instant()";
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        Long a = c10071.a(EnumC18496.INSTANT_SECONDS);
        InterfaceC2268 interfaceC2268 = c10071.a;
        EnumC18496 enumC18496 = EnumC18496.NANO_OF_SECOND;
        Long valueOf = interfaceC2268.e(enumC18496) ? Long.valueOf(interfaceC2268.G(enumC18496)) : null;
        int i = 0;
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        int a2 = enumC18496.b.a(valueOf != null ? valueOf.longValue() : 0L, enumC18496);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long z = AbstractC22791.z(j, 315569520000L) + 1;
            C22770 Z = C22770.Z(AbstractC22791.O(j, 315569520000L) - 62167219200L, 0, C18078.f);
            if (z > 0) {
                sb.append('+');
                sb.append(z);
            }
            sb.append(Z);
            if (Z.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            C22770 Z2 = C22770.Z(j4 - 62167219200L, 0, C18078.f);
            int length = sb.length();
            sb.append(Z2);
            if (Z2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (Z2.a.a == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (a2 > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (a2 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = a2 / i2;
                sb.append((char) (i3 + 48));
                a2 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        C4426 c4426 = new C4426();
        c4426.a(C6292.f);
        c4426.d('T');
        EnumC18496 enumC18496 = EnumC18496.HOUR_OF_DAY;
        c4426.l(enumC18496, 2);
        c4426.d(':');
        EnumC18496 enumC184962 = EnumC18496.MINUTE_OF_HOUR;
        c4426.l(enumC184962, 2);
        c4426.d(':');
        EnumC18496 enumC184963 = EnumC18496.SECOND_OF_MINUTE;
        c4426.l(enumC184963, 2);
        EnumC18496 enumC184964 = EnumC18496.NANO_OF_SECOND;
        int i2 = 1;
        c4426.b(enumC184964, 0, 9, true);
        c4426.d('Z');
        C17832 c17832 = c4426.q(Locale.getDefault(), EnumC17126.SMART, null).a;
        if (c17832.b) {
            c17832 = new C17832(c17832.a, false);
        }
        C3015 c30152 = new C3015(c3015.a);
        c30152.b = c3015.b;
        c30152.c = c3015.c;
        int m = c17832.m(c30152, charSequence, i);
        if (m < 0) {
            return m;
        }
        long longValue = c30152.d(EnumC18496.YEAR).longValue();
        int intValue = c30152.d(EnumC18496.MONTH_OF_YEAR).intValue();
        int intValue2 = c30152.d(EnumC18496.DAY_OF_MONTH).intValue();
        int intValue3 = c30152.d(enumC18496).intValue();
        int intValue4 = c30152.d(enumC184962).intValue();
        Long d = c30152.d(enumC184963);
        Long d2 = c30152.d(enumC184964);
        int intValue5 = d != null ? d.intValue() : 0;
        int intValue6 = d2 != null ? d2.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            intValue3 = 0;
        } else {
            if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                c3015.c().d = true;
                intValue5 = 59;
            }
            i2 = 0;
        }
        int i3 = ((int) longValue) % 10000;
        try {
            C22770 c22770 = C22770.c;
            C19056 h0 = C19056.h0(i3, intValue, intValue2);
            C7248 Z = C7248.Z(intValue3, intValue4, intValue5, 0);
            return c3015.f(enumC184964, intValue6, i, c3015.f(EnumC18496.INSTANT_SECONDS, AbstractC22791.Q(longValue / 10000, 315569520000L) + AbstractC22791.j(new C22770(h0, Z).e0(h0.l0(i2), Z), C18078.f), i, m));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }
}
