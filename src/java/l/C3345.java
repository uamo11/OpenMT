package l;

/* compiled from: 9A0K */
/* renamed from: l.ۗܺ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3345 extends AbstractC6167 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20279[] f10573;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f10574;

    @Override // l.AbstractC6167
    /* renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        c13222.m32069(this.f10574);
        c13222.m32060(this.f10573);
        if (this.f10573 != null) {
            C13222 c132222 = c13222.f39585;
            int i = this.f10574;
            c132222.m32069(i);
            int i2 = c132222.f39586;
            c132222.m32059(i * 12);
            C13222 m32066 = c132222.m32066(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f10573[i3].mo2235(m32066);
            }
        }
    }

    @Override // l.AbstractC6167
    /* renamed from: ֫ */
    public final void mo2234(C13222 c13222) {
        c13222.m32063(4);
        this.f10574 = c13222.m32058();
        if (c13222.m32058() != 0) {
            C13222 c132222 = c13222.f39585;
            int m32058 = c132222.m32058();
            int i = c132222.f39586;
            c132222.m32059(m32058 * 12);
            if (this.f10573 == null) {
                if (m32058 < 0 || m32058 > 65535) {
                    throw new C12517("invalid array conformance");
                }
                this.f10573 = new C20279[m32058];
            }
            C13222 m32066 = c132222.m32066(i);
            for (int i2 = 0; i2 < m32058; i2++) {
                C20279[] c20279Arr = this.f10573;
                if (c20279Arr[i2] == null) {
                    c20279Arr[i2] = new C20279();
                }
                c20279Arr[i2].mo2234(m32066);
            }
        }
    }
}
