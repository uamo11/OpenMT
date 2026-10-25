package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;
import l.C17648;
import l.C23575;
import l.C3060;

/* loaded from: classes.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int activeItemMaxWidth;
    public final int activeItemMinWidth;
    public final int inactiveItemMaxWidth;
    public final int inactiveItemMinWidth;
    public boolean itemHorizontalTranslationEnabled;
    public final List tempChildWidths;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(C23575.f75909);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(C23575.f75724);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(C23575.f76074);
        this.activeItemMinWidth = resources.getDimensionPixelSize(C23575.f76004);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        C3060 menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (isShifting(getLabelVisibilityMode(), size2) && isItemHorizontalTranslationEnabled()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i5 = this.activeItemMinWidth;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.inactiveItemMinWidth * i6), Math.min(i5, this.activeItemMaxWidth));
            int i7 = size - min;
            int min2 = Math.min(i7 / (i6 != 0 ? i6 : 1), this.inactiveItemMaxWidth);
            int i8 = i7 - (i6 * min2);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    i4 = i9 == getSelectedItemPosition() ? min : min2;
                    if (i8 > 0) {
                        i4++;
                        i8--;
                    }
                } else {
                    i4 = 0;
                }
                this.tempChildWidths.add(Integer.valueOf(i4));
                i9++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), this.activeItemMaxWidth);
            int i10 = size - (size2 * min3);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).getVisibility() == 8) {
                    i3 = 0;
                } else if (i10 > 0) {
                    i3 = min3 + 1;
                    i10--;
                } else {
                    i3 = min3;
                }
                this.tempChildWidths.add(Integer.valueOf(i3));
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) this.tempChildWidths.get(i13)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i12 = childAt2.getMeasuredWidth() + i12;
            }
        }
        setMeasuredDimension(i12, size3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int i9 = C17648.f53953;
                if (getLayoutDirection() == 1) {
                    int i10 = i5 - i7;
                    childAt.layout(i10 - childAt.getMeasuredWidth(), 0, i10, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.itemHorizontalTranslationEnabled = z;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public NavigationBarItemView createNavigationBarItemView(Context context) {
        return new BottomNavigationItemView(context);
    }
}
