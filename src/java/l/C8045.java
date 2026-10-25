package l;

import android.os.Build;
import java.lang.ref.WeakReference;

/* compiled from: 51RR */
/* renamed from: l.۠۠ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8045 extends AbstractC23772 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String f24802 = null;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String f24803 = "libwbsafeedit";

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public WeakReference f24804;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC4227 f24805;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f24806;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0128, code lost:
    
        if (l.C7733.m20717(l.C22927.m51019(), r0) != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04aa  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m21377(android.app.Activity r30, l.InterfaceC4227 r31) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8045.m21377(android.app.Activity, l.ۘ᩹ۘ):int");
    }

    static {
        f24802 = C16014.m37867("libwbsafeedit", ".so");
        String str = Build.CPU_ABI;
        if (str == null || str.equals("")) {
            f24803 = "libwbsafeedit";
            f24802 = C16014.m37867("libwbsafeedit", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is arm(default) architecture");
            return;
        }
        if (str.equalsIgnoreCase("arm64-v8a")) {
            f24803 = "libwbsafeedit_64";
            f24802 = C16014.m37867("libwbsafeedit_64", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        } else if (str.equalsIgnoreCase("x86")) {
            f24803 = "libwbsafeedit_x86";
            f24802 = C16014.m37867("libwbsafeedit_x86", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is x86 architecture");
        } else if (str.equalsIgnoreCase("x86_64")) {
            f24803 = "libwbsafeedit_x86_64";
            f24802 = C16014.m37867("libwbsafeedit_x86_64", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        } else {
            f24803 = "libwbsafeedit";
            f24802 = C16014.m37867("libwbsafeedit", ".so");
            C9145.m23518("openSDK_LOG.AuthAgent", "is arm(default) architecture");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21378() {
        this.f24805 = null;
    }
}
