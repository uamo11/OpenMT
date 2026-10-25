package l;

import java.io.File;

/* compiled from: J9LL */
/* renamed from: l.ۗ᩹ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3527 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10722(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                z = m10722(file2) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }
}
