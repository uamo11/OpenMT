package l;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* compiled from: 76MD */
/* renamed from: l.ܺܰۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15971 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m37740(int i, int i2, RectF rectF, float f, int i3, long j) {
        double d;
        int i4;
        int i5;
        int i6 = i3;
        if (i <= 0 || i2 <= 0 || rectF == null || !m37741(f) || f <= 0.0f || i6 <= 0 || ((i6 - 1) & i6) != 0 || !m37741(rectF.left) || !m37741(rectF.top) || !m37741(rectF.right) || !m37741(rectF.bottom)) {
            throw new IllegalArgumentException("Invalid tile planning geometry");
        }
        if (j <= 0 || rectF.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        double max = Math.max(0.0f, rectF.left);
        double max2 = Math.max(0.0f, rectF.top);
        double min = Math.min(i, rectF.right);
        double min2 = Math.min(i2, rectF.bottom);
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
        int i8 = i7;
        while (i8 < i6) {
            int i9 = i8;
            double d2 = min;
            if (m37742(i, i2, rectF, i8, 512, 64, j)) {
                i4 = 512;
                i5 = 64;
            } else {
                i4 = MLKEMEngine.KyberPolyBytes;
                i5 = 32;
            }
            int i10 = i4;
            int i11 = i5;
            if (m37742(i, i2, rectF, i9, i4, i5, j)) {
                int i12 = i9;
                long j2 = i12 * i10;
                double d3 = i11 * i12;
                double d4 = j2;
                long max3 = (long) (Math.max(0.0d, max - d3) / d4);
                long max4 = (long) (Math.max(0.0d, max2 - d3) / d4);
                long ceil = (long) Math.ceil(Math.min(i, d2 + d3) / d4);
                long ceil2 = (long) Math.ceil(Math.min(i2, d + d3) / d4);
                ArrayList arrayList = new ArrayList((int) ((ceil - max3) * (ceil2 - max4)));
                long j3 = max4;
                while (j3 < ceil2) {
                    long j4 = max3;
                    while (j4 < ceil) {
                        long j5 = j4 * j2;
                        long j6 = j3 * j2;
                        ArrayList arrayList2 = arrayList;
                        arrayList2.add(new C8917(i, i2, i12, j5, j6, j5 + j2, j6 + j2));
                        j4++;
                        arrayList = arrayList2;
                        i12 = i12;
                        ceil2 = ceil2;
                        max3 = max3;
                        j2 = j2;
                    }
                    j3++;
                    ceil2 = ceil2;
                }
                ArrayList arrayList3 = arrayList;
                final double d5 = (max + d2) * 0.5d;
                final double d6 = (max2 + d) * 0.5d;
                Collections.sort(arrayList3, new Comparator() { // from class: l.ۢܰۜ
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int compare;
                        compare = Double.compare(C15971.m37738((C8917) obj, r0, r2), C15971.m37738((C8917) obj2, d5, d6));
                        return compare;
                    }
                });
                return arrayList3;
            }
            if (i9 >= 1073741824) {
                break;
            }
            i8 = i9 << 1;
            i6 = i3;
            min = d2;
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37741(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m37738(C8917 c8917, double d, double d2) {
        double d3 = ((c8917.f27099 + c8917.f27101) * 0.5d) - d;
        double d4 = ((c8917.f27100 + c8917.f27097) * 0.5d) - d2;
        return (d4 * d4) + (d3 * d3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37742(int i, int i2, RectF rectF, int i3, int i4, int i5, long j) {
        long j2 = i3;
        long j3 = i4 * j2;
        long j4 = i;
        double d = i5 * 2.0d * i3;
        double d2 = j3;
        long j5 = i2;
        long min = ((long) Math.min(((j4 + j3) - 1) / j3, Math.ceil(((rectF.right - rectF.left) + d) / d2) + 1.0d)) * ((long) Math.min(((j5 + j3) - 1) / j3, Math.ceil(((rectF.bottom - rectF.top) + d) / d2) + 1.0d));
        if (min > 32) {
            return false;
        }
        long j6 = i4 + 2;
        return ((min * Math.min(j6, ((j4 + j2) - 1) / j2)) * Math.min(j6, ((j5 + j2) - 1) / j2)) * 4 <= j;
    }
}
