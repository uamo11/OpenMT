package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import java.util.function.Function;

/* compiled from: KAQ1 */
/* renamed from: l.ۛ֫ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5748 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17678;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17679;

    public /* synthetic */ C5748(int i, Object obj) {
        this.f17678 = i;
        this.f17679 = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ToneDeltaPair lambda$tertiaryFixedDim$136;
        switch (this.f17678) {
            case 0:
                return C11393.m28156((C11393) this.f17679, (String) obj);
            default:
                lambda$tertiaryFixedDim$136 = ((MaterialDynamicColors) this.f17679).lambda$tertiaryFixedDim$136((DynamicScheme) obj);
                return lambda$tertiaryFixedDim$136;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
