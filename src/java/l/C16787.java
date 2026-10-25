package l;

/* compiled from: 2BCD */
/* renamed from: l.ܽܿܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16787 extends AbstractC11144 implements InterfaceC11870 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23095 f51550;

    public C16787(C12512 c12512, int i, C20274 c20274, C13985 c13985) {
        super(c12512, i, c20274, c13985);
        String string = mo10273().getString();
        C7573 m30696 = c12512.m30696();
        boolean z = (i & 8) != 0;
        boolean m46531 = c20274.m46531();
        C23095 m51255 = C23095.m51255(string);
        if (!z) {
            m51255 = m51255.m51258(m46531 ? m30696.m20303(Integer.MAX_VALUE) : m30696);
        }
        this.f51550 = m51255;
    }

    @Override // l.InterfaceC11870
    /* renamed from: ֫ */
    public final C23095 mo10262() {
        return this.f51550;
    }
}
