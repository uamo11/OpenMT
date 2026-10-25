package l;

/* compiled from: P6MK */
/* renamed from: l.۠ܶۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8251 implements InterfaceC9167 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21657 f25393;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19814 f25394;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19814 f25395;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25396 = 0;

    public C8251(C21657 c21657, C19814 c19814, C19814 c198142) {
        this.f25393 = c21657;
        this.f25394 = c19814;
        this.f25395 = c198142;
    }

    @Override // l.InterfaceC9167
    /* renamed from: ۧ */
    public final void mo16112(AbstractC11347 abstractC11347, int i) {
        C12484 c12484;
        C12484 c124842;
        boolean z = abstractC11347 instanceof C19814;
        C21657 c21657 = this.f25393;
        if (z) {
            C19814 c19814 = (C19814) abstractC11347;
            c124842 = c21657.f69492;
            if (c124842.m30646(c19814.m45588())) {
                C15305 m48915 = C21657.m48915(c21657, c19814);
                C19814 c198142 = m48915.f46950;
                this.f25395.m45584(c198142);
                this.f25396 += m48915.f46951;
                this.f25395 = c198142;
                return;
            }
            if (abstractC11347 != this.f25394) {
                this.f25396++;
                return;
            }
            return;
        }
        if (abstractC11347 instanceof C10787) {
            this.f25395.m45584(new C10787(((C10787) abstractC11347).m25049()));
            return;
        }
        if (abstractC11347 instanceof C18402) {
            c12484 = c21657.f69492;
            if (c12484.m30646(abstractC11347.mo28099().mo2915())) {
                this.f25395.m45584(new C18402(((C18402) abstractC11347).m25046()));
                return;
            }
        }
        this.f25396++;
    }

    @Override // l.InterfaceC9167
    /* renamed from: ֫ */
    public final void mo16111(AbstractC11347 abstractC11347, int i) {
        C12484 c12484;
        if (abstractC11347 instanceof C19814) {
            c12484 = this.f25393.f69492;
            if (c12484.m30646(abstractC11347.mo2915())) {
                this.f25395 = this.f25395.mo28099();
            }
        }
    }
}
