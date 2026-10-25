package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: A451 */
/* renamed from: l.ۡۧ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8837 extends C6720 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f26915;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8837(C22406 c22406, C12364 c12364) {
        super(c22406, EnumC1296.f4569, "inapplicable symbols", c12364);
        this.f26915 = c22406;
    }

    @Override // l.C6720, l.AbstractC5473
    /* renamed from: ֫ */
    public final C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26092) {
        boolean z;
        Map m22831;
        EnumSet noneOf;
        Map m228312 = m22831();
        C22406 c22406 = this.f26915;
        C6136 c6136 = c22406.f72594;
        z = c22406.f72577;
        if (z) {
            m22831 = m22829(m228312);
        } else {
            m22831 = m22831();
        }
        if (m22831.isEmpty()) {
            m22831 = m228312;
        }
        boolean z2 = ((HashMap) m228312).size() != m22831.size();
        if (m22831.size() > 1) {
            C5931 c5931 = c22406.f72607;
            if (z2) {
                noneOf = EnumSet.of(EnumC20043.COMPRESSED);
            } else {
                noneOf = EnumSet.noneOf(EnumC20043.class);
            }
            C16719 m16618 = c5931.m16618(enumC12986, noneOf, c22406.f72598.m7266(), interfaceC3109, abstractC10370 == c6136.f18879 ? EnumC8352.CONSTRUCTOR : this.f17559.m4389(), abstractC10370 == c6136.f18879 ? abstractC4308.f13890.f17562 : abstractC10370, c22406.m50298(c2609));
            C2609 m8239 = C2609.m8239();
            for (Map.Entry entry : m22831.entrySet()) {
                AbstractC5698 abstractC56982 = (AbstractC5698) entry.getKey();
                C5931 c59312 = c22406.f72607;
                C6319 c6319 = c22406.f72597;
                EnumC8352 m49076 = C21758.m49076(abstractC56982);
                AbstractC5698 m16078 = abstractC56982.m16078(abstractC4308, c6319);
                AbstractC5698 mo10960 = abstractC56982.mo10960(abstractC4308, c6319);
                C16719 c16719 = (C16719) entry.getValue();
                C11576 c11576 = C11886.f35440;
                m8239 = m8239.m8246(c59312.m16617(new C11576("compiler", "inapplicable.method", m49076, m16078, mo10960, c16719)));
            }
            return new C22864(m16618, m8239);
        }
        if (m22831.size() == 1) {
            Map.Entry entry2 = (Map.Entry) m22831.entrySet().iterator().next();
            C16719 mo4076 = new C20832(this, this.f20861, new C23069((AbstractC5698) entry2.getKey(), (C16719) entry2.getValue())).mo4076(enumC12986, interfaceC3109, abstractC5698, abstractC4308, abstractC10370, c2609, c26092);
            if (z2) {
                mo4076.m39351(EnumC20043.COMPRESSED);
            }
            return mo4076;
        }
        return new C8295(c22406, EnumC1296.f4574).mo4076(enumC12986, interfaceC3109, abstractC5698, abstractC4308, abstractC10370, c2609, c26092);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public Map m22831() {
        C2609 c2609;
        C9543 c9543 = new C9543(this);
        c2609 = this.f20861.f37058;
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C13069 c13069 = (C13069) it.next();
            boolean m31667 = c13069.m31667();
            AbstractC5698 abstractC5698 = c13069.f39142;
            if (!m31667) {
                C22406 c22406 = c9543.f28945.f26915;
                C18837 c18837 = new C18837();
                Iterator it2 = c9543.keySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        AbstractC5698 abstractC56982 = (AbstractC5698) it2.next();
                        if (abstractC56982 != abstractC5698) {
                            if (abstractC5698.mo10962(abstractC56982, (AbstractC19810) abstractC56982.f17561, c22406.f72597, false)) {
                                c18837.m43511(abstractC56982);
                            } else if (abstractC56982.mo10962(abstractC5698, (AbstractC19810) abstractC5698.f17561, c22406.f72597, false)) {
                                break;
                            }
                        }
                    } else {
                        Iterator it3 = c18837.iterator();
                        while (it3.hasNext()) {
                            c9543.remove((AbstractC5698) it3.next());
                        }
                        c9543.put(abstractC5698, c13069.f39139);
                    }
                }
            }
        }
        return c9543;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m22829(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C16719 c16719 = (C16719) entry.getValue();
            String m48696 = EnumC21537.ARITY_MISMATCH.m48696();
            C7425[] c7425Arr = new C7425[0];
            Object[] m39354 = c16719.m39354();
            if (c16719.mo29298().matches(m48696) && c16719.m39354().length == 0) {
                for (int i = 0; i < m39354.length; i++) {
                    if (c7425Arr[i].mo19958(m39354[i])) {
                    }
                }
            }
            linkedHashMap.put((AbstractC5698) entry.getKey(), c16719);
        }
        return linkedHashMap;
    }

    @Override // l.C6720
    /* renamed from: ᩹֫ */
    public final C23069 mo1315() {
        LinkedHashMap m22829 = m22829(m22831());
        if (m22829.size() == 1) {
            return new C23069((AbstractC5698) m22829.keySet().iterator().next(), (C16719) m22829.values().iterator().next());
        }
        return null;
    }
}
