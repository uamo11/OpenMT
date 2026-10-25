package l;

import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: Y20N */
/* renamed from: l.۬᩶᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13350 extends C3695 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C13350 f39925 = new C13350();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13350 m32325() {
        return f39925;
    }

    @Override // l.C3695
    /* renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return m32324(((C12645) interfaceC17889).m30924());
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫ */
    public final C19883 mo11258(InterfaceC17889 interfaceC17889) {
        C19883 m9975 = C3256.m9975(interfaceC17889);
        if (m9975 == C19883.f64193) {
            String lowerCase = interfaceC17889.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C19883.f64240;
            }
        }
        return m9975;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        if (!interfaceC17889.mo36969()) {
            return 0;
        }
        C12645 c12645 = (C12645) interfaceC17889;
        if (c12645.mo25860()) {
            return 0;
        }
        String mo36971 = c12645.mo36971();
        long size = c12645.getSize();
        return mo36971.equals("image/svg+xml") ? size <= 819200 ? 2 : 0 : mo36971.equals("text/xml") ? size <= 153600 ? 3 : 0 : (!mo36971.startsWith("image/") || size > X931RNG.BLOCK128_RESEED_MAX) ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C11813 mo9350(l.AbstractC16891 r6, l.InterfaceC17889 r7, int r8) {
        /*
            r5 = this;
            l.ۧۗ᩻ r6 = (l.C10738) r6
            r0 = r7
            l.۫᩶᩻ r0 = (l.C12645) r0
            r1 = 0
            java.lang.String r2 = r6.m26937()     // Catch: java.lang.Throwable -> L36
            byte[] r3 = r6.m26940()     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L36
            l.ܶ᩵ܿ r2 = l.C16999.m39866(r2, r4)     // Catch: java.lang.Throwable -> L36
            l.ᩳܰۡ r2 = l.C18090.m42168(r2, r3)     // Catch: java.lang.Throwable -> L36
            l.ۗ᩺ۡ r3 = r0.m30924()     // Catch: java.lang.Throwable -> L2c
            byte[] r3 = r2.m42193(r3, r1)     // Catch: java.lang.Throwable -> L2c
            l.۟ۡۡ r4 = new l.۟ۡۡ     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            r2.close()     // Catch: java.lang.Throwable -> L2a
            goto L37
        L2a:
            r1 = r4
            goto L36
        L2c:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L36
        L35:
            throw r3     // Catch: java.lang.Throwable -> L36
        L36:
            r4 = r1
        L37:
            l.ۗ᩺ۡ r0 = r0.m30924()
            java.lang.String r0 = m32324(r0)
            r1 = 1
            if (r8 == r1) goto L81
            r2 = 2
            if (r8 == r2) goto L81
            r2 = 3
            if (r8 != r2) goto L7b
            l.᩵ۙ᩻ r6 = r6.mo6020()
            l.۫ܽܽ r6 = r6.m44386()
            if (r6 == 0) goto L60
            if (r4 == 0) goto L60
            l.᩶ۖܳ r8 = l.C19883.f64196
            l.ۙ᩶᩻ r2 = new l.ۙ᩶᩻
            r2.<init>(r5)
            l.ۨܺ᩷ r6 = l.C3695.m11250(r0, r8, r1, r2)
            goto L6c
        L60:
            l.᩶ۖܳ r6 = l.C19883.f64196
            l.ۗۖܳ r8 = new l.ۗۖܳ
            r2 = 4
            r8.<init>(r2, r4)
            l.ۨܺ᩷ r6 = l.C3695.m11250(r0, r6, r1, r8)
        L6c:
            l.᩶ۖܳ r8 = l.C19883.f64196
            l.ۨܺ᩷ r8 = r8.f64250
            if (r6 == r8) goto L7a
            r8 = 2131362468(0x7f0a02a4, float:1.8344717E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.mo36975(r8, r0)
        L7a:
            return r6
        L7b:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>()
            throw r6
        L81:
            l.᩶ۖܳ r6 = l.C19883.f64215
            l.᩶᩶᩻ r7 = new l.᩶᩶᩻
            r7.<init>(r4)
            l.ۨܺ᩷ r6 = l.C3695.m11250(r0, r6, r1, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13350.mo9350(l.ܽ᩷ܳ, l.ᩳۜܳ, int):l.ۨܺ᩷");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32324(C3545 c3545) {
        return C14460.m34530("zip:" + Long.toHexString(c3545.m10791()) + c3545.getSize()).toLowerCase();
    }
}
