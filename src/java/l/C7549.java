package l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

/* compiled from: 19BY */
/* renamed from: l.۟ܶۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7549 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f23326;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File f23327;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f23328;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File f23329;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f23330;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f23331;

    public C7549(int i, String str, String str2, File file) {
        this.f23330 = i;
        this.f23328 = str;
        this.f23326 = str2;
        this.f23329 = file;
        this.f23327 = new File(file, "bash");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20275() {
        File file = this.f23327;
        return file.exists() && file.canExecute();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File m20276() {
        File file;
        File file2;
        File file3;
        File file4;
        boolean z = C2094.f6977;
        File file5 = this.f23329;
        if (z) {
            file = C2094.f6976;
            AbstractC15440 m39864 = C16999.m39864(file);
            if (m39864.mo23120()) {
                if (m39864.m36533()) {
                    if (!C11003.equals(m39864.m36519(), file5.getAbsolutePath())) {
                        m39864.mo23552();
                    } else {
                        file4 = C2094.f6976;
                        return file4;
                    }
                } else {
                    m39864.mo23552();
                }
            }
            try {
                String absolutePath = file5.getAbsolutePath();
                file2 = C2094.f6976;
                Os.symlink(absolutePath, file2.getAbsolutePath());
                file3 = C2094.f6976;
                return file3;
            } catch (ErrnoException unused) {
            }
        }
        return file5;
    }
}
