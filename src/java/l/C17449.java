package l;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: 38TX */
/* renamed from: l.ܿܺۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17449 extends AbstractC15126 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C8954 f53305 = new C8954(4);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16743 f53306;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40801(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public C17449(InterfaceC16743 interfaceC16743) {
        this.f53306 = interfaceC16743;
    }

    @Override // l.AbstractC15126
    /* renamed from: ֫ */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        return m40822(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0099  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C23896 m40822(int r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17449.m40822(int, byte[]):l.᩻᩵֫");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m40810(l.C17714 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m41485()
        L8:
            int r3 = r18.m41457()     // Catch: java.lang.Throwable -> Lad
            r4 = 1
            r5 = r20
            if (r3 < r5) goto La9
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m41493()     // Catch: java.lang.Throwable -> Lad
            long r8 = r18.m41479()     // Catch: java.lang.Throwable -> Lad
            int r10 = r18.m41464()     // Catch: java.lang.Throwable -> Lad
            goto L2c
        L22:
            int r7 = r18.m41491()     // Catch: java.lang.Throwable -> Lad
            int r8 = r18.m41491()     // Catch: java.lang.Throwable -> Lad
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.m41484(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4b
            r1.m41484(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L88
            goto L89
        L79:
            if (r0 != r3) goto L87
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = 1
            goto L82
        L81:
            r3 = 0
        L82:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L88
            goto L89
        L87:
            r3 = 0
        L88:
            r4 = 0
        L89:
            if (r4 == 0) goto L8d
            int r3 = r3 + 4
        L8d:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L96
            r1.m41484(r2)
            return r6
        L96:
            int r3 = r18.m41457()     // Catch: java.lang.Throwable -> Lad
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La3
            r1.m41484(r2)
            return r6
        La3:
            int r3 = (int) r8
            r1.m41478(r3)     // Catch: java.lang.Throwable -> Lad
            goto L8
        La9:
            r1.m41484(r2)
            return r4
        Lad:
            r0 = move-exception
            r1.m41484(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17449.m40810(l.ᩳ֨֫, int, int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x018f, code lost:
    
        if (r13 == 67) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.AbstractC14626 m40809(int r18, l.C17714 r19, boolean r20, int r21, l.InterfaceC16743 r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17449.m40809(int, l.ᩳ֨֫, boolean, int, l.ܽܺۧ):l.ܳܺۧ");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8983 m40819(int i, C17714 c17714) {
        if (i < 1) {
            return null;
        }
        int m41456 = c17714.m41456();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c17714.m41461(0, i2, bArr);
        int m40811 = m40811(0, m41456, bArr);
        return new C8983("TXXX", new String(bArr, 0, m40811, m40813(m41456)), m40808(m41456, m40811 + m40801(m41456), bArr));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8983 m40805(int i, C17714 c17714, String str) {
        if (i < 1) {
            return null;
        }
        int m41456 = c17714.m41456();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c17714.m41461(0, i2, bArr);
        return new C8983(str, null, m40808(m41456, 0, bArr));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m40808(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return AbstractC14545.of((Object) "");
        }
        int i3 = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        int m40811 = m40811(i2, i, bArr);
        while (i2 < m40811) {
            c1846.m16264(new String(bArr, i2, m40811 - i2, m40813(i)));
            i2 = m40801(i) + m40811;
            m40811 = m40811(i2, i, bArr);
        }
        AbstractC14545 m6131 = c1846.m6131();
        return m6131.isEmpty() ? AbstractC14545.of((Object) "") : m6131;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C16037 m40817(int i, C17714 c17714) {
        if (i < 1) {
            return null;
        }
        int m41456 = c17714.m41456();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c17714.m41461(0, i2, bArr);
        int m40811 = m40811(0, m41456, bArr);
        String str = new String(bArr, 0, m40811, m40813(m41456));
        int m40801 = m40811 + m40801(m41456);
        return new C16037("WXXX", str, m40803(bArr, m40801, m40812(m40801, bArr), StandardCharsets.ISO_8859_1));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16037 m40816(int i, C17714 c17714, String str) {
        byte[] bArr = new byte[i];
        c17714.m41461(0, i, bArr);
        return new C16037(str, null, new String(bArr, 0, m40812(0, bArr), StandardCharsets.ISO_8859_1));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C9689 m40820(int i, C17714 c17714) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i];
        c17714.m41461(0, i, bArr);
        int m40812 = m40812(0, bArr);
        String str = new String(bArr, 0, m40812, StandardCharsets.ISO_8859_1);
        int i2 = m40812 + 1;
        if (i <= i2) {
            copyOfRange = C3603.f11423;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new C9689(str, copyOfRange);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11100 m40815(int i, C17714 c17714) {
        byte[] copyOfRange;
        int m41456 = c17714.m41456();
        Charset m40813 = m40813(m41456);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c17714.m41461(0, i2, bArr);
        int m40812 = m40812(0, bArr);
        String m24800 = C9786.m24800(new String(bArr, 0, m40812, StandardCharsets.ISO_8859_1));
        int i3 = m40812 + 1;
        int m40811 = m40811(i3, m41456, bArr);
        String m40803 = m40803(bArr, i3, m40811, m40813);
        int m40801 = m40811 + m40801(m41456);
        int m408112 = m40811(m40801, m41456, bArr);
        String m408032 = m40803(bArr, m40801, m408112, m40813);
        int m408012 = m408112 + m40801(m41456);
        if (i2 <= m408012) {
            copyOfRange = C3603.f11423;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m408012, i2);
        }
        return new C11100(copyOfRange, m24800, m40803, m408032);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11600 m40806(C17714 c17714, int i, int i2) {
        int m40812;
        String concat;
        byte[] copyOfRange;
        int m41456 = c17714.m41456();
        Charset m40813 = m40813(m41456);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c17714.m41461(0, i3, bArr);
        if (i2 == 2) {
            concat = "image/" + C15107.m35799(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            m40812 = 2;
        } else {
            m40812 = m40812(0, bArr);
            String m35799 = C15107.m35799(new String(bArr, 0, m40812, StandardCharsets.ISO_8859_1));
            concat = m35799.indexOf(47) == -1 ? "image/".concat(m35799) : m35799;
        }
        int i4 = bArr[m40812 + 1] & 255;
        int i5 = m40812 + 2;
        int m40811 = m40811(i5, m41456, bArr);
        String str = new String(bArr, i5, m40811 - i5, m40813);
        int m40801 = m40811 + m40801(m41456);
        if (i3 <= m40801) {
            copyOfRange = C3603.f11423;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m40801, i3);
        }
        return new C11600(i4, concat, str, copyOfRange);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1927 m40804(int i, C17714 c17714) {
        if (i < 4) {
            return null;
        }
        int m41456 = c17714.m41456();
        Charset m40813 = m40813(m41456);
        byte[] bArr = new byte[3];
        c17714.m41461(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c17714.m41461(0, i2, bArr2);
        int m40811 = m40811(0, m41456, bArr2);
        String str2 = new String(bArr2, 0, m40811, m40813);
        int m40801 = m40811 + m40801(m41456);
        return new C1927(str, str2, m40803(bArr2, m40801, m40811(m40801, m41456, bArr2), m40813));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13715 m40807(C17714 c17714, int i, int i2, boolean z, int i3, InterfaceC16743 interfaceC16743) {
        int m41485 = c17714.m41485();
        int m40812 = m40812(m41485, c17714.m41482());
        String str = new String(c17714.m41482(), m41485, m40812 - m41485, StandardCharsets.ISO_8859_1);
        c17714.m41484(m40812 + 1);
        int m41493 = c17714.m41493();
        int m414932 = c17714.m41493();
        long m41479 = c17714.m41479();
        long j = m41479 == 4294967295L ? -1L : m41479;
        long m414792 = c17714.m41479();
        long j2 = m414792 == 4294967295L ? -1L : m414792;
        ArrayList arrayList = new ArrayList();
        int i4 = m41485 + i;
        while (c17714.m41485() < i4) {
            AbstractC14626 m40809 = m40809(i2, c17714, z, i3, interfaceC16743);
            if (m40809 != null) {
                arrayList.add(m40809);
            }
        }
        return new C13715(str, m41493, m414932, j, j2, (AbstractC14626[]) arrayList.toArray(new AbstractC14626[0]));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7366 m40814(C17714 c17714, int i, int i2, boolean z, int i3, InterfaceC16743 interfaceC16743) {
        int m41485 = c17714.m41485();
        int m40812 = m40812(m41485, c17714.m41482());
        String str = new String(c17714.m41482(), m41485, m40812 - m41485, StandardCharsets.ISO_8859_1);
        c17714.m41484(m40812 + 1);
        int m41456 = c17714.m41456();
        boolean z2 = (m41456 & 2) != 0;
        boolean z3 = (m41456 & 1) != 0;
        int m414562 = c17714.m41456();
        String[] strArr = new String[m414562];
        for (int i4 = 0; i4 < m414562; i4++) {
            int m414852 = c17714.m41485();
            int m408122 = m40812(m414852, c17714.m41482());
            strArr[i4] = new String(c17714.m41482(), m414852, m408122 - m414852, StandardCharsets.ISO_8859_1);
            c17714.m41484(m408122 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = m41485 + i;
        while (c17714.m41485() < i5) {
            AbstractC14626 m40809 = m40809(i2, c17714, z, i3, interfaceC16743);
            if (m40809 != null) {
                arrayList.add(m40809);
            }
        }
        return new C7366(str, z2, z3, strArr, (AbstractC14626[]) arrayList.toArray(new AbstractC14626[0]));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20978 m40818(int i, C17714 c17714) {
        int m41464 = c17714.m41464();
        int m41491 = c17714.m41491();
        int m414912 = c17714.m41491();
        int m41456 = c17714.m41456();
        int m414562 = c17714.m41456();
        C16302 c16302 = new C16302();
        c16302.m38342(c17714);
        int i2 = ((i - 10) * 8) / (m41456 + m414562);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m38343 = c16302.m38343(m41456);
            int m383432 = c16302.m38343(m414562);
            iArr[i3] = m38343;
            iArr2[i3] = m383432;
        }
        return new C20978(m41464, m41491, iArr, iArr2, m414912);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m40821(int i, C17714 c17714) {
        byte[] m41482 = c17714.m41482();
        int m41485 = c17714.m41485();
        int i2 = m41485;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= m41485 + i) {
                return i;
            }
            if ((m41482[i2] & 255) == 255 && m41482[i3] == 0) {
                System.arraycopy(m41482, i2 + 2, m41482, i3, (i - (i2 - m41485)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Charset m40813(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i == 2) {
            return StandardCharsets.UTF_16BE;
        }
        if (i == 3) {
            return StandardCharsets.UTF_8;
        }
        return StandardCharsets.ISO_8859_1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40802(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m40811(int i, int i2, byte[] bArr) {
        int m40812 = m40812(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return m40812;
        }
        while (m40812 < bArr.length - 1) {
            if ((m40812 - i) % 2 == 0 && bArr[m40812 + 1] == 0) {
                return m40812;
            }
            m40812 = m40812(m40812 + 1, bArr);
        }
        return bArr.length;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m40812(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m40803(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }
}
