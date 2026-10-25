package l;

import java.util.Arrays;

/* compiled from: A70P */
/* renamed from: l.ۛ֫ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5750 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f17687;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17688;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f17689;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f17690;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12100 f17691;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f17692;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f17693;

    public C5750() {
        int m32559;
        m32559 = C13510.m32559(65536);
        this.f17687 = new long[m32559];
        this.f17692 = C13132.FOREVER_NS;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16184(int i, boolean z) {
        C12100 m32561;
        m16180(i);
        while (i > 0) {
            int i2 = this.f17688;
            if (i2 == 0 && i >= 65536) {
                int i3 = (-65536) & i;
                m32561 = C13510.m32561(this.f17691, C13510.m32552(i3, z));
                this.f17691 = m32561;
                i -= i3;
            } else {
                int min = Math.min(i, 65536 - i2);
                if (z) {
                    int i4 = this.f17688;
                    C13510.m32555(i4, i4 + min, this.f17687);
                }
                int i5 = this.f17688 + min;
                this.f17688 = i5;
                i -= min;
                if (i5 == 65536) {
                    m16181();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16183(int i, int i2, long[] jArr) {
        m16180(i2);
        int i3 = i2;
        int i4 = i;
        while (i3 > 0) {
            int min = Math.min(i3, 65536 - this.f17688);
            int i5 = this.f17688;
            int i6 = i4;
            int i7 = min;
            while (i7 > 0) {
                int i8 = i6 >>> 6;
                int i9 = i6 & 63;
                int i10 = i5 >>> 6;
                int i11 = i5 & 63;
                int min2 = Math.min(i7, 64 - i11);
                long j = jArr[i8] >>> i9;
                if (i9 != 0 && i9 + min2 > 64) {
                    j |= jArr[i8 + 1] << (64 - i9);
                }
                long j2 = min2 == 64 ? -1L : (1 << min2) - 1;
                long[] jArr2 = this.f17687;
                jArr2[i10] = ((j2 & j) << i11) | jArr2[i10];
                i6 += min2;
                i5 += min2;
                i7 -= min2;
            }
            i4 += min;
            int i12 = this.f17688 + min;
            this.f17688 = i12;
            i3 -= min;
            if (i12 == 65536) {
                m16181();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12100 m16182() {
        if (this.f17690) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        m16181();
        this.f17690 = true;
        return this.f17691;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m16186() {
        return (this.f17687.length * 8) + this.f17689;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16185(long j) {
        this.f17692 = Math.max(0L, j);
        if (m16186() > this.f17692) {
            throw new IllegalStateException("Dirty bitmap exceeds memory limit");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m16180(int i) {
        if (this.f17690) {
            throw new IllegalStateException("Dirty sequence builder already built");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Dirty length must not be negative");
        }
        int i2 = this.f17693;
        if (i2 + i > 2147483647L) {
            throw new ArithmeticException("Dirty length overflow");
        }
        this.f17693 = i2 + i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m16181() {
        int m32559;
        int m325592;
        long[] jArr;
        C12100 m32560;
        C12100 m32561;
        long m32551;
        int i = this.f17688;
        if (i == 0) {
            return;
        }
        m32559 = C13510.m32559(i);
        int i2 = this.f17688;
        m325592 = C13510.m32559(i2);
        int i3 = i2 & 63;
        int i4 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            jArr = this.f17687;
            if (i4 >= m325592) {
                break;
            }
            long j = (i4 != m325592 + (-1) || i3 == 0) ? -1L : (1 << i3) - 1;
            long j2 = jArr[i4] & j;
            z |= j2 != 0;
            z2 &= j2 == j;
            i4++;
        }
        if (z && !z2) {
            m32551 = C13510.m32551(m16186(), m32559 * 8);
            if (m32551 > this.f17692) {
                throw new IllegalStateException("Dirty bitmap exceeds memory limit");
            }
        }
        m32560 = C13510.m32560(this.f17688, Arrays.copyOf(jArr, m32559));
        if (m32560.m29514()) {
            this.f17689 = (m32560.f36166.length * 8) + this.f17689;
        }
        m32561 = C13510.m32561(this.f17691, m32560);
        this.f17691 = m32561;
        Arrays.fill(jArr, 0L);
        this.f17688 = 0;
    }
}
