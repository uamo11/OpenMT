package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: B4S2 */
/* renamed from: l.۫ۜܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C12247 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36504;

    public /* synthetic */ C12247(int i) {
        this.f36504 = i;
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
        Double lambda$tertiaryPaletteKeyColor$5;
        Double lambda$secondaryFixedDim$121;
        switch (this.f36504) {
            case 0:
                return ((C15068) obj).m35657();
            case 1:
                return ((C6703) obj).m18262();
            case 2:
                return new ArrayList();
            case 3:
                tonalPalette = ((DynamicScheme) obj).errorPalette;
                return tonalPalette;
            case 4:
                lambda$tertiaryPaletteKeyColor$5 = MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
                return lambda$tertiaryPaletteKeyColor$5;
            default:
                lambda$secondaryFixedDim$121 = MaterialDynamicColors.lambda$secondaryFixedDim$121((DynamicScheme) obj);
                return lambda$secondaryFixedDim$121;
        }
    }
}
