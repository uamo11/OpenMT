package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.Map;
import java.util.function.Function;

/* compiled from: J6S5 */
/* renamed from: l.ܶᩴᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C15420 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47228;

    public /* synthetic */ C15420(int i) {
        this.f47228 = i;
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
        FutureC3575 futureC3575;
        TonalPalette tonalPalette;
        Double lambda$tertiary$80;
        TonalPalette tonalPalette2;
        switch (this.f47228) {
            case 0:
                futureC3575 = ((C22477) ((Map.Entry) obj).getValue()).f72784;
                return futureC3575;
            case 1:
                int i = AbstractActivityC12266.f36524;
                return ((C8739) obj).f26609;
            case 2:
                return C17626.m41198((C12951) obj);
            case 3:
                tonalPalette = ((DynamicScheme) obj).tertiaryPalette;
                return tonalPalette;
            case 4:
                lambda$tertiary$80 = MaterialDynamicColors.lambda$tertiary$80((DynamicScheme) obj);
                return lambda$tertiary$80;
            case 5:
                tonalPalette2 = ((DynamicScheme) obj).primaryPalette;
                return tonalPalette2;
            case 6:
                return ((C1846) obj).m6131();
            case 7:
                int i2 = C13269.f39737;
                return null;
            default:
                return ((C18837) obj).m43517();
        }
    }
}
