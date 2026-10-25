package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: V659 */
/* renamed from: l.ۢᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9762 extends ViewGroup implements InterfaceC19974 {
    public static final String TAG = "Toolbar";
    public InterfaceC17585 mActionMenuPresenterCallback;
    public OnBackInvokedCallback mBackInvokedCallback;
    public boolean mBackInvokedCallbackEnabled;
    public OnBackInvokedDispatcher mBackInvokedDispatcher;
    public int mButtonGravity;
    public ImageButton mCollapseButtonView;
    public CharSequence mCollapseDescription;
    public Drawable mCollapseIcon;
    public boolean mCollapsible;
    public int mContentInsetEndWithActions;
    public int mContentInsetStartWithNavigation;
    public C16382 mContentInsets;
    public boolean mEatingHover;
    public boolean mEatingTouch;
    public View mExpandedActionView;
    public C17522 mExpandedMenuPresenter;
    public int mGravity;
    public final ArrayList mHiddenViews;
    public ImageView mLogoView;
    public int mMaxButtonHeight;
    public InterfaceC19994 mMenuBuilderCallback;
    public final C12212 mMenuHostHelper;
    public C8788 mMenuView;
    public final InterfaceC9494 mMenuViewItemClickListener;
    public ImageButton mNavButtonView;
    public InterfaceC23872 mOnMenuItemClickListener;
    public C17254 mOuterActionMenuPresenter;
    public Context mPopupContext;
    public int mPopupTheme;
    public ArrayList mProvidedMenuItems;
    public final Runnable mShowOverflowMenuRunnable;
    public CharSequence mSubtitleText;
    public int mSubtitleTextAppearance;
    public ColorStateList mSubtitleTextColor;
    public TextView mSubtitleTextView;
    public final int[] mTempMargins;
    public final ArrayList mTempViews;
    public int mTitleMarginBottom;
    public int mTitleMarginEnd;
    public int mTitleMarginStart;
    public int mTitleMarginTop;
    public CharSequence mTitleText;
    public int mTitleTextAppearance;
    public ColorStateList mTitleTextColor;
    public TextView mTitleTextView;
    public C2706 mWrapper;

    public C9762(Context context) {
        this(context, null);
    }

    public C9762(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector_res_0x7f040517);
    }

    public C9762(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList();
        this.mHiddenViews = new ArrayList();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C12212(new RunnableC19472(1, this));
        this.mProvidedMenuItems = new ArrayList();
        this.mMenuViewItemClickListener = new C13560(this);
        this.mShowOverflowMenuRunnable = new RunnableC7211(this);
        Context context2 = getContext();
        int[] iArr = C3390.f10710;
        C22733 m50796 = C22733.m50796(context2, attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, m50796.m50810(), i);
        this.mTitleTextAppearance = m50796.m50806(28, 0);
        this.mSubtitleTextAppearance = m50796.m50806(19, 0);
        this.mGravity = m50796.m50814(0, this.mGravity);
        this.mButtonGravity = m50796.m50814(2, 48);
        int m50799 = m50796.m50799(22, 0);
        m50799 = m50796.m50802(27) ? m50796.m50799(27, m50799) : m50799;
        this.mTitleMarginBottom = m50799;
        this.mTitleMarginTop = m50799;
        this.mTitleMarginEnd = m50799;
        this.mTitleMarginStart = m50799;
        int m507992 = m50796.m50799(25, -1);
        if (m507992 >= 0) {
            this.mTitleMarginStart = m507992;
        }
        int m507993 = m50796.m50799(24, -1);
        if (m507993 >= 0) {
            this.mTitleMarginEnd = m507993;
        }
        int m507994 = m50796.m50799(26, -1);
        if (m507994 >= 0) {
            this.mTitleMarginTop = m507994;
        }
        int m507995 = m50796.m50799(23, -1);
        if (m507995 >= 0) {
            this.mTitleMarginBottom = m507995;
        }
        this.mMaxButtonHeight = m50796.m50803(13, -1);
        int m507996 = m50796.m50799(9, Integer.MIN_VALUE);
        int m507997 = m50796.m50799(5, Integer.MIN_VALUE);
        int m50803 = m50796.m50803(7, 0);
        int m508032 = m50796.m50803(8, 0);
        m24751();
        this.mContentInsets.m38573(m50803, m508032);
        if (m507996 != Integer.MIN_VALUE || m507997 != Integer.MIN_VALUE) {
            this.mContentInsets.m38576(m507996, m507997);
        }
        this.mContentInsetStartWithNavigation = m50796.m50799(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = m50796.m50799(6, Integer.MIN_VALUE);
        this.mCollapseIcon = m50796.m50815(4);
        this.mCollapseDescription = m50796.m50817(3);
        CharSequence m50817 = m50796.m50817(21);
        if (!TextUtils.isEmpty(m50817)) {
            setTitle(m50817);
        }
        CharSequence m508172 = m50796.m50817(18);
        if (!TextUtils.isEmpty(m508172)) {
            setSubtitle(m508172);
        }
        this.mPopupContext = getContext();
        setPopupTheme(m50796.m50806(17, 0));
        Drawable m50815 = m50796.m50815(16);
        if (m50815 != null) {
            setNavigationIcon(m50815);
        }
        CharSequence m508173 = m50796.m50817(15);
        if (!TextUtils.isEmpty(m508173)) {
            setNavigationContentDescription(m508173);
        }
        Drawable m508152 = m50796.m50815(11);
        if (m508152 != null) {
            setLogo(m508152);
        }
        CharSequence m508174 = m50796.m50817(12);
        if (!TextUtils.isEmpty(m508174)) {
            setLogoDescription(m508174);
        }
        if (m50796.m50802(29)) {
            setTitleTextColor(m50796.m50804(29));
        }
        if (m50796.m50802(20)) {
            setSubtitleTextColor(m50796.m50804(20));
        }
        if (m50796.m50802(14)) {
            inflateMenu(m50796.m50806(14, 0));
        }
        m50796.m50813();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.mBackInvokedCallbackEnabled != z) {
            this.mBackInvokedCallbackEnabled = z;
            updateBackInvokedCallbackState();
        }
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public void setPopupTheme(int i) {
        if (this.mPopupTheme != i) {
            this.mPopupTheme = i;
            if (i == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.mTitleMarginStart = i;
        this.mTitleMarginTop = i2;
        this.mTitleMarginEnd = i3;
        this.mTitleMarginBottom = i4;
        requestLayout();
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public void setTitleMarginStart(int i) {
        this.mTitleMarginStart = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public void setTitleMarginTop(int i) {
        this.mTitleMarginTop = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public void setTitleMarginEnd(int i) {
        this.mTitleMarginEnd = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public void setTitleMarginBottom(int i) {
        this.mTitleMarginBottom = i;
        requestLayout();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m24751();
        this.mContentInsets.m38574(i == 1);
    }

    public void setLogo(int i) {
        setLogo(C21311.m48345(getContext(), i));
    }

    public boolean canShowOverflowMenu() {
        C8788 c8788;
        return getVisibility() == 0 && (c8788 = this.mMenuView) != null && c8788.m22679();
    }

    public boolean isOverflowMenuShowing() {
        C8788 c8788 = this.mMenuView;
        return c8788 != null && c8788.m22686();
    }

    public boolean isOverflowMenuShowPending() {
        C8788 c8788 = this.mMenuView;
        return c8788 != null && c8788.m22677();
    }

    public boolean showOverflowMenu() {
        C8788 c8788 = this.mMenuView;
        return c8788 != null && c8788.m22676();
    }

    public boolean hideOverflowMenu() {
        C8788 c8788 = this.mMenuView;
        return c8788 != null && c8788.m22687();
    }

    public void setMenu(C3060 c3060, C17254 c17254) {
        if (c3060 == null && this.mMenuView == null) {
            return;
        }
        m24765();
        C3060 m22678 = this.mMenuView.m22678();
        if (m22678 == c3060) {
            return;
        }
        if (m22678 != null) {
            m22678.removeMenuPresenter(this.mOuterActionMenuPresenter);
            m22678.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new C17522(this);
        }
        c17254.m40549();
        if (c3060 != null) {
            c3060.addMenuPresenter(c17254, this.mPopupContext);
            c3060.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c17254.initForMenu(this.mPopupContext, null);
            this.mExpandedMenuPresenter.initForMenu(this.mPopupContext, null);
            c17254.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.m22680(this.mPopupTheme);
        this.mMenuView.m22672(c17254);
        this.mOuterActionMenuPresenter = c17254;
        updateBackInvokedCallbackState();
    }

    public void dismissPopupMenus() {
        C8788 c8788 = this.mMenuView;
        if (c8788 != null) {
            c8788.m22683();
        }
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m24760();
            if (!m24763(this.mLogoView)) {
                m24753((View) this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && m24763(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m24760();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24760() {
        if (this.mLogoView == null) {
            this.mLogoView = new C17939(getContext());
        }
    }

    public boolean hasExpandedActionView() {
        C17522 c17522 = this.mExpandedMenuPresenter;
        return (c17522 == null || c17522.f53517 == null) ? false : true;
    }

    public void collapseActionView() {
        C17522 c17522 = this.mExpandedMenuPresenter;
        C5882 c5882 = c17522 == null ? null : c17522.f53517;
        if (c5882 != null) {
            c5882.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                C14615 c14615 = new C14615(context);
                this.mTitleTextView = c14615;
                c14615.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mTitleTextAppearance;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m24763(this.mTitleTextView)) {
                m24753((View) this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && m24763(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                C14615 c14615 = new C14615(context);
                this.mSubtitleTextView = c14615;
                c14615.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.mSubtitleTextAppearance;
                if (i != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!m24763(this.mSubtitleTextView)) {
                m24753((View) this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && m24763(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.mTitleTextAppearance = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.mSubtitleTextAppearance = i;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m24764();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C18934.m43699(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C21311.m48345(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m24764();
            if (!m24763(this.mNavButtonView)) {
                m24753((View) this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && m24763(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m24764();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C21311.m48345(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public Menu getMenu() {
        m24762();
        return this.mMenuView.m22685();
    }

    public void setOverflowIcon(Drawable drawable) {
        m24762();
        this.mMenuView.m22671(drawable);
    }

    public Drawable getOverflowIcon() {
        m24762();
        return this.mMenuView.m22684();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m24762() {
        m24765();
        if (this.mMenuView.m22678() == null) {
            C3060 c3060 = (C3060) this.mMenuView.m22685();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new C17522(this);
            }
            this.mMenuView.m22682();
            c3060.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24765() {
        if (this.mMenuView == null) {
            C8788 c8788 = new C8788(getContext(), null);
            this.mMenuView = c8788;
            c8788.m22680(this.mPopupTheme);
            C8788 c87882 = this.mMenuView;
            c87882.f26764 = this.mMenuViewItemClickListener;
            c87882.m22673(this.mActionMenuPresenterCallback, new C2000(this));
            C14699 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f39731 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388613;
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            m24753((View) this.mMenuView, false);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private MenuInflater m24768() {
        return new C7790(getContext());
    }

    public void inflateMenu(int i) {
        m24768().inflate(i, getMenu());
    }

    public void setOnMenuItemClickListener(InterfaceC23872 interfaceC23872) {
        this.mOnMenuItemClickListener = interfaceC23872;
    }

    public void setContentInsetsRelative(int i, int i2) {
        m24751();
        this.mContentInsets.m38576(i, i2);
    }

    public int getContentInsetStart() {
        C16382 c16382 = this.mContentInsets;
        if (c16382 != null) {
            return c16382.m38578();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        C16382 c16382 = this.mContentInsets;
        if (c16382 != null) {
            return c16382.m38572();
        }
        return 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m24751();
        this.mContentInsets.m38573(i, i2);
    }

    public int getContentInsetLeft() {
        C16382 c16382 = this.mContentInsets;
        if (c16382 != null) {
            return c16382.m38575();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C16382 c16382 = this.mContentInsets;
        if (c16382 != null) {
            return c16382.m38577();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.mContentInsetStartWithNavigation;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.mContentInsetEndWithActions;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C3060 m22678;
        C8788 c8788 = this.mMenuView;
        if (c8788 != null && (m22678 = c8788.m22678()) != null && m22678.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m24764() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new C10884(getContext(), null, R.attr.MT_Protector_res_0x7f040516);
            C14699 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f39731 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            C10884 c10884 = new C10884(getContext(), null, R.attr.MT_Protector_res_0x7f040516);
            this.mCollapseButtonView = c10884;
            c10884.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            C14699 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f39731 = (this.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            generateDefaultLayoutParams.f44895 = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new ViewOnClickListenerC11173(this));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24753(View view, boolean z) {
        C14699 c14699;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c14699 = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c14699 = generateLayoutParams(layoutParams);
        } else {
            c14699 = (C14699) layoutParams;
        }
        c14699.f44895 = 1;
        if (z && this.mExpandedActionView != null) {
            view.setLayoutParams(c14699);
            this.mHiddenViews.add(view);
        } else {
            addView(view, c14699);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C5882 c5882;
        C21051 c21051 = new C21051(super.onSaveInstanceState());
        C17522 c17522 = this.mExpandedMenuPresenter;
        if (c17522 != null && (c5882 = c17522.f53517) != null) {
            c21051.f67909 = c5882.getItemId();
        }
        c21051.f67910 = isOverflowMenuShowing();
        return c21051;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C21051)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C21051 c21051 = (C21051) parcelable;
        super.onRestoreInstanceState(c21051.getSuperState());
        C8788 c8788 = this.mMenuView;
        C3060 m22678 = c8788 != null ? c8788.m22678() : null;
        int i = c21051.f67909;
        if (i != 0 && this.mExpandedMenuPresenter != null && m22678 != null && (findItem = m22678.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c21051.f67910) {
            m24767();
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m24767() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24752(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24748(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m24756() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m24766(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.mTempMargins;
        int i10 = C22461.f72738;
        if (getLayoutDirection() == 1) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m24766(this.mNavButtonView)) {
            m24752(this.mNavButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i3 = this.mNavButtonView.getMeasuredWidth() + m24746(this.mNavButtonView);
            i4 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + m24758(this.mNavButtonView));
            i5 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m24766(this.mCollapseButtonView)) {
            m24752(this.mCollapseButtonView, i, 0, i2, 0, this.mMaxButtonHeight);
            i3 = this.mCollapseButtonView.getMeasuredWidth() + m24746(this.mCollapseButtonView);
            i4 = Math.max(i4, this.mCollapseButtonView.getMeasuredHeight() + m24758(this.mCollapseButtonView));
            i5 = View.combineMeasuredStates(i5, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (m24766(this.mMenuView)) {
            m24752(this.mMenuView, i, max, i2, 0, this.mMaxButtonHeight);
            i6 = this.mMenuView.getMeasuredWidth() + m24746(this.mMenuView);
            i4 = Math.max(i4, this.mMenuView.getMeasuredHeight() + m24758(this.mMenuView));
            i5 = View.combineMeasuredStates(i5, this.mMenuView.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (m24766(this.mExpandedActionView)) {
            max2 += m24748(this.mExpandedActionView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mExpandedActionView.getMeasuredHeight() + m24758(this.mExpandedActionView));
            i5 = View.combineMeasuredStates(i5, this.mExpandedActionView.getMeasuredState());
        }
        if (m24766(this.mLogoView)) {
            max2 += m24748(this.mLogoView, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.mLogoView.getMeasuredHeight() + m24758(this.mLogoView));
            i5 = View.combineMeasuredStates(i5, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C14699) childAt.getLayoutParams()).f44895 == 0 && m24766(childAt)) {
                max2 += m24748(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m24758(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i13 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (m24766(this.mTitleTextView)) {
            m24748(this.mTitleTextView, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.mTitleTextView.getMeasuredWidth() + m24746(this.mTitleTextView);
            i9 = this.mTitleTextView.getMeasuredHeight() + m24758(this.mTitleTextView);
            i7 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (m24766(this.mSubtitleTextView)) {
            i8 = Math.max(i8, m24748(this.mSubtitleTextView, i, max2 + i13, i2, i12 + i9, iArr));
            i9 += this.mSubtitleTextView.getMeasuredHeight() + m24758(this.mSubtitleTextView);
            i7 = View.combineMeasuredStates(i7, this.mSubtitleTextView.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max2 + i8, getSuggestedMinimumWidth()), i, (-16777216) & i7), m24756() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max3, getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a0 A[LOOP:0: B:41:0x029e->B:42:0x02a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c2 A[LOOP:1: B:45:0x02c0->B:46:0x02c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02fb A[LOOP:2: B:54:0x02f9->B:55:0x02fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9762.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24750(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            C14699 c14699 = (C14699) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c14699).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) c14699).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += view.getMeasuredWidth() + max + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24749(View view, int i, int[] iArr, int i2) {
        C14699 c14699 = (C14699) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c14699).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int m24747 = m24747(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m24747, max + measuredWidth, view.getMeasuredHeight() + m24747);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c14699).rightMargin + max;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m24759(View view, int i, int[] iArr, int i2) {
        C14699 c14699 = (C14699) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c14699).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m24747 = m24747(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m24747, max, view.getMeasuredHeight() + m24747);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c14699).leftMargin);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24747(View view, int i) {
        C14699 c14699 = (C14699) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m24757 = m24757(c14699.f39731);
        if (m24757 == 48) {
            return getPaddingTop() - i2;
        }
        if (m24757 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c14699).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c14699).topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c14699).bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m24757(int i) {
        int i2 = i & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.mGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24754(List list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C14699 c14699 = (C14699) childAt.getLayoutParams();
                if (c14699.f44895 == 0 && m24766(childAt) && m24745(c14699.f39731) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C14699 c146992 = (C14699) childAt2.getLayoutParams();
            if (c146992.f44895 == 0 && m24766(childAt2) && m24745(c146992.f39731) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24745(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m24766(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24746(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m24758(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup
    public C14699 generateLayoutParams(AttributeSet attributeSet) {
        return new C14699(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C14699 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C14699) {
            C14699 c14699 = (C14699) layoutParams;
            C14699 c146992 = new C14699(c14699);
            c146992.f44895 = 0;
            c146992.f44895 = c14699.f44895;
            return c146992;
        }
        if (layoutParams instanceof C13267) {
            C14699 c146993 = new C14699((C13267) layoutParams);
            c146993.f44895 = 0;
            return c146993;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C14699 c146994 = new C14699(layoutParams);
            c146994.f44895 = 0;
            return c146994;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C14699 c146995 = new C14699(marginLayoutParams);
        c146995.f44895 = 0;
        ((ViewGroup.MarginLayoutParams) c146995).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c146995).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c146995).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c146995).bottomMargin = marginLayoutParams.bottomMargin;
        return c146995;
    }

    @Override // android.view.ViewGroup
    public C14699 generateDefaultLayoutParams() {
        C14699 c14699 = new C14699(-2, -2);
        c14699.f44895 = 0;
        c14699.f39731 = 8388627;
        return c14699;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C14699);
    }

    public InterfaceC0504 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new C2706(this, true);
        }
        return this.mWrapper;
    }

    public void removeChildrenForExpandedActionView() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = getChildAt(childCount);
            if (((C14699) childAt.getLayoutParams()).f44895 != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void addChildrenForExpandedActionView() {
        int size = this.mHiddenViews.size();
        while (true) {
            size--;
            if (size >= 0) {
                addView((View) this.mHiddenViews.get(size));
            } else {
                this.mHiddenViews.clear();
                return;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m24763(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setMenuCallbacks(InterfaceC17585 interfaceC17585, InterfaceC19994 interfaceC19994) {
        this.mActionMenuPresenterCallback = interfaceC17585;
        this.mMenuBuilderCallback = interfaceC19994;
        C8788 c8788 = this.mMenuView;
        if (c8788 != null) {
            c8788.m22673(interfaceC17585, interfaceC19994);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24751() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new C16382();
        }
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public C17254 getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Context getPopupContext() {
        return this.mPopupContext;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private ArrayList m24761() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m24755() {
        Menu menu = getMenu();
        ArrayList m24761 = m24761();
        this.mMenuHostHelper.m29700(menu, m24768());
        ArrayList m247612 = m24761();
        m247612.removeAll(m24761);
        this.mProvidedMenuItems = m247612;
    }

    @Override // l.InterfaceC19974
    public void addMenuProvider(InterfaceC11507 interfaceC11507) {
        this.mMenuHostHelper.m29701(interfaceC11507);
    }

    public void addMenuProvider(InterfaceC11507 interfaceC11507, InterfaceC23586 interfaceC23586) {
        this.mMenuHostHelper.m29702(interfaceC11507, interfaceC23586);
    }

    public void addMenuProvider(InterfaceC11507 interfaceC11507, InterfaceC23586 interfaceC23586, EnumC13728 enumC13728) {
        this.mMenuHostHelper.m29703(interfaceC11507, interfaceC23586, enumC13728);
    }

    @Override // l.InterfaceC19974
    public void removeMenuProvider(InterfaceC11507 interfaceC11507) {
        this.mMenuHostHelper.m29706(interfaceC11507);
    }

    public void invalidateMenu() {
        Iterator it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m24755();
    }

    public void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m42466 = C18228.m42466(this);
            boolean z = hasExpandedActionView() && m42466 != null && isAttachedToWindow() && this.mBackInvokedCallbackEnabled;
            if (z && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = C18228.m42465(new RunnableC7412(1, this));
                }
                C18228.m42467(m42466, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = m42466;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            C18228.m42468(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }
}
