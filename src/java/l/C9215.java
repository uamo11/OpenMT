package l;

/* compiled from: OBBX */
/* renamed from: l.ۡ᩻ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9215 extends AbstractC11849 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C9215 f27905 = new C9215();

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final int mo7129() {
        return 4;
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
        if (!(abstractC4793 instanceof C18115)) {
            return false;
        }
        C18115 c18115 = (C18115) abstractC4793;
        int m42241 = c18115.m42241(0);
        int m422412 = c18115.m42241(1);
        if (!AbstractC11849.m28960(m42241) || !AbstractC11849.m28960(m422412) || !(c18115.m42239(0) instanceof C22390) || !(c18115.m42239(1) instanceof C4751)) {
            return false;
        }
        C20069 m13993 = c18115.m13993();
        int size = m13993.size();
        if (size == 0) {
            return true;
        }
        return AbstractC11849.m28953(m13993.m46253()) && AbstractC11849.m28960(size) && AbstractC11849.m28960(m13993.m41004get(0).m48652()) && AbstractC11849.m28954(m13993);
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        C18115 c18115 = (C18115) abstractC10438;
        short m42241 = (short) c18115.m42241(0);
        short m422412 = (short) c18115.m42241(1);
        C20069 m13993 = abstractC10438.m13993();
        short m48652 = m13993.size() > 0 ? (short) m13993.m41004get(0).m48652() : (short) 0;
        c18241.m42511(AbstractC11849.m28950(abstractC10438, m13993.m46253()));
        c18241.m42511(m42241);
        c18241.m42511(m48652);
        c18241.m42511(m422412);
    }
}
