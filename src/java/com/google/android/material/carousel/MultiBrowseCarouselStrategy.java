package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import l.C14543;
import l.C1814;

/* loaded from: classes.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    public int keylineCount = 0;
    public static final int[] SMALL_COUNTS = {1};
    public static final int[] MEDIUM_COUNTS = {1, 0};

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        float containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        C14543 c14543 = (C14543) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) c14543).topMargin + ((ViewGroup.MarginLayoutParams) c14543).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            f = ((ViewGroup.MarginLayoutParams) c14543).leftMargin + ((ViewGroup.MarginLayoutParams) c14543).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f2 = f;
        float smallItemSizeMin = getSmallItemSizeMin() + f2;
        float max = Math.max(getSmallItemSizeMax() + f2, smallItemSizeMin);
        float min = Math.min(measuredHeight + f2, containerHeight);
        float m6035 = C1814.m6035((measuredHeight / 3.0f) + f2, smallItemSizeMin + f2, max + f2);
        float f3 = (min + m6035) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        if (containerHeight < 2.0f * smallItemSizeMin) {
            iArr = new int[]{0};
        }
        int[] iArr2 = MEDIUM_COUNTS;
        if (carousel.getCarouselAlignment() == 1) {
            iArr = CarouselStrategy.doubleCounts(iArr);
            iArr2 = CarouselStrategy.doubleCounts(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int max2 = (int) Math.max(1.0d, Math.floor(((containerHeight - (CarouselStrategyHelper.maxValue(iArr4) * f3)) - (CarouselStrategyHelper.maxValue(iArr3) * max)) / min));
        int ceil = (int) Math.ceil(containerHeight / min);
        int i = (ceil - max2) + 1;
        int[] iArr5 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr5[i2] = ceil - i2;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(containerHeight, m6035, smallItemSizeMin, max, iArr3, f3, iArr4, min, iArr5);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (ensureArrangementFitsItemCount(findLowestCostArrangement, carousel.getItemCount())) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(containerHeight, m6035, smallItemSizeMin, max, new int[]{findLowestCostArrangement.smallCount}, f3, new int[]{findLowestCostArrangement.mediumCount}, min, new int[]{findLowestCostArrangement.largeCount});
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f2, containerHeight, findLowestCostArrangement, carousel.getCarouselAlignment());
    }

    public boolean ensureArrangementFitsItemCount(Arrangement arrangement, int i) {
        int itemCount = arrangement.getItemCount() - i;
        boolean z = itemCount > 0 && (arrangement.smallCount > 0 || arrangement.mediumCount > 1);
        while (itemCount > 0) {
            int i2 = arrangement.smallCount;
            if (i2 > 0) {
                arrangement.smallCount = i2 - 1;
            } else {
                int i3 = arrangement.mediumCount;
                if (i3 > 1) {
                    arrangement.mediumCount = i3 - 1;
                }
            }
            itemCount--;
        }
        return z;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i) {
        if (i >= this.keylineCount || carousel.getItemCount() < this.keylineCount) {
            return i >= this.keylineCount && carousel.getItemCount() < this.keylineCount;
        }
        return true;
    }
}
