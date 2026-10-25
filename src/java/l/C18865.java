package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.function.Function;

/* compiled from: 86ZM */
/* renamed from: l.ᩴܺܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C18865 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59479;

    public /* synthetic */ C18865(int i) {
        this.f59479 = i;
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
        Double lambda$primaryPaletteKeyColor$1;
        Double lambda$secondaryFixed$118;
        switch (this.f59479) {
            case 0:
                return new HashMap();
            case 1:
                return C11982.f35872;
            case 2:
                lambda$primaryPaletteKeyColor$1 = MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
                return lambda$primaryPaletteKeyColor$1;
            case 3:
                lambda$secondaryFixed$118 = MaterialDynamicColors.lambda$secondaryFixed$118((DynamicScheme) obj);
                return lambda$secondaryFixed$118;
            case 4:
                return new LinkedHashSet();
            default:
                return (InterfaceC21848) ((InterfaceC10042) obj).m25213();
        }
    }
}
