package l;

/* compiled from: O8C4 */
/* renamed from: l.֫᩵ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2026 extends AbstractC23898 implements InterfaceC21077 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15409 f6756;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f6757;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22466 f6758;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8355 f6759;

    @Override // l.InterfaceC21077
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6589(int i) {
    }

    @Override // l.AbstractC23898
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6591() {
        double[] m38021 = this.f6759.m38021();
        double[] m380212 = this.f6757.m38021();
        double[] m380213 = this.f6756.m38021();
        C22466 c22466 = this.f6758;
        double m50405 = c22466.m50405();
        for (int i = 0; i < 8; i++) {
            try {
                double m19314 = m38021[i] * this.f77261.m19314();
                if (m19314 > 1.0d) {
                    m19314 = 1.0d;
                } else if (m19314 < -1.0d) {
                    m19314 = -1.0d;
                }
                m50405 += m19314;
                if (m50405 >= 1.0d) {
                    m50405 -= 2.0d;
                } else if (m50405 < -1.0d) {
                    m50405 += 2.0d;
                }
                double d = (m50405 > 0.5d ? 1.0d - m50405 : m50405 < -0.5d ? (-1.0d) - m50405 : m50405) * 3.141592653589793d;
                double d2 = d * d;
                m380213[i] = (((((((((((-2.505210838544172E-8d) * d2) + 2.7557319223985893E-6d) * d2) - 1.984126984126984E-4d) * d2) + 0.008333333333333333d) * d2) - 0.16666666666666666d) * d2) + 1.0d) * d * m380212[i];
            } catch (NullPointerException unused) {
                throw new NullPointerException("Null Synth! You probably forgot to add this unit to the Synthesizer!");
            }
        }
        c22466.m50404(m50405);
    }

    @Override // l.InterfaceC6965
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15409 mo6592() {
        return this.f6756;
    }

    @Override // l.InterfaceC21077
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6590(C21245 c21245) {
        this.f6757.m21954(0.0d, c21245);
    }

    @Override // l.InterfaceC21077
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6588(double d, double d2, C21245 c21245) {
        this.f6759.m21954(d, c21245);
        this.f6757.m21954(d2, c21245);
    }
}
