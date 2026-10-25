package l;

import android.app.Activity;
import android.app.SharedElementCallback;

/* compiled from: U5Z7 */
/* renamed from: l.ۢ᩹, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9867 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24927(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24929(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24928(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }
}
