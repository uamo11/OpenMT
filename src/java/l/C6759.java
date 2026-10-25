package l;

import java.util.function.Predicate;

/* compiled from: O7F3 */
/* renamed from: l.ۜ۫ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6759 implements InterfaceC12218 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC4662 f20983;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15869 f20984;

    @Override // l.InterfaceC1800
    /* renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    /* renamed from: ܽ */
    public int mo5678() {
        return 0;
    }

    public C6759(C3046 c3046, EnumC4662 enumC4662) {
        this.f20983 = enumC4662;
        this.f20984 = c3046.m9312(enumC4662.m13646());
    }

    @Override // l.InterfaceC12218
    /* renamed from: ֫ */
    public InterfaceC1800 mo14394(C3046 c3046) {
        C15869 m9314;
        if (this instanceof C19460) {
            C19460 c19460 = (C19460) this;
            final C15869 c15869 = c19460.f62935;
            if (!c15869.mo18355() && c15869.m37607() == EnumC10932.f32933 && this.f20983.m13644() == EnumC10932.f32926) {
                C16646 findFirst = C5378.stream(c3046.f9589.values()).filter(new Predicate() { // from class: l.ܳ۫ۚ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C15869 c158692 = (C15869) obj;
                        return c158692.mo18355() && c158692.m37607() == EnumC10932.f32933 && c158692.m37605(C15869.this);
                    }
                }).findFirst();
                if (findFirst.isPresent()) {
                    m9314 = (C15869) findFirst.get();
                } else {
                    m9314 = c3046.m9314((AbstractC2465) new C21391((C15869) c15869.f49042.f7866));
                }
                c19460.f62935 = m9314;
            }
        }
        return this;
    }

    /* renamed from: ֫ */
    public C15869 mo13561(final C15869 c15869, C3046 c3046) {
        if (C23692.f76728[c15869.m37607().ordinal()] != 2 || this.f20983.m13644() != EnumC10932.f32947) {
            return c15869;
        }
        C16646 findAny = C5378.stream(c3046.f9589.values()).filter(new Predicate() { // from class: l.ܿ۫ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C15869 c158692 = (C15869) obj;
                return c158692.m37607() == EnumC10932.f32947 && c158692.f49042.f7866.equals(C15869.this);
            }
        }).findAny();
        if (findAny.isPresent()) {
            return (C15869) findAny.get();
        }
        return c3046.m9314((AbstractC2465) new C14334(c15869));
    }

    @Override // l.InterfaceC1800
    public int getLength() {
        return mo5678() + 6;
    }

    @Override // l.InterfaceC1800
    /* renamed from: ֫ */
    public void mo2828(InterfaceC0408 interfaceC0408) {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f20984.f20943);
        c6053.m16887(mo5678());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC4662 m18407() {
        return this.f20983;
    }
}
