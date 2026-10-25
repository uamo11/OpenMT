package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda96 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda96(MaterialDynamicColors materialDynamicColors, int i) {
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
        ToneDeltaPair lambda$primaryFixedDim$108;
        DynamicColor lambda$onSecondaryFixed$126;
        DynamicColor lambda$onSecondaryFixedVariant$129;
        switch (this.$r8$classId) {
            case 0:
                lambda$primaryFixedDim$108 = this.f$0.lambda$primaryFixedDim$108((DynamicScheme) obj);
                return lambda$primaryFixedDim$108;
            case 1:
                lambda$onSecondaryFixed$126 = this.f$0.lambda$onSecondaryFixed$126((DynamicScheme) obj);
                return lambda$onSecondaryFixed$126;
            default:
                lambda$onSecondaryFixedVariant$129 = this.f$0.lambda$onSecondaryFixedVariant$129((DynamicScheme) obj);
                return lambda$onSecondaryFixedVariant$129;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
