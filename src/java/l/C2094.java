package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.io.File;

/* compiled from: 19BY */
/* renamed from: l.֫᩸ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2094 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final File f6976;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final boolean f6977;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C7549 f6978;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long f6979;

    static {
        f6977 = Build.VERSION.SDK_INT >= 29 && C4925.m14303().targetSdkVersion >= 29;
        f6976 = new File(C4925.m14322(), "term/bin");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7549 m6880() {
        PackageInfo packageInfo;
        C7549 c7549;
        C7549 c75492 = f6978;
        if (c75492 != null && c75492.m20275()) {
            return c75492;
        }
        if (SystemClock.uptimeMillis() - f6979 >= 5000) {
            f6979 = SystemClock.uptimeMillis();
            if (!f6977) {
                AbstractC15440 m36526 = C16293.f50117.m36526("term/version");
                File file = f6976;
                if (file.isDirectory() && m36526.mo23119()) {
                    try {
                        C12951 m36528 = m36526.m36528();
                        c7549 = new C7549(m36528.readInt(), m36528.m31506(), null, file);
                    } catch (Exception unused) {
                    }
                }
                c7549 = null;
            } else {
                try {
                    packageInfo = C4925.m14304("bin.mt.termex");
                } catch (PackageManager.NameNotFoundException unused2) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    c7549 = new C7549(packageInfo.versionCode, packageInfo.versionName, packageInfo.applicationInfo.sourceDir, new File(packageInfo.applicationInfo.nativeLibraryDir));
                }
                c7549 = null;
            }
            if (c7549 != null && c7549.m20275()) {
                f6978 = c7549;
                return c7549;
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m6881() {
        f6979 = 0L;
        f6978 = null;
    }
}
