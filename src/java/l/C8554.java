package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: B13Z */
/* renamed from: l.ۡ֨ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8554 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26156;

    public /* synthetic */ C8554(int i) {
        this.f26156 = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String str;
        Double lambda$secondary$68;
        TonalPalette tonalPalette;
        switch (this.f26156) {
            case 0:
                str = ((C2204) obj).f7242;
                return str;
            case 1:
                lambda$secondary$68 = MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
                return lambda$secondary$68;
            default:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
