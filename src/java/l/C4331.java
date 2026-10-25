package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TemperatureCache;
import com.google.android.material.color.utilities.ToneDeltaPair;
import java.util.function.Function;

/* compiled from: 17QI */
/* renamed from: l.ۙ֫ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4331 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13930;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13931;

    public /* synthetic */ C4331(int i, Object obj) {
        this.f13930 = i;
        this.f13931 = obj;
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
        ToneDeltaPair lambda$tertiary$81;
        Double lambda$getHctsByTemp$0;
        switch (this.f13930) {
            case 0:
                return Boolean.valueOf(!((EnumC3329) obj).equals(((InterfaceC0301) this.f13931).mo987()));
            case 1:
                lambda$tertiary$81 = ((MaterialDynamicColors) this.f13931).lambda$tertiary$81((DynamicScheme) obj);
                return lambda$tertiary$81;
            default:
                lambda$getHctsByTemp$0 = ((TemperatureCache) this.f13931).lambda$getHctsByTemp$0((Hct) obj);
                return lambda$getHctsByTemp$0;
        }
    }
}
