package l;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: C9A2 */
/* renamed from: l.ۚ۠ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5233 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m15115(C12993 c12993) {
        return m15116(c12993, "Android/data/");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m15113() {
        return m15114("Android/data/");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15119(C12993 c12993) {
        return m15116(c12993, "Android/obb/");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15117() {
        return m15114("Android/obb/");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m15116(C12993 c12993, String str) {
        ArrayList m15118 = m15118(str);
        for (int i = 0; i < m15118.size(); i++) {
            C0293 c0293 = (C0293) m15118.get(i);
            File file = new File(c12993.mo23554(), c0293.f1649);
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(c0293.f1649);
            String sb = m15339.toString();
            m15118.set(i, new C12993(file, sb, sb, new C4527(-1L, c0293.f1648, true)));
        }
        return m15118;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m15114(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m15118(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((C0293) it.next()).f1649);
        }
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m15118(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : C12993.f38909.keySet()) {
            if (str2.startsWith(str) && new C14798(new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath("primary:".concat(str2)).appendPath("document").appendPath("primary:".concat(str2)).build()).mo23120()) {
                String substring = str2.substring(str.length());
                if (substring.endsWith("/")) {
                    substring = C15472.m36561(1, 0, substring);
                }
                if (substring.indexOf(47) == -1) {
                    arrayList.add(substring);
                    arrayList2.add(new C0293(new File(Environment.getExternalStorageDirectory(), str.concat(substring)).lastModified(), substring));
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        for (PackageInfo packageInfo : C4925.m14320().getInstalledPackages(0)) {
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(packageInfo.packageName);
            File file = new File(externalStorageDirectory, m15339.toString());
            if (!hashSet.contains(packageInfo.packageName) && file.isDirectory()) {
                arrayList2.add(new C0293(file.lastModified(), packageInfo.packageName));
            }
        }
        return arrayList2;
    }
}
