package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: O6SW */
/* renamed from: l.ۗܰᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3280 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Byte f10319;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f10320;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f10321;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f10322;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f10323;

    public C3280(boolean z, boolean z2, String str, String str2, Byte b) {
        this.f10322 = z;
        this.f10323 = z2;
        this.f10321 = str;
        this.f10320 = str2;
        this.f10319 = b;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3280 m10089(ByteArrayInputStream byteArrayInputStream, long j, int i) {
        Byte b;
        C23930 m52696 = C23930.m52696(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy search exceeds app state limit");
            }
            boolean m52703 = m52696.m52703();
            boolean m527032 = m52696.m52703();
            String m52708 = m52696.m52708(i);
            String m527082 = m52696.m52708(i);
            if (m52696.m52707() == 0) {
                b = null;
            } else {
                if (m52696.m52707() != 3 || m52696.m52704() != 29298) {
                    throw new IOException("Invalid legacy search parameter trailer");
                }
                b = Byte.valueOf((byte) m52696.readByte());
            }
            m52696.m52709();
            C3280 c3280 = new C3280(m52703, m527032, m52708, m527082, b);
            m52696.close();
            return c3280;
        } catch (Throwable th) {
            try {
                m52696.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3280 m10090(C12951 c12951) {
        Byte b;
        boolean m31498 = c12951.m31498();
        boolean m314982 = c12951.m31498();
        String m31504 = c12951.m31504();
        String m315042 = c12951.m31504();
        if (c12951.available() < 3 || c12951.m31501() != 29298) {
            b = null;
        } else {
            c12951.skipBytes(2);
            b = Byte.valueOf(c12951.readByte());
        }
        return new C3280(m31498, m314982, m31504, m315042, b);
    }
}
