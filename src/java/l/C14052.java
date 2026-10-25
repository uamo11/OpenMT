package l;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: N673 */
/* renamed from: l.ܰ᩶ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C14052 {
    public static final ConcurrentMapC10942 a = new ConcurrentMapC10942(16, 0.75f, 2);
    public static final C5837 b = new C5837();
    public static final C14052 c = new C14052();

    public String c(InterfaceC10030 interfaceC10030, long j, EnumC20655 enumC20655, Locale locale) {
        Object a2 = a(interfaceC10030, locale);
        if (a2 instanceof C11937) {
            return ((C11937) a2).a(j, enumC20655);
        }
        return null;
    }

    public String b(InterfaceC2765 interfaceC2765, InterfaceC10030 interfaceC10030, long j, EnumC20655 enumC20655, Locale locale) {
        if (interfaceC2765 == C8409.c || !(interfaceC10030 instanceof EnumC18496)) {
            return c(interfaceC10030, j, enumC20655, locale);
        }
        return null;
    }

    public Iterator e(InterfaceC10030 interfaceC10030, EnumC20655 enumC20655, Locale locale) {
        List list;
        Object a2 = a(interfaceC10030, locale);
        if (!(a2 instanceof C11937) || (list = (List) ((HashMap) ((C11937) a2).b).get(enumC20655)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(InterfaceC2765 interfaceC2765, InterfaceC10030 interfaceC10030, EnumC20655 enumC20655, Locale locale) {
        if (interfaceC2765 == C8409.c || !(interfaceC10030 instanceof EnumC18496)) {
            return e(interfaceC10030, enumC20655, locale);
        }
        return null;
    }

    public static Object a(InterfaceC10030 interfaceC10030, Locale locale) {
        Object obj;
        String substring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(interfaceC10030, locale);
        ConcurrentMapC10942 concurrentMapC10942 = a;
        V v = concurrentMapC10942.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap hashMap = new HashMap();
        if (interfaceC10030 == EnumC18496.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j = i;
                    hashMap2.put(Long.valueOf(j), eras[i]);
                    Long valueOf = Long.valueOf(j);
                    String str = eras[i];
                    hashMap3.put(valueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(EnumC20655.FULL, hashMap2);
                hashMap.put(EnumC20655.SHORT, hashMap2);
                hashMap.put(EnumC20655.NARROW, hashMap3);
            }
            obj = new C11937(hashMap);
        } else if (interfaceC10030 == EnumC18496.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j2 = 1; j2 <= length; j2++) {
                String i2 = AbstractC16169.i(j2, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j2), i2);
                linkedHashMap2.put(Long.valueOf(j2), i2.substring(0, Character.charCount(i2.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j2), AbstractC16169.i(j2, "LLL", locale));
            }
            if (length > 0) {
                hashMap.put(EnumC20655.FULL_STANDALONE, linkedHashMap);
                hashMap.put(EnumC20655.NARROW_STANDALONE, linkedHashMap2);
                hashMap.put(EnumC20655.SHORT_STANDALONE, linkedHashMap3);
                hashMap.put(EnumC20655.FULL, linkedHashMap);
                hashMap.put(EnumC20655.NARROW, linkedHashMap2);
                hashMap.put(EnumC20655.SHORT, linkedHashMap3);
            }
            obj = new C11937(hashMap);
        } else if (interfaceC10030 == EnumC18496.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j3 = 1; j3 <= length2; j3++) {
                String h = AbstractC16169.h(j3, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j3), h);
                Long valueOf2 = Long.valueOf(j3);
                if (!z) {
                    substring = h.substring(0, Character.charCount(h.codePointAt(0)));
                } else {
                    substring = new StringBuilder().appendCodePoint(h.codePointBefore(h.length())).toString();
                }
                linkedHashMap5.put(valueOf2, substring);
                linkedHashMap6.put(Long.valueOf(j3), AbstractC16169.h(j3, "ccc", locale));
            }
            if (length2 > 0) {
                hashMap.put(EnumC20655.FULL_STANDALONE, linkedHashMap4);
                hashMap.put(EnumC20655.NARROW_STANDALONE, linkedHashMap5);
                hashMap.put(EnumC20655.SHORT_STANDALONE, linkedHashMap6);
                hashMap.put(EnumC20655.FULL, linkedHashMap4);
                hashMap.put(EnumC20655.NARROW, linkedHashMap5);
                hashMap.put(EnumC20655.SHORT, linkedHashMap6);
            }
            obj = new C11937(hashMap);
        } else if (interfaceC10030 == EnumC18496.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i3 = 0; i3 < amPmStrings.length; i3++) {
                if (!amPmStrings[i3].isEmpty()) {
                    long j4 = i3;
                    hashMap4.put(Long.valueOf(j4), amPmStrings[i3]);
                    Long valueOf3 = Long.valueOf(j4);
                    String str2 = amPmStrings[i3];
                    hashMap5.put(valueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(EnumC20655.FULL, hashMap4);
                hashMap.put(EnumC20655.SHORT, hashMap4);
                hashMap.put(EnumC20655.NARROW, hashMap5);
            }
            obj = new C11937(hashMap);
        } else {
            obj = "";
        }
        concurrentMapC10942.putIfAbsent(simpleImmutableEntry, obj);
        return concurrentMapC10942.get(simpleImmutableEntry);
    }
}
