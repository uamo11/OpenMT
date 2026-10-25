package l;

/* compiled from: A4WL */
/* renamed from: l.ۧۖ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10699 extends AbstractC11795 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC6150 f32210 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6150[] f32211;

    public C10699(InterfaceC6150[] interfaceC6150Arr) {
        this.f32211 = interfaceC6150Arr;
    }

    @Override // l.InterfaceC6150
    /* renamed from: ֫ */
    public final C10384 mo11134(String str) {
        InterfaceC6150 interfaceC6150 = this.f32210;
        if (interfaceC6150 != null) {
            return interfaceC6150.mo11134(str);
        }
        for (InterfaceC6150 interfaceC61502 : this.f32211) {
            C10384 mo11134 = interfaceC61502.mo11134(str);
            if (mo11134 != null) {
                this.f32210 = interfaceC61502;
                return mo11134;
            }
        }
        return null;
    }
}
