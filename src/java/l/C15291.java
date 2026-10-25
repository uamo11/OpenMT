package l;

/* compiled from: 6B9T */
/* renamed from: l.ܶܳܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15291 extends AbstractC11849 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C15291 f46924 = new C15291();

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final int mo7129() {
        return 1;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final String mo7130(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28961(abstractC10438);
    }

    @Override // l.AbstractC11849
    /* renamed from: ۧ */
    public final String mo7133(AbstractC10438 abstractC10438) {
        return AbstractC11849.m28958(abstractC10438);
    }

    @Override // l.AbstractC11849
    /* renamed from: ۧ */
    public final boolean mo7134(AbstractC4793 abstractC4793) {
        if (!(abstractC4793 instanceof C5415) || abstractC4793.m13993().size() != 0) {
            return false;
        }
        C5415 c5415 = (C5415) abstractC4793;
        if (c5415.m15498()) {
            return mo10098(c5415);
        }
        return true;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final boolean mo10098(C5415 c5415) {
        int m15497 = c5415.m15497();
        return m15497 != 0 && ((byte) m15497) == m15497;
    }

    @Override // l.AbstractC11849
    /* renamed from: ֫ */
    public final void mo7132(C18241 c18241, AbstractC10438 abstractC10438) {
        c18241.m42511(AbstractC11849.m28950(abstractC10438, ((C5415) abstractC10438).m15497() & 255));
    }
}
