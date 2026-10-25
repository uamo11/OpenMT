package com.tencent.open.web.security;

import android.content.Context;
import java.io.File;
import l.C22927;
import l.C8045;
import l.C9145;

/* compiled from: 51RR */
/* loaded from: classes.dex */
public class JniInterface {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f907;

    public static native boolean BackSpaceChar(boolean z, int i);

    public static native boolean clearAllPWD();

    public static native String d1(String str);

    public static native String d2(String str);

    public static native String getPWDKeyToMD5(String str);

    public static native boolean insetTextToArray(int i, String str, int i2);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m925() {
        if (f907) {
            return;
        }
        try {
            Context m51019 = C22927.m51019();
            if (m51019 == null) {
                C9145.m23518("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:" + C8045.f24802);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m51019.getFilesDir().toString());
            sb.append("/");
            String str = C8045.f24802;
            sb.append(str);
            File file = new File(sb.toString());
            if (!file.exists()) {
                C9145.m23518("openSDK_LOG.JniInterface", "-->fail, because so is not exists:" + str);
            } else {
                if (!m926(m51019, file)) {
                    C9145.m23518("openSDK_LOG.JniInterface", "-->fail, because checkMD5 fail:" + str);
                    return;
                }
                System.load(m51019.getFilesDir().toString() + "/" + str);
                f907 = true;
                StringBuilder sb2 = new StringBuilder("-->load lib success:");
                sb2.append(str);
                C9145.m23518("openSDK_LOG.JniInterface", sb2.toString());
            }
        } catch (Throwable th) {
            C9145.m23514("openSDK_LOG.JniInterface", "-->load lib error:" + C8045.f24802, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r7 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0069, code lost:
    
        if (r7 != null) goto L81;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m926(android.content.Context r7, java.io.File r8) {
        /*
            java.lang.String r0 = "openSDK_LOG.JniInterface"
            r1 = 0
            r2 = 0
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = l.C8045.f24803     // Catch: java.lang.Throwable -> L70
            java.io.InputStream r7 = r7.open(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = l.C6322.m17571(r7)     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L64
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L1b
            goto L64
        L1b:
            boolean r4 = r8.exists()     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto L22
            goto L3f
        L22:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2f
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = l.C6322.m17571(r4)     // Catch: java.lang.Throwable -> L2d
            r2 = r8
            goto L3a
        L2d:
            r8 = move-exception
            goto L31
        L2f:
            r8 = move-exception
            r4 = r2
        L31:
            java.lang.String r5 = "MD5Utils"
            java.lang.String r6 = "md5 file error"
            l.C9145.m23514(r5, r6, r8)     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L3f
        L3a:
            r4.close()     // Catch: java.lang.Throwable -> L3e
            goto L3f
        L3e:
        L3f:
            if (r2 == 0) goto L52
            boolean r8 = r2.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r8 == 0) goto L48
            goto L52
        L48:
            boolean r8 = r3.equals(r2)     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L51
            r7.close()     // Catch: java.io.IOException -> L51
        L51:
            return r8
        L52:
            java.lang.String r8 = "checkMD5 file md5 is null"
            l.C9145.m23518(r0, r8)     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L6c
        L59:
            r7.close()     // Catch: java.io.IOException -> L6c
            goto L6c
        L5d:
            r8 = move-exception
            if (r4 == 0) goto L63
            r4.close()     // Catch: java.lang.Throwable -> L63
        L63:
            throw r8     // Catch: java.lang.Throwable -> L6d
        L64:
            java.lang.String r8 = "checkMD5 assets md5 is null"
            l.C9145.m23518(r0, r8)     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L6c
            goto L59
        L6c:
            return r1
        L6d:
            r8 = move-exception
            r2 = r7
            goto L72
        L70:
            r7 = move-exception
            r8 = r7
        L72:
            java.lang.String r7 = "checkMD5 exception"
            l.C9145.m23514(r0, r7, r8)     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L7c
            r2.close()     // Catch: java.io.IOException -> L7c
        L7c:
            java.lang.String r7 = "checkMD5 return false"
            l.C9145.m23516(r0, r7)
            return r1
        L82:
            r7 = move-exception
            if (r2 == 0) goto L88
            r2.close()     // Catch: java.io.IOException -> L88
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.web.security.JniInterface.m926(android.content.Context, java.io.File):boolean");
    }
}
