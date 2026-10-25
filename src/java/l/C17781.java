package l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: N7FV */
/* renamed from: l.ᩳۗۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17781 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f54392;

    static {
        ArrayList arrayList = new ArrayList(5);
        f54392 = arrayList;
        arrayList.add(new C16369(".ass", "text/x-ssa"));
        arrayList.add(new C16369(".ssa", "text/x-ssa"));
        arrayList.add(new C16369(".srt", "application/x-subrip"));
        arrayList.add(new C16369(".vtt", "text/vtt"));
        arrayList.add(new C16369(".ttml", "application/ttml+xml"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m41660(InterfaceC17889 interfaceC17889, AbstractC13921 abstractC13921) {
        C16369 m41662;
        boolean equals;
        String m41663 = m41663(interfaceC17889.getName());
        final boolean mo13919 = abstractC13921.mo13919();
        ArrayList arrayList = new ArrayList();
        Iterator it = abstractC13921.mo7637(interfaceC17889.getParent(), true).iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC178892 = (InterfaceC17889) it.next();
            if (interfaceC178892.mo36969() && !interfaceC17889.getPath().equals(interfaceC178892.getPath()) && (m41662 = m41662(interfaceC178892.getName())) != null) {
                String m416632 = m41663(interfaceC178892.getName());
                String m38531 = m41662.m38531();
                if (mo13919) {
                    equals = m41663.equalsIgnoreCase(m416632);
                } else {
                    equals = m41663.equals(m416632);
                }
                arrayList.add(new C10726(interfaceC178892, m38531, equals, m41662.m38532()));
            }
        }
        C6083.sort(arrayList, new Comparator() { // from class: l.۟ۙۜ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                C10726 c10726 = (C10726) obj;
                C10726 c107262 = (C10726) obj2;
                if (c10726.m26912() != c107262.m26912()) {
                    return c10726.m26912() ? -1 : 1;
                }
                int compare = Integer.compare(c10726.m26914(), c107262.m26914());
                if (compare != 0) {
                    return compare;
                }
                String name = c10726.m26911().getName();
                boolean z = mo13919;
                if (z) {
                    name = name.toLowerCase(Locale.ROOT);
                }
                String name2 = c107262.m26911().getName();
                if (z) {
                    name2 = name2.toLowerCase(Locale.ROOT);
                }
                int compareTo = name.compareTo(name2);
                return compareTo != 0 ? compareTo : c10726.m26911().getPath().compareTo(c107262.m26911().getPath());
            }
        });
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C10726 c10726 = (C10726) it2.next();
            arrayList2.add(new C1553(c10726.m26911(), c10726.m26913()));
        }
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1553 m41661(List list, InterfaceC17889 interfaceC17889, boolean z) {
        boolean equals;
        String m41663 = m41663(interfaceC17889.getName());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1553 c1553 = (C1553) it.next();
            String m416632 = m41663(c1553.m5311().getName());
            if (z) {
                equals = m41663.equalsIgnoreCase(m416632);
            } else {
                equals = m41663.equals(m416632);
            }
            if (equals) {
                return c1553;
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m41663(String str) {
        String m36487 = AbstractC15440.m36487(str);
        return m36487.isEmpty() ? str : str.substring(0, str.length() - m36487.length());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16369 m41662(String str) {
        String lowerCase = AbstractC15440.m36487(str).toLowerCase(Locale.ROOT);
        ArrayList arrayList = f54392;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C16369 c16369 = (C16369) arrayList.get(i);
            if (c16369.m38533().equals(lowerCase)) {
                return C16369.m38530(c16369, i);
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m41659(String str) {
        C16369 m41662 = m41662(str);
        if (m41662 == null) {
            return null;
        }
        return m41662.m38531();
    }
}
