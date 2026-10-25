package l;

import android.os.StrictMode;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.spi.FileSystemProvider;

/* compiled from: N673 */
/* renamed from: l.ۨۚᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11503 {
    public static final AbstractC13389 a;

    static {
        AbstractC13389 abstractC13389;
        if (AbstractC5858.b) {
            FileSystemProvider provider = FileSystems.getDefault().provider();
            int i = C10568.f;
            abstractC13389 = provider == null ? null : provider instanceof C6334 ? ((C6334) provider).a : new C10568(provider);
        } else {
            if (AbstractC5858.c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            abstractC13389 = AbstractC10673.a;
        }
        a = abstractC13389;
        abstractC13389.getFileSystem(URI.create("file:///"));
    }
}
