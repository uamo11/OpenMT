package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: 04CR */
/* renamed from: l.۫ܽ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12521 implements InterfaceC6171, InterfaceC10405, Cloneable, ByteChannel {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f37623 = {UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18914 f37624;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f37625;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, l.InterfaceC5508
    public final void close() {
    }

    @Override // l.InterfaceC10405, l.InterfaceC5508, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ֫ */
    public final long mo12302(InterfaceC5508 interfaceC5508) {
        throw null;
    }

    @Override // l.InterfaceC10405
    /* renamed from: ۨ */
    public final InterfaceC10405 mo26248() {
        return this;
    }

    @Override // l.InterfaceC10405
    /* renamed from: ܳܽ */
    public final OutputStream mo26250() {
        throw null;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ᩷ */
    public final C12521 mo12315() {
        return this;
    }

    @Override // l.InterfaceC10405
    public final /* bridge */ /* synthetic */ InterfaceC10405 writeByte(int i) {
        m30720writeByte(i);
        return this;
    }

    @Override // l.InterfaceC10405
    public final /* bridge */ /* synthetic */ InterfaceC10405 writeInt(int i) {
        m30721writeInt(i);
        return this;
    }

    @Override // l.InterfaceC10405
    public final /* bridge */ /* synthetic */ InterfaceC10405 writeShort(int i) {
        m30722writeShort(i);
        return this;
    }

    @Override // l.InterfaceC10405
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC10405 mo26246(C11816 c11816) {
        m30710(c11816);
        return this;
    }

    @Override // l.InterfaceC10405
    /* renamed from: ۡ */
    public final /* bridge */ /* synthetic */ InterfaceC10405 mo26247(long j) {
        m30712(j);
        return this;
    }

    @Override // l.InterfaceC10405
    /* renamed from: ܳ */
    public final /* bridge */ /* synthetic */ InterfaceC10405 mo26249(long j) {
        m30715(j);
        return this;
    }

    @Override // l.InterfaceC10405
    /* renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ InterfaceC10405 mo26252(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    public final long size() {
        return this.f37625;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۢۧ */
    public final boolean mo12308() {
        return this.f37625 == 0;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ܿ */
    public final void mo12313(long j) {
        if (this.f37625 < j) {
            throw new EOFException();
        }
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۡܽ */
    public final InputStream mo12307() {
        return new C13226(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30711(C12521 c12521, long j, long j2) {
        if (c12521 == null) {
            throw new IllegalArgumentException("out == null");
        }
        C21736.m49060(this.f37625, j, j2);
        if (j2 == 0) {
            return;
        }
        c12521.f37625 += j2;
        C18914 c18914 = this.f37624;
        while (true) {
            long j3 = c18914.f59597 - c18914.f59600;
            if (j < j3) {
                break;
            }
            j -= j3;
            c18914 = c18914.f59599;
        }
        while (j2 > 0) {
            C18914 m43659 = c18914.m43659();
            int i = (int) (m43659.f59600 + j);
            m43659.f59600 = i;
            m43659.f59597 = Math.min(i + ((int) j2), m43659.f59597);
            C18914 c189142 = c12521.f37624;
            if (c189142 == null) {
                m43659.f59598 = m43659;
                m43659.f59599 = m43659;
                c12521.f37624 = m43659;
            } else {
                c189142.f59598.m43657(m43659);
            }
            j2 -= m43659.f59597 - m43659.f59600;
            c18914 = c18914.f59599;
            j = 0;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m30716() {
        long j = this.f37625;
        if (j == 0) {
            return 0L;
        }
        C18914 c18914 = this.f37624.f59598;
        return (c18914.f59597 >= 8192 || !c18914.f59601) ? j : j - (r3 - c18914.f59600);
    }

    @Override // l.InterfaceC6171
    public final byte readByte() {
        long j = this.f37625;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C18914 c18914 = this.f37624;
        int i = c18914.f59600;
        int i2 = c18914.f59597;
        int i3 = i + 1;
        byte b = c18914.f59596[i];
        this.f37625 = j - 1;
        if (i3 == i2) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
            return b;
        }
        c18914.f59600 = i3;
        return b;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte m30713(long j) {
        int i;
        C21736.m49060(this.f37625, j, 1L);
        long j2 = this.f37625;
        if (j2 - j > j) {
            C18914 c18914 = this.f37624;
            while (true) {
                int i2 = c18914.f59597;
                int i3 = c18914.f59600;
                long j3 = i2 - i3;
                if (j >= j3) {
                    j -= j3;
                    c18914 = c18914.f59599;
                } else {
                    return c18914.f59596[i3 + ((int) j)];
                }
            }
        } else {
            long j4 = j - j2;
            C18914 c189142 = this.f37624;
            do {
                c189142 = c189142.f59598;
                int i4 = c189142.f59597;
                i = c189142.f59600;
                j4 += i4 - i;
            } while (j4 < 0);
            return c189142.f59596[i + ((int) j4)];
        }
    }

    @Override // l.InterfaceC6171
    public final short readShort() {
        long j = this.f37625;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f37625);
        }
        C18914 c18914 = this.f37624;
        int i = c18914.f59600;
        int i2 = c18914.f59597;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c18914.f59596;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f37625 = j - 2;
        if (i5 == i2) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
        } else {
            c18914.f59600 = i5;
        }
        return (short) i6;
    }

    @Override // l.InterfaceC6171
    public final int readInt() {
        long j = this.f37625;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f37625);
        }
        C18914 c18914 = this.f37624;
        int i = c18914.f59600;
        int i2 = c18914.f59597;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c18914.f59596;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f37625 = j - 4;
        if (i5 == i2) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
            return i6;
        }
        c18914.f59600 = i5;
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095 A[EDGE_INSN: B:46:0x0095->B:40:0x0095 BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    @Override // l.InterfaceC6171
    /* renamed from: ᩵ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo12314() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f37625
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto La0
            r1 = 0
            r5 = -7
            r2 = 0
            r7 = 0
        Lf:
            l.ᩴᩳ֡ r8 = r0.f37624
            byte[] r9 = r8.f59596
            int r10 = r8.f59600
            int r11 = r8.f59597
        L17:
            if (r10 >= r11) goto L81
            r12 = r9[r10]
            r13 = 48
            if (r12 < r13) goto L5d
            r13 = 57
            if (r12 > r13) goto L5d
            int r13 = 48 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 < 0) goto L3d
            if (r16 != 0) goto L36
            long r14 = (long) r13
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 >= 0) goto L36
            goto L3d
        L36:
            r14 = 10
            long r3 = r3 * r14
            long r12 = (long) r13
            long r3 = r3 + r12
            goto L67
        L3d:
            l.۫ܽ֡ r1 = new l.۫ܽ֡
            r1.<init>()
            r1.m30715(r3)
            r1.m30720writeByte(r12)
            if (r2 != 0) goto L4d
            r1.readByte()
        L4d:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.m30714()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L5d:
            r13 = 45
            if (r12 != r13) goto L6c
            if (r1 != 0) goto L6c
            r12 = 1
            long r5 = r5 - r12
            r2 = 1
        L67:
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L17
        L6c:
            if (r1 == 0) goto L70
            r7 = 1
            goto L81
        L70:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.<init>(r3)
            java.lang.String r2 = l.C13540.m32584(r2, r12)
            r1.<init>(r2)
            throw r1
        L81:
            if (r10 != r11) goto L8d
            l.ᩴᩳ֡ r9 = r8.m43656()
            r0.f37624 = r9
            l.C19620.m45064(r8)
            goto L8f
        L8d:
            r8.f59600 = r10
        L8f:
            if (r7 != 0) goto L95
            l.ᩴᩳ֡ r8 = r0.f37624
            if (r8 != 0) goto Lf
        L95:
            long r5 = r0.f37625
            long r7 = (long) r1
            long r5 = r5 - r7
            r0.f37625 = r5
            if (r2 == 0) goto L9e
            return r3
        L9e:
            long r1 = -r3
            return r1
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12521.mo12314():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b A[EDGE_INSN: B:40:0x008b->B:37:0x008b BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    @Override // l.InterfaceC6171
    /* renamed from: ۢܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo12309() {
        /*
            r15 = this;
            long r0 = r15.f37625
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L92
            r0 = 0
            r1 = 0
            r4 = r2
        Lb:
            l.ᩴᩳ֡ r6 = r15.f37624
            byte[] r7 = r6.f59596
            int r8 = r6.f59600
            int r9 = r6.f59597
        L13:
            if (r8 >= r9) goto L77
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L37
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-87)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L62
            r11 = 70
            if (r10 > r11) goto L62
            int r11 = r10 + (-55)
        L37:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L47
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L47:
            l.۫ܽ֡ r0 = new l.۫ܽ֡
            r0.<init>()
            r0.m30712(r4)
            r0.m30720writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.m30714()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L62:
            if (r0 == 0) goto L66
            r1 = 1
            goto L77
        L66:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r1 = l.C13540.m32584(r1, r10)
            r0.<init>(r1)
            throw r0
        L77:
            if (r8 != r9) goto L83
            l.ᩴᩳ֡ r7 = r6.m43656()
            r15.f37624 = r7
            l.C19620.m45064(r6)
            goto L85
        L83:
            r6.f59600 = r8
        L85:
            if (r1 != 0) goto L8b
            l.ᩴᩳ֡ r6 = r15.f37624
            if (r6 != 0) goto Lb
        L8b:
            long r1 = r15.f37625
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f37625 = r1
            return r4
        L92:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12521.mo12309():long");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11816 m30719() {
        return new C11816(mo12306());
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۜ */
    public final C11816 mo12305(long j) {
        return new C11816(mo12312(j));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m30714() {
        try {
            return m30704(this.f37625, C21736.f69703);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC6171
    /* renamed from: ֫ */
    public final String mo12304(Charset charset) {
        try {
            return m30704(this.f37625, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m30704(long j, Charset charset) {
        C21736.m49060(this.f37625, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount > Integer.MAX_VALUE: "));
        }
        if (j == 0) {
            return "";
        }
        C18914 c18914 = this.f37624;
        int i = c18914.f59600;
        if (i + j > c18914.f59597) {
            return new String(mo12312(j), charset);
        }
        String str = new String(c18914.f59596, i, (int) j, charset);
        int i2 = (int) (c18914.f59600 + j);
        c18914.f59600 = i2;
        this.f37625 -= j;
        if (i2 == c18914.f59597) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
        }
        return str;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ֡֫ */
    public final String mo12300() {
        return mo12303(C13132.FOREVER_NS);
    }

    @Override // l.InterfaceC6171
    /* renamed from: ֫ */
    public final String mo12303(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "limit < 0: "));
        }
        long j2 = C13132.FOREVER_NS;
        if (j != C13132.FOREVER_NS) {
            j2 = j + 1;
        }
        long m30703 = m30703((byte) 10, 0L, j2);
        if (m30703 != -1) {
            return m30718(m30703);
        }
        if (j2 < this.f37625 && m30713(j2 - 1) == 13 && m30713(j2) == 10) {
            return m30718(j2);
        }
        C12521 c12521 = new C12521();
        m30711(c12521, 0L, Math.min(32L, this.f37625));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f37625, j) + " content=" + c12521.m30719().mo2332() + (char) 8230);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m30718(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (m30713(j2) == 13) {
                String m30704 = m30704(j2, C21736.f69703);
                skip(2L);
                return m30704;
            }
        }
        String m307042 = m30704(j, C21736.f69703);
        skip(1L);
        return m307042;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۜۧ */
    public final byte[] mo12306() {
        try {
            return mo12312(this.f37625);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC6171
    /* renamed from: ܽ */
    public final byte[] mo12312(long j) {
        C21736.m49060(this.f37625, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount > Integer.MAX_VALUE: "));
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // l.InterfaceC6171
    public final void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        C21736.m49060(bArr.length, i, i2);
        C18914 c18914 = this.f37624;
        if (c18914 == null) {
            return -1;
        }
        int min = Math.min(i2, c18914.f59597 - c18914.f59600);
        System.arraycopy(c18914.f59596, c18914.f59600, bArr, i, min);
        int i3 = c18914.f59600 + min;
        c18914.f59600 = i3;
        this.f37625 -= min;
        if (i3 == c18914.f59597) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C18914 c18914 = this.f37624;
        if (c18914 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c18914.f59597 - c18914.f59600);
        byteBuffer.put(c18914.f59596, c18914.f59600, min);
        int i = c18914.f59600 + min;
        c18914.f59600 = i;
        this.f37625 -= min;
        if (i == c18914.f59597) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
        }
        return min;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30706() {
        try {
            skip(this.f37625);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC6171
    public final void skip(long j) {
        while (j > 0) {
            if (this.f37624 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, r0.f59597 - r0.f59600);
            long j2 = min;
            this.f37625 -= j2;
            j -= j2;
            C18914 c18914 = this.f37624;
            int i = c18914.f59600 + min;
            c18914.f59600 = i;
            if (i == c18914.f59597) {
                this.f37624 = c18914.m43656();
                C19620.m45064(c18914);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30710(C11816 c11816) {
        if (c11816 == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c11816.mo2327(this);
    }

    @Override // l.InterfaceC10405
    /* renamed from: ܽ */
    public final InterfaceC10405 mo26251(String str) {
        m30707(0, str.length(), str);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30707(int i, int i2, String str) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C18307.m42646("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder m32308 = C13325.m32308(i2, "endIndex > string.length: ", " > ");
            m32308.append(str.length());
            throw new IllegalArgumentException(m32308.toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                C18914 m30705 = m30705(1);
                byte[] bArr = m30705.f59596;
                int i3 = m30705.f59597 - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = m30705.f59597;
                int i6 = (i3 + i) - i5;
                m30705.f59597 = i5 + i6;
                this.f37625 += i6;
            } else {
                if (charAt2 < 2048) {
                    m30720writeByte((charAt2 >> 6) | 192);
                    m30720writeByte((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    m30720writeByte((charAt2 >> '\f') | BERTags.FLAGS);
                    m30720writeByte(((charAt2 >> 6) & 63) | 128);
                    m30720writeByte((charAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        m30720writeByte(63);
                        i = i7;
                    } else {
                        int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        m30720writeByte((i8 >> 18) | 240);
                        m30720writeByte(((i8 >> 12) & 63) | 128);
                        m30720writeByte(((i8 >> 6) & 63) | 128);
                        m30720writeByte((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30717(int i) {
        if (i < 128) {
            m30720writeByte(i);
            return;
        }
        if (i < 2048) {
            m30720writeByte((i >> 6) | 192);
            m30720writeByte((i & 63) | 128);
            return;
        }
        if (i >= 65536) {
            if (i > 1114111) {
                throw new IllegalArgumentException(C13540.m32584(new StringBuilder("Unexpected code point: "), i));
            }
            m30720writeByte((i >> 18) | 240);
            m30720writeByte(((i >> 12) & 63) | 128);
            m30720writeByte(((i >> 6) & 63) | 128);
            m30720writeByte((i & 63) | 128);
            return;
        }
        if (i >= 55296 && i <= 57343) {
            m30720writeByte(63);
            return;
        }
        m30720writeByte((i >> 12) | BERTags.FLAGS);
        m30720writeByte(((i >> 6) & 63) | 128);
        m30720writeByte((i & 63) | 128);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30708(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError(C19370.m44628(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C18307.m42646("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder m32308 = C13325.m32308(i2, "endIndex > string.length: ", " > ");
            m32308.append(str.length());
            throw new IllegalArgumentException(m32308.toString());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(C21736.f69703)) {
            m30707(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    @Override // l.InterfaceC10405
    public final InterfaceC10405 write(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        C21736.m49060(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C18914 m30705 = m30705(1);
            int min = Math.min(i3 - i, 8192 - m30705.f59597);
            System.arraycopy(bArr, i, m30705.f59596, m30705.f59597, min);
            i += min;
            m30705.f59597 += min;
        }
        this.f37625 += j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C18914 m30705 = m30705(1);
            int min = Math.min(i, 8192 - m30705.f59597);
            byteBuffer.get(m30705.f59596, m30705.f59597, min);
            i -= min;
            m30705.f59597 += min;
        }
        this.f37625 += remaining;
        return remaining;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30709(InterfaceC1274 interfaceC1274) {
        if (interfaceC1274 == null) {
            throw new IllegalArgumentException("source == null");
        }
        while (interfaceC1274.mo4334(this, 8192L) != -1) {
        }
    }

    /* renamed from: writeByte, reason: collision with other method in class */
    public final void m30720writeByte(int i) {
        C18914 m30705 = m30705(1);
        byte[] bArr = m30705.f59596;
        int i2 = m30705.f59597;
        m30705.f59597 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f37625++;
    }

    /* renamed from: writeShort, reason: collision with other method in class */
    public final void m30722writeShort(int i) {
        C18914 m30705 = m30705(2);
        byte[] bArr = m30705.f59596;
        int i2 = m30705.f59597;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        m30705.f59597 = i2 + 2;
        this.f37625 += 2;
    }

    /* renamed from: writeInt, reason: collision with other method in class */
    public final void m30721writeInt(int i) {
        C18914 m30705 = m30705(4);
        byte[] bArr = m30705.f59596;
        int i2 = m30705.f59597;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        m30705.f59597 = i2 + 4;
        this.f37625 += 4;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30715(long j) {
        if (j == 0) {
            m30720writeByte(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m30707(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < BasicLabelFormatter.TRILLION ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C18914 m30705 = m30705(i);
        byte[] bArr = m30705.f59596;
        int i2 = m30705.f59597 + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f37623[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        m30705.f59597 += i;
        this.f37625 += i;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m30712(long j) {
        if (j == 0) {
            m30720writeByte(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C18914 m30705 = m30705(numberOfTrailingZeros);
        byte[] bArr = m30705.f59596;
        int i = m30705.f59597;
        int i2 = i + numberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = f37623[(int) (15 & j)];
                j >>>= 4;
            } else {
                m30705.f59597 += numberOfTrailingZeros;
                this.f37625 += numberOfTrailingZeros;
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18914 m30705(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C18914 c18914 = this.f37624;
        if (c18914 == null) {
            C18914 m45063 = C19620.m45063();
            this.f37624 = m45063;
            m45063.f59598 = m45063;
            m45063.f59599 = m45063;
            return m45063;
        }
        C18914 c189142 = c18914.f59598;
        if (c189142.f59597 + i <= 8192 && c189142.f59601) {
            return c189142;
        }
        C18914 m450632 = C19620.m45063();
        c189142.m43657(m450632);
        return m450632;
    }

    @Override // l.InterfaceC5508
    /* renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) {
        C18914 m45063;
        if (c12521 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c12521 == this) {
            throw new IllegalArgumentException("source == this");
        }
        C21736.m49060(c12521.f37625, 0L, j);
        while (j > 0) {
            C18914 c18914 = c12521.f37624;
            int i = c18914.f59597 - c18914.f59600;
            if (j < i) {
                C18914 c189142 = this.f37624;
                C18914 c189143 = c189142 != null ? c189142.f59598 : null;
                if (c189143 != null && c189143.f59601) {
                    if ((c189143.f59597 + j) - (c189143.f59602 ? 0 : c189143.f59600) <= 8192) {
                        c18914.m43658(c189143, (int) j);
                        c12521.f37625 -= j;
                        this.f37625 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    m45063 = c18914.m43659();
                } else {
                    m45063 = C19620.m45063();
                    System.arraycopy(c18914.f59596, c18914.f59600, m45063.f59596, 0, i2);
                }
                m45063.f59597 = m45063.f59600 + i2;
                c18914.f59600 += i2;
                c18914.f59598.m43657(m45063);
                c12521.f37624 = m45063;
            }
            C18914 c189144 = c12521.f37624;
            long j2 = c189144.f59597 - c189144.f59600;
            c12521.f37624 = c189144.m43656();
            C18914 c189145 = this.f37624;
            if (c189145 == null) {
                this.f37624 = c189144;
                c189144.f59598 = c189144;
                c189144.f59599 = c189144;
            } else {
                c189145.f59598.m43657(c189144);
                C18914 c189146 = c189144.f59598;
                if (c189146 == c189144) {
                    throw new IllegalStateException();
                }
                if (c189146.f59601) {
                    int i3 = c189144.f59597 - c189144.f59600;
                    if (i3 <= (8192 - c189146.f59597) + (c189146.f59602 ? 0 : c189146.f59600)) {
                        c189144.m43658(c189146, i3);
                        c189144.m43656();
                        C19620.m45064(c189144);
                    }
                }
            }
            c12521.f37625 -= j2;
            this.f37625 += j2;
            j -= j2;
        }
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
        long j2 = this.f37625;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c12521.mo8911(this, j);
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m30703(byte b, long j, long j2) {
        C18914 c18914;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            StringBuilder m31106 = C12803.m31106("size=", " fromIndex=", this.f37625);
            m31106.append(j);
            m31106.append(" toIndex=");
            m31106.append(j2);
            throw new IllegalArgumentException(m31106.toString());
        }
        long j4 = this.f37625;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c18914 = this.f37624) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c18914 = c18914.f59598;
                j4 -= c18914.f59597 - c18914.f59600;
            }
        } else {
            while (true) {
                long j5 = (c18914.f59597 - c18914.f59600) + j3;
                if (j5 >= j) {
                    break;
                }
                c18914 = c18914.f59599;
                j3 = j5;
            }
            j4 = j3;
        }
        while (j4 < j2) {
            byte[] bArr = c18914.f59596;
            int min = (int) Math.min(c18914.f59597, (c18914.f59600 + j2) - j4);
            for (int i = (int) ((c18914.f59600 + j) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return (i - c18914.f59600) + j4;
                }
            }
            j4 += c18914.f59597 - c18914.f59600;
            c18914 = c18914.f59599;
            j = j4;
        }
        return -1L;
    }

    @Override // l.InterfaceC6171
    /* renamed from: ۧ */
    public final boolean mo12311(C11816 c11816) {
        int mo2336 = c11816.mo2336();
        if (mo2336 >= 0 && this.f37625 >= mo2336 && c11816.mo2336() >= mo2336) {
            for (int i = 0; i < mo2336; i++) {
                if (m30713(i) == c11816.mo2325(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC1274
    /* renamed from: ۢ */
    public final C15384 mo4333() {
        return C15384.f47109;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12521)) {
            return false;
        }
        C12521 c12521 = (C12521) obj;
        long j = this.f37625;
        if (j != c12521.f37625) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C18914 c18914 = this.f37624;
        C18914 c189142 = c12521.f37624;
        int i = c18914.f59600;
        int i2 = c189142.f59600;
        while (j2 < this.f37625) {
            long min = Math.min(c18914.f59597 - i, c189142.f59597 - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c18914.f59596[i] != c189142.f59596[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c18914.f59597) {
                c18914 = c18914.f59599;
                i = c18914.f59600;
            }
            if (i2 == c189142.f59597) {
                c189142 = c189142.f59599;
                i2 = c189142.f59600;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        C18914 c18914 = this.f37624;
        if (c18914 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c18914.f59597;
            for (int i3 = c18914.f59600; i3 < i2; i3++) {
                i = (i * 31) + c18914.f59596[i3];
            }
            c18914 = c18914.f59599;
        } while (c18914 != this.f37624);
        return i;
    }

    public final Object clone() {
        C12521 c12521 = new C12521();
        if (this.f37625 == 0) {
            return c12521;
        }
        C18914 m43659 = this.f37624.m43659();
        c12521.f37624 = m43659;
        m43659.f59598 = m43659;
        m43659.f59599 = m43659;
        C18914 c18914 = this.f37624;
        while (true) {
            c18914 = c18914.f59599;
            if (c18914 != this.f37624) {
                c12521.f37624.f59598.m43657(c18914.m43659());
            } else {
                c12521.f37625 = this.f37625;
                return c12521;
            }
        }
    }

    public final String toString() {
        C11816 c0568;
        long j = this.f37625;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                c0568 = C11816.f35248;
            } else {
                c0568 = new C0568(this, i);
            }
            return c0568.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f37625);
    }
}
