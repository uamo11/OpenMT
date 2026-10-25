package l;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: E6ZJ */
/* renamed from: l.ۤۢۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10206 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0236 f30664;

    public C10206(C0236 c0236) {
        this.f30664 = c0236;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m25616() {
        int indexOf;
        this.f30664.getClass();
        Application m14335 = C4925.m14335();
        ApplicationInfo applicationInfo = m14335.getApplicationInfo();
        TreeSet treeSet = new TreeSet();
        m25614(treeSet, applicationInfo.dataDir);
        if (Build.VERSION.SDK_INT >= 24) {
            m25614(treeSet, applicationInfo.deviceProtectedDataDir);
            m25614(treeSet, m14335.createDeviceProtectedStorageContext().getDataDir().getPath());
        }
        String packageName = m14335.getPackageName();
        String str = applicationInfo.dataDir;
        m25614(treeSet, C20094.m46315("/data/data/", packageName));
        m25614(treeSet, C20094.m46315("/data/user/0/", packageName));
        m25614(treeSet, C20094.m46315("/data/user_de/0/", packageName));
        if (str != null && str.startsWith("/data/user/") && (indexOf = str.indexOf(47, 11)) > 11) {
            String substring = str.substring(11, indexOf);
            m25614(treeSet, C19462.m44858("/data/user/", substring, "/", packageName));
            m25614(treeSet, C19462.m44858("/data/user_de/", substring, "/", packageName));
        }
        m25615(treeSet, m14335.getExternalFilesDirs(null), m14335.getPackageName());
        m25615(treeSet, m14335.getExternalCacheDirs(), m14335.getPackageName());
        File file = applicationInfo.sourceDir == null ? null : new File(applicationInfo.sourceDir);
        String parent = file == null ? null : file.getParent();
        m25614(treeSet, parent);
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                File file2 = str2 == null ? null : new File(str2);
                m25614(treeSet, file2 == null ? null : file2.getParent());
            }
        }
        String str3 = applicationInfo.nativeLibraryDir;
        if (str3 != null && (parent == null || !C12301.m29846(str3, parent))) {
            m25614(treeSet, applicationInfo.nativeLibraryDir);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(str4);
                    break;
                }
                if (C12301.m29846(str4, (String) it2.next())) {
                    break;
                }
            }
        }
        return C20195.unmodifiableList(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25615(TreeSet treeSet, File[] fileArr, String str) {
        if (fileArr == null) {
            return;
        }
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String str2 = null;
            File parentFile = file == null ? null : file.getParentFile();
            if (parentFile != null && str.equals(parentFile.getName())) {
                str2 = parentFile.getPath();
            } else if (file != null) {
                str2 = file.getPath();
            }
            m25614(treeSet, str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25614(TreeSet treeSet, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            String m29847 = C12301.m29847(str, "managedPath");
            if ("/".equals(m29847)) {
                return;
            }
            treeSet.add(m29847);
        } catch (C3059 unused) {
        }
    }
}
