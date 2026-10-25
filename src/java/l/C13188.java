package l;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* compiled from: 51RR */
/* renamed from: l.۬ܶۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C13188 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakReference f39446;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f39447;

    public C13188(WebView webView, long j) {
        this.f39446 = new WeakReference(webView);
        this.f39447 = j;
    }

    /* renamed from: ֫ */
    public void mo23574() {
        WebView webView = (WebView) this.f39446.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f39447 + ",{'r':0,'result':'undefined'});");
    }

    /* renamed from: ۧ */
    public void mo23576() {
        WebView webView = (WebView) this.f39446.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f39447 + ",{'r':1,'result':'no such method'})");
    }

    /* renamed from: ֫ */
    public void mo23575(String str) {
        WebView webView = (WebView) this.f39446.get();
        if (webView != null) {
            webView.loadUrl("javascript:" + str);
        }
    }
}
