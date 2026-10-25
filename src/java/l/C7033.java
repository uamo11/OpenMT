package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: Y9AZ */
/* renamed from: l.ۜ᩸ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7033 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21679;

    public /* synthetic */ C7033(int i) {
        this.f21679 = i;
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
        Double lambda$surfaceDim$18;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        switch (this.f21679) {
            case 0:
                return ((C3545) obj).m10810();
            case 1:
                lambda$surfaceDim$18 = MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
                return lambda$surfaceDim$18;
            case 2:
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            case 3:
                tonalPalette2 = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette2;
            case 4:
                return (InterfaceC15234) obj;
            default:
                return ((AbstractC4308) obj).mo2973();
        }
    }
}
