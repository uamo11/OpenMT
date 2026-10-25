package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: K4GS */
/* renamed from: l.ۛܰۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6095 extends InputStream implements InterfaceC14905 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f18678;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CRC32 f18679 = new CRC32();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3545 f18680;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C6095(C3545 c3545, InputStream inputStream) {
        this.f18680 = c3545;
        this.f18678 = inputStream;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f18678.read(bArr, i, i2);
        CRC32 crc32 = this.f18679;
        if (read > 0) {
            crc32.update(bArr, i, read);
            return read;
        }
        if (read == -1) {
            int value = (int) crc32.getValue();
            C3545 c3545 = this.f18680;
            if (c3545.m10782() != value) {
                throw m17005(c3545, value);
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f18678.read();
        CRC32 crc32 = this.f18679;
        if (read != -1) {
            crc32.update(read);
            return read;
        }
        int value = (int) crc32.getValue();
        C3545 c3545 = this.f18680;
        if (c3545.m10782() == value) {
            return read;
        }
        throw m17005(c3545, value);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18678.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m17005(C3545 c3545, int i) {
        if (c3545.m10808() && c3545.m10792() && c3545.m10767() == 0) {
            return new C3979(c3545.getName());
        }
        return new ZipException(String.format("Bad file CRC value: expected=0x%08x, got=0x%08x (%s)", Integer.valueOf(c3545.m10782()), Integer.valueOf(i), c3545.getName()));
    }
}
