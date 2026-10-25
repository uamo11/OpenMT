package l;

/* compiled from: 81J9 */
/* renamed from: l.ܽܿۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16784 implements InterfaceC2570 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23840 f51546;

    @Override // l.InterfaceC2570
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC2570
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C16784(C23840 c23840) {
        this.f51546 = c23840;
    }

    @Override // l.InterfaceC2570
    public final void onPageSelected(int i) {
        C3764 c3764;
        C23840 c23840 = this.f51546;
        if (i == 3) {
            c3764 = c23840.f77139;
            c3764.m11416();
        }
        c23840.m52537();
    }
}
