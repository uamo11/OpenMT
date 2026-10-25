package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: 9BH0 */
/* renamed from: l.ܶۘܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14984 extends AbstractC2991 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45678;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final BitSet f45679;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final BitSet f45680;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45681;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45682;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7888 f45683;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f45684;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final BitSet f45685;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f45686;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35484(int i) {
        return (i & 1) == 0;
    }

    public C14984(C20630 c20630, C22041 c22041) {
        super(c20630, c22041);
        this.f45680 = new BitSet(c20630.m47186());
        this.f45683 = new C7888(c22041, c20630.m47186());
        int m47202 = c20630.m47202();
        this.f45686 = m47202;
        int i = m47202 * 2;
        BitSet bitSet = new BitSet(i);
        this.f45685 = bitSet;
        bitSet.set(0, m47202);
        this.f45679 = new BitSet(i);
        this.f45684 = new TreeMap();
        this.f45681 = new ArrayList();
        this.f45682 = new ArrayList();
        this.f45678 = new ArrayList();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m35487(int i) {
        C3135 mo29537;
        AbstractC14278 m47194 = this.f9435.m47194(i);
        if (m47194 == null || (mo29537 = m47194.mo29537()) == null || mo29537.m9562() != 3) {
            return -1;
        }
        return ((C2635) ((AbstractC14423) m47194.mo29542()).m34454()).mo2231();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35485(int i, int i2, ArrayList arrayList, boolean z) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C21480 c21480 = (C21480) it.next();
            if (!this.f45680.get(c21480.m48652())) {
                boolean m35486 = m35486(c21480, i, i2);
                z2 = !m35486 || z2;
                if (m35486 && z) {
                    this.f45685.set(i, c21480.m48645() + i, true);
                }
            }
        }
        return !z2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35486(C21480 c21480, int i, int i2) {
        if (c21480.m48645() > i2 || this.f45680.get(c21480.m48652()) || !m35489(i, c21480)) {
            return false;
        }
        m35483(i, c21480);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m35479(int i, int i2) {
        EnumC0873 enumC0873 = EnumC0873.f3433;
        if (i2 == 2) {
            if ((this.f45686 & 1) == 0) {
                enumC0873 = EnumC0873.f3436;
            } else {
                enumC0873 = EnumC0873.f3434;
            }
        }
        return m35480(i, i2, enumC0873);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m35480(int i, int i2, EnumC0873 enumC0873) {
        BitSet bitSet = this.f45685;
        int mo1286 = enumC0873.mo1286(bitSet, i);
        while (true) {
            int i3 = 1;
            while (i3 < i2 && !bitSet.get(mo1286 + i3)) {
                i3++;
            }
            if (i3 == i2) {
                return mo1286;
            }
            mo1286 = enumC0873.mo1286(bitSet, mo1286 + i3);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m35489(int i, C21480 c21480) {
        int m48645 = c21480.m48645();
        int i2 = this.f45686;
        if (i < i2 && m48645 + i > i2) {
            return false;
        }
        C7888 c7888 = this.f45683;
        c7888.getClass();
        return !c7888.m21171(c21480.m48652(), i, c21480.m48645());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7888 m35492() {
        BitSet bitSet;
        C7888 c7888;
        int i;
        Iterator it;
        BitSet bitSet2;
        C18658 c18658;
        int m38501;
        int i2;
        int i3;
        int i4;
        C18513 c18513 = new C18513(this);
        C20630 c20630 = this.f9435;
        c20630.m47182(c18513);
        TreeMap treeMap = this.f45684;
        for (ArrayList arrayList : treeMap.values()) {
            int size = arrayList.size();
            int i5 = -1;
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i4 = 0;
                    break;
                }
                C21480 c21480 = (C21480) arrayList.get(i6);
                int m35487 = m35487(c21480.m48652());
                if (m35487 >= 0) {
                    i4 = c21480.m48645();
                    m35483(m35487, c21480);
                    i5 = m35487;
                    break;
                }
                i6++;
                i5 = m35487;
            }
            if (i5 >= 0) {
                m35485(i5, i4, arrayList, true);
            }
        }
        int m47186 = c20630.m47186();
        int i7 = 0;
        while (true) {
            bitSet = this.f45680;
            if (i7 >= m47186) {
                break;
            }
            if (!bitSet.get(i7)) {
                int m354872 = m35487(i7);
                AbstractC14278 m47194 = c20630.m47194(i7);
                C21480 m34042 = m47194 == null ? null : m47194.m34042();
                if (m354872 >= 0) {
                    m35483(m354872, m34042);
                }
            }
            i7++;
        }
        Iterator it2 = this.f45682.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            c7888 = this.f45683;
            i = this.f45686;
            if (!hasNext) {
                break;
            }
            C12122 c12122 = (C12122) it2.next();
            C20069 mo29535 = c12122.mo29535();
            int size2 = mo29535.size();
            int[] iArr = new int[size2];
            int i8 = 0;
            for (int i9 = 0; i9 < size2; i9++) {
                int m48645 = mo29535.m41004get(i9).m48645();
                iArr[i9] = m48645;
                i8 += m48645;
            }
            int i10 = Integer.MIN_VALUE;
            int i11 = 0;
            int i12 = 0;
            int i13 = -1;
            BitSet bitSet3 = null;
            while (true) {
                if (i11 >= size2) {
                    it = it2;
                    break;
                }
                it = it2;
                int m48652 = mo29535.m41004get(i11).m48652();
                if (i11 != 0) {
                    i12 -= iArr[i11 - 1];
                }
                if (bitSet.get(m48652) && (m38501 = c7888.m38501(m48652) + i12) >= 0) {
                    i2 = i12;
                    if (m38501 >= i || m38501 + i8 <= i) {
                        BitSet bitSet4 = new BitSet(size2);
                        i3 = i13;
                        int m35481 = m35481(m38501, c12122, iArr, bitSet4);
                        if (m35481 >= 0) {
                            int cardinality = m35481 - bitSet4.cardinality();
                            if (cardinality > i10) {
                                i10 = cardinality;
                                bitSet3 = bitSet4;
                                i3 = m38501;
                            }
                            if (m35481 == i8) {
                                i13 = i3;
                                break;
                            }
                        } else {
                            continue;
                        }
                        i13 = i3;
                        i11++;
                        i12 = i2;
                        it2 = it;
                    }
                } else {
                    i2 = i12;
                }
                i3 = i13;
                i13 = i3;
                i11++;
                i12 = i2;
                it2 = it;
            }
            if (i13 == -1) {
                bitSet2 = new BitSet(size2);
                EnumC0873 enumC0873 = EnumC0873.f3433;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i14 < size2) {
                    EnumC0873 enumC08732 = enumC0873;
                    int i18 = size2;
                    if (iArr[i14] == 2) {
                        if ((i17 & 1) == 0) {
                            i16++;
                        } else {
                            i15++;
                        }
                        i17 += 2;
                    } else {
                        i17++;
                    }
                    i14++;
                    enumC0873 = enumC08732;
                    size2 = i18;
                }
                EnumC0873 enumC08733 = i15 > i16 ? (i & 1) == 0 ? EnumC0873.f3434 : EnumC0873.f3436 : i16 > 0 ? (i & 1) == 0 ? EnumC0873.f3436 : EnumC0873.f3434 : enumC0873;
                while (true) {
                    i13 = m35480(i, i8, enumC08733);
                    if (m35481(i13, c12122, iArr, bitSet2) >= 0) {
                        break;
                    }
                    i = i13 + 1;
                    bitSet2.clear();
                }
            } else {
                bitSet2 = bitSet3;
            }
            for (int nextSetBit = bitSet2.nextSetBit(0); nextSetBit >= 0; nextSetBit = bitSet2.nextSetBit(nextSetBit + 1)) {
                c12122.m29532(nextSetBit, m9125(c12122, mo29535.m41004get(nextSetBit)));
            }
            C20069 mo295352 = c12122.mo29535();
            int size3 = mo295352.size();
            int i19 = 0;
            while (i19 < size3) {
                C21480 m41004get = mo295352.m41004get(i19);
                int m486522 = m41004get.m48652();
                int m486452 = m41004get.m48645();
                int i20 = i13 + m486452;
                if (!bitSet.get(m486522)) {
                    Iterator it3 = treeMap.entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c18658 = null;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Iterator it4 = ((ArrayList) entry.getValue()).iterator();
                        while (it4.hasNext()) {
                            if (((C21480) it4.next()).m48652() == m486522) {
                                c18658 = (C18658) entry.getKey();
                                break;
                            }
                        }
                    }
                    m35483(i13, m41004get);
                    if (c18658 != null) {
                        this.f45685.set(i13, i20, true);
                        ArrayList arrayList2 = (ArrayList) treeMap.get(c18658);
                        int size4 = arrayList2.size();
                        for (int i21 = 0; i21 < size4; i21++) {
                            C21480 c214802 = (C21480) arrayList2.get(i21);
                            if (-1 == mo295352.m46260(c214802.m48652())) {
                                m35486(c214802, i13, m486452);
                            }
                        }
                    }
                }
                i19++;
                i13 = i20;
            }
            it2 = it;
        }
        for (ArrayList arrayList3 : treeMap.values()) {
            boolean z = false;
            int i22 = i;
            do {
                int size5 = arrayList3.size();
                int i23 = 1;
                for (int i24 = 0; i24 < size5; i24++) {
                    C21480 c214803 = (C21480) arrayList3.get(i24);
                    int m486453 = c214803.m48645();
                    if (!bitSet.get(c214803.m48652()) && m486453 > i23) {
                        i23 = m486453;
                    }
                }
                EnumC0873 enumC08734 = EnumC0873.f3433;
                if (i23 == 2) {
                    enumC08734 = (i & 1) == 0 ? EnumC0873.f3436 : EnumC0873.f3434;
                }
                BitSet bitSet5 = this.f45679;
                int mo1286 = enumC08734.mo1286(bitSet5, i22);
                while (true) {
                    int i25 = 1;
                    while (i25 < i23 && !bitSet5.get(mo1286 + i25)) {
                        i25++;
                    }
                    if (i25 == i23) {
                        break;
                    }
                    mo1286 = enumC08734.mo1286(bitSet5, mo1286 + i25);
                }
                Iterator it5 = arrayList3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z = m35485(mo1286, i23, arrayList3, true);
                        break;
                    }
                    C21480 c214804 = (C21480) it5.next();
                    if (!bitSet.get(c214804.m48652()) && !m35489(mo1286, c214804)) {
                        break;
                    }
                }
                i22 = mo1286 + 1;
            } while (!z);
        }
        Iterator it6 = this.f45681.iterator();
        while (it6.hasNext()) {
            C12122 c121222 = (C12122) it6.next();
            C21480 m340422 = c121222.m34042();
            int m486523 = m340422.m48652();
            BitSet m38624 = c121222.m34044().m38624();
            if (m38624.cardinality() == 1) {
                AbstractC14278 abstractC14278 = (AbstractC14278) C18566.m43105(((C16395) c20630.m47190().get(m38624.nextSetBit(0))).m38615(), 1);
                if (abstractC14278.mo29537().m9562() == 43) {
                    C21480 m41004get2 = abstractC14278.mo29535().m41004get(0);
                    int m486524 = m41004get2.m48652();
                    int m486454 = m41004get2.m48645();
                    boolean z2 = bitSet.get(m486523);
                    boolean z3 = bitSet.get(m486524);
                    if ((!z3) & z2) {
                        z3 = m35486(m41004get2, c7888.m38501(m486523), m486454);
                    }
                    if ((!z2) & z3) {
                        z2 = m35486(m340422, c7888.m38501(m486524), m486454);
                    }
                    if (!z2 || !z3) {
                        int m35479 = m35479(i, m486454);
                        ArrayList arrayList4 = new ArrayList(2);
                        arrayList4.add(m340422);
                        arrayList4.add(m41004get2);
                        while (!m35485(m35479, m486454, arrayList4, false)) {
                            m35479 = m35479(m35479 + 1, m486454);
                        }
                    }
                    boolean z4 = abstractC14278.mo29542().mo3533().size() != 0;
                    int m385012 = c7888.m38501(m486523);
                    if (m385012 != c7888.m38501(m486524) && !z4) {
                        ((C12122) abstractC14278).m29532(0, m9125(abstractC14278, m41004get2));
                        m35483(m385012, abstractC14278.mo29535().m41004get(0));
                    }
                }
            }
        }
        Iterator it7 = this.f45678.iterator();
        while (it7.hasNext()) {
            C13532 c13532 = (C13532) it7.next();
            C21480 m340423 = c13532.m34042();
            int m486525 = m340423.m48652();
            int m486455 = m340423.m48645();
            C20069 mo295353 = c13532.mo29535();
            int size6 = mo295353.size();
            ArrayList arrayList5 = new ArrayList();
            C7929 c7929 = new C7929(size6 + 1);
            if (bitSet.get(m486525)) {
                c7929.m21234(c7888.m38501(m486525));
            } else {
                arrayList5.add(m340423);
            }
            for (int i26 = 0; i26 < size6; i26++) {
                C21480 m340424 = c20630.m47194(mo295353.m41004get(i26).m48652()).m34042();
                int m486526 = m340424.m48652();
                if (bitSet.get(m486526)) {
                    c7929.m21234(c7888.m38501(m486526));
                } else {
                    arrayList5.add(m340424);
                }
            }
            for (int i27 = 0; i27 < c7929.m21235(); i27++) {
                m35485(c7929.m21233(), m486455, arrayList5, false);
            }
            int m354792 = m35479(i, m486455);
            while (!m35485(m354792, m486455, arrayList5, false)) {
                m354792 = m35479(m354792 + 1, m486455);
            }
        }
        int m471862 = c20630.m47186();
        for (int i28 = 0; i28 < m471862; i28++) {
            if (!bitSet.get(i28)) {
                AbstractC14278 m471942 = c20630.m47194(i28);
                C21480 m340425 = m471942 == null ? null : m471942.m34042();
                if (m340425 != null) {
                    int m486456 = m340425.m48645();
                    int m354793 = m35479(i, m486456);
                    while (!m35489(m354793, m340425)) {
                        m354793 = m35479(m354793 + 1, m486456);
                    }
                    m35483(m354793, m340425);
                }
            }
        }
        return c7888;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35483(int i, C21480 c21480) {
        int m48652 = c21480.m48652();
        BitSet bitSet = this.f45680;
        if (bitSet.get(m48652) || !m35489(i, c21480)) {
            throw new RuntimeException("attempt to add invalid register mapping");
        }
        int m48645 = c21480.m48645();
        this.f45683.mo21169(c21480.m48652(), i, m48645);
        bitSet.set(m48652);
        this.f45679.set(i, m48645 + i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m35481(int i, C12122 c12122, int[] iArr, BitSet bitSet) {
        C20630 c20630;
        C20069 mo29535 = c12122.mo29535();
        int size = mo29535.size();
        InterfaceC9775 m38619 = c12122.m34044().m38619();
        C20069 c20069 = new C20069(m38619.elements());
        InterfaceC6952 it = m38619.iterator();
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            c20630 = this.f9435;
            if (!hasNext) {
                break;
            }
            int i3 = i2 + 1;
            AbstractC14278 m47194 = c20630.m47194(it.next());
            c20069.m40988(i2, m47194 == null ? null : m47194.m34042());
            i2 = i3;
        }
        BitSet bitSet2 = new BitSet(c20630.m47186());
        int i4 = i;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            C21480 m41004get = mo29535.m41004get(i6);
            int m48652 = m41004get.m48652();
            int i7 = iArr[i6];
            if (i6 != 0) {
                i4 += iArr[i6 - 1];
            }
            BitSet bitSet3 = this.f45680;
            boolean z = bitSet3.get(m48652);
            C7888 c7888 = this.f45683;
            if (!z || c7888.m38501(m48652) != i4) {
                for (int i8 = i4; i8 < i4 + i7; i8++) {
                    if (this.f45685.get(i8)) {
                        return -1;
                    }
                }
                if (bitSet3.get(m48652) || !m35489(i4, m41004get) || bitSet2.get(m48652)) {
                    if (c7888.m21170(c20069, i4, i7) || c7888.m21170(mo29535, i4, i7)) {
                        return -1;
                    }
                    bitSet.set(i6);
                    bitSet2.set(m48652);
                }
            }
            i5 += i7;
            bitSet2.set(m48652);
        }
        return i5;
    }
}
