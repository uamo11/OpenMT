package l;

/* compiled from: M1ZN */
/* renamed from: l.ۚ᩹᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5653 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && c2450.m7919().m39035("zip");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        if (r1.mo27924() != false) goto L15;
     */
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1455(l.C2450 r12) {
        /*
            r11 = this;
            l.ܽۢܳ r0 = r12.m7919()
            java.lang.String r1 = "local"
            r12.m7907(r1)
            java.lang.String r1 = "zip"
            r0.m38998(r1)
            l.ܽ᩷ܳ r0 = r0.m39044()
            r8 = r0
            l.ۧۗ᩻ r8 = (l.C10738) r8
            boolean r0 = r8.m26939()
            if (r0 == 0) goto L22
            r12 = 2131888820(0x7f120ab4, float:1.9412286E38)
            l.C21374.m48457(r12)
            return
        L22:
            java.lang.String r4 = r8.m26937()
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            l.ܶ᩵ܿ r10 = l.C16999.m39866(r4, r1)
            boolean r1 = r10.mo27924()
            if (r1 == 0) goto L41
            l.ܶ᩵ܿ r1 = r10.m36536()
            l.C11003.requireNonNull(r1)
            boolean r1 = r1.mo27924()
            if (r1 == 0) goto L41
            goto L5b
        L41:
            boolean r1 = l.C9255.m23780()
            if (r1 != 0) goto L5b
            bin.mt.plus.Main r12 = r12.m7917()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            r2 = 2131889037(0x7f120b8d, float:1.9412726E38)
            java.lang.String r1 = l.C4925.m14306(r2, r1)
            r12.m10221(r1, r0)
            return
        L5b:
            boolean r0 = r8.m26936()
            if (r0 == 0) goto L66
            java.lang.String r0 = l.C22263.m49978(r10)
            goto L67
        L66:
            r0 = 0
        L67:
            r9 = r0
            l.ۘ᩹᩻ r0 = new l.ۘ᩹᩻
            l.ܽۢܳ r3 = r12.m7921()
            boolean r5 = r8.m26936()
            r1 = r0
            r2 = r11
            r6 = r9
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r12 = r12.m7918()
            r0.m9489(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5653.mo1455(l.ۖۢܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15942(C5653 c5653, C2450 c2450, AbstractC15440 abstractC15440, int i, int i2, boolean z, String str, C11667 c11667, boolean z2) {
        int i3 = C15104.f46193;
        C0994 c0994 = new C0994(C0713.class);
        c0994.m3474("zipPath", abstractC15440.mo23554());
        c0994.m3474("rename", str);
        c0994.m3484(c2450);
        c0994.m3478(c2450.m7909());
        c0994.m3470(i, "level");
        c0994.m3470(i2, "update");
        c0994.m3475("deleteSources", z);
        c0994.m3474("basePath", c2450.m7919().m39058().substring(1));
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z2);
        c0994.m3469();
    }
}
