package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: Z1JV */
/* renamed from: l.ᩳ᩸, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18312 implements InterfaceC13683 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17606 f56930;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17606 f56931;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56932;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f56933;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56934;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f56935;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f56936;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f56937;

    public C18312(C17606 c17606, C17606 c176062) {
        this.f56931 = c17606;
        this.f56930 = c176062;
    }

    @Override // l.InterfaceC13683
    /* renamed from: ֫ */
    public final void mo32930(C15094 c15094, C22856 c22856) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int i;
        int measuredHeight;
        int baseline;
        int i2;
        int i3;
        int i4;
        if (c15094 == null) {
            return;
        }
        C5218 c5218 = c15094.f46159;
        C5218 c52182 = c15094.f46141;
        if (c15094.m35735() != 8 || c15094.m35726()) {
            if (c15094.f46132 == null) {
                return;
            }
            EnumC8040 enumC8040 = c22856.f73745;
            EnumC8040 enumC80402 = c22856.f73753;
            int i5 = c22856.f73748;
            int i6 = c22856.f73747;
            int i7 = this.f56933 + this.f56936;
            int i8 = this.f56937;
            View view = (View) c15094.m35760();
            int[] iArr = C2084.f6954;
            int i9 = iArr[enumC8040.ordinal()];
            if (i9 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i9 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f56934, i8, -2);
            } else if (i9 == 3) {
                int i10 = this.f56934;
                int i11 = c52182 != null ? c52182.f16343 : 0;
                if (c5218 != null) {
                    i11 += c5218.f16343;
                }
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i8 + i11, -1);
            } else if (i9 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f56934, i8, -2);
                boolean z = c15094.f46145 == 1;
                int i12 = c22856.f73750;
                if (i12 == 1 || i12 == 2) {
                    boolean z2 = view.getMeasuredHeight() == c15094.m35732();
                    if (c22856.f73750 == 2 || !z || ((z && z2) || (view instanceof C8434) || c15094.mo7762())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c15094.m35753(), 1073741824);
                    }
                }
            }
            int i13 = iArr[enumC80402.ordinal()];
            if (i13 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else if (i13 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f56932, i7, -2);
            } else if (i13 == 3) {
                int i14 = this.f56932;
                int i15 = c52182 != null ? c15094.f46161.f16343 : 0;
                if (c5218 != null) {
                    i15 += c15094.f46133.f16343;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i7 + i15, -1);
            } else if (i13 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f56932, i7, -2);
                boolean z3 = c15094.f46170 == 1;
                int i16 = c22856.f73750;
                if (i16 == 1 || i16 == 2) {
                    boolean z4 = view.getMeasuredWidth() == c15094.m35753();
                    if (c22856.f73750 == 2 || !z3 || ((z3 && z4) || (view instanceof C8434) || c15094.mo7768())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c15094.m35732(), 1073741824);
                    }
                }
            }
            C21446 c21446 = (C21446) c15094.f46132;
            C17606 c17606 = this.f56931;
            if (c21446 != null) {
                i4 = c17606.mOptimizationLevel;
                if (C12273.m29806(i4, 256) && view.getMeasuredWidth() == c15094.m35753() && view.getMeasuredWidth() < c21446.m35753() && view.getMeasuredHeight() == c15094.m35732() && view.getMeasuredHeight() < c21446.m35732() && view.getBaseline() == c15094.m35756() && !c15094.m35740() && m42666(c15094.m35736(), makeMeasureSpec, c15094.m35753()) && m42666(c15094.m35754(), makeMeasureSpec2, c15094.m35732())) {
                    c22856.f73746 = c15094.m35753();
                    c22856.f73749 = c15094.m35732();
                    c22856.f73752 = c15094.m35756();
                    return;
                }
            }
            EnumC8040 enumC80403 = EnumC8040.MATCH_CONSTRAINT;
            boolean z5 = enumC8040 == enumC80403;
            boolean z6 = enumC80402 == enumC80403;
            EnumC8040 enumC80404 = EnumC8040.MATCH_PARENT;
            boolean z7 = enumC80402 == enumC80404 || enumC80402 == EnumC8040.FIXED;
            boolean z8 = enumC8040 == enumC80404 || enumC8040 == EnumC8040.FIXED;
            boolean z9 = z5 && c15094.f46108 > 0.0f;
            boolean z10 = z6 && c15094.f46108 > 0.0f;
            if (view == null) {
                return;
            }
            C16900 c16900 = (C16900) view.getLayoutParams();
            int i17 = c22856.f73750;
            if (i17 != 1 && i17 != 2 && z5 && c15094.f46145 == 0 && z6 && c15094.f46170 == 0) {
                i3 = -1;
                baseline = 0;
                i2 = 0;
                measuredHeight = 0;
            } else {
                if ((view instanceof AbstractC3495) && (c15094 instanceof C10157)) {
                    ((AbstractC3495) view).mo10676((C10157) c15094, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                c15094.m35758(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i18 = c15094.f46153;
                int max = i18 > 0 ? Math.max(i18, measuredWidth) : measuredWidth;
                int i19 = c15094.f46113;
                if (i19 > 0) {
                    max = Math.min(i19, max);
                }
                int i20 = c15094.f46138;
                int max2 = i20 > 0 ? Math.max(i20, measuredHeight2) : measuredHeight2;
                int i21 = makeMeasureSpec2;
                int i22 = c15094.f46128;
                if (i22 > 0) {
                    max2 = Math.min(i22, max2);
                }
                i = c17606.mOptimizationLevel;
                if (!C12273.m29806(i, 1)) {
                    if (z9 && z7) {
                        max = (int) ((max2 * c15094.f46108) + 0.5f);
                    } else if (z10 && z8) {
                        max2 = (int) ((max / c15094.f46108) + 0.5f);
                    }
                }
                if (measuredWidth == max && measuredHeight2 == max2) {
                    baseline = baseline2;
                    i2 = max;
                    measuredHeight = max2;
                } else {
                    if (measuredWidth != max) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                    }
                    int makeMeasureSpec3 = measuredHeight2 != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i21;
                    view.measure(makeMeasureSpec, makeMeasureSpec3);
                    c15094.m35758(makeMeasureSpec, makeMeasureSpec3);
                    int measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    i2 = measuredWidth2;
                }
                i3 = -1;
            }
            boolean z11 = baseline != i3;
            c22856.f73754 = (i2 == c22856.f73748 && measuredHeight == c22856.f73747) ? false : true;
            if (c16900.f51904) {
                z11 = true;
            }
            if (z11 && baseline != -1 && c15094.m35756() != baseline) {
                c22856.f73754 = true;
            }
            c22856.f73746 = i2;
            c22856.f73749 = measuredHeight;
            c22856.f73751 = z11;
            c22856.f73752 = baseline;
            return;
        }
        c22856.f73746 = 0;
        c22856.f73749 = 0;
        c22856.f73752 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42666(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    @Override // l.InterfaceC13683
    /* renamed from: ֫ */
    public final void mo32929() {
        ArrayList arrayList;
        ArrayList arrayList2;
        C17606 c17606 = this.f56930;
        int childCount = c17606.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c17606.getChildAt(i);
            if (childAt instanceof C8434) {
                ((C8434) childAt).m22117();
            }
        }
        arrayList = c17606.mConstraintHelpers;
        int size = arrayList.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2 = c17606.mConstraintHelpers;
                ((AbstractC7539) arrayList2.get(i2)).getClass();
            }
        }
    }
}
