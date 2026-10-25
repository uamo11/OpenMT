package l;

/* compiled from: X68P */
/* renamed from: l.ۜۨᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6748 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m18370(C12951 c12951, AbstractC15440 abstractC15440) {
        String m18371;
        int m31488 = c12951.m31488();
        try {
            if (c12951.m31490(-249340294)) {
                c12951.skipBytes(4);
                m18371 = m18369(c12951, 0) ? m18371(c12951, abstractC15440) : "";
            } else {
                m18371 = m18371(c12951, abstractC15440);
            }
            return m18371;
        } finally {
            c12951.seek(m31488);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10220 m18367(C12951 c12951, AbstractC15440 abstractC15440) {
        String m18371;
        String m31504;
        int m31488 = c12951.m31488();
        byte[] bArr = c12951.f38849;
        try {
            if (c12951.m31490(-249340294)) {
                c12951.skipBytes(4);
                if (m18369(c12951, 0)) {
                    m18371 = m18371(c12951, abstractC15440);
                    c12951.skipBytes(4);
                } else {
                    m18371 = "";
                }
                m31504 = m18369(c12951, 4) ? c12951.m31504() : "\n";
            } else {
                m18371 = m18371(c12951, abstractC15440);
                c12951.skipBytes(28);
                c12951.skipBytes(3);
                C12392.m30211(c12951, bArr.length);
                C12392.m30211(c12951, bArr.length);
                if (c12951.m31490(-1568513661)) {
                    int m31494 = c12951.m31494();
                    for (int i = 0; i < m31494; i++) {
                        c12951.skipBytes(8);
                    }
                }
                if (c12951.m31490(-1568513661)) {
                    int m314942 = c12951.m31494();
                    for (int i2 = 0; i2 < m314942; i2++) {
                        c12951.skipBytes(8);
                    }
                }
                m31504 = c12951.m31504();
            }
            return new C10220(m18371, m31504);
        } finally {
            c12951.seek(m31488);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18368(C12951 c12951) {
        int readInt;
        int m31488 = c12951.m31488();
        byte[] bArr = c12951.f38849;
        try {
            if (c12951.m31490(-249340294)) {
                c12951.skipBytes(4);
                if (!m18369(c12951, 1)) {
                    return;
                } else {
                    c12951.skipBytes(4);
                }
            } else {
                if (c12951.m31500() == -131647720) {
                    c12951.skipBytes(4);
                    c12951.skipBytes(1);
                    readInt = c12951.readInt();
                } else {
                    readInt = c12951.readInt();
                }
                c12951.skipBytes(readInt);
                c12951.skipBytes(20);
            }
            C15972.m37746(c12951.m31488(), C15972.m37744(c12951.m31488() + 4, bArr), bArr);
            long j = m31488;
            c12951.seek(j);
            if (c12951.m31490(-249340294)) {
                c12951.skipBytes(4);
                if (m18369(c12951, 10)) {
                    int m314882 = c12951.m31488();
                    c12951.skipBytes(8);
                    C15972.m37748(c12951.readLong(), m314882, bArr);
                }
            }
            c12951.seek(j);
        } finally {
            c12951.seek(m31488);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m18371(C12951 c12951, AbstractC15440 abstractC15440) {
        if (c12951.m31500() == -500018348) {
            return C5753.m16196(c12951, abstractC15440);
        }
        int m31500 = c12951.m31500();
        if (m31500 == -500019884 || m31500 == -483177132) {
            if (c12951.m31500() == -500019884) {
                return new String(C0273.m1587(c12951, c12951.m31488() + ((int) c12951.available())));
            }
            if (c12951.readInt() != -483177132) {
                throw new IllegalArgumentException("Invalid memory session state");
            }
            C14548 m52297 = C23721.m52297(c12951);
            try {
                C12704 m34740 = m52297.m34740();
                try {
                    String c13409 = m34740.toString();
                    m34740.close();
                    m52297.close();
                    return c13409;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    m52297.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c12951.m31500() == -131647720) {
            return C13346.m32320(c12951, abstractC15440 == null ? null : new C23681(abstractC15440)).m10615();
        }
        return c12951.m31504();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18369(C12951 c12951, int i) {
        int m31488 = c12951.m31488();
        while (true) {
            byte readByte = c12951.readByte();
            if (readByte != -1) {
                int readInt = c12951.readInt();
                if (readByte == i) {
                    return true;
                }
                c12951.skipBytes(readInt);
            } else {
                c12951.seek(m31488);
                return false;
            }
        }
    }
}
