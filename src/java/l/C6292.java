package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: N673 */
/* renamed from: l.ۛ᩶ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6292 {
    public static final C6292 f;
    public static final C6292 g;
    public static final C6292 h;
    public final C17832 a;
    public final Locale b;
    public final C1604 c;
    public final EnumC17126 d;
    public final InterfaceC2765 e;

    /* JADX WARN: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C6292 ofPattern(java.lang.String r18, java.util.Locale r19) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6292.ofPattern(java.lang.String, java.util.Locale):l.ۛ᩶ᩴ");
    }

    static {
        C4426 c4426 = new C4426();
        EnumC18496 enumC18496 = EnumC18496.YEAR;
        EnumC23476 enumC23476 = EnumC23476.EXCEEDS_PAD;
        c4426.m(enumC18496, 4, 10, enumC23476);
        c4426.d('-');
        EnumC18496 enumC184962 = EnumC18496.MONTH_OF_YEAR;
        c4426.l(enumC184962, 2);
        c4426.d('-');
        EnumC18496 enumC184963 = EnumC18496.DAY_OF_MONTH;
        c4426.l(enumC184963, 2);
        EnumC17126 enumC17126 = EnumC17126.STRICT;
        C8409 c8409 = C8409.c;
        C6292 p = c4426.p(enumC17126, c8409);
        f = p;
        C4426 c44262 = new C4426();
        EnumC7954 enumC7954 = EnumC7954.INSENSITIVE;
        c44262.c(enumC7954);
        c44262.a(p);
        C3721 c3721 = C3721.e;
        c44262.c(c3721);
        c44262.p(enumC17126, c8409);
        C4426 c44263 = new C4426();
        c44263.c(enumC7954);
        c44263.a(p);
        c44263.o();
        c44263.c(c3721);
        c44263.p(enumC17126, c8409);
        C4426 c44264 = new C4426();
        EnumC18496 enumC184964 = EnumC18496.HOUR_OF_DAY;
        c44264.l(enumC184964, 2);
        c44264.d(':');
        EnumC18496 enumC184965 = EnumC18496.MINUTE_OF_HOUR;
        c44264.l(enumC184965, 2);
        c44264.o();
        c44264.d(':');
        EnumC18496 enumC184966 = EnumC18496.SECOND_OF_MINUTE;
        c44264.l(enumC184966, 2);
        c44264.o();
        c44264.b(EnumC18496.NANO_OF_SECOND, 0, 9, true);
        C6292 p2 = c44264.p(enumC17126, null);
        C4426 c44265 = new C4426();
        c44265.c(enumC7954);
        c44265.a(p2);
        c44265.c(c3721);
        c44265.p(enumC17126, null);
        C4426 c44266 = new C4426();
        c44266.c(enumC7954);
        c44266.a(p2);
        c44266.o();
        c44266.c(c3721);
        c44266.p(enumC17126, null);
        C4426 c44267 = new C4426();
        c44267.c(enumC7954);
        c44267.a(p);
        c44267.d('T');
        c44267.a(p2);
        C6292 p3 = c44267.p(enumC17126, c8409);
        C4426 c44268 = new C4426();
        c44268.c(enumC7954);
        c44268.a(p3);
        EnumC7954 enumC79542 = EnumC7954.LENIENT;
        c44268.c(enumC79542);
        c44268.c(c3721);
        EnumC7954 enumC79543 = EnumC7954.STRICT;
        c44268.c(enumC79543);
        C6292 p4 = c44268.p(enumC17126, c8409);
        g = p4;
        C4426 c44269 = new C4426();
        c44269.a(p4);
        c44269.o();
        c44269.d('[');
        EnumC7954 enumC79544 = EnumC7954.SENSITIVE;
        c44269.c(enumC79544);
        C8556 c8556 = C4426.h;
        c44269.c(new C22065(c8556, "ZoneRegionId()"));
        c44269.d(']');
        c44269.p(enumC17126, c8409);
        C4426 c442610 = new C4426();
        c442610.a(p3);
        c442610.o();
        c442610.c(c3721);
        c442610.o();
        c442610.d('[');
        c442610.c(enumC79544);
        c442610.c(new C22065(c8556, "ZoneRegionId()"));
        c442610.d(']');
        c442610.p(enumC17126, c8409);
        C4426 c442611 = new C4426();
        c442611.c(enumC7954);
        c442611.m(enumC18496, 4, 10, enumC23476);
        c442611.d('-');
        c442611.l(EnumC18496.DAY_OF_YEAR, 3);
        c442611.o();
        c442611.c(c3721);
        c442611.p(enumC17126, c8409);
        C4426 c442612 = new C4426();
        c442612.c(enumC7954);
        c442612.m(AbstractC22024.c, 4, 10, enumC23476);
        c442612.e("-W");
        c442612.l(AbstractC22024.b, 2);
        c442612.d('-');
        EnumC18496 enumC184967 = EnumC18496.DAY_OF_WEEK;
        c442612.l(enumC184967, 1);
        c442612.o();
        c442612.c(c3721);
        c442612.p(enumC17126, c8409);
        C4426 c442613 = new C4426();
        c442613.c(enumC7954);
        c442613.c(new C9366());
        h = c442613.p(enumC17126, null);
        C4426 c442614 = new C4426();
        c442614.c(enumC7954);
        c442614.l(enumC18496, 4);
        c442614.l(enumC184962, 2);
        c442614.l(enumC184963, 2);
        c442614.o();
        c442614.c(enumC79542);
        c442614.g("+HHMMss", "Z");
        c442614.c(enumC79543);
        c442614.p(enumC17126, c8409);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        C4426 c442615 = new C4426();
        c442615.c(enumC7954);
        c442615.c(enumC79542);
        c442615.o();
        c442615.h(enumC184967, hashMap);
        c442615.e(", ");
        c442615.n();
        c442615.m(enumC184963, 1, 2, EnumC23476.NOT_NEGATIVE);
        c442615.d(' ');
        c442615.h(enumC184962, hashMap2);
        c442615.d(' ');
        c442615.l(enumC18496, 4);
        c442615.d(' ');
        c442615.l(enumC184964, 2);
        c442615.d(':');
        c442615.l(enumC184965, 2);
        c442615.o();
        c442615.d(':');
        c442615.l(enumC184966, 2);
        c442615.n();
        c442615.d(' ');
        c442615.g("+HHMM", "GMT");
        c442615.p(EnumC17126.SMART, c8409);
    }

    public C6292(C17832 c17832, Locale locale, EnumC17126 enumC17126, InterfaceC2765 interfaceC2765) {
        C1604 c1604 = C1604.a;
        this.a = (C17832) C11003.requireNonNull(c17832, "printerParser");
        this.b = (Locale) C11003.requireNonNull(locale, "locale");
        this.c = (C1604) C11003.requireNonNull(c1604, "decimalStyle");
        this.d = (EnumC17126) C11003.requireNonNull(enumC17126, "resolverStyle");
        this.e = interfaceC2765;
    }

    public String format(InterfaceC2268 interfaceC2268) {
        StringBuilder sb = new StringBuilder(32);
        C17832 c17832 = this.a;
        C11003.requireNonNull(interfaceC2268, "temporal");
        C11003.requireNonNull(sb, "appendable");
        try {
            c17832.l(new C10071(interfaceC2268, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C16232(e.getMessage(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0328, code lost:
    
        if (((java.util.HashMap) r1.a).containsKey(l.EnumC18496.SECOND_OF_MINUTE) != false) goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C16420 a(java.lang.CharSequence r23) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6292.a(java.lang.CharSequence):l.ܽۙᩴ");
    }

    public final String toString() {
        String c17832 = this.a.toString();
        return c17832.startsWith("[") ? c17832 : c17832.substring(1, c17832.length() - 1);
    }
}
