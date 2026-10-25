package l;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.tencent.connect.auth.a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: 51RR */
/* renamed from: l.۫۠ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12278 extends WebViewClient {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f36581;

    public C12278(a aVar) {
        this.f36581 = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        Context context;
        C9872 c9872;
        C9851 c9851;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C9851 c98512;
        C9851 c98513;
        C10162 c10162;
        C10162 c101622;
        boolean z;
        C9851 c98514;
        C9851 c98515;
        String str2;
        C9851 c98516;
        C9851 c98517;
        String str3;
        C9145.m23520("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
        boolean startsWith = str.startsWith("auth://browser");
        a aVar = this.f36581;
        if (startsWith) {
            JSONObject m42745 = C18338.m42745(str);
            aVar.f872 = a.m905(aVar);
            z = aVar.f872;
            if (!z) {
                if (m42745.optString("fail_cb", null) != null) {
                    aVar.m917(m42745.optString("fail_cb"));
                    return true;
                }
                if (m42745.optInt("fall_to_wv") == 1) {
                    str2 = aVar.f884;
                    a.m904(aVar, str2.indexOf("?") > -1 ? com.alipay.sdk.m.w.a.p : "?");
                    a.m904(aVar, "browser_error=1");
                    c98516 = aVar.f875;
                    if (c98516 != null) {
                        c98517 = aVar.f875;
                        str3 = aVar.f884;
                        c98517.loadUrl(str3);
                        return true;
                    }
                } else {
                    String optString = m42745.optString("redir", null);
                    if (optString != null) {
                        c98514 = aVar.f875;
                        if (c98514 != null) {
                            c98515 = aVar.f875;
                            c98515.loadUrl(optString);
                            return true;
                        }
                    }
                }
            }
        } else {
            if (str.startsWith("auth://tauth.qq.com/")) {
                c101622 = aVar.f885;
                c101622.mo3455(C18338.m42745(str));
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("auth://cancel")) {
                c10162 = aVar.f885;
                c10162.mo3453();
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("auth://close")) {
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("download://") || str.endsWith(".apk")) {
                try {
                    if (str.startsWith("download://")) {
                        parse = Uri.parse(Uri.decode(str.substring(11)));
                    } else {
                        parse = Uri.parse(Uri.decode(str));
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.addFlags(268435456);
                    context = aVar.f886;
                    context.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    C9145.m23514("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                    return true;
                }
            }
            try {
                if (str.startsWith("auth://progress")) {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        int intValue = Integer.valueOf(pathSegments.get(0)).intValue();
                        if (intValue == 0) {
                            frameLayout2 = aVar.f876;
                            frameLayout2.setVisibility(8);
                            c98512 = aVar.f875;
                            if (c98512 != null) {
                                c98513 = aVar.f875;
                                c98513.setVisibility(0);
                                return true;
                            }
                        } else if (intValue == 1) {
                            frameLayout = aVar.f876;
                            frameLayout.setVisibility(0);
                            return true;
                        }
                    }
                } else if (!str.startsWith("auth://onLoginSubmit")) {
                    c9872 = aVar.f878;
                    c9851 = aVar.f875;
                    if (!c9872.mo24963(c9851, str)) {
                        C9145.m23518("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                        return false;
                    }
                } else {
                    List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                    if (!pathSegments2.isEmpty()) {
                        aVar.f880 = pathSegments2.get(0);
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Context context;
        String str3;
        C10162 c10162;
        long j;
        int i2;
        C9851 c9851;
        C9851 c98512;
        long j2;
        Handler handler;
        C10162 c101622;
        super.onReceivedError(webView, i, str, str2);
        C9145.m23518("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
        a aVar = this.f36581;
        context = aVar.f886;
        if (!C18338.m42739(context)) {
            c101622 = aVar.f885;
            c101622.mo3454(new C19750(9001, "当前网络不可用，请稍后重试！", str2));
            aVar.dismiss();
            return;
        }
        str3 = aVar.f874;
        if (str3.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
            c10162 = aVar.f885;
            c10162.mo3454(new C19750(i, str, str2));
            aVar.dismiss();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j = aVar.f882;
        long j3 = elapsedRealtime - j;
        i2 = aVar.f868;
        if (i2 < 1) {
            j2 = aVar.f881;
            if (j3 < j2) {
                a.m899(aVar);
                handler = aVar.f870;
                handler.postDelayed(new RunnableC12983(this), 500L);
                return;
            }
        }
        c9851 = aVar.f875;
        if (c9851 != null) {
            c98512 = aVar.f875;
            c98512.loadUrl(a.m913(aVar));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        FrameLayout frameLayout;
        String str2;
        String str3;
        HashMap hashMap;
        Handler handler;
        Handler handler2;
        HashMap hashMap2;
        String str4;
        C9145.m23520("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
        super.onPageStarted(webView, str, bitmap);
        a aVar = this.f36581;
        frameLayout = aVar.f876;
        frameLayout.setVisibility(0);
        aVar.f882 = SystemClock.elapsedRealtime();
        str2 = aVar.f874;
        if (!TextUtils.isEmpty(str2)) {
            handler2 = aVar.f870;
            hashMap2 = aVar.f879;
            str4 = aVar.f874;
            handler2.removeCallbacks((Runnable) hashMap2.remove(str4));
        }
        aVar.f874 = str;
        str3 = aVar.f874;
        RunnableC11573 runnableC11573 = new RunnableC11573(aVar, str3);
        hashMap = aVar.f879;
        hashMap.put(str, runnableC11573);
        handler = aVar.f870;
        handler.postDelayed(runnableC11573, 120000L);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        FrameLayout frameLayout;
        C9851 c9851;
        Handler handler;
        HashMap hashMap;
        C9851 c98512;
        super.onPageFinished(webView, str);
        C9145.m23520("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
        a aVar = this.f36581;
        frameLayout = aVar.f876;
        frameLayout.setVisibility(8);
        c9851 = aVar.f875;
        if (c9851 != null) {
            c98512 = aVar.f875;
            c98512.setVisibility(0);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        handler = aVar.f870;
        hashMap = aVar.f879;
        handler.removeCallbacks((Runnable) hashMap.remove(str));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(8)
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            C9145.m23516("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
        } catch (Throwable unused) {
            C9145.m23516("openSDK_LOG.AuthDialog", "-->onReceivedSslError 请求不合法，请检查手机安全设置，如系统时间、代理等");
        }
        sslErrorHandler.cancel();
    }
}
