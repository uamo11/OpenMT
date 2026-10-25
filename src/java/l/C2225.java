package l;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

/* compiled from: L6NC */
/* renamed from: l.ۖ֫ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2225 implements Function {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7278;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7279;

    public /* synthetic */ C2225(int i, Object obj) {
        this.f7278 = i;
        this.f7279 = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ToneDeltaPair lambda$secondaryContainer$75;
        switch (this.f7278) {
            case 0:
                return ((C23721) this.f7279).m52332((BooleanSupplier) obj);
            case 1:
                lambda$secondaryContainer$75 = ((MaterialDynamicColors) this.f7279).lambda$secondaryContainer$75((DynamicScheme) obj);
                return lambda$secondaryContainer$75;
            default:
                return C23083.m51245((C23083) this.f7279, (String) obj);
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
