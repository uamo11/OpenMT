package l;

/* compiled from: P1SF */
/* renamed from: l.ܺ᩷֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16175 extends AbstractC18293 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9121[] f49827;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2771 f49828;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16175(AbstractC2771 abstractC2771, int i) {
        super(i, 0);
        this.f49828 = abstractC2771;
        int i2 = 0;
        this.f49827 = new C9121[1 << i];
        while (true) {
            C9121[] c9121Arr = this.f49827;
            if (i2 >= c9121Arr.length) {
                return;
            }
            c9121Arr[i2] = new C9121(this);
            i2++;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38112() {
        int i = 0;
        while (true) {
            C9121[] c9121Arr = this.f49827;
            if (i >= c9121Arr.length) {
                return;
            }
            AbstractC7070.m19072(c9121Arr[i].f51799);
            i++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38111() {
        this.f49827[0].m23495();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38110() {
        AbstractC2771 abstractC2771 = this.f49828;
        AbstractC13644 abstractC13644 = abstractC2771.f8630;
        this.f49827[m42641(abstractC13644.m32782(abstractC2771.f8626 + 1), abstractC13644.m32790() - abstractC2771.f8626)].m23495();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38109(int i, int i2, int i3, int i4, C0653 c0653) {
        AbstractC2771 abstractC2771 = this.f49828;
        int i5 = 0;
        int m36551 = C15469.m36551(abstractC2771.f53753[c0653.m2666()][abstractC2771.f53747 & i4], 0);
        int m42641 = m42641(i3, i4);
        boolean m2668 = c0653.m2668();
        int i6 = 256;
        C9121[] c9121Arr = this.f49827;
        if (m2668) {
            C9121 c9121 = c9121Arr[m42641];
            int i7 = i | 256;
            do {
                i5 += C15469.m36551(c9121.f51799[i7 >>> 8], (i7 >>> 7) & 1);
                i7 <<= 1;
            } while (i7 < 65536);
        } else {
            C9121 c91212 = c9121Arr[m42641];
            int i8 = i | 256;
            do {
                i2 <<= 1;
                i5 += C15469.m36551(c91212.f51799[(i2 & i6) + i6 + (i8 >>> 8)], (i8 >>> 7) & 1);
                i8 <<= 1;
                i6 &= ~(i2 ^ i8);
            } while (i8 < 65536);
        }
        return m36551 + i5;
    }
}
