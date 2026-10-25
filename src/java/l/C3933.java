package l;

import java.util.Iterator;

/* compiled from: W7SR */
/* renamed from: l.ۘ۫֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3933 extends C14190 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1755 f12548;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0384 f12549;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23420 f12550;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18750 f12551;

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1217(l.C14169 r13) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3933.mo1217(l.ܳ֡۠):void");
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        mo10758(c8379.f25699);
        mo10758(c8379.f25700);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        m33860(c13464.f40199);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        AbstractC4308 abstractC4308;
        C12399 c12399 = this.f12551.f59255;
        C12171.m29637(c9232.mo23672());
        C23420 c23420 = this.f12550;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        AbstractC4308 abstractC43082 = c23420.f75219;
        if (this.f12549.f1817.contains(abstractC43082)) {
            return;
        }
        try {
            abstractC4308 = c12399.f37343.m17538(abstractC43082);
        } catch (C6130 e) {
            interfaceC3953.mo1084(null, e.m17050());
            abstractC4308 = null;
        }
        C1755 c1755 = this.f12548;
        C1755 m5877 = c1755.m5877(c9232, c1755.f6073);
        AbstractC12612 abstractC12612 = c9232.f27945;
        C23420 m23955 = c12399.f37350.m23955(c9232);
        C5572 c5572 = c12399.f37347;
        c5572.getClass();
        AbstractC12612 abstractC126122 = (AbstractC12612) c12399.m30568(abstractC12612, m5877, m23955, c12399.f37339, null, EnumC7480.SPECULATIVE, new C21095(c5572));
        C18837 c18837 = new C18837();
        Iterator it = abstractC4308.mo12933().iterator();
        while (it.hasNext()) {
            c18837.m43511(AbstractC4308.f13885);
        }
        C9232 c92322 = (C9232) new C19961(c12399.f37342).mo8690((AbstractC5144) c9232, (Object) null);
        c92322.f27945 = abstractC126122;
        C22406 c22406 = c12399.f37353;
        AbstractC4308 abstractC43083 = abstractC126122.f16086;
        AbstractC10370 abstractC10370 = c9232.f27944;
        C2609 m43517 = c18837.m43517();
        C2609 m8239 = C2609.m8239();
        C22406 c224062 = c12399.f37353;
        AbstractC5698 abstractC5698 = (AbstractC5698) c22406.m50325(m5877, c92322, abstractC43083, abstractC10370, m43517, m8239, abstractC4308, c224062.f72596, this.f12549, c224062.f72601).f74207;
        int i = C23002.f74052[abstractC5698.f17559.ordinal()];
        if (i == 1 || i == 2) {
            interfaceC3953.mo1084(c9232, c12399.f37356.m16617(C11886.f35487));
        } else if (i == 3 || i == 4) {
            EnumC12986 enumC12986 = EnumC12986.FRAGMENT;
            AbstractC4308 abstractC43084 = abstractC126122.f16086;
            interfaceC3953.mo1084(c9232, ((AbstractC5473) abstractC5698).mo4076(enumC12986, c9232, abstractC43084.f13890, abstractC43084, c9232.f27944, c18837.m43517(), C2609.m8239()));
        }
    }

    public C3933(C18750 c18750) {
        this.f12551 = c18750;
    }
}
