package l;

import java.util.function.Function;

/* compiled from: F416 */
/* renamed from: l.۟᩶֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7688 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23736;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23737;

    public /* synthetic */ C7688(int i, Object obj) {
        this.f23736 = i;
        this.f23737 = obj;
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
        switch (this.f23736) {
            case 0:
                AbstractC4308 abstractC4308 = (AbstractC4308) obj;
                return abstractC4308.mo12941() ? ((C9310) this.f23737).f28251.m17496(abstractC4308).f17560 : abstractC4308;
            default:
                return ((AbstractC3083) obj).mo9414((AbstractC4308) this.f23737);
        }
    }
}
