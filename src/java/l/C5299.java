package l;

import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: 31K1 */
/* renamed from: l.ۚۤ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5299 extends AbstractC20121 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f16541;

    public C5299(ActivityC17169 activityC17169) {
        this.f16541 = activityC17169;
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerOpened(View view) {
        boolean z;
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2;
        ActivityC17169 activityC17169 = this.f16541;
        z = activityC17169.f52601;
        if (z) {
            floatingActionButton = activityC17169.f52611;
            floatingActionButton.setVisibility(0);
            floatingActionButton2 = activityC17169.f52611;
            floatingActionButton2.setAlpha(1.0f);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerClosed(View view) {
        C16557 c16557;
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2;
        ActivityC17169 activityC17169 = this.f16541;
        c16557 = activityC17169.f52599;
        c16557.m38953(false);
        floatingActionButton = activityC17169.f52611;
        if (floatingActionButton.getVisibility() == 0) {
            floatingActionButton2 = activityC17169.f52611;
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
        ActivityC17169 activityC17169 = this.f16541;
        z = activityC17169.f52601;
        if (z) {
            if (f == 0.0f) {
                floatingActionButton4 = activityC17169.f52611;
                if (floatingActionButton4.getVisibility() == 0) {
                    floatingActionButton5 = activityC17169.f52611;
                    floatingActionButton5.setVisibility(8);
                    return;
                }
                return;
            }
            floatingActionButton = activityC17169.f52611;
            if (floatingActionButton.getVisibility() != 0) {
                floatingActionButton3 = activityC17169.f52611;
                floatingActionButton3.setVisibility(0);
            }
            floatingActionButton2 = activityC17169.f52611;
            floatingActionButton2.setAlpha(f);
        }
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerStateChanged(int i) {
        C13064 c13064;
        if (i == 2 || i == 1) {
            c13064 = this.f16541.f52605;
            View findFocus = c13064.findFocus();
            if (findFocus instanceof C12392) {
                C12392 c12392 = (C12392) findFocus;
                c12392.m30387();
                c12392.m30443();
            }
        }
    }
}
