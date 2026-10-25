package l;

/* compiled from: Z5U8 */
/* renamed from: l.ܳۜ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C14356 implements InterfaceC0951 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f43287;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f43288;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14163 f43289;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC8624 f43290;

    public C14356(C20002 c20002, C14163 c14163) {
        this.f43288 = c20002;
        this.f43289 = c14163;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16384 m34258(C2363 c2363) {
        C3581 c3581;
        AbstractC4308 m34256 = m34256(c2363.f26338);
        C18837 c18837 = new C18837();
        C2609 c2609 = c2363.f7553;
        while (true) {
            C20515 c20515 = null;
            if (!c2609.m8249()) {
                return new C16384(m34256, c18837.m43517(), null);
            }
            AbstractC10370 abstractC10370 = (AbstractC10370) ((C23069) c2609.f8240).f74207;
            try {
                for (AbstractC5698 abstractC5698 : m34256.f13890.mo16064().m20476(abstractC10370)) {
                    if (abstractC5698.f17559 == EnumC1296.f4571 && abstractC5698.f17560.mo12933().m8245() == 0) {
                        c3581 = (C3581) abstractC5698;
                        break;
                    }
                }
            } catch (C20515 e) {
                c20515 = e;
            }
            C20002 c20002 = this.f43288;
            C22364 c22364 = c20002.f64746;
            C20661 c20661 = c20002.f64770;
            InterfaceC18278 m7284 = c22364.m7284(this.f43289.f42766);
            try {
                if (c20002.f64753) {
                    if (c20515 == null) {
                        C11076 c11076 = C14001.f42334;
                        c22364.m7275(new C11076("compiler", "annotation.method.not.found", m34256, abstractC10370));
                    } else {
                        C16719 m46989 = c20515.m46989();
                        C11076 c110762 = C14001.f42334;
                        c22364.m7275(new C11076("compiler", "annotation.method.not.found.reason", m34256, abstractC10370, m46989));
                    }
                }
                c22364.m7284(m7284);
                c3581 = new C3581(1025L, abstractC10370, new C10658(C2609.m8239(), c20661.f66522, C2609.m8239(), c20661.f66481), m34256.f13890);
                c18837.m43511(new C23069(c3581, m34257(c3581.f17560.mo12923(), (AbstractC8624) ((C23069) c2609.f8240).f74208)));
                c2609 = c2609.f8241;
            } catch (Throwable th) {
                c22364.m7284(m7284);
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8624 m34257(AbstractC4308 abstractC4308, AbstractC8624 abstractC8624) {
        AbstractC4308 abstractC43082 = this.f43287;
        try {
            this.f43287 = abstractC4308;
            abstractC8624.mo5382(this);
            return this.f43290;
        } finally {
            this.f43287 = abstractC43082;
        }
    }

    @Override // l.InterfaceC9330
    /* renamed from: ֫ */
    public final void mo24020(C17796 c17796) {
        this.f43290 = c17796;
    }

    @Override // l.InterfaceC9330
    /* renamed from: ֫ */
    public final void mo24016(C10741 c10741) {
        this.f43290 = c10741;
    }

    @Override // l.InterfaceC9330
    /* renamed from: ֫ */
    public final void mo24019(C17090 c17090) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC9330
    /* renamed from: ֫ */
    public final void mo24018(C16384 c16384) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC9330
    /* renamed from: ֫ */
    public final void mo24015(C1568 c1568) {
        throw new AssertionError();
    }

    @Override // l.InterfaceC9330
    /* renamed from: ֫ */
    public final void mo24017(C14267 c14267) {
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r3 = (l.C12048) r3;
     */
    @Override // l.InterfaceC0951
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3368(l.C3774 r14) {
        /*
            r13 = this;
            l.ۙ֨֨ r0 = r14.f11907
            l.ۤܶ۠ r1 = r14.f11908
            l.ۙ֨֨ r0 = r13.m34256(r0)
            l.᩶֡֨ r7 = r0.f13890
            r0 = 0
            l.ܰ᩵֨ r2 = r7.mo16064()     // Catch: l.C20515 -> L30
            java.lang.Iterable r2 = r2.m20476(r1)     // Catch: l.C20515 -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: l.C20515 -> L30
        L17:
            boolean r3 = r2.hasNext()     // Catch: l.C20515 -> L30
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()     // Catch: l.C20515 -> L30
            l.ۛ֡֨ r3 = (l.AbstractC5698) r3     // Catch: l.C20515 -> L30
            l.֨ᩴ֨ r4 = r3.f17559     // Catch: l.C20515 -> L30
            l.֨ᩴ֨ r5 = l.EnumC1296.f4567     // Catch: l.C20515 -> L30
            if (r4 != r5) goto L17
            l.۫֡֨ r3 = (l.C12048) r3     // Catch: l.C20515 -> L30
            goto L2d
        L2c:
            r3 = r0
        L2d:
            r2 = r0
            r0 = r3
            goto L31
        L30:
            r2 = move-exception
        L31:
            if (r0 != 0) goto L8d
            r0 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.String r6 = "compiler"
            l.᩶ۜ۠ r8 = r13.f43288
            if (r2 == 0) goto L5d
            l.᩹ܶ۠ r9 = r8.f64746
            l.ᩳ᩶۠ r10 = r8.f64755
            l.ܽܶ۠ r2 = r2.m46989()
            l.ۧܶ۠ r11 = l.C14001.f42334
            l.ۧܶ۠ r11 = new l.ۧܶ۠
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r5] = r10
            r12[r4] = r7
            r12[r3] = r1
            r12[r0] = r2
            java.lang.String r0 = "unknown.enum.constant.reason"
            r11.<init>(r6, r0, r12)
            r9.m7275(r11)
            goto L75
        L5d:
            l.᩹ܶ۠ r2 = r8.f64746
            l.ᩳ᩶۠ r9 = r8.f64755
            l.ۧܶ۠ r10 = l.C14001.f42334
            l.ۧܶ۠ r10 = new l.ۧܶ۠
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r9
            r0[r4] = r7
            r0[r3] = r1
            java.lang.String r1 = "unknown.enum.constant"
            r10.<init>(r6, r1, r0)
            r2.m7275(r10)
        L75:
            l.ܿۘ֨ r0 = new l.ܿۘ֨
            l.ۙ֨֨ r1 = r7.f17560
            l.۫֡֨ r9 = new l.۫֡֨
            l.ۤܶ۠ r5 = r14.f11908
            l.᩷ۚ֨ r14 = r8.f64770
            l.ۙ֨֨ r6 = r14.f66522
            r3 = 0
            r2 = r9
            r2.<init>(r3, r5, r6, r7)
            r0.<init>(r1, r9)
            r13.f43290 = r0
            goto L96
        L8d:
            l.ܿۘ֨ r14 = new l.ܿۘ֨
            l.ۙ֨֨ r1 = r7.f17560
            r14.<init>(r1, r0)
            r13.f43290 = r14
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14356.mo3368(l.ۘۜ۠):void");
    }

    @Override // l.InterfaceC0951
    /* renamed from: ֫ */
    public final void mo3369(C9419 c9419) {
        this.f43290 = new C10741(m34256(c9419.f28573), this.f43288.f64756);
    }

    @Override // l.InterfaceC0951
    /* renamed from: ֫ */
    public final void mo3370(C23529 c23529) {
        C2609 c2609 = c23529.f75550;
        AbstractC8624[] abstractC8624Arr = new AbstractC8624[c2609.m8245()];
        AbstractC4308 m17515 = this.f43288.f64756.m17515(this.f43287);
        int i = 0;
        while (c2609.m8249()) {
            abstractC8624Arr[i] = m34257(m17515, (AbstractC8624) c2609.f8240);
            c2609 = c2609.f8241;
            i++;
        }
        this.f43290 = new C1568(this.f43287, abstractC8624Arr);
    }

    @Override // l.InterfaceC0951
    /* renamed from: ֫ */
    public final void mo3367(C2363 c2363) {
        this.f43290 = m34258(c2363);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m34256(AbstractC4308 abstractC4308) {
        if (!(abstractC4308 instanceof C5185)) {
            return abstractC4308;
        }
        C5185 c5185 = (C5185) abstractC4308;
        C14163 c14163 = this.f43289;
        C12171.m29642(c14163.f17561.f17559 == EnumC1296.f4568);
        C20002 c20002 = this.f43288;
        C0052 c0052 = c20002.f64782;
        c20002.f64782 = (C0052) c14163.f17561;
        try {
            return c5185.m14936();
        } finally {
            c20002.f64782 = c0052;
        }
    }
}
