package l;

import android.content.Context;
import android.content.Intent;

/* compiled from: G54L */
/* renamed from: l.ۙᩴܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4835 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m14079(android.content.Context r8) {
        /*
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r0 = l.C3424.m10395(r0)
            if (r0 == 0) goto L16
            r1 = 1
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Exception -> L12
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L12
            goto L17
        L12:
            r0 = move-exception
            l.C3939.m11987(r0)
        L16:
            r0 = -1
        L17:
            r1 = 5
            java.lang.String r2 = "intent is not available!"
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r0 != r1) goto L47
            java.lang.String r0 = r8.getPackageName()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r1.<init>(r4)
            java.lang.String r4 = "package"
            r5 = 0
            android.net.Uri r0 = android.net.Uri.fromParts(r4, r0, r5)
            r1.setData(r0)
            r1.setFlags(r3)
            boolean r0 = m14080(r8, r1)
            if (r0 == 0) goto L41
            r8.startActivity(r1)
            goto Ld6
        L41:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r2)
            throw r8
        L47:
            r1 = 6
            java.lang.String r4 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity"
            java.lang.String r5 = "extra_pkgname"
            java.lang.String r6 = "com.miui.securitycenter"
            java.lang.String r7 = "miui.intent.action.APP_PERM_EDITOR"
            if (r0 != r1) goto L74
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r7)
            r0.setClassName(r6, r4)
            java.lang.String r1 = r8.getPackageName()
            r0.putExtra(r5, r1)
            r0.setFlags(r3)
            boolean r1 = m14080(r8, r0)
            if (r1 == 0) goto L6e
            r8.startActivity(r0)
            goto Ld6
        L6e:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r2)
            throw r8
        L74:
            r1 = 7
            if (r0 != r1) goto L99
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r7)
            r0.setClassName(r6, r4)
            java.lang.String r1 = r8.getPackageName()
            r0.putExtra(r5, r1)
            r0.setFlags(r3)
            boolean r1 = m14080(r8, r0)
            if (r1 == 0) goto L93
            r8.startActivity(r0)
            goto Ld6
        L93:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r2)
            throw r8
        L99:
            r1 = 8
            if (r0 != r1) goto Ldd
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r7)
            java.lang.String r1 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            r0.setClassName(r6, r1)
            java.lang.String r1 = r8.getPackageName()
            r0.putExtra(r5, r1)
            r0.setFlags(r3)
            boolean r1 = m14080(r8, r0)
            if (r1 == 0) goto Lbb
            r8.startActivity(r0)
            goto Ld6
        Lbb:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r7)
            r0.setPackage(r6)
            java.lang.String r1 = r8.getPackageName()
            r0.putExtra(r5, r1)
            r0.setFlags(r3)
            boolean r1 = m14080(r8, r0)
            if (r1 == 0) goto Ld7
            r8.startActivity(r0)
        Ld6:
            return
        Ld7:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r2)
            throw r8
        Ldd:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported MIUI version: "
            java.lang.String r0 = l.C19370.m44628(r0, r1)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4835.m14079(android.content.Context):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14080(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
