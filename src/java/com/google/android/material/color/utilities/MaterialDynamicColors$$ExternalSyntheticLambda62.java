package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda62 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda62(MaterialDynamicColors materialDynamicColors, int i) {
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
        ToneDeltaPair lambda$secondaryFixed$119;
        DynamicColor lambda$onSecondaryContainer$78;
        switch (this.$r8$classId) {
            case 0:
                lambda$secondaryFixed$119 = this.f$0.lambda$secondaryFixed$119((DynamicScheme) obj);
                return lambda$secondaryFixed$119;
            default:
                lambda$onSecondaryContainer$78 = this.f$0.lambda$onSecondaryContainer$78((DynamicScheme) obj);
                return lambda$onSecondaryContainer$78;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
