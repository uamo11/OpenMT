package l;

/* compiled from: A8LK */
/* renamed from: l.֫ۖۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1536 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final long[] f5420 = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5421;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f5422 = new byte[8];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5423;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5252() {
        this.f5423 = 0;
        this.f5421 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m5251(InterfaceC8424 interfaceC8424, boolean z, boolean z2, int i) {
        int i2 = this.f5423;
        byte[] bArr = this.f5422;
        if (i2 == 0) {
            if (!interfaceC8424.mo22063(z, 0, 1, bArr)) {
                return -1L;
            }
            int m5248 = m5248(bArr[0] & 255);
            this.f5421 = m5248;
            if (m5248 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f5423 = 1;
        }
        int i3 = this.f5421;
        if (i3 > i) {
            this.f5423 = 0;
            return -2L;
        }
        if (i3 != 1) {
            interfaceC8424.readFully(bArr, 1, i3 - 1);
        }
        this.f5423 = 0;
        return m5249(bArr, this.f5421, z2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5250() {
        return this.f5421;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5248(int i) {
        int i2 = 0;
        while (i2 < 8) {
            long j = f5420[i2] & i;
            i2++;
            if (j != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m5249(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f5420[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }
}
