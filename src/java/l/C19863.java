package l;

import com.alipay.sdk.m.y.q;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: EAUD */
/* renamed from: l.᩶֫ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19863 implements InterfaceC16602, InterfaceC19157 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C19863 f64142 = new C19863();

    @Override // l.InterfaceC16602
    /* renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        Date date;
        char[] charArray;
        C6725 c6725 = c5751.f17696;
        TimeZone timeZone = c5751.f17701;
        Locale locale = c5751.f17700;
        if (obj == null) {
            c6725.m18296();
            return;
        }
        if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                c6725.write("new Date(");
                c6725.m18301(((Date) obj).getTime());
                c6725.write(41);
                return;
            }
            c6725.write(123);
            c6725.m18299("@type", false);
            c5751.m16189(obj.getClass().getName());
            c6725.write(44);
            c6725.m18299("val", false);
            c6725.m18301(((Date) obj).getTime());
            c6725.write(q.h);
            return;
        }
        if (obj instanceof Calendar) {
            date = ((Calendar) obj).getTime();
        } else {
            date = (Date) obj;
        }
        if ((c6725.f20878 & EnumC20837.WriteDateUseDateFormat.f67472) != 0) {
            DateFormat m16191 = c5751.m16191();
            if (m16191 == null) {
                m16191 = new SimpleDateFormat(AbstractC5206.f16310, locale);
                m16191.setTimeZone(timeZone);
            }
            c6725.m18297(m16191.format(date));
            return;
        }
        long time = date.getTime();
        int i = c6725.f20878;
        if ((EnumC20837.UseISO8601DateFormat.f67472 & i) != 0) {
            EnumC20837 enumC20837 = EnumC20837.UseSingleQuotes;
            if ((i & enumC20837.f67472) != 0) {
                c6725.write(39);
            } else {
                c6725.write(34);
            }
            Calendar calendar = Calendar.getInstance(timeZone, locale);
            calendar.setTimeInMillis(time);
            int i2 = calendar.get(1);
            int i3 = calendar.get(2) + 1;
            int i4 = calendar.get(5);
            int i5 = calendar.get(11);
            int i6 = calendar.get(12);
            int i7 = calendar.get(13);
            int i8 = calendar.get(14);
            if (i8 != 0) {
                charArray = "0000-00-00T00:00:00.000".toCharArray();
                C6725.m18295(i8, 23, charArray);
                C6725.m18295(i7, 19, charArray);
                C6725.m18295(i6, 16, charArray);
                C6725.m18295(i5, 13, charArray);
                C6725.m18295(i4, 10, charArray);
                C6725.m18295(i3, 7, charArray);
                C6725.m18295(i2, 4, charArray);
            } else if (i7 == 0 && i6 == 0 && i5 == 0) {
                charArray = "0000-00-00".toCharArray();
                C6725.m18295(i4, 10, charArray);
                C6725.m18295(i3, 7, charArray);
                C6725.m18295(i2, 4, charArray);
            } else {
                charArray = "0000-00-00T00:00:00".toCharArray();
                C6725.m18295(i7, 19, charArray);
                C6725.m18295(i6, 16, charArray);
                C6725.m18295(i5, 13, charArray);
                C6725.m18295(i4, 10, charArray);
                C6725.m18295(i3, 7, charArray);
                C6725.m18295(i2, 4, charArray);
            }
            c6725.write(charArray);
            if ((c6725.f20878 & enumC20837.f67472) != 0) {
                c6725.write(39);
                return;
            } else {
                c6725.write(34);
                return;
            }
        }
        c6725.m18301(time);
    }

    @Override // l.InterfaceC19157
    /* renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        return m45686(c11556, type, (String) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m45686(C11556 c11556, Type type, String str) {
        Object obj;
        Object obj2;
        Date date;
        C7322 c7322 = c11556.f34488;
        int m19646 = c7322.m19646();
        int i = c7322.f22495;
        if (m19646 == 2) {
            Long valueOf = Long.valueOf(c7322.m19632());
            c7322.m19641(16);
            obj = valueOf;
        } else if (m19646 == 4) {
            String m19634 = c7322.m19634();
            c7322.m19641(16);
            obj = m19634;
            if ((i & EnumC13671.AllowISO8601DateFormat.f40811) != 0) {
                C7322 c73222 = new C7322(m19634);
                Object obj3 = m19634;
                if (c73222.m19643(true)) {
                    Calendar calendar = c73222.f22494;
                    if (type == Calendar.class) {
                        return calendar;
                    }
                    obj3 = calendar.getTime();
                }
            }
        } else if (m19646 == 8) {
            c7322.m19638();
            obj = null;
        } else if (m19646 == 12) {
            c7322.m19638();
            if (c7322.m19646() != 4) {
                throw new C15082("syntax error");
            }
            if ("@type".equals(c7322.m19634())) {
                c7322.m19638();
                c11556.m28438(17);
                Class m51836 = c11556.f34495.m51836(c7322.m19634(), i, null);
                if (m51836 != null) {
                    type = m51836;
                }
                c11556.m28438(4);
                c11556.m28438(16);
            }
            c7322.m19635();
            int m196462 = c7322.m19646();
            if (m196462 != 2) {
                throw new C15082("syntax error : ".concat(C19993.m46101(m196462)));
            }
            long m19632 = c7322.m19632();
            c7322.m19638();
            Long valueOf2 = Long.valueOf(m19632);
            c11556.m28438(13);
            obj = valueOf2;
        } else if (c11556.f34490 == 2) {
            c11556.f34490 = 0;
            c11556.m28438(16);
            if (c7322.m19646() != 4) {
                throw new C15082("syntax error");
            }
            if (!"val".equals(c7322.m19634())) {
                throw new C15082("syntax error");
            }
            c7322.m19638();
            c11556.m28438(17);
            Object m28434 = c11556.m28434((Object) null);
            c11556.m28438(13);
            obj = m28434;
        } else {
            obj = c11556.m28434((Object) null);
        }
        if (obj != null) {
            boolean z = obj instanceof Date;
            obj2 = obj;
            if (!z) {
                if (obj instanceof BigDecimal) {
                    date = new Date(((BigDecimal) obj).longValueExact());
                } else if (obj instanceof Number) {
                    date = new Date(((Number) obj).longValue());
                } else {
                    if (!(obj instanceof String)) {
                        throw new C15082("parse error");
                    }
                    String str2 = (String) obj;
                    if (str2.length() != 0) {
                        C7322 c73223 = new C7322(str2);
                        try {
                            if (c73223.m19643(false)) {
                                Calendar calendar2 = c73223.f22494;
                                Date date2 = calendar2;
                                if (type != Calendar.class) {
                                    date2 = calendar2.getTime();
                                }
                                obj2 = date2;
                            } else {
                                c73223.m19640();
                                if (!"0000-00-00".equals(str2) && !"0000-00-00T00:00:00".equalsIgnoreCase(str2) && !"0001-01-01T00:00:00+08:00".equalsIgnoreCase(str2)) {
                                    try {
                                        obj2 = (str != null ? new SimpleDateFormat(str) : c11556.m28436()).parse(str2);
                                    } catch (ParseException unused) {
                                        date = new Date(Long.parseLong(str2));
                                    }
                                }
                            }
                        } finally {
                            c73223.m19640();
                        }
                    }
                }
                obj2 = date;
            }
            if (type != Calendar.class && !(obj2 instanceof Calendar)) {
                Date date3 = (Date) obj2;
                if (date3 == null) {
                    return null;
                }
                Calendar calendar3 = Calendar.getInstance(c7322.f22485, c7322.f22492);
                calendar3.setTime(date3);
                return calendar3;
            }
        }
        obj2 = null;
        return type != Calendar.class ? obj2 : obj2;
    }
}
