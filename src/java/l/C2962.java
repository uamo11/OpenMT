package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: U5KR */
/* renamed from: l.ۗۗۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2962 extends AbstractC7195 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Comparator f9408 = new C4373();

    @Override // l.AbstractC7195
    /* renamed from: ֫ */
    public final void mo6106(InterfaceC13544 interfaceC13544) {
        ((C12839) interfaceC13544).f38582 = true;
    }

    @Override // l.AbstractC7195
    /* renamed from: ܽ */
    public final void mo6109() {
        HashSet hashSet = new HashSet(this.f22035.size() / 2);
        C5784 c5784 = new C5784();
        c5784.addAll(this.f22035);
        while (!c5784.isEmpty()) {
            C12839 c12839 = (C12839) c5784.poll();
            if (c12839.f38582 && !hashSet.contains(c12839)) {
                hashSet.add(c12839);
                C12839 c128392 = c12839.f38585;
                if (c128392 != null && !c128392.f38582) {
                    c128392.f38582 = true;
                    c5784.add(c128392);
                }
                ArrayList arrayList = c12839.f38583;
                if (arrayList != null && arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C12839 c128393 = (C12839) it.next();
                        if (c128393 != null && !c128393.f38582) {
                            c128393.f38582 = true;
                            c5784.add(c128393);
                        }
                    }
                    c12839.f38583 = null;
                }
            }
        }
        Iterator it2 = this.f22035.iterator();
        while (it2.hasNext()) {
            ((C12839) it2.next()).f38585 = null;
        }
        this.f22035 = null;
    }

    @Override // l.InterfaceC0179
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C12839[] mo1319(C12839[] c12839Arr, C12839[] c12839Arr2, AbstractC1591 abstractC1591, AbstractC1591 abstractC15912) {
        boolean z;
        C12839 c12839;
        C12839 c128392;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        if (abstractC15912.f5638 == EnumC7690.LABEL && (arrayList = ((C13334) abstractC15912).f39897) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C21802 c21802 = (C21802) it.next();
                hashMap.put(Integer.valueOf(((C18274) c21802.f42444).f56817), c21802);
            }
        }
        if (c12839Arr2 == null) {
            c12839Arr2 = (C12839[]) m19278();
            for (int i = 0; i < c12839Arr2.length; i++) {
                if (!hashMap.containsKey(Integer.valueOf(i)) && (c128392 = c12839Arr[i]) != null) {
                    C12839 c128393 = new C12839(0);
                    this.f22035.add(c128393);
                    c128393.f38585 = c128392;
                    c128393.f38580 = c128392.f38580 + 1;
                    c128393.f38581 = c128392.f38581;
                    c12839Arr2[i] = c128393;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (int i2 = 0; i2 < c12839Arr2.length; i2++) {
                if (!hashMap.containsKey(Integer.valueOf(i2))) {
                    C12839 c128394 = c12839Arr[i2];
                    C12839 c128395 = c12839Arr2[i2];
                    if (c128394 != null && c128395 != null) {
                        if (c128395.f38583 == null) {
                            c128395.f38583 = new ArrayList(5);
                        }
                        c128395.f38583.add(c128394);
                    }
                }
            }
        }
        for (C21802 c218022 : hashMap.values()) {
            C18274 c18274 = (C18274) c218022.f42444;
            if (z) {
                c12839 = new C12839(0);
                c12839.f38581 = c18274;
                c12839.f38584 = new HashMap();
                c12839Arr2[c18274.f56817] = c12839;
            } else {
                c12839 = c12839Arr2[c18274.f56817];
            }
            ArrayList arrayList2 = new ArrayList();
            C12839 c128396 = c12839Arr[c18274.f56817];
            if (c128396 != null) {
                arrayList2.add(c128396);
            }
            for (AbstractC8396 abstractC8396 : c218022.f42445.mo15838()) {
                C12839 c128397 = c12839Arr[((C18274) abstractC8396).f56817];
                if (c128397 != null) {
                    arrayList2.add(c128397);
                }
            }
            Collections.sort(arrayList2, f9408);
            C12839 c128398 = (C12839) arrayList2.get(0);
            c128398.f38582 = true;
            c12839.f38584.put(abstractC1591, c128398.f38581);
        }
        return c12839Arr2;
    }

    @Override // l.AbstractC7195
    /* renamed from: ֫ */
    public final InterfaceC13544[] mo6107(int i) {
        return new C12839[i];
    }

    @Override // l.AbstractC7195
    /* renamed from: ܿ */
    public final InterfaceC13544 mo6110() {
        return new C12839(0);
    }

    @Override // l.AbstractC7195
    /* renamed from: ֫ */
    public final InterfaceC13544 mo6105(C18274 c18274, AbstractC8396 abstractC8396) {
        C12839 c12839 = (C12839) super.mo6105(c18274, abstractC8396);
        c12839.f38581 = c18274;
        c12839.f38582 = true;
        return c12839;
    }
}
