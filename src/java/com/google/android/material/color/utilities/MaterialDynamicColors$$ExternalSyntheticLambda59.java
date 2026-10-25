package com.google.android.material.color.utilities;

import java.util.function.Function;
import l.C20696;

/* loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda59 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda59(MaterialDynamicColors materialDynamicColors, int i) {
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
        DynamicColor lambda$inversePrimary$66;
        Double lambda$onTertiaryContainer$89;
        switch (this.$r8$classId) {
            case 0:
                lambda$inversePrimary$66 = this.f$0.lambda$inversePrimary$66((DynamicScheme) obj);
                return lambda$inversePrimary$66;
            default:
                lambda$onTertiaryContainer$89 = this.f$0.lambda$onTertiaryContainer$89((DynamicScheme) obj);
                return lambda$onTertiaryContainer$89;
        }
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }
}
