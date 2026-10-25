package l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.tencent.open.TDialog;
import java.lang.ref.WeakReference;

/* compiled from: 51RR */
/* renamed from: l.ۖܶۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2606 extends WebViewClient {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f8233;

    public C2606(TDialog tDialog) {
        this.f8233 = tDialog;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WeakReference weakReference;
        Uri parse;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C18834 c18834;
        C18834 c188342;
        C9145.m23520("openSDK_LOG.TDialog", "Redirect URL: " + str);
        C14082 m33692 = C14082.m33692();
        TDialog tDialog = this.f8233;
        weakReference = tDialog.f904;
        if (str.startsWith(m33692.m33693((Context) weakReference.get(), "auth://tauth.qq.com/"))) {
            c188342 = tDialog.f898;
            c188342.mo3455(C18338.m42745(str));
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("auth://cancel")) {
            c18834 = tDialog.f898;
            c18834.mo3453();
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("auth://close")) {
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("download://") || str.endsWith(".apk")) {
            try {
                if (str.startsWith("download://")) {
                    parse = Uri.parse(Uri.decode(str.substring(11)));
                } else {
                    parse = Uri.parse(Uri.decode(str));
                }
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.addFlags(268435456);
                weakReference2 = tDialog.f904;
                if (weakReference2 != null) {
                    weakReference3 = tDialog.f904;
                    if (weakReference3.get() != null) {
                        weakReference4 = tDialog.f904;
                        ((Context) weakReference4.get()).startActivity(intent);
                    }
                }
            } catch (Exception unused) {
            }
        } else if (!str.startsWith("auth://progress")) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        C18834 c18834;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        super.onReceivedError(webView, i, str, str2);
        TDialog tDialog = this.f8233;
        c18834 = tDialog.f898;
        c18834.mo3454(new C19750(i, str, str2));
        weakReference = tDialog.f904;
        if (weakReference != null) {
            weakReference2 = tDialog.f904;
            if (weakReference2.get() != null) {
                weakReference3 = tDialog.f904;
                Toast.makeText((Context) weakReference3.get(), "网络连接异常或系统错误", 0).show();
            }
        }
        tDialog.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C9145.m23520("openSDK_LOG.TDialog", "Webview loading URL: " + str);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C7028 c7028;
        C7028 c70282;
        super.onPageFinished(webView, str);
        TDialog tDialog = this.f8233;
        c7028 = tDialog.f901;
        if (c7028 != null) {
            c70282 = tDialog.f901;
            c70282.setVisibility(0);
        }
    }
}
