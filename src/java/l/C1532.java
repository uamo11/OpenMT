package l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: Y6XM */
/* renamed from: l.֫ۖۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1532 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7567 m5240(AbstractC15440 abstractC15440, String str, long j, long j2, int i, int i2) {
        InputStream mo27926 = abstractC15440.mo27926();
        try {
            C7567 m5239 = m5239(mo27926, str, j, j2, i, i2, C14460.m34532());
            if (mo27926 != null) {
                mo27926.close();
            }
            return m5239;
        } catch (Throwable th) {
            if (mo27926 == null) {
                throw th;
            }
            try {
                mo27926.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23089 m5241(InputStream inputStream, String str, long j, long j2, int i, int i2) {
        try {
            byte[] bArr = new byte[32768];
            int m5238 = m5238(inputStream, bArr);
            if (m5238 != 32768) {
                bArr = Arrays.copyOf(bArr, m5238);
            }
            C17095 m33920 = C14272.m33920(str, bArr);
            int i3 = m33920.f52401;
            SequenceInputStream sequenceInputStream = new SequenceInputStream(new ByteArrayInputStream(bArr, i3, m5238 - i3), inputStream);
            CharsetDecoder newDecoder = m33920.f52402.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
            try {
                C13916 c13916 = new C13916(i, i2, j, j2);
                m5242(new C12506(inputStreamReader), c13916, false);
                C23089 c23089 = new C23089(C13916.m33325(c13916), m33920.f52403);
                inputStreamReader.close();
                inputStream.close();
                return c23089;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7567 m5239(InputStream inputStream, String str, long j, long j2, int i, int i2, MessageDigest messageDigest) {
        byte[] bArr = new byte[32768];
        int m5238 = m5238(inputStream, bArr);
        messageDigest.update(bArr, 0, m5238);
        if (m5238 != 32768) {
            bArr = Arrays.copyOf(bArr, m5238);
        }
        C17095 m33920 = C14272.m33920(str, bArr);
        int i3 = m33920.f52401;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i3, m5238 - i3);
        C10390 c10390 = new C10390(inputStream);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream, new DigestInputStream(c10390, messageDigest));
        CharsetDecoder newDecoder = m33920.f52402.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        InputStreamReader inputStreamReader = new InputStreamReader(sequenceInputStream, newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction));
        try {
            C13916 c13916 = new C13916(i, i2, j, j2);
            m5242(new C12506(inputStreamReader), c13916, true);
            C11801 m33325 = C13916.m33325(c13916);
            C7567 c7567 = new C7567(m33325.f35202, m33920.f52403, j, j2, m33325.f35200, m33325.f35201, m33325.f35196, m33325.f35203, m33325.f35199, C14460.m34531(messageDigest.digest()).substring(0, 16), m5238 + c10390.f31241, m33325.f35198, m33325.f35197, m33325.f35195);
            inputStreamReader.close();
            return c7567;
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5242(C12506 c12506, C13916 c13916, boolean z) {
        int i = -1;
        do {
            if (i < 0) {
                i = C12506.m30689(c12506);
            }
            if (i < 0) {
                return;
            }
            if (i == 13) {
                i = C12506.m30689(c12506);
                if (i == 10) {
                    C13916.m33327(c13916, "\r\n");
                } else {
                    C13916.m33327(c13916, "\r");
                }
            } else if (i == 10) {
                C13916.m33327(c13916, "\n");
            } else {
                C13916.m33326(c13916, i);
            }
            i = -1;
        } while (!C13916.m33330(c13916));
        if (z) {
            C12506.m30688(c12506);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5238(InputStream inputStream, byte[] bArr) {
        int read;
        int i = 0;
        while (i < bArr.length && (read = inputStream.read(bArr, i, bArr.length - i)) >= 0) {
            if (read == 0) {
                int read2 = inputStream.read();
                if (read2 < 0) {
                    break;
                }
                bArr[i] = (byte) read2;
                i++;
            } else {
                i += read;
            }
        }
        return i;
    }
}
