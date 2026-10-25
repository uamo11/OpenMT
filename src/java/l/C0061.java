package l;

/* compiled from: 98SV */
/* renamed from: l.֡֡ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0061 implements InterfaceC15583 {

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final float[] f959 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18407 f960;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f961;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0913 f962;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17714 f963;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f964;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f965 = new boolean[4];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f966;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f967;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f968;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5707 f969;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19113 f970;

    public C0061(C0913 c0913) {
        this.f962 = c0913;
        C18407 c18407 = new C18407();
        c18407.f57148 = new byte[128];
        this.f960 = c18407;
        this.f967 = -9223372036854775807L;
        this.f969 = new C5707(178);
        this.f963 = new C17714();
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1000() {
        C16509.m38887(this.f965);
        this.f960.m42832();
        C19113 c19113 = this.f970;
        if (c19113 != null) {
            c19113.m44060();
        }
        C5707 c5707 = this.f969;
        if (c5707 != null) {
            c5707.m16117();
        }
        this.f961 = 0L;
        this.f967 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f964 = c19259.m44444();
        InterfaceC19383 mo3429 = interfaceC21830.mo3429(c19259.m44445(), 2);
        this.f968 = mo3429;
        this.f970 = new C19113(mo3429);
        this.f962.m3268(interfaceC21830, c19259);
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1001(int i, long j) {
        this.f967 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    @Override // l.InterfaceC15583
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1002(l.C17714 r17) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0061.mo1002(l.ᩳ֨֫):void");
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1004(boolean z) {
        C22632.m50632(this.f970);
        if (z) {
            this.f970.m44063(this.f961, 0, this.f966);
            this.f970.m44060();
        }
    }
}
