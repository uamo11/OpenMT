package l;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* compiled from: 86JZ */
/* renamed from: l.۫ۛۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12220 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f36453;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f36454 = new byte[32768];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f36455 = 18;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InputStream f36456;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f36457;

    public C12220(InputStream inputStream) {
        this.f36456 = inputStream;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29710() {
        long j = this.f36455;
        if (j >= 268435456) {
            throw new C5870("TGA input exceeds byte limit");
        }
        int i = this.f36453;
        int i2 = this.f36457;
        byte[] bArr = this.f36454;
        if (i == i2) {
            int min = (int) Math.min(bArr.length, 268435456 - j);
            InputStream inputStream = this.f36456;
            int read = inputStream.read(bArr, 0, min);
            this.f36457 = read;
            this.f36453 = 0;
            if (read == 0) {
                int read2 = inputStream.read();
                if (read2 < 0) {
                    throw new EOFException("Truncated TGA pixels");
                }
                this.f36455++;
                return read2;
            }
            if (read < 0) {
                throw new EOFException("Truncated TGA pixels");
            }
        }
        this.f36455++;
        int i3 = this.f36453;
        this.f36453 = i3 + 1;
        return bArr[i3] & 255;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29711(long j) {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        if (j < 18 || j > 268435456) {
            throw new IOException("Invalid TGA offset");
        }
        long j2 = this.f36455 - this.f36453;
        int i = this.f36457;
        if (i > 0 && j >= j2 && j <= i + j2) {
            this.f36453 = (int) (j - j2);
            this.f36455 = j;
            return;
        }
        convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) this.f36456).getChannel());
        convertMaybeLegacyFileChannelFromLibrary.position(j);
        this.f36455 = j;
        this.f36457 = 0;
        this.f36453 = 0;
    }
}
