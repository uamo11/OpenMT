package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import com.google.android.material.resources.MaterialAttributes;
import l.C14533;
import l.C15472;
import l.C20094;
import l.C8020;

/* loaded from: classes.dex */
public class MotionUtils {
    public static final String EASING_TYPE_CUBIC_BEZIER = "cubic-bezier";
    public static final String EASING_TYPE_FORMAT_END = ")";
    public static final String EASING_TYPE_FORMAT_START = "(";
    public static final String EASING_TYPE_PATH = "path";

    public static int resolveThemeDuration(Context context, int i, int i2) {
        return MaterialAttributes.resolveInteger(context, i, i2);
    }

    public static TimeInterpolator resolveThemeInterpolator(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (isLegacyEasingAttribute(valueOf)) {
            return getLegacyThemeInterpolator(valueOf);
        }
        return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    public static TimeInterpolator getLegacyThemeInterpolator(String str) {
        if (!isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER)) {
            if (isLegacyEasingType(str, EASING_TYPE_PATH)) {
                return C8020.m21342(C14533.m34681(getLegacyEasingContent(str, EASING_TYPE_PATH)));
            }
            throw new IllegalArgumentException(C20094.m46315("Invalid motion easing type: ", str));
        }
        String[] split = getLegacyEasingContent(str, EASING_TYPE_CUBIC_BEZIER).split(",");
        if (split.length == 4) {
            return C8020.m21341(getLegacyControlPoint(split, 0), getLegacyControlPoint(split, 1), getLegacyControlPoint(split, 2), getLegacyControlPoint(split, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    public static boolean isLegacyEasingAttribute(String str) {
        return isLegacyEasingType(str, EASING_TYPE_CUBIC_BEZIER) || isLegacyEasingType(str, EASING_TYPE_PATH);
    }

    public static boolean isLegacyEasingType(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(EASING_TYPE_FORMAT_START);
        return str.startsWith(sb.toString()) && str.endsWith(EASING_TYPE_FORMAT_END);
    }

    public static String getLegacyEasingContent(String str, String str2) {
        return C15472.m36561(1, str2.length() + 1, str);
    }

    public static float getLegacyControlPoint(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }
}
