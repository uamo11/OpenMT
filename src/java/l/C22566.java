package l;

import android.app.AppOpsManager;
import android.content.Context;

/* compiled from: X4NC */
/* renamed from: l.᩹᩹, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22566 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AppOpsManager m50555(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50553(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50554(Context context) {
        return context.getOpPackageName();
    }
}
