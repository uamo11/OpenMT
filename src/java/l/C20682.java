package l;

import java.util.Iterator;
import java.util.function.BiPredicate;

/* compiled from: M43N */
/* renamed from: l.᩷ۛ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20682 extends AbstractC21387 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f66641;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20682(C6735 c6735, C0779 c0779, AbstractC4308 abstractC4308) {
        super(c6735, c0779, abstractC4308);
        this.f66641 = c6735;
    }

    @Override // l.AbstractC21387
    /* renamed from: ֫ */
    public final AbstractC21387 mo7602(C0779 c0779) {
        return new C20682(this.f66641, c0779, this.f68884);
    }

    @Override // l.AbstractC21387
    /* renamed from: ֫ */
    public final void mo34201(C0384 c0384, C1386 c1386) {
        C2609 m18344;
        EnumC19125[] enumC19125Arr = {EnumC19125.f60272};
        C0779 c0779 = this.f68886;
        InterfaceC17664 stream = C5378.stream(c0779.m2963(enumC19125Arr));
        C6735 c6735 = this.f66641;
        final C6319 c6319 = c6735.f20923;
        C11003.requireNonNull(c6319);
        Iterator it = ((C2609) stream.collect(C10277.of(new C3809(0, c6319, new BiPredicate() { // from class: l.ۜۛ֨
            public /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
                return C14344.$default$and(this, biPredicate);
            }

            public /* synthetic */ BiPredicate negate() {
                return C14344.$default$negate(this);
            }

            public /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
                return C14344.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return C6319.this.m17550((AbstractC4308) obj, (AbstractC4308) obj2);
            }
        }), new C18626(), new C19332(), new C0280(), new EnumC6043[0]))).iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
            AbstractC4308 abstractC43082 = this.f68884;
            if (abstractC43082 != abstractC4308 && abstractC43082 != abstractC4308) {
                EnumC9454 enumC9454 = EnumC9454.WILDCARD;
                if (!abstractC43082.m12913(enumC9454) && !abstractC4308.m12913(enumC9454)) {
                    m18344 = c6735.m18344(this.f68884, abstractC4308);
                    Iterator it2 = m18344.iterator();
                    while (it2.hasNext()) {
                        C23069 c23069 = (C23069) it2.next();
                        C2609 mo12934 = ((AbstractC4308) c23069.f74207).mo12934();
                        C2609 mo129342 = ((AbstractC4308) c23069.f74208).mo12934();
                        while (mo12934.m8249() && mo129342.m8249()) {
                            AbstractC4308 abstractC43083 = (AbstractC4308) mo12934.f8240;
                            EnumC9454 enumC94542 = EnumC9454.WILDCARD;
                            if (!abstractC43083.m12913(enumC94542) && !((AbstractC4308) mo129342.f8240).m12913(enumC94542)) {
                                if (!this.f68885.m18353(EnumC3042.f9580, c0384.m1868((AbstractC4308) mo12934.f8240), c0384.m1868((AbstractC4308) mo129342.f8240), (C1386) null)) {
                                    c6735.m18350(c0779, EnumC19125.f60272);
                                }
                            }
                            mo12934 = mo12934.f8241;
                            mo129342 = mo129342.f8241;
                        }
                        C12171.m29642(mo12934.isEmpty() && mo129342.isEmpty());
                    }
                }
            }
        }
    }
}
