package l;

import java.util.BitSet;

/* compiled from: WBAX */
/* renamed from: l.ۜ᩻ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7098 extends AbstractC11849 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C7098 f21804 = new C7098();

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final int mo7129() {
        return 3;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28956(m19101(abstractC10438.m13993())) + ", " + abstractC10438.mo13992();
    }

    @Override // l.AbstractC11849
    /* renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return abstractC10438.mo13988();
    }

    @Override // l.AbstractC11849
    /* renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        if (!(abstractC4793 instanceof C21727)) {
            return false;
        }
        C21727 c21727 = (C21727) abstractC4793;
        if (!AbstractC11849.m28960(c21727.m49054())) {
            return false;
        }
        AbstractC13717 m49053 = c21727.m49053();
        return ((m49053 instanceof C22390) || (m49053 instanceof C12512) || (m49053 instanceof C23801)) && m19100(c21727.m13993()) >= 0;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final BitSet mo7131(AbstractC4793 abstractC4793) {
        C20069 m13993 = abstractC4793.m13993();
        int size = m13993.size();
        BitSet bitSet = new BitSet(size);
        for (int i = 0; i < size; i++) {
            C21480 m41004get = m13993.m41004get(i);
            bitSet.set(i, AbstractC11849.m28957((m41004get.m48645() + m41004get.m48652()) - 1));
        }
        return bitSet;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        int m49054 = ((C21727) abstractC10438).m49054();
        C20069 m19101 = m19101(abstractC10438.m13993());
        int size = m19101.size();
        int m48652 = size > 0 ? m19101.m41004get(0).m48652() : 0;
        int m486522 = size > 1 ? m19101.m41004get(1).m48652() : 0;
        int m486523 = size > 2 ? m19101.m41004get(2).m48652() : 0;
        int m486524 = size > 3 ? m19101.m41004get(3).m48652() : 0;
        short m28950 = AbstractC11849.m28950(abstractC10438, AbstractC11849.m28955(size > 4 ? m19101.m41004get(4).m48652() : 0, size));
        short m28949 = AbstractC11849.m28949(m48652, m486522, m486523, m486524);
        c18241.m42511(m28950);
        c18241.m42511((short) m49054);
        c18241.m42511(m28949);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m19100(C20069 c20069) {
        int size = c20069.size();
        if (size > 5) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += c20069.m41004get(i2).m48645();
            if (!AbstractC11849.m28957((r5.m48645() + r5.m48652()) - 1)) {
                return -1;
            }
        }
        if (i <= 5) {
            return i;
        }
        return -1;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C20069 m19101(C20069 c20069) {
        int m19100 = m19100(c20069);
        int size = c20069.size();
        if (m19100 == size) {
            return c20069;
        }
        C20069 c200692 = new C20069(m19100);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C21480 m41004get = c20069.m41004get(i2);
            c200692.m40988(i, m41004get);
            if (m41004get.m48645() == 2) {
                c200692.m40988(i + 1, C21480.m48631(m41004get.m48652() + 1, C7573.f23406));
                i += 2;
            } else {
                i++;
            }
        }
        c200692.mo20349();
        return c200692;
    }
}
