package l;

/* compiled from: A451 */
/* renamed from: l.ᩳܽ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18173 extends C23420 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f56482;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18173(l.C22406 r2, l.AbstractC4308 r3, l.InterfaceC3953 r4) {
        /*
            r1 = this;
            r1.f56482 = r2
            l.ۢۗ֨ r2 = r2.f72613
            l.C11003.requireNonNull(r2)
            l.ܶᩴ֨ r0 = l.C15406.f47181
            r1.<init>(r2, r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18173.<init>(l.᩹ܽ۠, l.ۙ֨֨, l.ۘ۬֨):void");
    }

    @Override // l.C23420
    /* renamed from: ֫ */
    public final AbstractC4308 mo13581(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        AbstractC4308 m17523;
        if (abstractC4308.m12913(EnumC9454.DEFERRED)) {
            return ((C1110) abstractC4308).m3822((C23420) this);
        }
        AbstractC4308 abstractC43082 = this.f75219;
        C22406 c22406 = this.f56482;
        if (abstractC4308 != abstractC43082) {
            c22406.f72597.getClass();
            abstractC4308 = C6319.m17473(abstractC4308);
        }
        if (interfaceC3109 == null || interfaceC3109.mo9482() == null) {
            m17523 = c22406.f72597.m17523(abstractC4308);
        } else {
            m17523 = this.f75215.mo3857().m1860(interfaceC3109.mo9482(), abstractC4308, true);
        }
        return super.mo13581(interfaceC3109, c22406.f72599.m36202(interfaceC3109, m17523));
    }

    @Override // l.C23420
    /* renamed from: ֫ */
    public final C23420 mo38523(AbstractC4308 abstractC4308) {
        return new C18173(this.f56482, abstractC4308, this.f75215);
    }

    @Override // l.C23420
    /* renamed from: ֫ */
    public final C23420 mo38522(InterfaceC3953 interfaceC3953) {
        return new C18173(this.f56482, this.f75219, interfaceC3953);
    }
}
