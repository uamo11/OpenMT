package l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* compiled from: 651C */
/* renamed from: l.ܺۧ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15886 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Interpolator f49073 = new InterpolatorC20827();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f49074;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public OverScroller f49075;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float[] f49077;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f49078;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f49079;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f49080;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float[] f49082;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float[] f49083;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8832 f49084;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f49085;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f49086;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float[] f49087;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public View f49088;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49089;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f49090;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f49091;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ViewGroup f49092;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f49093;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49094;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public VelocityTracker f49095;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f49096;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f49076 = -1;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Runnable f49081 = new RunnableC9538(this);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15886 m37623(ViewGroup viewGroup, AbstractC8832 abstractC8832) {
        return new C15886(viewGroup.getContext(), viewGroup, abstractC8832);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15886 m37622(ViewGroup viewGroup, float f, AbstractC8832 abstractC8832) {
        C15886 m37623 = m37623(viewGroup, abstractC8832);
        m37623.f49086 = (int) ((1.0f / f) * m37623.f49086);
        return m37623;
    }

    public C15886(Context context, ViewGroup viewGroup, AbstractC8832 abstractC8832) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC8832 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f49092 = viewGroup;
        this.f49084 = abstractC8832;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f49090 = i;
        this.f49080 = i;
        this.f49086 = viewConfiguration.getScaledTouchSlop();
        this.f49078 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f49091 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f49075 = new OverScroller(context, f49073);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37635(float f) {
        this.f49091 = f;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m37651() {
        return this.f49089;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37647(int i) {
        this.f49094 = i;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m37652() {
        return this.f49080;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37642(int i) {
        this.f49080 = i;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m37646() {
        return this.f49090;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37637(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f49092;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f49088 = view;
        this.f49076 = i;
        this.f49084.onViewCaptured(view, i);
        m37636(1);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View m37649() {
        return this.f49088;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m37640() {
        return this.f49086;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37641() {
        this.f49076 = -1;
        float[] fArr = this.f49083;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f49082, 0.0f);
            Arrays.fill(this.f49087, 0.0f);
            Arrays.fill(this.f49077, 0.0f);
            Arrays.fill(this.f49093, 0);
            Arrays.fill(this.f49085, 0);
            Arrays.fill(this.f49096, 0);
            this.f49074 = 0;
        }
        VelocityTracker velocityTracker = this.f49095;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f49095 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37634() {
        m37641();
        if (this.f49089 == 2) {
            OverScroller overScroller = this.f49075;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f49084.onViewPositionChanged(this.f49088, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m37636(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37639(View view, int i, int i2) {
        this.f49088 = view;
        this.f49076 = -1;
        boolean m37627 = m37627(i, i2, 0, 0);
        if (!m37627 && this.f49089 == 0 && this.f49088 != null) {
            this.f49088 = null;
        }
        return m37627;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37643(int i, int i2) {
        if (!this.f49079) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return m37627(i, i2, (int) this.f49095.getXVelocity(this.f49076), (int) this.f49095.getYVelocity(this.f49076));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37627(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.f49088.getLeft();
        int top = this.f49088.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f49075;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m37636(0);
            return false;
        }
        View view = this.f49088;
        int i7 = (int) this.f49091;
        int i8 = (int) this.f49078;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.f49091;
        int abs2 = Math.abs(i4);
        if (abs2 < i9) {
            i4 = 0;
        } else if (abs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i10 = abs5 + abs6;
        int i11 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i10;
        } else {
            f = abs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i10;
        } else {
            f3 = abs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        AbstractC8832 abstractC8832 = this.f49084;
        overScroller.startScroll(left, top, i5, i6, (int) ((m37621(i6, i4, abstractC8832.getViewVerticalDragRange(view)) * f6) + (m37621(i5, i3, abstractC8832.getViewHorizontalDragRange(view)) * f5)));
        m37636(2);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m37621(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        float width = this.f49092.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m37650() {
        if (this.f49089 == 2) {
            OverScroller overScroller = this.f49075;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f49088.getLeft();
            int top = currY - this.f49088.getTop();
            if (left != 0) {
                C17648.m41325(left, this.f49088);
            }
            if (top != 0) {
                C17648.m41332(top, this.f49088);
            }
            if (left != 0 || top != 0) {
                this.f49084.onViewPositionChanged(this.f49088, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f49092.post(this.f49081);
            }
        }
        return this.f49089 == 2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m37632(int i) {
        float[] fArr = this.f49083;
        if (fArr != null) {
            int i2 = this.f49074;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f49082[i] = 0.0f;
                this.f49087[i] = 0.0f;
                this.f49077[i] = 0.0f;
                this.f49093[i] = 0;
                this.f49085[i] = 0;
                this.f49096[i] = 0;
                this.f49074 = (~i3) & i2;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37629(float f, float f2, int i) {
        float[] fArr = this.f49083;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f49082;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f49087;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f49077;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f49093;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f49085;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f49096;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f49083 = fArr2;
            this.f49082 = fArr3;
            this.f49087 = fArr4;
            this.f49077 = fArr5;
            this.f49093 = iArr;
            this.f49085 = iArr2;
            this.f49096 = iArr3;
        }
        float[] fArr9 = this.f49083;
        this.f49087[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.f49082;
        this.f49077[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.f49093;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.f49092;
        int i5 = i3 < viewGroup.getLeft() + this.f49080 ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.f49080) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.f49080) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.f49080) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.f49074 |= 1 << i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m37631(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f49074 & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f49087[pointerId] = x;
                this.f49077[pointerId] = y;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37636(int i) {
        this.f49092.removeCallbacks(this.f49081);
        if (this.f49089 != i) {
            this.f49089 = i;
            this.f49084.onViewDragStateChanged(i);
            if (this.f49089 == 0) {
                this.f49088 = null;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37644(int i, View view) {
        if (view == this.f49088 && this.f49076 == i) {
            return true;
        }
        if (view == null || !this.f49084.tryCaptureView(view, i)) {
            return false;
        }
        this.f49076 = i;
        m37637(i, view);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r12 != r11) goto L53;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m37645(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15886.m37645(android.view.MotionEvent):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37638(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m37641();
        }
        if (this.f49095 == null) {
            this.f49095 = VelocityTracker.obtain();
        }
        this.f49095.addMovement(motionEvent);
        AbstractC8832 abstractC8832 = this.f49084;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m37633 = m37633((int) x, (int) y);
            m37629(x, y, pointerId);
            m37644(pointerId, m37633);
            int i2 = this.f49093[pointerId] & this.f49094;
            if (i2 != 0) {
                abstractC8832.onEdgeTouched(i2, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f49089 == 1) {
                m37628();
            }
            m37641();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f49089 == 1) {
                    this.f49079 = true;
                    abstractC8832.onViewReleased(this.f49088, 0.0f, 0.0f);
                    this.f49079 = false;
                    if (this.f49089 == 1) {
                        m37636(0);
                    }
                }
                m37641();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m37629(x2, y2, pointerId2);
                if (this.f49089 != 0) {
                    if (m37630(this.f49088, (int) x2, (int) y2)) {
                        m37644(pointerId2, this.f49088);
                        return;
                    }
                    return;
                } else {
                    m37644(pointerId2, m37633((int) x2, (int) y2));
                    int i3 = this.f49093[pointerId2] & this.f49094;
                    if (i3 != 0) {
                        abstractC8832.onEdgeTouched(i3, pointerId2);
                        return;
                    }
                    return;
                }
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f49089 == 1 && pointerId3 == this.f49076) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (r5 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(r5);
                    if (pointerId4 != this.f49076) {
                        View m376332 = m37633((int) motionEvent.getX(r5), (int) motionEvent.getY(r5));
                        View view = this.f49088;
                        if (m376332 == view && m37644(pointerId4, view)) {
                            i = this.f49076;
                            break;
                        }
                    }
                    r5++;
                }
                if (i == -1) {
                    m37628();
                }
            }
            m37632(pointerId3);
            return;
        }
        if (this.f49089 == 1) {
            int i4 = this.f49076;
            if (((this.f49074 & (1 << i4)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int findPointerIndex = motionEvent.findPointerIndex(i4);
            float x3 = motionEvent.getX(findPointerIndex);
            float y3 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f49087;
            int i5 = this.f49076;
            int i6 = (int) (x3 - fArr[i5]);
            int i7 = (int) (y3 - this.f49077[i5]);
            int left = this.f49088.getLeft() + i6;
            int top = this.f49088.getTop() + i7;
            int left2 = this.f49088.getLeft();
            int top2 = this.f49088.getTop();
            if (i6 != 0) {
                left = abstractC8832.clampViewPositionHorizontal(this.f49088, left, i6);
                C17648.m41325(left - left2, this.f49088);
            }
            int i8 = left;
            if (i7 != 0) {
                top = abstractC8832.clampViewPositionVertical(this.f49088, top, i7);
                C17648.m41332(top - top2, this.f49088);
            }
            int i9 = top;
            if (i6 != 0 || i7 != 0) {
                this.f49084.onViewPositionChanged(this.f49088, i8, i9, i8 - left2, i9 - top2);
            }
            m37631(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount2; i10++) {
            int pointerId5 = motionEvent.getPointerId(i10);
            if ((this.f49074 & (1 << pointerId5)) != 0) {
                float x4 = motionEvent.getX(i10);
                float y4 = motionEvent.getY(i10);
                float f = x4 - this.f49083[pointerId5];
                float f2 = y4 - this.f49082[pointerId5];
                m37624(f, f2, pointerId5);
                if (this.f49089 == 1) {
                    break;
                }
                View m376333 = m37633((int) x4, (int) y4);
                if (m37626(f, f2, m376333) && m37644(pointerId5, m376333)) {
                    break;
                }
            }
        }
        m37631(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.ۡۧ֫] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37624(float f, float f2, int i) {
        boolean m37625 = m37625(f, f2, i, 1);
        boolean z = m37625;
        if (m37625(f2, f, i, 4)) {
            z = (m37625 ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (m37625(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (m37625(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.f49085;
            iArr[i] = iArr[i] | r0;
            this.f49084.onEdgeDragStarted(r0, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37625(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f49093[i] & i2) == i2 && (this.f49094 & i2) != 0 && (this.f49096[i] & i2) != i2 && (this.f49085[i] & i2) != i2) {
            float f3 = this.f49086;
            if (abs > f3 || abs2 > f3) {
                if (abs < abs2 * 0.5f && this.f49084.onEdgeLock(i2)) {
                    int[] iArr = this.f49096;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.f49085[i] & i2) == 0 && abs > this.f49086) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37626(float f, float f2, View view) {
        if (view == null) {
            return false;
        }
        AbstractC8832 abstractC8832 = this.f49084;
        boolean z = abstractC8832.getViewHorizontalDragRange(view) > 0;
        boolean z2 = abstractC8832.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f49086) : z2 && Math.abs(f2) > ((float) this.f49086);
        }
        float f3 = (f2 * f2) + (f * f);
        int i = this.f49086;
        return f3 > ((float) (i * i));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m37648() {
        int length = this.f49083.length;
        for (int i = 0; i < length; i++) {
            if ((this.f49074 & (1 << i)) != 0) {
                float f = this.f49087[i] - this.f49083[i];
                float f2 = this.f49077[i] - this.f49082[i];
                float f3 = (f2 * f2) + (f * f);
                int i2 = this.f49086;
                if (f3 > i2 * i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m37628() {
        VelocityTracker velocityTracker = this.f49095;
        float f = this.f49078;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f49095.getXVelocity(this.f49076);
        float f2 = this.f49091;
        float abs = Math.abs(xVelocity);
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.f49095.getYVelocity(this.f49076);
        float f3 = this.f49091;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            f = 0.0f;
        } else if (abs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.f49079 = true;
        this.f49084.onViewReleased(this.f49088, xVelocity, f);
        this.f49079 = false;
        if (this.f49089 == 1) {
            m37636(0);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m37630(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m37633(int i, int i2) {
        ViewGroup viewGroup = this.f49092;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(this.f49084.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }
}
