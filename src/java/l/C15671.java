package l;

import java.io.IOException;

/* compiled from: R6TK */
/* renamed from: l.ܺۗᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15671 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10130 m36879(C5131 c5131) {
        C10130 c10130 = new C10130(128);
        c10130.writeInt(2);
        c10130.writeInt(c5131.m14689().ordinal());
        c10130.writeInt(c5131.m14692().ordinal());
        c10130.writeInt(c5131.m14685() == null ? 0 : 1);
        c10130.writeInt(c5131.m14681());
        c10130.m25431(c5131.m14693());
        c10130.m25431(c5131.m14687());
        c10130.writeInt(c5131.m14688());
        c10130.writeInt(c5131.m14694() ? 1 : 0);
        byte[] m14684 = c5131.m14684();
        c10130.write(m14684, 0, m14684.length);
        m36880(c10130, c5131.m14690());
        if (c5131.m14685() != null) {
            m36880(c10130, c5131.m14685().m18433());
            m36880(c10130, c5131.m14685().m18432());
            c10130.m25431(c5131.m14685().m18431());
            c10130.writeInt(c5131.m14685().m18434() ? 1 : 0);
        }
        if (c10130.size() <= 4096) {
            return c10130;
        }
        throw new IllegalArgumentException("Load checkpoint exceeds record limit");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5131 m36878(byte[] bArr) {
        if (bArr.length > 4096) {
            throw new IOException("Load checkpoint exceeds record limit");
        }
        try {
            C12951 c12951 = new C12951(bArr);
            if (c12951.readInt() != 2) {
                throw new IOException("Unsupported load checkpoint version");
            }
            int readInt = c12951.readInt();
            int readInt2 = c12951.readInt();
            if (readInt < 0 || readInt >= EnumC0191.values().length || readInt2 < 0 || readInt2 >= EnumC19243.values().length) {
                throw new IOException("Invalid load checkpoint status");
            }
            boolean m36881 = m36881(c12951);
            int readInt3 = c12951.readInt();
            long readLong = c12951.readLong();
            long readLong2 = c12951.readLong();
            int readInt4 = c12951.readInt();
            boolean m368812 = m36881(c12951);
            byte[] bArr2 = new byte[32];
            c12951.m31489(32, bArr2);
            String m36877 = m36877(c12951, 80);
            C6788 c6788 = m36881 ? new C6788(m36877(c12951, 1024), m36877(c12951, 512), c12951.readLong(), m36881(c12951)) : null;
            if (c12951.available() != 0) {
                throw new IOException("Trailing load checkpoint bytes");
            }
            return new C5131(EnumC0191.values()[readInt], EnumC19243.values()[readInt2], c6788, m36877, readInt3, readLong, readLong2, bArr2, readInt4, m368812);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new IOException("Invalid load checkpoint", e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new IOException("Invalid load checkpoint", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36881(C12951 c12951) {
        int readInt = c12951.readInt();
        if (readInt == 0 || readInt == 1) {
            return readInt == 1;
        }
        throw new IOException("Invalid load checkpoint flag");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36880(C10130 c10130, String str) {
        c10130.writeInt(str.length());
        for (int i = 0; i < str.length(); i++) {
            c10130.mo13229((short) str.charAt(i));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36877(C12951 c12951, int i) {
        int readInt = c12951.readInt();
        if (readInt < 0 || readInt > i || readInt > c12951.available() / 2) {
            throw new IOException("Invalid load checkpoint string length");
        }
        char[] cArr = new char[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            cArr[i2] = (char) c12951.readShort();
        }
        return new String(cArr);
    }
}
