package l;

import android.content.res.AssetManager;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.m.w.a;
import java.io.IOException;

/* compiled from: 46LH */
/* renamed from: l.ۗܿܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3381 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AssetManager f10679;

    public C3381(AssetManager assetManager) {
        this.f10679 = assetManager;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m10313(String str) {
        String substring = str.startsWith("/_mt_markdown_vendor_/") ? str.substring(22) : "";
        if (!substring.equals("katex.min.css") && !substring.equals("katex.min.js")) {
            return C2676.m8383(404, "Not Found");
        }
        try {
            return new WebResourceResponse(substring.endsWith(".js") ? "application/javascript" : "text/css", a.D, 200, "OK", C15942.m37719(), this.f10679.open("markdown-preview/".concat(substring)));
        } catch (IOException unused) {
            return C2676.m8383(404, "Not Found");
        }
    }
}
