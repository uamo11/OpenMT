package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: D1JP */
/* renamed from: l.ۛۖܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5772 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23596 f17745 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f17746 = true;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m16231() {
        return f17746;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23596 m16229() {
        return f17745;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13012 m16228(C13012 c13012, int i, boolean z) {
        EnumSet allOf = EnumSet.allOf(EnumC10006.class);
        f17746 = z;
        f17745 = C23596.f76501;
        C20630 m41737 = C17807.m41737(c13012, i);
        m16230(m41737, allOf);
        C13012 m25214 = C10047.m25214(m41737, false);
        int m40536 = m25214.m31591().m40536();
        f17745.getClass();
        if (m40536 <= 16) {
            return m25214;
        }
        C20630 m417372 = C17807.m41737(c13012, i);
        EnumSet clone = allOf.clone();
        clone.remove(EnumC10006.CONST_COLLECTOR);
        m16230(m417372, clone);
        return C10047.m25214(m417372, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16230(C20630 c20630, EnumSet enumSet) {
        boolean z;
        int i;
        C21480 c21480;
        ArrayList arrayList;
        int i2;
        C16395 c16395;
        C21480 c214802;
        if (enumSet.contains(EnumC10006.MOVE_PARAM_COMBINER)) {
            C12827.m31201(c20630);
        }
        if (enumSet.contains(EnumC10006.SCCP)) {
            C1579.m5398(c20630);
            C6477.m17872(c20630);
            z = false;
        } else {
            z = true;
        }
        if (enumSet.contains(EnumC10006.LITERAL_UPGRADE)) {
            C21295.m48330(c20630);
            C6477.m17872(c20630);
            z = false;
        }
        EnumC10006 enumC10006 = EnumC10006.ESCAPE_ANALYSIS;
        enumSet.remove(enumC10006);
        if (enumSet.contains(enumC10006)) {
            C0832.m3107(c20630);
            C6477.m17872(c20630);
            z = false;
        }
        if (enumSet.contains(EnumC10006.CONST_COLLECTOR)) {
            C14237 c14237 = new C14237();
            int m47186 = c20630.m47186();
            int m471862 = c20630.m47186();
            HashMap hashMap = new HashMap();
            new HashSet();
            int i3 = 0;
            while (true) {
                i = 1;
                if (i3 >= m471862) {
                    break;
                }
                AbstractC14278 m47194 = c20630.m47194(i3);
                if (m47194 != null && m47194.mo29537() != null) {
                    C21480 m34042 = m47194.m34042();
                    InterfaceC1538 m48637 = m34042.m48637();
                    if (m48637.mo5253()) {
                        AbstractC6162 abstractC6162 = (AbstractC6162) m48637;
                        if (m47194.mo29537().m9562() == 56) {
                            m47194 = (AbstractC14278) C18566.m43105(((C16395) c20630.m47190().get(m47194.m34044().m38624().nextSetBit(0))).m38615(), 1);
                        }
                        if (!m47194.mo29543() && !c20630.m47183(m34042)) {
                            Integer num = (Integer) hashMap.get(abstractC6162);
                            if (num == null) {
                                hashMap.put(abstractC6162, 1);
                            } else {
                                hashMap.put(abstractC6162, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                }
                i3++;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 1) {
                    arrayList2.add((AbstractC6162) entry.getKey());
                }
            }
            Collections.sort(arrayList2, new C17766(hashMap));
            int min = Math.min(arrayList2.size(), 5);
            C16395 m47195 = c20630.m47195();
            HashMap hashMap2 = new HashMap(min);
            int i4 = 0;
            while (i4 < min) {
                AbstractC6162 abstractC61622 = (AbstractC6162) arrayList2.get(i4);
                C21480 m48631 = C21480.m48631(c20630.m47193(), abstractC61622);
                C3135 m29855 = C12307.m29855(abstractC61622);
                if (m29855.m9558() == i) {
                    m47195.m38597(new C5252(C12307.m29855(abstractC61622), C10191.f30620, m48631, C20069.f65002, abstractC61622));
                    arrayList = arrayList2;
                    i2 = min;
                    c16395 = m47195;
                    c214802 = m48631;
                } else {
                    C16395 m471952 = c20630.m47195();
                    C16395 m38606 = m471952.m38606();
                    C16395 m38616 = m471952.m38616(m38606);
                    C10191 c10191 = C10191.f30620;
                    C20069 c20069 = C20069.f65002;
                    arrayList = arrayList2;
                    i2 = min;
                    c16395 = m47195;
                    m38616.m38611(new C11602(m29855, c10191, c20069, C13922.f41594, abstractC61622));
                    c214802 = m48631;
                    m38616.m38616(m38606).m38597(new C1018(C12307.m29863(m48631.m48637()), c10191, c214802, c20069));
                }
                hashMap2.put(abstractC61622, c214802);
                i4++;
                m47195 = c16395;
                arrayList2 = arrayList;
                min = i2;
                i = 1;
            }
            new HashSet();
            ArrayList[] m47201 = c20630.m47201();
            for (int i5 = 0; i5 < m47186; i5++) {
                AbstractC14278 m471942 = c20630.m47194(i5);
                if (m471942 != null) {
                    C21480 m340422 = m471942.m34042();
                    InterfaceC1538 m486372 = m471942.m34042().m48637();
                    if (m486372.mo5253() && (c21480 = (C21480) hashMap2.get((AbstractC6162) m486372)) != null && !c20630.m47183(m340422)) {
                        C17060 c17060 = new C17060(c14237, m340422, c21480);
                        Iterator it = m47201[m340422.m48652()].iterator();
                        while (it.hasNext()) {
                            AbstractC14278 abstractC14278 = (AbstractC14278) it.next();
                            if (abstractC14278.mo29543() && abstractC14278.m34044().m38604().cardinality() > 1) {
                            }
                            abstractC14278.mo29539(c17060);
                        }
                    }
                }
            }
            C6477.m17872(c20630);
            z = false;
        }
        if (z) {
            C6477.m17872(c20630);
        }
        C7183.m19201(c20630);
    }
}
