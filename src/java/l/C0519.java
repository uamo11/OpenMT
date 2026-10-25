package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: 86ZM */
/* renamed from: l.֡ܺܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0519 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f2173;

    public /* synthetic */ C0519(int i) {
        this.f2173 = i;
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
        switch (this.f2173) {
            case 0:
                return new ArrayList();
            case 1:
                tonalPalette = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette;
            case 2:
                tonalPalette2 = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette2;
            default:
                tonalPalette3 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette3;
        }
    }
}
