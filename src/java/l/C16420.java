package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: N673 */
/* renamed from: l.ܽۙᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16420 implements InterfaceC2268 {
    public AbstractC5650 b;
    public InterfaceC2765 c;
    public boolean d;
    public EnumC17126 e;
    public InterfaceC13410 f;
    public C7248 g;
    public final Map a = new HashMap();
    public C6501 h = C6501.d;

    @Override // l.InterfaceC2268
    public final /* synthetic */ int l(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ C22729 n(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (((HashMap) this.a).containsKey(interfaceC10030)) {
            return true;
        }
        InterfaceC13410 interfaceC13410 = this.f;
        if (interfaceC13410 != null && interfaceC13410.e(interfaceC10030)) {
            return true;
        }
        C7248 c7248 = this.g;
        if (c7248 == null || !c7248.e(interfaceC10030)) {
            return (interfaceC10030 == null || (interfaceC10030 instanceof EnumC18496) || !interfaceC10030.l(this)) ? false : true;
        }
        return true;
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        C11003.requireNonNull(interfaceC10030, "field");
        Long l2 = (Long) ((HashMap) this.a).get(interfaceC10030);
        if (l2 != null) {
            return l2.longValue();
        }
        InterfaceC13410 interfaceC13410 = this.f;
        if (interfaceC13410 != null && interfaceC13410.e(interfaceC10030)) {
            return this.f.G(interfaceC10030);
        }
        C7248 c7248 = this.g;
        if (c7248 != null && c7248.e(interfaceC10030)) {
            return this.g.G(interfaceC10030);
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return interfaceC10030.C(this);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.a) {
            return this.b;
        }
        if (c8556 == AbstractC5796.b) {
            return this.c;
        }
        if (c8556 == AbstractC5796.f) {
            InterfaceC13410 interfaceC13410 = this.f;
            if (interfaceC13410 != null) {
                return C19056.X(interfaceC13410);
            }
            return null;
        }
        if (c8556 == AbstractC5796.g) {
            return this.g;
        }
        if (c8556 == AbstractC5796.d) {
            Long l2 = (Long) ((HashMap) this.a).get(EnumC18496.OFFSET_SECONDS);
            if (l2 != null) {
                return C18078.e0(l2.intValue());
            }
            AbstractC5650 abstractC5650 = this.b;
            return abstractC5650 instanceof C18078 ? abstractC5650 : c8556.h(this);
        }
        if (c8556 == AbstractC5796.e) {
            return c8556.h(this);
        }
        if (c8556 == AbstractC5796.c) {
            return null;
        }
        return c8556.h(this);
    }

    public final void x(InterfaceC10030 interfaceC10030, EnumC18496 enumC18496, Long l2) {
        Long l3 = (Long) ((HashMap) this.a).put(enumC18496, l2);
        if (l3 == null || l3.longValue() == l2.longValue()) {
            return;
        }
        throw new C16232("Conflict found: " + enumC18496 + " " + l3 + " differs from " + enumC18496 + " " + l2 + " while resolving  " + interfaceC10030);
    }

    public final void k() {
        if (((HashMap) this.a).containsKey(EnumC18496.INSTANT_SECONDS)) {
            AbstractC5650 abstractC5650 = this.b;
            if (abstractC5650 != null) {
                o(abstractC5650);
                return;
            }
            Long l2 = (Long) ((HashMap) this.a).get(EnumC18496.OFFSET_SECONDS);
            if (l2 != null) {
                o(C18078.e0(l2.intValue()));
            }
        }
    }

    public final void o(AbstractC5650 abstractC5650) {
        Map map = this.a;
        EnumC18496 enumC18496 = EnumC18496.INSTANT_SECONDS;
        v(this.c.P(C4239.ofEpochSecond(((Long) ((HashMap) map).remove(enumC18496)).longValue()), abstractC5650).f());
        x(enumC18496, EnumC18496.SECOND_OF_DAY, Long.valueOf(r5.b().i0()));
    }

    public final void v(InterfaceC13410 interfaceC13410) {
        InterfaceC13410 interfaceC134102 = this.f;
        if (interfaceC134102 != null) {
            if (interfaceC13410 == null || interfaceC134102.equals(interfaceC13410)) {
                return;
            }
            throw new C16232("Conflict found: Fields resolved to two different dates: " + this.f + " " + interfaceC13410);
        }
        if (interfaceC13410 != null) {
            if (!this.c.equals(interfaceC13410.a())) {
                throw new C16232("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
            this.f = interfaceC13410;
        }
    }

    public final void q() {
        Map map = this.a;
        EnumC18496 enumC18496 = EnumC18496.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(enumC18496)) {
            long longValue = ((Long) ((HashMap) this.a).remove(enumC18496)).longValue();
            EnumC17126 enumC17126 = this.e;
            if (enumC17126 == EnumC17126.STRICT || (enumC17126 == EnumC17126.SMART && longValue != 0)) {
                enumC18496.T(longValue);
            }
            EnumC18496 enumC184962 = EnumC18496.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            x(enumC18496, enumC184962, Long.valueOf(longValue));
        }
        Map map2 = this.a;
        EnumC18496 enumC184963 = EnumC18496.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(enumC184963)) {
            long longValue2 = ((Long) ((HashMap) this.a).remove(enumC184963)).longValue();
            EnumC17126 enumC171262 = this.e;
            if (enumC171262 == EnumC17126.STRICT || (enumC171262 == EnumC17126.SMART && longValue2 != 0)) {
                enumC184963.T(longValue2);
            }
            x(enumC184963, EnumC18496.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        Map map3 = this.a;
        EnumC18496 enumC184964 = EnumC18496.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(enumC184964)) {
            Map map4 = this.a;
            EnumC18496 enumC184965 = EnumC18496.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(enumC184965)) {
                long longValue3 = ((Long) ((HashMap) this.a).remove(enumC184964)).longValue();
                long longValue4 = ((Long) ((HashMap) this.a).remove(enumC184965)).longValue();
                if (this.e == EnumC17126.LENIENT) {
                    x(enumC184964, EnumC18496.HOUR_OF_DAY, Long.valueOf(AbstractC22791.P(AbstractC22791.Q(longValue3, 12), longValue4)));
                } else {
                    enumC184964.T(longValue3);
                    enumC184965.T(longValue3);
                    x(enumC184964, EnumC18496.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        Map map5 = this.a;
        EnumC18496 enumC184966 = EnumC18496.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(enumC184966)) {
            long longValue5 = ((Long) ((HashMap) this.a).remove(enumC184966)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184966.T(longValue5);
            }
            x(enumC184966, EnumC18496.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            x(enumC184966, EnumC18496.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            x(enumC184966, EnumC18496.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            x(enumC184966, EnumC18496.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.a;
        EnumC18496 enumC184967 = EnumC18496.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(enumC184967)) {
            long longValue6 = ((Long) ((HashMap) this.a).remove(enumC184967)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184967.T(longValue6);
            }
            x(enumC184967, EnumC18496.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            x(enumC184967, EnumC18496.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.a;
        EnumC18496 enumC184968 = EnumC18496.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(enumC184968)) {
            long longValue7 = ((Long) ((HashMap) this.a).remove(enumC184968)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184968.T(longValue7);
            }
            x(enumC184968, EnumC18496.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            x(enumC184968, EnumC18496.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.a;
        EnumC18496 enumC184969 = EnumC18496.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(enumC184969)) {
            long longValue8 = ((Long) ((HashMap) this.a).remove(enumC184969)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC184969.T(longValue8);
            }
            x(enumC184969, EnumC18496.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            x(enumC184969, EnumC18496.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            x(enumC184969, EnumC18496.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.a;
        EnumC18496 enumC1849610 = EnumC18496.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(enumC1849610)) {
            long longValue9 = ((Long) ((HashMap) this.a).remove(enumC1849610)).longValue();
            if (this.e != EnumC17126.LENIENT) {
                enumC1849610.T(longValue9);
            }
            x(enumC1849610, EnumC18496.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            x(enumC1849610, EnumC18496.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.a;
        EnumC18496 enumC1849611 = EnumC18496.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(enumC1849611)) {
            long longValue10 = ((Long) ((HashMap) this.a).get(enumC1849611)).longValue();
            EnumC17126 enumC171263 = this.e;
            EnumC17126 enumC171264 = EnumC17126.LENIENT;
            if (enumC171263 != enumC171264) {
                enumC1849611.T(longValue10);
            }
            Map map11 = this.a;
            EnumC18496 enumC1849612 = EnumC18496.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(enumC1849612)) {
                long longValue11 = ((Long) ((HashMap) this.a).remove(enumC1849612)).longValue();
                if (this.e != enumC171264) {
                    enumC1849612.T(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                x(enumC1849612, enumC1849611, Long.valueOf(longValue10));
            }
            Map map12 = this.a;
            EnumC18496 enumC1849613 = EnumC18496.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(enumC1849613)) {
                long longValue12 = ((Long) ((HashMap) this.a).remove(enumC1849613)).longValue();
                if (this.e != enumC171264) {
                    enumC1849613.T(longValue12);
                }
                x(enumC1849613, enumC1849611, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        EnumC18496 enumC1849614 = EnumC18496.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(enumC1849614)) {
            Map map14 = this.a;
            EnumC18496 enumC1849615 = EnumC18496.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(enumC1849615)) {
                Map map15 = this.a;
                EnumC18496 enumC1849616 = EnumC18496.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(enumC1849616) && ((HashMap) this.a).containsKey(enumC1849611)) {
                    p(((Long) ((HashMap) this.a).remove(enumC1849614)).longValue(), ((Long) ((HashMap) this.a).remove(enumC1849615)).longValue(), ((Long) ((HashMap) this.a).remove(enumC1849616)).longValue(), ((Long) ((HashMap) this.a).remove(enumC1849611)).longValue());
                }
            }
        }
    }

    public final void p(long j, long j2, long j3, long j4) {
        if (this.e == EnumC17126.LENIENT) {
            long P = AbstractC22791.P(AbstractC22791.P(AbstractC22791.P(AbstractC22791.Q(j, 3600000000000L), AbstractC22791.Q(j2, 60000000000L)), AbstractC22791.Q(j3, 1000000000L)), j4);
            s(C7248.a0(AbstractC22791.O(P, 86400000000000L)), C6501.a(0, 0, (int) AbstractC22791.z(P, 86400000000000L)));
            return;
        }
        EnumC18496 enumC18496 = EnumC18496.MINUTE_OF_HOUR;
        int a = enumC18496.b.a(j2, enumC18496);
        EnumC18496 enumC184962 = EnumC18496.NANO_OF_SECOND;
        int a2 = enumC184962.b.a(j4, enumC184962);
        if (this.e == EnumC17126.SMART && j == 24 && a == 0 && j3 == 0 && a2 == 0) {
            s(C7248.g, C6501.a(0, 0, 1));
            return;
        }
        EnumC18496 enumC184963 = EnumC18496.HOUR_OF_DAY;
        int a3 = enumC184963.b.a(j, enumC184963);
        EnumC18496 enumC184964 = EnumC18496.SECOND_OF_MINUTE;
        s(C7248.Z(a3, a, enumC184964.b.a(j3, enumC184964), a2), C6501.d);
    }

    public final void s(C7248 c7248, C6501 c6501) {
        C7248 c72482 = this.g;
        if (c72482 != null) {
            if (!c72482.equals(c7248)) {
                throw new C16232("Conflict found: Fields resolved to different times: " + this.g + " " + c7248);
            }
            C6501 c65012 = this.h;
            c65012.getClass();
            C6501 c65013 = C6501.d;
            if (c65012 != c65013 && c6501 != c65013 && !this.h.equals(c6501)) {
                throw new C16232("Conflict found: Fields resolved to different excess periods: " + this.h + " " + c6501);
            }
            this.h = c6501;
            return;
        }
        this.g = c7248;
        this.h = c6501;
    }

    public final void j(InterfaceC2268 interfaceC2268) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC10030 interfaceC10030 = (InterfaceC10030) entry.getKey();
            if (interfaceC2268.e(interfaceC10030)) {
                try {
                    long G = interfaceC2268.G(interfaceC10030);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (G != longValue) {
                        throw new C16232("Conflict found: Field " + interfaceC10030 + " " + G + " differs from " + interfaceC10030 + " " + longValue + " derived from " + interfaceC2268);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC13410 interfaceC13410 = this.f;
            if (interfaceC13410 != null) {
                sb.append(interfaceC13410);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
