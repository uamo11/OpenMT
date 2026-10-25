package l;

import android.app.AppOpsManager;
import android.content.Context;

/* compiled from: X4NC */
/* renamed from: l.᩸᩹, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21861 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49248(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m49247(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49246(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m49249(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }
}
