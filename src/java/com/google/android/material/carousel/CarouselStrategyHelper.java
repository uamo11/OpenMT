package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.KeylineState;
import l.C23575;

/* loaded from: classes.dex */
public final class CarouselStrategyHelper {
    public static float addStart(float f, float f2, int i) {
        return i > 0 ? (f2 / 2.0f) + f : f;
    }

    public static float updateCurPosition(float f, float f2, float f3, int i) {
        return i > 0 ? (f3 / 2.0f) + f2 : f;
    }

    public static float getExtraSmallSize(Context context) {
        return context.getResources().getDimension(C23575.f76039);
    }

    public static float getSmallSizeMin(Context context) {
        return context.getResources().getDimension(C23575.f76251);
    }

    public static float getSmallSizeMax(Context context) {
        return context.getResources().getDimension(C23575.f76275);
    }

    public static KeylineState createKeylineState(Context context, float f, float f2, Arrangement arrangement, int i) {
        if (i == 1) {
            return createCenterAlignedKeylineState(context, f, f2, arrangement);
        }
        return createLeftAlignedKeylineState(context, f, f2, arrangement);
    }

    public static KeylineState createLeftAlignedKeylineState(Context context, float f, float f2, Arrangement arrangement) {
        float min = Math.min(getExtraSmallSize(context) + f, arrangement.largeSize);
        float f3 = min / 2.0f;
        float f4 = 0.0f - f3;
        float addStart = addStart(0.0f, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition(updateCurPosition, addStart2, arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f5 = f3 + f2;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f);
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(arrangement.largeSize, f2).addAnchorKeyline(f4, childMaskPercentage, min).addKeylineRange(addStart, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addKeylineRange.addKeyline(addStart2, childMaskPercentage3, arrangement.mediumSize);
        }
        int i = arrangement.smallCount;
        if (i > 0) {
            addKeylineRange.addKeylineRange(addStart3, childMaskPercentage2, arrangement.smallSize, i);
        }
        addKeylineRange.addAnchorKeyline(f5, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    public static KeylineState createCenterAlignedKeylineState(Context context, float f, float f2, Arrangement arrangement) {
        float f3;
        float f4;
        float min = Math.min(getExtraSmallSize(context) + f, arrangement.largeSize);
        float f5 = min / 2.0f;
        float f6 = 0.0f - f5;
        float addStart = addStart(0.0f, arrangement.smallSize, arrangement.smallCount);
        float updateCurPosition = updateCurPosition(0.0f, addEnd(addStart, arrangement.smallSize, (int) Math.floor(arrangement.smallCount / 2.0f)), arrangement.smallSize, arrangement.smallCount);
        float addStart2 = addStart(updateCurPosition, arrangement.mediumSize, arrangement.mediumCount);
        float updateCurPosition2 = updateCurPosition(updateCurPosition, addEnd(addStart2, arrangement.mediumSize, (int) Math.floor(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount);
        float addStart3 = addStart(updateCurPosition2, arrangement.largeSize, arrangement.largeCount);
        float updateCurPosition3 = updateCurPosition(updateCurPosition2, addEnd(addStart3, arrangement.largeSize, arrangement.largeCount), arrangement.largeSize, arrangement.largeCount);
        float addStart4 = addStart(updateCurPosition3, arrangement.mediumSize, arrangement.mediumCount);
        float addStart5 = addStart(updateCurPosition(updateCurPosition3, addEnd(addStart4, arrangement.mediumSize, (int) Math.ceil(arrangement.mediumCount / 2.0f)), arrangement.mediumSize, arrangement.mediumCount), arrangement.smallSize, arrangement.smallCount);
        float f7 = f5 + f2;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, arrangement.largeSize, f);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(arrangement.smallSize, arrangement.largeSize, f);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(arrangement.mediumSize, arrangement.largeSize, f);
        KeylineState.Builder addAnchorKeyline = new KeylineState.Builder(arrangement.largeSize, f2).addAnchorKeyline(f6, childMaskPercentage, min);
        if (arrangement.smallCount > 0) {
            f3 = f7;
            addAnchorKeyline.addKeylineRange(addStart, childMaskPercentage2, arrangement.smallSize, (int) Math.floor(r7 / 2.0f));
        } else {
            f3 = f7;
        }
        if (arrangement.mediumCount > 0) {
            f4 = childMaskPercentage2;
            addAnchorKeyline.addKeylineRange(addStart2, childMaskPercentage3, arrangement.mediumSize, (int) Math.floor(r5 / 2.0f));
        } else {
            f4 = childMaskPercentage2;
        }
        float f8 = f4;
        addAnchorKeyline.addKeylineRange(addStart3, 0.0f, arrangement.largeSize, arrangement.largeCount, true);
        if (arrangement.mediumCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart4, childMaskPercentage3, arrangement.mediumSize, (int) Math.ceil(r5 / 2.0f));
        }
        if (arrangement.smallCount > 0) {
            addAnchorKeyline.addKeylineRange(addStart5, f8, arrangement.smallSize, (int) Math.ceil(r0 / 2.0f));
        }
        addAnchorKeyline.addAnchorKeyline(f3, childMaskPercentage, min);
        return addAnchorKeyline.build();
    }

    public static int maxValue(int[] iArr) {
        int i = Integer.MIN_VALUE;
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public static float addEnd(float f, float f2, int i) {
        return (Math.max(0, i - 1) * f2) + f;
    }
}
