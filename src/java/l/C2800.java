package l;

import android.os.Build;

/* compiled from: Y9AZ */
/* renamed from: l.ۖ᩸ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2800 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f8737;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f8738;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f8739;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f8740;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f8741;

    public C2800() {
        String[] strArr;
        String str;
        strArr = Build.SUPPORTED_ABIS;
        String str2 = strArr[0];
        str2.getClass();
        str = "x86";
        switch (str2) {
            case "x86_64":
                str = "x86_64";
                break;
            case "x86":
                break;
            case "armeabi-v7a":
                str = "arm";
                break;
            case "arm64-v8a":
                str = "arm64";
                break;
            default:
                throw new RuntimeException("Unsupported architecture: " + strArr[0]);
        }
        this.f8737 = str;
    }
}
