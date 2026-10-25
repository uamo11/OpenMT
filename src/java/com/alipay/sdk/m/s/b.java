package com.alipay.sdk.m.s;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Map;

/* compiled from: N673 */
/* loaded from: classes.dex */
public final class b {
    public static final String a = "msp";
    public static final String b = "application/octet-stream;binary/octet-stream";
    public static final CookieManager c = new CookieManager();

    /* compiled from: N673 */
    public final class a {
        public final String a;
        public final byte[] b;
        public final Map c;

        public a(String str, Map map, byte[] bArr) {
            this.a = str;
            this.b = bArr;
            this.c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.a, this.c);
        }
    }

    /* compiled from: N673 */
    /* renamed from: com.alipay.sdk.m.s.b$b, reason: collision with other inner class name */
    public final class C0025b {
        public final Map a;
        public final String b;
        public final byte[] c;

        public C0025b(Map map, String str, byte[] bArr) {
            this.a = map;
            this.b = str;
            this.c = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alipay.sdk.m.s.b.C0025b a(android.content.Context r11, com.alipay.sdk.m.s.b.a r12) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.s.b.a(android.content.Context, com.alipay.sdk.m.s.b$a):com.alipay.sdk.m.s.b$b");
    }

    public static Proxy b(Context context) {
        String a2 = a(context);
        if (a2 != null && !a2.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String a(Context context) {
        try {
            NetworkInfo a2 = com.alipay.sdk.m.a0.b.a(null, context);
            if (a2 != null && a2.isAvailable()) {
                return a2.getType() == 1 ? "wifi" : a2.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
