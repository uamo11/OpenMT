package l;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: D8R5 */
/* renamed from: l.᩷֫ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20566 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C6454();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f66242;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C20566(int i) {
        this.f66242 = (i & 2) != 0 ? i | 1 : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r5.hasCapability(16) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m47128(l.JobServiceC23387 r10) {
        /*
            r9 = this;
            int r0 = r9.f66242
            r1 = r0 & 1
            r2 = 16
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L4c
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r10.getSystemService(r1)
            r1.getClass()
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r5 = r1.getActiveNetworkInfo()
            if (r5 == 0) goto L49
            boolean r5 = r5.isConnected()
            if (r5 == 0) goto L49
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 >= r6) goto L28
            goto L3d
        L28:
            android.net.Network r5 = r1.getActiveNetwork()
            if (r5 != 0) goto L2f
            goto L49
        L2f:
            android.net.NetworkCapabilities r5 = r1.getNetworkCapabilities(r5)     // Catch: java.lang.SecurityException -> L3c
            if (r5 == 0) goto L49
            boolean r5 = r5.hasCapability(r2)     // Catch: java.lang.SecurityException -> L3c
            if (r5 == 0) goto L49
            goto L3d
        L3c:
        L3d:
            r5 = r0 & 2
            if (r5 == 0) goto L4c
            boolean r1 = r1.isActiveNetworkMetered()
            if (r1 == 0) goto L4c
            r1 = 2
            goto L4d
        L49:
            r1 = r0 & 3
            goto L4d
        L4c:
            r1 = 0
        L4d:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L6f
            android.content.IntentFilter r5 = new android.content.IntentFilter
            java.lang.String r7 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r7)
            android.content.Intent r5 = r10.registerReceiver(r6, r5)
            if (r5 != 0) goto L60
            goto L6d
        L60:
            java.lang.String r7 = "status"
            r8 = -1
            int r5 = r5.getIntExtra(r7, r8)
            if (r5 == r3) goto L6f
            r3 = 5
            if (r5 != r3) goto L6d
            goto L6f
        L6d:
            r1 = r1 | 8
        L6f:
            r3 = r0 & 4
            if (r3 == 0) goto L96
            java.lang.String r3 = "power"
            java.lang.Object r3 = r10.getSystemService(r3)
            r3.getClass()
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r5 < r7) goto L89
            boolean r3 = r3.isDeviceIdleMode()
            goto L92
        L89:
            boolean r3 = r3.isInteractive()
            if (r3 != 0) goto L91
            r3 = 1
            goto L92
        L91:
            r3 = 0
        L92:
            if (r3 != 0) goto L96
            r1 = r1 | 4
        L96:
            r0 = r0 & r2
            if (r0 == 0) goto L9b
            r0 = 1
            goto L9c
        L9b:
            r0 = 0
        L9c:
            if (r0 == 0) goto Lb0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.<init>(r2)
            android.content.Intent r10 = r10.registerReceiver(r6, r0)
            if (r10 != 0) goto Lac
            r4 = 1
        Lac:
            if (r4 != 0) goto Lb0
            r1 = r1 | 16
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20566.m47128(l.᩻֫ۧ):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20566.class == obj.getClass()) {
            if (this.f66242 == ((C20566) obj).f66242) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f66242;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66242);
    }
}
