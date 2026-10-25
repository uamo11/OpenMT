package l;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* compiled from: 51RR */
/* renamed from: l.᩻᩹ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23982 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52800(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            try {
                settings.setSavePassword(false);
                settings.setAllowFileAccess(false);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            } catch (Exception e) {
                C9145.m23514("WebViewUtils", "Exception", e);
            }
            settings.setJavaScriptEnabled(true);
        }
    }
}
