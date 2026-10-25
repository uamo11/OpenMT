package l;

/* compiled from: E1YX */
/* renamed from: l.ۛ᩹᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6358 extends AbstractC1661 {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r4.mo27924() != false) goto L15;
     */
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1455(final l.C2450 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "zip"
            r7.m7907(r0)
            l.ܽ᩷ܳ r0 = r7.m7922()
            l.ۧۗ᩻ r0 = (l.C10738) r0
            java.lang.String r1 = r0.m26937()
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            l.ܶ᩵ܿ r3 = l.C16999.m39866(r1, r3)
            boolean r4 = r0.m26939()
            if (r4 == 0) goto L23
            r7 = 2131888820(0x7f120ab4, float:1.9412286E38)
            l.C21374.m48457(r7)
            return
        L23:
            boolean r4 = r3.mo27924()
            if (r4 == 0) goto L37
            l.ܶ᩵ܿ r4 = r3.m36536()
            l.C11003.requireNonNull(r4)
            boolean r4 = r4.mo27924()
            if (r4 == 0) goto L37
            goto L51
        L37:
            boolean r4 = l.C9255.m23780()
            if (r4 != 0) goto L51
            bin.mt.plus.Main r7 = r7.m7917()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r1
            r1 = 2131889037(0x7f120b8d, float:1.9412726E38)
            java.lang.String r0 = l.C4925.m14306(r1, r0)
            r7.m10221(r0, r2)
            return
        L51:
            boolean r1 = r0.m26936()
            r2 = 0
            if (r1 == 0) goto L5d
            java.lang.String r1 = l.C22263.m49978(r3)
            goto L5e
        L5d:
            r1 = r2
        L5e:
            bin.mt.plus.Main r3 = r7.m7917()
            l.᩵ۚۢ r3 = r3.buildDialog()
            r4 = 2131887562(0x7f1205ca, float:1.9409735E38)
            r3.m44433(r4)
            java.lang.String r4 = l.AbstractC1661.m5601(r7)
            r3.m44424(r4)
            l.ۙ᩹᩻ r4 = new l.ۙ᩹᩻
            r4.<init>()
            r5 = 2131887882(0x7f12070a, float:1.9410384E38)
            r3.m44442(r5, r4)
            r4 = 2131886430(0x7f12015e, float:1.9407439E38)
            r3.m44434(r4, r2)
            boolean r0 = r0.m26936()
            if (r0 == 0) goto L9c
            l.ܽۢܳ r7 = r7.m7921()
            r0 = 2131886340(0x7f120104, float:1.9407256E38)
            r3.m44440(r0, r2)
            l.֡ۚۢ r0 = r3.m44438()
            l.C10025.m25199(r7, r0, r1)
            return
        L9c:
            r3.m44438()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6358.mo1455(l.ۖۢܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17658(final C6358 c6358, C10738 c10738, final C2450 c2450, String str) {
        if (c10738.m26936()) {
            C10025.m25197(new InterfaceC12846(c6358) { // from class: l.ۗ᩹᩻
                @Override // l.InterfaceC12846
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC12846
                /* renamed from: ֫ */
                public final void mo3776(C11667 c11667, boolean z) {
                    C6358.m17659(c2450, c11667, z);
                }

                @Override // l.InterfaceC12846
                /* renamed from: ֫ */
                public final /* synthetic */ boolean mo3777(Exception exc) {
                    return false;
                }
            }, c2450.m7917(), str);
        } else {
            m17659(c2450, null, false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17659(C2450 c2450, C11667 c11667, boolean z) {
        C10738 c10738 = (C10738) c2450.m7922();
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C10592.class);
        c0994.m3483(c2450.m7909());
        c0994.m3474("zipPath", c10738.m26937());
        c0994.m3486(c2450);
        c0994.m3472(c2450.m7917(), c11667);
        c0994.m3475("keepApkSigBlock", z);
        c0994.m3469();
    }
}
