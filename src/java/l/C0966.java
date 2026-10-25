package l;

import java.util.function.Function;

/* compiled from: 57L9 */
/* renamed from: l.֨۟֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0966 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3630;

    public /* synthetic */ C0966(int i) {
        this.f3630 = i;
    }

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
        AbstractC4308 abstractC4308;
        switch (this.f3630) {
            case 0:
                abstractC4308 = ((C20661) obj).f66469;
                return abstractC4308;
            default:
                return ((C9378) obj).f28484;
        }
    }
}
