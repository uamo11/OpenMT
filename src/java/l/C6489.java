package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: I4PY */
/* renamed from: l.ۜۗۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6489 extends AbstractC10494 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0225 f20041 = new C0225();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0225 f20040 = new C0225();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17919(C5637 c5637) {
        boolean z;
        boolean z2;
        ArrayList arrayList;
        C0225 c0225 = this.f20040;
        List list = (List) c0225.m1479();
        C0225 c02252 = this.f20041;
        Map map = (Map) c02252.m1479();
        if (list == null) {
            list = new ArrayList();
        }
        if (map == null) {
            map = new HashMap();
        }
        for (AbstractC1591 first = c5637.f17411.getFirst(); first != null; first = first.m5439()) {
            if (first.f5638 == EnumC7690.ASSIGN) {
                C21802 c21802 = (C21802) first;
                AbstractC8396 abstractC8396 = c21802.f42444;
                EnumC1340 enumC1340 = abstractC8396.f25745;
                EnumC1340 enumC13402 = EnumC1340.LOCAL;
                if (enumC1340 == enumC13402) {
                    AbstractC8396 abstractC83962 = c21802.f42445;
                    EnumC1340 enumC13403 = abstractC83962.f25745;
                    if (enumC13403 == EnumC1340.CONSTANT) {
                        list.add(c21802);
                        map.put((C18274) c21802.f42444, ((C11987) c21802.f42445).f35889);
                    } else if (enumC13403 == enumC13402) {
                        map.put((C18274) abstractC8396, abstractC83962);
                    }
                }
            }
        }
        if (list.size() == 0) {
            list.clear();
            map.clear();
            c0225.m1477(list);
            c02252.m1477(map);
            return false;
        }
        C15660.m36871(map);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = c5637.f17414;
        if (arrayList2 != null) {
            z = false;
            for (boolean z3 = true; z3; z3 = z2) {
                hashSet.clear();
                Iterator it = arrayList2.iterator();
                z2 = false;
                while (it.hasNext()) {
                    C13334 c13334 = (C13334) it.next();
                    ArrayList arrayList3 = c13334.f39897;
                    if (arrayList3 != null) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            C21802 c218022 = (C21802) it2.next();
                            AbstractC8396[] mo15838 = c218022.f42445.mo15838();
                            int length = mo15838.length;
                            ArrayList arrayList4 = arrayList2;
                            Object obj = null;
                            boolean z4 = z;
                            int i = 0;
                            while (i < length) {
                                int i2 = length;
                                Object obj2 = map.get(mo15838[i]);
                                if (obj2 != null) {
                                    if (obj == null) {
                                        obj = obj2;
                                    } else if (!obj.equals(obj2)) {
                                    }
                                    i++;
                                    length = i2;
                                }
                                hashSet.addAll(Arrays.asList(c218022.f42445.mo15838()));
                                z = z4;
                                break;
                            }
                            map.put((C18274) c218022.f42444, obj);
                            if (obj instanceof C18274) {
                                c218022.f42445 = (AbstractC8396) obj;
                            } else {
                                c218022.f42445 = new C11987(obj);
                                list.add(c218022);
                            }
                            it2.remove();
                            c5637.f17411.m38662(c13334, c218022);
                            z2 = true;
                            z = true;
                            arrayList2 = arrayList4;
                        }
                        arrayList = arrayList2;
                        boolean z5 = z;
                        if (c13334.f39897.size() == 0) {
                            it.remove();
                        }
                        z = z5;
                    } else {
                        arrayList = arrayList2;
                    }
                    arrayList2 = arrayList;
                }
            }
        } else {
            z = false;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C21802 c218023 = (C21802) it3.next();
            if (!hashSet.contains(c218023.f42444)) {
                it3.remove();
                c5637.f17411.m38667(c218023);
                c5637.f17415.remove(c218023.f42444);
                z = true;
            }
            hashMap.put((C18274) c218023.f42444, c218023.f42445);
        }
        C16407 c16407 = c5637.f17411;
        C23422 c23422 = new C23422(hashMap);
        for (AbstractC1591 first2 = c16407.getFirst(); first2 != null; first2 = first2.m5439()) {
            C14996.m35536(first2, c23422, false);
        }
        list.clear();
        map.clear();
        c0225.m1477(list);
        c02252.m1477(map);
        return z;
    }
}
