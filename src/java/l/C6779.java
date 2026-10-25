package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: KBGJ */
/* renamed from: l.ۜ۬ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6779 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21051;

    public /* synthetic */ C6779(int i) {
        this.f21051 = i;
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
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        Double lambda$textPrimaryInverseDisableOnly$157;
        switch (this.f21051) {
            case 0:
                return ((C20891) obj).toString();
            case 1:
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            case 2:
                tonalPalette2 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette2;
            case 3:
                lambda$textPrimaryInverseDisableOnly$157 = MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157((DynamicScheme) obj);
                return lambda$textPrimaryInverseDisableOnly$157;
            default:
                return ((InterfaceC21164) obj).mo957();
        }
    }
}
