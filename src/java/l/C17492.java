package l;

import android.webkit.JavascriptInterface;

/* compiled from: K6ZG */
/* renamed from: l.ܿܿܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17492 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23842 f53441;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f53442;

    @JavascriptInterface
    @InterfaceC4801
    public synchronized boolean update(String str, String str2) {
        boolean z;
        String str3 = this.f53442;
        if (str3 != null && str3.equals(str)) {
            z = this.f53441.m52554(str2);
        }
        return z;
    }

    public C17492(C23842 c23842) {
        this.f53441 = c23842;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40878(C17492 c17492, String str) {
        synchronized (c17492) {
            c17492.f53442 = str;
        }
    }
}
