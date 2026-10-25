package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: U7Z7 */
/* renamed from: l.ܳۢۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C14436 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44251;

    public /* synthetic */ C14436(int i) {
        this.f44251 = i;
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
        Double lambda$primary$53;
        Double lambda$onBackground$13;
        Double lambda$surfaceContainerHighest$30;
        switch (this.f44251) {
            case 0:
                return C20094.m46315("ecdsa-sha2-", (String) obj);
            case 1:
                return new C1805((C12951) obj);
            case 2:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            case 3:
                lambda$primary$53 = MaterialDynamicColors.lambda$primary$53((DynamicScheme) obj);
                return lambda$primary$53;
            case 4:
                lambda$onBackground$13 = MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
                return lambda$onBackground$13;
            default:
                lambda$surfaceContainerHighest$30 = MaterialDynamicColors.lambda$surfaceContainerHighest$30((DynamicScheme) obj);
                return lambda$surfaceContainerHighest$30;
        }
    }
}
