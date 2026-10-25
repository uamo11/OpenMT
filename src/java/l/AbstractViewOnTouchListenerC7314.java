package l;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;

/* compiled from: V5Y3 */
/* renamed from: l.۟۟, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC7314 implements View.OnTouchListener {

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final int f22453 = ViewConfiguration.getTapTimeout();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Runnable f22454;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f22455;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AccelerateInterpolator f22456;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float[] f22457;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float[] f22458;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float[] f22459;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C22836 f22460;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f22461;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float[] f22462;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f22463;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float[] f22464;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final View f22465;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22466;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f22467;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f22468;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f22469;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m19601(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19604(int i);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo19605(int i);

    public AbstractViewOnTouchListenerC7314(View view) {
        C22836 c22836 = new C22836();
        this.f22460 = c22836;
        this.f22456 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f22464 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f22462 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f22458 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f22457 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f22459 = fArr5;
        this.f22465 = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f22455 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f22467 = f22453;
        c22836.m50951();
        c22836.m50958();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19603(boolean z) {
        if (this.f22463 && !z) {
            if (this.f22469) {
                this.f22466 = false;
            } else {
                this.f22460.m50953();
            }
        }
        this.f22463 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0 != 3) goto L37;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f22463
            r1 = 0
            if (r0 != 0) goto L7
            goto L8f
        L7:
            int r0 = r10.getActionMasked()
            l.᩺۟ r2 = r8.f22460
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 == r3) goto L1a
            r4 = 2
            if (r0 == r4) goto L29
            r9 = 3
            if (r0 == r9) goto L1a
            goto L8f
        L1a:
            boolean r9 = r8.f22469
            if (r9 == 0) goto L21
            r8.f22466 = r1
            return r1
        L21:
            r2.m50953()
            return r1
        L25:
            r8.f22461 = r3
            r8.f22468 = r1
        L29:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r8.f22465
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.m19602(r1, r0, r4, r6)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.m19602(r3, r10, r9, r4)
            r2.m50950(r0, r9)
            boolean r9 = r8.f22466
            if (r9 != 0) goto L8f
            int r9 = r2.m50956()
            r2.m50954()
            if (r9 == 0) goto L8f
            boolean r9 = r8.mo19604(r9)
            if (r9 != 0) goto L66
            goto L8f
        L66:
            java.lang.Runnable r9 = r8.f22454
            if (r9 != 0) goto L71
            l.ܰ۟ r9 = new l.ܰ۟
            r9.<init>(r8)
            r8.f22454 = r9
        L71:
            r8.f22466 = r3
            r8.f22469 = r3
            boolean r9 = r8.f22468
            if (r9 != 0) goto L86
            int r9 = r8.f22467
            if (r9 <= 0) goto L86
            java.lang.Runnable r10 = r8.f22454
            long r6 = (long) r9
            int r9 = l.C17648.f53953
            r5.postOnAnimationDelayed(r10, r6)
            goto L8d
        L86:
            java.lang.Runnable r9 = r8.f22454
            l.ܰ۟ r9 = (l.RunnableC13663) r9
            r9.run()
        L8d:
            r8.f22468 = r3
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC7314.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float m19602(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f22464
            r0 = r0[r4]
            float[] r1 = r3.f22462
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m19601(r0, r2, r1)
            float r1 = r3.m19600(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m19600(r6, r0)
            float r5 = r5 - r1
            android.view.animation.AccelerateInterpolator r6 = r3.f22456
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2e
        L26:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r5 = r6.getInterpolation(r5)
        L2e:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m19601(r5, r6, r0)
            goto L38
        L37:
            r5 = 0
        L38:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3d
            return r2
        L3d:
            float[] r0 = r3.f22458
            r0 = r0[r4]
            float[] r1 = r3.f22457
            r1 = r1[r4]
            float[] r2 = r3.f22459
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L54
            float r5 = r5 * r0
            float r4 = m19601(r5, r1, r4)
            return r4
        L54:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = m19601(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC7314.m19602(int, float, float, float):float");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m19600(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f22455;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f22466 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }
}
