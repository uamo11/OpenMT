package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda22 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda22(MaterialDynamicColors materialDynamicColors, int i) {
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
        DynamicColor lambda$onTertiaryFixedVariant$143;
        DynamicColor lambda$onPrimaryFixed$111;
        DynamicColor lambda$onPrimaryFixedVariant$115;
        switch (this.$r8$classId) {
            case 0:
                lambda$onTertiaryFixedVariant$143 = this.f$0.lambda$onTertiaryFixedVariant$143((DynamicScheme) obj);
                return lambda$onTertiaryFixedVariant$143;
            case 1:
                lambda$onPrimaryFixed$111 = this.f$0.lambda$onPrimaryFixed$111((DynamicScheme) obj);
                return lambda$onPrimaryFixed$111;
            default:
                lambda$onPrimaryFixedVariant$115 = this.f$0.lambda$onPrimaryFixedVariant$115((DynamicScheme) obj);
                return lambda$onPrimaryFixedVariant$115;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
