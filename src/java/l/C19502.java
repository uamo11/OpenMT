package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: K4GH */
/* renamed from: l.᩵ܰۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19502 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63026 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f63027;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f63028;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f63029;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0450 f63030;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f63031;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f63032;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C19502(final C18090 c18090, final C3545 c3545, C12445 c12445, String str) {
        this.f63031 = new byte[16];
        this.f63027 = 0;
        this.f63032 = 0;
        this.f63028 = c12445;
        int m10768 = c3545.m10768();
        int m8113 = C2568.m8113(m10768);
        long j = m8113 + 12;
        if (c3545.m10793() < j) {
            throw new IOException("Invalid AES compressed size: " + c3545.m10793() + " < " + j + " (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        byte[] bArr = new byte[m8113];
        byte[] bArr2 = new byte[2];
        C2568.m8119(c12445, bArr, m8113);
        C2568.m8119(c12445, bArr2, 2);
        this.f63029 = c3545.m10793() - j;
        this.f63030 = new C0450(m10768, str, bArr, bArr2, new InterfaceC6141() { // from class: l.ᩴܰۡ
            @Override // l.InterfaceC6141
            public final Object get() {
                c18090.m42192("");
                return new C3979(c3545.getName());
            }
        });
    }

    public C19502(AbstractC15440 abstractC15440, String str, InterfaceC6141 interfaceC6141) {
        BufferedInputStream m36518 = abstractC15440.m36518();
        long mo23127 = abstractC15440.mo23127();
        this.f63031 = new byte[16];
        this.f63027 = 0;
        this.f63032 = 0;
        this.f63028 = m36518;
        try {
            byte[] bArr = new byte[8];
            byte[] bArr2 = new byte[2];
            C2568.m8119(m36518, bArr, 8);
            if (C15972.m37755(0, bArr) != 6436280820912968781L) {
                throw new IOException("Bad magic");
            }
            C2568.m8119(m36518, bArr, 8);
            C2568.m8119(m36518, bArr2, 2);
            this.f63029 = (((mo23127 - 8) - 8) - 2) - 10;
            this.f63030 = new C0450(1, str, bArr, bArr2, interfaceC6141);
        } catch (IOException e) {
            C0349.m1793(m36518);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f63032;
        if (i3 == -1) {
            return -1;
        }
        if (this.f63027 >= i3) {
            m44916();
            if (this.f63032 == -1) {
                return -1;
            }
        }
        int i4 = 0;
        do {
            int min = Math.min(this.f63032 - this.f63027, i2);
            System.arraycopy(this.f63031, this.f63027, bArr, i, min);
            i4 += min;
            this.f63027 += min;
            i += min;
            i2 -= min;
            if (i2 == 0) {
                break;
            }
            m44916();
        } while (this.f63032 != -1);
        return i4;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f63032;
        if (i == -1) {
            return -1;
        }
        if (this.f63027 >= i) {
            m44916();
            if (this.f63032 == -1) {
                return -1;
            }
        }
        int i2 = this.f63027;
        this.f63027 = i2 + 1;
        return this.f63031[i2] & 255;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m44916() {
        if (this.f63032 == -1) {
            throw new IllegalStateException();
        }
        long j = this.f63029;
        InputStream inputStream = this.f63028;
        C0450 c0450 = this.f63030;
        if (j == 0) {
            this.f63032 = -1;
            byte[] m2009 = c0450.m2009();
            byte[] bArr = new byte[10];
            C2568.m8119(inputStream, bArr, 10);
            for (int i = 0; i < 10; i++) {
                if (bArr[i] != m2009[i]) {
                    throw new IOException("Reached end of data for this entry, but aes verification failed");
                }
            }
            return;
        }
        int min = (int) Math.min(16L, j);
        byte[] bArr2 = this.f63031;
        int m8114 = C2568.m8114(inputStream, bArr2, min);
        this.f63032 = m8114;
        if (m8114 == 0) {
            this.f63032 = -1;
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
        c0450.m2008(m8114, bArr2);
        this.f63027 = 0;
        this.f63029 -= this.f63032;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f63028.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m44917() {
        return this.f63029;
    }
}
