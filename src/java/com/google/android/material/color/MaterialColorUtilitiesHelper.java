package com.google.android.material.color;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.Map;
import l.C14402;
import l.C20195;

/* loaded from: classes.dex */
public final class MaterialColorUtilitiesHelper {
    public static final Map colorResourceIdToColorValue;
    public static final MaterialDynamicColors dynamicColors;

    static {
        MaterialDynamicColors materialDynamicColors = new MaterialDynamicColors();
        dynamicColors = materialDynamicColors;
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(C14402.f43597), materialDynamicColors.primary());
        hashMap.put(Integer.valueOf(C14402.f43760), materialDynamicColors.onPrimary());
        hashMap.put(Integer.valueOf(C14402.f43688), materialDynamicColors.inversePrimary());
        hashMap.put(Integer.valueOf(C14402.f44051), materialDynamicColors.primaryContainer());
        hashMap.put(Integer.valueOf(C14402.f44124), materialDynamicColors.onPrimaryContainer());
        hashMap.put(Integer.valueOf(C14402.f43461), materialDynamicColors.secondary());
        hashMap.put(Integer.valueOf(C14402.f43826), materialDynamicColors.onSecondary());
        hashMap.put(Integer.valueOf(C14402.f43506), materialDynamicColors.secondaryContainer());
        hashMap.put(Integer.valueOf(C14402.f43624), materialDynamicColors.onSecondaryContainer());
        hashMap.put(Integer.valueOf(C14402.f43800), materialDynamicColors.tertiary());
        hashMap.put(Integer.valueOf(C14402.f43959), materialDynamicColors.onTertiary());
        hashMap.put(Integer.valueOf(C14402.f43778), materialDynamicColors.tertiaryContainer());
        hashMap.put(Integer.valueOf(C14402.f43936), materialDynamicColors.onTertiaryContainer());
        hashMap.put(Integer.valueOf(C14402.f44078), materialDynamicColors.background());
        hashMap.put(Integer.valueOf(C14402.f43782), materialDynamicColors.onBackground());
        hashMap.put(Integer.valueOf(C14402.f43392), materialDynamicColors.surface());
        hashMap.put(Integer.valueOf(C14402.f43438), materialDynamicColors.onSurface());
        hashMap.put(Integer.valueOf(C14402.f43484), materialDynamicColors.surfaceVariant());
        hashMap.put(Integer.valueOf(C14402.f43913), materialDynamicColors.onSurfaceVariant());
        hashMap.put(Integer.valueOf(C14402.f43529), materialDynamicColors.inverseSurface());
        hashMap.put(Integer.valueOf(C14402.f43733), materialDynamicColors.inverseOnSurface());
        hashMap.put(Integer.valueOf(C14402.f43552), materialDynamicColors.surfaceBright());
        hashMap.put(Integer.valueOf(C14402.f44028), materialDynamicColors.surfaceDim());
        hashMap.put(Integer.valueOf(C14402.f43415), materialDynamicColors.surfaceContainer());
        hashMap.put(Integer.valueOf(C14402.f44074), materialDynamicColors.surfaceContainerLow());
        hashMap.put(Integer.valueOf(C14402.f43642), materialDynamicColors.surfaceContainerHigh());
        hashMap.put(Integer.valueOf(C14402.f44097), materialDynamicColors.surfaceContainerLowest());
        hashMap.put(Integer.valueOf(C14402.f43867), materialDynamicColors.surfaceContainerHighest());
        hashMap.put(Integer.valueOf(C14402.f43844), materialDynamicColors.outline());
        hashMap.put(Integer.valueOf(C14402.f44142), materialDynamicColors.outlineVariant());
        hashMap.put(Integer.valueOf(C14402.f43488), materialDynamicColors.error());
        hashMap.put(Integer.valueOf(C14402.f43715), materialDynamicColors.onError());
        hashMap.put(Integer.valueOf(C14402.f43804), materialDynamicColors.errorContainer());
        hashMap.put(Integer.valueOf(C14402.f43579), materialDynamicColors.onErrorContainer());
        hashMap.put(Integer.valueOf(C14402.f44101), materialDynamicColors.controlActivated());
        hashMap.put(Integer.valueOf(C14402.f43533), materialDynamicColors.controlNormal());
        hashMap.put(Integer.valueOf(C14402.f44032), materialDynamicColors.controlHighlight());
        hashMap.put(Integer.valueOf(C14402.f43575), materialDynamicColors.textPrimaryInverse());
        hashMap.put(Integer.valueOf(C14402.f44120), materialDynamicColors.textSecondaryAndTertiaryInverse());
        hashMap.put(Integer.valueOf(C14402.f43822), materialDynamicColors.textSecondaryAndTertiaryInverseDisabled());
        hashMap.put(Integer.valueOf(C14402.f43756), materialDynamicColors.textPrimaryInverseDisableOnly());
        hashMap.put(Integer.valueOf(C14402.f43711), materialDynamicColors.textHintInverse());
        colorResourceIdToColorValue = C20195.unmodifiableMap(hashMap);
    }

    public static Map createColorResourcesIdsToColorValues(DynamicScheme dynamicScheme) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : colorResourceIdToColorValue.entrySet()) {
            hashMap.put((Integer) entry.getKey(), Integer.valueOf(((DynamicColor) entry.getValue()).getArgb(dynamicScheme)));
        }
        return C20195.unmodifiableMap(hashMap);
    }
}
