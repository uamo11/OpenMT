package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda42 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda42(MaterialDynamicColors materialDynamicColors, int i) {
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
        ToneDeltaPair lambda$primaryContainer$60;
        ToneDeltaPair lambda$errorContainer$99;
        switch (this.$r8$classId) {
            case 0:
                lambda$primaryContainer$60 = this.f$0.lambda$primaryContainer$60((DynamicScheme) obj);
                return lambda$primaryContainer$60;
            default:
                lambda$errorContainer$99 = this.f$0.lambda$errorContainer$99((DynamicScheme) obj);
                return lambda$errorContainer$99;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
