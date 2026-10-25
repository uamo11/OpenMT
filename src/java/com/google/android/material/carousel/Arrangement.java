package com.google.android.material.carousel;

import l.C1814;

/* loaded from: classes.dex */
public final class Arrangement {
    public static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    public final float cost;
    public final int largeCount;
    public float largeSize;
    public int mediumCount;
    public float mediumSize;
    public final int priority;
    public int smallCount;
    public float smallSize;

    private float calculateLargeSize(float f, int i, float f2, int i2, int i3) {
        if (i <= 0) {
            f2 = 0.0f;
        }
        float f3 = i2 / 2.0f;
        return (f - ((i + f3) * f2)) / (i3 + f3);
    }

    public Arrangement(int i, float f, float f2, float f3, int i2, float f4, int i3, float f5, int i4, float f6) {
        this.priority = i;
        this.smallSize = C1814.m6035(f, f2, f3);
        this.smallCount = i2;
        this.mediumSize = f4;
        this.mediumCount = i3;
        this.largeSize = f5;
        this.largeCount = i4;
        fit(f6, f2, f3, f5);
        this.cost = cost(f5);
    }

    public String toString() {
        return "Arrangement [priority=" + this.priority + ", smallCount=" + this.smallCount + ", smallSize=" + this.smallSize + ", mediumCount=" + this.mediumCount + ", mediumSize=" + this.mediumSize + ", largeCount=" + this.largeCount + ", largeSize=" + this.largeSize + ", cost=" + this.cost + "]";
    }

    private float getSpace() {
        return (this.smallSize * this.smallCount) + (this.mediumSize * this.mediumCount) + (this.largeSize * this.largeCount);
    }

    private void fit(float f, float f2, float f3, float f4) {
        float space = f - getSpace();
        int i = this.smallCount;
        if (i > 0 && space > 0.0f) {
            float f5 = this.smallSize;
            this.smallSize = Math.min(space / i, f3 - f5) + f5;
        } else if (i > 0 && space < 0.0f) {
            float f6 = this.smallSize;
            this.smallSize = Math.max(space / i, f2 - f6) + f6;
        }
        int i2 = this.smallCount;
        float f7 = i2 > 0 ? this.smallSize : 0.0f;
        this.smallSize = f7;
        float calculateLargeSize = calculateLargeSize(f, i2, f7, this.mediumCount, this.largeCount);
        this.largeSize = calculateLargeSize;
        float f8 = (this.smallSize + calculateLargeSize) / 2.0f;
        this.mediumSize = f8;
        int i3 = this.mediumCount;
        if (i3 <= 0 || calculateLargeSize == f4) {
            return;
        }
        float f9 = (f4 - calculateLargeSize) * this.largeCount;
        float min = Math.min(Math.abs(f9), f8 * 0.1f * i3);
        if (f9 > 0.0f) {
            this.mediumSize -= min / this.mediumCount;
            this.largeSize = (min / this.largeCount) + this.largeSize;
        } else {
            this.mediumSize = (min / this.mediumCount) + this.mediumSize;
            this.largeSize -= min / this.largeCount;
        }
    }

    private boolean isValid() {
        int i = this.largeCount;
        if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f = this.largeSize;
        float f2 = this.mediumSize;
        return f > f2 && f2 > this.smallSize;
    }

    private float cost(float f) {
        if (isValid()) {
            return Math.abs(f - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    public static Arrangement findLowestCostArrangement(float f, float f2, float f3, float f4, int[] iArr, float f5, int[] iArr2, float f6, int[] iArr3) {
        int[] iArr4 = iArr;
        int length = iArr3.length;
        Arrangement arrangement = null;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr3[i2];
            int length2 = iArr2.length;
            int i4 = 0;
            while (i4 < length2) {
                int i5 = iArr2[i4];
                int length3 = iArr4.length;
                int i6 = 0;
                while (i6 < length3) {
                    int i7 = i6;
                    int i8 = length3;
                    int i9 = i4;
                    int i10 = length2;
                    Arrangement arrangement2 = new Arrangement(i, f2, f3, f4, iArr4[i6], f5, i5, f6, i3, f);
                    if (arrangement == null || arrangement2.cost < arrangement.cost) {
                        if (arrangement2.cost == 0.0f) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    i++;
                    i6 = i7 + 1;
                    iArr4 = iArr;
                    length3 = i8;
                    i4 = i9;
                    length2 = i10;
                }
                i4++;
                iArr4 = iArr;
            }
            i2++;
            iArr4 = iArr;
        }
        return arrangement;
    }

    public int getItemCount() {
        return this.smallCount + this.mediumCount + this.largeCount;
    }
}
