package l;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: 014Q */
/* renamed from: l.ۧ۬֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11008 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f33112;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f33113;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f33114;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f33115;

    public C11008(C1109 c1109) {
        ArrayList arrayList;
        C22714 c22714;
        int i;
        int mo3818 = c1109.mo3818();
        Collection mo3817 = c1109.mo3817();
        List<C16631> mo3811 = c1109.mo3811();
        this.f33112 = new ArrayList();
        this.f33114 = 0;
        this.f33113 = 0;
        this.f33115 = mo3818;
        if (((AbstractCollection) mo3817).isEmpty()) {
            throw new IllegalArgumentException();
        }
        C22714 c227142 = new C22714(this, "B0", mo3818);
        Iterator it = ((AbstractList) mo3817).iterator();
        int i2 = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = c227142.f73393;
            if (!hasNext) {
                break;
            }
            AbstractC7479 abstractC7479 = (AbstractC7479) it.next();
            if (!((AbstractCollection) abstractC7479.m20099().m37705()).isEmpty()) {
                if (arrayList.isEmpty()) {
                    c227142.f73391 = true;
                } else if (!c227142.f73391 && arrayList.size() == 1 && ((AbstractC7479) arrayList.get(0)).mo3975() == EnumC0841.f3065) {
                    arrayList.clear();
                    c227142.f73391 = true;
                } else {
                    this.f33112.add(c227142);
                    C22714 c227143 = new C22714(this, "B" + i2, mo3818);
                    c227143.f73391 = true;
                    c227142.m50748(c227143, false);
                    c227143.m50747(c227142);
                    c227142 = c227143;
                    i2++;
                }
            }
            c227142.f73393.add(abstractC7479);
            if (abstractC7479.mo3975().m3132()) {
                int i3 = C1835.f6280[abstractC7479.mo3975().f3316.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    c227142.f73381 = ((AbstractC1815) abstractC7479).m6037().m40668();
                    this.f33112.add(c227142);
                    StringBuilder sb = new StringBuilder("B");
                    i = i2 + 1;
                    sb.append(i2);
                    c22714 = new C22714(this, sb.toString(), mo3818);
                    c227142.m50748(c22714, false);
                    c22714.m50747(c227142);
                } else if (i3 == 3 && (abstractC7479.mo3975() == EnumC0841.f3293 || abstractC7479.mo3975() == EnumC0841.f3201)) {
                    c227142.f73395 = ((AbstractC1815) abstractC7479).m6037().m40668();
                    this.f33112.add(c227142);
                    StringBuilder sb2 = new StringBuilder("B");
                    i = i2 + 1;
                    sb2.append(i2);
                    c22714 = new C22714(this, sb2.toString(), mo3818);
                    c227142.m50748(c22714, false);
                    c22714.m50747(c227142);
                }
                c227142 = c22714;
                i2 = i;
            } else {
                if (abstractC7479 instanceof InterfaceC7155) {
                    c227142.f73381 = ((AbstractC1815) abstractC7479).m6037().m40668();
                }
                this.f33112.add(c227142);
                c227142 = new C22714(this, "B" + i2, mo3818);
                i2++;
            }
        }
        if (!arrayList.isEmpty()) {
            this.f33112.add(c227142);
        }
        HashMap hashMap = new HashMap(this.f33112.size());
        Iterator it2 = this.f33112.iterator();
        while (it2.hasNext()) {
            C22714 c227144 = (C22714) it2.next();
            hashMap.put(Integer.valueOf(c227144.m50749().m20099().m37699()), c227144);
        }
        Iterator it3 = this.f33112.iterator();
        while (it3.hasNext()) {
            C22714 c227145 = (C22714) it3.next();
            int i4 = c227145.f73381;
            ArrayList arrayList2 = c227145.f73393;
            if (i4 != -1) {
                C22714 c227146 = (C22714) hashMap.get(Integer.valueOf(i4));
                c227146 = c227146 == null ? (C22714) hashMap.get(Integer.valueOf(c227145.f73381 + 1)) : c227146;
                if (c227146 == null) {
                    throw new RuntimeException("Block not found: address " + Integer.toHexString(c227145.f73381) + ", " + Integer.toHexString(c227145.m50749().m20099().m37699()) + ", " + Integer.toHexString(((AbstractC7479) C18566.m43105(arrayList2, 1)).m20099().m37699()));
                }
                c227146.m50747(c227145);
                c227145.m50748(c227146, false);
            } else {
                int i5 = c227145.f73395;
                if (i5 == -1) {
                    continue;
                } else {
                    C22714 c227147 = (C22714) hashMap.get(Integer.valueOf(i5));
                    if (c227147 == null) {
                        throw new RuntimeException("Block not found: address " + c227145.f73395);
                    }
                    if (!c227147.f73392.startsWith("Switch_")) {
                        c227147.f73392 = "Switch_" + c227147.f73392;
                    }
                    c227147.m50747(c227145);
                    c227145.m50748(c227147, false);
                    int m37699 = ((AbstractC7479) C18566.m43105(arrayList2, 1)).m20099().m37699();
                    InterfaceC17301 interfaceC17301 = (InterfaceC17301) c227147.f73393.get(0);
                    C11003.requireNonNull(interfaceC17301);
                    Iterator it4 = interfaceC17301.mo8107().iterator();
                    while (it4.hasNext()) {
                        int mo12019 = ((InterfaceC18007) it4.next()).mo12019() + m37699;
                        C22714 c227148 = (C22714) hashMap.get(Integer.valueOf(mo12019));
                        if (c227148 == null) {
                            throw new RuntimeException(C19370.m44628(mo12019, "Block not found: address "));
                        }
                        c227148.m50747(c227147);
                        c227147.m50748(c227148, false);
                    }
                }
            }
        }
        for (C16631 c16631 : mo3811) {
            AbstractC13828 abstractC13828 = c16631.f51073;
            C22714 c227149 = (C22714) hashMap.get(Integer.valueOf(abstractC13828.m33182().m40668()));
            c227149 = c227149 == null ? (C22714) hashMap.get(Integer.valueOf(abstractC13828.m33182().m40668() + 1)) : c227149;
            if (c227149 == null) {
                throw new RuntimeException("Block not found: address " + abstractC13828.m33182().m40668());
            }
            if (!c227149.f73392.startsWith("Catch_")) {
                c227149.f73392 = "Catch_" + c227149.f73392;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                if (intValue >= c16631.f51074.m40668() && intValue < c16631.f51072.m40668()) {
                    C22714 c2271410 = (C22714) entry.getValue();
                    c2271410.m50748(c227149, true);
                    c227149.m50747(c2271410);
                }
            }
        }
        hashMap.clear();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27346() {
        int i = this.f33115;
        boolean[] zArr = new boolean[i];
        Arrays.fill(zArr, true);
        C13541 c13541 = new C13541(this, zArr);
        ArrayList arrayList = this.f33112;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C22714) it.next()).f73393.iterator();
            while (it2.hasNext()) {
                C12836.m31223((AbstractC7479) it2.next(), true, c13541);
            }
        }
        boolean z = arrayList.size() > 40;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C22714 c22714 = (C22714) it3.next();
            c22714.getClass();
            HashSet hashSet = new HashSet();
            TreeSet treeSet = c22714.f73385;
            treeSet.clear();
            TreeSet treeSet2 = c22714.f73383;
            treeSet2.clear();
            c22714.f73390.clear();
            C10015 c10015 = new C10015(c22714, hashSet);
            Iterator it4 = c22714.f73393.iterator();
            while (it4.hasNext()) {
                C12836.m31223((AbstractC7479) it4.next(), false, c10015);
            }
            treeSet2.removeAll(treeSet);
        }
        if (!z && arrayList.size() > 10) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C22714 c227142 = (C22714) it5.next();
                if (c227142.f73394.isEmpty()) {
                    c227142.m50745();
                }
            }
        }
        boolean[] zArr2 = new boolean[i];
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            C22714 c227143 = (C22714) it6.next();
            ArrayList arrayList2 = c227143.f73394;
            ArrayList arrayList3 = c227143.f73393;
            if (arrayList2.isEmpty()) {
                Arrays.fill(zArr2, true);
            } else if (z) {
                System.arraycopy(zArr, 0, zArr2, 0, i);
            } else {
                Arrays.fill(zArr2, true);
                Iterator it7 = ((TreeSet) c227143.m50751()).iterator();
                while (it7.hasNext()) {
                    zArr2[((Integer) it7.next()).intValue()] = false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    if (zArr[i2]) {
                        zArr2[i2] = true;
                    }
                }
            }
            HashSet hashSet2 = new HashSet();
            Iterator it8 = c227143.f73382.iterator();
            while (it8.hasNext()) {
                hashSet2.addAll(((C22714) it8.next()).m50752());
            }
            C7192 c7192 = new C7192(this, zArr2, hashSet2);
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                AbstractC7479 abstractC7479 = (AbstractC7479) arrayList3.get(size);
                C12836.m31223(abstractC7479, true, c7192);
                abstractC7479.m20099().m37701((boolean[]) zArr2.clone());
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m27347() {
        return this.f33112;
    }
}
