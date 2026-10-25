package com.alipay.sdk.m.p;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class d {
    public static final String a = "RSA";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 0
            java.lang.String r1 = "RSA"
            java.security.PublicKey r6 = b(r1, r6)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r1 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r2 = 1
            r1.init(r2, r6)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            int r6 = r1.getBlockSize()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L46
            r3 = 0
        L21:
            int r4 = r5.length     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            if (r3 >= r4) goto L35
            int r4 = r5.length     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            int r4 = r4 - r3
            if (r4 >= r6) goto L2b
            int r4 = r5.length     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            int r4 = r4 - r3
            goto L2c
        L2b:
            r4 = r6
        L2c:
            byte[] r4 = r1.doFinal(r5, r3, r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r2.write(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            int r3 = r3 + r6
            goto L21
        L35:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L42
            r2.close()     // Catch: java.io.IOException -> L3d
            return r5
        L3d:
            r6 = move-exception
            r0 = r5
            goto L52
        L40:
            r5 = move-exception
            goto L59
        L42:
            r5 = move-exception
            goto L48
        L44:
            r5 = move-exception
            goto L58
        L46:
            r5 = move-exception
            r2 = r0
        L48:
            com.alipay.sdk.m.y.g.a(r5)     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
        L52:
            com.alipay.sdk.m.y.g.a(r6)
        L55:
            return r0
        L56:
            r5 = move-exception
            r0 = r2
        L58:
            r2 = r0
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r6 = move-exception
            com.alipay.sdk.m.y.g.a(r6)
        L63:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.p.d.a(java.lang.String, java.lang.String):byte[]");
    }

    public static PublicKey b(String str, String str2) {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(a.a(str2)));
    }
}
