package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: OJQ */
/* renamed from: l.۠ۨۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8152 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m21624(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream m3766 = C1096.m3766(byteArrayOutputStream, 2);
        m3766.write(bArr, 0, i);
        m3766.flush();
        m3766.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m21623(InputStream inputStream) {
        InputStream m3765 = C1096.m3765(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = m3765.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                m3765.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
