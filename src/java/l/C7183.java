package l;

import java.util.BitSet;
import java.util.List;

/* compiled from: LAJX */
/* renamed from: l.۟ۖܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7183 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f21981;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19201(C20630 c20630) {
        BitSet bitSet;
        C18658 m48653;
        C18658 m486532;
        C7183 c7183 = new C7183(c20630);
        int m47186 = c20630.m47186();
        int i = 0;
        while (true) {
            bitSet = c7183.f21981;
            if (i >= m47186) {
                break;
            }
            AbstractC14278 m47194 = c20630.m47194(i);
            if (m47194 != null && m47194.m34042().mo5255() == 0) {
                bitSet.set(i);
            }
            i++;
        }
        while (true) {
            int nextSetBit = bitSet.nextSetBit(0);
            if (nextSetBit < 0) {
                return;
            }
            bitSet.clear(nextSetBit);
            C13532 c13532 = (C13532) c20630.m47194(nextSetBit);
            c13532.m32570(c20630);
            C20069 mo29535 = c13532.mo29535();
            int size = mo29535.size();
            int i2 = -1;
            C21480 c21480 = null;
            for (int i3 = 0; i3 < size; i3++) {
                C21480 m41004get = mo29535.m41004get(i3);
                if (m41004get.mo5255() != 0) {
                    i2 = i3;
                    c21480 = m41004get;
                }
            }
            if (c21480 != null) {
                C18658 m486533 = c21480.m48653();
                InterfaceC1538 type = c21480.getType();
                boolean z = true;
                for (int i4 = 0; i4 < size; i4++) {
                    if (i4 != i2) {
                        C21480 m41004get2 = mo29535.m41004get(i4);
                        if (m41004get2.mo5255() != 0) {
                            z = z && (m486533 == (m486532 = m41004get2.m48653()) || (m486533 != null && m486533.equals(m486532)));
                            type = C22927.m51030(type, m41004get2.getType());
                        }
                    }
                }
                if (type == null) {
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < size; i5++) {
                        sb.append(mo29535.m41004get(i5).toString());
                        sb.append(' ');
                    }
                    throw new RuntimeException("Couldn't map types in phi insn:" + ((Object) sb));
                }
                C18658 c18658 = z ? m486533 : null;
                C21480 m34042 = c13532.m34042();
                if (m34042.m48637() != type || (c18658 != (m48653 = m34042.m48653()) && (c18658 == null || !c18658.equals(m48653)))) {
                    c13532.m34041(C21480.m48636(c13532.m34042().m48652(), type, c18658));
                    List m47199 = c20630.m47199(nextSetBit);
                    int size2 = m47199.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        AbstractC14278 abstractC14278 = (AbstractC14278) m47199.get(i6);
                        C21480 m340422 = abstractC14278.m34042();
                        if (m340422 != null && (abstractC14278 instanceof C13532)) {
                            bitSet.set(m340422.m48652());
                        }
                    }
                }
            }
        }
    }

    public C7183(C20630 c20630) {
        this.f21981 = new BitSet(c20630.m47186());
    }
}
