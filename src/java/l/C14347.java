package l;

/* compiled from: 56XL */
/* renamed from: l.ܳۛ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14347 extends C11650 {

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f43261 = 0;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C10239 f43262 = C10239.m25929("2025-06-18", "2025-03-26");

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f43263;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C19793 f43264;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C5451 f43265;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19793 m34243(C3765 c3765) {
        C14347 c14347;
        c14347 = ServiceC19288.f60687;
        if (c14347 == null) {
            return null;
        }
        return c14347.f43264;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19793 m34242(C2354 c2354) {
        C14347 c14347;
        c14347 = ServiceC19288.f60687;
        if (c14347 == null) {
            return null;
        }
        return c14347.f43264;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14347(int r22) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14347.<init>(int):void");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m34244() {
        return this.f43263;
    }

    @Override // l.AbstractC4708
    /* renamed from: ᩳ */
    public final void mo13801() {
        C19793 c19793 = this.f43264;
        C5451 c5451 = this.f43265;
        C19926.m45879("MT MCP server stop requested: port=" + this.f43263 + ", wasStarted=" + m13800() + ", alive=" + m13798() + ", listeningPort=" + m13795(), new Throwable("MT MCP server stop trace"));
        try {
            super.mo13801();
        } finally {
            c5451.close();
            try {
                c19793.m45536();
            } catch (Exception e) {
                C19926.m45879("MT MCP smali cache shutdown failed", e);
            }
        }
    }
}
