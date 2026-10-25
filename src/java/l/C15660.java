package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: 94T8 */
/* renamed from: l.ܺۗۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15660 extends AbstractC10494 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0225 f48216 = new C0225();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36870(ArrayList arrayList, HashMap hashMap, HashSet hashSet) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C13334) it.next()).f39897.iterator();
                while (it2.hasNext()) {
                    C21802 c21802 = (C21802) it2.next();
                    for (AbstractC8396 abstractC8396 : c21802.f42445.mo15838()) {
                        AbstractC8396 abstractC83962 = (AbstractC8396) hashMap.get(abstractC8396);
                        if (abstractC83962 != null) {
                            hashSet.add(abstractC83962);
                        } else {
                            hashSet.add(abstractC8396);
                        }
                    }
                    hashSet.remove(c21802.f42444);
                    c21802.f42445.mo15835((AbstractC8396[]) hashSet.toArray(new AbstractC8396[0]));
                    hashSet.clear();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36871(Map map) {
        boolean z;
        Object obj;
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C20601());
        for (boolean z2 = true; z2; z2 = z) {
            Iterator it = arrayList.iterator();
            z = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object value = entry.getValue();
                if ((value instanceof C18274) && (obj = map.get(value)) != null && value != obj) {
                    entry.setValue(obj);
                    z = true;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36872(C5637 c5637) {
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC8396[] abstractC8396Arr;
        C8606 c8606;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = c5637.f17414;
        for (AbstractC1591 first = c5637.f17411.getFirst(); first != null; first = first.m5439()) {
            if (first.f5638 == EnumC7690.ASSIGN) {
                C21802 c21802 = (C21802) first;
                EnumC1340 enumC1340 = c21802.f42444.f25745;
                EnumC1340 enumC13402 = EnumC1340.LOCAL;
                if (enumC1340 == enumC13402 && c21802.f42445.f25745 == enumC13402) {
                    arrayList.add(c21802);
                }
            }
        }
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = false;
        while (z5) {
            if (arrayList2 != null) {
                HashSet hashSet2 = new HashSet();
                C0225 c0225 = this.f48216;
                Map map = (Map) c0225.m1479();
                if (map == null) {
                    map = new HashMap();
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((C13334) it.next()).f39897.iterator();
                    while (it2.hasNext()) {
                        C21802 c218022 = (C21802) it2.next();
                        C18274 c18274 = (C18274) c218022.f42444;
                        C8606 c86062 = (C8606) map.get(c18274);
                        if (c86062 == null) {
                            c86062 = new C8606();
                            c86062.f26305 = c18274;
                            map.put(c18274, c86062);
                        }
                        c86062.f26304 = z4;
                        AbstractC8396[] mo15838 = c218022.f42445.mo15838();
                        int length = mo15838.length;
                        boolean z7 = z6;
                        int i = 0;
                        while (i < length) {
                            AbstractC8396 abstractC8396 = mo15838[i];
                            if (abstractC8396 == c18274) {
                                abstractC8396Arr = mo15838;
                            } else {
                                C18274 c182742 = (C18274) abstractC8396;
                                C8606 c86063 = (C8606) map.get(c182742);
                                if (c86063 == null) {
                                    abstractC8396Arr = mo15838;
                                    c8606 = new C8606();
                                    c8606.f26305 = c182742;
                                    map.put(c182742, c8606);
                                } else {
                                    abstractC8396Arr = mo15838;
                                    c8606 = c86063;
                                }
                                c8606.f26303.add(c86062);
                                c86062.f26306.add(c8606);
                            }
                            i++;
                            mo15838 = abstractC8396Arr;
                        }
                        z4 = true;
                        z6 = z7;
                    }
                }
                z = z6;
                C5784 c5784 = new C5784();
                c5784.addAll(map.values());
                while (!c5784.isEmpty()) {
                    C8606 c86064 = (C8606) c5784.poll();
                    Iterator it3 = c86064.f26303.iterator();
                    while (it3.hasNext()) {
                        C8606 c86065 = (C8606) it3.next();
                        if (c86065.f26304 && c86065.f26306.addAll(c86064.f26306)) {
                            c5784.add(c86065);
                        }
                    }
                }
                z2 = false;
                for (C8606 c86066 : map.values()) {
                    if (c86066.f26304) {
                        Iterator it4 = c86066.f26306.iterator();
                        C18274 c182743 = null;
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C8606 c86067 = (C8606) it4.next();
                            if (!c86067.f26304) {
                                if (c182743 != null) {
                                    c182743 = null;
                                    break;
                                }
                                c182743 = c86067.f26305;
                            }
                        }
                        if (c182743 != null) {
                            hashMap.put(c86066.f26305, c182743);
                            hashSet2.add(c86066.f26305);
                            z2 = true;
                        }
                    }
                }
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    C13334 c13334 = (C13334) it5.next();
                    Iterator it6 = c13334.f39897.iterator();
                    while (it6.hasNext()) {
                        if (hashSet2.contains(((C21802) it6.next()).f42444)) {
                            it6.remove();
                        }
                    }
                    if (c13334.f39897.size() == 0) {
                        c13334.f39897 = null;
                        it5.remove();
                    }
                }
                map.clear();
                c0225.m1477(map);
            } else {
                z = z6;
                z2 = false;
            }
            if (z2) {
                m36871(hashMap);
                m36870(arrayList2, hashMap, hashSet);
            }
            while (true) {
                if (arrayList2 != null) {
                    Iterator it7 = arrayList2.iterator();
                    z3 = false;
                    while (it7.hasNext()) {
                        C13334 c133342 = (C13334) it7.next();
                        Iterator it8 = c133342.f39897.iterator();
                        while (it8.hasNext()) {
                            C21802 c218023 = (C21802) it8.next();
                            hashSet.addAll(Arrays.asList(c218023.f42445.mo15838()));
                            hashSet.remove(c218023.f42444);
                            if (hashSet.size() == 1) {
                                it8.remove();
                                hashMap.put((C18274) c218023.f42444, (C18274) hashSet.iterator().next());
                                z3 = true;
                            }
                            hashSet.clear();
                        }
                        if (c133342.f39897.size() == 0) {
                            c133342.f39897 = null;
                            it7.remove();
                        }
                    }
                } else {
                    z3 = false;
                }
                if (!z3) {
                    break;
                }
                m36871(hashMap);
                m36870(arrayList2, hashMap, hashSet);
            }
            z6 = z;
            z5 = false;
            while (true) {
                C16407 c16407 = c5637.f17411;
                HashSet hashSet3 = new HashSet();
                if (arrayList2 != null) {
                    Iterator it9 = arrayList2.iterator();
                    while (it9.hasNext()) {
                        Iterator it10 = ((C13334) it9.next()).f39897.iterator();
                        while (it10.hasNext()) {
                            hashSet3.addAll(Arrays.asList(((C21802) it10.next()).f42445.mo15838()));
                        }
                    }
                }
                Iterator it11 = arrayList.iterator();
                boolean z8 = false;
                while (it11.hasNext()) {
                    C21802 c218024 = (C21802) it11.next();
                    if (!hashSet3.contains(c218024.f42444)) {
                        it11.remove();
                        c16407.m38667(c218024);
                        hashMap.put((C18274) c218024.f42444, (C18274) c218024.f42445);
                        z8 = true;
                    }
                }
                if (z8) {
                    m36871(hashMap);
                    Iterator it12 = arrayList.iterator();
                    while (it12.hasNext()) {
                        C21802 c218025 = (C21802) it12.next();
                        AbstractC8396 abstractC83962 = (AbstractC8396) hashMap.get(c218025.f42445);
                        if (abstractC83962 != null) {
                            c218025.f42445 = abstractC83962;
                        }
                    }
                    z5 = true;
                    z6 = true;
                }
            }
            m36870(arrayList2, hashMap, hashSet);
            z4 = true;
        }
        Iterator it13 = hashMap.keySet().iterator();
        while (it13.hasNext()) {
            c5637.f17415.remove((C18274) it13.next());
            z6 = true;
        }
        if (hashMap.size() > 0) {
            C16407 c164072 = c5637.f17411;
            C9312 c9312 = new C9312(hashMap);
            for (AbstractC1591 first2 = c164072.getFirst(); first2 != null; first2 = first2.m5439()) {
                C14996.m35536(first2, c9312, true);
            }
        }
        return z6;
    }
}
