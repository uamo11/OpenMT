package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: R9NW */
/* renamed from: l.᩺᩺, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23292 extends C18082 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74787 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final PathInterpolator f74785 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C9497 f74788 = new C9497();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f74786 = new DecelerateInterpolator();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Interpolator m51609(int i, C21610 c21610, C21610 c216102) {
        if ((i & 8) != 0) {
            if (c21610.m48815(8).f33108 > c216102.m48815(8).f33108) {
                return f74785;
            }
            return f74788;
        }
        return f74786;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static WindowInsets m51608(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.MT_Protector_res_0x7f0a05ae) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51612(View view, C17376 c17376, WindowInsets windowInsets, boolean z) {
        AbstractC13414 m51610 = m51610(view);
        if (m51610 != null) {
            m51610.mDispachedInsets = windowInsets;
            if (!z) {
                m51610.onPrepare(c17376);
                z = m51610.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m51612(viewGroup.getChildAt(i), c17376, windowInsets, z);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51613(View view, C17376 c17376, C3537 c3537) {
        AbstractC13414 m51610 = m51610(view);
        if (m51610 != null) {
            m51610.onStart(c17376, c3537);
            if (m51610.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m51613(viewGroup.getChildAt(i), c17376, c3537);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51614(View view, C21610 c21610, List list) {
        AbstractC13414 m51610 = m51610(view);
        if (m51610 != null) {
            c21610 = m51610.onProgress(c21610, list);
            if (m51610.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m51614(viewGroup.getChildAt(i), c21610, list);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51611(View view, C17376 c17376) {
        AbstractC13414 m51610 = m51610(view);
        if (m51610 != null) {
            m51610.onEnd(c17376);
            if (m51610.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m51611(viewGroup.getChildAt(i), c17376);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC13414 m51610(View view) {
        Object tag = view.getTag(R.id.MT_Protector_res_0x7f0a05b6);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC12004) {
            return ((ViewOnApplyWindowInsetsListenerC12004) tag).f35947;
        }
        return null;
    }
}
