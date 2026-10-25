package l;

import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: M43N */
/* renamed from: l.ܳۨ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14495 extends AbstractC21387 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f44398;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC19125 f44399;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14495(C6735 c6735, C0779 c0779, AbstractC4308 abstractC4308, EnumC19125 enumC19125) {
        super(c6735, c0779, abstractC4308);
        this.f44398 = c6735;
        this.f44399 = enumC19125;
    }

    @Override // l.AbstractC21387
    /* renamed from: ֫ */
    public final AbstractC21387 mo7602(C0779 c0779) {
        return new C14495(this.f44398, c0779, this.f68884, this.f44399);
    }

    @Override // l.AbstractC21387
    /* renamed from: ֫ */
    public final void mo34201(C0384 c0384, C1386 c1386) {
        AbstractC4308 m1868 = c0384.m1868(this.f68884);
        boolean m12913 = m1868.m12913(EnumC9454.UNDETVAR);
        C6735 c6735 = this.f44398;
        C0779 c0779 = this.f68886;
        EnumC19125 enumC19125 = this.f44399;
        if (m12913) {
            C0779 c07792 = (C0779) m1868;
            if (!c07792.m2969()) {
                c07792.m2967(enumC19125.mo7226(), c0779, c6735.f20923);
                Iterator it = (enumC19125 == EnumC19125.f60275 ? EnumSet.allOf(EnumC19125.class) : EnumSet.of(enumC19125)).iterator();
                while (it.hasNext()) {
                    EnumC19125 enumC191252 = (EnumC19125) it.next();
                    Iterator it2 = c07792.m2963(enumC191252).iterator();
                    while (it2.hasNext()) {
                        c0779.m2967(enumC191252, (AbstractC4308) it2.next(), c6735.f20923);
                    }
                }
            }
        }
        EnumC19125 enumC191253 = EnumC19125.f60275;
        Iterator it3 = (enumC19125 == enumC191253 ? EnumSet.of(enumC191253) : EnumSet.complementOf(EnumSet.of(enumC19125))).iterator();
        while (it3.hasNext()) {
            Iterator it4 = c0779.m2963((EnumC19125) it3.next()).iterator();
            while (it4.hasNext()) {
                AbstractC4308 m18682 = c0384.m1868((AbstractC4308) it4.next());
                if (m18682.m12913(EnumC9454.UNDETVAR)) {
                    C0779 c07793 = (C0779) m18682;
                    if (!c07793.m2969()) {
                        c07793.m2967(enumC19125, c0384.m1859(this.f68884), c6735.f20923);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC21387
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", C14495.class.getSimpleName(), this.f68886.f14167, this.f68884, this.f44399);
    }
}
