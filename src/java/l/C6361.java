package l;

/* compiled from: 8459 */
/* renamed from: l.ۛ᩺֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6361 extends AbstractC13416 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14163 f19687;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2609 f19688;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23294 f19689;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f19690;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6361(C23294 c23294, C14163 c14163) {
        super(c23294);
        this.f19689 = c23294;
        this.f19687 = c14163;
        this.f19690 = c14163.f17561;
        this.f19688 = C2609.m8239();
    }

    @Override // l.AbstractC13416
    /* renamed from: ֫ */
    public final void mo16870(C14163 c14163) {
        C2609 c2609 = (C2609) this.f19689.f74796.get(c14163);
        if (c2609 != null) {
            while (c2609.m8249()) {
                C12048 c12048 = (C12048) c2609.f8240;
                C2609 c26092 = this.f19688;
                while (true) {
                    if (c26092.m8249()) {
                        if (c26092.f8240 == c12048) {
                            break;
                        } else {
                            c26092 = c26092.f8241;
                        }
                    } else {
                        this.f19688 = this.f19688.m8246(c12048);
                        break;
                    }
                }
                c2609 = c2609.f8241;
            }
        }
    }

    @Override // l.AbstractC13416
    /* renamed from: ֫ */
    public final void mo16869(AbstractC5698 abstractC5698) {
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 == EnumC1296.f4567 || enumC1296 == EnumC1296.f4571) {
            AbstractC5698 abstractC56982 = abstractC5698.f17561;
            C23294 c23294 = this.f19689;
            AbstractC5698 abstractC56983 = this.f19690;
            AbstractC5698 abstractC56984 = abstractC56982 != abstractC56983 ? (AbstractC5698) c23294.f74809.get(abstractC5698) : abstractC5698;
            if (abstractC56984 != null && abstractC56984.f17561 == abstractC56983) {
                C12048 c12048 = (C12048) abstractC56984;
                if (c12048.m29425() == null) {
                    for (C2609 c2609 = this.f19688; c2609.m8249(); c2609 = c2609.f8241) {
                        if (c2609.f8240 == c12048) {
                            return;
                        }
                    }
                    this.f19688 = this.f19688.m8246(c12048);
                    return;
                }
                return;
            }
            Object obj = c23294.f74831.f8240;
            if (obj == null || obj == abstractC5698) {
                return;
            }
            mo16869((AbstractC5698) obj);
        }
    }

    @Override // l.AbstractC13416, l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        Object obj;
        C14163 c14163 = (C14163) c19110.f60194.f17561;
        if (c19110.f60199 == null && c14163.m16087() && (obj = this.f19689.f74831.f8240) != null) {
            mo16869((AbstractC5698) obj);
        }
        super.mo1419(c19110);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r0 == r2.f18898) goto L6;
     */
    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1381(l.C6262 r4) {
        /*
            r3 = this;
            l.ۤܶ۠ r0 = r4.f19395
            l.᩺᩺֨ r1 = r3.f19689
            l.ۛܶ۠ r2 = l.C23294.m51640(r1)
            l.ۤܶ۠ r2 = r2.f18886
            if (r0 == r2) goto L16
            l.ۤܶ۠ r0 = r4.f19395
            l.ۛܶ۠ r2 = l.C23294.m51640(r1)
            l.ۤܶ۠ r2 = r2.f18898
            if (r0 != r2) goto L2b
        L16:
            l.۫᩵۠ r0 = r4.f19397
            l.ۙ֨֨ r0 = r0.f16086
            l.᩶֡֨ r0 = r0.f13890
            l.ܳ֡֨ r2 = r3.f19687
            if (r0 == r2) goto L2b
            l.ۖܶ۠ r0 = r1.f74831
            java.lang.Object r0 = r0.f8240
            if (r0 == 0) goto L2b
            l.ۛ֡֨ r0 = (l.AbstractC5698) r0
            r3.mo16869(r0)
        L2b:
            l.۫᩵۠ r4 = r4.f19397
            r3.mo10758(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6361.mo1381(l.ۛ᩵۠):void");
    }

    @Override // l.AbstractC13416, l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        C6136 c6136;
        Object obj;
        AbstractC10370 m19462 = C7260.m19462(c15580.f48011);
        C23294 c23294 = this.f19689;
        c6136 = c23294.f74798;
        if (m19462 == c6136.f18898 && ((C14163) C7260.m19472(c15580.f48011).f17561).m16087() && !c15580.f48011.m14709(EnumC18550.f57581) && (obj = c23294.f74831.f8240) != null) {
            mo16869((AbstractC5698) obj);
        }
        super.mo1407(c15580);
    }
}
