package l;

import java.util.function.Function;

/* compiled from: NB79 */
/* renamed from: l.۠ۛܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7990 implements Function {
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
        C4007 c4007 = (C4007) obj;
        int m29965 = C12347.m29965(c4007);
        if (m29965 == 0) {
            return null;
        }
        return new C4462(c4007.m12082(), c4007.m12080(), C12347.m29964(c4007), (int) c4007.m12074(), m29965);
    }
}
