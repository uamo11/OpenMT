package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: 81EW */
/* renamed from: l.ۖۘܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2286 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7389;

    public /* synthetic */ C2286(int i) {
        this.f7389 = i;
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
        Double lambda$onSecondary$71;
        Double lambda$textSecondaryAndTertiaryInverse$155;
        Double lambda$textSecondaryAndTertiaryInverseDisabled$159;
        Double lambda$surfaceVariant$34;
        switch (this.f7389) {
            case 0:
                return ((AbstractC8636) obj).m22400();
            case 1:
                return ((EnumC15657) obj).m36865();
            case 2:
                return new ArrayList();
            case 3:
                lambda$onSecondary$71 = MaterialDynamicColors.lambda$onSecondary$71((DynamicScheme) obj);
                return lambda$onSecondary$71;
            case 4:
                lambda$textSecondaryAndTertiaryInverse$155 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$155((DynamicScheme) obj);
                return lambda$textSecondaryAndTertiaryInverse$155;
            case 5:
                lambda$textSecondaryAndTertiaryInverseDisabled$159 = MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$159((DynamicScheme) obj);
                return lambda$textSecondaryAndTertiaryInverseDisabled$159;
            case 6:
                lambda$surfaceVariant$34 = MaterialDynamicColors.lambda$surfaceVariant$34((DynamicScheme) obj);
                return lambda$surfaceVariant$34;
            case 7:
                return ((EnumC4662) obj).m13646();
            case 8:
                int i = C17503.f53466;
                return "???";
            case 9:
                return ((C12048) obj).f17562;
            case 10:
                C1323 c1323 = (C1323) obj;
                if (c1323.m4619() != null) {
                    return C7260.m19452(c1323.m4619().f24199);
                }
                return null;
            default:
                return (C9378) ((AbstractC5144) obj);
        }
    }
}
