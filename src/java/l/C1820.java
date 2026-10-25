package l;

import java.util.function.Function;

/* compiled from: R7DV */
/* renamed from: l.֫۫ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1820 implements Function {
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
        return C13803.of(((C10993) obj).getLength());
    }
}
