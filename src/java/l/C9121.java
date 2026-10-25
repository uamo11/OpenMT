package l;

/* compiled from: P1SF */
/* renamed from: l.ۡ᩷֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9121 extends AbstractC16881 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16175 f27631;

    public C9121(C16175 c16175) {
        this.f27631 = c16175;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23495() {
        C15469 c15469;
        C15469 c154692;
        AbstractC2771 abstractC2771 = this.f27631.f49828;
        int i = 256;
        int m32782 = abstractC2771.f8630.m32782(abstractC2771.f8626) | 256;
        boolean m2668 = abstractC2771.f53750.m2668();
        short[] sArr = this.f51799;
        if (m2668) {
            do {
                c154692 = abstractC2771.f8633;
                c154692.m36557(sArr, m32782 >>> 8, (m32782 >>> 7) & 1);
                m32782 <<= 1;
            } while (m32782 < 65536);
        } else {
            int m327822 = abstractC2771.f8630.m32782(abstractC2771.f53746[0] + 1 + abstractC2771.f8626);
            do {
                m327822 <<= 1;
                c15469 = abstractC2771.f8633;
                c15469.m36557(sArr, (m327822 & i) + i + (m32782 >>> 8), (m32782 >>> 7) & 1);
                m32782 <<= 1;
                i &= ~(m327822 ^ m32782);
            } while (m32782 < 65536);
        }
        abstractC2771.f53750.m2672();
    }
}
