package l;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPInputStream;

/* compiled from: NAQ4 */
/* renamed from: l.ۙۖܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4362 extends FilterInputStream implements InterfaceC14905 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f14025 = AtomicReferenceFieldUpdater.newUpdater(C4362.class, byte[].class, "buf");

    @InterfaceC4801
    public volatile byte[] buf;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14026;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14027;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14028;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f14029;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m13077() {
        byte[] bArr = this.buf;
        if (bArr != null) {
            return bArr;
        }
        throw new IOException("Stream closed");
    }

    public C4362(GZIPInputStream gZIPInputStream) {
        super(gZIPInputStream);
        this.f14027 = -1;
        this.buf = new byte[8192];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13076() {
        byte[] m13077 = m13077();
        int i = this.f14027;
        if (i < 0) {
            this.f14026 = 0;
        } else {
            int i2 = this.f14026;
            if (i2 >= m13077.length) {
                if (i > 0) {
                    int i3 = i2 - i;
                    System.arraycopy(m13077, i, m13077, 0, i3);
                    this.f14026 = i3;
                    this.f14027 = 0;
                } else {
                    int length = m13077.length;
                    int i4 = this.f14029;
                    if (length >= i4) {
                        this.f14027 = -1;
                        this.f14026 = 0;
                    } else {
                        if (m13077.length >= 2147483639) {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                        int i5 = i2 <= 2147483639 - i2 ? i2 * 2 : 2147483639;
                        if (i5 <= i4) {
                            i4 = i5;
                        }
                        byte[] bArr = new byte[i4];
                        System.arraycopy(m13077, 0, bArr, 0, i2);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14025;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, m13077, bArr)) {
                            if (atomicReferenceFieldUpdater.get(this) != m13077) {
                                throw new IOException("Stream closed");
                            }
                        }
                        m13077 = bArr;
                    }
                }
            }
        }
        this.f14028 = this.f14026;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw new IOException("Stream closed");
        }
        int i6 = this.f14026;
        int read = inputStream.read(m13077, i6, m13077.length - i6);
        if (read > 0) {
            this.f14028 = read + this.f14026;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.f14026 >= this.f14028) {
            m13076();
            if (this.f14026 >= this.f14028) {
                return -1;
            }
        }
        byte[] m13077 = m13077();
        int i = this.f14026;
        this.f14026 = i + 1;
        return m13077[i] & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[SYNTHETIC] */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            r5.m13077()
            r0 = r7 | r8
            int r1 = r7 + r8
            r0 = r0 | r1
            int r2 = r6.length
            int r2 = r2 - r1
            r0 = r0 | r2
            if (r0 < 0) goto L6b
            r0 = 0
            if (r8 != 0) goto L11
            return r0
        L11:
            int r1 = r7 + r0
            int r2 = r8 - r0
            int r3 = r5.f14028
            int r4 = r5.f14026
            int r3 = r3 - r4
            if (r3 > 0) goto L44
            byte[] r3 = r5.m13077()
            int r3 = r3.length
            if (r2 < r3) goto L38
            int r3 = r5.f14027
            if (r3 >= 0) goto L38
            java.io.InputStream r3 = r5.in
            if (r3 == 0) goto L30
            int r1 = r3.read(r6, r1, r2)
            goto L56
        L30:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Stream closed"
            r6.<init>(r7)
            throw r6
        L38:
            r5.m13076()
            int r3 = r5.f14028
            int r4 = r5.f14026
            int r3 = r3 - r4
            if (r3 > 0) goto L44
            r1 = -1
            goto L56
        L44:
            if (r3 >= r2) goto L47
            r2 = r3
        L47:
            byte[] r3 = r5.m13077()
            int r4 = r5.f14026
            java.lang.System.arraycopy(r3, r4, r6, r1, r2)
            int r1 = r5.f14026
            int r1 = r1 + r2
            r5.f14026 = r1
            r1 = r2
        L56:
            if (r1 > 0) goto L5c
            if (r0 != 0) goto L5b
            return r1
        L5b:
            return r0
        L5c:
            int r0 = r0 + r1
            if (r0 < r8) goto L60
            goto L6a
        L60:
            java.io.InputStream r1 = r5.in
            if (r1 == 0) goto L11
            int r1 = r1.available()
            if (r1 > 0) goto L11
        L6a:
            return r0
        L6b:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4362.read(byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r2 <= 0) goto L17;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long skip(long r6) {
        /*
            r5 = this;
            r5.m13077()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            goto L36
        La:
            int r2 = r5.f14028
            int r3 = r5.f14026
            int r2 = r2 - r3
            long r2 = (long) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L37
            int r2 = r5.f14027
            if (r2 >= 0) goto L29
            java.io.InputStream r0 = r5.in
            if (r0 == 0) goto L21
            long r6 = r0.skip(r6)
            return r6
        L21:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Stream closed"
            r6.<init>(r7)
            throw r6
        L29:
            r5.m13076()
            int r2 = r5.f14028
            int r3 = r5.f14026
            int r2 = r2 - r3
            long r2 = (long) r2
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 > 0) goto L37
        L36:
            return r0
        L37:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L3c
            r6 = r2
        L3c:
            int r0 = r5.f14026
            long r0 = (long) r0
            long r0 = r0 + r6
            int r1 = (int) r0
            r5.f14026 = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4362.skip(long):long");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f14028 - this.f14026;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw new IOException("Stream closed");
        }
        int available = inputStream.available();
        if (i > Integer.MAX_VALUE - available) {
            return Integer.MAX_VALUE;
        }
        return i + available;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        this.f14029 = i;
        this.f14027 = this.f14026;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        m13077();
        int i = this.f14027;
        if (i < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f14026 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            byte[] bArr = this.buf;
            if (bArr != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14025;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, bArr, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != bArr) {
                        break;
                    }
                }
                InputStream inputStream = ((FilterInputStream) this).in;
                ((FilterInputStream) this).in = null;
                if (inputStream != null) {
                    inputStream.close();
                    return;
                }
                return;
            }
            return;
        }
    }

    public final int readInt() {
        byte[] m13077 = m13077();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f14026 >= this.f14028) {
                m13076();
                if (this.f14026 >= this.f14028) {
                    throw new EOFException();
                }
            }
            int i3 = this.f14026;
            this.f14026 = i3 + 1;
            i |= (m13077[i3] & 255) << (i2 * 8);
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m13078(byte[] bArr) {
        int readInt = readInt();
        if (bArr.length < readInt) {
            bArr = new byte[readInt];
        }
        if (readInt < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        while (i < readInt) {
            int read = read(bArr, i, readInt - i);
            if (read < 0) {
                throw new EOFException();
            }
            i += read;
        }
        return new String(bArr, 0, readInt, StandardCharsets.UTF_8);
    }
}
