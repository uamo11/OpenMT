package l;

import java.util.zip.CRC32;

/* compiled from: Q6ZO */
/* renamed from: l.ᩴۡܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18660 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43265(C10130 c10130, C22913 c22913, C9302 c9302, C17975 c17975, boolean z, boolean z2, C7185 c7185, C22707 c22707) {
        C11003.requireNonNull(c10130, "out");
        C11003.requireNonNull(c22913, "definition");
        long position = c10130.getPosition();
        try {
            C15068 m51000 = c22913.m51000();
            C23097 m51001 = c22913.m51001();
            String m18974 = m51000 == null ? null : C7017.m18974(m51000);
            if (z && m51000 != null && m18974 != null && m51001 != null && c9302 != null) {
                boolean z3 = false;
                if (z2 && c7185 == null && c17975 != null && c17975.m42010() == c9302.m23880()) {
                    if (c9302.m23885() <= 1000000 && c17975.m42004() <= 1000000) {
                        m43264(c10130, 1, m18974, m51001, c9302.m23880(), 0, c9302.m23880(), c9302, c17975, c22707);
                        return;
                    }
                }
                if (!z2 && c7185 != null && c7185.m19247() == c9302 && c7185.m19250()) {
                    C9302 m19248 = c7185.m19248();
                    C17975 m19249 = c7185.m19249();
                    if (m19248 != null && m19249 != null && m19249.m42010() == m19248.m23880()) {
                        if (m19248.m23885() <= 1000000 && m19249.m42004() <= 1000000) {
                            z3 = true;
                        }
                        if (z3) {
                            m43264(c10130, 2, m18974, m51001, c9302.m23880(), c7185.m19245(), c7185.m19241(), m19248, m19249, c22707);
                            return;
                        }
                    }
                }
                m43263(c10130);
                return;
            }
            m43263(c10130);
        } catch (RuntimeException unused) {
            c10130.seek(position);
            c10130.m25420((int) position);
            m43263(c10130);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43264(C10130 c10130, int i, String str, C23097 c23097, int i2, int i3, int i4, C9302 c9302, C17975 c17975, C22707 c22707) {
        if (c9302.m23880() != i4 - i3 || c17975.m42010() != c9302.m23880()) {
            throw new IllegalArgumentException("Syntax cache payload coverage differs");
        }
        c10130.writeInt(1398361651);
        c10130.writeInt(3);
        int position = (int) c10130.getPosition();
        c10130.writeByte(i);
        c10130.m25423((CharSequence) str);
        c10130.writeInt(c23097.m51274());
        c10130.writeInt(i2);
        c10130.writeInt(i3);
        c10130.writeInt(i4);
        c10130.m25425(c22707 != null);
        if (c22707 != null) {
            int m50729 = c22707.m50729();
            if (m50729 > 32) {
                throw new IllegalArgumentException("Too many syntax derived refresh ranges");
            }
            c10130.writeInt(m50729);
            int i5 = -1;
            for (int i6 = 0; i6 < m50729; i6++) {
                C14239 m50724 = c22707.m50724(i6);
                if (m50724.m33888() < 0 || m50724.m33888() >= m50724.m33887() || m50724.m33887() > i2 || m50724.m33888() <= i5) {
                    throw new IllegalArgumentException("Invalid syntax derived refresh range");
                }
                c10130.writeInt(m50724.m33888());
                c10130.writeInt(m50724.m33887());
                i5 = m50724.m33887();
            }
        }
        C3843 c3843 = new C3843();
        C17768 c17768 = new C17768();
        c17768.m41620(c9302);
        while (c17768.m41625()) {
            c3843.m11596(c17768.m41624());
        }
        c10130.writeInt(c9302.m23885());
        c10130.writeInt(c3843.m11593());
        for (int i7 = 0; i7 < c3843.m11593(); i7++) {
            C21834 m11595 = c3843.m11595(i7);
            c10130.writeInt(m11595.m49210());
            c10130.writeInt(m11595.m49209());
            c10130.writeInt(m11595.m49212());
            c10130.writeInt(m11595.m49211());
            c10130.writeInt(m11595.m49213());
            String m49200 = m11595.m49200();
            c10130.m25425(m49200 != null);
            if (m49200 != null) {
                c10130.m25423((CharSequence) m49200);
            }
        }
        c17768.m41620(c9302);
        while (c17768.m41625()) {
            int m41619 = c17768.m41619() - c17768.m41622();
            if (c17768.m41626()) {
                m41619 |= Integer.MIN_VALUE;
            }
            c10130.writeInt(m41619);
            c10130.writeInt(c3843.m11594(c17768.m41624()));
        }
        c10130.writeInt(c17975.m42004());
        for (int i8 = 0; i8 < c17975.m42004(); i8++) {
            c10130.writeInt(c17975.m42012(i8));
            c10130.writeInt(c17975.m42013(i8));
            c10130.writeInt(c17975.m42014(i8));
            C15068 m42015 = c17975.m42015(i8);
            int m51266 = m42015 == null ? -1 : c23097.m51266(m42015);
            if (m42015 != null && m51266 < 0) {
                throw new IllegalArgumentException("Syntax context language is outside program graph");
            }
            c10130.writeInt(m51266 + 1);
        }
        byte[] m25438 = c10130.m25438();
        int position2 = (int) c10130.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(m25438, position, position2 - position);
        c10130.writeInt((int) crc32.getValue());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43263(C10130 c10130) {
        c10130.writeInt(1398361651);
        c10130.writeInt(3);
        int position = (int) c10130.getPosition();
        c10130.writeByte(0);
        byte[] m25438 = c10130.m25438();
        int position2 = (int) c10130.getPosition();
        CRC32 crc32 = new CRC32();
        crc32.update(m25438, position, position2 - position);
        c10130.writeInt((int) crc32.getValue());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15836 m43260(int i, int i2, C12951 c12951) {
        C15836 m37485;
        C11003.requireNonNull(c12951, "in");
        byte[] bArr = c12951.f38849;
        int m31488 = c12951.m31488();
        if (i < m31488 || i > bArr.length) {
            throw new IndexOutOfBoundsException("Syntax cache record is outside input");
        }
        C22913 m50999 = C22913.m50999(null);
        try {
            try {
                if (i - m31488 < 13) {
                    m37485 = C15836.m37485(m50999);
                } else {
                    C2432 c2432 = new C2432(bArr, m31488, i);
                    if (c2432.m7871() == 1398361651 && c2432.m7871() == 3) {
                        int m7869 = c2432.m7869();
                        int i3 = i - 4;
                        int m43266 = m43266(i3, bArr);
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr, m7869, i3 - m7869);
                        if (((int) crc32.getValue()) != m43266) {
                            m37485 = C15836.m37485(m50999);
                        } else {
                            C2432 c24322 = new C2432(bArr, m7869, i3);
                            int m7872 = c24322.m7872();
                            if (m7872 == 0) {
                                c24322.m7873();
                                m37485 = C15836.m37485(m50999);
                            } else {
                                if (m7872 != 1 && m7872 != 2) {
                                    throw new IllegalArgumentException("Unknown syntax cache kind");
                                }
                                C22913 m509992 = C22913.m50999(C7017.m18983(c24322.m7870(16384)));
                                C23097 m51001 = m509992.m51001();
                                C15068 m51000 = m509992.m51000();
                                int m7871 = c24322.m7871();
                                int m78712 = c24322.m7871();
                                int m78713 = c24322.m7871();
                                int m78714 = c24322.m7871();
                                if (m51001 == null || m51000 == null || m51001.m51274() != m7871 || m78712 != i2 || m78712 < 0 || m78713 < 0 || m78714 < m78713 || m78714 > m78712) {
                                    throw new IllegalArgumentException("Syntax cache identity differs");
                                }
                                int i4 = m78714 - m78713;
                                if (m7872 == 1 && (m78713 != 0 || m78714 != m78712 || m78712 > 1000000)) {
                                    throw new IllegalArgumentException("Invalid full syntax cache coverage");
                                }
                                C22707 m43262 = m43262(c24322, m78712);
                                C9302 m43267 = m43267(c24322, i4);
                                C17975 m43261 = m43261(c24322, i4, m51001);
                                c24322.m7873();
                                if (m7872 == 1) {
                                    m37485 = C15836.m37487(m509992, m43267, m43261, m43262);
                                } else {
                                    m37485 = C15836.m37486(m509992, C7185.m19238(m78712, m78713, m43267, m43261, m51001.f74319), m43262);
                                }
                            }
                        }
                    }
                    m37485 = C15836.m37485(m50999);
                }
            } catch (RuntimeException unused) {
                m37485 = C15836.m37485(m50999);
            }
            return m37485;
        } finally {
            c12951.seek(i);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9302 m43267(C2432 c2432, int i) {
        int m7871 = c2432.m7871();
        int m78712 = c2432.m7871();
        if (m7871 < 0 || m78712 < 0 || ((i == 0 && (m7871 != 0 || m78712 != 0)) || ((i != 0 && (m7871 == 0 || m7871 > i || m7871 > 1000000 || m78712 == 0 || m78712 > m7871)) || m78712 > c2432.m7874() / 21))) {
            throw new IllegalArgumentException("Invalid syntax cache run counts");
        }
        C21834[] c21834Arr = new C21834[m78712];
        for (int i2 = 0; i2 < m78712; i2++) {
            int m78713 = c2432.m7871();
            int m78714 = c2432.m7871();
            int m78715 = c2432.m7871();
            int m78716 = c2432.m7871();
            int m78717 = c2432.m7871();
            int m7872 = c2432.m7872();
            if (m7872 == 0 || m7872 == 255) {
                c21834Arr[i2] = C21834.m49198(m7872 != 0 ? c2432.m7870(65536) : null, m78713, m78714, m78715, m78716, m78717);
            } else {
                throw new IllegalArgumentException("Invalid syntax cache boolean");
            }
        }
        C16356 c16356 = new C16356();
        int i3 = 0;
        for (int i4 = 0; i4 < m7871; i4++) {
            int m78718 = c2432.m7871();
            boolean z = m78718 < 0;
            int i5 = m78718 & Integer.MAX_VALUE;
            int m78719 = c2432.m7871();
            if (i5 <= 0 || m78719 < 0 || m78719 >= m78712 || i3 + i5 > i) {
                throw new IllegalArgumentException("Invalid syntax cache run");
            }
            c16356.m38503(i5, c21834Arr[m78719], z);
            i3 += i5;
        }
        if (i3 != i) {
            throw new IllegalArgumentException("Syntax cache runs do not cover payload");
        }
        return c16356.m38502();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17975 m43261(C2432 c2432, int i, C23097 c23097) {
        int m7871 = c2432.m7871();
        if (m7871 <= 0 || m7871 > 1000000 || m7871 > c2432.m7874() / 16) {
            throw new IllegalArgumentException("Invalid syntax cache context count");
        }
        int[] iArr = new int[m7871];
        int[] iArr2 = new int[m7871];
        int[] iArr3 = new int[m7871];
        C15068[] c15068Arr = new C15068[m7871];
        for (int i2 = 0; i2 < m7871; i2++) {
            int m78712 = c2432.m7871();
            iArr[i2] = m78712;
            int m78713 = c2432.m7871();
            iArr2[i2] = m78713;
            int m78714 = c2432.m7871();
            iArr3[i2] = m78714;
            int m78715 = c2432.m7871();
            if (m78712 < 0 || m78713 < m78712 || m78713 > i || ((i2 == 0 && m78714 != -1) || ((i2 != 0 && (m78714 < 0 || m78714 >= i2)) || m78715 < 0 || m78715 > c23097.m51265()))) {
                throw new IllegalArgumentException("Invalid syntax cache context node");
            }
            c15068Arr[i2] = m78715 == 0 ? null : c23097.m51268(m78715 - 1);
        }
        if (iArr[0] != 0 || iArr2[0] != i || c15068Arr[0] != c23097.f74313) {
            throw new IllegalArgumentException("Invalid syntax cache context root");
        }
        return new C17975(i, m7871, iArr, iArr2, iArr3, c15068Arr);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m43266(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22707 m43262(C2432 c2432, int i) {
        int m7872 = c2432.m7872();
        if (m7872 != 0 && m7872 != 255) {
            throw new IllegalArgumentException("Invalid syntax cache boolean");
        }
        if (m7872 == 0) {
            return null;
        }
        int m7871 = c2432.m7871();
        if (m7871 < 0 || m7871 > 32 || m7871 > c2432.m7874() / 8) {
            throw new IllegalArgumentException("Invalid syntax derived refresh range count");
        }
        C22707 c22707 = C22707.f73353;
        int i2 = -1;
        int i3 = 0;
        while (i3 < m7871) {
            int m78712 = c2432.m7871();
            int m78713 = c2432.m7871();
            if (m78712 < 0 || m78712 >= m78713 || m78713 > i || m78712 <= i2) {
                throw new IllegalArgumentException("Invalid syntax derived refresh range");
            }
            c22707 = C22707.m50722(c22707, m78712, m78713);
            i3++;
            i2 = m78713;
        }
        return c22707;
    }
}
