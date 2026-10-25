package l;

import java.util.BitSet;

/* compiled from: DBFV */
/* renamed from: l.᩻᩻ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C24031 extends AbstractC11849 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C24031 f77858 = new C24031();

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final int mo7129() {
        return 3;
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
        return m13993.m41004get(0).m48644() + ", " + m13993.m41004get(1).m48644();
    }

    @Override // l.AbstractC11849
    /* renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        C20069 m13993 = abstractC4793.m13993();
        return (abstractC4793 instanceof C18821) && m13993.size() == 2 && AbstractC11849.m28960(m13993.m41004get(0).m48652()) && AbstractC11849.m28960(m13993.m41004get(1).m48652());
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 m13993 = abstractC4793.m13993();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC11849.m28960(m13993.m41004get(0).m48652()));
        bitSet.set(1, AbstractC11849.m28960(m13993.m41004get(1).m48652()));
        return bitSet;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C20069 m13993 = abstractC10438.m13993();
        short m28950 = AbstractC11849.m28950(abstractC10438, 0);
        short m48652 = (short) m13993.m41004get(0).m48652();
        short m486522 = (short) m13993.m41004get(1).m48652();
        c18241.m42511(m28950);
        c18241.m42511(m48652);
        c18241.m42511(m486522);
    }
}
