package l;

import java.io.Reader;

/* compiled from: 36TA */
/* renamed from: l.֨᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1352 extends Reader {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11936 f4904;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f4905;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C5377 f4906;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r0 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r0 == null) goto L42;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C1352 m4716(java.io.InputStream r5, l.C1143 r6) {
        /*
            r0 = 49152(0xc000, double:2.42843E-319)
            r2 = 0
            r3 = 0
            l.ۚ۬ᩳ r0 = r6.m3921(r0)     // Catch: java.lang.Error -> L28 java.lang.RuntimeException -> L2a java.io.IOException -> L2c
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L24 java.io.IOException -> L26
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r5, r4)     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L24 java.io.IOException -> L26
            r3 = 1
            l.ۨ᩶ᩳ r6 = l.C11936.m29122(r1, r6)     // Catch: java.lang.Error -> L22 java.lang.RuntimeException -> L24 java.io.IOException -> L26
            l.֨᩶ᩳ r1 = new l.֨᩶ᩳ     // Catch: java.lang.Error -> L1b java.lang.RuntimeException -> L1e java.io.IOException -> L20
            r1.<init>(r6, r0)     // Catch: java.lang.Error -> L1b java.lang.RuntimeException -> L1e java.io.IOException -> L20
            return r1
        L1b:
            r1 = move-exception
        L1c:
            r2 = r6
            goto L2f
        L1e:
            r1 = move-exception
            goto L1c
        L20:
            r1 = move-exception
            goto L1c
        L22:
            r1 = move-exception
            goto L2f
        L24:
            r1 = move-exception
            goto L2f
        L26:
            r1 = move-exception
            goto L2f
        L28:
            r6 = move-exception
            goto L2d
        L2a:
            r6 = move-exception
            goto L2d
        L2c:
            r6 = move-exception
        L2d:
            r1 = r6
            r0 = r2
        L2f:
            if (r2 == 0) goto L39
            r2.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            goto L4b
        L35:
            r5 = move-exception
            goto L45
        L37:
            r5 = move-exception
            goto L3f
        L39:
            if (r3 != 0) goto L4b
            r5.close()     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37
            goto L4b
        L3f:
            r1.addSuppressed(r5)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L50
            goto L4d
        L45:
            if (r0 == 0) goto L4a
            r0.close()
        L4a:
            throw r5
        L4b:
            if (r0 == 0) goto L50
        L4d:
            r0.close()
        L50:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1352.m4716(java.io.InputStream, l.֨۬ᩳ):l.֨᩶ᩳ");
    }

    public C1352(C11936 c11936, C5377 c5377) {
        this.f4904 = c11936;
        this.f4906 = c5377;
    }

    @Override // java.io.Reader
    public final int read() {
        return this.f4904.read();
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        return this.f4904.read(cArr, i, i2);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5377 c5377 = this.f4906;
        if (this.f4905) {
            return;
        }
        this.f4905 = true;
        try {
            this.f4904.close();
        } finally {
            c5377.close();
        }
    }
}
