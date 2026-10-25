package l;

import java.io.InputStream;

/* compiled from: R6YN */
/* renamed from: l.ᩳۡۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17946 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16534 m41948(AbstractC15440 abstractC15440, long j, int i) {
        InputStream mo27926 = abstractC15440.mo27926();
        try {
            C16534 m41947 = m41947(mo27926, j, i, C14460.m34532());
            mo27926.close();
            return m41947;
        } catch (Throwable th) {
            if (mo27926 != null) {
                try {
                    mo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16534 m41947(java.io.InputStream r19, long r20, int r22, java.security.MessageDigest r23) {
        /*
            r1 = r20
            r0 = r22
            long r3 = (long) r0
            java.lang.String r5 = "byteOffset"
            long r3 = l.C21474.m48627(r5, r1, r3)
            r5 = 65536(0x10000, float:9.1835E-41)
            byte[] r5 = new byte[r5]
            byte[] r0 = new byte[r0]
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = r19
        L17:
            int r11 = r10.read(r5)
            if (r11 != 0) goto L29
            int r11 = r19.read()
            if (r11 >= 0) goto L24
            goto L2b
        L24:
            byte r11 = (byte) r11
            r5[r6] = r11
            r11 = 1
            goto L49
        L29:
            if (r11 >= 0) goto L49
        L2b:
            byte[] r10 = new byte[r9]
            java.lang.System.arraycopy(r0, r6, r10, r6, r9)
            byte[] r0 = r23.digest()
            java.lang.String r0 = l.C14460.m34531(r0)
            r3 = 16
            java.lang.String r5 = r0.substring(r6, r3)
            l.ܽۡۜ r9 = new l.ܽۡۜ
            r0 = r9
            r1 = r20
            r3 = r7
            r6 = r10
            r0.<init>(r1, r3, r5, r6)
            return r9
        L49:
            long r12 = (long) r11
            java.lang.String r14 = "totalBytes"
            long r12 = l.C21474.m48627(r14, r7, r12)
            r14 = r23
            r14.update(r5, r6, r11)
            long r15 = java.lang.Math.max(r7, r1)
            long r17 = java.lang.Math.min(r12, r3)
            int r6 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r6 >= 0) goto L6b
            long r6 = r15 - r7
            int r7 = (int) r6
            long r1 = r17 - r15
            int r2 = (int) r1
            java.lang.System.arraycopy(r5, r7, r0, r9, r2)
            int r9 = r9 + r2
        L6b:
            r6 = 0
            r1 = r20
            r7 = r12
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17946.m41947(java.io.InputStream, long, int, java.security.MessageDigest):l.ܽۡۜ");
    }
}
