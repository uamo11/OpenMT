package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: 969A */
/* renamed from: l.۠ۜܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8011 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24738;

    public /* synthetic */ C8011(int i) {
        this.f24738 = i;
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
        Double lambda$tertiaryFixed$132;
        Double lambda$background$11;
        TonalPalette tonalPalette2;
        switch (this.f24738) {
            case 0:
                return ((C5977) obj).m16770().toLowerCase();
            case 1:
                return C2720.m8460((C1476) obj);
            case 2:
                return ((C2153) obj).f7129;
            case 3:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            case 4:
                lambda$tertiaryFixed$132 = MaterialDynamicColors.lambda$tertiaryFixed$132((DynamicScheme) obj);
                return lambda$tertiaryFixed$132;
            case 5:
                lambda$background$11 = MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
                return lambda$background$11;
            case 6:
                tonalPalette2 = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette2;
            case 7:
                return ((EnumC13833) obj).m33192();
            case 8:
                C1426 c1426 = (C1426) obj;
                EnumC12358 enumC12358 = EnumC12358.CONSTANT_NULL;
                return new C22442(c1426.m4929(), (String) c1426.f20043);
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
