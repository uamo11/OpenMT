package l;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import bin.mt.plus.R;

/* compiled from: B66A */
/* renamed from: l.ۤۙۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10065 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Interpolator f30246 = new InterpolatorC12886();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Interpolator f30247 = new InterpolatorC12181();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f30248 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25257(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m25258(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m25259(int i, int i2) {
        int i3 = i2 | i;
        return (i << 16) | (i2 << 8) | i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float mo25260() {
        return 0.5f;
    }

    /* renamed from: ֫ */
    public boolean mo22801(AbstractC3255 abstractC3255) {
        return true;
    }

    /* renamed from: ֫ */
    public abstract boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552);

    /* renamed from: ۧ */
    public abstract int mo3224(AbstractC3255 abstractC3255);

    /* renamed from: ۧ */
    public boolean mo3225() {
        return true;
    }

    /* renamed from: ܽ */
    public abstract void mo3226(AbstractC3255 abstractC3255);

    /* renamed from: ܽ */
    public boolean mo3227() {
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25261(C13132 c13132, int i, int i2, long j) {
        if (this.f30248 == -1) {
            this.f30248 = c13132.getResources().getDimensionPixelSize(R.dimen.MT_Protector_res_0x7f0700d1);
        }
        int signum = (int) (((int) (((int) Math.signum(i2)) * this.f30248 * ((InterpolatorC12181) f30247).getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * ((InterpolatorC12886) f30246).getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
        return signum == 0 ? i2 > 0 ? 1 : -1 : signum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo25264(C13132 c13132, AbstractC3255 abstractC3255, int i, AbstractC3255 abstractC32552, int i2, int i3, int i4) {
        AbstractC17366 layoutManager = c13132.getLayoutManager();
        if (layoutManager instanceof InterfaceC7242) {
            ((InterfaceC7242) layoutManager).prepareForDrop(abstractC3255.itemView, abstractC32552.itemView, i3, i4);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(abstractC32552.itemView) <= c13132.getPaddingLeft()) {
                c13132.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedRight(abstractC32552.itemView) >= c13132.getWidth() - c13132.getPaddingRight()) {
                c13132.scrollToPosition(i2);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(abstractC32552.itemView) <= c13132.getPaddingTop()) {
                c13132.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedBottom(abstractC32552.itemView) >= c13132.getHeight() - c13132.getPaddingBottom()) {
                c13132.scrollToPosition(i2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo25263(C13132 c13132, AbstractC3255 abstractC3255) {
        View view = abstractC3255.itemView;
        Object tag = view.getTag(R.id.MT_Protector_res_0x7f0a02a7);
        if (tag instanceof Float) {
            C17648.m41301(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.MT_Protector_res_0x7f0a02a7, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo25262(Canvas canvas, C13132 c13132, AbstractC3255 abstractC3255, float f, float f2, int i, boolean z) {
        View view = abstractC3255.itemView;
        if (z && view.getTag(R.id.MT_Protector_res_0x7f0a02a7) == null) {
            Float valueOf = Float.valueOf(C17648.m41320(view));
            int childCount = c13132.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = c13132.getChildAt(i2);
                if (childAt != view) {
                    float m41320 = C17648.m41320(childAt);
                    if (m41320 > f3) {
                        f3 = m41320;
                    }
                }
            }
            C17648.m41301(view, f3 + 1.0f);
            view.setTag(R.id.MT_Protector_res_0x7f0a02a7, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
