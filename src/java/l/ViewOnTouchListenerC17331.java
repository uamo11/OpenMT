package l;

import android.content.Context;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.BaseInputConnection;

/* compiled from: X68P */
/* renamed from: l.ܿۨᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC17331 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f53080;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f53081;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f53082;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f53083;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f53084;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f53085;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f53087;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f53088;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f53089;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f53090;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f53091;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f53092;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f53094;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public float f53096;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f53097;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f53098;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f53099;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public float f53100;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f53101;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f53102;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f53103;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53105;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f53106;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f53107;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f53108;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f53104 = false;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ResultReceiverC3986 f53093 = new ResultReceiverC3986();

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f53086 = -1;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f53095 = -1;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public ViewOnTouchListenerC17331(C12392 c12392, Context context) {
        this.f53101 = c12392;
        this.f53097 = c12392.f37258.m9796();
        this.f53085 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        m40654();
        C12392 c12392 = this.f53101;
        int m30444 = c12392.m30444();
        if (m30444 == c12392.m30448()) {
            c12392.m30498(m30444, true);
            c12392.m30345(true);
            c12392.m30299(-1);
        }
        c12392.f37263 = SystemClock.uptimeMillis();
        c12392.m30400();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C12392 c12392 = this.f53101;
        this.f53094 = c12392.isFocused();
        if (c12392.f37285.isFinished()) {
            return false;
        }
        c12392.f37285.abortAnimation();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f);
        C12392 c12392 = this.f53101;
        if (abs > abs2) {
            f = 0.0f;
        } else {
            if (!c12392.f37258.mo8160()) {
                return false;
            }
            f2 = 0.0f;
        }
        int m30463 = c12392.m30463();
        int m30528 = c12392.m30528();
        c12392.f37321 = true;
        c12392.f37285.fling(c12392.getScrollX(), c12392.m30408(), (int) (-f), (int) (-f2), 0, m30463, 0, m30528);
        if (f2 != 0.0f) {
            c12392.m30453();
            return true;
        }
        if (f != 0.0f) {
            c12392.m30442();
            return true;
        }
        c12392.postInvalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C12392 c12392 = this.f53101;
        C22686 c22686 = c12392.f37245;
        if (c12392.m30519()) {
            return;
        }
        m40654();
        c12392.performHapticFeedback(0);
        if (!c12392.isFocused()) {
            c12392.requestFocus();
        }
        float x = (motionEvent.getX() + c12392.getScrollX()) - c12392.getPaddingLeft();
        float y = (motionEvent.getY() + c12392.m30408()) - c12392.getPaddingTop();
        int m30444 = c12392.m30444();
        int m30448 = c12392.m30448();
        if (m30444 > m30448) {
            m30448 = m30444;
            m30444 = m30448;
        }
        if (c22686.f73263 && c12392.m30264(x)) {
            int m9759 = c12392.f37258.m9759(y);
            C20736 c20736 = c12392.f37258.f9998;
            int i = c20736.get(c20736.m47366(m9759)).f35062;
            C20736 c207362 = c12392.f37258.f9998;
            int i2 = c207362.get(c207362.m47365(m9759)).f35063;
            BaseInputConnection.removeComposingSpans(c12392.f37322);
            if (m30444 == m30448) {
                c12392.f37322.setSelection(i, i2);
                c12392.f37298 = i;
                c12392.f37312 = i2;
            } else {
                if (c12392.f37298 == -1) {
                    c12392.f37298 = m30444;
                    c12392.f37312 = m30448;
                }
                if (i < c12392.f37298) {
                    m30444 = i;
                }
                if (i2 >= c12392.f37312) {
                    m30448 = i2;
                }
                c12392.f37322.setSelection(m30444, m30448);
            }
            c12392.m30520();
            c12392.invalidate();
            return;
        }
        int m9760 = c12392.f37258.m9760(x, y);
        if (!c12392.mo25914()) {
            if (m30444 == m30448 || m30444 > m9760 || m9760 > m30448) {
                c12392.m30498(m9760, false);
                c12392.m30345(true);
            }
            c12392.m30299(-1);
            c12392.f37263 = SystemClock.uptimeMillis();
            c12392.m30400();
        } else if (m30444 != m30448 && m30444 <= m9760 && m9760 <= m30448) {
            c12392.m30299(-1);
            c12392.f37263 = SystemClock.uptimeMillis();
            c12392.m30400();
        } else {
            int[] m30480 = c12392.m30480(m9760, false);
            c12392.f37307 = true;
            c12392.f37266 = m9760;
            c12392.m30455(c12392.m30444(), m30480[0]);
            c12392.mo25922(m30480[0], m30480[1]);
            c12392.f37313 = m30480[0];
            c12392.f37263 = 0L;
            c12392.f37219 = Math.min(c22686.m24484() + (c12392.m30459() / 2.0f) + c12392.getPaddingTop(), motionEvent.getY());
            c12392.f37201 = Math.max((c12392.getHeight() - c12392.getPaddingBottom()) - c12392.m30459(), motionEvent.getY());
            c12392.f37174 = 0;
            c12392.invalidate();
            c12392.m30345(true);
            c12392.m30200((int) motionEvent.getX(), (int) motionEvent.getY(), c22686.f73274);
        }
        c12392.invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40659(boolean z) {
        if (this.f53104 != z) {
            this.f53101.getParent().requestDisallowInterceptTouchEvent(z);
            this.f53104 = z;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C12392 c12392 = this.f53101;
        C22686 c22686 = c12392.f37245;
        if (!c12392.isFocused()) {
            c12392.requestFocus();
        }
        if (c12392.f37258.mo8160() && Math.abs(f) > Math.abs(f2)) {
            int scrollX = c12392.getScrollX() + ((int) f);
            if (scrollX < 0) {
                if (motionEvent2 != null && c22686.f73284) {
                    C23379.m51831(c12392.f37216, (-f) / c12392.getWidth(), 1.0f - (motionEvent2.getY() / c12392.getHeight()));
                    c12392.postInvalidateOnAnimation();
                    if (!c12392.f37275.isFinished()) {
                        c12392.f37275.onRelease();
                    }
                }
                scrollX = 0;
            } else {
                int m30463 = c12392.m30463();
                if (scrollX > m30463) {
                    if (motionEvent2 != null && c22686.f73284) {
                        C23379.m51831(c12392.f37275, f / c12392.getWidth(), motionEvent2.getY() / c12392.getHeight());
                        c12392.postInvalidateOnAnimation();
                        if (!c12392.f37216.isFinished()) {
                            c12392.f37216.onRelease();
                        }
                    }
                    scrollX = m30463;
                }
            }
            c12392.scrollTo(scrollX, c12392.m30408());
            c12392.m30442();
        } else {
            int m30408 = c12392.m30408() + ((int) f2);
            if (m30408 < 0) {
                if (this.f53082) {
                    m40659(false);
                }
                if (motionEvent2 != null && c22686.f73284) {
                    C23379.m51831(c12392.f37303, (-f2) / c12392.getHeight(), motionEvent2.getX() / c12392.getWidth());
                    c12392.postInvalidateOnAnimation();
                    if (!c12392.f37189.isFinished()) {
                        c12392.f37189.onRelease();
                    }
                }
                m30408 = 0;
            } else {
                int m30528 = c12392.m30528();
                if (m30408 > m30528) {
                    if (this.f53082) {
                        m40659(false);
                    }
                    if (motionEvent2 != null && c22686.f73284) {
                        C23379.m51831(c12392.f37189, f2 / c12392.getHeight(), 1.0f - (motionEvent2.getX() / c12392.getWidth()));
                        c12392.postInvalidateOnAnimation();
                        if (!c12392.f37303.isFinished()) {
                            c12392.f37303.onRelease();
                        }
                    }
                    m30408 = m30528;
                }
            }
            c12392.scrollTo(c12392.getScrollX(), m30408);
            c12392.m30453();
        }
        if (!this.f53082) {
            return true;
        }
        this.f53082 = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        final C12392 c12392 = this.f53101;
        int scrollX = c12392.getScrollX();
        C22686 c22686 = c12392.f37245;
        int m9760 = c12392.f37258.m9760((x + scrollX) - c12392.getPaddingLeft(), (motionEvent.getY() + c12392.m30408()) - c12392.getPaddingTop());
        int m30444 = c12392.m30444();
        int m30448 = c12392.m30448();
        if (m30444 > m30448) {
            m30448 = m30444;
            m30444 = m30448;
        }
        boolean mo9770 = c12392.f37258.mo9770();
        ResultReceiverC3986 resultReceiverC3986 = this.f53093;
        if (mo9770 || c22686.f73272 || !c12392.isFocused()) {
            z = false;
        } else {
            resultReceiverC3986.m12027();
            c12392.f37274.showSoftInput(c12392, 0, resultReceiverC3986);
            z = true;
        }
        if (c12392.f37258.f10002) {
            if (z && m30444 != m30448 && m30444 <= m9760 && m9760 <= m30448 && resultReceiverC3986.m12026() == 2) {
                c12392.postDelayed(new Runnable() { // from class: l.ۧۨᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12392.this.m30299(-1);
                    }
                }, 100L);
            } else if (m30444 == m30448 && m30444 == m9760) {
                if (!c12392.f37258.mo9770() && !c22686.f73272) {
                    if (this.f53094 && SystemClock.uptimeMillis() - this.f53090 > 4500) {
                        if (this.f53097 == c12392.f37258.m9796()) {
                            c12392.m30299(-1);
                            this.f53090 = SystemClock.uptimeMillis();
                        }
                    } else {
                        this.f53090 = 0L;
                    }
                }
            } else {
                c12392.m30455(c12392.m30444(), m9760);
                c12392.f37322.setSelection(m9760);
                c12392.m30227();
                this.f53090 = 0L;
            }
            if (!c12392.f37258.mo9770() && !c22686.f73272) {
                c12392.m30345(false);
            }
        } else if (m30444 == m30448 && m9760 == m30444) {
            if (this.f53094 && SystemClock.uptimeMillis() - this.f53090 > 4500) {
                if (this.f53097 == c12392.f37258.m9796()) {
                    c12392.m30299(-1);
                    this.f53090 = SystemClock.uptimeMillis();
                }
            } else {
                this.f53090 = 0L;
            }
        } else if (m30444 > m9760 || m9760 > m30448 || !c22686.f73256) {
            c12392.m30455(c12392.m30444(), m9760);
            c12392.f37322.setSelection(m9760);
            c12392.m30227();
            this.f53090 = 0L;
            if (!c12392.f37258.mo9770() && !c22686.f73272) {
                c12392.m30349(m9760, false);
            }
        } else if (!z || resultReceiverC3986.m12026() != 2) {
            c12392.m30299(-1);
        } else {
            c12392.postDelayed(new Runnable() { // from class: l.ۧۨᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12392.this.m30299(-1);
                }
            }, 100L);
        }
        this.f53097 = c12392.f37258.m9796();
        c12392.f37263 = SystemClock.uptimeMillis();
        c12392.m30400();
        c12392.invalidate();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40654() {
        boolean z = this.f53087;
        this.f53098 = false;
        this.f53091 = false;
        this.f53080 = false;
        this.f53087 = false;
        this.f53095 = -1;
        this.f53092 = 0.0f;
        this.f53107 = 0.0f;
        this.f53101.f37174 = 0;
        if (z) {
            m40659(false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40656(MotionEvent motionEvent) {
        m40663(motionEvent);
        float y = motionEvent.getY();
        C12392 c12392 = this.f53101;
        boolean z = c12392.f37174 == 0;
        float f = c12392.f37219;
        if (y < f) {
            c12392.f37174 = -C12392.m30184((int) (f - y));
            if (z) {
                c12392.f37224 = SystemClock.uptimeMillis();
            }
            c12392.postInvalidateOnAnimation();
        } else {
            float f2 = c12392.f37201;
            if (y > f2) {
                c12392.f37174 = C12392.m30184((int) (y - f2));
                if (z) {
                    c12392.f37224 = SystemClock.uptimeMillis();
                }
                c12392.postInvalidateOnAnimation();
            } else {
                c12392.f37174 = 0;
            }
        }
        float x = motionEvent.getX() - c12392.getPaddingLeft();
        float y2 = motionEvent.getY() - c12392.getPaddingTop();
        c12392.f37289 = x;
        c12392.f37293 = y2;
        m40655(x, y2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40655(float f, float f2) {
        C12392 c12392 = this.f53101;
        int m9760 = c12392.f37258.m9760(c12392.getScrollX() + f, c12392.m30408() + f2);
        if (c12392.m30444() == this.f53095 && c12392.m30448() == m9760) {
            return;
        }
        c12392.f37322.setSelection(this.f53095, m9760);
        c12392.m30238(m9760);
        c12392.invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40657(ViewOnTouchListenerC17331 viewOnTouchListenerC17331) {
        C12392 c12392 = viewOnTouchListenerC17331.f53101;
        c12392.setPressed(false);
        c12392.m30520();
        viewOnTouchListenerC17331.m40654();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m40663(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C12392 c12392 = this.f53101;
        boolean z = x >= 0.0f && x <= ((float) c12392.getWidth()) && y >= 0.0f && y <= ((float) c12392.getHeight());
        if (z != c12392.isPressed()) {
            c12392.setPressed(z);
            c12392.invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0093, code lost:
    
        if (r9.f9997.m35177(r4, r6) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013c, code lost:
    
        if (r4[2].m22285() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
    
        if (r4 != 3) goto L113;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 2005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnTouchListenerC17331.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m40664(MotionEvent motionEvent) {
        this.f53096 = m40662(motionEvent);
        this.f53102 = true;
        this.f53081 = false;
        C12392 c12392 = this.f53101;
        this.f53083 = c12392.f37245.f29058.getTextSize();
        this.f53089 = c12392.getScrollX();
        this.f53088 = c12392.m30408();
        if (c12392.f37295 || c12392.f37291 || c12392.f37204 || c12392.f37307) {
            c12392.m30162();
            C12392.m30226(c12392);
            c12392.f37307 = false;
            c12392.f37204 = false;
            c12392.f37291 = false;
            c12392.f37295 = false;
            return;
        }
        c12392.f37257.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m40661(android.view.MotionEvent r10) {
        /*
            r9 = this;
            l.۫ۨᩳ r0 = r9.f53101
            l.᩺֫ܿ r1 = r0.f37245
            float r2 = m40662(r10)
            boolean r3 = r9.f53081
            r4 = 1
            if (r3 != 0) goto L1e
            float r3 = r9.f53096
            float r3 = r2 - r3
            float r3 = java.lang.Math.abs(r3)
            int r5 = r9.f53085
            float r5 = (float) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto La2
            r9.f53081 = r4
        L1e:
            float r3 = r9.f53096
            float r2 = r2 / r3
            l.֫ۖܽ r3 = r1.f29058
            float r3 = r3.getTextSize()
            float r5 = r9.f53083
            float r5 = r5 * r2
            boolean r2 = r1.m50689(r5)
            if (r2 == 0) goto La2
            l.֫ۖܽ r1 = r1.f29058
            float r1 = r1.getTextSize()
            float r2 = r9.f53083
            float r1 = r1 / r2
            l.ۗۤᩳ r2 = r0.f37258
            r2.mo8154(r3)
            l.ۗۤᩳ r2 = r0.f37258
            boolean r2 = r2.mo8160()
            r3 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 0
            if (r2 == 0) goto L72
            float r2 = r10.getX(r6)
            float r7 = r10.getX(r4)
            float r7 = r7 + r2
            float r7 = r7 / r5
            int r2 = r0.getPaddingLeft()
            float r2 = (float) r2
            float r7 = r7 - r2
            int r2 = r9.f53089
            float r2 = (float) r2
            float r2 = r2 + r7
            float r2 = r2 * r1
            float r2 = r2 - r7
            int r7 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r7 >= 0) goto L67
            goto L72
        L67:
            int r7 = r0.m30463()
            float r7 = (float) r7
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 <= 0) goto L73
            r2 = r7
            goto L73
        L72:
            r2 = 0
        L73:
            float r6 = r10.getY(r6)
            float r10 = r10.getY(r4)
            float r10 = r10 + r6
            float r10 = r10 / r5
            int r4 = r0.getPaddingTop()
            float r4 = (float) r4
            float r10 = r10 - r4
            int r4 = r9.f53088
            float r4 = (float) r4
            float r4 = r4 + r10
            float r4 = r4 * r1
            float r4 = r4 - r10
            int r10 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r10 >= 0) goto L8f
            goto L9a
        L8f:
            int r10 = r0.m30528()
            float r3 = (float) r10
            int r10 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r10 <= 0) goto L99
            goto L9a
        L99:
            r3 = r4
        L9a:
            int r10 = (int) r2
            int r1 = (int) r3
            r0.m30392(r10, r1)
            r0.invalidate()
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnTouchListenerC17331.m40661(android.view.MotionEvent):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40660() {
        if (this.f53081) {
            C12392 c12392 = this.f53101;
            c12392.m30376();
            c12392.f37258.mo8173();
            c12392.m30289();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static float m40662(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }
}
