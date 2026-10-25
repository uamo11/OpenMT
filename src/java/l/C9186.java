package l;

/* compiled from: R9E5 */
/* renamed from: l.ۡ᩺ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9186 extends C16614 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16594 f27824;

    public C9186(EnumC22094 enumC22094, C16594 c16594, long j) {
        super(9, enumC22094, EnumC22799.SMB2_TREE_CONNECT, j, 0L);
        this.f27824 = c16594;
    }

    @Override // l.C16614
    /* renamed from: ᩳ */
    public final void mo8728(C0097 c0097) {
        c0097.m26086(this.f51046);
        EnumC22094 enumC22094 = EnumC22094.UNKNOWN;
        c0097.m1080();
        c0097.m26086(72);
        String m39097 = this.f27824.m39097();
        if (m39097 == null) {
            c0097.m26086(0);
        } else {
            c0097.m26086(m39097.length() * 2);
        }
        c0097.m26089(m39097, C8208.f25222);
    }
}
