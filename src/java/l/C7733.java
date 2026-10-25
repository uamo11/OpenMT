package l;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: 51RR */
/* renamed from: l.۟᩸ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7733 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f23932 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC10942 f23933 = new ConcurrentMapC10942();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20711(int i) {
        if (i == 10103) {
            return "shareToQQ";
        }
        if (i == 10104) {
            return "shareToQzone";
        }
        if (i == 10105) {
            return "addToQQFavorites";
        }
        if (i == 10106) {
            return "sendToMyComputer";
        }
        if (i == 10107) {
            return "shareToTroopBar";
        }
        if (i == 11101) {
            return "action_login";
        }
        if (i == 10100) {
            return "action_request";
        }
        if (i != 10114) {
            return null;
        }
        return "action_common_channel";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20714(Context context, String str) {
        String m20710 = m20710();
        if (context != null && str != null && m20710 != null && !"com.tencent.mobileqq".equals(str)) {
            "com.tencent.tim".equals(str);
        }
        PackageInfo m20718 = m20718(context, str);
        if (m20718 == null) {
            C9145.m23516("openSDK_LOG.SystemUtils", "getAppVersionName return null. package= " + str);
            return null;
        }
        return m20718.versionName;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m20718(Context context, String str) {
        if (context == null || str == null) {
            return null;
        }
        synchronized (C7733.class) {
            ConcurrentMapC10942 concurrentMapC10942 = f23933;
            if (concurrentMapC10942.containsKey(str)) {
                C20951 c20951 = (C20951) concurrentMapC10942.get(str);
                if (c20951 == null) {
                    C9145.m23516("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper is null");
                    return null;
                }
                PackageInfo packageInfo = c20951.f67721;
                if (packageInfo == null) {
                    C9145.m23516("openSDK_LOG.SystemUtils", "getTargetPackageInfo wrapper packageInfo is null");
                }
                return packageInfo;
            }
            PackageInfo m20720 = m20720(context, str);
            concurrentMapC10942.put(str, new C20951(m20720));
            return m20720;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m20720(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                C9145.m23516("openSDK_LOG.SystemUtils", "realGetPackageInfo null. packageName= " + str);
            }
            return packageInfo;
        } catch (Exception e) {
            if (e instanceof PackageManager.NameNotFoundException) {
                C9145.m23516("openSDK_LOG.SystemUtils", "realGetPackageInfo NameNotFoundException. packageName= " + str);
                return null;
            }
            C9145.m23514("openSDK_LOG.SystemUtils", "realGetPackageInfo Exception. packageName= " + str, e);
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20709(String str, String str2) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (split.length > i) {
            return 1;
        }
        return split2.length > i ? -1 : 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20717(Context context, Intent intent) {
        boolean z = false;
        if (context != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                C9145.m23518("openSDK_LOG.SystemUtils", "isAgentActivityExist? component null");
                return false;
            }
            String packageName = component.getPackageName();
            String m20714 = m20714(context, packageName);
            if (m20714 != null && !m20714.isEmpty()) {
                z = true;
            }
            C9145.m23518("openSDK_LOG.SystemUtils", "isAgentActivityExist? packageName = " + packageName + ", appVersionName= " + m20714);
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20713(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        try {
            return applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.SystemUtils", "getAppName exception", th);
            try {
                int i = applicationInfo.labelRes;
                return i <= 0 ? applicationInfo.nonLocalizedLabel.toString() : context.getString(i);
            } catch (Throwable th2) {
                C9145.m23514("openSDK_LOG.SystemUtils", "getAppName getLabel exception", th2);
                return "";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m20716(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "-->extractSecureLib, libName: "
            java.lang.String r0 = r0.concat(r10)
            java.lang.String r1 = "openSDK_LOG.SystemUtils"
            l.C9145.m23518(r1, r0)
            android.content.Context r0 = l.C22927.m51019()
            if (r0 != 0) goto L17
            java.lang.String r10 = "-->extractSecureLib, global context is null. "
            l.C9145.m23518(r1, r10)
            return
        L17:
            java.lang.String r2 = "secure_lib"
            r3 = 0
            android.content.SharedPreferences r2 = r0.getSharedPreferences(r2, r3)
            java.io.File r4 = new java.io.File
            java.io.File r5 = r0.getFilesDir()
            r4.<init>(r5, r11)
            boolean r5 = r4.exists()
            r6 = 6
            java.lang.String r7 = "version"
            if (r5 != 0) goto L40
            java.io.File r5 = r4.getParentFile()
            if (r5 == 0) goto L58
            boolean r5 = r5.mkdirs()
            if (r5 == 0) goto L58
            r4.createNewFile()     // Catch: java.io.IOException -> L58
            goto L58
        L40:
            int r4 = r2.getInt(r7, r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "-->extractSecureLib, libVersion: 6 | oldVersion: "
            r5.<init>(r8)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            l.C9145.m23518(r1, r5)
            if (r6 != r4) goto L58
            goto La5
        L58:
            r4 = 0
            android.content.res.AssetManager r5 = r0.getAssets()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L91
            java.io.InputStream r10 = r5.open(r10)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L91
            java.io.FileOutputStream r11 = r0.openFileOutput(r11, r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L88
            m20715(r10, r11)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            android.content.SharedPreferences$Editor r0 = r2.edit()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            r0.putInt(r7, r6)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            r0.commit()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            r10.close()     // Catch: java.io.IOException -> L76
            goto L77
        L76:
        L77:
            if (r11 == 0) goto La5
            r11.close()     // Catch: java.io.IOException -> La5
            goto La5
        L7d:
            r0 = move-exception
            r4 = r11
            goto L84
        L80:
            r0 = move-exception
            r4 = r11
            goto L89
        L83:
            r0 = move-exception
        L84:
            r9 = r4
            r4 = r10
            r10 = r9
            goto La8
        L88:
            r0 = move-exception
        L89:
            r9 = r4
            r4 = r10
            r10 = r9
            goto L94
        L8d:
            r10 = move-exception
            r0 = r10
            r10 = r4
            goto La8
        L91:
            r10 = move-exception
            r0 = r10
            r10 = r4
        L94:
            java.lang.String r11 = "-->extractSecureLib, when copy lib execption."
            l.C9145.m23514(r1, r11, r0)     // Catch: java.lang.Throwable -> La6
            if (r4 == 0) goto La0
            r4.close()     // Catch: java.io.IOException -> L9f
            goto La0
        L9f:
        La0:
            if (r10 == 0) goto La5
            r10.close()     // Catch: java.io.IOException -> La5
        La5:
            return
        La6:
            r11 = move-exception
            r0 = r11
        La8:
            if (r4 == 0) goto Laf
            r4.close()     // Catch: java.io.IOException -> Lae
            goto Laf
        Lae:
        Laf:
            if (r10 == 0) goto Lb4
            r10.close()     // Catch: java.io.IOException -> Lb4
        Lb4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7733.m20716(java.lang.String, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20715(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                j += read;
            } else {
                C9145.m23518("openSDK_LOG.SystemUtils", "-->copy, copyed size is: " + j);
                return;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m20719(Context context) {
        m20710();
        boolean z = m20718(context, "com.tencent.mobileqq") != null;
        C9145.m23518("openSDK_LOG.SystemUtils", "isQQInstalled " + z);
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20712(Activity activity) {
        try {
            ApplicationInfo applicationInfo = activity.getPackageManager().getApplicationInfo(activity.getApplicationContext().getPackageName(), 128);
            C9145.m23518("openSDK_LOG.SystemUtils", "apkPath=" + applicationInfo.sourceDir);
            return applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e) {
            C9145.m23514("openSDK_LOG.SystemUtils", "NameNotFoundException", e);
            return null;
        } catch (Exception e2) {
            C9145.m23514("openSDK_LOG.SystemUtils", "Exception", e2);
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20710() {
        String m28816 = C11778.m28816();
        if (m28816 != null && !m28816.isEmpty()) {
            return m28816;
        }
        C9145.m23516("openSDK_LOG.SystemUtils", "getAppId error: " + m28816);
        return m28816;
    }
}
