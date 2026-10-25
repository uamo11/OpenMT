package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: 969A */
/* renamed from: l.ۛۜܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5894 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18100;

    public /* synthetic */ C5894(int i) {
        this.f18100 = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$outline$43;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        Double lambda$onSurface$32;
        InterfaceC17664 stream;
        switch (this.f18100) {
            case 0:
                return new C9160((C12951) obj);
            case 1:
                lambda$outline$43 = MaterialDynamicColors.lambda$outline$43((DynamicScheme) obj);
                return lambda$outline$43;
            case 2:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            case 3:
                tonalPalette2 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette2;
            case 4:
                lambda$onSurface$32 = MaterialDynamicColors.lambda$onSurface$32((DynamicScheme) obj);
                return lambda$onSurface$32;
            case 5:
                return C5378.stream((C2609) obj);
            default:
                stream = C5378.stream(((C18963) obj).f59815);
                return stream;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
