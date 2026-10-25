package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: 08FX */
/* renamed from: l.۫ܶ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12498 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30668(C8414 c8414, C1358 c1358, AbstractC15440 abstractC15440, InterfaceC13203 interfaceC13203) {
        m30667(c8414, c1358, abstractC15440, false, interfaceC13203);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30669(C10531 c10531, C1358 c1358, AbstractC15440 abstractC15440, InterfaceC13203 interfaceC13203) {
        m30667(c10531, c1358, abstractC15440, true, interfaceC13203);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.InputStream, java.lang.AutoCloseable] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30667(Closeable closeable, C1358 c1358, AbstractC15440 abstractC15440, boolean z, InterfaceC13203 interfaceC13203) {
        OutputStream outputStream;
        ?? r3;
        OutputStream outputStream2 = null;
        try {
            if (closeable instanceof C10531) {
                r3 = ((C10531) closeable).m26453(c1358);
            } else {
                if (!(closeable instanceof C8414)) {
                    throw new AssertionError(closeable.getClass());
                }
                r3 = (C8414) closeable;
            }
            try {
                OutputStream mo23555 = abstractC15440.mo23555(false);
                try {
                    byte[] bArr = new byte[4096];
                    long m4765 = c1358.m4765();
                    long j = 0;
                    do {
                        int read = r3.read(bArr);
                        if (read > 0) {
                            mo23555.write(bArr, 0, read);
                            j += read;
                            if (m4765 > 0) {
                                interfaceC13203.mo32038(j, m4765);
                            }
                        } else {
                            mo23555.close();
                            if (!z && C4925.m14321()) {
                                abstractC15440.mo18537(c1358.m4758().getTime());
                            }
                            if (r3 != closeable) {
                                C0349.m1793(r3);
                                return;
                            }
                            return;
                        }
                    } while (!interfaceC13203.mo1526());
                    C0349.m1793(mo23555);
                    abstractC15440.mo23552();
                    if (r3 != closeable) {
                        C0349.m1793(r3);
                    }
                } catch (Throwable th) {
                    th = th;
                    outputStream2 = mo23555;
                    OutputStream outputStream3 = r3;
                    outputStream = outputStream2;
                    outputStream2 = outputStream3;
                    if (outputStream2 != closeable) {
                        C0349.m1793(outputStream2);
                    }
                    C0349.m1793(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m30663(BufferedInputStream bufferedInputStream) {
        return m30666(bufferedInputStream, new C1327(bufferedInputStream), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m30665(BufferedInputStream bufferedInputStream, InterfaceC1629 interfaceC1629) {
        return m30666(bufferedInputStream, interfaceC1629, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m30664(BufferedInputStream bufferedInputStream, C1327 c1327) {
        return m30666(bufferedInputStream, c1327, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m30666(BufferedInputStream bufferedInputStream, InterfaceC1629 interfaceC1629, boolean z) {
        if (!bufferedInputStream.markSupported()) {
            throw new IllegalArgumentException();
        }
        byte[] m37678 = EnumC15915.m37678();
        bufferedInputStream.mark(m37678.length);
        int m49844 = C22194.m49844(bufferedInputStream, m37678, m37678.length);
        bufferedInputStream.reset();
        InputStream inputStream = null;
        try {
            for (EnumC15915 enumC15915 : EnumC15915.values()) {
                if (enumC15915.m37682(m37678, m49844)) {
                    InputStream inputStream2 = (InputStream) interfaceC1629.get();
                    try {
                        return z ? enumC15915.m37683(inputStream2) : enumC15915.m37680(inputStream2);
                    } catch (IOException e) {
                        e = e;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        throw e;
                    }
                }
            }
            return null;
        } catch (IOException e2) {
            e = e2;
        }
    }
}
