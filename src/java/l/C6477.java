package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: VBFX */
/* renamed from: l.ۜۖܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6477 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19998;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList[] f19999;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BitSet f20000;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17872(C20630 c20630) {
        ArrayList[] arrayListArr;
        C6477 c6477 = new C6477(c20630);
        HashSet hashSet = new HashSet();
        BitSet m47174 = c20630.m47174();
        ArrayList m47190 = c20630.m47190();
        int i = 0;
        while (true) {
            int nextClearBit = m47174.nextClearBit(i);
            int size = m47190.size();
            arrayListArr = c6477.f19999;
            if (nextClearBit >= size) {
                break;
            }
            C16395 c16395 = (C16395) m47190.get(nextClearBit);
            i = nextClearBit + 1;
            for (int i2 = 0; i2 < c16395.m38615().size(); i2++) {
                AbstractC14278 abstractC14278 = (AbstractC14278) c16395.m38615().get(i2);
                C20069 mo29535 = abstractC14278.mo29535();
                int size2 = mo29535.size();
                if (size2 != 0) {
                    hashSet.add(abstractC14278);
                }
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayListArr[mo29535.m41004get(i3).m48652()].remove(abstractC14278);
                }
                C21480 m34042 = abstractC14278.m34042();
                if (m34042 != null) {
                    Iterator it = arrayListArr[m34042.m48652()].iterator();
                    while (it.hasNext()) {
                        AbstractC14278 abstractC142782 = (AbstractC14278) it.next();
                        if (abstractC142782 instanceof C13532) {
                            ((C13532) abstractC142782).m32572(m34042);
                        }
                    }
                }
            }
        }
        c20630.m47175(hashSet);
        HashSet hashSet2 = new HashSet();
        C23410 c23410 = new C23410();
        BitSet bitSet = c6477.f20000;
        c23410.f75170 = bitSet;
        c20630.m47182(c23410);
        while (true) {
            int nextSetBit = bitSet.nextSetBit(0);
            if (nextSetBit >= 0) {
                bitSet.clear(nextSetBit);
                if (arrayListArr[nextSetBit].size() == 0 || c6477.m17873(null, nextSetBit)) {
                    AbstractC14278 m47194 = c20630.m47194(nextSetBit);
                    if (!hashSet2.contains(m47194)) {
                        C20069 mo295352 = m47194.mo29535();
                        int size3 = mo295352.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            C21480 m41004get = mo295352.m41004get(i4);
                            arrayListArr[m41004get.m48652()].remove(m47194);
                            AbstractC14278 m471942 = c20630.m47194(m41004get.m48652());
                            if (!(m471942 == null ? true : m471942.mo29544())) {
                                bitSet.set(m41004get.m48652());
                            }
                        }
                        hashSet2.add(m47194);
                    }
                }
            } else {
                c20630.m47175(hashSet2);
                return;
            }
        }
    }

    public C6477(C20630 c20630) {
        int m47186 = c20630.m47186();
        this.f19998 = m47186;
        this.f20000 = new BitSet(m47186);
        this.f19999 = c20630.m47201();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17873(BitSet bitSet, int i) {
        if (bitSet == null || !bitSet.get(i)) {
            ArrayList[] arrayListArr = this.f19999;
            Iterator it = arrayListArr[i].iterator();
            while (it.hasNext()) {
                AbstractC14278 abstractC14278 = (AbstractC14278) it.next();
                if (abstractC14278 == null ? true : abstractC14278.mo29544()) {
                    return false;
                }
            }
            if (bitSet == null) {
                bitSet = new BitSet(this.f19998);
            }
            bitSet.set(i);
            Iterator it2 = arrayListArr[i].iterator();
            while (it2.hasNext()) {
                C21480 m34042 = ((AbstractC14278) it2.next()).m34042();
                if (m34042 == null || !m17873(bitSet, m34042.m48652())) {
                    return false;
                }
            }
        }
        return true;
    }
}
