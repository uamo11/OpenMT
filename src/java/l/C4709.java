package l;

import java.util.BitSet;

/* compiled from: IBG6 */
/* renamed from: l.ۙܳܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4709 extends AbstractC11849 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C4709 f14953 = new C4709();

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final int mo7129() {
        return 1;
    }

    @Override // l.AbstractC11849
    /* renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return "";
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        C20069 m13993 = abstractC10438.m13993();
        int size = m13993.size();
        return m13993.m41004get(size - 2).m48644() + ", " + m13993.m41004get(size - 1).m48644();
    }

    @Override // l.AbstractC11849
    /* renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        C21480 m41004get;
        C21480 m41004get2;
        if (!(abstractC4793 instanceof C18821)) {
            return false;
        }
        C20069 m13993 = abstractC4793.m13993();
        int size = m13993.size();
        if (size == 2) {
            m41004get = m13993.m41004get(0);
            m41004get2 = m13993.m41004get(1);
        } else {
            if (size != 3) {
                return false;
            }
            m41004get = m13993.m41004get(1);
            m41004get2 = m13993.m41004get(2);
            if (m41004get.m48652() != m13993.m41004get(0).m48652()) {
                return false;
            }
        }
        return AbstractC11849.m28957(m41004get.m48652()) && AbstractC11849.m28957(m41004get2.m48652());
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 m13993 = abstractC4793.m13993();
        BitSet bitSet = new BitSet(2);
        int m48652 = m13993.m41004get(0).m48652();
        int m486522 = m13993.m41004get(1).m48652();
        int size = m13993.size();
        if (size == 2) {
            bitSet.set(0, AbstractC11849.m28957(m48652));
            bitSet.set(1, AbstractC11849.m28957(m486522));
            return bitSet;
        }
        if (size == 3) {
            if (m48652 != m486522) {
                bitSet.set(0, false);
                bitSet.set(1, false);
            } else {
                boolean m28957 = AbstractC11849.m28957(m486522);
                bitSet.set(0, m28957);
                bitSet.set(1, m28957);
            }
            bitSet.set(2, AbstractC11849.m28957(m13993.m41004get(2).m48652()));
            return bitSet;
        }
        throw new AssertionError();
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C20069 m13993 = abstractC10438.m13993();
        int size = m13993.size();
        c18241.m42511(AbstractC11849.m28950(abstractC10438, AbstractC11849.m28955(m13993.m41004get(size - 2).m48652(), m13993.m41004get(size - 1).m48652())));
    }
}
