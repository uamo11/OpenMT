package l;

import java.io.InputStream;

/* compiled from: A6S3 */
/* renamed from: l.᩺ᩴᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23182 implements InterfaceC20900 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17066 f74513;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20900 f74514;

    public C23182(InterfaceC20900 interfaceC20900, InterfaceC17066 interfaceC17066) {
        this.f74514 = interfaceC20900;
        this.f74513 = interfaceC17066;
    }

    @Override // l.InterfaceC20900
    public final C6788 identity() {
        return this.f74514.identity();
    }

    @Override // l.InterfaceC20900
    /* renamed from: ֫ */
    public final InputStream mo14081() {
        InputStream mo14081 = ((C4838) this.f74514).mo14081();
        InterfaceC17066 interfaceC17066 = this.f74513;
        return !(interfaceC17066 instanceof C2037) ? mo14081 : new C11894(mo14081, C2037.m6624(mo14081, interfaceC17066));
    }
}
