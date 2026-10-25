package l;

import android.content.BroadcastReceiver;

/* renamed from: l.᩹ܳ֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22337 extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003e, code lost:
    
        if (r0 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (android.text.TextUtils.equals(r6.getStringExtra("openIdPackage"), r5.getPackageName()) != false) goto L16;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L82
            if (r6 != 0) goto L6
            goto L82
        L6:
            java.lang.String r0 = "openIdNotifyFlag"
            r1 = 0
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r2 = "shouldUpdateId, notifyFlag : "
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2.concat(r3)
            r2 = 1
            if (r0 != r2) goto L2a
            java.lang.String r0 = "openIdPackage"
            java.lang.String r0 = r6.getStringExtra(r0)
            java.lang.String r5 = r5.getPackageName()
            boolean r5 = android.text.TextUtils.equals(r0, r5)
            if (r5 == 0) goto L41
            goto L40
        L2a:
            r2 = 2
            if (r0 != r2) goto L3e
            java.lang.String r0 = "openIdPackageList"
            java.util.ArrayList r0 = r6.getStringArrayListExtra(r0)
            if (r0 == 0) goto L41
            java.lang.String r5 = r5.getPackageName()
            boolean r1 = r0.contains(r5)
            goto L41
        L3e:
            if (r0 != 0) goto L41
        L40:
            r1 = 1
        L41:
            if (r1 != 0) goto L44
            goto L82
        L44:
            java.lang.String r5 = "openIdType"
            java.lang.String r5 = r6.getStringExtra(r5)
            l.᩶ܳ֨ r6 = l.C20221.m46454()
            java.lang.String r0 = "oaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L59
            l.֨ܳ֨ r5 = r6.f65413
            goto L7b
        L59:
            java.lang.String r0 = "vaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L64
            l.֨ܳ֨ r5 = r6.f65417
            goto L7b
        L64:
            java.lang.String r0 = "aaid"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L6f
            l.֨ܳ֨ r5 = r6.f65415
            goto L7b
        L6f:
            java.lang.String r0 = "udid"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L7a
            l.֨ܳ֨ r5 = r6.f65412
            goto L7b
        L7a:
            r5 = 0
        L7b:
            if (r5 != 0) goto L7e
            goto L82
        L7e:
            r0 = 0
            r5.f4216 = r0
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22337.onReceive(android.content.Context, android.content.Intent):void");
    }
}
