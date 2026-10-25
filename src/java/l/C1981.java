package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: I7DX */
/* renamed from: l.֫ᩳ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1981 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6638;

    public /* synthetic */ C1981(int i) {
        this.f6638 = i;
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
        Double lambda$errorContainer$98;
        Double lambda$primaryContainer$59;
        Double lambda$neutralVariantPaletteKeyColor$9;
        InterfaceC17664 stream;
        switch (this.f6638) {
            case 0:
                return "#" + ((Integer) obj);
            case 1:
                return new C23636();
            case 2:
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
                int i = C20239.f65443;
                if (!interfaceC17889.isDirectory()) {
                    return interfaceC17889.getPath();
                }
                return interfaceC17889.getPath() + "/";
            case 3:
                tonalPalette = ((DynamicScheme) obj).secondaryPalette;
                return tonalPalette;
            case 4:
                lambda$errorContainer$98 = MaterialDynamicColors.lambda$errorContainer$98((DynamicScheme) obj);
                return lambda$errorContainer$98;
            case 5:
                lambda$primaryContainer$59 = MaterialDynamicColors.lambda$primaryContainer$59((DynamicScheme) obj);
                return lambda$primaryContainer$59;
            case 6:
                lambda$neutralVariantPaletteKeyColor$9 = MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
                return lambda$neutralVariantPaletteKeyColor$9;
            default:
                stream = C5378.stream(((C18963) obj).f59815);
                return stream;
        }
    }
}
