package l;

import android.webkit.JavascriptInterface;
import java.util.UUID;

/* compiled from: E72G */
/* renamed from: l.ᩴۚ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18561 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f57602;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5155 f57603;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f57604 = UUID.randomUUID().toString();

    @JavascriptInterface
    @InterfaceC4801
    public synchronized void save(String str, String str2) {
        if (!this.f57602 && this.f57604.equals(str) && str2 != null && str2.length() <= 100000) {
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) != '0' && str2.charAt(i) != '1') {
                    return;
                }
            }
            this.f57603.f16110 = str2;
        }
    }

    public C18561(C5155 c5155) {
        this.f57603 = c5155;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43102(C18561 c18561) {
        synchronized (c18561) {
            c18561.f57602 = true;
        }
    }
}
