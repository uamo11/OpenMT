package l;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: A940 */
/* renamed from: l.᩻۫ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC23697 extends AbstractC3255 implements View.OnTouchListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17183 f76742;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1556 f76743;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f76743.m5326(this);
        return false;
    }
}
