package l;

import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: 26K9 */
/* renamed from: l.֫᩺ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2133 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7054(C8917 c8917, RectF rectF, int i, int i2, int i3) {
        float max = Math.max(0.0f, rectF.left);
        float max2 = Math.max(0.0f, rectF.top);
        float min = Math.min(i, rectF.right);
        float min2 = Math.min(i2, rectF.bottom);
        return c8917.f27096 <= i3 && max < min && max2 < min2 && ((float) c8917.f27099) <= max && ((float) c8917.f27100) <= max2 && ((float) c8917.f27101) >= min && ((float) c8917.f27097) >= min2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m7051(int i, int i2, RectF rectF, float f, int i3, long j, int i4, int i5) {
        double d;
        double d2;
        int i6 = i;
        RectF rectF2 = rectF;
        if (i6 <= 0 || i2 <= 0 || rectF.isEmpty() || f <= 0.0f || !m7052(f) || !m7052(rectF2.left) || !m7052(rectF2.top) || !m7052(rectF2.right) || !m7052(rectF2.bottom) || j <= 0 || i4 <= 0 || i5 <= 0) {
            return Collections.EMPTY_LIST;
        }
        double max = Math.max(0.0f, rectF2.left);
        double max2 = Math.max(0.0f, rectF2.top);
        double min = Math.min(i6, rectF2.right);
        double min2 = Math.min(i2, rectF2.bottom);
        if (max >= min || max2 >= min2) {
            return Collections.EMPTY_LIST;
        }
        int i7 = 1;
        while (true) {
            if (i7 >= 1073741824) {
                d = min2;
                break;
            }
            d = min2;
            if (i7 * 2.0d * f > 1.0d) {
                break;
            }
            i7 <<= 1;
            min2 = d;
        }
        int i8 = i3;
        int i9 = i7;
        while (i9 < i8) {
            double d3 = i9;
            double d4 = (rectF2.right - rectF2.left) / d3;
            double d5 = min;
            double d6 = (rectF2.bottom - rectF2.top) / d3;
            int i10 = i9;
            double d7 = max2;
            double d8 = max;
            if (m7053(i, i2, i9, d4, d6, 32.0d, 32.0d, j, i4, i5)) {
                double d9 = 32.0d;
                double max3 = Math.max(0.0d, Math.min(256.0d, d4 / 4.0d) - 32.0d);
                double max4 = Math.max(0.0d, Math.min(256.0d, d6 / 4.0d) - 32.0d);
                int i11 = 4;
                while (true) {
                    if (i11 <= 0) {
                        d2 = 32.0d;
                        break;
                    }
                    double d10 = i11;
                    double d11 = ((max3 * d10) / 4.0d) + 32.0d;
                    d2 = ((d10 * max4) / 4.0d) + 32.0d;
                    int i12 = i11;
                    if (m7053(i, i2, i10, d4, d6, d11, d2, j, i4, i5)) {
                        d9 = d11;
                        break;
                    }
                    i11 = i12 - 1;
                }
                long j2 = i10 * 64;
                double d12 = d9 * d3;
                double d13 = j2;
                double d14 = d2 * d3;
                return Collections.singletonList(new C8917(i, i2, i10, ((long) (Math.max(0.0d, d8 - d12) / d13)) * j2, ((long) (Math.max(0.0d, d7 - d14) / d13)) * j2, ((long) Math.ceil(Math.min(i6, d5 + d12) / d13)) * j2, ((long) Math.ceil(Math.min(i2, d + d14) / d13)) * j2));
            }
            if (i10 >= 1073741824) {
                break;
            }
            i9 = i10 << 1;
            i6 = i;
            rectF2 = rectF;
            i8 = i3;
            min = d5;
            max = d8;
            max2 = d7;
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7053(int i, int i2, int i3, double d, double d2, double d3, double d4, long j, int i4, int i5) {
        double d5 = i3;
        long min = (long) Math.min(Math.ceil(i / d5), ((Math.ceil(C4248.m12787(d3, 2.0d, d, 64.0d)) + 1.0d) * 64.0d) + 2.0d);
        long min2 = (long) Math.min(Math.ceil(i2 / d5), ((Math.ceil(C4248.m12787(d4, 2.0d, d2, 64.0d)) + 1.0d) * 64.0d) + 2.0d);
        return min <= ((long) i4) && min2 <= ((long) i5) && min * min2 <= j / 4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7052(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }
}
