package l;

/* compiled from: N673 */
/* renamed from: l.۬ۗᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C12851 implements InterfaceC2974 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ C12851(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        switch (this.a) {
            case 0:
                int l2 = interfaceC15672.l(EnumC18496.DAY_OF_WEEK);
                int i = this.b;
                if (l2 == i) {
                    return interfaceC15672;
                }
                return interfaceC15672.d(l2 - i >= 0 ? 7 - r0 : -r0, EnumC8618.DAYS);
            default:
                int l3 = interfaceC15672.l(EnumC18496.DAY_OF_WEEK);
                int i2 = this.b;
                if (l3 == i2) {
                    return interfaceC15672;
                }
                return interfaceC15672.w(i2 - l3 >= 0 ? 7 - r1 : -r1, EnumC8618.DAYS);
        }
    }
}
