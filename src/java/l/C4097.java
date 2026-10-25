package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: 34CP */
/* renamed from: l.ۘᩳ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4097 implements InterfaceC6171 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274 f13028;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12521 f13029 = new C12521();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f13030;

    public C4097(InterfaceC1274 interfaceC1274) {
        if (interfaceC1274 == null) {
            throw new NullPointerException("source == null");
        }
        this.f13028 = interfaceC1274;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12521 mo12315() {
        return this.f13029;
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        if (c12521 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount < 0: "));
        }
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        C12521 c125212 = this.f13029;
        if (c125212.f37625 == 0 && this.f13028.mo4334(c125212, 8192L) == -1) {
            return -1L;
        }
        return c125212.mo4334(c12521, Math.min(j, c125212.f37625));
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo12308() {
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        C12521 c12521 = this.f13029;
        return c12521.mo12308() && this.f13028.mo4334(c12521, 8192L) == -1;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo12313(long j) {
        if (!m12310(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m12310(long j) {
        C12521 c12521;
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount < 0: "));
        }
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        do {
            c12521 = this.f13029;
            if (c12521.f37625 >= j) {
                return true;
            }
        } while (this.f13028.mo4334(c12521, 8192L) != -1);
        return false;
    }

    @Override // l.InterfaceC6171
    public final byte readByte() {
        mo12313(1L);
        return this.f13029.readByte();
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11816 mo12305(long j) {
        mo12313(j);
        return this.f13029.mo12305(j);
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final byte[] mo12306() {
        InterfaceC1274 interfaceC1274 = this.f13028;
        C12521 c12521 = this.f13029;
        c12521.m30709(interfaceC1274);
        return c12521.mo12306();
    }

    @Override // l.InterfaceC6171
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] mo12312(long j) {
        mo12313(j);
        return this.f13029.mo12312(j);
    }

    @Override // l.InterfaceC6171
    public final void readFully(byte[] bArr) {
        C12521 c12521 = this.f13029;
        try {
            mo12313(bArr.length);
            c12521.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c12521.f37625;
                if (j > 0) {
                    int read = c12521.read(bArr, i, (int) j);
                    if (read == -1) {
                        throw new AssertionError();
                    }
                    i += read;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C12521 c12521 = this.f13029;
        if (c12521.f37625 == 0 && this.f13028.mo4334(c12521, 8192L) == -1) {
            return -1;
        }
        return c12521.read(byteBuffer);
    }

    @Override // l.InterfaceC6171
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo12302(InterfaceC5508 interfaceC5508) {
        C12521 c12521;
        long j = 0;
        while (true) {
            InterfaceC1274 interfaceC1274 = this.f13028;
            c12521 = this.f13029;
            if (interfaceC1274.mo4334(c12521, 8192L) == -1) {
                break;
            }
            long m30716 = c12521.m30716();
            if (m30716 > 0) {
                j += m30716;
                interfaceC5508.mo8911(c12521, m30716);
            }
        }
        long j2 = c12521.f37625;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        interfaceC5508.mo8911(c12521, j2);
        return j3;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo12304(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        InterfaceC1274 interfaceC1274 = this.f13028;
        C12521 c12521 = this.f13029;
        c12521.m30709(interfaceC1274);
        return c12521.mo12304(charset);
    }

    @Override // l.InterfaceC6171
    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final String mo12300() {
        return mo12303(C13132.FOREVER_NS);
    }

    @Override // l.InterfaceC6171
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo12303(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "limit < 0: "));
        }
        long j2 = j == C13132.FOREVER_NS ? Long.MAX_VALUE : j + 1;
        long m12301 = m12301((byte) 10, 0L, j2);
        C12521 c12521 = this.f13029;
        if (m12301 != -1) {
            return c12521.m30718(m12301);
        }
        if (j2 < C13132.FOREVER_NS && m12310(j2) && c12521.m30713(j2 - 1) == 13 && m12310(1 + j2) && c12521.m30713(j2) == 10) {
            return c12521.m30718(j2);
        }
        C12521 c125212 = new C12521();
        c12521.m30711(c125212, 0L, Math.min(32L, c12521.f37625));
        throw new EOFException("\\n not found: limit=" + Math.min(c12521.f37625, j) + " content=" + c125212.m30719().mo2332() + (char) 8230);
    }

    @Override // l.InterfaceC6171
    public final short readShort() {
        mo12313(2L);
        return this.f13029.readShort();
    }

    @Override // l.InterfaceC6171
    public final int readInt() {
        mo12313(4L);
        return this.f13029.readInt();
    }

    @Override // l.InterfaceC6171
    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final long mo12314() {
        C12521 c12521;
        byte m30713;
        mo12313(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean m12310 = m12310(i2);
            c12521 = this.f13029;
            if (!m12310) {
                break;
            }
            m30713 = c12521.m30713(i);
            if ((m30713 < 48 || m30713 > 57) && !(i == 0 && m30713 == 45)) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(m30713)));
        }
        return c12521.mo12314();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // l.InterfaceC6171
    /* renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo12309() {
        /*
            r7 = this;
            r0 = 1
            r7.mo12313(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r7.m12310(r3)
            l.۫ܽ֡ r4 = r7.f13029
            if (r3 == 0) goto L4a
            long r5 = (long) r1
            byte r3 = r4.m30713(r5)
            r5 = 48
            if (r3 < r5) goto L1f
            r5 = 57
            if (r3 <= r5) goto L30
        L1f:
            r5 = 97
            if (r3 < r5) goto L27
            r5 = 102(0x66, float:1.43E-43)
            if (r3 <= r5) goto L30
        L27:
            r5 = 65
            if (r3 < r5) goto L32
            r5 = 70
            if (r3 <= r5) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r2
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.<init>(r0)
            throw r1
        L4a:
            long r0 = r4.mo12309()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4097.mo12309():long");
    }

    @Override // l.InterfaceC6171
    public final void skip(long j) {
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C12521 c12521 = this.f13029;
            if (c12521.f37625 == 0 && this.f13028.mo4334(c12521, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, c12521.f37625);
            c12521.skip(min);
            j -= min;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m12301(byte b, long j, long j2) {
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(C16014.m37865(j2, "fromIndex=0 toIndex="));
        }
        while (j3 < j2) {
            long m30703 = this.f13029.m30703(b, j3, j2);
            if (m30703 == -1) {
                C12521 c12521 = this.f13029;
                long j4 = c12521.f37625;
                if (j4 >= j2 || this.f13028.mo4334(c12521, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j4);
            } else {
                return m30703;
            }
        }
        return -1L;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo12311(C11816 c11816) {
        int i;
        int mo2336 = c11816.mo2336();
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        if (mo2336 >= 0 && c11816.mo2336() >= mo2336) {
            while (i < mo2336) {
                long j = i;
                i = (m12310(1 + j) && this.f13029.m30713(j) == c11816.mo2325(i)) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public final InputStream mo12307() {
        return new C2686(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13030;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f13030) {
            return;
        }
        this.f13030 = true;
        this.f13028.close();
        this.f13029.m30706();
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f13028.mo4333();
    }

    public final String toString() {
        return "buffer(" + this.f13028 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
