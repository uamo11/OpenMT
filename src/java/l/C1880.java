package l;

/* compiled from: Y2SQ */
/* renamed from: l.֫ܳۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1880 implements InterfaceC18380 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16696 f6388;

    @Override // l.InterfaceC18380
    /* renamed from: ֫ */
    public final Object mo4329(Object obj) {
        InterfaceC7860 interfaceC7860 = (InterfaceC7860) obj;
        int mo8424 = interfaceC7860.mo8424();
        if (mo8424 == 3) {
            return new C7608(this, (InterfaceC2922) interfaceC7860);
        }
        if (mo8424 != 5) {
            return mo8424 != 6 ? interfaceC7860 : new C13957(this, (InterfaceC19856) interfaceC7860);
        }
        return new C23130(this, (InterfaceC14915) interfaceC7860);
    }

    public C1880(C16696 c16696) {
        this.f6388 = c16696;
    }
}
