package l;

import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: H74N */
/* renamed from: l.ۘ᩸ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4208 implements InterfaceC7505 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9147 f13676;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f13677;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f13678;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C4208(MediaDataSource mediaDataSource, long j, C9147 c9147) {
        this.f13677 = mediaDataSource;
        this.f13678 = j;
        this.f13676 = c9147;
    }

    @Override // l.InterfaceC7505
    public final long length() {
        return this.f13678;
    }

    @Override // l.InterfaceC7505
    /* renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) {
        C9147 c9147 = this.f13676;
        if (j < 0 || i2 < 0 || j > this.f13678 - i2) {
            throw new EOFException("MPEG-TS thumbnail read exceeds source length");
        }
        int i3 = 0;
        while (i3 < i2) {
            C19025.m43872();
            try {
                int readAt = this.f13677.readAt(i3 + j, bArr, i + i3, i2 - i3);
                if (readAt <= 0) {
                    C9147.m23523(c9147);
                    throw new C16201(new EOFException("Unexpected end of MPEG-TS thumbnail source"));
                }
                i3 += readAt;
            } catch (IOException e) {
                C9147.m23523(c9147);
                throw new C16201(e);
            }
        }
    }
}
