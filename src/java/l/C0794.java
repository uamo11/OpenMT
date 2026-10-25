package l;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: N673 */
/* renamed from: l.֨֨ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0794 {
    public static long transferTo(InputStream inputStream, OutputStream outputStream) {
        C11003.requireNonNull(outputStream, "out");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read < 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }
}
