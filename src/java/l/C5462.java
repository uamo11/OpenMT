package l;

/* compiled from: RA0U */
/* renamed from: l.ۚܺ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5462 extends AbstractC6167 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16991;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15338[] f16992;

    @Override // l.AbstractC6167
    /* renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        c13222.m32069(this.f16991);
        c13222.m32060(this.f16992);
        if (this.f16992 != null) {
            C13222 c132222 = c13222.f39585;
            int i = this.f16991;
            c132222.m32069(i);
            int i2 = c132222.f39586;
            c132222.m32059(i * 4);
            C13222 m32066 = c132222.m32066(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f16992[i3].mo2235(m32066);
            }
        }
    }

    @Override // l.AbstractC6167
    /* renamed from: ֫ */
    public final void mo2234(C13222 c13222) {
        c13222.m32063(4);
        this.f16991 = c13222.m32058();
        if (c13222.m32058() != 0) {
            C13222 c132222 = c13222.f39585;
            int m32058 = c132222.m32058();
            int i = c132222.f39586;
            c132222.m32059(m32058 * 4);
            if (this.f16992 == null) {
                if (m32058 < 0 || m32058 > 65535) {
                    throw new C12517("invalid array conformance");
                }
                this.f16992 = new C15338[m32058];
            }
            C13222 m32066 = c132222.m32066(i);
            for (int i2 = 0; i2 < m32058; i2++) {
                C15338[] c15338Arr = this.f16992;
                if (c15338Arr[i2] == null) {
                    c15338Arr[i2] = new C15338();
                }
                c15338Arr[i2].mo2234(m32066);
            }
        }
    }
}
