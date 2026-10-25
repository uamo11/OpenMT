package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: U75B */
/* renamed from: l.ᩳ֫᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17751 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m41568(C16339 c16339, int i, int i2) {
        StringBuilder m15339 = C5368.m15339("stretch:\n  x: ");
        ArrayList arrayList = c16339.f50302;
        C4499 c4499 = c16339.f50303;
        C4499 c44992 = c16339.f50301;
        m41573(m15339, arrayList);
        m15339.append("\n  y: ");
        m41573(m15339, c16339.f50300);
        m15339.append("\n\n");
        C4499 c44993 = c16339.f50298;
        if (c44993 == null) {
            m15339.append("content: auto");
        } else {
            m15339.append("content:\n  x: ");
            m41574(m15339, c44993);
            m15339.append("\n  y: ");
            m41574(m15339, c16339.f50299);
        }
        m15339.append("\n\n");
        if (c44992.f14318 == 0 && c44992.f14317 == i && c4499.f14318 == 0 && c4499.f14317 == i2) {
            m15339.append("optical: full");
        } else {
            m15339.append("optical:\n  x: ");
            m41574(m15339, c44992);
            m15339.append("\n  y: ");
            m41574(m15339, c4499);
        }
        return m15339.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16339 m41572(int i, int i2, String str) {
        int i3;
        C4499 m41570;
        String[] strArr;
        char c;
        if (str == null || i <= 0 || i2 <= 0) {
            throw m41566();
        }
        boolean[] zArr = new boolean[3];
        String[] split = str.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1);
        String str2 = null;
        int i4 = 0;
        char c2 = 65535;
        String str3 = null;
        boolean z = false;
        String str4 = null;
        String str5 = null;
        boolean z2 = false;
        String str6 = null;
        String str7 = null;
        while (i4 < split.length) {
            String trim = split[i4].trim();
            if (trim.isEmpty()) {
                strArr = split;
            } else {
                int indexOf = trim.indexOf(58);
                if (indexOf <= 0) {
                    throw m41567(i4 + 1);
                }
                strArr = split;
                String trim2 = trim.substring(0, indexOf).trim();
                String trim3 = trim.substring(indexOf + 1).trim();
                trim2.getClass();
                switch (trim2) {
                    case "stretch":
                        c = 0;
                        break;
                    case "optical":
                        c = 2;
                        break;
                    case "content":
                        c = 1;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 65535) {
                    if (zArr[c]) {
                        throw m41567(i4 + 1);
                    }
                    zArr[c] = true;
                    if (trim3.isEmpty()) {
                        c2 = c;
                    } else if (c == 1 && trim3.equals("auto")) {
                        c2 = 65535;
                        z = true;
                    } else {
                        if (c != 2 || !trim3.equals("full")) {
                            throw m41567(i4 + 1);
                        }
                        c2 = 65535;
                        z2 = true;
                    }
                } else {
                    if ((!trim2.equals("x") && !trim2.equals("y")) || trim3.isEmpty() || c2 == 65535) {
                        throw m41567(i4 + 1);
                    }
                    boolean equals = trim2.equals("x");
                    int i5 = i4 + 1;
                    if (c2 == 0) {
                        if ((equals ? str2 : str3) != null) {
                            throw m41567(i5);
                        }
                        if (equals) {
                            str2 = trim3;
                        } else {
                            str3 = trim3;
                        }
                    } else if (c2 == 1) {
                        if ((equals ? str4 : str5) != null) {
                            throw m41567(i5);
                        }
                        if (equals) {
                            str4 = trim3;
                        } else {
                            str5 = trim3;
                        }
                    } else {
                        if ((equals ? str6 : str7) != null) {
                            throw m41567(i5);
                        }
                        if (equals) {
                            str6 = trim3;
                        } else {
                            str7 = trim3;
                        }
                    }
                }
            }
            i4++;
            split = strArr;
        }
        if (zArr[0] && str2 != null && str3 != null && zArr[1] && ((z || (str4 != null && str5 != null)) && zArr[2] && (z2 || (str6 != null && str7 != null)))) {
            ArrayList m41575 = m41575(i, str2);
            ArrayList m415752 = m41575(i2, str3);
            C4499 m415702 = z ? null : m41570(i, str4);
            C4499 m415703 = z ? null : m41570(i2, str5);
            if (z2) {
                i3 = 0;
                m41570 = new C4499(0, i);
            } else {
                i3 = 0;
                m41570 = m41570(i, str6);
            }
            C4499 c4499 = m41570;
            C4499 c44992 = z2 ? new C4499(i3, i2) : m41570(i2, str7);
            if (m415702 != null && (c4499.f14318 > m415702.f14318 || c4499.f14317 < m415702.f14317 || c44992.f14318 > m415703.f14318 || c44992.f14317 < m415703.f14317)) {
                throw m41566();
            }
            if (m41575.size() * 2 > 127 || m415752.size() * 2 > 127) {
                throw m41566();
            }
            if (m41565(m41575, i) * m41565(m415752, i2) <= 127) {
                return new C16339(m41575, m415752, m415702, m415703, c4499, c44992, i, i2);
            }
            throw m41566();
        }
        throw m41566();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41574(StringBuilder sb, C4499 c4499) {
        sb.append(c4499.f14318 + 1);
        sb.append('-');
        sb.append(c4499.f14317 + 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41573(StringBuilder sb, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            sb.append("none");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            m41574(sb, (C4499) arrayList.get(i));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41575(int i, String str) {
        if (str.equals("none")) {
            return new ArrayList();
        }
        String[] split = str.split(",", -1);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (str2.trim().isEmpty()) {
                throw m41566();
            }
            arrayList.add(m41570(i, str2));
        }
        return m41576(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4499 m41570(int i, String str) {
        int indexOf = str.indexOf(45);
        if (indexOf <= 0 || indexOf != str.lastIndexOf(45)) {
            throw m41566();
        }
        int m41564 = m41564(str.substring(0, indexOf).trim());
        int m415642 = m41564(str.substring(indexOf + 1).trim());
        if (m41564 < 1 || m41564 >= m415642 || m415642 > i + 1) {
            throw m41566();
        }
        return new C4499(m41564 - 1, m415642 - 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41564(String str) {
        if (str.isEmpty()) {
            throw m41566();
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                throw m41566();
            }
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw m41566();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41576(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            arrayList.add(c4499 == null ? null : new C4499(c4499.f14318, c4499.f14317));
        }
        Collections.sort(arrayList);
        int i = 0;
        while (i < arrayList.size() - 1) {
            C4499 c44992 = (C4499) arrayList.get(i);
            int i2 = i + 1;
            C4499 c44993 = (C4499) arrayList.get(i2);
            int i3 = c44993.f14318;
            int i4 = c44992.f14317;
            if (i3 <= i4) {
                c44992.f14317 = Math.max(i4, c44993.f14317);
                arrayList.remove(i2);
            } else {
                i = i2;
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4499 m41571(C4499 c4499) {
        if (c4499 == null) {
            return null;
        }
        return new C4499(c4499.f14318, c4499.f14317);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41565(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size() * 2;
        int i2 = size - 1;
        if (((C4499) arrayList.get(0)).f14318 <= 0) {
            size = i2;
        }
        return ((C4499) C18566.m43105(arrayList, 1)).f14317 < i ? size + 1 : size;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m41566() {
        return new IllegalArgumentException("Invalid nine-patch region text");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m41567(int i) {
        return new IllegalArgumentException(C19370.m44628(i, "Invalid nine-patch region text at line "));
    }
}
