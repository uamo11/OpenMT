package l;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: 3650 */
/* renamed from: l.᩸ۙ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21344 implements InterfaceC14992 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f68778 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48377(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.f68778.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }

    @Override // l.InterfaceC14992
    /* renamed from: ֫ */
    public final File mo35518(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f68778.get(decode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            String path = canonicalFile.getPath();
            String path2 = file.getPath();
            String m49607 = C22049.m49607(path);
            String m496072 = C22049.m49607(path2);
            if (!m49607.equals(m496072)) {
                if (!m49607.startsWith(m496072 + '/')) {
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
            }
            return canonicalFile;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
