package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* compiled from: KAJU */
/* renamed from: l.ᩳۘܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17807 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20630 m41737(C13012 c13012, int i) {
        C20630 m47168 = C20630.m47168(c13012, i);
        ArrayList m47190 = m47168.m47190();
        for (int size = m47190.size() - 1; size >= 0; size--) {
            C16395 c16395 = (C16395) m47190.get(size);
            int cardinality = c16395.m38624().cardinality();
            int cardinality2 = c16395.m38604().cardinality();
            if (cardinality > 1 && cardinality2 > 1) {
                c16395.m38621();
            }
        }
        ArrayList m471902 = m47168.m47190();
        for (int size2 = m471902.size() - 1; size2 >= 0; size2--) {
            C16395 c163952 = (C16395) m471902.get(size2);
            if (!c163952.m38622() && c163952.m38624().cardinality() > 1 && ((AbstractC14278) c163952.m38615().get(0)).mo29530()) {
                BitSet bitSet = (BitSet) c163952.m38624().clone();
                for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit >= 0; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
                    ((C16395) m471902.get(nextSetBit)).m38616(c163952).m38615().add(0, ((AbstractC14278) c163952.m38615().get(0)).clone());
                }
                c163952.m38615().remove(0);
            }
        }
        ArrayList m471903 = m47168.m47190();
        for (int size3 = m471903.size() - 1; size3 >= 0; size3--) {
            C16395 c163953 = (C16395) m471903.get(size3);
            BitSet bitSet2 = (BitSet) c163953.m38604().clone();
            for (int nextSetBit2 = bitSet2.nextSetBit(0); nextSetBit2 >= 0; nextSetBit2 = bitSet2.nextSetBit(nextSetBit2 + 1)) {
                C16395 c163954 = (C16395) m471903.get(nextSetBit2);
                AbstractC14278 abstractC14278 = (AbstractC14278) C18566.m43105(c163953.m38615(), 1);
                if ((c163953.m38604().cardinality() > 1 && c163954.m38624().cardinality() > 1) || ((abstractC14278.m34042() != null || abstractC14278.mo29535().size() > 0) && c163954.m38624().cardinality() > 1)) {
                    c163953.m38616(c163954);
                }
            }
        }
        m41739(m47168, C22000.m49495(m47168), 0);
        new RunnableC3696(m47168).run();
        m47168.m47188();
        return m47168;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41738(int i, C20630 c20630) {
        m41739(c20630, C22000.m49495(c20630), i);
        new RunnableC3696(i, c20630).run();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41739(C20630 c20630, C19884 c19884, int i) {
        ArrayList m47190 = c20630.m47190();
        int size = m47190.size();
        int m47186 = c20630.m47186() - i;
        C20589[] m23864 = new C9300(c20630).m23864();
        BitSet[] bitSetArr = new BitSet[m47186];
        BitSet[] bitSetArr2 = new BitSet[m47186];
        for (int i2 = 0; i2 < m47186; i2++) {
            bitSetArr[i2] = new BitSet(size);
            bitSetArr2[i2] = new BitSet(size);
        }
        int size2 = m47190.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Iterator it = ((C16395) m47190.get(i3)).m38615().iterator();
            while (it.hasNext()) {
                C21480 m34042 = ((AbstractC14278) it.next()).m34042();
                if (m34042 != null && m34042.m48652() - i >= 0) {
                    bitSetArr[m34042.m48652() - i].set(i3);
                }
            }
        }
        for (int i4 = 0; i4 < m47186; i4++) {
            BitSet bitSet = (BitSet) bitSetArr[i4].clone();
            while (true) {
                int nextSetBit = bitSet.nextSetBit(0);
                if (nextSetBit >= 0) {
                    bitSet.clear(nextSetBit);
                    InterfaceC6952 it2 = m23864[nextSetBit].f66281.iterator();
                    while (it2.hasNext()) {
                        int next = it2.next();
                        if (!bitSetArr2[i4].get(next)) {
                            bitSetArr2[i4].set(next);
                            int i5 = i4 + i;
                            C21480 c21480 = c19884.m45712(next).get(i5);
                            if (c21480 == null) {
                                ((C16395) m47190.get(next)).m38617(i5);
                            } else {
                                ((C16395) m47190.get(next)).m38600(c21480);
                            }
                            if (!bitSetArr[i4].get(next)) {
                                bitSet.set(next);
                            }
                        }
                    }
                }
            }
        }
    }
}
