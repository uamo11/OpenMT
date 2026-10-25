package l;

import com.umeng.analytics.pro.bo;
import java.io.BufferedOutputStream;
import org.bouncycastle.asn1.BERTags;

/* compiled from: 2APZ */
/* renamed from: l.ۛۖܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5773 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C0225 f17747 = new C0225(C17615.f53826);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16240(int i) {
        return (i & 192) != 128;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16241(int i, int i2) {
        if (i != 240 || (i2 >= 144 && i2 <= 191)) {
            return (i == 244 && (i2 & 240) != 128) || (i2 & 192) != 128;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16242(int i, int i2, int i3) {
        return ((i != -32 || (i2 & BERTags.FLAGS) != 128) && (i2 & 192) == 128 && (i3 & 192) == 128) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16237(StringBuilder sb, byte[] bArr, int i, int i2) {
        int m16232;
        int i3 = i2 + i;
        while (i < i3) {
            int i4 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                sb.append((char) b);
            } else if ((b >> 5) != -2 || (b & 30) == 0) {
                if ((b >> 4) == -2) {
                    int i5 = i + 2;
                    if (i5 < i3) {
                        byte b2 = bArr[i4];
                        int i6 = i + 3;
                        byte b3 = bArr[i5];
                        if (m16242(b, b2, b3)) {
                            sb.append((char) 65533);
                            m16232 = m16232(i, 3, bArr);
                            i += m16232;
                        } else {
                            sb.append((char) (((b << 12) ^ (b2 << 6)) ^ ((-123008) ^ b3)));
                            i = i6;
                        }
                    } else {
                        if (i4 < i3) {
                            byte b4 = bArr[i4];
                            if ((b == -32 && (b4 & bo.k) == 128) || (b4 & 192) != 128) {
                                sb.append((char) 65533);
                            }
                        }
                        sb.append((char) 65533);
                        return;
                    }
                } else if ((b >> 3) == -2) {
                    int i7 = i + 3;
                    if (i7 < i3) {
                        byte b5 = bArr[i4];
                        byte b6 = bArr[i + 2];
                        int i8 = i + 4;
                        byte b7 = bArr[i7];
                        int i9 = (((b << 18) ^ (b5 << 12)) ^ (b6 << 6)) ^ (3678080 ^ b7);
                        if ((b5 & 192) != 128 || (b6 & 192) != 128 || (b7 & 192) != 128 || !Character.isSupplementaryCodePoint(i9)) {
                            sb.append((char) 65533);
                            m16232 = m16232(i, 4, bArr);
                            i += m16232;
                        } else {
                            int i10 = C2164.f7153;
                            sb.append((char) ((i9 >>> 10) + 55232));
                            sb.append((char) ((i9 & 1023) + 56320));
                            i = i8;
                        }
                    } else {
                        int i11 = b & 255;
                        if (i11 > 244 || (i4 < i3 && m16241(i11, bArr[i4] & 255))) {
                            sb.append((char) 65533);
                        } else {
                            i += 2;
                            sb.append((char) 65533);
                            if (i >= i3 || (bArr[i] & 192) == 128) {
                                return;
                            }
                        }
                    }
                } else {
                    sb.append((char) 65533);
                }
            } else if (i4 < i3) {
                i += 2;
                byte b8 = bArr[i4];
                if (m16240(b8)) {
                    sb.append((char) 65533);
                } else {
                    sb.append((char) (((b << 6) ^ b8) ^ 3968));
                }
            } else {
                sb.append((char) 65533);
                return;
            }
            i = i4;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16239(byte[] bArr, int i, C22706 c22706) {
        int i2;
        int i3;
        int i4;
        int m16232;
        C0225 c0225 = f17747;
        char[] cArr = (char[]) c0225.m1479();
        if (cArr == null) {
            cArr = new char[1024];
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            if (i6 >= 1020) {
                c22706.write(cArr, 0, i6);
                i6 = 0;
            }
            int i7 = i5 + 1;
            byte b = bArr[i5];
            if (b < 0) {
                if ((b >> 5) == -2 && (b & 30) != 0) {
                    if (i7 < i) {
                        i5 += 2;
                        byte b2 = bArr[i7];
                        if (m16240(b2)) {
                            i2 = i6 + 1;
                            cArr[i6] = 65533;
                        } else {
                            i4 = i6 + 1;
                            cArr[i6] = (char) (((b << 6) ^ b2) ^ 3968);
                            i6 = i4;
                        }
                    } else {
                        i3 = i6 + 1;
                        cArr[i6] = 65533;
                        i6 = i3;
                        break;
                    }
                } else if ((b >> 4) == -2) {
                    int i8 = i5 + 2;
                    if (i8 < i) {
                        byte b3 = bArr[i7];
                        int i9 = i5 + 3;
                        byte b4 = bArr[i8];
                        if (m16242(b, b3, b4)) {
                            i4 = i6 + 1;
                            cArr[i6] = 65533;
                            m16232 = m16232(i5, 3, bArr);
                            i5 += m16232;
                            i6 = i4;
                        } else {
                            char c = (char) (((b << 12) ^ (b3 << 6)) ^ ((-123008) ^ b4));
                            int i10 = C2164.f7153;
                            if (c >= 55296 && c < 57344) {
                                cArr[i6] = 65533;
                                i6++;
                            } else {
                                cArr[i6] = c;
                                i6++;
                            }
                            i5 = i9;
                        }
                    } else {
                        if (i7 < i) {
                            byte b5 = bArr[i7];
                            if ((b == -32 && (b5 & bo.k) == 128) || (b5 & 192) != 128) {
                                i2 = i6 + 1;
                                cArr[i6] = 65533;
                            }
                        }
                        i3 = i6 + 1;
                        cArr[i6] = 65533;
                        i6 = i3;
                        break;
                    }
                } else if ((b >> 3) == -2) {
                    int i11 = i5 + 3;
                    if (i11 < i) {
                        byte b6 = bArr[i7];
                        byte b7 = bArr[i5 + 2];
                        int i12 = i5 + 4;
                        byte b8 = bArr[i11];
                        int i13 = (((b << 18) ^ (b6 << 12)) ^ (b7 << 6)) ^ (3678080 ^ b8);
                        if ((b6 & 192) != 128 || (b7 & 192) != 128 || (b8 & 192) != 128 || !Character.isSupplementaryCodePoint(i13)) {
                            i4 = i6 + 1;
                            cArr[i6] = 65533;
                            m16232 = m16232(i5, 4, bArr);
                            i5 += m16232;
                            i6 = i4;
                        } else {
                            int i14 = i6 + 1;
                            int i15 = C2164.f7153;
                            cArr[i6] = (char) ((i13 >>> 10) + 55232);
                            i6 += 2;
                            cArr[i14] = (char) ((i13 & 1023) + 56320);
                            i5 = i12;
                        }
                    } else {
                        int i16 = b & 255;
                        if (i16 > 244 || (i7 < i && m16241(i16, bArr[i7] & 255))) {
                            i2 = i6 + 1;
                            cArr[i6] = 65533;
                        } else {
                            i5 += 2;
                            i4 = i6 + 1;
                            cArr[i6] = 65533;
                            if (i5 >= i || (bArr[i5] & 192) == 128) {
                                i6 = i4;
                                break;
                            }
                            i6 = i4;
                        }
                    }
                } else {
                    i2 = i6 + 1;
                    cArr[i6] = 65533;
                }
            } else {
                i2 = i6 + 1;
                cArr[i6] = (char) b;
            }
            i6 = i2;
            i5 = i7;
        }
        if (i6 > 0) {
            c22706.write(cArr, 0, i6);
        }
        c0225.m1477(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m16236(java.io.OutputStream r8, java.lang.CharSequence r9) {
        /*
            int r0 = r9.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L8e
            char r2 = r9.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L15
            byte r2 = (byte) r2
            r8.write(r2)
            goto L8a
        L15:
            r4 = 2048(0x800, float:2.87E-42)
            if (r2 >= r4) goto L29
            int r4 = r2 >> 6
            r4 = r4 & 31
            r4 = r4 | 192(0xc0, float:2.69E-43)
            r8.write(r4)
            r2 = r2 & 63
            r2 = r2 | r3
            r8.write(r2)
            goto L8a
        L29:
            int r4 = l.C2164.f7153
            r4 = 55296(0xd800, float:7.7486E-41)
            r5 = 63
            if (r2 < r4) goto L74
            r4 = 57344(0xe000, float:8.0356E-41)
            if (r2 >= r4) goto L74
            int r4 = r1 + 1
            if (r4 >= r0) goto L50
            char r6 = r9.charAt(r4)
            boolean r7 = java.lang.Character.isHighSurrogate(r2)
            if (r7 == 0) goto L50
            boolean r7 = java.lang.Character.isLowSurrogate(r6)
            if (r7 == 0) goto L50
            int r2 = java.lang.Character.toCodePoint(r2, r6)
            goto L51
        L50:
            r2 = -1
        L51:
            if (r2 >= 0) goto L57
            r8.write(r5)
            goto L8a
        L57:
            int r1 = r2 >> 18
            r1 = r1 | 240(0xf0, float:3.36E-43)
            r8.write(r1)
            int r1 = r2 >> 12
            r1 = r1 & r5
            r1 = r1 | r3
            r8.write(r1)
            int r1 = r2 >> 6
            r1 = r1 & r5
            r1 = r1 | r3
            r8.write(r1)
            r1 = r2 & 63
            r1 = r1 | r3
            r8.write(r1)
            r1 = r4
            goto L8a
        L74:
            int r4 = r2 >> 12
            r4 = r4 & 15
            r4 = r4 | 224(0xe0, float:3.14E-43)
            r8.write(r4)
            int r4 = r2 >> 6
            r4 = r4 & r5
            r4 = r4 | r3
            r8.write(r4)
            r2 = r2 & 63
            r2 = r2 | r3
            r8.write(r2)
        L8a:
            int r1 = r1 + 1
            goto L5
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5773.m16236(java.io.OutputStream, java.lang.CharSequence):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m16238(l.InterfaceC2077 r8, java.lang.CharSequence r9, boolean r10) {
        /*
            int r0 = r9.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto La1
            char r2 = r9.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L15
            byte r2 = (byte) r2
            r8.writeByte(r2)
            goto L9d
        L15:
            r4 = 2048(0x800, float:2.87E-42)
            if (r2 >= r4) goto L2a
            int r4 = r2 >> 6
            r4 = r4 & 31
            r4 = r4 | 192(0xc0, float:2.69E-43)
            r8.writeByte(r4)
            r2 = r2 & 63
            r2 = r2 | r3
            r8.writeByte(r2)
            goto L9d
        L2a:
            int r4 = l.C2164.f7153
            r4 = 55296(0xd800, float:7.7486E-41)
            r5 = 63
            if (r2 < r4) goto L87
            r4 = 57344(0xe000, float:8.0356E-41)
            if (r2 >= r4) goto L87
            int r4 = r1 + 1
            if (r4 >= r0) goto L51
            char r6 = r9.charAt(r4)
            boolean r7 = java.lang.Character.isHighSurrogate(r2)
            if (r7 == 0) goto L51
            boolean r7 = java.lang.Character.isLowSurrogate(r6)
            if (r7 == 0) goto L51
            int r2 = java.lang.Character.toCodePoint(r2, r6)
            goto L52
        L51:
            r2 = -1
        L52:
            if (r2 >= 0) goto L6a
            if (r10 == 0) goto L66
            r2 = 239(0xef, float:3.35E-43)
            r8.writeByte(r2)
            r2 = 191(0xbf, float:2.68E-43)
            r8.writeByte(r2)
            r2 = 189(0xbd, float:2.65E-43)
            r8.writeByte(r2)
            goto L9d
        L66:
            r8.writeByte(r5)
            goto L9d
        L6a:
            int r1 = r2 >> 18
            r1 = r1 | 240(0xf0, float:3.36E-43)
            r8.writeByte(r1)
            int r1 = r2 >> 12
            r1 = r1 & r5
            r1 = r1 | r3
            r8.writeByte(r1)
            int r1 = r2 >> 6
            r1 = r1 & r5
            r1 = r1 | r3
            r8.writeByte(r1)
            r1 = r2 & 63
            r1 = r1 | r3
            r8.writeByte(r1)
            r1 = r4
            goto L9d
        L87:
            int r4 = r2 >> 12
            r4 = r4 & 15
            r4 = r4 | 224(0xe0, float:3.14E-43)
            r8.writeByte(r4)
            int r4 = r2 >> 6
            r4 = r4 & r5
            r4 = r4 | r3
            r8.writeByte(r4)
            r2 = r2 & 63
            r2 = r2 | r3
            r8.writeByte(r2)
        L9d:
            int r1 = r1 + 1
            goto L5
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5773.m16238(l.֫᩷ܽ, java.lang.CharSequence, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m16233(java.lang.CharSequence r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            r2 = 0
        L6:
            if (r1 >= r0) goto L4c
            char r3 = r7.charAt(r1)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L11
            goto L40
        L11:
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L18
            int r2 = r2 + 2
            goto L49
        L18:
            int r4 = l.C2164.f7153
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r4) goto L47
            r4 = 57344(0xe000, float:8.0356E-41)
            if (r3 >= r4) goto L47
            int r4 = r1 + 1
            if (r4 >= r0) goto L3d
            char r5 = r7.charAt(r4)
            boolean r6 = java.lang.Character.isHighSurrogate(r3)
            if (r6 == 0) goto L3d
            boolean r6 = java.lang.Character.isLowSurrogate(r5)
            if (r6 == 0) goto L3d
            int r3 = java.lang.Character.toCodePoint(r3, r5)
            goto L3e
        L3d:
            r3 = -1
        L3e:
            if (r3 >= 0) goto L43
        L40:
            int r2 = r2 + 1
            goto L49
        L43:
            int r2 = r2 + 4
            r1 = r4
            goto L49
        L47:
            int r2 = r2 + 3
        L49:
            int r1 = r1 + 1
            goto L6
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5773.m16233(java.lang.CharSequence):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m16234(java.lang.String r12, boolean r13) {
        /*
            int r0 = r12.length()
            r1 = 0
            r3 = 0
        L7:
            if (r3 >= r0) goto L54
            char r4 = r12.charAt(r3)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 1
            if (r4 >= r5) goto L14
            goto L49
        L14:
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L1c
            r4 = 2
            long r1 = r1 + r4
            goto L51
        L1c:
            int r5 = l.C2164.f7153
            r5 = 55296(0xd800, float:7.7486E-41)
            r8 = 3
            if (r4 < r5) goto L50
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto L50
            int r5 = r3 + 1
            if (r5 >= r0) goto L43
            char r10 = r12.charAt(r5)
            boolean r11 = java.lang.Character.isHighSurrogate(r4)
            if (r11 == 0) goto L43
            boolean r11 = java.lang.Character.isLowSurrogate(r10)
            if (r11 == 0) goto L43
            int r4 = java.lang.Character.toCodePoint(r4, r10)
            goto L44
        L43:
            r4 = -1
        L44:
            if (r4 >= 0) goto L4b
            if (r13 == 0) goto L49
            r6 = r8
        L49:
            long r1 = r1 + r6
            goto L51
        L4b:
            r3 = 4
            long r1 = r1 + r3
            r3 = r5
            goto L51
        L50:
            long r1 = r1 + r8
        L51:
            int r3 = r3 + 1
            goto L7
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5773.m16234(java.lang.String, boolean):long");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16235(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >>> 8) & 255);
        bufferedOutputStream.write((i >>> 16) & 255);
        bufferedOutputStream.write((i >>> 24) & 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16232(int i, int i2, byte[] bArr) {
        if (i2 == 3) {
            int i3 = i + 1;
            byte b = bArr[i];
            byte b2 = bArr[i3];
            if ((b == -32 && (b2 & bo.k) == 128) || m16240(b2)) {
                return 1;
            }
        } else {
            if (i2 != 4) {
                return -1;
            }
            int i4 = i + 1;
            int i5 = bArr[i] & 255;
            int i6 = i + 2;
            byte b3 = bArr[i4];
            int i7 = b3 & 255;
            if (i5 > 244) {
                return 1;
            }
            if (i5 == 240 && (i7 < 144 || i7 > 191)) {
                return 1;
            }
            if ((i5 == 244 && (b3 & 240) != 128) || m16240(i7)) {
                return 1;
            }
            if (!m16240(bArr[i6])) {
                return 3;
            }
        }
        return 2;
    }
}
