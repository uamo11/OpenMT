package l;

import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: X43L */
/* renamed from: l.۫ܶ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12480 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakHashMap f37506 = new WeakHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f37507;

    public C12480(C6319 c6319) {
        this.f37507 = c6319;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13185 m30637(final AbstractC19810 abstractC19810) {
        C13185 c13185;
        WeakHashMap weakHashMap = this.f37506;
        C3308 c3308 = (C3308) weakHashMap.get(abstractC19810);
        C6319 c6319 = this.f37507;
        C5931 c5931 = c6319.f19601;
        C17545 m17498 = c6319.m17498(abstractC19810.f17560, false);
        if (c3308 != null && c3308.f10369 == m17498.mo27864()) {
            return c3308.f10368;
        }
        if (!abstractC19810.m16070() || (abstractC19810.mo16084() & 8192) != 0 || abstractC19810.m16100()) {
            C16719 m16622 = c6319.f19601.m16622("not.a.functional.intf", abstractC19810);
            C6130 c6130 = new C6130();
            c6130.f18768 = m16622;
            throw c6130;
        }
        C18837 c18837 = new C18837();
        for (final AbstractC5698 abstractC5698 : m17498.mo20475(new C10364(abstractC19810, c6319), EnumC1317.RECURSIVE)) {
            final AbstractC4308 m17543 = c6319.m17543(abstractC5698, abstractC19810.f17560);
            if (c18837.isEmpty()) {
                c18837.m43511(abstractC5698);
            } else {
                if (abstractC5698.f17562 != ((AbstractC5698) c18837.first()).f17562 || !c6319.m17516(m17543, c6319.m17543((AbstractC5698) c18837.first(), abstractC19810.f17560))) {
                    EnumC8352 m49076 = C21758.m49076(abstractC19810);
                    C11576 c11576 = C11886.f35440;
                    C16719 m166222 = c6319.f19601.m16622("not.a.functional.intf.1", abstractC19810, c5931.m16617(new C11576("compiler", "incompatible.abstracts", m49076, abstractC19810)));
                    C6130 c61302 = new C6130();
                    c61302.f18768 = m166222;
                    throw c61302;
                }
                if (!C5378.stream(c18837).filter(new Predicate() { // from class: l.ܶܶ֨
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
                        C12480 c12480 = C12480.this;
                        c12480.getClass();
                        return ((AbstractC5698) obj).f17561.mo16080(abstractC5698.m16071(), c12480.f37507);
                    }
                }).map(new Function() { // from class: l.᩸ܶ֨
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public /* synthetic */ Function mo22274andThen(Function function) {
                        return C20696.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C20696.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return C12480.this.f37507.m17543((AbstractC5698) obj, abstractC19810.f17560);
                    }
                }).anyMatch(new Predicate() { // from class: l.᩹ܶ֨
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
                        return C12480.this.f37507.m17532((AbstractC4308) obj, m17543, true);
                    }
                })) {
                    c18837.m43511(abstractC5698);
                }
            }
        }
        if (c18837.isEmpty()) {
            EnumC8352 m490762 = C21758.m49076(abstractC19810);
            C11576 c115762 = C11886.f35440;
            C16719 m166223 = c6319.f19601.m16622("not.a.functional.intf.1", abstractC19810, c5931.m16617(new C11576("compiler", "no.abstracts", m490762, abstractC19810)));
            C6130 c61303 = new C6130();
            c61303.f18768 = m166223;
            throw c61303;
        }
        if (c18837.size() == 1) {
            c13185 = new C13185(this, (AbstractC5698) c18837.first());
        } else {
            c13185 = (C13185) c6319.m17497(c18837.m43517(), abstractC19810.f17560, false).map(new Function() { // from class: l.᩶ܶ֨
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    AbstractC5698 abstractC56982 = (AbstractC5698) obj;
                    C12480 c12480 = C12480.this;
                    c12480.getClass();
                    return new C4719(c12480, abstractC56982.mo7048(), abstractC56982);
                }
            }).orElse(null);
            if (c13185 == null) {
                C18837 c188372 = new C18837();
                Iterator it = c18837.iterator();
                while (it.hasNext()) {
                    AbstractC5698 abstractC56982 = (AbstractC5698) it.next();
                    c188372.m43511(c5931.m16622(abstractC56982.f17560.mo12930().m8249() ? "descriptor.throws" : "descriptor", abstractC56982.f17562, abstractC56982.f17560.mo12933(), abstractC56982.f17560.mo12923(), abstractC56982.f17560.mo12930()));
                }
                EnumC8352 m490763 = C21758.m49076(abstractC19810);
                C11576 c115763 = C11886.f35440;
                C22864 c22864 = new C22864(c5931.m16617(new C11576("compiler", "incompatible.descs.in.functional.intf", m490763, abstractC19810)), c188372.m43517());
                C6130 c61304 = new C6130();
                c61304.f18768 = c22864;
                throw c61304;
            }
        }
        weakHashMap.put(abstractC19810, new C3308(c13185, m17498.mo27864()));
        return c13185;
    }
}
