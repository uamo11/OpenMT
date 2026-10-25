package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.material.color.ColorResourcesOverride;
import com.google.android.material.color.DynamicColorsOptions;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import com.google.android.material.internal.ManufacturerUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import l.C17931;
import l.C20195;

/* loaded from: classes.dex */
public class DynamicColors {
    public static final DeviceSupportCondition DEFAULT_DEVICE_SUPPORT_CONDITION;
    public static final Map DYNAMIC_COLOR_SUPPORTED_BRANDS;
    public static final Map DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS;
    public static final int[] DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE = {C17931.f55767};

    @SuppressLint({"PrivateApi"})
    public static final DeviceSupportCondition SAMSUNG_DEVICE_SUPPORT_CONDITION;
    public static final String TAG;
    public static final int USE_DEFAULT_THEME_OVERLAY = 0;

    public interface DeviceSupportCondition {
        boolean isSupported();
    }

    public interface OnAppliedCallback {
        void onApplied(Activity activity);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(Activity activity, int i);
    }

    static {
        DeviceSupportCondition deviceSupportCondition = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.1
            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                return true;
            }
        };
        DEFAULT_DEVICE_SUPPORT_CONDITION = deviceSupportCondition;
        DeviceSupportCondition deviceSupportCondition2 = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.2
            public Long version;

            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                if (this.version == null) {
                    try {
                        Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                        declaredMethod.setAccessible(true);
                        Long l2 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                        l2.longValue();
                        this.version = l2;
                    } catch (Exception unused) {
                        this.version = -1L;
                    }
                }
                return this.version.longValue() >= 40100;
            }
        };
        SAMSUNG_DEVICE_SUPPORT_CONDITION = deviceSupportCondition2;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", deviceSupportCondition);
        hashMap.put("google", deviceSupportCondition);
        hashMap.put("hmd global", deviceSupportCondition);
        hashMap.put("infinix", deviceSupportCondition);
        hashMap.put("infinix mobility limited", deviceSupportCondition);
        hashMap.put("itel", deviceSupportCondition);
        hashMap.put("kyocera", deviceSupportCondition);
        hashMap.put("lenovo", deviceSupportCondition);
        hashMap.put(ManufacturerUtils.LGE, deviceSupportCondition);
        hashMap.put(ManufacturerUtils.MEIZU, deviceSupportCondition);
        hashMap.put("motorola", deviceSupportCondition);
        hashMap.put("nothing", deviceSupportCondition);
        hashMap.put("oneplus", deviceSupportCondition);
        hashMap.put("oppo", deviceSupportCondition);
        hashMap.put("realme", deviceSupportCondition);
        hashMap.put("robolectric", deviceSupportCondition);
        hashMap.put(ManufacturerUtils.SAMSUNG, deviceSupportCondition2);
        hashMap.put("sharp", deviceSupportCondition);
        hashMap.put("shift", deviceSupportCondition);
        hashMap.put("sony", deviceSupportCondition);
        hashMap.put("tcl", deviceSupportCondition);
        hashMap.put("tecno", deviceSupportCondition);
        hashMap.put("tecno mobile limited", deviceSupportCondition);
        hashMap.put("vivo", deviceSupportCondition);
        hashMap.put("wingtech", deviceSupportCondition);
        hashMap.put("xiaomi", deviceSupportCondition);
        DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS = C20195.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", deviceSupportCondition);
        hashMap2.put("jio", deviceSupportCondition);
        DYNAMIC_COLOR_SUPPORTED_BRANDS = C20195.unmodifiableMap(hashMap2);
        TAG = "DynamicColors";
    }

    public static void applyToActivitiesIfAvailable(Application application) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, int i) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(Application application, int i, Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(Application application, DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new DynamicColorsActivityLifecycleCallbacks(dynamicColorsOptions));
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity, int i) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    @Deprecated
    public static void applyIfAvailable(Activity activity, Precondition precondition) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    public static void applyToActivityIfAvailable(Activity activity) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().build());
    }

    public static void applyToActivityIfAvailable(Activity activity, DynamicColorsOptions dynamicColorsOptions) {
        int i;
        if (isDynamicColorAvailable()) {
            if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                i = 0;
            } else if (dynamicColorsOptions.getThemeOverlay() == 0) {
                i = getDefaultThemeOverlay(activity, DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE);
            } else {
                i = dynamicColorsOptions.getThemeOverlay();
            }
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, i)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.isLightTheme(activity), getSystemContrast(activity));
                    ColorResourcesOverride cc = ColorResourcesOverride.CC.getInstance();
                    if (cc == null || !cc.applyIfPossible(activity, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    ThemeUtils.applyThemeOverlay(activity, i);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    public static Context wrapContextIfAvailable(Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    public static Context wrapContextIfAvailable(Context context, int i) {
        return wrapContextIfAvailable(context, new DynamicColorsOptions.Builder().setThemeOverlay(i).build());
    }

    public static Context wrapContextIfAvailable(Context context, DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int themeOverlay = dynamicColorsOptions.getThemeOverlay();
            if (themeOverlay == 0) {
                themeOverlay = getDefaultThemeOverlay(context, DYNAMIC_COLOR_THEME_OVERLAY_ATTRIBUTE);
            }
            if (themeOverlay != 0) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.isLightTheme(context), getSystemContrast(context));
                    ColorResourcesOverride cc = ColorResourcesOverride.CC.getInstance();
                    if (cc != null) {
                        return cc.wrapContextIfPossible(context, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent));
                    }
                }
                return new ContextThemeWrapper(context, themeOverlay);
            }
        }
        return context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r0.compareTo(r1) >= 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isDynamicColorAvailable() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            int r1 = l.C16630.f51071
            r1 = 33
            r3 = 1
            if (r0 >= r1) goto L68
            r1 = 32
            if (r0 < r1) goto L3e
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            l.C11233.m27803(r0, r1)
            java.lang.String r1 = "REL"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L23
            goto L3e
        L23:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            java.lang.String r4 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            l.C11233.m27803(r0, r4)
            java.lang.String r5 = "Tiramisu"
            java.lang.String r1 = r5.toUpperCase(r1)
            l.C11233.m27803(r1, r4)
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L3e
            goto L68
        L3e:
            java.util.Map r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_MANUFACTURERS
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.color.DynamicColors$DeviceSupportCondition r0 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r0
            if (r0 != 0) goto L5e
            java.util.Map r0 = com.google.android.material.color.DynamicColors.DYNAMIC_COLOR_SUPPORTED_BRANDS
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.color.DynamicColors$DeviceSupportCondition r0 = (com.google.android.material.color.DynamicColors.DeviceSupportCondition) r0
        L5e:
            if (r0 == 0) goto L67
            boolean r0 = r0.isSupported()
            if (r0 == 0) goto L67
            return r3
        L67:
            return r2
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.DynamicColors.isDynamicColorAvailable():boolean");
    }

    public static int getDefaultThemeOverlay(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public final DynamicColorsOptions dynamicColorsOptions;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        public DynamicColorsActivityLifecycleCallbacks(DynamicColorsOptions dynamicColorsOptions) {
            this.dynamicColorsOptions = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            DynamicColors.applyToActivityIfAvailable(activity, this.dynamicColorsOptions);
        }
    }

    public static float getSystemContrast(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return uiModeManager.getContrast();
    }
}
