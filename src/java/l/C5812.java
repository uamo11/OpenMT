package l;

import android.text.SpannableStringBuilder;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import java.util.function.Function;

/* compiled from: OAYY */
/* renamed from: l.ۛۘܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5812 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17856;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f17857;

    public /* synthetic */ C5812(int i, Object obj) {
        this.f17856 = i;
        this.f17857 = obj;
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
        ToneDeltaPair lambda$primary$54;
        DynamicColor lambda$onBackground$14;
        switch (this.f17856) {
            case 0:
                return (SpannableStringBuilder) ((C10046) this.f17857).invoke(obj);
            case 1:
                lambda$primary$54 = ((MaterialDynamicColors) this.f17857).lambda$primary$54((DynamicScheme) obj);
                return lambda$primary$54;
            default:
                lambda$onBackground$14 = ((MaterialDynamicColors) this.f17857).lambda$onBackground$14((DynamicScheme) obj);
                return lambda$onBackground$14;
        }
    }
}
