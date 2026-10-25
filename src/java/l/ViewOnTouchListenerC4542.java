package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* compiled from: J5LW */
/* renamed from: l.ۙۡۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC4542 implements View.OnTouchListener {

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f14486 = C11266.m27878(33.0f);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f14487;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f14488;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f14489;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f14490;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f14491 = true;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f14492;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ListView f14493;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f14494;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12327 f14495;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f14496;

    public ViewOnTouchListenerC4542(C12327 c12327, C9503 c9503) {
        if (c9503 != null) {
            this.f14493 = c9503;
            if (this.f14492 == 0) {
                this.f14492 = ViewConfiguration.get(c9503.getContext()).getScaledTouchSlop();
            }
        }
        this.f14495 = c12327;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        if (!this.f14493.isEnabled()) {
            m13349();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        C12327 c12327 = this.f14495;
        if (actionMasked != 0) {
            int i = f14486;
            if (actionMasked == 1) {
                if (this.f14490 && (view2 = this.f14494) != null) {
                    view2.scrollTo(0, 0);
                    if (Math.abs((int) ((motionEvent.getX() - this.f14488) * 0.75f)) >= i) {
                        c12327.m29918(this.f14496, this.f14494);
                    }
                }
                m13349();
                return false;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f14490 && (view3 = this.f14494) != null) {
                        view3.scrollTo(0, 0);
                    }
                    m13349();
                    return false;
                }
            } else if (this.f14494 != null) {
                int x = (int) ((motionEvent.getX() - this.f14488) * 0.75f);
                int y = (int) (motionEvent.getY() - this.f14487);
                if (!this.f14489 && Math.abs(x) > this.f14492) {
                    if (Math.abs(y) < this.f14492) {
                        this.f14490 = true;
                        this.f14493.requestDisallowInterceptTouchEvent(true);
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.f14493.onTouchEvent(obtain);
                        obtain.recycle();
                    } else {
                        this.f14489 = true;
                    }
                }
                if (this.f14490) {
                    int i2 = -i;
                    if (x <= i2) {
                        if (this.f14491) {
                            c12327.m29926();
                            this.f14491 = false;
                        }
                        x = i2;
                    } else if (x >= i) {
                        if (this.f14491) {
                            c12327.m29926();
                            this.f14491 = false;
                        }
                        x = i;
                    } else {
                        this.f14491 = true;
                    }
                    float abs = Math.abs(x) / i;
                    if (abs < 0.0f) {
                        abs = 0.0f;
                    } else if (abs > 1.0f) {
                        abs = 1.0f;
                    }
                    this.f14494.scrollTo(-((int) (((float) Math.sin(abs * 1.5707964f)) * x)), 0);
                    return true;
                }
            }
        } else {
            m13349();
            Rect rect = new Rect();
            int childCount = this.f14493.getChildCount();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = this.f14493.getChildAt(i3);
                rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                if (rect.contains(x2, y2)) {
                    this.f14494 = childAt;
                    break;
                }
                i3++;
            }
            View view4 = this.f14494;
            if (view4 != null) {
                try {
                    int positionForView = this.f14493.getPositionForView(view4);
                    this.f14496 = positionForView;
                    if (c12327.m29922(positionForView)) {
                        this.f14488 = motionEvent.getX();
                        this.f14487 = motionEvent.getY();
                        return false;
                    }
                    this.f14494 = null;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13349() {
        this.f14488 = 0.0f;
        this.f14487 = 0.0f;
        this.f14496 = -1;
        this.f14494 = null;
        this.f14490 = false;
        this.f14489 = false;
        this.f14491 = true;
    }
}
