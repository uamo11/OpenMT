package l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: L1CU */
/* renamed from: l.᩹ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22069 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f70716;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f70717;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10075 f70721;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21446 f70720 = new C21446();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21446 f70718 = new C21446();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4201 f70719 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4201 f70715 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49647(C21446 c21446, C21446 c214462) {
        C15094 c15094;
        ArrayList arrayList = c21446.f18169;
        HashMap hashMap = new HashMap();
        hashMap.put(c21446, c214462);
        c214462.f18169.clear();
        c214462.mo7758(c21446, hashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15094 c150942 = (C15094) it.next();
            if (c150942 instanceof C2396) {
                c15094 = new C2396();
            } else if (c150942 instanceof C3101) {
                c15094 = new C3101();
            } else if (c150942 instanceof C20035) {
                c15094 = new C20035();
            } else if (c150942 instanceof C12978) {
                c15094 = new C12978();
            } else {
                c15094 = new C15094();
            }
            c214462.f18169.add(c15094);
            C15094 c150943 = c15094.f46132;
            if (c150943 != null) {
                ((C5923) c150943).f18169.remove(c15094);
                c15094.mo16611();
            }
            c15094.f46132 = c214462;
            hashMap.put(c150942, c15094);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C15094 c150944 = (C15094) it2.next();
            ((C15094) hashMap.get(c150944)).mo7758(c150944, hashMap);
        }
    }

    public C22069(C10075 c10075) {
        this.f70721 = c10075;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49649(C4201 c4201, C4201 c42012) {
        C21446 c21446;
        C21446 c214462;
        C21446 c214463;
        C21446 c214464;
        boolean isRtl;
        boolean isRtl2;
        this.f70719 = c4201;
        this.f70715 = c42012;
        this.f70720 = new C21446();
        this.f70718 = new C21446();
        C21446 c214465 = this.f70720;
        C10075 c10075 = this.f70721;
        c21446 = c10075.mLayoutWidget;
        c214465.m48567(c21446.m48571());
        C21446 c214466 = this.f70718;
        c214462 = c10075.mLayoutWidget;
        c214466.m48567(c214462.m48571());
        this.f70720.f18169.clear();
        this.f70718.f18169.clear();
        c214463 = c10075.mLayoutWidget;
        m49647(c214463, this.f70720);
        c214464 = c10075.mLayoutWidget;
        m49647(c214464, this.f70718);
        if (c10075.f30343 > 0.5d) {
            if (c4201 != null) {
                m49646(this.f70720, c4201);
            }
            m49646(this.f70718, c42012);
        } else {
            m49646(this.f70718, c42012);
            if (c4201 != null) {
                m49646(this.f70720, c4201);
            }
        }
        C21446 c214467 = this.f70720;
        isRtl = c10075.isRtl();
        c214467.m48577(isRtl);
        this.f70720.m48570();
        C21446 c214468 = this.f70718;
        isRtl2 = c10075.isRtl();
        c214468.m48577(isRtl2);
        this.f70718.m48570();
        ViewGroup.LayoutParams layoutParams = c10075.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                C21446 c214469 = this.f70720;
                EnumC8040 enumC8040 = EnumC8040.WRAP_CONTENT;
                c214469.m35717(enumC8040);
                this.f70718.m35717(enumC8040);
            }
            if (layoutParams.height == -2) {
                C21446 c2144610 = this.f70720;
                EnumC8040 enumC80402 = EnumC8040.WRAP_CONTENT;
                c2144610.m35746(enumC80402);
                this.f70718.m35746(enumC80402);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49646(C21446 c21446, C4201 c4201) {
        SparseArray sparseArray = new SparseArray();
        C19018 c19018 = new C19018();
        sparseArray.clear();
        sparseArray.put(0, c21446);
        C10075 c10075 = this.f70721;
        sparseArray.put(c10075.getId(), c21446);
        Iterator it = c21446.f18169.iterator();
        while (it.hasNext()) {
            C15094 c15094 = (C15094) it.next();
            sparseArray.put(((View) c15094.m35760()).getId(), c15094);
        }
        Iterator it2 = c21446.f18169.iterator();
        while (it2.hasNext()) {
            C15094 c150942 = (C15094) it2.next();
            View view = (View) c150942.m35760();
            c4201.m12670(view.getId(), c19018);
            c150942.m35770(c4201.m12683(view.getId()));
            c150942.m35733(c4201.m12679(view.getId()));
            if (view instanceof AbstractC7539) {
                c4201.m12674((AbstractC7539) view, c150942, c19018, sparseArray);
                if (view instanceof C6128) {
                    ((C6128) view).m20236();
                }
            }
            c19018.resolveLayoutDirection(c10075.getLayoutDirection());
            c10075.applyConstraintsFromLayoutParams(false, view, c150942, c19018, sparseArray);
            if (c4201.m12686(view.getId()) == 1) {
                c150942.m35768(view.getVisibility());
            } else {
                c150942.m35768(c4201.m12687(view.getId()));
            }
        }
        Iterator it3 = c21446.f18169.iterator();
        while (it3.hasNext()) {
            C15094 c150943 = (C15094) it3.next();
            if (c150943 instanceof C10157) {
                AbstractC7539 abstractC7539 = (AbstractC7539) c150943.m35760();
                C12978 c12978 = (C12978) c150943;
                abstractC7539.m20231(c12978, sparseArray);
                C10157 c10157 = (C10157) c12978;
                for (int i = 0; i < c10157.f38881; i++) {
                    C15094 c150944 = c10157.f38882[i];
                    if (c150944 != null) {
                        c150944.m35766();
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15094 m49645(C21446 c21446, View view) {
        if (c21446.m35760() == view) {
            return c21446;
        }
        ArrayList arrayList = c21446.f18169;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15094 c15094 = (C15094) arrayList.get(i);
            if (c15094.m35760() == view) {
                return c15094;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49650() {
        int i;
        int i2;
        C10075 c10075 = this.f70721;
        i = c10075.f30310;
        i2 = c10075.f30352;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        c10075.f30353 = mode;
        c10075.f30321 = mode2;
        int optimizationLevel = c10075.getOptimizationLevel();
        if (c10075.f30314 == c10075.m25322()) {
            c10075.resolveSystem(this.f70718, optimizationLevel, i, i2);
            if (this.f70719 != null) {
                c10075.resolveSystem(this.f70720, optimizationLevel, i, i2);
            }
        } else {
            if (this.f70719 != null) {
                c10075.resolveSystem(this.f70720, optimizationLevel, i, i2);
            }
            c10075.resolveSystem(this.f70718, optimizationLevel, i, i2);
        }
        int i3 = 0;
        if (!(c10075.getParent() instanceof C10075) || mode != 1073741824 || mode2 != 1073741824) {
            c10075.f30353 = mode;
            c10075.f30321 = mode2;
            if (c10075.f30314 == c10075.m25322()) {
                c10075.resolveSystem(this.f70718, optimizationLevel, i, i2);
                if (this.f70719 != null) {
                    c10075.resolveSystem(this.f70720, optimizationLevel, i, i2);
                }
            } else {
                if (this.f70719 != null) {
                    c10075.resolveSystem(this.f70720, optimizationLevel, i, i2);
                }
                c10075.resolveSystem(this.f70718, optimizationLevel, i, i2);
            }
            c10075.f30327 = this.f70720.m35753();
            c10075.f30333 = this.f70720.m35732();
            c10075.f30330 = this.f70718.m35753();
            int m35732 = this.f70718.m35732();
            c10075.f30317 = m35732;
            c10075.f30349 = (c10075.f30327 == c10075.f30330 && c10075.f30333 == m35732) ? false : true;
        }
        int i4 = c10075.f30327;
        int i5 = c10075.f30333;
        int i6 = c10075.f30353;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((c10075.f30340 * (c10075.f30330 - i4)) + i4);
        }
        int i7 = i4;
        int i8 = c10075.f30321;
        c10075.resolveMeasuredDimension(i, i2, i7, (i8 == Integer.MIN_VALUE || i8 == 0) ? (int) ((c10075.f30340 * (c10075.f30317 - i5)) + i5) : i5, this.f70720.m48569() || this.f70718.m48569(), this.f70720.m48573() || this.f70718.m48573());
        HashMap hashMap = c10075.f30358;
        int childCount = c10075.getChildCount();
        c10075.f30306.m49648();
        c10075.f30328 = true;
        int width = c10075.getWidth();
        int height = c10075.getHeight();
        C13601 c13601 = c10075.f30357.f22265;
        int i9 = c13601 != null ? c13601.f40570 : -1;
        if (i9 != -1) {
            for (int i10 = 0; i10 < childCount; i10++) {
                C19248 c19248 = (C19248) hashMap.get(c10075.getChildAt(i10));
                if (c19248 != null) {
                    c19248.m44412(i9);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            C19248 c192482 = (C19248) hashMap.get(c10075.getChildAt(i11));
            if (c192482 != null) {
                c10075.f30357.m19415(c192482);
                c192482.m44404(width, height, System.nanoTime());
            }
        }
        C13601 c136012 = c10075.f30357.f22265;
        float f = c136012 != null ? c136012.f40571 : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float abs = Math.abs(f);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            for (int i12 = 0; i12 < childCount; i12++) {
                C19248 c192483 = (C19248) hashMap.get(c10075.getChildAt(i12));
                if (!Float.isNaN(c192483.f60604)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        C19248 c192484 = (C19248) hashMap.get(c10075.getChildAt(i13));
                        if (!Float.isNaN(c192484.f60604)) {
                            f3 = Math.min(f3, c192484.f60604);
                            f2 = Math.max(f2, c192484.f60604);
                        }
                    }
                    while (i3 < childCount) {
                        C19248 c192485 = (C19248) hashMap.get(c10075.getChildAt(i3));
                        if (!Float.isNaN(c192485.f60604)) {
                            c192485.f60593 = 1.0f / (1.0f - abs);
                            if (z) {
                                c192485.f60585 = abs - (((f2 - c192485.f60604) / (f2 - f3)) * abs);
                            } else {
                                c192485.f60585 = abs - (((c192485.f60604 - f3) * abs) / (f2 - f3));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                float m44411 = c192483.m44411();
                float m44414 = c192483.m44414();
                float f6 = z ? m44414 - m44411 : m44414 + m44411;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
            }
            while (i3 < childCount) {
                C19248 c192486 = (C19248) hashMap.get(c10075.getChildAt(i3));
                float m444112 = c192486.m44411();
                float m444142 = c192486.m44414();
                float f7 = z ? m444142 - m444112 : m444142 + m444112;
                c192486.f60593 = 1.0f / (1.0f - abs);
                c192486.f60585 = abs - (((f7 - f4) * abs) / (f5 - f4));
                i3++;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49648() {
        C10075 c10075 = this.f70721;
        int childCount = c10075.getChildCount();
        HashMap hashMap = c10075.f30358;
        hashMap.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c10075.getChildAt(i);
            hashMap.put(childAt, new C19248(childAt));
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = c10075.getChildAt(i2);
            C19248 c19248 = (C19248) hashMap.get(childAt2);
            if (c19248 != null) {
                if (this.f70719 != null) {
                    C15094 m49645 = m49645(this.f70720, childAt2);
                    if (m49645 != null) {
                        c19248.m44413(m49645, this.f70719);
                    } else if (c10075.f30311 != 0) {
                        C0050.m932();
                        C0050.m933(childAt2);
                        childAt2.getClass();
                    }
                }
                if (this.f70715 != null) {
                    C15094 m496452 = m49645(this.f70718, childAt2);
                    if (m496452 != null) {
                        c19248.m44409(m496452, this.f70715);
                    } else if (c10075.f30311 != 0) {
                        C0050.m932();
                        C0050.m933(childAt2);
                        childAt2.getClass();
                    }
                }
            }
        }
    }
}
