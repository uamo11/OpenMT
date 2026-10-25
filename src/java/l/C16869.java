package l;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: 19NA */
/* renamed from: l.ܽ᩶ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16869 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC11226 f51759 = new C2053();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39646(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39644(Context context) {
        m39645(context, new ExecutorC23282(), f51759, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m39645(android.content.Context r12, java.util.concurrent.Executor r13, l.InterfaceC11226 r14, boolean r15) {
        /*
            android.content.Context r0 = r12.getApplicationContext()
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r2.sourceDir
            r0.<init>(r2)
            java.lang.String r7 = r0.getName()
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            r2 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> La9
            java.io.File r9 = r12.getFilesDir()
            if (r15 != 0) goto L6f
            java.io.File r3 = new java.io.File
            java.lang.String r5 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r3.<init>(r9, r5)
            boolean r5 = r3.exists()
            if (r5 != 0) goto L38
            goto L64
        L38:
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.io.IOException -> L64
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.IOException -> L64
            r6.<init>(r3)     // Catch: java.io.IOException -> L64
            r5.<init>(r6)     // Catch: java.io.IOException -> L64
            long r10 = r5.readLong()     // Catch: java.lang.Throwable -> L5a
            r5.close()     // Catch: java.io.IOException -> L64
            long r5 = r0.lastUpdateTime
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 != 0) goto L51
            r3 = 1
            goto L52
        L51:
            r3 = 0
        L52:
            if (r3 == 0) goto L65
            r5 = 2
            r6 = 0
            r14.mo6738(r5, r6)
            goto L65
        L5a:
            r3 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r3.addSuppressed(r5)     // Catch: java.io.IOException -> L64
        L63:
            throw r3     // Catch: java.io.IOException -> L64
        L64:
            r3 = 0
        L65:
            if (r3 != 0) goto L68
            goto L6f
        L68:
            r12.getPackageName()
            l.C4170.m12611(r12, r2)
            goto La8
        L6f:
            r12.getPackageName()
            java.io.File r8 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r5 = "/data/misc/profiles/cur/0"
            r3.<init>(r5, r1)
            java.lang.String r1 = "primary.prof"
            r8.<init>(r3, r1)
            l.۫᩹ۧ r1 = new l.۫᩹ۧ
            r3 = r1
            r5 = r13
            r6 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r13 = r1.m30965()
            if (r13 != 0) goto L90
            r13 = 0
            goto La0
        L90:
            l.۫᩹ۧ r13 = r1.m30966()
            r13.m30967()
            boolean r13 = r13.m30968()
            if (r13 == 0) goto La0
            m39646(r0, r9)
        La0:
            if (r13 == 0) goto La5
            if (r15 == 0) goto La5
            r2 = 1
        La5:
            l.C4170.m12611(r12, r2)
        La8:
            return
        La9:
            r13 = move-exception
            r15 = 7
            r14.mo6738(r15, r13)
            l.C4170.m12611(r12, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16869.m39645(android.content.Context, java.util.concurrent.Executor, l.ۧ᩶ۧ, boolean):void");
    }
}
