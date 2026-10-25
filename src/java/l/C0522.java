package l;

/* compiled from: RA0U */
/* renamed from: l.֡ܺ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0522 extends AbstractC6167 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f2178;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8284[] f2179;

    @Override // l.AbstractC6167
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        c13222.m32069(this.f2178);
        c13222.m32060(this.f2179);
        if (this.f2179 != null) {
            C13222 c132222 = c13222.f39585;
            int i = this.f2178;
            c132222.m32069(i);
            int i2 = c132222.f39586;
            c132222.m32059(i * 4);
            C13222 m32066 = c132222.m32066(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f2179[i3].mo2235(m32066);
            }
        }
    }

    @Override // l.AbstractC6167
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2234(C13222 c13222) {
        c13222.m32063(4);
        this.f2178 = c13222.m32058();
        if (c13222.m32058() != 0) {
            C13222 c132222 = c13222.f39585;
            int m32058 = c132222.m32058();
            int i = c132222.f39586;
            c132222.m32059(m32058 * 4);
            if (this.f2179 == null) {
                if (m32058 < 0 || m32058 > 65535) {
                    throw new C12517("invalid array conformance");
                }
                this.f2179 = new C8284[m32058];
            }
            C13222 m32066 = c132222.m32066(i);
            for (int i2 = 0; i2 < m32058; i2++) {
                C8284[] c8284Arr = this.f2179;
                if (c8284Arr[i2] == null) {
                    c8284Arr[i2] = new C8284();
                }
                c8284Arr[i2].mo2234(m32066);
            }
        }
    }
}
