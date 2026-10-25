package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* compiled from: B7EO */
/* renamed from: l.ܶܶۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15308 {
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m36334(C18090 c18090) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c18090.m42210().iterator();
        while (it.hasNext()) {
            String name = ((C3545) it.next()).getName();
            if (m36331(name)) {
                arrayList.add(name);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            String m24404 = C9523.m24404(str);
            String m244042 = C9523.m24404(m24404);
            boolean z = true;
            boolean z2 = !m244042.startsWith("base-master") || "base-master.apk".equals(m244042);
            if (!"base.apk".equals(m24404) && !"base-master.apk".equals(m24404)) {
                z = false;
            }
            arrayList3.add(new C8254(str, z2, z));
        }
        C6083.sort(arrayList3, new C1198());
        return arrayList3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36328(ArrayList arrayList, boolean[] zArr) {
        ArrayList arrayList2 = new ArrayList();
        int min = Math.min(arrayList.size(), zArr.length);
        for (int i = 0; i < min; i++) {
            if (zArr[i]) {
                arrayList2.add(((C8254) arrayList.get(i)).m21840());
            }
        }
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36330(C18090 c18090, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(list);
        ArrayList m36329 = m36329(c18090);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(list);
        String m36327 = m36327(m36329);
        if (m36327 != null) {
            linkedHashSet2.add(m36327);
        }
        ArrayList arrayList = new ArrayList(linkedHashSet2);
        if (arrayList.size() > linkedHashSet.size()) {
            return arrayList;
        }
        String m363272 = m36327(m36329(c18090));
        if (m363272 == null) {
            ArrayList arrayList2 = new ArrayList();
            for (C3545 c3545 : c18090.m42210()) {
                if (m36331(c3545.getName())) {
                    arrayList2.add(c3545);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    m363272 = null;
                    break;
                }
                C3545 c35452 = (C3545) it.next();
                if (m36332(c35452, c18090)) {
                    m363272 = c35452.getName();
                    break;
                }
                continue;
            }
        }
        if (m363272 != null) {
            linkedHashSet.add(m363272);
        }
        return new ArrayList(linkedHashSet);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m36333(C18090 c18090) {
        int next;
        boolean z;
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null) {
            return false;
        }
        XmlResourceParserC10269 m35994 = C15206.m35978(c18090.m42193(entry, (C19277) null)).m35994();
        do {
            try {
                next = m35994.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    z = true;
                    break;
                }
            } catch (Throwable th) {
                try {
                    m35994.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } while (next != 3);
        z = false;
        if (z && "manifest".equals(m35994.getName())) {
            int attributeCount = m35994.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                if ("split".equals(m35994.getAttributeName(i))) {
                    m35994.close();
                    return false;
                }
            }
            m35994.close();
            return true;
        }
        m35994.close();
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36331(String str) {
        return str.toLowerCase(Locale.ROOT).endsWith(".apk");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36329(C18090 c18090) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c18090.m42210().iterator();
        while (it.hasNext()) {
            String name = ((C3545) it.next()).getName();
            if (m36331(name)) {
                arrayList.add(name);
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36332(C3545 c3545, C18090 c18090) {
        C18090 c180902;
        AbstractC15440 abstractC15440 = null;
        try {
            if (c3545.m10767() == 0) {
                c180902 = c18090.m42204(c3545);
            } else {
                abstractC15440 = C16293.f50111.m36535(".apk");
                abstractC15440.m36493(c18090.m42189(c3545));
                c180902 = new C18090(abstractC15440);
            }
            try {
                boolean m36333 = m36333(c180902);
                c180902.close();
                return m36333;
            } finally {
            }
        } finally {
            if (abstractC15440 != null) {
                abstractC15440.mo23552();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36327(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("base.apk".equals(C9523.m24404(str))) {
                return str;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if ("base-master.apk".equals(C9523.m24404(str2))) {
                return str2;
            }
        }
        return null;
    }
}
