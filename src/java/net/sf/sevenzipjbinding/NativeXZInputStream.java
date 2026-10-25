package net.sf.sevenzipjbinding;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.C0794;
import l.C11003;
import l.InterfaceC14905;

/* loaded from: classes.dex */
public final class NativeXZInputStream extends InputStream implements InterfaceC14905 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f77870;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77871;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f77872;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f77874;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f77875;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InputStream f77876;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77878;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f77879;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f77880;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public IOException f77881;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f77873 = new byte[65536];

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f77877 = new byte[1];

    public static native long nativeCreate();

    public static native long nativeDecode(long j, byte[] bArr, int i, int i2, boolean z, byte[] bArr2, int i3, int i4);

    public static native void nativeDestroy(long j);

    public static native int nativeGetApiVersion();

    public static native void nativeValidateHeader(byte[] bArr);

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public NativeXZInputStream(InputStream inputStream) {
        byte[] bArr = new byte[65536];
        this.f77880 = bArr;
        C11003.requireNonNull(inputStream, "inputStream");
        this.f77876 = inputStream;
        long nativeCreate = nativeCreate();
        this.f77875 = nativeCreate;
        if (nativeCreate == 0) {
            throw new IOException("Failed to create native XZ decoder");
        }
        try {
            new DataInputStream(inputStream).readFully(bArr, 0, 12);
            nativeValidateHeader(bArr);
            this.f77871 = 12;
        } catch (Throwable th) {
            m52878();
            throw th;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m52879() {
        return nativeGetApiVersion() == 1;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f77877;
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x003e, code lost:
    
        r6.f77872 = 0;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            if (r8 < 0) goto L74
            if (r9 < 0) goto L74
            int r0 = r8 + r9
            if (r0 < 0) goto L74
            int r1 = r7.length
            if (r0 > r1) goto L74
            r0 = 0
            if (r9 != 0) goto Lf
            return r0
        Lf:
            java.io.InputStream r1 = r6.f77876
            if (r1 == 0) goto L6c
            java.io.IOException r1 = r6.f77881
            if (r1 != 0) goto L6b
            boolean r1 = r6.f77879
            r2 = -1
            if (r1 == 0) goto L1d
            return r2
        L1d:
            r1 = 0
        L1e:
            if (r9 <= 0) goto L62
            int r3 = r6.f77874     // Catch: java.io.IOException -> L58
            int r4 = r6.f77872     // Catch: java.io.IOException -> L58
            byte[] r5 = r6.f77873
            if (r3 != r4) goto L41
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r9 < r3) goto L33
            int r3 = r6.m52880(r8, r3, r7)     // Catch: java.io.IOException -> L58
            if (r3 >= 0) goto L54
            goto L62
        L33:
            r6.f77874 = r0     // Catch: java.io.IOException -> L58
            int r3 = r5.length     // Catch: java.io.IOException -> L58
            int r3 = r6.m52880(r0, r3, r5)     // Catch: java.io.IOException -> L58
            r6.f77872 = r3     // Catch: java.io.IOException -> L58
            if (r3 >= 0) goto L41
            r6.f77872 = r0     // Catch: java.io.IOException -> L58
            goto L62
        L41:
            int r3 = r6.f77872     // Catch: java.io.IOException -> L58
            int r4 = r6.f77874     // Catch: java.io.IOException -> L58
            int r3 = r3 - r4
            int r3 = java.lang.Math.min(r9, r3)     // Catch: java.io.IOException -> L58
            int r4 = r6.f77874     // Catch: java.io.IOException -> L58
            java.lang.System.arraycopy(r5, r4, r7, r8, r3)     // Catch: java.io.IOException -> L58
            int r4 = r6.f77874     // Catch: java.io.IOException -> L58
            int r4 = r4 + r3
            r6.f77874 = r4     // Catch: java.io.IOException -> L58
        L54:
            int r8 = r8 + r3
            int r9 = r9 - r3
            int r1 = r1 + r3
            goto L1e
        L58:
            r7 = move-exception
            r6.f77881 = r7
            r6.m52878()
            if (r1 == 0) goto L61
            goto L62
        L61:
            throw r7
        L62:
            if (r1 != 0) goto L69
            boolean r7 = r6.f77879
            if (r7 == 0) goto L69
            goto L6a
        L69:
            r2 = r1
        L6a:
            return r2
        L6b:
            throw r1
        L6c:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Stream closed"
            r7.<init>(r8)
            throw r7
        L74:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sf.sevenzipjbinding.NativeXZInputStream.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f77876;
        if (inputStream == null) {
            return;
        }
        this.f77876 = null;
        try {
            m52878();
        } finally {
            inputStream.close();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m52880(int i, int i2, byte[] bArr) {
        while (!this.f77879) {
            if (this.f77870 == this.f77871 && !this.f77878) {
                this.f77870 = 0;
                InputStream inputStream = this.f77876;
                byte[] bArr2 = this.f77880;
                int read = inputStream.read(bArr2);
                this.f77871 = read;
                if (read < 0) {
                    this.f77871 = 0;
                    this.f77878 = true;
                } else if (read == 0) {
                    int read2 = this.f77876.read();
                    if (read2 < 0) {
                        this.f77878 = true;
                    } else {
                        bArr2[0] = (byte) read2;
                        this.f77871 = 1;
                    }
                }
            }
            int i3 = this.f77870;
            int i4 = this.f77871 - i3;
            long nativeDecode = nativeDecode(this.f77875, this.f77880, i3, i4, this.f77878, bArr, i, i2);
            if (((-1125899906842624L) & nativeDecode) != 0) {
                throw new IOException("Invalid native XZ decoder result flags");
            }
            int i5 = (int) (nativeDecode & 16777215);
            int i6 = (int) (16777215 & (nativeDecode >>> 24));
            if (i5 > i4 || i6 > i2) {
                throw new IOException("Invalid native XZ decoder result size");
            }
            int i7 = this.f77870 + i5;
            this.f77870 = i7;
            boolean z = (281474976710656L & nativeDecode) != 0;
            boolean z2 = (nativeDecode & 562949953421312L) != 0;
            if (z && i7 != this.f77871) {
                throw new IOException("Native XZ decoder requested input before consuming the current buffer");
            }
            if (i6 > 0) {
                return i6;
            }
            if (this.f77878 && i7 == this.f77871 && z) {
                if (!z2) {
                    throw new EOFException("Unexpected end of XZ input");
                }
                this.f77879 = true;
                m52878();
                return -1;
            }
            if (i7 == i3 && (!z || i7 != this.f77871)) {
                throw new IOException("Native XZ decoder made no progress");
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.f77876 != null) {
            IOException iOException = this.f77881;
            if (iOException != null) {
                throw iOException;
            }
            return this.f77872 - this.f77874;
        }
        throw new IOException("Stream closed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52878() {
        long j = this.f77875;
        if (j != 0) {
            nativeDestroy(j);
            this.f77875 = 0L;
        }
    }
}
