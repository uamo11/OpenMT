package l;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* compiled from: 22T0 */
/* renamed from: l.᩷ۤۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20812 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47627(AbstractC15440 abstractC15440, String str) {
        Throwable th;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (!abstractC15440.mo23119()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            inputStream = abstractC15440.mo27926();
            while (true) {
                try {
                    int read = inputStream.read(bArr, 0, 1024);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        String m34531 = C14460.m34531(messageDigest.digest());
                        C0349.m1793(inputStream);
                        return m34531;
                    }
                } catch (Exception unused) {
                    C0349.m1793(inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    C0349.m1793(inputStream2);
                    throw th;
                }
            }
        } catch (Exception unused2) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m47628(File file) {
        FileInputStream fileInputStream;
        try {
            int i = C15843.f48947;
            fileInputStream = new FileInputStream(file);
            try {
                byte[] m1795 = C0349.m1795(fileInputStream, 0);
                C22194.m49850((Closeable) fileInputStream);
                return m1795;
            } catch (Throwable th) {
                th = th;
                C22194.m49850((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
