package l;

/* compiled from: 544J */
/* renamed from: l.֫ܶ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1903 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f6416;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f6417;

    public C1903(C16719 c16719) {
        InterfaceC3109 interfaceC3109;
        InterfaceC3109 interfaceC31092;
        int mo9480;
        C14397 c14397;
        C14397 c143972;
        C14397 c143973;
        interfaceC3109 = c16719.f51348;
        if (interfaceC3109 == null) {
            mo9480 = -1;
        } else {
            interfaceC31092 = c16719.f51348;
            mo9480 = interfaceC31092.mo9480();
        }
        if (mo9480 != -1) {
            c14397 = c16719.f51346;
            if (c14397 != null) {
                c143972 = c16719.f51346;
                this.f6417 = c143972.m34392(mo9480);
                c143973 = c16719.f51346;
                this.f6416 = c143973.m34389(mo9480, true);
                return;
            }
        }
        this.f6416 = -1;
        this.f6417 = -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m6254() {
        return this.f6417;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6253() {
        return this.f6416;
    }
}
