package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: C7P7 */
/* renamed from: l.᩶ۧۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20122 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19854 m46376(C19854 c19854, Collection collection) {
        if (!c19854.m45667().isEmpty()) {
            final C22267 m45659 = c19854.m45659(collection);
            AbstractC4628 listIterator = c19854.m45667().listIterator(0);
            C3923 m11959 = C3923.m11959();
            while (listIterator.hasNext()) {
                C22238 m46377 = m46377(listIterator);
                if (!m46377.m49946() && C5378.stream(m46377.m49941()).allMatch(new Predicate() { // from class: l.ܶۧۖ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return C22267.this.mo3775(Integer.valueOf(((C21265) ((InterfaceC21438) obj).mo48557()).getIndex()));
                    }
                })) {
                    ArrayList arrayList = new ArrayList();
                    int m49942 = m46377.m49942();
                    arrayList.add(m46377);
                    int i = -1;
                    while (listIterator.hasNext()) {
                        C22238 m463772 = m46377(listIterator);
                        if (m463772.m49946()) {
                            break;
                        }
                        arrayList.add(m463772);
                        i = m463772.m49940();
                    }
                    AbstractC10232 m25861 = AbstractC10232.m25861();
                    m25861.getClass();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (true) {
                            if (it.hasNext()) {
                                Object next2 = it.next();
                                if (m25861.compare(next, next2) > 0) {
                                    ArrayList m25864 = AbstractC10232.m25861().m25864(arrayList);
                                    StringBuilder sb = new StringBuilder();
                                    for (int i2 = 0; i2 < m25864.size(); i2++) {
                                        if (i2 > 0) {
                                            AbstractC4628 listIterator2 = ((C22238) arrayList.get(i2)).m49944().listIterator(0);
                                            while (listIterator2.hasNext()) {
                                                sb.append(((InterfaceC15086) listIterator2.next()).getText());
                                            }
                                        }
                                        sb.append(((C22238) m25864.get(i2)).m49945());
                                        if (i2 < m25864.size() - 1) {
                                            AbstractC4628 listIterator3 = ((C22238) arrayList.get(i2)).m49943().listIterator(0);
                                            while (listIterator3.hasNext()) {
                                                sb.append(((InterfaceC15086) listIterator3.next()).getText());
                                            }
                                        }
                                    }
                                    m11959.m11962(C13758.m33067(Integer.valueOf(m49942), Integer.valueOf(i)), sb.toString());
                                } else {
                                    next = next2;
                                }
                            }
                        }
                    }
                }
            }
            Map m11963 = m11959.m11963();
            if (!((AbstractMap) m11963).isEmpty()) {
                StringBuilder sb2 = new StringBuilder(c19854.m45663());
                for (Map.Entry entry : m11963.entrySet()) {
                    C13758 c13758 = (C13758) entry.getKey();
                    sb2.replace(((Integer) c13758.m33075()).intValue(), ((Integer) c13758.m33077()).intValue(), (String) entry.getValue());
                }
                return new C19854(sb2.toString());
            }
        }
        return c19854;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22238 m46377(Iterator it) {
        InterfaceC21438 interfaceC21438 = (InterfaceC21438) it.next();
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        c1846.m16264(interfaceC21438);
        if (!((C21265) interfaceC21438.mo48557()).getText().equals("non")) {
            AbstractC14545 m6131 = c1846.m6131();
            return new C22238(m6131, m46374(m6131));
        }
        if (!it.hasNext()) {
            return new C22238(AbstractC14545.of(), null);
        }
        InterfaceC21438 interfaceC214382 = (InterfaceC21438) it.next();
        c1846.m16264(interfaceC214382);
        if (!((C21265) interfaceC214382.mo48557()).getText().equals("-") || !it.hasNext()) {
            return new C22238(AbstractC14545.of(), null);
        }
        c1846.m16264((InterfaceC21438) it.next());
        AbstractC14545 m61312 = c1846.m6131();
        return new C22238(m61312, m46374(m61312));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC2113 m46374(AbstractC14545 abstractC14545) {
        if (abstractC14545.size() == 1) {
            return m46375((InterfaceC21438) abstractC14545.get(0));
        }
        EnumC2113 m46375 = m46375((InterfaceC21438) C8882.m22955(abstractC14545));
        if (m46375 == null) {
            return null;
        }
        return EnumC2113.valueOf("NON_" + m46375.name());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC2113 m46375(InterfaceC21438 interfaceC21438) {
        EnumC19920 m48283 = ((C21265) interfaceC21438.mo48557()).m48283();
        if (m48283 != null) {
            switch (C21533.f69213[m48283.ordinal()]) {
                case 1:
                    return EnumC2113.f7050;
                case 2:
                    return EnumC2113.f7052;
                case 3:
                    return EnumC2113.f7055;
                case 4:
                    return EnumC2113.f7060;
                case 5:
                    return EnumC2113.f7061;
                case 6:
                    return EnumC2113.f7058;
                case 7:
                    return EnumC2113.f7049;
                case 8:
                    return EnumC2113.f7047;
                case 9:
                    return EnumC2113.f7053;
                case 10:
                    return EnumC2113.f7051;
                case 11:
                    return EnumC2113.f7048;
                case 12:
                    return EnumC2113.f7057;
            }
        }
        String text = ((C21265) interfaceC21438.mo48557()).getText();
        text.getClass();
        if (text.equals("sealed")) {
            return EnumC2113.valueOf("SEALED");
        }
        return null;
    }
}
