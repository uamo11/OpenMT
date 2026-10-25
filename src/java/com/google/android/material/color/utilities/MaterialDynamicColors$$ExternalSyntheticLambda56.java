package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda56 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda56(MaterialDynamicColors materialDynamicColors, int i) {
        this.$r8$classId = i;
        this.f$0 = materialDynamicColors;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$onPrimary$57;
        DynamicColor lambda$inverseOnSurface$41;
        ToneDeltaPair lambda$tertiaryContainer$87;
        switch (this.$r8$classId) {
            case 0:
                lambda$onPrimary$57 = this.f$0.lambda$onPrimary$57((DynamicScheme) obj);
                return lambda$onPrimary$57;
            case 1:
                lambda$inverseOnSurface$41 = this.f$0.lambda$inverseOnSurface$41((DynamicScheme) obj);
                return lambda$inverseOnSurface$41;
            default:
                lambda$tertiaryContainer$87 = this.f$0.lambda$tertiaryContainer$87((DynamicScheme) obj);
                return lambda$tertiaryContainer$87;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
