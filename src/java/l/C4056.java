package l;

import java.util.function.Function;

/* compiled from: V7EY */
/* renamed from: l.ۘܽ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4056 implements Function {
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
        return Short.toString(((C21695) obj).f47013);
    }
}
