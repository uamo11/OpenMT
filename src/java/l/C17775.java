package l;

import java.io.InputStream;

/* compiled from: G5CT */
/* renamed from: l.ᩳۗ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17775 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m41633(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i > 0) {
            int read = inputStream.read(bArr, i2, i);
            if (read == -1) {
                throw new RuntimeException("unexpected EOF");
            }
            i2 += read;
            i -= read;
        }
        return bArr;
    }
}
