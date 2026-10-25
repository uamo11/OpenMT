package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: Z4CY */
/* renamed from: l.֫ᩳ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1980 implements InterfaceC1274 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f6633;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11153 f6635;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Inflater f6637;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f6634 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CRC32 f6636 = new CRC32();

    public C1980(InterfaceC1274 interfaceC1274) {
        if (interfaceC1274 == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f6637 = inflater;
        int i = C23852.f77172;
        C4097 c4097 = new C4097(interfaceC1274);
        this.f6633 = c4097;
        this.f6635 = new C11153(c4097, inflater);
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        short s;
        C12521 c125212;
        C4097 c4097;
        short s2;
        long j2;
        int i = this.f6634;
        CRC32 crc32 = this.f6636;
        InterfaceC6171 interfaceC6171 = this.f6633;
        if (i == 0) {
            C4097 c40972 = (C4097) interfaceC6171;
            c40972.mo12313(10L);
            C12521 c125213 = c40972.f13029;
            byte m30713 = c125213.m30713(3L);
            boolean z = ((m30713 >> 1) & 1) == 1;
            if (z) {
                m6495(c40972.f13029, 0L, 10L);
            }
            m6494(8075, c40972.readShort(), "ID1ID2");
            c40972.skip(8L);
            if (((m30713 >> 2) & 1) == 1) {
                c40972.mo12313(2L);
                if (z) {
                    s2 = 65280;
                    m6495(c40972.f13029, 0L, 2L);
                } else {
                    s2 = 65280;
                }
                short readShort = c125213.readShort();
                Charset charset = C21736.f69703;
                long j3 = (short) (((readShort & 255) << 8) | ((readShort & s2) >>> 8));
                c40972.mo12313(j3);
                if (z) {
                    m6495(c40972.f13029, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                c40972.skip(j2);
                s = s2;
            } else {
                s = 65280;
            }
            if (((m30713 >> 3) & 1) == 1) {
                c125212 = c125213;
                long m12301 = c40972.m12301((byte) 0, 0L, C13132.FOREVER_NS);
                if (m12301 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c4097 = c40972;
                    m6495(c40972.f13029, 0L, m12301 + 1);
                } else {
                    c4097 = c40972;
                }
                c4097.skip(m12301 + 1);
            } else {
                c125212 = c125213;
                c4097 = c40972;
            }
            if (((m30713 >> 4) & 1) == 1) {
                long m123012 = c4097.m12301((byte) 0, 0L, C13132.FOREVER_NS);
                if (m123012 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    m6495(c4097.f13029, 0L, m123012 + 1);
                }
                c4097.skip(m123012 + 1);
            }
            if (z) {
                c4097.mo12313(2L);
                short readShort2 = c125212.readShort();
                Charset charset2 = C21736.f69703;
                m6494((short) (((readShort2 & 255) << 8) | ((readShort2 & s) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f6634 = 1;
        } else {
            s = 65280;
        }
        if (this.f6634 == 1) {
            long j4 = c12521.f37625;
            long mo4334 = this.f6635.mo4334(c12521, 8192L);
            if (mo4334 != -1) {
                m6495(c12521, j4, mo4334);
                return mo4334;
            }
            this.f6634 = 2;
        }
        if (this.f6634 != 2) {
            return -1L;
        }
        C4097 c40973 = (C4097) interfaceC6171;
        c40973.mo12313(4L);
        C12521 c125214 = c40973.f13029;
        int readInt = c125214.readInt();
        Charset charset3 = C21736.f69703;
        m6494(((readInt & 255) << 24) | ((readInt & (-16777216)) >>> 24) | ((readInt & 16711680) >>> 8) | ((readInt & s) << 8), (int) crc32.getValue(), "CRC");
        c40973.mo12313(4L);
        int readInt2 = c125214.readInt();
        m6494(((readInt2 & 255) << 24) | ((readInt2 & (-16777216)) >>> 24) | ((readInt2 & 16711680) >>> 8) | ((readInt2 & s) << 8), (int) this.f6637.getBytesWritten(), "ISIZE");
        this.f6634 = 3;
        if (c40973.mo12308()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۢ */
    public final C15384 mo4333() {
        return ((C4097) this.f6633).f13028.mo4333();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6635.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6495(C12521 c12521, long j, long j2) {
        C18914 c18914 = c12521.f37624;
        while (true) {
            int i = c18914.f59597;
            int i2 = c18914.f59600;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            c18914 = c18914.f59599;
        }
        while (j2 > 0) {
            int min = (int) Math.min(c18914.f59597 - r7, j2);
            this.f6636.update(c18914.f59596, (int) (c18914.f59600 + j), min);
            j2 -= min;
            c18914 = c18914.f59599;
            j = 0;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6494(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
