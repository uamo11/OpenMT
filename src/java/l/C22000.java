package l;

import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: EBEC */
/* renamed from: l.᩹ۖܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22000 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f70510;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20630 f70511;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19884 f70512;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BitSet f70513;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19884 m49495(C20630 c20630) {
        C22000 c22000;
        C22000 c220002;
        C22000 c220003 = new C22000(c20630);
        C20630 c206302 = c220003.f70511;
        int m47186 = c206302.m47186();
        C19884 c19884 = c220003.f70512;
        if (m47186 > 0) {
            int m47198 = c206302.m47198();
            while (m47198 >= 0) {
                BitSet bitSet = c220003.f70513;
                bitSet.clear(m47198);
                C4546 m45715 = c19884.m45715(m47198);
                C16395 c16395 = (C16395) c220003.f70510.get(m47198);
                ArrayList m38615 = c16395.m38615();
                int size = m38615.size();
                if (m47198 == c206302.m47192()) {
                    c22000 = c220003;
                } else {
                    int i = size - 1;
                    AbstractC14278 abstractC14278 = (AbstractC14278) m38615.get(i);
                    boolean z = (abstractC14278.mo29542().mo3533().size() == 0 || abstractC14278.m34042() == null) ? false : true;
                    int i2 = 0;
                    C4546 c4546 = m45715;
                    while (i2 < size) {
                        if (z && i2 == i) {
                            c4546.mo20349();
                            c4546 = c4546.m13351();
                        }
                        AbstractC14278 abstractC142782 = (AbstractC14278) m38615.get(i2);
                        C21480 mo29540 = abstractC142782.mo29540();
                        if (mo29540 == null) {
                            C21480 m34042 = abstractC142782.m34042();
                            if (m34042 != null && c4546.get(m34042.m48652()) != null) {
                                c4546.m13359(c4546.get(m34042.m48652()));
                            }
                        } else {
                            C21480 m48648 = mo29540.m48648();
                            c4546.getClass();
                            if (!m48648.equals(c4546.get(m48648.m48652()))) {
                                C21480 m13353 = c4546.m13353(m48648.m48653());
                                if (m13353 != null) {
                                    c220002 = c220003;
                                    if (m13353.m48652() != m48648.m48652()) {
                                        c4546.m13359(m13353);
                                    }
                                } else {
                                    c220002 = c220003;
                                }
                                c19884.m45713(abstractC142782, m48648);
                                c4546.m13358(m48648);
                                i2++;
                                c220003 = c220002;
                            }
                        }
                        c220002 = c220003;
                        i2++;
                        c220003 = c220002;
                    }
                    c22000 = c220003;
                    c4546.mo20349();
                    C21064 m38603 = c16395.m38603();
                    int size2 = m38603.size();
                    int m38623 = c16395.m38623();
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = m38603.get(i3);
                        if (c19884.m45714(i4, i4 == m38623 ? c4546 : m45715)) {
                            bitSet.set(i4);
                        }
                    }
                }
                m47198 = bitSet.nextSetBit(0);
                c220003 = c22000;
            }
        }
        c19884.mo20349();
        return c19884;
    }

    public C22000(C20630 c20630) {
        ArrayList m47190 = c20630.m47190();
        this.f70511 = c20630;
        this.f70510 = m47190;
        this.f70512 = new C19884(c20630);
        this.f70513 = new BitSet(m47190.size());
    }
}
