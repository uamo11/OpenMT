package l;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* compiled from: H6ZH */
/* renamed from: l.۠۟ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8030 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24767 = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
        new WeakHashMap();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PackageInfo m21343() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C11558.m28452();
        }
        try {
            return m21344();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m21344() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
