package l;

import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: WBA0 */
/* renamed from: l.ۙۘܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4402 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16395 f14088;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final BitSet f14089;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22041 f14090;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20630 f14091;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BitSet f14092;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f14093;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC19925 f14094;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f14095;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22041 m13126(C20630 c20630) {
        int m47186 = c20630.m47186();
        C22041 c22041 = new C22041(m47186);
        for (int i = 0; i < m47186; i++) {
            C4402 c4402 = new C4402(c20630, i, c22041);
            C20630 c206302 = c4402.f14091;
            int i2 = c4402.f14093;
            for (AbstractC14278 abstractC14278 : c206302.m47199(i2)) {
                c4402.f14094 = EnumC19925.DONE;
                if (abstractC14278 instanceof C13532) {
                    Iterator it = ((C13532) abstractC14278).m32569(i2, c206302).iterator();
                    while (it.hasNext()) {
                        c4402.f14088 = (C16395) it.next();
                        c4402.f14094 = EnumC19925.LIVE_OUT_AT_BLOCK;
                        c4402.m13127();
                    }
                } else {
                    C16395 m34044 = abstractC14278.m34044();
                    c4402.f14088 = m34044;
                    int indexOf = m34044.m38615().indexOf(abstractC14278);
                    c4402.f14095 = indexOf;
                    if (indexOf < 0) {
                        throw new RuntimeException("insn not found in it's own block");
                    }
                    c4402.f14094 = EnumC19925.LIVE_IN_AT_STATEMENT;
                    c4402.m13127();
                }
            }
            while (true) {
                BitSet bitSet = c4402.f14092;
                int nextSetBit = bitSet.nextSetBit(0);
                if (nextSetBit >= 0) {
                    c4402.f14088 = (C16395) c206302.m47190().get(nextSetBit);
                    bitSet.clear(nextSetBit);
                    c4402.f14094 = EnumC19925.LIVE_OUT_AT_BLOCK;
                    c4402.m13127();
                }
            }
        }
        Iterator it2 = c20630.m47190().iterator();
        while (it2.hasNext()) {
            List m38613 = ((C16395) it2.next()).m38613();
            int size = m38613.size();
            for (int i3 = 0; i3 < size; i3++) {
                for (int i4 = 0; i4 < size; i4++) {
                    if (i3 != i4) {
                        AbstractC14278 abstractC142782 = (AbstractC14278) m38613.get(i3);
                        AbstractC14278 abstractC142783 = (AbstractC14278) m38613.get(i4);
                        C21480 m34042 = abstractC142782.m34042();
                        C20069 mo29535 = abstractC142783.mo29535();
                        int m48652 = m34042.m48652();
                        for (int i5 = 0; i5 < mo29535.size(); i5++) {
                            c22041.m49588(m48652, mo29535.m41004get(i5).m48652());
                        }
                        C21480 m340422 = abstractC142783.m34042();
                        C20069 mo295352 = abstractC142782.mo29535();
                        int m486522 = m340422.m48652();
                        for (int i6 = 0; i6 < mo295352.size(); i6++) {
                            c22041.m49588(m486522, mo295352.m41004get(i6).m48652());
                        }
                        c22041.m49588(abstractC142782.m34042().m48652(), abstractC142783.m34042().m48652());
                    }
                }
            }
        }
        return c22041;
    }

    public C4402(C20630 c20630, int i, C22041 c22041) {
        int size = c20630.m47190().size();
        this.f14091 = c20630;
        this.f14093 = i;
        this.f14089 = new BitSet(size);
        this.f14092 = new BitSet(size);
        this.f14090 = c22041;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13127() {
        while (true) {
            EnumC19925 enumC19925 = this.f14094;
            EnumC19925 enumC199252 = EnumC19925.DONE;
            if (enumC19925 == enumC199252) {
                return;
            }
            int ordinal = enumC19925.ordinal();
            int i = this.f14093;
            if (ordinal == 0) {
                this.f14094 = enumC199252;
                int i2 = this.f14095;
                if (i2 == 0) {
                    this.f14088.m38595(i);
                    this.f14092.or(this.f14088.m38624());
                } else {
                    this.f14095 = i2 - 1;
                    this.f14094 = EnumC19925.LIVE_OUT_AT_STATEMENT;
                }
            } else if (ordinal == 1) {
                this.f14094 = enumC199252;
                AbstractC14278 abstractC14278 = (AbstractC14278) this.f14088.m38615().get(this.f14095);
                C21480 m34042 = abstractC14278.m34042();
                if (!abstractC14278.m34043(i)) {
                    if (m34042 != null) {
                        this.f14090.m49588(i, m34042.m48652());
                    }
                    this.f14094 = EnumC19925.LIVE_IN_AT_STATEMENT;
                }
            } else if (ordinal == 2) {
                this.f14094 = enumC199252;
                int m38609 = this.f14088.m38609();
                BitSet bitSet = this.f14089;
                if (!bitSet.get(m38609)) {
                    bitSet.set(this.f14088.m38609());
                    this.f14088.m38610(i);
                    this.f14095 = this.f14088.m38615().size() - 1;
                    this.f14094 = EnumC19925.LIVE_OUT_AT_STATEMENT;
                }
            }
        }
    }
}
