package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.ArrayDeque;
import java.util.function.Function;

/* compiled from: D18B */
/* renamed from: l.۟᩵ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7680 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23724;

    public /* synthetic */ C7680(int i) {
        this.f23724 = i;
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
        Double lambda$surfaceContainerHigh$28;
        TonalPalette tonalPalette2;
        switch (this.f23724) {
            case 0:
                return ((AbstractC15440) obj).getName();
            case 1:
                return ((InterfaceC7099) obj).mo18742();
            case 2:
                return new C10738((C12951) obj);
            case 3:
                return ((C8712) obj).f26516;
            case 4:
                tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
                return tonalPalette;
            case 5:
                lambda$surfaceContainerHigh$28 = MaterialDynamicColors.lambda$surfaceContainerHigh$28((DynamicScheme) obj);
                return lambda$surfaceContainerHigh$28;
            case 6:
                tonalPalette2 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette2;
            case 7:
                return ((EnumC13833) obj).m33191();
            default:
                return new ArrayDeque();
        }
    }
}
