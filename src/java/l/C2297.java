package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: K5RM */
/* renamed from: l.ۖۙۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2297 extends AbstractC10494 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8647 f7421 = new C8647();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8647 f7422 = new C8647();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7562(C5637 c5637) {
        boolean z;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = c5637.f17415;
        if (arrayList.size() == 0) {
            z = false;
        } else {
            int[] iArr = new int[C14996.m35534(c5637)];
            C16407 c16407 = c5637.f17411;
            C3708 c3708 = new C3708(iArr);
            for (AbstractC1591 first = c16407.getFirst(); first != null; first = first.m5439()) {
                C14996.m35527(first, c3708, true);
            }
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = c5637.f17414;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList3 = ((C13334) it.next()).f39897;
                    if (arrayList3 != null) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            C21802 c21802 = (C21802) it2.next();
                            hashSet2.add((C18274) c21802.f42444);
                            for (AbstractC8396 abstractC8396 : c21802.f42445.mo15838()) {
                                hashSet2.add((C18274) abstractC8396);
                            }
                        }
                    }
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it3 = c5637.f17411.iterator();
            boolean z2 = false;
            while (it3.hasNext()) {
                AbstractC1591 abstractC1591 = (AbstractC1591) it3.next();
                if (abstractC1591.f5638 == EnumC7690.ASSIGN && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                    C18274 c18274 = (C18274) abstractC1591.mo5445();
                    if (!hashSet2.contains(c18274) && iArr[c18274.f56817] < 2) {
                        AbstractC8396 mo5444 = abstractC1591.mo5444();
                        if (m7561(mo5444)) {
                            arrayList.remove(c18274);
                            hashMap.put(c18274, mo5444);
                            it3.remove();
                            z2 = true;
                        } else {
                            hashSet.add(abstractC1591);
                        }
                    }
                }
            }
            C20642 c20642 = new C20642(hashMap);
            for (Map.Entry entry : hashMap.entrySet()) {
                AbstractC8396 abstractC83962 = (AbstractC8396) entry.getValue();
                if (abstractC83962.f25745 == EnumC1340.LOCAL) {
                    while (true) {
                        AbstractC8396 abstractC83963 = (AbstractC8396) hashMap.get(abstractC83962);
                        if (abstractC83963 == null) {
                            break;
                        }
                        if (abstractC83963.f25745 != EnumC1340.LOCAL) {
                            abstractC83962 = abstractC83963;
                            break;
                        }
                        abstractC83962 = abstractC83963;
                    }
                    entry.setValue(abstractC83962);
                } else {
                    C14996.m35535(abstractC83962, c20642);
                }
            }
            for (AbstractC1591 first2 = c5637.f17411.getFirst(); first2 != null; first2 = first2.m5439()) {
                C14996.m35536(first2, c20642, false);
            }
            z = z2;
        }
        if (hashSet.size() != 0) {
            C15701 c15701 = new C15701();
            C5784 c5784 = new C5784();
            c5784.addAll(hashSet);
            while (!c5784.isEmpty()) {
                AbstractC1591 abstractC15912 = (AbstractC1591) c5784.poll();
                C18274 c182742 = (C18274) abstractC15912.mo5445();
                AbstractC1591 m5439 = abstractC15912.m5439();
                switch (C9353.f28404[m5439.f5638.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    default:
                        try {
                            m7558(c182742, m5439);
                            throw null;
                            break;
                        } catch (C8647 e) {
                            if (e == f7422) {
                                c15701.f48450 = c182742;
                                c15701.f48451 = abstractC15912.mo5444();
                                arrayList.remove(c182742);
                                c5637.f17411.m38667(abstractC15912);
                                C14996.m35536(m5439, c15701, false);
                                AbstractC1591 m5441 = m5439.m5441();
                                if (m5441 != null && hashSet.contains(m5441)) {
                                    c5784.add(m5441);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        break;
                }
            }
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7558(C18274 c18274, AbstractC1591 abstractC1591) {
        int i = C9353.f28402[abstractC1591.f5633.ordinal()];
        C8647 c8647 = f7421;
        if (i == 1) {
            throw c8647;
        }
        if (i == 2) {
            throw c8647;
        }
        if (i == 3) {
            m7559(c18274, abstractC1591.mo5442());
            throw c8647;
        }
        if (i == 4) {
            C21802 c21802 = (C21802) abstractC1591;
            AbstractC8396 abstractC8396 = c21802.f42444;
            AbstractC8396 abstractC83962 = c21802.f42445;
            int i2 = C9353.f28403[abstractC8396.f25745.ordinal()];
            if (i2 == 1) {
                m7559(c18274, abstractC83962);
                throw c8647;
            }
            if (i2 == 2) {
                m7559(c18274, abstractC8396.mo21997());
            } else if (i2 != 3) {
                if (i2 == 4) {
                    m7559(c18274, abstractC8396.mo2581());
                    m7559(c18274, abstractC8396.mo2583());
                    m7559(c18274, abstractC83962);
                    throw c8647;
                }
                throw c8647;
            }
            m7559(c18274, abstractC83962);
            throw c8647;
        }
        throw c8647;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7559(C18274 c18274, AbstractC8396 abstractC8396) {
        int[] iArr = C9353.f28402;
        EnumC0697 enumC0697 = abstractC8396.f25747;
        EnumC1340 enumC1340 = abstractC8396.f25745;
        int i = iArr[enumC0697.ordinal()];
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                for (AbstractC8396 abstractC83962 : abstractC8396.mo15838()) {
                    m7559(c18274, abstractC83962);
                }
            } else if (i == 3) {
                m7559(c18274, abstractC8396.mo21997());
            } else if (i == 4) {
                m7559(c18274, abstractC8396.mo2581());
                m7559(c18274, abstractC8396.mo2583());
            }
        } else if (c18274.f25745 == EnumC1340.LOCAL && abstractC8396 == c18274) {
            throw f7422;
        }
        if (enumC1340 == EnumC1340.INVOKE_STATIC) {
            C7338 c7338 = ((C11219) abstractC8396).f33657;
            if (c7338.m19700().equals("valueOf") && c7338.m19702().startsWith("Ljava/lang/") && c7338.m19704().length == 1 && c7338.m19704()[0].length() == 1) {
                z = true;
            }
        }
        if (!m7560(enumC1340) && !z) {
            throw f7421;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7560(EnumC1340 enumC1340) {
        int i = C9353.f28403[enumC1340.ordinal()];
        if (i != 1) {
            switch (i) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7561(AbstractC8396 abstractC8396) {
        int[] iArr = C9353.f28402;
        EnumC0697 enumC0697 = abstractC8396.f25747;
        EnumC1340 enumC1340 = abstractC8396.f25745;
        int i = iArr[enumC0697.ordinal()];
        if (i == 1) {
            return m7560(enumC1340);
        }
        if (i != 2) {
            return i == 3 ? m7560(enumC1340) && m7561(abstractC8396.mo21997()) : i == 4 && m7560(enumC1340) && m7561(abstractC8396.mo2581()) && m7561(abstractC8396.mo2583());
        }
        if (enumC1340 != EnumC1340.INVOKE_STATIC) {
            if (m7560(enumC1340)) {
                for (AbstractC8396 abstractC83962 : abstractC8396.mo15838()) {
                    if (m7561(abstractC83962)) {
                    }
                }
            }
        }
        C7338 c7338 = ((C11219) abstractC8396).f33657;
        if (c7338.m19700().equals("valueOf") && c7338.m19702().startsWith("Ljava/lang/") && c7338.m19704().length == 1 && c7338.m19704()[0].length() == 1) {
            for (AbstractC8396 abstractC83963 : abstractC8396.mo15838()) {
                if (m7561(abstractC83963)) {
                }
            }
        }
    }
}
