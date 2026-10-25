package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;

/* compiled from: VAIY */
/* renamed from: l.۬ܺܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C13216 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39565;

    public /* synthetic */ C13216(int i) {
        this.f39565 = i;
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
        Double lambda$surfaceBright$20;
        switch (this.f39565) {
            case 0:
                return ((C12511) obj).f37581;
            case 1:
                return ((Thread) ((Map.Entry) obj).getKey()).getName();
            case 2:
                return new ArrayList();
            case 3:
                lambda$surfaceBright$20 = MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
                return lambda$surfaceBright$20;
            case 4:
                return Integer.valueOf(((String) obj).length());
            default:
                return C6241.m17188((EnumC19920) obj);
        }
    }
}
