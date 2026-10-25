package l;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: 51RR */
/* renamed from: l.ۡ۠ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8751 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class f26667;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Class f26668;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Method f26669;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f26670;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Method f26671;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22635(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m22641(AbstractC15440 abstractC15440, String str) {
        AbstractC15440 abstractC154402;
        String substring;
        String str2;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Relative path can not be empty.");
        }
        if (str.startsWith("/") || str.endsWith("/")) {
            throw new IllegalArgumentException("Relative path can not start or end with '/': ".concat(str));
        }
        int lastIndexOf = str.lastIndexOf(47);
        int i = -1;
        if (lastIndexOf != -1) {
            String substring2 = str.substring(0, lastIndexOf);
            if (substring2 != null && !substring2.isEmpty()) {
                if (substring2.startsWith("/") || substring2.endsWith("/")) {
                    throw new IllegalArgumentException("Relative path can not start or end with '/': ".concat(substring2));
                }
                if (abstractC15440.mo23120()) {
                    int indexOf = substring2.indexOf(47);
                    int i2 = -1;
                    while (indexOf != -1) {
                        AbstractC15440 m22640 = m22640(substring2.substring(i2 + 1, indexOf), abstractC15440.mo23549(true));
                        if (m22640 == null) {
                            break;
                        }
                        i2 = indexOf;
                        indexOf = substring2.indexOf(47, indexOf + 1);
                        abstractC15440 = m22640;
                    }
                    String substring3 = substring2.substring(i2 + 1);
                    int indexOf2 = substring3.indexOf(47);
                    if (indexOf2 == -1) {
                        AbstractC15440 m226402 = m22640(substring3, abstractC15440.mo23549(true));
                        if (m226402 == null) {
                            m226402 = abstractC15440.m36526(substring3);
                            while (m226402.mo23120()) {
                                StringBuilder m19190 = C7166.m19190(substring3, "-");
                                indexOf2++;
                                m19190.append(indexOf2);
                                m226402 = abstractC15440.m36526(m19190.toString());
                            }
                        }
                        abstractC15440 = m226402;
                    } else {
                        String substring4 = substring3.substring(0, indexOf2);
                        String substring5 = substring3.substring(indexOf2 + 1);
                        AbstractC15440 m226403 = m22640(substring4, abstractC15440.mo23549(true));
                        if (m226403 == null) {
                            m226403 = abstractC15440.m36526(substring4);
                            int i3 = -1;
                            while (m226403.mo23120()) {
                                StringBuilder m191902 = C7166.m19190(substring4, "-");
                                i3++;
                                m191902.append(i3);
                                m226403 = abstractC15440.m36526(m191902.toString());
                            }
                        }
                        abstractC15440 = m226403.m36526(substring5);
                    }
                } else {
                    abstractC15440 = abstractC15440.m36526(substring2);
                }
            }
            str = str.substring(lastIndexOf + 1);
        }
        Iterator it = abstractC15440.mo23549(true).iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC154402 = null;
                break;
            }
            abstractC154402 = (AbstractC15440) it.next();
            if (abstractC154402.mo23119()) {
                String name = abstractC154402.getName();
                if (!name.equals(str)) {
                    int lastIndexOf2 = name.lastIndexOf(46);
                    if (lastIndexOf2 > 0) {
                        int lastIndexOf3 = name.lastIndexOf(46, lastIndexOf2 - 1);
                        if (lastIndexOf3 == -1) {
                            if (m22645(lastIndexOf2 + 1, name.length(), name) && name.substring(0, lastIndexOf2).equals(str)) {
                                break;
                            }
                        } else if (m22645(lastIndexOf3 + 1, lastIndexOf2, name)) {
                            if ((name.substring(0, lastIndexOf3) + name.substring(lastIndexOf2)).equals(str)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            }
        }
        if (abstractC154402 != null) {
            return abstractC154402;
        }
        AbstractC15440 m36526 = abstractC15440.m36526(str);
        int lastIndexOf4 = str.lastIndexOf(46);
        if (lastIndexOf4 == -1) {
            str2 = str.concat(".");
            substring = "";
        } else {
            String substring6 = str.substring(0, lastIndexOf4 + 1);
            substring = str.substring(lastIndexOf4);
            str2 = substring6;
        }
        while (m36526.mo23120()) {
            StringBuilder m15339 = C5368.m15339(str2);
            i++;
            m15339.append(i);
            m15339.append(substring);
            m36526 = abstractC15440.m36526(m15339.toString());
        }
        return m36526;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22642(Context context, C21451 c21451) {
        try {
            c21451.getClass();
            if (C23255.m51569(context, "101492915").m51576("Common_ta_enable")) {
                f26671.invoke(f26667, Boolean.TRUE);
            } else {
                f26671.invoke(f26667, Boolean.FALSE);
            }
        } catch (Exception e) {
            C9145.m23516("OpenConfig", "checkStatStatus exception: " + e.toString());
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m22652(String str) {
        char charAt;
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 < '@') {
                    if (((1 << charAt2) & 4294957567L) != 0) {
                        return true;
                    }
                } else if (charAt2 < 128) {
                    if (charAt2 == 127) {
                        return true;
                    }
                } else if (charAt2 < 8203 || charAt2 > 8303) {
                    if (charAt2 < 55296 || charAt2 > 57343) {
                        if ((charAt2 >= 57344 && charAt2 <= 63743) || charAt2 == 65533 || charAt2 == 65279) {
                            return true;
                        }
                    } else if (charAt2 > 56319 || (i = i + 1) >= length || (charAt = str.charAt(i)) < 56320 || charAt > 57343 || Character.toCodePoint(charAt2, charAt) >= 983040) {
                        return true;
                    }
                } else if (charAt2 <= 8207 || ((charAt2 >= 8232 && charAt2 <= 8239) || charAt2 >= 8288)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22649(Context context, C21451 c21451) {
        try {
            f26667 = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f26668 = cls;
            f26669 = cls.getMethod("reportQQ", Context.class, String.class);
            f26668.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class cls2 = f26668;
            Class<?> cls3 = Integer.TYPE;
            cls2.getMethod("commitEvents", Context.class, cls3);
            Class cls4 = f26667;
            Class<?> cls5 = Boolean.TYPE;
            f26671 = cls4.getMethod("setEnableStatService", cls5);
            m22642(context, c21451);
            f26667.getMethod("setAutoExceptionCaught", cls5).invoke(f26667, Boolean.FALSE);
            f26667.getMethod("setEnableSmartReporting", cls5).invoke(f26667, Boolean.TRUE);
            f26667.getMethod("setSendPeriodMinutes", cls3).invoke(f26667, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f26667.getMethod("setStatSendStrategy", cls6).invoke(f26667, cls6.getField("PERIOD").get(null));
            f26668.getMethod("startStatService", Context.class, String.class, String.class).invoke(f26668, context, "Aqc101492915", Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f26670 = true;
        } catch (Exception e) {
            C9145.m23516("OpenConfig", "start4QQConnect exception: " + e.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22644(int i) {
        switch (Character.getType(i)) {
            default:
                if (i != 36 && i != 43 && i != 94 && i != 96 && i != 124 && i != 126) {
                    switch (i) {
                        case 60:
                        case 61:
                        case 62:
                            break;
                        default:
                            return false;
                    }
                }
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return true;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m22648(C7980 c7980) {
        Iterator it;
        C4967 c4967;
        Iterator it2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = c7980.getMethods().iterator();
        while (it3.hasNext()) {
            InterfaceC18444 interfaceC18444 = (InterfaceC18444) it3.next();
            String m22638 = m22638(interfaceC18444);
            InterfaceC19150 mo3570 = interfaceC18444.mo3570();
            if (mo3570 == null) {
                c4967 = new C4967(0, 0, 0, 0, new ArrayList(), new ArrayList());
                it = it3;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (InterfaceC22677 interfaceC22677 : mo3570.mo3817()) {
                    i++;
                    EnumC0841 mo3975 = interfaceC22677.mo3975();
                    InterfaceC10952 interfaceC10952 = interfaceC22677 instanceof InterfaceC10952 ? (InterfaceC10952) interfaceC22677 : null;
                    InterfaceC8293 reference = interfaceC10952 != null ? interfaceC10952.getReference() : null;
                    if (interfaceC10952 != null && mo3975.f3318 == 0 && (reference instanceof InterfaceC15347)) {
                        i2++;
                        String string = ((InterfaceC15347) reference).getString();
                        if (linkedHashSet.size() < 5 && string != null && !string.isEmpty() && string.codePointCount(0, string.length()) <= 80) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= string.length()) {
                                    it2 = it3;
                                    linkedHashSet.add(string);
                                    break;
                                }
                                int codePointAt = string.codePointAt(i5);
                                it2 = it3;
                                if (codePointAt == 10 || codePointAt == 13 || Character.isISOControl(codePointAt)) {
                                    break;
                                }
                                i5 += Character.charCount(codePointAt);
                                it3 = it2;
                            }
                        } else {
                            it2 = it3;
                        }
                    } else {
                        it2 = it3;
                        if (interfaceC10952 != null && mo3975.f3318 == 2 && (reference instanceof InterfaceC18877)) {
                            InterfaceC18877 interfaceC18877 = (InterfaceC18877) reference;
                            if ("I".equals(interfaceC18877.getType())) {
                                String mo8192 = interfaceC18877.mo8192();
                                if (mo8192.contains("/R$") || mo8192.startsWith("LR$")) {
                                    i3++;
                                }
                            }
                        }
                    }
                    if (interfaceC22677 instanceof InterfaceC9541) {
                        long mo4920 = ((InterfaceC9541) interfaceC22677).mo4920();
                        if (mo4920 >= 0 && mo4920 <= 4294967295L) {
                            int i6 = (int) mo4920;
                            int i7 = (i6 >>> 24) & 255;
                            int i8 = (i6 >>> 16) & 255;
                            if ((i7 == 127 || i7 == 1) && i8 != 0) {
                                i3++;
                            }
                        }
                    }
                    if (mo3975.f3315.startsWith("invoke-")) {
                        i4++;
                        if (reference instanceof InterfaceC5471) {
                            InterfaceC5471 interfaceC5471 = (InterfaceC5471) reference;
                            if (linkedHashSet2.size() < 5) {
                                linkedHashSet2.add(interfaceC5471.mo3566() + "->" + interfaceC5471.getName());
                            }
                        }
                    }
                    it3 = it2;
                }
                it = it3;
                c4967 = new C4967(i, i2, i3, i4, linkedHashSet, linkedHashSet2);
            }
            linkedHashMap.put(m22638, c4967);
            it3 = it;
        }
        return linkedHashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m22639(C7980 c7980) {
        InterfaceC10410 mo11109;
        C21901 c21901;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC3627 interfaceC3627 : c7980.getFields()) {
            int mo11110 = interfaceC3627.mo11110();
            if (EnumC15657.STATIC.m36866(mo11110) && EnumC15657.FINAL.m36866(mo11110) && (mo11109 = interfaceC3627.mo11109()) != null) {
                C11418 c11418 = new C11418();
                try {
                    AbstractC11569.m28462(new C3438(new C22706(c11418)), mo11109);
                    String c114182 = c11418.toString();
                    boolean z = c114182.codePointCount(0, c114182.length()) > 240;
                    if (z) {
                        c114182 = C8163.m21635(0, c114182.length(), 240, c114182);
                    }
                    c21901 = new C21901(c114182, z);
                } catch (IOException unused) {
                    c21901 = null;
                }
                if (c21901 != null) {
                    linkedHashMap.put(interfaceC3627.getName() + ":" + interfaceC3627.getType(), c21901);
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22643(InterfaceC21449 interfaceC21449) {
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m22640(String str, List list) {
        int lastIndexOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            if (abstractC15440.mo23113()) {
                String name = abstractC15440.getName();
                if (name.equals(str) || ((lastIndexOf = name.lastIndexOf(45)) != -1 && m22645(lastIndexOf + 1, name.length(), name) && name.substring(0, lastIndexOf).equals(str))) {
                    return abstractC15440;
                }
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m22651(Context context, C21451 c21451) {
        if (!TextUtils.isEmpty(c21451.m48596())) {
            C7544 m20258 = C7544.m20258();
            String m48596 = c21451.m48596();
            m20258.getClass();
            C7544.m20260(m48596, "101492915", "11", "0");
        }
        if (f26670) {
            m22642(context, c21451);
            if (c21451.m48596() != null) {
                try {
                    f26669.invoke(f26668, context, c21451.m48596());
                } catch (Exception e) {
                    C9145.m23516("OpenConfig", "reportQQ exception: " + e.toString());
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m22650(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22636(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m22646(int i, int i2, CharSequence charSequence) {
        while (i >= i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m22645(int i, int i2, String str) {
        if (i >= i2) {
            return false;
        }
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22638(InterfaceC18444 interfaceC18444) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC18444.getParameters().iterator();
        while (it.hasNext()) {
            sb.append(((InterfaceC0098) it.next()).getType());
        }
        return interfaceC18444.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + interfaceC18444.mo3568();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m22647(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        int lastIndexOf2 = str.lastIndexOf(46, lastIndexOf - 1);
        if (lastIndexOf2 == -1) {
            return m22645(lastIndexOf + 1, str.length(), str) ? str.substring(0, lastIndexOf) : str;
        }
        if (!m22645(lastIndexOf2 + 1, lastIndexOf, str)) {
            return str;
        }
        return str.substring(0, lastIndexOf2) + str.substring(lastIndexOf);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22637(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        return (lastIndexOf == -1 || !m22645(lastIndexOf + 1, str.length(), str)) ? str : str.substring(0, lastIndexOf);
    }
}
