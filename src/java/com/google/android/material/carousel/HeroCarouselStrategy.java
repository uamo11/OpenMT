package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import l.C14543;
import l.C1814;

/* loaded from: classes.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    public int keylineCount = 0;
    public static final int[] SMALL_COUNTS = {1};
    public static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    public KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view) {
        int[] iArr;
        int i;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        C14543 c14543 = (C14543) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) c14543).topMargin + ((ViewGroup.MarginLayoutParams) c14543).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f = ((ViewGroup.MarginLayoutParams) c14543).leftMargin + ((ViewGroup.MarginLayoutParams) c14543).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f;
        float max = Math.max(getSmallItemSizeMax() + f, smallItemSizeMin);
        float f2 = containerHeight;
        float min = Math.min(measuredWidth + f, f2);
        float m6035 = C1814.m6035((measuredWidth / 3.0f) + f, smallItemSizeMin + f, max + f);
        float f3 = (min + m6035) / 2.0f;
        int[] iArr2 = f2 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int max2 = (int) Math.max(1.0d, Math.floor((f2 - (CarouselStrategyHelper.maxValue(r4) * max)) / min));
        int ceil = (((int) Math.ceil(f2 / min)) - max2) + 1;
        int[] iArr3 = new int[ceil];
        for (int i2 = 0; i2 < ceil; i2++) {
            iArr3[i2] = max2 + i2;
        }
        int i3 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        int[] doubleCounts = i3 != 0 ? CarouselStrategy.doubleCounts(iArr2) : iArr2;
        if (i3 != 0) {
            iArr = CarouselStrategy.doubleCounts(MEDIUM_COUNTS);
        } else {
            iArr = MEDIUM_COUNTS;
        }
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, m6035, smallItemSizeMin, max, doubleCounts, f3, iArr, min, iArr3);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (findLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f2, m6035, smallItemSizeMin, max, iArr2, f3, MEDIUM_COUNTS, min, iArr3);
            i = 0;
        } else {
            i = i3;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f, f2, findLowestCostArrangement, i);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(Carousel carousel, int i) {
        if (carousel.getCarouselAlignment() == 1) {
            return (i < this.keylineCount && carousel.getItemCount() >= this.keylineCount) || (i >= this.keylineCount && carousel.getItemCount() < this.keylineCount);
        }
        return false;
    }
}
