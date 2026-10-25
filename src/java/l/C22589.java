package l;

/* compiled from: 8459 */
/* renamed from: l.᩹᩺֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22589 extends C14190 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19810 f73010;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23294 f73011;

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        m50563(c8526, c8526.f26045, this.f73010);
        super.mo1388(c8526);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C12048 c12048 = c9378.f28489;
        if (c12048.f17561.f17559 == EnumC1296.f4582) {
            m50563(c9378, c12048, this.f73010);
        }
        super.mo1392(c9378);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        AbstractC19810 abstractC19810 = this.f73010;
        this.f73010 = c5557.f17186;
        try {
            super.mo1215(c5557);
        } finally {
            this.f73010 = abstractC19810;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r0 = r2.f74804;
        r15 = r0.m17562(r15);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m50563(l.AbstractC5144 r13, l.AbstractC5698 r14, l.AbstractC19810 r15) {
        /*
            r12 = this;
            l.ۙ֨֨ r15 = r15.f17560
        L2:
            l.ۨۚ֨ r0 = l.AbstractC4308.f13885
            if (r15 == r0) goto Lba
            l.᩶֡֨ r0 = r15.f13890
            l.ܰ᩵֨ r0 = r0.mo16064()
            l.ۤܶ۠ r1 = r14.f17562
            l.֨᩵֨ r2 = l.EnumC1317.NON_RECURSIVE
            r3 = 0
            java.lang.Iterable r0 = r0.mo20477(r1, r3, r2)
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            l.᩺᩺֨ r2 = r12.f73011
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r0.next()
            l.ۛ֡֨ r1 = (l.AbstractC5698) r1
            l.֨ᩴ֨ r3 = r14.f17559
            l.֨ᩴ֨ r4 = r1.f17559
            if (r3 != r4) goto L19
            l.ۛ᩸֨ r3 = l.C23294.m51638(r2)
            l.ۛ᩸֨ r4 = l.C23294.m51638(r2)
            l.ۙ֨֨ r5 = r14.f17560
            l.ۙ֨֨ r4 = r4.m17519(r5)
            l.ۛ᩸֨ r5 = l.C23294.m51638(r2)
            l.ۙ֨֨ r6 = r1.f17560
            l.ۙ֨֨ r5 = r5.m17519(r6)
            boolean r3 = r3.m17550(r4, r5)
            if (r3 == 0) goto L19
            if (r14 == r1) goto L19
            long r3 = r14.mo16084()
            r5 = 4096(0x1000, double:2.0237E-320)
            long r3 = r3 & r5
            long r7 = r1.mo16084()
            long r7 = r7 & r5
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L19
            long r3 = r14.mo16084()
            r7 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r3 = r3 & r7
            r9 = 0
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 != 0) goto L19
            long r3 = r1.mo16084()
            long r3 = r3 & r7
            int r7 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r7 != 0) goto L19
            long r3 = r1.mo16084()
            long r3 = r3 & r5
            int r15 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r15 != 0) goto L80
            r14 = r1
        L80:
            l.ۙ֨֨ r15 = r14.f17560
            boolean r15 = r15.mo12948()
            if (r15 != 0) goto Lba
            l.᩹ܶ۠ r15 = l.C23294.m51629(r2)
            l.ۛ֡֨ r0 = r14.m16072()
            l.ۛ֡֨ r1 = r14.m16072()
            l.ۨ۠۠ r2 = l.C11886.f35440
            l.ۨ۠۠ r2 = new l.ۨ۠۠
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r14
            r14 = 1
            r3[r14] = r1
            java.lang.String r14 = "compiler"
            java.lang.String r1 = "synthetic.name.conflict"
            r2.<init>(r14, r1, r3)
            l.۫۠۠ r14 = l.C6241.m17184(r0, r2)
            r15.m7273(r13, r14)
            return
        Lb0:
            l.ۛ᩸֨ r0 = l.C23294.m51638(r2)
            l.ۙ֨֨ r15 = r0.m17562(r15)
            goto L2
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22589.m50563(l.ۚۚ۠, l.ۛ֡֨, l.᩶֡֨):void");
    }

    public C22589(C23294 c23294) {
        this.f73011 = c23294;
    }
}
