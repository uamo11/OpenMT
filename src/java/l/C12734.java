package l;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: 27ZX */
/* renamed from: l.۫᩻ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12734 extends OutputStream {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long[] f38293;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1654 f38294;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f38295;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f38291 = true;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f38297 = false;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f38298 = new int[1];

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f38296 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38300 = 0;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f38301 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6384 f38292 = new C6384();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f38299 = new byte[1];

    public C12734(C1654 c1654, byte[] bArr, long[] jArr) {
        this.f38294 = c1654;
        this.f38295 = bArr;
        this.f38293 = jArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x007b */
    @Override // java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.f38291
            r1 = 0
            if (r0 == 0) goto L14
            l.֫ۜۘ r0 = r10.f38294
            int r0 = l.C1654.m5581(r0)
            r10.f38296 = r0
            l.֫ۜۘ r0 = r10.f38294
            l.C1654.m5581(r0)
            r10.f38291 = r1
        L14:
            boolean r0 = r10.f38297
            if (r0 != 0) goto Lb5
        L18:
            if (r13 <= 0) goto Lb4
            l.֫ۜۘ r0 = r10.f38294     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            boolean r0 = l.C1654.m5577(r0)     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            r9 = 4
            if (r0 == 0) goto L38
            l.֫ۜۘ r0 = r10.f38294     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            long r2 = r0.f63922     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            byte[] r0 = r10.f38295     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r0 = r0.length     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            r4 = 21
            int r0 = l.C19373.m44633(r0, r4, r13, r9)
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L38
            r10.flush()     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
        L38:
            l.֫ۜۘ r2 = r10.f38294     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            byte[] r3 = r10.f38295     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            long[] r0 = r10.f38293     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            r4 = r0[r1]     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            r6 = r11
            r7 = r12
            r8 = r13
            int r0 = l.C1654.m5552(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r2 = r10.f38301     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r2 = r2 + 1
            r10.f38301 = r2     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            long[] r2 = r10.f38293     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            r3 = r2[r1]     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            long r5 = (long) r0     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            long r3 = r3 + r5
            r2[r1] = r3     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r12 = r12 + r0
            int r13 = r13 - r0
            l.֫ۜۘ r0 = r10.f38294     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r0 = l.C1654.m5581(r0)     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r0 = r0 + (-1)
            int r2 = r10.f38296     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            if (r0 == r2) goto L71
            l.֫ۜۘ r0 = r10.f38294     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            java.io.InputStream r0 = l.C1654.m5574(r0)     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r0 = r0.available()     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L18
        L71:
            l.֫ۜۘ r0 = r10.f38294     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            java.io.InputStream r0 = l.C1654.m5574(r0)     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r0 = r0.available()     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            if (r0 <= 0) goto L18
            l.֫ۜۘ r0 = r10.f38294     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int[] r2 = r10.f38298     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            l.ۛ᩻ۘ r3 = r10.f38292     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            l.C1654.m5563(r0, r2, r3)     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int[] r0 = r10.f38298     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            r0 = r0[r1]     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r2 = r10.f38296     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            if (r2 > r0) goto L9f
            l.֫ۜۘ r2 = r10.f38294     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r2 = l.C1654.m5581(r2)     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r2 = r2 + (-1)
            if (r0 > r2) goto L9f
            int r0 = r10.f38300     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            int r0 = r0 + 1
            r10.f38300 = r0     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            goto L71
        L9f:
            l.ܽۡۘ r11 = new l.ܽۡۘ     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            java.lang.String r12 = ""
            r11.<init>(r9, r12)     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
            throw r11     // Catch: java.lang.Exception -> La7 java.io.IOException -> Lb2
        La7:
            r11 = move-exception
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = r11.toString()
            r12.<init>(r13, r11)
            throw r12
        Lb2:
            r11 = move-exception
            throw r11
        Lb4:
            return
        Lb5:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "stream already closed"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12734.write(byte[], int, int):void");
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.f38299;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.f38297) {
            throw new IOException("stream already closed");
        }
        if (this.f38291) {
            return;
        }
        while (this.f38301 > this.f38300) {
            try {
                this.f38294.m5569((int[]) null, this.f38292);
                this.f38300++;
            } catch (C16532 e) {
                throw new IOException(e.toString(), e);
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f38297) {
            return;
        }
        flush();
        try {
            C1654.m5562(this.f38294, this.f38295, this.f38292);
            this.f38297 = true;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
