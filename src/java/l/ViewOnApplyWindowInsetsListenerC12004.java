package l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: R9NW */
/* renamed from: l.ۨ᩺, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnApplyWindowInsetsListenerC12004 implements View.OnApplyWindowInsetsListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13414 f35947;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21610 f35948;

    public ViewOnApplyWindowInsetsListenerC12004(View view, AbstractC13414 abstractC13414) {
        this.f35947 = abstractC13414;
        C21610 m41340 = C17648.m41340(view);
        this.f35948 = m41340 != null ? new C23726(m41340).m52373() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f35948 = C21610.m48814(view, windowInsets);
            return C23292.m51608(view, windowInsets);
        }
        C21610 m48814 = C21610.m48814(view, windowInsets);
        if (this.f35948 == null) {
            this.f35948 = C17648.m41340(view);
        }
        if (this.f35948 == null) {
            this.f35948 = m48814;
            return C23292.m51608(view, windowInsets);
        }
        AbstractC13414 m51610 = C23292.m51610(view);
        if (m51610 != null && C11003.equals(m51610.mDispachedInsets, windowInsets)) {
            return C23292.m51608(view, windowInsets);
        }
        C21610 c21610 = this.f35948;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!m48814.m48815(i2).equals(c21610.m48815(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return C23292.m51608(view, windowInsets);
        }
        C21610 c216102 = this.f35948;
        C17376 c17376 = new C17376(i, C23292.m51609(i, m48814, c216102), 160L);
        c17376.m40723(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c17376.m40722());
        C11007 m48815 = m48814.m48815(i);
        C11007 m488152 = c216102.m48815(i);
        int min = Math.min(m48815.f33109, m488152.f33109);
        int i3 = m48815.f33111;
        int i4 = m488152.f33111;
        int min2 = Math.min(i3, i4);
        int i5 = m48815.f33110;
        int i6 = m488152.f33110;
        int min3 = Math.min(i5, i6);
        int i7 = m48815.f33108;
        int i8 = i;
        int i9 = m488152.f33108;
        C3537 c3537 = new C3537(C11007.m27341(min, min2, min3, Math.min(i7, i9)), C11007.m27341(Math.max(m48815.f33109, m488152.f33109), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C23292.m51612(view, c17376, windowInsets, false);
        duration.addUpdateListener(new C12709(c17376, m48814, c216102, i8, view));
        duration.addListener(new C10593(view, c17376));
        ViewTreeObserverOnPreDrawListenerC14493.m34591(view, new RunnableC6359(view, c17376, c3537, duration));
        this.f35948 = m48814;
        return C23292.m51608(view, windowInsets);
    }
}
