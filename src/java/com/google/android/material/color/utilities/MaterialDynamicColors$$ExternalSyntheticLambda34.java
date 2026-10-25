package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda34 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda34(MaterialDynamicColors materialDynamicColors, int i) {
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
        DynamicColor lambda$onTertiaryFixed$140;
        DynamicColor lambda$onPrimaryContainer$63;
        switch (this.$r8$classId) {
            case 0:
                lambda$onTertiaryFixed$140 = this.f$0.lambda$onTertiaryFixed$140((DynamicScheme) obj);
                return lambda$onTertiaryFixed$140;
            default:
                lambda$onPrimaryContainer$63 = this.f$0.lambda$onPrimaryContainer$63((DynamicScheme) obj);
                return lambda$onPrimaryContainer$63;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
