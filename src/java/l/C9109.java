package l;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: D9O0 */
/* renamed from: l.ۡ᩶ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9109 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PackageInfo m23475(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
