package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.io.File;
import java.util.function.Function;

/* compiled from: A16O */
/* renamed from: l.ۜ֡ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6416 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19850;

    public /* synthetic */ C6416(int i) {
        this.f19850 = i;
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
        Double lambda$surfaceTint$51;
        TonalPalette tonalPalette;
        TonalPalette tonalPalette2;
        Double lambda$primaryFixed$104;
        InterfaceC17664 stream;
        switch (this.f19850) {
            case 0:
                return ((File) obj).getPath();
            case 1:
                return new C5259((C12951) obj);
            case 2:
                int i = C13425.f40110;
                return C1493.m5161((String) obj, EnumC16309.MODIFY_DIRECTORY);
            case 3:
                lambda$surfaceTint$51 = MaterialDynamicColors.lambda$surfaceTint$51((DynamicScheme) obj);
                return lambda$surfaceTint$51;
            case 4:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            case 5:
                tonalPalette2 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette2;
            case 6:
                lambda$primaryFixed$104 = MaterialDynamicColors.lambda$primaryFixed$104((DynamicScheme) obj);
                return lambda$primaryFixed$104;
            case 7:
                return "#" + ((Integer) obj);
            default:
                stream = C5378.stream(((C18963) obj).f59815);
                return stream;
        }
    }
}
