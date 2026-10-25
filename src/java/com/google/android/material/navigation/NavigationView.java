package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import l.AbstractC7152;
import l.C0881;
import l.C13064;
import l.C15180;
import l.C17648;
import l.C17931;
import l.C18637;
import l.C19343;
import l.C20118;
import l.C21610;
import l.C22733;
import l.C4736;
import l.C5882;
import l.C7790;
import l.InterfaceC8126;

/* loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    public static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    public final InterfaceC8126 backDrawerListener;
    public final MaterialBackOrchestrator backOrchestrator;
    public boolean bottomInsetScrimEnabled;
    public int drawerLayoutCornerSize;
    public final boolean drawerLayoutCornerSizeBackAnimationEnabled;
    public final int drawerLayoutCornerSizeBackAnimationMax;
    public OnNavigationItemSelectedListener listener;
    public final int maxWidth;
    public final NavigationMenu menu;
    public MenuInflater menuInflater;
    public ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    public final NavigationMenuPresenter presenter;
    public final ShapeableDelegate shapeableDelegate;
    public final MaterialSideContainerBackHelper sideContainerBackHelper;
    public final int[] tmpLocation;
    public boolean topInsetScrimEnabled;
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int[] DISABLED_STATE_SET = {-16842910};
    public static final int DEF_STYLE_RES = C18637.f58943;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C17931.f54795);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i, int i2) {
        if ((getParent() instanceof C13064) && (getLayoutParams() instanceof C15180)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                int i3 = ((C15180) getLayoutParams()).f46371;
                int i4 = C17648.f53953;
                boolean z = Gravity.getAbsoluteGravity(i3, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel build = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(build);
                this.shapeableDelegate.onShapeAppearanceChanged(this, build);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i, i2));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private boolean hasShapeAppearance(C22733 c22733) {
        return c22733.m50802(C19343.f60971) || c22733.m50802(C19343.f61661);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof C13064) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            C13064 c13064 = (C13064) parent;
            c13064.m31659(this.backDrawerListener);
            c13064.m31651(this.backDrawerListener);
            if (C13064.m31638(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof C13064) {
            ((C13064) parent).m31659(this.backDrawerListener);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    private Drawable createDefaultItemBackground(C22733 c22733) {
        return createDefaultItemDrawable(c22733, MaterialResources.getColorStateList(getContext(), c22733, C19343.f62087));
    }

    private Drawable createDefaultItemDrawable(C22733 c22733, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), c22733.m50806(C19343.f60971, 0), c22733.m50806(C19343.f61661, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, c22733.m50803(C19343.f61927, 0), c22733.m50803(C19343.f62619, 0), c22733.m50803(C19343.f62141, 0), c22733.m50803(C19343.f62195, 0));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new C4736(3, this));
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(C21610 c21610) {
        this.presenter.dispatchApplyWindowInsets(c21610);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public Menu getMenu() {
        return this.menu;
    }

    public View inflateHeaderView(int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0881.m3234(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public void setItemHorizontalPadding(int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public void setItemVerticalPadding(int i) {
        this.presenter.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public void setItemIconPadding(int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            this.presenter.setCheckedItem((C5882) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((C5882) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public void setItemTextAppearance(int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemIconSize(int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public void setDividerInsetStart(int i) {
        this.presenter.setDividerInsetStart(i);
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public void setDividerInsetEnd(int i) {
        this.presenter.setDividerInsetEnd(i);
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    public void setSubheaderInsetStart(int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public void setSubheaderInsetEnd(int i) {
        this.presenter.setSubheaderInsetEnd(i);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(C20118 c20118) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(c20118);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(C20118 c20118) {
        this.sideContainerBackHelper.updateBackProgress(c20118, ((C15180) requireDrawerLayoutParent().second).f46371);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(c20118.m46371()));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair requireDrawerLayoutParent = requireDrawerLayoutParent();
        C13064 c13064 = (C13064) requireDrawerLayoutParent.first;
        C20118 onHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked != null && Build.VERSION.SDK_INT >= 34) {
            this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, ((C15180) requireDrawerLayoutParent.second).f46371, DrawerLayoutUtils.getScrimCloseAnimatorListener(c13064, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(c13064));
            return;
        }
        c13064.m31649((View) this, true);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    private Pair requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof C13064) && (layoutParams instanceof C15180)) {
            return new Pair((C13064) parent, (C15180) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C7790(getContext());
        }
        return this.menuInflater;
    }

    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList m3233 = C0881.m3233(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector_res_0x7f04011a, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = m3233.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{m3233.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onGlobalLayout() {
                /*
                    r6 = this;
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r1 = com.google.android.material.navigation.NavigationView.access$200(r0)
                    r0.getLocationOnScreen(r1)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                    r1 = 1
                    r0 = r0[r1]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r0 = 1
                    goto L18
                L17:
                    r0 = 0
                L18:
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    com.google.android.material.internal.NavigationMenuPresenter r3 = com.google.android.material.navigation.NavigationView.access$300(r3)
                    r3.setBehindStatusBar(r0)
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    if (r0 == 0) goto L2d
                    boolean r0 = r3.isTopInsetScrimEnabled()
                    if (r0 == 0) goto L2d
                    r0 = 1
                    goto L2e
                L2d:
                    r0 = 0
                L2e:
                    r3.setDrawTopInsetForeground(r0)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                    r0 = r0[r2]
                    if (r0 == 0) goto L4f
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    int[] r0 = com.google.android.material.navigation.NavigationView.access$200(r0)
                    r0 = r0[r2]
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int r3 = r3.getWidth()
                    int r3 = r3 + r0
                    if (r3 != 0) goto L4d
                    goto L4f
                L4d:
                    r0 = 0
                    goto L50
                L4f:
                    r0 = 1
                L50:
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    r3.setDrawLeftInsetForeground(r0)
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    android.content.Context r0 = r0.getContext()
                    android.app.Activity r0 = com.google.android.material.internal.ContextUtils.getActivity(r0)
                    if (r0 == 0) goto Lca
                    android.graphics.Rect r3 = com.google.android.material.internal.WindowUtils.getCurrentWindowBounds(r0)
                    int r4 = r3.height()
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    int r5 = r5.getHeight()
                    int r4 = r4 - r5
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    int[] r5 = com.google.android.material.navigation.NavigationView.access$200(r5)
                    r5 = r5[r1]
                    if (r4 != r5) goto L7c
                    r4 = 1
                    goto L7d
                L7c:
                    r4 = 0
                L7d:
                    android.view.Window r0 = r0.getWindow()
                    int r0 = r0.getNavigationBarColor()
                    int r0 = android.graphics.Color.alpha(r0)
                    if (r0 == 0) goto L8d
                    r0 = 1
                    goto L8e
                L8d:
                    r0 = 0
                L8e:
                    com.google.android.material.navigation.NavigationView r5 = com.google.android.material.navigation.NavigationView.this
                    if (r4 == 0) goto L9c
                    if (r0 == 0) goto L9c
                    boolean r0 = r5.isBottomInsetScrimEnabled()
                    if (r0 == 0) goto L9c
                    r0 = 1
                    goto L9d
                L9c:
                    r0 = 0
                L9d:
                    r5.setDrawBottomInsetForeground(r0)
                    int r0 = r3.width()
                    com.google.android.material.navigation.NavigationView r4 = com.google.android.material.navigation.NavigationView.this
                    int[] r4 = com.google.android.material.navigation.NavigationView.access$200(r4)
                    r4 = r4[r2]
                    if (r0 == r4) goto Lc5
                    int r0 = r3.width()
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int r3 = r3.getWidth()
                    int r0 = r0 - r3
                    com.google.android.material.navigation.NavigationView r3 = com.google.android.material.navigation.NavigationView.this
                    int[] r3 = com.google.android.material.navigation.NavigationView.access$200(r3)
                    r2 = r3[r2]
                    if (r0 != r2) goto Lc4
                    goto Lc5
                Lc4:
                    r1 = 0
                Lc5:
                    com.google.android.material.navigation.NavigationView r0 = com.google.android.material.navigation.NavigationView.this
                    r0.setDrawRightInsetForeground(r1)
                Lca:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.AnonymousClass3.onGlobalLayout():void");
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public class SavedState extends AbstractC7152 {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l.AbstractC7152, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }
    }
}
