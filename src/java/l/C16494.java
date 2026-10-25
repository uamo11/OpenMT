package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: DARC */
/* renamed from: l.ܽ۟ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16494 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f50690;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f50691 = new byte[1];

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8734 f50692;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3545 f50693;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C16494(C3545 c3545, InputStream inputStream) {
        this.f50692 = new C8734(inputStream);
        this.f50690 = inputStream;
        this.f50693 = c3545;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr;
        int read;
        do {
            bArr = this.f50691;
            read = read(bArr);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        if (read == 1) {
            return bArr[0] & 255;
        }
        StringBuilder m32308 = C13325.m32308(read, "Invalid return value from read: ", " (");
        m32308.append(this.f50693.getName());
        m32308.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IllegalStateException(m32308.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        C8734 c8734 = this.f50692;
        if (c8734 == null) {
            return -1;
        }
        try {
            int m22590 = c8734.m22590(i, i2, bArr);
            if (m22590 == -1) {
                C22194.m49850(this.f50692);
                this.f50692 = null;
            }
            return m22590;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input. (" + this.f50693.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        C8734 c8734 = this.f50692;
        if (c8734 != null) {
            return c8734.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            C22194.m49850(this.f50692);
            this.f50692 = null;
        } finally {
            InputStream inputStream = this.f50690;
            if (inputStream != null) {
                inputStream.close();
                this.f50690 = null;
            }
        }
    }
}
