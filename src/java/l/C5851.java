package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: 91T6 */
/* renamed from: l.ۛۚۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5851 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17949;

    public /* synthetic */ C5851(int i) {
        this.f17949 = i;
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
        Double lambda$inverseOnSurface$40;
        Double lambda$controlNormal$148;
        Double lambda$onPrimary$56;
        Double lambda$tertiaryContainer$86;
        switch (this.f17949) {
            case 0:
                return C11496.m28323((String) obj);
            case 1:
                return C2499.f7958;
            case 2:
                return new ArrayList();
            case 3:
                return new C9555((AbstractC15440) obj);
            case 4:
                return ((C4103) obj).f13038;
            case 5:
                lambda$inverseOnSurface$40 = MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
                return lambda$inverseOnSurface$40;
            case 6:
                lambda$controlNormal$148 = MaterialDynamicColors.lambda$controlNormal$148((DynamicScheme) obj);
                return lambda$controlNormal$148;
            case 7:
                lambda$onPrimary$56 = MaterialDynamicColors.lambda$onPrimary$56((DynamicScheme) obj);
                return lambda$onPrimary$56;
            case 8:
                lambda$tertiaryContainer$86 = MaterialDynamicColors.lambda$tertiaryContainer$86((DynamicScheme) obj);
                return lambda$tertiaryContainer$86;
            case 9:
                return String.format("??? Invalid constant_pool reference #%d", (Integer) obj);
            default:
                return C6241.m17189(EnumC19920.f64377, EnumC19920.f64414);
        }
    }
}
