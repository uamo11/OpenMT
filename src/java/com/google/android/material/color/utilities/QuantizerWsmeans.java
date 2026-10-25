package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public final class QuantizerWsmeans {
    public static final int MAX_ITERATIONS = 10;
    public static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public final class Distance implements Comparable {
        public int index = -1;
        public double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    public static Map quantize(int[] iArr, int[] iArr2, int i) {
        int i2;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i3 = 0;
        for (int i4 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i4));
            if (num == null) {
                dArr[i3] = pointProviderLab.fromInt(i4);
                iArr3[i3] = i4;
                i3++;
                linkedHashMap.put(Integer.valueOf(i4), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i4), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr4 = new int[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            iArr4[i5] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i5]))).intValue();
        }
        int min = Math.min(i, i3);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr2 = new double[min][];
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            dArr2[i7] = pointProviderLab.fromInt(iArr2[i7]);
            i6++;
        }
        int i8 = min - i6;
        if (i8 > 0) {
            for (int i9 = 0; i9 < i8; i9++) {
            }
        }
        int[] iArr5 = new int[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            iArr5[i10] = random.nextInt(min);
        }
        int[][] iArr6 = new int[min][];
        for (int i11 = 0; i11 < min; i11++) {
            iArr6[i11] = new int[min];
        }
        Distance[][] distanceArr = new Distance[min][];
        for (int i12 = 0; i12 < min; i12++) {
            distanceArr[i12] = new Distance[min];
            for (int i13 = 0; i13 < min; i13++) {
                distanceArr[i12][i13] = new Distance();
            }
        }
        int[] iArr7 = new int[min];
        int i14 = 0;
        while (i14 < 10) {
            int i15 = 0;
            while (i15 < min) {
                int i16 = i15 + 1;
                int i17 = i16;
                while (i17 < min) {
                    double distance = pointProviderLab.distance(dArr2[i15], dArr2[i17]);
                    int i18 = i16;
                    Distance distance2 = distanceArr[i17][i15];
                    distance2.distance = distance;
                    distance2.index = i15;
                    Distance distance3 = distanceArr[i15][i17];
                    distance3.distance = distance;
                    distance3.index = i17;
                    i17++;
                    i16 = i18;
                }
                int i19 = i16;
                Arrays.sort(distanceArr[i15]);
                for (int i20 = 0; i20 < min; i20++) {
                    iArr6[i15][i20] = distanceArr[i15][i20].index;
                }
                i15 = i19;
            }
            int i21 = 0;
            int i22 = 0;
            while (i21 < i3) {
                double[] dArr3 = dArr[i21];
                int i23 = iArr5[i21];
                double distance4 = pointProviderLab.distance(dArr3, dArr2[i23]);
                int i24 = -1;
                int[][] iArr8 = iArr6;
                double d = distance4;
                int i25 = 0;
                while (i25 < min) {
                    Distance[][] distanceArr2 = distanceArr;
                    int i26 = i3;
                    if (distanceArr[i23][i25].distance < 4.0d * distance4) {
                        double distance5 = pointProviderLab.distance(dArr3, dArr2[i25]);
                        if (distance5 < d) {
                            i24 = i25;
                            d = distance5;
                        }
                    }
                    i25++;
                    distanceArr = distanceArr2;
                    i3 = i26;
                }
                Distance[][] distanceArr3 = distanceArr;
                int i27 = i3;
                if (i24 != -1 && Math.abs(Math.sqrt(d) - Math.sqrt(distance4)) > 3.0d) {
                    i22++;
                    iArr5[i21] = i24;
                }
                i21++;
                distanceArr = distanceArr3;
                iArr6 = iArr8;
                i3 = i27;
            }
            int[][] iArr9 = iArr6;
            Distance[][] distanceArr4 = distanceArr;
            int i28 = i3;
            if (i22 == 0 && i14 != 0) {
                break;
            }
            double[] dArr4 = new double[min];
            double[] dArr5 = new double[min];
            double[] dArr6 = new double[min];
            int i29 = 0;
            Arrays.fill(iArr7, 0);
            int i30 = i28;
            while (i29 < i30) {
                int i31 = iArr5[i29];
                double[] dArr7 = dArr[i29];
                int i32 = iArr4[i29];
                iArr7[i31] = iArr7[i31] + i32;
                int[] iArr10 = iArr4;
                double d2 = i32;
                dArr4[i31] = (dArr7[0] * d2) + dArr4[i31];
                dArr5[i31] = (dArr7[1] * d2) + dArr5[i31];
                dArr6[i31] = (dArr7[2] * d2) + dArr6[i31];
                i29++;
                iArr4 = iArr10;
                iArr5 = iArr5;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            int i33 = 0;
            while (i33 < min) {
                int i34 = iArr7[i33];
                if (i34 == 0) {
                    dArr2[i33] = new double[]{0.0d, 0.0d, 0.0d};
                    i2 = i30;
                } else {
                    i2 = i30;
                    double d3 = i34;
                    double d4 = dArr4[i33] / d3;
                    double d5 = dArr5[i33] / d3;
                    double d6 = dArr6[i33] / d3;
                    double[] dArr8 = dArr2[i33];
                    dArr8[0] = d4;
                    dArr8[1] = d5;
                    dArr8[2] = d6;
                }
                i33++;
                i30 = i2;
            }
            i14++;
            distanceArr = distanceArr4;
            iArr6 = iArr9;
            i3 = i30;
            iArr4 = iArr11;
            iArr5 = iArr12;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i35 = 0; i35 < min; i35++) {
            int i36 = iArr7[i35];
            if (i36 != 0) {
                int i37 = pointProviderLab.toInt(dArr2[i35]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i37))) {
                    linkedHashMap2.put(Integer.valueOf(i37), Integer.valueOf(i36));
                }
            }
        }
        return linkedHashMap2;
    }
}
