package com.alipay.sdk.m.e0;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class a {
    public static char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    public static byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base32Encoder.DEFAULT_PADDING, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, cb.k, cb.f77931l, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 29, 30, bo.j, UTF8.S_CS3, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, UTF8.S_P3A, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r2 != (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r0.append((char) (r2 | ((r6 & 3) << 6)));
        r2 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r9) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "US-ASCII"
            byte[] r9 = r9.getBytes(r1)
            int r1 = r9.length
            r2 = 0
        Ld:
            java.lang.String r3 = "iso8859-1"
            if (r2 >= r1) goto L86
        L11:
            byte[] r4 = com.alipay.sdk.m.e0.a.b
            int r5 = r2 + 1
            r2 = r9[r2]
            r2 = r4[r2]
            r4 = -1
            if (r5 >= r1) goto L21
            if (r2 == r4) goto L1f
            goto L21
        L1f:
            r2 = r5
            goto L11
        L21:
            if (r2 != r4) goto L25
            goto L86
        L25:
            byte[] r6 = com.alipay.sdk.m.e0.a.b
            int r7 = r5 + 1
            r5 = r9[r5]
            r5 = r6[r5]
            if (r7 >= r1) goto L34
            if (r5 == r4) goto L32
            goto L34
        L32:
            r5 = r7
            goto L25
        L34:
            if (r5 != r4) goto L37
            goto L86
        L37:
            int r2 = r2 << 2
            r6 = r5 & 48
            int r6 = r6 >>> 4
            r2 = r2 | r6
            char r2 = (char) r2
            r0.append(r2)
        L42:
            int r2 = r7 + 1
            r6 = r9[r7]
            r7 = 61
            if (r6 != r7) goto L4b
            goto L86
        L4b:
            byte[] r8 = com.alipay.sdk.m.e0.a.b
            r6 = r8[r6]
            if (r2 >= r1) goto L56
            if (r6 == r4) goto L54
            goto L56
        L54:
            r7 = r2
            goto L42
        L56:
            if (r6 != r4) goto L59
            goto L86
        L59:
            r5 = r5 & 15
            int r5 = r5 << 4
            r8 = r6 & 60
            int r8 = r8 >>> 2
            r5 = r5 | r8
            char r5 = (char) r5
            r0.append(r5)
        L66:
            int r5 = r2 + 1
            r2 = r9[r2]
            if (r2 != r7) goto L6d
            goto L86
        L6d:
            byte[] r8 = com.alipay.sdk.m.e0.a.b
            r2 = r8[r2]
            if (r5 >= r1) goto L78
            if (r2 == r4) goto L76
            goto L78
        L76:
            r2 = r5
            goto L66
        L78:
            if (r2 != r4) goto L7b
            goto L86
        L7b:
            r3 = r6 & 3
            int r3 = r3 << 6
            r2 = r2 | r3
            char r2 = (char) r2
            r0.append(r2)
            r2 = r5
            goto Ld
        L86:
            java.lang.String r9 = r0.toString()
            byte[] r9 = r9.getBytes(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.e0.a.a(java.lang.String):byte[]");
    }
}
