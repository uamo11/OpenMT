package l;

import java.util.HashSet;
import java.util.function.Function;

/* compiled from: W7SR */
/* renamed from: l.ᩳ۫֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C18044 implements Function {
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
        C23688 c23688 = new C23688((C18750) obj);
        c23688.f76719 = new HashSet();
        return c23688;
    }
}
