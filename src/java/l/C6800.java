package l;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: G6MJ */
/* renamed from: l.ۜܰۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6800 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m18441(int i, int i2, RectF rectF, float f, int i3, long j) {
        int i4;
        double d;
        double d2;
        double d3;
        double d4;
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        if (i5 <= 0 || i6 <= 0 || !m18442(f) || f <= 0.0f || i3 < 1 || rectF == null || !m18442(rectF.left) || !m18442(rectF.top) || !m18442(rectF.right) || !m18442(rectF.bottom)) {
            throw new IllegalArgumentException("Invalid SVG tile geometry");
        }
        if (rectF.isEmpty() || j3 <= 0) {
            return Collections.EMPTY_LIST;
        }
        double max = Math.max(0.0f, rectF.left);
        double max2 = Math.max(0.0f, rectF.top);
        double min = Math.min(i5, rectF.right);
        double min2 = Math.min(i6, rectF.bottom);
        if (max >= min || max2 >= min2) {
            return Collections.EMPTY_LIST;
        }
        int max3 = Math.max(-30, Math.min(30, Math.getExponent(f)));
        if (Math.scalb(1.0d, max3) < f && max3 < 30) {
            max3++;
        }
        int i7 = max3;
        int i8 = -30;
        while (i7 >= i8) {
            double scalb = Math.scalb(1.0f, i7);
            double d5 = i5 * scalb;
            double d6 = min;
            double d7 = i6 * scalb;
            int i9 = 512;
            while (true) {
                i4 = 128;
                if (i9 < 128) {
                    d = d5;
                    d2 = d7;
                    d3 = max;
                    d4 = max2;
                    j2 = j3;
                    break;
                }
                d4 = max2;
                double d8 = i9;
                d3 = max;
                d2 = d7;
                double min3 = ((long) Math.min(Math.ceil(d5 / d8), Math.ceil(C4248.m12787(rectF.width(), scalb, 64.0d, d8)) + 1.0d)) * ((long) Math.min(Math.ceil(d7 / d8), Math.ceil(C4248.m12787(rectF.height(), scalb, 64.0d, d8)) + 1.0d));
                double d9 = i9 + 3;
                d = d5;
                double min4 = Math.min(d9, Math.ceil(d2) + 1.0d) * Math.min(d9, Math.ceil(d5) + 1.0d) * 4.0d;
                if (min3 <= 64.0d) {
                    double d10 = ((min3 + i3) - 1.0d) * min4;
                    j2 = j;
                    if (d10 <= j2) {
                        i4 = 128;
                        break;
                    }
                } else {
                    j2 = j;
                }
                i9 /= 2;
                j3 = j2;
                d5 = d;
                max2 = d4;
                max = d3;
                d7 = d2;
            }
            if (i9 >= i4) {
                double d11 = i9;
                long max4 = (long) (Math.max(0.0d, (d3 * scalb) - 32.0d) / d11);
                long max5 = (long) (Math.max(0.0d, (d4 * scalb) - 32.0d) / d11);
                long ceil = (long) Math.ceil(Math.min(d, (d6 * scalb) + 32.0d) / d11);
                long ceil2 = (long) Math.ceil(Math.min(d2, (scalb * min2) + 32.0d) / d11);
                ArrayList arrayList = new ArrayList();
                for (long j4 = max5; j4 < ceil2; j4++) {
                    long j5 = max4;
                    while (j5 < ceil) {
                        arrayList.add(new C23733(j5, j4, i, i2, i7, i9));
                        j5++;
                        ceil2 = ceil2;
                        ceil = ceil;
                    }
                }
                final double d12 = (d3 + d6) / 2.0d;
                final double d13 = (d4 + min2) / 2.0d;
                Collections.sort(arrayList, new Comparator() { // from class: l.ܳܰۜ
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        C23733 c23733 = (C23733) obj;
                        C23733 c237332 = (C23733) obj2;
                        double centerX = c23733.f76845.centerX();
                        double d14 = d12;
                        double d15 = centerX - d14;
                        double centerY = c23733.f76845.centerY();
                        double d16 = d13;
                        double d17 = centerY - d16;
                        double d18 = (d17 * d17) + (d15 * d15);
                        double centerX2 = c237332.f76845.centerX() - d14;
                        double centerY2 = c237332.f76845.centerY() - d16;
                        return Double.compare(d18, (centerY2 * centerY2) + (centerX2 * centerX2));
                    }
                });
                return arrayList;
            }
            i7--;
            i8 = -30;
            i5 = i;
            i6 = i2;
            j3 = j2;
            min = d6;
            max2 = d4;
            max = d3;
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18442(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }
}
