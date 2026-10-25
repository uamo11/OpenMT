package l;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.umeng.analytics.pro.o;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Y6A7 */
/* renamed from: l.۬۬ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13132 extends ViewGroup implements InterfaceC22795 {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    public static final boolean ALLOW_THREAD_GAP_WORK;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    public static final float FLING_DESTRETCH_FACTOR = 4.0f;
    public static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    public static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    public static final float INFLEXION = 0.35f;
    public static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    public static final Class[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION;
    public static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    public static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    public static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    public static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static boolean sDebugAssertionsEnabled;
    public static final C22305 sDefaultEdgeEffectFactory;
    public static final Interpolator sQuinticInterpolator;
    public static boolean sVerboseLoggingEnabled;
    public C10311 mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public AbstractC19902 mAdapter;
    public C1347 mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public InterfaceC12845 mChildDrawingOrderCallback;
    public C22514 mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public C12140 mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public RunnableC5126 mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public InterfaceC20895 mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public AbstractC22723 mItemAnimator;
    public InterfaceC5790 mItemAnimatorListener;
    public Runnable mItemAnimatorRunner;
    public final ArrayList mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastAutoMeasureNonExactMeasuredHeight;
    public int mLastAutoMeasureNonExactMeasuredWidth;
    public boolean mLastAutoMeasureSkippedDueToExact;
    public int mLastTouchX;
    public int mLastTouchY;
    public AbstractC17366 mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final C18778 mObserver;
    public List mOnChildAttachStateListeners;
    public AbstractC6783 mOnFlingListener;
    public final ArrayList mOnItemTouchListeners;
    public final List mPendingAccessibilityImportanceChange;
    public C0432 mPendingSavedState;
    public final float mPhysicalCoef;
    public boolean mPostedAnimatorRunner;
    public C19238 mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final C2550 mRecycler;
    public InterfaceC3961 mRecyclerListener;
    public final List mRecyclerListeners;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public float mScaledHorizontalScrollFactor;
    public float mScaledVerticalScrollFactor;
    public AbstractC9606 mScrollListener;
    public List mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public C13622 mScrollingChildHelper;
    public final C21600 mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final RunnableC4666 mViewFlinger;
    public final InterfaceC18758 mViewInfoProcessCallback;
    public final C19464 mViewInfoStore;
    public static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setEdgeEffectFactory(C12140 c12140) {
        c12140.getClass();
        this.mEdgeEffectFactory = c12140;
        invalidateGlows();
    }

    static {
        int i = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i >= 23;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = true;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC5084();
        sDefaultEdgeEffectFactory = new C22305();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31819(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31837(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    public C13132(Context context) {
        this(context, null);
    }

    public C13132(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bin.mt.plus.R.attr.MT_Protector_res_0x7f0403ee);
    }

    public C13132(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C18778(this);
        this.mRecycler = new C2550(this);
        this.mViewInfoStore = new C19464();
        this.mUpdateChildViewsRunnable = new RunnableC19196(this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new C7697();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC4666(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C19238() : null;
        C21600 c21600 = new C21600();
        c21600.f69350 = -1;
        c21600.f69361 = 0;
        c21600.f69349 = 0;
        c21600.f69352 = 1;
        c21600.f69362 = 0;
        c21600.f69357 = false;
        c21600.f69359 = false;
        c21600.f69351 = false;
        c21600.f69356 = false;
        c21600.f69353 = false;
        c21600.f69354 = false;
        this.mState = c21600;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C13550(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC0144(this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C0850(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C21177.m48124(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C21177.m48125(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m50784(this.mItemAnimatorListener);
        initAdapterManager();
        m31831();
        m31849();
        int i2 = C17648.f53953;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C10311(this));
        int[] iArr = C0641.f2489;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C17648.m41302(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        m31809(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C17648.m41302(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(bin.mt.plus.R.id.MT_Protector_res_0x7f0a02a5, Boolean.TRUE);
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31849() {
        if (C17648.m41295(this) == 0) {
            C17648.m41313((ViewGroup) this, 8);
        }
    }

    public C10311 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void setAccessibilityDelegateCompat(C10311 c10311) {
        this.mAccessibilityDelegate = c10311;
        C17648.m41309(this, c10311);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31809(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String m31803 = m31803(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(m31803, false, classLoader).asSubclass(AbstractC17366.class);
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m31803, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC17366) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m31803, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m31803, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m31803, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m31803, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m31803, e7);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m31803(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return C13132.class.getPackage().getName() + '.' + str;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m31831() {
        this.mChildHelper = new C22514(new C7906(this));
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C1347(new C14961(this));
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void swapAdapter(AbstractC19902 abstractC19902, boolean z) {
        setLayoutFrozen(false);
        m31818(abstractC19902, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void setAdapter(AbstractC19902 abstractC19902) {
        setLayoutFrozen(false);
        m31818(abstractC19902, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void removeAndRecycleViews() {
        AbstractC22723 abstractC22723 = this.mItemAnimator;
        if (abstractC22723 != null) {
            abstractC22723.mo20595();
        }
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            abstractC17366.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        C2550 c2550 = this.mRecycler;
        c2550.f8075.clear();
        c2550.m8082();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31818(AbstractC19902 abstractC19902, boolean z, boolean z2) {
        AbstractC19902 abstractC199022 = this.mAdapter;
        if (abstractC199022 != null) {
            abstractC199022.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m4713();
        AbstractC19902 abstractC199023 = this.mAdapter;
        this.mAdapter = abstractC19902;
        if (abstractC19902 != null) {
            abstractC19902.registerAdapterDataObserver(this.mObserver);
            abstractC19902.onAttachedToRecyclerView(this);
        }
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            abstractC17366.onAdapterChanged(abstractC199023, this.mAdapter);
        }
        this.mRecycler.m8074(abstractC199023, this.mAdapter, z);
        this.mState.f69357 = true;
    }

    public AbstractC19902 getAdapter() {
        return this.mAdapter;
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC3961 interfaceC3961) {
        this.mRecyclerListener = interfaceC3961;
    }

    public void addRecyclerListener(InterfaceC3961 interfaceC3961) {
        C13746.m33056("'listener' arg cannot be null.", interfaceC3961 != null);
        this.mRecyclerListeners.add(interfaceC3961);
    }

    public void removeRecyclerListener(InterfaceC3961 interfaceC3961) {
        this.mRecyclerListeners.remove(interfaceC3961);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            return abstractC17366.getBaseline();
        }
        return super.getBaseline();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC23716 interfaceC23716) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC23716);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC23716 interfaceC23716) {
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC23716);
    }

    public void clearOnChildAttachStateChangeListeners() {
        List list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void setLayoutManager(AbstractC17366 abstractC17366) {
        if (abstractC17366 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC22723 abstractC22723 = this.mItemAnimator;
            if (abstractC22723 != null) {
                abstractC22723.mo20595();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            C2550 c2550 = this.mRecycler;
            c2550.f8075.clear();
            c2550.m8082();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            C2550 c25502 = this.mRecycler;
            c25502.f8075.clear();
            c25502.m8082();
        }
        C22514 c22514 = this.mChildHelper;
        C13132 c13132 = c22514.f72857.f24490;
        c22514.f72856.m49159();
        ArrayList arrayList = c22514.f72858;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            AbstractC3255 m31833 = m31833((View) arrayList.get(size));
            if (m31833 != null) {
                m31833.onLeftHiddenState(c13132);
            }
            arrayList.remove(size);
        }
        int childCount = c13132.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c13132.getChildAt(i);
            c13132.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        c13132.removeAllViews();
        this.mLayout = abstractC17366;
        if (abstractC17366 != null) {
            if (abstractC17366.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC17366 + " is already attached to a RecyclerView:" + abstractC17366.mRecyclerView.exceptionLabel());
            }
            abstractC17366.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m8079();
        requestLayout();
    }

    public void setOnFlingListener(AbstractC6783 abstractC6783) {
        this.mOnFlingListener = abstractC6783;
    }

    public AbstractC6783 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0432 c0432 = new C0432(super.onSaveInstanceState());
        C0432 c04322 = this.mPendingSavedState;
        if (c04322 == null) {
            AbstractC17366 abstractC17366 = this.mLayout;
            if (abstractC17366 != null) {
                c0432.f1915 = abstractC17366.onSaveInstanceState();
                return c0432;
            }
            c0432.f1915 = null;
            return c0432;
        }
        c0432.f1915 = c04322.f1915;
        return c0432;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0432)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0432 c0432 = (C0432) parcelable;
        this.mPendingSavedState = c0432;
        super.onRestoreInstanceState(c0432.getSuperState());
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31812(AbstractC3255 abstractC3255) {
        View view = abstractC3255.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m8078(getChildViewHolder(view));
        if (abstractC3255.isTmpDetached()) {
            this.mChildHelper.m50472(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.m50473(view, -1, true);
        } else {
            this.mChildHelper.m50471(view);
        }
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean m50481 = this.mChildHelper.m50481(view);
        if (m50481) {
            AbstractC3255 m31833 = m31833(view);
            this.mRecycler.m8078(m31833);
            this.mRecycler.m8071(m31833);
            if (sVerboseLoggingEnabled) {
                C11003.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!m50481);
        return m50481;
    }

    public AbstractC17366 getLayoutManager() {
        return this.mLayout;
    }

    public C15954 getRecycledViewPool() {
        return this.mRecycler.m8069();
    }

    public void setRecycledViewPool(C15954 c15954) {
        this.mRecycler.m8073(c15954);
    }

    public void setViewCacheExtension(AbstractC20189 abstractC20189) {
        this.mRecycler.getClass();
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m8084(i);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i;
        if (i != 2) {
            m31828();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void addItemDecoration(AbstractC7201 abstractC7201, int i) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            abstractC17366.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC7201);
        } else {
            this.mItemDecorations.add(i, abstractC7201);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addItemDecoration(AbstractC7201 abstractC7201) {
        addItemDecoration(abstractC7201, -1);
    }

    public AbstractC7201 getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        return (AbstractC7201) this.mItemDecorations.get(i);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeItemDecoration(AbstractC7201 abstractC7201) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            abstractC17366.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC7201);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC12845 interfaceC12845) {
        if (interfaceC12845 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC12845;
        setChildrenDrawingOrderEnabled(interfaceC12845 != null);
    }

    @Deprecated
    public void setOnScrollListener(AbstractC9606 abstractC9606) {
        this.mScrollListener = abstractC9606;
    }

    public void addOnScrollListener(AbstractC9606 abstractC9606) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC9606);
    }

    public void removeOnScrollListener(AbstractC9606 abstractC9606) {
        List list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC9606);
        }
    }

    public void clearOnScrollListeners() {
        List list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null) {
            return;
        }
        abstractC17366.scrollToPosition(i);
        awakenScrollBars();
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void smoothScrollToPosition(int i) {
        AbstractC17366 abstractC17366;
        if (this.mLayoutSuppressed || (abstractC17366 = this.mLayout) == null) {
            return;
        }
        abstractC17366.smoothScrollToPosition(this, this.mState, i);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null || this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = abstractC17366.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i = 0;
            }
            if (!canScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public void nestedScrollBy(int i, int i2) {
        m31807(i, i2, (MotionEvent) null, 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31807(int i, int i2, MotionEvent motionEvent, int i3) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = abstractC17366.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        int i4 = canScrollVertically ? (canScrollHorizontally ? 1 : 0) | 2 : canScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int m31801 = i - m31801(i, height);
        int m31832 = i2 - m31832(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(canScrollHorizontally ? m31801 : 0, canScrollVertically ? m31832 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            m31801 -= iArr2[0];
            m31832 -= iArr2[1];
        }
        scrollByInternal(canScrollHorizontally ? m31801 : 0, canScrollVertically ? m31832 : 0, motionEvent, i3);
        RunnableC5126 runnableC5126 = this.mGapWorker;
        if (runnableC5126 != null && (m31801 != 0 || m31832 != 0)) {
            runnableC5126.m14677(this, m31801, m31832);
        }
        stopNestedScroll(i3);
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = C5342.f16662;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = C5342.f16662;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
        } else {
            if (!this.mAdapterHelper.m4711()) {
                return;
            }
            if (this.mAdapterHelper.m4706(4) && !this.mAdapterHelper.m4706(11)) {
                int i2 = C5342.f16662;
                Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.m4714();
                if (!this.mLayoutWasDefered) {
                    if (m31829()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.m4703();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else {
                if (this.mAdapterHelper.m4711()) {
                    int i3 = C5342.f16662;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
        }
        Trace.endSection();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m31829() {
        int m50469 = this.mChildHelper.m50469();
        for (int i = 0; i < m50469; i++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50476(i));
            if (m31833 != null && !m31833.shouldIgnore() && m31833.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & o.a.r) != 8194) {
                m31806(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m31801(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C23379.m51830(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -C23379.m51832(this.mLeftGlow, -width, 1.0f - height);
                if (C23379.m51830(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && C23379.m51830(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float m51832 = C23379.m51832(this.mRightGlow, width, height);
                    if (C23379.m51830(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = m51832;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m31832(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C23379.m51830(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -C23379.m51832(this.mTopGlow, -height, width);
                if (C23379.m51830(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && C23379.m51830(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float m51832 = C23379.m51832(this.mBottomGlow, height, 1.0f - width);
                    if (C23379.m51830(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = m51832;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null && abstractC17366.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null && abstractC17366.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null && abstractC17366.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null && abstractC17366.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null && abstractC17366.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null && abstractC17366.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null || this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC17366.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 == Integer.MIN_VALUE || i3 > 0) {
            if (z) {
                int i4 = i != 0 ? 1 : 0;
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.m13723(i, i2, interpolator, i3);
            return;
        }
        scrollBy(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fling(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.fling(int, int):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m31824(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return m31800(-i) < C23379.m51830(edgeEffect) * ((float) i2);
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return m31802(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return m31802(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m31802(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && C23379.m51830(edgeEffect) != 0.0f) {
            int round = Math.round(C23379.m51832(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || C23379.m51830(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round(C23379.m51832(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    public void stopScroll() {
        setScrollState(0);
        m31828();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m31828() {
        RunnableC4666 runnableC4666 = this.mViewFlinger;
        runnableC4666.f14838.removeCallbacks(runnableC4666);
        runnableC4666.f14836.abortAnimation();
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            abstractC17366.stopSmoothScroller();
        }
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m31806(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L20
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            l.C23379.m51832(r3, r4, r9)
            goto L39
        L20:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            l.C23379.m51832(r3, r4, r9)
        L39:
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            l.C23379.m51832(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            l.C23379.m51832(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7e
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            int r7 = l.C17648.f53953
            r6.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.m31806(float, float, float, float):void");
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m31827() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            int i = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            int i3 = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        int i3 = C17648.f53953;
        postInvalidateOnAnimation();
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((C22305) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((C22305) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((C22305) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((C22305) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public C12140 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i);
            if (findNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return m31823(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m31811(view2, (View) null);
        return view;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m31823(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            m31811(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31811(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C14543) {
            C14543 c14543 = (C14543) layoutParams;
            if (!c14543.f44552) {
                Rect rect = c14543.f44551;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null || !abstractC17366.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.mFirstLayoutComplete = r1
            l.ۖ۬ۧ r1 = r5.mRecycler
            r1.m8080()
            l.ܿ۬ۧ r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = l.C13132.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L7d
            java.lang.ThreadLocal r0 = l.RunnableC5126.f16049
            java.lang.Object r1 = r0.get()
            l.ۚۙۧ r1 = (l.RunnableC5126) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L63
            l.ۚۙۧ r1 = new l.ۚۙۧ
            r1.<init>()
            r5.mGapWorker = r1
            int r1 = l.C17648.f53953
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            l.ۚۙۧ r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f16053 = r3
            r0.set(r2)
        L63:
            l.ۚۙۧ r0 = r5.mGapWorker
            java.util.ArrayList r0 = r0.f16052
            boolean r1 = l.C13132.sDebugAssertionsEnabled
            if (r1 == 0) goto L7a
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L72
            goto L7a
        L72:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7a:
            r0.add(r5)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC5126 runnableC5126;
        super.onDetachedFromWindow();
        AbstractC22723 abstractC22723 = this.mItemAnimator;
        if (abstractC22723 != null) {
            abstractC22723.mo20595();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            abstractC17366.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (C3941.f12558.mo16806() != null) {
        }
        this.mRecycler.m8083();
        C9975.m25139(this);
        if (!ALLOW_THREAD_GAP_WORK || (runnableC5126 = this.mGapWorker) == null) {
            return;
        }
        boolean remove = runnableC5126.f16052.remove(this);
        if (sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(exceptionLabel());
        throw new IllegalStateException(m15339.toString());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException("" + exceptionLabel());
        }
    }

    public void addOnItemTouchListener(InterfaceC20895 interfaceC20895) {
        this.mOnItemTouchListeners.add(interfaceC20895);
    }

    public void removeOnItemTouchListener(InterfaceC20895 interfaceC20895) {
        this.mOnItemTouchListeners.remove(interfaceC20895);
        if (this.mInterceptingOnItemTouchListener == interfaceC20895) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m31822(MotionEvent motionEvent) {
        InterfaceC20895 interfaceC20895 = this.mInterceptingOnItemTouchListener;
        if (interfaceC20895 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m31838(motionEvent);
        }
        interfaceC20895.mo11303(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m31838(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC20895 interfaceC20895 = (InterfaceC20895) this.mOnItemTouchListeners.get(i);
            if (interfaceC20895.mo11308(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC20895;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (m31838(motionEvent)) {
            m31805();
            return true;
        }
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null) {
            return false;
        }
        boolean canScrollHorizontally = abstractC17366.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (m31846(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = canScrollHorizontally;
            if (canScrollVertically) {
                i = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (canScrollHorizontally == 0 || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (canScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m31805();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            m31843(motionEvent);
        }
        return this.mScrollState == 1;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m31846(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || C23379.m51830(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            C23379.m51832(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && C23379.m51830(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            C23379.m51832(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && C23379.m51830(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            C23379.m51832(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || C23379.m51830(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        C23379.m51832(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC20895) this.mOnItemTouchListeners.get(i)).mo11304(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m31848() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        m31827();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31805() {
        m31848();
        setScrollState(0);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m31843(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            l.ܿ۬ۧ r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            l.ܿ۬ۧ r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            l.ܿ۬ۧ r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L60
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L61
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L5f
            r0 = 26
            float r3 = r6.getAxisValue(r0)
            l.ܿ۬ۧ r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L55
            float r0 = -r3
            goto L60
        L55:
            l.ܿ۬ۧ r0 = r5.mLayout
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L5f
            r0 = 0
            goto L61
        L5f:
            r0 = 0
        L60:
            r3 = 0
        L61:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L69
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L69:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.m31807(r2, r0, r6, r3)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC17366.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f69352 == 1) {
                m31842();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f69356 = true;
            m31845();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f69356 = true;
                m31845();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            m31840();
            onExitLayoutOrScroll();
            C21600 c21600 = this.mState;
            if (c21600.f69354) {
                c21600.f69359 = true;
            } else {
                this.mAdapterHelper.m4709();
                this.mState.f69359 = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f69354) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC19902 abstractC19902 = this.mAdapter;
        if (abstractC19902 != null) {
            this.mState.f69362 = abstractC19902.getItemCount();
        } else {
            this.mState.f69362 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f69359 = false;
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i3 = C17648.f53953;
        setMeasuredDimension(AbstractC17366.m40691(i, paddingRight, getMinimumWidth()), AbstractC17366.m40691(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    public void setItemAnimator(AbstractC22723 abstractC22723) {
        AbstractC22723 abstractC227232 = this.mItemAnimator;
        if (abstractC227232 != null) {
            abstractC227232.mo20595();
            this.mItemAnimator.m50784((InterfaceC5790) null);
        }
        this.mItemAnimator = abstractC22723;
        if (abstractC22723 != null) {
            abstractC22723.m50784(this.mItemAnimatorListener);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                m31834();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31834() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        obtain.setContentChangeTypes(i);
        sendAccessibilityEventUnchecked(obtain);
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public AbstractC22723 getItemAnimator() {
        return this.mItemAnimator;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        int i = C17648.f53953;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m31830() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m31840() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m4713();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (m31830()) {
            this.mAdapterHelper.m4714();
        } else {
            this.mAdapterHelper.m4709();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f69353 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C21600 c21600 = this.mState;
        c21600.f69354 = c21600.f69353 && z2 && !this.mDataSetHasChangedAfterLayout && m31830();
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f69356 = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f69352 == 1) {
            m31842();
            this.mLayout.setExactMeasureSpecsFrom(this);
            m31845();
        } else {
            C1347 c1347 = this.mAdapterHelper;
            if ((!c1347.f4896.isEmpty() && !c1347.f4897.isEmpty()) || z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
                m31845();
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
            }
        }
        m31844();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m31799() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC3255 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            m31847();
            return;
        }
        this.mState.f69355 = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        C21600 c21600 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        }
        c21600.f69358 = absoluteAdapterPosition;
        this.mState.f69360 = m31841(findContainingViewHolder.itemView);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m31847() {
        C21600 c21600 = this.mState;
        c21600.f69355 = -1L;
        c21600.f69358 = -1;
        c21600.f69360 = -1;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private View m31839() {
        AbstractC3255 findViewHolderForAdapterPosition;
        C21600 c21600 = this.mState;
        int i = c21600.f69358;
        if (i == -1) {
            i = 0;
        }
        int m48777 = c21600.m48777();
        for (int i2 = i; i2 < m48777; i2++) {
            AbstractC3255 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(m48777, i);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m31826() {
        /*
            r7 = this;
            boolean r0 = r7.mPreserveFocusAfterLayout
            if (r0 == 0) goto Lb5
            l.᩶ۗۧ r0 = r7.mAdapter
            if (r0 == 0) goto Lb5
            boolean r0 = r7.hasFocus()
            if (r0 == 0) goto Lb5
            int r0 = r7.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto Lb5
            int r0 = r7.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L26
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L26
            goto Lb5
        L26:
            boolean r0 = r7.isFocused()
            if (r0 != 0) goto L57
            android.view.View r0 = r7.getFocusedChild()
            boolean r1 = l.C13132.IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L4c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L40
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L4c
        L40:
            l.᩹᩶ۧ r0 = r7.mChildHelper
            int r0 = r0.m50469()
            if (r0 != 0) goto L57
            r7.requestFocus()
            return
        L4c:
            l.᩹᩶ۧ r1 = r7.mChildHelper
            java.util.ArrayList r1 = r1.f72858
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L57
            goto Lb5
        L57:
            l.᩸۬ۧ r0 = r7.mState
            long r0 = r0.f69355
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L73
            l.᩶ۗۧ r0 = r7.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L73
            l.᩸۬ۧ r0 = r7.mState
            long r0 = r0.f69355
            l.ۗ۬ۧ r0 = r7.findViewHolderForItemId(r0)
            goto L74
        L73:
            r0 = r4
        L74:
            if (r0 == 0) goto L8e
            l.᩹᩶ۧ r1 = r7.mChildHelper
            android.view.View r5 = r0.itemView
            java.util.ArrayList r1 = r1.f72858
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L8e
            android.view.View r1 = r0.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L8b
            goto L8e
        L8b:
            android.view.View r4 = r0.itemView
            goto L9a
        L8e:
            l.᩹᩶ۧ r0 = r7.mChildHelper
            int r0 = r0.m50469()
            if (r0 <= 0) goto L9a
            android.view.View r4 = r7.m31839()
        L9a:
            if (r4 == 0) goto Lb5
            l.᩸۬ۧ r0 = r7.mState
            int r0 = r0.f69360
            long r5 = (long) r0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto Lb2
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto Lb2
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto Lb2
            r4 = r0
        Lb2:
            r4.requestFocus()
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.m31826():void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m31841(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void fillRemainingScrollValues(C21600 c21600) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f14836;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c21600.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c21600.getClass();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m31842() {
        C3941 c3941;
        this.mState.m48778(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f69356 = false;
        startInterceptRequestLayout();
        C19464 c19464 = this.mViewInfoStore;
        c19464.f62936.clear();
        c19464.f62937.m15694();
        onEnterLayoutOrScroll();
        m31840();
        m31799();
        C21600 c21600 = this.mState;
        c21600.f69351 = c21600.f69353 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c21600.f69359 = c21600.f69354;
        c21600.f69362 = this.mAdapter.getItemCount();
        m31820(this.mMinMaxLayoutPositions);
        if (this.mState.f69353) {
            int m50469 = this.mChildHelper.m50469();
            for (int i = 0; i < m50469; i++) {
                AbstractC3255 m31833 = m31833(this.mChildHelper.m50476(i));
                if (!m31833.shouldIgnore() && (!m31833.isInvalid() || this.mAdapter.hasStableIds())) {
                    AbstractC22723 abstractC22723 = this.mItemAnimator;
                    AbstractC22723.m50780(m31833);
                    m31833.getUnmodifiedPayloads();
                    abstractC22723.getClass();
                    C11435 c11435 = new C11435();
                    c11435.m28252(m31833);
                    C3432 c3432 = this.mViewInfoStore.f62936;
                    C3941 c39412 = (C3941) c3432.getOrDefault(m31833, null);
                    if (c39412 == null) {
                        c39412 = C3941.m11993();
                        c3432.put(m31833, c39412);
                    }
                    c39412.f12561 = c11435;
                    c39412.f12559 |= 4;
                    if (this.mState.f69351 && m31833.isUpdated() && !m31833.isRemoved() && !m31833.shouldIgnore() && !m31833.isInvalid()) {
                        this.mViewInfoStore.f62937.m15696(getChangedHolderKey(m31833), m31833);
                    }
                }
            }
        }
        if (this.mState.f69354) {
            saveOldPositions();
            C21600 c216002 = this.mState;
            boolean z = c216002.f69357;
            c216002.f69357 = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c216002);
            this.mState.f69357 = z;
            for (int i2 = 0; i2 < this.mChildHelper.m50469(); i2++) {
                AbstractC3255 m318332 = m31833(this.mChildHelper.m50476(i2));
                if (!m318332.shouldIgnore() && ((c3941 = (C3941) this.mViewInfoStore.f62936.getOrDefault(m318332, null)) == null || (c3941.f12559 & 4) == 0)) {
                    AbstractC22723.m50780(m318332);
                    boolean hasAnyOfTheFlags = m318332.hasAnyOfTheFlags(8192);
                    AbstractC22723 abstractC227232 = this.mItemAnimator;
                    m318332.getUnmodifiedPayloads();
                    abstractC227232.getClass();
                    C11435 c114352 = new C11435();
                    c114352.m28252(m318332);
                    if (!hasAnyOfTheFlags) {
                        C3432 c34322 = this.mViewInfoStore.f62936;
                        C3941 c39413 = (C3941) c34322.getOrDefault(m318332, null);
                        if (c39413 == null) {
                            c39413 = C3941.m11993();
                            c34322.put(m318332, c39413);
                        }
                        c39413.f12559 |= 2;
                        c39413.f12561 = c114352;
                    } else {
                        recordAnimationInfoIfBouncedHiddenView(m318332, c114352);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f69352 = 2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m31845() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m48778(6);
        this.mAdapterHelper.m4709();
        this.mState.f69362 = this.mAdapter.getItemCount();
        this.mState.f69349 = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f1915;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C21600 c21600 = this.mState;
        c21600.f69359 = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c21600);
        C21600 c216002 = this.mState;
        c216002.f69357 = false;
        c216002.f69353 = c216002.f69353 && this.mItemAnimator != null;
        c216002.f69352 = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m31844() {
        C11435 c11435;
        C11435 c114352;
        C0850 c0850;
        boolean mo20590;
        int i;
        int i2;
        C0850 c08502;
        this.mState.m48778(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C21600 c21600 = this.mState;
        c21600.f69352 = 1;
        if (c21600.f69353) {
            for (int m50469 = this.mChildHelper.m50469() - 1; m50469 >= 0; m50469--) {
                AbstractC3255 m31833 = m31833(this.mChildHelper.m50476(m50469));
                if (!m31833.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(m31833);
                    this.mItemAnimator.getClass();
                    C11435 c114353 = new C11435();
                    c114353.m28252(m31833);
                    AbstractC3255 abstractC3255 = (AbstractC3255) this.mViewInfoStore.f62937.m15697(changedHolderKey, null);
                    if (abstractC3255 == null || abstractC3255.shouldIgnore()) {
                        this.mViewInfoStore.m44864(m31833, c114353);
                    } else {
                        C3941 c3941 = (C3941) this.mViewInfoStore.f62936.getOrDefault(abstractC3255, null);
                        boolean z = (c3941 == null || (c3941.f12559 & 1) == 0) ? false : true;
                        C3941 c39412 = (C3941) this.mViewInfoStore.f62936.getOrDefault(m31833, null);
                        boolean z2 = (c39412 == null || (c39412.f12559 & 1) == 0) ? false : true;
                        if (z && abstractC3255 == m31833) {
                            this.mViewInfoStore.m44864(m31833, c114353);
                        } else {
                            C11435 m44865 = this.mViewInfoStore.m44865(abstractC3255);
                            this.mViewInfoStore.m44864(m31833, c114353);
                            C11435 m44863 = this.mViewInfoStore.m44863(m31833);
                            if (m44865 == null) {
                                m31808(changedHolderKey, m31833, abstractC3255);
                            } else {
                                m31813(abstractC3255, m31833, m44865, m44863, z, z2);
                            }
                        }
                    }
                }
            }
            C19464 c19464 = this.mViewInfoStore;
            InterfaceC18758 interfaceC18758 = this.mViewInfoProcessCallback;
            C3432 c3432 = c19464.f62936;
            for (int size = c3432.size() - 1; size >= 0; size--) {
                AbstractC3255 abstractC32552 = (AbstractC3255) c3432.m10499(size);
                C3941 c39413 = (C3941) c3432.m10500(size);
                int i3 = c39413.f12559;
                if ((i3 & 3) == 3) {
                    c08502 = (C0850) interfaceC18758;
                } else {
                    if ((i3 & 1) != 0) {
                        C11435 c114354 = c39413.f12561;
                        if (c114354 == null) {
                            c08502 = (C0850) interfaceC18758;
                        } else {
                            C11435 c114355 = c39413.f12560;
                            C13132 c13132 = ((C0850) interfaceC18758).f3330;
                            c13132.mRecycler.m8078(abstractC32552);
                            c13132.animateDisappearance(abstractC32552, c114354, c114355);
                        }
                    } else {
                        if ((i3 & 14) == 14) {
                            c11435 = c39413.f12561;
                            c114352 = c39413.f12560;
                            c0850 = (C0850) interfaceC18758;
                        } else if ((i3 & 12) == 12) {
                            C11435 c114356 = c39413.f12561;
                            C11435 c114357 = c39413.f12560;
                            C0850 c08503 = (C0850) interfaceC18758;
                            c08503.getClass();
                            abstractC32552.setIsRecyclable(false);
                            C13132 c131322 = c08503.f3330;
                            if (c131322.mDataSetHasChangedAfterLayout) {
                                AbstractC11722 abstractC11722 = (AbstractC11722) c131322.mItemAnimator;
                                abstractC11722.getClass();
                                int i4 = c114356.f34205;
                                int i5 = c114356.f34206;
                                if (abstractC32552.shouldIgnore()) {
                                    int i6 = c114356.f34205;
                                    i2 = c114356.f34206;
                                    i = i6;
                                } else {
                                    i = c114357.f34205;
                                    i2 = c114357.f34206;
                                }
                                if (abstractC11722.mo20592(abstractC32552, abstractC32552, i4, i5, i, i2)) {
                                    c131322.postAnimationRunner();
                                }
                            } else {
                                AbstractC11722 abstractC117222 = (AbstractC11722) c131322.mItemAnimator;
                                abstractC117222.getClass();
                                int i7 = c114356.f34205;
                                int i8 = c114357.f34205;
                                if (i7 == i8 && c114356.f34206 == c114357.f34206) {
                                    abstractC117222.m50783(abstractC32552);
                                    mo20590 = false;
                                } else {
                                    mo20590 = abstractC117222.mo20590(abstractC32552, i7, c114356.f34206, i8, c114357.f34206);
                                }
                                if (mo20590) {
                                    c131322.postAnimationRunner();
                                }
                            }
                        } else if ((i3 & 4) != 0) {
                            C11435 c114358 = c39413.f12561;
                            C13132 c131323 = ((C0850) interfaceC18758).f3330;
                            c131323.mRecycler.m8078(abstractC32552);
                            c131323.animateDisappearance(abstractC32552, c114358, null);
                        } else if ((i3 & 8) != 0) {
                            c11435 = c39413.f12561;
                            c114352 = c39413.f12560;
                            c0850 = (C0850) interfaceC18758;
                        }
                        c0850.f3330.animateAppearance(abstractC32552, c11435, c114352);
                    }
                    c39413.f12559 = 0;
                    c39413.f12561 = null;
                    c39413.f12560 = null;
                    C3941.f12558.mo16807(c39413);
                }
                C13132 c131324 = c08502.f3330;
                c131324.mLayout.removeAndRecycleView(abstractC32552.itemView, c131324.mRecycler);
                c39413.f12559 = 0;
                c39413.f12561 = null;
                c39413.f12560 = null;
                C3941.f12558.mo16807(c39413);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C21600 c216002 = this.mState;
        c216002.f69361 = c216002.f69362;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c216002.f69353 = false;
        c216002.f69354 = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f8079;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC17366.mPrefetchMaxCountObserved = 0;
            abstractC17366.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m8079();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C19464 c194642 = this.mViewInfoStore;
        c194642.f62936.clear();
        c194642.f62937.m15694();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (m31821(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        m31826();
        m31847();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31808(long j, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552) {
        int m50469 = this.mChildHelper.m50469();
        for (int i = 0; i < m50469; i++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50476(i));
            if (m31833 != abstractC3255 && getChangedHolderKey(m31833) == j) {
                AbstractC19902 abstractC19902 = this.mAdapter;
                if (abstractC19902 != null && abstractC19902.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m31833 + " \n View Holder 2:" + abstractC3255 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m31833 + " \n View Holder 2:" + abstractC3255 + exceptionLabel());
            }
        }
        C11003.toString(abstractC32552);
        C11003.toString(abstractC3255);
        exceptionLabel();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC3255 abstractC3255, C11435 c11435) {
        abstractC3255.setFlags(0, 8192);
        if (this.mState.f69351 && abstractC3255.isUpdated() && !abstractC3255.isRemoved() && !abstractC3255.shouldIgnore()) {
            this.mViewInfoStore.f62937.m15696(getChangedHolderKey(abstractC3255), abstractC3255);
        }
        C3432 c3432 = this.mViewInfoStore.f62936;
        C3941 c3941 = (C3941) c3432.getOrDefault(abstractC3255, null);
        if (c3941 == null) {
            c3941 = C3941.m11993();
            c3432.put(abstractC3255, c3941);
        }
        c3941.f12561 = c11435;
        c3941.f12559 |= 4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31820(int[] iArr) {
        int m50469 = this.mChildHelper.m50469();
        if (m50469 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m50469; i3++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50476(i3));
            if (!m31833.shouldIgnore()) {
                int layoutPosition = m31833.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m31821(int i, int i2) {
        m31820(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC3255 m31833 = m31833(view);
        if (m31833 != null) {
            if (m31833.isTmpDetached()) {
                m31833.clearTmpDetachFlag();
            } else if (!m31833.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m31833 + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public long getChangedHolderKey(AbstractC3255 abstractC3255) {
        return this.mAdapter.hasStableIds() ? abstractC3255.getItemId() : abstractC3255.mPosition;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void animateAppearance(l.AbstractC3255 r8, l.C11435 r9, l.C11435 r10) {
        /*
            r7 = this;
            r0 = 0
            r8.setIsRecyclable(r0)
            l.᩺ۗۧ r0 = r7.mItemAnimator
            r1 = r0
            l.ۨ۬ۧ r1 = (l.AbstractC11722) r1
            if (r9 == 0) goto L24
            r1.getClass()
            int r3 = r9.f34205
            int r5 = r10.f34205
            if (r3 != r5) goto L1a
            int r0 = r9.f34206
            int r2 = r10.f34206
            if (r0 == r2) goto L24
        L1a:
            int r4 = r9.f34206
            int r6 = r10.f34206
            r2 = r8
            boolean r8 = r1.mo20590(r2, r3, r4, r5, r6)
            goto L28
        L24:
            r1.mo20598(r8)
            r8 = 1
        L28:
            if (r8 == 0) goto L2d
            r7.postAnimationRunner()
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.animateAppearance(l.ۗ۬ۧ, l.ۨۗۧ, l.ۨۗۧ):void");
    }

    public void animateDisappearance(AbstractC3255 abstractC3255, C11435 c11435, C11435 c114352) {
        boolean z;
        m31812(abstractC3255);
        abstractC3255.setIsRecyclable(false);
        AbstractC11722 abstractC11722 = (AbstractC11722) this.mItemAnimator;
        abstractC11722.getClass();
        int i = c11435.f34205;
        int i2 = c11435.f34206;
        View view = abstractC3255.itemView;
        int left = c114352 == null ? view.getLeft() : c114352.f34205;
        int top = c114352 == null ? view.getTop() : c114352.f34206;
        if (!abstractC3255.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = abstractC11722.mo20590(abstractC3255, i, i2, left, top);
        } else {
            abstractC11722.mo20597(abstractC3255);
            z = true;
        }
        if (z) {
            postAnimationRunner();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31813(AbstractC3255 abstractC3255, AbstractC3255 abstractC32552, C11435 c11435, C11435 c114352, boolean z, boolean z2) {
        int i;
        int i2;
        abstractC3255.setIsRecyclable(false);
        if (z) {
            m31812(abstractC3255);
        }
        if (abstractC3255 != abstractC32552) {
            if (z2) {
                m31812(abstractC32552);
            }
            abstractC3255.mShadowedHolder = abstractC32552;
            m31812(abstractC3255);
            this.mRecycler.m8078(abstractC3255);
            abstractC32552.setIsRecyclable(false);
            abstractC32552.mShadowingHolder = abstractC3255;
        }
        AbstractC11722 abstractC11722 = (AbstractC11722) this.mItemAnimator;
        abstractC11722.getClass();
        int i3 = c11435.f34205;
        int i4 = c11435.f34206;
        if (abstractC32552.shouldIgnore()) {
            int i5 = c11435.f34205;
            i2 = c11435.f34206;
            i = i5;
        } else {
            i = c114352.f34205;
            i2 = c114352.f34206;
        }
        if (abstractC11722.mo20592(abstractC3255, abstractC32552, i3, i4, i, i2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C5342.f16662;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void markItemDecorInsetsDirty() {
        int m50474 = this.mChildHelper.m50474();
        for (int i = 0; i < m50474; i++) {
            ((C14543) this.mChildHelper.m50477(i).getLayoutParams()).f44552 = true;
        }
        ArrayList arrayList = this.mRecycler.f8077;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C14543 c14543 = (C14543) ((AbstractC3255) arrayList.get(i2)).itemView.getLayoutParams();
            if (c14543 != null) {
                c14543.f44552 = true;
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC7201) this.mItemDecorations.get(i)).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo20599()) ? z : true) {
            int i2 = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7201) this.mItemDecorations.get(i)).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C14543) && this.mLayout.checkLayoutParams((C14543) layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC17366.generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC17366.generateLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
        }
        return abstractC17366.generateLayoutParams(layoutParams);
    }

    public boolean isAnimating() {
        AbstractC22723 abstractC22723 = this.mItemAnimator;
        return abstractC22723 != null && abstractC22723.mo20599();
    }

    public void saveOldPositions() {
        int m50474 = this.mChildHelper.m50474();
        for (int i = 0; i < m50474; i++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50477(i));
            if (sDebugAssertionsEnabled && m31833.mPosition == -1 && !m31833.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!m31833.shouldIgnore()) {
                m31833.saveOldPosition();
            }
        }
    }

    public void clearOldPositions() {
        int m50474 = this.mChildHelper.m50474();
        for (int i = 0; i < m50474; i++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50477(i));
            if (!m31833.shouldIgnore()) {
                m31833.clearOldPosition();
            }
        }
        C2550 c2550 = this.mRecycler;
        ArrayList arrayList = c2550.f8075;
        ArrayList arrayList2 = c2550.f8077;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC3255) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC3255) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = c2550.f8079;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC3255) c2550.f8079.get(i4)).clearOldPosition();
            }
        }
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int m50474 = this.mChildHelper.m50474();
        int i10 = -1;
        if (i < i2) {
            i3 = -1;
            i5 = i;
            i4 = i2;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (int i11 = 0; i11 < m50474; i11++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50477(i11));
            if (m31833 != null && (i9 = m31833.mPosition) >= i5 && i9 <= i4) {
                if (sVerboseLoggingEnabled) {
                    m31833.toString();
                }
                if (m31833.mPosition == i) {
                    m31833.offsetPosition(i2 - i, false);
                } else {
                    m31833.offsetPosition(i3, false);
                }
                this.mState.f69357 = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f8077;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i10 = 1;
            i6 = i;
            i7 = i2;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC3255 abstractC3255 = (AbstractC3255) arrayList.get(i12);
            if (abstractC3255 != null && (i8 = abstractC3255.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC3255.offsetPosition(i2 - i, false);
                } else {
                    abstractC3255.offsetPosition(i10, false);
                }
                if (sVerboseLoggingEnabled) {
                    abstractC3255.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int m50474 = this.mChildHelper.m50474();
        for (int i3 = 0; i3 < m50474; i3++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50477(i3));
            if (m31833 != null && !m31833.shouldIgnore() && m31833.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    m31833.toString();
                }
                m31833.offsetPosition(i2, false);
                this.mState.f69357 = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f8077;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC3255 abstractC3255 = (AbstractC3255) arrayList.get(i4);
            if (abstractC3255 != null && abstractC3255.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    abstractC3255.toString();
                }
                abstractC3255.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m50474 = this.mChildHelper.m50474();
        for (int i4 = 0; i4 < m50474; i4++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50477(i4));
            if (m31833 != null && !m31833.shouldIgnore()) {
                int i5 = m31833.mPosition;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        m31833.toString();
                    }
                    m31833.offsetPosition(-i2, z);
                    this.mState.f69357 = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        m31833.toString();
                    }
                    m31833.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f69357 = true;
                }
            }
        }
        C2550 c2550 = this.mRecycler;
        ArrayList arrayList = c2550.f8077;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC3255 abstractC3255 = (AbstractC3255) arrayList.get(size);
            if (abstractC3255 != null) {
                int i6 = abstractC3255.mPosition;
                if (i6 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        abstractC3255.toString();
                    }
                    abstractC3255.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC3255.addFlags(8);
                    c2550.m8081(size);
                }
            }
        }
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int m50474 = this.mChildHelper.m50474();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < m50474; i6++) {
            View m50477 = this.mChildHelper.m50477(i6);
            AbstractC3255 m31833 = m31833(m50477);
            if (m31833 != null && !m31833.shouldIgnore() && (i4 = m31833.mPosition) >= i && i4 < i5) {
                m31833.addFlags(2);
                m31833.addChangePayload(obj);
                ((C14543) m50477.getLayoutParams()).f44552 = true;
            }
        }
        C2550 c2550 = this.mRecycler;
        ArrayList arrayList = c2550.f8077;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC3255 abstractC3255 = (AbstractC3255) arrayList.get(size);
            if (abstractC3255 != null && (i3 = abstractC3255.mPosition) >= i && i3 < i5) {
                abstractC3255.addFlags(2);
                c2550.m8081(size);
            }
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC3255 abstractC3255) {
        AbstractC22723 abstractC22723 = this.mItemAnimator;
        return abstractC22723 == null || abstractC22723.mo20591(abstractC3255, abstractC3255.getUnmodifiedPayloads());
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void markKnownViewsInvalid() {
        int m50474 = this.mChildHelper.m50474();
        for (int i = 0; i < m50474; i++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50477(i));
            if (m31833 != null && !m31833.shouldIgnore()) {
                m31833.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C2550 c2550 = this.mRecycler;
        ArrayList arrayList = c2550.f8077;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC3255 abstractC3255 = (AbstractC3255) arrayList.get(i2);
            if (abstractC3255 != null) {
                abstractC3255.addFlags(6);
                abstractC3255.addChangePayload(null);
            }
        }
        AbstractC19902 abstractC19902 = c2550.f8076.mAdapter;
        if (abstractC19902 == null || !abstractC19902.hasStableIds()) {
            c2550.m8082();
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            abstractC17366.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public AbstractC3255 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m31833(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.findContainingItemView(android.view.View):android.view.View");
    }

    public AbstractC3255 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC3255 m31833(View view) {
        if (view == null) {
            return null;
        }
        return ((C14543) view.getLayoutParams()).f44554;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public int getChildAdapterPosition(View view) {
        AbstractC3255 m31833 = m31833(view);
        if (m31833 != null) {
            return m31833.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        AbstractC3255 m31833 = m31833(view);
        if (m31833 != null) {
            return m31833.getLayoutPosition();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        AbstractC3255 m31833;
        AbstractC19902 abstractC19902 = this.mAdapter;
        if (abstractC19902 == null || !abstractC19902.hasStableIds() || (m31833 = m31833(view)) == null) {
            return -1L;
        }
        return m31833.getItemId();
    }

    @Deprecated
    public AbstractC3255 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC3255 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public AbstractC3255 findViewHolderForAdapterPosition(int i) {
        AbstractC3255 abstractC3255 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int m50474 = this.mChildHelper.m50474();
        for (int i2 = 0; i2 < m50474; i2++) {
            AbstractC3255 m31833 = m31833(this.mChildHelper.m50477(i2));
            if (m31833 != null && !m31833.isRemoved() && getAdapterPositionInRecyclerView(m31833) == i) {
                C22514 c22514 = this.mChildHelper;
                if (!c22514.f72858.contains(m31833.itemView)) {
                    return m31833;
                }
                abstractC3255 = m31833;
            }
        }
        return abstractC3255;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.AbstractC3255 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            l.᩹᩶ۧ r0 = r5.mChildHelper
            int r0 = r0.m50474()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3c
            l.᩹᩶ۧ r3 = r5.mChildHelper
            android.view.View r3 = r3.m50477(r2)
            l.ۗ۬ۧ r3 = m31833(r3)
            if (r3 == 0) goto L39
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L39
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L39
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L39
        L2a:
            l.᩹᩶ۧ r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            java.util.ArrayList r1 = r1.f72858
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L38
            r1 = r3
            goto L39
        L38:
            return r3
        L39:
            int r2 = r2 + 1
            goto L8
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13132.findViewHolderForPosition(int, boolean):l.ۗ۬ۧ");
    }

    public AbstractC3255 findViewHolderForItemId(long j) {
        AbstractC19902 abstractC19902 = this.mAdapter;
        AbstractC3255 abstractC3255 = null;
        if (abstractC19902 != null && abstractC19902.hasStableIds()) {
            int m50474 = this.mChildHelper.m50474();
            for (int i = 0; i < m50474; i++) {
                AbstractC3255 m31833 = m31833(this.mChildHelper.m50477(i));
                if (m31833 != null && !m31833.isRemoved() && m31833.getItemId() == j) {
                    C22514 c22514 = this.mChildHelper;
                    if (!c22514.f72858.contains(m31833.itemView)) {
                        return m31833;
                    }
                    abstractC3255 = m31833;
                }
            }
        }
        return abstractC3255;
    }

    public View findChildViewUnder(float f, float f2) {
        int m50469 = this.mChildHelper.m50469();
        while (true) {
            m50469--;
            if (m50469 < 0) {
                return null;
            }
            View m50476 = this.mChildHelper.m50476(m50469);
            float translationX = m50476.getTranslationX();
            float translationY = m50476.getTranslationY();
            if (f >= m50476.getLeft() + translationX && f <= m50476.getRight() + translationX && f2 >= m50476.getTop() + translationY && f2 <= m50476.getBottom() + translationY) {
                return m50476;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetChildrenVertical(int i) {
        int m50469 = this.mChildHelper.m50469();
        for (int i2 = 0; i2 < m50469; i2++) {
            this.mChildHelper.m50476(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetChildrenHorizontal(int i) {
        int m50469 = this.mChildHelper.m50469();
        for (int i2 = 0; i2 < m50469; i2++) {
            this.mChildHelper.m50476(i2).offsetLeftAndRight(i);
        }
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        m31810(view, rect);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31810(View view, Rect rect) {
        C14543 c14543 = (C14543) view.getLayoutParams();
        Rect rect2 = c14543.f44551;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c14543).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c14543).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c14543).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c14543).bottomMargin);
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C14543 c14543 = (C14543) view.getLayoutParams();
        boolean z = c14543.f44552;
        Rect rect = c14543.f44551;
        if (!z || (this.mState.f69359 && (c14543.f44554.isUpdated() || c14543.f44554.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((AbstractC7201) this.mItemDecorations.get(i)).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c14543.f44552 = false;
        return rect;
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC9606 abstractC9606 = this.mScrollListener;
        if (abstractC9606 != null) {
            abstractC9606.onScrolled(this, i, i2);
        }
        List list = this.mScrollListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((AbstractC9606) this.mScrollListeners.get(size)).onScrolled(this, i, i2);
                }
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m31800(int i) {
        double log = Math.log((Math.abs(i) * 0.35f) / (this.mPhysicalCoef * 0.015f));
        float f = DECELERATION_RATE;
        return (float) (Math.exp((f / (f - 1.0d)) * log) * this.mPhysicalCoef * 0.015f);
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC17366 abstractC17366 = this.mLayout;
        if (abstractC17366 != null) {
            abstractC17366.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        AbstractC9606 abstractC9606 = this.mScrollListener;
        if (abstractC9606 != null) {
            abstractC9606.onScrollStateChanged(this, i);
        }
        List list = this.mScrollListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC9606) this.mScrollListeners.get(size)).onScrollStateChanged(this, i);
            }
        }
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m4711();
    }

    public void repositionShadowingViews() {
        AbstractC3255 abstractC3255;
        int m50469 = this.mChildHelper.m50469();
        for (int i = 0; i < m50469; i++) {
            View m50476 = this.mChildHelper.m50476(i);
            AbstractC3255 childViewHolder = getChildViewHolder(m50476);
            if (childViewHolder != null && (abstractC3255 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC3255.itemView;
                int left = m50476.getLeft();
                int top = m50476.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13132 m31804(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof C13132) {
            return (C13132) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C13132 m31804 = m31804(viewGroup.getChildAt(i));
            if (m31804 != null) {
                return m31804;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31835(AbstractC3255 abstractC3255) {
        WeakReference weakReference = abstractC3255.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC3255.itemView) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC3255.mNestedRecyclerView = null;
        }
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public void dispatchChildDetached(View view) {
        AbstractC3255 m31833 = m31833(view);
        onChildDetachedFromWindow(view);
        AbstractC19902 abstractC19902 = this.mAdapter;
        if (abstractC19902 != null && m31833 != null) {
            abstractC19902.onViewDetachedFromWindow(m31833);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC23716) this.mOnChildAttachStateListeners.get(size)).mo5318(view);
            }
        }
    }

    public void dispatchChildAttached(View view) {
        AbstractC3255 m31833 = m31833(view);
        onChildAttachedToWindow(view);
        AbstractC19902 abstractC19902 = this.mAdapter;
        if (abstractC19902 != null && m31833 != null) {
            abstractC19902.onViewAttachedToWindow(m31833);
        }
        List list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((InterfaceC23716) this.mOnChildAttachStateListeners.get(size)).mo5325(view);
            }
        }
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC3255 abstractC3255, int i) {
        if (isComputingLayout()) {
            abstractC3255.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(abstractC3255);
            return false;
        }
        View view = abstractC3255.itemView;
        int i2 = C17648.f53953;
        view.setImportantForAccessibility(i);
        return true;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        int size = this.mPendingAccessibilityImportanceChange.size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC3255 abstractC3255 = (AbstractC3255) this.mPendingAccessibilityImportanceChange.get(size);
                if (abstractC3255.itemView.getParent() == this && !abstractC3255.shouldIgnore() && (i = abstractC3255.mPendingAccessibilityState) != -1) {
                    View view = abstractC3255.itemView;
                    int i2 = C17648.f53953;
                    view.setImportantForAccessibility(i);
                    abstractC3255.mPendingAccessibilityState = -1;
                }
            } else {
                this.mPendingAccessibilityImportanceChange.clear();
                return;
            }
        }
    }

    public int getAdapterPositionInRecyclerView(AbstractC3255 abstractC3255) {
        if (abstractC3255.hasAnyOfTheFlags(524) || !abstractC3255.isBound()) {
            return -1;
        }
        C1347 c1347 = this.mAdapterHelper;
        int i = abstractC3255.mPosition;
        ArrayList arrayList = c1347.f4897;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5581 c5581 = (C5581) arrayList.get(i2);
            int i3 = c5581.f17282;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c5581.f17285;
                    if (i4 <= i) {
                        int i5 = c5581.f17283;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c5581.f17285;
                    if (i6 == i) {
                        i = c5581.f17283;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c5581.f17283 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c5581.f17285 <= i) {
                i += c5581.f17283;
            }
        }
        return i;
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
        Resources resources = getContext().getResources();
        new C3715(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700b7), resources.getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700b9), resources.getDimensionPixelOffset(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700b8));
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        m31850().m32745(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return m31850().m32746();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m31850().m32750(i, 0);
    }

    public boolean startNestedScroll(int i, int i2) {
        return m31850().m32750(i, i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m31850().m32754(0);
    }

    public void stopNestedScroll(int i) {
        m31850().m32754(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m31850().m32749(0);
    }

    public boolean hasNestedScrollingParent(int i) {
        return m31850().m32749(i);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m31850().m32751(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m31850().m32752(i, i2, i3, i4, iArr, i5);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m31850().m32744(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m31850().m32753(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return m31850().m32753(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m31850().m32748(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return m31850().m32747(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C13622 m31850() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C13622(this);
        }
        return this.mScrollingChildHelper;
    }
}
