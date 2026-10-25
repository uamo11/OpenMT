package l;

import android.content.Context;
import android.os.Process;
import java.util.function.Supplier;

/* compiled from: 165Z */
/* renamed from: l.۫ۙ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C12171 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo29645(EnumC2815 enumC2815, int i, int i2, C13687 c13687) {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29642(boolean z) {
        if (z) {
            return;
        }
        m29636();
        throw null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29644(Object obj) {
        if (obj == null) {
            return;
        }
        m29636();
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29637(Object obj) {
        if (obj != null) {
            return;
        }
        m29636();
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29639(Object obj, boolean z) {
        if (z) {
            return;
        }
        m29640(String.valueOf(obj));
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29641(String str, boolean z) {
        if (z) {
            return;
        }
        m29640(str);
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29643(boolean z, Supplier supplier) {
        if (z) {
            return;
        }
        m29640((String) supplier.get());
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29635(Context context, String str) {
        int m46846;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String m46848 = C20450.m46848(str);
            if (m46848 != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && C11003.equals(packageName2, packageName)) {
                    m46846 = C20450.m46847(context, m46848, packageName, myUid);
                } else {
                    m46846 = C20450.m46846(context, m46848, packageName);
                }
                if (m46846 != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29638(Object obj, Supplier supplier) {
        if (obj != null) {
            return;
        }
        m29640((String) supplier.get());
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29636() {
        throw new AssertionError();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29640(String str) {
        throw new AssertionError(str);
    }
}
