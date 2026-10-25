package l;

/* compiled from: 3ANU */
/* renamed from: l.᩶۫᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20176 implements InterfaceC7475 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12414 f65304;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f65305 = C10298.f31024;

    public C20176(AbstractC12414 abstractC12414) {
        this.f65304 = abstractC12414;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46408(Object obj) {
        this.f65305 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (r3 == null) goto L20;
     */
    @Override // l.InterfaceC7475
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo20098(l.InterfaceC11791 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f65305
            r1 = 1
            l.ܶۛ᩵ r2 = l.C10298.f31024
            if (r0 == r2) goto Lf
            boolean r7 = r0 instanceof l.C17998
            r7 = r7 ^ r1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        Lf:
            l.۫۫᩵ r0 = r6.f65304
            java.lang.Object r3 = r0.mo30584()
            r6.f65305 = r3
            if (r3 == r2) goto L21
            boolean r7 = r3 instanceof l.C17998
            r7 = r7 ^ r1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L21:
            l.ۨܶ᩵ r7 = l.C22412.m50339(r7)
            boolean r3 = r7 instanceof l.C10819
            r4 = 0
            if (r3 != 0) goto L30
            l.ۜۗ᩵ r3 = new l.ۜۗ᩵
            r3.<init>(r7, r1)
            goto L4a
        L30:
            r1 = r7
            l.ۧۛ᩵ r1 = (l.C10819) r1
            l.ۜۗ᩵ r1 = r1.m27041()
            if (r1 == 0) goto L44
            boolean r3 = r1.m18008()
            if (r3 == 0) goto L41
            r3 = r1
            goto L42
        L41:
            r3 = r4
        L42:
            if (r3 != 0) goto L4a
        L44:
            l.ۜۗ᩵ r3 = new l.ۜۗ᩵
            r1 = 2
            r3.<init>(r7, r1)
        L4a:
            l.ۙ۫᩵ r7 = new l.ۙ۫᩵
            r7.<init>(r6, r3)
        L4f:
            boolean r1 = r0.mo30581(r7)
            if (r1 == 0) goto L5e
            l.ۗ۫᩵ r1 = new l.ۗ۫᩵
            r1.<init>(r0, r7)
            r3.m17996(r1)
            goto L73
        L5e:
            java.lang.Object r1 = r0.mo30584()
            r6.f65305 = r1
            boolean r5 = r1 instanceof l.C17998
            if (r5 == 0) goto L6e
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r3.mo8683(r7)
            goto L73
        L6e:
            if (r1 == r2) goto L4f
            r3.m18001(r4)
        L73:
            java.lang.Object r7 = r3.m18002()
            l.ۜ᩸᩵ r0 = l.EnumC7041.f21688
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20176.mo20098(l.ۨܶ᩵):java.lang.Object");
    }

    @Override // l.InterfaceC7475
    public final Object next() {
        Object obj = this.f65305;
        if (obj instanceof C17998) {
            int i = C17998.f56146;
            C17292 c17292 = new C17292("Channel was closed");
            int i2 = C7996.f24682;
            throw c17292;
        }
        C15050 c15050 = C10298.f31024;
        if (obj != c15050) {
            this.f65305 = c15050;
            return obj;
        }
        throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
    }
}
