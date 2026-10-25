package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: D9YD */
/* renamed from: l.ܺܺ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16044 implements InterfaceC6873, AutoCloseable {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f49485 = new AtomicInteger(1);

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49486 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C11504 f49487;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49488;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f49489;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f49490;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49491;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23806 f49492;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC13619 f49493;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16044(java.lang.String r18, l.InterfaceC18663 r19) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16044.<init>(java.lang.String, l.ᩴۡ᩵):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37956(int i, int i2, byte[] bArr, byte[] bArr2) {
        InterfaceC13619 interfaceC13619 = this.f49493;
        if (interfaceC13619.mo32736()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        int mo32734 = interfaceC13619.mo32734(i, bArr, i2, bArr2, this.f49491);
        short m8902 = C2913.m8902(8, bArr2);
        if (m8902 > this.f49491) {
            throw new IOException(C19370.m44628(m8902, "Unexpected fragment length: "));
        }
        while (mo32734 < m8902) {
            int mo32738 = interfaceC13619.mo32738(mo32734, m8902 - mo32734, bArr2);
            if (mo32738 == 0) {
                throw new IOException("Unexpected EOF");
            }
            mo32734 += mo32738;
        }
        return mo32734;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m37953(AbstractC8990 abstractC8990, byte[] bArr, C13222 c13222) {
        int i = c13222.f39585.f39588 - 24;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int i4 = i3 + 24;
            int i5 = this.f49488;
            if (i4 > i5) {
                abstractC8990.f27321 &= -3;
                i3 = i5 - 24;
            } else {
                abstractC8990.f27321 |= 2;
                abstractC8990.f27322 = i3;
            }
            abstractC8990.f27319 = i3 + 24;
            if (i2 > 0) {
                abstractC8990.f27321 &= -2;
            }
            if ((abstractC8990.f27321 & 3) != 3) {
                c13222.f39587 = i2;
                c13222.f39586 = i2;
                c13222.f39588 = 0;
                c13222.f39585 = c13222;
                abstractC8990.m23233(c13222);
                c13222.m32069(abstractC8990.f27322);
                c13222.m32067(0);
                c13222.m32067(abstractC8990.mo12171());
            }
            if ((abstractC8990.f27321 & 2) == 2) {
                return i2;
            }
            int i6 = abstractC8990.f27319;
            InterfaceC13619 interfaceC13619 = this.f49493;
            if (interfaceC13619.mo32736()) {
                throw new IOException("DCERPC pipe is no longer open");
            }
            interfaceC13619.mo32735(i2, i6, bArr);
            i2 += i3;
        }
        throw new IOException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37955() {
        return this.f49491;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C11504 c11504 = this.f49487;
        this.f49490 = 0;
        try {
            this.f49493.close();
        } finally {
            c11504.close();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37958() {
        return this.f49488;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m37957(l.AbstractC8990 r9) {
        /*
            r8 = this;
            int r0 = r8.f49490
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1e
            r0 = r8
            monitor-enter(r0)
            r8.f49490 = r1     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            l.ܳܺ᩵ r3 = new l.ܳܺ᩵     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            l.᩻ܺ᩵ r4 = r8.f49492     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            r3.<init>(r4, r8)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            r8.m37957(r3)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1e
        L16:
            r9 = move-exception
            goto L1c
        L18:
            r9 = move-exception
            r8.f49490 = r2     // Catch: java.lang.Throwable -> L16
            throw r9     // Catch: java.lang.Throwable -> L16
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r9
        L1e:
            l.ᩴۡ᩵ r0 = r8.f49489
            l.ۤ֡᩵ r0 = r0.mo27542()
            byte[] r0 = r0.m25072()
            l.ᩴۡ᩵ r3 = r8.f49489
            l.ۤ֡᩵ r3 = r3.mo27542()
            byte[] r3 = r3.m25072()
            l.۬ܺ᩵ r4 = new l.۬ܺ᩵     // Catch: java.lang.Throwable -> La3
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> La3
            r5 = 3
            r9.f27321 = r5     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.atomic.AtomicInteger r5 = l.C16044.f49485     // Catch: java.lang.Throwable -> La3
            int r5 = r5.incrementAndGet()     // Catch: java.lang.Throwable -> La3
            r9.f27323 = r5     // Catch: java.lang.Throwable -> La3
            r9.mo2235(r4)     // Catch: java.lang.Throwable -> La3
            int r4 = r8.m37953(r9, r3, r4)     // Catch: java.lang.Throwable -> La3
            int r5 = r9.f27319     // Catch: java.lang.Throwable -> La3
            int r4 = r8.m37956(r4, r5, r3, r0)     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L6b
            l.۬ܺ᩵ r5 = new l.۬ܺ᩵     // Catch: java.lang.Throwable -> La3
            r5.<init>(r0, r2)     // Catch: java.lang.Throwable -> La3
            r5.f39588 = r2     // Catch: java.lang.Throwable -> La3
            r5.f39585 = r5     // Catch: java.lang.Throwable -> La3
            r6 = 8
            r5.f39586 = r6     // Catch: java.lang.Throwable -> La3
            int r6 = r5.m32062()     // Catch: java.lang.Throwable -> La3
            l.۬ܺ᩵ r7 = r5.f39585     // Catch: java.lang.Throwable -> La3
            r7.f39588 = r6     // Catch: java.lang.Throwable -> La3
            r5.f39586 = r2     // Catch: java.lang.Throwable -> La3
            r9.m23232(r5)     // Catch: java.lang.Throwable -> La3
        L6b:
            if (r4 == 0) goto L81
            int r4 = r9.f27321     // Catch: java.lang.Throwable -> La3
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L74
            goto L75
        L74:
            r1 = 0
        L75:
            if (r1 != 0) goto L81
            l.۬ܺ᩵ r1 = new l.۬ܺ᩵     // Catch: java.lang.Throwable -> La3
            byte[] r4 = r8.m37954(r9, r0)     // Catch: java.lang.Throwable -> La3
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> La3
            goto L86
        L81:
            l.۬ܺ᩵ r1 = new l.۬ܺ᩵     // Catch: java.lang.Throwable -> La3
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> La3
        L86:
            r9.mo2234(r1)     // Catch: java.lang.Throwable -> La3
            l.ᩴۡ᩵ r1 = r8.f49489
            l.ۤ֡᩵ r1 = r1.mo27542()
            r1.m25071(r0)
            l.ᩴۡ᩵ r0 = r8.f49489
            l.ۤ֡᩵ r0 = r0.mo27542()
            r0.m25071(r3)
            l.ۢܺ᩵ r9 = r9.mo23231()
            if (r9 != 0) goto La2
            return
        La2:
            throw r9
        La3:
            r9 = move-exception
            l.ᩴۡ᩵ r1 = r8.f49489
            l.ۤ֡᩵ r1 = r1.mo27542()
            r1.m25071(r0)
            l.ᩴۡ᩵ r0 = r8.f49489
            l.ۤ֡᩵ r0 = r0.mo27542()
            r0.m25071(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16044.m37957(l.ۡܺ᩵):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m37954(AbstractC8990 abstractC8990, byte[] bArr) {
        int i = abstractC8990.f27318 == 2 ? abstractC8990.f27319 : 24;
        int i2 = this.f49491;
        byte[] bArr2 = new byte[i2];
        C13222 c13222 = new C13222(bArr2, 0);
        while ((abstractC8990.f27321 & 2) != 2) {
            InterfaceC13619 interfaceC13619 = this.f49493;
            int mo32738 = interfaceC13619.mo32738(0, i2, bArr2);
            if (bArr2[0] != 5 || bArr2[1] != 0) {
                throw new IOException("Unexpected DCERPC PDU header");
            }
            short m8902 = C2913.m8902(8, bArr2);
            if (m8902 > i2) {
                throw new IOException(C19370.m44628(m8902, "Unexpected fragment length: "));
            }
            while (mo32738 < m8902) {
                int mo327382 = interfaceC13619.mo32738(mo32738, m8902 - mo32738, bArr2);
                if (mo327382 == 0) {
                    throw new IOException("Unexpected EOF");
                }
                mo32738 += mo327382;
            }
            c13222.f39588 = 0;
            c13222.f39585 = c13222;
            c13222.f39586 = 8;
            c13222.f39585.f39588 = c13222.m32062();
            c13222.f39586 = c13222.f39587;
            c13222.f39588 = 0;
            c13222.f39585 = c13222;
            abstractC8990.m23232(c13222);
            int i3 = abstractC8990.f27319 - 24;
            int i4 = i + i3;
            if (i4 > bArr.length) {
                byte[] bArr3 = new byte[i4];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                bArr = bArr3;
            }
            System.arraycopy(bArr2, 24, bArr, i, i3);
            i = i4;
        }
        return bArr;
    }

    public final String toString() {
        return this.f49492.toString();
    }
}
