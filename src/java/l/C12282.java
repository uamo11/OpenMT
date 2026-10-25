package l;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: 86WH */
/* renamed from: l.۫۠ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12282 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5932 f36589;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C12282(C5932 c5932) {
        this.f36589 = c5932;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.f36589.m16655(420L, false);
        return true;
    }
}
