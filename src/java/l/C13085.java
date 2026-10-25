package l;

/* compiled from: E7M5 */
/* renamed from: l.۬ۨ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13085 implements InterfaceC11302 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12380 f39181;

    public C13085(C12380 c12380) {
        this.f39181 = c12380;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31721() {
        int i;
        C17651[] c17651Arr;
        C17651[] c17651Arr2;
        InterfaceC20835 interfaceC20835;
        C12380 c12380 = this.f39181;
        i = c12380.f37130;
        int i2 = i - 1;
        c12380.f37130 = i2;
        if (i2 > 0) {
            return;
        }
        c17651Arr = c12380.f37138;
        int i3 = 0;
        for (C17651 c17651 : c17651Arr) {
            i3 += c17651.m41379().f18978;
        }
        C13312[] c13312Arr = new C13312[i3];
        c17651Arr2 = c12380.f37138;
        int i4 = 0;
        for (C17651 c176512 : c17651Arr2) {
            int i5 = c176512.m41379().f18978;
            int i6 = 0;
            while (i6 < i5) {
                c13312Arr[i4] = c176512.m41379().m17102(i6);
                i6++;
                i4++;
            }
        }
        c12380.f37122 = new C6181(c13312Arr);
        interfaceC20835 = c12380.f37121;
        interfaceC20835.mo11120((InterfaceC9546) c12380);
    }

    @Override // l.InterfaceC19588
    /* renamed from: ֫ */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        InterfaceC20835 interfaceC20835;
        C12380 c12380 = this.f39181;
        interfaceC20835 = c12380.f37121;
        interfaceC20835.mo11119((InterfaceC0536) c12380);
    }
}
