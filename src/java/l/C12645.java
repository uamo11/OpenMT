package l;

/* compiled from: M60I */
/* renamed from: l.۫᩶᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12645 extends C15688 {

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38088 = 0;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C15538 f38089;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C3545 f38090;

    @Override // l.C15688
    /* renamed from: ֫ */
    public final boolean mo28850() {
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12645(l.C3545 r10) {
        /*
            r9 = this;
            java.lang.String r1 = r10.m10810()
            java.lang.String r0 = r10.getParent()
            java.lang.String r2 = "/"
            if (r0 != 0) goto Ld
            goto L12
        Ld:
            java.lang.String r0 = r2.concat(r0)
            r2 = r0
        L12:
            long r4 = r10.getSize()
            long r6 = r10.getTime()
            boolean r0 = r10.isDirectory()
            r8 = r0 ^ 1
            r3 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r6, r8)
            r9.f38090 = r10
            l.ܶ᩺ۡ r10 = r10.m10780()
            r9.f38089 = r10
            if (r10 == 0) goto L3c
            boolean r0 = r10.m36639()
            if (r0 == 0) goto L3c
            java.lang.String r10 = r10.m36637()
            r9.m36964(r10)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12645.<init>(l.ۗ᩺ۡ):void");
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ᩴ */
    public final boolean mo25860() {
        return this.f38090.m10808();
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ֨ۧ */
    public final C16477 mo24428() {
        C15538 c15538 = this.f38089;
        if (c15538 == null || !c15538.m36640()) {
            return null;
        }
        return new C16477(c15538.m36638(), (String) null, (String) null);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3545 m30924() {
        return this.f38090;
    }
}
