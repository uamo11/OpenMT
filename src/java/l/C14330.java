package l;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/* compiled from: M43N */
/* renamed from: l.ܳۛ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C14330 extends AbstractC21387 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f43219;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public BiPredicate f43220;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC19125 f43221;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public BiFunction f43222;

    public C14330(C6735 c6735, C0779 c0779, AbstractC4308 abstractC4308, EnumC19125 enumC19125) {
        this(c6735, c0779, abstractC4308, new C17153(), null, enumC19125);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14330(C6735 c6735, C0779 c0779, AbstractC4308 abstractC4308, BiFunction biFunction, BiPredicate biPredicate, EnumC19125 enumC19125) {
        super(c6735, c0779, abstractC4308);
        this.f43219 = c6735;
        this.f43221 = enumC19125;
        this.f43222 = biFunction;
        this.f43220 = biPredicate;
    }

    @Override // l.AbstractC21387
    /* renamed from: ֫ */
    public AbstractC21387 mo7602(C0779 c0779) {
        return new C14330(this.f43219, c0779, this.f68884, this.f43222, this.f43220, this.f43221);
    }

    @Override // l.AbstractC21387
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo34201(C0384 c0384, C1386 c1386) {
        boolean m18353;
        AbstractC4308 abstractC4308 = this.f68884;
        BiFunction biFunction = this.f43222;
        AbstractC4308 abstractC43082 = (AbstractC4308) biFunction.apply(c0384, abstractC4308);
        this.f68884 = abstractC43082;
        BiPredicate biPredicate = this.f43220;
        if (biPredicate == null || !biPredicate.test(c0384, abstractC43082)) {
            Iterator it = mo7601().iterator();
            while (it.hasNext()) {
                EnumC19125 enumC19125 = (EnumC19125) it.next();
                Iterator it2 = this.f68886.m2963(enumC19125).iterator();
                while (it2.hasNext()) {
                    AbstractC4308 abstractC43083 = (AbstractC4308) biFunction.apply(c0384, (AbstractC4308) it2.next());
                    if (biPredicate == null || !biPredicate.test(c0384, abstractC43083)) {
                        AbstractC4308 abstractC43084 = this.f68884;
                        EnumC19125 enumC191252 = this.f43221;
                        boolean m44155 = enumC191252.m44155(enumC19125);
                        C6735 c6735 = this.f68885;
                        if (m44155) {
                            m18353 = c6735.m18353(EnumC3042.f9578, abstractC43084, abstractC43083, c1386);
                        } else {
                            m18353 = enumC19125.m44155(enumC191252) ? c6735.m18353(EnumC3042.f9578, abstractC43083, abstractC43084, c1386) : c6735.m18353(EnumC3042.f9580, abstractC43084, abstractC43083, (C1386) null);
                        }
                        if (!m18353) {
                            mo34202(enumC191252, enumC19125);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ֫ */
    public EnumSet mo7601() {
        EnumC19125 enumC19125 = EnumC19125.f60275;
        EnumC19125 enumC191252 = this.f43221;
        if (enumC191252 == enumC19125) {
            return EnumSet.allOf(EnumC19125.class);
        }
        return EnumSet.complementOf(EnumSet.of(enumC191252));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo34202(EnumC19125 enumC19125, EnumC19125 enumC191252) {
        C0779 c0779 = this.f68886;
        C6735 c6735 = this.f43219;
        if (enumC19125 == enumC191252) {
            c6735.m18350(c0779, enumC19125);
        } else {
            if (enumC19125 == EnumC19125.f60273 || enumC191252 == EnumC19125.f60275) {
                c6735.m18351(c0779, enumC191252, enumC19125);
                throw null;
            }
            c6735.m18351(c0779, enumC19125, enumC191252);
            throw null;
        }
    }

    @Override // l.AbstractC21387
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", getClass().getSimpleName(), this.f68886.f14167, this.f68884, this.f43221);
    }
}
