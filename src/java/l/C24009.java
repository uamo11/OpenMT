package l;

import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: E29Y */
/* renamed from: l.᩻᩺ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C24009 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && !c2450.m7923();
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        String name;
        c2450.m7907("local");
        C16560 m7919 = c2450.m7919();
        boolean z = !m7919.m39038() && m7919.m39035("local");
        boolean anyMatch = C5378.stream(c2450.m7909()).anyMatch(new C18282(0));
        String str = "";
        if (c2450.m7918() == 1) {
            InterfaceC17889 m7913 = c2450.m7913();
            if (m7913.isDirectory()) {
                name = m7913.getName();
            } else {
                name = m7913.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    String substring = name.substring(0, lastIndexOf);
                    str = name.substring(lastIndexOf);
                    name = substring;
                }
            }
        } else {
            name = C16999.m39866(c2450.m7926(), new String[0]).getName();
        }
        C22266 c22266 = new C22266(c2450.m7917(), z, m7919, c2450);
        c22266.m47062(name, str);
        c22266.m47061(c2450.m7918(), anyMatch, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52847(C0994 c0994, C2450 c2450, boolean z) {
        c0994.m3475("compressToAnother", z);
        if (z) {
            c0994.m3479(c2450);
        } else {
            c0994.m3486(c2450);
        }
        c0994.m3469();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1764 m52845(AbstractC3817 abstractC3817, String[] strArr, boolean z) {
        C1764 c1764 = new C1764();
        c1764.m5892(strArr, z, new C20150(abstractC3817));
        return c1764;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52848(AbstractC3817 abstractC3817, String[] strArr, List list, int i) {
        String m46728;
        List list2 = (List) C5378.stream(list).map(new C8155(0)).collect(C22976.toList());
        try {
            ArrayList m52843 = m52843(list, new C20177());
            boolean z = i > 1;
            if (z) {
                abstractC3817.m11536(R.string.MT_Protector_res_0x7f12087d);
                abstractC3817.mo11538(0);
                if (abstractC3817 instanceof AbstractC22366) {
                    ((AbstractC22366) abstractC3817).m50129(0);
                }
            }
            for (String str : strArr) {
                if (!m52850(str, list2)) {
                    AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
                    try {
                        if (m39866.mo31568()) {
                            m46728 = m52842(m39866.mo23554());
                        } else {
                            m46728 = C20402.m46728(m39866.mo23554());
                        }
                        if (!m52850(m46728, m52843)) {
                            if (z) {
                                abstractC3817.mo11520(m39866.getName());
                            }
                            EnumC16580 m39083 = EnumC16580.m39083(m39866.mo23113());
                            if (m39866.mo23552()) {
                                m39083.m39085(str);
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52842(String str) {
        String m39859 = C16999.m39859(str);
        if (m39859 != null) {
            return new File(C16293.f50120.mo23554(), m39859).getPath();
        }
        return C16999.m39887(str) ? C16293.f50120.mo23554() : str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m52843(List list, C20177 c20177) {
        ArrayList arrayList = new ArrayList(list.size());
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15440 = (AbstractC15440) it.next();
            if (abstractC15440.mo31568()) {
                arrayList.add(m52842(abstractC15440.mo23554()));
            } else {
                String parent = abstractC15440.getParent();
                if (parent == null) {
                    arrayList.add(C20402.m46728(abstractC15440.mo23554()));
                } else {
                    String str = (String) hashMap.get(parent);
                    if (str == null) {
                        str = C20402.m46728(parent);
                        hashMap.put(parent, str);
                    }
                    arrayList.add(new File(str, abstractC15440.getName()).getPath());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52850(final String str, List list) {
        if (C16999.m39887(str) || C16999.m39877(str)) {
            return C5378.stream(list).anyMatch(new C16020(str, 1));
        }
        final String concat = str.endsWith("/") ? str : str.concat("/");
        return C5378.stream(list).anyMatch(new Predicate() { // from class: l.ܶۨܳ
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
                String str2 = (String) obj;
                return str2.equals(str) || str2.startsWith(concat);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m52844(List list) {
        return (List) C5378.stream(list).map(new C7680(0)).collect(C22976.toList());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52849(C17222 c17222, boolean z, boolean z2, C16560 c16560, C16560 c165602, List list) {
        if (c17222.m40526() && z2) {
            if (z) {
                c16560 = c165602;
            }
            c16560.m39041();
            c16560.m39000((Collection) list);
            c16560.m39015();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52846(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC15440) it.next()).mo27929();
        }
    }
}
