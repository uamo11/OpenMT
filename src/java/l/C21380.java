package l;

import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: 75NJ */
/* renamed from: l.᩸ۚᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21380 extends AbstractC20121 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f68871;

    public C21380(ActivityC16315 activityC16315) {
        this.f68871 = activityC16315;
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerOpened(View view) {
        boolean z;
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2;
        ActivityC16315 activityC16315 = this.f68871;
        z = activityC16315.f50240;
        if (z) {
            floatingActionButton = activityC16315.f50249;
            floatingActionButton.setVisibility(0);
            floatingActionButton2 = activityC16315.f50249;
            floatingActionButton2.setAlpha(1.0f);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerClosed(View view) {
        C16557 c16557;
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2;
        ActivityC16315 activityC16315 = this.f68871;
        c16557 = activityC16315.f50244;
        c16557.m38953(false);
        floatingActionButton = activityC16315.f50249;
        if (floatingActionButton.getVisibility() == 0) {
            floatingActionButton2 = activityC16315.f50249;
            floatingActionButton2.setVisibility(8);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerSlide(View view, float f) {
        boolean z;
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2;
        FloatingActionButton floatingActionButton3;
        FloatingActionButton floatingActionButton4;
        FloatingActionButton floatingActionButton5;
        ActivityC16315 activityC16315 = this.f68871;
        z = activityC16315.f50240;
        if (z) {
            if (f == 0.0f) {
                floatingActionButton4 = activityC16315.f50249;
                if (floatingActionButton4.getVisibility() == 0) {
                    floatingActionButton5 = activityC16315.f50249;
                    floatingActionButton5.setVisibility(8);
                    return;
                }
                return;
            }
            floatingActionButton = activityC16315.f50249;
            if (floatingActionButton.getVisibility() != 0) {
                floatingActionButton3 = activityC16315.f50249;
                floatingActionButton3.setVisibility(0);
            }
            floatingActionButton2 = activityC16315.f50249;
            floatingActionButton2.setAlpha(f);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerStateChanged(int i) {
        C13064 c13064;
        if (i == 2 || i == 1) {
            c13064 = this.f68871.f50253;
            View findFocus = c13064.findFocus();
            if (findFocus instanceof C12392) {
                C12392 c12392 = (C12392) findFocus;
                c12392.m30387();
                c12392.m30443();
            }
        }
    }
}
