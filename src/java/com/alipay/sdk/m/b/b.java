package com.alipay.sdk.m.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.alipay.sdk.m.a.a;
import com.alipay.sdk.m.y.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public com.alipay.sdk.m.a.a a = null;
    public String b = null;
    public String c = null;
    public final Object d = new Object();
    public ServiceConnection e = new a();

    /* compiled from: N673 */
    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.this.a = a.AbstractBinderC0001a.a(iBinder);
            synchronized (b.this.d) {
                b.this.d.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            b.this.a = null;
        }
    }

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.b.b$b, reason: collision with other inner class name */
    public class C0005b {
        public static final b a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
    }

    public boolean a(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return Build.VERSION.SDK_INT >= 28 ? packageInfo != null && packageInfo.getLongVersionCode() >= 1 : packageInfo != null && packageInfo.versionCode >= 1;
    }

    public final String b(Context context, String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.b)) {
            this.b = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.c)) {
            String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.b, 64).signatures;
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
                        str2 = sb.toString();
                    }
                } catch (NoSuchAlgorithmException unused2) {
                }
            }
            this.c = str2;
        }
        String a2 = ((a.AbstractBinderC0001a.C0002a) this.a).a(this.b, this.c, str);
        return TextUtils.isEmpty(a2) ? "" : a2;
    }

    public synchronized String a(Context context, String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.a == null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                if (context.bindService(intent, this.e, 1)) {
                    synchronized (this.d) {
                        try {
                            this.d.wait(c.a);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                if (this.a == null) {
                    return "";
                }
                try {
                    return b(context, str);
                } catch (RemoteException unused2) {
                    return "";
                }
            }
            try {
                return b(context, str);
            } catch (RemoteException unused3) {
                return "";
            }
        }
        throw new IllegalStateException("Cannot run on MainThread");
    }
}
