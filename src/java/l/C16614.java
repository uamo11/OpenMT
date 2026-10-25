package l;

/* compiled from: R9K4 */
/* renamed from: l.ܽۨۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C16614 extends AbstractC0803 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C12921 f51045;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f51046;

    /* renamed from: ܳ */
    public C16614 mo7973() {
        return this;
    }

    /* renamed from: ܿ */
    public int mo7975() {
        return 65536;
    }

    public C16614() {
        super(new C23670());
    }

    public C16614(EnumC22094 enumC22094, EnumC22799 enumC22799) {
        this(25, enumC22094, enumC22799, 0L, 0L);
    }

    public C16614(EnumC22094 enumC22094, EnumC22799 enumC22799, long j) {
        this(4, enumC22094, enumC22799, j, 0L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16614(int r2, l.EnumC22094 r3, l.EnumC22799 r4, long r5, long r7) {
        /*
            r1 = this;
            l.᩻ۨۖ r0 = new l.᩻ۨۖ
            r0.<init>()
            r1.<init>(r0)
            r1.f51046 = r2
            r0.m52198(r3)
            l.ۚ֫ۘ r2 = r1.f2936
            l.᩻ۨۖ r2 = (l.C23670) r2
            r2.m52199(r4)
            l.ۚ֫ۘ r2 = r1.f2936
            l.᩻ۨۖ r2 = (l.C23670) r2
            r2.m52212(r5)
            l.ۚ֫ۘ r2 = r1.f2936
            l.᩻ۨۖ r2 = (l.C23670) r2
            r2.m52215(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16614.<init>(int, l.᩹ۛۖ, l.᩺ۛۖ, long, long):void");
    }

    @Override // l.AbstractC0803
    /* renamed from: ֫ */
    public final C0097 mo3027() {
        return this.f2935;
    }

    @Override // l.InterfaceC0446
    /* renamed from: ܽ, reason: merged with bridge method [inline-methods] */
    public void mo2003(C0097 c0097) {
        this.f2935 = c0097;
        ((C23670) this.f2936).m52206(c0097);
        mo8728(c0097);
        ((C23670) this.f2936).m52211(c0097.m26091());
    }

    /* renamed from: ᩳ */
    public void mo8728(C0097 c0097) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39138(C18026 c18026) {
        this.f2935 = c18026.m21060();
        this.f2936 = c18026.m21061();
        mo7050(this.f2935);
        this.f2935.m26097(((C23670) this.f2936).mo14554());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39139(C18026 c18026) {
        this.f2935 = c18026.m21060();
        this.f2936 = c18026.m21061();
        C12921 c12921 = new C12921();
        c12921.m31431((C23670) this.f2936, this.f2935);
        this.f51045 = c12921;
        this.f2935.m26097(((C23670) this.f2936).mo14554());
    }

    /* renamed from: ۧ */
    public void mo7050(C0097 c0097) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m39141() {
        return this.f51045 == null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12921 m39140() {
        return this.f51045;
    }

    public String toString() {
        return ((C23670) this.f2936).m52217() + " with message id << " + ((C23670) this.f2936).m52201() + " >>";
    }
}
