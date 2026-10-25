package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: Z7IM */
/* renamed from: l.ۗ֡ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2890 extends View {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C5712 f9221;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public MotionEvent f9222;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f9223;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f9224;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f9225;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f9226;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f9227;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9228;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC16685 f9229;

    public C2890(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2890(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9226 = new int[2];
        this.f9225 = ViewConfiguration.get(context).getScaledTouchSlop();
        setFocusable(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8835(C5712 c5712, InterfaceC16685 interfaceC16685, View view) {
        this.f9221 = c5712;
        this.f9229 = interfaceC16685;
        this.f9227 = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        r0.recycle();
        r8.f9222 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r0 != null) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L98
            r4 = 2
            if (r0 == r3) goto L82
            r5 = 3
            if (r0 == r4) goto L16
            if (r0 == r5) goto L82
            boolean r9 = r8.m8833(r9)
            return r9
        L16:
            int r0 = r8.f9228
            if (r0 == r3) goto L7d
            if (r0 != r4) goto L1d
            goto L7d
        L1d:
            float r0 = r9.getRawX()
            float r2 = r8.f9224
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            float r2 = r9.getRawY()
            float r6 = r8.f9223
            float r2 = r2 - r6
            float r2 = java.lang.Math.abs(r2)
            float r6 = java.lang.Math.max(r0, r2)
            float r7 = r8.f9225
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L3e
            return r3
        L3e:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6d
            r8.f9228 = r3
            android.view.View r0 = r8.f9227
            if (r0 == 0) goto L5e
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L4f
            goto L5e
        L4f:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r9)
            r0.setAction(r5)
            android.view.View r2 = r8.f9227
            r8.m8834(r2, r0)
            r0.recycle()
        L5e:
            android.view.MotionEvent r0 = r8.f9222
            if (r0 != 0) goto L63
            goto L78
        L63:
            l.ۛ֡ᩳ r2 = r8.f9221
            r8.m8834(r2, r0)
            android.view.MotionEvent r0 = r8.f9222
            if (r0 == 0) goto L78
            goto L73
        L6d:
            r8.f9228 = r4
            android.view.MotionEvent r0 = r8.f9222
            if (r0 == 0) goto L78
        L73:
            r0.recycle()
            r8.f9222 = r1
        L78:
            boolean r9 = r8.m8833(r9)
            return r9
        L7d:
            boolean r9 = r8.m8833(r9)
            return r9
        L82:
            int r0 = r8.f9228
            if (r0 != 0) goto L88
            r8.f9228 = r4
        L88:
            boolean r9 = r8.m8833(r9)
            android.view.MotionEvent r0 = r8.f9222
            if (r0 == 0) goto L95
            r0.recycle()
            r8.f9222 = r1
        L95:
            r8.f9228 = r2
            return r9
        L98:
            android.view.MotionEvent r0 = r8.f9222
            if (r0 == 0) goto La1
            r0.recycle()
            r8.f9222 = r1
        La1:
            r8.f9228 = r2
            l.ܽܰᩳ r0 = r8.f9229
            if (r0 == 0) goto Lb6
            float r1 = r9.getRawX()
            float r4 = r9.getRawY()
            boolean r0 = r0.mo20073(r1, r4)
            if (r0 == 0) goto Lb6
            goto Ld9
        Lb6:
            l.ۛ֡ᩳ r0 = r8.f9221
            if (r0 == 0) goto Ld9
            int r0 = r0.getVisibility()
            if (r0 == 0) goto Lc1
            goto Ld9
        Lc1:
            float r0 = r9.getRawX()
            r8.f9224 = r0
            float r0 = r9.getRawY()
            r8.f9223 = r0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r9)
            r8.f9222 = r0
            android.view.View r0 = r8.f9227
            r8.m8834(r0, r9)
            return r3
        Ld9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2890.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m8833(MotionEvent motionEvent) {
        int i = this.f9228;
        if (i == 1) {
            return m8834(this.f9221, motionEvent);
        }
        if (i == 2) {
            return m8834(this.f9227, motionEvent);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m8834(View view, MotionEvent motionEvent) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        view.getLocationOnScreen(this.f9226);
        obtain.offsetLocation((motionEvent.getRawX() - r2[0]) - motionEvent.getX(), (motionEvent.getRawY() - r2[1]) - motionEvent.getY());
        boolean dispatchTouchEvent = view.dispatchTouchEvent(obtain);
        obtain.recycle();
        return dispatchTouchEvent;
    }
}
