package l;

import com.alipay.sdk.m.o.b;
import org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi;

/* compiled from: S8PU */
/* renamed from: l.ۤ֡ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9941 {
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m25058(l.C16302 r17, l.C12762 r18) {
        /*
            r0 = r17
            r1 = r18
            r17.m38348()
            r2 = 3
            r3 = 8
            int r2 = m25056(r0, r2, r3, r3)
            r1.f38359 = r2
            r4 = 0
            r5 = -1
            if (r2 != r5) goto L15
            return r4
        L15:
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L27
            r6 = 1
            goto L28
        L27:
            r6 = 0
        L28:
            l.C22632.m50631(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = l.C8488.m22163(r10, r12)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            l.C8488.m22163(r14, r5)
            int r5 = r17.m38339()
            r14 = -1
            if (r5 >= r2) goto L44
            goto L62
        L44:
            long r5 = r0.m38349(r2)
            int r16 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r16 != 0) goto L69
            int r10 = r17.m38339()
            if (r10 >= r3) goto L53
            goto L62
        L53:
            long r10 = r0.m38349(r3)
            long r5 = r5 + r10
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L69
            int r3 = r17.m38339()
            if (r3 >= r7) goto L64
        L62:
            r5 = r14
            goto L69
        L64:
            long r10 = r0.m38349(r7)
            long r5 = r5 + r10
        L69:
            r1.f38357 = r5
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 != 0) goto L70
            return r4
        L70:
            r10 = 16
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto Lac
            r10 = 0
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L9d
            int r3 = r1.f38359
            r5 = 0
            if (r3 == r9) goto L96
            if (r3 == r2) goto L8f
            r2 = 17
            if (r3 == r2) goto L88
            goto L9d
        L88:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            l.ۡ᩵֫ r0 = l.C9080.m23440(r0, r5)
            throw r0
        L8f:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            l.ۡ᩵֫ r0 = l.C9080.m23440(r0, r5)
            throw r0
        L96:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            l.ۡ᩵֫ r0 = l.C9080.m23440(r0, r5)
            throw r0
        L9d:
            r2 = 11
            r3 = 24
            int r0 = m25056(r0, r2, r3, r3)
            r1.f38358 = r0
            r1 = -1
            if (r0 == r1) goto Lab
            return r9
        Lab:
            return r4
        Lac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Contains sub-stream with an invalid packet label "
            r0.<init>(r2)
            long r1 = r1.f38357
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            l.ۡ᩵֫ r0 = l.C9080.m23441(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9941.m25058(l.ܽ֨֫, l.۬֡ۧ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12057 m25057(C16302 c16302) {
        int i;
        int i2;
        char c;
        int i3;
        int i4 = 8;
        int m38343 = c16302.m38343(8);
        int m383432 = c16302.m38343(5);
        if (m383432 != 31) {
            switch (m383432) {
                case 0:
                    i = 96000;
                    break;
                case 1:
                    i = 88200;
                    break;
                case 2:
                    i = 64000;
                    break;
                case 3:
                    i = 48000;
                    break;
                case 4:
                    i = 44100;
                    break;
                case 5:
                    i = 32000;
                    break;
                case 6:
                    i = 24000;
                    break;
                case 7:
                    i = 22050;
                    break;
                case 8:
                    i = 16000;
                    break;
                case 9:
                    i = 12000;
                    break;
                case 10:
                    i = 11025;
                    break;
                case 11:
                    i = 8000;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw C9080.m23441("Unsupported sampling rate index " + m383432);
                case 15:
                    i = 57600;
                    break;
                case 16:
                    i = PKCS12KeyStoreSpi.MIN_ITERATIONS;
                    break;
                case 17:
                    i = 40000;
                    break;
                case 18:
                    i = 38400;
                    break;
                case 19:
                    i = 34150;
                    break;
                case 20:
                    i = 28800;
                    break;
                case 21:
                    i = 25600;
                    break;
                case 22:
                    i = b.j0;
                    break;
                case 23:
                    i = 19200;
                    break;
                case 24:
                    i = 17075;
                    break;
                case 25:
                    i = 14400;
                    break;
                case 26:
                    i = 12800;
                    break;
                case 27:
                    i = 9600;
                    break;
            }
        } else {
            i = c16302.m38343(24);
        }
        int m383433 = c16302.m38343(3);
        int i5 = 1;
        if (m383433 == 0) {
            i2 = 768;
        } else if (m383433 == 1) {
            i2 = 1024;
        } else if (m383433 == 2 || m383433 == 3) {
            i2 = 2048;
        } else {
            if (m383433 != 4) {
                throw C9080.m23441("Unsupported coreSbrFrameLengthIndex " + m383433);
            }
            i2 = 4096;
        }
        if (m383433 == 0 || m383433 == 1) {
            c = 0;
        } else if (m383433 == 2) {
            c = 2;
        } else if (m383433 == 3) {
            c = 3;
        } else {
            if (m383433 != 4) {
                throw C9080.m23441("Unsupported coreSbrFrameLengthIndex " + m383433);
            }
            c = 1;
        }
        c16302.m38351(2);
        m25060(c16302);
        int m383434 = c16302.m38343(5);
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = 16;
            if (i6 < m383434 + 1) {
                int m383435 = c16302.m38343(3);
                i7 += m25056(c16302, 5, 8, 16) + 1;
                if ((m383435 == 0 || m383435 == 2) && c16302.m38352()) {
                    m25060(c16302);
                }
                i6++;
            } else {
                int m25056 = m25056(c16302, 4, 8, 16) + 1;
                c16302.m38346();
                int i9 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i9 >= m25056) {
                        byte[] bArr = null;
                        if (c16302.m38352()) {
                            int m250562 = m25056(c16302, 2, 4, 8) + 1;
                            for (int i10 = 0; i10 < m250562; i10++) {
                                int m250563 = m25056(c16302, 4, 8, 16);
                                int m250564 = m25056(c16302, 4, 8, 16);
                                if (m250563 == 7) {
                                    int m383436 = c16302.m38343(4) + 1;
                                    c16302.m38351(4);
                                    byte[] bArr2 = new byte[m383436];
                                    for (int i11 = 0; i11 < m383436; i11++) {
                                        bArr2[i11] = (byte) c16302.m38343(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    c16302.m38351(m250564 * 8);
                                }
                            }
                        }
                        switch (i) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                throw C9080.m23441("Unsupported sampling rate " + i);
                        }
                        return new C12057(m38343, bArr, (int) (i * d), (int) (i2 * d));
                    }
                    int m383437 = c16302.m38343(2);
                    if (m383437 == 0) {
                        c16302.m38351(3);
                        if (c16302.m38352()) {
                            c16302.m38351(13);
                        }
                        if (c > 0) {
                            m25059(c16302);
                        }
                    } else if (m383437 == i5) {
                        c16302.m38351(3);
                        boolean m38352 = c16302.m38352();
                        if (m38352) {
                            c16302.m38351(13);
                        }
                        if (m38352) {
                            c16302.m38346();
                        }
                        if (c > 0) {
                            m25059(c16302);
                            i3 = c16302.m38343(2);
                        } else {
                            i3 = 0;
                        }
                        if (i3 > 0) {
                            c16302.m38351(6);
                            int m383438 = c16302.m38343(2);
                            c16302.m38351(4);
                            if (c16302.m38352()) {
                                c16302.m38351(5);
                            }
                            if (i3 == 2 || i3 == 3) {
                                c16302.m38351(6);
                            }
                            if (m383438 == 2) {
                                c16302.m38346();
                            }
                        }
                        int floor = ((int) Math.floor(Math.log(i7 - 1) / Math.log(2.0d))) + 1;
                        int m383439 = c16302.m38343(2);
                        if (m383439 > 0 && c16302.m38352()) {
                            c16302.m38351(floor);
                        }
                        if (c16302.m38352()) {
                            c16302.m38351(floor);
                        }
                        if (c == 0 && m383439 == 0) {
                            c16302.m38346();
                        }
                    } else if (m383437 == 3) {
                        m25056(c16302, 4, i4, i8);
                        int m250565 = m25056(c16302, 4, i4, i8);
                        if (c16302.m38352()) {
                            m25056(c16302, i4, i8, 0);
                        }
                        c16302.m38346();
                        if (m250565 > 0) {
                            c16302.m38351(m250565 * 8);
                        }
                    }
                    i9++;
                    i5 = 1;
                    i8 = 16;
                    i4 = 8;
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25060(C16302 c16302) {
        int m38343;
        int m383432 = c16302.m38343(2);
        if (m383432 == 0) {
            c16302.m38351(6);
            return;
        }
        int m25056 = m25056(c16302, 5, 8, 16) + 1;
        if (m383432 == 1) {
            c16302.m38351(m25056 * 7);
            return;
        }
        if (m383432 == 2) {
            boolean m38352 = c16302.m38352();
            int i = m38352 ? 1 : 5;
            int i2 = m38352 ? 7 : 5;
            int i3 = m38352 ? 8 : 6;
            int i4 = 0;
            while (i4 < m25056) {
                if (c16302.m38352()) {
                    c16302.m38351(7);
                    m38343 = 0;
                } else {
                    if (c16302.m38343(2) == 3 && c16302.m38343(i2) * i != 0) {
                        c16302.m38346();
                    }
                    m38343 = c16302.m38343(i3) * i;
                    if (m38343 != 0 && m38343 != 180) {
                        c16302.m38346();
                    }
                    c16302.m38346();
                }
                if (m38343 != 0 && m38343 != 180 && c16302.m38352()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25059(C16302 c16302) {
        c16302.m38351(3);
        c16302.m38351(8);
        boolean m38352 = c16302.m38352();
        boolean m383522 = c16302.m38352();
        if (m38352) {
            c16302.m38351(5);
        }
        if (m383522) {
            c16302.m38351(6);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25056(C16302 c16302, int i, int i2, int i3) {
        C22632.m50631(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        long j = i4 + i5;
        long j2 = (int) j;
        if (j != j2) {
            throw new ArithmeticException();
        }
        if (j2 + (1 << i3) != ((int) r5)) {
            throw new ArithmeticException();
        }
        if (c16302.m38339() < i) {
            return -1;
        }
        int m38343 = c16302.m38343(i);
        if (m38343 == i4) {
            if (c16302.m38339() < i2) {
                return -1;
            }
            int m383432 = c16302.m38343(i2);
            m38343 += m383432;
            if (m383432 == i5) {
                if (c16302.m38339() < i3) {
                    return -1;
                }
                return c16302.m38343(i3) + m38343;
            }
        }
        return m38343;
    }
}
