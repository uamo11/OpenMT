package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: A4XC */
/* renamed from: l.᩷۬ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20889 extends AbstractC10494 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47719(C5637 c5637, HashMap hashMap) {
        HashSet hashSet;
        Iterator it = hashMap.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C18274) it.next()).f56817 = i;
            i++;
        }
        ArrayList arrayList = new ArrayList();
        C14996.m35531(c5637.f17411, new C18066(i, arrayList, hashMap));
        HashSet hashSet2 = new HashSet(arrayList.size() / 2);
        C5784 c5784 = new C5784();
        c5784.addAll(arrayList);
        arrayList.clear();
        while (!c5784.isEmpty()) {
            C6777 c6777 = (C6777) c5784.poll();
            if (c6777.f21041 && !hashSet2.contains(c6777)) {
                hashSet2.add(c6777);
                C6777 c67772 = c6777.f21044;
                if (c67772 != null && !c67772.f21041) {
                    c67772.f21041 = true;
                    c5784.add(c67772);
                }
                HashSet hashSet3 = c6777.f21042;
                if (hashSet3 != null) {
                    Iterator it2 = hashSet3.iterator();
                    while (it2.hasNext()) {
                        C6777 c67773 = (C6777) it2.next();
                        if (!c67773.f21041) {
                            c67773.f21041 = true;
                            c5784.add(c67773);
                        }
                    }
                }
            }
        }
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            C6777 c67774 = (C6777) it3.next();
            C23710 c23710 = c67774.f21039;
            C18274 c18274 = c67774.f21040;
            if (c23710.f76777.size() > 1) {
                hashMap.remove(c18274);
            } else {
                C6777 c67775 = c67774.f21044;
                if (c67775 != null && (hashSet = c67774.f21042) != null) {
                    BitSet bitSet = c67775.f21043;
                    Iterator it4 = hashSet.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        } else if (!bitSet.equals(((C6777) it4.next()).f21043)) {
                            hashMap.remove(c18274);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it5 = hashMap.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry entry = (Map.Entry) it5.next();
            C18274 c182742 = (C18274) entry.getKey();
            C23710 c237102 = (C23710) entry.getValue();
            Iterator it6 = c237102.f76777.iterator();
            while (it6.hasNext()) {
                BitSet bitSet2 = ((C6777[]) ((AbstractC1591) it6.next()).f5637)[c182742.f56817].f21043;
                int nextClearBit = bitSet2.nextClearBit(0);
                int i2 = c237102.f76776;
                if (nextClearBit < i2 || bitSet2.nextSetBit(i2) >= 0) {
                    it5.remove();
                    break;
                }
            }
        }
        Iterator it7 = c5637.f17411.iterator();
        while (it7.hasNext()) {
            ((AbstractC1591) it7.next()).f5637 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47720(C5637 c5637) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = c5637.f17415;
        if (arrayList.size() != 0) {
            C14996.m35528(c5637);
            C14996.m35529(c5637, new C17360(hashMap));
            if (hashMap.size() > 0) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = c5637.f17414;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList3 = ((C13334) it.next()).f39897;
                        if (arrayList3 != null) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                C21802 c21802 = (C21802) it2.next();
                                hashSet.add((C18274) c21802.f42444);
                                for (AbstractC8396 abstractC8396 : c21802.f42445.mo15838()) {
                                    hashSet.add((C18274) abstractC8396);
                                }
                            }
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        hashMap.remove((C18274) it3.next());
                    }
                }
            }
        }
        if (hashMap.size() != 0) {
            BitSet bitSet = new BitSet();
            Iterator it4 = hashMap.entrySet().iterator();
            while (it4.hasNext()) {
                C23710 c23710 = (C23710) ((Map.Entry) it4.next()).getValue();
                Iterator it5 = c23710.f76775.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        AbstractC1591 abstractC1591 = (AbstractC1591) it5.next();
                        if (abstractC1591.f5638 == EnumC7690.FILL_ARRAY_DATA) {
                            int length = Array.getLength(((C11987) abstractC1591.mo5444()).f35889);
                            int nextSetBit = bitSet.nextSetBit(0);
                            if (nextSetBit >= 0 && nextSetBit < length) {
                                break;
                            }
                            bitSet.set(0, length);
                        } else {
                            int intValue = ((Number) ((C11987) ((C12692) abstractC1591.mo5445()).f2429).f35889).intValue();
                            if (bitSet.get(intValue)) {
                                break;
                            }
                            bitSet.set(intValue);
                        }
                    } else {
                        int nextClearBit = bitSet.nextClearBit(0);
                        int i = c23710.f76776;
                        if (nextClearBit >= i && bitSet.nextSetBit(i) < 0) {
                        }
                    }
                }
                it4.remove();
                bitSet.clear();
            }
            if (hashMap.size() != 0) {
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((C18274) it6.next()).f56817 = -1;
                }
                if (hashMap.size() < 50) {
                    m47719(c5637, hashMap);
                } else {
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList(50);
                    Iterator it7 = hashMap.entrySet().iterator();
                    while (it7.hasNext()) {
                        for (int i2 = 0; i2 < 50 && it7.hasNext(); i2++) {
                            Map.Entry entry = (Map.Entry) it7.next();
                            hashMap3.put((C18274) entry.getKey(), (C23710) entry.getValue());
                            it7.remove();
                            arrayList4.add((C18274) entry.getKey());
                        }
                        m47719(c5637, hashMap3);
                        Iterator it8 = arrayList4.iterator();
                        while (it8.hasNext()) {
                            ((C18274) it8.next()).f56817 = -1;
                        }
                        arrayList4.clear();
                        hashMap2.putAll(hashMap3);
                        hashMap3.clear();
                    }
                    hashMap.putAll(hashMap2);
                }
                C14996.m35534(c5637);
                if (hashMap.size() != 0) {
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        C18274 c18274 = (C18274) entry2.getKey();
                        C23710 c237102 = (C23710) entry2.getValue();
                        int i3 = c237102.f76776;
                        ArrayList arrayList6 = c237102.f76775;
                        ArrayList arrayList7 = c237102.f76777;
                        AbstractC8396[] abstractC8396Arr = new AbstractC8396[i3];
                        Iterator it9 = arrayList6.iterator();
                        while (it9.hasNext()) {
                            AbstractC1591 abstractC15912 = (AbstractC1591) it9.next();
                            if (abstractC15912.f5638 == EnumC7690.FILL_ARRAY_DATA) {
                                if (((C18274) abstractC15912.mo5445()) == c18274) {
                                    Object obj = ((C11987) abstractC15912.mo5444()).f35889;
                                    int length2 = Array.getLength(obj);
                                    for (int i4 = 0; i4 < length2; i4++) {
                                        abstractC8396Arr[i4] = new C11987(Array.get(obj, i4));
                                    }
                                }
                            } else {
                                C12692 c12692 = (C12692) abstractC15912.mo5445();
                                if (((C18274) c12692.f2428) == c18274) {
                                    int intValue2 = ((Number) ((C11987) c12692.f2429).f35889).intValue();
                                    AbstractC8396 mo5444 = abstractC15912.mo5444();
                                    EnumC1340 enumC1340 = mo5444.f25745;
                                    if (enumC1340 != EnumC1340.LOCAL && enumC1340 != EnumC1340.CONSTANT) {
                                        C18274 c182742 = new C18274(-1);
                                        arrayList.add(c182742);
                                        c5637.f17411.m38666(abstractC15912, C17819.m41744(c182742, mo5444));
                                        mo5444 = c182742;
                                    }
                                    abstractC8396Arr[intValue2] = mo5444;
                                }
                            }
                        }
                        arrayList.remove(c18274);
                        c5637.f17411.m38667(c237102.f76774);
                        Iterator it10 = arrayList6.iterator();
                        while (it10.hasNext()) {
                            c5637.f17411.m38667((AbstractC1591) it10.next());
                        }
                        C16654 c16654 = new C16654(c18274, c237102, abstractC8396Arr, arrayList5);
                        if (arrayList7.size() == 1) {
                            AbstractC1591 abstractC15913 = (AbstractC1591) arrayList7.get(0);
                            if (c5637.f17411.m38663(abstractC15913)) {
                                C14996.m35536(abstractC15913, c16654, false);
                            } else {
                                int size = arrayList5.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    C14996.m35535((AbstractC8396) arrayList5.get(i5), c16654);
                                }
                            }
                        } else if (arrayList7.size() != 0) {
                            throw new RuntimeException("array is used multiple times");
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
