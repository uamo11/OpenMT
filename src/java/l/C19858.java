package l;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: A451 */
/* renamed from: l.᩶֫۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19858 implements InterfaceC20996 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f64139;

    public C19858(C22406 c22406) {
        this.f64139 = c22406;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l.۠֫۠] */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.ܶ֫۠] */
    @Override // l.InterfaceC20996
    /* renamed from: ֫ */
    public final AbstractC5698 mo16565(C1755 c1755, AbstractC10370 abstractC10370) {
        C8295 c8295;
        AbstractC5698 m50284;
        final C2609 m31091 = C12780.m31091(abstractC10370);
        ?? r4 = new Function() { // from class: l.۠֫۠
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
                final C19858 c19858 = C19858.this;
                final C2609 c2609 = m31091;
                return new Iterable() { // from class: l.᩸֫۠
                    @Override // java.lang.Iterable
                    public final Iterator iterator() {
                        final C19858 c198582 = C19858.this;
                        return C22159.m49777(c2609, new Function() { // from class: l.᩹֫۠
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
                            public final Object apply(Object obj2) {
                                return C19858.this.f64139.f72605.m47265((AbstractC10370) obj2).iterator();
                            }
                        });
                    }
                };
            }
        };
        ?? r5 = new BiFunction() { // from class: l.ܶ֫۠
            public /* synthetic */ BiFunction andThen(Function function) {
                return C17167.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C0052 c0052 = (C0052) obj;
                C19858 c19858 = C19858.this;
                c19858.getClass();
                Iterator it = m31091.iterator();
                while (it.hasNext()) {
                    try {
                        return c19858.f64139.f72574.m45829(c0052, (AbstractC10370) it.next());
                    } catch (C20515 unused) {
                    }
                }
                return null;
            }
        };
        C12627 c12627 = new C12627(1);
        C22406 c22406 = this.f64139;
        c8295 = c22406.f72603;
        m50284 = c22406.m50284(c1755, abstractC10370, (Function) r4, (BiFunction) r5, c12627, c8295);
        return m50284;
    }
}
