package l;

/* compiled from: EBEF */
/* renamed from: l.᩷᩻ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21210 extends AbstractC11849 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C21210 f68344 = new C21210();

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final int mo7129() {
        return 3;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28959(abstractC10438.m13993()) + ", " + abstractC10438.mo13992();
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
        int m49054 = c21727.m49054();
        AbstractC13717 m49053 = c21727.m49053();
        if (!AbstractC11849.m28960(m49054)) {
            return false;
        }
        if (!(m49053 instanceof C22390) && !(m49053 instanceof C12512) && !(m49053 instanceof C23801)) {
            return false;
        }
        C20069 m13993 = c21727.m13993();
        m13993.size();
        if (m13993.size() != 0) {
            return AbstractC11849.m28954(m13993) && AbstractC11849.m28960(m13993.m41004get(0).m48652()) && AbstractC11849.m28953(m13993.m46253());
        }
        return true;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C20069 m13993 = abstractC10438.m13993();
        int m49054 = ((C21727) abstractC10438).m49054();
        int m48652 = m13993.size() != 0 ? m13993.m41004get(0).m48652() : 0;
        c18241.m42511(AbstractC11849.m28950(abstractC10438, m13993.m46253()));
        c18241.m42511((short) m49054);
        c18241.m42511((short) m48652);
    }
}
