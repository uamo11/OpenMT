package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda80 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda80(MaterialDynamicColors materialDynamicColors, int i) {
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
        ToneDeltaPair lambda$secondaryFixedDim$122;
        DynamicColor lambda$onErrorContainer$102;
        switch (this.$r8$classId) {
            case 0:
                lambda$secondaryFixedDim$122 = this.f$0.lambda$secondaryFixedDim$122((DynamicScheme) obj);
                return lambda$secondaryFixedDim$122;
            default:
                lambda$onErrorContainer$102 = this.f$0.lambda$onErrorContainer$102((DynamicScheme) obj);
                return lambda$onErrorContainer$102;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
