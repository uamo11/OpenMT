package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: 969A */
/* renamed from: l.᩺ۜܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C22827 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73698;

    public /* synthetic */ C22827(int i) {
        this.f73698 = i;
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
        Double lambda$onSecondaryFixed$124;
        TonalPalette tonalPalette;
        Double lambda$outlineVariant$45;
        TonalPalette tonalPalette2;
        switch (this.f73698) {
            case 0:
                return new C14824((C12951) obj);
            case 1:
                lambda$onSecondaryFixed$124 = MaterialDynamicColors.lambda$onSecondaryFixed$124((DynamicScheme) obj);
                return lambda$onSecondaryFixed$124;
            case 2:
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            case 3:
                lambda$outlineVariant$45 = MaterialDynamicColors.lambda$outlineVariant$45((DynamicScheme) obj);
                return lambda$outlineVariant$45;
            case 4:
                tonalPalette2 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette2;
            case 5:
                C5851 c5851 = C10242.f30878;
                return null;
            default:
                return ((AbstractC5698) obj).f17560;
        }
    }
}
