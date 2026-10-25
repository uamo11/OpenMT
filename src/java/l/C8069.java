package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: D445 */
/* renamed from: l.۠ۡ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8069 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24874;

    public /* synthetic */ C8069(int i) {
        this.f24874 = i;
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
        Double lambda$controlHighlight$151;
        TonalPalette tonalPalette3;
        switch (this.f24874) {
            case 0:
                C3587 m4616 = ((C1323) obj).m4616();
                if (m4616 != null) {
                    return C7260.m19452(m4616.f11378);
                }
                return null;
            case 1:
                return new ArrayList();
            case 2:
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            case 3:
                tonalPalette2 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette2;
            case 4:
                lambda$controlHighlight$151 = MaterialDynamicColors.lambda$controlHighlight$151((DynamicScheme) obj);
                return lambda$controlHighlight$151;
            case 5:
                tonalPalette3 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette3;
            default:
                return Integer.valueOf(((EnumC4662) obj).m13648());
        }
    }
}
