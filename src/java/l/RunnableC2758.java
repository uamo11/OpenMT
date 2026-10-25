package l;

import android.widget.EdgeEffect;
import android.widget.OverScroller;

/* compiled from: 81UC */
/* renamed from: l.ۖ᩶ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC2758 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4169 f8571;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f8572;

    public RunnableC2758(C4169 c4169, float f) {
        this.f8571 = c4169;
        this.f8572 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        OverScroller overScroller2;
        OverScroller overScroller3;
        int i;
        int i2;
        EdgeEffect edgeEffect;
        OverScroller overScroller4;
        int i3;
        C17637 c17637;
        EdgeEffect edgeEffect2;
        OverScroller overScroller5;
        C0640 c0640 = this.f8571.f13598;
        overScroller = c0640.f2455;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller2 = c0640.f2455;
        boolean computeScrollOffset = overScroller2.computeScrollOffset();
        overScroller3 = c0640.f2455;
        int ceil = (int) Math.ceil(overScroller3.getCurrY() * this.f8572);
        i = c0640.f2473;
        int i4 = ceil - i;
        c0640.m2622(i4);
        if (i4 != 0) {
            if (i4 < 0) {
                i3 = c0640.f2473;
                c17637 = c0640.f2465;
                if (i3 <= (-c17637.m41261().m7009())) {
                    edgeEffect2 = c0640.f2462;
                    overScroller5 = c0640.f2455;
                    edgeEffect2.onAbsorb((int) (overScroller5.getCurrVelocity() / 1.2f));
                    c0640.invalidate();
                    return;
                }
            } else {
                i2 = c0640.f2473;
                if (i2 >= 0) {
                    edgeEffect = c0640.f2480;
                    overScroller4 = c0640.f2455;
                    edgeEffect.onAbsorb((int) (overScroller4.getCurrVelocity() / 1.2f));
                    c0640.invalidate();
                    return;
                }
            }
        }
        if (computeScrollOffset) {
            c0640.post(this);
        }
    }
}
