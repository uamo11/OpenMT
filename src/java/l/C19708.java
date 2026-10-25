package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: Z7Y5 */
/* renamed from: l.᩵᩷ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19708 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputStream f63666;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public OutputStream f63667;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45402(OutputStream outputStream) {
        this.f63667 = outputStream;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45401(InputStream inputStream) {
        this.f63666 = inputStream;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45403() {
        return this.f63666.read();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45400(int i, int i2, byte[] bArr) {
        do {
            int read = this.f63666.read(bArr, i, i2);
            if (read < 0) {
                throw new IOException("End of IO Stream Read");
            }
            i += read;
            i2 -= read;
        } while (i2 > 0);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45404() {
        try {
            OutputStream outputStream = this.f63667;
            if (outputStream != null) {
                outputStream.close();
            }
            this.f63667 = null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45399() {
        try {
            InputStream inputStream = this.f63666;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f63666 = null;
        } catch (Exception unused) {
        }
        m45404();
    }
}
