package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: D9O0 */
/* renamed from: l.ۘ᩶ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4170 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C16278 f13601 = C16278.m38297();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f13599 = new Object();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2759 f13600 = null;

    /* JADX WARN: Can't wrap try/catch for region: R(22:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:65|66)(1:28)|29|(9:36|(1:40)|(1:60)(1:47)|48|(2:56|57)|52|53|54|55)|(1:64)|(1:40)|(1:42)|60|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009c, code lost:
    
        r5 = 1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m12611(android.content.Context r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4170.m12611(android.content.Context, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2759 m12610() {
        C2759 c2759 = new C2759();
        f13600 = c2759;
        f13601.m38298(c2759);
        return f13600;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m12609(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return C9109.m23475(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
