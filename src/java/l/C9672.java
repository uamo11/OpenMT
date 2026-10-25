package l;

import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: N4Y9 */
/* renamed from: l.ۢܶܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9672 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f29273;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashSet f29274;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap f29275;

    static {
        f29273 = Build.VERSION.SDK_INT >= 30 && Environment.isExternalStorageManager();
        f29275 = new HashMap();
        f29274 = new HashSet();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m24603() {
        if (f29273) {
            return false;
        }
        return C4925.f15523.getBoolean("use_external_storage_api", Build.VERSION.SDK_INT < 30);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m24600(File file) {
        String path = file.getPath();
        C4216 m45449 = C19739.m45449(path);
        if (m45449 == null) {
            return null;
        }
        if (!m24603()) {
            return new C11293(file, false);
        }
        Uri m24601 = m24601(m45449);
        if (m24601 == null) {
            return null;
        }
        String path2 = m45449.f13687.getPath();
        if (path.length() == path2.length()) {
            return new C6849(file, m24601);
        }
        String substring = path.substring(path2.length() + 1);
        String m34871 = C14609.m34871(m24601);
        if (m34871 == null) {
            throw new RuntimeException("Invalid tree uri: " + m24601);
        }
        String substring2 = substring.startsWith("/") ? substring.substring(1) : substring;
        if (substring2.endsWith("/")) {
            substring2 = C15472.m36561(1, 0, substring2);
        }
        if (substring2.isEmpty()) {
            throw new IllegalArgumentException("Invalid Child name: ".concat(substring));
        }
        List<String> pathSegments = m24601.getPathSegments();
        Uri.Builder appendPath = new Uri.Builder().scheme(m24601.getScheme()).authority(m24601.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document");
        String substring3 = pathSegments.size() == 2 ? pathSegments.get(1).substring(m34871.length() + 1) : pathSegments.get(3).substring(m34871.length() + 1);
        if (!substring3.isEmpty()) {
            substring2 = substring3.endsWith("/") ? substring3.concat(substring2) : C22870.m50967(substring3, "/", substring2);
        }
        return new C6849(file, appendPath.appendPath(m34871 + ":" + substring2).build());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r6.getCount() > 0) goto L20;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri m24601(l.C4216 r12) {
        /*
            java.io.File r0 = r12.f13687
            java.lang.String r0 = r0.getPath()
            java.util.HashMap r1 = l.C9672.f29275
            java.lang.Object r2 = r1.get(r0)
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 != 0) goto L72
            java.lang.String r12 = r12.f13688
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            java.lang.String r12 = ":"
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r2 = 1
            android.net.Uri r12 = l.C14609.m34868(r12, r2)
            java.util.HashSet r3 = l.C9672.f29274
            boolean r4 = r3.contains(r12)
            r5 = 0
            if (r4 == 0) goto L32
            return r5
        L32:
            android.app.Application r4 = l.C4925.m14335()
            android.content.ContentResolver r6 = r4.getContentResolver()
            r4 = 0
            android.net.Uri r7 = l.C14609.m34869(r12)     // Catch: java.lang.Throwable -> L67
            java.lang.String r8 = "document_id"
            java.lang.String[] r8 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L67
            r10 = 0
            r11 = 0
            r9 = 0
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L5f
            int r7 = r6.getCount()     // Catch: java.lang.Throwable -> L55
            if (r7 <= 0) goto L5f
            goto L60
        L55:
            r2 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r6 = move-exception
            r2.addSuppressed(r6)     // Catch: java.lang.Throwable -> L67
        L5e:
            throw r2     // Catch: java.lang.Throwable -> L67
        L5f:
            r2 = 0
        L60:
            if (r6 == 0) goto L65
            r6.close()     // Catch: java.lang.Throwable -> L67
        L65:
            r4 = r2
            goto L68
        L67:
        L68:
            if (r4 != 0) goto L6e
            r3.add(r12)
            return r5
        L6e:
            r1.put(r0, r12)
            return r12
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9672.m24601(l.ۘ᩸ܿ):android.net.Uri");
    }
}
