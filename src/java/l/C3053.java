package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: H5BW */
/* renamed from: l.ۗۛܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3053 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9597;

    public /* synthetic */ C3053(int i) {
        this.f9597 = i;
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
        TonalPalette tonalPalette3;
        InterfaceC17664 stream;
        switch (this.f9597) {
            case 0:
                return ((EnumC8139) obj).f25123;
            case 1:
                return ((C12511) obj).m30693();
            case 2:
                tonalPalette = ((DynamicScheme) obj).errorPalette;
                return tonalPalette;
            case 3:
                tonalPalette2 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette2;
            case 4:
                tonalPalette3 = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette3;
            case 5:
                return Boolean.valueOf(((String) obj).contains("package-info."));
            case 6:
                return "#" + ((Integer) obj);
            default:
                stream = C5378.stream(((C18963) obj).f59815);
                return stream;
        }
    }
}
