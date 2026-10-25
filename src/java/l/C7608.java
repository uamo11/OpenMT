package l;

/* compiled from: Y2SQ */
/* renamed from: l.۟ܿۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7608 extends C11842 implements InterfaceC2922, InterfaceC0804 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1880 f23545;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7382 f23546;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23589 f23547;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7382 f23548;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7608(C1880 c1880, InterfaceC2922 interfaceC2922) {
        super(c1880, interfaceC2922);
        this.f23545 = c1880;
    }

    @Override // l.InterfaceC2922
    /* renamed from: ֫ */
    public final int mo8920() {
        return ((InterfaceC2922) this.f35328).mo8920();
    }

    @Override // l.InterfaceC2922
    /* renamed from: ᩻ */
    public final InterfaceC15347 mo8923() {
        C7382 c7382 = this.f23548;
        return c7382 != null ? c7382 : ((InterfaceC2922) this.f35328).mo8923();
    }

    @Override // l.InterfaceC2922
    /* renamed from: ۡ */
    public final InterfaceC21699 mo8921() {
        C23589 c23589 = this.f23547;
        if (c23589 != null) {
            return c23589;
        }
        InterfaceC21699 mo8921 = ((InterfaceC2922) this.f35328).mo8921();
        if (mo8921 == null) {
            return null;
        }
        return new C19086(this.f23545.f6388.m39233(), mo8921);
    }

    @Override // l.InterfaceC2922
    /* renamed from: ᩴ */
    public final InterfaceC15347 mo8922() {
        C7382 c7382 = this.f23546;
        return c7382 != null ? c7382 : ((InterfaceC2922) this.f35328).mo8922();
    }

    @Override // l.InterfaceC0804
    /* renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        InterfaceC21699 mo8921 = mo8921();
        if (mo8921 != null) {
            this.f23547 = c19357.f68957.m34448(mo8921.getType());
        }
        InterfaceC15347 mo8923 = mo8923();
        if (mo8923 != null) {
            this.f23548 = c19357.m44616(mo8923.getString());
        }
        InterfaceC15347 mo8922 = mo8922();
        if (mo8922 != null) {
            this.f23546 = c19357.m44616(mo8922.getString());
        }
    }
}
