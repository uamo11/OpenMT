package l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: Y9AZ */
/* renamed from: l.ۢ᩸ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9856 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f29821;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f29822 = false;

    public C9856() {
        PackageInfo packageInfo;
        boolean z = C2094.f6977;
        try {
            packageInfo = C4925.m14304("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        this.f29821 = packageInfo != null ? packageInfo.lastUpdateTime : 0L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24925() {
        PackageInfo packageInfo;
        boolean z = C2094.f6977;
        try {
            packageInfo = C4925.m14304("bin.mt.termex");
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.lastUpdateTime == this.f29821) ? false : true;
    }
}
