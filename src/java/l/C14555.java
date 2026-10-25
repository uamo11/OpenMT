package l;

import java.util.function.Function;

/* compiled from: T7LF */
/* renamed from: l.ܳܰ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C14555 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44574;

    public /* synthetic */ C14555(int i) {
        this.f44574 = i;
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
        switch (this.f44574) {
            case 0:
                return ((C0052) obj).f17562.toString();
            default:
                abstractC4308 = ((C20661) obj).f66522;
                return abstractC4308;
        }
    }
}
