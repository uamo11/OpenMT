package com.alipay.sdk.m.m;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.m.a;
import com.alipay.sdk.m.y.d;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.q;
import com.google.android.material.motion.MotionUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import l.C16014;
import l.C22870;
import l.C3435;
import l.C9045;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public static final String A = "SSLDenied";
    public static final String A0 = "out_trade_no";
    public static final String B = "H5PayDataAnalysisError";
    public static final String B0 = "trade_no";
    public static final String C = "H5AuthDataAnalysisError";
    public static final String C0 = "biz_content";
    public static final String D = "PublicKeyUnmatch";
    public static final String D0 = "app_id";
    public static final String E = "ClientBindFailed";
    public static final String F = "TriDesEncryptError";
    public static final String G = "TriDesDecryptError";
    public static final String H = "ClientBindException";
    public static final String I = "SaveTradeTokenError";
    public static final String J = "ClientBindServiceFailed";
    public static final String K = "TryStartServiceEx";
    public static final String L = "BindWaitTimeoutEx";
    public static final String M = "CheckClientExistEx";
    public static final String N = "CheckClientSignEx";
    public static final String O = "GetInstalledAppEx";
    public static final String P = "ParserTidClientKeyEx";
    public static final String Q = "PgApiInvoke";
    public static final String R = "PgBindStarting";
    public static final String S = "PgBinded";
    public static final String T = "PgBindEnd";
    public static final String U = "PgBindPay";
    public static final String V = "PgReturn";
    public static final String W = "PgReturnV";
    public static final String X = "PgWltVer";
    public static final String Y = "PgOpenStarting";
    public static final String Z = "ErrIntentEx";
    public static final String a0 = "ErrActNull";
    public static final String b0 = "ErrActEx";
    public static final String c0 = "ErrActNull2";
    public static final String d0 = "ErrActEx2";
    public static final String e0 = "ErrActNotCreated";
    public static final String f0 = "GetInstalledAppEx";
    public static final String g0 = "StartLaunchAppTransEx";
    public static final String h0 = "CheckLaunchAppExistEx";
    public static final String i0 = "LogBindCalledH5";
    public static final String j0 = "LogCalledH5";
    public static final String k = "net";
    public static final String k0 = "LogHkLoginByIntent";

    /* renamed from: l, reason: collision with root package name */
    public static final String f77909l = "biz";
    public static final String l0 = "SchemePayWrongHashEx";
    public static final String m = "cp";
    public static final String m0 = "LogAppFetchConfigTimeout";
    public static final String n = "auth";
    public static final String n0 = "H5CbUrlEmpty";
    public static final String o = "third";
    public static final String o0 = "H5CbEx";
    public static final String p = "wlt";
    public static final String p0 = "StartActivityEx";
    public static final String q = "FormatResultEx";
    public static final String q0 = "JSONEx";
    public static final String r = "GetApdidEx";
    public static final String r0 = "ParseBundleSerializableError";
    public static final String s = "GetApdidNull";
    public static final String s0 = "ParseSchemeQueryError";
    public static final String t = "GetApdidTimeout";
    public static final String t0 = "TbChk";
    public static final String u = "GetUtdidEx";
    public static final String u0 = "TbStart";
    public static final String v = "GetPackageInfoEx";
    public static final String v0 = "TbCancel";
    public static final String w = "NotIncludeSignatures";
    public static final String w0 = "TbUnknown";
    public static final String x = "GetPublicKeyFromSignEx";
    public static final String x0 = "TbOk";
    public static final String y = "webError";
    public static final String y0 = "TbActFail";
    public static final String z = "SSLError";
    public static final String z0 = "partner";
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h = "";
    public String i = "";
    public String j;

    public b(Context context, boolean z2) {
        context = context != null ? context.getApplicationContext() : context;
        this.a = b();
        this.c = a(context);
        this.d = a(z2 ? 0L : a.f.a(context));
        this.e = a();
        this.f = b(context);
        this.g = "-";
        this.j = "-";
    }

    public static String e() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public void a(String str, String str2, Throwable th) {
        d(str, str2, a(th));
    }

    public final synchronized void b(String str, String str2, String str3) {
        if (com.alipay.sdk.m.o.b.i().g(null)) {
            g.d(com.alipay.sdk.m.n.a.B, "event " + str + " " + str2 + " " + str3);
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.h)) {
                sb.append("^");
            }
            sb.append(TextUtils.isEmpty(str) ? "-" : b(str));
            sb.append(",");
            sb.append(b(str2));
            sb.append(",");
            sb.append(b(str3));
            sb.append(",-,-,-,-,-,-,-,-,-,-,");
            sb.append(c());
            this.h += ((Object) sb);
        } else {
            g.d(com.alipay.sdk.m.n.a.B, "event " + str + " " + str2 + " " + str3);
            String str4 = TextUtils.isEmpty(this.h) ? "" : "^";
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            String b = TextUtils.isEmpty(str) ? "-" : b(str);
            sb2.append(b + "," + b(str2) + "," + b(str3) + ",-,-,-,-,-,-,-,-,-,-," + b(c()));
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.h);
            sb4.append(sb3);
            this.h = sb4.toString();
        }
    }

    public void c(String str, String str2, String str3) {
        d(str, str2, str3);
    }

    public final boolean d() {
        return TextUtils.isEmpty(this.i);
    }

    public static String c() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public final synchronized void d(String str, String str2, String str3) {
        g.c(com.alipay.sdk.m.n.a.B, "err " + str + " " + str2 + " " + str3);
        String str4 = TextUtils.isEmpty(this.i) ? "" : "^";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        String b = TextUtils.isEmpty(str3) ? "-" : b(str3);
        sb.append(str + "," + str2 + "," + b + "," + b(c()));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.i);
        sb3.append(sb2);
        this.i = sb3.toString();
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "-" : str;
    }

    public void a(String str, String str2, Throwable th, String str3) {
        d(str, str2, C22870.m50967(str3, ": ", a(th)));
    }

    public void a(String str, String str2, String str3) {
        b("", str, C22870.m50967(str2, "|", str3));
    }

    public void a(String str, String str2) {
        b("", str, str2);
    }

    public static String a(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i++;
                    if (i > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public String d(String str) {
        String a = a(str);
        this.b = a;
        String str2 = this.a;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        String str6 = this.f;
        String str7 = this.g;
        String c = c(this.h);
        String c2 = c(this.i);
        String str8 = this.j;
        StringBuilder m10501 = C3435.m10501("[(", str2, "),(", a, "),(");
        ASN1BMPString$$ExternalSyntheticOutline0.m(m10501, str3, "),(", str4, "),(");
        ASN1BMPString$$ExternalSyntheticOutline0.m(m10501, str5, "),(", str6, "),(");
        ASN1BMPString$$ExternalSyntheticOutline0.m(m10501, str7, "),(", c, "),(");
        m10501.append(c2);
        m10501.append("),(");
        m10501.append(str8);
        m10501.append(")]");
        return m10501.toString();
    }

    public static String a(String str) {
        String str2;
        String str3;
        if (str == null) {
            str = "";
        }
        String[] split = str.split(com.alipay.sdk.m.w.a.p);
        String str4 = null;
        if (split != null) {
            str3 = null;
            String str5 = null;
            for (String str6 : split) {
                String[] split2 = str6.split("=");
                if (split2 != null && split2.length == 2) {
                    if (split2[0].equalsIgnoreCase(z0)) {
                        str4 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(A0)) {
                        str3 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(B0)) {
                        str5 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(C0)) {
                        try {
                            JSONObject jSONObject = new JSONObject(q.e(com.alipay.sdk.m.w.a.f(), split2[1]));
                            if (TextUtils.isEmpty(str3)) {
                                str3 = jSONObject.getString(A0);
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (split2[0].equalsIgnoreCase(D0) && TextUtils.isEmpty(str4)) {
                        str4 = split2[1];
                    }
                }
            }
            str2 = str4;
            str4 = str5;
        } else {
            str2 = null;
            str3 = null;
        }
        return b(str4) + "," + b(str3) + ",-," + b(str2) + ",-,-,-";
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace(MotionUtils.EASING_TYPE_FORMAT_START, "（").replace(MotionUtils.EASING_TYPE_FORMAT_END, "）").replace(",", "，").replace("^", "~").replace("#", "＃");
    }

    public static String b() {
        return C22870.m50967(e(), ",", new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    public static String b(Context context) {
        String b = b(d.c(context));
        String b2 = b(Build.VERSION.RELEASE);
        String b3 = b(Build.MODEL);
        String b4 = b(d.d(context).c());
        String b5 = b(com.alipay.sdk.m.a0.b.b(null, context));
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(",android,");
        sb.append(b2);
        sb.append(",");
        sb.append(b3);
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, ",-,0,", b4, ",gw,", b5);
        sb.append(",-");
        return sb.toString();
    }

    public static String a(Context context) {
        String str;
        String str2 = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str2 = packageInfo.versionName + "|" + a(packageInfo);
                } catch (Throwable unused) {
                }
                str = str2;
                str2 = packageName;
            } catch (Throwable unused2) {
            }
            return b(str2) + "," + b(str) + ",-,-,-";
        }
        str = "-";
        return b(str2) + "," + b(str) + ",-,-,-";
    }

    public static String a(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String str;
        String a;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    a = q.a((com.alipay.sdk.m.w.a) null, signature.toByteArray());
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(a)) {
                    str = "?";
                    sb.append("-");
                    sb.append(str);
                } else {
                    str = q.g(a).substring(0, 8);
                    sb.append("-");
                    sb.append(str);
                }
            }
            return sb.toString();
        } catch (Throwable unused2) {
            return "?";
        }
    }

    public static String a(long j) {
        String b = b("15.8.40");
        String b2 = b("h.a.3.8.40");
        return C9045.m23341(C3435.m10501("android,3,", b, ",", b2, ",com.alipay.mcpay,5.0,-,"), C16014.m37865(j, "~"), ",-");
    }

    public static String a() {
        return b(com.alipay.sdk.m.x.a.a(com.alipay.sdk.m.w.b.c().b()).f()) + "," + b(com.alipay.sdk.m.w.b.c().d()) + ",-,-,-";
    }
}
