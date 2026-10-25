package l;

/* compiled from: W8S5 */
/* renamed from: l.ۧۚۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10792 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f32454;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15583 f32455;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f32456;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16302 f32457 = new C16302(new byte[64], 64);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f32458;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f32459;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9248 f32460;

    public C10792(InterfaceC15583 interfaceC15583, C9248 c9248) {
        this.f32455 = interfaceC15583;
        this.f32460 = c9248;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26989() {
        this.f32458 = false;
        this.f32455.mo1000();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26990(C17714 c17714) {
        C16302 c16302 = this.f32457;
        c17714.m41461(0, 3, c16302.f50146);
        c16302.m38354(0);
        c16302.m38351(8);
        this.f32459 = c16302.m38352();
        this.f32454 = c16302.m38352();
        c16302.m38351(6);
        c17714.m41461(0, c16302.m38343(8), c16302.f50146);
        c16302.m38354(0);
        this.f32456 = 0L;
        if (this.f32459) {
            c16302.m38351(4);
            c16302.m38351(1);
            c16302.m38351(1);
            long m38343 = (c16302.m38343(3) << 30) | (c16302.m38343(15) << 15) | c16302.m38343(15);
            c16302.m38351(1);
            boolean z = this.f32458;
            C9248 c9248 = this.f32460;
            if (!z && this.f32454) {
                c16302.m38351(4);
                c16302.m38351(1);
                c16302.m38351(1);
                c16302.m38351(1);
                c9248.m23734(c16302.m38343(15) | (c16302.m38343(3) << 30) | (c16302.m38343(15) << 15));
                this.f32458 = true;
            }
            this.f32456 = c9248.m23734(m38343);
        }
        long j = this.f32456;
        InterfaceC15583 interfaceC15583 = this.f32455;
        interfaceC15583.mo1001(4, j);
        interfaceC15583.mo1002(c17714);
        interfaceC15583.mo1004(false);
    }
}
