package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: 59KW */
/* renamed from: l.ۨ۟ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC11555 implements GestureDetector.OnGestureListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34481;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13670 f34482;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34483;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f34484;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f34485;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public GestureDetectorOnGestureListenerC11555(C13670 c13670, int i) {
        this.f34482 = c13670;
        this.f34481 = i;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C13670 c13670 = this.f34482;
        c13670.scrollTo(c13670.getScrollX() + ((int) (f + 0.5f)), c13670.getScrollY() + ((int) (f2 + 0.5f)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSingleTapUp(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.GestureDetectorOnGestureListenerC11555.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
