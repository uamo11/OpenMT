package l;

/* compiled from: 38I8 */
/* renamed from: l.ۨ֡ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11352 implements InterfaceC17847 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8353 f33976;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f33977;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9248 f33978;

    public C11352(String str) {
        C1297 c1297 = new C1297();
        c1297.m4462("video/mp2t");
        c1297.m4465(str);
        this.f33976 = c1297.m4440();
    }

    @Override // l.InterfaceC17847
    /* renamed from: ֫ */
    public final void mo22462(C9248 c9248, InterfaceC21830 interfaceC21830, C19259 c19259) {
        this.f33978 = c9248;
        c19259.m44443();
        InterfaceC19383 mo3429 = interfaceC21830.mo3429(c19259.m44445(), 5);
        this.f33977 = mo3429;
        mo3429.mo8456(this.f33976);
    }

    @Override // l.InterfaceC17847
    /* renamed from: ֫ */
    public final void mo22463(C17714 c17714) {
        C22632.m50632(this.f33978);
        String str = C3603.f11424;
        long m23733 = this.f33978.m23733();
        long m23735 = this.f33978.m23735();
        if (m23733 == -9223372036854775807L || m23735 == -9223372036854775807L) {
            return;
        }
        C8353 c8353 = this.f33976;
        if (m23735 != c8353.f25620) {
            C1297 m21948 = c8353.m21948();
            m21948.m4443(m23735);
            C8353 m4440 = m21948.m4440();
            this.f33976 = m4440;
            this.f33977.mo8456(m4440);
        }
        int m41457 = c17714.m41457();
        this.f33977.mo8453(m41457, c17714);
        this.f33977.mo8455(m23733, 1, m41457, 0, null);
    }
}
