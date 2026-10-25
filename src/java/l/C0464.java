package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: 0BLU */
/* renamed from: l.֡ܳ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0464 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC5404 f2028 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f2029 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f2030 = null;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f2032 = new Object();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ServiceConnectionC18810 f2031 = new ServiceConnectionC18810(this);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:
    
        if (r6.versionCode >= 1) goto L14;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2055(android.content.Context r6) {
        /*
            r0 = 0
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            java.lang.String r1 = "com.heytap.openid"
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            r2 = 28
            r3 = 1
            if (r1 < r2) goto L1f
            if (r6 == 0) goto L26
            long r1 = r6.getLongVersionCode()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            r4 = 1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L25
        L1f:
            if (r6 == 0) goto L26
            int r6 = r6.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L26
            if (r6 < r3) goto L26
        L25:
            return r3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0464.m2055(android.content.Context):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m2056(Context context) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f2029)) {
            this.f2029 = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f2030)) {
            String str = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f2029, 64).signatures;
            } catch (PackageManager.NameNotFoundException unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : digest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        str = sb.toString();
                    }
                } catch (NoSuchAlgorithmException unused2) {
                }
            }
            this.f2030 = str;
        }
        InterfaceC5404 interfaceC5404 = this.f2028;
        String str2 = this.f2029;
        String str3 = this.f2030;
        C15986 c15986 = (C15986) interfaceC5404;
        c15986.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString("OUID");
            c15986.f49331.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return TextUtils.isEmpty(readString) ? "" : readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
