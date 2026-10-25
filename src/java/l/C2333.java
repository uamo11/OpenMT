package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bin.mt.plus.R;

/* compiled from: E72G */
/* renamed from: l.ۖۚ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2333 extends WebViewClient {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0921 f7479;

    public C2333(ActivityC0921 activityC0921) {
        this.f7479 = activityC0921;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return ActivityC0921.m3272(this.f7479, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean m3321;
        if (!webResourceRequest.isForMainFrame()) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        ActivityC0921 activityC0921 = this.f7479;
        m3321 = activityC0921.m3321(url);
        if (!m3321) {
            activityC0921.m3312(url);
            ActivityC0921.m3305(activityC0921, url);
        }
        return m3321;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean m3321;
        m3321 = this.f7479.m3321(Uri.parse(str));
        return m3321;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C14669 c14669;
        C5155 c5155;
        int i;
        boolean m3322;
        C14669 c146692;
        ActivityC0921 activityC0921 = this.f7479;
        c14669 = activityC0921.f3529;
        if (c14669 != null) {
            c146692 = activityC0921.f3529;
            c146692.m34961();
        }
        c5155 = activityC0921.f3541;
        i = c5155.f16107;
        if (i >= 0) {
            m3322 = activityC0921.m3322(str);
            webView.setBackgroundColor((m3322 && C21238.m48208(activityC0921)) ? Color.rgb(13, 17, 23) : -1);
        }
        Uri parse = str == null ? null : Uri.parse(str);
        activityC0921.m3312(parse);
        ActivityC0921.m3305(activityC0921, parse);
        activityC0921.m3276(0, true);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        ActivityC0921.m3288(this.f7479, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        ActivityC0921 activityC0921 = this.f7479;
        ActivityC0921.m3288(activityC0921, webView, str);
        activityC0921.m3313(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ActivityC0921 activityC0921 = this.f7479;
        activityC0921.m3276(100, false);
        activityC0921.m3324();
        activityC0921.m3313(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            ActivityC0921 activityC0921 = this.f7479;
            activityC0921.m3300();
            ActivityC0921.m3320(activityC0921, webResourceRequest.getUrl());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        ActivityC0921 activityC0921 = this.f7479;
        activityC0921.m3300();
        ActivityC0921.m3320(activityC0921, str2 == null ? null : Uri.parse(str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            this.f7479.m3300();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f7479.m3300();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebView webView2;
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        ActivityC0921 activityC0921 = this.f7479;
        webView2 = activityC0921.f3533;
        if (webView2 == webView) {
            activityC0921.f3533 = null;
        }
        activityC0921.m3300();
        C21374.m48457(R.string.MT_Protector_res_0x7f120711);
        activityC0921.finish();
        return true;
    }
}
