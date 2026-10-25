package l;

import android.os.Build;

/* compiled from: UB1K */
/* renamed from: l.ۗܽ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3351 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13228 f10611;

    public C3351() {
        this.f10611 = Build.VERSION.SDK_INT >= 28 ? new C10407() : new C12523();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C13270 m10251(android.content.Context r9) {
        /*
            r8 = this;
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            l.C13746.m33055(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            l.۬ܽ֫ r2 = r8.f10611
            java.util.List r1 = r2.mo30724(r0, r1)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L38
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r2.mo30723(r3)
            if (r3 == 0) goto L1a
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L1a
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L1a
            goto L39
        L38:
            r3 = r4
        L39:
            if (r3 != 0) goto L3c
            goto L65
        L3c:
            java.lang.String r1 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            android.content.pm.Signature[] r0 = r2.mo26254(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            r2.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            int r5 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            r6 = 0
        L4b:
            if (r6 >= r5) goto L59
            r7 = r0[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            r2.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            int r6 = r6 + 1
            goto L4b
        L59:
            java.util.List r0 = java.util.Collections.singletonList(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            l.ۨ۫ r2 = new l.ۨ۫     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>(r1, r3, r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65
            goto L66
        L65:
            r2 = r4
        L66:
            if (r2 != 0) goto L69
            goto L6e
        L69:
            l.۬ᩳ֫ r4 = new l.۬ᩳ֫
            r4.<init>(r9, r2)
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3351.m10251(android.content.Context):l.۬ᩳ֫");
    }
}
