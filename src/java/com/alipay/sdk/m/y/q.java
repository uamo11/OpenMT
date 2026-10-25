package com.alipay.sdk.m.y;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.m.o.b;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C16014;
import l.C19462;
import l.C20094;
import l.C2912;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class q {
    public static final String a = "com.alipay.android.app";
    public static final String b = "com.eg.android.AlipayGphone";
    public static final String c = "hk.alipay.wallet";
    public static final String d = "hk.alipay.walletRC";
    public static final String e = "com.eg.android.AlipayGphoneRC";
    public static final int f = 99;
    public static final int h = 125;
    public static final int i = 460;
    public static final String[] g = {"10.1.5.1013151", "10.1.5.1013148"};
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    /* compiled from: N673 */
    public class a implements Runnable {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.finish();
        }
    }

    /* compiled from: N673 */
    public class b implements Runnable {
        public final /* synthetic */ Runnable a;
        public final /* synthetic */ ConditionVariable b;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.a = runnable;
            this.b = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.run();
            } finally {
                this.b.open();
            }
        }
    }

    public static String a(String str, String str2) {
        return C16014.m37867(str, str2);
    }

    public static String a(String str, String str2, String str3) {
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf <= str.length()) {
                return "";
            }
            int indexOf2 = !TextUtils.isEmpty(str2) ? str3.indexOf(str2, indexOf) : 0;
            return indexOf2 < 1 ? str3.substring(indexOf) : str3.substring(indexOf, indexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String b() {
        if (EnvUtils.isSandBox()) {
            return TextUtils.equals("hk.alipay.wallet", ((b.C0017b) com.alipay.sdk.m.l.a.d.get(0)).a) ? d : e;
        }
        try {
            return ((b.C0017b) com.alipay.sdk.m.l.a.d.get(0)).a;
        } catch (Throwable unused) {
            return "com.eg.android.AlipayGphone";
        }
    }

    public static String b(Context context) {
        return "-1;-1";
    }

    public static String c(String str) {
        return (EnvUtils.isSandBox() && TextUtils.equals(str, e)) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static int d(String str) {
        for (int i2 = 0; i2 < 64; i2++) {
            if (str.equals(String.valueOf(j[i2]))) {
                return i2;
            }
        }
        return 0;
    }

    public static String e(com.alipay.sdk.m.w.a aVar, String str) {
        try {
            return C2912.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.B, e2);
            return "";
        }
    }

    public static String f() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String g(Context context) {
        String f2 = f();
        String e2 = e();
        String c2 = c(context);
        String f3 = f(context);
        StringBuilder sb = new StringBuilder();
        if (com.alipay.sdk.m.o.b.i().v()) {
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, " (", f2, l.b, e2);
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb, l.b, c2, ";;", f3);
            sb.append(")(sdk android)");
            return sb.toString();
        }
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, " (", f2, l.b, e2);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, l.b, c2, ";;", f3);
        sb.append(";15.8.40)(sdk android)");
        return sb.toString();
    }

    public static JSONObject h(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String f(Context context) {
        DisplayMetrics d2 = d(context);
        return d2.widthPixels + "*" + d2.heightPixels;
    }

    public static String d() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static String i(String str) {
        try {
            Uri parse = Uri.parse(str);
            return parse.getAuthority() + parse.getPath();
        } catch (Throwable th) {
            g.a(th);
            return "-";
        }
    }

    public static boolean h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(a, 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String e() {
        String d2 = d();
        int indexOf = d2.indexOf("-");
        if (indexOf != -1) {
            d2 = d2.substring(0, indexOf);
        }
        int indexOf2 = d2.indexOf("\n");
        if (indexOf2 != -1) {
            d2 = d2.substring(0, indexOf2);
        }
        return C20094.m46315("Linux ", d2);
    }

    public static boolean h() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static String c(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static boolean f(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    /* compiled from: N673 */
    public final class c {
        public final PackageInfo a;
        public final int b;
        public final String c;

        public c(PackageInfo packageInfo, int i, String str) {
            this.a = packageInfo;
            this.b = i;
            this.c = str;
        }

        public boolean a(com.alipay.sdk.m.w.a aVar) {
            Signature[] signatureArr = this.a.signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                for (Signature signature : signatureArr) {
                    String a = q.a(aVar, signature.toByteArray());
                    if (a != null && !TextUtils.equals(a, this.c)) {
                        com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.D, C19462.m44858("Got ", a, ", expected ", this.c));
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean a() {
            return this.a.versionCode < this.b;
        }
    }

    public static String c(com.alipay.sdk.m.w.a aVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.f77909l, "rflex", e2.getClass().getSimpleName());
            return null;
        }
    }

    public static Map b(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(com.alipay.sdk.m.w.a.p)) {
            int indexOf = str2.indexOf("=", 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), C2912.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    public static String a(com.alipay.sdk.m.w.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e2) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.n, com.alipay.sdk.m.m.b.x, e2);
            return null;
        }
    }

    public static int c() {
        try {
            String lowerCase = Build.BRAND.toLowerCase();
            String lowerCase2 = Build.MANUFACTURER.toLowerCase();
            if (a("huawei", lowerCase, lowerCase2)) {
                return 1;
            }
            if (a("oppo", lowerCase, lowerCase2)) {
                return 2;
            }
            if (a("vivo", lowerCase, lowerCase2)) {
                return 4;
            }
            if (a("lenovo", lowerCase, lowerCase2)) {
                return 8;
            }
            if (a("xiaomi", lowerCase, lowerCase2)) {
                return 16;
            }
            return a("oneplus", lowerCase, lowerCase2) ? 32 : 0;
        } catch (Exception unused) {
            return 61440;
        }
    }

    public static String e(Context context) {
        String b2 = p.b(context);
        return b2.substring(0, b2.indexOf("://"));
    }

    public static int e(String str) {
        try {
            String k = com.alipay.sdk.m.o.b.i().k();
            if (TextUtils.isEmpty(k)) {
                return 0;
            }
            return (b(k, "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static Map b(com.alipay.sdk.m.w.a aVar, String str) {
        HashMap hashMap = new HashMap(4);
        int indexOf = str.indexOf(63);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            for (String str2 : str.substring(indexOf + 1).split(com.alipay.sdk.m.w.a.p)) {
                int indexOf2 = str2.indexOf(61, 1);
                if (indexOf2 != -1 && indexOf2 < str2.length() - 1) {
                    hashMap.put(str2.substring(0, indexOf2), e(aVar, str2.substring(indexOf2 + 1)));
                }
            }
        }
        return hashMap;
    }

    public static c a(com.alipay.sdk.m.w.a aVar, Context context, List list) {
        c a2;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b.C0017b c0017b = (b.C0017b) it.next();
            if (c0017b != null && (a2 = a(aVar, context, c0017b.a, c0017b.b, c0017b.c)) != null && !a2.a(aVar) && !a2.a()) {
                return a2;
            }
        }
        return null;
    }

    public static String g(String str) {
        return a(str, true);
    }

    public static int g() {
        try {
            return Process.myUid();
        } catch (Throwable th) {
            g.a(th);
            return -200;
        }
    }

    public static c a(com.alipay.sdk.m.w.a aVar, Context context, String str, int i2, String str2) {
        PackageInfo packageInfo;
        if (EnvUtils.isSandBox()) {
            if ("com.eg.android.AlipayGphone".equals(str)) {
                str = e;
            } else if ("hk.alipay.wallet".equals(str)) {
                str = d;
            }
        }
        try {
            packageInfo = a(context, str);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.n, com.alipay.sdk.m.m.b.v, th.getMessage());
            packageInfo = null;
        }
        if (a(aVar, packageInfo)) {
            return a(packageInfo, i2, str2);
        }
        return null;
    }

    public static String b(com.alipay.sdk.m.w.a aVar, Context context) {
        return a(aVar, context, context.getPackageName());
    }

    public static int b(int i2) {
        return i2 / 100000;
    }

    public static String b(String str, String str2) {
        String string = Settings.Secure.getString(((Application) com.alipay.sdk.m.w.b.c().b()).getContentResolver(), str);
        return string != null ? string : str2;
    }

    public static boolean b(com.alipay.sdk.m.w.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.g)) {
            return false;
        }
        return aVar.g.toLowerCase().contains(com.alipay.sdk.m.m.b.n);
    }

    public static boolean a(com.alipay.sdk.m.w.a aVar, PackageInfo packageInfo) {
        String str;
        boolean z = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                str = "";
                z = true;
            }
        }
        if (!z) {
            com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.n, com.alipay.sdk.m.m.b.w, str);
        }
        return z;
    }

    public static DisplayMetrics d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static boolean d(com.alipay.sdk.m.w.a aVar, String str) {
        int e2;
        try {
            e2 = e(str);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "bindExt", "" + e2);
        } catch (Throwable unused) {
        }
        return com.alipay.sdk.m.o.b.i().q() && (e2 & 2) == 2;
    }

    public static PackageInfo a(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    public static c a(PackageInfo packageInfo, int i2, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new c(packageInfo, i2, str);
    }

    public static long a(String str) {
        return a(str, 6);
    }

    public static long a(String str, int i2) {
        int pow = (int) Math.pow(2.0d, i2);
        int length = str.length();
        long j2 = 0;
        int i3 = length;
        for (int i4 = 0; i4 < length; i4++) {
            j2 += Integer.parseInt(String.valueOf(d(str.substring(i4, r5)))) * ((long) Math.pow(pow, i3 - 1));
            i3--;
        }
        return j2;
    }

    public static int a() {
        String d2 = com.alipay.sdk.m.w.b.c().d();
        if (TextUtils.isEmpty(d2)) {
            return -1;
        }
        String replaceAll = d2.replaceAll("=", "");
        if (replaceAll.length() >= 5) {
            replaceAll = replaceAll.substring(0, 5);
        }
        int a2 = (int) (a(replaceAll) % 10000);
        return a2 < 0 ? a2 * (-1) : a2;
    }

    public static boolean a(com.alipay.sdk.m.w.a aVar, Context context, List list, boolean z) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b.C0017b c0017b = (b.C0017b) it.next();
                if (c0017b != null) {
                    String str = c0017b.a;
                    if (EnvUtils.isSandBox()) {
                        if ("com.eg.android.AlipayGphone".equals(str)) {
                            str = e;
                        } else if ("hk.alipay.wallet".equals(str)) {
                            str = d;
                        }
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z) {
                                return true;
                            }
                            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.X, packageInfo.packageName + "|" + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.h0, th);
            return false;
        }
    }

    public static boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = g;
            if (!TextUtils.equals(str, strArr[0])) {
                if (!TextUtils.equals(str, strArr[1])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(int i2) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static boolean a(com.alipay.sdk.m.w.a aVar, String str, Activity activity) {
        int parseInt;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (!str.toLowerCase().startsWith(com.alipay.sdk.m.n.a.o.toLowerCase()) && !str.toLowerCase().startsWith(com.alipay.sdk.m.n.a.p.toLowerCase())) {
            if (!TextUtils.equals(str, com.alipay.sdk.m.n.a.r) && !TextUtils.equals(str, a(com.alipay.sdk.m.n.a.s, com.alipay.sdk.m.n.a.t))) {
                if (!str.startsWith(com.alipay.sdk.m.n.a.q)) {
                    return false;
                }
                try {
                    String substring2 = str.substring(str.indexOf(com.alipay.sdk.m.n.a.q) + 24);
                    parseInt = Integer.parseInt(substring2.substring(substring2.lastIndexOf(com.alipay.sdk.m.n.a.u) + 10));
                } catch (Exception unused) {
                    com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.e());
                }
                if (parseInt != com.alipay.sdk.m.l.c.SUCCEEDED.c() && parseInt != com.alipay.sdk.m.l.c.PAY_WAITTING.c()) {
                    com.alipay.sdk.m.l.c a2 = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.FAILED.c());
                    com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.a(a2.c(), a2.b(), ""));
                    activity.runOnUiThread(new a(activity));
                    return true;
                }
                if (com.alipay.sdk.m.n.a.y) {
                    StringBuilder sb = new StringBuilder();
                    String decode = C2912.decode(str);
                    String decode2 = C2912.decode(decode);
                    String str2 = decode2.substring(decode2.indexOf(com.alipay.sdk.m.n.a.q) + 24, decode2.lastIndexOf(com.alipay.sdk.m.n.a.u)).split(com.alipay.sdk.m.n.a.w)[0];
                    int indexOf = decode.indexOf(com.alipay.sdk.m.n.a.w) + 12;
                    sb.append(str2);
                    sb.append(com.alipay.sdk.m.n.a.w);
                    sb.append(decode.substring(indexOf, decode.indexOf(com.alipay.sdk.m.w.a.p, indexOf)));
                    sb.append(decode.substring(decode.indexOf(com.alipay.sdk.m.w.a.p, indexOf)));
                    substring = sb.toString();
                } else {
                    String decode3 = C2912.decode(str);
                    substring = decode3.substring(decode3.indexOf(com.alipay.sdk.m.n.a.q) + 24, decode3.lastIndexOf(com.alipay.sdk.m.n.a.u));
                }
                com.alipay.sdk.m.l.c a3 = com.alipay.sdk.m.l.c.a(parseInt);
                com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.a(a3.c(), a3.b(), substring));
                activity.runOnUiThread(new a(activity));
                return true;
            }
            com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.a());
            activity.finish();
            return true;
        }
        try {
            c a4 = a(aVar, activity, com.alipay.sdk.m.l.a.d);
            if (a4 != null && !a4.a() && !a4.a(aVar)) {
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst("intent://platformapi/startapp\\?", com.alipay.sdk.m.n.a.o);
                }
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    public static String a(com.alipay.sdk.m.w.a aVar, Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionName;
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.v, th);
            return "";
        }
    }

    public static String a(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (z && digest.length > 16) {
                byte[] bArr = new byte[16];
                System.arraycopy(digest, 0, bArr, 0, 16);
                return a(bArr);
            }
            return a(digest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 & 240) >> 4, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    public static ActivityInfo a(Context context) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            g.a(th);
            return null;
        }
    }

    public static String a(com.alipay.sdk.m.w.a aVar) {
        return c(aVar, "ro.build.fingerprint");
    }

    public static Object a(WeakReference weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static boolean a(com.alipay.sdk.m.w.a aVar, String str) {
        try {
            String host = new URL(str).getHost();
            if (host.endsWith(com.alipay.sdk.m.n.a.C)) {
                return true;
            }
            return host.endsWith(com.alipay.sdk.m.n.a.D);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "ckUrlErr", th);
            return false;
        }
    }

    public static JSONObject a(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static Map a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    hashMap.put(next, jSONObject.optString(next));
                } catch (Throwable th) {
                    g.a(th);
                }
            }
        }
        return hashMap;
    }

    public static boolean a(Object obj, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return obj == null;
        }
        for (Object obj2 : objArr) {
            if ((obj == null && obj2 == null) || (obj != null && obj.equals(obj2))) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(long j2, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        try {
            if (j2 <= 0) {
                conditionVariable.block();
                return true;
            }
            return conditionVariable.block(j2);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String a(com.alipay.sdk.m.w.a aVar, Context context) {
        try {
            String a2 = m.a(aVar, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            try {
                m.b(aVar, context, "alipay_cashier_ap_fi", com.alipay.sdk.m.j.a.a("FU", System.currentTimeMillis(), new com.alipay.sdk.m.j.d(), (short) 0, new com.alipay.sdk.m.j.f()).a());
                String a3 = m.a(aVar, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(a3)) {
                    return a3;
                }
                com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.f77909l, "e_regen_empty", "");
                return "";
            } catch (Exception e2) {
                com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.f77909l, "e_gen", e2.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e3) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "e_gen_err", e3);
            return "";
        }
    }

    public static void a(String str, String str2, Context context, com.alipay.sdk.m.w.a aVar) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || b(aVar) || !com.alipay.sdk.m.o.b.i().x()) {
            return;
        }
        try {
            Intent intent = new Intent(com.alipay.sdk.m.n.b.f77911l);
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "AppNotify", str + "|" + str2);
        } catch (Exception unused) {
        }
    }

    public static String a(File file) {
        int i2;
        MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
