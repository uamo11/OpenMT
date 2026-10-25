package com.alipay.sdk.m.p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(byte[] r6) {
        /*
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L44
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L44
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L34
        L14:
            int r3 = r1.read(r0)     // Catch: java.lang.Throwable -> L34
            r4 = -1
            if (r3 == r4) goto L20
            r4 = 0
            r2.write(r0, r4, r3)     // Catch: java.lang.Throwable -> L34
            goto L14
        L20:
            r2.flush()     // Catch: java.lang.Throwable -> L34
            r2.finish()     // Catch: java.lang.Throwable -> L34
            byte[] r0 = r6.toByteArray()     // Catch: java.lang.Throwable -> L34
            r1.close()     // Catch: java.lang.Exception -> L2d
        L2d:
            r6.close()     // Catch: java.lang.Exception -> L30
        L30:
            r2.close()     // Catch: java.lang.Exception -> L33
        L33:
            return r0
        L34:
            r0 = move-exception
            r5 = r2
            r2 = r0
            r0 = r1
            r1 = r5
            goto L48
        L3a:
            r2 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L48
        L3f:
            r6 = move-exception
            r2 = r6
            r6 = r0
            r0 = r1
            goto L47
        L44:
            r6 = move-exception
            r2 = r6
            r6 = r0
        L47:
            r1 = r6
        L48:
            if (r0 == 0) goto L4f
            r0.close()     // Catch: java.lang.Exception -> L4e
            goto L4f
        L4e:
        L4f:
            if (r6 == 0) goto L56
            r6.close()     // Catch: java.lang.Exception -> L55
            goto L56
        L55:
        L56:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Exception -> L5b
        L5b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.p.b.a(byte[]):byte[]");
    }

    public static byte[] b(byte[] bArr) {
        Throwable th;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArr2 = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = gZIPInputStream.read(bArr2, 0, 4096);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr2, 0, read);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused) {
                            }
                            try {
                                gZIPInputStream.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                byteArrayInputStream.close();
                                throw th;
                            } catch (Exception unused3) {
                                throw th;
                            }
                        }
                    }
                    byteArrayOutputStream2.flush();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        gZIPInputStream.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused6) {
                    }
                    return byteArray;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                gZIPInputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            gZIPInputStream = null;
            byteArrayInputStream = null;
        }
    }
}
