package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: I4RE */
/* renamed from: l.֫۬ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1838 extends AbstractC7195 {
    @Override // l.InterfaceC0179
    /* renamed from: ֫ */
    public final Object mo1319(Object obj, Object obj2, AbstractC1591 abstractC1591, AbstractC1591 abstractC15912) {
        C11011[] c11011Arr = (C11011[]) obj;
        C11011[] c11011Arr2 = (C11011[]) obj2;
        int i = 0;
        if (c11011Arr2 == null) {
            C11011[] c11011Arr3 = new C11011[this.f22038];
            while (i < c11011Arr.length) {
                C11011 c11011 = c11011Arr[i];
                if (c11011 != null) {
                    C11011 c110112 = new C11011();
                    this.f22035.add(c110112);
                    c110112.f33121 = c11011;
                    c11011Arr3[i] = c110112;
                }
                i++;
            }
            return c11011Arr3;
        }
        while (i < c11011Arr.length) {
            C11011 c110113 = c11011Arr[i];
            C11011 c110114 = c11011Arr2[i];
            if (c110113 != null && c110114 != null) {
                ArrayList arrayList = c110114.f33120;
                if (arrayList == null) {
                    arrayList = new ArrayList(3);
                    c110114.f33120 = arrayList;
                }
                arrayList.add(c110113);
            }
            i++;
        }
        return c11011Arr2;
    }

    @Override // l.AbstractC7195
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6106(InterfaceC13544 interfaceC13544) {
        ((C11011) interfaceC13544).f33122 = true;
    }

    @Override // l.AbstractC7195
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6109() {
        HashSet hashSet = new HashSet(this.f22035.size() / 2);
        C5784 c5784 = new C5784();
        Iterator it = this.f22035.iterator();
        while (it.hasNext()) {
            C11011 c11011 = (C11011) it.next();
            if (c11011.f33122) {
                c5784.add(c11011);
                while (!c5784.isEmpty()) {
                    C11011 c110112 = (C11011) c5784.poll();
                    if (c110112.f33122 && !hashSet.contains(c110112)) {
                        hashSet.add(c110112);
                        C11011 c110113 = c110112.f33121;
                        if (c110113 != null && !c110113.f33122) {
                            c110113.f33122 = true;
                            c5784.add(c110113);
                        }
                        ArrayList arrayList = c110112.f33120;
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                C11011 c110114 = (C11011) it2.next();
                                if (!c110114.f33122) {
                                    c110114.f33122 = true;
                                    c5784.add(c110114);
                                }
                            }
                            c110112.f33120 = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m6108() {
        return this.f22038;
    }

    @Override // l.AbstractC7195
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544[] mo6107(int i) {
        return new C11011[i];
    }

    @Override // l.AbstractC7195
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544 mo6105(C18274 c18274, AbstractC8396 abstractC8396) {
        C11011 c11011 = new C11011();
        c11011.f33122 = true;
        return c11011;
    }

    @Override // l.AbstractC7195
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544 mo6110() {
        return new C11011();
    }
}
