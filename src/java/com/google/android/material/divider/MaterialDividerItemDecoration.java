package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import l.AbstractC19902;
import l.AbstractC7201;
import l.C0881;
import l.C13132;
import l.C17931;
import l.C18307;
import l.C18637;
import l.C19343;
import l.C21600;
import l.C23575;
import l.C8184;

/* loaded from: classes.dex */
public class MaterialDividerItemDecoration extends AbstractC7201 {
    public static final int DEF_STYLE_RES = C18637.f58767;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public int color;
    public Drawable dividerDrawable;
    public int insetEnd;
    public int insetStart;
    public boolean lastItemDecorated;
    public int orientation;
    public final Rect tempRect;
    public int thickness;

    public boolean shouldDrawDivider(int i, AbstractC19902 abstractC19902) {
        return true;
    }

    public MaterialDividerItemDecoration(Context context, int i) {
        this(context, null, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, C17931.f54854, i);
    }

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new Rect();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C19343.f61475, i, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, obtainStyledAttributes, C19343.f62007).getDefaultColor();
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(C19343.f62222, context.getResources().getDimensionPixelSize(C23575.f75704));
        this.insetStart = obtainStyledAttributes.getDimensionPixelOffset(C19343.f61104, 0);
        this.insetEnd = obtainStyledAttributes.getDimensionPixelOffset(C19343.f60998, 0);
        this.lastItemDecorated = obtainStyledAttributes.getBoolean(C19343.f62275, true);
        obtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C18307.m42645(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.orientation = i;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setDividerThickness(int i) {
        this.thickness = i;
    }

    public void setDividerThicknessResource(Context context, int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public int getDividerThickness() {
        return this.thickness;
    }

    public void setDividerColor(int i) {
        this.color = i;
        Drawable m21684 = C8184.m21684(this.dividerDrawable);
        this.dividerDrawable = m21684;
        C8184.m21683(m21684, i);
    }

    public void setDividerColorResource(Context context, int i) {
        setDividerColor(C0881.m3228(context, i));
    }

    public int getDividerColor() {
        return this.color;
    }

    public void setDividerInsetStart(int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(Context context, int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetStart() {
        return this.insetStart;
    }

    public void setDividerInsetEnd(int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(Context context, int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    public void setLastItemDecorated(boolean z) {
        this.lastItemDecorated = z;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    @Override // l.AbstractC7201
    public void onDraw(Canvas canvas, C13132 c13132, C21600 c21600) {
        if (c13132.getLayoutManager() == null) {
            return;
        }
        if (this.orientation == 1) {
            drawForVerticalOrientation(canvas, c13132);
        } else {
            drawForHorizontalOrientation(canvas, c13132);
        }
    }

    private void drawForVerticalOrientation(Canvas canvas, C13132 c13132) {
        int width;
        int i;
        canvas.save();
        if (c13132.getClipToPadding()) {
            i = c13132.getPaddingLeft();
            width = c13132.getWidth() - c13132.getPaddingRight();
            canvas.clipRect(i, c13132.getPaddingTop(), width, c13132.getHeight() - c13132.getPaddingBottom());
        } else {
            width = c13132.getWidth();
            i = 0;
        }
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(c13132);
        int i2 = i + (isLayoutRtl ? this.insetEnd : this.insetStart);
        int i3 = width - (isLayoutRtl ? this.insetStart : this.insetEnd);
        int childCount = c13132.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = c13132.getChildAt(i4);
            if (shouldDrawDivider(c13132, childAt)) {
                c13132.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = Math.round(childAt.getTranslationY()) + this.tempRect.bottom;
                this.dividerDrawable.setBounds(i2, round - this.thickness, i3, round);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void drawForHorizontalOrientation(Canvas canvas, C13132 c13132) {
        int height;
        int i;
        int i2;
        int i3;
        canvas.save();
        if (c13132.getClipToPadding()) {
            i = c13132.getPaddingTop();
            height = c13132.getHeight() - c13132.getPaddingBottom();
            canvas.clipRect(c13132.getPaddingLeft(), i, c13132.getWidth() - c13132.getPaddingRight(), height);
        } else {
            height = c13132.getHeight();
            i = 0;
        }
        int i4 = i + this.insetStart;
        int i5 = height - this.insetEnd;
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(c13132);
        int childCount = c13132.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = c13132.getChildAt(i6);
            if (shouldDrawDivider(c13132, childAt)) {
                c13132.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.tempRect);
                int round = Math.round(childAt.getTranslationX());
                if (isLayoutRtl) {
                    i3 = this.tempRect.left + round;
                    i2 = this.thickness + i3;
                } else {
                    i2 = round + this.tempRect.right;
                    i3 = i2 - this.thickness;
                }
                this.dividerDrawable.setBounds(i3, i4, i2, i5);
                this.dividerDrawable.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.dividerDrawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // l.AbstractC7201
    public void getItemOffsets(Rect rect, View view, C13132 c13132, C21600 c21600) {
        rect.set(0, 0, 0, 0);
        if (shouldDrawDivider(c13132, view)) {
            if (this.orientation == 1) {
                rect.bottom = this.thickness;
            } else if (ViewUtils.isLayoutRtl(c13132)) {
                rect.left = this.thickness;
            } else {
                rect.right = this.thickness;
            }
        }
    }

    private boolean shouldDrawDivider(C13132 c13132, View view) {
        int childAdapterPosition = c13132.getChildAdapterPosition(view);
        AbstractC19902 adapter = c13132.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.lastItemDecorated) && shouldDrawDivider(childAdapterPosition, adapter);
    }
}
