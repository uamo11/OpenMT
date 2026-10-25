package l;

import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: P6N0 */
/* renamed from: l.۬᩺ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13421 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3544 m32437(ArrayList arrayList, C6841 c6841) {
        ExecutorService executorService;
        ArrayList arrayList2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Image export must run in the background");
        }
        File file = new File(C16293.f50111.mo23554());
        ExecutorService executorService2 = C1802.f6208;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C11003.requireNonNull(executorService2);
            ArrayList arrayList3 = new ArrayList(arrayList);
            if (arrayList3.isEmpty()) {
                throw new IllegalArgumentException("No images selected for export");
            }
            File file2 = null;
            try {
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int i = 0;
                long j = 0;
                while (i < arrayList3.size()) {
                    AbstractC22967.m51107(c6841);
                    AbstractC22967 abstractC22967 = (AbstractC22967) arrayList3.get(i);
                    C11003.requireNonNull(abstractC22967);
                    if (abstractC22967 instanceof C6366) {
                        throw new IOException("Sharing requires the original image source");
                    }
                    C11679 mo6179 = abstractC22967.mo6179();
                    File mo12024 = abstractC22967.mo12024();
                    if (mo12024 != null && mo12024.isFile() && mo12024.canRead()) {
                        abstractC22967.m51108(mo6179);
                        String str = C11914.f35616;
                        arrayList4.add(C11914.m29045(mo12024.getPath()));
                        executorService = executorService2;
                        arrayList2 = arrayList3;
                    } else {
                        long j2 = mo6179.f34804;
                        long j3 = 536870912 - j;
                        executorService = executorService2;
                        arrayList2 = arrayList3;
                        if (j2 <= 268435456 && j2 <= j3) {
                            if (file2 == null) {
                                file2 = m32439(file);
                            }
                            File file3 = new File(file2, Integer.toString(i));
                            if (!file3.mkdir()) {
                                throw new IOException("Cannot create image export directory");
                            }
                            File file4 = new File(file3, ".partial");
                            C4955 c4955 = new C4955(file4, Math.min(268435456L, j3), c6841);
                            try {
                                abstractC22967.mo6173((OutputStream) c4955, true, (InterfaceC17066) c6841);
                                AbstractC22967.m51107(c6841);
                                long j4 = c4955.f15618;
                                c4955.close();
                                abstractC22967.m51108(mo6179);
                                long j5 = mo6179.f34804;
                                if (j5 >= 0 && j4 != j5) {
                                    throw new C6034("Image export size differs from source snapshot");
                                }
                                File file5 = new File(file3, m32436(abstractC22967.mo6177()));
                                if (!file4.renameTo(file5)) {
                                    throw new IOException("Cannot publish image export file");
                                }
                                j += j4;
                                String str2 = C11914.f35616;
                                arrayList4.add(C11914.m29045(file5.getPath()));
                            } finally {
                            }
                        } else {
                            throw new IOException("Image export exceeds byte limit");
                        }
                    }
                    i++;
                    executorService2 = executorService;
                    arrayList3 = arrayList2;
                }
                ExecutorService executorService3 = executorService2;
                AbstractC22967.m51107(c6841);
                if (file2 != null && !file2.setLastModified(System.currentTimeMillis())) {
                    throw new IOException("Cannot timestamp image export directory");
                }
                return new C3544(arrayList4, file2, executorService3);
            } catch (Throwable th) {
                m32440(file2);
                throw th;
            }
        }
        throw new IllegalStateException("Image export must run in the background");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static File m32439(File file) {
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new IOException("Cannot create image export parent");
        }
        for (int i = 0; i < 8; i++) {
            int currentTimeMillis = (int) System.currentTimeMillis();
            File file2 = new File(file, "temp_" + Integer.toString(Math.abs(new Random().nextInt() + 1817260513), 36) + "_" + Integer.toString(currentTimeMillis, 36));
            if (file2.mkdir()) {
                return file2;
            }
        }
        throw new IOException("Cannot create unique image export batch");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32436(String str) {
        String str2;
        if (str != null && !str.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < str.length()) {
                int codePointAt = str.codePointAt(i);
                i += Character.charCount(codePointAt);
                if (codePointAt == 47 || codePointAt == 92 || Character.isISOControl(codePointAt)) {
                    codePointAt = 95;
                }
                sb.appendCodePoint(codePointAt);
            }
            String sb2 = sb.toString();
            if (!sb2.equals(".") && !sb2.equals("..")) {
                int lastIndexOf = sb2.lastIndexOf(46);
                if (sb2.endsWith(".9.png")) {
                    lastIndexOf = sb2.length() - 6;
                }
                if (lastIndexOf <= 0 || sb2.length() - lastIndexOf > 20) {
                    str2 = "";
                } else {
                    str2 = sb2.substring(lastIndexOf);
                    sb2 = sb2.substring(0, lastIndexOf);
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 < sb2.length()) {
                    int codePointAt2 = sb2.codePointAt(i2);
                    i3 += codePointAt2 < 128 ? 1 : codePointAt2 < 2048 ? 2 : codePointAt2 < 65536 ? 3 : 4;
                    if (i3 > 160) {
                        break;
                    }
                    i2 += Character.charCount(codePointAt2);
                }
                return sb2.substring(0, i2) + str2;
            }
        }
        return "image";
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m32440(File file) {
        if (file == null) {
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                File[] listFiles2 = file2.listFiles();
                if (listFiles2 != null) {
                    for (File file3 : listFiles2) {
                        file3.delete();
                    }
                }
                file2.delete();
            }
        }
        file.delete();
    }
}
