package l;

import java.util.Arrays;

/* compiled from: B2S5 */
/* renamed from: l.ۙ۠ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4523 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f14368;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f14369;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3112 f14370;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f14371;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f14372;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14373;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f14374;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f14375;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f14376;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f14377;

    public C4523(C3112 c3112, int i, int i2) {
        this.f14370 = c3112;
        this.f14368 = i;
        this.f14376 = i2;
        m13295();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m13298() {
        return ((this.f14371 - this.f14374) + 1) * ((this.f14373 - this.f14372) + 1) * ((this.f14375 - this.f14377) + 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13294() {
        return (this.f14376 + 1) - this.f14368 > 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13295() {
        C3112 c3112 = this.f14370;
        int[] iArr = c3112.f9723;
        int[] iArr2 = c3112.f9725;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = this.f14368; i8 <= this.f14376; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i4) {
                i4 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
        }
        this.f14377 = i;
        this.f14375 = i4;
        this.f14372 = i2;
        this.f14373 = i5;
        this.f14374 = i3;
        this.f14371 = i6;
        this.f14369 = i7;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4523 m13297() {
        if (!m13294()) {
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
        int i = this.f14375 - this.f14377;
        int i2 = this.f14373 - this.f14372;
        int i3 = this.f14371 - this.f14374;
        int i4 = (i < i2 || i < i3) ? (i2 < i || i2 < i3) ? -1 : -2 : -3;
        C3112 c3112 = this.f14370;
        int[] iArr = c3112.f9723;
        int[] iArr2 = c3112.f9725;
        int i5 = this.f14376;
        int i6 = this.f14368;
        C3112.m9485(i4, i6, i5, iArr);
        Arrays.sort(iArr, i6, this.f14376 + 1);
        C3112.m9485(i4, i6, this.f14376, iArr);
        int i7 = this.f14369 / 2;
        int i8 = 0;
        int i9 = i6;
        while (true) {
            int i10 = this.f14376;
            if (i9 > i10) {
                break;
            }
            i8 += iArr2[iArr[i9]];
            if (i8 >= i7) {
                i6 = Math.min(i10 - 1, i9);
                break;
            }
            i9++;
        }
        C4523 c4523 = new C4523(c3112, i6 + 1, this.f14376);
        this.f14376 = i6;
        m13295();
        return c4523;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5934 m13296() {
        C3112 c3112 = this.f14370;
        int[] iArr = c3112.f9723;
        int[] iArr2 = c3112.f9725;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.f14368; i5 <= this.f14376; i5++) {
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            i2 += i7;
            i += ((i6 >> 10) & 31) * i7;
            i3 += ((i6 >> 5) & 31) * i7;
            i4 += i7 * (i6 & 31);
        }
        float f = i2;
        return new C5934(C3112.m9484(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
    }
}
