package l;

import android.os.Bundle;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.zip.CRC32;

/* compiled from: L6RY */
/* renamed from: l.ۛᩴᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6249 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5816 f19328;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5377 f19329;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final UUID f19330;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3280 f19331;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f19332;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f19333;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4691 f19334;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2931 f19335;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f19336;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19222 f19337;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f19338;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f19339;

    public C6249(C19222 c19222, C5816 c5816, C2931 c2931, C3280 c3280, C4691 c4691, long j, int i, UUID uuid, long j2, byte[] bArr, byte[] bArr2) {
        this.f19337 = c19222;
        this.f19328 = c5816;
        this.f19335 = c2931;
        this.f19331 = c3280;
        this.f19334 = c4691;
        this.f19336 = bArr;
        this.f19338 = bArr2;
        this.f19339 = j;
        this.f19332 = i;
        this.f19330 = uuid;
        this.f19333 = j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6249 m17214(C17371 c17371, InterfaceC20758 interfaceC20758, C1143 c1143, int i) {
        UUID m40711;
        long m40713;
        C11481 m21144;
        long j;
        C12704 m40714;
        synchronized (c17371) {
            m40711 = c17371.m40711();
            m40713 = c17371.m40713();
            try {
                m21144 = C7869.m21144(m40711, c17371.m40710());
                if (m21144 == null) {
                    throw new IOException("Fragment recovery attachment is missing");
                }
                j = i;
                if (m21144.m28305() > j) {
                    throw new IOException("Fragment state exceeds recovery limit");
                }
                m40714 = c17371.m40714();
            } catch (IllegalStateException e) {
                throw new IOException("Invalid fragment recovery metadata", e);
            }
        }
        try {
            C5377 m3921 = c1143.m3921(m21144.m28305() + 32);
            try {
                InputStream m28303 = m21144.m28303(interfaceC20758, m40711, j, c1143);
                try {
                    int m28305 = (int) m21144.m28305();
                    byte[] bArr = new byte[m28305];
                    int i2 = 0;
                    while (i2 < m28305) {
                        int read = m28303.read(bArr, i2, m28305 - i2);
                        if (read <= 0) {
                            throw new IOException("Truncated fragment recovery attachment");
                        }
                        i2 += read;
                    }
                    if (m28303.read() != -1) {
                        throw new IOException("Trailing fragment recovery attachment bytes");
                    }
                    C6249 m17218 = m17218(bArr, i, m40714);
                    try {
                        C6249 m17213 = m17218.m17213(m40711, m40713);
                        m17218.close();
                        m28303.close();
                        m3921.close();
                        m40714.close();
                        return m17213;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                m40714.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10483 m17221(C23721 c23721, C23077 c23077) {
        C10483 c10483;
        synchronized (c23721) {
            C12704 m52357 = c23721.m52357();
            try {
                if (m52357.m30979() != this.f19339 || m52357.length() != this.f19332) {
                    throw new IllegalStateException("Migrated fragment text no longer matches");
                }
                m52357.close();
                C6249 m17213 = m17213(c23721.m52352(), c23721.m52371());
                try {
                    c10483 = new C10483(m17213, c23077);
                } catch (Error e) {
                    e = e;
                    m17213.close();
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    m17213.close();
                    throw e;
                }
            } finally {
            }
        }
        return c10483;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12599 m17216(C12704 c12704, Bundle bundle, C23077 c23077, C2931 c2931, byte[] bArr, byte[] bArr2, int i) {
        long j = 12;
        for (String str : bundle.keySet()) {
            if (str == null) {
                throw new IOException("Invalid fragment config key");
            }
            long m21450 = C8083.m21450(str.length(), 2L, 5L, j);
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                j = C8083.m21450(((String) obj).length(), 2L, 4L, m21450);
            } else {
                if (obj instanceof Boolean) {
                    m21450++;
                } else if (obj instanceof Integer) {
                    m21450 += 4;
                } else if (obj instanceof Long) {
                    m21450 += 8;
                } else if (obj != null) {
                    throw new IOException("Unsupported fragment config value");
                }
                j = m21450;
            }
        }
        boolean z = false;
        long m8942 = c2931.m8942() + 49 + j + (c23077 == null ? 0 : c23077.m51237(i)) + bArr.length + bArr2.length;
        if (i < 48 || m8942 > i || m8942 > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C5377 m30978 = c12704.m30978(C8083.m21450(bundle.size(), 128L, m8942 + j, 8192L));
        Long.signum(m8942);
        try {
            C5377 m309782 = c12704.m30978((m8942 * 8) + 8192);
            try {
                C12599 c12599 = new C12599(m17219(c12704, bundle, c23077, c2931, bArr, bArr2, i), m30978);
                if (m309782 == null) {
                    return c12599;
                }
                try {
                    m309782.close();
                    return c12599;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && m30978 != null) {
                        m30978.close();
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z) {
                m30978.close();
            }
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m17219(C12704 c12704, Bundle bundle, C23077 c23077, C2931 c2931, byte[] bArr, byte[] bArr2, int i) {
        if (i < 48 || bArr.length > i || bArr2.length > i) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        byte[] m44356 = C19222.m44353(i, bundle).m44356(i);
        long m51237 = (c23077 == null ? 0 : c23077.m51237(i)) + 1;
        long m8942 = c2931.m8942();
        long length = m44356.length + 48 + m51237 + m8942 + bArr.length + bArr2.length;
        if (length > i || length > 2147483639) {
            throw new IOException("Fragment state exceeds recovery limit");
        }
        C3280.m10089(new ByteArrayInputStream(bArr), bArr.length, i);
        C4691.m13767(new ByteArrayInputStream(bArr2), bArr2.length, i);
        int i2 = (int) length;
        C10130 c10130 = new C10130(i2);
        c10130.writeInt(843469637);
        c10130.writeInt(1);
        c10130.writeInt(i2);
        c10130.m25431(c12704.m30979());
        c10130.writeInt(c12704.length());
        c10130.m25434(m44356);
        c10130.writeInt((int) m51237);
        c10130.m25425(c23077 != null);
        if (c23077 != null) {
            c23077.m51239(c10130);
        }
        c10130.writeInt((int) m8942);
        c2931.m8947(c10130);
        c10130.m25434(bArr);
        c10130.m25434(bArr2);
        if (c10130.size() != length - 4) {
            throw new IllegalStateException("Fragment state changed while being captured");
        }
        byte[] m25438 = c10130.m25438();
        int size = c10130.size();
        CRC32 crc32 = new CRC32();
        crc32.update(m25438, 0, size);
        c10130.writeInt((int) crc32.getValue());
        return c10130.m25444();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C6249 m17218(byte[] bArr, int i, C12704 c12704) {
        if (i < 0 || bArr.length > i || bArr.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C5377 m30978 = c12704.m30978((bArr.length * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        boolean z = false;
        try {
            C5377 m309782 = c12704.m30978((bArr.length * 4) + 8192);
            try {
                C6249 m17215 = m17215(bArr, i, c12704);
                m17215.f19329 = m30978;
                if (m309782 == null) {
                    return m17215;
                }
                try {
                    m309782.close();
                    return m17215;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z && m30978 != null) {
                        m30978.close();
                    }
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6249 m17215(byte[] bArr, int i, C12704 c12704) {
        if (i < 0 || bArr.length > i || bArr.length < 48) {
            throw new IOException("Invalid fragment recovery state length");
        }
        C12951 c12951 = new C12951(bArr);
        c12951.seek(bArr.length - 4);
        int readInt = c12951.readInt();
        int length = bArr.length - 4;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, length);
        if (readInt != ((int) crc32.getValue())) {
            throw new IOException("Invalid fragment recovery state checksum");
        }
        c12951.seek(0L);
        if (c12951.readInt() != 843469637 || c12951.readInt() != 1 || c12951.readInt() != bArr.length) {
            throw new IOException("Unsupported fragment recovery state");
        }
        long readLong = c12951.readLong();
        int readInt2 = c12951.readInt();
        if (readLong != c12704.m30979() || readInt2 != c12704.length()) {
            throw new IOException("Fragment state belongs to another text revision");
        }
        byte[] m17217 = m17217(c12951);
        byte[] m172172 = m17217(c12951);
        byte[] m172173 = m17217(c12951);
        byte[] m172174 = m17217(c12951);
        byte[] m172175 = m17217(c12951);
        if (c12951.available() != 4) {
            throw new IOException("Trailing fragment recovery state fields");
        }
        return new C6249(C19222.m44352(i, m17217.length, new ByteArrayInputStream(m17217)), C5816.m16316(i, m172172.length, new ByteArrayInputStream(m172172)), C2931.m8936(i, m172173), C3280.m10089(new ByteArrayInputStream(m172174), m172174.length, i), C4691.m13767(new ByteArrayInputStream(m172175), m172175.length, i), readLong, readInt2, null, -1L, m172174, m172175);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12599 m17223(C12704 c12704, Bundle bundle, C23077 c23077, String str, int i, int i2, boolean z) {
        C2931 m8945 = this.f19335.m8945(i, i2, str);
        if (z) {
            m8945 = C1310.m4546(bundle, m8945, c12704.length());
        }
        return m17216(c12704, bundle, c23077, m8945, this.f19336, this.f19338, 8388608);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12599 m17222(C12704 c12704, Bundle bundle, C23077 c23077) {
        return m17216(c12704, bundle, c23077, this.f19335, this.f19336, this.f19338, 8388608);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12599 m17224(C12704 c12704, Bundle bundle, C23077 c23077, String str, boolean z, int i) {
        C2931 m8949 = this.f19335.m8949(str);
        if (z) {
            m8949 = C1310.m4546(bundle, m8949, c12704.length());
        }
        return m17216(c12704, bundle, c23077, m8949, this.f19336, this.f19338, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10483 m17220() {
        if (this.f19330 == null) {
            throw new IllegalStateException("Fragment state is not bound to a recovery candidate");
        }
        try {
            return new C10483(this, this.f19328.m16317());
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17225(C23721 c23721) {
        synchronized (c23721) {
            UUID uuid = this.f19330;
            if (uuid == null || !uuid.equals(c23721.m52352()) || this.f19333 != c23721.m52371()) {
                throw new IllegalStateException("Fragment recovery candidate is no longer current");
            }
            C12704 m52357 = c23721.m52357();
            try {
                if (m52357.m30979() != this.f19339 || m52357.length() != this.f19332) {
                    throw new IllegalStateException("Fragment recovery text no longer matches");
                }
                m52357.close();
            } finally {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6249 m17213(UUID uuid, long j) {
        C6249 c6249 = new C6249(this.f19337, this.f19328, this.f19335, this.f19331, this.f19334, this.f19339, this.f19332, uuid, j, this.f19336, this.f19338);
        c6249.f19329 = this.f19329;
        this.f19329 = null;
        this.f19337 = null;
        this.f19328 = null;
        this.f19335 = null;
        this.f19331 = null;
        this.f19334 = null;
        this.f19338 = null;
        this.f19336 = null;
        return c6249;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f19337 = null;
        this.f19328 = null;
        this.f19335 = null;
        this.f19331 = null;
        this.f19334 = null;
        this.f19338 = null;
        this.f19336 = null;
        C5377 c5377 = this.f19329;
        this.f19329 = null;
        if (c5377 != null) {
            c5377.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m17217(C12951 c12951) {
        if (c12951.available() < 8) {
            throw new IOException("Missing fragment recovery field");
        }
        int readInt = c12951.readInt();
        if (readInt >= 0 && readInt <= c12951.available() - 4) {
            byte[] bArr = new byte[readInt];
            c12951.m31489(readInt, bArr);
            return bArr;
        }
        throw new IOException("Invalid fragment recovery field length");
    }
}
