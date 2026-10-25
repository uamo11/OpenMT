package l;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: GAZ9 */
/* renamed from: l.ۢ᩵ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9798 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashSet f29623;

    static {
        HashSet m35585 = C15045.m35585(25);
        Collections.addAll(m35585, ".hwbk", ".jpeg", ".jpg", ".bmp", ".gif", ".png", ".webp", ".3gp", ".asf", ".avi", ".mp4", ".mpe", ".mpeg", ".mpg", ".mpg4", ".m4u", ".m4v", ".mov", ".rmvb", ".wmv", ".3gpp", ".flv", ".ogv", ".mkv", ".dv");
        f29623 = m35585;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24829(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    m24829(file2);
                }
            }
            return file.delete();
        }
        return m24830(file);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m24830(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (f29623.contains(lastIndexOf == -1 ? "" : name.substring(lastIndexOf).toLowerCase(Locale.ROOT)) && file.isFile()) {
            File file2 = new File(file.getPath() + ".mt_force_delete");
            return file.renameTo(file2) && file2.delete();
        }
        return file.delete();
    }
}
