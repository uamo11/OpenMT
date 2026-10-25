package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.HashSet;
import java.util.function.Function;

/* compiled from: 64JA */
/* renamed from: l.ۡܰۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8916 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27094;

    public /* synthetic */ C8916(int i) {
        this.f27094 = i;
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
        Double lambda$onErrorContainer$101;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        switch (this.f27094) {
            case 0:
                return Boolean.valueOf(((String) obj).contains("module-info."));
            case 1:
                lambda$onErrorContainer$101 = MaterialDynamicColors.lambda$onErrorContainer$101((DynamicScheme) obj);
                return lambda$onErrorContainer$101;
            case 2:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            case 3:
                tonalPalette2 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette2;
            default:
                return new HashSet();
        }
    }
}
