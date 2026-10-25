package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: HBGE */
/* renamed from: l.֨ۖܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0832 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f3007 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f3008;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20630 f3009;

    public C0832(C20630 c20630) {
        this.f3009 = c20630;
        this.f3008 = c20630.m47186();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m3101(C21480 c21480) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3007;
            if (i >= arrayList.size() || ((C0126) arrayList.get(i)).f1238.get(c21480.m48652())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC14278 m3102(AbstractC14278 abstractC14278) {
        return (AbstractC14278) C18566.m43105(((C16395) this.f3009.m47190().get(abstractC14278.m34044().m38624().nextSetBit(0))).m38615(), 1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC14278 m3109(AbstractC14278 abstractC14278) {
        return (AbstractC14278) ((C16395) this.f3009.m47190().get(abstractC14278.m34044().m38604().nextSetBit(0))).m38615().get(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3107(C20630 c20630) {
        Iterator it;
        C0832 c0832 = new C0832(c20630);
        c20630.m47191(new C19178(c0832));
        ArrayList arrayList = c0832.f3007;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0126 c0126 = (C0126) it2.next();
            if (c0126.f1235 != EnumC5066.NONE) {
                Iterator it3 = c0126.f1234.iterator();
                while (it3.hasNext()) {
                    C0126 c01262 = (C0126) it3.next();
                    if (c0126.f1235.compareTo(c01262.f1235) > 0) {
                        c01262.f1235 = c0126.f1235;
                    }
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C0126 c01263 = (C0126) it4.next();
            if (c01263.f1237 && c01263.f1235 == EnumC5066.NONE) {
                int i = 0;
                int nextSetBit = c01263.f1238.nextSetBit(0);
                AbstractC14278 m47194 = c20630.m47194(nextSetBit);
                AbstractC14278 m3102 = c0832.m3102(m47194);
                int mo2231 = ((AbstractC1223) m3102.mo29535().m41004get(0).m48637()).mo2231();
                ArrayList arrayList2 = new ArrayList(mo2231);
                HashSet hashSet = new HashSet();
                C7573 type = m47194.m34042().getType();
                for (int i2 = 0; i2 < mo2231; i2++) {
                    AbstractC1223 m28867 = C11807.m28867(type.m20310());
                    C21480 m48631 = C21480.m48631(c20630.m47193(), m28867);
                    arrayList2.add(m48631);
                    c0832.m3105(m47194, C20069.f65002, m48631, 5, m28867);
                }
                hashSet.add(m3102);
                hashSet.add(m47194);
                for (AbstractC14278 abstractC14278 : c20630.m47199(nextSetBit)) {
                    int size = arrayList2.size();
                    int m9562 = abstractC14278.mo29537().m9562();
                    if (m9562 != 34) {
                        if (m9562 == 57) {
                            ArrayList m47475 = ((C20775) abstractC14278.mo29542()).m47475();
                            int i3 = 0;
                            while (i3 < size) {
                                C21480 m486312 = C21480.m48631(((C21480) arrayList2.get(i3)).m48652(), (InterfaceC1538) m47475.get(i3));
                                C20069 c20069 = C20069.f65002;
                                AbstractC13717 abstractC13717 = (AbstractC13717) m47475.get(i3);
                                ArrayList arrayList3 = m47475;
                                int i4 = i3;
                                c0832.m3105(abstractC14278, c20069, m486312, 5, abstractC13717);
                                arrayList2.set(i4, m486312);
                                i3 = i4 + 1;
                                m47475 = arrayList3;
                                it4 = it4;
                            }
                        } else if (m9562 == 38) {
                            AbstractC14278 m3109 = c0832.m3109(abstractC14278);
                            C20069 mo29535 = abstractC14278.mo29535();
                            int mo22312 = ((AbstractC1223) mo29535.m41004get(1).m48637()).mo2231();
                            if (mo22312 < size) {
                                C21480 c21480 = (C21480) arrayList2.get(mo22312);
                                c0832.m3105(m3109, C20069.m46252(c21480), c21480.m48646(m3109.m34042().m48652()), 2, null);
                            } else {
                                c0832.m3106(m3109, mo29535.m41004get(1), hashSet);
                                hashSet.add((AbstractC14278) m3109.m34044().m38615().get(2));
                            }
                            hashSet.add(m3109);
                        } else if (m9562 == 39) {
                            C20069 mo295352 = abstractC14278.mo29535();
                            int mo22313 = ((AbstractC1223) mo295352.m41004get(2).m48637()).mo2231();
                            if (mo22313 < size) {
                                C21480 m41004get = mo295352.m41004get(i);
                                C21480 m48646 = m41004get.m48646(((C21480) arrayList2.get(mo22313)).m48652());
                                c0832.m3105(abstractC14278, C20069.m46252(m41004get), m48646, 2, null);
                                arrayList2.set(mo22313, m48646.m48648());
                            } else {
                                c0832.m3106(abstractC14278, mo295352.m41004get(2), hashSet);
                            }
                        }
                        it = it4;
                    } else {
                        it = it4;
                        Object m48637 = m3102.mo29535().m41004get(0).m48637();
                        AbstractC14278 m31092 = c0832.m3109(abstractC14278);
                        c0832.m3105(m31092, C20069.f65002, m31092.m34042(), 5, (AbstractC13717) m48637);
                        hashSet.add(m31092);
                    }
                    hashSet.add(abstractC14278);
                    it4 = it;
                    i = 0;
                }
                Iterator it5 = it4;
                c20630.m47175(hashSet);
                c20630.m47184();
                int i5 = c0832.f3008;
                C17807.m41738(i5, c20630);
                for (int i6 = 0; i6 < c20630.m47186(); i6++) {
                    AbstractC14278 m471942 = c20630.m47194(i6);
                    if (m471942 != null && m471942.mo29537() != null && m471942.mo29537().m9562() == 2) {
                        ArrayList[] m47201 = c20630.m47201();
                        C21480 m41004get2 = m471942.mo29535().m41004get(0);
                        C21480 m34042 = m471942.m34042();
                        if (m41004get2.m48652() >= i5 || m34042.m48652() >= i5) {
                            C3655 c3655 = new C3655(c0832, m34042, m41004get2);
                            Iterator it6 = m47201[m34042.m48652()].iterator();
                            while (it6.hasNext()) {
                                ((AbstractC14278) it6.next()).mo29539(c3655);
                            }
                        }
                    }
                }
                it4 = it5;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3103(C0832 c0832, C12122 c12122) {
        C0126 c0126;
        int i = c0832.f3008;
        ArrayList arrayList = c0832.f3007;
        int m9562 = c12122.mo29537().m9562();
        C21480 m34042 = c12122.m34042();
        if (m9562 != 56 || m34042.m48637().mo5255() != 9) {
            if (m9562 == 3 && m34042.m48637().mo5255() == 9) {
                C0126 c01262 = new C0126(m34042.m48652(), i, EnumC5066.NONE);
                arrayList.add(c01262);
                c0832.m3108(m34042, c01262);
                return;
            } else {
                if (m9562 == 55 && m34042.m48637().mo5255() == 9) {
                    C0126 c01263 = new C0126(m34042.m48652(), i, EnumC5066.NONE);
                    arrayList.add(c01263);
                    c0832.m3108(m34042, c01263);
                    return;
                }
                return;
            }
        }
        C21480 m340422 = c12122.m34042();
        AbstractC14278 m3102 = c0832.m3102(c12122);
        int m95622 = m3102.mo29537().m9562();
        if (m95622 != 5) {
            if (m95622 != 38 && m95622 != 45) {
                if (m95622 != 46) {
                    switch (m95622) {
                        case 40:
                            break;
                        case 41:
                        case 42:
                            if (m3102.mo29535().m41004get(0).m48637().mo5253()) {
                                c0126 = new C0126(m340422.m48652(), i, EnumC5066.NONE);
                                c0126.f1237 = true;
                                break;
                            } else {
                                c0126 = new C0126(m340422.m48652(), i, EnumC5066.GLOBAL);
                                break;
                            }
                        case 43:
                            break;
                        default:
                            c0126 = null;
                            break;
                    }
                    c0832.m3108(m34042, c0126);
                }
                c0126 = new C0126(m340422.m48652(), i, EnumC5066.GLOBAL);
                arrayList.add(c0126);
                c0832.m3108(m34042, c0126);
            }
            C21480 m41004get = m3102.mo29535().m41004get(0);
            int m3101 = c0832.m3101(m41004get);
            if (m3101 != arrayList.size()) {
                c0126 = (C0126) arrayList.get(m3101);
                c0126.f1238.set(m340422.m48652());
                c0832.m3108(m34042, c0126);
            } else {
                if (m41004get.getType() == C7573.f23417) {
                    c0126 = new C0126(m340422.m48652(), i, EnumC5066.NONE);
                } else {
                    c0126 = new C0126(m340422.m48652(), i, EnumC5066.GLOBAL);
                }
                arrayList.add(c0126);
                c0832.m3108(m34042, c0126);
            }
        }
        c0126 = new C0126(m340422.m48652(), i, EnumC5066.NONE);
        arrayList.add(c0126);
        c0832.m3108(m34042, c0126);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3108(C21480 c21480, C0126 c0126) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c21480);
        while (!arrayList.isEmpty()) {
            C21480 c214802 = (C21480) C4248.m12790(arrayList, 1);
            for (AbstractC14278 abstractC14278 : this.f3009.m47199(c214802.m48652())) {
                C3135 mo29537 = abstractC14278.mo29537();
                ArrayList arrayList2 = this.f3007;
                if (mo29537 == null) {
                    int m3101 = m3101(abstractC14278.m34042());
                    if (m3101 != arrayList2.size()) {
                        C0126 c01262 = (C0126) arrayList2.get(m3101);
                        if (c01262 != c0126) {
                            c0126.f1237 = false;
                            c0126.f1238.or(c01262.f1238);
                            if (c0126.f1235.compareTo(c01262.f1235) < 0) {
                                c0126.f1235 = c01262.f1235;
                            }
                            Iterator it = c01262.f1236.iterator();
                            while (it.hasNext()) {
                                C0126 c01263 = (C0126) it.next();
                                c01263.f1234.remove(c01262);
                                c01263.f1234.add(c0126);
                                c0126.f1236.add(c01263);
                            }
                            Iterator it2 = c01262.f1234.iterator();
                            while (it2.hasNext()) {
                                C0126 c01264 = (C0126) it2.next();
                                c01264.f1236.remove(c01262);
                                c01264.f1236.add(c0126);
                                c0126.f1234.add(c01264);
                            }
                            arrayList2.remove(m3101);
                        }
                    } else {
                        c0126.f1238.set(abstractC14278.m34042().m48652());
                        arrayList.add(abstractC14278.m34042());
                    }
                } else {
                    int m9562 = abstractC14278.mo29537().m9562();
                    if (m9562 != 2) {
                        if (m9562 != 33 && m9562 != 35) {
                            if (m9562 == 43 || m9562 == 7 || m9562 == 8) {
                                EnumC5066 enumC5066 = c0126.f1235;
                                EnumC5066 enumC50662 = EnumC5066.METHOD;
                                if (enumC5066.compareTo(enumC50662) < 0) {
                                    c0126.f1235 = enumC50662;
                                }
                            } else if (m9562 != 38) {
                                if (m9562 != 39) {
                                    switch (m9562) {
                                        case 48:
                                            c0126.f1235 = EnumC5066.GLOBAL;
                                            break;
                                    }
                                } else if (!abstractC14278.mo29535().m41004get(2).m48637().mo5253()) {
                                    c0126.f1237 = false;
                                }
                                if (abstractC14278.mo29535().m41004get(0).m48637().mo5255() == 9) {
                                    c0126.f1237 = false;
                                    ArrayList arrayList3 = c0126.f1234;
                                    ArrayList arrayList4 = c0126.f1236;
                                    C20069 mo29535 = abstractC14278.mo29535();
                                    if (mo29535.m41004get(0).m48652() == c214802.m48652()) {
                                        int m31012 = m3101(mo29535.m41004get(1));
                                        if (m31012 != arrayList2.size()) {
                                            C0126 c01265 = (C0126) arrayList2.get(m31012);
                                            if (!arrayList4.contains(c01265)) {
                                                arrayList4.add(c01265);
                                            }
                                            if (!c01265.f1234.contains(c0126)) {
                                                c01265.f1234.add(c0126);
                                            }
                                            if (c0126.f1235.compareTo(c01265.f1235) < 0) {
                                                c0126.f1235 = c01265.f1235;
                                            }
                                        }
                                    } else {
                                        int m31013 = m3101(mo29535.m41004get(0));
                                        if (m31013 != arrayList2.size()) {
                                            C0126 c01266 = (C0126) arrayList2.get(m31013);
                                            if (!c01266.f1236.contains(c0126)) {
                                                c01266.f1236.add(c0126);
                                            }
                                            if (!arrayList3.contains(c01266)) {
                                                arrayList3.add(c01266);
                                            }
                                            if (c01266.f1235.compareTo(c0126.f1235) < 0) {
                                                c01266.f1235 = c0126.f1235;
                                            }
                                        }
                                    }
                                }
                            } else if (!abstractC14278.mo29535().m41004get(1).m48637().mo5253()) {
                                c0126.f1237 = false;
                            }
                        }
                        c0126.f1235 = EnumC5066.INTER;
                    } else {
                        c0126.f1238.set(abstractC14278.m34042().m48652());
                        arrayList.add(abstractC14278.m34042());
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3106(AbstractC14278 abstractC14278, C21480 c21480, HashSet hashSet) {
        C12512 c12512 = new C12512(C6663.f20694);
        C20069 c20069 = C20069.f65002;
        m3104(abstractC14278, c20069, 40, c12512);
        C16395 m34044 = abstractC14278.m34044();
        C16395 m38616 = m34044.m38616(m34044.m38606());
        AbstractC14278 abstractC142782 = (AbstractC14278) m38616.m38615().get(0);
        C20630 c20630 = this.f3009;
        C21480 m48631 = C21480.m48631(c20630.m47193(), c12512);
        m3105(abstractC142782, c20069, m48631, 56, null);
        C16395 m386162 = m38616.m38616(m38616.m38606());
        AbstractC14278 abstractC142783 = (AbstractC14278) m386162.m38615().get(0);
        m3104(abstractC142783, C20069.m46250(m48631, c21480), 52, new C22390(c12512, new C20274(new C13217("<init>"), new C13217("(I)V"))));
        hashSet.add(abstractC142783);
        C16395 m386163 = m386162.m38616(m386162.m38606());
        AbstractC14278 abstractC142784 = (AbstractC14278) m386163.m38615().get(0);
        m3104(abstractC142784, C20069.m46252(m48631), 35, null);
        m386163.m38596(m386163.m38623(), c20630.m47196().m38609());
        hashSet.add(abstractC142784);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3105(AbstractC14278 abstractC14278, C20069 c20069, C21480 c21480, int i, AbstractC13717 abstractC13717) {
        C3135 m29854;
        AbstractC15834 c5252;
        AbstractC15834 mo29542 = abstractC14278.mo29542();
        if (i == 56) {
            m29854 = C12307.m29863(c21480.getType());
        } else {
            m29854 = C12307.m29854(i, c21480, c20069, abstractC13717);
        }
        C3135 c3135 = m29854;
        if (abstractC13717 == null) {
            c5252 = new C1018(c3135, mo29542.m37480(), c21480, c20069);
        } else {
            c5252 = new C5252(c3135, mo29542.m37480(), c21480, c20069, abstractC13717);
        }
        C12122 c12122 = new C12122(c5252, abstractC14278.m34044());
        ArrayList m38615 = abstractC14278.m34044().m38615();
        m38615.add(m38615.lastIndexOf(abstractC14278), c12122);
        C20630 c20630 = this.f3009;
        c20630.m47177(c12122, (C20069) null);
        c20630.m47179(c12122, (C21480) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3104(AbstractC14278 abstractC14278, C20069 c20069, int i, AbstractC6162 abstractC6162) {
        AbstractC15834 c11602;
        AbstractC15834 mo29542 = abstractC14278.mo29542();
        C3135 m29854 = C12307.m29854(i, null, c20069, abstractC6162);
        if (abstractC6162 == null) {
            c11602 = new C22890(m29854, mo29542.m37480(), c20069, C13922.f41594);
        } else {
            c11602 = new C11602(m29854, mo29542.m37480(), c20069, C13922.f41594, abstractC6162);
        }
        C12122 c12122 = new C12122(c11602, abstractC14278.m34044());
        ArrayList m38615 = abstractC14278.m34044().m38615();
        m38615.add(m38615.lastIndexOf(abstractC14278), c12122);
        C20630 c20630 = this.f3009;
        c20630.m47177(c12122, (C20069) null);
        c20630.m47179(c12122, (C21480) null);
    }
}
