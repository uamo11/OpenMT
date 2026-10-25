package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import com.alipay.sdk.m.m.b;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.o;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: 51RR */
/* renamed from: l.ᩳ᩹ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18338 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f56991 = "";

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f56992 = "";

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m42734(String str) {
        String[] strArr;
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split(a.p)) {
                    int indexOf = str2.indexOf("=");
                    if (indexOf == -1) {
                        strArr = new String[]{str2};
                    } else {
                        strArr = new String[]{str2.substring(0, indexOf), str2.substring(indexOf + 1)};
                    }
                    if (strArr.length == 2) {
                        bundle.putString(C2912.decode(strArr[0]), C2912.decode(strArr[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m42737(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split(a.p)) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    try {
                        split[0] = C2912.decode(split[0]);
                        split[1] = C2912.decode(split[1]);
                    } catch (Exception unused) {
                    }
                    try {
                        jSONObject.put(split[0], split[1]);
                    } catch (JSONException e) {
                        C9145.m23516("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m42741(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle m42734 = m42734(url.getQuery());
            m42734.putAll(m42734(url.getRef()));
            return m42734;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m42745(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject m42737 = m42737((JSONObject) null, url.getQuery());
            m42737(m42737, url.getRef());
            return m42737;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m42748(String str) {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + l.d;
        }
        return new JSONObject(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m42746(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (C7733.m20709(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String m42736 = m42736(messageDigest.digest());
                    messageDigest.reset();
                    if (m42736.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e) {
                    C9145.m23516("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42740(Context context, String str) {
        boolean z;
        try {
            z = m42746(context);
        } catch (Exception unused) {
            z = false;
        }
        try {
            if (z) {
                m42738(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
            } else {
                m42738(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
            }
            return true;
        } catch (Exception unused2) {
            if (z) {
                try {
                    try {
                        try {
                            m42738(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                            return true;
                        } catch (Exception unused3) {
                            return false;
                        }
                    } catch (Exception unused4) {
                        m42738(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                        return true;
                    }
                } catch (Exception unused5) {
                    m42738(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                    return true;
                }
            }
            try {
                try {
                    m42738(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                    return true;
                } catch (Exception unused6) {
                    return false;
                }
            } catch (Exception unused7) {
                m42738(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                return true;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42738(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42736(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            String num = Integer.toString(b & 255, 16);
            if (num.length() == 1) {
                num = "0".concat(num);
            }
            sb.append(num);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m42739(android.content.Context r6) {
        /*
            r0 = 1
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            java.lang.String r4 = "openSDK_LOG.Util"
            if (r2 < r3) goto L1b
            int r1 = r6.checkSelfPermission(r1)     // Catch: java.lang.Exception -> L15
            if (r1 == 0) goto L1b
            return r0
        L15:
            r1 = move-exception
            java.lang.String r2 = "checkSelfPermission exception"
            l.C9145.m23514(r4, r2, r1)
        L1b:
            r1 = 0
            java.lang.String r2 = "connectivity"
            java.lang.Object r6 = r6.getSystemService(r2)     // Catch: java.lang.Throwable -> L25
            android.net.ConnectivityManager r6 = (android.net.ConnectivityManager) r6     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r6 = move-exception
            java.lang.String r2 = "Util.isNetWorkAvailable getConnectivity has exception"
            l.C9145.m23514(r4, r2, r6)
            r6 = r1
        L2c:
            if (r6 != 0) goto L2f
            return r0
        L2f:
            r2 = 0
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L66
            if (r5 < r3) goto L57
            android.net.Network r3 = r6.getActiveNetwork()     // Catch: java.lang.Throwable -> L66
            if (r3 != 0) goto L3b
            return r2
        L3b:
            android.net.NetworkCapabilities r3 = r6.getNetworkCapabilities(r3)     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L55
            boolean r5 = r3.hasTransport(r0)     // Catch: java.lang.Throwable -> L66
            if (r5 != 0) goto L56
            boolean r5 = r3.hasTransport(r2)     // Catch: java.lang.Throwable -> L66
            if (r5 != 0) goto L56
            r5 = 3
            boolean r6 = r3.hasTransport(r5)     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            return r0
        L57:
            android.net.NetworkInfo r3 = r6.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L64
            boolean r6 = r3.isConnected()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L64
            goto L65
        L64:
            r0 = 0
        L65:
            return r0
        L66:
            android.net.NetworkInfo[] r1 = r6.getAllNetworkInfo()     // Catch: java.lang.Exception -> L6b
            goto L71
        L6b:
            r6 = move-exception
            java.lang.String r3 = "Util.isNetWorkAvailable has exception: "
            l.C9145.m23514(r4, r3, r6)
        L71:
            if (r1 == 0) goto L87
            int r6 = r1.length
            if (r6 != 0) goto L77
            goto L87
        L77:
            int r6 = r1.length
            r3 = 0
        L79:
            if (r3 >= r6) goto L87
            r4 = r1[r3]
            boolean r4 = r4.isConnectedOrConnecting()
            if (r4 == 0) goto L84
            return r0
        L84:
            int r3 = r3 + 1
            goto L79
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18338.m42739(android.content.Context):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m42735(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString(b.D0, str5);
        bundle.putString("type", str7);
        bundle.putString("login_status", str8);
        bundle.putString("need_user_auth", str9);
        bundle.putString("to_uin", str10);
        bundle.putString("call_source", str11);
        bundle.putString("to_type", str12);
        bundle.putString("platform", "1");
        bundle.putString(o.c, str6);
        return bundle;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42743(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            f56992 = str2;
            f56991 = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f56992;
            str3.substring(str3.lastIndexOf(46) + 1, f56992.length());
        } catch (PackageManager.NameNotFoundException e) {
            C9145.m23516("openSDK_LOG.Util", "getPackageInfo has exception: " + e.getMessage());
        } catch (Exception e2) {
            C9145.m23516("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42742(Context context) {
        if (context == null) {
            return "";
        }
        m42743(context, "com.tencent.mobileqq");
        return f56992;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m42744(Context context, String str) {
        if (context == null) {
            return "";
        }
        m42743(context, str);
        return f56991;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m42747(String str) {
        try {
            return str.getBytes(a.D);
        } catch (UnsupportedEncodingException e) {
            C9145.m23514("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e);
            return new byte[0];
        }
    }
}
