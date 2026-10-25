package l;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: B66A */
/* renamed from: l.֫ۗۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1556 extends AbstractC7201 implements InterfaceC23716 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13132 f5475;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f5481;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C0923 f5483;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f5484;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C5831 f5485;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f5486;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public VelocityTracker f5488;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Rect f5489;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f5490;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f5491;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f5492;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC10065 f5493;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f5494;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f5495;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f5498;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f5499;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f5500;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f5501;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f5502;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5496 = new ArrayList();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float[] f5479 = new float[2];

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC3255 f5476 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f5487 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5477 = 0;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f5497 = new ArrayList();

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Runnable f5482 = new RunnableC22059(this);

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public View f5480 = null;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20895 f5478 = new C19943(this);

    @Override // l.InterfaceC23716
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo5325(View view) {
    }

    public C1556(AbstractC10065 abstractC10065) {
        this.f5493 = abstractC10065;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5314(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5322(C13132 c13132) {
        C13132 c131322 = this.f5475;
        if (c131322 == c13132) {
            return;
        }
        InterfaceC20895 interfaceC20895 = this.f5478;
        if (c131322 != null) {
            c131322.removeItemDecoration(this);
            this.f5475.removeOnItemTouchListener(interfaceC20895);
            this.f5475.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.f5497;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C22764 c22764 = (C22764) arrayList.get(0);
                c22764.f73499.cancel();
                this.f5493.mo25263(this.f5475, c22764.f73498);
            }
            arrayList.clear();
            this.f5480 = null;
            VelocityTracker velocityTracker = this.f5488;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f5488 = null;
            }
            C5831 c5831 = this.f5485;
            if (c5831 != null) {
                c5831.m16339();
                this.f5485 = null;
            }
            if (this.f5483 != null) {
                this.f5483 = null;
            }
        }
        this.f5475 = c13132;
        if (c13132 != null) {
            Resources resources = c13132.getResources();
            this.f5481 = resources.getDimension(R.dimen.MT_Protector_res_0x7f0700d3);
            this.f5492 = resources.getDimension(R.dimen.MT_Protector_res_0x7f0700d2);
            this.f5501 = ViewConfiguration.get(this.f5475.getContext()).getScaledTouchSlop();
            this.f5475.addItemDecoration(this);
            this.f5475.addOnItemTouchListener(interfaceC20895);
            this.f5475.addOnChildAttachStateChangeListener(this);
            this.f5485 = new C5831(this);
            this.f5483 = new C0923(this.f5475.getContext(), this.f5485);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5313(float[] fArr) {
        if ((this.f5484 & 12) != 0) {
            fArr[0] = (this.f5491 + this.f5490) - this.f5476.itemView.getLeft();
        } else {
            fArr[0] = this.f5476.itemView.getTranslationX();
        }
        if ((this.f5484 & 3) != 0) {
            fArr[1] = (this.f5500 + this.f5502) - this.f5476.itemView.getTop();
        } else {
            fArr[1] = this.f5476.itemView.getTranslationY();
        }
    }

    @Override // l.AbstractC7201
    public final void onDrawOver(Canvas canvas, C13132 c13132, C21600 c21600) {
        boolean z = false;
        if (this.f5476 != null) {
            float[] fArr = this.f5479;
            m5313(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        AbstractC3255 abstractC3255 = this.f5476;
        this.f5493.getClass();
        ArrayList arrayList = this.f5497;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C22764 c22764 = (C22764) arrayList.get(i);
            int save = canvas.save();
            View view = c22764.f73498.itemView;
            canvas.restoreToCount(save);
        }
        if (abstractC3255 != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C22764 c227642 = (C22764) arrayList.get(i2);
            boolean z2 = c227642.f73500;
            if (z2 && !c227642.f73505) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            c13132.invalidate();
        }
    }

    @Override // l.AbstractC7201
    public final void onDraw(Canvas canvas, C13132 c13132, C21600 c21600) {
        float f;
        float f2;
        if (this.f5476 != null) {
            float[] fArr = this.f5479;
            m5313(fArr);
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AbstractC3255 abstractC3255 = this.f5476;
        int i = this.f5477;
        AbstractC10065 abstractC10065 = this.f5493;
        abstractC10065.getClass();
        ArrayList arrayList = this.f5497;
        int i2 = 0;
        for (int size = arrayList.size(); i2 < size; size = size) {
            C22764 c22764 = (C22764) arrayList.get(i2);
            c22764.m50838();
            int save = canvas.save();
            abstractC10065.mo25262(canvas, c13132, c22764.f73498, c22764.f73502, c22764.f73496, c22764.f73495, false);
            canvas.restoreToCount(save);
            i2++;
        }
        if (abstractC3255 != null) {
            int save2 = canvas.save();
            abstractC10065.mo25262(canvas, c13132, abstractC3255, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0091, code lost:
    
        if (r2 > 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5320(l.AbstractC3255 r19, int r20) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1556.m5320(l.ۗ۬ۧ, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5323() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1556.m5323():boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5319(AbstractC3255 abstractC3255) {
        ArrayList arrayList;
        int i;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        AbstractC17366 abstractC17366;
        int i2;
        int i3;
        if (!this.f5475.isLayoutRequested() && this.f5477 == 2) {
            AbstractC10065 abstractC10065 = this.f5493;
            abstractC10065.getClass();
            int i4 = (int) (this.f5491 + this.f5490);
            int i5 = (int) (this.f5500 + this.f5502);
            if (Math.abs(i5 - abstractC3255.itemView.getTop()) >= abstractC3255.itemView.getHeight() * 0.5f || Math.abs(i4 - abstractC3255.itemView.getLeft()) >= abstractC3255.itemView.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.f5498;
                if (arrayList2 == null) {
                    this.f5498 = new ArrayList();
                    this.f5495 = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.f5495.clear();
                }
                int round = Math.round(this.f5491 + this.f5490);
                int round2 = Math.round(this.f5500 + this.f5502);
                int width = abstractC3255.itemView.getWidth() + round;
                int height = abstractC3255.itemView.getHeight() + round2;
                int i6 = (round + width) / 2;
                int i7 = (round2 + height) / 2;
                AbstractC17366 layoutManager = this.f5475.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i8 = 0;
                while (i8 < childCount) {
                    View childAt = layoutManager.getChildAt(i8);
                    if (childAt != abstractC3255.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                        AbstractC3255 childViewHolder = this.f5475.getChildViewHolder(childAt);
                        if (abstractC10065.mo22801(childViewHolder)) {
                            int abs5 = Math.abs(i6 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int abs6 = Math.abs(i7 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i9 = (abs6 * abs6) + (abs5 * abs5);
                            abstractC17366 = layoutManager;
                            int size = this.f5498.size();
                            i2 = round;
                            i3 = round2;
                            int i10 = 0;
                            int i11 = 0;
                            while (i10 < size) {
                                int i12 = size;
                                if (i9 <= ((Integer) this.f5495.get(i10)).intValue()) {
                                    break;
                                }
                                i11++;
                                i10++;
                                size = i12;
                            }
                            this.f5498.add(i11, childViewHolder);
                            this.f5495.add(i11, Integer.valueOf(i9));
                            i8++;
                            layoutManager = abstractC17366;
                            round2 = i3;
                            round = i2;
                        }
                    }
                    abstractC17366 = layoutManager;
                    i2 = round;
                    i3 = round2;
                    i8++;
                    layoutManager = abstractC17366;
                    round2 = i3;
                    round = i2;
                }
                ArrayList arrayList3 = this.f5498;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = abstractC3255.itemView.getWidth() + i4;
                int height2 = abstractC3255.itemView.getHeight() + i5;
                int left2 = i4 - abstractC3255.itemView.getLeft();
                int top2 = i5 - abstractC3255.itemView.getTop();
                int size2 = arrayList3.size();
                AbstractC3255 abstractC32552 = null;
                int i13 = -1;
                int i14 = 0;
                while (i14 < size2) {
                    AbstractC3255 abstractC32553 = (AbstractC3255) arrayList3.get(i14);
                    if (left2 <= 0 || (right = abstractC32553.itemView.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                        i = width2;
                    } else {
                        arrayList = arrayList3;
                        i = width2;
                        if (abstractC32553.itemView.getRight() > abstractC3255.itemView.getRight() && (abs4 = Math.abs(right)) > i13) {
                            i13 = abs4;
                            abstractC32552 = abstractC32553;
                        }
                    }
                    if (left2 < 0 && (left = abstractC32553.itemView.getLeft() - i4) > 0 && abstractC32553.itemView.getLeft() < abstractC3255.itemView.getLeft() && (abs3 = Math.abs(left)) > i13) {
                        i13 = abs3;
                        abstractC32552 = abstractC32553;
                    }
                    if (top2 < 0 && (top = abstractC32553.itemView.getTop() - i5) > 0 && abstractC32553.itemView.getTop() < abstractC3255.itemView.getTop() && (abs2 = Math.abs(top)) > i13) {
                        i13 = abs2;
                        abstractC32552 = abstractC32553;
                    }
                    if (top2 > 0 && (bottom = abstractC32553.itemView.getBottom() - height2) < 0 && abstractC32553.itemView.getBottom() > abstractC3255.itemView.getBottom() && (abs = Math.abs(bottom)) > i13) {
                        i13 = abs;
                        abstractC32552 = abstractC32553;
                    }
                    i14++;
                    arrayList3 = arrayList;
                    width2 = i;
                }
                if (abstractC32552 == null) {
                    this.f5498.clear();
                    this.f5495.clear();
                    return;
                }
                int absoluteAdapterPosition = abstractC32552.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = abstractC3255.getAbsoluteAdapterPosition();
                if (abstractC10065.mo3223(this.f5475, abstractC3255, abstractC32552)) {
                    this.f5493.mo25264(this.f5475, abstractC3255, absoluteAdapterPosition2, abstractC32552, absoluteAdapterPosition, i4, i5);
                }
            }
        }
    }

    @Override // l.InterfaceC23716
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5318(View view) {
        m5328(view);
        AbstractC3255 childViewHolder = this.f5475.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        AbstractC3255 abstractC3255 = this.f5476;
        if (abstractC3255 != null && childViewHolder == abstractC3255) {
            m5320((AbstractC3255) null, 0);
            return;
        }
        m5321(childViewHolder, false);
        if (this.f5496.remove(childViewHolder.itemView)) {
            this.f5493.mo25263(this.f5475, childViewHolder);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5321(AbstractC3255 abstractC3255, boolean z) {
        C22764 c22764;
        ArrayList arrayList = this.f5497;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                c22764 = (C22764) arrayList.get(size);
            }
        } while (c22764.f73498 != abstractC3255);
        c22764.f73504 |= z;
        if (!c22764.f73500) {
            c22764.f73499.cancel();
        }
        arrayList.remove(size);
    }

    @Override // l.AbstractC7201
    public final void getItemOffsets(Rect rect, View view, C13132 c13132, C21600 c21600) {
        rect.setEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5317(int i, int i2, MotionEvent motionEvent) {
        View m5327;
        if (this.f5476 == null && i == 2 && this.f5477 != 2) {
            AbstractC10065 abstractC10065 = this.f5493;
            if (abstractC10065.mo3225() && this.f5475.getScrollState() != 1) {
                AbstractC17366 layoutManager = this.f5475.getLayoutManager();
                int i3 = this.f5487;
                AbstractC3255 abstractC3255 = null;
                if (i3 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(findPointerIndex) - this.f5499;
                    float y = motionEvent.getY(findPointerIndex) - this.f5486;
                    float abs = Math.abs(x);
                    float abs2 = Math.abs(y);
                    float f = this.f5501;
                    if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (m5327 = m5327(motionEvent)) != null))) {
                        abstractC3255 = this.f5475.getChildViewHolder(m5327);
                    }
                }
                if (abstractC3255 == null) {
                    return;
                }
                C13132 c13132 = this.f5475;
                int mo3224 = abstractC10065.mo3224(abstractC3255);
                int i4 = C17648.f53953;
                int m25257 = (AbstractC10065.m25257(mo3224, c13132.getLayoutDirection()) & 65280) >> 8;
                if (m25257 == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.f5499;
                float f3 = y2 - this.f5486;
                float abs3 = Math.abs(f2);
                float abs4 = Math.abs(f3);
                float f4 = this.f5501;
                if (abs3 >= f4 || abs4 >= f4) {
                    if (abs3 > abs4) {
                        if (f2 < 0.0f && (m25257 & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (m25257 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (m25257 & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (m25257 & 2) == 0) {
                            return;
                        }
                    }
                    this.f5502 = 0.0f;
                    this.f5490 = 0.0f;
                    this.f5487 = motionEvent.getPointerId(0);
                    m5320(abstractC3255, 1);
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View m5327(MotionEvent motionEvent) {
        C22764 c22764;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AbstractC3255 abstractC3255 = this.f5476;
        if (abstractC3255 != null) {
            View view2 = abstractC3255.itemView;
            if (m5314(view2, x, y, this.f5491 + this.f5490, this.f5500 + this.f5502)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f5497;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                c22764 = (C22764) arrayList.get(size);
                view = c22764.f73498.itemView;
            } else {
                return this.f5475.findChildViewUnder(x, y);
            }
        } while (!m5314(view, x, y, c22764.f73502, c22764.f73496));
        return view;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5326(AbstractC3255 abstractC3255) {
        C13132 c13132 = this.f5475;
        int mo3224 = this.f5493.mo3224(abstractC3255);
        int i = C17648.f53953;
        if ((AbstractC10065.m25257(mo3224, c13132.getLayoutDirection()) & 16711680) == 0 || abstractC3255.itemView.getParent() != this.f5475) {
            return;
        }
        VelocityTracker velocityTracker = this.f5488;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f5488 = VelocityTracker.obtain();
        this.f5502 = 0.0f;
        this.f5490 = 0.0f;
        m5320(abstractC3255, 2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5324(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f5499;
        this.f5490 = f;
        this.f5502 = y - this.f5486;
        if ((i & 4) == 0) {
            this.f5490 = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f5490 = Math.min(0.0f, this.f5490);
        }
        if ((i & 1) == 0) {
            this.f5502 = Math.max(0.0f, this.f5502);
        }
        if ((i & 2) == 0) {
            this.f5502 = Math.min(0.0f, this.f5502);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m5315(AbstractC3255 abstractC3255, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f5490 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f5488;
        AbstractC10065 abstractC10065 = this.f5493;
        if (velocityTracker != null && this.f5487 > -1) {
            float f = this.f5492;
            abstractC10065.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f5488.getXVelocity(this.f5487);
            float yVelocity = this.f5488.getYVelocity(this.f5487);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f5481 && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float mo25260 = abstractC10065.mo25260() * this.f5475.getWidth();
        if ((i & i2) == 0 || Math.abs(this.f5490) <= mo25260) {
            return 0;
        }
        return i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m5316(AbstractC3255 abstractC3255, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f5502 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f5488;
        AbstractC10065 abstractC10065 = this.f5493;
        if (velocityTracker != null && this.f5487 > -1) {
            float f = this.f5492;
            abstractC10065.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.f5488.getXVelocity(this.f5487);
            float yVelocity = this.f5488.getYVelocity(this.f5487);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f5481 && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float mo25260 = abstractC10065.mo25260() * this.f5475.getHeight();
        if ((i & i2) == 0 || Math.abs(this.f5502) <= mo25260) {
            return 0;
        }
        return i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5328(View view) {
        if (view == this.f5480) {
            this.f5480 = null;
        }
    }
}
