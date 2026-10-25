package l;

import java.io.EOFException;
import java.io.InputStream;

/* compiled from: OAR3 */
/* renamed from: l.ۢ۟ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9440 extends AbstractC14377 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f28626;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f28627;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8734 f28628;

    public C9440(C8734 c8734, long j) {
        this.f28628 = c8734;
        this.f28626 = j;
    }

    @Override // l.AbstractC14377
    /* renamed from: ܽ */
    public final EnumC15788 mo18150() {
        return this.f28627 < this.f28626 ? EnumC15788.STORED : EnumC15788.INITIAL;
    }

    @Override // l.AbstractC14377
    /* renamed from: ֫ */
    public final int mo18148(byte[] bArr, int i, int i2) {
        C13150 c13150;
        InputStream inputStream;
        C23550 c23550;
        int i3;
        C23550 c235502;
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        int min = (int) Math.min(this.f28626 - this.f28627, i2);
        while (i4 < min) {
            C8734 c8734 = this.f28628;
            c13150 = c8734.f26592;
            if (c13150.m31881() > 0) {
                byte m22580 = (byte) C8734.m22580(c8734, 8);
                c235502 = c8734.f26593;
                c235502.m52009(m22580);
                bArr[i + i4] = m22580;
                i3 = 1;
            } else {
                inputStream = c8734.f26595;
                int i5 = i + i4;
                int read = inputStream.read(bArr, i5, min - i4);
                if (read == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                c23550 = c8734.f26593;
                for (int i6 = i5; i6 < i5 + read; i6++) {
                    c23550.m52009(bArr[i6]);
                }
                i3 = read;
            }
            this.f28627 += i3;
            i4 += i3;
        }
        return min;
    }

    @Override // l.AbstractC14377
    /* renamed from: ۧ */
    public final boolean mo18149() {
        return this.f28627 < this.f28626;
    }

    @Override // l.AbstractC14377
    /* renamed from: ֫ */
    public final int mo18147() {
        C13150 c13150;
        long j = this.f28626 - this.f28627;
        c13150 = this.f28628.f26592;
        return (int) Math.min(j, c13150.m31880() / 8);
    }
}
