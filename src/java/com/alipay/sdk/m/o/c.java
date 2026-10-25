package com.alipay.sdk.m.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.y.d;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.util.Random;
import l.C23202;
import l.C3435;
import l.C5368;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class c {
    public static final String d = "virtualImeiAndImsi";
    public static final String e = "virtual_imei";
    public static final String f = "virtual_imsi";
    public static volatile c g;
    public String a;
    public String b = "sdk-and-lite";
    public String c;

    public c() {
        String a = com.alipay.sdk.m.l.a.a();
        if (com.alipay.sdk.m.l.a.b()) {
            return;
        }
        this.b += '_' + a;
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (g == null) {
                g = new c();
            }
            cVar = g;
        }
        return cVar;
    }

    public static String b() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder m15339 = C5368.m15339(hexString);
        m15339.append(random.nextInt(OpenAuthTask.OK) + 1000);
        return m15339.toString();
    }

    public static String d() {
        return "-1;-1";
    }

    public static String e() {
        return "1";
    }

    public static String f() {
        Context b = com.alipay.sdk.m.w.b.c().b();
        SharedPreferences sharedPreferences = b.getSharedPreferences(d, 0);
        String string = sharedPreferences.getString(e, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String b2 = TextUtils.isEmpty(com.alipay.sdk.m.x.a.a(b).f()) ? b() : d.b(b).b();
        sharedPreferences.edit().putString(e, b2).apply();
        return b2;
    }

    public static String g() {
        String c;
        Context b = com.alipay.sdk.m.w.b.c().b();
        SharedPreferences sharedPreferences = b.getSharedPreferences(d, 0);
        String string = sharedPreferences.getString(f, null);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        if (TextUtils.isEmpty(com.alipay.sdk.m.x.a.a(b).f())) {
            String d2 = com.alipay.sdk.m.w.b.c().d();
            c = (TextUtils.isEmpty(d2) || d2.length() < 18) ? b() : d2.substring(3, 18);
        } else {
            c = d.b(b).c();
        }
        sharedPreferences.edit().putString(f, c).apply();
        return c;
    }

    public static String h() {
        return ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
    }

    public static String i() {
        return "-1";
    }

    public String c() {
        return this.c;
    }

    public static synchronized void a(String str) {
        synchronized (c.class) {
            g.b(com.alipay.sdk.m.n.a.B, "setRsaPublicKey");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PreferenceManager.getDefaultSharedPreferences(com.alipay.sdk.m.w.b.c().b()).edit().putString(com.alipay.sdk.m.n.b.i, str).apply();
            com.alipay.sdk.m.n.a.g = str;
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb.append(packageName);
            sb.append(l.b);
            sb.append(packageInfo.versionCode);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public String a(com.alipay.sdk.m.w.a aVar, com.alipay.sdk.m.x.a aVar2, boolean z) {
        Context b = com.alipay.sdk.m.w.b.c().b();
        d b2 = d.b(b);
        if (TextUtils.isEmpty(this.a)) {
            String f2 = q.f();
            String e2 = q.e();
            String c = q.c(b);
            String e3 = q.e(b);
            String f3 = q.f(b);
            String a = a(b);
            StringBuilder m10501 = C3435.m10501("Msp/15.8.40 (", f2, l.b, e2, l.b);
            ASN1BMPString$$ExternalSyntheticOutline0.m(m10501, c, l.b, e3, l.b);
            this.a = C23202.m51498(m10501, f3, l.b, a);
        }
        String c2 = d.d(b).c();
        String b3 = q.b(b);
        String e4 = e();
        String c3 = b2.c();
        String b4 = b2.b();
        String g2 = g();
        String f4 = f();
        if (aVar2 != null) {
            this.c = aVar2.e();
        }
        String replace = Build.MANUFACTURER.replace(l.b, " ");
        String replace2 = Build.MODEL.replace(l.b, " ");
        boolean e5 = com.alipay.sdk.m.w.b.e();
        String d2 = b2.d();
        String i = i();
        String h = h();
        StringBuilder sb = new StringBuilder();
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, this.a, l.b, c2, l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, b3, l.b, e4, l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, c3, l.b, b4, l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, this.c, l.b, replace, l.b);
        sb.append(replace2);
        sb.append(l.b);
        sb.append(e5);
        sb.append(l.b);
        sb.append(d2);
        sb.append(l.b);
        sb.append(d());
        sb.append(l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, this.b, l.b, g2, l.b);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, f4, l.b, i, l.b);
        sb.append(h);
        if (aVar2 != null) {
            String a2 = com.alipay.sdk.m.a0.b.a(aVar, b, com.alipay.sdk.m.x.a.a(b).f(), com.alipay.sdk.m.a0.b.c(aVar, b));
            if (!TextUtils.isEmpty(a2)) {
                sb.append(";;;");
                sb.append(a2);
            }
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
