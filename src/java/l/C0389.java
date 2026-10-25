package l;

import java.io.BufferedInputStream;
import java.io.IOException;

/* compiled from: 46LQ */
/* renamed from: l.֡ۨۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0389 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f1834 = new byte[256];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9189 f1835;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream f1836;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f1837;

    public C0389(BufferedInputStream bufferedInputStream, C9189 c9189) {
        this.f1836 = bufferedInputStream;
        this.f1835 = c9189;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1883() {
        AbstractC22967.m51107(this.f1835);
        long j = this.f1837 + 1;
        this.f1837 = j;
        if (j > 268435456) {
            throw new IOException("GIF input exceeds byte limit");
        }
        int read = this.f1836.read();
        if (read >= 0) {
            return read;
        }
        throw new IOException("Truncated GIF container");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m1885() {
        return m1883() | (m1883() << 8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1884(int i) {
        while (i > 0) {
            AbstractC22967.m51107(this.f1835);
            byte[] bArr = this.f1834;
            int read = this.f1836.read(bArr, 0, Math.min(i, bArr.length));
            if (read < 0) {
                throw new IOException("Truncated GIF container");
            }
            if (read == 0) {
                m1883();
                i--;
            } else {
                long j = this.f1837 + read;
                this.f1837 = j;
                if (j > 268435456) {
                    throw new IOException("GIF input exceeds byte limit");
                }
                i -= read;
            }
        }
    }
}
