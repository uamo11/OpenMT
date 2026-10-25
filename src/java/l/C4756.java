package l;

/* compiled from: 9A0K */
/* renamed from: l.ۙܺ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4756 extends AbstractC6167 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22395[] f15085;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15086;

    @Override // l.AbstractC6167
    /* renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        c13222.m32069(this.f15086);
        c13222.m32060(this.f15085);
        if (this.f15085 != null) {
            C13222 c132222 = c13222.f39585;
            int i = this.f15086;
            c132222.m32069(i);
            int i2 = c132222.f39586;
            c132222.m32059(i * 4);
            C13222 m32066 = c132222.m32066(i2);
            for (int i3 = 0; i3 < i; i3++) {
                this.f15085[i3].mo2235(m32066);
            }
        }
    }

    @Override // l.AbstractC6167
    /* renamed from: ֫ */
    public final void mo2234(C13222 c13222) {
        c13222.m32063(4);
        this.f15086 = c13222.m32058();
        if (c13222.m32058() != 0) {
            C13222 c132222 = c13222.f39585;
            int m32058 = c132222.m32058();
            int i = c132222.f39586;
            c132222.m32059(m32058 * 4);
            if (this.f15085 == null) {
                if (m32058 < 0 || m32058 > 65535) {
                    throw new C12517("invalid array conformance");
                }
                this.f15085 = new C22395[m32058];
            }
            C13222 m32066 = c132222.m32066(i);
            for (int i2 = 0; i2 < m32058; i2++) {
                C22395[] c22395Arr = this.f15085;
                if (c22395Arr[i2] == null) {
                    c22395Arr[i2] = new C22395();
                }
                c22395Arr[i2].mo2234(m32066);
            }
        }
    }
}
