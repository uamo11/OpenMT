package l;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: Y6A7 */
/* renamed from: l.ۙ۬ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC4666 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public OverScroller f14836;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14837;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f14838;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f14839;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14840;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f14841;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Interpolator f14842;

    public RunnableC4666(C13132 c13132) {
        this.f14838 = c13132;
        Interpolator interpolator = C13132.sQuinticInterpolator;
        this.f14842 = interpolator;
        this.f14841 = false;
        this.f14839 = false;
        this.f14836 = new OverScroller(c13132.getContext(), interpolator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        C13132 c13132 = this.f14838;
        if (c13132.mLayout != null) {
            this.f14839 = false;
            this.f14841 = true;
            c13132.consumePendingUpdateOperations();
            OverScroller overScroller = this.f14836;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.f14840;
                int i6 = currY - this.f14837;
                this.f14840 = currX;
                this.f14837 = currY;
                int consumeFlingInHorizontalStretch = c13132.consumeFlingInHorizontalStretch(i5);
                int consumeFlingInVerticalStretch = c13132.consumeFlingInVerticalStretch(i6);
                int[] iArr = c13132.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (c13132.dispatchNestedPreScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = c13132.mReusableIntPair;
                    consumeFlingInHorizontalStretch -= iArr2[0];
                    consumeFlingInVerticalStretch -= iArr2[1];
                }
                if (c13132.getOverScrollMode() != 2) {
                    c13132.considerReleasingGlowsOnScroll(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch);
                }
                if (c13132.mAdapter != null) {
                    int[] iArr3 = c13132.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    c13132.scrollStep(consumeFlingInHorizontalStretch, consumeFlingInVerticalStretch, iArr3);
                    int[] iArr4 = c13132.mReusableIntPair;
                    int i7 = iArr4[0];
                    int i8 = iArr4[1];
                    int i9 = consumeFlingInHorizontalStretch - i7;
                    int i10 = consumeFlingInVerticalStretch - i8;
                    AbstractC15248 abstractC15248 = c13132.mLayout.mSmoothScroller;
                    if (abstractC15248 != null && !abstractC15248.isPendingInitialRun() && abstractC15248.isRunning()) {
                        int m48777 = c13132.mState.m48777();
                        if (m48777 == 0) {
                            abstractC15248.stop();
                        } else if (abstractC15248.getTargetPosition() >= m48777) {
                            abstractC15248.setTargetPosition(m48777 - 1);
                            abstractC15248.onAnimation(i7, i8);
                        } else {
                            abstractC15248.onAnimation(i7, i8);
                        }
                    }
                    i3 = i8;
                    i4 = i7;
                    i = i9;
                    i2 = i10;
                } else {
                    i = consumeFlingInHorizontalStretch;
                    i2 = consumeFlingInVerticalStretch;
                    i3 = 0;
                    i4 = 0;
                }
                if (!c13132.mItemDecorations.isEmpty()) {
                    c13132.invalidate();
                }
                int[] iArr5 = c13132.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                c13132.dispatchNestedScroll(i4, i3, i, i2, null, 1, iArr5);
                int[] iArr6 = c13132.mReusableIntPair;
                int i11 = i - iArr6[0];
                int i12 = i2 - iArr6[1];
                if (i4 != 0 || i3 != 0) {
                    c13132.dispatchOnScrolled(i4, i3);
                }
                awakenScrollBars = c13132.awakenScrollBars();
                if (!awakenScrollBars) {
                    c13132.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                AbstractC15248 abstractC152482 = c13132.mLayout.mSmoothScroller;
                if ((abstractC152482 == null || !abstractC152482.isPendingInitialRun()) && z) {
                    if (c13132.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        c13132.absorbGlows(i13, currVelocity);
                    }
                    if (C13132.ALLOW_THREAD_GAP_WORK) {
                        C19238 c19238 = c13132.mPrefetchRegistry;
                        int[] iArr7 = c19238.f60552;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        c19238.f60551 = 0;
                    }
                } else {
                    m13721();
                    RunnableC5126 runnableC5126 = c13132.mGapWorker;
                    if (runnableC5126 != null) {
                        runnableC5126.m14677(c13132, i4, i3);
                    }
                }
            }
            AbstractC15248 abstractC152483 = c13132.mLayout.mSmoothScroller;
            if (abstractC152483 != null && abstractC152483.isPendingInitialRun()) {
                abstractC152483.onAnimation(0, 0);
            }
            this.f14841 = false;
            if (!this.f14839) {
                c13132.setScrollState(0);
                c13132.stopNestedScroll(1);
                return;
            } else {
                c13132.removeCallbacks(this);
                int i14 = C17648.f53953;
                c13132.postOnAnimation(this);
                return;
            }
        }
        c13132.removeCallbacks(this);
        this.f14836.abortAnimation();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13721() {
        if (this.f14841) {
            this.f14839 = true;
            return;
        }
        C13132 c13132 = this.f14838;
        c13132.removeCallbacks(this);
        int i = C17648.f53953;
        c13132.postOnAnimation(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13722(int i, int i2) {
        C13132 c13132 = this.f14838;
        c13132.setScrollState(2);
        this.f14837 = 0;
        this.f14840 = 0;
        Interpolator interpolator = this.f14842;
        Interpolator interpolator2 = C13132.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f14842 = interpolator2;
            this.f14836 = new OverScroller(c13132.getContext(), interpolator2);
        }
        this.f14836.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m13721();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13723(int i, int i2, Interpolator interpolator, int i3) {
        C13132 c13132 = this.f14838;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? c13132.getWidth() : c13132.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = C13132.sQuinticInterpolator;
        }
        if (this.f14842 != interpolator) {
            this.f14842 = interpolator;
            this.f14836 = new OverScroller(c13132.getContext(), interpolator);
        }
        this.f14837 = 0;
        this.f14840 = 0;
        c13132.setScrollState(2);
        this.f14836.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.f14836.computeScrollOffset();
        }
        m13721();
    }
}
