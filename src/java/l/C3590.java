package l;

/* compiled from: R8JP */
/* renamed from: l.ۘ֡ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3590 implements InterfaceC15583 {

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final double[] f11386 = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0913 f11387;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f11388;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f11389;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f11390;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f11391 = new boolean[4];

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f11392;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f11393;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2179 f11394;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f11395;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f11396;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f11397;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f11398;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f11399;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5707 f11400;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C17714 f11401;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f11402;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f11403;

    public C3590(C0913 c0913, String str) {
        this.f11387 = c0913;
        this.f11388 = str;
        C2179 c2179 = new C2179();
        c2179.f7172 = new byte[128];
        this.f11394 = c2179;
        if (c0913 != null) {
            this.f11400 = new C5707(178);
            this.f11401 = new C17714();
        } else {
            this.f11400 = null;
            this.f11401 = null;
        }
        this.f11403 = -9223372036854775807L;
        this.f11396 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1000() {
        C16509.m38887(this.f11391);
        this.f11394.m7194();
        C5707 c5707 = this.f11400;
        if (c5707 != null) {
            c5707.m16117();
        }
        this.f11390 = 0L;
        this.f11389 = false;
        this.f11403 = -9223372036854775807L;
        this.f11396 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f11397 = c19259.m44444();
        this.f11395 = interfaceC21830.mo3429(c19259.m44445(), 2);
        C0913 c0913 = this.f11387;
        if (c0913 != null) {
            c0913.m3268(interfaceC21830, c19259);
        }
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f11403 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1002(l.C17714 r19) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3590.mo1002(l.ᩳ֨֫):void");
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1004(boolean z) {
        C22632.m50632(this.f11395);
        if (z) {
            boolean z2 = this.f11393;
            this.f11395.mo8455(this.f11396, z2 ? 1 : 0, (int) (this.f11390 - this.f11392), 0, null);
        }
    }
}
