package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import bin.mt.plus.Features;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.o.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: 85H5 */
/* renamed from: l.᩺֨ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22660 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f73175 = new ArrayList();

    static {
        for (int i = 0; i < 5000; i++) {
            try {
                String m56 = Features.m56(i);
                if (m56 != null) {
                    f73175.add(new C11372(i, m56));
                }
            } catch (Throwable unused) {
            }
        }
        for (int i2 = OpenAuthTask.OK; i2 < 10000; i2++) {
            try {
                String m562 = Features.m56(i2);
                if (m562 != null) {
                    f73175.add(new C11372(i2, m562));
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m50656() {
        return C20195.unmodifiableList(f73175);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m50655() {
        int i;
        String m56;
        String m562;
        String m563;
        ArrayList arrayList = new ArrayList();
        try {
            List<PackageInfo> installedPackages = C4925.m14320().getInstalledPackages(0);
            ArrayList arrayList2 = f73175;
            C18683 c18683 = new C18683(arrayList2.size() + installedPackages.size());
            arrayList.addAll(arrayList2);
            for (PackageInfo packageInfo : installedPackages) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null && (i = applicationInfo.uid) >= 10000 && !c18683.contains(i)) {
                    try {
                        String m564 = Features.m56(applicationInfo.uid);
                        if (m564 != null) {
                            c18683.add(applicationInfo.uid);
                            arrayList.add(new C11372(applicationInfo.uid, m564, packageInfo, 0));
                        }
                        if (Features.f26 && !c18683.contains(applicationInfo.uid + 10000) && (m563 = Features.m56(applicationInfo.uid + 10000)) != null) {
                            c18683.add(applicationInfo.uid + 10000);
                            arrayList.add(new C11372(applicationInfo.uid + 10000, m563, packageInfo, 0));
                        }
                        if (Features.f25 && !c18683.contains(applicationInfo.uid + b.j0) && (m562 = Features.m56(applicationInfo.uid + b.j0)) != null) {
                            c18683.add(applicationInfo.uid + b.j0);
                            arrayList.add(new C11372(applicationInfo.uid + b.j0, m562, packageInfo, 0));
                        }
                        if (Features.f27 && !c18683.contains(applicationInfo.uid + 99900000) && (m56 = Features.m56(applicationInfo.uid + 99900000)) != null) {
                            c18683.add(applicationInfo.uid + 99900000);
                            arrayList.add(new C11372(applicationInfo.uid + 99900000, m56, packageInfo, 0));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (RuntimeException unused2) {
        }
        Collections.sort(arrayList, C8200.comparingInt(new C5727(0)));
        return arrayList;
    }
}
