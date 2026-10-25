package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* compiled from: 97TY */
/* renamed from: l.ܶ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15436 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Rect f47255;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f47256;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f47258;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f47260;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f47262;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f47263;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f47257 = new int[4];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f47259 = -1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f47261 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36478(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36483(String str) {
        int i;
        String trim = str.trim();
        String str2 = C3603.f11424;
        for (String str3 : trim.split("\\r?\\n", -1)) {
            if (!str3.startsWith("palette: ")) {
                if (str3.startsWith("size: ")) {
                    String[] split = str3.substring(6).trim().split("x", -1);
                    if (split.length == 2) {
                        try {
                            this.f47262 = Integer.parseInt(split[0]);
                            this.f47256 = Integer.parseInt(split[1]);
                            this.f47258 = true;
                        } catch (RuntimeException e) {
                            C19956.m46036("Parsing IDX failed", e);
                        }
                    }
                }
            } else {
                String[] split2 = str3.substring(9).split(",", -1);
                this.f47263 = new int[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    int[] iArr = this.f47263;
                    try {
                        i = Integer.parseInt(split2[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36484(C17714 c17714) {
        int[] iArr = this.f47263;
        if (iArr == null || !this.f47258) {
            return;
        }
        c17714.m41478(c17714.m41464() - 2);
        int m41464 = c17714.m41464();
        while (c17714.m41485() < m41464 && c17714.m41457() > 0) {
            int m41456 = c17714.m41456();
            int[] iArr2 = this.f47257;
            switch (m41456) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (c17714.m41457() >= 2) {
                        int m414562 = c17714.m41456();
                        int m414563 = c17714.m41456();
                        iArr2[3] = m36479(m414562 >> 4, iArr);
                        iArr2[2] = m36479(m414562 & 15, iArr);
                        iArr2[1] = m36479(m414563 >> 4, iArr);
                        iArr2[0] = m36479(m414563 & 15, iArr);
                        this.f47260 = true;
                        break;
                    } else {
                        return;
                    }
                case 4:
                    if (c17714.m41457() >= 2 && this.f47260) {
                        int m414564 = c17714.m41456();
                        int m414565 = c17714.m41456();
                        iArr2[3] = m36478(iArr2[3], m414564 >> 4);
                        iArr2[2] = m36478(iArr2[2], m414564 & 15);
                        iArr2[1] = m36478(iArr2[1], m414565 >> 4);
                        iArr2[0] = m36478(iArr2[0], m414565 & 15);
                        break;
                    } else {
                        return;
                    }
                case 5:
                    if (c17714.m41457() >= 6) {
                        int m414566 = c17714.m41456();
                        int m414567 = c17714.m41456();
                        int i = (m414566 << 4) | (m414567 >> 4);
                        int m414568 = ((m414567 & 15) << 8) | c17714.m41456();
                        int m414569 = c17714.m41456();
                        int m4145610 = c17714.m41456();
                        this.f47255 = new Rect(i, (m414569 << 4) | (m4145610 >> 4), m414568 + 1, (((m4145610 & 15) << 8) | c17714.m41456()) + 1);
                        break;
                    } else {
                        return;
                    }
                case 6:
                    if (c17714.m41457() >= 4) {
                        this.f47259 = c17714.m41464();
                        this.f47261 = c17714.m41464();
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36479(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19811 m36481(C17714 c17714) {
        Rect rect;
        if (this.f47263 == null || !this.f47258 || !this.f47260 || (rect = this.f47255) == null || this.f47259 == -1 || this.f47261 == -1 || rect.width() < 2 || this.f47255.height() < 2) {
            return null;
        }
        Rect rect2 = this.f47255;
        int[] iArr = new int[rect2.height() * rect2.width()];
        C16302 c16302 = new C16302();
        c17714.m41484(this.f47259);
        c16302.m38342(c17714);
        m36480(c16302, true, rect2, iArr);
        c17714.m41484(this.f47261);
        c16302.m38342(c17714);
        m36480(c16302, false, rect2, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        C21927 c21927 = new C21927();
        c21927.m49387(createBitmap);
        c21927.m49391(rect2.left / this.f47262);
        c21927.m49393(0);
        c21927.m49385(rect2.top / this.f47256, 0);
        c21927.m49386(0);
        c21927.m49401(rect2.width() / this.f47262);
        c21927.m49384(rect2.height() / this.f47256);
        return c21927.m49383();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36480(C16302 c16302, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int width = rect.width();
        int height = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * width;
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (c16302.m38339() < 4) {
                        i2 = 0;
                        i = -1;
                        break;
                    }
                    i6 = (i6 << 4) | c16302.m38343(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.f47257[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            c16302.m38344();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36482() {
        this.f47260 = false;
        this.f47255 = null;
        this.f47259 = -1;
        this.f47261 = -1;
    }
}
