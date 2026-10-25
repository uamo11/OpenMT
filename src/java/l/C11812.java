package l;

/* compiled from: 2A1U */
/* renamed from: l.ۨܺ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11812 extends AbstractC6167 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f35231;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f35232;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f35233;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte f35234;

    @Override // l.AbstractC6167
    /* renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        byte b = this.f35234;
        c13222.m32069(b);
        c13222.m32064(this.f35232);
        c13222.m32064(this.f35234);
        int i = c13222.f39586;
        c13222.m32059(6);
        int i2 = c13222.f39586;
        c13222.m32059(b * 4);
        C13222 m32066 = c13222.m32066(i);
        for (int i3 = 0; i3 < 6; i3++) {
            m32066.m32064(this.f35231[i3]);
        }
        C13222 m320662 = m32066.m32066(i2);
        for (int i4 = 0; i4 < b; i4++) {
            m320662.m32069(this.f35233[i4]);
        }
    }

    @Override // l.AbstractC6167
    /* renamed from: ֫ */
    public final void mo2234(C13222 c13222) {
        c13222.m32063(4);
        int m32058 = c13222.m32058();
        this.f35232 = (byte) c13222.m32065();
        this.f35234 = (byte) c13222.m32065();
        int i = c13222.f39586;
        c13222.m32059(6);
        int i2 = c13222.f39586;
        c13222.m32059(m32058 * 4);
        if (this.f35231 == null) {
            this.f35231 = new byte[6];
        }
        C13222 m32066 = c13222.m32066(i);
        for (int i3 = 0; i3 < 6; i3++) {
            this.f35231[i3] = (byte) m32066.m32065();
        }
        if (this.f35233 == null) {
            if (m32058 < 0 || m32058 > 65535) {
                throw new C12517("invalid array conformance");
            }
            this.f35233 = new int[m32058];
        }
        C13222 m320662 = m32066.m32066(i2);
        for (int i4 = 0; i4 < m32058; i4++) {
            this.f35233[i4] = m320662.m32058();
        }
    }
}
