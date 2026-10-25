package l;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: T5PO */
/* renamed from: l.ۡۙ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8651 extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18529 f26408;

    public C8651(ViewOnTouchListenerC18529 viewOnTouchListenerC18529) {
        this.f26408 = viewOnTouchListenerC18529;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View.OnLongClickListener onLongClickListener;
        View.OnLongClickListener onLongClickListener2;
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f26408;
        onLongClickListener = viewOnTouchListenerC18529.f57408;
        if (onLongClickListener != null) {
            onLongClickListener2 = viewOnTouchListenerC18529.f57408;
            onLongClickListener2.onLongClick(viewOnTouchListenerC18529.m43073());
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f26408;
        if (viewOnTouchListenerC18529.m43075() > 1.0f) {
            return false;
        }
        viewOnTouchListenerC18529.getClass();
        return false;
    }
}
