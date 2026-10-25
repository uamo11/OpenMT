package l;

import java.util.function.Function;

/* compiled from: F7CM */
/* renamed from: l.ۡ۟ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8732 extends C6759 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15869 f26579;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f26580;

    @Override // l.C6759
    /* renamed from: ܽ */
    public final int mo5678() {
        return 2;
    }

    public C8732(C3046 c3046, String str) {
        super(c3046, EnumC4662.f14819);
        this.f26579 = null;
        this.f26580 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22573(C3046 c3046, Function function) {
        C15869 m9313 = c3046.m9313(function);
        this.f26579 = m9313;
        String str = this.f26580;
        if (m9313 != null) {
            m9313.f49042.f7866 = str;
        } else {
            this.f26579 = c3046.m9312(str);
        }
    }

    @Override // l.C6759, l.InterfaceC1800
    /* renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) {
        if (this.f26579 != null) {
            super.mo2828(interfaceC0408);
            ((C6053) interfaceC0408).m16889(this.f26579.f20943);
        }
    }
}
