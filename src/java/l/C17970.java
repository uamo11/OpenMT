package l;

import android.content.pm.PackageInfo;
import android.graphics.drawable.ColorDrawable;

/* compiled from: K1PX */
/* renamed from: l.ᩳۢۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17970 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f56041;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f56042;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f56043;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0734 f56044 = new C0734(new ColorDrawable(0));

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f56045;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f56046;

    public C17970(PackageInfo packageInfo) {
        this.f56045 = packageInfo;
        this.f56041 = C4726.m13841(packageInfo);
        this.f56043 = packageInfo.packageName;
        this.f56046 = packageInfo.versionName + "   " + C22927.m51020(C16999.m39866(packageInfo.applicationInfo.sourceDir, new String[0]).mo23127());
    }
}
