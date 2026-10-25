package l;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: 68QN */
/* renamed from: l.᩻ۧۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23656 extends AbstractC23114 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f76636;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f76637;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C22485 f76638;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f76639;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C20369 f76640;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C17306 f76641;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean f76642;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C18012 f76643;

    public C23656(InterfaceC3901 interfaceC3901, boolean z) {
        super(interfaceC3901);
        this.f76642 = z && interfaceC3901.mo11885();
        this.f76640 = new C20369();
        this.f76638 = new C22485();
        AbstractC4846 mo11886 = interfaceC3901.mo11886();
        if (mo11886 != null) {
            this.f76641 = C17306.m40616(mo11886, (Object) null, (Object) null);
            this.f76639 = true;
        } else {
            this.f76641 = C17306.m40617(interfaceC3901.mo9817());
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m52186() {
        return this.f76641;
    }

    @Override // l.AbstractC23114, l.AbstractC9277, l.InterfaceC3901
    /* renamed from: ֫ */
    public final void mo9822(C11197 c11197) {
        if (this.f76639) {
            this.f76641 = this.f76641.m40618((AbstractC4846) new C10415(this.f76641.f40320, c11197));
        } else {
            this.f76641 = C17306.m40617(c11197);
        }
        this.f74351.mo9822(c11197);
    }

    @Override // l.AbstractC23114
    /* renamed from: ۡ */
    public final void mo51296() {
        if (this.f76642) {
            return;
        }
        this.f76637 = true;
        m51297();
    }

    @Override // l.InterfaceC3901
    /* renamed from: ֫ */
    public final C18012 mo9816(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        Object obj;
        C18012 c18012 = new C18012(c15894, interfaceC21725, j);
        c18012.m42061(this.f74351);
        if (this.f76636) {
            Object obj2 = c15894.f49112;
            obj = this.f76641.f53014;
            if (obj != null && obj2.equals(C17306.f53013)) {
                obj2 = this.f76641.f53014;
            }
            c18012.m42062(c15894.m37668(obj2));
            return c18012;
        }
        this.f76643 = c18012;
        if (!this.f76637) {
            this.f76637 = true;
            m51297();
        }
        return c18012;
    }

    @Override // l.InterfaceC3901
    /* renamed from: ֫ */
    public final void mo9821(InterfaceC9546 interfaceC9546) {
        ((C18012) interfaceC9546).m42066();
        if (interfaceC9546 == this.f76643) {
            this.f76643 = null;
        }
    }

    @Override // l.AbstractC21272, l.AbstractC9277
    /* renamed from: ᩷ */
    public final void mo9824() {
        this.f76636 = false;
        this.f76637 = false;
        super.mo9824();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c3  */
    @Override // l.AbstractC23114
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo14564(l.AbstractC4846 r12) {
        /*
            r11 = this;
            boolean r0 = r11.f76636
            if (r0 == 0) goto L19
            l.ܿۧۧ r0 = r11.f76641
            l.ܿۧۧ r0 = r0.m40618(r12)
            r11.f76641 = r0
            l.ᩳۧۧ r0 = r11.f76643
            if (r0 == 0) goto Lb6
            long r0 = r0.m42065()
            r11.m52185(r0)
            goto Lb6
        L19:
            boolean r0 = r12.m14110()
            if (r0 == 0) goto L36
            boolean r0 = r11.f76639
            if (r0 == 0) goto L2a
            l.ܿۧۧ r0 = r11.f76641
            l.ܿۧۧ r0 = r0.m40618(r12)
            goto L32
        L2a:
            java.lang.Object r0 = l.C20369.f65748
            java.lang.Object r1 = l.C17306.f53013
            l.ܿۧۧ r0 = l.C17306.m40616(r12, r0, r1)
        L32:
            r11.f76641 = r0
            goto Lb6
        L36:
            r0 = 0
            l.᩶᩵֫ r1 = r11.f76640
            r12.m14106(r0, r1)
            long r2 = r1.f65749
            java.lang.Object r6 = r1.f65761
            l.ᩳۧۧ r4 = r11.f76643
            if (r4 == 0) goto L67
            long r4 = r4.m42063()
            l.ܿۧۧ r7 = r11.f76641
            l.ᩳۧۧ r8 = r11.f76643
            l.ܺۧۧ r8 = r8.f56178
            java.lang.Object r8 = r8.f49112
            l.᩹᩵֫ r9 = r11.f76638
            r7.mo14105(r8, r9)
            long r7 = r9.f72804
            long r7 = r7 + r4
            l.ܿۧۧ r4 = r11.f76641
            r9 = 0
            r4.mo14103(r0, r1, r9)
            long r0 = r1.f65749
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 == 0) goto L67
            r4 = r7
            goto L68
        L67:
            r4 = r2
        L68:
            l.᩹᩵֫ r2 = r11.f76638
            r3 = 0
            l.᩶᩵֫ r1 = r11.f76640
            r0 = r12
            android.util.Pair r0 = r0.m14100(r1, r2, r3, r4)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r11.f76639
            if (r0 == 0) goto L87
            l.ܿۧۧ r0 = r11.f76641
            l.ܿۧۧ r0 = r0.m40618(r12)
            goto L8b
        L87:
            l.ܿۧۧ r0 = l.C17306.m40616(r12, r6, r1)
        L8b:
            r11.f76641 = r0
            l.ᩳۧۧ r0 = r11.f76643
            if (r0 == 0) goto Lb6
            boolean r1 = r11.m52185(r2)
            if (r1 == 0) goto Lb6
            l.ܺۧۧ r0 = r0.f56178
            java.lang.Object r1 = r0.f49112
            l.ܿۧۧ r2 = r11.f76641
            java.lang.Object r2 = l.C17306.m40615(r2)
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = l.C17306.f53013
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto Lb1
            l.ܿۧۧ r1 = r11.f76641
            java.lang.Object r1 = l.C17306.m40615(r1)
        Lb1:
            l.ܺۧۧ r0 = r0.m37668(r1)
            goto Lb7
        Lb6:
            r0 = 0
        Lb7:
            r1 = 1
            r11.f76639 = r1
            r11.f76636 = r1
            l.ܿۧۧ r1 = r11.f76641
            r11.m23794(r1)
            if (r0 == 0) goto Lcb
            l.ᩳۧۧ r1 = r11.f76643
            r1.getClass()
            r1.m42062(r0)
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23656.mo14564(l.ۙ᩵֫):void");
    }

    @Override // l.AbstractC23114
    /* renamed from: ܽ */
    public final C15894 mo51298(C15894 c15894) {
        Object obj;
        Object obj2;
        Object obj3 = c15894.f49112;
        obj = this.f76641.f53014;
        if (obj != null) {
            obj2 = this.f76641.f53014;
            if (obj2.equals(obj3)) {
                obj3 = C17306.f53013;
            }
        }
        return c15894.m37668(obj3);
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52185(long j) {
        C18012 c18012 = this.f76643;
        int mo14098 = this.f76641.mo14098(c18012.f56178.f49112);
        if (mo14098 == -1) {
            return false;
        }
        C17306 c17306 = this.f76641;
        C22485 c22485 = this.f76638;
        c17306.mo14104(mo14098, c22485, false);
        long j2 = c22485.f72801;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        c18012.m42064(j);
        return true;
    }
}
