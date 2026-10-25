package l;

import android.app.Activity;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;

/* compiled from: U5Z7 */
/* renamed from: l.ۡ᩹, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9161 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23570(Activity activity) {
        return activity.isLaunchedFromBubble();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23571(Activity activity, String str) {
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }
}
