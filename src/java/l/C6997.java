package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: A6SP */
/* renamed from: l.ۜ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6997 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f21600;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9114 f21601;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f21603;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f21604;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f21599 = new byte[8192];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f21602 = -1;

    public C6997(C9114 c9114, long j) {
        this.f21601 = c9114;
        this.f21604 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m18925(long j) {
        if (j >= 0) {
            long j2 = this.f21604;
            long j3 = this.f21603;
            if (j <= j2 - j3) {
                return j3 + j;
            }
        }
        throw new EOFException("Invalid legacy state field boundary");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18929(long j) {
        this.f21603 = m18925(j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18923() {
        FileChannel fileChannel;
        m18925(1L);
        long j = this.f21603;
        long j2 = this.f21602;
        byte[] bArr = this.f21599;
        if (j < j2 || j >= j2 + this.f21600) {
            this.f21602 = j;
            fileChannel = this.f21601.f27613;
            int read = fileChannel.read(ByteBuffer.wrap(bArr), this.f21603);
            this.f21600 = read;
            if (read <= 0) {
                throw new EOFException("Truncated legacy state");
            }
        }
        long j3 = this.f21603;
        this.f21603 = 1 + j3;
        return bArr[(int) (j3 - this.f21602)] & 255;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m18927() {
        return m18923() | (m18923() << 8) | (m18923() << 16) | (m18923() << 24);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18928(int i) {
        if (m18927() != i) {
            throw new IOException("Invalid legacy state magic");
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m18931() {
        m18929(m18927());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18924(int i) {
        int m18927 = m18927();
        if (m18927 < 0 || m18927 > (this.f21604 - this.f21603) / i) {
            throw new IOException("Invalid legacy state item count");
        }
        return m18927;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18932() {
        if (this.f21603 != this.f21604) {
            throw new IOException("Trailing bytes in legacy state record");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18926(int[] iArr) {
        int m18924 = m18924(12);
        int i = iArr[0];
        if (m18924 > 100000 - i) {
            throw new IOException("Legacy history record limit exceeded");
        }
        iArr[0] = i + m18924;
        for (int i2 = 0; i2 < m18924; i2++) {
            int m189242 = m18924(28);
            if (m189242 > 0) {
                int i3 = iArr[1];
                if (m189242 <= 100000 - i3) {
                    iArr[1] = i3 + m189242;
                    for (int i4 = 0; i4 < m189242; i4++) {
                        m18929(20L);
                        m18931();
                        m18931();
                    }
                    m18929(8L);
                }
            }
            throw new IOException("Invalid legacy history change count");
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9820 m18930() {
        C9820 m23479;
        long j = this.f21603;
        if (this.f21604 - j >= 4) {
            int m18927 = m18927();
            this.f21603 = j;
            if (m18927 == -1568513661) {
                m18929(4L);
                m18929((m18923() | (m18923() << 8)) * 8);
            }
        }
        m23479 = this.f21601.m23479(j, this.f21603);
        return m23479;
    }
}
