package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: W5IC */
/* renamed from: l.ᩳ᩶, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18270 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Intent m42600(ActivityC1252 activityC1252) {
        Intent parentActivityIntent = activityC1252.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String m42602 = m42602((Context) activityC1252, activityC1252.getComponentName());
            if (m42602 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activityC1252, m42602);
            try {
                if (m42602((Context) activityC1252, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Intent m42601(ActivityC1252 activityC1252, ComponentName componentName) {
        String m42602 = m42602((Context) activityC1252, componentName);
        if (m42602 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m42602);
        if (m42602((Context) activityC1252, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42602(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
