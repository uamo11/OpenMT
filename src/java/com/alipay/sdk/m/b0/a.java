package com.alipay.sdk.m.b0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alipay.sdk.m.p.d;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.j;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static final String e = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
    public static final String f = "AES/GCM/NoPadding";
    public static final String g = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkzi87lcyX1t/OSjlmjmj\nUFTAb0Y0wPZ79j10sjVrDtV+lMZXz/hOalITFyXRpmS8g8I1H3AlhihQQsierIFa\nQj5omUsXhzvNO+4DorkMJ14n1o1sfL0iOLTrzydghuUpyspj0M8v5bJTBbLv8DGM\nreKtJ8sbIYC5aj8pAdxn+YTnZ4Rhp/pNRbmIAlxs4Btu3whJt/RTfEASgsDRaTgO\nr9Rlj2YDiyEM4T3d0LsLjNed7B0Ogulzj6OzvHj+foIyb+YEEn6C5F9r+uNY2l2i\nYlHfaizd1HKfISrcAseJu6lGKRP0I3mv538Twqg1u0DFV6waQ9gwgOhq4ORCiNpd\nIQIDAQAB";
    public WeakReference a;
    public WeakReference b;
    public WeakReference c;
    public String d = j.a.a;

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.b0.a$a, reason: collision with other inner class name */
    public class RunnableC0006a implements Runnable {
        public final /* synthetic */ WebView a;
        public final /* synthetic */ String b;

        /* compiled from: N673 */
        /* renamed from: com.alipay.sdk.m.b0.a$a$a, reason: collision with other inner class name */
        public class C0007a implements ValueCallback {
            public C0007a() {
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }

        public RunnableC0006a(WebView webView, String str) {
            this.a = webView;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.evaluateJavascript(this.b, new C0007a());
        }
    }

    /* compiled from: N673 */
    public class b extends ConnectivityManager.NetworkCallback {
        public final /* synthetic */ ConnectivityManager a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ String e;

        /* compiled from: N673 */
        /* renamed from: com.alipay.sdk.m.b0.a$b$a, reason: collision with other inner class name */
        public class RunnableC0008a implements Runnable {
            public final /* synthetic */ ConnectivityManager.NetworkCallback a;

            public RunnableC0008a(ConnectivityManager.NetworkCallback networkCallback) {
                this.a = networkCallback;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.a.unregisterNetworkCallback(this.a);
            }
        }

        public b(ConnectivityManager connectivityManager, String str, String str2, Map map, String str3) {
            this.a = connectivityManager;
            this.b = str;
            this.c = str2;
            this.d = map;
            this.e = str3;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge checkNetworkAndRequest onAvailable");
            try {
                if (this.a.getNetworkCapabilities(network).hasTransport(0)) {
                    a.this.a(network, this.b, this.c, this.d, this.e, new RunnableC0008a(this));
                } else {
                    g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge sendNetworkByWifiBridge net error ");
                }
            } catch (Throwable th) {
                g.a(th);
            }
        }
    }

    /* compiled from: N673 */
    public class c implements Runnable {
        public final /* synthetic */ Network a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Runnable f;

        public c(Network network, String str, String str2, Map map, String str3, Runnable runnable) {
            this.a = network;
            this.b = str;
            this.c = str2;
            this.d = map;
            this.e = str3;
            this.f = runnable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c1 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #8 {all -> 0x00ec, blocks: (B:45:0x00b2, B:47:0x00c1), top: B:44:0x00b2 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.b0.a.c.run():void");
        }
    }

    public a(Context context, WebView webView, com.alipay.sdk.m.w.a aVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = new WeakReference(context);
        this.b = new WeakReference(webView);
        this.c = new WeakReference(aVar);
    }

    public final void b(String str) {
        g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge sendCallbackForSendNetwork:" + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(e.m, str);
            jSONObject.put("netType", this.d);
        } catch (Throwable th) {
            g.a(th);
        }
        c("window.receiveNetworkSwitch(" + jSONObject + MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public final void c(String str) {
        g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge sendWebCallback: " + str);
        WebView webView = (WebView) this.b.get();
        if (webView == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0006a(webView, str));
    }

    @JavascriptInterface
    public int getMobileOperator(String str) {
        g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge getMobileOperator params: " + str);
        Context context = (Context) this.a.get();
        if (context == null) {
            return -3;
        }
        try {
            String a = a(context);
            if (!TextUtils.equals(a, "46000") && !TextUtils.equals(a, "46002") && !TextUtils.equals(a, "46007") && !TextUtils.equals(a, "46004")) {
                if (!TextUtils.equals(a, "46003") && !TextUtils.equals(a, "46005") && !TextUtils.equals(a, "46011")) {
                    if (TextUtils.equals(a, "46001") || TextUtils.equals(a, "46006")) {
                        return 3;
                    }
                    return TextUtils.equals(a, "46009") ? 3 : -3;
                }
                return 2;
            }
            return 1;
        } catch (Throwable th) {
            g.a(th);
            return -3;
        }
    }

    @JavascriptInterface
    public void sendNetworkByWifiBridge(String str) {
        g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge sendNetworkSwitch params: " + str);
        if (TextUtils.isEmpty(str) || ((Context) this.a.get()) == null) {
            return;
        }
        this.d = j.a.a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(e.s);
            String string2 = jSONObject.getString("url");
            String string3 = jSONObject.getString("headers");
            String string4 = jSONObject.getString("params");
            HashMap hashMap = new HashMap();
            JSONObject jSONObject2 = new JSONObject(string3);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.optString(next, ""));
            }
            a(hashMap);
            a(string2, string, hashMap, string4);
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public final String a(Context context) {
        if (context == null) {
            return "";
        }
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge getMobileOperator: " + simOperator);
        return simOperator;
    }

    public final void a(String str, String str2, Map map, String str3) {
        g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge checkNetworkAndRequest");
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new b(connectivityManager, str, str2, map, str3));
    }

    public static String b() {
        Enumeration<NetworkInterface> networkInterfaces;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (Exception e2) {
            g.a(e2);
        }
        if (networkInterfaces == null) {
            return sb.toString();
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (nextElement.isUp() && !nextElement.isLoopback()) {
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if ((nextElement2 instanceof Inet6Address) && !nextElement2.isLoopbackAddress()) {
                        String hostAddress = nextElement2.getHostAddress();
                        int indexOf = hostAddress.indexOf(37);
                        if (indexOf > 0) {
                            hostAddress = hostAddress.substring(0, indexOf);
                        }
                        arrayList.add(hostAddress);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final void a(Network network, String str, String str2, Map map, String str3, Runnable runnable) {
        g.b(com.alipay.sdk.m.n.a.B, "AlipayChinaMobileBridge sendNetworkAsync");
        com.alipay.sdk.m.q.a.a(new c(network, str, str2, map, str3, runnable));
    }

    public final void a(Map map) {
        g.b(com.alipay.sdk.m.n.a.B, "attachParamsToHeader");
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ipv4List", a());
            jSONObject.put("ipv6List", b());
            String a = j.a(context);
            this.d = a;
            jSONObject.put("networkType", a);
            jSONObject.put("packageName", context.getPackageName());
            String jSONObject2 = jSONObject.toString();
            g.b(com.alipay.sdk.m.n.a.B, "AlipayJsBridge attachParamsToHeader sdkDataStr：" + jSONObject2);
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            String a2 = a(bArr, g);
            String a3 = a(jSONObject2.getBytes(), bArr);
            map.put("sdkSecret", a2);
            map.put("sdkData", a3);
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static String a() {
        Enumeration<NetworkInterface> networkInterfaces;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        try {
            networkInterfaces = NetworkInterface.getNetworkInterfaces();
        } catch (Throwable th) {
            g.a(th);
        }
        if (networkInterfaces == null) {
            return sb.toString();
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (nextElement.isUp() && !nextElement.isLoopback()) {
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if ((nextElement2 instanceof Inet4Address) && !nextElement2.isLoopbackAddress()) {
                        arrayList.add(nextElement2.getHostAddress());
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String a(byte[] bArr, byte[] bArr2) {
        Cipher cipher = Cipher.getInstance(f);
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, Arrays.copyOf(bArr2, 12)));
        return com.alipay.sdk.m.p.a.a(cipher.doFinal(bArr));
    }

    public static String a(byte[] bArr, String str) {
        if (bArr == null || TextUtils.isEmpty(str)) {
            return null;
        }
        RSAPublicKey a = a(str);
        Cipher cipher = Cipher.getInstance(e);
        cipher.init(1, a);
        return com.alipay.sdk.m.p.a.a(a(bArr, cipher, (a.getModulus().bitLength() / 8) - 66));
    }

    public static RSAPublicKey a(String str) {
        return (RSAPublicKey) KeyFactory.getInstance(d.a).generatePublic(new X509EncodedKeySpec(com.alipay.sdk.m.p.a.a(str)));
    }

    public static byte[] a(byte[] bArr, Cipher cipher, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int length = bArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = length - i2;
                if (i4 > 0) {
                    byte[] doFinal = cipher.doFinal(bArr, i2, Math.min(i4, i));
                    byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                    i3++;
                    i2 = i3 * i;
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
