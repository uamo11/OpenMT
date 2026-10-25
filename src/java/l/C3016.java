package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: l.ۗۙ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3016 extends C1563 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9237(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int m19398;
        C11233.m27805(charSequence, "<this>");
        C11233.m27805(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            m19398 = C7249.m19398(charSequence, charSequence2, 0, charSequence.length(), z, false);
            if (m19398 >= 0) {
                return true;
            }
        } else if (C7249.m19399(2, charSequence, (String) charSequence2, z) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9242(CharSequence charSequence) {
        C11233.m27805(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C0899.m3251(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m9245(String str) {
        C11233.m27805(str, "<this>");
        C22066 c22066 = new C22066(str);
        if (c22066.hasNext()) {
            Object next = c22066.next();
            if (!c22066.hasNext()) {
                return C1913.m6273(next);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(next);
            while (c22066.hasNext()) {
                arrayList.add(c22066.next());
            }
            return arrayList;
        }
        return C8969.f27244;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9248(String str) {
        C11233.m27805(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean m3251 = C0899.m3251(str.charAt(!z ? i : length));
            if (z) {
                if (!m3251) {
                    break;
                }
                length--;
            } else if (m3251) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9239(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9235(String str, String str2, String str3) {
        C11233.m27805(str, "<this>");
        int m19395 = C7249.m19395(0, str, str2, false);
        if (m19395 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, m19395);
            sb.append(str3);
            i2 = m19395 + length;
            if (m19395 >= str.length()) {
                break;
            }
            m19395 = C7249.m19395(m19395 + i, str, str2, false);
        } while (m19395 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        C11233.m27803(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9243(String str, String str2) {
        C11233.m27805(str, "<this>");
        return str.startsWith(str2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m9244(String str, String str2) {
        C11233.m27805(str2, "delimiter");
        int m19399 = C7249.m19399(6, str, str2, false);
        if (m19399 == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + m19399, str.length());
        C11233.m27803(substring, "substring(...)");
        return substring;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9240(String str, String str2, boolean z) {
        C11233.m27805(str, "<this>");
        C11233.m27805(str2, "suffix");
        return !z ? str.endsWith(str2) : C22771.m50848(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m9247(String str) {
        List list;
        int i;
        Comparable comparable;
        String str2;
        C11233.m27805(str, "<this>");
        C22066 c22066 = new C22066(str);
        if (c22066.hasNext()) {
            Object next = c22066.next();
            if (c22066.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c22066.hasNext()) {
                    arrayList.add(c22066.next());
                }
                list = arrayList;
            } else {
                list = C1913.m6273(next);
            }
        } else {
            list = C8969.f27244;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!m9242((CharSequence) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C1913.m6270((Iterable) arrayList2));
        Iterator it = arrayList2.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (!C0899.m3251(str3.charAt(i))) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                i = str3.length();
            }
            arrayList3.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        list.size();
        int m6271 = C1913.m6271(list);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str4 = (String) obj2;
            if ((i == 0 || i == m6271) && m9242((CharSequence) str4)) {
                str2 = null;
            } else {
                C11233.m27805(str4, "<this>");
                if (intValue < 0) {
                    throw new IllegalArgumentException(C18307.m42645(intValue, "Requested character count ", " is less than zero.").toString());
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
                C11233.m27803(str2, "substring(...)");
            }
            if (str2 != null) {
                arrayList4.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length2);
        C20964.m47783(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m9246(CharSequence charSequence) {
        C11233.m27805(charSequence, "<this>");
        return charSequence.length() > 0 && C0899.m3252(charSequence.charAt(0), '\t', false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9238(String str) {
        C11233.m27805(str, "<this>");
        return str.length() > 0 && C0899.m3252(str.charAt(C7249.m19396(str)), '/', false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m9241(String str) {
        return str.lastIndexOf(46, C7249.m19396(str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m9236(String str, char[] cArr) {
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int m19395 = C7249.m19395(0, str, valueOf, false);
            if (m19395 == -1) {
                return C1913.m6273(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(str.subSequence(i, m19395).toString());
                i = valueOf.length() + m19395;
                m19395 = C7249.m19395(i, str, valueOf, false);
            } while (m19395 != -1);
            arrayList.add(str.subSequence(i, str.length()).toString());
            return arrayList;
        }
        C19245 c19245 = new C19245(new C21361(str, new C13598(cArr)));
        ArrayList arrayList2 = new ArrayList(C1913.m6270((Iterable) c19245));
        Iterator it = c19245.iterator();
        while (it.hasNext()) {
            C4882 c4882 = (C4882) it.next();
            C11233.m27805(c4882, "range");
            arrayList2.add(str.subSequence(c4882.getFirst(), c4882.getLast() + 1).toString());
        }
        return arrayList2;
    }
}
