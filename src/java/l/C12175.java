package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: C5XL */
/* renamed from: l.۫ۙۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12175 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Comparator f36312 = new C3003();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0225 f36314 = new C0225();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0225 f36313 = new C0225(200);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29652(C5637 c5637) {
        C12880[] c12880Arr;
        int i;
        int i2;
        C0225 c0225;
        C12880[] c12880Arr2;
        Iterator it;
        Iterator it2;
        C12880[] c12880Arr3;
        Iterator it3;
        C11011 c11011;
        ArrayList arrayList = c5637.f17415;
        if (arrayList.size() == 0) {
            return;
        }
        C1838 c1838 = new C1838(c5637);
        c1838.m19277();
        int m6108 = c1838.m6108();
        C12880[] c12880Arr4 = new C12880[m6108];
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C18274 c18274 = (C18274) it4.next();
            C12880 c12880 = new C12880();
            char charAt = c18274.f25746.charAt(0);
            if (charAt == '[') {
                charAt = 'L';
            }
            c12880.f38659 = charAt;
            c18274.f25748 = c12880;
            c12880Arr4[c18274.f56817] = c12880;
        }
        if (c5637.f17413) {
            c12880Arr = new C12880[c5637.f17410.length];
        } else {
            c12880Arr = new C12880[c5637.f17410.length + 1];
        }
        HashSet hashSet = new HashSet();
        Iterator it5 = c5637.f17411.iterator();
        while (it5.hasNext()) {
            AbstractC1591 abstractC1591 = (AbstractC1591) it5.next();
            EnumC7690 enumC7690 = abstractC1591.f5638;
            if (enumC7690 == EnumC7690.ASSIGN || enumC7690 == EnumC7690.IDENTITY) {
                if (abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                    C18274 c182742 = (C18274) abstractC1591.mo5445();
                    AbstractC8396 mo5444 = abstractC1591.mo5444();
                    int i3 = c182742.f56817;
                    C12880 c128802 = c12880Arr4[i3];
                    C14996.m35526(abstractC1591, hashSet);
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        C11011[] c11011Arr = (C11011[]) ((AbstractC1591) it6.next()).f5637;
                        if (c11011Arr != null) {
                            for (int i4 = 0; i4 < c11011Arr.length; i4++) {
                                if (i4 != i3 && (c11011 = c11011Arr[i4]) != null && c11011.f33122) {
                                    C12880 c128803 = c12880Arr4[i4];
                                    c128802.f38656.add(c128803);
                                    c128803.f38656.add(c128802);
                                }
                            }
                        }
                    }
                    hashSet.clear();
                    if (mo5444.f25745 == EnumC1340.LOCAL) {
                        C12880 c128804 = c12880Arr4[((C18274) mo5444).f56817];
                        c128802.f38657.add(c128804);
                        c128804.f38657.add(c128802);
                    }
                    EnumC1340 enumC1340 = mo5444.f25745;
                    if (enumC1340 == EnumC1340.THIS_REF) {
                        c12880Arr[0] = c128802;
                    } else if (enumC1340 == EnumC1340.PARAMETER_REF) {
                        int i5 = ((C21097) mo5444).f68038;
                        if (c5637.f17413) {
                            c12880Arr[i5] = c128802;
                        } else {
                            c12880Arr[i5 + 1] = c128802;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < m6108; i6++) {
            C12880 c128805 = c12880Arr4[i6];
            c128805.f38656.remove(c128805);
            c128805.f38657.remove(c128805);
        }
        if (!c5637.f17413) {
            C12880 c128806 = c12880Arr[0];
            for (int i7 = 0; i7 < m6108; i7++) {
                C12880 c128807 = c12880Arr4[i7];
                if (c128807 != c128806) {
                    c128807.f38656.add(c128806);
                    c128806.f38656.add(c128807);
                }
            }
        }
        if (c5637.f17413) {
            i = 0;
            i2 = 0;
        } else {
            c12880Arr[0].f38658 = 0;
            i = 1;
            i2 = 1;
        }
        int i8 = 0;
        while (true) {
            String[] strArr = c5637.f17410;
            if (i8 >= strArr.length) {
                break;
            }
            int i9 = i + 1;
            C12880 c128808 = c12880Arr[i];
            String str = strArr[i8];
            if (c128808 == null) {
                i2++;
            } else {
                c128808.f38658 = i2;
                i2++;
            }
            if ("J".equals(str) || "D".equals(str)) {
                i2++;
            }
            i8++;
            i = i9;
        }
        C0225 c02252 = this.f36314;
        Map map = (Map) c02252.m1479();
        if (map == null) {
            map = new HashMap();
        }
        int i10 = 0;
        while (true) {
            c0225 = this.f36313;
            if (i10 >= m6108) {
                break;
            }
            C12880 c128809 = c12880Arr4[i10];
            char c = c128809.f38659;
            List list = (List) map.get(Character.valueOf(c));
            if (list == null) {
                List list2 = (List) c0225.m1479();
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list = list2;
                map.put(Character.valueOf(c), list);
            }
            list.add(c128809);
            Iterator it7 = c128809.f38656.iterator();
            while (it7.hasNext()) {
                if (((C12880) it7.next()).f38659 != c128809.f38659) {
                    it7.remove();
                }
            }
            Iterator it8 = c128809.f38657.iterator();
            while (it8.hasNext()) {
                if (((C12880) it8.next()).f38659 != c128809.f38659) {
                    it8.remove();
                }
            }
            i10++;
        }
        BitSet bitSet = new BitSet();
        BitSet bitSet2 = new BitSet();
        BitSet bitSet3 = new BitSet();
        BitSet bitSet4 = new BitSet();
        Iterator it9 = map.entrySet().iterator();
        while (it9.hasNext()) {
            Map.Entry entry = (Map.Entry) it9.next();
            List list3 = (List) entry.getValue();
            Collections.sort(list3, f36312);
            char charValue = ((Character) entry.getKey()).charValue();
            boolean z = charValue == 'J' || charValue == 'D';
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                C12880 c1288010 = (C12880) it10.next();
                if (c1288010.f38658 < 0) {
                    bitSet.clear();
                    Iterator it11 = c1288010.f38656.iterator();
                    while (it11.hasNext()) {
                        Iterator it12 = it11;
                        C12880 c1288011 = (C12880) it11.next();
                        Iterator it13 = it9;
                        int i11 = c1288011.f38658;
                        if (i11 >= 0) {
                            bitSet.set(i11);
                            char c2 = c1288011.f38659;
                            it3 = it10;
                            if (c2 == 'J' || c2 == 'D') {
                                bitSet.set(c1288011.f38658 + 1);
                            }
                        } else {
                            it3 = it10;
                        }
                        it9 = it13;
                        it11 = it12;
                        it10 = it3;
                    }
                    it = it9;
                    it2 = it10;
                    int length = c12880Arr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        C12880 c1288012 = c12880Arr[i12];
                        int i13 = length;
                        if (c1288012.f38659 != charValue) {
                            bitSet.set(c1288012.f38658);
                            char c3 = c1288012.f38659;
                            c12880Arr3 = c12880Arr;
                            if (c3 == 'J' || c3 == 'D') {
                                bitSet.set(c1288012.f38658 + 1);
                            }
                        } else {
                            c12880Arr3 = c12880Arr;
                        }
                        i12++;
                        length = i13;
                        c12880Arr = c12880Arr3;
                    }
                    c12880Arr2 = c12880Arr;
                    bitSet.or(bitSet3);
                    bitSet2.clear();
                    Iterator it14 = c1288010.f38657.iterator();
                    while (it14.hasNext()) {
                        int i14 = ((C12880) it14.next()).f38658;
                        if (i14 >= 0) {
                            bitSet2.set(i14);
                        }
                    }
                    int i15 = 0;
                    while (true) {
                        int nextSetBit = bitSet2.nextSetBit(i15);
                        if (nextSetBit < 0) {
                            break;
                        }
                        if (z) {
                            if (!bitSet.get(nextSetBit) && !bitSet.get(nextSetBit + 1)) {
                                c1288010.f38658 = nextSetBit;
                                break;
                            }
                            i15 = nextSetBit + 1;
                        } else {
                            if (!bitSet.get(nextSetBit)) {
                                c1288010.f38658 = nextSetBit;
                                break;
                            }
                            i15 = nextSetBit + 1;
                        }
                    }
                    if (c1288010.f38658 < 0) {
                        if (z) {
                            int i16 = -1;
                            do {
                                i16 = bitSet.nextClearBit(i16 + 1);
                            } while (bitSet.get(i16 + 1));
                            c1288010.f38658 = i16;
                        } else {
                            c1288010.f38658 = bitSet.nextClearBit(0);
                        }
                    }
                } else {
                    c12880Arr2 = c12880Arr;
                    it = it9;
                    it2 = it10;
                }
                bitSet4.set(c1288010.f38658);
                if (z) {
                    bitSet4.set(c1288010.f38658 + 1);
                }
                it9 = it;
                it10 = it2;
                c12880Arr = c12880Arr2;
            }
            bitSet3.or(bitSet4);
            bitSet4.clear();
        }
        Iterator it15 = arrayList.iterator();
        while (it15.hasNext()) {
            C18274 c182743 = (C18274) it15.next();
            c182743.f56817 = ((C12880) c182743.f25748).f38658;
            c182743.f25748 = null;
        }
        Iterator it16 = c5637.f17411.iterator();
        while (it16.hasNext()) {
            ((AbstractC1591) it16.next()).f5637 = null;
        }
        for (List list4 : map.values()) {
            list4.clear();
            c0225.m1477(list4);
        }
        map.clear();
        c02252.m1477(map);
    }
}
