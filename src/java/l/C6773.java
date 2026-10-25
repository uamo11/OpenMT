package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: 857F */
/* renamed from: l.ۜ۬, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6773 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21030 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1315 f21031;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C19474 f21032;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f21032 = new C2540();
        } else if (i >= 28) {
            f21032 = new C15944();
        } else if (i >= 26) {
            f21032 = new C8890();
        } else if (i >= 24 && C9596.m24532()) {
            f21032 = new C9596();
        } else {
            f21032 = new C20885();
        }
        f21031 = new C1315(16);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Typeface m18420(Resources resources, int i, String str, int i2, int i3) {
        return (Typeface) f21031.m4553(m18419(resources, i, str, i2, i3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18419(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r2.equals(r4) == false) goto L15;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m18417(android.content.Context r11, l.InterfaceC20597 r12, android.content.res.Resources r13, int r14, java.lang.String r15, int r16, int r17, l.AbstractC14951 r18, boolean r19) {
        /*
            r0 = r12
            r1 = r18
            boolean r2 = r0 instanceof l.C15656
            r3 = 0
            if (r2 == 0) goto L64
            l.ܺۗ r0 = (l.C15656) r0
            java.lang.String r2 = r0.m36854()
            r4 = 0
            if (r2 == 0) goto L2b
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L18
            goto L2b
        L18:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r4)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r5, r4)
            if (r2 == 0) goto L2b
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L2b
            goto L2c
        L2b:
            r2 = r3
        L2c:
            if (r2 == 0) goto L34
            if (r1 == 0) goto L33
            r1.callbackSuccessAsync(r2, r3)
        L33:
            return r2
        L34:
            if (r19 == 0) goto L3d
            int r2 = r0.m36852()
            if (r2 != 0) goto L42
            goto L3f
        L3d:
            if (r1 != 0) goto L42
        L3f:
            r2 = 1
            r7 = 1
            goto L44
        L42:
            r2 = 0
            r7 = 0
        L44:
            if (r19 == 0) goto L4c
            int r2 = r0.m36855()
            r8 = r2
            goto L4e
        L4c:
            r2 = -1
            r8 = -1
        L4e:
            android.os.Handler r9 = l.AbstractC14951.m35415(r3)
            l.᩻۬ r10 = new l.᩻۬
            r10.<init>(r1)
            l.ۨ۫ r5 = r0.m36853()
            r4 = r11
            r6 = r17
            android.graphics.Typeface r0 = l.C23625.m52116(r4, r5, r6, r7, r8, r9, r10)
            r5 = r13
            goto L7c
        L64:
            l.᩵۬ r2 = l.C6773.f21032
            l.ۢۗ r0 = (l.C9308) r0
            r4 = r11
            r5 = r13
            r6 = r17
            android.graphics.Typeface r0 = r2.mo8053(r11, r0, r13, r6)
            if (r1 == 0) goto L7c
            if (r0 == 0) goto L78
            r1.callbackSuccessAsync(r0, r3)
            goto L7c
        L78:
            r2 = -3
            r1.callbackFailAsync(r2, r3)
        L7c:
            if (r0 == 0) goto L87
            l.֨᩵ r1 = l.C6773.f21031
            java.lang.String r2 = m18419(r13, r14, r15, r16, r17)
            r1.m4554(r2, r0)
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6773.m18417(android.content.Context, l.᩷ۗ, android.content.res.Resources, int, java.lang.String, int, int, l.ܶۗ, boolean):android.graphics.Typeface");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m18416(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface mo8051 = f21032.mo8051(context, resources, i, str, i3);
        if (mo8051 != null) {
            f21031.m4554(m18419(resources, i, str, i2, i3), mo8051);
        }
        return mo8051;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Typeface m18418(Context context, C17275[] c17275Arr, int i) {
        return f21032.mo8054(context, c17275Arr, i);
    }
}
