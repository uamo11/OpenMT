package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.Arrays;

/* compiled from: G4GH */
/* renamed from: l.᩻ۖܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23411 implements InterfaceC7889 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C0225 f75171 = new C0225(2);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f75172;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f75174;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75177;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f75181;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC2245 f75183;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f75179 = -1;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f75182 = false;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f75176 = false;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f75173 = false;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f75178 = 0;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f75180 = 0;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f75175 = 0;

    public C23411(InterfaceC2245 interfaceC2245) {
        this.f75183 = interfaceC2245;
        byte[] bArr = (byte[]) f75171.m1479();
        if (bArr == null) {
            bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        this.f75181 = bArr;
        this.f75174 = 131072L;
        this.f75177 = false;
        this.f75172 = 0L;
    }

    @Override // l.InterfaceC7889
    public final int available() {
        long length = length() - getFilePointer();
        if (length <= 2147483647L) {
            return (int) length;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51856() {
        long filePointer = getFilePointer();
        int i = (int) filePointer;
        if (filePointer == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m51859(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException("Data out of range (UShort)");
        }
        write(i & 255);
        write((i >>> 8) & 255);
    }

    @Override // l.InterfaceC7889
    public final void write(int i) {
        long j = this.f75180;
        long j2 = this.f75178;
        if (j >= j2) {
            if (this.f75177 && j2 < this.f75174) {
                this.f75178 = j2 + 1;
            } else {
                seek(j);
                long j3 = this.f75180;
                long j4 = this.f75178;
                if (j3 == j4) {
                    this.f75178 = j4 + 1;
                }
            }
        }
        byte[] bArr = this.f75181;
        long j5 = this.f75180;
        bArr[(int) (j5 - this.f75175)] = (byte) i;
        this.f75180 = j5 + 1;
        this.f75173 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51857(char c) {
        write(c & 255);
        write((c >>> '\b') & 255);
    }

    public final void writeInt(int i) {
        write(i & 255);
        write((i >>> 8) & 255);
        write((i >>> 16) & 255);
        write((i >>> 24) & 255);
    }

    @Override // l.InterfaceC7889
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC7889
    public final byte readByte() {
        int read = read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC7889
    /* renamed from: ۛۧ */
    public final int mo21172() {
        return (readByte() & 255) | ((readByte() & 255) << 8);
    }

    @Override // l.InterfaceC7889
    public final int read() {
        long j = this.f75180;
        if (j >= this.f75178) {
            if (this.f75177) {
                return -1;
            }
            seek(j);
            if (this.f75180 == this.f75178) {
                return -1;
            }
        }
        byte[] bArr = this.f75181;
        long j2 = this.f75180;
        byte b = bArr[(int) (j2 - this.f75175)];
        this.f75180 = j2 + 1;
        return b & 255;
    }

    @Override // l.InterfaceC7889
    public final int readInt() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24);
    }

    @Override // l.InterfaceC7889
    public final long readLong() {
        return (readByte() & 255) | ((readByte() & 255) << 8) | ((readByte() & 255) << 16) | ((readByte() & 255) << 24) | ((readByte() & 255) << 32) | ((readByte() & 255) << 40) | ((readByte() & 255) << 48) | ((255 & readByte()) << 56);
    }

    @Override // l.InterfaceC7889
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC7889
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f75180;
        if (j >= this.f75178) {
            if (this.f75177) {
                return -1;
            }
            seek(j);
            if (this.f75180 == this.f75178) {
                return -1;
            }
        }
        int min = Math.min(i2, (int) (this.f75178 - this.f75180));
        System.arraycopy(this.f75181, (int) (this.f75180 - this.f75175), bArr, i, min);
        this.f75180 += min;
        return min;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long position() {
        return getFilePointer();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel position(long j) {
        seek(j);
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final long size() {
        return length();
    }

    @Override // l.InterfaceC7889
    /* renamed from: ۧ */
    public final int mo21175(int i, int i2, byte[] bArr) {
        int i3 = 0;
        do {
            int read = read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                return i3;
            }
            i3 += read;
        } while (i3 < i2);
        return i3;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public final SeekableByteChannel truncate(long j) {
        setLength(j);
        return this;
    }

    @Override // l.InterfaceC7889
    public final void readFully(byte[] bArr) {
        m51858(bArr, 0, bArr.length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51858(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int read = read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                throw new EOFException();
            }
            i3 += read;
        } while (i3 < i2);
    }

    @Override // l.InterfaceC7889
    public final long length() {
        long j = this.f75180;
        if (this.f75179 == -1) {
            this.f75179 = this.f75183.length();
        }
        return Math.max(j, this.f75179);
    }

    public final void setLength(long j) {
        m51855();
        InterfaceC2245 interfaceC2245 = this.f75183;
        interfaceC2245.setLength(j);
        this.f75179 = j;
        if (this.f75180 > j) {
            this.f75180 = j;
        }
        if (this.f75172 > j) {
            interfaceC2245.seek(j);
            this.f75172 = j;
        }
        this.f75178 = 0L;
        this.f75175 = 0L;
        seek(this.f75180);
    }

    @Override // l.InterfaceC7889
    public final void seek(long j) {
        if (j >= this.f75178 || j < this.f75175) {
            m51855();
            long j2 = (-131072) & j;
            this.f75175 = j2;
            this.f75174 = this.f75181.length + j2;
            long j3 = this.f75172;
            InterfaceC2245 interfaceC2245 = this.f75183;
            if (j3 != j2) {
                interfaceC2245.seek(j2);
                this.f75172 = this.f75175;
            }
            int length = this.f75181.length;
            int i = 0;
            while (length > 0) {
                int read = interfaceC2245.read(this.f75181, i, length);
                if (read < 0) {
                    break;
                }
                i += read;
                length -= read;
            }
            byte[] bArr = this.f75181;
            boolean z = i < bArr.length;
            this.f75177 = z;
            if (z) {
                Arrays.fill(bArr, i, bArr.length, (byte) -1);
            }
            long j4 = i;
            this.f75172 += j4;
            this.f75178 = this.f75175 + j4;
        } else if (j < this.f75180) {
            m51855();
        }
        this.f75180 = j;
    }

    @Override // l.InterfaceC7889
    public final long getFilePointer() {
        return this.f75180;
    }

    @Override // l.InterfaceC7889
    public final int skipBytes(int i) {
        if (i <= 0) {
            return 0;
        }
        long j = this.f75180;
        long length = length();
        long j2 = i + j;
        if (j2 <= length) {
            length = j2;
        }
        seek(length);
        return (int) (length - j);
    }

    @Override // l.InterfaceC7889
    public final String getName() {
        return this.f75183.getName();
    }

    @Override // l.InterfaceC7889
    /* renamed from: ۜ֫ */
    public final InterfaceC2245 mo21173() {
        return this.f75183;
    }

    @Override // l.InterfaceC7889
    /* renamed from: ۡ */
    public final C23411 mo21174() {
        return new C23411(this.f75183.mo7437());
    }

    @Override // l.InterfaceC7889
    /* renamed from: ۧ */
    public final C23411 mo21176(long j, long j2) {
        return new C23411(this.f75183.mo7438(j, j2));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23411 m51861(long j, long j2) {
        return new C23411(this.f75183.mo7440(j, j2));
    }

    @Override // l.InterfaceC7889
    public final void flush() {
        m51855();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m51860() {
        if (this.f75176) {
            this.f75183.mo7439();
            this.f75176 = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f75182) {
            return;
        }
        m51855();
        this.f75182 = true;
        this.f75183.close();
        f75171.m1477(this.f75181);
        this.f75181 = null;
    }

    @Override // l.InterfaceC7889
    public final boolean isClosed() {
        return this.f75182;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f75182;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (r8.f75180 == r8.f75178) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[SYNTHETIC] */
    @Override // l.InterfaceC7889, java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            int r0 = r9.remaining()
            int r1 = r8.available()
            r2 = -1
            if (r1 > 0) goto Lc
            return r2
        Lc:
            if (r0 <= r1) goto Lf
            r0 = r1
        Lf:
            r1 = 0
        L10:
            int r2 = r0 - r1
            long r3 = r8.f75180
            long r5 = r8.f75178
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L2c
            boolean r5 = r8.f75177
            if (r5 == 0) goto L1f
            goto L2a
        L1f:
            r8.seek(r3)
            long r3 = r8.f75180
            long r5 = r8.f75178
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2c
        L2a:
            r2 = -1
            goto L47
        L2c:
            long r3 = r8.f75178
            long r5 = r8.f75180
            long r3 = r3 - r5
            int r4 = (int) r3
            int r2 = java.lang.Math.min(r2, r4)
            long r3 = r8.f75180
            long r5 = r8.f75175
            long r3 = r3 - r5
            int r4 = (int) r3
            byte[] r3 = r8.f75181
            r9.put(r3, r4, r2)
            long r3 = r8.f75180
            long r5 = (long) r2
            long r3 = r3 + r5
            r8.f75180 = r3
        L47:
            if (r2 >= 0) goto L4a
            return r1
        L4a:
            int r1 = r1 + r2
            if (r1 < r0) goto L10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23411.read(java.nio.ByteBuffer):int");
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            int remaining = byteBuffer.remaining();
            long j = this.f75180;
            long j2 = this.f75178;
            if (j >= j2) {
                if (this.f75177) {
                    long j3 = this.f75174;
                    if (j2 < j3) {
                        this.f75178 = j3;
                    }
                }
                seek(j);
                if (this.f75180 == this.f75178) {
                    this.f75178 = this.f75174;
                }
            }
            int min = Math.min(remaining, (int) (this.f75178 - this.f75180));
            byteBuffer.get(this.f75181, (int) (this.f75180 - this.f75175), min);
            this.f75180 += min;
            i += min;
            this.f75173 = true;
        }
        return i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51855() {
        if (this.f75173) {
            long j = this.f75172;
            long j2 = this.f75175;
            InterfaceC2245 interfaceC2245 = this.f75183;
            if (j != j2) {
                interfaceC2245.seek(j2);
            }
            interfaceC2245.write(this.f75181, 0, (int) (this.f75180 - this.f75175));
            long j3 = this.f75180;
            this.f75172 = j3;
            this.f75173 = false;
            long j4 = this.f75179;
            if (j4 != -1 && j3 > j4) {
                this.f75179 = -1L;
            }
            this.f75176 = true;
        }
    }

    @Override // l.InterfaceC7889
    public final void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            long j = this.f75180;
            long j2 = this.f75178;
            if (j >= j2) {
                if (this.f75177) {
                    long j3 = this.f75174;
                    if (j2 < j3) {
                        this.f75178 = j3;
                    }
                }
                seek(j);
                if (this.f75180 == this.f75178) {
                    this.f75178 = this.f75174;
                }
            }
            int min = Math.min(i2, (int) (this.f75178 - this.f75180));
            System.arraycopy(bArr, i, this.f75181, (int) (this.f75180 - this.f75175), min);
            this.f75180 += min;
            i += min;
            i2 -= min;
            this.f75173 = true;
        }
    }
}
