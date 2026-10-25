package l;

import android.view.View;

/* compiled from: O607 */
/* renamed from: l.ۗۧ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3187 extends AbstractC8832 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f10055;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15886 f10056;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Runnable f10057 = new RunnableC4598(this);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13064 f10058;

    @Override // l.AbstractC8832
    public final boolean onEdgeLock(int i) {
        return false;
    }

    public C3187(C13064 c13064, int i) {
        this.f10058 = c13064;
        this.f10055 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9803(C15886 c15886) {
        this.f10056 = c15886;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9804() {
        this.f10058.removeCallbacks(this.f10057);
    }

    @Override // l.AbstractC8832
    public final boolean tryCaptureView(View view, int i) {
        if (!C13064.m31643(view)) {
            return false;
        }
        int i2 = this.f10055;
        C13064 c13064 = this.f10058;
        return c13064.m31653(i2, view) && c13064.m31644(view) == 0;
    }

    @Override // l.AbstractC8832
    public final void onViewDragStateChanged(int i) {
        this.f10058.m31662(i, this.f10056.m37649());
    }

    @Override // l.AbstractC8832
    public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        int width = view.getWidth();
        C13064 c13064 = this.f10058;
        float width2 = (c13064.m31653(3, view) ? i + width : c13064.getWidth() - i) / width;
        c13064.m31657(width2, view);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        c13064.invalidate();
    }

    @Override // l.AbstractC8832
    public final void onViewCaptured(View view, int i) {
        ((C15180) view.getLayoutParams()).f46372 = false;
        int i2 = this.f10055 == 3 ? 5 : 3;
        C13064 c13064 = this.f10058;
        View m31656 = c13064.m31656(i2);
        if (m31656 != null) {
            c13064.m31649(m31656, true);
        }
    }

    @Override // l.AbstractC8832
    public final void onViewReleased(View view, float f, float f2) {
        int i;
        int[] iArr = C13064.f39103;
        float f3 = ((C15180) view.getLayoutParams()).f46373;
        int width = view.getWidth();
        C13064 c13064 = this.f10058;
        if (c13064.m31653(3, view)) {
            i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = c13064.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f10056.m37643(i, view.getTop());
        c13064.invalidate();
    }

    @Override // l.AbstractC8832
    public final void onEdgeTouched(int i, int i2) {
        this.f10058.postDelayed(this.f10057, 160L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9802() {
        View m31656;
        int width;
        int m37652 = this.f10056.m37652();
        int i = this.f10055;
        boolean z = i == 3;
        C13064 c13064 = this.f10058;
        if (z) {
            m31656 = c13064.m31656(3);
            width = (m31656 != null ? -m31656.getWidth() : 0) + m37652;
        } else {
            m31656 = c13064.m31656(5);
            width = c13064.getWidth() - m37652;
        }
        if (m31656 != null) {
            if (((!z || m31656.getLeft() >= width) && (z || m31656.getLeft() <= width)) || c13064.m31644(m31656) != 0) {
                return;
            }
            C15180 c15180 = (C15180) m31656.getLayoutParams();
            this.f10056.m37639(m31656, width, m31656.getTop());
            c15180.f46372 = true;
            c13064.invalidate();
            View m316562 = c13064.m31656(i == 3 ? 5 : 3);
            if (m316562 != null) {
                c13064.m31649(m316562, true);
            }
            c13064.m31645();
        }
    }

    @Override // l.AbstractC8832
    public final void onEdgeDragStarted(int i, int i2) {
        View m31656;
        int i3 = i & 1;
        C13064 c13064 = this.f10058;
        if (i3 == 1) {
            m31656 = c13064.m31656(3);
        } else {
            m31656 = c13064.m31656(5);
        }
        if (m31656 == null || c13064.m31644(m31656) != 0) {
            return;
        }
        this.f10056.m37637(i2, m31656);
    }

    @Override // l.AbstractC8832
    public final int getViewHorizontalDragRange(View view) {
        if (C13064.m31643(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // l.AbstractC8832
    public final int clampViewPositionHorizontal(View view, int i, int i2) {
        C13064 c13064 = this.f10058;
        if (c13064.m31653(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = c13064.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // l.AbstractC8832
    public final int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }
}
