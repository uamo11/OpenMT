package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* compiled from: TBH1 */
/* renamed from: l.ۤۘܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10047 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22041 f30198;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13012 m25214(C20630 c20630, boolean z) {
        int i;
        Iterator it;
        C7888 m35492 = new C14984(c20630, new C10047(c20630, z).f30198).m35492();
        c20630.m47200();
        c20630.m47181(m35492);
        ArrayList m47190 = c20630.m47190();
        Iterator it2 = m47190.iterator();
        while (it2.hasNext()) {
            C16395 c16395 = (C16395) it2.next();
            c16395.m38602(new C12163(m47190));
            c16395.m38593();
        }
        Iterator it3 = m47190.iterator();
        while (it3.hasNext()) {
            ((C16395) it3.next()).m38605();
        }
        int m47202 = c20630.m47202();
        C16354 c16354 = new C16354(c20630.m47186());
        int m47186 = c20630.m47186();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= m47186) {
                break;
            }
            if (i2 < m47202) {
                c16354.mo21169(i2, (m47186 - m47202) + i2, 1);
            } else {
                c16354.mo21169(i2, i2 - m47202, 1);
            }
            i2++;
        }
        c20630.m47181(c16354);
        c20630.m47176(new C12868(c20630.m47190()));
        ArrayList m471902 = c20630.m47190();
        C16395 m47196 = c20630.m47196();
        BitSet m47174 = c20630.m47174();
        int cardinality = m47174.cardinality();
        if (m47196 != null && m47174.get(m47196.m38609())) {
            cardinality--;
        }
        C17246 c17246 = new C17246(cardinality);
        Iterator it4 = m471902.iterator();
        int i3 = 0;
        while (it4.hasNext()) {
            C16395 c163952 = (C16395) it4.next();
            if (!m47174.get(c163952.m38609()) || c163952 == m47196) {
                it = it4;
            } else {
                int i4 = i3 + 1;
                C21064 m38614 = c163952.m38614();
                int m38608 = c163952.m38608();
                C16395 m471962 = c20630.m47196();
                int m47912 = m38614.m47912(m471962 == null ? -1 : m471962.m38607());
                if (m47912 < 0) {
                    m47912 = -1;
                }
                if (m47912 >= 0) {
                    if (m38614.size() > i) {
                        throw new RuntimeException("Exit predecessor must have no other successors".concat(C14712.m35006(c163952.m38607())));
                    }
                    m38614 = C21064.f67936;
                    C3135 mo29537 = ((AbstractC14278) C18566.m43105(c163952.m38615(), i)).mo29537();
                    if (mo29537.m9558() != 2 && mo29537 != C12307.f36670) {
                        throw new RuntimeException("Exit predecessor must end in valid exit statement.");
                    }
                    m38608 = -1;
                }
                m38614.mo20349();
                int m38607 = c163952.m38607();
                ArrayList m38615 = c163952.m38615();
                int size = m38615.size();
                C2430 c2430 = new C2430(size);
                int i5 = 0;
                while (i5 < size) {
                    c2430.m40986(i5, ((AbstractC14278) m38615.get(i5)).mo29538());
                    i5++;
                    it4 = it4;
                }
                it = it4;
                c2430.mo20349();
                c17246.m40531(i3, new C16540(m38607, c2430, m38614, m38608));
                i3 = i4;
            }
            i = 1;
            it4 = it;
        }
        if (m47196 == null || m47196.m38615().isEmpty()) {
            return new C21336(new C13012(c17246, c20630.m47173(c20630.m47198()))).m48372();
        }
        throw new RuntimeException("Exit block must have no insns when leaving SSA form");
    }

    public C10047(C20630 c20630, boolean z) {
        this.f30198 = C4402.m13126(c20630);
    }
}
