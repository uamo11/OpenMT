package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.function.Function;

/* compiled from: X5LN */
/* renamed from: l.᩵᩶ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C19694 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63625;

    public /* synthetic */ C19694(int i) {
        this.f63625 = i;
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
        Double lambda$controlHighlight$150;
        switch (this.f63625) {
            case 0:
                return ((C23471) obj).m51921();
            case 1:
                return ((C8739) obj).f26609;
            case 2:
                return ((EnumC0841) obj).f3315;
            case 3:
                return ((C17667) obj).f54033;
            case 4:
                tonalPalette = ((DynamicScheme) obj).neutralPalette;
                return tonalPalette;
            default:
                lambda$controlHighlight$150 = MaterialDynamicColors.lambda$controlHighlight$150((DynamicScheme) obj);
                return lambda$controlHighlight$150;
        }
    }
}
