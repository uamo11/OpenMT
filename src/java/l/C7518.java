package l;

import android.content.Context;
import android.location.LocationManager;

/* compiled from: G5FQ */
/* renamed from: l.۟ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7518 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7518 f23134;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f23135;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LocationManager f23136;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13867 f23137 = new C13867();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7518 m20159(Context context) {
        if (f23134 == null) {
            Context applicationContext = context.getApplicationContext();
            f23134 = new C7518(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f23134;
    }

    public C7518(Context context, LocationManager locationManager) {
        this.f23135 = context;
        this.f23136 = locationManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m20160() {
        /*
            r21 = this;
            r0 = r21
            l.ܰܳ r1 = r0.f23137
            long r2 = r1.f41347
            long r4 = java.lang.System.currentTimeMillis()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L11
            boolean r1 = r1.f41346
            return r1
        L11:
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            android.content.Context r3 = r0.f23135
            int r2 = l.C12171.m29635(r3, r2)
            android.location.LocationManager r4 = r0.f23136
            r5 = 0
            if (r2 != 0) goto L2b
            java.lang.String r2 = "network"
            boolean r6 = r4.isProviderEnabled(r2)     // Catch: java.lang.Exception -> L2b
            if (r6 == 0) goto L2b
            android.location.Location r2 = r4.getLastKnownLocation(r2)     // Catch: java.lang.Exception -> L2b
            goto L2c
        L2b:
            r2 = r5
        L2c:
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            int r3 = l.C12171.m29635(r3, r6)
            if (r3 != 0) goto L42
            java.lang.String r3 = "gps"
            boolean r6 = r4.isProviderEnabled(r3)     // Catch: java.lang.Exception -> L41
            if (r6 == 0) goto L42
            android.location.Location r5 = r4.getLastKnownLocation(r3)     // Catch: java.lang.Exception -> L41
            goto L42
        L41:
        L42:
            if (r5 == 0) goto L53
            if (r2 == 0) goto L53
            long r3 = r5.getTime()
            long r6 = r2.getTime()
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L56
            goto L55
        L53:
            if (r5 == 0) goto L56
        L55:
            r2 = r5
        L56:
            r3 = 0
            r4 = 1
            if (r2 == 0) goto Lc6
            long r12 = java.lang.System.currentTimeMillis()
            l.᩺ܳ r14 = l.C23040.m51208()
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r10 = r12 - r15
            double r6 = r2.getLatitude()
            double r8 = r2.getLongitude()
            r5 = r14
            r5.m51209(r6, r8, r10)
            double r6 = r2.getLatitude()
            double r8 = r2.getLongitude()
            r10 = r12
            r5.m51209(r6, r8, r10)
            int r5 = r14.f74145
            if (r5 != r4) goto L84
            r3 = 1
        L84:
            long r10 = r14.f74146
            long r8 = r14.f74147
            long r15 = r15 + r12
            double r6 = r2.getLatitude()
            double r17 = r2.getLongitude()
            r5 = r14
            r19 = r8
            r8 = r17
            r17 = r10
            r10 = r15
            r5.m51209(r6, r8, r10)
            long r10 = r14.f74146
            r4 = -1
            int r2 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r2 == 0) goto Lbc
            int r2 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r2 != 0) goto La9
            goto Lbc
        La9:
            int r2 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r2 <= 0) goto Lae
            goto Lb7
        Lae:
            int r2 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r2 <= 0) goto Lb5
            r10 = r19
            goto Lb7
        Lb5:
            r10 = r17
        Lb7:
            r4 = 60000(0xea60, double:2.9644E-319)
            long r10 = r10 + r4
            goto Lc1
        Lbc:
            r4 = 43200000(0x2932e00, double:2.1343636E-316)
            long r10 = r12 + r4
        Lc1:
            r1.f41346 = r3
            r1.f41347 = r10
            return r3
        Lc6:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 11
            int r1 = r1.get(r2)
            r2 = 6
            if (r1 < r2) goto Ld9
            r2 = 22
            if (r1 < r2) goto Ld8
            goto Ld9
        Ld8:
            return r3
        Ld9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7518.m20160():boolean");
    }
}
