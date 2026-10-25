package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* compiled from: 79WK */
/* renamed from: l.ۤۚ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C10093 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f30383 = C11321.m27961(C10093.class);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f30384;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12209 f30385;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f30386;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30387;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f30388;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f30389;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f30390;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f30391;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f30392;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30393;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12914 f30394;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public byte[] f30395;

    @Override // java.io.InputStream
    public int available() {
        return 0;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* renamed from: ֫ */
    public synchronized C12209 mo19515() {
        C12209 c12209 = this.f30385;
        if (c12209 != null && c12209.m29689()) {
            C12209 c122092 = this.f30385;
            c122092.m29686();
            return c122092;
        }
        C12914 c12914 = this.f30394;
        if (c12914 instanceof C11504) {
            this.f30385 = c12914.m31362(32, ((C11504) c12914).m28327() & 16711680, this.f30386, 128, 0);
        } else {
            C12209 m31362 = c12914.m31362(this.f30390, this.f30393, this.f30386, 128, 0);
            m31362.m29686();
            this.f30385 = m31362;
        }
        return this.f30385;
    }

    public C10093(C12914 c12914) {
        this.f30395 = new byte[1];
        this.f30394 = c12914;
        this.f30391 = false;
        this.f30390 = 0;
        this.f30393 = 1;
        this.f30386 = 7;
        try {
            C3618 m31375 = c12914.m31375();
            try {
                this.f30388 = m31375.m11100();
                if (c12914.mo28329() != 16) {
                    C12209 mo19515 = mo19515();
                    if (mo19515 != null) {
                        mo19515.m29688();
                    }
                    this.f30390 = 0;
                }
                m25352(m31375);
                m31375.close();
            } finally {
            }
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    public C10093(C11504 c11504, C3618 c3618) {
        this.f30395 = new byte[1];
        this.f30394 = c11504;
        this.f30385 = null;
        this.f30391 = false;
        this.f30388 = c3618.m11100();
        try {
            m25352(c3618);
        } catch (C19369 e) {
            throw C3037.m9289(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25352(InterfaceC18435 interfaceC18435) {
        if (this.f30388) {
            C3618 c3618 = (C3618) interfaceC18435;
            this.f30389 = c3618.m11091();
            this.f30387 = c3618.m11091();
            return;
        }
        C3618 c36182 = (C3618) interfaceC18435;
        this.f30389 = Math.min(c36182.m11091() - 70, c36182.m11102() - 70);
        boolean m11089 = c36182.m11089(16384);
        InterfaceC2148 interfaceC2148 = f30383;
        if (m11089) {
            this.f30384 = true;
            this.f30387 = Math.min(((C13722) c36182.m11094()).m32982() - 70, c36182.m11096() ? 65465 : 16777145);
            interfaceC2148.mo7088("Enabling LARGE_READX with " + this.f30387);
        } else {
            interfaceC2148.mo7088("LARGE_READX disabled");
            this.f30387 = this.f30389;
        }
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Negotiated file read size is " + this.f30387);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m25351(C3037 c3037) {
        Throwable cause = c3037.getCause();
        IOException iOException = c3037;
        if (cause instanceof C1708) {
            IOException iOException2 = (C1708) cause;
            cause = iOException2.getCause();
            iOException = iOException2;
        }
        if (!(cause instanceof InterruptedException)) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException(cause.getMessage());
        interruptedIOException.initCause(cause);
        return interruptedIOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C12914 c12914 = this.f30394;
        boolean z = this.f30391;
        try {
            try {
                C12209 c12209 = this.f30385;
                if (c12209 != null) {
                    c12209.m29688();
                }
            } catch (C3037 e) {
                throw m25351(e);
            }
        } finally {
            this.f30395 = null;
            this.f30385 = null;
            if (z) {
                c12914.close();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (m25353(0, 1, this.f30395) == -1) {
            return -1;
        }
        return this.f30395[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return m25353(0, bArr.length, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return m25353(i, i2, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x019e, code lost:
    
        r0 = (int) (r25.f30392 - r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a0, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a3, code lost:
    
        r8.m29688();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a6, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184 A[Catch: all -> 0x01ca, TRY_ENTER, TryCatch #6 {all -> 0x01ca, blocks: (B:11:0x001e, B:13:0x0024, B:14:0x0043, B:16:0x0055, B:20:0x0061, B:22:0x0067, B:25:0x0099, B:27:0x00a3, B:30:0x00ad, B:34:0x00c1, B:37:0x00cd, B:66:0x00f1, B:40:0x0103, B:47:0x019c, B:76:0x00e0, B:78:0x00e9, B:80:0x0110, B:82:0x00bf, B:57:0x01b5, B:63:0x01c5, B:64:0x01c9, B:88:0x011f, B:108:0x013f, B:94:0x0162, B:98:0x0172, B:96:0x0184, B:91:0x014b, B:93:0x014f, B:120:0x0058), top: B:10:0x001e, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0172 A[SYNTHETIC] */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m25353(int r26, int r27, byte[] r28) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10093.m25353(int, int, byte[]):int");
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        this.f30392 += j;
        return j;
    }
}
