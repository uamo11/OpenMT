package l;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: P9RB */
/* renamed from: l.۠۫ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8172 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m21646(String str) {
        InputStream resourceAsStream = C8172.class.getResourceAsStream(str);
        try {
            byte[] bArr = new byte[4];
            C22194.m49857(resourceAsStream, bArr, 4);
            if (C15972.m37744(0, bArr) != -1201511941) {
                throw new IOException("Bad magic");
            }
            byte[] m1795 = C0349.m1795(resourceAsStream, 0);
            for (int i = 0; i < m1795.length; i++) {
                m1795[i] = (byte) (m1795[i] ^ (m1795.length / 2));
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return m1795;
        } catch (Throwable th) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
