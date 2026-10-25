package l;

import java.util.function.Function;

/* compiled from: X43L */
/* renamed from: l.֡۠֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0280 implements Function {
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
        C2609 m17465;
        C5425 c5425 = (C5425) obj;
        if (!c5425.f16917) {
            return c5425.f16916;
        }
        m17465 = c5425.f16919.m17465(c5425.f16916);
        return m17465;
    }
}
