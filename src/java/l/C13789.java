package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: Y7SB */
/* renamed from: l.ܰۨ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C13789 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        AbstractC5698 abstractC56982 = (AbstractC5698) obj2;
        C14163 c14163 = (C14163) abstractC56982;
        abstractC5698.getClass();
        for (AbstractC5698 abstractC56983 = abstractC5698; abstractC56983.f17559 != EnumC1296.f4579; abstractC56983 = abstractC56983.f17561) {
            if (abstractC56983 == c14163) {
                return abstractC5698;
            }
        }
        return abstractC56982;
    }
}
